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

    @objid ("48b9a545-82cc-4171-930a-0e820795f4c2")
    @Override
    public AggregationKind getAggregation() {
        return (AggregationKind) getAttVal(AssociationEndData.Metadata.AggregationAtt());
    }

    @objid ("c05fd157-9b27-4ab7-ad58-0daeb586baf0")
    @Override
    public void setAggregation(AggregationKind value) {
        setAttVal(AssociationEndData.Metadata.AggregationAtt(), value);
    }

    @objid ("7b9601f6-0d98-40d4-bf1f-4371908ffffe")
    @Override
    public boolean isIsChangeable() {
        return (Boolean) getAttVal(AssociationEndData.Metadata.IsChangeableAtt());
    }

    @objid ("89715b21-2df7-4c93-b9d0-af99361a52aa")
    @Override
    public void setIsChangeable(boolean value) {
        setAttVal(AssociationEndData.Metadata.IsChangeableAtt(), value);
    }

    @objid ("22913b12-7e98-4574-9a94-06d4f35cc2f8")
    @Override
    public Classifier getTarget() {
        return (Classifier) getDepVal(AssociationEndData.Metadata.TargetDep());
    }

    @objid ("eae53f23-b3dc-47f8-b4f7-019023346250")
    @Override
    public void setTarget(Classifier value) {
        appendDepVal(AssociationEndData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("9de8252c-8af6-497b-8f91-84021e130bce")
    @Override
    public AssociationEnd getOppositeOwner() {
        return (AssociationEnd) getDepVal(AssociationEndData.Metadata.OppositeOwnerDep());
    }

    @objid ("5fe38730-e8a3-4b96-8f3a-2f88f862bbe1")
    @Override
    public void setOppositeOwner(AssociationEnd value) {
        appendDepVal(AssociationEndData.Metadata.OppositeOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("dec68ec5-f524-4c4a-acb9-5929be2ad96f")
    @Override
    public Classifier getSource() {
        return (Classifier) getDepVal(AssociationEndData.Metadata.SourceDep());
    }

    @objid ("31190b6d-2238-49a9-959b-52fe92a7a21a")
    @Override
    public void setSource(Classifier value) {
        appendDepVal(AssociationEndData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("ffa90adb-2e4d-4d70-b6b4-c8714e288778")
    @Override
    public EList<LinkEnd> getOccurence() {
        return new SmList<>(this, AssociationEndData.Metadata.OccurenceDep());
    }

    @objid ("74254117-df15-4f55-887e-854f9ee21bd1")
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

    @objid ("eb841f50-e472-4bce-bffe-9b022e306c5b")
    @Override
    public EList<InformationFlow> getSent() {
        return new SmList<>(this, AssociationEndData.Metadata.SentDep());
    }

    @objid ("deb23d7d-3475-4f5d-a392-6850f7c6675f")
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

    @objid ("9f0f58a7-24be-47f4-ae48-b560cd498b38")
    @Override
    public EList<Attribute> getQualifier() {
        return new SmList<>(this, AssociationEndData.Metadata.QualifierDep());
    }

    @objid ("a602906e-033c-4a2b-89a5-17270ffd902f")
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

    @objid ("91a8700a-8cd9-4e0c-b544-ecfcb7723b4b")
    @Override
    public AssociationEnd getOpposite() {
        return (AssociationEnd) getDepVal(AssociationEndData.Metadata.OppositeDep());
    }

    @objid ("af9ddc4b-74e9-4a81-a66d-91e552856428")
    @Override
    public void setOpposite(AssociationEnd value) {
        appendDepVal(AssociationEndData.Metadata.OppositeDep(), (SmObjectImpl)value);
    }

    @objid ("2eed6786-000b-4582-b589-357724449f73")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, AssociationEndData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("4912fc44-4375-48c8-8c8b-bf1a95c1fa9a")
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

    @objid ("98bba406-0faa-4d03-9b51-d157c909d7aa")
    @Override
    public Association getAssociation() {
        return (Association) getDepVal(AssociationEndData.Metadata.AssociationDep());
    }

    @objid ("d9b2f9a0-a072-457e-8787-1eb441f94aab")
    @Override
    public void setAssociation(Association value) {
        appendDepVal(AssociationEndData.Metadata.AssociationDep(), (SmObjectImpl)value);
    }

    @objid ("427195c1-5505-43cd-afe7-98d986a62682")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, AssociationEndData.Metadata.RepresentingItemDep());
    }

    @objid ("3fff72d9-48e7-4753-994c-3622bc5c59e2")
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

    @objid ("9f4bf55b-1d19-4d84-b1aa-aa63835805f7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAssociationEnd(this);
        else
          return null;
    }

}
