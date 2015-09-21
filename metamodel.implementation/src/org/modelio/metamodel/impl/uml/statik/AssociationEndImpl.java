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
 Generated on: Mar 9, 2015
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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.impl.uml.statik.AssociationEndData;
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
        
        if (ret != null) {
            return ret;
        } else {
            // Return the 'opposite' role only if it has a source:
            // Avoid cycle if both ends have no source.
            AssociationEnd opp = getOpposite();
            if (opp != null && opp.getSource() != null) {
                return (SmObjectImpl) opp;
            } else {
                return null;
            }
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
        SmDependency dep = ((AssociationEndSmClass) getClassOf()).getSourceDep();
        SmObjectImpl obj = (SmObjectImpl) getDepVal(dep);
        if (obj != null) {
            return new SmDepVal(dep, obj);
        }
        
        // Return the 'opposite' role only if it has a source:
        // Avoid cycle if both ends have no source.
        AssociationEnd opp = getOpposite();
        
        if (opp != null && opp.getSource() != null) {
            return new SmDepVal(((AssociationEndSmClass) getClassOf()).getOppositeOwnerDep(), opp);
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
            return opposite != null ? opposite.getTarget() : null;
        }
    }

    @objid ("de5ce14b-fc8c-4ab5-a0b9-2b41683ce4db")
    @Override
    public void afterEraseDepVal(SmDependency dep, SmObjectImpl value) {
        super.afterEraseDepVal(dep, value);
        
        if (dep == ((AssociationEndSmClass) getClassOf()).getSourceDep()) {
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

    @objid ("be985ca9-bb0d-4a92-ac9b-9afb72d0f27f")
    @Override
    public AggregationKind getAggregation() {
        return (AggregationKind) getAttVal(((AssociationEndSmClass)getClassOf()).getAggregationAtt());
    }

    @objid ("182e6335-e767-48e1-a95f-4078711861f0")
    @Override
    public void setAggregation(AggregationKind value) {
        setAttVal(((AssociationEndSmClass)getClassOf()).getAggregationAtt(), value);
    }

    @objid ("aba04695-f674-4b1e-abe4-6843618002dd")
    @Override
    public boolean isIsChangeable() {
        return (Boolean) getAttVal(((AssociationEndSmClass)getClassOf()).getIsChangeableAtt());
    }

    @objid ("9c6f7d0a-4c82-41c9-8be3-95346e96c99a")
    @Override
    public void setIsChangeable(boolean value) {
        setAttVal(((AssociationEndSmClass)getClassOf()).getIsChangeableAtt(), value);
    }

    @objid ("532c560b-2c92-426d-bbc0-ce1a89c177c4")
    @Override
    public Classifier getTarget() {
        Object obj = getDepVal(((AssociationEndSmClass)getClassOf()).getTargetDep());
        return (obj instanceof Classifier)? (Classifier)obj : null;
    }

    @objid ("92689fe6-e7e2-43a4-a18d-eef506a2f7ca")
    @Override
    public void setTarget(Classifier value) {
        appendDepVal(((AssociationEndSmClass)getClassOf()).getTargetDep(), (SmObjectImpl)value);
    }

    @objid ("60182a8a-673b-485f-8eb7-c9ae9e839866")
    @Override
    public AssociationEnd getOppositeOwner() {
        Object obj = getDepVal(((AssociationEndSmClass)getClassOf()).getOppositeOwnerDep());
        return (obj instanceof AssociationEnd)? (AssociationEnd)obj : null;
    }

    @objid ("2cef50e0-fc0b-4428-a045-1376c9e592cc")
    @Override
    public void setOppositeOwner(AssociationEnd value) {
        appendDepVal(((AssociationEndSmClass)getClassOf()).getOppositeOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("9c980eb0-82e2-43e6-8f16-d9afc8d6dc2b")
    @Override
    public Classifier getSource() {
        Object obj = getDepVal(((AssociationEndSmClass)getClassOf()).getSourceDep());
        return (obj instanceof Classifier)? (Classifier)obj : null;
    }

    @objid ("231034d4-8c3e-44b8-ba08-6e6df2af920a")
    @Override
    public void setSource(Classifier value) {
        appendDepVal(((AssociationEndSmClass)getClassOf()).getSourceDep(), (SmObjectImpl)value);
    }

    @objid ("55ee704b-c157-41ce-8647-5783e5633d79")
    @Override
    public EList<LinkEnd> getOccurence() {
        return new SmList<>(this, ((AssociationEndSmClass)getClassOf()).getOccurenceDep());
    }

    @objid ("ab60a314-97f9-4174-9e66-29885c5d55cd")
    @Override
    public <T extends LinkEnd> List<T> getOccurence(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final LinkEnd element : getOccurence()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("904131c5-5e97-4b21-b970-7a6d8dd87ec3")
    @Override
    public EList<InformationFlow> getSent() {
        return new SmList<>(this, ((AssociationEndSmClass)getClassOf()).getSentDep());
    }

    @objid ("18f2bd26-1e65-45a3-bcd4-7d9bd10657c3")
    @Override
    public <T extends InformationFlow> List<T> getSent(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InformationFlow element : getSent()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("067ffb88-3d09-45f0-a264-178ba9cc84d2")
    @Override
    public EList<Attribute> getQualifier() {
        return new SmList<>(this, ((AssociationEndSmClass)getClassOf()).getQualifierDep());
    }

    @objid ("95e6036e-0bb7-4c5e-afcc-e86de9f7614d")
    @Override
    public <T extends Attribute> List<T> getQualifier(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Attribute element : getQualifier()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4b663d01-140c-4338-9698-61e9cc4075ff")
    @Override
    public AssociationEnd getOpposite() {
        Object obj = getDepVal(((AssociationEndSmClass)getClassOf()).getOppositeDep());
        return (obj instanceof AssociationEnd)? (AssociationEnd)obj : null;
    }

    @objid ("f867a79c-d06a-4210-8c28-e970db9a64f6")
    @Override
    public void setOpposite(AssociationEnd value) {
        appendDepVal(((AssociationEndSmClass)getClassOf()).getOppositeDep(), (SmObjectImpl)value);
    }

    @objid ("15926b21-f1e6-4b09-94f1-c342d20edbee")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, ((AssociationEndSmClass)getClassOf()).getRepresentingObjectNodeDep());
    }

    @objid ("aeec8a9a-46bf-40ef-aeb8-64fa1b0455cb")
    @Override
    public <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ObjectNode element : getRepresentingObjectNode()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f037c7a1-60c4-4598-88e1-45bd849dd142")
    @Override
    public Association getAssociation() {
        Object obj = getDepVal(((AssociationEndSmClass)getClassOf()).getAssociationDep());
        return (obj instanceof Association)? (Association)obj : null;
    }

    @objid ("cff21190-aa93-4015-944a-e61bd66b5346")
    @Override
    public void setAssociation(Association value) {
        appendDepVal(((AssociationEndSmClass)getClassOf()).getAssociationDep(), (SmObjectImpl)value);
    }

    @objid ("b14f28f7-563f-4657-a348-5c871be1c151")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, ((AssociationEndSmClass)getClassOf()).getRepresentingItemDep());
    }

    @objid ("c95fc163-66da-4dac-9437-f9e1d1fc5eae")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnItemAwareElement element : getRepresentingItem()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c24b16ce-5c41-497c-8055-3b60d2f6547c")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAssociationEnd(this);
        else
          return null;
    }

}
