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
                                    

package org.modelio.diagram.diagramauto.services;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.diagram.autodiagram.IAutoDiagramFactory;
import org.modelio.api.diagram.autodiagram.IDiagramCreator;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.diagram.diagramauto.diagram.creator.ClassArchitectureCreator;
import org.modelio.diagram.diagramauto.diagram.creator.ClassStructureCreator;
import org.modelio.diagram.diagramauto.diagram.creator.DependencyCreator;
import org.modelio.diagram.diagramauto.diagram.creator.InheritanceCreator;
import org.modelio.diagram.diagramauto.diagram.creator.PackageContentStructureCreator;
import org.modelio.diagram.diagramauto.diagram.creator.SubPackageStructureCreator;
import org.modelio.diagram.editor.plugin.DiagramEditorsManager;
import org.modelio.diagram.editor.plugin.IDiagramConfigurerRegistry;
import org.modelio.gproject.model.IMModelServices;

@objid ("2625bf4b-74e0-4394-889f-7e05d8dbc73c")
public class AutoDiagramFactory implements IAutoDiagramFactory {
    @objid ("8cd07e77-70f6-41d5-a7c3-8fb4c4ab9d3a")
    private IMModelServices modelServices;

    @objid ("a23a6f27-3259-4440-a4fe-6ec8d8c805df")
    private IProjectService projectService;

    @objid ("29a1f1e7-3e19-4710-8f49-502d4ceed06a")
    private IDiagramConfigurerRegistry configurerRegistry;

    @objid ("c056bd1c-ad62-45c6-94d7-2f2dfaa772e0")
    private DiagramEditorsManager editorManager;

    @objid ("96a64f59-9c46-462b-9fa9-68e33d87a690")
    public AutoDiagramFactory(IProjectService projectService, IDiagramConfigurerRegistry configurerRegistry, DiagramEditorsManager editorManager, IMModelServices modelServices) {
        this.modelServices = modelServices;
        this.projectService = projectService;
        this.configurerRegistry = configurerRegistry;
        this.editorManager = editorManager;
    }

    @objid ("33d70042-435b-46cb-8a72-d4380d223685")
    @Override
    public IDiagramCreator createClassStructureCreator() {
        return new DiagramCreatorProxy(new ClassStructureCreator(this.projectService,this.configurerRegistry,this.editorManager,this.modelServices));
    }

    @objid ("9ab57b06-1a43-45a2-900d-e107ecaafc09")
    @Override
    public IDiagramCreator createInheritanceCreator() {
        return new DiagramCreatorProxy(new InheritanceCreator(this.projectService,this.configurerRegistry,this.editorManager,this.modelServices));
    }

    @objid ("983bd3a2-44c2-4f05-bb41-55c619259faf")
    @Override
    public IDiagramCreator createSubPackageStructureCreator() {
        return new DiagramCreatorProxy(new SubPackageStructureCreator(this.projectService,this.configurerRegistry,this.editorManager,this.modelServices));
    }

    @objid ("cf108cb6-d420-49c6-897c-8444ee4f6cae")
    @Override
    public IDiagramCreator createPackageContentStructureCreator() {
        return new DiagramCreatorProxy(new PackageContentStructureCreator(this.projectService,this.configurerRegistry,this.editorManager,this.modelServices));
    }

    @objid ("f33f6479-7001-4bfb-9ca4-337e8f587513")
    @Override
    public IDiagramCreator createDependencyCreator() {
        return new DiagramCreatorProxy(new DependencyCreator(this.projectService,this.configurerRegistry,this.editorManager,this.modelServices));
    }

    @objid ("9b643b8f-134a-4838-b2cd-b5a68006efec")
    @Override
    public IDiagramCreator createClassArchitectureCreator() {
        return new DiagramCreatorProxy(new ClassArchitectureCreator(this.projectService,this.configurerRegistry,this.editorManager,this.modelServices));
    }

}
