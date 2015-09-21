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


package org.modelio.api.ui.form.fields;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.modelio.api.ui.form.models.IFormFieldData;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("83b989a7-4af1-4ca1-8493-92689e9c9aa0")
public class EnumField extends AbstractField {
    @objid ("bcd27c2b-7154-4fb7-a36a-fa9e95133922")
    private Combo checkbox;

    @objid ("b0900e68-5fc1-4105-b1cf-47b8f9895eba")
    private ComboViewer comboViewer;

    @objid ("c6e112b9-a881-4c93-b885-dccedfd228a1")
    public EnumField(FormToolkit toolkit, Composite parent, IFormFieldData model) {
        super(toolkit, parent, model);
    }

    /**
     * {@inheritDoc}
     */
    @objid ("80443d8e-64e5-44a2-a3a6-a146e472f496")
    @Override
    public Control createControl(FormToolkit toolkit, Composite parent) {
        this.comboViewer = new ComboViewer(parent, SWT.READ_ONLY);
        this.comboViewer.setContentProvider(new ArrayContentProvider());
        this.checkbox = this.comboViewer.getCombo();
        
        toolkit.adapt(this.comboViewer.getControl(), false, false);
        
        // Initialize values
        getLabel().setText(getModel().getName());
        
        
        this.comboViewer.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return ((MObject)element).getName();
            }
        });
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
    @objid ("60834eb1-831d-42c1-ba12-bcb19ad0e1f6")
    @Override
    public void refresh() {
        final Object value = getModel().getValue();
        
        if (value != null) {
            this.comboViewer.setSelection(new StructuredSelection(value));
        }
    }

}
