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


package org.modelio.diagram.diagramauto.handlers;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.diagram.diagramauto.diagram.creator.InheritanceCreator;
import org.modelio.diagram.diagramauto.plugin.DiagramAuto;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("397bf5c8-994d-4f08-b555-4645f6573de9")
public class InheritanceDiagram extends AbstractHandler {
    @objid ("7f58be35-4a7b-449b-abca-84a6fd9c3adc")
    @Override
    public AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription) {
        InheritanceCreator csc = new InheritanceCreator(this.mmServices);
        AbstractDiagram diagram = csc.createDiagram(diagramContext);
        diagram.setName(diagramName);
        try {
            diagram.putNoteContent("ModelerModule", "description", diagramDescription);
        } catch (ExtensionNotFoundException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
        return diagram;
    }

    @objid ("a9482952-a433-47eb-a721-e405f1ec8809")
    @Override
    public String getDetails() {
        return DiagramAuto.I18N.getString("CreationWizard.Inheritance.Details");
    }

    @objid ("4639ae35-83c9-4a18-865e-272b6337fddf")
    @Override
    public String getInformation() {
        return DiagramAuto.I18N.getString("CreationWizard.Inheritance.Information");
    }

    @objid ("d21ccfec-0ffd-4197-b7fd-94158cd37186")
    @Override
    public String getLabel() {
        return DiagramAuto.I18N.getString("CreationWizard.Inheritance.Name");
    }

    @objid ("173b16ab-c8fa-4ba5-8152-88d16a0b5936")
    @Override
    protected String getPreviewImagePath() {
        return DiagramAuto.I18N.getString("CreationWizard.Inheritance.PreviewImage");
    }

    @objid ("50ac6201-c496-4a03-bf8a-d80d735a2ef3")
    @Override
    protected String getIconPath() {
        return DiagramAuto.I18N.getString("CreationWizard.Inheritance.Icon");
    }

    @objid ("158dab4c-df79-420a-855d-a29bc6f72469")
    @Override
    public List<CommandScope> getScopes() {
        List<CommandScope> allowedScopes = new ArrayList<>();
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Artifact.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Class.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Component.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(DataType.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Enumeration.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Interface.class), null));
        allowedScopes.add(new CommandScope(getMetamodel().getMClass(Node.class), null));
        return allowedScopes;
    }

    @objid ("44202ab8-831d-4a28-a4bd-9593718b364a")
    @Override
    public boolean accept(MObject owner) {
        if (!super.accept(owner)) {
            return false;
        }
        
        InheritanceCreator pc = new InheritanceCreator(this.mmServices);
        
        if ((owner instanceof Classifier)) {
            // Deactivate if no context is found
            if (pc.getAutoDiagramContext((Classifier) owner) == null) {
                return false;
            }
        
            AbstractDiagram existingdiagramauto = pc.getExistingAutoDiagram((Classifier) owner);
        
            // Unmodifiable diagram means the command is disabled
            if (existingdiagramauto != null && !existingdiagramauto.getStatus().isModifiable()) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}
