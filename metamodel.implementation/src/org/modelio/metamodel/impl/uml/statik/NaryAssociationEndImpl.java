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
import org.modelio.metamodel.impl.uml.statik.NaryAssociationEndData;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0020dab4-c4bf-1fd8-97fe-001ec947cd2a")
public class NaryAssociationEndImpl extends StructuralFeatureImpl implements NaryAssociationEnd {
    @objid ("c104bf08-7732-4ae5-8b6b-33f0a8ee29f3")
    @Override
    public NaryAssociation getNaryAssociation() {
        Object obj = getDepVal(((NaryAssociationEndSmClass)getClassOf()).getNaryAssociationDep());
        return (obj instanceof NaryAssociation)? (NaryAssociation)obj : null;
    }

    @objid ("10acc122-5a30-4273-86ca-6d7e103b4004")
    @Override
    public void setNaryAssociation(NaryAssociation value) {
        appendDepVal(((NaryAssociationEndSmClass)getClassOf()).getNaryAssociationDep(), (SmObjectImpl)value);
    }

    @objid ("314affc0-bcb1-46d7-a70e-afbe88d7032a")
    @Override
    public Classifier getOwner() {
        Object obj = getDepVal(((NaryAssociationEndSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof Classifier)? (Classifier)obj : null;
    }

    @objid ("63f052bf-8801-4eb3-aae4-dc7ddd375f3c")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(((NaryAssociationEndSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("137792af-b0bb-4242-b1a3-9e25b66460e4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((NaryAssociationEndSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        // NaryAssociation
        obj = (SmObjectImpl)this.getDepVal(((NaryAssociationEndSmClass)getClassOf()).getNaryAssociationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("296fbc88-a673-46f1-9039-84e73357c9eb")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((NaryAssociationEndSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // NaryAssociation
        dep = ((NaryAssociationEndSmClass)getClassOf()).getNaryAssociationDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("6b0af08b-d38d-4e1e-ad92-7c4c2c5e1d87")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryAssociationEnd(this);
        else
          return null;
    }

}
