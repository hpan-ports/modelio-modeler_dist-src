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
/*   Metamodel version: 9020              */
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
import org.modelio.vcore.smkernel.meta.SmDependency;

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

    @objid ("b36b1d7c-5824-4b65-a487-6786cc0631b4")
    @Override
    public AggregationKind getAggregation() {
        return (AggregationKind) getAttVal(AssociationEndData.Metadata.AggregationAtt());
    }

    @objid ("428f6998-dc00-4fdf-88a0-7d8abe30a510")
    @Override
    public void setAggregation(AggregationKind value) {
        setAttVal(AssociationEndData.Metadata.AggregationAtt(), value);
    }

    @objid ("c97dc62d-8899-4094-b1aa-b173957f3cd2")
    @Override
    public boolean isIsChangeable() {
        return (Boolean) getAttVal(AssociationEndData.Metadata.IsChangeableAtt());
    }

    @objid ("475c78c3-dcfa-4de4-80d0-6b336c2d77fd")
    @Override
    public void setIsChangeable(boolean value) {
        setAttVal(AssociationEndData.Metadata.IsChangeableAtt(), value);
    }

    @objid ("8a850868-f4a2-4f6f-a6ec-e7ef91446ae7")
    @Override
    public Classifier getTarget() {
        return (Classifier) getDepVal(AssociationEndData.Metadata.TargetDep());
    }

    @objid ("cb4ab1d9-cefb-40c5-843b-06d77e2c393a")
    @Override
    public void setTarget(Classifier value) {
        appendDepVal(AssociationEndData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("50ec344d-482f-4adc-a85b-25a92d064654")
    @Override
    public AssociationEnd getOppositeOwner() {
        return (AssociationEnd) getDepVal(AssociationEndData.Metadata.OppositeOwnerDep());
    }

    @objid ("3279d87b-f6a4-4e42-9fd5-da35e9427e78")
    @Override
    public void setOppositeOwner(AssociationEnd value) {
        appendDepVal(AssociationEndData.Metadata.OppositeOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("f9e36fd9-699f-4616-9895-70c545e5abad")
    @Override
    public Classifier getSource() {
        return (Classifier) getDepVal(AssociationEndData.Metadata.SourceDep());
    }

    @objid ("67573abc-f904-4bf7-b60a-7afd09d791fa")
    @Override
    public void setSource(Classifier value) {
        appendDepVal(AssociationEndData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("6a84a38a-3b1f-468f-9d47-fffe367297eb")
    @Override
    public EList<LinkEnd> getOccurence() {
        return new SmList<>(this, AssociationEndData.Metadata.OccurenceDep());
    }

    @objid ("c379e529-78f5-449a-a2ac-497967315e8e")
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

    @objid ("79f340fd-8208-4fba-adeb-54abf2680ede")
    @Override
    public EList<InformationFlow> getSent() {
        return new SmList<>(this, AssociationEndData.Metadata.SentDep());
    }

    @objid ("603b36c1-9369-4320-b772-cc6d42114997")
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

    @objid ("75f28eb6-5ef8-461c-8138-72581696a37c")
    @Override
    public EList<Attribute> getQualifier() {
        return new SmList<>(this, AssociationEndData.Metadata.QualifierDep());
    }

    @objid ("0a0ee0ba-8a1f-4f69-98db-0222a6d84059")
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

    @objid ("2819cfce-f485-4ca6-b40a-447775fc90c0")
    @Override
    public AssociationEnd getOpposite() {
        return (AssociationEnd) getDepVal(AssociationEndData.Metadata.OppositeDep());
    }

    @objid ("e2f41242-4722-47c2-8918-4e3339f37130")
    @Override
    public void setOpposite(AssociationEnd value) {
        appendDepVal(AssociationEndData.Metadata.OppositeDep(), (SmObjectImpl)value);
    }

    @objid ("ca0e29c0-f080-4c7f-ae5b-d0f8f5671c48")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, AssociationEndData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("7fe346bd-d5a4-4940-ad26-75102201245a")
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

    @objid ("adb6cb49-922c-4fba-a4d2-9152fa8075b0")
    @Override
    public Association getAssociation() {
        return (Association) getDepVal(AssociationEndData.Metadata.AssociationDep());
    }

    @objid ("3d3e12dd-5f6b-451a-814e-29ed77237dc3")
    @Override
    public void setAssociation(Association value) {
        appendDepVal(AssociationEndData.Metadata.AssociationDep(), (SmObjectImpl)value);
    }

    @objid ("bfa00627-fe96-4f62-a3fd-b9bb5a510f9e")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, AssociationEndData.Metadata.RepresentingItemDep());
    }

    @objid ("bde292f3-6d78-4fe9-889c-38dbff6216b2")
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

    @objid ("1b494c65-ccd2-4ce5-8daf-8b0fcbca20a5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAssociationEnd(this);
        else
          return null;
    }

    @objid ("de5ce14b-fc8c-4ab5-a0b9-2b41683ce4db")
    @Override
    public void afterEraseDepVal(SmDependency dep, SmObjectImpl value) {
        super.afterEraseDepVal(dep, value);
        
        if (dep == AssociationEndData.Metadata.getSourceDep()) {
            // Workaround bug where the storage handle is not updated
            AssociationEnd opposite = getOpposite();
            if (opposite != null) {
                Classifier src = opposite.getSource();
                if (src != null) {
                    // detach and attach again
                    opposite.setOpposite(null);
                    opposite.setSource(null);
                    opposite.setSource(src);
                    opposite.setOpposite(this);
                }
            }
        
        }
    }

}
