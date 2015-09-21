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
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.InstanceData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000d8770-c4bf-1fd8-97fe-001ec947cd2a")
public class InstanceImpl extends ModelElementImpl implements Instance {
    @objid ("0a261b9d-7c51-45d2-a9f2-7a6ce9faa475")
    @Override
    public boolean isIsConstant() {
        return (Boolean) getAttVal(((InstanceSmClass)getClassOf()).getIsConstantAtt());
    }

    @objid ("d1aea7de-afa3-4c0a-bcb5-e82d2ce3cfb5")
    @Override
    public void setIsConstant(boolean value) {
        setAttVal(((InstanceSmClass)getClassOf()).getIsConstantAtt(), value);
    }

    @objid ("01e1a765-63a0-4942-9fe1-db585e64ef3b")
    @Override
    public String getMultiplicityMin() {
        return (String) getAttVal(((InstanceSmClass)getClassOf()).getMultiplicityMinAtt());
    }

    @objid ("cbf112b1-f512-45c6-a089-c02dd025746b")
    @Override
    public void setMultiplicityMin(String value) {
        setAttVal(((InstanceSmClass)getClassOf()).getMultiplicityMinAtt(), value);
    }

    @objid ("b4b09832-c631-4b7d-a8f0-44aaa106350d")
    @Override
    public String getMultiplicityMax() {
        return (String) getAttVal(((InstanceSmClass)getClassOf()).getMultiplicityMaxAtt());
    }

    @objid ("9deaa362-b9a4-42ac-946d-fc5a3137bd57")
    @Override
    public void setMultiplicityMax(String value) {
        setAttVal(((InstanceSmClass)getClassOf()).getMultiplicityMaxAtt(), value);
    }

    @objid ("0242d3dd-57ca-43c0-82a4-9774eb051dbf")
    @Override
    public String getValue() {
        return (String) getAttVal(((InstanceSmClass)getClassOf()).getValueAtt());
    }

    @objid ("168ed59d-151c-41ec-a5b4-bee4683f558f")
    @Override
    public void setValue(String value) {
        setAttVal(((InstanceSmClass)getClassOf()).getValueAtt(), value);
    }

    @objid ("c40b1314-3cce-4a94-bc1e-91e2b342e424")
    @Override
    public EList<CommunicationNode> getRepresentedCommunicationNode() {
        return new SmList<>(this, ((InstanceSmClass)getClassOf()).getRepresentedCommunicationNodeDep());
    }

    @objid ("d8d74a6a-0b40-4069-8abc-a3ed715c4463")
    @Override
    public <T extends CommunicationNode> List<T> getRepresentedCommunicationNode(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CommunicationNode element : getRepresentedCommunicationNode()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cd00f376-60a7-439c-9252-d7d66e4d9e91")
    @Override
    public EList<BpmnItemAwareElement> getRepresentingItem() {
        return new SmList<>(this, ((InstanceSmClass)getClassOf()).getRepresentingItemDep());
    }

    @objid ("b9748588-b6a6-4406-97ab-3eae5ea0728f")
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

    @objid ("84b91255-f24e-4e98-81dd-cdf3f5fbdb6b")
    @Override
    public EList<LinkEnd> getOwnedEnd() {
        return new SmList<>(this, ((InstanceSmClass)getClassOf()).getOwnedEndDep());
    }

    @objid ("c63591b2-b50f-4d6a-bf3e-3f503be4dbb2")
    @Override
    public <T extends LinkEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final LinkEnd element : getOwnedEnd()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("794a02b2-2da1-4987-afd3-5aeb17e1c599")
    @Override
    public NameSpace getBase() {
        Object obj = getDepVal(((InstanceSmClass)getClassOf()).getBaseDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("ba571f95-75fa-43b0-b114-1a615d7774db")
    @Override
    public void setBase(NameSpace value) {
        appendDepVal(((InstanceSmClass)getClassOf()).getBaseDep(), (SmObjectImpl)value);
    }

    @objid ("e1bb85bc-2bac-42a6-87e2-a3cbd3ecdd0d")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, ((InstanceSmClass)getClassOf()).getRepresentingObjectNodeDep());
    }

    @objid ("184ebf96-22c8-42fa-bbf5-71a9c5fb62a2")
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

    @objid ("08e30e27-9d3e-41e3-ae90-631b1dbc8c89")
    @Override
    public NameSpace getOwner() {
        Object obj = getDepVal(((InstanceSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("54020ee6-4b70-4578-b815-df9722788bf9")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(((InstanceSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("b48b12bf-69ff-40c3-a81d-1268fc12ccd3")
    @Override
    public EList<NaryLinkEnd> getOwnedNaryEnd() {
        return new SmList<>(this, ((InstanceSmClass)getClassOf()).getOwnedNaryEndDep());
    }

    @objid ("4a191135-59f7-4a98-8c96-c9574160128d")
    @Override
    public <T extends NaryLinkEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final NaryLinkEnd element : getOwnedNaryEnd()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cd091e36-e68e-4297-bb54-1195fc88098b")
    @Override
    public EList<Lifeline> getRepresentedLifeLine() {
        return new SmList<>(this, ((InstanceSmClass)getClassOf()).getRepresentedLifeLineDep());
    }

    @objid ("c42889c2-993d-4303-ad3d-760ad4c21477")
    @Override
    public <T extends Lifeline> List<T> getRepresentedLifeLine(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Lifeline element : getRepresentedLifeLine()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4a44771f-476c-4182-96ce-925e6da8896d")
    @Override
    public EList<AttributeLink> getSlot() {
        return new SmList<>(this, ((InstanceSmClass)getClassOf()).getSlotDep());
    }

    @objid ("da285a75-aad0-4712-8a77-139c0d30f8f3")
    @Override
    public <T extends AttributeLink> List<T> getSlot(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final AttributeLink element : getSlot()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b421f1a8-a2f0-4b9c-8f78-fcaf0d66a358")
    @Override
    public EList<BindableInstance> getPart() {
        return new SmList<>(this, ((InstanceSmClass)getClassOf()).getPartDep());
    }

    @objid ("ec50224e-ef45-4e86-bdf7-d5a207d923e0")
    @Override
    public <T extends BindableInstance> List<T> getPart(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BindableInstance element : getPart()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d65b330a-4012-4963-89e0-ebd2a6f1a6cf")
    @Override
    public EList<LinkEnd> getTargetingEnd() {
        return new SmList<>(this, ((InstanceSmClass)getClassOf()).getTargetingEndDep());
    }

    @objid ("33cb5b10-6a30-4f52-ab8b-7989344a9055")
    @Override
    public <T extends LinkEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final LinkEnd element : getTargetingEnd()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a43945c4-fcea-48bd-a6e7-0c9203238aff")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((InstanceSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("28af1346-7a0e-4865-83bb-c1795287f11d")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((InstanceSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("488ad470-5da9-4066-b96f-66c2923c101e")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInstance(this);
        else
          return null;
    }

}
