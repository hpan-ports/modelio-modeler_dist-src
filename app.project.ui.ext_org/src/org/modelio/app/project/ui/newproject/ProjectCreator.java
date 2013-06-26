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
import java.nio.file.Path;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.app.project.core.creation.IProjectCreationData;
import org.modelio.app.project.core.creation.IProjectCreator;
import org.modelio.app.project.ui.plugin.AppProjectUiExt;
import org.modelio.gproject.descriptor.DefinitionScope;
import org.modelio.gproject.descriptor.ProjectDescriptor;
import org.modelio.gproject.fragment.IProjectFragment;
import org.modelio.gproject.fragment.exml.ExmlFragmentFactory;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.gproject.GProjectCreator;
import org.modelio.gproject.gproject.GProjectFactory;
import org.modelio.gproject.module.IModuleCatalog;
import org.modelio.gproject.module.IModuleHandle;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.NullProgress;

/**
 * This class is in charge of creating a new Modelio project.<br>
 * The project creation task carries out the followings:
 * <ul>
 * <li>create the project
 * <li>create alocal fragment in the project
 * <li>install modeler module
 * <li>deploy the specified modules
 * <li>deploy the specified RAMC
 * </ul>
 * The project creation task is configured by a {@link ProjectCreationDataModel} object defining the chosen required options and
 * values
 */
@objid ("0044845a-cc35-1ff2-a7f4-001ec947cd2a")
public class ProjectCreator implements IProjectCreator {
    @objid ("c6c9f00b-c73d-4087-84ba-ef9ac7dd0a4e")
    private static final String INFO_DESCRIPTION = "info.description";

/*
     * (non-Javadoc)
     * 
     * @see org.modelio.app.project.core.creation.IProjectCreator#createProject(org.modelio.app.project.core.creation.
     * ProjectCreationDataModel, org.modelio.gproject.module.IModuleCatalog, org.eclipse.core.runtime.IProgressMonitor)
     */
    @objid ("007534b0-7310-10b7-9941-001ec947cd2a")
    @Override
    public void createProject(IProjectCreationData creationData, IModuleCatalog moduleCatalog, IModelioProgress monitor) {
        ProjectCreationDataModel data = (ProjectCreationDataModel)creationData;
        
        
        try {
            String name = data.getProjectName();
            Path projectPath = data.workspace.resolve(name);
        
            // Find the ModelerModule, if not found : abort as this module is mandatory
            IModuleHandle modelerModule = moduleCatalog.findModule("ModelerModule", /* latest version */null, null);
            if (modelerModule == null) {
                // FIXME: indicate the problem !!!
                return;
            }
        
            // Create an empty GProject, open it
            ProjectDescriptor projectDescriptor;
        
            projectDescriptor = GProjectCreator.buildEmptyProject(name, projectPath);
        
            GProject project = GProjectFactory.openProject(projectDescriptor, null, moduleCatalog, null);
        
            // Create and register at least one local fragment
            IProjectFragment fragment = ExmlFragmentFactory.instantiateLocal(name);
            project.registerFragment(fragment, monitor);
        
            // IProjectFragment predefinedFragment = getPredefinedFragment(mon.newChild(100));
            // project.registerFragment(predefinedFragment, new EclipseProgress(mon.newChild(100)));
        
            // Install  modules
            project.installModule(modelerModule, modelerModule.getArchive());
            
            for (IModuleHandle moduleHandle : data.getModuleHandles()) {
                project.installModule(moduleHandle, moduleHandle.getArchive());
            }
            // Add project description
            project.getProperties().setProperty(INFO_DESCRIPTION, data.getProjectDescription(), DefinitionScope.LOCAL);
            project.save(new NullProgress());
            project.close();
        } catch (IOException e) {
            AppProjectUiExt.LOG.error(e);
        }
    }

}
