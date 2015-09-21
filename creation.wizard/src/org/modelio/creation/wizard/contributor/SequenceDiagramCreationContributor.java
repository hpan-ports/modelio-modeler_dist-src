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
import org.modelio.metamodel.diagrams.SequenceDiagram;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
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

@objid ("79d8d35b-64bc-42db-854c-6b7c35780f67")
public class SequenceDiagramCreationContributor extends AbstractUMLDiagramCreationContributor {
    @objid ("12f39b07-a757-4ee0-9bae-73262df4b563")
    @Override
    public AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription) {
        IModelFactory modelFactory = this.mmServices.getModelFactory();
        SequenceDiagram diagram = null;
        
        // Unless the parent element is already an Interaction, create the Interaction:
        Interaction interaction = null;
        if (diagramContext instanceof Interaction) {
            interaction = (Interaction) diagramContext;
            diagram = smartCreateForNameSpace(modelFactory, interaction, diagramName);
        } else {
            interaction = modelFactory.createInteraction();
            // Create the diagram, depending on parentElement, carry out the "smart" creation job
            if ((diagramContext instanceof Classifier) && !(diagramContext instanceof UseCase)) {
                interaction.setOwner((Classifier) diagramContext);
                setElementDefaultName(interaction);
                diagram = smartCreateForClassifier(modelFactory, interaction, (Classifier) diagramContext, diagramName);
            } else if (diagramContext instanceof Operation) {
                interaction.setOwnerOperation((Operation) diagramContext);
                setElementDefaultName(interaction);
                diagram = smartCreateForOperation(modelFactory, interaction, (Operation) diagramContext, diagramName);
            } else {
                interaction.setOwner((NameSpace) diagramContext);
                setElementDefaultName(interaction);
                diagram = smartCreateForNameSpace(modelFactory, interaction, diagramName);
            }
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

    @objid ("e3242862-3cf8-4bcf-8eef-298e48b902e7")
    @Override
    public String getDetails() {
        return CreationWizard.I18N.getString("CreationWizard.Sequence.Details");
    }

    @objid ("1505abf0-1641-4bb7-a249-ab12604413ec")
    @Override
    public Image getIcon() {
        return MetamodelImageService.getIcon(getMetamodel().getMClass(SequenceDiagram.class));
    }

    @objid ("ac91be33-f780-4054-afaa-2215114374e9")
    @Override
    public String getInformation() {
        return CreationWizard.I18N.getString("CreationWizard.Sequence.Information");
    }

    @objid ("75552bd2-a6e9-4327-86ad-319fac17dbf4")
    @Override
    public String getLabel() {
        return CreationWizard.I18N.getString("CreationWizard.Sequence.Name");
    }

    @objid ("cc092d46-1a87-471a-8bc6-595a4470a621")
    private Collaboration checkLocalCollaboration(final IModelFactory modelFactory, final Interaction interaction) {
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

    @objid ("63f7df8b-7e7e-4873-8630-53a76c37912d")
    private SequenceDiagram createSequenceDiagram(final IModelFactory modelFactory, final String diagramName, final ModelElement diagramContext) {
        SequenceDiagram diagram = modelFactory.createSequenceDiagram();
        diagram.setName(diagramName);
        diagram.setOrigin(diagramContext);
        return diagram;
    }

    @objid ("1239d95e-2618-479d-8bc7-78a0faf08ab8")
    private SequenceDiagram smartCreateForClassifier(final IModelFactory modelFactory, final Interaction interaction, final Classifier parentClassifier, final String diagramName) {
        // Update model with effective context
        Interaction diagramContext = interaction;
        
        // create the sequence diagram
        SequenceDiagram diagram = createSequenceDiagram(modelFactory, diagramName, diagramContext);
        if (diagram != null) {
            // Create the locals Collaboration
            Collaboration locals = checkLocalCollaboration(modelFactory, interaction);
            if (locals != null) {
                // Create this pointer, create the instance:
                BindableInstance instance = modelFactory.createBindableInstance();
                if (instance != null) {
                    locals.getDeclared().add(instance);
                    instance.setName("this");
                    instance.setBase(parentClassifier);
        
                    // Create the corresponding InstanceNode:
                    Lifeline lifeline = modelFactory.createLifeline();
                    if (lifeline != null) {
                        interaction.getOwnedLine().add(lifeline);
                        lifeline.setName("this");
                        lifeline.setRepresented(instance);
                    }
                }
            }
        }
        return diagram;
    }

    @objid ("a264afa5-2b1a-4954-844c-b34df3a866ea")
    private SequenceDiagram smartCreateForNameSpace(final IModelFactory modelFactory, final Interaction interaction, final String diagramName) {
        // Update model with effective context
        Interaction diagramContext = interaction;
        
        // create the sequence diagram
        SequenceDiagram diagram = createSequenceDiagram(modelFactory, diagramName, diagramContext);
        if (diagram != null) {
            // Create the locals Collaboration:
            checkLocalCollaboration(modelFactory, interaction);
        }
        return diagram;
    }

    @objid ("a1ac8559-f314-49de-8373-b9fe33a6cd5e")
    private SequenceDiagram smartCreateForOperation(final IModelFactory modelFactory, final Interaction interaction, final Operation parentOperation, final String diagramName) {
        // Update model with effective context
        Interaction diagramContext = interaction;
        
        // create the sequence diagram
        SequenceDiagram diagram = createSequenceDiagram(modelFactory, diagramName, diagramContext);
        if (diagram != null) {
        
            // Create the locals Collaboration:
            Collaboration locals = checkLocalCollaboration(modelFactory, interaction);
            if (locals != null) {
                // Create the 'this' instance:
                BindableInstance instance = modelFactory.createBindableInstance();
        
                if (instance != null) {
                    locals.getDeclared().add(instance);
                    instance.setName("this");
                    instance.setBase(parentOperation.getOwner());
        
                    // Create the corresponding InstanceNode:
                    Lifeline lifeline = modelFactory.createLifeline();
                    if (lifeline != null) {
                        interaction.getOwnedLine().add(lifeline);
                        lifeline.setName("this");
                        lifeline.setRepresented(instance);
                    }
                }
            }
        }
        return diagram;
    }

    @objid ("503434e8-dcef-44ed-a911-e0b797fd8429")
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
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Interaction.class), null));
        return allowedScopes;
    }

    @objid ("7feccd67-a9cf-481f-99cd-979479e44030")
    @Override
    public ImageDescriptor getPreviewImage() {
        Bundle bundle = CreationWizard.getContext().getBundle();
        URL imageUrl = FileLocator.find(bundle, new Path("icons/sequencediagrampreview.png"), null);
        return ImageDescriptor.createFromURL(imageUrl);
    }

}
