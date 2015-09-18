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
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.modelio.core.ui.form.models.IFormFieldData;
import org.modelio.ui.UIColor;

@objid ("b0508fc2-93bc-4755-abfb-323308e22f35")
public class StringField extends AbstractField {
    @objid ("b0311ae7-4ff2-4105-9494-eedbdc2ac318")
    private Text text;

    @objid ("e3256275-626f-4894-aea5-f199aa3b9027")
    public StringField(FormToolkit toolkit, Composite parent, IFormFieldData model) {
        super(toolkit, parent, model);
    }

    /**
     * {@inheritDoc}
     */
    @objid ("41901bfc-2d90-4d5d-83da-3a1b8dbc8429")
    @Override
    public Control createControl(FormToolkit toolkit, Composite parent) {
        this.text = toolkit.createText(parent, "", SWT.NONE);
        
        // Initialize values
        getLabel().setText(getModel().getName());
        this.text.setText(getModel().getValueAsString());
        
        
        // Install Listeners
        this.text.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                applyValue();
            }
        });
        
        this.text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.keyCode == SWT.CR || e.keyCode == SWT.KEYPAD_CR) {
                    applyValue();
                } else if (e.keyCode == SWT.ESC) {
                    refresh();
                }
            }
        });
        
        this.text.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                validate();
            }
        });
        return this.text;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("f2ad006a-82ea-42d0-b790-295491f38d45")
    @Override
    public void refresh() {
        this.text.setText(getModel().getValueAsString());
    }

    @objid ("b793ba38-6c5a-4e18-a872-2b0cbc96a384")
    void validate() {
        final String value = this.text.getText();
        if (getModel().getType().isValidValue(value)) {
            this.text.setForeground(null);
        } else {
            this.text.setForeground(UIColor.RED);
        }
    }

    @objid ("aecbd947-a742-4016-b7fb-00c2fb117dc9")
    void applyValue() {
        final String value = this.text.getText();
        if (getModel().getType().isValidValue(value)) {
            getModel().setValue(value);
        } else {
            refresh();
        }
    }

}
