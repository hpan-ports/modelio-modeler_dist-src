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


package org.modelio.api.ui.form;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.ui.form.fields.BooleanField;
import org.modelio.api.ui.form.fields.DateField;
import org.modelio.api.ui.form.fields.ElementField;
import org.modelio.api.ui.form.fields.EnumField;
import org.modelio.api.ui.form.fields.IField;
import org.modelio.api.ui.form.fields.RichTextField;
import org.modelio.api.ui.form.fields.StringField;
import org.modelio.api.ui.form.fields.TextField;
import org.modelio.api.ui.form.fields.TimeField;
import org.modelio.api.ui.form.models.IFormFieldData;
import org.modelio.api.ui.form.models.MAttributeFieldData;
import org.modelio.api.ui.form.models.PropertyFieldData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.vcore.smkernel.mapi.MAttribute;

@objid ("1a17e670-2bb1-4e93-8d26-49d6d852e4f1")
public abstract class AbstractFieldFactory implements IFieldFactory {
    /**
     * Build a fully generic implementation including:
     * <ul>
     * <li>the element's name</li>
     * <li>every PropertyTableDefinition defined by its stereotypes</li>
     * </ul>
     */
    @objid ("d717c366-8419-4184-9f01-65a6639987e7")
    public List<IField> createGenericFields(FormToolkit toolkit, Composite parent, ModelElement input) {
        List<IField> fields = new ArrayList<>();
        
        // Name
        fields.add(createMAttributeField(toolkit, parent, input, input.getMClass().getAttribute("Name")));
        
        // Fields from all stereotypes
        for (Stereotype stereotype : input.getExtension()) {
            fields.addAll(createFormFields(toolkit, parent, input, stereotype));
        }
        return fields;
    }

    /**
     * Create a form field from a specific {@link PropertyDefinition}.
     * @param parent a widget which will be the parent of the new field instance (cannot be null)
     * @param input the element to build the form field for.
     */
    @objid ("e081e8e6-51ca-489f-bc51-9a2122b8df4c")
    public IField createFormField(FormToolkit toolkit, Composite parent, ModelElement input, PropertyDefinition pdef) {
        IField field;
        PropertyType type = pdef.getType();
        
        IFormFieldData model = new PropertyFieldData(input, pdef);
        
        final GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, false);
        layoutData.widthHint = 600;
        switch (type.getBaseType()) {
        case TEXT:
        
            if (type.getName().equals("MultiText")) {
                field = new TextField(toolkit, parent, model, 6);
                Font defaultFont = field.getComposite().getFont();
                layoutData.heightHint = defaultFont.getFontData()[0].getHeight() * 6 + 2;
            } else {
                field = new TextField(toolkit, parent, model, 1);
            }
        
            Composite cText = field.getComposite();
            cText.setLayoutData(layoutData);
            break;
        case ENUMERATE:
            field = new EnumField(toolkit, parent, model);
            Composite cEnum = field.getComposite();
            cEnum.setLayoutData(layoutData);
            break;
        case BOOLEAN:
            field = new BooleanField(toolkit, parent, model);
            Composite cBool = field.getComposite();
            cBool.setLayoutData(layoutData);
            break;
        case DATE:
            field = new DateField(toolkit, parent, model);
            Composite cDate = field.getComposite();
            cDate.setLayoutData(layoutData);
            break;
        case TIME:
            field = new TimeField(toolkit, parent, model);
            Composite cTime = field.getComposite();
            cTime.setLayoutData(layoutData);
            break;
        case ELEMENT:
            field = new ElementField(toolkit, parent, model);
            Composite cElement = field.getComposite();
            cElement.setLayoutData(layoutData);
            break;
        case RICHTEXT:
            field = new RichTextField(toolkit, parent, model);
            Composite cRichText = field.getComposite();
            cRichText.setLayoutData(layoutData);
            break;
        case FLOAT:
        case INTEGER:
        case STRING:
        case UNSIGNED:
        default:
            field = new StringField(toolkit, parent, model);
            Composite c = field.getComposite();
            c.setLayoutData(layoutData);
            break;
        }
        
        // If the property definition has a description put it as help
        String desc = Modelio.getInstance().getModelingSession().getMetamodelExtensions().getDescription(pdef);
        if (desc != null) {
            field.setHelpText(desc);
        }
        return field;
    }

    /**
     * Create a form field from a specific {@link Stereotype}.
     * @param parent a widget which will be the parent of the new field instance (cannot be null)
     * @param input the element to build the form field for.
     */
    @objid ("09986b9c-41c2-48d1-9837-37984d546d85")
    public List<IField> createFormFields(FormToolkit toolkit, Composite parent, ModelElement input, Stereotype stereotype) {
        List<IField> fields = new ArrayList<>();
        
        PropertyTableDefinition ptype = stereotype.getDefinedTable();
        if (ptype != null) {
            for (PropertyDefinition pdef : ptype.getOwned()) {
                fields.add(createFormField(toolkit, parent, input, pdef));
            }
        }
        
        Stereotype parentStereotype = stereotype.getParent();
        if (parentStereotype != null) {
            fields.addAll(createFormFields(toolkit, parent, input, parentStereotype));
        }
        return fields;
    }

    /**
     * Create a form field from a specific {@link MAttribute}.
     * @param parent a widget which will be the parent of the new field instance (cannot be null)
     * @param input the element to build the form field for.
     */
    @objid ("c039db35-5e3b-4e30-9299-b27371d50965")
    public IField createMAttributeField(FormToolkit toolkit, Composite parent, ModelElement input, MAttribute mAtt) {
        IFormFieldData nameModel = new MAttributeFieldData(input, mAtt);
        
        Class<?> attType = mAtt.getType();
        if (attType == UUID.class) {
            // FIXME
        } else if (attType == String.class) {
            IField stringField = new StringField(toolkit, parent, nameModel);
            final GridData ld_name = new GridData(SWT.FILL, SWT.CENTER, true, false);
            ld_name.widthHint = 600;
            stringField.getComposite().setLayoutData(ld_name);
            return stringField;
        } else if (attType == Integer.class) {
            // FIXME
        } else if (attType == Long.class) {
            // FIXME
        } else if (attType == Float.class) {
            // FIXME
        } else if (attType == Double.class) {
            // FIXME
        } else if (attType == Boolean.class) {
            IField booleanField = new BooleanField(toolkit, parent, nameModel);
            final GridData ld_name = new GridData(SWT.FILL, SWT.CENTER, true, false);
            ld_name.widthHint = 600;
            booleanField.getComposite().setLayoutData(ld_name);
            return booleanField;
        } else if (attType.isEnum()) {
            IField enumField = new EnumField(toolkit, parent, nameModel);
            final GridData ld_name = new GridData(SWT.FILL, SWT.CENTER, true, false);
            ld_name.widthHint = 600;
            enumField.getComposite().setLayoutData(ld_name);
            return enumField;
        }
        
        // Default case, return a String field
        IField stringField = new StringField(toolkit, parent, nameModel);
        final GridData ld_name = new GridData(SWT.FILL, SWT.CENTER, true, false);
        ld_name.widthHint = 600;
        stringField.getComposite().setLayoutData(ld_name);
        return stringField;
    }

}
