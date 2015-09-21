/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ExternProcessorData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("19257ea4-a0e7-4d4a-a390-75b7f65742f4")
public class ExternProcessorImpl extends ModelElementImpl implements ExternProcessor {
    @objid ("d363f370-18ae-4bf0-a6a6-7656367ae467")
    @Override
    public String getClassName() {
        return (String) getAttVal(((ExternProcessorSmClass)getClassOf()).getClassNameAtt());
    }

    @objid ("2e62df59-f262-4d24-a88e-ff03f2bbeaaa")
    @Override
    public void setClassName(String value) {
        setAttVal(((ExternProcessorSmClass)getClassOf()).getClassNameAtt(), value);
    }

    @objid ("cc263ca7-b994-47b3-b01a-3a1ed61319c5")
    @Override
    public QueryDefinition getOwnerQuery() {
        Object obj = getDepVal(((ExternProcessorSmClass)getClassOf()).getOwnerQueryDep());
        return (obj instanceof QueryDefinition)? (QueryDefinition)obj : null;
    }

    @objid ("3003ee13-cc8b-47e4-afc9-b1ced446b179")
    @Override
    public void setOwnerQuery(QueryDefinition value) {
        appendDepVal(((ExternProcessorSmClass)getClassOf()).getOwnerQueryDep(), (SmObjectImpl)value);
    }

    @objid ("dedfa92a-9363-477e-bad3-9d8e3d340bbd")
    @Override
    public MatrixValueDefinition getOwnerValDef() {
        Object obj = getDepVal(((ExternProcessorSmClass)getClassOf()).getOwnerValDefDep());
        return (obj instanceof MatrixValueDefinition)? (MatrixValueDefinition)obj : null;
    }

    @objid ("4686f346-4ab9-4144-a274-90998b012867")
    @Override
    public void setOwnerValDef(MatrixValueDefinition value) {
        appendDepVal(((ExternProcessorSmClass)getClassOf()).getOwnerValDefDep(), (SmObjectImpl)value);
    }

    @objid ("3b0ef1a3-e11b-4dd6-a80a-36f6f7d8c036")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerQuery
        obj = (SmObjectImpl)this.getDepVal(((ExternProcessorSmClass)getClassOf()).getOwnerQueryDep());
        if (obj != null)
          return obj;
        // OwnerValDef
        obj = (SmObjectImpl)this.getDepVal(((ExternProcessorSmClass)getClassOf()).getOwnerValDefDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c19ab4ab-e381-494b-a3d6-cc13274723b1")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerQuery
        dep = ((ExternProcessorSmClass)getClassOf()).getOwnerQueryDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerValDef
        dep = ((ExternProcessorSmClass)getClassOf()).getOwnerValDefDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("2de92a92-9b63-4c7c-8873-fefc71a94eba")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternProcessor(this);
        else
          return null;
    }

}
