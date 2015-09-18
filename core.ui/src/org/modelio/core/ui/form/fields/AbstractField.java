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

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.modelio.core.ui.CoreFontRegistry;
import org.modelio.core.ui.form.models.IFormFieldData;
import org.modelio.ui.UIColor;
import org.modelio.ui.UIImages;

/**
 * An abstract implementation of IField composed of:
 * <ul>
 * <li>a Label</li>
 * <li>an edition control</li>
 * <li>a help button</li>
 * <li>a help text</li>
 * </ul>
 * <br/>
 * The composite field controls are layouted as follows:<br/>
 * [--- label ---] [-------- edition control -------- ] [---button --- ]<br/>
 * [----------- help text ------------]<br/>
 * 
 * where the help text if folded/unfolded by the help button. The class is in charge of creating the different widgets and of their
 * layout. the creation of the edition control is delegated to concrete sub-classes.
 * 
 * @author phv
 */
@objid ("e771546e-c20c-42dc-86ef-cf2d849966a2")
public abstract class AbstractField implements IField {
    @objid ("e89059e2-7871-406c-b1ae-ad4ccc4f907a")
    private static final String EMPTY_STRING = "";

    @mdl.prop
    @objid ("2c3d3988-4dfb-4c47-89e7-bb46bfe89dac")
    private boolean vertical = false;

    @mdl.propgetter
    public boolean isVertical() {
        // Automatically generated method. Please do not modify this code.
        return this.vertical;
    }

    @mdl.propsetter
    public void setVertical(boolean value) {
        // Automatically generated method. Please do not modify this code.
        this.vertical = value;
    }

    @objid ("bd5e31c1-654c-4fa4-8cc4-e66979f4f8f0")
    private Label label;

    @objid ("732dbfb6-5243-4932-9e95-a147facec791")
    private Control control;

    @objid ("a7d15915-24dc-47e7-8f19-5c91e820183e")
    private ImageHyperlink helpButton;

    @objid ("3ca92812-cfdd-46ec-8967-a8fb29799755")
    private Label helpText;

    @objid ("19b12b57-7c3b-41a8-8342-45d39a01d23b")
    private Composite fieldComposite;

    @objid ("9636667f-c2e6-4b4b-8891-e210802fb4ea")
    private final Composite parent;

    @objid ("85dee6ae-c6f2-4f30-aea4-2c8ab04166e0")
    private final FormToolkit toolkit;

    @objid ("74aa2adb-717a-468c-a075-eeb1dbb64f27")
    private IFormFieldData model;

    @objid ("15d5f229-9bfc-43a5-918b-284e0b0b8634")
    public abstract Control createControl(FormToolkit tk, Composite p);

