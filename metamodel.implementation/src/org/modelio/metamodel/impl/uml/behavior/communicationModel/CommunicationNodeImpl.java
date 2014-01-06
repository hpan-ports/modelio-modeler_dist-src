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
package org.modelio.metamodel.impl.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationNodeData;
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

@objid ("005ab766-c4bf-1fd8-97fe-001ec947cd2a")
public class CommunicationNodeImpl extends ModelElementImpl implements CommunicationNode {
    @objid ("c0e18d6a-b811-4456-9599-0b898b438ac4")
    @Override
    public String getSelector() {
        return (String) getAttVal(CommunicationNodeData.Metadata.SelectorAtt());
    }

    @objid ("24c6ff06-f41f-475f-a8c6-e33e1d463b64")
    @Override
    public void setSelector(String value) {
        setAttVal(CommunicationNodeData.Metadata.SelectorAtt(), value);
    }

    @objid ("1b0a32f3-845f-44ec-8900-5a5db9cb2ca4")
    @Override
    public CommunicationInteraction getOwner() {
        return (CommunicationInteraction) getDepVal(CommunicationNodeData.Metadata.OwnerDep());
    }

    @objid ("6cd9434e-66f9-4f36-8f9a-484e29e5328f")
    @Override
    public void setOwner(CommunicationInteraction value) {
        appendDepVal(CommunicationNodeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("73d206ed-02df-4ea0-8f3e-d28e195e7529")
    @Override
    public Instance getRepresented() {
        return (Instance) getDepVal(CommunicationNodeData.Metadata.RepresentedDep());
    }

    @objid ("4db737cc-9849-4901-9231-62f91e7f1616")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(CommunicationNodeData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("a6fc1424-fe1e-4511-b2fd-cf0732f5d237")
    @Override
    public EList<CommunicationChannel> getStarted() {
        return new SmList<>(this, CommunicationNodeData.Metadata.StartedDep());
    }

    @objid ("91ed147d-a99e-4f88-8d2f-a88c8e5f98a3")
    @Override
    public <T extends CommunicationChannel> List<T> getStarted(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationChannel element : getStarted()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fc56269a-7d37-485c-9ae5-8c6603d1751d")
    @Override
    public EList<CommunicationChannel> getEnded() {
        return new SmList<>(this, CommunicationNodeData.Metadata.EndedDep());
    }

    @objid ("2ae165b5-1793-4b59-9b7b-4e9aacce5ca2")
    @Override
    public <T extends CommunicationChannel> List<T> getEnded(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationChannel element : getEnded()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e867dd6e-9b3b-4cf0-9a0b-51a3fc25c365")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationNodeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("73a6cd9e-f872-4aeb-8c81-6ef3949fb3c9")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationNodeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(CommunicationNodeData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b847dac7-5870-4ad7-b30b-9f220967bad0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationNode(this);
        else
          return null;
    }

}
