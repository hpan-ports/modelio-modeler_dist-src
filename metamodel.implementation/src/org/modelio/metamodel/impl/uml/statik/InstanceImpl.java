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
    @objid ("6268b516-b4f9-4c79-8ab3-16bb584b26b0")
    @Override
    public boolean isIsConstant() {
        return (Boolean) getAttVal(InstanceData.Metadata.IsConstantAtt());
    }

    @objid ("ac29a3bc-ffba-48ff-ac31-7fd0337c4ae5")
    @Override
    public void setIsConstant(boolean value) {
        setAttVal(InstanceData.Metadata.IsConstantAtt(), value);
    }

    @objid ("feade99a-10dd-4bde-a47d-0f9ddb46880c")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(InstanceData.Metadata.MultiplicityMinAtt());
    }

    @objid ("2ff1ec21-48d7-41ee-af13-e0a62629eae1")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(InstanceData.Metadata.MultiplicityMinAtt(), value);
    }

    @objid ("90927c2f-52ae-42c8-bbef-e9ee7e60b46e")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(InstanceData.Metadata.MultiplicityMaxAtt());
    }

    @objid ("468fbcdb-cf2a-4c0d-af94-0708c232f033")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(InstanceData.Metadata.MultiplicityMaxAtt(), value);
    }

    @objid ("bc53591c-2fd2-4f1a-9483-7995fed5b825")
    @Override
    public String getValue() {
        return (String) getAttVal(InstanceData.Metadata.ValueAtt());
    }

    @objid ("1439d258-c913-47c4-9157-5d9b6ad26605")
    @Override
    public void setValue(String value) {
        setAttVal(InstanceData.Metadata.ValueAtt(), value);
    }

    @objid ("872f8ae6-ed8a-4731-acd6-52d6208bbaed")
    @Override
    public EList<CommunicationNode> getRepresentedCommunicationNode() {
        return new SmList<>(this, InstanceData.Metadata.RepresentedCommunicationNodeDep());
    }

    @objid ("239dafa9-0a9e-4468-b872-9f4062d5cef1")
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

    @objid ("ac0156e3-f38f-4d28-83f8-a711657b06a8")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, InstanceData.Metadata.RepresentingItemDep());
    }

    @objid ("88fa5fbc-2db7-4036-bac3-ae97d6a703fd")
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

    @objid ("36a5e3fd-40da-49a7-991c-8810e575655a")
    @Override
    public EList<LinkEnd> getOwnedEnd() {
        return new SmList<>(this, InstanceData.Metadata.OwnedEndDep());
    }

    @objid ("abaa3986-4acd-432f-95ac-d5f2bd1b1bb5")
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

    @objid ("b69eae55-8091-4cd4-9b9a-9d5c3b767a5d")
    @Override
    public NameSpace getBase() {
        return (NameSpace) getDepVal(InstanceData.Metadata.BaseDep());
    }

    @objid ("469c04a9-acc4-428c-ac92-5ea47886b366")
    @Override
    public void setBase(NameSpace value) {
        appendDepVal(InstanceData.Metadata.BaseDep(), (SmObjectImpl)value);
    }

    @objid ("7eb4c34b-b10c-4048-b8f5-ff1902575beb")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, InstanceData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("d25d5ee8-41a2-47ae-bf59-4c6915a809f6")
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

    @objid ("8b5e1caa-13d3-4aed-8755-8a30f94fdf9f")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(InstanceData.Metadata.OwnerDep());
    }

    @objid ("15f14b97-f36f-49ce-acd9-be1905edaa8a")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(InstanceData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("d3bfebd9-9c6e-4f33-949c-3fe6407038c2")
    @Override
    public EList<NaryLinkEnd> getOwnedNaryEnd() {
        return new SmList<>(this, InstanceData.Metadata.OwnedNaryEndDep());
    }

    @objid ("89adca98-9946-4ed8-9359-da12db4346a6")
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

    @objid ("fbe3a577-e16d-4c5e-9942-88034844dc56")
    @Override
    public EList<Lifeline> getRepresentedLifeLine() {
        return new SmList<>(this, InstanceData.Metadata.RepresentedLifeLineDep());
    }

    @objid ("d75f8142-94a8-4d0c-adda-d0fa2b0a75cc")
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

    @objid ("a408c5f8-8089-4d3a-bedb-199ab892acd4")
    @Override
    public EList<AttributeLink> getSlot() {
        return new SmList<>(this, InstanceData.Metadata.SlotDep());
    }

    @objid ("0bcf05b9-a001-424b-8f21-48c569e63517")
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

    @objid ("09f3133f-eef7-48bc-ad74-c3b2277ffd97")
    @Override
    public EList<BindableInstance> getPart() {
        return new SmList<>(this, InstanceData.Metadata.PartDep());
    }

    @objid ("0b05505c-8a39-4f28-b6dd-69fa313bf78c")
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

    @objid ("c897908c-1bf9-4af9-8c05-9c6b502b8dde")
    @Override
    public EList<LinkEnd> getTargetingEnd() {
        return new SmList<>(this, InstanceData.Metadata.TargetingEndDep());
    }

    @objid ("8455394f-98ce-43f8-95d3-16cf9a4ee61d")
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

    @objid ("822b2515-b6e4-4824-9fbf-5368e541d604")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InstanceData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ced61bf3-c911-4c09-baf2-95cb61c8aa72")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InstanceData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(InstanceData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("657f83b2-6eac-4acd-94ce-5fd7dafe1f30")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInstance(this);
        else
          return null;
    }

}
