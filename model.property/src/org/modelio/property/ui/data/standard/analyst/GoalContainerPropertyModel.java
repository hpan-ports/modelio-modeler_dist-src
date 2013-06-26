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
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.property.ui.data.standard.common.AbstractPropertyModel;
import org.modelio.vcore.session.api.model.IModel;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * <i>GoalContainer</i> data model.
 * <p>
 * This class provides the list of properties for the
 * <i>GoalContainer</i> metaclass.
 * <p>
 */
@objid ("8f7108b8-c068-11e1-8c0a-002564c97630")
public class GoalContainerPropertyModel extends AbstractPropertyModel<GoalContainer> {
    /**
     * Properties to display for <i>GoalContainer</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li>for the first row the value is the table header label (usually the
     * metaclass name)
     * <li>for otheEditedElement rows the values usually match the
     * meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("a81e5af6-c068-11e1-8c0a-002564c97630")
    private List<String> properties = new ArrayList<>();

    @objid ("8f7108be-c068-11e1-8c0a-002564c97630")
    private StringType labelStringType = new StringType(false);

    @objid ("8f7108bf-c068-11e1-8c0a-002564c97630")
    private StringType stringType = new StringType(true);

    @objid ("8f7108c0-c068-11e1-8c0a-002564c97630")
    private BooleanType booleanType = new BooleanType();

    @objid ("8f7108c1-c068-11e1-8c0a-002564c97630")
    private Map<EnumeratedPropertyType, ListType> listType = new HashMap<>();

    @objid ("a9ed8c44-eaa0-11e1-94f7-002564c97630")
    private IModel model;

    @objid ("a9ed8c45-eaa0-11e1-94f7-002564c97630")
    private IMModelServices modelService;

    /**
     * Create a new <i>GoalContainer</i> data model from an <i>analyst
     * container</i>.
     * @param modelService
     * @param model
     * @param theEditedElement the analyst container
     */
    @objid ("8f7108cb-c068-11e1-8c0a-002564c97630")
    public GoalContainerPropertyModel(GoalContainer theEditedElement, IMModelServices modelService, IModel model) {
        super(theEditedElement);
        this.model = model;
        this.modelService = modelService;
        rebuildDisplayedProperties();
    }

    /**
     * The number of columns that the properties table must display.
     * @return the number of columns
     */
    @objid ("8f7108d1-c068-11e1-8c0a-002564c97630")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    /**
     * The number of rows that the properties table must display.
     * @return the number of rows
     */
    @objid ("8f7108d7-c068-11e1-8c0a-002564c97630")
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
    @objid ("8f7108dd-c068-11e1-8c0a-002564c97630")
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
    @objid ("8f7108e5-c068-11e1-8c0a-002564c97630")
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
    @objid ("8f7369eb-c068-11e1-8c0a-002564c97630")
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

    @objid ("8f7369f3-c068-11e1-8c0a-002564c97630")
    @Override
    public boolean isEditable(int row, int col) {
        if (col == 0) {
            return false;
        }
        return this.theEditedElement.isModifiable();
    }

    @objid ("8f7369fa-c068-11e1-8c0a-002564c97630")
    private Object getPropertyValue(int propertyIndex) {
        // Get the correct PropertyDefinition:
        PropertyDefinition property = this.theEditedElement.getAnalystProperties().getType().getOwned().get(propertyIndex);
        boolean isBooleanProperty = (property.getType().getName().equals("Boolean")); //$NON-NLS-1$
        // If property values are defined on this Goal
        // go through theEditedElement and look for the one corresponding
        // to this property
        AnalystPropertyTable propertyTable = this.theEditedElement.getAnalystProperties();
        if (propertyTable != null) {
            String stringValue = propertyTable.getProperty(property);
        
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

    @objid ("8f7369ff-c068-11e1-8c0a-002564c97630")
    private IPropertyType getPropertyType(int propertyIndex) {
        // Get the correct PropertyDefinition:
        PropertyDefinition property = this.theEditedElement.getAnalystProperties().getType().getOwned().get(propertyIndex);
        PropertyType propertyType = property.getType();
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
            } else if (propertyName.equals("RichText")) { //$NON-NLS-1$
                return new ScopeRichTextType(this.theEditedElement, true);
            } else {
                // Unknown property type, treat as a text
                return this.stringType;
            }
        }
    }

    @objid ("8f736a03-c068-11e1-8c0a-002564c97630")
    private void setPropertyValue(int propertyIndex, String value) {
        // Get the ModelingSession
        // IModel modelingSession =
        // ModelProperty.getInstance().getModelingSession();
        
        // Get the correct PropertyDefinition:
        PropertyDefinition property = this.theEditedElement.getAnalystProperties().getType().getOwned().get(propertyIndex);
        
        // If property values are defined on this Goal
        // go through theEditedElement and look for the one corresponding
        // to this property
        AnalystPropertyTable propertyValueSet = this.theEditedElement.getAnalystProperties();
        if (propertyValueSet == null) {
            // No AnalystPropertyTable defined for this Goal yet, create one
        
            propertyValueSet = this.modelService.getModelFactory().createAnalystPropertyTable();
            propertyValueSet.setType(this.theEditedElement.getAnalystProperties().getType());
            this.theEditedElement.setAnalystProperties(propertyValueSet);
        }
        
        propertyValueSet.setProperty(property, value);
    }

