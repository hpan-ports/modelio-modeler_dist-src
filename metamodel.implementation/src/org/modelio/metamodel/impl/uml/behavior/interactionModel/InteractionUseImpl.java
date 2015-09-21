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
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionUseData;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00485742-c4bf-1fd8-97fe-001ec947cd2a")
public class InteractionUseImpl extends InteractionFragmentImpl implements InteractionUse {
    @objid ("38e26caa-3da3-4c03-a8c9-83074ef15293")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(((InteractionUseSmClass)getClassOf()).getEndLineNumberAtt());
    }

    @objid ("839b0c55-362b-4231-b982-b64bfc1a51ff")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(((InteractionUseSmClass)getClassOf()).getEndLineNumberAtt(), value);
    }

    @objid ("98ca6140-0f4f-4a0b-ad4f-1d8e1a5b9f48")
    @Override
    public EList<Gate> getActualGate() {
        return new SmList<>(this, ((InteractionUseSmClass)getClassOf()).getActualGateDep());
    }

    @objid ("b87d7bd1-db44-4d9b-b70f-6e91adbbafe6")
    @Override
    public <T extends Gate> List<T> getActualGate(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Gate element : getActualGate()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7a14e989-ac68-4a99-aa12-39d1b2fdcdbc")
    @Override
    public Interaction getRefersTo() {
        Object obj = getDepVal(((InteractionUseSmClass)getClassOf()).getRefersToDep());
        return (obj instanceof Interaction)? (Interaction)obj : null;
    }

    @objid ("055d5b47-d98e-4b07-b4aa-e54a935f6264")
    @Override
    public void setRefersTo(Interaction value) {
        appendDepVal(((InteractionUseSmClass)getClassOf()).getRefersToDep(), (SmObjectImpl)value);
    }

    @objid ("35ec0174-6d32-4bf3-8e3e-a7c4bbb4fb2d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("55f8d8c2-cbcb-47d1-8711-2c3518124433")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("575f504d-a7cf-4ae3-b405-81e72121e8c0")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionUse(this);
        else
          return null;
    }

}
