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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.core.ui.images.MetamodelImageService;
import org.modelio.creation.wizard.plugin.CreationWizard;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.StateMachineDiagram;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
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
import org.osgi.framework.Bundle;

@objid ("3988a614-bd95-4ad5-8577-f1a7a9ded361")
public class StateDiagramCreationContributor extends AbstractUMLDiagramCreationContributor {
    @objid ("d1ff3ed3-cfa1-4ae6-ba4b-084942419f44")
    @Override
    public AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription) {
        IModelFactory modelFactory = this.mmServices.getModelFactory();
        StateMachineDiagram stateDiagram = null;
        
        // Create the StateMachine:
        final StateMachine stateMachine;
        
        if (diagramContext instanceof StateMachine) {
            stateMachine = (StateMachine) diagramContext;
        } else if (diagramContext instanceof Operation) {
            stateMachine = modelFactory.createStateMachine();
            stateMachine.setOwnerOperation((Operation) diagramContext);
            setElementDefaultName(stateMachine);
        } else {
            stateMachine = modelFactory.createStateMachine();
            stateMachine.setOwner((NameSpace) diagramContext);
            setElementDefaultName(stateMachine);
        }
        
        // Create the state machine diagram:
        stateDiagram = createStateDiagram(modelFactory, diagramName, stateMachine);
        
        if (stateDiagram != null) {
            if (diagramName.equals(getLabel())) {
                setElementDefaultName(stateDiagram);
            } else {
                stateDiagram.setName(diagramName);
            }
            putNoteContent(stateDiagram, "description", diagramDescription);
        }
        return stateDiagram;
    }

    @objid ("f568091f-c6de-49cb-8608-b59a96ddb47a")
    @Override
    public String getDetails() {
        return CreationWizard.I18N.getString("CreationWizard.State.Details");
    }

    @objid ("5a59a23d-5500-4601-bc7f-d38e1b4f48c1")
    @Override
    public Image getIcon() {
        return MetamodelImageService.getIcon(getMetamodel().getMClass(StateMachineDiagram.class));
    }

    @objid ("8c0cea20-ffac-4431-8347-d9c524cda1ba")
    @Override
    public String getInformation() {
        return CreationWizard.I18N.getString("CreationWizard.State.Information");
    }

    @objid ("cb5992b6-b7c5-4863-baf1-5082b20cffc0")
    @Override
    public String getLabel() {
        return CreationWizard.I18N.getString("CreationWizard.State.Name");
    }

    @objid ("0ca58be9-9018-4877-90ba-c29162407b60")
    private StateMachineDiagram createStateDiagram(final IModelFactory modelFactory, final String diagramName, final ModelElement diagramContext) {
        // Create the Sequence diagram
        StateMachineDiagram stateDiagram = modelFactory.createStateMachineDiagram(diagramName, diagramContext, null);
        return stateDiagram;
    }

    @objid ("4174a213-32f6-4b7f-a3fc-02d7b27f9d39")
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
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(StateMachine.class), null));
        return allowedScopes;
    }

    @objid ("37213659-2bad-45ca-9b59-723d6fb3b9f8")
    @Override
    public ImageDescriptor getPreviewImage() {
        Bundle bundle = CreationWizard.getContext().getBundle();
        URL imageUrl = FileLocator.find(bundle, new Path("icons/statediagrampreview.png"), null);
        return ImageDescriptor.createFromURL(imageUrl);
    }

}
