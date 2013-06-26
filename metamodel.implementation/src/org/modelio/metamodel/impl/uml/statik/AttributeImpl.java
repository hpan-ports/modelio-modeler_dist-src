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
    @objid ("f576d500-7add-4500-9c14-e29e962af7de")
    @Override
    public String getTypeConstraint() {
        return (String) getAttVal(AttributeData.Metadata.TypeConstraintAtt());
    }

    @objid ("0bd2cb46-f1b1-42b0-95da-5e8c9acda396")
    @Override
    public void setTypeConstraint(String value) {
        setAttVal(AttributeData.Metadata.TypeConstraintAtt(), value);
    }

    @objid ("5e2abf14-91d7-487c-a7cc-bd74970d1121")
    @Override
    public String getValue() {
        return (String) getAttVal(AttributeData.Metadata.ValueAtt());
    }

    @objid ("2e488dc8-f731-4a9c-b8c9-55e66e1a8e96")
    @Override
    public void setValue(String value) {
        setAttVal(AttributeData.Metadata.ValueAtt(), value);
    }

    @objid ("49ae11e4-2fa3-4518-a8f0-3b536cc33722")
    @Override
    public boolean isTargetIsClass() {
        return (Boolean) getAttVal(AttributeData.Metadata.TargetIsClassAtt());
    }

    @objid ("40128532-b96b-4424-a11e-a8865a3f57a8")
    @Override
    public void setTargetIsClass(boolean value) {
        setAttVal(AttributeData.Metadata.TargetIsClassAtt(), value);
    }

    @objid ("0198dd4e-1a1f-4da9-88f7-3f667e7459c4")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(AttributeData.Metadata.TypeDep());
    }

    @objid ("0000bdb2-db4e-4918-b1a6-9dc6179afa77")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(AttributeData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("d622fe0d-863e-4bb3-809b-c77cbbea09fc")
    @Override
    public Classifier getOwner() {
        return (Classifier) getDepVal(AttributeData.Metadata.OwnerDep());
    }

    @objid ("502a21e4-4f4e-419d-be09-aef40689aa99")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(AttributeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("8897708c-f2d9-47d7-9266-f7ce46df675a")
    @Override
    public EList<AttributeLink> getOccurence() {
        return new SmList<>(this, AttributeData.Metadata.OccurenceDep());
    }

    @objid ("47be48f6-a9be-4d4f-a864-6d0488858b16")
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

    @objid ("b8d9a14e-a4a2-46dc-9336-f93ebd6f5799")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, AttributeData.Metadata.RepresentingItemDep());
    }

    @objid ("9ac80d70-5098-4c2f-b231-f46fbd0c47bc")
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

    @objid ("a60c5996-f163-4a68-84d6-4b7d17294edd")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, AttributeData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("135274b1-6ce5-44d3-ae6d-6382db34e8a6")
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

    @objid ("894ad8e8-db57-4662-ac2b-70a6966fb474")
    @Override
    public AssociationEnd getQualified() {
        return (AssociationEnd) getDepVal(AttributeData.Metadata.QualifiedDep());
    }

    @objid ("594d88d5-0df5-4c35-a7c9-8fb2506f0538")
    @Override
    public void setQualified(AssociationEnd value) {
        appendDepVal(AttributeData.Metadata.QualifiedDep(), (SmObjectImpl)value);
    }

    @objid ("c113af20-8e1f-445e-bf01-5d2766693e6d")
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

    @objid ("7789003a-b5ee-4e9f-901c-7f431b51a445")
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

    @objid ("68e3068d-fd5d-4c9d-a68e-a83916ce3c80")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAttribute(this);
        else
          return null;
    }

}
