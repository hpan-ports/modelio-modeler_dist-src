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
import java.util.Properties;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.core.ui.ktable.types.IPropertyType;
import org.modelio.core.ui.ktable.types.bool.BooleanType;
import org.modelio.core.ui.ktable.types.list.ListType;
import org.modelio.core.ui.ktable.types.modelelement.ModelElementListType;
import org.modelio.core.ui.ktable.types.scoperichtext.ScopeRichTextType;
import org.modelio.core.ui.ktable.types.text.MultilineStringType;
import org.modelio.core.ui.ktable.types.text.StringType;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyBaseType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.property.ui.data.standard.common.AbstractPropertyModel;
import org.modelio.vcore.session.api.model.IModel;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * <i>Dictionary</i> data model.
 * <p>
 * This class provides the list of properties for the <i>Dictionary</i>
 * metaclass.
 */
@objid ("8f035a7d-c068-11e1-8c0a-002564c97630")
public class DictionaryPropertyModel extends AbstractPropertyModel<Dictionary> {
    /**
     * Properties to display for <i>Dictionary</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li>for the first row the value is the table header label (usually the
     * metaclass name)
     * <li>for otheEditedElement rows the values usually match the
     * meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("a6e2ecf6-c068-11e1-8c0a-002564c97630")
    private List<String> properties = new ArrayList<>();

    @objid ("8f035a83-c068-11e1-8c0a-002564c97630")
    private StringType labelStringType = new StringType(false);

    @objid ("8f035a84-c068-11e1-8c0a-002564c97630")
    private StringType stringType = new StringType(true);

    @objid ("8f035a85-c068-11e1-8c0a-002564c97630")
    private BooleanType booleanType = new BooleanType();

    @objid ("8f035a86-c068-11e1-8c0a-002564c97630")
    private Map<EnumeratedPropertyType, ListType> listType = new HashMap<>();

    @objid ("022b19b3-ea9e-11e1-94f7-002564c97630")
    private IMModelServices modelService;

    @objid ("a9f24f04-eaa0-11e1-94f7-002564c97630")
    private IModel model;

    /**
     * Create a new <i>Dictionary</i> data model from an <i>Dictionary</i>.
     * @param model
     * @param modelService
     * @param theEditedElement the dictionary to display.
     */
    @objid ("8f035a90-c068-11e1-8c0a-002564c97630")
    public DictionaryPropertyModel(Dictionary theEditedElement, IMModelServices modelService, IModel model) {
        super(theEditedElement);
        this.model = model;
        this.modelService = modelService;
        rebuildDisplayedProperties();
    }

