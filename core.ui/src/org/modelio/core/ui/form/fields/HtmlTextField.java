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
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.modelio.core.ui.form.models.IFormFieldData;
import org.modelio.edition.html.htmleditor.HtmlComposer;

/**
 * An AbstractField sub-class specialized to display/edit the content of a html text.
 * 
 * Uses a HtmlComposer
 * 
 * @author phv
 */
@objid ("982302b5-595b-4c2f-aaf9-8cada80e65eb")
public class HtmlTextField extends AbstractField {
    @objid ("03d31c9e-9776-436c-92c6-3181b269b994")
    private final int heightHint;

    @objid ("99df7b6a-195f-4564-be03-7d5a5a36b77d")
    private HtmlComposer text;

    /**
     * {@inheritDoc}
     */
    @objid ("8fda069c-5ec8-4984-a2e8-c60367421835")
    @Override
    public Control createControl(FormToolkit toolkit, Composite parent) {
        this.text = new HtmlComposer(parent, SWT.NONE);
        toolkit.adapt(this.text.getBrowser(), false, false);
        
        // Initialize values
        getLabel().setText(getModel().getName());
        this.text.setHtml(getModel().getValueAsString());
        
        
        // Install Listeners
        this.text.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                getModel().setValue(HtmlTextField.this.text.getHtml());
            }
        });
        
        
        //debug
        System.out.println("HtmlTextField.createControl() " + this.text.isInitialized());
        return this.text.getBrowser();
    }

    /**
     * {@inheritDoc}
     * 
     * Specializes the initial layout so that several lines of the text can be displayed.
     */
    @objid ("38e1dd38-af11-4183-a23e-fd34ab98cbef")
    @Override
    public void layout(Label label, Control control, ImageHyperlink helpButton) {
        super.layout(label, control, helpButton);
        if (this.heightHint > 0) {
            ((FormData) control.getLayoutData()).height = this.heightHint;
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("acac9b80-577e-4f5a-a545-c7700839411e")
    @Override
    public void refresh() {
        this.text.setHtml(getModel().getValueAsString());
    }

    @objid ("276d8668-dc91-432a-80eb-57b37559c2df")
    public HtmlTextField(FormToolkit toolkit, Composite parent, IFormFieldData model) {
        this(toolkit, parent, model, -1);
    }

    @objid ("1c5ba95e-7261-47c3-a982-e5da72275c8e")
    public HtmlTextField(FormToolkit toolkit, Composite parent, IFormFieldData model, int heightHint) {
        super(toolkit, parent, model);
        this.heightHint = heightHint;
    }

}
