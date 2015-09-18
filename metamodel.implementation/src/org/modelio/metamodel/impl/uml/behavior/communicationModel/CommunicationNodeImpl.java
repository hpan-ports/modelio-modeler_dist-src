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
    @objid ("2f43d5fe-b434-4078-b20e-b2eaf42f8789")
    @Override
    public String getSelector() {
        return (String) getAttVal(CommunicationNodeData.Metadata.SelectorAtt());
    }

    @objid ("29f4a29b-831e-49c0-92e0-76ed17cd92cf")
    @Override
    public void setSelector(String value) {
        setAttVal(CommunicationNodeData.Metadata.SelectorAtt(), value);
    }

    @objid ("1dbcb545-54c4-41df-8bb9-ec7b9f1fc6b8")
    @Override
    public CommunicationInteraction getOwner() {
        return (CommunicationInteraction) getDepVal(CommunicationNodeData.Metadata.OwnerDep());
    }

    @objid ("6b031b88-a0d6-4fdb-815b-394e5d295c26")
    @Override
    public void setOwner(CommunicationInteraction value) {
        appendDepVal(CommunicationNodeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("68033c4b-df3b-4cbc-a494-d3dcd46db715")
    @Override
    public Instance getRepresented() {
        return (Instance) getDepVal(CommunicationNodeData.Metadata.RepresentedDep());
    }

    @objid ("5bbd019e-0936-4beb-9b47-31ca7ad48298")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(CommunicationNodeData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("9e66dcb0-eb72-4053-8e05-0cd65729d276")
    @Override
    public EList<CommunicationChannel> getStarted() {
        return new SmList<>(this, CommunicationNodeData.Metadata.StartedDep());
    }

    @objid ("95d4ec86-e7d3-4861-923a-f6c92971869b")
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

    @objid ("3375ed08-8124-4af7-89e6-b644777facf4")
    @Override
    public EList<CommunicationChannel> getEnded() {
        return new SmList<>(this, CommunicationNodeData.Metadata.EndedDep());
    }

    @objid ("e25e9f75-d0ae-4c1d-b608-f8ee0eada01d")
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

    @objid ("d9af31af-e146-4ebd-8974-f3d10944288e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationNodeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b6e0a42c-0c6c-4644-843c-40e8139196b2")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationNodeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(CommunicationNodeData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("060af050-d5e3-42eb-9790-4f4ffaed54e6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationNode(this);
        else
          return null;
    }

}
