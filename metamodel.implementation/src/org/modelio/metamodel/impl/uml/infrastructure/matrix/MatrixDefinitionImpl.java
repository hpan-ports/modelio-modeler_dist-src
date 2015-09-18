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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.impl.uml.infrastructure.matrix;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("ce758e96-007e-4b95-9c1f-1964de5db680")
public class MatrixDefinitionImpl extends ModelElementImpl implements MatrixDefinition {
    @objid ("121aa6cb-bb58-4352-ae32-b7c002f2e855")
    @Override
    public QueryDefinition getLinesDefinition() {
        return (QueryDefinition) getDepVal(MatrixDefinitionData.Metadata.LinesDefinitionDep());
    }

    @objid ("dea99665-6806-4e09-85c2-b5a1d436b6c3")
    @Override
    public void setLinesDefinition(QueryDefinition value) {
        appendDepVal(MatrixDefinitionData.Metadata.LinesDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("dfc389a3-cf13-4e85-8b52-65cd2cfb8765")
    @Override
    public QueryDefinition getColumnsDefinition() {
        return (QueryDefinition) getDepVal(MatrixDefinitionData.Metadata.ColumnsDefinitionDep());
    }

    @objid ("fc49dad1-cbe9-49a4-ac72-396a2c6ba983")
    @Override
    public void setColumnsDefinition(QueryDefinition value) {
        appendDepVal(MatrixDefinitionData.Metadata.ColumnsDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("c0fc6df5-d12c-48af-9167-3eec168d47f8")
    @Override
    public MatrixValueDefinition getValuesDefinition() {
        return (MatrixValueDefinition) getDepVal(MatrixDefinitionData.Metadata.ValuesDefinitionDep());
    }

    @objid ("7f473e5c-8bf0-438d-8e27-c298e7c726c7")
    @Override
    public void setValuesDefinition(MatrixValueDefinition value) {
        appendDepVal(MatrixDefinitionData.Metadata.ValuesDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("5f76b031-3d27-44fc-b293-c38f98f2017e")
    @Override
    public QueryDefinition getDepthDefinition() {
        return (QueryDefinition) getDepVal(MatrixDefinitionData.Metadata.DepthDefinitionDep());
    }

    @objid ("c83c527d-84ec-4ffe-bc72-51a68403632a")
    @Override
    public void setDepthDefinition(QueryDefinition value) {
        appendDepVal(MatrixDefinitionData.Metadata.DepthDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("1b957c46-a729-4c99-9914-9f6002ed9dc4")
    @Override
    public ModelElement getOwner() {
        return (ModelElement) getDepVal(MatrixDefinitionData.Metadata.OwnerDep());
    }

    @objid ("420fe3e7-27ed-49e7-a3f0-92b98e918a41")
    @Override
    public void setOwner(ModelElement value) {
        appendDepVal(MatrixDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("7f36a246-32cd-4988-9ba7-83d444f7cd11")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MatrixDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("3dd7713c-fbd0-4e4c-b0f2-4fef4d746373")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MatrixDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(MatrixDefinitionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7bd30912-32b0-4118-95be-8244427d853f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMatrixDefinition(this);
        else
          return null;
    }

}
