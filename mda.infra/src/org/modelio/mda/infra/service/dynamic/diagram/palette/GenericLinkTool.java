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
import org.modelio.api.diagram.IDiagramGraphic;
import org.modelio.api.diagram.IDiagramHandle;
import org.modelio.api.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.diagram.IDiagramLink;
import org.modelio.api.diagram.ILinkPath;
import org.modelio.api.diagram.dg.IDiagramDG;
import org.modelio.api.diagram.tools.DefaultLinkTool;
import org.modelio.api.model.IModelingSession;
import org.modelio.api.model.ITransaction;
import org.modelio.api.model.IUmlModel;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.gproject.model.api.MTools;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.experts.links.ILinkTool;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("189d9f4d-c0da-4680-b7ee-06b3e9e2ba4c")
public class GenericLinkTool extends DefaultLinkTool {
    @objid ("6c553f85-f7df-4af8-95c5-ccb10717d9ce")
    public GenericLinkTool() {
        super();
    }

    @objid ("3389a04b-a143-4ee0-bcf4-cfc1b2302a83")
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if (targetNode instanceof IDiagramDG) {
            owner = diagramHandle.getDiagram().getOrigin();
        } else {
            owner = (ModelElement) targetNode.getElement();
        }
        
        for (final CommandScope aScope : getSourceScopes()) {
            if (aScope.isMatching(owner, true)) {
                return true;
            }
        }
        return false;
    }

    @objid ("aafda059-0c7c-47e2-994c-b5bee70564fd")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic originNode, final IDiagramGraphic targetNode, final LinkRouterKind routerType, final ILinkPath path) {
        final IModelingSession session = Modelio.getInstance().getModelingSession();
        try (ITransaction tr = session.createTransaction("Create link")) {
            final ModelElement source = (ModelElement) originNode.getElement();
            final ModelElement target = (ModelElement) targetNode.getElement();
        
            final String mc = getParameter("metaclass");
        
            if (mc != null) {
        
                MObject newElement = null;
                final IUmlModel modelFactory = session.getModel();
        
                if (mc.equals("AssociationEnd")) {
                    newElement = modelFactory.createAssociation((Classifier) source, (Classifier) target, getLabel());
                } else if (mc.equals("ConnectorEnd")) {
                    newElement = modelFactory.createConnector((BindableInstance) source, (BindableInstance) target, getLabel());
                } else if (mc.equals("LinkEnd")) {
                    newElement = modelFactory.createLink((Instance) source, (Instance) target, getLabel());
                } else {
                    newElement = modelFactory.createElement(mc);
                    final ILinkTool lt = MTools.getLinkTool();
                    lt.setSource(newElement, null, source);
                    lt.setTarget(newElement, null, target);
                }
        
                if (newElement instanceof ModelElement) {
                    final String stereotype = getParameter("stereotype");
                    if (stereotype != null) {
                        Stereotype ster = null;
                        if (stereotype.contains("#")) {
                            final String moduleName = stereotype.substring(0, stereotype.indexOf("#"));
                            final String stereotypeName = stereotype.substring(stereotype.indexOf("#") + 1, stereotype.length());
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
        
                final List<IDiagramGraphic> graph = diagramHandle.unmask(newElement, 0, 0);
                final IDiagramLink link = (IDiagramLink) graph.get(0);
                link.setRouterKind(routerType);
                link.setPath(path);
                diagramHandle.save();
            }
            tr.commit();
        } catch (final Exception e) {
            MdaInfra.LOG.error(e);
        }
    }

    @objid ("b3d48044-6bfb-4622-9d3d-e8a23577e824")
    @Override
    public boolean acceptSecondElement(final IDiagramHandle diagramHandle, final IDiagramGraphic originNode, final IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if (targetNode instanceof IDiagramDG) {
            owner = diagramHandle.getDiagram().getOrigin();
        } else {
            owner = (ModelElement) targetNode.getElement();
        }
        
        for (final Object aScope : getTargetScopes()) {
            boolean result = true;
            if (aScope instanceof MClass) {
                result = result && Metamodel.getJavaInterface((MClass) aScope).isAssignableFrom(owner.getClass());
            } else if (aScope instanceof Stereotype) {
                result = result && owner.getExtension().contains(aScope);
            }
            if (result) {
                return true;
            }
        }
        return false;
    }

}
