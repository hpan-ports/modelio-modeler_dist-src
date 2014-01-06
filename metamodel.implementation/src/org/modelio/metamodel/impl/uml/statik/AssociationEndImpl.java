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
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00977eda-c4be-1fd8-97fe-001ec947cd2a")
public class AssociationEndImpl extends StructuralFeatureImpl implements AssociationEnd {
    /**
     * Compute the association navigability from all roles construction.
     * @return the association navigability.
     */
    @objid ("779babaf-b95e-442f-9c0d-af9c01f610c7")
    @Override
    public boolean isNavigable() {
        return getTarget() != null;
    }

    @objid ("00174af8-22ac-1080-943a-001ec947cd2a")
    @Override
    public void setNavigable(final boolean isNavigable) {
        AssociationEnd opposite = getOpposite();
        boolean otherNavigable = opposite.isNavigable();
        
        // The source classifier is the current source or the opposite end's target according to the old navigability
        Classifier source = getSource() != null ? getSource() : opposite.getTarget();
        
        // The target classifier is the opposite end's source or the current target according to the old navigability
        Classifier target = opposite.getSource() != null ? opposite.getSource() : getTarget();
        
        if (isNavigable && !otherNavigable) { // THIS SIDE
            this.setSource(source);
            this.setTarget(target);
        
            opposite.setSource(null);
            opposite.setTarget(null);
        } else if (!isNavigable && otherNavigable) { // OTHER SIDE
            this.setSource(null);
            this.setTarget(null);
        
            opposite.setSource(target);
            opposite.setTarget(source);
        } else if (isNavigable && otherNavigable) { // BOTH SIDES
            this.setSource(source);
            this.setTarget(target);
        
            opposite.setSource(target);
            opposite.setTarget(source);
        } else if (!isNavigable && !otherNavigable) { // NONE
            this.setSource(source);
            this.setTarget(null);
        
            opposite.setSource(target);
            opposite.setTarget(null);
        
        }
    }

    @objid ("0019e09c-22ac-1080-943a-001ec947cd2a")
    @Override
    public void setSource(final Classifier value, boolean fixModel) {
        if (fixModel) {
            boolean isNavigable = isNavigable();
        
            AssociationEnd opposite = getOpposite();
            boolean otherNavigable = opposite.isNavigable();
        
            Classifier source = value;
        
            // The target classifier is the opposite end's source or the current target according to the old navigability
            Classifier target = opposite.getSource() != null ? opposite.getSource() : getTarget();
        
            if (isNavigable && !otherNavigable) { // THIS SIDE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(null);
                opposite.setTarget(null);
            } else if (!isNavigable && otherNavigable) { // OTHER SIDE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(target);
                opposite.setTarget(source);
            } else if (isNavigable && otherNavigable) { // BOTH SIDES
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(target);
                opposite.setTarget(source);
            } else if (!isNavigable && !otherNavigable) { // NONE
                this.setSource(source);
                this.setTarget(null);
        
                opposite.setSource(target);
                opposite.setTarget(null);
            }
        } else {
            setSource(value);
        }
    }

    @objid ("001b2470-22ac-1080-943a-001ec947cd2a")
    @Override
    public void setTarget(final Classifier value, boolean fixModel) {
        if (fixModel) {
            boolean isNavigable = isNavigable();
        
            AssociationEnd opposite = getOpposite();
            boolean otherNavigable = opposite.isNavigable();
        
            // The source classifier is the current source or the opposite end's target according to the old navigability
            Classifier source = getSource() != null ? getSource() : opposite.getTarget();
        
            Classifier target = value;
        
            if (isNavigable && !otherNavigable) { // THIS SIDE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(null);
                opposite.setTarget(null);
            } else if (!isNavigable && otherNavigable) { // OTHER SIDE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(target);
                opposite.setTarget(source);
            } else if (isNavigable && otherNavigable) { // BOTH SIDES
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(target);
                opposite.setTarget(source);
            } else if (!isNavigable && !otherNavigable) { // NONE
                this.setSource(source);
                this.setTarget(target);
        
                opposite.setSource(null);
                opposite.setTarget(null);
            }
        } else {
            setTarget(value);
        }
    }

    @objid ("007041ee-1a19-10a1-88a0-001ec947cd2a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl ret = (SmObjectImpl) getSource();
        
        if (ret != null)
            return ret;
        else {
            // Return the 'opposite' role only if it has a source:
            // Avoid cycle if both ends have no source.
            AssociationEnd opp = getOpposite();
            if (opp != null && opp.getSource() != null)
                return (SmObjectImpl) opp;
            else
                return null;
        }
    }

    @objid ("6f0ba97d-5b41-11e2-90ce-002564c97630")
    @Override
    public List<SmObjectImpl> getCompositionChildren() {
        final List<SmObjectImpl> compositionChildren = super.getCompositionChildren();
        
        AssociationEnd opp = getOpposite();
        
        // Avoid composition loops...
        if (opp != null && opp.getSource() != null) {
            // The other side has a 'strong' owner, do not return it as a child
            compositionChildren.remove(opp);
        }
        return compositionChildren;
    }

    @objid ("0070616a-1a19-10a1-88a0-001ec947cd2a")
    @Override
    public SmDepVal getCompositionRelation() {
        // First look for 'source'
        SmObjectImpl obj = (SmObjectImpl) getDepVal(AssociationEndData.Metadata.SourceDep());
        if (obj != null) {
            return new SmDepVal(AssociationEndData.Metadata.SourceDep(), obj);
        } 
        
        // Return the 'opposite' role only if it has a source:
        // Avoid cycle if both ends have no source.
        AssociationEnd opp = getOpposite();
        
        if (opp != null && opp.getSource() != null) {
            return new SmDepVal(AssociationEndData.Metadata.OppositeOwnerDep(), opp);
        } else {
            return null;
        }
    }

