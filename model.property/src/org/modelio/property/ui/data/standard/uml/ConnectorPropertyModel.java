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
import org.modelio.core.ui.ktable.types.text.StringType;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.property.ui.data.standard.common.AbstractPropertyModel;

/**
 * <i>Connector</i> data model.
 * <p>
 * This class provides the list of properties for the <i>Connector</i> metaclass.
 */
@objid ("c56f860c-2af3-4d8a-8786-3a572d399212")
public class ConnectorPropertyModel extends AbstractPropertyModel<Connector> {
    /**
     * Properties to display for <i>Connector</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li> for the first row the value is the table header label (usually the metaclass name)
     * <li> for other rows the values usually match the meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("1edcbf45-917c-453b-b6f3-f0cdb7b6dab0")
    private static final String[] PROPERTIES = new String[] {"Connector", "Name"};

    @objid ("e773e39c-a853-4669-8d5d-98dfcee62097")
    private StringType labelStringType;

    @objid ("0f4c1135-03f0-4f3b-9f27-c19c313aef3f")
    private StringType stringType;

    /**
     * Create a new <i>Connector</i> data model from an <i>Connector</i>.
     */
    @objid ("bfda87b5-4b64-4d07-bf62-fc5d2cc7bf7d")
    public ConnectorPropertyModel(Connector theConnector) {
        super(theConnector);
        
        this.labelStringType = new StringType(false);
        this.stringType = new StringType(true);
    }

    /**
     * The number of columns that the properties table must display.
     * @return the number of columns
     */
    @objid ("98455b90-48b4-485d-a7b9-d9656341686c")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    /**
     * The number of rows that the properties table must display.
     * @return the number of rows
     */
    @objid ("37d5e78f-4e87-4bef-8cc9-9b5b02856da5")
    @Override
    public int getRowsNumber() {
        return ConnectorPropertyModel.PROPERTIES.length;
    }

    /**
     * Return the value that will be displayed at the specified row and column.
     * <p>
     * The first column contains the properties names.
     * @param row the row number
     * @param col the column number
     * @return the value corresponding to the row and column
     */
    @objid ("71e4e71e-f33d-43c1-9200-57f088daac9f")
    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
        case 0: // col 0 is the property key
            return ConnectorPropertyModel.PROPERTIES[row];
        case 1: // col 1 is the property value
            switch (row) {
                case 0: // Header
                    return "Value";
                case 1:
                    return this.theEditedElement.getName();
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
    @objid ("666994da-05c9-445b-8353-b593f69b6016")
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
    @objid ("34826a75-d053-468a-9897-bb2cf771cc5c")
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
                default:
                    return;
            }
              break;
        default:
            return;
        }
    }

}
