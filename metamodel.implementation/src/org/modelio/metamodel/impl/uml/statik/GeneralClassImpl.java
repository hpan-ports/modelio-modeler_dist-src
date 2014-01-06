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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
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
    @objid ("db5b7841-00c8-46ec-8b06-2fcee99779c4")
    @Override
    public boolean isIsElementary() {
        return (Boolean) getAttVal(GeneralClassData.Metadata.IsElementaryAtt());
    }

    @objid ("8824b575-213f-43bb-9594-4c6b6542a66f")
    @Override
    public void setIsElementary(boolean value) {
        setAttVal(GeneralClassData.Metadata.IsElementaryAtt(), value);
    }

    @objid ("a35a52f7-447e-4c18-8e50-9ce433ff0154")
    @Override
    public EList<BpmnInterface> getBpmnInterfaceRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnInterfaceRefsDep());
    }

    @objid ("7cb72e45-42ba-4112-9e26-7cdf86af847a")
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

    @objid ("88a08115-0e6c-4f12-aca8-3204fc52c537")
    @Override
    public EList<Parameter> getOccurence() {
        return new SmList<>(this, GeneralClassData.Metadata.OccurenceDep());
    }

    @objid ("ced651e3-387b-43ed-be3a-7786058fcbf0")
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

    @objid ("d4d3c58d-9c9a-42d6-b964-dad49889a803")
    @Override
    public ExceptionHandler getExceptionInput() {
        return (ExceptionHandler) getDepVal(GeneralClassData.Metadata.ExceptionInputDep());
    }

    @objid ("201f5158-71ef-4ce1-95ec-8c36fdf29e94")
    @Override
    public void setExceptionInput(ExceptionHandler value) {
        appendDepVal(GeneralClassData.Metadata.ExceptionInputDep(), (SmObjectImpl)value);
    }

    @objid ("3dd00a2f-2be5-4b80-a732-9011553c5ab9")
    @Override
    public EList<Attribute> getObject() {
        return new SmList<>(this, GeneralClassData.Metadata.ObjectDep());
    }

    @objid ("fa72eb2b-7738-4497-a0f1-ec99be9e5cad")
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

    @objid ("a0f09c46-9e1a-487f-951b-855254fe35ef")
    @Override
    public EList<BpmnMessage> getBpmnMessageRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnMessageRefsDep());
    }

    @objid ("a22ff5ee-b807-435b-b7d7-2d1903903c34")
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

    @objid ("d41c1ece-93fd-46f4-a344-87784e383957")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, GeneralClassData.Metadata.SRepresentationDep());
    }

    @objid ("bb1629aa-bf6b-4441-88cf-3f9cb2f99ccd")
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

    @objid ("3b636fe2-8883-409b-a7e7-ff60f432f2ab")
    @Override
    public EList<BpmnItemDefinition> getBpmnItemDefinitionRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnItemDefinitionRefsDep());
    }

    @objid ("4c23781e-55ec-47d9-88ea-6e4d2af4d057")
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

    @objid ("87c5c813-145f-4546-a9b3-7b4b0c5b4a6a")
    @Override
    public EList<ObjectNode> getOccurenceObjectNode() {
        return new SmList<>(this, GeneralClassData.Metadata.OccurenceObjectNodeDep());
    }

    @objid ("e342ad9c-7485-4911-9df7-80ab8d001e6c")
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

    @objid ("99b76c91-87a3-4a0b-aae2-5fc6a2c3c2e8")
    @Override
    public EList<BpmnItemAwareElement> getBpmnItemAwareRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnItemAwareRefsDep());
    }

    @objid ("eb7db68c-98d3-49ad-a8c3-33de1b287419")
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

    @objid ("6cf7c348-222a-41fc-b413-7689521cb6d5")
    @Override
    public EList<ModuleParameter> getOccurenceConfigParam() {
        return new SmList<>(this, GeneralClassData.Metadata.OccurenceConfigParamDep());
    }

    @objid ("af23cb11-4475-4863-8cfa-b24ae0bc55b5")
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

    @objid ("76365362-cc10-4f7b-bc95-db7ec5505613")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d65d20ea-ad4e-41af-9768-30d5d4dc0324")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("92c69c82-2f2a-4a1b-bb45-e5c0a953fa54")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralClass(this);
        else
          return null;
    }

}
