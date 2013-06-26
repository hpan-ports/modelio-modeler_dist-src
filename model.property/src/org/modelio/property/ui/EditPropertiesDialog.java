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
                                    

package org.modelio.property.ui;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.modelio.app.core.picking.IModelioPickingService;
import org.modelio.core.ui.dialog.ModelioDialog;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.model.browser.views.treeview.ModelBrowserPanelProvider;
import org.modelio.property.plugin.ModelProperty;

/**
 * Dialog box displaying the properties of a model element, just like the Element view. Gathers the UML properties and tagged values
 * tables.
 */
@objid ("8fa7c852-c068-11e1-8c0a-002564c97630")
public class EditPropertiesDialog extends ModelioDialog {
    @objid ("8fa7c853-c068-11e1-8c0a-002564c97630")
    private Element editedElement;

    @objid ("a9732f13-8026-47a3-8457-b7c257c8ffdf")
    private static final String HELP_TOPIC = "/org.modelio.documentation.modeler/html/Modeler-_modeler_building_models_modifying_element_props.html";

    @objid ("96ee6b2e-c108-11e1-badd-002564c97630")
    public ModelPropertyPanelProvider propertyPanel;

    @objid ("86a51aca-cf24-11e1-80a9-002564c97630")
    private final GProject openedProject;

    @objid ("aa1e5a19-d004-11e1-9020-002564c97630")
    private final IMModelServices modelService;

    @objid ("04e0c3f5-d024-11e1-9020-002564c97630")
    private ModelBrowserPanelProvider browserPanel;

    @objid ("04e0c3f6-d024-11e1-9020-002564c97630")
    private ISelectionChangedListener browserSelectionListener;

    @objid ("06df0e5b-16d1-11e2-aa0d-002564c97630")
    private final IModelioPickingService pickingService;

    @objid ("8fa7c856-c068-11e1-8c0a-002564c97630")
    public EditPropertiesDialog(GProject openedProject, IMModelServices modelService, IModelioPickingService pickingService, Shell parentShell) {
        super(parentShell);
        this.openedProject = openedProject;
        this.modelService = modelService;
        this.pickingService = pickingService;
    }

    @objid ("8fa7c85a-c068-11e1-8c0a-002564c97630")
    @Override
    public Control createContentArea(final Composite parent) {
        SashForm shform = new SashForm(parent, SWT.HORIZONTAL);
        shform.setLayoutData(new GridData(GridData.FILL_BOTH));
        shform.setLayout(new FillLayout(SWT.HORIZONTAL));
        
        // Create the browser panel
        this.browserPanel = new ModelBrowserPanelProvider();
        this.browserPanel.create(shform);
        this.browserSelectionListener = new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection selection = (IStructuredSelection) event.getSelection();
                if (selection != null && selection.size() == 1) {
                    for (Object selectedElement : selection.toList()) {
                        if (selectedElement instanceof Element) {
                            EditPropertiesDialog.this.propertyPanel.setInput(selectedElement);
                            return;
                        }
                    }
                }
            }
        };
        this.browserPanel.getComposite().addSelectionChangedListener(this.browserSelectionListener);
        
        // Create the property panel
        this.propertyPanel = new ModelPropertyPanelProvider();
        this.propertyPanel.activateEdition(this.openedProject.getSession(), this.modelService, this.pickingService);
        this.propertyPanel.create(shform);
        this.propertyPanel.disableAutoLayout();
        this.propertyPanel.setHorizontalLayout();
        
        // Init the view
        shform.setWeights(new int[] { 40, 60 });
        this.browserPanel.setInput(this.openedProject);
        
        List<Object> roots = new ArrayList<>();
        roots.add(this.editedElement);
        this.browserPanel.setLocalRoots(roots);
        
        // Select the root
        this.browserPanel.getComposite().setSelection(new StructuredSelection(this.editedElement));
        return shform;
    }

    @objid ("8fa7c861-c068-11e1-8c0a-002564c97630")
    @Override
    public void init() {
        setLogoImage(null);
        // Put the messages in the banner area
        getShell().setText(ModelProperty.I18N.getString("EditPropertiesDialog.ShellTitle"));
        setTitle(ModelProperty.I18N.getString("EditPropertiesDialog.Title"));
        setMessage(this.editedElement.getClass().getSimpleName() + " \"" + this.editedElement.getName() + "\"");
        getShell().setSize(500, 400);
        getShell().setMinimumSize(500, 400);
    }

    @objid ("8fa7c864-c068-11e1-8c0a-002564c97630")
    @Override
    public void addButtonsInButtonBar(Composite parent) {
        return;
    }

    @objid ("8fa7c869-c068-11e1-8c0a-002564c97630")
    public void setEditedElement(Element editedElement) {
        this.editedElement = editedElement;
    }

    @objid ("04e0c3f9-d024-11e1-9020-002564c97630")
    @Override
    public boolean close() {
        // Remove the selection listener
        this.browserPanel.getComposite().removeSelectionChangedListener(this.browserSelectionListener);
        this.browserSelectionListener = null;
        return super.close();
    }

    @objid ("38e0e5c2-af12-4357-a084-60a0240e0685")
    @Override
    protected String getHelpId() {
        return HELP_TOPIC;
    }

}
