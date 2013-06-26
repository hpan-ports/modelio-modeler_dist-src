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
                                    

package org.modelio.diagram.editor.context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.services.IServiceLocator;
import org.modelio.core.ui.images.ElementImageService;
import org.modelio.diagram.editor.plugin.DiagramEditor;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("36e43e0a-2f7d-4da9-92a4-3411cc6959c0")
public class RelatedDiagramsDynamicContribution extends CompoundContributionItem {
    @objid ("7d5dd7ac-50c1-4658-99bd-f06b1e46c68f")
    @Inject
    protected ISelection selection;

    @objid ("1ee118be-45c7-4b8b-a89e-a3e8c0d03c34")
    @Override
    protected IContributionItem[] getContributionItems() {
        List<MObject> selectedElements = this.getSelectedElements();
        
        // if no selected element or if multiple elements => no creation
        if (selectedElements.size() != 1)
            return new IContributionItem[0];
        
        // process
        MObject selectedElement = selectedElements.get(0);        
        
        // for a diagram use the context
        if (selectedElement instanceof AbstractDiagram) {
            selectedElement = ((AbstractDiagram) selectedElement).getOrigin();
            if (selectedElement == null)
                return new IContributionItem[0];        
        }
        
        if (!(selectedElement instanceof ModelElement)) {
            return new IContributionItem[0];
        }
        
        final ModelElement currentModelElement = (ModelElement) selectedElement;
        
        final EList<Dependency> dependencies = currentModelElement.getDependsOnDependency();
        final List<AbstractDiagram> relatedDiagrams = new ArrayList<>();
        
        for (final Dependency dependency : dependencies) {
            if (dependency.isStereotyped("ModelerModule", "related_diagram")) {
                final ModelElement relatedElement = dependency.getDependsOn();
                if (relatedElement instanceof AbstractDiagram) {
                    relatedDiagrams.add((AbstractDiagram) relatedElement);
                }
            }
        }
        
        if (relatedDiagrams.size() > 0) {
            List<IContributionItem> listTop = new ArrayList<>();
            MenuManager submenu = new MenuManager(DiagramEditor.I18N.getString("related_diagram"), 
                    AbstractUIPlugin.imageDescriptorFromPlugin(DiagramEditor.PLUGIN_ID, "icons/uml.png"), 
                    "com.modeliosoft.modelio.diagram.editor.related_diagrams");
            IContributionItem dynamicitem = new CompoundContributionItem("related_diagrams.items") {
        
                @Override
                protected IContributionItem[] getContributionItems() {
                    List<IContributionItem> list = new ArrayList<>();
                    IServiceLocator serviceLocator = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                    //Manage the commands
                    for (final AbstractDiagram relatedDiagram : relatedDiagrams) {
                        String commandId = "com.modeliosoft.modelio.OpenRelatedDiagramCommand";                
                        Map<String, AbstractDiagram> params = new HashMap<>();
                        params.put("related_diagram", relatedDiagram);
                        final ImageDescriptor iDesc = ImageDescriptor.createFromImage(ElementImageService.getImage(relatedDiagram));
                        String label = relatedDiagram.getName();
                        CommandContributionItemParameter parameters = new CommandContributionItemParameter(serviceLocator,
                                commandId,
                                commandId,
                                params,
                                iDesc,
                                null,
                                null,
                                label,
                                null,
                                label,
                                CommandContributionItem.STYLE_PUSH,
                                null,
                                false);
                        CommandContributionItem cci = new CommandContributionItem(parameters);
                        list.add(cci);
                    }
                    return list.toArray(new IContributionItem[list.size()]);
        
                }
            };
            submenu.add(dynamicitem);            
            listTop.add(submenu);
        
            Separator separator = new Separator("related_diagrams.separator");
            listTop.add(separator);
            return listTop.toArray(new IContributionItem[listTop.size()]);
        
        }
        return new IContributionItem[0];
    }

    @objid ("d445205a-c020-43a5-aa95-3fb6bfbf8748")
    private List<MObject> getSelectedElements() {
        List<MObject> selectedElements = new ArrayList<>();
        if (this.selection instanceof IStructuredSelection) {
            for (Object selectedObject : ((IStructuredSelection) this.selection).toList()) {
                if (selectedObject instanceof IAdaptable) {
                    MObject element = (MObject) ((IAdaptable) selectedObject).getAdapter(MObject.class);
                    if (element != null)
                        selectedElements.add(element);
                }
            }
        }
        return selectedElements;
    }

}
