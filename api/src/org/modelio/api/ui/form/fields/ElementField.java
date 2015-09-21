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

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.modelio.api.ui.form.models.IFormFieldData;
import org.modelio.api.ui.text.IElementChangeListener;
import org.modelio.api.ui.text.TextWrapperForIElement;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.ui.UIColor;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * An AbstractField sub-classes specialized to display/edit {@link Element} values.
 * 
 * Uses a {@link TextWrapperForIElement}.
 */
@objid ("43281116-3216-4c7d-b6e1-86bba80d0221")
public class ElementField extends AbstractField {
    @objid ("d63ac076-92bb-45d4-a2f0-047ceff0f892")
    private Text text;

    @objid ("ecfb58da-17b2-4400-9388-bf47f5b07836")
    private TextWrapperForIElement textElement;

    @objid ("e5c47363-5b34-4ad8-b94e-44155dbdc32a")
     ILabelProvider labelProvider = new LabelProvider();

    @objid ("3c0f47d4-a8e3-4de8-9c78-7ea5adac54d7")
    public ElementField(FormToolkit toolkit, Composite parent, IFormFieldData model) {
        super(toolkit, parent, model);
    }

    /**
     * {@inheritDoc}
     */
    @objid ("39179051-95e5-4b49-b91d-c462510cc2ad")
    @Override
    public Control createControl(FormToolkit toolkit, Composite parent) {
        List<Class<? extends MObject>> allowedMetaclasses = new ArrayList<>();
        allowedMetaclasses.add(ModelElement.class);
        
        this.textElement = new TextWrapperForIElement(parent, null, true, allowedMetaclasses);
        
        this.text = this.textElement.getTextField();
        
        toolkit.adapt(this.text, false, false);
        
        // Initialize values
        getLabel().setText(getModel().getName());
        
        this.text.setText(this.labelProvider.getText(getModel().getValue()));
        
        // this.textElement.activateCompletion(this.session);
        this.textElement.setAcceptNullValue(true);
        
        // Install Listeners
        this.textElement.addListener(new IElementChangeListener() {
        
            @Override
            public void selectedElementChanged(MObject oldElement, MObject newElement) {
                apply(newElement);
            }
        });
        return this.text;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("64ea28d3-56de-4d66-a0fd-525169360abd")
    @Override
    public void refresh() {
        this.textElement.setElement((MObject) getModel().getValue());
    }

    @objid ("15711c8d-7e9c-49c2-b491-09ade3018c4d")
    void validate() {
        final String value = this.text.getText();
        if (getModel().getType().isValidValue(value)) {
            this.text.setForeground(null);
        } else {
            this.text.setForeground(UIColor.RED);
        }
    }

    @objid ("b4493d3c-3fd6-4997-97f0-58f3b862dfea")
    void apply(MObject value) {
        if (value != null && value.isValid()) {
            getModel().setValue(value);
        } else {
            refresh();
        }
    }

}