    @objid ("7d321404-ca63-4d7b-93d6-9eeaed9fe01f")
    @Override
    public Classifier getOwner() {
        Classifier source = getSource();
        if (source != null) {
            return source;
        } else {
            AssociationEnd opposite = getOpposite();
            return opposite != null ? opposite.getTarget(): null;   
        }
    }

    @objid ("02f34a54-06db-49cc-96a4-9581c540d8fd")
    @Override
    public AggregationKind getAggregation() {
        return (AggregationKind) getAttVal(AssociationEndData.Metadata.AggregationAtt());
    }

    @objid ("e7c86153-3ab1-40d1-a03f-9186639ef22c")
    @Override
    public void setAggregation(AggregationKind value) {
        setAttVal(AssociationEndData.Metadata.AggregationAtt(), value);
    }

    @objid ("bd50ed26-99e7-41cd-bdb3-7bb5be9e0ae2")
    @Override
    public boolean isIsChangeable() {
        return (Boolean) getAttVal(AssociationEndData.Metadata.IsChangeableAtt());
    }

    @objid ("e4a2ad1a-8b0b-4843-b440-b2dac0e503d6")
    @Override
    public void setIsChangeable(boolean value) {
        setAttVal(AssociationEndData.Metadata.IsChangeableAtt(), value);
    }

    @objid ("ea384943-9a95-4c11-a168-ef4868c02488")
    @Override
    public Classifier getTarget() {
        return (Classifier) getDepVal(AssociationEndData.Metadata.TargetDep());
    }

    @objid ("63e050d0-1321-47dc-8ff5-581647c35788")
    @Override
    public void setTarget(Classifier value) {
        appendDepVal(AssociationEndData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("5fd00b1b-8a55-46ba-a1f8-d40e1f853bda")
    @Override
    public AssociationEnd getOppositeOwner() {
        return (AssociationEnd) getDepVal(AssociationEndData.Metadata.OppositeOwnerDep());
    }

    @objid ("f01602a6-1e2f-40cb-82af-7730043470b5")
    @Override
    public void setOppositeOwner(AssociationEnd value) {
        appendDepVal(AssociationEndData.Metadata.OppositeOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("630f3e6d-d076-4da3-bac7-12e015c7c22e")
    @Override
    public Classifier getSource() {
        return (Classifier) getDepVal(AssociationEndData.Metadata.SourceDep());
    }

    @objid ("340cc331-d2ed-40db-9213-29798456a09b")
    @Override
    public void setSource(Classifier value) {
        appendDepVal(AssociationEndData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("4762ffe2-2a30-43a5-86d3-7bab344f7279")
    @Override
    public EList<LinkEnd> getOccurence() {
        return new SmList<>(this, AssociationEndData.Metadata.OccurenceDep());
    }

    @objid ("c9ac0f7b-f890-465e-9a44-355c08da7fc1")
    @Override
    public <T extends LinkEnd> List<T> getOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LinkEnd element : getOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c3583bd8-e998-43ac-a69c-0c177e79b16d")
    @Override
    public EList<InformationFlow> getSent() {
        return new SmList<>(this, AssociationEndData.Metadata.SentDep());
    }

    @objid ("e2a7c6af-54f8-4e0d-ba30-6bc3e5864d1a")
    @Override
    public <T extends InformationFlow> List<T> getSent(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getSent()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("bf5e0c2e-e973-4cbe-83a9-9bd0c0f0373e")
    @Override
    public EList<Attribute> getQualifier() {
        return new SmList<>(this, AssociationEndData.Metadata.QualifierDep());
    }

    @objid ("8697f19f-35f9-401b-ac34-29bb337b385d")
    @Override
    public <T extends Attribute> List<T> getQualifier(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Attribute element : getQualifier()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d6c96a01-0b29-4e71-9eb7-a073f1b5dde7")
    @Override
    public AssociationEnd getOpposite() {
        return (AssociationEnd) getDepVal(AssociationEndData.Metadata.OppositeDep());
    }

    @objid ("ede929c6-588c-491f-b0f6-e9c651fe4a21")
    @Override
    public void setOpposite(AssociationEnd value) {
        appendDepVal(AssociationEndData.Metadata.OppositeDep(), (SmObjectImpl)value);
    }

    @objid ("c0e71715-96ae-46a3-89e5-a2a5e3ce8977")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, AssociationEndData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("e4057cf9-8e25-49d3-8528-4d3d4cc50fe6")
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

    @objid ("f054ff6e-a774-45c4-a700-186fc13612c9")
    @Override
    public Association getAssociation() {
        return (Association) getDepVal(AssociationEndData.Metadata.AssociationDep());
    }

    @objid ("8c685a06-c8e5-4150-acda-15fb8917a0f1")
    @Override
    public void setAssociation(Association value) {
        appendDepVal(AssociationEndData.Metadata.AssociationDep(), (SmObjectImpl)value);
    }

    @objid ("44e3dbc3-59da-4fcd-b6eb-2425cea93b31")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, AssociationEndData.Metadata.RepresentingItemDep());
    }

    @objid ("f92b1bf9-e919-4eec-b8b5-1d73a7b6777f")
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

    @objid ("98a2df0c-fdcd-4d7f-bd24-1909fdcf0bdf")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAssociationEnd(this);
        else
          return null;
    }

}
