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
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnParticipantData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0075ac2e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnParticipantImpl extends BpmnBaseElementImpl implements BpmnParticipant {
    @objid ("7d13e619-2ebc-4308-b2fd-b978835a69ae")
    @Override
    public int getMultiplicityMin() {
        return (Integer) getAttVal(((BpmnParticipantSmClass)getClassOf()).getMultiplicityMinAtt());
    }

    @objid ("32820cc5-8eb4-4453-aa48-a7c8f5aa0a08")
    @Override
    public void setMultiplicityMin(int value) {
        setAttVal(((BpmnParticipantSmClass)getClassOf()).getMultiplicityMinAtt(), value);
    }

    @objid ("3e32debc-28c4-4fa4-afd2-8b048d2232b3")
    @Override
    public int getMultiplicityMax() {
        return (Integer) getAttVal(((BpmnParticipantSmClass)getClassOf()).getMultiplicityMaxAtt());
    }

    @objid ("de5ada92-2908-4296-85e4-7ae9d824c543")
    @Override
    public void setMultiplicityMax(int value) {
        setAttVal(((BpmnParticipantSmClass)getClassOf()).getMultiplicityMaxAtt(), value);
    }

    @objid ("b4e3f557-ed8f-4bb9-9b07-8fc7b186f8ad")
    @Override
    public BpmnProcess getProcess() {
        Object obj = getDepVal(((BpmnParticipantSmClass)getClassOf()).getProcessDep());
        return (obj instanceof BpmnProcess)? (BpmnProcess)obj : null;
    }

    @objid ("b7770de9-30fe-4a44-9bca-3852394c6a71")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(((BpmnParticipantSmClass)getClassOf()).getProcessDep(), (SmObjectImpl)value);
    }

    @objid ("fb5eb72b-771f-4567-8d22-28b481d8cfaf")
    @Override
    public BpmnCollaboration getContainer() {
        Object obj = getDepVal(((BpmnParticipantSmClass)getClassOf()).getContainerDep());
        return (obj instanceof BpmnCollaboration)? (BpmnCollaboration)obj : null;
    }

    @objid ("3d36a37d-91bb-4258-a659-32becb78ca2f")
    @Override
    public void setContainer(BpmnCollaboration value) {
        appendDepVal(((BpmnParticipantSmClass)getClassOf()).getContainerDep(), (SmObjectImpl)value);
    }

    @objid ("c8a3eeea-b00a-4d14-8e9e-55bb7803075a")
    @Override
    public Classifier getType() {
        Object obj = getDepVal(((BpmnParticipantSmClass)getClassOf()).getTypeDep());
        return (obj instanceof Classifier)? (Classifier)obj : null;
    }

    @objid ("80cfb7b9-213d-431f-b7ea-20cd570e36fe")
    @Override
    public void setType(Classifier value) {
        appendDepVal(((BpmnParticipantSmClass)getClassOf()).getTypeDep(), (SmObjectImpl)value);
    }

    @objid ("9f5ae737-fede-42ed-993f-55b425fa428f")
    @Override
    public EList<BpmnEndPoint> getEndPointRefs() {
        return new SmList<>(this, ((BpmnParticipantSmClass)getClassOf()).getEndPointRefsDep());
    }

    @objid ("29d2adba-1385-4a85-bfbd-32074610bd68")
    @Override
    public <T extends BpmnEndPoint> List<T> getEndPointRefs(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnEndPoint element : getEndPointRefs()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("33883a64-605b-4fb5-87ec-2fe98cc3d7f9")
    @Override
    public EList<BpmnInterface> getInterfaceRefs() {
        return new SmList<>(this, ((BpmnParticipantSmClass)getClassOf()).getInterfaceRefsDep());
    }

    @objid ("1fe7bcf7-e3a8-4e45-885f-0defd26e17b9")
    @Override
    public <T extends BpmnInterface> List<T> getInterfaceRefs(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnInterface element : getInterfaceRefs()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1bff9417-4dd6-496f-814a-6705c2b19aeb")
    @Override
    public Package getPackageRef() {
        Object obj = getDepVal(((BpmnParticipantSmClass)getClassOf()).getPackageRefDep());
        return (obj instanceof Package)? (Package)obj : null;
    }

    @objid ("9a016301-0fe4-4cca-9de5-00cb0769cca2")
    @Override
    public void setPackageRef(Package value) {
        appendDepVal(((BpmnParticipantSmClass)getClassOf()).getPackageRefDep(), (SmObjectImpl)value);
    }

    @objid ("3fd9367f-7382-4c09-9620-604975f5b445")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Container
        obj = (SmObjectImpl)this.getDepVal(((BpmnParticipantSmClass)getClassOf()).getContainerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("be917a92-5b68-4c02-a4ea-deb2cdbe3ec7")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Container
        dep = ((BpmnParticipantSmClass)getClassOf()).getContainerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("76c2b4bc-98b9-4a55-897c-bd63f701e387")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnParticipant(this);
        else
          return null;
    }

}
