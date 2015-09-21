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
import org.modelio.metamodel.diagrams.CommunicationDiagram;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.osgi.framework.Bundle;

@objid ("95d779e3-1da3-4a4e-afa3-46058a83155a")
public class CommunicationDiagramCreationContributor extends AbstractUMLDiagramCreationContributor {
    @objid ("ea2be538-10ce-4046-8045-6b3e9b68bebe")
    @Override
    public AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription) {
        CommunicationDiagram diagram = null;
        IModelFactory modelFactory = this.mmServices.getModelFactory();
        // Unless the parent element is already a CommunicationInteraction, create the CommunicationInteraction:
        CommunicationInteraction interaction = null;
        Collaboration locals = null;
        if (diagramContext instanceof CommunicationInteraction) {
            interaction = (CommunicationInteraction) diagramContext;
            if (interaction.getOwnedCollaboration().size() > 0) {
                locals = interaction.getOwnedCollaboration().get(0);
            } else {
                checkLocalCollaboration(modelFactory, interaction);
            }
        } else if (diagramContext instanceof Operation) {
            // create a CommunicationInteraction and its 'locals' collaboration
            interaction = modelFactory.createCommunicationInteraction();
            locals = checkLocalCollaboration(modelFactory, interaction);
            interaction.setOwnerOperation((Operation) diagramContext);
            setElementDefaultName(interaction);
        } else {
            // create a CommunicationInteraction and its 'locals' collaboration
            interaction = modelFactory.createCommunicationInteraction();
            locals = checkLocalCollaboration(modelFactory, interaction);
            interaction.setOwner((NameSpace) diagramContext);
            setElementDefaultName(interaction);
        }
        
        // Create the diagram, depending on parentElement, carry out the "smart" creation job
        if ((diagramContext instanceof Classifier) && !(diagramContext instanceof UseCase)) {
            diagram = smartCreateForClassifier(modelFactory, interaction, locals, (Classifier) diagramContext, diagramName);
        } else if (diagramContext instanceof Operation) {
            diagram = smartCreateForOperation(modelFactory, interaction, locals, (Operation) diagramContext, diagramName);
        } else {
            diagram = smartCreateForNameSpace(modelFactory, interaction, diagramName);
        }
        
        if (diagram != null) {
            if (diagramName.equals(getLabel())) {
                setElementDefaultName(diagram);
            } else {
                diagram.setName(diagramName);
            }
            putNoteContent(diagram, "description", diagramDescription);
        }
        return diagram;
    }

    @objid ("e5f2c211-f980-4842-93e4-1dcc89b86e21")
    @Override
    public String getDetails() {
        return CreationWizard.I18N.getString("CreationWizard.Communication.Details");
    }

    @objid ("b31f620d-db97-4b3c-b483-5e3cd601d585")
    @Override
    public Image getIcon() {
        return MetamodelImageService.getIcon(getMetamodel().getMClass(CommunicationDiagram.class));
    }

    @objid ("ce2af409-eba2-4b8a-b1b2-76b8d88ff611")
    @Override
    public String getInformation() {
        return CreationWizard.I18N.getString("CreationWizard.Communication.Information");
    }

    @objid ("607477b0-0fbb-455c-b582-93bb16761084")
    @Override
    public String getLabel() {
        return CreationWizard.I18N.getString("CreationWizard.Communication.Name");
    }

    @objid ("a362afd0-4299-4c99-b6c2-7f43221a261f")
    private Collaboration checkLocalCollaboration(final IModelFactory modelFactory, final CommunicationInteraction interaction) {
        Collaboration locals = null;
        // Look for an existing local Collaboration
        for (Collaboration collab : interaction.getOwnedCollaboration()) {
            locals = collab;
            break;
        }
        
        if (locals == null) {
            // Create the local Collaboration
            locals = modelFactory.createCollaboration();
            interaction.getOwnedCollaboration().add(locals);
            locals.setName("locals");
        }
        return locals;
    }

    @objid ("ec6f8179-97e9-4890-81ea-70c8db31f2f3")
    private CommunicationDiagram createCommunicationDiagram(IModelFactory modelFactory, final CommunicationInteraction diagramContext, final String diagramName) {
        // Create the Communication diagram
        CommunicationDiagram diagram;
        diagram = modelFactory.createCommunicationDiagram(diagramName, diagramContext, null);
        diagramContext.getProduct().add(diagram);
        return diagram;
    }

    /**
     * Creating a Communication diagram under a classifier will:
     * <ul>
     * <li>create a 'locals' collaboration under the classifier</li>
     * </ul>
     * @param locals
     * @param diagramName
     */
    @objid ("804d0332-eee4-45cb-b0ce-78d71861032f")
    private CommunicationDiagram smartCreateForClassifier(final IModelFactory modelFactory, final CommunicationInteraction interaction, final Collaboration locals, final Classifier parentClassifier, final String diagramName) {
        // Update model with effective context
        CommunicationInteraction diagramContext = interaction;
        
        // create the communication diagram
        CommunicationDiagram diagram = createCommunicationDiagram(modelFactory, diagramContext, diagramName);
        if (diagram != null) {
            // Create this pointer, create the instance:
            BindableInstance instance = modelFactory.createBindableInstance();
            if (instance != null) {
                locals.getDeclared().add(instance);
                instance.setName("this");
                instance.setBase(parentClassifier);
        
                // Create the corresponding CommunicationNode:
                CommunicationNode node = modelFactory.createCommunicationNode();
                if (node != null) {
                    interaction.getOwned().add(node);
                    node.setName("this");
                    node.setRepresented(instance);
                }
            }
        }
        return diagram;
    }

    @objid ("c31ea4ac-86d5-4987-b4a2-c25a39eff319")
    private CommunicationDiagram smartCreateForNameSpace(final IModelFactory modelFactory, final CommunicationInteraction interaction, final String diagramName) {
        // Update model with effective context
        CommunicationInteraction diagramContext = interaction;
        
        // create the communication diagram
        return createCommunicationDiagram(modelFactory, diagramContext, diagramName);
    }

    @objid ("93d80e2e-086b-47ab-9a2d-c8444af05281")
    private CommunicationDiagram smartCreateForOperation(final IModelFactory modelFactory, final CommunicationInteraction interaction, final Collaboration locals, final Operation parentOperation, final String diagramName) {
        // Update model with effective context
        CommunicationInteraction diagramContext = interaction;
        
        // create the communication diagram
        CommunicationDiagram diagram = createCommunicationDiagram(modelFactory, diagramContext, diagramName);
        if (diagram != null) {
        
            // Create the 'this' instance:
            BindableInstance instance = modelFactory.createBindableInstance();
        
            if (instance != null) {
                locals.getDeclared().add(instance);
                instance.setName("this");
                instance.setBase(parentOperation.getOwner());
        
                // Create the corresponding CommunicationNode:
                CommunicationNode node = modelFactory.createCommunicationNode();
                if (node != null) {
                    interaction.getOwned().add(node);
                    node.setName("this");
                    node.setRepresented(instance);
                }
            }
        }
        return diagram;
    }

    @objid ("ca9654f1-deb1-4c5f-a06a-c8e44a768c3b")
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
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(CommunicationInteraction.class), null));
        return allowedScopes;
    }

    @objid ("dbf08b06-91fa-4962-a059-45a30ae58b80")
    @Override
    public ImageDescriptor getPreviewImage() {
        Bundle bundle = CreationWizard.getContext().getBundle();
        URL imageUrl = FileLocator.find(bundle, new Path("icons/communicationdiagrampreview.png"), null);
        return ImageDescriptor.createFromURL(imageUrl);
    }

}
