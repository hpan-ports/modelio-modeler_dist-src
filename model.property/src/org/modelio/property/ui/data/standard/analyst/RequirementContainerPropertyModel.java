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
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
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
 * <i>RequirementContainer</i> data model.
 * <p>
 * This class provides the list of properties for the
 * <i>RequirementContainer</i> metaclass.
 * <p>
 */
@objid ("c024b51b-2aa2-4cbc-8fae-15be730c7909")
public class RequirementContainerPropertyModel extends AbstractPropertyModel<RequirementContainer> {
    /**
     * Properties to display for <i>RequirementContainer</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li>for the first row the value is the table header label (usually the
     * metaclass name)
     * <li>for otheEditedElement rows the values usually match the
     * meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("b13bc57f-8ecd-4ba1-ba1b-742a13bafb28")
    private List<String> properties = new ArrayList<>();

    @objid ("1bb00aa9-ae28-43aa-9d83-9b8960f62b05")
    private StringType labelStringType = new StringType(false);

    @objid ("381bb721-0f90-4c06-9aee-b8b9245690be")
    private StringType stringType = new StringType(true);

    @objid ("379bf35a-95aa-4b7b-9ff4-b15e2c114b99")
    private BooleanType booleanType = new BooleanType();

    @objid ("0910a306-5fad-4760-8052-b6969db93ab7")
    private Map<EnumeratedPropertyType, ListType> listType = new HashMap<>();

    @objid ("d8ec0211-ee66-4dff-b35f-f690623f87c6")
    private IModel model;

    @objid ("997a09c4-c89d-46fa-88d2-5effff480ed2")
    private IMModelServices modelService;

    /**
     * Create a new <i>RequirementContainer</i> data model from an <i>analyst
     * container</i>.
     * @param modelService
     * @param model
     * @param theEditedElement the analyst container
     */
    @objid ("5ef90dcb-1373-467c-b6c0-9597691d4ea3")
    public RequirementContainerPropertyModel(RequirementContainer theEditedElement, IMModelServices modelService, IModel model) {
        super(theEditedElement);
        this.model = model;
        this.modelService = modelService;
        rebuildDisplayedProperties();
    }

    /**
     * The number of columns that the properties table must display.
     * @return the number of columns
     */
    @objid ("5396a9aa-0b72-49a0-a563-9d8e09b0a408")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    /**
     * The number of rows that the properties table must display.
     * @return the number of rows
     */
    @objid ("d3f46213-5afa-4b18-81ab-3624f401aa80")
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
    @objid ("fba26739-9c22-41d7-b86b-d2d1bf45596b")
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
    @objid ("584929b0-67d7-4e7f-b3a0-2b20b5ec15f0")
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
    @objid ("bb2dc2de-95d9-4565-b4d8-023781b60d72")
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

    @objid ("e361f0b1-53bd-4d9c-9880-26e6b1b60a9b")
    @Override
    public boolean isEditable(int row, int col) {
        if (col == 0) {
            return false;
        }
        return this.theEditedElement.isModifiable();
    }

    @objid ("16f633dd-3ba7-4d93-9f0f-6b175c58e224")
    private Object getPropertyValue(int propertyIndex) {
        // Get the correct PropertyDefinition:
        PropertyDefinition property = this.theEditedElement.getAnalystProperties().getType().getOwned().get(propertyIndex);
        boolean isBooleanProperty = (property.getType().getName().equals("Boolean")); //$NON-NLS-1$
        // If property values are defined on this Requirement
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

    @objid ("df7e2dd0-19e2-4a76-8001-33d7122f0863")
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

    @objid ("eaf9ce4d-7900-44ee-b6f4-f39d7038ba25")
    private void setPropertyValue(int propertyIndex, String value) {
        // Get the ModelingSession
        // IModel modelingSession =
        // ModelProperty.getInstance().getModelingSession();
        
        // Get the correct PropertyDefinition:
        PropertyDefinition property = this.theEditedElement.getAnalystProperties().getType().getOwned().get(propertyIndex);
        
        // If property values are defined on this Requirement
        // go through theEditedElement and look for the one corresponding
        // to this property
        AnalystPropertyTable propertyValueSet = this.theEditedElement.getAnalystProperties();
        if (propertyValueSet == null) {
            // No AnalystPropertyTable defined for this Requirement yet, create one
        
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
    @objid ("78ff2c84-e07c-413a-932d-ce3460f476ad")
    private void setType(Object newType) {
        // If setting to type to null, delete all values and the value set.
        if (newType == null) {
            this.theEditedElement.getAnalystProperties().setType(null);
        
            if (this.theEditedElement.getAnalystProperties() != null) {
                this.theEditedElement.getAnalystProperties().delete();
            }
        
            for (final Requirement requirement : this.theEditedElement.getOwnedRequirement()) {
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
            for (final Requirement requirement : this.theEditedElement.getOwnedRequirement()) {
                applyNewPropertySet(requirement, newPropertySet);
            }
        }
        
        rebuildDisplayedProperties();
    }

    @objid ("be67568d-c751-4ef4-ad78-ea16671e04dc")
    private void applyNewPropertySet(Requirement requirement, PropertyTableDefinition newPropertySet) {
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

    @objid ("3d927399-92e9-458e-8a7d-607c0bf8bc40")
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

    @objid ("37d06a77-0b98-4729-847d-8db5a6a048c6")
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
    @objid ("e37bb798-d8f5-46f1-9ab8-dacff08d93b7")
    private void rebuildDisplayedProperties() {
        this.properties.clear();
        this.properties.add("RequirementContainer");
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

    @objid ("81a9e858-0ff5-4bfc-8d10-828d3cdccd42")
    private IPropertyType getAvailableSets() {
        List<ModelElement> availableSets = new ArrayList<>();
        
        // String stereotypeFilter = "requirement_propertyset";
        for (MObject elt : this.model.findByClass(SmClass.getClass(PropertyTableDefinition.class), IModel.ISVALID)) {
            PropertyTableDefinition propertySet = (PropertyTableDefinition) elt;
        
            // Keep only property sets without stereotypes, or enforcing the
            //if (propertySet.getExtension().isEmpty() || propertySet.isStereotyped(stereotypeFilter))
            availableSets.add(propertySet);
        }
        
        ModelElementListType type = new ModelElementListType(true, PropertyTableDefinition.class, availableSets, CoreSession.getSession(this.theEditedElement));
        return type;
    }

}
