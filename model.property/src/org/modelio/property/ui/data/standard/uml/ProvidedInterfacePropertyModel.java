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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.core.ui.ktable.types.IPropertyType;
import org.modelio.core.ui.ktable.types.element.MultipleElementType;
import org.modelio.core.ui.ktable.types.text.StringType;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.property.ui.data.standard.common.AbstractPropertyModel;
import org.modelio.vcore.session.api.model.IModel;

/**
 * <i>ProvidedInterface</i> data model.
 * <p>
 * This class provides the list of properties for the <i>ProvidedInterface</i> metaclass.
 */
@objid ("8f6c4624-c068-11e1-8c0a-002564c97630")
public class ProvidedInterfacePropertyModel extends AbstractPropertyModel<ProvidedInterface> {
    /**
     * Properties to display for <i>ProvidedInterface</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li> for the first row the value is the table header label (usually the metaclass name)
     * <li> for otheEditedElement rows the values usually match the meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("a8153328-c068-11e1-8c0a-002564c97630")
    private static final String[] PROPERTIES = new String[] {"ProvidedInterface", "ProvidedElement"};

    @objid ("8f6ea72e-c068-11e1-8c0a-002564c97630")
    private StringType labelStringType = null;

    @objid ("8f6ea72f-c068-11e1-8c0a-002564c97630")
    private MultipleElementType providedInterfaces = null;

    /**
     * Create a new <i>ProvidedInterface</i> data model from an <i>ProvidedInterface</i>.
     */
    @objid ("8f6ea730-c068-11e1-8c0a-002564c97630")
    public ProvidedInterfacePropertyModel(ProvidedInterface theEditedElement, IModel model) {
        super(theEditedElement);
        
        this.labelStringType = new StringType(false);
        this.providedInterfaces = new MultipleElementType(true, theEditedElement, "ProvidedElement", Interface.class, model);
    }

    /**
     * The number of columns that the properties table must display.
     * @return the number of columns
     */
    @objid ("8f6ea736-c068-11e1-8c0a-002564c97630")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    /**
     * The number of rows that the properties table must display.
     * @return the number of rows
     */
    @objid ("8f6ea73b-c068-11e1-8c0a-002564c97630")
    @Override
    public int getRowsNumber() {
        return ProvidedInterfacePropertyModel.PROPERTIES.length;
    }

    /**
     * Return the value that will be displayed at the specified row and column.
     * <p>
     * The first column contains the properties names.
     * @param row the row number
     * @param col the column number
     * @return the value corresponding to the row and column
     */
    @objid ("8f6ea740-c068-11e1-8c0a-002564c97630")
    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
        case 0: // col 0 is the property key
            return ProvidedInterfacePropertyModel.PROPERTIES[row];
        case 1: // col 1 is the property value
            switch (row) {
                case 0: // Header
                    return "Value";
                case 1:
                    return this.theEditedElement.getProvidedElement();
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
    @objid ("8f6ea746-c068-11e1-8c0a-002564c97630")
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
                    return this.providedInterfaces;
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
    @objid ("8f6ea74c-c068-11e1-8c0a-002564c97630")
    @Override
    @SuppressWarnings("unchecked")
    public void setValueAt(int row, int col, Object value) {
        switch (col) {
        case 0: // Keys cannot be modified
            return;
        case 1: // col 1 is the property value
            switch (row) {
                case 0:
                    return; // Header cannot be modified
                case 1:
                    for (Interface s : this.theEditedElement.getProvidedElement())
                        this.theEditedElement.getProvidedElement().remove(s);
                    
                    List<Interface> newcontent = (List<Interface>)value;
                    for (Interface s : newcontent)
                        this.theEditedElement.getProvidedElement().add(s);
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
