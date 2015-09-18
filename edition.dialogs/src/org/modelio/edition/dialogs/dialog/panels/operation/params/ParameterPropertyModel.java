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
                                    

package org.modelio.edition.dialogs.dialog.panels.operation.params;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.core.ui.ktable.IPropertyModel;
import org.modelio.core.ui.ktable.types.IPropertyType;
import org.modelio.core.ui.ktable.types.element.SingleElementType;
import org.modelio.core.ui.ktable.types.enumeration.EnumType;
import org.modelio.core.ui.ktable.types.header.HeaderType;
import org.modelio.core.ui.ktable.types.image.ImageDisplayType;
import org.modelio.core.ui.ktable.types.label.LabelType;
import org.modelio.core.ui.ktable.types.list.EditableListType;
import org.modelio.core.ui.ktable.types.text.StringType;
import org.modelio.edition.dialogs.dialog.panels.operation.IOperationPropertyModel;
import org.modelio.edition.dialogs.plugin.EditionDialogs;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.PassingMode;
import org.modelio.vcore.session.impl.CoreSession;

/**
 * Data model for an operation parameter in the Operation Wizard.
 */
@objid ("77e6695e-24c6-40c4-a802-61e1db5df249")
class ParameterPropertyModel implements IPropertyModel {
    @objid ("392e57bb-400b-470b-b14a-9f34eba78711")
    private IOperationPropertyModel model = null;

    @objid ("25548ca3-3620-49a1-9261-3dfaf43cf5ba")
    private HeaderType headerType = null;

    @objid ("3cde9522-6894-4880-bbbe-248dd3818375")
    private EnumType passingType = null;

    @objid ("eb52a786-3e3e-4af1-b722-65cb0453731c")
    private SingleElementType generalClassType = null;

    @objid ("30633149-2183-4fb8-bb49-54b5d18a2ca3")
    private EditableListType cardinalityType = null;

    @objid ("413c6afd-7125-4bca-a48a-69620faff235")
    private LabelType labelType = null;

    @objid ("fe509685-200f-49a0-97fe-dd7d235b055f")
    private ImageDisplayType parameterImageType = null;

    @objid ("14a09f0f-7195-4b0f-a4f1-83045d0ad3cb")
    private ImageDisplayType returnParameterImageType = null;

    @objid ("c2edca59-3d31-4f19-9460-e0a324a42dbf")
    private StringType leftStringType = null;

    /**
     * Default c'tor.
     * @param model the parameter's owner operation model.
     */
    @objid ("d6c3565f-cba8-439b-8264-bff284934f3a")
    public ParameterPropertyModel(IOperationPropertyModel model) {
        this.model = model;
        
        this.headerType = new HeaderType();
        
        this.labelType = new LabelType();
        
        this.parameterImageType = new ImageDisplayType(Parameter.class, "IO");
        this.returnParameterImageType = new ImageDisplayType(Parameter.class, "Return");
        
        this.passingType = new EnumType(PassingMode.class);
        
        this.leftStringType = new StringType(true);
        
        
        this.generalClassType = new SingleElementType(false, GeneralClass.class, CoreSession.getSession(model.getOperation()));
        this.generalClassType.setDisplayOwner(false);
        
        final List<String> cardinalityValues = new ArrayList<>();
        cardinalityValues.add("0..1");
        cardinalityValues.add("1");
        cardinalityValues.add("*");
        this.cardinalityType = new EditableListType(true, cardinalityValues);
    }

    @objid ("ac1a8fb1-240e-4fb0-814a-b40bcdcf90c6")
    @Override
    public int getColumnNumber() {
        return 6;
    }

    @objid ("e847c82d-cf24-42ca-a508-bad24dc45cc2")
    @Override
    public int getRowsNumber() {
        return this.model.getIOParameterSize() + 2;
    }

    @objid ("8ca24034-b22a-408a-81d6-b8ad52365134")
    @Override
    public IPropertyType getTypeAt(int row, int col) {
        if (row == 0) {
            // Header
            return this.headerType;
        } else if (row == 1) {
            // Return parameter
            switch (col) {
            case 0:
                return this.returnParameterImageType;
            case 1:
                return this.leftStringType;
            case 2:
                return this.generalClassType;
            case 3:
                return this.cardinalityType;
            default:
                return this.labelType;
            }
        } else {
            // IO Parameter
            switch (col) {
            case 0:
                return this.parameterImageType;
            case 1:
                return this.leftStringType;
            case 2:
                return this.generalClassType;
            case 3:
                return this.cardinalityType;
            case 4:
                return this.passingType;
            case 5:
                return this.leftStringType;
            default:
                return null;
            }
        }
    }

