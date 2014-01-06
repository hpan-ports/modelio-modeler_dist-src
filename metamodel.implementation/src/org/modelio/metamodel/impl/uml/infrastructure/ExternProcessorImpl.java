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
    @objid ("d50bdfd1-658e-49e9-9df9-f6ea4e4e8350")
    @Override
    public String getClassName() {
        return (String) getAttVal(ExternProcessorData.Metadata.ClassNameAtt());
    }

    @objid ("4c90e6d1-88b6-4dcd-a2c1-93dfb82dea05")
    @Override
    public void setClassName(String value) {
        setAttVal(ExternProcessorData.Metadata.ClassNameAtt(), value);
    }

    @objid ("83d1fd13-900d-4e7a-8d53-4d8102b864ec")
    @Override
    public QueryDefinition getOwnerQuery() {
        return (QueryDefinition) getDepVal(ExternProcessorData.Metadata.OwnerQueryDep());
    }

    @objid ("307d528d-0ec5-4dec-9518-b72c94c6860d")
    @Override
    public void setOwnerQuery(QueryDefinition value) {
        appendDepVal(ExternProcessorData.Metadata.OwnerQueryDep(), (SmObjectImpl)value);
    }

    @objid ("2f782f45-6cc4-4198-86c4-88f8e85394c0")
    @Override
    public MatrixValueDefinition getOwnerValDef() {
        return (MatrixValueDefinition) getDepVal(ExternProcessorData.Metadata.OwnerValDefDep());
    }

    @objid ("a13279ba-4812-481f-b1f3-b8b795149609")
    @Override
    public void setOwnerValDef(MatrixValueDefinition value) {
        appendDepVal(ExternProcessorData.Metadata.OwnerValDefDep(), (SmObjectImpl)value);
    }

    @objid ("e81d9f85-d073-43ea-a79d-e45b18908986")
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

    @objid ("fac0d9b5-c6d9-4395-ab44-b5f7417fd4c4")
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

    @objid ("30563141-6383-42a6-8d7a-a104e140eab8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternProcessor(this);
        else
          return null;
    }

}
