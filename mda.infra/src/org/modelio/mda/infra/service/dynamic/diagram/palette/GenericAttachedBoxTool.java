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
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.diagram.IDiagramGraphic;
import org.modelio.api.diagram.IDiagramHandle;
import org.modelio.api.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.diagram.IDiagramNode;
import org.modelio.api.diagram.ILinkPath;
import org.modelio.api.diagram.dg.IDiagramDG;
import org.modelio.api.diagram.tools.DefaultAttachedBoxTool;
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

@objid ("df300bf8-87a3-49f5-ab7b-ef9dfdac0fee")
public class GenericAttachedBoxTool extends DefaultAttachedBoxTool {
    @objid ("3196834c-92ad-4135-a40c-ef6bc2a6a697")
    public GenericAttachedBoxTool() {
        super();
    }

    @objid ("0ad5b665-d59e-4458-b45e-afeff602a3f3")
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

    @objid ("371030bb-e9e4-43e9-9429-252ce2dfa843")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic graphic, final LinkRouterKind routerType, final ILinkPath path, final Point point) {
        IModelingSession session = Modelio.getInstance().getModelingSession();
        try (ITransaction tr = session.createTransaction("GenericBoxCommand")) {
        
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
        
                MDependency dependency = parent.getMClass().getDependency(getParameter("relation"));
                if (dependency == null) {
                    dependency = MTools.getMetaTool().getDefaultCompositionDep(parent, newElement);
                }
        
                if (dependency != null) {
                    // Append new instance of said dependency
                    parent.mGet(dependency).add(newElement);
                }
        
                if (newElement instanceof ModelElement) {
                    String stereotype = getParameter("stereotype");
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
                    modelFactory.getDefaultNameService().setDefaultName((ModelElement) newElement,name);
                }
        
                diagramHandle.unmask(newElement, point.x, point.y);
                diagramHandle.save();
            }
        
            tr.commit();
        } catch (Exception e) {
            MdaInfra.LOG.error(e);
        }
    }

    @objid ("20dcf7c2-62f1-49f0-a814-fe16ed422d73")
    @Override
    public void actionPerformedInDiagram(final IDiagramHandle diagramHandle, final Rectangle rect) {
        IModelingSession session = Modelio.getInstance().getModelingSession();
        try (ITransaction tr = session.createTransaction("GenericBoxCommand")) {
        
            ModelElement parent = null;
            parent = diagramHandle.getDiagram().getOrigin();
        
            String metaclass = this.getParameter("metaclass");
            if (metaclass != null) {
                IUmlModel modelFactory = session.getModel();
                MObject newElement = modelFactory.createElement(metaclass, parent, getParameter("relation"));
        
                if (newElement instanceof ModelElement) {
                    if (getParameter("stereotype") != null) {
                        ((ModelElement) newElement).getExtension().add(session.getMetamodelExtensions().getStereotype(getParameter("stereotype"), newElement.getMClass()));
                    }
                    ((ModelElement) newElement).setName(getLabel());
                }
            }
        
            List<IDiagramGraphic> graph = diagramHandle.unmask(parent, rect.x, rect.y);
            if (graph.size() > 0)
                ((IDiagramNode) graph.get(0)).setBounds(rect);
            diagramHandle.save();
        
            tr.commit();
        } catch (Exception e) {
            MdaInfra.LOG.error(e);
        }
    }

}
