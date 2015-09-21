/* 
 * Copyright 2013-2015 Modeliosoft
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
import java.net.URI;
import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.modelio.api.module.ModuleException;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.app.project.ui.plugin.AppProjectUi;
import org.modelio.core.ui.auth.AuthDataDialog;
import org.modelio.gproject.data.project.DefinitionScope;
import org.modelio.gproject.data.project.FragmentDescriptor;
import org.modelio.gproject.data.project.InheritedAuthData;
import org.modelio.gproject.data.project.ModuleDescriptor;
import org.modelio.gproject.data.project.ProjectDescriptor;
import org.modelio.gproject.fragment.FragmentAuthenticationException;
import org.modelio.gproject.fragment.IProjectFragment;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.gproject.GProjectAuthenticationException;
import org.modelio.gproject.gproject.GProjectFactory;
import org.modelio.gproject.module.GModule;
import org.modelio.gproject.module.ModuleSorter;
import org.modelio.mda.infra.service.IModuleManagementService;
import org.modelio.ui.progress.IModelioProgressService;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.auth.NoneAuthData;
import org.modelio.vbasic.auth.UserPasswordAuthData;
import org.modelio.vbasic.collections.TopologicalSorter.CyclicDependencyException;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.progress.IModelioProgress;

/**
 * Handler for "Open project" command.
 */
@objid ("0044ac32-cc35-1ff2-a7f4-001ec947cd2a")
public class OpenProjectHandler {
    @objid ("f3f5681b-ade9-42e4-a0ce-455fde687a0e")
    @Inject
    @Optional
     IModuleManagementService moduleService;

    @objid ("00470518-cc35-1ff2-a7f4-001ec947cd2a")
    @CanExecute
    boolean canExecute(final IProjectService projectService, @Optional @Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection) {
        if (selection == null || projectService.getOpenedProject() != null) {
            return false;
        }
        List<ProjectDescriptor> projects = getSelectedElements(selection);
        if (projects.size() != 1) {
            return false;
        }
        
        if (projects.get(0).getLockInfo() != null) {
            return false;
        }
        return true;
    }

    @objid ("00470482-cc35-1ff2-a7f4-001ec947cd2a")
    @Execute
    void execute(IProjectService projectService, @Named(IServiceConstants.ACTIVE_SHELL) final Shell shell, @Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection, final IModelioProgressService progressService) {
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
        
                        // Check again that authentication data is complete, if not => prompt user
                        checkOpenProjectAuth(projectService.getOpenedProject());
        
                    } catch (IOException | GProjectAuthenticationException e) {
                        throw new InvocationTargetException(e, e.getLocalizedMessage());
                    }
        
