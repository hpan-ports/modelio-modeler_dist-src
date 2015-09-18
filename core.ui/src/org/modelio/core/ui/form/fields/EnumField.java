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
                                    

package org.modelio.core.ui.form.fields;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.modelio.core.ui.form.models.IFormFieldData;
import org.modelio.core.ui.images.BasicModelElementLabelProvider;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;

@objid ("09342fbb-43fd-43a4-ad27-3c114462f34b")
public class EnumField extends AbstractField {
    @objid ("ab68a62e-f699-4356-b24a-b4cab60b531a")
    private Combo checkbox;

    @objid ("64615bfd-97e1-4d26-9200-cefcfa94bf6e")
    private ComboViewer comboViewer;

    @objid ("1fd2fb58-27d8-46e8-8b62-83c23dd682a4")
    public EnumField(FormToolkit toolkit, Composite parent, IFormFieldData model) {
        super(toolkit, parent, model);
    }

    /**
     * {@inheritDoc}
     */
    @objid ("901616be-329b-4f12-8167-acb24ab5f800")
    @Override
    public Control createControl(FormToolkit toolkit, Composite parent) {
        this.comboViewer = new ComboViewer(parent, SWT.READ_ONLY);
        this.comboViewer.setContentProvider(new ArrayContentProvider());
        this.checkbox = this.comboViewer.getCombo();
        
        toolkit.adapt(this.comboViewer.getControl(), false, false);
        
        // Initialize values
        getLabel().setText(getModel().getName());
        
        
        this.comboViewer.setLabelProvider(new BasicModelElementLabelProvider());
        this.comboViewer.setInput(getModel().getType().getEnumeratedValues());
        
        refresh();
        
        // Install Listeners
        this.comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                final ComboViewer combo = (ComboViewer) event.getSource();
                final StructuredSelection selection = (StructuredSelection) combo.getSelection();
                if (!selection.isEmpty()) {
                    final PropertyEnumerationLitteral selectedType = (PropertyEnumerationLitteral) selection.getFirstElement();
                    // Tricky: Have to deal with multiple events for a single change. The combo listener is invoked when input
                    // is changed. The model change event is caught and processed by setting the combo input which in turn fires
                    // the combo listener This means that if the combo listener tries to change the value, it will initiate a
                    // Transaction while a model change notification is being processed, which is forbidden
                    // We fix it by comparing old and new values and ignoring the event if their are equal.
                    if (!selectedType.equals(getModel().getValue())) {
                        getModel().setValue(selectedType);
                    }
                }
            }
        });
        return this.checkbox;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("770bc6f6-e987-4b2e-a094-5f5b391938d4")
    @Override
    public void refresh() {
        final Object value = getModel().getValue();
        
        if (value != null) {
            this.comboViewer.setSelection(new StructuredSelection(value));
        }
    }

}
