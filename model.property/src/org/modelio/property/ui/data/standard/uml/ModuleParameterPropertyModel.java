/* 
 * Copyright 2013-2015 Modeliosoft
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


package org.modelio.property.ui.data.standard.uml;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.core.ui.ktable.types.IPropertyType;
import org.modelio.core.ui.ktable.types.element.SingleElementType;
import org.modelio.core.ui.ktable.types.enumeration.EnumType;
import org.modelio.core.ui.ktable.types.text.StringType;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.ModuleParameterType;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.property.ui.data.standard.common.AbstractPropertyModel;
import org.modelio.vcore.session.impl.CoreSession;

/**
 * This class provide the data to display module parameter properties.
 */
@objid ("8eef8456-c068-11e1-8c0a-002564c97630")
public class ModuleParameterPropertyModel extends AbstractPropertyModel<ModuleParameter> {
    @objid ("a6ba758d-c068-11e1-8c0a-002564c97630")
    private static final String[] PROPERTIES = new String[] { "Property", "Name", "Type", "EnumType", "DefaultValue" };

    @objid ("8eef845f-c068-11e1-8c0a-002564c97630")
    private StringType labelStringType = null;

    @objid ("8eef8460-c068-11e1-8c0a-002564c97630")
    private StringType stringType = null;

    @objid ("eece8c07-bb04-4baa-9271-704d6ef86641")
    private EnumType typeType;

    @objid ("d894d139-72dc-45b2-8e84-765ee6a934aa")
    private SingleElementType enumType;

    /**
     * Instantiate the profile properties view.
     * @param theEditedElement the current profile.
     */
    @objid ("8eef8461-c068-11e1-8c0a-002564c97630")
    public ModuleParameterPropertyModel(ModuleParameter theEditedElement) {
        super(theEditedElement);
        
        this.labelStringType = new StringType(false);
        this.stringType = new StringType(true);
        this.typeType = new EnumType(ModuleParameterType.class);
        this.enumType = new SingleElementType(true, Enumeration.class, CoreSession.getSession(this.theEditedElement));
    }

    @objid ("8eef8467-c068-11e1-8c0a-002564c97630")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    @objid ("8eef846c-c068-11e1-8c0a-002564c97630")
    @Override
    public int getRowsNumber() {
        return ModuleParameterPropertyModel.PROPERTIES.length;
    }

    @objid ("8eef8471-c068-11e1-8c0a-002564c97630")
    @Override
    public IPropertyType getTypeAt(int row, int col) {
        switch (col) {
        case 0: // col 0 is the property key type
            return this.labelStringType;
        case 1: // col 1 is the property value type
            switch (row) {
            case 0: // Header
                return this.labelStringType;
            case 1:
                return this.stringType;
            case 2:
                return this.typeType;
            case 3:
                return this.enumType;
            case 4:
                return this.stringType;
            default:
                return null;
            }
        default:
            return null;
        }
    }

    @objid ("8eef8477-c068-11e1-8c0a-002564c97630")
    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
        case 0: // col 0 is the property key
            return ModuleParameterPropertyModel.PROPERTIES[row];
        case 1: // col 1 is the property value
            switch (row) {
            case 0: // Header
                return "Value";
            case 1:
                return this.theEditedElement.getName();
            case 2:
                return this.theEditedElement.getType();
            case 3:
                return this.theEditedElement.getEnumType();
            case 4:
                return this.theEditedElement.getDefaultValue();
            default:
                return null;
            }
        default:
            return null;
        }
    }

    @objid ("8eef847d-c068-11e1-8c0a-002564c97630")
    @Override
    public void setValueAt(int row, int col, Object value) {
        switch (col) {
        case 0: // Keys cannot be modified
            return;
        case 1: // col 1 is the property value
            switch (row) {
            case 0:
                return; // Header cannot be modified
            case 1:
                this.theEditedElement.setName((String) value);
                return;
            case 2:
                this.theEditedElement.setType((ModuleParameterType) value);
                return;
            case 3:
                this.theEditedElement.setEnumType((Enumeration) value);
                return;
            case 4:
                this.theEditedElement.setDefaultValue((String) value);
                return;
            default:
                return;
            }
        default:
            return;
        }
    }

}
