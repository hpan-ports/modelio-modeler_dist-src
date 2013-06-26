/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  
                                    

package org.modelio.app.project.ui.newproject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.app.project.ui.newproject.gui.ProjectCreationDialog;
import org.modelio.app.project.ui.plugin.AppProjectUiExt;
import org.modelio.gproject.descriptor.ProjectDescriptor;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.gproject.GProjectAuthenticationException;
import org.modelio.gproject.gproject.GProjectFactory;
import org.modelio.gproject.module.IModuleCatalog;

@objid ("004485f4-cc35-1ff2-a7f4-001ec947cd2a")
public class NewProjectHandler {
    @objid ("847c8c7a-fdf9-45b0-9b6e-7934a09535ce")
    private boolean openconfigurator = false;

    @objid ("0046f83e-cc35-1ff2-a7f4-001ec947cd2a")
    @Execute
    public void execute(final IEclipseContext context, IModuleCatalog moduleCatalog, final IProjectService projectService, @Named(IServiceConstants.ACTIVE_SHELL) final Shell shell, final MApplication application) {
        AppProjectUiExt.LOG.info("New project..");
        
        // Check for an already opened project prompt the user for closing
        GProject openedProject = projectService.getOpenedProject();
        if (openedProject != null) {
            String[] buttonLabels = { AppProjectUiExt.I18N.getString("SaveAndClose"),
                    AppProjectUiExt.I18N.getString("CloseNoSave"), AppProjectUiExt.I18N.getString("Cancel") };
        
            MessageDialog dlg = new MessageDialog(shell, AppProjectUiExt.I18N.getString("NewProjectCloseConfirmTitle"), null,
                    AppProjectUiExt.I18N.getString("NewProjectCloseConfirmMsg"), MessageDialog.QUESTION, buttonLabels, 0);
        
            dlg.setBlockOnOpen(true);
            int answer = dlg.open();
        
            // Deal with saving and closing before continuing
            switch (answer) {
            case 0: // Save and close
                try {
                    projectService.saveProject();
                } catch (IOException e) {
                    AppProjectUiExt.LOG.equals(e);
                }
                projectService.closeProject(openedProject);
                break;
            case 1: // Close no save
                projectService.closeProject(openedProject);
                break;
            case 2: // Cancel
            default:
                return;
        
            }
        
        }
        
        // Prompt the user for the new project data
        ProjectCreationDataModel dataModel = promptUser(shell, projectService, moduleCatalog);
        
        if (dataModel != null) {
        
            ProjectCreator projectCreator = new ProjectCreator();
            projectService.createProject(projectCreator, dataModel);
        
            // Open the new project
            try {
                projectService.openProject(dataModel.getProjectName(), null, null);
            } catch (GProjectAuthenticationException e) {
                AppProjectUiExt.LOG.error(e);
            }
        
            // Open the project configurator if asked
            // FIXME: today 23/1/2013 there is no known and satisfying means of opening the project configurator
            // if (dataModel.openConfigurator) open the project configurator
        }
    }

    @objid ("0046f8d4-cc35-1ff2-a7f4-001ec947cd2a")
    @CanExecute
    public boolean canExecute(final IProjectService projectService) {
        return (projectService != null); // && (projectService.getOpenedProject() == null);
    }

    @objid ("0046f96a-cc35-1ff2-a7f4-001ec947cd2a")
    private ProjectCreationDataModel promptUser(final Shell parentShell, final IProjectService projectService, IModuleCatalog moduleCatalog) {
        ProjectCreationDataModel dataModel = new ProjectCreationDataModel(projectService.getWorkspace());
        ProjectCreationDialog dialog = new ProjectCreationDialog(parentShell, dataModel, moduleCatalog);
        
        // Compute a default name for the project
        String defaultName = computeDefaultName(projectService.getWorkspace());
        dataModel.setProjectName(defaultName);
        
        // Open the main window
        // Don't return from open() until dialog window closes
        dialog.setBlockOnOpen(true);
        int code = dialog.open();
        
        if (code == IDialogConstants.OK_ID) {
        
            // Checks that the project does not exist yet with the same name.
            if (Files.exists(projectService.getWorkspace().resolve(dataModel.getProjectName()))) {
        
                boolean answer = MessageDialog.openQuestion(parentShell,
                        AppProjectUiExt.I18N.getMessage("ProjectAlreadyExistsTitle"),
                        AppProjectUiExt.I18N.getMessage("ProjectAlreadyExistsDesc"));
        
                if (answer) {
                    try {
                        // The user ask for deletion of the existing project
                        Path confFile = projectService.getWorkspace().resolve(dataModel.getProjectName()).resolve("project.conf");
                        ProjectDescriptor projectToDelete = GProjectFactory.readDescriptor(confFile);
                        projectService.deleteProject(projectToDelete);
                    } catch (IOException e) {
                        AppProjectUiExt.LOG.error(e);
                    }
                    return dataModel;
                } else {
                    // Prompt the user again for another name
                    return promptUser(parentShell, projectService, moduleCatalog);
                }
        
            }
            // The dialog has matched the entered project name agains't a set of legal characters.
            // However, a post normalization is necessary even on a legal user entry.
            // This is because the name has to be used for naming a directory
            // It consists currently in removing trailing blanks or dot chars.
            String normalizedName = dataModel.getProjectName();
        
            while (normalizedName.endsWith(" ") || normalizedName.endsWith(".")) {
                normalizedName = normalizedName.substring(0, normalizedName.length() - 1);
            }
        
            dataModel.setProjectName(normalizedName);
            return dataModel;
        }
        return null;
    }

    @objid ("d16399ee-4dc0-4b9a-813c-c977ca23ea8d")
    private String computeDefaultName(Path workspace) {
        String baseName = AppProjectUiExt.I18N.getString("ProjectDefaultName");
        int index = 1;
        while (Files.exists(workspace.resolve(baseName + index))) {
            index++;
        }
        return baseName + index;
    }

}
