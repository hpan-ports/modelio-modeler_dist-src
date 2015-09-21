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


package org.modelio.creation.wizard.contributor;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.module.IModule;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.core.ui.images.MetamodelImageService;
import org.modelio.creation.wizard.plugin.CreationWizard;
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnProcessCollaborationDiagram;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnBehavior;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.osgi.framework.Bundle;

@objid ("b14cde30-787a-4fa2-b4b1-7616a2c34fe1")
public class BpmnProcessCollaborationDiagramCreationContributor extends AbstractUMLDiagramCreationContributor {
    @objid ("53c16dfc-36b2-43a4-86f4-bce9a605086b")
    @Override
    public AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription) {
        IModelFactory modelFactory = this.mmServices.getModelFactory();
        BpmnProcess process = null;
        
        if (diagramContext instanceof BpmnProcess) {
            process = (BpmnProcess) diagramContext;
        } else {
            process = createBpmnProcess(modelFactory, diagramContext);
        }
        BpmnProcessCollaborationDiagram diagram = createBPMNDiagram(modelFactory, process, diagramName);
        if (diagram != null) {
            putNoteContent(diagram, "description", diagramDescription);
        }
        return diagram;
    }

    @objid ("8b31bbfb-25c7-41a5-be72-e38fda9107df")
    @Override
    public String getDetails() {
        return CreationWizard.I18N.getString("CreationWizard.BpmnProcessCollaboration.Details");
    }

    @objid ("02a01669-bd24-4f94-a0f0-ecbe6566fd4e")
    @Override
    public Image getIcon() {
        return MetamodelImageService.getIcon(getMetamodel().getMClass(BpmnProcessCollaborationDiagram.class));
    }

    @objid ("70490cdf-2713-4dac-9ace-dd3615ae157e")
    @Override
    public String getInformation() {
        return CreationWizard.I18N.getString("CreationWizard.BpmnProcessCollaboration.Information");
    }

    @objid ("c5e549da-417a-49eb-afe2-12377314e81e")
    @Override
    public String getLabel() {
        return CreationWizard.I18N.getString("CreationWizard.BpmnProcessCollaboration.Name");
    }

    @objid ("372b54e6-7f7f-444b-bdfb-46cf90a9d3d0")
    private BpmnProcessCollaborationDiagram createBPMNDiagram(final IModelFactory modelFactory, final BpmnProcess owner, final String diagramName) {
        BpmnProcessCollaborationDiagram diagram = modelFactory.createBpmnProcessCollaborationDiagram();
        diagram.setOrigin(owner);
        if (diagramName.equals(getLabel())) {
            setElementDefaultName(diagram);
        } else {
            diagram.setName(diagramName);
        }
        return diagram;
    }

    @objid ("a43e7693-3d83-4021-8808-5368602dfe68")
    private BpmnProcess createBpmnProcess(final IModelFactory modelFactory, final ModelElement diagramContext) {
        BpmnBehavior behavior = null;
        BpmnProcess process = null;
        BpmnCollaboration collaboration = null;
        
        if (diagramContext instanceof BpmnBehavior) {
            behavior = (BpmnBehavior) diagramContext;
        } else if (diagramContext instanceof NameSpace) {
            behavior = modelFactory.createBpmnBehavior();
            behavior.setOwner((NameSpace) diagramContext);
            setElementDefaultName(behavior);
        } else if (diagramContext instanceof Operation) {
            behavior = modelFactory.createBpmnBehavior();
            behavior.setOwnerOperation((Operation) diagramContext);
            setElementDefaultName(behavior);
        } else if (diagramContext instanceof TemplateParameter) {
            behavior = modelFactory.createBpmnBehavior();
            behavior.setOwnerTemplateParameter((TemplateParameter) diagramContext);
            setElementDefaultName(behavior);
        }
        
        if (behavior != null) {
            process = modelFactory.createBpmnProcess();
            process.setOwner(behavior);
            setElementDefaultName(process);
        
            if (behavior.getRootElement(BpmnCollaboration.class).size() == 0) {
                collaboration = modelFactory.createBpmnCollaboration();
                collaboration.setOwner(behavior);
                setElementDefaultName(collaboration);
            }
        }
        return process;
    }

    @objid ("e650ae93-fb3a-4259-8433-cc5b508aaeff")
    @Override
    public List<CommandScope> getScopes() {
        List<CommandScope> allowedScopes = new ArrayList<>();
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Package.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Class.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Interface.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Signal.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Actor.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Component.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Node.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(UseCase.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Collaboration.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Operation.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(BpmnProcess.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(BpmnBehavior.class), null));
        return allowedScopes;
    }

    @objid ("ebd8bf79-622a-4199-929c-039f6195a93c")
    @Override
    public ImageDescriptor getPreviewImage() {
        Bundle bundle = CreationWizard.getContext().getBundle();
        URL imageUrl = FileLocator.find(bundle, new Path("icons/bpmnprocesscollabdiagrampreview.png"), null);
        return ImageDescriptor.createFromURL(imageUrl);
    }

}