    @objid ("e94a34eb-e077-4add-90a0-e0107b714a41")
    @Override
    public Object getValueAt(int row, int col) {
        if (row == 0) {
            // Header
            switch (col) {
            case 0:
                return "";
            case 1:
                return EditionDialogs.I18N.getString("OperationEditPanel.pName");
            case 2:
                return EditionDialogs.I18N.getString("OperationEditPanel.pType");
            case 3:
                return EditionDialogs.I18N.getString("OperationEditPanel.pCard");
            case 4:
                return EditionDialogs.I18N.getString("OperationEditPanel.pPassing");
            case 5:
                return EditionDialogs.I18N.getString("OperationEditPanel.pValue");
            default:
                return "";
            }
        } else if (row == 1) {
            // Return parameter
            switch (col) {
            case 0:
                return "";
            case 1:
                return EditionDialogs.I18N.getString("OperationEditPanel.rpName");
            case 2:
                return this.model.getReturnParameterType();
            case 3:
                return getReturnParameterCardinality();
            default:
                return "";
            }
        } else {
            // IO Parameter
            switch (col) {
            case 0:
                return "";
            case 1:
                return this.model.getParameterName(row - 2);
            case 2:
                return this.model.getParameterType(row - 2);
            case 3:
                return getParameterCardinality(row - 2);
            case 4:
                return this.model.getParameterPassingMode(row - 2);
            case 5:
                return this.model.getParameterDefaultValue(row - 2);
            default:
                return "";
            }
        }
    }

    @objid ("b3fed7df-5f5d-44c0-9097-80addf7086fe")
    private String getParameterCardinality(int index) {
        final String multiplicityMin = this.model.getParameterMultiplicityMin(index);
        final String multiplicityMax = this.model.getParameterMultiplicityMax(index);
        
        if (multiplicityMin.equals(multiplicityMax)) {
            return multiplicityMax;
        } else if (multiplicityMax.equals("*")) {
            return "0..*";
        } else {
            return multiplicityMin + ".." + multiplicityMax;
        }
    }

    @objid ("42ad5076-b49b-4920-955a-b288c34315e6")
    @Override
    public boolean isEditable(int row, int col) {
        if (row < 1) {
            return false;
        } else if (row == 1) {
            if (col == 2) {
                return this.model.isReturnParameterModifiable();
            } else if (col == 3) {
                return this.model.getReturnParameter() != null && this.model.isReturnParameterModifiable();
            }
            return false;
        } else {
            return this.model.isParameterModifiable(row - 2);
        }
    }

    @objid ("c992995b-dff8-40ad-9da3-938939f0a551")
    @Override
    public void setValueAt(int row, int col, Object value) {
        if (row == 0) {
            // Header
            return;
        } else if (row == 1) {
            switch (col) {
            case 2:
                this.model.setReturnParameterType((GeneralClass) value);
                break;
            case 3:
                setReturnParameterCardinality((String) value);
                break;
            default:
                return;
            }
        } else {
            switch (col) {
            case 0:
                break;
            case 1:
                this.model.setParameterName(row - 2, (String) value);
                break;
            case 2:
                this.model.setParameterType(row - 2, (GeneralClass) value);
                break;
            case 3:
                setParameterCardinality(row - 2, (String) value);
                break;
            case 4:
                this.model.setParameterPassingMode(row - 2, (PassingMode) value);
                break;
            case 5:
                this.model.setParameterDefaultValue(row - 2, (String) value);
                break;
            default:
                return;
            }
        }
    }

    @objid ("3380d66f-ef80-499e-8ea3-bf0a6bf4c29c")
    private void setParameterCardinality(int index, String value) {
        final String[] values = value.split("\\.\\.");
        
        if (values.length == 1 && values[0].equals("*")) {
            this.model.setParameterMultiplicityMin(index, "0");
            this.model.setParameterMultiplicityMax(index, values[0]);
        } else if (values.length == 1) {
            this.model.setParameterMultiplicityMin(index, values[0]);
            this.model.setParameterMultiplicityMax(index, values[0]);
        } else if (values.length == 2) {
            this.model.setParameterMultiplicityMin(index, values[0]);
            this.model.setParameterMultiplicityMax(index, values[1]);
        }
    }

    @objid ("51763901-43de-4cb4-9191-1c2b0e590f94")
    private String getReturnParameterCardinality() {
        final String multiplicityMin = this.model.getReturnParameterMultiplicityMin();
        final String multiplicityMax = this.model.getReturnParameterMultiplicityMax();
        
        if (multiplicityMin.equals(multiplicityMax)) {
            return multiplicityMax;
        } else if (multiplicityMax.equals("*")) {
            return "0..*";
        } else {
            return multiplicityMin + ".." + multiplicityMax;
        }
    }

    @objid ("0b42ba10-2b89-4d88-9f5a-516cc87c7787")
    private void setReturnParameterCardinality(String value) {
        final String[] values = value.split("\\.\\.");
        
        if (values.length == 1 && values[0].equals("*")) {
            this.model.setReturnParameterMultiplicityMin("0");
            this.model.setReturnParameterMultiplicityMax(values[0]);
        } else if (values.length == 1) {
            this.model.setReturnParameterMultiplicityMin(values[0]);
            this.model.setReturnParameterMultiplicityMax(values[0]);
        } else if (values.length == 2) {
            this.model.setReturnParameterMultiplicityMin(values[0]);
            this.model.setReturnParameterMultiplicityMax(values[1]);
        }
    }

}
