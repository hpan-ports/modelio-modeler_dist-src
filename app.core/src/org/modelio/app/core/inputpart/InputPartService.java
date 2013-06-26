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
                                    

package org.modelio.app.core.inputpart;

import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.Assert;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.descriptor.basic.MPartDescriptor;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.advanced.impl.AdvancedFactoryImpl;
import org.eclipse.e4.ui.model.application.ui.basic.MInputPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.impl.BasicFactoryImpl;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

@objid ("b9b73977-2fd8-11e2-a79f-bc305ba4815c")
public class InputPartService implements IInputPartService {
    @objid ("b9b73978-2fd8-11e2-a79f-bc305ba4815c")
    @Inject
    private MApplication application;

    @objid ("b9bbfc44-2fd8-11e2-a79f-bc305ba4815c")
    @Inject
    @Optional
    private MWindow workbenchWindow;

    @objid ("792907a4-3334-11e2-95fe-001ec947c8cc")
    @Inject
    private EPartService partService;

    @objid ("b9bbfc33-2fd8-11e2-a79f-bc305ba4815c")
    @Override
    public MInputPart createInputPart(String id) {
        MPartDescriptor descriptor = findDescriptor(id);
        return createInputPart(descriptor);
    }

    @objid ("b9bbfc39-2fd8-11e2-a79f-bc305ba4815c")
    @Override
    public MPlaceholder createSharedInputPart(String id, String inputURI) {
        MWindow sharedWindow = getWindow();
        // Do we already have the part to share?
        MInputPart sharedPart = null;
        
        // check for existing parts if necessary
        
        for (MUIElement element : sharedWindow.getSharedElements()) {
            if (element.getElementId().equals(id) && element instanceof MInputPart) {
                MInputPart part = (MInputPart) element;       
                if(part.getInputURI() != null && part.getInputURI().equals(inputURI)){
                    sharedPart = part; 
                    break;
                }   
            }
        }
        
        if (sharedPart == null) {
            MPartDescriptor descriptor = findDescriptor(id);
            sharedPart = createInputPart(descriptor);
            if (sharedPart == null) {
                return null;
            }
            sharedPart.setInputURI(inputURI);
        
            sharedWindow.getSharedElements().add(sharedPart);
        }
        return createSharedPart(sharedPart);
    }

    @objid ("b9bbfc3f-2fd8-11e2-a79f-bc305ba4815c")
    private static MPlaceholder createSharedPart(MInputPart sharedPart) {
        // Create and return a reference to the shared part
        MPlaceholder sharedPartRef = AdvancedFactoryImpl.eINSTANCE.createPlaceholder();
        sharedPartRef.setElementId(sharedPart.getElementId());
        sharedPartRef.setRef(sharedPart);
        return sharedPartRef;
    }

    @objid ("b9bbfc45-2fd8-11e2-a79f-bc305ba4815c")
    private MWindow getWindow() {
        if (this.workbenchWindow != null)
            return this.workbenchWindow;
        if (this.application.getSelectedElement() != null)
            return this.application.getSelectedElement();
        List<MWindow> windows = this.application.getChildren();
        if (windows.size() != 0)
            return windows.get(0);
        return null;
    }

    @objid ("b9bbfc49-2fd8-11e2-a79f-bc305ba4815c")
    private MPartDescriptor findDescriptor(String id) {
        for (MPartDescriptor descriptor : this.application.getDescriptors()) {
            if (descriptor.getElementId().equals(id)) {
                return descriptor;
            }
        }
        return null;
    }

    @objid ("b9bbfc4e-2fd8-11e2-a79f-bc305ba4815c")
    private static MInputPart createInputPart(MPartDescriptor descriptor) {
        if (descriptor == null) {
            return null;
        }
        
        MInputPart part = BasicFactoryImpl.eINSTANCE.createInputPart();
        part.setElementId(descriptor.getElementId());
        part.getMenus().addAll(EcoreUtil.copyAll(descriptor.getMenus()));
        if (descriptor.getToolbar() != null) {
            part.setToolbar((MToolBar) EcoreUtil.copy((EObject) descriptor.getToolbar()));
        }
        part.setContributorURI(descriptor.getContributorURI());
        part.setCloseable(descriptor.isCloseable());
        part.setContributionURI(descriptor.getContributionURI());
        part.setLabel(descriptor.getLabel());
        part.setIconURI(descriptor.getIconURI());
        part.setTooltip(descriptor.getTooltip());
        part.getHandlers().addAll(EcoreUtil.copyAll(descriptor.getHandlers()));
        part.getTags().addAll(descriptor.getTags());
        part.getBindingContexts().addAll(descriptor.getBindingContexts());
        return part;
    }

    @objid ("793755c0-3334-11e2-95fe-001ec947c8cc")
    @Override
    public MPart showInputPart(String id, String inputURI, PartState partState) {
        Assert.isNotNull(id);
        Assert.isNotNull(partState);
        
        MPart part = null;
        Collection<MInputPart> inputParts = this.partService.getInputParts(inputURI);
        for (MInputPart inputPart : inputParts) {
            if (id.equals(inputPart.getElementId())) {
                part = inputPart;
                break;
            }
        }
        if (part == null) {
            MPartDescriptor descriptor = findDescriptor(id);
            part = createInputPart(descriptor);
            if (part == null) {
                return null;
            }
            ((MInputPart)part).setInputURI(inputURI);
        }
        return this.partService.showPart(part, partState);
    }

    @objid ("303322d8-3ff6-4aac-b978-9da3bd64327e")
    @Override
    public void hideInputPart(MPart part) {
        this.partService.hidePart(part, true);
    }

}
