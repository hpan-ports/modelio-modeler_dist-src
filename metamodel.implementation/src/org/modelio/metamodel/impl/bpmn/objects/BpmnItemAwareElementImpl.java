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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00072ee8-c4c0-1fd8-97fe-001ec947cd2a")
public abstract class BpmnItemAwareElementImpl extends BpmnFlowElementImpl implements BpmnItemAwareElement {
    @objid ("f33ad749-e1a1-417e-84b6-43c3ca266a98")
    @Override
    public GeneralClass getType() {
        Object obj = getDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getTypeDep());
        return (obj instanceof GeneralClass)? (GeneralClass)obj : null;
    }

    @objid ("cd32a93b-80c6-484d-a1a7-ecc19207574b")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getTypeDep(), (SmObjectImpl)value);
    }

    @objid ("d02bcb3c-09df-42e4-b866-82855ec4d28e")
    @Override
    public EList<BpmnDataAssociation> getTargetOfDataAssociation() {
        return new SmList<>(this, ((BpmnItemAwareElementSmClass)getClassOf()).getTargetOfDataAssociationDep());
    }

    @objid ("0ab29b9f-7daa-4400-9edf-bb3f3387ce44")
    @Override
    public <T extends BpmnDataAssociation> List<T> getTargetOfDataAssociation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnDataAssociation element : getTargetOfDataAssociation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c2ea0b2d-92b7-4a27-852f-b9daf3dca9ce")
    @Override
    public BpmnItemDefinition getItemSubjectRef() {
        Object obj = getDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getItemSubjectRefDep());
        return (obj instanceof BpmnItemDefinition)? (BpmnItemDefinition)obj : null;
    }

    @objid ("3b7907ba-fe02-4583-8de7-7b72f0c0b90a")
    @Override
    public void setItemSubjectRef(BpmnItemDefinition value) {
        appendDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getItemSubjectRefDep(), (SmObjectImpl)value);
    }

    @objid ("3bfa86a8-38ce-4279-8145-885fc3ade3b9")
    @Override
    public State getInState() {
        Object obj = getDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getInStateDep());
        return (obj instanceof State)? (State)obj : null;
    }

    @objid ("db6f42de-4431-4ffb-acc7-2bbea820e745")
    @Override
    public void setInState(State value) {
        appendDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getInStateDep(), (SmObjectImpl)value);
    }

    @objid ("8c3d77f4-fe32-49bc-ba44-a67be60d9635")
    @Override
    public AssociationEnd getRepresentedAssociationEnd() {
        Object obj = getDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getRepresentedAssociationEndDep());
        return (obj instanceof AssociationEnd)? (AssociationEnd)obj : null;
    }

    @objid ("f44b4ff0-2764-4755-b7a3-3f82699d4938")
    @Override
    public void setRepresentedAssociationEnd(AssociationEnd value) {
        appendDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getRepresentedAssociationEndDep(), (SmObjectImpl)value);
    }

    @objid ("1b14056e-5240-4338-a81f-549dd77b1b93")
    @Override
    public BpmnDataState getDataState() {
        Object obj = getDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getDataStateDep());
        return (obj instanceof BpmnDataState)? (BpmnDataState)obj : null;
    }

    @objid ("3d78525d-ab0c-4205-8e78-6c49e0ed4cf4")
    @Override
    public void setDataState(BpmnDataState value) {
        appendDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getDataStateDep(), (SmObjectImpl)value);
    }

    @objid ("100ccd0a-c9ee-4a0d-9581-f50bc068c711")
    @Override
    public EList<BpmnDataAssociation> getSourceOfDataAssociation() {
        return new SmList<>(this, ((BpmnItemAwareElementSmClass)getClassOf()).getSourceOfDataAssociationDep());
    }

    @objid ("e9d77fee-b95c-4699-a7d3-af4a0b2298d4")
    @Override
    public <T extends BpmnDataAssociation> List<T> getSourceOfDataAssociation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnDataAssociation element : getSourceOfDataAssociation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("14ec153e-fa27-464f-a8b0-efce00bdf3ea")
    @Override
    public Attribute getRepresentedAttribute() {
        Object obj = getDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getRepresentedAttributeDep());
        return (obj instanceof Attribute)? (Attribute)obj : null;
    }

    @objid ("53262112-c685-472c-91dd-f5c5f3a69ff6")
    @Override
    public void setRepresentedAttribute(Attribute value) {
        appendDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getRepresentedAttributeDep(), (SmObjectImpl)value);
    }

    @objid ("2305cbbc-3649-4069-9ad0-46999cd2b0ab")
    @Override
    public Instance getRepresentedInstance() {
        Object obj = getDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getRepresentedInstanceDep());
        return (obj instanceof Instance)? (Instance)obj : null;
    }

    @objid ("93e99014-6a31-4e03-8007-2ba14421b40d")
    @Override
    public void setRepresentedInstance(Instance value) {
        appendDepVal(((BpmnItemAwareElementSmClass)getClassOf()).getRepresentedInstanceDep(), (SmObjectImpl)value);
    }

    @objid ("54b1233a-b781-43b7-858d-b2a55941ce82")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("601943b3-7721-4de3-8102-1cdd2ecd1d38")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("2a0b3159-e8e5-4c1b-8488-606539eae33b")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnItemAwareElement(this);
        else
          return null;
    }

}
