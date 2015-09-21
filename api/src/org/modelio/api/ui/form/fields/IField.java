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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.modelio.api.ui.form.models.IFormFieldData;

/**
 * Represents a field in an edition form.<br/>
 * A field is composed of:
 * <ul>
 * <li>a label - informative</li>
 * <li>a control - where edition takes place</li>
 * <li>a help button - bound to a configurable help text</li>
 * </ul>
 */
@objid ("d8d8870e-fee4-4c7e-9751-3affdd89ce02")
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
    @objid ("4a481815-1aa6-4873-83bb-e4ca7baaa2d3")
    void layout(Label label, Control control, ImageHyperlink helpButton);

    /**
     * Gets the top most container control of the field which must be a <code>Composite</code>.
     * @return
     */
    @objid ("44a81dcb-891f-43da-ac04-6fc0bb8348ed")
    Composite getComposite();

    /**
     * Gets the control in charge of displaying/editing the field value.
     * @return
     */
    @objid ("d39e4710-d50f-451d-a698-fc8b640a417c")
    Control getControl();

    /**
     * Set the text to be displayed in the help field of the control.
     * @param s
     */
    @objid ("47c62fea-7034-431d-a9de-f88c28ae1d90")
    void setHelpText(String s);

    /**
     * Refresh the value displayed by the field. The field will typically query its IFiledData model and refresh its contents.
     */
    @objid ("69e8d634-07fe-4e1f-9227-3d3af8663114")
    void refresh();

    @objid ("87ed2f4f-d1b7-4c8c-91f4-08afce29c8b1")
    void setEditable(boolean onoff);

    /**
     * Gets the IfieldData model of this field.
     * @return
     */
    @objid ("29c0cfaf-642c-4914-a511-aa2597280a6a")
    IFormFieldData getModel();

    @objid ("70a9c4c0-736b-4aeb-8f63-439becf48f08")
    void setModel(IFormFieldData data);

}