                    // Update the descriptor lock infos
                    try {
                        projectToOpen.setLockInfo(GProjectFactory.getLockInformations(projectToOpen));
                    } catch (IOException e) {
                        AppProjectUi.LOG.warning(e);
                    }
                }
        
                private void checkOpenProjectAuth(final GProject openedProject) {
                    shell.getDisplay().asyncExec(new Runnable() {
                        @SuppressWarnings("synthetic-access")
                        @Override
                        public void run() {
                            doCheckOpenProjectAuth(shell, openedProject);
                        }
                    });
        
                }
        
            };
        
            try {
                progressService.run(true, false, runnable);
                more = false;
            } catch (InvocationTargetException e) {
                try {
                    throw e.getCause();
                } catch (GProjectAuthenticationException cause) {
                    AppProjectUi.LOG.info(cause.getLocalizedMessage());
                    String label = AppProjectUi.I18N.getMessage("OpenProjectHandler.Auth.ProjectLabel", projectToOpen.getName());
                    authData = promptAuthentication(shell, effectiveAuthData, label, cause.getLocalizedMessage());
                    more = (authData != null);
                } catch (IOException cause) {
                    AppProjectUi.LOG.error(FileUtils.getLocalizedMessage(cause));
                    AppProjectUi.LOG.debug(e);
                    MessageDialog.openError(shell, AppProjectUi.I18N.getString("Error"), FileUtils.getLocalizedMessage(cause));
                    more = false;
                } catch (SecurityException cause) {
                    AppProjectUi.LOG.error(cause.getLocalizedMessage());
                    AppProjectUi.LOG.debug(e);
                    MessageDialog.openError(shell, AppProjectUi.I18N.getString("Error"), cause.getLocalizedMessage());
                    more = false;
                } catch (Throwable cause) {
                    AppProjectUi.LOG.error(e);
                    MessageDialog.openError(shell, AppProjectUi.I18N.getString("Error"), cause.toString());
                    more = false;
                }
            } catch (InterruptedException e) {
                // nothing
                more = false;
            }
        }
    }

    @objid ("384b0ca0-9855-4902-bc4a-44b058677c75")
    private IAuthData checkPartAuth(final Shell shell, IAuthData authToCheck, String name) {
        IAuthData authData = authToCheck;
        
        if (authData == null || !authData.isComplete()) {
            if (authData == null) {
                authData = new UserPasswordAuthData();
            }
        
            do {
                authData = promptAuthentication(shell, authData, name, null);
            } while (authData != null && !authData.isComplete());
        }
        return authData;
    }

    /**
     * Check authentication data on the project and all fragments before the project is opened.
     * @param shell a SWT shell
     * @param projectToOpen a project descriptor
     * @return the project authentication data on success, <i>null</i> if the user aborts open.
     */
    @objid ("ad0a56c0-7178-456b-8463-3f8f3e50a6ab")
    private IAuthData checkProjectAuth(final Shell shell, final ProjectDescriptor projectToOpen) {
        String label = AppProjectUi.I18N.getMessage("OpenProjectHandler.Auth.ProjectLabel", projectToOpen.getName());
        IAuthData projAuthData = checkPartAuth(shell, projectToOpen.getAuthDescriptor().getData(), projectToOpen.getName()
                + " project");
        
        for (FragmentDescriptor f : projectToOpen.getFragments()) {
            IAuthData authData = f.getAuthDescriptor().getData();
            if (needsAuthPrompt(authData, f.getUri())) {
                label = AppProjectUi.I18N.getMessage("OpenProjectHandler.Auth.FragmentLabel", f.getId());
                IAuthData newAuthData = checkPartAuth(shell, authData, label);
                if (newAuthData == null) {
                    return null;
                }
                if (authData != newAuthData) {
                    f.getAuthDescriptor().setData(newAuthData);
                }
            }
        }
        
        for (ModuleDescriptor f : projectToOpen.getModules()) {
            IAuthData authData = f.getAuthDescriptor().getData();
            if (needsAuthPrompt(authData, f.getArchiveLocation())) {
                label = AppProjectUi.I18N.getMessage("OpenProjectHandler.Auth.ModuleLabel", f.getName(), f.getVersion().toString());
                IAuthData newAuthData = checkPartAuth(shell, authData, label);
                if (newAuthData == null) {
                    return null;
                }
                if (authData != newAuthData) {
                    f.getAuthDescriptor().setData(newAuthData);
                }
            }
        }
        return projAuthData;
    }

    /**
     * Check authentication status on the project and all its fragments.
     * <p>
     * Ask the user for authentication data if needed and possible.
     * Try to mount again fragments after the user changed authentication data.
     * @param shell a SWT shell
     * @param openedProject the opened project
     */
    @objid ("5ef276f9-7d08-4baf-9c93-89a096fac7b3")
    private void doCheckOpenProjectAuth(Shell shell, GProject openedProject) {
        String label;
        
        for (IProjectFragment f : openedProject.getFragments()) {
            while (needsAuth(f)) {
                IAuthData authData = f.getAuthConfiguration().getAuthData();
                if (authData == null) {
                    authData = new NoneAuthData();
                }
        
                label = AppProjectUi.I18N.getMessage("OpenProjectHandler.Auth.FragmentLabel", f.getId());
        
                IAuthData newAuthData = promptAuthentication(shell, authData, label, getError(f));
        
                // Check for user abort
                if (newAuthData == null) {
                    break;
                }
        
                if (authData != newAuthData) {
                    f.getAuthConfiguration().setAuthData(newAuthData);
                }
        
                IModelioProgress aMonitor = null; //TODO
                f.mount(aMonitor);
            }
        }
        
        
        List<GModule> sortedModules = openedProject.getModules();
        try {
            sortedModules = ModuleSorter.sortModules(sortedModules);
        } catch (CyclicDependencyException e) {
            AppProjectUi.LOG.warning(e.toString());
            AppProjectUi.LOG.debug (e);
        }
        
        for (GModule f : sortedModules) {
            IAuthData authData = f.getAuthData().getAuthData();
            while (needsAuthPrompt(f)) {
                label = AppProjectUi.I18N.getMessage("OpenProjectHandler.Auth.ModuleLabel", f.getName(), f.getVersion().toString());
                IAuthData newAuthData = promptAuthentication(shell, authData, label, getError(f));
        
                // Check for user abort
                if (newAuthData == null) {
                    break;
                }
        
                if (authData != newAuthData) {
                    f.getAuthData().setAuthData(newAuthData);
                }
        
                try {
                    this.moduleService.activateModule(f);
                } catch (ModuleException e) {
                    // ignore
                }
            }
        }
    }

    @objid ("8a5d51f9-24e8-4959-a478-d895a849e593")
    private static String getError(GModule f) {
        IProjectFragment moduleFrag = f.getModelFragment();
        Throwable downError = moduleFrag!= null ? moduleFrag.getDownError() : null;
        return getErrorMessage(downError);
    }

    @objid ("5cbc64de-2cfa-458d-8c6d-164f6b0cbf9a")
    private static String getError(IProjectFragment f) {
        return getErrorMessage(f.getDownError());
    }

    @objid ("82fd3377-f3b9-450e-a7c9-d8aac938521d")
    private static String getErrorMessage(final Throwable e) {
        if (e == null) {
            return null;
        } else if (e instanceof IOException) {
            return FileUtils.getLocalizedMessage((IOException) e);
        } else {
            return e.getLocalizedMessage();
        }
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

    /**
     * A fragment needs authentication prompting if it is down
     * with a {@link FragmentAuthenticationException} or a {@link AccessDeniedException}.
     * @param f the module to check
     * @return true if authentication needs to be prompted
     */
    @objid ("4588b5fc-47d4-41d9-b185-892929816229")
    private boolean needsAuth(IProjectFragment f) {
        Throwable downError = f.getDownError();
        if (downError instanceof FragmentAuthenticationException || downError instanceof AccessDeniedException) {
            return (f.getAuthConfiguration().getScope() != DefinitionScope.SHARED &&
                    ! InheritedAuthData.SCHEME_ID.equals(f.getAuthConfiguration().getSchemeId()));
        } else {
            return false;
        }
    }

    /**
     * A module needs authentication prompting if its model component fragment is down
     * with a {@link FragmentAuthenticationException} or a {@link AccessDeniedException}.
     * @param f the module to check
     * @return true if authentication needs to be prompted
     */
    @objid ("41451476-d25e-478b-abff-d6c9699fe875")
    private boolean needsAuthPrompt(GModule f) {
        if (f.getAuthData().getScope() == DefinitionScope.SHARED
                || InheritedAuthData.SCHEME_ID.equals(f.getAuthData().getSchemeId())) {
            return false;
        }
        
        IProjectFragment moduleFrag = f.getModelFragment();
        Throwable downError = moduleFrag!= null ? moduleFrag.getDownError() : null;
        return downError instanceof FragmentAuthenticationException || downError instanceof AccessDeniedException;
    }

    @objid ("469a1cea-08a6-4fe6-9abe-4a3f5f3691cc")
    private boolean needsAuthPrompt(IAuthData authData, URI uri) {
        if (authData != null) {
            return false;
        }
        
        final String scheme = uri.getScheme();
        
        if (scheme == null || scheme.isEmpty()) {
            // relative path : no auth
            return false;
        } else if (scheme.startsWith("svn")) {
            // svn, svn+http, svn+*** : auth needed
            return true;
        } else if (scheme.equals("file")) {
            // file : no auth
            return false;
        }
        
        // all other cases : auth needed
        return true;
    }

    /**
     * @param parent a SWT shell
     * @param authData the authentication to complete
     * @param name the project or fragment name to authenticate.
     * @return the authentication data or null to abort.
     */
    @objid ("7161b2f6-c45d-4826-9441-df4c7fc50d80")
    private IAuthData promptAuthentication(Shell parent, IAuthData authData, String name, String errorMessage) {
        AuthDataDialog dlg = new AuthDataDialog(parent, authData, name);
        dlg.setBlockOnOpen(true);
        dlg.setErrorMessage(errorMessage);
        int ret = dlg.open();
        switch (ret) {
        case 0:
            return dlg.getAuthData();
        default:
            return null;
        }
    }

}
