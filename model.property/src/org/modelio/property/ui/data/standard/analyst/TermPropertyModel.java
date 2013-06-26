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
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.property.ui.data.standard.common.AbstractPropertyModel;

/**
 * <i>Term</i> data model.
 * <p>
 * This class provides the list of properties for the <i>Term</i> metaclass.
 */
@objid ("8f971ecc-c068-11e1-8c0a-002564c97630")
public class TermPropertyModel extends AbstractPropertyModel<Term> {
    /**
     * Properties to display for <i>Term</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li>for the first row the value is the table header label (usually the
     * metaclass name)
     * <li>for otheEditedElement rows the values usually match the
     * meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("a879e876-c068-11e1-8c0a-002564c97630")
    private final List<String> properties = new ArrayList<>();

    @objid ("8f971ed2-c068-11e1-8c0a-002564c97630")
    private final StringType labelStringType = new StringType(false);

    @objid ("8f971ed4-c068-11e1-8c0a-002564c97630")
    private final StringType stringType = new StringType(true);

    @objid ("8f971ed6-c068-11e1-8c0a-002564c97630")
    private final BooleanType booleanType = new BooleanType();

    @objid ("8f971ed8-c068-11e1-8c0a-002564c97630")
    private final Map<EnumeratedPropertyType, ListType> listType = new HashMap<>();

    @objid ("57b28885-eaa1-11e1-94f7-002564c97630")
    private IMModelServices modelService;

    /**
     * Constructor
     * @param modelService
     * @param theEditedElement the model to edit.
     */
    @objid ("8f997fe5-c068-11e1-8c0a-002564c97630")
    public TermPropertyModel(Term theEditedElement, IMModelServices modelService) {
        super(theEditedElement);
        this.modelService = modelService;
        
        this.properties.add("Term");
        this.properties.add("Name");
        // Get the propertySet from the containing Dictionary.
        final PropertyTableDefinition propertySet = this.theEditedElement.getOwnerDictionary().getAnalystProperties().getType();
        if (propertySet != null) {
            for (final PropertyDefinition property : propertySet.getOwned()) {
                this.properties.add(property.getName());
            }
        }
        this.properties.add("Definition");
    }

    @objid ("8f997feb-c068-11e1-8c0a-002564c97630")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    @objid ("8f997ff0-c068-11e1-8c0a-002564c97630")
    @Override
    public int getRowsNumber() {
        return this.properties.size();
    }

    @objid ("8f997ff5-c068-11e1-8c0a-002564c97630")
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

    @objid ("8f997ffc-c068-11e1-8c0a-002564c97630")
    @Override
    public IPropertyType getTypeAt(int row, int col) {
        if (col == 0) {
            return this.labelStringType;
        } else if (col == 1) // col 1 is the property value
        {
            if (row == 0) {
                return this.labelStringType;
            } else if (row == 1) {
                return this.stringType;
            } else if (2 <= row && row < (this.properties.size() - 1)) {
                return getPropertyType(row - 2);
            } else if (row == (this.properties.size() - 1)) {
                return new MultilineStringType(this.theEditedElement, this.properties.get(row), true);
            } else {
                return null;
            }
        }
        return null;
    }

    @objid ("8f998003-c068-11e1-8c0a-002564c97630")
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

    @objid ("8f99800a-c068-11e1-8c0a-002564c97630")
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
     * Dictionary.
     * @param propertyIndex @return
     */
    @objid ("8f998011-c068-11e1-8c0a-002564c97630")
    private Object getPropertyValue(int propertyIndex) {
        // Get the correct PropertyDefinition:
        final PropertyDefinition property = this.theEditedElement.getOwnerDictionary().getAnalystProperties().getType().getOwned().get(propertyIndex);
        final boolean isBooleanProperty = (property.getType().getName().equals("Boolean")); //$NON-NLS-1$
        boolean isRichTextProperty = (property.getType().getName().equals("RichText")); //$NON-NLS-1$
        
        // If property values are defined on this Term
        // go through theEditedElement and look for the one corresponding
        // to this property
        final AnalystPropertyTable propTable = this.theEditedElement.getAnalystProperties();
        if (propTable != null) {
            final String stringValue = propTable.getProperty(property);
            if (stringValue != null) {
                if (isBooleanProperty) {
                    return new Boolean(stringValue);
                } else if (isRichTextProperty) {
                    for (ExternDocument doc : this.theEditedElement.getDocument()) {
                        if (doc.getType() != null && doc.getType().getName().equals("term")) {
                            return doc;
                        }
                    }
                    return null;
                } else
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
     * Dictionary.
     * @param propertyIndex @return
     */
    @objid ("8f998017-c068-11e1-8c0a-002564c97630")
    private IPropertyType getPropertyType(int propertyIndex) {
        // Get the correct PropertyDefinition:
        final PropertyDefinition property = this.theEditedElement.getOwnerDictionary().getAnalystProperties().getType().getOwned().get(propertyIndex);
        final PropertyType propertyType = property.getType();
        if (propertyType instanceof EnumeratedPropertyType) {
            final EnumeratedPropertyType enumeratedPropertyType = (EnumeratedPropertyType) propertyType;
            ListType type = this.listType.get(enumeratedPropertyType);
            if (type != null) {
                return type;
            }
        
            // Type not found yet, create it.
            final List<String> values = new ArrayList<>();
            for (final PropertyEnumerationLitteral enumLitteral : enumeratedPropertyType.getLitteral()) {
                values.add(enumLitteral.getName());
            }
        
            type = new ListType(false, values);
            this.listType.put(enumeratedPropertyType, type);
        
            return type;
        } else {
            // property is not an enumerated, try the known property types
            final String propertyName = propertyType.getName();
            if (propertyName.equals("Boolean")) {
                return this.booleanType;
            } else if (propertyName.equals("MultiText")) {
                return new MultilineStringType(this.theEditedElement, "Definition", true);
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

    @objid ("8f99801c-c068-11e1-8c0a-002564c97630")
    private void setPropertyValue(int propertyIndex, String value) {
        // Get the correct PropertyDefinition:
        final PropertyDefinition property = this.theEditedElement.getOwnerDictionary().getAnalystProperties().getType().getOwned().get(propertyIndex);
        
        // If property values are defined on this Term
        // go through theEditedElement and look for the one corresponding
        // to this property
        AnalystPropertyTable propertyTable = this.theEditedElement.getAnalystProperties();
        if (propertyTable == null) {
            // No AnalystPropertyTable defined for this Term yet, create one
            propertyTable = this.modelService.getModelFactory().createAnalystPropertyTable();
            propertyTable.setType(this.theEditedElement.getOwnerDictionary().getAnalystProperties().getType());
            this.theEditedElement.setAnalystProperties(propertyTable);
        }
        
        propertyTable.setProperty(property, value);
    }

}
