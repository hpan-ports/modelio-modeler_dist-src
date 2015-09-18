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

import java.util.Calendar;
import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.modelio.core.ui.form.models.IFormFieldData;

/**
 * An AbstractField sub-class specialized to display/edit boolean values.
 * 
 * Uses a SWT checkbox button.
 * 
 * @author phv
 */
@objid ("5f9651fd-a413-4b1e-8371-99f95950b1e4")
public class TimeField extends AbstractField {
    @objid ("a9c151b4-26e1-48e0-a85b-b126a865274a")
    private DateTime time;

    @objid ("ca0ef449-be9f-487a-88fd-1937723fdcde")
    private Button nullCheckBox;

    @objid ("4d0ad274-f19c-4f25-a20e-fe1299c7e8ed")
    public TimeField(FormToolkit toolkit, Composite parent, IFormFieldData model) {
        super(toolkit, parent, model);
    }

    /**
     * {@inheritDoc}
     */
    @objid ("45c26f96-3149-4710-8f69-638dc845d4fb")
    @Override
    public Control createControl(FormToolkit toolkit, Composite parent) {
        final Composite c = new Composite(parent, SWT.NONE);
        final GridLayout l = new GridLayout(2, false);
        l.marginHeight = 0;
        l.marginWidth = 0;
        c.setLayout(l);
        
        this.nullCheckBox = new Button(c, SWT.CHECK);
        toolkit.adapt(this.nullCheckBox, false, false);
        
        this.time = new DateTime(c, SWT.TIME);
        this.time.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        toolkit.adapt(this.time, false, false);
        
        // Initialize values
        getLabel().setText(getModel().getName());
        
        refresh();
        
        // Install Listeners
        this.nullCheckBox.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                apply();
            }
        });
        
        this.time.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                apply();
            }
        });
        return c;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("377ab9e6-3d36-4e8d-959c-aac79f1b5d1d")
    @Override
    public void refresh() {
        final Calendar c = Calendar.getInstance();
        final Date d = (Date)getModel().getValue();
        if (d != null) {
            c.setTime((Date) getModel().getValue());
            this.time.setDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
            this.time.setHours(c.get(Calendar.HOUR_OF_DAY));
            this.time.setMinutes(Calendar.MINUTE);
            this.time.setSeconds(Calendar.SECOND);
            this.nullCheckBox.setSelection(true);
        } else {
            this.nullCheckBox.setSelection(false);
            this.time.setVisible(false);
        }
    }

    @objid ("eef7f6c7-6f94-4fa3-897d-50a689f1f86c")
    void apply() {
        if (this.nullCheckBox.getSelection()) {
            final Calendar c = Calendar.getInstance();
            c.set(this.time.getYear(), this.time.getMonth(), this.time.getDay());
            getModel().setValue(c.getTime());
        } else {
            getModel().setValue(null);
        }
        this.time.setVisible(this.nullCheckBox.getSelection());
    }

}
