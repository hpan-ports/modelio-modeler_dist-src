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
/*   Metamodel version: 9019              */
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
    @objid ("b685a492-7e4b-4555-9e3b-ce145bf26380")
    @Override
    public QueryDefinition getLinesDefinition() {
        return (QueryDefinition) getDepVal(MatrixDefinitionData.Metadata.LinesDefinitionDep());
    }

    @objid ("173bccf7-b460-4794-a15d-d380dfaa896c")
    @Override
    public void setLinesDefinition(QueryDefinition value) {
        appendDepVal(MatrixDefinitionData.Metadata.LinesDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("fe0161fe-867c-4ad5-bec3-3a34bb6cdf70")
    @Override
    public QueryDefinition getColumnsDefinition() {
        return (QueryDefinition) getDepVal(MatrixDefinitionData.Metadata.ColumnsDefinitionDep());
    }

    @objid ("9e7c2d76-9812-4337-9975-ad34a657f1b4")
    @Override
    public void setColumnsDefinition(QueryDefinition value) {
        appendDepVal(MatrixDefinitionData.Metadata.ColumnsDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("e7e7d92e-6b1d-48bc-9d2c-bc12d1994ad1")
    @Override
    public MatrixValueDefinition getValuesDefinition() {
        return (MatrixValueDefinition) getDepVal(MatrixDefinitionData.Metadata.ValuesDefinitionDep());
    }

    @objid ("e9b717e9-dbfd-4cae-bfd5-65a5a33b4694")
    @Override
    public void setValuesDefinition(MatrixValueDefinition value) {
        appendDepVal(MatrixDefinitionData.Metadata.ValuesDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("5241c4c1-05b9-47cc-a83b-220fa9b3fae8")
    @Override
    public QueryDefinition getDepthDefinition() {
        return (QueryDefinition) getDepVal(MatrixDefinitionData.Metadata.DepthDefinitionDep());
    }

    @objid ("2b668731-68bf-4e8c-b7db-d0a4c507d39d")
    @Override
    public void setDepthDefinition(QueryDefinition value) {
        appendDepVal(MatrixDefinitionData.Metadata.DepthDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("347fcf9d-1546-4631-9909-d0ea09cd00a0")
    @Override
    public ModelElement getOwner() {
        return (ModelElement) getDepVal(MatrixDefinitionData.Metadata.OwnerDep());
    }

    @objid ("5c88d817-7f8d-4d29-a771-c173f8a39e9c")
    @Override
    public void setOwner(ModelElement value) {
        appendDepVal(MatrixDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("a32085aa-856d-4f91-be8d-c800eb2a7c59")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MatrixDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e49ac2c3-2712-4a77-b9e2-1cec8b9528dc")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MatrixDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(MatrixDefinitionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("1bb3f6c8-84fc-40b4-8070-312474e0091e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMatrixDefinition(this);
        else
          return null;
    }

}