    /**
     * Change the edited analyst container type.
     * @param newType the new type, must be a {@link PropertyTableDefinition}.
     */
    @objid ("8f736a08-c068-11e1-8c0a-002564c97630")
    private void setType(Object newType) {
        // If setting to type to null, delete all values and the value set.
        if (newType == null) {
            this.theEditedElement.getAnalystProperties().setType(null);
        
            if (this.theEditedElement.getAnalystProperties() != null) {
                this.theEditedElement.getAnalystProperties().delete();
            }
        
            for (final Goal requirement : this.theEditedElement.getOwnedGoal()) {
                applyNewPropertySet(requirement, null);
            }
        } else {
            final PropertyTableDefinition newPropertySet = (PropertyTableDefinition) newType;
        
            this.theEditedElement.getAnalystProperties().setType(newPropertySet);
        
            AnalystPropertyTable oldPropertyValueSet = this.theEditedElement.getAnalystProperties();
            if (oldPropertyValueSet == null) {
                // Create default values for new properties.
                oldPropertyValueSet = this.modelService.getModelFactory().createAnalystPropertyTable();
                this.theEditedElement.setAnalystProperties(oldPropertyValueSet);
                oldPropertyValueSet.setType(newPropertySet);
            } else {
                // Run through the default values and check if theEditedElement
                // still apply to a property.
                migrateOldValues(oldPropertyValueSet, newPropertySet);
            }
            createMissingValues(newPropertySet, oldPropertyValueSet);
        
            // Finally, apply this to all children.
            for (final Goal requirement : this.theEditedElement.getOwnedGoal()) {
                applyNewPropertySet(requirement, newPropertySet);
            }
        }
        
        rebuildDisplayedProperties();
    }

    @objid ("8f736a0c-c068-11e1-8c0a-002564c97630")
    private void applyNewPropertySet(Goal requirement, PropertyTableDefinition newPropertySet) {
        if (newPropertySet == null) {
            // If setting to type to null, delete all values and the value set.
            requirement.getAnalystProperties().delete();
        } else {
            AnalystPropertyTable oldPropertyValueSet = requirement.getAnalystProperties();
            if (oldPropertyValueSet != null) {
                migrateOldValues(oldPropertyValueSet, newPropertySet);
            }
            if (oldPropertyValueSet == null) {
                oldPropertyValueSet = this.modelService.getModelFactory().createAnalystPropertyTable();
                oldPropertyValueSet.setOwner(requirement);
                oldPropertyValueSet.setType(newPropertySet);
            }
            createMissingValues(newPropertySet, oldPropertyValueSet);
        }
    }

    @objid ("8f736a14-c068-11e1-8c0a-002564c97630")
    private static void migrateOldValues(AnalystPropertyTable oldTable, PropertyTableDefinition newPropertySet) {
        Properties oldProps = oldTable.toProperties();
        Properties newProps = new Properties();
        
        for (PropertyDefinition  propDef: newPropertySet.getOwned()) {
            String name = propDef.getName();
            String value = oldProps.getProperty(name);
            if (value != null)
                newProps.setProperty(name, value);
        }
        
        oldTable.setContent(newProps);
    }

    @objid ("8f736a1c-c068-11e1-8c0a-002564c97630")
    private void createMissingValues(PropertyTableDefinition newPropertySet, AnalystPropertyTable oldTable) {
        Properties content = oldTable.toProperties();
        boolean diff = false;
        
        for (PropertyDefinition newProperty : newPropertySet.getOwned()) {
            String key = newProperty.getName();
            if (! content.contains(key)) {
                content.setProperty(key, newProperty.getDefaultValue());
                diff = true;
            }
        }
        
        if (diff)
            oldTable.setContent(content);
    }

    /**
     * Rebuild the displayed properties
     */
    @objid ("8f736a24-c068-11e1-8c0a-002564c97630")
    private void rebuildDisplayedProperties() {
        this.properties.clear();
        this.properties.add("GoalContainer");
        this.properties.add("Name");
        this.properties.add("Type");
        // Get the propertySet from the containing GoalContainer.
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

    @objid ("8f736a27-c068-11e1-8c0a-002564c97630")
    private IPropertyType getAvailableSets() {
        List<ModelElement> availableSets = new ArrayList<>();
        
        //String stereotypeFilter = "goal_propertyset";
        for (MObject elt : this.model.findByClass(SmClass.getClass(PropertyTableDefinition.class), IModel.ISVALID)) {
            PropertyTableDefinition propertySet = (PropertyTableDefinition) elt;
        
            // Keep only property sets without stereotypes, or enforcing the
            //if (propertySet.getExtension().isEmpty()/* || propertySet.isStereotyped(stereotypeFilter)*/)
            availableSets.add(propertySet);
        }
        
        ModelElementListType type = new ModelElementListType(true, PropertyTableDefinition.class, availableSets, CoreSession.getSession(this.theEditedElement));
        return type;
    }

}
