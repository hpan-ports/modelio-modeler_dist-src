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
package org.modelio.metamodel.impl.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationNodeData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("005ab766-c4bf-1fd8-97fe-001ec947cd2a")
public class CommunicationNodeImpl extends ModelElementImpl implements CommunicationNode {
    @objid ("7d7ad011-8e9e-43c2-8dd5-316f709d104f")
    @Override
    public String getSelector() {
        return (String) getAttVal(((CommunicationNodeSmClass)getClassOf()).getSelectorAtt());
    }

    @objid ("81a6ce86-fae0-4940-9bff-29538cd3c103")
    @Override
    public void setSelector(String value) {
        setAttVal(((CommunicationNodeSmClass)getClassOf()).getSelectorAtt(), value);
    }

    @objid ("7e161cd7-62c3-4869-89f2-9d8f6725348c")
    @Override
    public CommunicationInteraction getOwner() {
        Object obj = getDepVal(((CommunicationNodeSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof CommunicationInteraction)? (CommunicationInteraction)obj : null;
    }

    @objid ("48df9cd3-2290-4ee0-b7b6-6b79bb25930e")
    @Override
    public void setOwner(CommunicationInteraction value) {
        appendDepVal(((CommunicationNodeSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("887e13df-30e3-4793-bd75-47a6db37d095")
    @Override
    public Instance getRepresented() {
        Object obj = getDepVal(((CommunicationNodeSmClass)getClassOf()).getRepresentedDep());
        return (obj instanceof Instance)? (Instance)obj : null;
    }

    @objid ("0785245a-8767-4cb7-a05c-27c5c9f96eee")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(((CommunicationNodeSmClass)getClassOf()).getRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("d4ded4ad-5167-4666-a944-a9139c4319ac")
    @Override
    public EList<CommunicationChannel> getStarted() {
        return new SmList<>(this, ((CommunicationNodeSmClass)getClassOf()).getStartedDep());
    }

    @objid ("f2682ed3-8f61-4ddf-b20d-473d51b6eada")
    @Override
    public <T extends CommunicationChannel> List<T> getStarted(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CommunicationChannel element : getStarted()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1a7119df-47f1-4bcf-86ca-25122281bf70")
    @Override
    public EList<CommunicationChannel> getEnded() {
        return new SmList<>(this, ((CommunicationNodeSmClass)getClassOf()).getEndedDep());
    }

    @objid ("18d79bf9-eb5d-4f75-831f-86511a385477")
    @Override
    public <T extends CommunicationChannel> List<T> getEnded(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CommunicationChannel element : getEnded()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cd4e3863-477e-4667-86a6-218a450125f4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((CommunicationNodeSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("323b700f-31d2-45d2-b724-86cdcc913dbe")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((CommunicationNodeSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("a53bf857-94a0-436c-b969-e72fd60cd1ca")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationNode(this);
        else
          return null;
    }

}
