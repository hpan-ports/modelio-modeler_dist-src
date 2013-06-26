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
                                    

package org.modelio.app.project.conf.handlers;

import java.io.IOException;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;
import org.modelio.app.core.ModelioEnv;
import org.modelio.app.project.conf.dialog.ProjectConfigurationDialog;
import org.modelio.app.project.conf.plugin.AppProjectConf;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.audit.service.IAuditService;

@objid ("008a0b06-5a8d-10a6-888d-001ec947cd2a")
public class OpenProjectConfiguratorHandler {
    @objid ("0023c4cc-5a8e-10a6-888d-001ec947cd2a")
    @Execute
    public void execute(final MApplication application, final IProjectService projectService, final IAuditService auditService, @Named(IServiceConstants.ACTIVE_SHELL) final Shell shell, @Optional
@Named("folder") final String folder, ModelioEnv env) {
        AppProjectConf.LOG.info("Opening project configurator");
        
        ProjectConfigurationDialog dialog = new ProjectConfigurationDialog(application, projectService.getOpenedProject(), shell, auditService, env);
        if (folder != null) {
            try {
            dialog.setSelectedPage(folder);
            } catch (Exception e) {
                // Invalid folder name, open the dialog anyway
                AppProjectConf.LOG.warning("Invalid folder to select: " + folder);
            }
        }
        dialog.open();
        
        try {
            projectService.saveProject();
        } catch (IOException e) {
            // Error during save...
            AppProjectConf.LOG.error("Unable to save project");
        }
    }

    @objid ("0024384e-5a8e-10a6-888d-001ec947cd2a")
    @CanExecute
    public boolean canExecute(final IProjectService projectService) {
        return (projectService.getOpenedProject() != null);
    }

}
