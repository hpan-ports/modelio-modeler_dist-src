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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0078058c-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnBaseElementImpl extends ModelElementImpl implements BpmnBaseElement {
    @objid ("c7e2e692-2d23-4335-a8f9-d9ab0003575c")
    @Override
    public EList<BpmnAssociation> getOutgoingAssoc() {
        return new SmList<>(this, ((BpmnBaseElementSmClass)getClassOf()).getOutgoingAssocDep());
    }

    @objid ("edb0201e-2e08-4326-afc1-f41477c6b99e")
    @Override
    public <T extends BpmnAssociation> List<T> getOutgoingAssoc(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnAssociation element : getOutgoingAssoc()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("59153594-5dc7-4b7f-a4c4-926b1024f9f5")
    @Override
    public EList<BpmnAssociation> getIncomingAssoc() {
        return new SmList<>(this, ((BpmnBaseElementSmClass)getClassOf()).getIncomingAssocDep());
    }

    @objid ("ddc1053a-0775-49c2-8ff6-4feac8fb01df")
    @Override
    public <T extends BpmnAssociation> List<T> getIncomingAssoc(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnAssociation element : getIncomingAssoc()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2489be3a-881c-4ff0-97fe-55a112f5cc1d")
    @Override
    public EList<BpmnMessageFlow> getIncomingFlow() {
        return new SmList<>(this, ((BpmnBaseElementSmClass)getClassOf()).getIncomingFlowDep());
    }

    @objid ("0d7d4fef-24b5-4e40-a868-dc0f0a795586")
    @Override
    public <T extends BpmnMessageFlow> List<T> getIncomingFlow(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnMessageFlow element : getIncomingFlow()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("eb874669-b633-4c29-a4cc-566de9083d0c")
    @Override
    public EList<BpmnMessageFlow> getOutgoingFlow() {
        return new SmList<>(this, ((BpmnBaseElementSmClass)getClassOf()).getOutgoingFlowDep());
    }

    @objid ("8dca42e2-eb0e-4489-bfd0-102ba4bdd6eb")
    @Override
    public <T extends BpmnMessageFlow> List<T> getOutgoingFlow(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnMessageFlow element : getOutgoingFlow()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e5e52eba-e26a-475b-919c-57aaa2a17e71")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b29ba1ad-efed-4349-b08d-4d2c18e548ea")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("b2f4dfcf-0d4e-418d-9175-6c6a44b7bae6")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnBaseElement(this);
        else
          return null;
    }

}
