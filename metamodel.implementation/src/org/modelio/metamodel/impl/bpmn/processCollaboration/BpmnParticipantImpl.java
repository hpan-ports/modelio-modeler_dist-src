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
package org.modelio.metamodel.impl.bpmn.processCollaboration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.bpmnService.BpmnEndPoint;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0075ac2e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnParticipantImpl extends BpmnBaseElementImpl implements BpmnParticipant {
    @objid ("8af3f0af-6fa2-428d-8016-52093ef5298b")
    @Override
    public int getMultiplicityMin() {
        return (Integer) getAttVal(BpmnParticipantData.Metadata.MultiplicityMinAtt());
    }

    @objid ("891f2647-67e5-4344-ba5a-231a22cf2920")
    @Override
    public void setMultiplicityMin(int value) {
        setAttVal(BpmnParticipantData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("10cb1ce7-b07c-4f5d-81c0-fed80a91f4da")
    @Override
    public int getMultiplicityMax() {
        return (Integer) getAttVal(BpmnParticipantData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("6f896025-438d-4fb7-9bb2-5a47eacbc7af")
    @Override
    public void setMultiplicityMax(int value) {
        setAttVal(BpmnParticipantData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("61f74e0c-4ea3-4922-94f4-efb3bf05f7a9")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnParticipantData.Metadata.ProcessDep());
    }

    @objid ("89b28510-772c-4743-ad6b-a09b5b6c0d1b")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnParticipantData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("6e1df184-0b1e-47b5-9221-04ec9f96fa19")
    @Override
    public BpmnCollaboration getContainer() {
        return (BpmnCollaboration) getDepVal(BpmnParticipantData.Metadata.ContainerDep());
    }

    @objid ("1ac19f76-ff51-451d-8e7e-a39555d5a0d5")
    @Override
    public void setContainer(BpmnCollaboration value) {
        appendDepVal(BpmnParticipantData.Metadata.ContainerDep(), (SmObjectImpl)value);
    }

    @objid ("73c378de-5541-47a3-b003-db74152a00fb")
    @Override
    public Classifier getType() {
        return (Classifier) getDepVal(BpmnParticipantData.Metadata.TypeDep());
    }

    @objid ("50b4e6b2-7046-4a3c-ae69-864a75fff199")
    @Override
    public void setType(Classifier value) {
        appendDepVal(BpmnParticipantData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("39db29b8-aa4f-46ed-bbd7-e67a14210043")
    @Override
    public EList<BpmnEndPoint> getEndPointRefs() {
        return new SmList<>(this, BpmnParticipantData.Metadata.EndPointRefsDep());
    }

    @objid ("fe1c84e8-f7a2-4b03-8e63-6b7d27ce3eba")
    @Override
    public <T extends BpmnEndPoint> List<T> getEndPointRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnEndPoint element : getEndPointRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7e92e185-c360-484b-9145-14513546abb2")
    @Override
    public EList<BpmnInterface> getInterfaceRefs() {
        return new SmList<>(this, BpmnParticipantData.Metadata.InterfaceRefsDep());
    }

    @objid ("f9b7ef9d-432c-4b81-ad48-c3919d6e0ff4")
    @Override
    public <T extends BpmnInterface> List<T> getInterfaceRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnInterface element : getInterfaceRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("124cdaf1-7dab-4180-b1e8-dc010feeca73")
    @Override
    public Package getPackageRef() {
        return (Package) getDepVal(BpmnParticipantData.Metadata.PackageRefDep());
    }

    @objid ("fa2d835b-ddfc-4781-9322-0452434fc425")
    @Override
    public void setPackageRef(Package value) {
        appendDepVal(BpmnParticipantData.Metadata.PackageRefDep(), (SmObjectImpl)value);
    }

    @objid ("c3a624fc-b223-4bae-90bf-627d2180daa2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnParticipantData.Metadata.ContainerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a5e43c0e-6ab9-4523-9e9e-4758e60ee2ea")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnParticipantData.Metadata.ContainerDep());
        if (obj != null)
          return new SmDepVal(BpmnParticipantData.Metadata.ContainerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("044405e4-a5db-44d2-a246-ea0f0e8fd2d8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnParticipant(this);
        else
          return null;
    }

}
