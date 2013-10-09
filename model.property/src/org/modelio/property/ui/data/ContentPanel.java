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
                                    

package org.modelio.property.ui.data;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.property.ui.data.extensions.ExtensionsPropertyPanel;

/**
 * This class provide the panel that display the note content, constraint
 * content and the tagged values.
 */
@objid ("8dfe6d86-c068-11e1-8c0a-002564c97630")
public class ContentPanel extends Composite {
    @objid ("8dfe6d89-c068-11e1-8c0a-002564c97630")
    private Element typedElement = null;

    @objid ("8dfe6d8c-c068-11e1-8c0a-002564c97630")
    private Object typingElement = null;

    @objid ("8dfe6d8d-c068-11e1-8c0a-002564c97630")
    private IPropertyPanel propertyPanel;

    @objid ("8dfe6d8e-c068-11e1-8c0a-002564c97630")
    public ContentPanel(SashForm sash, int style) {
        super(sash, style);
    }

    /**
     * Set the panel input.
     * @param typedElement
     * @param typingElement
     * @param modelingSession the modeling session
     * @param modelService the model services
     * @param pickingService the element picking service
     * @param activationService the element activation service
     */
    @objid ("8dfe6d93-c068-11e1-8c0a-002564c97630")
    public void setInput(IProjectService projectService, IMModelServices modelService, IModelioPickingService pickingService, IActivationService activationService, final Element typedElement, final Object typingElement) {
        // Do not refresh when elements are the same
        if (this.typedElement == typedElement && this.typingElement == typingElement) {
            this.propertyPanel.refresh();
            return;
        }
        this.typedElement = typedElement;
        this.typingElement = typingElement;
        
        // cleanup
        if (this.propertyPanel != null) {
            this.propertyPanel.stop();
            this.propertyPanel.getComposite().dispose();
        }
        
        if (typingElement instanceof Stereotype) {
            // Display a Stereotype tagged values set
            this.propertyPanel = new ExtensionsPropertyPanel(this, (ModelElement) this.typedElement);
        
            // this.propertyPanel.start(ModelProperty.getInstance().getSession());
            this.propertyPanel.setInput(projectService, modelService, pickingService, activationService, (Stereotype) typingElement);
            this.propertyPanel.refresh();
            this.layout();
        
        } else if (typingElement instanceof ModuleComponent) {
            // Display a Module tagged values set
            this.propertyPanel = new ExtensionsPropertyPanel(this, (ModelElement) this.typedElement);
            this.propertyPanel.setInput(projectService, modelService, pickingService, activationService, (ModuleComponent) typingElement);
            this.propertyPanel.refresh();
            this.layout();
        } else {
            // Display the element standard meta attributes
            this.propertyPanel = PropertyPanelFactory.createStandardPanel(this, this.typedElement);
            this.propertyPanel.start();
            this.propertyPanel.setInput(projectService, modelService, pickingService, activationService, this.typedElement);
            this.propertyPanel.refresh();
            this.layout();
        }
    }

    /**
     * @return the edited element.
     */
    @objid ("8dfe6d9b-c068-11e1-8c0a-002564c97630")
    public Element getCurrentInput() {
        return this.typedElement;
    }

}
