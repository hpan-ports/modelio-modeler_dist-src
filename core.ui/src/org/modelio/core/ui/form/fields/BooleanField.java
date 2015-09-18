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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.modelio.core.ui.form.models.IFormFieldData;

/**
 * An AbstractField sub-classes specialized to display/edit boolean values.
 * 
 * Uses a SWT checkbox button.
 * 
 * @author phv
 */
@objid ("9b78c44c-f040-4efa-8595-60e5417deb66")
public class BooleanField extends AbstractField {
    @objid ("f5bdd222-be98-4277-94ff-e53b3e4bba8b")
    private Button checkbox;

    @objid ("3f31d722-6c18-4f69-8088-573d8474e0b2")
    public BooleanField(FormToolkit toolkit, Composite parent, IFormFieldData model) {
        super(toolkit, parent, model);
    }

    /**
     * {@inheritDoc}
     */
    @objid ("c096fa39-aea4-4ef1-b471-32b58cced99f")
    @Override
    public Control createControl(FormToolkit toolkit, Composite parent) {
        this.checkbox = toolkit.createButton(parent, "", SWT.CHECK);
        
        // Initialize values
        getLabel().setText(getModel().getName());
        refresh();
        
        // Install Listeners
        this.checkbox.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                getModel().setValue(BooleanField.this.checkbox.getSelection());
            }
        });
        return this.checkbox;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("767f897e-dcde-4ff5-8f0f-b15ca5dab177")
    @Override
    public void refresh() {
        this.checkbox.setSelection((Boolean)getModel().getValue());
    }

}
