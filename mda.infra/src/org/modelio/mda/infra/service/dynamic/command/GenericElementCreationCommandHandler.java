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
                                    

package org.modelio.mda.infra.service.dynamic.command;

import java.util.HashMap;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.model.IMetamodelExtensions;
import org.modelio.api.model.ITransaction;
import org.modelio.api.model.IUmlModel;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.IModule;
import org.modelio.api.module.commands.DefaultModuleCommandHandler;
import org.modelio.gproject.model.ElementConfigurator;
import org.modelio.gproject.model.api.MTools;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.factory.ModelFactory;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("1b94e3af-0e03-11e2-baba-001ec947c8cc")
public class GenericElementCreationCommandHandler extends DefaultModuleCommandHandler {
    @objid ("9ffe4457-7740-4f79-90e4-78bc901cbbb4")
    private String name;

    @objid ("9f2d16fb-11a8-42c6-8a30-180a287d824d")
    private String metaclass;

    @objid ("0848bfbe-2ca0-4aac-b2df-c62605fea89d")
    private String stereotype;

    @objid ("1b21770c-ed8a-4642-b2d8-cf9dfb3c51d4")
    private String relation;

    @objid ("a93e0001-2d2a-49e7-b274-37e1add6fdb7")
    public GenericElementCreationCommandHandler(final String name, final String metaclass, final String stereotype, final String relation) {
        this.name = name;
        this.metaclass = metaclass;
        this.stereotype = stereotype;
        this.relation = relation == null ? "" : relation;
    }

    @objid ("eb1d0f60-bd1f-479b-ad33-d44900eb029e")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule mdac) {
        try (ITransaction tr = Modelio.getInstance().getModelingSession().createTransaction("Create <<" + this.stereotype + ">> " + this.metaclass)) {
        
            // Create new instance of the element
            IUmlModel modelFactory = Modelio.getInstance().getModelingSession().getModel();
            Element newElement = modelFactory.createElement(this.metaclass);
        
            // Put new instance "under" its parent.
            ModelElement parent = (ModelElement) selectedElements.get(0);
            if (newElement instanceof AbstractDiagram) {
                ((AbstractDiagram) newElement).setOrigin(parent);
                // Apply stereotype (if any).
                if (this.stereotype != null) {
                    Stereotype ster = null;
                    if (stereotype.contains("#")) {
                        String moduleName = stereotype.substring(0, stereotype.indexOf("#"));
                        String stereotypeName = stereotype.substring(stereotype.indexOf("#") + 1, stereotype.length());
                        ster = Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(moduleName, stereotypeName, newElement.getMClass());
                    } else {
                        ster = Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(stereotype, newElement.getMClass());
                    }
        
                    if(ster != null){
                        ((ModelElement) newElement).getExtension().add(ster);
                    }
                }
                
                modelFactory.getDefaultNameService().setDefaultName((ModelElement) newElement, mdac.getLabel(this.name));
        
                postConfigureElement(newElement, mdac);
            } else {
                // Get dependency by name.
                MDependency dependency = parent.getMClass().getDependency(this.relation);
                if (dependency == null) {
                    dependency = MTools.getMetaTool().getDefaultCompositionDep(parent, newElement);
                }
                if (dependency != null) {
                    // Append new instance of said dependency
                    parent.mGet(dependency).add(newElement);
        
                    if (this.stereotype != null) {
                        Stereotype ster = null;
                        if (stereotype.contains("#")) {
                            String moduleName = stereotype.substring(0, stereotype.indexOf("#"));
                            String stereotypeName = stereotype.substring(stereotype.indexOf("#") + 1, stereotype.length());
                            ster = Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(moduleName, stereotypeName, newElement.getMClass());
                        } else {
                            ster = Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(stereotype, newElement.getMClass());
                        }
        
                        if(ster != null){
                            ((ModelElement) newElement).getExtension().add(ster);
                        }
                    }
                    
                    modelFactory.getDefaultNameService().setDefaultName((ModelElement) newElement, mdac.getLabel(this.name));
        
                    new ElementConfigurator().configure(ModelFactory.getFactory(newElement), newElement, new HashMap<String, Object>());
        
                    postConfigureElement(newElement, mdac);
                } else {
                    newElement.delete();
                }
            }
        
            tr.commit();
        }
    }

    @objid ("4161d8db-de05-4aa4-88de-ff5ce1cbbdf7")
    @Override
    public boolean accept(List<MObject> selectedElements, IModule module) {
        if (!super.accept(selectedElements, module)) {
            return false;
        }
        return selectedElements.size() > 0;
    }

    @objid ("74bd3a00-9f9d-4f25-b134-daa0d4250e40")
    protected void postConfigureElement(Element newElement, IModule mdac) {
        // Nothing to do
    }

}
