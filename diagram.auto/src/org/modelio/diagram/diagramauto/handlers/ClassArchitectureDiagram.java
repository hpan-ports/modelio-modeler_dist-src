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
import org.modelio.diagram.diagramauto.diagram.creator.ClassArchitectureCreator;
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

@objid ("84a28ca5-b3ec-47ce-8d63-717c12badb78")
public class ClassArchitectureDiagram extends AbstractHandler {
    @objid ("3a134464-6ccf-4f35-b153-8fcd773a0ebf")
    @Override
    public AbstractDiagram actionPerformed(final ModelElement diagramContext, final String diagramName, final String diagramDescription) {
        ClassArchitectureCreator csc = new ClassArchitectureCreator(this.mmServices);
        AbstractDiagram diagram = csc.createDiagram(diagramContext);
        diagram.setName(diagramName);
        try {
            diagram.putNoteContent("ModelerModule", "description", diagramDescription);
        } catch (ExtensionNotFoundException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
        return diagram;
    }

    @objid ("fb73dd7c-8894-4ec6-9d17-a6b7392b7856")
    @Override
    public String getDetails() {
        return DiagramAuto.I18N.getString("CreationWizard.ClassArchitecture.Details");
    }

    @objid ("da111e35-5771-44c2-b432-6f0e147cd5ba")
    @Override
    public String getInformation() {
        return DiagramAuto.I18N.getString("CreationWizard.ClassArchitecture.Information");
    }

    @objid ("76755e77-3942-4d36-85fd-405cdbbacdfd")
    @Override
    public String getLabel() {
        return DiagramAuto.I18N.getString("CreationWizard.ClassArchitecture.Name");
    }

    @objid ("8d97041f-dd05-469d-82ce-eb7d5fb71aaf")
    @Override
    protected String getPreviewImagePath() {
        return DiagramAuto.I18N.getString("CreationWizard.ClassArchitecture.PreviewImage");
    }

    @objid ("8039f282-ada1-4c9c-9601-99657e9cc4ff")
    @Override
    protected String getIconPath() {
        return DiagramAuto.I18N.getString("CreationWizard.ClassArchitecture.Icon");
    }

    @objid ("8a733c23-e442-4dac-91c7-e9b5d5020b37")
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

    @objid ("4669c4aa-6ac2-4e62-b232-f24bcacf0796")
    @Override
    public boolean accept(MObject owner) {
        if (!super.accept(owner)) {
            return false;
        }
        
        ClassArchitectureCreator pc = new ClassArchitectureCreator(this.mmServices);
        
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
