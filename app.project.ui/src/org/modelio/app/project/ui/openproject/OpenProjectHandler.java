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
                                    

package org.modelio.app.project.ui.openproject;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.e4.ui.workbench.modeling.IWindowCloseHandler;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.app.project.ui.auth.AuthDataDialog;
import org.modelio.app.project.ui.plugin.AppProjectUi;
import org.modelio.app.project.ui.quit.QuitHandler;
import org.modelio.gproject.descriptor.FragmentDescriptor;
import org.modelio.gproject.descriptor.ModuleDescriptor;
import org.modelio.gproject.descriptor.ProjectDescriptor;
import org.modelio.gproject.gproject.GProjectAuthenticationException;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.auth.NoneAuthData;

/**
 * Handler for "Open project" command.
 */
@objid ("0044ac32-cc35-1ff2-a7f4-001ec947cd2a")
public class OpenProjectHandler {
    @objid ("00470482-cc35-1ff2-a7f4-001ec947cd2a")
    @Execute
    public void execute(final IProjectService projectService, @Named(IServiceConstants.ACTIVE_SHELL) final Shell shell, @Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection, MWindow window, final IWorkbench workbench) {
        final ProjectDescriptor projectToOpen = getSelectedElements(selection).get(0);
        if (projectToOpen == null) {
            return;
        }
        
        // Check that authentication data is complete, if not => prompt user
        IAuthData authData = checkProjectAuth(shell, projectToOpen);
        
        if (authData == null) {
            // User cancelled => abort
            return;
        }
        
        assert (projectService.getOpenedProject() == null);
        AppProjectUi.LOG.info("Opening project '%s' ", projectToOpen.getName());
        
        boolean more = true;
        while (more) {
            final IAuthData effectiveAuthData = authData;
            IRunnableWithProgress runnable = new IRunnableWithProgress() {
                @Override
                public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                    try {
                        projectService.openProject(projectToOpen, effectiveAuthData, monitor);
                    } catch (IOException | IllegalArgumentException | IllegalStateException | GProjectAuthenticationException e) {
                        throw new InvocationTargetException(e);
                    }
                }
            };
        
            try {
                new ProgressMonitorDialog(shell).run(true, false, runnable);
                more = false;
            } catch (InvocationTargetException e) {
                AppProjectUi.LOG.error(e);
                if (e.getCause() instanceof GProjectAuthenticationException) {
                    String label = AppProjectUi.I18N.getMessage("OpenProjectHandler.Auth.ProjectLabel", projectToOpen.getName());
                    authData = promptAuthentication(shell, effectiveAuthData, label);
                    more = true;
                } else {
                    MessageDialog.openError(shell, AppProjectUi.I18N.getString("Error"), e.getCause().getLocalizedMessage());
                    more = false;
                }
            } catch (InterruptedException e) {
                // nothing
                more = false;
            }
        }
        
        
        IWindowCloseHandler handler = new IWindowCloseHandler() {
            @Override
            public boolean close(MWindow windoww) {
                if(QuitHandler.mustClose(shell, projectService)){
                   return true;
                }
                return false;
            }
        };
        
        window.getContext().set(IWindowCloseHandler.class, handler);
    }

    @objid ("00470518-cc35-1ff2-a7f4-001ec947cd2a")
    @CanExecute
    public boolean canExecute(final IProjectService projectService, @Optional
@Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection) {
        if (selection == null || projectService.getOpenedProject() != null) {
            return false;
        }
        List<ProjectDescriptor> projects = getSelectedElements(selection);
        if (projects.size() != 1) {
            return false;
        }
        return true;
    }

    /**
     * @param parent a SWT shell
     * @param authData the authentication to complete
     * @param name the project or fragment name to authenticate.
     * @return the authentication data or null to abort.
     */
    @objid ("7161b2f6-c45d-4826-9441-df4c7fc50d80")
    private IAuthData promptAuthentication(Shell parent, IAuthData authData, String name) {
        AuthDataDialog dlg = new AuthDataDialog(parent, authData, name);
        dlg.setBlockOnOpen(true);
        int ret = dlg.open();
        switch (ret) {
        case 0:
            return dlg.getAuthData();
        default:
            return null;
        }
    }

    @objid ("384b0ca0-9855-4902-bc4a-44b058677c75")
    private IAuthData checkPartAuth(final Shell shell, IAuthData authToCheck, String name) {
        IAuthData authData = authToCheck;
        
        if (authData == null || !authData.isComplete()) {
            if (authData == null)
                authData = new NoneAuthData();
        
            do {
                authData = promptAuthentication(shell, authData, name);
            } while (authData != null && !authData.isComplete());
        }
        return authData;
    }

    @objid ("ad0a56c0-7178-456b-8463-3f8f3e50a6ab")
    private IAuthData checkProjectAuth(final Shell shell, final ProjectDescriptor projectToOpen) {
        String label = AppProjectUi.I18N.getMessage("OpenProjectHandler.Auth.ProjectLabel", projectToOpen.getName());
        IAuthData projAuthData = checkPartAuth(shell, projectToOpen.getAuthDescriptor().getData(), projectToOpen.getName()
                + " project");
        
        for (FragmentDescriptor f : projectToOpen.getFragments()) {
            IAuthData authData = f.getAuthDescriptor().getData();
            if (authData != null) {
                label = AppProjectUi.I18N.getMessage("OpenProjectHandler.Auth.FragmentLabel", f.getId());
                IAuthData newAuthData = checkPartAuth(shell, authData, label);
                if (newAuthData == null)
                    return null;
                if (authData != newAuthData)
                    f.getAuthDescriptor().setData(newAuthData);
            }
        }
        
        for (ModuleDescriptor f : projectToOpen.getModules()) {
            IAuthData authData = f.getAuthDescriptor().getData();
            if (authData != null) {
                label = AppProjectUi.I18N.getMessage("OpenProjectHandler.Auth.ModuleLabel", f.getName(), f.getVersion().toString());
                IAuthData newAuthData = checkPartAuth(shell, authData, label);
                if (newAuthData == null)
                    return null;
                if (authData != newAuthData)
                    f.getAuthDescriptor().setData(newAuthData);
            }
        }
        return projAuthData;
    }

    @objid ("0e09003a-88a6-403e-88c8-92584d18c49b")
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
