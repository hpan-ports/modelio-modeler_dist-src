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
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00981c78-c4be-1fd8-97fe-001ec947cd2a")
public class AttributeImpl extends StructuralFeatureImpl implements Attribute {
    @objid ("da1e12c4-2400-41df-aa32-849e6e3cb239")
    @Override
    public String getTypeConstraint() {
        return (String) getAttVal(AttributeData.Metadata.TypeConstraintAtt());
    }

    @objid ("0bf4f826-30ad-48e5-93d4-d2ac49aa0531")
    @Override
    public void setTypeConstraint(String value) {
        setAttVal(AttributeData.Metadata.TypeConstraintAtt(), value);
    }

    @objid ("86f7cf61-c1e0-4284-b0f5-051c00e228d3")
    @Override
    public String getValue() {
        return (String) getAttVal(AttributeData.Metadata.ValueAtt());
    }

    @objid ("69f30b78-7552-4495-a42b-cb33219e24ec")
    @Override
    public void setValue(String value) {
        setAttVal(AttributeData.Metadata.ValueAtt(), value);
    }

    @objid ("69b49df0-f978-46cc-a0a8-a4d3ee601cdd")
    @Override
    public boolean isTargetIsClass() {
        return (Boolean) getAttVal(AttributeData.Metadata.TargetIsClassAtt());
    }

    @objid ("1bd44a05-bab4-46b1-87a0-9565de3cba0e")
    @Override
    public void setTargetIsClass(boolean value) {
        setAttVal(AttributeData.Metadata.TargetIsClassAtt(), value);
    }

    @objid ("238fd923-7a04-4a14-8ca8-606581001c04")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(AttributeData.Metadata.TypeDep());
    }

    @objid ("4f179a41-aa40-44e1-8854-b46b8b9753d4")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(AttributeData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("e4f69e4b-04a9-4365-848b-fb21958328b6")
    @Override
    public Classifier getOwner() {
        return (Classifier) getDepVal(AttributeData.Metadata.OwnerDep());
    }

    @objid ("b574f112-90ca-49ed-98a2-48e2a77e1071")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(AttributeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("f60c9c2e-0050-440c-93c1-f456a90788f3")
    @Override
    public EList<AttributeLink> getOccurence() {
        return new SmList<>(this, AttributeData.Metadata.OccurenceDep());
    }

    @objid ("3b200625-b3ae-451e-bf34-2a4f885e1294")
    @Override
    public <T extends AttributeLink> List<T> getOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AttributeLink element : getOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f1300038-a78a-4e6d-a7af-5bd0d79f9bb5")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, AttributeData.Metadata.RepresentingItemDep());
    }

    @objid ("f47e74f2-1d4a-4a85-974e-bca3e8f9eddf")
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

    @objid ("79c9702e-35f2-4478-8eda-3b60df18ce98")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, AttributeData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("74660996-e1c7-4675-bafe-96c6dd8462fe")
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

    @objid ("2fddfeb0-3905-4b6e-841b-83a927b11fc3")
    @Override
    public AssociationEnd getQualified() {
        return (AssociationEnd) getDepVal(AttributeData.Metadata.QualifiedDep());
    }

    @objid ("5a5e21fc-252d-467e-939c-f9a2256dc2fb")
    @Override
    public void setQualified(AssociationEnd value) {
        appendDepVal(AttributeData.Metadata.QualifiedDep(), (SmObjectImpl)value);
    }

    @objid ("33776c03-054e-43ae-8713-ff1e3d77c16c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeData.Metadata.QualifiedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c3955fa3-b263-4bb8-a7ef-264f88ae9334")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(AttributeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(AttributeData.Metadata.OwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(AttributeData.Metadata.QualifiedDep());
        if (obj != null)
          return new SmDepVal(AttributeData.Metadata.QualifiedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("5cdbea34-6f71-4dea-8259-d769ec1b14a8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAttribute(this);
        else
          return null;
    }

}
