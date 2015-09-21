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
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionFragmentData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00473c54-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class InteractionFragmentImpl extends ModelElementImpl implements InteractionFragment {
    @objid ("00c9b7c3-c415-4843-9c70-006d9857b3c6")
    @Override
    public int getLineNumber() {
        return (Integer) getAttVal(((InteractionFragmentSmClass)getClassOf()).getLineNumberAtt());
    }

    @objid ("17afa17e-a1cd-4a1a-8514-57ec5c63e71d")
    @Override
    public void setLineNumber(int value) {
        setAttVal(((InteractionFragmentSmClass)getClassOf()).getLineNumberAtt(), value);
    }

    @objid ("01c20cba-1814-48f2-88c4-2b0f6eae73d8")
    @Override
    public InteractionOperand getEnclosingOperand() {
        Object obj = getDepVal(((InteractionFragmentSmClass)getClassOf()).getEnclosingOperandDep());
        return (obj instanceof InteractionOperand)? (InteractionOperand)obj : null;
    }

    @objid ("4c6ee3e5-5aba-4d1d-86f3-f98335495d1a")
    @Override
    public void setEnclosingOperand(InteractionOperand value) {
        appendDepVal(((InteractionFragmentSmClass)getClassOf()).getEnclosingOperandDep(), (SmObjectImpl)value);
    }

    @objid ("1b38ff14-bc6e-4642-b7bd-dc775d1cdd49")
    @Override
    public Interaction getEnclosingInteraction() {
        Object obj = getDepVal(((InteractionFragmentSmClass)getClassOf()).getEnclosingInteractionDep());
        return (obj instanceof Interaction)? (Interaction)obj : null;
    }

    @objid ("79e3b1b8-d0dc-4d82-80b8-5728d2cee9ab")
    @Override
    public void setEnclosingInteraction(Interaction value) {
        appendDepVal(((InteractionFragmentSmClass)getClassOf()).getEnclosingInteractionDep(), (SmObjectImpl)value);
    }

    @objid ("0b92e55f-ccfb-46f7-8dff-2babdc5f717e")
    @Override
    public EList<Lifeline> getCovered() {
        return new SmList<>(this, ((InteractionFragmentSmClass)getClassOf()).getCoveredDep());
    }

    @objid ("521f484d-6c27-4c87-ac22-368ac50b82c0")
    @Override
    public <T extends Lifeline> List<T> getCovered(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Lifeline element : getCovered()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("56e54936-0c36-4191-ae53-b7f659117640")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // EnclosingOperand
        obj = (SmObjectImpl)this.getDepVal(((InteractionFragmentSmClass)getClassOf()).getEnclosingOperandDep());
        if (obj != null)
          return obj;
        // EnclosingInteraction
        obj = (SmObjectImpl)this.getDepVal(((InteractionFragmentSmClass)getClassOf()).getEnclosingInteractionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("16decab2-af82-4c61-aa4b-85875bf73ec8")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // EnclosingOperand
        dep = ((InteractionFragmentSmClass)getClassOf()).getEnclosingOperandDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // EnclosingInteraction
        dep = ((InteractionFragmentSmClass)getClassOf()).getEnclosingInteractionDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("06562c61-aa13-440f-a40b-75b3e1c84a8e")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionFragment(this);
        else
          return null;
    }

}
