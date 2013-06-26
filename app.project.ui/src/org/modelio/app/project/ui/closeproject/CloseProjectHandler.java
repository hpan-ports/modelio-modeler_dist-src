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
                                    

package org.modelio.app.project.ui.closeproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.app.project.ui.plugin.AppProjectUi;
import org.modelio.gproject.descriptor.ProjectDescriptor;
import org.modelio.gproject.gproject.GProject;

/**
 * Handler for the "Close project" command. This handler simply closes the currently opened project in Modelio.
 * <p>
 * If the project has not been saved, a dialog box asks the user what to do.
 * </p>
 */
@objid ("00449fbc-cc35-1ff2-a7f4-001ec947cd2a")
public class CloseProjectHandler {
    @objid ("0044df2c-cc35-1ff2-a7f4-001ec947cd2a")
    @Execute
    public void execute(final IProjectService projectService, @Named(IServiceConstants.ACTIVE_SHELL) final Shell shell) {
        GProject openedProject = projectService.getOpenedProject();
        
        if (mustClose(shell, projectService)) {
            projectService.closeProject(openedProject);
        }
    }

    @objid ("0044dfc2-cc35-1ff2-a7f4-001ec947cd2a")
    @CanExecute
    public boolean canExecute(final IProjectService projectService, @Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection) {
        GProject openedProject = projectService.getOpenedProject();
        if (openedProject == null) {
            return false;
        }
        if (selection == null) return true;
        List<ProjectDescriptor> projectDescriptors = getSelectedElements(selection);
        if (projectDescriptors.size() == 0) return true;
        if (projectDescriptors.size() == 1) {
            if (openedProject.getName().equals(projectDescriptors.get(0).getName())) {
                return true;
            }
        }
        return false;
    }

    @objid ("1d2ba015-a829-496f-b28e-6c4ad9b94568")
    public static boolean mustClose(Shell shell, IProjectService projectService) {
        GProject openedProject = projectService.getOpenedProject();
        if (openedProject != null) {
            AppProjectUi.LOG.info("Closing project '%s'", openedProject.getName());
            
            if (projectService.isDirty()) {
                // Ask the user to save before quitting
                final String[] tab = { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL, IDialogConstants.CANCEL_LABEL };
                final MessageDialog dialog = new MessageDialog(shell,
                        AppProjectUi.I18N.getMessage("SaveBeforeCloseTitle"), // title
                        null, // title image
                        AppProjectUi.I18N.getMessage("SaveBeforeCloseQuestion", openedProject.getName()), // message
                        MessageDialog.QUESTION, // image type
                        tab, // labels
                        IDialogConstants.YES_ID); // default answer
        
                dialog.setBlockOnOpen(true);
                final int res = dialog.open();
        
                if (res == -1 || tab[res] == IDialogConstants.CANCEL_LABEL) {
                    return false;
                } else if (tab[res] == IDialogConstants.YES_LABEL) {
                    try {
                        projectService.saveProject();
                    } catch (IOException e) {
                        AppProjectUi.LOG.error(e);
                    }
                }
            }
        }
        return true;
    }

    @objid ("409dafc5-d8c2-4cf5-bb74-1db28b9ab8a1")
    private List<ProjectDescriptor> getSelectedElements(final IStructuredSelection selection) {
        List<ProjectDescriptor> selectedElements = new ArrayList<>();
        if (selection.size() > 0) {
            Object[] elements = selection.toArray();
            for (Object element : elements) {
                if (element instanceof ProjectDescriptor) {
                    selectedElements.add((ProjectDescriptor) element);
                }
            }
        }
        return selectedElements;
    }

}
