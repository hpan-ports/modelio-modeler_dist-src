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
                                    

package org.modelio.edition.dialogs.dialog.panels.operation;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.core.ui.ktable.IPropertyModel;
import org.modelio.core.ui.ktable.types.IPropertyType;
import org.modelio.core.ui.ktable.types.bool.BooleanType;
import org.modelio.core.ui.ktable.types.enumeration.EnumType;
import org.modelio.core.ui.ktable.types.header.HeaderType;
import org.modelio.core.ui.ktable.types.label.LabelType;
import org.modelio.core.ui.ktable.types.list.ListType;
import org.modelio.metamodel.uml.statik.MethodPassingMode;
import org.modelio.metamodel.uml.statik.VisibilityMode;

/**
 * <i>Operation</i> data model.
 * <p>
 * This class provides the list of properties for the <i>Operation</i> metaclass.
 * <p>
 * WARNING: This data model has been automaticaly generated.
 * <p>
 * MODIFICATION POLICY: If this data model needs to be manualy modified, change the warning message by
 * "This data model has been manually updated"
 */
@objid ("f84a5177-b322-4764-8373-839f652ffdf7")
public class OperationPropertyModel implements IPropertyModel {
    /**
     * Properties to display for <i>Operation</i>.
     * <p>
     * This array contains the first column values:
     * <ul>
     * <li>for the first row the value is the table header label (usually the metaclass name)
     * <li>for other rows the values usually match the meta-attributes and roles names of the metaclass
     * </ul>
     */
    @objid ("240b1924-b952-4e33-828c-54cc321af8c9")
    private static final String[] properties = new String[] { "Property", "OperationType", "Visibility", "IsAbstract", "IsClass",
            "Final", "Passing" };

    /**
     * The <i>Operation</i> that corresponds to this data model.
     */
    @objid ("6aa47c2a-7399-4dbb-9ba0-c4c62f4896a2")
    private IOperationPropertyModel model = null;

    @objid ("0ccf28a3-3dc3-45df-97ea-1ad5ebae7812")
    private HeaderType headerType = null;

    @objid ("f672219f-dea7-4f4a-bc86-b3053ff543d4")
    private ListType operationTypeType = null;

    @objid ("4f084b22-a580-4fbd-a425-62505fc0ab5d")
    private LabelType labelType = null;

    @objid ("caa57164-4ad1-486d-bd66-af851f1ededd")
    private BooleanType booleanType = null;

    @objid ("0cfa755c-6226-41fe-b176-bfd62d2f3233")
    private EnumType visibilityType = null;

    @objid ("5bc91ff3-b419-4efd-8dc3-10efdb6e76f4")
    private EnumType methodPassingModeEnumType = null;

    /**
     * Create a new <i>Operation</i> data model from an <i>Operation</i>.
     */
    @objid ("e1377853-6fb2-42a2-b59e-2972b5733505")
    public OperationPropertyModel(IOperationPropertyModel model) {
        this.model = model;
        
        this.headerType = new HeaderType();
        this.labelType = new LabelType();
        this.booleanType = new BooleanType();
        List<String> operationTypeList = new ArrayList<>();
        operationTypeList.add("Operation");
        operationTypeList.add("Constructor");
        operationTypeList.add("Destructor");
        this.operationTypeType = new ListType(false, operationTypeList);
        this.visibilityType = new EnumType(VisibilityMode.class);
        this.methodPassingModeEnumType = new EnumType(MethodPassingMode.class);
    }

    /**
     * The number of columns that the properties table must display.
     * @return the number of columns
     */
    @objid ("89ad1cca-2af8-416d-808c-402ede79ca06")
    @Override
    public int getColumnNumber() {
        return 2;
    }

    /**
     * The number of rows that the properties table must display.
     * @return the number of rows
     */
    @objid ("dd5720c4-d1a0-4e84-bc88-f54a3d4af51b")
    @Override
    public int getRowsNumber() {
        if (this.model.isClass()) {
            return OperationPropertyModel.properties.length - 1;
        } else {
            return OperationPropertyModel.properties.length;
        }
    }

    /**
     * Return the value that will be displayed at the specified row and column.
     * <p>
     * The first column contains the properties names.
     * @param row the row number
     * @param col the column number
     * @return the value corresponding to the row and column
     */
    @objid ("20a679ac-69ab-4499-b081-62c45e1e28b0")
    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
        case 0: // col 0 is the property key
            return OperationPropertyModel.properties[row];
        case 1: // col 1 is the property value
            switch (row) {
            case 0: // Header
                return "Value";
            case 1:
                return this.model.getOperationType();
            case 2:
                return this.model.getVisibility();
            case 3:
                return this.model.isAbstract();
            case 4:
                return this.model.isClass();
            case 5:
                return this.model.isFinal();
            case 6:
                return this.model.getPassing();
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
     * This type will be used to choose an editor and a renderer for each cell of the properties table.
     * <p>
     * The first column contains the properties names.
     * @param row the row number
     * @param col the column number
     * @return the type of the element corresponding to the row and column
     */
    @objid ("f4d64ffc-070d-4fa2-ad56-bb15b208323d")
    @Override
    public IPropertyType getTypeAt(int row, int col) {
        switch (col) {
        case 0: // col 0 is the property key type
            switch (row) {
            case 0: // Header
                return this.headerType;
            default:
                return this.labelType;
            }
        case 1: // col 1 is the property value type
            switch (row) {
            case 0: // Header
                return this.headerType;
            case 1:
                return this.operationTypeType;
            case 2:
                return this.visibilityType;
            case 3:
                return this.booleanType;
            case 4:
                return this.booleanType;
            case 5:
                return this.booleanType;
            case 6:
                return this.methodPassingModeEnumType;
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
    @objid ("95942f21-e07b-44cc-8883-116fce99079f")
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
                this.model.setOperationType((String) value);
                return;
            case 2:
                this.model.setVisibility((VisibilityMode) value);
                break;
            case 3:
                this.model.setAbstract((Boolean) value);
                return;
            case 4:
                this.model.setClass((Boolean) value);
                return;
            case 5:
                this.model.setFinal((Boolean) value);
                return;
            case 6:
                this.model.setPassing((MethodPassingMode) value);
                return;
            default:
                return;
            }
            return;
        default:
            return;
        }
    }

    @objid ("2973fdf0-096f-40cd-a0d0-d7befe56589b")
    @Override
    public boolean isEditable(int row, int col) {
        if (row < 1) {
            return false;
        } else {
            return this.model.isModifiable();
        }
    }

}
