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
package org.modelio.metamodel.impl.uml.informationFlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.StructuralFeature;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("006399b2-c4bf-1fd8-97fe-001ec947cd2a")
public class InformationFlowImpl extends ModelElementImpl implements InformationFlow {
    @objid ("9d7bb2f5-cc1c-40d5-87d9-a7cab68eaa07")
    @Override
    public NameSpace getOwner() {
        Object obj = getDepVal(((InformationFlowSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("437a351a-1490-4dc2-8c5c-848eeabef018")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(((InformationFlowSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("68ec723c-8d56-4958-8ffc-9d114236808a")
    @Override
    public EList<ModelElement> getInformationSource() {
        return new SmList<>(this, ((InformationFlowSmClass)getClassOf()).getInformationSourceDep());
    }

    @objid ("dbe7c5ce-3f1c-48ad-ac12-73b93d6e6f58")
    @Override
    public <T extends ModelElement> List<T> getInformationSource(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ModelElement element : getInformationSource()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6831ba84-b6cf-41c3-a528-de4832a9efd3")
    @Override
    public EList<ModelElement> getInformationTarget() {
        return new SmList<>(this, ((InformationFlowSmClass)getClassOf()).getInformationTargetDep());
    }

    @objid ("1e7a8949-d684-4137-8cf0-f56ebd0aa907")
    @Override
    public <T extends ModelElement> List<T> getInformationTarget(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ModelElement element : getInformationTarget()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8c6cfa89-2462-4e6c-9165-3e25645bec17")
    @Override
    public EList<ActivityEdge> getRealizingActivityEdge() {
        return new SmList<>(this, ((InformationFlowSmClass)getClassOf()).getRealizingActivityEdgeDep());
    }

    @objid ("1ee9f880-186d-4afd-8a58-1681a4b1fe17")
    @Override
    public <T extends ActivityEdge> List<T> getRealizingActivityEdge(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ActivityEdge element : getRealizingActivityEdge()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("53e96784-6310-447c-b1c6-af67d3346e37")
    @Override
    public EList<CommunicationMessage> getRealizingCommunicationMessage() {
        return new SmList<>(this, ((InformationFlowSmClass)getClassOf()).getRealizingCommunicationMessageDep());
    }

    @objid ("5bc92be9-ba51-4e00-b116-9273a9f56abd")
    @Override
    public <T extends CommunicationMessage> List<T> getRealizingCommunicationMessage(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CommunicationMessage element : getRealizingCommunicationMessage()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a1d8a351-0d82-4dd6-b6e4-5a7cce8b7f6f")
    @Override
    public EList<StructuralFeature> getRealizingFeature() {
        return new SmList<>(this, ((InformationFlowSmClass)getClassOf()).getRealizingFeatureDep());
    }

    @objid ("19d4679c-7334-44ee-9e4f-29a268d5b185")
    @Override
    public <T extends StructuralFeature> List<T> getRealizingFeature(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final StructuralFeature element : getRealizingFeature()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f404bbda-0b09-4e4a-9847-71b283e51d63")
    @Override
    public EList<LinkEnd> getRealizingLink() {
        return new SmList<>(this, ((InformationFlowSmClass)getClassOf()).getRealizingLinkDep());
    }

    @objid ("42993f7d-db36-4ad6-845b-649182a686e6")
    @Override
    public <T extends LinkEnd> List<T> getRealizingLink(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final LinkEnd element : getRealizingLink()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("eee369e7-8d87-4407-bd94-4dfa0aed5c26")
    @Override
    public EList<Message> getRealizingMessage() {
        return new SmList<>(this, ((InformationFlowSmClass)getClassOf()).getRealizingMessageDep());
    }

    @objid ("ad5fe557-2c96-47e2-8d15-494d0a7a8cd4")
    @Override
    public <T extends Message> List<T> getRealizingMessage(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Message element : getRealizingMessage()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d1e719cc-f2ce-4ab6-8218-a16d2944ba07")
    @Override
    public EList<NaryLink> getRealizingNaryLink() {
        return new SmList<>(this, ((InformationFlowSmClass)getClassOf()).getRealizingNaryLinkDep());
    }

    @objid ("279485dd-becb-446c-84f8-110613d61f24")
    @Override
    public <T extends NaryLink> List<T> getRealizingNaryLink(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final NaryLink element : getRealizingNaryLink()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("48182258-2b45-48d2-aaae-ed9a1012d9de")
    @Override
    public EList<Classifier> getConveyed() {
        return new SmList<>(this, ((InformationFlowSmClass)getClassOf()).getConveyedDep());
    }

    @objid ("8e430a0f-52f3-48ad-8e5e-2bdaf5cfd9c9")
    @Override
    public <T extends Classifier> List<T> getConveyed(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Classifier element : getConveyed()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c7b219e0-55b3-4ffd-b647-c45341a10468")
    @Override
    public AssociationEnd getChannel() {
        Object obj = getDepVal(((InformationFlowSmClass)getClassOf()).getChannelDep());
        return (obj instanceof AssociationEnd)? (AssociationEnd)obj : null;
    }

    @objid ("65cc6759-49e7-4ebd-9ff1-be8db6aca521")
    @Override
    public void setChannel(AssociationEnd value) {
        appendDepVal(((InformationFlowSmClass)getClassOf()).getChannelDep(), (SmObjectImpl)value);
    }

    @objid ("cce880a6-d6aa-4e7d-a8da-5fc7905dcb94")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((InformationFlowSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4c57d351-308f-438d-a693-b59044512055")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((InformationFlowSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("d50f8cf5-2773-496d-bb61-f97bceabe6dc")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInformationFlow(this);
        else
          return null;
    }

}
