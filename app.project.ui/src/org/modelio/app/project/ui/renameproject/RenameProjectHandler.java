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
                                    

package org.modelio.app.project.ui.renameproject;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.gproject.descriptor.ProjectDescriptor;

@objid ("00449508-cc35-1ff2-a7f4-001ec947cd2a")
public class RenameProjectHandler {
    @objid ("0046ff8c-cc35-1ff2-a7f4-001ec947cd2a")
    @Execute
    public void execute(final IEclipseContext context, final IProjectService projectService, @Named(IServiceConstants.ACTIVE_SHELL) final Shell shell, @Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection) {
        // TODO
        // - get the new name
        // - call projectService.renameProject(project, newNAme)
    }

    @objid ("00470022-cc35-1ff2-a7f4-001ec947cd2a")
    @CanExecute
    public boolean canExecute(final IProjectService projectService, @Optional
@Named(IServiceConstants.ACTIVE_SELECTION) final IStructuredSelection selection) {
        if (selection == null) return false;
        List<ProjectDescriptor> projects = getSelectedElements(selection);
        if (projects.size() != 1) {
            return false;
        }
        return (projectService.getOpenedProject() == null && projects.get(0) != null);
    }

    @objid ("d2f48ed3-7d4a-4ff7-a7ec-51bea6d33e81")
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
