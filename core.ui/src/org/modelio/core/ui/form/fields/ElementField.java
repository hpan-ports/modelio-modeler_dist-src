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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.modelio.core.ui.form.models.IFormFieldData;
import org.modelio.core.ui.textelement.ITextElementSelectionListener;
import org.modelio.core.ui.textelement.TextElement;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.ui.UIColor;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("f09447e8-1185-4ce3-b7ed-ad94bbd5ba47")
public class ElementField extends AbstractField {
    @objid ("300dbfb5-b98d-4d7c-91cd-dabb1a918ca3")
    private Text text;

    @objid ("df94a8e1-2eb5-4019-b31e-9ff414c0c91f")
    private TextElement textElement;

    @objid ("a6bfee90-086b-49ae-af06-4d1ed4d3fc50")
    private final ICoreSession session;

    @objid ("bcbf6fdc-8d3b-4c88-89a0-2c429fa01d8e")
    public ElementField(FormToolkit toolkit, Composite parent, IFormFieldData model, ICoreSession session) {
        super(toolkit, parent, model);
        this.session = session;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("f15aa2ab-6d45-4707-8523-8850328b9e5c")
    @Override
    public Control createControl(FormToolkit toolkit, Composite parent) {
        this.textElement = new TextElement(parent, SWT.NONE);
        
        this.text = this.textElement.getTextControl();
        
        toolkit.adapt(this.text, false, false);
        
        // Initialize values
        getLabel().setText(getModel().getName());
        this.text.setText(getModel().getValueAsString());
        
        
        this.textElement.activateCompletion(this.session);
        this.textElement.setAcceptNullValue(true);
        this.textElement.getAcceptedMetaclasses().add(Metamodel.getMClass(ModelElement.class));
        
        // Install Listeners
        this.textElement.addListener(new ITextElementSelectionListener() {
            @Override
            public void selectedElementChanged(MObject oldElement, MObject newElement) {
                apply();
            }
        });
        
        // this.text.addKeyListener(new KeyAdapter() {
        // @Override
        // public void keyReleased(KeyEvent e) {
        // if (e.keyCode == SWT.CR || e.keyCode == SWT.KEYPAD_CR) {
        // applyValue();
        // } else if (e.keyCode == SWT.ESC) {
        // refresh();
        // }
        // }
        // });
        //
        // this.text.addModifyListener(new ModifyListener() {
        // @Override
        // public void modifyText(ModifyEvent e) {
        // validate();
        // }
        // });
        return this.text;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("75c35051-0d79-4e7e-a5e0-7e957d4b9c10")
    @Override
    public void refresh() {
        this.textElement.setValue((MObject) getModel().getValue());
    }

    @objid ("e568bf21-b92c-4428-b1f5-7448d063df67")
    void validate() {
        final String value = this.text.getText();
        if (getModel().getType().isValidValue(value)) {
            this.text.setForeground(null);
        } else {
            this.text.setForeground(UIColor.RED);
        }
    }

    @objid ("224bcf71-2cf9-4abc-85d2-c65d4b849aa1")
    void apply() {
        final MObject value = this.textElement.getValue();
        if (value != null && value.isValid()) {
            getModel().setValue(value);
        } else {
            refresh();
        }
    }

}