    /**
     * The number of columns that the properties table must display.
     * @return the number of columns
     */
    @objid ("8f035a96-c068-11e1-8c0a-002564c97630")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    /**
     * The number of rows that the properties table must display.
     * @return the number of rows
     */
    @objid ("8f035a9c-c068-11e1-8c0a-002564c97630")
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
    @objid ("8f035aa2-c068-11e1-8c0a-002564c97630")
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
            if (row == 2) {
                return this.theEditedElement.getAnalystProperties().getType();
            }
            // else
            if (3 <= row && row < (this.properties.size() - 1)) {
                return getPropertyValue(row - 3);
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
    @objid ("8f035aaa-c068-11e1-8c0a-002564c97630")
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
            if (row == 2) {
                return getAvailableSets();
            }
            // else
            if (3 <= row && row < (this.properties.size() - 1)) {
                return getPropertyType(row - 3);
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
    @objid ("8f04e10c-c068-11e1-8c0a-002564c97630")
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
            if (row == 2) {
                setType(value);
                return;
            }
            // else
            if (3 <= row && row < (this.properties.size() - 1)) {
                setPropertyValue(row - 3, value.toString());
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

    @objid ("8f04e114-c068-11e1-8c0a-002564c97630")
    @Override
    public boolean isEditable(int row, int col) {
        if (col == 0) {
            return false;
        }
        return this.theEditedElement.isModifiable();
    }

    @objid ("8f04e11b-c068-11e1-8c0a-002564c97630")
    private Object getPropertyValue(int propertyIndex) {
        // Get the correct PropertyDefinition:
        PropertyDefinition property = this.theEditedElement.getAnalystProperties().getType().getOwned().get(propertyIndex);
        boolean isBooleanProperty = (property.getType().getBaseType() == PropertyBaseType.BOOLEAN); 
        
        // If property values are defined on this Requirement
        // go through theEditedElement and look for the one corresponding
        // to this property
        AnalystPropertyTable propertyValueSet = this.theEditedElement.getAnalystProperties();
        if (propertyValueSet != null) {
            String stringValue = propertyValueSet.getProperty(property.getName());
            if (stringValue != null) {
                if (isBooleanProperty) 
                    return new Boolean(stringValue);
                else
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

    @objid ("8f04e120-c068-11e1-8c0a-002564c97630")
    private IPropertyType getPropertyType(int propertyIndex) {
        // Get the correct PropertyDefinition:
        final PropertyDefinition property = this.theEditedElement.getAnalystProperties().getType().getOwned().get(propertyIndex);
        final PropertyType propertyType = property.getType();
        if (propertyType instanceof EnumeratedPropertyType) {
            final EnumeratedPropertyType enumeratedPropertyType = (EnumeratedPropertyType) propertyType;
        
            ListType type = this.listType.get(enumeratedPropertyType);
            if (type != null) {
                return type;
            }
        
            // Type not found yet, create it.
            final List<String> values = new ArrayList<>();
            for (PropertyEnumerationLitteral enumLitteral : enumeratedPropertyType.getLitteral()) {
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
                return new MultilineStringType(this.theEditedElement, "Text", true);
            } else if (propertyName.equals("Text") || propertyName.equals("Integer") || propertyName.equals("Real") || propertyName.equals("Date")) {
                return this.stringType;
            } else if (propertyName.equals("RichText")) { //$NON-NLS-1$
                return new ScopeRichTextType(this.theEditedElement, true);
            } else {
                // Unknown property type, treat as a text
                return this.stringType;
            }
        }
    }

    @objid ("8f04e124-c068-11e1-8c0a-002564c97630")
    private void setPropertyValue(int propertyIndex, String value) {
        // Get the correct PropertyDefinition:
        PropertyDefinition property = this.theEditedElement.getAnalystProperties().getType().getOwned().get(propertyIndex);
        
        // If property values are defined on this Requirement
        // go through theEditedElement and look for the one corresponding
        // to this property
        AnalystPropertyTable propertyTable = this.theEditedElement.getAnalystProperties();
        if (propertyTable == null) {
            // No AnalystPropertyTable defined for this Requirement yet, create one
        
            propertyTable = this.modelService.getModelFactory().createAnalystPropertyTable();
            propertyTable.setType(this.theEditedElement.getAnalystProperties().getType());
            this.theEditedElement.setAnalystProperties(propertyTable);
        }
        
        propertyTable.setProperty(property, value);
        return;
    }

    @objid ("8f04e129-c068-11e1-8c0a-002564c97630")
    private void setType(Object value) {
        if (value == null) {
            // If setting to type to null, delete all values and the value set.
            this.theEditedElement.getAnalystProperties().setType(null);
        
            if (this.theEditedElement.getAnalystProperties() != null) {
                ((SmObjectImpl) this.theEditedElement.getAnalystProperties()).delete();
            }
        
            for (Term term : this.theEditedElement.getOwnedTerm()) {
                applyNewPropertySet(term, null);
            }
        } else {
            final PropertyTableDefinition newPropertySet = (PropertyTableDefinition) value;
        
            this.theEditedElement.getAnalystProperties().setType(newPropertySet);
        
            AnalystPropertyTable oldPropTable = this.theEditedElement.getAnalystProperties();
        
            if (oldPropTable == null) {
                // Create default values for new properties.
        
                oldPropTable = this.modelService.getModelFactory().createAnalystPropertyTable();
                this.theEditedElement.setAnalystProperties(oldPropTable);
                oldPropTable.setType(newPropertySet);
            } else {
                // Run through the default values and check if theEditedElement
                // still apply to a property.
                migrateOldValues(oldPropTable, newPropertySet);
            }
        
            createMissingValues(newPropertySet, oldPropTable);
        
            // Finally, apply this to all children.
            for (Term term : this.theEditedElement.getOwnedTerm()) {
                applyNewPropertySet(term, newPropertySet);
            }
        }
        
        rebuildDisplayedProperties();
    }

    @objid ("8f04e12c-c068-11e1-8c0a-002564c97630")
    private void applyNewPropertySet(Term term, PropertyTableDefinition newPropertySet) {
        if (newPropertySet == null) {
            // If setting to type to null, delete all values and the value set.
            term.getAnalystProperties().delete();
        } else {
            AnalystPropertyTable oldPropertyValueSet = term.getAnalystProperties();
            if (oldPropertyValueSet != null) {
                migrateOldValues(oldPropertyValueSet, newPropertySet);
            }
        
            if (oldPropertyValueSet == null) {
                oldPropertyValueSet = this.modelService.getModelFactory().createAnalystPropertyTable();
                oldPropertyValueSet.setOwner(term);
                oldPropertyValueSet.setType(newPropertySet);
            }
        
            createMissingValues(newPropertySet, oldPropertyValueSet);
        }
    }

    @objid ("8f04e134-c068-11e1-8c0a-002564c97630")
    private static void migrateOldValues(AnalystPropertyTable oldPropertyTable, PropertyTableDefinition newPropertySet) {
        Properties oldContent = oldPropertyTable.toProperties();
        Properties newContent = new Properties();
        
        for (PropertyDefinition newProperty : newPropertySet.getOwned()) {
            String key = newProperty.getName();
            String oldVal = oldContent.getProperty(key);
            if (oldVal != null) {
                newContent.setProperty(key, oldVal);
            }
        }
        
        oldPropertyTable.setContent(newContent);
    }

    @objid ("8f04e13c-c068-11e1-8c0a-002564c97630")
    private void createMissingValues(PropertyTableDefinition newPropertySet, AnalystPropertyTable oldTable) {
        for (PropertyDefinition newProperty : newPropertySet.getOwned()) {
            boolean defaultValueExists = oldTable.toProperties().contains(newProperty.getName());
            if (!defaultValueExists) {
                oldTable.setProperty(newProperty.getName(), newProperty.getDefaultValue());
            }
        }
    }

    /**
     * Rebuild the displayed properties.
     */
    @objid ("8f04e144-c068-11e1-8c0a-002564c97630")
    private void rebuildDisplayedProperties() {
        this.properties.clear();
        this.properties.add("Dictionary");
        this.properties.add("Name");
        this.properties.add("Type");
        // Get the propertySet from the containing RequirementContainer.
        PropertyTableDefinition propertySet = this.theEditedElement.getAnalystProperties().getType();
        if (propertySet != null) {
            for (PropertyDefinition property : propertySet.getOwned()) {
                if (!property.getType().getName().equals("RichText")) {
                    this.properties.add(property.getName());
                }
            }
        }
        this.properties.add("Text");
    }

    @objid ("8f04e147-c068-11e1-8c0a-002564c97630")
    private IPropertyType getAvailableSets() {
        List<ModelElement> availableSets = new ArrayList<>();
        
        //        String stereotypeFilter = "dictionary_propertyset";
        for (MObject elt : this.model.findByClass(SmClass.getClass(PropertyTableDefinition.class), IModel.ISVALID)) {
            PropertyTableDefinition propertySet = (PropertyTableDefinition) elt;
        
            // Keep only property sets without stereotypes, or enforcing the
            //            if (propertySet.getExtension().size() == 0 || propertySet.isStereotyped(stereotypeFilter))
            availableSets.add(propertySet);
        }
        
        ModelElementListType type = new ModelElementListType(true, PropertyTableDefinition.class, availableSets, CoreSession.getSession(this.theEditedElement));
        return type;
    }

}
