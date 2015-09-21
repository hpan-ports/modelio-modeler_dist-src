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
import org.modelio.metamodel.impl.uml.statik.AttributeData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00981c78-c4be-1fd8-97fe-001ec947cd2a")
public class AttributeImpl extends StructuralFeatureImpl implements Attribute {
    @objid ("43e2bcef-a537-496d-9261-16f9747f96bf")
    @Override
    public String getTypeConstraint() {
        return (String) getAttVal(((AttributeSmClass)getClassOf()).getTypeConstraintAtt());
    }

    @objid ("96efe48e-8bcb-429f-9907-650143af0e65")
    @Override
    public void setTypeConstraint(String value) {
        setAttVal(((AttributeSmClass)getClassOf()).getTypeConstraintAtt(), value);
    }

    @objid ("002ef30e-f959-4b43-b84a-e8b7ca0a8d75")
    @Override
    public String getValue() {
        return (String) getAttVal(((AttributeSmClass)getClassOf()).getValueAtt());
    }

    @objid ("e16846fe-63c8-4484-8b6d-25e3679091c5")
    @Override
    public void setValue(String value) {
        setAttVal(((AttributeSmClass)getClassOf()).getValueAtt(), value);
    }

    @objid ("98e1dd91-2da9-4eed-ac4b-cd7da4e4569a")
    @Override
    public boolean isTargetIsClass() {
        return (Boolean) getAttVal(((AttributeSmClass)getClassOf()).getTargetIsClassAtt());
    }

    @objid ("348e9458-34ab-442c-a27a-541e1fddc621")
    @Override
    public void setTargetIsClass(boolean value) {
        setAttVal(((AttributeSmClass)getClassOf()).getTargetIsClassAtt(), value);
    }

    @objid ("678c88f5-a5ff-440a-905a-26edcd009bab")
    @Override
    public GeneralClass getType() {
        Object obj = getDepVal(((AttributeSmClass)getClassOf()).getTypeDep());
        return (obj instanceof GeneralClass)? (GeneralClass)obj : null;
    }

    @objid ("5fcbe71e-f74c-4080-bf92-98a0fd00162a")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(((AttributeSmClass)getClassOf()).getTypeDep(), (SmObjectImpl)value);
    }

    @objid ("1a8b4091-aaa8-4119-9f40-73686e3b55d2")
    @Override
    public Classifier getOwner() {
        Object obj = getDepVal(((AttributeSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof Classifier)? (Classifier)obj : null;
    }

    @objid ("af0a6c8b-f4e5-43d8-b421-e4799f801487")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(((AttributeSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("017f8605-424d-4d78-9c23-6901c795481e")
    @Override
    public EList<AttributeLink> getOccurence() {
        return new SmList<>(this, ((AttributeSmClass)getClassOf()).getOccurenceDep());
    }

    @objid ("20c5b31e-2c1a-4363-81f8-a983cebffe4e")
    @Override
    public <T extends AttributeLink> List<T> getOccurence(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final AttributeLink element : getOccurence()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("bfe2b68e-caf0-48de-bfc6-5ebc0fb9b537")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, ((AttributeSmClass)getClassOf()).getRepresentingItemDep());
    }

    @objid ("ccc92c78-d1e9-42cd-9040-5d1d3d0cef2d")
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

    @objid ("2d598f98-7b50-4b76-ba08-cc7fef05726f")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, ((AttributeSmClass)getClassOf()).getRepresentingObjectNodeDep());
    }

    @objid ("e3d5cd67-a7b2-49fb-9e41-070b2f22159d")
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

    @objid ("9af0016e-5d17-48b7-8533-153a96769654")
    @Override
    public AssociationEnd getQualified() {
        Object obj = getDepVal(((AttributeSmClass)getClassOf()).getQualifiedDep());
        return (obj instanceof AssociationEnd)? (AssociationEnd)obj : null;
    }

    @objid ("644faccf-a6f8-4f71-9629-c8862a02d116")
    @Override
    public void setQualified(AssociationEnd value) {
        appendDepVal(((AttributeSmClass)getClassOf()).getQualifiedDep(), (SmObjectImpl)value);
    }

    @objid ("cec34340-933b-4c82-905c-da8d938847ed")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((AttributeSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        // Qualified
        obj = (SmObjectImpl)this.getDepVal(((AttributeSmClass)getClassOf()).getQualifiedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e42986a7-6596-443a-8ac4-337080939dde")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((AttributeSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // Qualified
        dep = ((AttributeSmClass)getClassOf()).getQualifiedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("88aaa1e7-31e8-4ad1-becf-adaa36714fea")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAttribute(this);
        else
          return null;
    }

}
