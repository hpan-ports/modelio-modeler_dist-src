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


package org.modelio.api.impl.mc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IProgressMonitor;
import org.modelio.api.impl.plugin.ApiImpl;
import org.modelio.api.mc.IModelComponentDescriptor;
import org.modelio.api.mc.IModelComponentService;
import org.modelio.api.module.IPeerModule;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.app.ramcs.edition.RamcModel;
import org.modelio.core.ui.progress.ModelioProgressAdapter;
import org.modelio.gproject.data.project.FragmentDescriptor;
import org.modelio.gproject.data.project.FragmentType;
import org.modelio.gproject.data.ramc.IModelComponentInfos;
import org.modelio.gproject.data.ramc.ModelComponentArchive;
import org.modelio.gproject.fragment.IProjectFragment;
import org.modelio.gproject.fragment.ramcfile.RamcFileFragment;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.ramc.core.packaging.IModelComponentContributor;
import org.modelio.gproject.ramc.core.packaging.RamcPackager;
import org.modelio.mda.infra.service.IModuleManagementService;
import org.modelio.mda.infra.service.IRTModule;
import org.modelio.metamodel.uml.statik.Artifact;

@objid ("28cfd501-4a46-4b3d-80f0-a848a9168605")
public class ModelComponentService implements IModelComponentService {
    @objid ("efa30fd8-6f4d-49a2-b320-27ca96a0b42e")
    private IProjectService projectService;

    @objid ("f45359c5-094c-4d7e-a257-f1cad10c4520")
    private IModuleManagementService moduleManagementService;

    @objid ("9304d2eb-2768-4914-ba80-c4097a5835c3")
    @Override
    public void deployModelComponent(final File archive, final IProgressMonitor monitor) {
        ModelComponentArchive modelComponentArchive = new ModelComponentArchive(archive.toPath(), true);
        try {
            // First, remove existing ramcs with the same name
            final IModelComponentInfos infos = modelComponentArchive.getInfos();
            removeModelComponent(buildDescriptor(infos));
        
            FragmentDescriptor fragmentDescriptor = modelComponentArchive.getFragmentDescriptor();
            this.projectService.addFragment(this.projectService.getOpenedProject(), fragmentDescriptor, monitor);
        } catch (Exception e) {
            ApiImpl.LOG.error(e);
        }
    }

    @objid ("51c27ce0-54ad-4e8b-b821-e9055c7bf9fe")
    @Override
    public void removeModelComponent(final IModelComponentDescriptor modelComponent) {
        String name = modelComponent.getName();
        
        GProject openedProject = this.projectService.getOpenedProject();
        
        IProjectFragment fragmentToRemove = null;
        for (IProjectFragment fragment : openedProject.getFragments()) {
            if (fragment.getType() == FragmentType.RAMC) {
                try {
                    IModelComponentInfos infos = ((RamcFileFragment) fragment).getInformations();
                    if (name.equals(infos.getName())) {
                        fragmentToRemove = fragment;
                        break;
                    }
                } catch (IOException e) {
                    ApiImpl.LOG.error(e);
                }
            }
        }
        
        if (fragmentToRemove != null) {
            this.projectService.removeFragment(this.projectService.getOpenedProject(), fragmentToRemove);
        }
    }

    @objid ("6ab88513-30a0-4524-bd55-157740c586f0")
    @Override
    public List<IModelComponentDescriptor> getModelComponents() {
        List<IModelComponentDescriptor> mcList = new ArrayList<>();
        
        for (IProjectFragment fragment : this.projectService.getOpenedProject().getFragments()) {
            if (fragment.getType() == FragmentType.RAMC) {
                try {
                    // Parse the fragment to get its version
                    mcList.add(buildDescriptor(((RamcFileFragment) fragment).getInformations()));
                } catch (IOException e) {
                    // Ignore broken ramcs...
                }
            }
        }
        return mcList;
    }

    @objid ("5e1cfe62-8457-428e-8795-0462540ccc7b")
    @Override
    public void packageModelComponent(final Artifact mc, final Set<IPeerModule> peerModules, final File targetFile, final IProgressMonitor monitor) {
        try {
            RamcPackager packager = new RamcPackager(this.projectService.getOpenedProject(), mc, targetFile.toPath(),
                    getContributors(mc, peerModules));
            packager.run(new ModelioProgressAdapter(monitor));
        } catch (IOException e) {
            ApiImpl.LOG.error(e);
        }
    }

    @objid ("5fa17d16-6f97-4206-b5f3-888ac153780d")
    public ModelComponentService(IProjectService projectService, IModuleManagementService moduleManagementService) {
        this.projectService = projectService;
        this.moduleManagementService = moduleManagementService;
    }

    @objid ("27d59096-2a29-4ece-b3db-82b7a7eddbb1")
    private ModelComponentDescriptor buildDescriptor(IModelComponentInfos infos) {
        return new ModelComponentDescriptor(infos.getName(), infos.getVersion().toString());
    }

    @objid ("55bfc149-73b4-4ae6-b7ad-98f5acbac725")
    @Override
    public List<IModelComponentContributor> getContributors(final Artifact mc, Set<IPeerModule> peerModules) {
        RamcModel model = new RamcModel(this.projectService.getOpenedProject().getProjectPath(), mc);
        
        // Contributors to RAMC packaging
        List<IModelComponentContributor> contributors = new ArrayList<>();
        for (IRTModule m : this.moduleManagementService.getModuleRegistry().getStartedModules()) {
            if (m.getIModule() != null && peerModules.contains(m.getPeerModule())) {
                IModelComponentContributor contributor = m.getIModule().getModelComponentContributor(model);
                if (contributor != null) {
                    contributors.add(contributor);
                }
            }
        }
        return contributors;
    }

}
