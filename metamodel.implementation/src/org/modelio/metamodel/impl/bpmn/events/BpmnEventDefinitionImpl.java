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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventDefinitionData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("008d76e2-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnEventDefinitionImpl extends BpmnBaseElementImpl implements BpmnEventDefinition {
    @objid ("fb1e79c0-8603-4d0e-b2dd-637a244243fc")
    @Override
    public BpmnEvent getDefined() {
        Object obj = getDepVal(((BpmnEventDefinitionSmClass)getClassOf()).getDefinedDep());
        return (obj instanceof BpmnEvent)? (BpmnEvent)obj : null;
    }

    @objid ("cb28adf9-6ffd-4b1d-a49c-f9b710ab649e")
    @Override
    public void setDefined(BpmnEvent value) {
        appendDepVal(((BpmnEventDefinitionSmClass)getClassOf()).getDefinedDep(), (SmObjectImpl)value);
    }

    @objid ("1fdcdc19-6d39-4b8d-b61a-5be2d6e82d18")
    @Override
    public EList<BpmnMultiInstanceLoopCharacteristics> getLoopRef() {
        return new SmList<>(this, ((BpmnEventDefinitionSmClass)getClassOf()).getLoopRefDep());
    }

    @objid ("9a1f3646-e4d5-42ff-83a4-6fdcb64f5c30")
    @Override
    public <T extends BpmnMultiInstanceLoopCharacteristics> List<T> getLoopRef(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnMultiInstanceLoopCharacteristics element : getLoopRef()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a964670f-3ca4-4b80-9395-fc57a1a76202")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Defined
        obj = (SmObjectImpl)this.getDepVal(((BpmnEventDefinitionSmClass)getClassOf()).getDefinedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("f99770ea-5334-496c-8944-9f54255c31b5")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Defined
        dep = ((BpmnEventDefinitionSmClass)getClassOf()).getDefinedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("b16fdbfc-779a-4e4e-87c3-a1a682eaddaf")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnEventDefinition(this);
        else
          return null;
    }

}
