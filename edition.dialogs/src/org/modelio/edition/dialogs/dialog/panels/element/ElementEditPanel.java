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
                                    

package org.modelio.edition.dialogs.dialog.panels.element;

import javax.inject.Inject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.modelio.app.core.activation.IActivationService;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.app.project.core.services.IProjectService;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.property.ui.ModelPropertyPanelProvider;
import org.modelio.ui.panel.IPanelProvider;

/**
 * Edition panel for 'Element' objects
 */
@objid ("1c5bef36-f893-42bd-860a-d0af29f41bc9")
@Creatable
public class ElementEditPanel implements IPanelProvider {
    @objid ("41dd7515-cd73-491f-a187-6b1102babfc8")
    private ISelectionChangedListener browserSelectionListener;

    @objid ("0540174a-42d2-4532-9c7e-93ff953c2dce")
    @Inject
    private IProjectService projectService;

    @objid ("3cd53fc4-6064-48e2-add1-bc665c488998")
    @Inject
    private IMModelServices modelService;

// @objid("adbe7db2-ca9c-48ab-8717-148744edd97a")
// private ModelBrowserPanelProvider browserPanel;
    @objid ("752a2860-9c66-4a63-abec-95be0580c162")
    @Inject
    private IModelioPickingService pickingService;

    @objid ("1bcab80f-06fa-4b3e-9758-e06bcd8a85c2")
    @Inject
    private IActivationService activationService;

    @objid ("9bf75865-f171-4160-8a3f-4ac3e0ae266b")
    private ModelElement editedElement;

    @objid ("dbdaa92b-b2b0-4c1a-8384-14204852e4f5")
    private ModelPropertyPanelProvider propertyPanel;

    @objid ("be77f521-ba0c-418d-bd53-a3e1acde4951")
    private SashForm shform;

    @objid ("9d478f59-6f8e-4ecf-9659-ee47577c2a51")
    private ElementDescriptionPanel descriptionPanel;

    @objid ("afbda4f7-6844-47a1-a951-daf8df7093e0")
    @Override
    public void setInput(Object editedElement) {
        if (editedElement instanceof ModelElement) {
            this.editedElement = (ModelElement) editedElement;
            // List<Object> roots = new ArrayList<>();
            // roots.add(this.editedElement);
            // this.browserPanel.setLocalRoots(roots);
            // Select the root
            // this.browserPanel.getComposite().setSelection(new StructuredSelection(this.editedElement));
            this.descriptionPanel.setInput(this.editedElement);
            this.propertyPanel.setInput(this.editedElement);
        } else {
            this.editedElement = null;
            // this.browserPanel.setLocalRoots(new ArrayList<>());
        }
    }

    @objid ("8066db59-092d-4c39-a287-7bac9e842d90")
    @Override
    public Control createPanel(Composite parent) {
        this.shform = new SashForm(parent, SWT.VERTICAL);
        this.shform.setLayoutData(new GridData(GridData.FILL_BOTH));
        this.shform.setLayout(new FillLayout(SWT.VERTICAL));
        
        // Create the browser panel
        // this.browserPanel = new ModelBrowserPanelProvider();
        // this.browserPanel.create(shform);
        // this.browserSelectionListener = new ISelectionChangedListener() {
        // @Override
        // public void selectionChanged(SelectionChangedEvent event) {
        // IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        // if (selection != null && selection.size() == 1) {
        // for (Object selectedElement : selection.toList()) {
        // if (selectedElement instanceof Element) {
        // ElementEditPanel.this.propertyPanel.setInput(selectedElement);
        // return;
        // }
        // }
        // }
        // }
        // };
        // this.browserPanel.getComposite().addSelectionChangedListener(this.browserSelectionListener);
        
        // Create the property panel
        this.propertyPanel = new ModelPropertyPanelProvider();
        this.propertyPanel.activateEdition(this.projectService, this.projectService.getSession(), this.modelService,
                this.pickingService, this.activationService);
        this.propertyPanel.createPanel(this.shform);
        this.propertyPanel.disableAutoLayout();
        this.propertyPanel.setHorizontalLayout();
        
        // Create the description panel
        this.descriptionPanel = new ElementDescriptionPanel();
        this.descriptionPanel.createPanel(this.shform);
        
        // Init the view
        // shform.setWeights(new int[] { 40, 60 });
        // this.browserPanel.setInput(this.projectService.getOpenedProject());
        return this.shform;
    }

    @objid ("ff2a01a9-b951-446c-9981-cdc3dcef3928")
    @Override
    public Object getPanel() {
        return this.shform;
    }

    @objid ("44af8ee8-6136-4599-b9da-7211aca0ac8d")
    @Override
    public Object getInput() {
        return this.editedElement;
    }

    @objid ("b7064f4f-5ef7-4ae4-a7ca-a94a40f5e6bd")
    @Override
    public String getHelpTopic() {
        return null;
    }

    @objid ("01795078-3c4f-4fdf-8d7e-e81296ee37a4")
    @Override
    public boolean isRelevantFor(Object obj) {
        return obj instanceof ModelElement;
    }

    @objid ("816f9cce-007d-415d-bea5-e7b6fce825c9")
    @Override
    public void dispose() {
        // nothing to do
    }

}
