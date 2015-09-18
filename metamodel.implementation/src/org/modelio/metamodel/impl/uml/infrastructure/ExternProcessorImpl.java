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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.ExternProcessorData;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
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

@objid ("19257ea4-a0e7-4d4a-a390-75b7f65742f4")
public class ExternProcessorImpl extends ModelElementImpl implements ExternProcessor {
    @objid ("a894a66d-ebde-4fbe-a6ee-ae993ea675ac")
    @Override
    public String getClassName() {
        return (String) getAttVal(ExternProcessorData.Metadata.ClassNameAtt());
    }

    @objid ("8b1040ef-0671-42c1-b06a-d0683d6663bd")
    @Override
    public void setClassName(String value) {
        setAttVal(ExternProcessorData.Metadata.ClassNameAtt(), value);
    }

    @objid ("d5e13078-5300-40cc-89a1-a369b96e229a")
    @Override
    public QueryDefinition getOwnerQuery() {
        return (QueryDefinition) getDepVal(ExternProcessorData.Metadata.OwnerQueryDep());
    }

    @objid ("0f191eb0-f795-4798-ac42-550e732375c8")
    @Override
    public void setOwnerQuery(QueryDefinition value) {
        appendDepVal(ExternProcessorData.Metadata.OwnerQueryDep(), (SmObjectImpl)value);
    }

    @objid ("0e6bac6f-f171-4d06-944d-94e4e169dae8")
    @Override
    public MatrixValueDefinition getOwnerValDef() {
        return (MatrixValueDefinition) getDepVal(ExternProcessorData.Metadata.OwnerValDefDep());
    }

    @objid ("91b0e93f-2c96-4e86-81f6-392bdda7db21")
    @Override
    public void setOwnerValDef(MatrixValueDefinition value) {
        appendDepVal(ExternProcessorData.Metadata.OwnerValDefDep(), (SmObjectImpl)value);
    }

    @objid ("8c213cae-0677-44b6-86e3-1e9abefa97ca")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternProcessorData.Metadata.OwnerQueryDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ExternProcessorData.Metadata.OwnerValDefDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e4baf115-529d-4362-84e2-c78086f30653")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExternProcessorData.Metadata.OwnerQueryDep());
        if (obj != null)
          return new SmDepVal(ExternProcessorData.Metadata.OwnerQueryDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ExternProcessorData.Metadata.OwnerValDefDep());
        if (obj != null)
          return new SmDepVal(ExternProcessorData.Metadata.OwnerValDefDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c90e4b28-ec0c-4b5d-b4e9-8d800aacb5b9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternProcessor(this);
        else
          return null;
    }

}
