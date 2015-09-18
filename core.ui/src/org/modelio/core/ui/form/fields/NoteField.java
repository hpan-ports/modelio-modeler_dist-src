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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.modelio.core.ui.form.models.NoteFieldData;
import org.modelio.edition.html.htmleditor.HtmlComposer;

@objid ("71d93465-4e97-44d8-89ff-b0bded718e10")
public class NoteField extends AbstractField {
    @objid ("0ef98d95-f2ec-4bb8-925d-c68b52bd2871")
     HtmlComposer htmlComposer = null;

    @objid ("c45d5d28-cd66-497c-b4a3-ce1ca538e44b")
     Text text = null;

    @objid ("6da853dc-3887-47dc-b1bb-e5946ff6f3b5")
    public NoteField(FormToolkit toolkit, Composite parent, NoteFieldData model) {
        super(toolkit, parent, model);
        // TODO Auto-generated constructor stub
    }

    @objid ("feba33ba-b191-4336-aa2f-838bac8831a6")
    @Override
    public void refresh() {
        final String value = this.getModel().getValueAsString();
        
        if (this.htmlComposer != null) {
            this.htmlComposer.setHtml(value);
        } else {
            final Text text = (Text) this.getControl();
            text.setText(value);
        }
    }

    @objid ("98e49d51-34b1-49e2-a988-4ba9b4f52261")
    @Override
    public Control createControl(FormToolkit toolkit, Composite parent) {
        final NoteFieldData data = (NoteFieldData) getModel();
        final String initialValue = this.getModel().getValueAsString();
        
        // The label
        getLabel().setText(getModel().getName());
        
        
        
        // The edition control
        if (data.getType().getName().equals("html")) {
            return createHtmlTextControl(toolkit, parent, initialValue);
        } else {
            return createPlainTextControl(toolkit, parent, initialValue);
        }
    }

    @objid ("19577d32-384a-414f-ad3f-b9960a381d9c")
    private Control createPlainTextControl(FormToolkit toolkit, Composite parent, String initialValue) {
        this.text = toolkit.createText(parent, "", SWT.MULTI | SWT.WRAP);
        
        // Initialize value
        this.text.setText(initialValue);
        
        // Install Listeners
        this.text.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                getModel().setValue(NoteField.this.text.getText());
            }
        });
        return this.text;
    }

    @objid ("5d24ba85-e564-4eaf-b1f9-4298c434bdfa")
    private Control createHtmlTextControl(FormToolkit toolkit, Composite parent, String initialValue) {
        this.htmlComposer = new HtmlComposer(parent, SWT.BORDER);
        toolkit.adapt(this.htmlComposer.getBrowser(), false, false);
        
        // Initialize value
        this.htmlComposer.setHtml(initialValue);
        
        // Install Listeners
        this.htmlComposer.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                getModel().setValue(NoteField.this.htmlComposer.getHtml());
            }
        });
        return this.htmlComposer.getBrowser();
    }

}
