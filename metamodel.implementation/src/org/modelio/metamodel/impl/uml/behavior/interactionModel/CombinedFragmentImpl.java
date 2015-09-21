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
import org.modelio.metamodel.impl.uml.behavior.interactionModel.CombinedFragmentData;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperator;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00437f1a-c4bf-1fd8-97fe-001ec947cd2a")
public class CombinedFragmentImpl extends InteractionFragmentImpl implements CombinedFragment {
    @objid ("3b3c47ee-d2d3-4f50-a756-b9feacea95de")
    @Override
    public InteractionOperator getOperator() {
        return (InteractionOperator) getAttVal(((CombinedFragmentSmClass)getClassOf()).getOperatorAtt());
    }

    @objid ("6de892c5-101d-489e-bdb3-4133e416c970")
    @Override
    public void setOperator(InteractionOperator value) {
        setAttVal(((CombinedFragmentSmClass)getClassOf()).getOperatorAtt(), value);
    }

    @objid ("f6b8f77a-4643-4026-858a-90a201a829b1")
    @Override
    public EList<InteractionOperand> getOperand() {
        return new SmList<>(this, ((CombinedFragmentSmClass)getClassOf()).getOperandDep());
    }

    @objid ("cb28449c-58c2-4586-bda6-1fd9965c93a4")
    @Override
    public <T extends InteractionOperand> List<T> getOperand(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InteractionOperand element : getOperand()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("dd92118b-ecac-4b7a-b9a4-ee7aa0808753")
    @Override
    public EList<Gate> getFragmentGate() {
        return new SmList<>(this, ((CombinedFragmentSmClass)getClassOf()).getFragmentGateDep());
    }

    @objid ("b45c0522-8b29-4cb1-b130-fda96392e6bd")
    @Override
    public <T extends Gate> List<T> getFragmentGate(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Gate element : getFragmentGate()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("335d672b-0240-4547-b70d-fc348478e47e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("cff47059-371b-43b0-8ece-fa883806adbb")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("65db39af-4257-4f8c-97c9-a28c35a8f6b8")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCombinedFragment(this);
        else
          return null;
    }

}
