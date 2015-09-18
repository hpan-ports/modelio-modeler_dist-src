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
/*   Metamodel version: 9022              */
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
    @objid ("11765226-861e-4e4e-a111-734b9ec48b8c")
    @Override
    public boolean isIsElementary() {
        return (Boolean) getAttVal(GeneralClassData.Metadata.IsElementaryAtt());
    }

    @objid ("994b3472-3d65-4f69-8fdf-460297487be4")
    @Override
    public void setIsElementary(boolean value) {
        setAttVal(GeneralClassData.Metadata.IsElementaryAtt(), value);
    }

    @objid ("9d656b84-0369-43b2-9e20-87768b54e065")
    @Override
    public EList<BpmnInterface> getBpmnInterfaceRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnInterfaceRefsDep());
    }

    @objid ("d26b9b39-99db-4275-aa6e-daceedcba322")
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

    @objid ("428710d9-6ca6-4313-9593-de0551fc60e5")
    @Override
    public EList<Parameter> getOccurence() {
        return new SmList<>(this, GeneralClassData.Metadata.OccurenceDep());
    }

    @objid ("c240def9-d81f-481d-9817-c39cb3d3f633")
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

    @objid ("1bc729be-3515-4487-b106-7e2874371a2d")
    @Override
    public ExceptionHandler getExceptionInput() {
        return (ExceptionHandler) getDepVal(GeneralClassData.Metadata.ExceptionInputDep());
    }

    @objid ("a522d938-6319-4623-974d-ce9fae24e3b1")
    @Override
    public void setExceptionInput(ExceptionHandler value) {
        appendDepVal(GeneralClassData.Metadata.ExceptionInputDep(), (SmObjectImpl)value);
    }

    @objid ("830cce7e-2111-4cdf-8962-c2908d6d8792")
    @Override
    public EList<Attribute> getObject() {
        return new SmList<>(this, GeneralClassData.Metadata.ObjectDep());
    }

    @objid ("2af6ff92-de1c-4bb2-bb72-a7a851fdd5b4")
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

    @objid ("4312c66a-92cd-42b1-97ff-0d43167589c9")
    @Override
    public EList<BpmnMessage> getBpmnMessageRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnMessageRefsDep());
    }

    @objid ("094b977b-ee42-407b-a391-f6e5e71de393")
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

    @objid ("c6a11ddc-5ebd-4510-afc2-23f6a5b2be55")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, GeneralClassData.Metadata.SRepresentationDep());
    }

    @objid ("11f2461a-1980-4737-8f8b-3da95eaf46f3")
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

    @objid ("8e03ec82-e8d9-47fe-b936-cd027f0a0878")
    @Override
    public EList<BpmnItemDefinition> getBpmnItemDefinitionRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnItemDefinitionRefsDep());
    }

    @objid ("ae24e79f-49aa-4dd3-8a6e-feaf547785e3")
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

    @objid ("47b5f107-384d-4766-b49f-a3deb8746e78")
    @Override
    public EList<ObjectNode> getOccurenceObjectNode() {
        return new SmList<>(this, GeneralClassData.Metadata.OccurenceObjectNodeDep());
    }

    @objid ("dbde88f1-cad6-4442-a26c-e54295871285")
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

    @objid ("8844a9f2-ef0b-4065-9493-ae8066ca0fd7")
    @Override
    public EList<BpmnItemAwareElement> getBpmnItemAwareRefs() {
        return new SmList<>(this, GeneralClassData.Metadata.BpmnItemAwareRefsDep());
    }

    @objid ("b6139655-c1ad-45b5-93ac-41c7d917bfd0")
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

    @objid ("76149ce6-dce5-4301-a098-9c78635d7101")
    @Override
    public EList<ModuleParameter> getOccurenceConfigParam() {
        return new SmList<>(this, GeneralClassData.Metadata.OccurenceConfigParamDep());
    }

    @objid ("d0cedd6c-a337-4366-9960-0d58ed09523a")
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

    @objid ("4cc024c0-9b89-42d5-86fc-f5a6a9be30f6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("770d812e-988a-4d98-8c7e-4ec251ba02a6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("4c4377ae-8a53-4ac8-b0b4-8f0ec879f431")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralClass(this);
        else
          return null;
    }

}
