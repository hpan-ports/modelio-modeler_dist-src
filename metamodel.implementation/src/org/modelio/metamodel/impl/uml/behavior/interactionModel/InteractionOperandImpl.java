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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionOperandData;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0047c124-c4bf-1fd8-97fe-001ec947cd2a")
public class InteractionOperandImpl extends InteractionFragmentImpl implements InteractionOperand {
    @objid ("432af770-ee9b-496a-a857-5aed2599e294")
    @Override
    public String getGuard() {
        return (String) getAttVal(((InteractionOperandSmClass)getClassOf()).getGuardAtt());
    }

    @objid ("c1f54a2f-cef5-45ac-9717-ae601e245bf6")
    @Override
    public void setGuard(String value) {
        setAttVal(((InteractionOperandSmClass)getClassOf()).getGuardAtt(), value);
    }

    @objid ("ed2169ea-88b3-4162-8fab-2b879868f079")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(((InteractionOperandSmClass)getClassOf()).getEndLineNumberAtt());
    }

    @objid ("0c938a28-db8b-4fcb-b748-1fe5f1ecc927")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(((InteractionOperandSmClass)getClassOf()).getEndLineNumberAtt(), value);
    }

    @objid ("acac971d-2c94-42e7-aa9a-fe6c6f9f1a6b")
    @Override
    public EList<InteractionFragment> getFragment() {
        return new SmList<>(this, ((InteractionOperandSmClass)getClassOf()).getFragmentDep());
    }

    @objid ("7058d65c-cabb-4264-a9fd-4ad6a0dd1736")
    @Override
    public <T extends InteractionFragment> List<T> getFragment(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InteractionFragment element : getFragment()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("00fb3079-7198-4c05-8f50-71febaf30073")
    @Override
    public CombinedFragment getOwnerFragment() {
        Object obj = getDepVal(((InteractionOperandSmClass)getClassOf()).getOwnerFragmentDep());
        return (obj instanceof CombinedFragment)? (CombinedFragment)obj : null;
    }

    @objid ("5d69cfce-cd81-441b-b464-7dba8312c528")
    @Override
    public void setOwnerFragment(CombinedFragment value) {
        appendDepVal(((InteractionOperandSmClass)getClassOf()).getOwnerFragmentDep(), (SmObjectImpl)value);
    }

    @objid ("21d5626d-4a89-4f94-b5cb-42804dc4013d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerFragment
        obj = (SmObjectImpl)this.getDepVal(((InteractionOperandSmClass)getClassOf()).getOwnerFragmentDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5a5016a5-a600-4696-8cb8-fa81eb22f67e")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerFragment
        dep = ((InteractionOperandSmClass)getClassOf()).getOwnerFragmentDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("bcb0018c-3c53-4429-9343-91803b43864e")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionOperand(this);
        else
          return null;
    }

}
