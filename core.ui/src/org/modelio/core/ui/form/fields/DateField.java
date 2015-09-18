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
 * An AbstractField sub-classes specialized to display/edit date values.
 * 
 * Uses a SWT DateTime button.
 * 
 * @author phv
 */
@objid ("85fbcf2c-bf4f-4463-9e48-793046cf8bed")
public class DateField extends AbstractField {
    @objid ("936e14e9-19a7-463a-ba49-fa466ef2d0a5")
    private DateTime date;

    @objid ("c8e87da9-7ea1-40be-a891-32e2a6ff6f58")
    private Button nullCheckBox;

    @objid ("19c98eb1-20e4-4ec5-8cf6-2a49ddfef39a")
    public DateField(FormToolkit toolkit, Composite parent, IFormFieldData model) {
        super(toolkit, parent, model);
    }

    /**
     * {@inheritDoc}
     */
    @objid ("2c721799-0e84-4e66-9e21-52a9fb7def04")
    @Override
    public Control createControl(FormToolkit toolkit, Composite parent) {
        final Composite c = new Composite(parent, SWT.NONE);
        final GridLayout l = new GridLayout(2,  false);
        l.marginHeight = 0;
        l.marginWidth = 0;
        c.setLayout(l);
        
        this.nullCheckBox = new Button(c, SWT.CHECK);
        toolkit.adapt(this.nullCheckBox, false, false);
        
        this.date = new DateTime(c, SWT.DATE | SWT.DROP_DOWN);
        this.date.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        toolkit.adapt(this.date, false, false);
        
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
        
        this.date.addSelectionListener(new SelectionAdapter() {
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
    @objid ("b4b722a6-4791-463f-b390-b005fa77823c")
    @Override
    public void refresh() {
        final Calendar c = Calendar.getInstance();
        final Date d = (Date)getModel().getValue();
        if (d != null) {
            c.setTime((Date) getModel().getValue());
            this.date.setDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
            this.nullCheckBox.setSelection(true);
        } else {
            this.nullCheckBox.setSelection(false);
            this.date.setVisible(false);
        }
    }

    @objid ("ff606696-ec9e-4d7e-b697-13376912233d")
    void apply() {
        if (this.nullCheckBox.getSelection()) {
            final Calendar c = Calendar.getInstance();
            c.set(this.date.getYear(), this.date.getMonth(), this.date.getDay());
            getModel().setValue(c.getTime());
        } else {
            getModel().setValue(null);
        }
        DateField.this.date.setVisible(this.nullCheckBox.getSelection());
    }

}
