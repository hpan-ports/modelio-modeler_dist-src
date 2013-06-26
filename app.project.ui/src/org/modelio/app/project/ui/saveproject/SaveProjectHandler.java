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
                                    

package org.modelio.app.project.ui.saveproject;

import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.app.project.ui.plugin.AppProjectUi;

@objid ("00448d88-cc35-1ff2-a7f4-001ec947cd2a")
public class SaveProjectHandler {
    @objid ("0046fabe-cc35-1ff2-a7f4-001ec947cd2a")
    @Execute
    public void execute(final IProjectService projectService) {
        assert (projectService.getOpenedProject() != null);
        AppProjectUi.LOG.info("Saving project '%s'", projectService.getOpenedProject().getName());
        
        try {
            projectService.saveProject();
        } catch (IOException e) {
            AppProjectUi.LOG.error(e);
        }
    }

    @objid ("0046fb54-cc35-1ff2-a7f4-001ec947cd2a")
    @CanExecute
    public boolean canExecute(final IProjectService projectService) {
        return projectService.isDirty();
    }

}
