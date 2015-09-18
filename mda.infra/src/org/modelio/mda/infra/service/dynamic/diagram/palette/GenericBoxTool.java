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
                                    

package org.modelio.mda.infra.service.dynamic.diagram.palette;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.diagram.IDiagramGraphic;
import org.modelio.api.diagram.IDiagramHandle;
import org.modelio.api.diagram.IDiagramNode;
import org.modelio.api.diagram.dg.IDiagramDG;
import org.modelio.api.diagram.tools.DefaultBoxTool;
import org.modelio.api.model.IModelingSession;
import org.modelio.api.model.ITransaction;
import org.modelio.api.model.IUmlModel;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.gproject.model.api.MTools;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("cdadbe69-1cce-45c0-a5a5-5c1cc6eac7da")
public class GenericBoxTool extends DefaultBoxTool {
    @objid ("d39e507a-01cc-470c-a911-bd038d24ebeb")
    public GenericBoxTool() {
        super();
    }

    @objid ("754e51be-a602-4c85-829e-f1c8d34bef15")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if (targetNode instanceof IDiagramDG) {
            owner = diagramHandle.getDiagram().getOrigin();
        } else {
            owner = (ModelElement) targetNode.getElement();
        }
        
        for (CommandScope aScope : getSourceScopes()) {
            if (aScope.isMatching(owner, true))
                return true;
        }
        return false;
    }

    @objid ("db3e214d-b93f-4cca-b75d-4a5ad6944889")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic graphic, final Rectangle rect) {
        IModelingSession session = Modelio.getInstance().getModelingSession();
        
        try (ITransaction tr = session.createTransaction("Create box")) {
            ModelElement parent = null;
        
            if (graphic instanceof IDiagramDG) {
                parent = diagramHandle.getDiagram().getOrigin();
            } else {
                parent = (ModelElement) graphic.getElement();
            }
        
            String metaclass = this.getParameter("metaclass");
            if (metaclass != null) {
                IUmlModel modelFactory = session.getModel();
                MObject newElement = modelFactory.createElement(metaclass);
        
                // Get dependency by name.
                MDependency dependency = parent.getMClass().getDependency(this.getParameter("relation"));
                if (dependency == null) {
                    dependency = MTools.getMetaTool().getDefaultCompositionDep(parent, newElement);
                }
        
                if (dependency != null) {
                    // Append new instance of said dependency
                    parent.mGet(dependency).add(newElement);
        
                    if (newElement instanceof ModelElement) {
                        if (this.getParameters().get("relation") != null) {
                            ((ModelElement) newElement).getExtension().add(session.getMetamodelExtensions().getStereotype(this.getParameter("relation"), newElement.getMClass()));
                        }
                        
        
                        String stereotype = this.getParameter("stereotype");
                        if (stereotype != null) {
                            Stereotype ster = null;
                            if (stereotype.contains("#")) {
                                String moduleName = stereotype.substring(0, stereotype.indexOf("#"));
                                String stereotypeName = stereotype.substring(stereotype.indexOf("#") + 1, stereotype.length());
                                ster = Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(moduleName, stereotypeName, newElement.getMClass());
                            } else {
                                ster = Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(stereotype, newElement.getMClass());
                            }
                            ((ModelElement) newElement).getExtension().add(ster);
                        }
        
                
                        String name = this.getParameter("name");
                        if (name == null) {
                            name = getLabel();
                        }
                        name = getModule().getLabel(name);
                        modelFactory.getDefaultNameService().setDefaultName((ModelElement) newElement, name);
                    }
        
                    List<IDiagramGraphic> graph = diagramHandle.unmask(newElement, rect.x, rect.y);
                    if (graph.size() > 0)
                        ((IDiagramNode) graph.get(0)).setBounds(rect);
                    diagramHandle.save();
                } else {
                    MdaInfra.LOG.error("Metamodel relation on '" + this.getParameter("metaclass)") + "' not found.");
                    newElement.delete();
                }
        
            }
        
            tr.commit();
        } catch (Exception e) {
            MdaInfra.LOG.error(e);
        }
    }

}
