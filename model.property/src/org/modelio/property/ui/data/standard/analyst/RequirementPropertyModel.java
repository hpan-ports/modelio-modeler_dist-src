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
                                    

package org.modelio.property.ui.data.standard.analyst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.core.ui.ktable.types.IPropertyType;
import org.modelio.core.ui.ktable.types.bool.BooleanType;
import org.modelio.core.ui.ktable.types.list.ListType;
import org.modelio.core.ui.ktable.types.scoperichtext.ScopeRichTextType;
import org.modelio.core.ui.ktable.types.text.MultilineStringType;
import org.modelio.core.ui.ktable.types.text.StringType;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.property.ui.data.standard.common.AbstractPropertyModel;

/**
 * <i>Requirement</i> data model.
 * <p>
 * This class provides the list of properties for the <i>Requirement</i>
 * metaclass.
 */
@objid ("89024a5e-81b4-4653-839f-f6fc1c9876da")
public class RequirementPropertyModel extends AbstractPropertyModel<Requirement> {
    /**
     * Properties to display for <i>Requirement</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li>for the first row the value is the table header label (usually the
     * metaclass name)
     * <li>for otheEditedElement rows the values usually match the
     * meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("7c18cec8-bf01-4ebf-8414-cc866a46f8a8")
    private List<String> properties = new ArrayList<>();

    @objid ("a655824c-5009-4ce4-9fb0-dc5079dec1ff")
    private StringType labelStringType = new StringType(false);

    @objid ("057d1021-3551-43da-81a6-08ed9234d520")
    private StringType stringType = new StringType(true);

    @objid ("c3f3dac7-6f42-4a0c-aab8-cd4c8f7e72cf")
    private BooleanType booleanType = new BooleanType();

    @objid ("e5cd9f44-998f-48c5-b34c-154f743bb96a")
    private Map<EnumeratedPropertyType, ListType> listType = new HashMap<>();

    @objid ("265b1195-95f9-4615-a7f0-420afae9e4a5")
    private IMModelServices modelService;

    /**
     * Create a new <i>Requirement</i> data model from an <i>Requirement</i>.
     * @param modelService
     */
    @objid ("e33482fc-ff17-4cc9-9824-ff4fba6f51cd")
    public RequirementPropertyModel(Requirement theEditedElement, IMModelServices modelService) {
        super(theEditedElement);
        this.modelService = modelService;
        
        this.properties.add("Requirement");
        this.properties.add("Name");
        // Get the propertySet from the containing RequirementContainer.
        PropertyTableDefinition propertySet = this.theEditedElement.getOwnerContainer().getAnalystProperties().getType();
        if (propertySet != null) {
            for (PropertyDefinition property : propertySet.getOwned()) {
                this.properties.add(property.getName());
            }
        }
        this.properties.add("Text");
    }

    /**
     * The number of columns that the properties table must display.
     * @return the number of columns
     */
    @objid ("fe06fbec-7a48-472d-a859-800de3bdd0c5")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    /**
     * The number of rows that the properties table must display.
     * @return the number of rows
     */
    @objid ("81dcb80d-38be-48b7-8fa1-e0f5e2b19994")
    @Override
    public int getRowsNumber() {
        return this.properties.size();
    }

    /**
     * Return the value that will be displayed at the specified row and column.
     * <p>
     * The first column contains the properties names.
     * @param row the row number
     * @param col the column number
     * @return the value corresponding to the row and column
     */
    @objid ("5fc9883f-4feb-4200-bbb0-13fdfcebc67a")
    @Override
    public Object getValueAt(int row, int col) {
        if (col == 0) {
            return this.properties.get(row);
        }
        
        // else
        if (col == 1) // col 1 is the property value
        {
            if (row == 0) {
                return "Value";
            }
            // else
            if (row == 1) {
                return this.theEditedElement.getName();
            }
            // else
            if (2 <= row && row < (this.properties.size() - 1)) {
                return getPropertyValue(row - 2);
            }
            // else
            if (row == (this.properties.size() - 1)) {
                return this.theEditedElement.getDefinition();
            }
            // else
            return null;
        }
        // else
        return null;
    }

    /**
     * Return the type of the element displayed at the specified row and column.
     * <p>
     * This type will be used to choose an editor and a renderer for each cell
     * of the properties table.
     * <p>
     * The first column contains the properties names.
     * @param row the row number
     * @param col the column number
     * @return the type of the element corresponding to the row and column
     */
    @objid ("6b5f3684-b78c-4514-ba60-a4c723ef2282")
    @Override
    public IPropertyType getTypeAt(int row, int col) {
        if (col == 0) {
            return this.labelStringType;
        }
        // else
        if (col == 1) // col 1 is the property value
        {
            if (row == 0) {
                return this.labelStringType;
            }
            // else
            if (row == 1) {
                return this.stringType;
            }
            // else
            if (2 <= row && row < (this.properties.size() - 1)) {
                return getPropertyType(row - 2);
            }
            // else
            if (row == (this.properties.size() - 1)) {
                return new MultilineStringType(this.theEditedElement, this.properties.get(row), true);
            }
            // else
            return null;
        }
        return null;
    }

