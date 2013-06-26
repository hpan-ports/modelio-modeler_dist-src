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
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.property.ui.data.standard.common.AbstractPropertyModel;

/**
 * <i>Goal</i> data model.
 * <p>
 * This class provides the list of properties for the <i>Goal</i>
 * metaclass.
 */
@objid ("8f75cb63-c068-11e1-8c0a-002564c97630")
public class GoalPropertyModel extends AbstractPropertyModel<Goal> {
    /**
     * Properties to display for <i>Goal</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li>for the first row the value is the table header label (usually the
     * metaclass name)
     * <li>for otheEditedElement rows the values usually match the
     * meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("a8247576-c068-11e1-8c0a-002564c97630")
    private List<String> properties = new ArrayList<>();

    @objid ("8f75cb69-c068-11e1-8c0a-002564c97630")
    private StringType labelStringType = new StringType(false);

    @objid ("8f75cb6a-c068-11e1-8c0a-002564c97630")
    private StringType stringType = new StringType(true);

    @objid ("8f75cb6b-c068-11e1-8c0a-002564c97630")
    private BooleanType booleanType = new BooleanType();

    @objid ("8f75cb6c-c068-11e1-8c0a-002564c97630")
    private Map<EnumeratedPropertyType, ListType> listType = new HashMap<>();

    @objid ("36a3e048-eaa2-11e1-94f7-002564c97630")
    private IMModelServices modelService;

    /**
     * Create a new <i>Goal</i> data model from an <i>Goal</i>.
     * @param modelService
     */
    @objid ("8f75cb76-c068-11e1-8c0a-002564c97630")
    public GoalPropertyModel(Goal theEditedElement, IMModelServices modelService) {
        super(theEditedElement);
        this.modelService = modelService;
        
        this.properties.add("Goal");
        this.properties.add("Name");
        // Get the propertySet from the containing GoalContainer.
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
    @objid ("8f75cb7c-c068-11e1-8c0a-002564c97630")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    /**
     * The number of rows that the properties table must display.
     * @return the number of rows
     */
    @objid ("8f75cb82-c068-11e1-8c0a-002564c97630")
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
    @objid ("8f75cb88-c068-11e1-8c0a-002564c97630")
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
    @objid ("8f75cb90-c068-11e1-8c0a-002564c97630")
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
    @objid ("8f75cb98-c068-11e1-8c0a-002564c97630")
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

    @objid ("8f75cba0-c068-11e1-8c0a-002564c97630")
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
     * GoalContainer.
     * @param propertyIndex @return
     */
    @objid ("8f75cba7-c068-11e1-8c0a-002564c97630")
    private Object getPropertyValue(int propertyIndex) {
        // Get the correct PropertyDefinition:
        PropertyDefinition property = this.theEditedElement.getOwnerContainer().getAnalystProperties().getType().getOwned().get(propertyIndex);
        boolean isBooleanProperty = (property.getType().getName().equals("Boolean")); //$NON-NLS-1$
        boolean isRichTextProperty = (property.getType().getName().equals("RichText")); //$NON-NLS-1$
        
        // If property values are defined on this Goal
        // go through theEditedElement and look for the one corresponding
        // to this property
        AnalystPropertyTable propertyTable = this.theEditedElement.getAnalystProperties();
        if (propertyTable != null) {
            String stringValue = propertyTable.getProperty(property);
            if (stringValue != null) {
                if (isBooleanProperty) {
                    return new Boolean(stringValue);
                } else if (isRichTextProperty) {
                    String docTypeName = "goal";
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
     * GoalContainer.
     * @param propertyIndex @return
     */
    @objid ("8f782caa-c068-11e1-8c0a-002564c97630")
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

    @objid ("8f782caf-c068-11e1-8c0a-002564c97630")
    private void setPropertyValue(int propertyIndex, String value) {
        // Get the correct PropertyDefinition:
        PropertyDefinition property = this.theEditedElement.getOwnerContainer().getAnalystProperties().getType().getOwned().get(propertyIndex);
        
        // If property values are defined on this Goal
        // go through theEditedElement and look for the one corresponding
        // to this property
        AnalystPropertyTable propertyTable = this.theEditedElement.getAnalystProperties();
        if (propertyTable == null) {
            // No AnalystPropertyTable defined for this Goal yet, create one
            propertyTable = this.modelService.getModelFactory().createAnalystPropertyTable();
            propertyTable.setType(this.theEditedElement.getOwnerContainer().getAnalystProperties().getType());
            this.theEditedElement.setAnalystProperties(propertyTable);
        }
        
        propertyTable.setProperty(property, value);
    }

}
