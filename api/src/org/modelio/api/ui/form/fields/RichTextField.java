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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.modelio.api.model.IModelingSession;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.plugin.Api;
import org.modelio.api.ui.form.models.IFormFieldData;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.ui.UIColor;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

@objid ("ba2d2660-4f87-4a9e-954d-18708239feb0")
public class RichTextField extends AbstractField {
    @objid ("59e34f1b-6bb4-4dc6-8404-a0444845e70c")
    private Label image;

    @objid ("ce181e6c-c478-4369-9e02-398a75a99df6")
    public RichTextField(FormToolkit toolkit, Composite parent, IFormFieldData model) {
        super(toolkit, parent, model);
    }

    /**
     * {@inheritDoc}
     */
    @objid ("57d2dd5e-c8f3-4460-8bbb-c9e839ea2738")
    @Override
    public Control createControl(FormToolkit toolkit, Composite parent) {
        this.image = toolkit.createLabel(parent, "");
        this.image.setToolTipText(Api.I18N.getString("RichTextField.tooltip"));
        this.image.setForeground(UIColor.NONMODIFIABLE_ELEMENT);
        
        // Initialize values
        getLabel().setText(getModel().getName());
        return this.image;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("e8d3e7c9-3729-42ca-bcac-7c962147ea2f")
    @Override
    public void refresh() {
        ExternDocument externDocument = (ExternDocument) getValue();
        Image image = externDocument != null ? Modelio.getInstance().getImageService().getUmlImage(externDocument, false) : null;
        this.image.setImage(image);
        this.image.setText(image != null ? "" : Api.I18N.getString("RichTextField.emptylabel"));
    }

    @objid ("143f8582-f600-4383-bcdd-9fc9627cb05f")
    private MObject getValue() {
        try {
            final String value = (String) getModel().getValue();
            if (value != null) {
                final MRef mRef = new MRef(value);
                IModelingSession session = Modelio.getInstance().getModelingSession();
                return session.findElementById(Metamodel.getMClass(mRef.mc), mRef.uuid.toString());
            } else {
                return null;
            }
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

}
