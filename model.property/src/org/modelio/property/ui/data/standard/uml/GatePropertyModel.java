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
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.property.ui.data.standard.common.AbstractPropertyModel;
import org.modelio.vcore.session.impl.CoreSession;

/**
 * <i>Gate</i> data model.
 * <p>
 * This class provides the list of properties for the <i>Gate</i> metaclass.
 */
@objid ("8f205868-c068-11e1-8c0a-002564c97630")
public class GatePropertyModel extends AbstractPropertyModel<Gate> {
    /**
     * Properties to display for <i>Gate</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li> for the first row the value is the table header label (usually the metaclass name)
     * <li> for otheEditedElement rows the values usually match the meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("a7363d16-c068-11e1-8c0a-002564c97630")
    private static final String[] PROPERTIES = new String[] {"Gate", "Name", "Formal"};

    @objid ("fa7394b4-c5d4-11e1-8f21-002564c97630")
    private StringType stringType;

    @objid ("fa7394b5-c5d4-11e1-8f21-002564c97630")
    private StringType labelStringType;

    @objid ("fa7394b6-c5d4-11e1-8f21-002564c97630")
    private SingleElementType gateType;

    /**
     * Create a new <i>Gate</i> data model from an <i>Gate</i>.
     * @param model
     */
    @objid ("8f205873-c068-11e1-8c0a-002564c97630")
    public GatePropertyModel(Gate theEditedElement) {
        super(theEditedElement);
        
        this.labelStringType = new StringType(false);
        this.stringType = new StringType(true);
        this.gateType = new SingleElementType(false, Gate.class, CoreSession.getSession(this.theEditedElement));
    }

    /**
     * The number of columns that the properties table must display.
     * @return the number of columns
     */
    @objid ("8f205879-c068-11e1-8c0a-002564c97630")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    /**
     * The number of rows that the properties table must display.
     * @return the number of rows
     */
    @objid ("8f20587e-c068-11e1-8c0a-002564c97630")
    @Override
    public int getRowsNumber() {
        return GatePropertyModel.PROPERTIES.length;
    }

    /**
     * Return the value that will be displayed at the specified row and column.
     * <p>
     * The first column contains the properties names.
     * @param row the row number
     * @param col the column number
     * @return the value corresponding to the row and column
     */
    @objid ("8f205883-c068-11e1-8c0a-002564c97630")
    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
        case 0: // col 0 is the property key
            return GatePropertyModel.PROPERTIES[row];
        case 1: // col 1 is the property value
            switch (row) {
                case 0: // Header
                    return "Value";
                case 1:
                    return this.theEditedElement.getName();
                case 2:
                    return this.theEditedElement.getFormal();
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
    @objid ("8f21dee5-c068-11e1-8c0a-002564c97630")
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
                    return this.gateType;
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
    @objid ("8f21deed-c068-11e1-8c0a-002564c97630")
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
                    this.theEditedElement.setFormal((Gate) value);
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
