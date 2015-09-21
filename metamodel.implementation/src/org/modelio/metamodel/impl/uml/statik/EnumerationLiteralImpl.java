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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.EnumerationLiteralData;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000a7e90-c4bf-1fd8-97fe-001ec947cd2a")
public class EnumerationLiteralImpl extends ModelElementImpl implements EnumerationLiteral {
    @objid ("e5e20405-0449-460d-afad-a747cf900405")
    @Override
    public Enumeration getValuated() {
        Object obj = getDepVal(((EnumerationLiteralSmClass)getClassOf()).getValuatedDep());
        return (obj instanceof Enumeration)? (Enumeration)obj : null;
    }

    @objid ("ef30c643-e0f5-45d9-b9f8-ee0beef7855b")
    @Override
    public void setValuated(Enumeration value) {
        appendDepVal(((EnumerationLiteralSmClass)getClassOf()).getValuatedDep(), (SmObjectImpl)value);
    }

    @objid ("c2c2aeb9-bc3a-4c4b-a1bb-5cf3192d9c87")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Valuated
        obj = (SmObjectImpl)this.getDepVal(((EnumerationLiteralSmClass)getClassOf()).getValuatedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("57bdfa92-2aa8-4bbc-aad8-b15caa25fcac")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Valuated
        dep = ((EnumerationLiteralSmClass)getClassOf()).getValuatedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("9252f687-cd1d-4752-86f7-15747c8cb7c6")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEnumerationLiteral(this);
        else
          return null;
    }

}
