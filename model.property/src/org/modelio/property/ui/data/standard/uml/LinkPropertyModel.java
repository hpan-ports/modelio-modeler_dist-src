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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.property.ui.data.standard.common.AbstractPropertyModel;

/**
 * <i>Link</i> data model.
 * <p>
 * This class provides the list of properties for the <i>Link</i> metaclass.
 */
@objid ("58695f41-dc99-4174-ad62-28ca35d93641")
public class LinkPropertyModel extends AbstractPropertyModel<Link> {
    /**
     * Properties to display for <i>Link</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li> for the first row the value is the table header label (usually the metaclass name)
     * <li> for other rows the values usually match the meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("7b38e00e-46d5-4116-aef6-3174ef4ad764")
    private static final String[] PROPERTIES = new String[] {"Link", "Name"};

    @objid ("4b260c73-ae70-4370-8a18-52efbb1cb5ab")
    private StringType labelStringType;

    @objid ("779ee1b6-ca9f-480a-a24a-4e541bf8898e")
    private StringType stringType;

    /**
     * Create a new <i>Link</i> data model from an <i>Link</i>.
     */
    @objid ("ccd6daf8-b258-4745-8bcc-f4bfdc9f58c2")
    public LinkPropertyModel(Link theLink) {
        super(theLink);
        
        this.labelStringType = new StringType(false);
        this.stringType = new StringType(true);
    }

    /**
     * The number of columns that the properties table must display.
     * @return the number of columns
     */
    @objid ("ba5ea08a-befa-4bf5-8355-23ae9c8aa4f8")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    /**
     * The number of rows that the properties table must display.
     * @return the number of rows
     */
    @objid ("9f91e6c6-2bef-4128-991d-94db6fc94544")
    @Override
    public int getRowsNumber() {
        return LinkPropertyModel.PROPERTIES.length;
    }

    /**
     * Return the value that will be displayed at the specified row and column.
     * <p>
     * The first column contains the properties names.
     * @param row the row number
     * @param col the column number
     * @return the value corresponding to the row and column
     */
    @objid ("1c663857-7eb9-444a-8373-9ca4c190867b")
    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
        case 0: // col 0 is the property key
            return LinkPropertyModel.PROPERTIES[row];
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
    @objid ("041ec433-6236-419f-96c9-81ad295ea199")
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
    @objid ("90e5035c-e8e1-49fe-bd2b-790806f14a00")
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
