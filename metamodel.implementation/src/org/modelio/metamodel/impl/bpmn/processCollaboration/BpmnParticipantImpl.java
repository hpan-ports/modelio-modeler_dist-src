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
    @objid ("222d0701-550c-4342-97f8-fa13fe763f8e")
    @Override
    public int getMultiplicityMin() {
        return (Integer) getAttVal(BpmnParticipantData.Metadata.MultiplicityMinAtt());
    }

    @objid ("8cf25d53-54d1-4423-aa41-d19c149cd3f0")
    @Override
    public void setMultiplicityMin(int value) {
        setAttVal(BpmnParticipantData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("c9432c72-2746-447d-9cd9-8b34fa35aaf7")
    @Override
    public int getMultiplicityMax() {
        return (Integer) getAttVal(BpmnParticipantData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("8d0765ea-7b51-4484-a4dc-4131e139fd12")
    @Override
    public void setMultiplicityMax(int value) {
        setAttVal(BpmnParticipantData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("e5299977-62fe-45e1-a7e1-9af99e1b79a2")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnParticipantData.Metadata.ProcessDep());
    }

    @objid ("40317305-1791-46f1-962d-e166073203f6")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnParticipantData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("741459c2-39b4-4eef-ae63-de132cad79eb")
    @Override
    public BpmnCollaboration getContainer() {
        return (BpmnCollaboration) getDepVal(BpmnParticipantData.Metadata.ContainerDep());
    }

    @objid ("dd71604d-b5dc-4aaf-9917-cb294f017714")
    @Override
    public void setContainer(BpmnCollaboration value) {
        appendDepVal(BpmnParticipantData.Metadata.ContainerDep(), (SmObjectImpl)value);
    }

    @objid ("7cb51591-68dd-4598-a88b-0e489431b3e1")
    @Override
    public Classifier getType() {
        return (Classifier) getDepVal(BpmnParticipantData.Metadata.TypeDep());
    }

    @objid ("876c5d45-e7ae-4903-8a8e-05a9aec39cb0")
    @Override
    public void setType(Classifier value) {
        appendDepVal(BpmnParticipantData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("0db5b805-2782-4b3d-915d-128f302a7888")
    @Override
    public EList<BpmnEndPoint> getEndPointRefs() {
        return new SmList<>(this, BpmnParticipantData.Metadata.EndPointRefsDep());
    }

    @objid ("673d4a9b-6b0f-43ab-bc63-65a0415c639f")
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

    @objid ("be101f83-87e9-4e6d-a50f-41509453bf62")
    @Override
    public EList<BpmnInterface> getInterfaceRefs() {
        return new SmList<>(this, BpmnParticipantData.Metadata.InterfaceRefsDep());
    }

    @objid ("ec0fae1b-b12a-4a80-bb0d-9cf13250e4fd")
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

    @objid ("62c8e04a-42c9-4a64-acdf-e0c06b1725f7")
    @Override
    public Package getPackageRef() {
        return (Package) getDepVal(BpmnParticipantData.Metadata.PackageRefDep());
    }

    @objid ("16cdc0d6-b406-4b07-b1ab-4f6de552b5bd")
    @Override
    public void setPackageRef(Package value) {
        appendDepVal(BpmnParticipantData.Metadata.PackageRefDep(), (SmObjectImpl)value);
    }

    @objid ("d8f36b12-b840-4b90-a5c2-2274729a3311")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnParticipantData.Metadata.ContainerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0b3b24dd-cf2b-48ea-911b-84d0c7066b87")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnParticipantData.Metadata.ContainerDep());
        if (obj != null)
          return new SmDepVal(BpmnParticipantData.Metadata.ContainerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("0a7f4819-1315-49cc-b71a-305af0f20f49")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnParticipant(this);
        else
          return null;
    }

}
