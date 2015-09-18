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
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.modelio.core.ui.form.models.IFormFieldData;

@objid ("b9785775-aaea-4a0a-bacf-59b1b9310b90")
public class TextField extends AbstractField {
    @objid ("3c7ca3bc-33f7-4d87-81e2-f6e989d5b489")
    private static final int VISIBLE_LINES_DEFAULT_NB = 4;

    @objid ("b218bb3e-de3e-46d7-aff7-7c55d6d775f9")
    private final int nVisibleLines;

    @objid ("831b8106-429b-4010-bf2b-f1535d6c34ce")
    private Text text;

    @objid ("f2f7dc18-7f08-4135-90e1-2186e30cdfc5")
    public TextField(FormToolkit toolkit, Composite parent, IFormFieldData model) {
        this(toolkit, parent, model, VISIBLE_LINES_DEFAULT_NB);
    }

    /**
     * {@inheritDoc}
     */
    @objid ("2a674f5e-6648-43a4-a601-b08b5fb93702")
    @Override
    public Control createControl(FormToolkit toolkit, Composite parent) {
        this.text = toolkit.createText(parent, "", SWT.MULTI | SWT.WRAP);
        this.text.addKeyListener(new KeyListener() {
        
            @Override
            public void keyReleased(KeyEvent e) {
                // Nothing to do
            }
        
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.keyCode == 'a' && e.stateMask == SWT.CTRL) {
                    TextField.this.text.selectAll();
                }
            }
        });
        
        // Initialize values
        getLabel().setText(getModel().getName());
        this.text.setText(getModel().getValueAsString());
        
        
        // Install Listeners
        this.text.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                getModel().setValue(TextField.this.text.getText());
            }
        });
        return this.text;
    }

    /**
     * {@inheritDoc}
     * 
     * Specializes the initial layout so that several lines of the text can be displayed.
     */
    @objid ("1211cb16-063b-43bf-8bab-91d240cd95e6")
    @Override
    public void layout(Label label, Control control, ImageHyperlink helpButton) {
        super.layout(label, control, helpButton);
    }

    /**
     * {@inheritDoc}
     */
    @objid ("927e3f83-52c4-49db-b387-cc965aed4272")
    @Override
    public void refresh() {
        this.text.setText(getModel().getValueAsString());
    }

    @objid ("d925f08d-0d03-4e1a-bd4d-e90c1089daf1")
    public TextField(FormToolkit toolkit, Composite parent, IFormFieldData model, int nVisibleLines) {
        super(toolkit, parent, model);
        this.nVisibleLines = nVisibleLines;
    }

}
