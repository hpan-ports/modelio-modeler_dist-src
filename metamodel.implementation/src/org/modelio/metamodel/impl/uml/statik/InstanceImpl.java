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
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000d8770-c4bf-1fd8-97fe-001ec947cd2a")
public class InstanceImpl extends ModelElementImpl implements Instance {
    @objid ("b8d1cc2f-f0bf-4864-a81d-12c30bdb6ef6")
    @Override
    public boolean isIsConstant() {
        return (Boolean) getAttVal(InstanceData.Metadata.IsConstantAtt());
    }

    @objid ("ba2d7e7c-5a5d-4f55-845e-c023f83243a0")
    @Override
    public void setIsConstant(boolean value) {
        setAttVal(InstanceData.Metadata.IsConstantAtt(), value);
    }

    @objid ("2f5de6c6-c2e0-4562-ba4e-2e2d4d47f8df")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(InstanceData.Metadata.MultiplicityMinAtt());
    }

    @objid ("7db1b38d-966d-4f18-ad8d-ed6a93e353ca")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(InstanceData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("587f560f-4a08-4d6d-b5be-d5fbdac896d0")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(InstanceData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("042e7328-bcb7-4a16-838a-05f4fc42f3db")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(InstanceData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("0010832c-21f1-4244-8061-f8568892862c")
    @Override
    public String getValue() {
        return (String) getAttVal(InstanceData.Metadata.ValueAtt());
    }

    @objid ("a8ee1122-09c9-4a78-be28-41f1c0b9301a")
    @Override
    public void setValue(String value) {
        setAttVal(InstanceData.Metadata.ValueAtt(), value);
    }

    @objid ("359840e9-7b9d-4b15-b5bf-b4b6a3b5b828")
    @Override
    public EList<CommunicationNode> getRepresentedCommunicationNode() {
        return new SmList<>(this, InstanceData.Metadata.RepresentedCommunicationNodeDep());
    }

    @objid ("2f9c3906-66da-4b84-ae33-1cd45501c289")
    @Override
    public <T extends CommunicationNode> List<T> getRepresentedCommunicationNode(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationNode element : getRepresentedCommunicationNode()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("94b3f4fd-fac5-433c-bc98-b35606ac3af2")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, InstanceData.Metadata.RepresentingItemDep());
    }

    @objid ("b22591e1-619b-4e5f-a40d-889208650e1e")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnItemAwareElement element : getRepresentingItem()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("84491f88-3a42-41ea-8ff7-1096e1f98df9")
    @Override
    public EList<LinkEnd> getOwnedEnd() {
        return new SmList<>(this, InstanceData.Metadata.OwnedEndDep());
    }

    @objid ("a9468ef3-a799-4e35-b0fa-21bdcc1c6c10")
    @Override
    public <T extends LinkEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LinkEnd element : getOwnedEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c9f5e8d4-be3e-4812-b1ec-90aff6fe512c")
    @Override
    public NameSpace getBase() {
        return (NameSpace) getDepVal(InstanceData.Metadata.BaseDep());
    }

    @objid ("385edd79-43ef-4438-8248-b5b2b0471f6a")
    @Override
    public void setBase(NameSpace value) {
        appendDepVal(InstanceData.Metadata.BaseDep(), (SmObjectImpl)value);
    }

    @objid ("21dcc323-87b9-4ee4-ba83-0d62bac2906c")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, InstanceData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("2124f49c-0d92-4e1c-a289-01b147547fae")
    @Override
    public <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ObjectNode element : getRepresentingObjectNode()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("157e7d49-205b-4c34-b680-57e1b5c568cf")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(InstanceData.Metadata.OwnerDep());
    }

    @objid ("1100e901-f1ba-43d5-80ba-59ae6e624e59")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(InstanceData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("24404780-c7f4-4804-993d-7fc86b5af9ee")
    @Override
    public EList<NaryLinkEnd> getOwnedNaryEnd() {
        return new SmList<>(this, InstanceData.Metadata.OwnedNaryEndDep());
    }

    @objid ("0989f881-2cbd-4d31-8cc9-3f1d3c32802f")
    @Override
    public <T extends NaryLinkEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryLinkEnd element : getOwnedNaryEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("03cdecc3-f6f1-4e63-b81c-81b5a1e5d842")
    @Override
    public EList<Lifeline> getRepresentedLifeLine() {
        return new SmList<>(this, InstanceData.Metadata.RepresentedLifeLineDep());
    }

    @objid ("72ea3569-7b96-46fe-ab54-0da8b6c2d175")
    @Override
    public <T extends Lifeline> List<T> getRepresentedLifeLine(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Lifeline element : getRepresentedLifeLine()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("584cbcec-3905-4bae-9c11-d9c885e76691")
    @Override
    public EList<AttributeLink> getSlot() {
        return new SmList<>(this, InstanceData.Metadata.SlotDep());
    }

    @objid ("31fdfe5f-5ed2-40da-8c75-68ad90fc9045")
    @Override
    public <T extends AttributeLink> List<T> getSlot(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AttributeLink element : getSlot()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6b0dfed4-8bec-4d06-951a-fd8c2e396486")
    @Override
    public EList<BindableInstance> getPart() {
        return new SmList<>(this, InstanceData.Metadata.PartDep());
    }

    @objid ("4aa09445-29cb-4eec-b3f5-eeac1d3c1def")
    @Override
    public <T extends BindableInstance> List<T> getPart(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BindableInstance element : getPart()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f8bc5b23-5a28-4c5c-af8f-a5223db6fff1")
    @Override
    public EList<LinkEnd> getTargetingEnd() {
        return new SmList<>(this, InstanceData.Metadata.TargetingEndDep());
    }

    @objid ("6e4baa09-d5a8-4895-9370-df66576361a1")
    @Override
    public <T extends LinkEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LinkEnd element : getTargetingEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9a431147-74f1-4a89-aebb-a3aa16790a86")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InstanceData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("76f9c8ac-c2ca-44ba-87b1-8ed43809a26d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InstanceData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(InstanceData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("8798ca20-209a-4768-86ca-be9da9a8af53")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInstance(this);
        else
          return null;
    }

}
