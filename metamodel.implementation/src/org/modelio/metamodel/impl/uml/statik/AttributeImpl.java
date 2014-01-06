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
    @objid ("6e9a4e71-25ae-4a67-b2c6-52d75b5bbe75")
    @Override
    public String getTypeConstraint() {
        return (String) getAttVal(AttributeData.Metadata.TypeConstraintAtt());
    }

    @objid ("9c88dd9d-4b93-4c85-8e19-d7972dca407e")
    @Override
    public void setTypeConstraint(String value) {
        setAttVal(AttributeData.Metadata.TypeConstraintAtt(), value);
    }

    @objid ("71fe6cd5-900e-4680-b1c2-78a2a41b9305")
    @Override
    public String getValue() {
        return (String) getAttVal(AttributeData.Metadata.ValueAtt());
    }

    @objid ("61bdd34f-edf8-423b-9d28-e71fe07c44d0")
    @Override
    public void setValue(String value) {
        setAttVal(AttributeData.Metadata.ValueAtt(), value);
    }

    @objid ("20ed6466-97d2-4e11-8513-6cbf3da354ea")
    @Override
    public boolean isTargetIsClass() {
        return (Boolean) getAttVal(AttributeData.Metadata.TargetIsClassAtt());
    }

    @objid ("38e90d39-3309-4db7-9d3c-6143737be109")
    @Override
    public void setTargetIsClass(boolean value) {
        setAttVal(AttributeData.Metadata.TargetIsClassAtt(), value);
    }

    @objid ("d85a9176-7f18-4ce2-907c-73fcdf096ae8")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(AttributeData.Metadata.TypeDep());
    }

    @objid ("7c9c86d4-e563-42ed-ac16-83440cbd275c")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(AttributeData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("70699099-a60d-40d4-b0d3-35e30a54ff69")
    @Override
    public Classifier getOwner() {
        return (Classifier) getDepVal(AttributeData.Metadata.OwnerDep());
    }

    @objid ("f8628ee1-c8c0-49ff-9621-7ea7c7c12362")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(AttributeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("03b69b67-d2fa-43f1-95bd-d09f0e037699")
    @Override
    public EList<AttributeLink> getOccurence() {
        return new SmList<>(this, AttributeData.Metadata.OccurenceDep());
    }

    @objid ("f34e78d3-09c0-466e-b4c1-97afc9f0ab28")
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

    @objid ("995aa081-d175-4b93-9b27-bfff72f3dbc3")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, AttributeData.Metadata.RepresentingItemDep());
    }

    @objid ("0433c384-ee82-44c0-bcaa-bae9c6a06bb5")
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

    @objid ("44c8c649-0505-4633-9087-9c65a66e0a6a")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, AttributeData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("a3fdd087-5732-477f-b2ba-b7835d28d33c")
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

    @objid ("b53539f3-639d-4f82-8827-ff1a423b7b6e")
    @Override
    public AssociationEnd getQualified() {
        return (AssociationEnd) getDepVal(AttributeData.Metadata.QualifiedDep());
    }

    @objid ("35069dfa-4856-435c-ad82-a4a3766c449f")
    @Override
    public void setQualified(AssociationEnd value) {
        appendDepVal(AttributeData.Metadata.QualifiedDep(), (SmObjectImpl)value);
    }

    @objid ("0cec26d2-9c93-47c6-83eb-2670f15430f4")
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

    @objid ("47e65351-6ca7-4bac-a536-6ade9cb3983f")
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

    @objid ("c5a8da4b-dfee-4661-8914-ca5b6e128585")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAttribute(this);
        else
          return null;
    }

}
