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


package org.modelio.app.project.core.services;

import java.io.IOException;
import java.nio.file.Path;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.modelio.api.module.ModuleException;
import org.modelio.app.project.core.plugin.AppProjectCore;
import org.modelio.gproject.data.project.ModuleDescriptor;
import org.modelio.gproject.gproject.AuthResolver;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.gproject.TodoActionsRunner;
import org.modelio.gproject.module.GModule;
import org.modelio.mda.infra.service.IModuleManagementService;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.net.UriPathAccess;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vcore.smkernel.AccessDeniedException;

/**
 * Post open to-do action runner.
 */
@objid ("d3eae071-6ef7-449c-af6c-54085b8f4dbb")
class TodoRunner extends TodoActionsRunner {
    @objid ("c3d552da-b123-48c4-9b85-1cdef7b1221e")
    private IModuleManagementService moduleService;

    /**
     * Initialize the project configurer.
     * @param project the project to synchronize
     * @param moduleService the module service used to install and remove modules.
     */
    @objid ("2a248da2-da07-4866-9ead-3f7bbba0bf30")
    public TodoRunner(GProject project, IModuleManagementService moduleService) {
        super(project);
        this.moduleService = moduleService;
    }

    @objid ("b0e7c795-84a6-48d4-ac84-eca1f5817df2")
    @Override
    protected void installModule(ModuleDescriptor fd, IModelioProgress mon) throws IOException {
        IAuthData authData = new AuthResolver(getProject()).resolve(fd);
        try (UriPathAccess access = new UriPathAccess(fd.getArchiveLocation(),authData)){
            mon.subTask(AppProjectCore.I18N.getMessage("ProjectSynchro.installModule",
                    fd.getName(), fd.getVersion(), fd.getArchiveLocation()));
        
            // Install the module as if the user asked for it
            Path archivePath = access.getPath();
            this.moduleService.installModule(getProject(), archivePath);
        
            // Overwrite default module parameters with the server parameters
            GModule gModule = getModule(fd.getName());
            reconfigureModule(gModule, fd, mon);
        
        } catch (ModuleException e) {
            throw new IOException(e.getLocalizedMessage(), e);
        }
    }

    @objid ("d0837faa-1407-4209-8b2d-887a9d07aed3")
    @Override
    protected void removeModule(GModule m, IModelioProgress mon) throws IOException {
        mon.subTask(AppProjectCore.I18N.getMessage("ProjectSynchro.removeModule",
                m.getName(), m.getVersion()));
        try {
            this.moduleService.removeModule(m);
        } catch (ModuleException e) {
            throw new IOException(e.getLocalizedMessage(), e);
        }
    }

    @objid ("42b5e0d1-c942-4ccf-a1c1-b5979f91863b")
    @Override
    protected void upgradeModule(GModule m, ModuleDescriptor fd, IModelioProgress monitor) throws IOException {
        monitor.subTask(AppProjectCore.I18N.getMessage("ProjectSynchro.updateModule",
                m.getName(), m.getVersion(), fd.getVersion()));
        
        IAuthData authData = new AuthResolver(getProject()).resolve(fd);
        try (UriPathAccess access = new UriPathAccess(fd.getArchiveLocation(), authData)){
        
            // Install the module as if the user asked for it
            // The module may change some parameters on upgrade, they won't be lost.
            Path archivePath = access.getPath();
            this.moduleService.installModule(getProject(), archivePath);
        
        
        } catch (ModuleException e) {
            throw new IOException(e.getLocalizedMessage(), e);
        } finally {
            //TODO is it the right place ?
            // Overwrite default module parameters with the server parameters
            // Note: 'm' is invalid after installModule(...)
            GModule newGModule = getModule(fd.getName());
            reconfigureModule(newGModule, fd, monitor);
        
        }
    }

    /**
     * Report failures to user
     * @param shell a SWT shell
     */
    @objid ("457984e9-466e-40de-8cdd-1f9598bab209")
    public void reportFailures(Shell shell) {
        // TODO make a better dialog
        final StringBuilder sb = new StringBuilder();
        
        sb.append(AppProjectCore.I18N.getMessage(
                "ProjectService.ProjectSynchroProblems.message",
                getProject().getName()));
        
        for (Failure f : getFailures()) {
            sb
            .append(" - ")
            .append(f.getAction().toString())
            .append(": ");
        
            Throwable cause = f.getError();
            if (cause instanceof IOException) {
                sb.append(FileUtils.getLocalizedMessage((IOException) cause));
            } else if (cause instanceof AccessDeniedException) {
                sb.append(cause.getLocalizedMessage());
            } else if (cause instanceof RuntimeException) {
                sb.append(cause.toString());
            } else {
                sb.append(cause.getLocalizedMessage());
            }
        }
        
        // Get a shell
        final String title = AppProjectCore.I18N.getMessage(
                "ProjectService.ProjectSynchroProblems.title",
                getProject().getName());
        
        Display d = shell != null ? shell.getDisplay() : Display.getDefault();
        d.syncExec(new Runnable() {
        
            @Override
            public void run() {
                MessageDialog.openWarning(shell, title, sb.toString());
            }
        });
    }

}
