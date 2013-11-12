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
                                    

package org.modelio.property.ui.data.standard.uml;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.core.ui.ktable.types.IPropertyType;
import org.modelio.core.ui.ktable.types.bool.BooleanType;
import org.modelio.core.ui.ktable.types.element.SingleElementType;
import org.modelio.core.ui.ktable.types.enumeration.EnumType;
import org.modelio.core.ui.ktable.types.text.StringType;
import org.modelio.metamodel.uml.statik.MethodPassingMode;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.property.ui.data.standard.common.AbstractPropertyModel;
import org.modelio.vcore.session.impl.CoreSession;

/**
 * <i>Operation</i> data model.
 * <p>
 * This class provides the list of properties for the <i>Operation</i> metaclass.
 */
@objid ("8f56d993-c068-11e1-8c0a-002564c97630")
public class OperationPropertyModel extends AbstractPropertyModel<Operation> {
    /**
     * Properties to display for <i>Operation</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li> for the first row the value is the table header label (usually the metaclass name)
     * <li> for otheEditedElement rows the values usually match the meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("a7cd7bc8-c068-11e1-8c0a-002564c97630")
    private static final String[] PROPERTIES = new String[] {"Operation", "Name", "Visibility", "IsAbstract", "IsClass", "Final", "Passing", "Redefines"};

    @objid ("facc14ba-c5d4-11e1-8f21-002564c97630")
    private StringType labelStringType;

    @objid ("facc14bb-c5d4-11e1-8f21-002564c97630")
    private StringType stringType;

    @objid ("facc14bc-c5d4-11e1-8f21-002564c97630")
    private BooleanType booleanType;

    @objid ("facc14bd-c5d4-11e1-8f21-002564c97630")
    private EnumType visibilityEnumType;

    @objid ("facc14be-c5d4-11e1-8f21-002564c97630")
    private EnumType methodPassingModeType;

    @objid ("facc14bf-c5d4-11e1-8f21-002564c97630")
    private SingleElementType operationType;

    /**
     * Create a new <i>Operation</i> data model from an <i>Operation</i>.
     * @param model
     * @param theEditedElement The edited element.
     */
    @objid ("8f56d99e-c068-11e1-8c0a-002564c97630")
    public OperationPropertyModel(Operation theEditedElement) {
        super(theEditedElement);
        
        this.labelStringType = new StringType(false);
        this.stringType = new StringType(true);
        this.booleanType = new BooleanType();
        this.visibilityEnumType = new EnumType(VisibilityMode.class);
        this.methodPassingModeType = new EnumType(MethodPassingMode.class);
        this.operationType = new SingleElementType(true, Operation.class, CoreSession.getSession(this.theEditedElement));
    }

    /**
     * The number of columns that the properties table must display.
     * @return the number of columns
     */
    @objid ("8f56d9a4-c068-11e1-8c0a-002564c97630")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    /**
     * The number of rows that the properties table must display.
     * @return the number of rows
     */
    @objid ("8f56d9a9-c068-11e1-8c0a-002564c97630")
    @Override
    public int getRowsNumber() {
        if (this.theEditedElement.isIsClass()) {
            return OperationPropertyModel.PROPERTIES.length - 1;
        }
        return OperationPropertyModel.PROPERTIES.length;
    }

    /**
     * Return the value that will be displayed at the specified row and column.
     * <p>
     * The first column contains the properties names.
     * @param row the row number
     * @param col the column number
     * @return the value corresponding to the row and column
     */
    @objid ("8f56d9ae-c068-11e1-8c0a-002564c97630")
    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
        case 0: // col 0 is the property key
            return OperationPropertyModel.PROPERTIES[row];
        case 1: // col 1 is the property value
            switch (row) {
            case 0: // Header
                return "Value";
            case 1:
                return this.theEditedElement.getName();
            case 2:
                return this.theEditedElement.getVisibility();
            case 3:
                return this.theEditedElement.isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
            case 4:
                return this.theEditedElement.isIsClass() ? Boolean.TRUE : Boolean.FALSE;
            case 5:
                return this.theEditedElement.isFinal() ? Boolean.TRUE : Boolean.FALSE;
            case 6:
                return this.theEditedElement.getPassing();
            case 7:
                return this.theEditedElement.getRedefines();
            default:
                return null;
            }
        default:
            return null;
        }
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
    @objid ("8f56d9b4-c068-11e1-8c0a-002564c97630")
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
                return this.visibilityEnumType;
            case 3:
                return this.booleanType;
            case 4:
                return this.booleanType;
            case 5:
                return this.booleanType;
            case 6:
                return this.methodPassingModeType;
            case 7:
                return this.operationType;
            default:
                return null;
            }
        default:
            return null;
        }
    }

    /**
     * Set value in the model for the specified row and column.
     * <p>
     * The first column contains the properties names.
     * @param row the row number.
     * @param col the column number.
     * @param value the value specified by the user.
     */
    @objid ("8f56d9bc-c068-11e1-8c0a-002564c97630")
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
                break;
            case 2:
                this.theEditedElement.setVisibility((VisibilityMode) value);
                break;
            case 3:
                this.theEditedElement.setIsAbstract(((Boolean) value).booleanValue());
                break;
            case 4:
                this.theEditedElement.setIsClass(((Boolean) value).booleanValue());
                break;
            case 5:
                this.theEditedElement.setFinal(((Boolean) value).booleanValue());
                break;
            case 6:
                this.theEditedElement.setPassing((MethodPassingMode) value);
                break;
            case 7:
                this.theEditedElement.setRedefines((Operation) value);
                break;
            default:
                return;
            }
            break;
        default:
            return;
        }
    }

}