    /**
     * Set value in the model for the specified row and column.
     * <p>
     * The first column contains the properties names.
     * @param row the row number.
     * @param col the column number.
     * @param value the value specified by the user.
     */
    @objid ("dc5ed9c2-ea4a-4dbc-b7c2-8f79112d8635")
    @Override
    public void setValueAt(int row, int col, Object value) {
        if (col == 0) {
            return;
        }
        
        // else
        if (col == 1) // col 1 is the property value
        {
            if (row == 0) {
                return; // Header cannot be modified
            }
            // else
            if (row == 1) {
                this.theEditedElement.setName(value.toString());
                return;
            }
            // else
            if (2 <= row && row < (this.properties.size() - 1)) {
                setPropertyValue(row - 2, value.toString());
                return;
            }
            // else
            if (row == (this.properties.size() - 1)) {
                this.theEditedElement.setDefinition(value.toString());
            }
            // else
            return;
        }
        // else
        return;
    }

    @objid ("679294b0-9c31-4093-a28b-3175b1d3e046")
    @Override
    public boolean isEditable(int row, int col) {
        if (col == 0) {
            return false;
        }
        return this.theEditedElement.isModifiable();
    }

    /**
     * Returns the value of the PropertyDefinition at propertyIndex. Exact PropertyDefinition to
     * search a value for is defined in the PropertyTableDefinition of the containinng
     * RequirementContainer.
     * @param propertyIndex @return
     */
    @objid ("2608e764-6013-4299-ba2f-5f5a04becefb")
    private Object getPropertyValue(int propertyIndex) {
        // Get the correct PropertyDefinition:
        PropertyDefinition property = this.theEditedElement.getOwnerContainer().getAnalystProperties().getType().getOwned().get(propertyIndex);
        boolean isBooleanProperty = (property.getType().getName().equals("Boolean")); //$NON-NLS-1$
        boolean isRichTextProperty = (property.getType().getName().equals("RichText")); //$NON-NLS-1$
        
        // If property values are defined on this Requirement
        // go through theEditedElement and look for the one corresponding
        // to this property
        AnalystPropertyTable propertyTable = this.theEditedElement.getAnalystProperties();
        if (propertyTable != null) {
            String stringValue = propertyTable.getProperty(property);
            if (stringValue != null) {
                if (isBooleanProperty) {
                    return new Boolean(stringValue);
                } else if (isRichTextProperty) {
                    String docTypeName = "requirement";
                    for (ExternDocument doc : this.theEditedElement.getDocument()) {
                        if (doc.getType() != null && doc.getType().getName().equals(docTypeName)) {
                            return doc;
                        }
                    }
                    return null;
                }
                return stringValue;
            }
        
        }
        
        // No value is already defined for this property, return the default
        // value.
        if (isBooleanProperty) 
            return new Boolean(property.getDefaultValue());
        else
            return property.getDefaultValue();
    }

    /**
     * Returns the type of the PropertyDefinition at propertyIndex. Exact PropertyDefinition to
     * search a type for is defined in the PropertyTableDefinition of the containinng
     * RequirementContainer.
     * @param propertyIndex @return
     */
    @objid ("4e9e8d6e-3a4f-4ee0-a127-ae06854d1031")
    private IPropertyType getPropertyType(int propertyIndex) {
        // Get the correct PropertyDefinition:
        PropertyDefinition property = this.theEditedElement.getOwnerContainer().getAnalystProperties().getType().getOwned().get(propertyIndex);
        org.modelio.metamodel.uml.infrastructure.properties.PropertyType propertyType = property.getType();
        if (propertyType instanceof EnumeratedPropertyType) {
            EnumeratedPropertyType enumeratedPropertyType = (EnumeratedPropertyType) propertyType;
            ListType type = this.listType.get(enumeratedPropertyType);
            if (type != null) {
                return type;
            } else {
                // Type not found yet, create it.
                List<String> values = new ArrayList<>();
                for (PropertyEnumerationLitteral enumLitteral : enumeratedPropertyType.getLitteral()) {
                    values.add(enumLitteral.getName());
                }
                type = new ListType(false, values);
                this.listType.put(enumeratedPropertyType, type);
                return type;
            }
        } else {
            // property is not an enumerated, try the known property types
            String propertyName = propertyType.getName();
            if (propertyName.equals("Boolean")) {
                return this.booleanType;
            } else if (propertyName.equals("MultiText")) {
                return new MultilineStringType(this.theEditedElement, "Text", true);
            } else if (propertyName.equals("Text") || propertyName.equals("Integer") || propertyName.equals("Real") || propertyName.equals("Date")) {
                return this.stringType;
            } else if (propertyName.equals("RichText")) {//$NON-NLS-1$
                return new ScopeRichTextType(this.theEditedElement, true);
            } else {
                // Unknown property type, treat as a text
                return this.stringType;
            }
        }
    }

    @objid ("ebb1c621-312c-4ac3-9ff2-f0b09f596783")
    private void setPropertyValue(int propertyIndex, String value) {
        // Get the correct PropertyDefinition:
        PropertyDefinition property = this.theEditedElement.getOwnerContainer().getAnalystProperties().getType().getOwned().get(propertyIndex);
        
        // If property values are defined on this Requirement
        // go through theEditedElement and look for the one corresponding
        // to this property
        AnalystPropertyTable propertyTable = this.theEditedElement.getAnalystProperties();
        if (propertyTable == null) {
            // No AnalystPropertyTable defined for this Requirement yet, create one
            propertyTable = this.modelService.getModelFactory().createAnalystPropertyTable();
            propertyTable.setType(this.theEditedElement.getOwnerContainer().getAnalystProperties().getType());
            this.theEditedElement.setAnalystProperties(propertyTable);
        }
        
        propertyTable.setProperty(property, value);
    }

}
