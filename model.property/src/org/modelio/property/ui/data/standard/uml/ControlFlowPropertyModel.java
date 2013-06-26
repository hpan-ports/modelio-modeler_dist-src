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
import org.modelio.core.ui.ktable.types.element.SingleElementType;
import org.modelio.core.ui.ktable.types.text.StringType;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ControlFlow;
import org.modelio.property.ui.data.standard.common.AbstractPropertyModel;
import org.modelio.vcore.session.impl.CoreSession;

/**
 * <i>ControlFlow</i> data model.
 * <p>
 * This class provides the list of properties for the <i>ControlFlow</i> metaclass.
 */
@objid ("8ef8ac2e-c068-11e1-8c0a-002564c97630")
public class ControlFlowPropertyModel extends AbstractPropertyModel<ControlFlow> {
    /**
     * Properties to display for <i>ControlFlow</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li> for the first row the value is the table header label (usually the metaclass name)
     * <li> for otheEditedElement rows the values usually match the meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("a6cd8088-c068-11e1-8c0a-002564c97630")
    private static final String[] PROPERTIES = new String[] {"ControlFlow", "Name", "Target", "Guard", "Weight"};

    @objid ("8ef8ac39-c068-11e1-8c0a-002564c97630")
    private StringType labelStringType = null;

    @objid ("8ef8ac3a-c068-11e1-8c0a-002564c97630")
    private StringType stringType = null;

    @objid ("8ef8ac3b-c068-11e1-8c0a-002564c97630")
    private SingleElementType targetType = null;

    /**
     * Create a new <i>ControlFlow</i> data model from an <i>ControlFlow</i>.
     */
    @objid ("8ef8ac3c-c068-11e1-8c0a-002564c97630")
    public ControlFlowPropertyModel(ControlFlow theEditedElement) {
        super(theEditedElement);
        
        this.labelStringType = new StringType(false);
        this.stringType = new StringType(true);
        this.targetType = new SingleElementType(false, ActivityNode.class, CoreSession.getSession(this.theEditedElement));
    }

    /**
     * The number of columns that the properties table must display.
     * @return the number of columns
     */
    @objid ("8ef8ac42-c068-11e1-8c0a-002564c97630")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    /**
     * The number of rows that the properties table must display.
     * @return the number of rows
     */
    @objid ("8ef8ac47-c068-11e1-8c0a-002564c97630")
    @Override
    public int getRowsNumber() {
        return ControlFlowPropertyModel.PROPERTIES.length;
    }

    /**
     * Return the value that will be displayed at the specified row and column.
     * <p>
     * The first column contains the properties names.
     * @param row the row number
     * @param col the column number
     * @return the value corresponding to the row and column
     */
    @objid ("8efa32a9-c068-11e1-8c0a-002564c97630")
    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
        case 0: // col 0 is the property key
            return ControlFlowPropertyModel.PROPERTIES[row];
        case 1: // col 1 is the property value
            switch (row) {
            case 0: // Header
                return "Value";
            case 1:
                return this.theEditedElement.getName();
            case 2:
                return this.theEditedElement.getTarget();
            case 3:
                return this.theEditedElement.getGuard();
            case 4:
                return this.theEditedElement.getWeight();
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
    @objid ("8efa32af-c068-11e1-8c0a-002564c97630")
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
                return this.targetType;
            case 3:
                return this.stringType;
            case 4:
                return this.stringType;
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
    @objid ("8efa32b5-c068-11e1-8c0a-002564c97630")
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
                this.theEditedElement.setTarget((ActivityNode) value);
                break;
            case 3:
                this.theEditedElement.setGuard((String) value);
                break;
            case 4:
                this.theEditedElement.setWeight((String) value);
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
