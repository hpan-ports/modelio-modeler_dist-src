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
    @objid ("df11f431-cdca-4b5a-bd95-40efc9687d0b")
    @Override
    public String getSelector() {
        return (String) getAttVal(CommunicationNodeData.Metadata.SelectorAtt());
    }

    @objid ("e5a76bdf-9b92-4076-b8cc-d57ece44c4a2")
    @Override
    public void setSelector(String value) {
        setAttVal(CommunicationNodeData.Metadata.SelectorAtt(), value);
    }

    @objid ("bb40c839-ea03-4939-9dcf-f2edb4544afb")
    @Override
    public CommunicationInteraction getOwner() {
        return (CommunicationInteraction) getDepVal(CommunicationNodeData.Metadata.OwnerDep());
    }

    @objid ("143d0dd0-2545-4352-a555-a385e1dee328")
    @Override
    public void setOwner(CommunicationInteraction value) {
        appendDepVal(CommunicationNodeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("036ca9b1-6f5e-4b51-b1d5-d1c4dbcef0a5")
    @Override
    public Instance getRepresented() {
        return (Instance) getDepVal(CommunicationNodeData.Metadata.RepresentedDep());
    }

    @objid ("279973f7-cd37-40c2-b0d9-88588ca02dfa")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(CommunicationNodeData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("b7292f8d-6465-404f-bcc4-01cebebdfd1c")
    @Override
    public EList<CommunicationChannel> getStarted() {
        return new SmList<>(this, CommunicationNodeData.Metadata.StartedDep());
    }

    @objid ("66b344a7-4810-40c0-936d-a9fcf9b1257e")
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

    @objid ("ba3f3404-acd8-43bd-847a-5baa5b205216")
    @Override
    public EList<CommunicationChannel> getEnded() {
        return new SmList<>(this, CommunicationNodeData.Metadata.EndedDep());
    }

    @objid ("6c06466f-39cd-43db-abda-97b79d236a8d")
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

    @objid ("db159ed1-862c-48c8-b4c4-a99204298151")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationNodeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d36bb9b1-a554-40a4-9bc5-32912fd43704")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationNodeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(CommunicationNodeData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("461d5aaf-9afb-408c-83e1-1a221a9188b0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationNode(this);
        else
          return null;
    }

}
