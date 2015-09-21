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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.modelio.api.ui.form.models.NoteFieldData;
import org.modelio.ui.htmleditor.HtmlComposer;

@objid ("1048e004-2a4d-4261-88a6-c6f48381069a")
public class NoteField extends AbstractField {
    @objid ("bf969ef9-85b6-4fbf-bc93-a0b03a0e964a")
     Text text = null;

    @objid ("b222cf20-ee1a-46f6-bb62-b945df26d609")
     HtmlComposer htmlComposer = null;

    @objid ("e566485e-d8c9-4e17-94d6-430fb6afa4a0")
    public NoteField(FormToolkit toolkit, Composite parent, NoteFieldData model) {
        super(toolkit, parent, model);
        // TODO Auto-generated constructor stub
    }

    @objid ("d698eb8a-1ff8-4281-b419-d6a8fffc1dc5")
    @Override
    public void refresh() {
        final String value = (String) this.getModel().getValue();
        
        if (this.htmlComposer != null) {
            this.htmlComposer.setHtml(value);
        } else {
            final Text text = (Text) this.getControl();
            text.setText(value);
        }
    }

    @objid ("16c1870e-4ca6-44ab-b64b-9366ce9d2eb4")
    @Override
    public Control createControl(FormToolkit toolkit, Composite parent) {
        final NoteFieldData data = (NoteFieldData) getModel();
        final String initialValue = (String) this.getModel().getValue();
        
        // The label
        getLabel().setText(getModel().getName());
        
        // The edition control
        if (data.getType().getName().equals("html")) {
            return createHtmlTextControl(toolkit, parent, initialValue);
        } else {
            return createPlainTextControl(toolkit, parent, initialValue);
        }
    }

    @objid ("397b527b-a74d-4906-9d5c-9299181a3955")
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

    @objid ("e3503075-f859-4d93-9816-df90727bd409")
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
