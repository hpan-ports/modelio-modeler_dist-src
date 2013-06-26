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
    @objid ("e95969fe-db74-4924-9227-9c27bbea8a5f")
    @Override
    public boolean isIsConstant() {
        return (Boolean) getAttVal(InstanceData.Metadata.IsConstantAtt());
    }

    @objid ("9ff13663-e330-429c-be17-49103ba8c92a")
    @Override
    public void setIsConstant(boolean value) {
        setAttVal(InstanceData.Metadata.IsConstantAtt(), value);
    }

    @objid ("62bdc2b2-fa7e-48a2-8da9-307d89536426")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(InstanceData.Metadata.MultiplicityMinAtt());
    }

    @objid ("deae0a12-031e-4333-9249-86c1bd4f5317")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(InstanceData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("f6a5661e-3ea6-45f0-a820-8c283581e55f")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(InstanceData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("65968ff2-738c-47b0-9568-d18574918f63")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(InstanceData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("6f21ca2a-8df3-48a0-8898-ffb0d9580cb4")
    @Override
    public String getValue() {
        return (String) getAttVal(InstanceData.Metadata.ValueAtt());
    }

    @objid ("e51f8332-9994-4676-b820-c8e7ede6c95a")
    @Override
    public void setValue(String value) {
        setAttVal(InstanceData.Metadata.ValueAtt(), value);
    }

    @objid ("0e4b6604-3ecc-45af-b72b-24f1c6bee31a")
    @Override
    public EList<CommunicationNode> getRepresentedCommunicationNode() {
        return new SmList<>(this, InstanceData.Metadata.RepresentedCommunicationNodeDep());
    }

    @objid ("630adf12-9ea2-439e-9aa9-9e7fb85c27e7")
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

    @objid ("9145e7a7-ed28-496e-9c7b-4bc6b7e0cc64")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, InstanceData.Metadata.RepresentingItemDep());
    }

    @objid ("26955911-c3b2-4430-874d-565bcf988fa4")
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

    @objid ("6edccb01-557d-40d9-b81c-8f1cc7eb1ea9")
    @Override
    public EList<LinkEnd> getOwnedEnd() {
        return new SmList<>(this, InstanceData.Metadata.OwnedEndDep());
    }

    @objid ("4bac5899-6989-4680-b3a6-5ae5f4a7748d")
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

    @objid ("e40e3f31-fa61-476e-aa10-72fe8be8d564")
    @Override
    public NameSpace getBase() {
        return (NameSpace) getDepVal(InstanceData.Metadata.BaseDep());
    }

    @objid ("1efc0a51-9ee4-4624-ad43-14c1616ba85e")
    @Override
    public void setBase(NameSpace value) {
        appendDepVal(InstanceData.Metadata.BaseDep(), (SmObjectImpl)value);
    }

    @objid ("ca183d9b-1435-40b0-b6dd-8e4175b98ce2")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, InstanceData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("2f56d05c-a999-44e3-bac4-ff9fb577133b")
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

    @objid ("ae6c3c7e-3e8d-42ca-b74d-86316c46f597")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(InstanceData.Metadata.OwnerDep());
    }

    @objid ("b23f829f-a82f-409d-bfff-3258853c387a")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(InstanceData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("08cb3d2d-b920-4090-99f7-40d24ba89a9b")
    @Override
    public EList<NaryLinkEnd> getOwnedNaryEnd() {
        return new SmList<>(this, InstanceData.Metadata.OwnedNaryEndDep());
    }

    @objid ("df02a519-956f-43c2-979d-a29739adea75")
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

    @objid ("4a41940b-9a4c-447f-af41-ef31cc2b0257")
    @Override
    public EList<Lifeline> getRepresentedLifeLine() {
        return new SmList<>(this, InstanceData.Metadata.RepresentedLifeLineDep());
    }

    @objid ("5df2fa83-c6b2-4212-a86b-4817139bdca2")
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

    @objid ("71288670-9f62-4405-860b-ce4f52b1be6a")
    @Override
    public EList<AttributeLink> getSlot() {
        return new SmList<>(this, InstanceData.Metadata.SlotDep());
    }

    @objid ("cb80a89f-f134-4027-98cd-81d1d994deef")
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

    @objid ("a969fe71-355e-4725-ac46-0236881ca50c")
    @Override
    public EList<BindableInstance> getPart() {
        return new SmList<>(this, InstanceData.Metadata.PartDep());
    }

    @objid ("81e92ca7-46e1-493a-8642-119a3bdc7f90")
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

    @objid ("172b10a2-31ef-4527-8d2b-c3f2cdd5f594")
    @Override
    public EList<LinkEnd> getTargetingEnd() {
        return new SmList<>(this, InstanceData.Metadata.TargetingEndDep());
    }

    @objid ("ec9248ac-c3c8-4b43-a948-df1d7936fb9b")
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

    @objid ("4a8fb36f-f451-4cd6-a942-3460b8411086")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InstanceData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("f8f64238-ebf5-4f70-b252-d70122462c73")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InstanceData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(InstanceData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e6bf1180-e508-405a-957d-0021f72c2bfe")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInstance(this);
        else
          return null;
    }

}
