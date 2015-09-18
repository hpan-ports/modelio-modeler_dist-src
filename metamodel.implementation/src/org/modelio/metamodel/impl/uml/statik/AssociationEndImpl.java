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

    @objid ("7fa5ff1a-957d-4d5c-a722-639db5420d04")
    @Override
    public AggregationKind getAggregation() {
        return (AggregationKind) getAttVal(AssociationEndData.Metadata.AggregationAtt());
    }

    @objid ("1c3a3bf5-6192-4712-b0cf-4c4346860884")
    @Override
    public void setAggregation(AggregationKind value) {
        setAttVal(AssociationEndData.Metadata.AggregationAtt(), value);
    }

    @objid ("2fbf8dc4-7ab0-4ff4-8146-510a8bb32d8f")
    @Override
    public boolean isIsChangeable() {
        return (Boolean) getAttVal(AssociationEndData.Metadata.IsChangeableAtt());
    }

    @objid ("21800850-1cbb-4004-9855-e0c5a1387b61")
    @Override
    public void setIsChangeable(boolean value) {
        setAttVal(AssociationEndData.Metadata.IsChangeableAtt(), value);
    }

    @objid ("697031bc-84ae-4f98-8da1-26e3e673b65b")
    @Override
    public Classifier getTarget() {
        return (Classifier) getDepVal(AssociationEndData.Metadata.TargetDep());
    }

    @objid ("36c63ed3-c0c6-494c-8b4e-f5c0788b387d")
    @Override
    public void setTarget(Classifier value) {
        appendDepVal(AssociationEndData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("7b2b8800-4113-49ee-882e-a903e8d52fda")
    @Override
    public AssociationEnd getOppositeOwner() {
        return (AssociationEnd) getDepVal(AssociationEndData.Metadata.OppositeOwnerDep());
    }

    @objid ("1983248f-ca8b-44bc-aaa8-625d45ed9d90")
    @Override
    public void setOppositeOwner(AssociationEnd value) {
        appendDepVal(AssociationEndData.Metadata.OppositeOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("d16c9255-290c-4109-a103-5504142ec611")
    @Override
    public Classifier getSource() {
        return (Classifier) getDepVal(AssociationEndData.Metadata.SourceDep());
    }

    @objid ("5210bc30-9d1d-4e18-8876-18bb72c9bab7")
    @Override
    public void setSource(Classifier value) {
        appendDepVal(AssociationEndData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("f026068e-0d2b-4e07-bf3b-03d80b83352a")
    @Override
    public EList<LinkEnd> getOccurence() {
        return new SmList<>(this, AssociationEndData.Metadata.OccurenceDep());
    }

    @objid ("6c9dff0a-cd9a-4770-b19b-1623f2d13d21")
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

    @objid ("646895b1-9b3c-4544-9c56-9cc4d7e31c68")
    @Override
    public EList<InformationFlow> getSent() {
        return new SmList<>(this, AssociationEndData.Metadata.SentDep());
    }

    @objid ("4d545ff2-a11e-45f8-8219-7f8e4b60494a")
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

    @objid ("0895bf94-b661-4fa6-8ba6-a66c9b2db553")
    @Override
    public EList<Attribute> getQualifier() {
        return new SmList<>(this, AssociationEndData.Metadata.QualifierDep());
    }

    @objid ("14804081-815f-491b-91ab-ac6554efe238")
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

    @objid ("6f3e76ae-4cfa-4fde-8fef-cfda6fc8f7f1")
    @Override
    public AssociationEnd getOpposite() {
        return (AssociationEnd) getDepVal(AssociationEndData.Metadata.OppositeDep());
    }

    @objid ("24e5c853-b9bc-422f-a432-d370e3c09e1a")
    @Override
    public void setOpposite(AssociationEnd value) {
        appendDepVal(AssociationEndData.Metadata.OppositeDep(), (SmObjectImpl)value);
    }

    @objid ("7b40bb61-0c9e-4bf9-92b9-b4d42b2389a7")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, AssociationEndData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("e7f49e20-5bd3-4275-bbc6-be66573ccc75")
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

    @objid ("94188625-4b51-485e-9dc1-d2241358226f")
    @Override
    public Association getAssociation() {
        return (Association) getDepVal(AssociationEndData.Metadata.AssociationDep());
    }

    @objid ("2adde227-b1e7-4498-87d9-7028b935ccdb")
    @Override
    public void setAssociation(Association value) {
        appendDepVal(AssociationEndData.Metadata.AssociationDep(), (SmObjectImpl)value);
    }

    @objid ("b6b2d39c-4b41-4456-b9ed-a2679efa5afb")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, AssociationEndData.Metadata.RepresentingItemDep());
    }

    @objid ("863d442e-470b-4d01-a6ac-010cf3ef152e")
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

    @objid ("8a81cdcc-db43-48ca-922c-7231223a6d19")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAssociationEnd(this);
        else
          return null;
    }

}
