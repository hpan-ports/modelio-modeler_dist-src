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
import java.util.ArrayList;
import java.util.List;
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
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.factory.ModelFactory;
import org.modelio.metamodel.mda.Project;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.NullProgress;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

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
 * The project creation task is configured by a {@link ProjectCreationDataModel}
 * object defining the chosen required options and values
 */
@objid ("0044845a-cc35-1ff2-a7f4-001ec947cd2a")
public class ProjectCreator implements IProjectCreator {
    @objid ("c6c9f00b-c73d-4087-84ba-ef9ac7dd0a4e")
    private static final String INFO_DESCRIPTION = "info.description";

    @objid ("235c0e6a-5041-4823-a2f9-408010612d74")
    private List<MRef> diagrams = new ArrayList<>();

/*
     * (non-Javadoc)
     * 
     * @see
     * org.modelio.app.project.core.creation.IProjectCreator#createProject(org
     * .modelio.app.project.core.creation. ProjectCreationDataModel,
     * org.modelio.gproject.module.IModuleCatalog,
     * org.eclipse.core.runtime.IProgressMonitor)
     */
    @objid ("007534b0-7310-10b7-9941-001ec947cd2a")
    @Override
    public void createProject(IProjectCreationData creationData, IModuleCatalog moduleCatalog, IModelioProgress monitor) {
        ProjectCreationDataModel data = (ProjectCreationDataModel) creationData;
        
        try {
            String name = data.getProjectName();
            Path projectPath = data.workspace.resolve(name);
        
            // Find the ModelerModule, if not found : abort as this module is
            // mandatory
            IModuleHandle modelerModule = moduleCatalog.findModule("ModelerModule", /*
                                                                                     * latest
                                                                                     * version
                                                                                     */null, null);
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
        
            // IProjectFragment predefinedFragment =
            // getPredefinedFragment(mon.newChild(100));
            // project.registerFragment(predefinedFragment, new
            // EclipseProgress(mon.newChild(100)));
        
            // Install modules
            project.installModule(modelerModule, modelerModule.getArchive());
        
            for (IModuleHandle moduleHandle : data.getModuleHandles()) {
                project.installModule(moduleHandle, moduleHandle.getArchive());
            }
            // Add project description
            project.getProperties().setProperty(INFO_DESCRIPTION, data.getProjectDescription(), DefinitionScope.LOCAL);
        
            // Create a initial model
            MObject root = fragment.getRoots().iterator().next();
            if (root != null && root instanceof Project) {
                createInitialModel(project.getSession(), ((Project)root));
            }
        
            project.save(new NullProgress());
            project.close();
        } catch (IOException e) {
            AppProjectUiExt.LOG.error(e);
        }
    }

    @objid ("cde8bf09-9636-49a5-8113-d98f394c07c4")
    private void createInitialModel(ICoreSession session, Project root) {
        try (ITransaction t = session.getTransactionSupport().createTransaction("initial model")) {
            
            IModelFactory factory = ModelFactory.getFactory(root);
        
            // Create an initial class diagram
            AbstractDiagram d = factory.createClassDiagram("overview diagram", root.getModel(), null);
            this.diagrams.add(new MRef(d));
            t.commit();
        }
    }

    /**
     * Return the diagrams that ought to be opened when first opening the project right after its creation
     * @return
     */
    @objid ("8716539d-59a0-4e88-8366-8d78d836652f")
    public List<MRef> getDiagramsToOpen() {
        return this.diagrams;
    }

}
