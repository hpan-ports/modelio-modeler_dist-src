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
                                    

package org.modelio.mda.infra.service.dynamic.diagram.wizard;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.diagram.IDiagramHandle;
import org.modelio.api.diagram.IDiagramService;
import org.modelio.api.diagram.style.IStyleHandle;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.api.ui.diagramcreation.AbstractDiagramWizardContributor;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.factory.ModelFactory;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("da1043d3-d7e1-47ea-9329-be797a702b59")
class GenericWizardContributor extends AbstractDiagramWizardContributor {
    @objid ("a0c16379-093b-4d0d-b593-6479fa75e277")
    private String style;

    @objid ("fd9739f2-1848-4702-af11-f558079146a1")
    public GenericWizardContributor() {
    }

    @objid ("80bcc6e5-5a87-4a23-959b-c01222fc4a54")
    @Override
    public boolean accept(MObject owner) {
        // Cannot accept null
        if (owner == null) {
            return false;
        }
        
        if (owner instanceof ModelElement) {
            ModelElement me = (ModelElement) owner;
            if (checkStatus(me)) {
                for (CommandScope scope : this.getScopes()) {
                    if (scope.isMatching(me, true))
                        return true;
                }
            }
        }
        return false;
    }

    @objid ("23d9d4aa-326e-4393-8468-0aa99e41446b")
    @Override
    public AbstractDiagram actionPerformed(ModelElement diagramContext, String diagramName, String diagramDescription) {
        IModelFactory modelFactory = ModelFactory.getFactory(diagramContext);
        
        String mc = this.getParameters().get("metaclass");
        String st = this.getParameters().get("stereotype");
        
        if (mc != null) {
        
            MClass metaclass = Metamodel.getMClass(mc);
            AbstractDiagram diagram = (AbstractDiagram) modelFactory.createElement(metaclass, diagramContext, diagramContext.getMClass().getDependency("Product"));
            if (st != null) {
                Stereotype stereotype = getStereotype(metaclass, st);
                if (stereotype != null)
                    diagram.getExtension().add(stereotype);
            }
        
            
            String name = getParameters().get("name");
            if(name == null){
                name = diagramName;
            }
            name = getModule().getLabel(name);
            diagram.setName(name);
        
            try {
                diagram.putNoteContent("ModelerModule", "description", diagramDescription);
            } catch (ExtensionNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        
            // Set new diagram style
            final IDiagramService diagramService = Modelio.getInstance().getDiagramService();
            final IStyleHandle styleHandle = diagramService.getStyle(this.style);
            if (styleHandle != null) {
                try (IDiagramHandle handle = diagramService.getDiagramHandle(diagram)) {
                    handle.getDiagramNode().setStyle(styleHandle);
                    handle.save();
                }
            }
            return diagram;
        }
        return null;
    }

    @objid ("1ae3d44c-25fe-47a5-ad89-87b25bbffdb7")
    private boolean checkStatus(ModelElement me) {
        if (me.getMClass().isCmsNode() && me.getStatus().isCmsManaged()) {
            return !me.getStatus().isRamc();
        } else {
            return me.isModifiable();
        }
    }

    @objid ("bf8dbb4e-e6be-44fa-b834-b9585dd018b9")
    private boolean checkStereotype(ModelElement me, Stereotype ref) {
        for (Stereotype st : me.getExtension()) {
            if (checkStereotype(st, ref))
                return true;
        }
        return false;
    }

    @objid ("d0514c5e-50dd-4cf4-9360-235c3956a05d")
    private Stereotype getStereotype(MClass metaclass, String stereotype) {
        if (stereotype.contains("#")) {
            String moduleName = stereotype.substring(0, stereotype.indexOf("#"));
            String stereotypeName = stereotype.substring(stereotype.indexOf("#") + 1, stereotype.length());
            return Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(moduleName, stereotypeName, metaclass);
        } else {
            return Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(stereotype, metaclass);
        }
    }

}
