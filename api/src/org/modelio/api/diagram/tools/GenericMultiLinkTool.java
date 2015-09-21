/* 
 * Copyright 2013-2015 Modeliosoft
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */


package org.modelio.api.diagram.tools;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.diagram.IDiagramGraphic;
import org.modelio.api.diagram.IDiagramHandle;
import org.modelio.api.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.diagram.IDiagramLink;
import org.modelio.api.diagram.ILinkPath;
import org.modelio.api.diagram.dg.IDiagramDG;
import org.modelio.api.model.IModelingSession;
import org.modelio.api.model.ITransaction;
import org.modelio.api.model.IUmlModel;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.commands.CommandScope;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Generic n-ary diagram link creation.
 * <p>
 * This implementation handles only n-ary Association, Link and Connector.
 */
@objid ("c7dff8f3-3c32-41a7-a2af-eb49fbe34f11")
public class GenericMultiLinkTool extends DefaultMultiLinkTool {
    @objid ("292c6e69-219b-4e12-a4e7-4c0d1378aafd")
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

    @objid ("dd5fd3ed-892e-4399-ac4e-a6e381412613")
    @Override
    public void actionPerformed(IDiagramHandle diagramHandle, IDiagramGraphic lastNode, List<IDiagramGraphic> otherNodes, List<LinkRouterKind> routerKinds, List<ILinkPath> paths, Rectangle rectangle) {
        IModelingSession session = Modelio.getInstance().getModelingSession();
        String metaclass = getParameter("metaclass");
        if (metaclass != null) {
            try (ITransaction tr = session.createTransaction("Create multi link")) {
                MObject newElement = null;
                IUmlModel modelFactory = session.getModel();
        
                if (metaclass.equals("NaryAssociation")) {
                    List<Classifier> ends = new ArrayList<>();
                    ends.add((Classifier) lastNode.getElement());
                    for (IDiagramGraphic node : otherNodes) {
                        ends.add((Classifier) node.getElement());
                    }
        
                    newElement = modelFactory.createNaryAssociation(ends);
                } else if (metaclass.equals("NaryConnector")) {
                    List<BindableInstance> ends = new ArrayList<>();
                    ends.add((BindableInstance) lastNode.getElement());
                    for (IDiagramGraphic node : otherNodes) {
                        ends.add((BindableInstance) node.getElement());
                    }
        
                    newElement = modelFactory.createNaryConnector(ends);
                } else if (metaclass.equals("NaryLink")) {
                    List<Instance> ends = new ArrayList<>();
                    ends.add((Instance) lastNode.getElement());
                    for (IDiagramGraphic node : otherNodes) {
                        ends.add((Instance) node.getElement());
                    }
        
                    newElement = modelFactory.createNaryLink(ends);
                } else {
                    Modelio.getInstance().getLogService().error(getModule(), "Invalid metaclass : " + metaclass);
                }
        
                if (newElement instanceof ModelElement) {
                    if (newElement instanceof ModelElement) {
                        Stereotype ster = findStereotypeFromSpec(newElement.getMClass(), getParameter("stereotype"));
                        if (ster != null) {
                            ((ModelElement) newElement).getExtension().add(ster);
                        }
        
                        String name = getParameter("name");
                        if (name == null) {
                            name = getLabel();
                        }
                        name = getModule().getLabel(name);
                        modelFactory.getDefaultNameService().setDefaultName((ModelElement) newElement,name);
                    }
                }
        
                int i = 0;
                List<IDiagramGraphic> graph = diagramHandle.unmask(newElement, 0, 0);
                for (IDiagramGraphic iDiagramGraphic : graph) {
                    if (iDiagramGraphic instanceof IDiagramLink) {
                        IDiagramLink link = (IDiagramLink) iDiagramGraphic;
                        if (i < routerKinds.size()) {
                            link.setRouterKind(routerKinds.get(i));
                        }
                        if (i < paths.size()) {
                            link.setPath(paths.get(i));
                        }
        
                        i++;
        
                        //TODO why is this here ???
                        diagramHandle.save();
                    }
        
                }
        
                postConfigure(diagramHandle, lastNode, otherNodes, routerKinds, paths, rectangle, newElement, graph);
        
                diagramHandle.save();
                tr.commit();
        
            } catch (Exception e) {
                Modelio.getInstance().getLogService().error(getModule(), e);
            }
        }
    }

    @objid ("25fbfe41-d507-4251-a488-1a6cea4be8ff")
    @Override
    public boolean acceptAdditionalElement(IDiagramHandle diagramHandle, List<IDiagramGraphic> previousNodes, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if (targetNode instanceof IDiagramDG) {
            owner = diagramHandle.getDiagram().getOrigin();
        } else {
            owner = (ModelElement) targetNode.getElement();
        }
        
        for (CommandScope aScope : getSourceScopes()) {
            if (aScope.isMatching(owner, true)) {
                return true;
            }
        }
        return false;
    }

    @objid ("234773e2-fc2a-4140-bce1-f110f02681e6")
    @Override
    public boolean acceptLastElement(IDiagramHandle diagramHandle, List<IDiagramGraphic> otherNodes, IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if (targetNode instanceof IDiagramDG) {
            owner = diagramHandle.getDiagram().getOrigin();
        } else {
            owner = (ModelElement) targetNode.getElement();
        }
        
        for (CommandScope aScope : getTargetScopes()) {
            if (aScope.isMatching(owner, true)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Hook called once the element is created, configured, unmasked and before the transaction is committed.
     * <p>
     * Does nothing by default. Sub classes may redefine this method to make additional modifications.
     * @param diagramHandle the diagram handle
     * @param lastNode the last graphic node
     * @param otherNodes the other graphic nodes
     * @param routerKinds the router types that are currently defined to compute the path of the links.
     * @param paths the link paths deduced from the user interactions.
     * @param rectangle the rectangle of the object to create.
     * @param newElement the created link element
     * @param newGraphics the graphics relating the new element that were unmasked.
     */
    @objid ("7ff6e85c-9ea1-4103-bd50-1a29c8113f17")
    protected void postConfigure(IDiagramHandle diagramHandle, IDiagramGraphic lastNode, List<IDiagramGraphic> otherNodes, List<LinkRouterKind> routerKinds, List<ILinkPath> paths, Rectangle rectangle, MObject newElement, List<IDiagramGraphic> newGraphics) {
        // nothing by default
    }

}
