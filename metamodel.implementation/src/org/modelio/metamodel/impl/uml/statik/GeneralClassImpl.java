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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.impl.uml.statik.GeneralClassData;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000bf81a-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class GeneralClassImpl extends ClassifierImpl implements GeneralClass {
    @objid ("f65c5c03-a54f-412a-ac2f-690f008a3251")
    @Override
    public boolean isIsElementary() {
        return (Boolean) getAttVal(((GeneralClassSmClass)getClassOf()).getIsElementaryAtt());
    }

    @objid ("c994418e-5f2c-4903-b17d-da52a20961e9")
    @Override
    public void setIsElementary(boolean value) {
        setAttVal(((GeneralClassSmClass)getClassOf()).getIsElementaryAtt(), value);
    }

    @objid ("131690fc-79a5-464c-b314-ab8307f45bef")
    @Override
    public EList<BpmnInterface> getBpmnInterfaceRefs() {
        return new SmList<>(this, ((GeneralClassSmClass)getClassOf()).getBpmnInterfaceRefsDep());
    }

    @objid ("b1b41d39-c2b5-419d-a9be-872832b428e1")
    @Override
    public <T extends BpmnInterface> List<T> getBpmnInterfaceRefs(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnInterface element : getBpmnInterfaceRefs()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b9bbe445-ed42-4a09-96ca-64721ca04fd7")
    @Override
    public EList<Parameter> getOccurence() {
        return new SmList<>(this, ((GeneralClassSmClass)getClassOf()).getOccurenceDep());
    }

    @objid ("4ba5f125-5056-4acb-96b6-bd8e1c0ed472")
    @Override
    public <T extends Parameter> List<T> getOccurence(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Parameter element : getOccurence()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d9c16dde-f0c4-4a2b-bf25-f9ebfa6850a7")
    @Override
    public ExceptionHandler getExceptionInput() {
        Object obj = getDepVal(((GeneralClassSmClass)getClassOf()).getExceptionInputDep());
        return (obj instanceof ExceptionHandler)? (ExceptionHandler)obj : null;
    }

    @objid ("4598c435-633e-4164-a94c-51e53b4c023f")
    @Override
    public void setExceptionInput(ExceptionHandler value) {
        appendDepVal(((GeneralClassSmClass)getClassOf()).getExceptionInputDep(), (SmObjectImpl)value);
    }

    @objid ("a17b64a0-1999-409a-a686-9aedd478a342")
    @Override
    public EList<Attribute> getObject() {
        return new SmList<>(this, ((GeneralClassSmClass)getClassOf()).getObjectDep());
    }

    @objid ("3d7dbf2e-6ce4-4a38-956f-c2c9a0d3a148")
    @Override
    public <T extends Attribute> List<T> getObject(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Attribute element : getObject()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("42e5290c-34f8-453f-8a88-038afaa51b68")
    @Override
    public EList<BpmnMessage> getBpmnMessageRefs() {
        return new SmList<>(this, ((GeneralClassSmClass)getClassOf()).getBpmnMessageRefsDep());
    }

    @objid ("1cf0e689-3bcc-4ce0-b714-fc2dbf562fbd")
    @Override
    public <T extends BpmnMessage> List<T> getBpmnMessageRefs(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnMessage element : getBpmnMessageRefs()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2781e63a-12a4-41c8-871a-575959995e5f")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, ((GeneralClassSmClass)getClassOf()).getSRepresentationDep());
    }

    @objid ("80d3548e-f8ef-4144-bb4d-599edd08648a")
    @Override
    public <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Signal element : getSRepresentation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("802aca50-faf7-4cdc-8b5d-df8b694e02f2")
    @Override
    public EList<BpmnItemDefinition> getBpmnItemDefinitionRefs() {
        return new SmList<>(this, ((GeneralClassSmClass)getClassOf()).getBpmnItemDefinitionRefsDep());
    }

    @objid ("5d558ad3-01ea-4dbe-ab59-f76cf095fa76")
    @Override
    public <T extends BpmnItemDefinition> List<T> getBpmnItemDefinitionRefs(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnItemDefinition element : getBpmnItemDefinitionRefs()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a0b5a031-1eb2-46cd-92dc-d96feb6a63dc")
    @Override
    public EList<ObjectNode> getOccurenceObjectNode() {
        return new SmList<>(this, ((GeneralClassSmClass)getClassOf()).getOccurenceObjectNodeDep());
    }

    @objid ("8ee97ccc-7fab-4e53-97f2-5e3a1d14ad8e")
    @Override
    public <T extends ObjectNode> List<T> getOccurenceObjectNode(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ObjectNode element : getOccurenceObjectNode()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b35a5343-556c-4adb-93bd-94279f6ae809")
    @Override
    public EList<BpmnItemAwareElement> getBpmnItemAwareRefs() {
        return new SmList<>(this, ((GeneralClassSmClass)getClassOf()).getBpmnItemAwareRefsDep());
    }

    @objid ("49c41698-b926-4e8a-a523-7109feb8af0b")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getBpmnItemAwareRefs(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnItemAwareElement element : getBpmnItemAwareRefs()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("092e62f3-8a3c-4f8d-8337-769b1b9eda78")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("89eba9b9-a7c5-44f7-8ff3-b6763a506403")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("89645117-4386-4137-9bce-60942262d3d5")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralClass(this);
        else
          return null;
    }

}
