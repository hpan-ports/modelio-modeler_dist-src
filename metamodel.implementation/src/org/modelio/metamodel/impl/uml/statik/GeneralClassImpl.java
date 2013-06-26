/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.mda.ModuleParameter;
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

@objid ("000bf81a-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class GeneralClassImpl extends ClassifierImpl implements GeneralClass {
    @objid ("baf53a11-621f-4ae8-a637-50b4f5b47fbe")
    @Override
    public boolean isIsElementary() {
        return (Boolean) getAttVal(GeneralClassData.Metadata.IsElementaryAtt());
    }

    @objid ("a51b6f65-d723-4e2f-8d94-094ec139c06b")
    @Override
    public void setIsElementary(boolean value) {
        setAttVal(GeneralClassData.Metadata.IsElementaryAtt(), value);
    }

    @objid ("c62ed179-9ab8-420e-ad5e-b6434962963b")
    @Override
    public EList<BpmnInterface> getBpmnInterfaceRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnInterfaceRefsDep());
    }

    @objid ("5f5a1262-8c17-4238-a436-eefbc5ae410f")
    @Override
    public <T extends BpmnInterface> List<T> getBpmnInterfaceRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnInterface element : getBpmnInterfaceRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a05d8435-b880-41bc-8ee5-9b0cda994fca")
    @Override
    public EList<Parameter> getOccurence() {
        return new SmList<>(this, GeneralClassData.Metadata.OccurenceDep());
    }

    @objid ("cb630e1f-11dc-472b-85d7-1a8bef396755")
    @Override
    public <T extends Parameter> List<T> getOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Parameter element : getOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1fe16b45-d509-44bf-b84c-8459e05c307f")
    @Override
    public ExceptionHandler getExceptionInput() {
        return (ExceptionHandler) getDepVal(GeneralClassData.Metadata.ExceptionInputDep());
    }

    @objid ("4bcbf028-d526-4bf0-aeb5-5e33eaeddc62")
    @Override
    public void setExceptionInput(ExceptionHandler value) {
        appendDepVal(GeneralClassData.Metadata.ExceptionInputDep(), (SmObjectImpl)value);
    }

    @objid ("3a95ba42-a9a2-495a-95c8-a4d47fd87f1b")
    @Override
    public EList<Attribute> getObject() {
        return new SmList<>(this, GeneralClassData.Metadata.ObjectDep());
    }

    @objid ("57c97be6-2776-4b66-8cd9-010bc869a582")
    @Override
    public <T extends Attribute> List<T> getObject(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Attribute element : getObject()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7e0cd245-76fd-4f24-9828-a2ee2e3f8e64")
    @Override
    public EList<BpmnMessage> getBpmnMessageRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnMessageRefsDep());
    }

    @objid ("a4faa69f-6f43-4771-a5b3-c7cea37e9449")
    @Override
    public <T extends BpmnMessage> List<T> getBpmnMessageRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMessage element : getBpmnMessageRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4a791c26-8248-49c0-b96b-b8ce274256ca")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, GeneralClassData.Metadata.SRepresentationDep());
    }

    @objid ("ce3f3e4e-6aaa-48b5-a79c-c0a4f13ed987")
    @Override
    public <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Signal element : getSRepresentation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("eec37951-edc4-4b2d-a4ab-50841e715adb")
    @Override
    public EList<BpmnItemDefinition> getBpmnItemDefinitionRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnItemDefinitionRefsDep());
    }

    @objid ("8fa4f550-eeff-40fe-8c35-809919b6eaca")
    @Override
    public <T extends BpmnItemDefinition> List<T> getBpmnItemDefinitionRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnItemDefinition element : getBpmnItemDefinitionRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6a937676-1c48-49e2-a8fd-5d12933f0fa8")
    @Override
    public EList<ObjectNode> getOccurenceObjectNode() {
        return new SmList<>(this, GeneralClassData.Metadata.OccurenceObjectNodeDep());
    }

    @objid ("35868ded-e0af-4c74-b9e9-883d9e5937a9")
    @Override
    public <T extends ObjectNode> List<T> getOccurenceObjectNode(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ObjectNode element : getOccurenceObjectNode()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("96d4da29-afdd-4d82-8fb3-197a707e7b06")
    @Override
    public EList<BpmnItemAwareElement> getBpmnItemAwareRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnItemAwareRefsDep());
    }

    @objid ("b7121a50-4e33-47c2-a2fe-f7e7fde51133")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getBpmnItemAwareRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnItemAwareElement element : getBpmnItemAwareRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("93dbb060-7f23-4e87-a80f-39757d3ba2a0")
    @Override
    public EList<ModuleParameter> getOccurenceConfigParam() {
        return new SmList<>(this, GeneralClassData.Metadata.OccurenceConfigParamDep());
    }

    @objid ("da74f992-b1b0-4f00-a5ab-8695cb3390e8")
    @Override
    public <T extends ModuleParameter> List<T> getOccurenceConfigParam(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModuleParameter element : getOccurenceConfigParam()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7b2b46a2-9ce9-4655-92d0-faad96e5dd5a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8f911f13-7184-47a8-8699-d822da56c395")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("7a60e912-284c-4a69-94e2-060dbc72ba85")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralClass(this);
        else
          return null;
    }

}