    @objid ("41915920-3451-4dc2-a35f-ad3449d1b5cd")
    public AbstractField(FormToolkit toolkit, Composite parent, IFormFieldData model) {
        this.toolkit = toolkit;
        this.parent = parent;
        this.model = model;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("f08d712b-cec9-469b-b15b-d70d4152986f")
    @Override
    public void layout(Label lbl, Control ctrl, ImageHyperlink button) {
        if (this.vertical) {
        
            // The label
            FormData formData = new FormData();
            formData.top = new FormAttachment(0, 6);
            formData.left = new FormAttachment(0);
            lbl.setLayoutData(formData);
        
            // The Help button
            formData = new FormData();
            formData.top = new FormAttachment(0, 3);
            formData.right = new FormAttachment(100, 0);
            button.setLayoutData(formData);
        
            // The Control
            formData = new FormData();
            formData.top = new FormAttachment(lbl, 0, SWT.BOTTOM);
            formData.bottom = new FormAttachment(this.helpText, 0);
            formData.left = new FormAttachment(0, 0);
            formData.right = new FormAttachment(100, 0);
            ctrl.setLayoutData(formData);
        
        } else {
            // The label
            FormData formData = new FormData();
            formData.top = new FormAttachment(this.control, 0, SWT.TOP);
            formData.bottom = new FormAttachment(this.control, 0, SWT.BOTTOM);
            formData.left = new FormAttachment(0);
            formData.right = new FormAttachment(20);
            lbl.setLayoutData(formData);
        
            // The Help button
            formData = new FormData();
            formData.top = new FormAttachment(this.control, 0, SWT.TOP);
            // formData.bottom = new FormAttachment(this.control, 0, SWT.BOTTOM);
            formData.right = new FormAttachment(100, 0);
            button.setLayoutData(formData);
        
            // The Control
            formData = new FormData();
            formData.top = new FormAttachment(0, 0);
            formData.bottom = new FormAttachment(this.helpText, 0);
            formData.left = new FormAttachment(this.label, 10);
            formData.right = new FormAttachment(this.helpButton, -2);
            ctrl.setLayoutData(formData);
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("192b7d49-cb9f-49cc-85c6-1248ec776311")
    @Override
    public final void setHelpText(String s) {
        this.helpText.setText(s);
        this.helpButton.setVisible(!s.isEmpty());
    }

    /**
     * {@inheritDoc}
     */
    @objid ("a6902641-3c19-4b27-9f9c-425445e40d62")
    @Override
    public final Composite getComposite() {
        if (this.fieldComposite == null) {
            buildGui();
        }
        return this.fieldComposite;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("820ab548-5935-4509-b02f-56c02d0140f9")
    @Override
    public Control getControl() {
        return this.control;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("67e68b9b-fc29-4eea-ad47-6d726c3893c0")
    @Override
    public IFormFieldData getModel() {
        return this.model;
    }

    @objid ("4031af75-902f-42fa-8324-027ef5a61260")
    public final Label getLabel() {
        return this.label;
    }

    @objid ("29e8373b-4841-49a7-a388-9a5c67c1adb3")
    protected Label getHelpText() {
        return this.helpText;
    }

    @objid ("3086dc10-0639-4381-8331-1df58b350c86")
    private void buildGui() {
        // The composite field is build on a Composite using a FormLayout
        this.fieldComposite = this.toolkit.createComposite(this.parent, SWT.NONE);
        final FormLayout l = new FormLayout();
        this.fieldComposite.setLayout(l);
        
        // Create the composite field controls
        this.label = this.toolkit.createLabel(this.fieldComposite, EMPTY_STRING, SWT.NONE);
        
        this.helpButton = this.toolkit.createImageHyperlink(this.fieldComposite, SWT.FLAT);
        this.helpButton.setImage(UIImages.HELP);
        // At first, hide the 'help' button
        this.helpButton.setVisible(false);
        this.helpText = this.toolkit.createLabel(this.fieldComposite, "", SWT.WRAP);
        
        final Font italicFont = CoreFontRegistry.getModifiedFont(this.helpText.getFont(), SWT.ITALIC);
        this.helpText.setFont(italicFont);
        this.helpText.setBackground(UIColor.POST_IT_BG);
        
        this.control = createControl(this.toolkit, this.fieldComposite);
        
        // Layout the composite field controls
        layout(this.label, this.control, this.helpButton);
        
        // The Help text is layouted so that it folds/unfolds just under the control (same width and X position)
        final FormData formData = new FormData(0, 0);
        formData.bottom = new FormAttachment(100);
        this.helpText.setLayoutData(formData);
        this.helpText.setVisible(false);
        
        this.helpButton.addHyperlinkListener(new HyperlinkAdapter() {
            @Override
            public void linkActivated(HyperlinkEvent e) {
                if (AbstractField.this.getHelpText().isVisible()) {
                    // Make it invisible
                    final FormData fd = new FormData(0, 0);
                    fd.bottom = new FormAttachment(100);
                    AbstractField.this.getHelpText().setLayoutData(fd);
                    AbstractField.this.getHelpText().setVisible(false);
                } else {
                    // Make it visible
                    final FormData fd = new FormData(SWT.DEFAULT, SWT.DEFAULT);
                    // fd.top = new FormAttachment(CompositeField.this.getLabel(), 1);
                    fd.bottom = new FormAttachment(100);
                    fd.left = new FormAttachment(AbstractField.this.getControl(), 0, SWT.LEFT);
                    fd.right = new FormAttachment(AbstractField.this.getControl(), 0, SWT.RIGHT);
                    AbstractField.this.getHelpText().setLayoutData(fd);
                    AbstractField.this.getHelpText().setVisible(true);
                }
                AbstractField.this.getComposite().layout(true, true);
                AbstractField.this.getComposite().pack();
                AbstractField.this.getComposite().getParent().layout(true, true);
            }
        });
        
        this.fieldComposite.layout(true, true);
        this.fieldComposite.pack();
        this.fieldComposite.getParent().layout(true, true);
    }

    @objid ("30e9adf3-c991-4cac-bd23-e09f4122095a")
    public AbstractField(FormToolkit toolkit, Composite parent) {
        this.toolkit = toolkit;
        this.parent = parent;
        this.model = null;
    }

    @objid ("ab18b6a2-3076-439b-999f-c462a38beb11")
    @Override
    public void setModel(IFormFieldData data) {
        this.model = data;
    }

    @objid ("58d4722c-b403-4e5a-a910-f1715e5b1b73")
    @Override
    public void setEditable(boolean onoff) {
        this.control.setEnabled(onoff);
        this.refresh();
    }

}
