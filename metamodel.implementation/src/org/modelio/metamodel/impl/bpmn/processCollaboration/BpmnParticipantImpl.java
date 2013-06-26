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
    @objid ("969a3f87-16c0-4936-8e42-90b932777261")
    @Override
    public int getMultiplicityMin() {
        return (Integer) getAttVal(BpmnParticipantData.Metadata.MultiplicityMinAtt());
    }

    @objid ("4333e169-bb7d-4c72-acc0-51e57468a543")
    @Override
    public void setMultiplicityMin(int value) {
        setAttVal(BpmnParticipantData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("5dbffca7-7e4f-45cd-99d0-26e107fc7e20")
    @Override
    public int getMultiplicityMax() {
        return (Integer) getAttVal(BpmnParticipantData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("e737a7ac-5398-4cf7-a0dc-d9e4a04709e0")
    @Override
    public void setMultiplicityMax(int value) {
        setAttVal(BpmnParticipantData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("481d0ab9-dd34-4326-a2da-901e8e733417")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnParticipantData.Metadata.ProcessDep());
    }

    @objid ("e1c7bc79-4e4b-4130-8f25-55b1afb09bf3")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnParticipantData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("28dee5a9-c6da-42c9-a018-78f0157d1992")
    @Override
    public BpmnCollaboration getContainer() {
        return (BpmnCollaboration) getDepVal(BpmnParticipantData.Metadata.ContainerDep());
    }

    @objid ("fe1b0d33-c15a-44a5-9fdb-dc572c1ccfd8")
    @Override
    public void setContainer(BpmnCollaboration value) {
        appendDepVal(BpmnParticipantData.Metadata.ContainerDep(), (SmObjectImpl)value);
    }

    @objid ("5e67542e-5496-4d50-9283-91722d821fad")
    @Override
    public Classifier getType() {
        return (Classifier) getDepVal(BpmnParticipantData.Metadata.TypeDep());
    }

    @objid ("d06bcf64-6fee-4b26-8050-b5c3b1c2c848")
    @Override
    public void setType(Classifier value) {
        appendDepVal(BpmnParticipantData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("74780366-f1b6-42b7-be42-8538f7cfd126")
    @Override
    public EList<BpmnEndPoint> getEndPointRefs() {
        return new SmList<>(this, BpmnParticipantData.Metadata.EndPointRefsDep());
    }

    @objid ("9984520f-ff25-466c-9ab3-f8dd656a012c")
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

    @objid ("e95a573e-7e29-4d10-87c9-ab0d26ae53aa")
    @Override
    public EList<BpmnInterface> getInterfaceRefs() {
        return new SmList<>(this, BpmnParticipantData.Metadata.InterfaceRefsDep());
    }

    @objid ("d83bd3b1-33f1-456d-8152-5170400ea432")
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

    @objid ("cadc13f3-9314-4223-93bb-43055fec311c")
    @Override
    public Package getPackageRef() {
        return (Package) getDepVal(BpmnParticipantData.Metadata.PackageRefDep());
    }

    @objid ("8fb110b6-3b3e-4f4a-8bd9-878ca76f34f6")
    @Override
    public void setPackageRef(Package value) {
        appendDepVal(BpmnParticipantData.Metadata.PackageRefDep(), (SmObjectImpl)value);
    }

    @objid ("5dbe44f6-942c-47dc-92e6-1c4929f68f23")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnParticipantData.Metadata.ContainerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("211faeca-706e-484e-9dc0-60fb8a153ff0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnParticipantData.Metadata.ContainerDep());
        if (obj != null)
          return new SmDepVal(BpmnParticipantData.Metadata.ContainerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("647fb59f-534c-444b-80ae-61513b6a0257")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnParticipant(this);
        else
          return null;
    }

}
