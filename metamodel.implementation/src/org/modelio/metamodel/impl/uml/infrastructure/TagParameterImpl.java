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
import org.modelio.metamodel.impl.uml.infrastructure.TagParameterData;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("008ec7d6-c4be-1fd8-97fe-001ec947cd2a")
public class TagParameterImpl extends ElementImpl implements TagParameter {
    @objid ("cc3298ec-8acb-43d4-af31-5d1d30dad32a")
    @Override
    public String getValue() {
        return (String) getAttVal(((TagParameterSmClass)getClassOf()).getValueAtt());
    }

    @objid ("e4077623-ff73-4f0a-8ed8-d25ad01601fc")
    @Override
    public void setValue(String value) {
        setAttVal(((TagParameterSmClass)getClassOf()).getValueAtt(), value);
    }

    @objid ("e091eeac-74a6-4c82-829e-6405e068e394")
    @Override
    public TaggedValue getAnnoted() {
        Object obj = getDepVal(((TagParameterSmClass)getClassOf()).getAnnotedDep());
        return (obj instanceof TaggedValue)? (TaggedValue)obj : null;
    }

    @objid ("ba3e989a-f84c-4b6e-afb6-afd6a3308500")
    @Override
    public void setAnnoted(TaggedValue value) {
        appendDepVal(((TagParameterSmClass)getClassOf()).getAnnotedDep(), (SmObjectImpl)value);
    }

    @objid ("6283f61c-4f01-4828-ba49-50f598ca150d")
    @Override
    public TaggedValue getQualified() {
        Object obj = getDepVal(((TagParameterSmClass)getClassOf()).getQualifiedDep());
        return (obj instanceof TaggedValue)? (TaggedValue)obj : null;
    }

    @objid ("9ff338cf-ef06-4443-a4da-c47a005436d2")
    @Override
    public void setQualified(TaggedValue value) {
        appendDepVal(((TagParameterSmClass)getClassOf()).getQualifiedDep(), (SmObjectImpl)value);
    }

    @objid ("5b52c321-7fa9-436d-9600-98250b5d2366")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Annoted
        obj = (SmObjectImpl)this.getDepVal(((TagParameterSmClass)getClassOf()).getAnnotedDep());
        if (obj != null)
          return obj;
        // Qualified
        obj = (SmObjectImpl)this.getDepVal(((TagParameterSmClass)getClassOf()).getQualifiedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9a867b43-4595-4575-861a-1aa9879ae771")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Annoted
        dep = ((TagParameterSmClass)getClassOf()).getAnnotedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // Qualified
        dep = ((TagParameterSmClass)getClassOf()).getQualifiedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("b649a7b7-2d4b-4fdf-aa74-2c49fb665a7c")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTagParameter(this);
        else
          return null;
    }

}
