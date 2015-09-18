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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.modelio.core.ui.form.models.IFormFieldData;

/**
 * Represents a field in an edition form.<br/>
 * A field is composed of:
 * <ul>
 * <li>a label - informative</li>
 * <li>a control - where edition takes place</li>
 * <li>a help button - bound to a configurable help text</li>
 * </ul>
 * 
 * @author phv
 */
@objid ("8d63c5ba-d4e4-49c4-8b54-22d7daa7d38c")
public interface IField {
    /**
     * Layouts the label, edition control and help button in their container ({@link IField#getComposite()})
     * 
     * This method can be redefined by subclasses who need to change the standard layout for label, control and help button.<br/>
     * When it is called default LayoutData have already been applied to the widgets so that this method can typically either modify
     * or replace the existing LayoutData of the widgets.
     * 
     * The container layout is a FormLayout, therefore widget LayoutData must be FormData.
     * 
     * Note the the helpText will always be layouted so that it appears under the control (same width and X position).
     * @param label
     * @param control
     * @param helpButton
     */
    @objid ("c690e89d-e335-48ba-9a56-4d88a3ca9c9b")
    void layout(Label label, Control control, ImageHyperlink helpButton);

    /**
     * Set the text to be displayed in the help field of the control.
     * @param s
     */
    @objid ("a3a0b787-d5ee-492b-9c68-d439c2d7c9e0")
    void setHelpText(String s);

    /**
     * Gets the top most container control of the field which must be a <code>Composite</code>.
     * @return
     */
    @objid ("d58d8d18-59ea-406c-8a5f-be7bf034334f")
    Composite getComposite();

    /**
     * Gets the control in charge of displaying/editing the field value.
     * @return
     */
    @objid ("1959e8ad-1b81-4eda-b23d-abe15ffd3287")
    Control getControl();

    /**
     * Gets the IfieldData model of this field.
     * @return
     */
    @objid ("5212fcfa-de3e-4293-a90a-4c841ee26770")
    IFormFieldData getModel();

    /**
     * Refresh the value displayed by the field. The field will typically query its IFiledData model and refresh its contents.
     */
    @objid ("675e76e3-eb31-4fe3-b0ff-98a126afbf96")
    void refresh();

    @objid ("4d6b6dda-a4c9-4fd1-bc79-a0880e92495f")
    void setModel(IFormFieldData data);

    @objid ("77fc96c9-e448-4eb7-aab2-3f4e20469814")
    void setEditable(boolean onoff);

}
