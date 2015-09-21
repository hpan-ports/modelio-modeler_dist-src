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
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationChannelData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("3d66beff-bc9e-42aa-84dd-28f34e3a9a10")
public class CommunicationChannelImpl extends ModelElementImpl implements CommunicationChannel {
    @objid ("0b853b6d-d9b7-4ac0-962e-81c645b00925")
    @Override
    public EList<CommunicationMessage> getStartToEndMessage() {
        return new SmList<>(this, ((CommunicationChannelSmClass)getClassOf()).getStartToEndMessageDep());
    }

    @objid ("33ad0960-b182-460a-8561-0da5beaaee56")
    @Override
    public <T extends CommunicationMessage> List<T> getStartToEndMessage(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CommunicationMessage element : getStartToEndMessage()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("be535cab-1986-4faf-8a6c-9aacd213f3ea")
    @Override
    public Link getChannel() {
        Object obj = getDepVal(((CommunicationChannelSmClass)getClassOf()).getChannelDep());
        return (obj instanceof Link)? (Link)obj : null;
    }

    @objid ("47f52d70-5699-4f43-b57d-2f682c56f3d4")
    @Override
    public void setChannel(Link value) {
        appendDepVal(((CommunicationChannelSmClass)getClassOf()).getChannelDep(), (SmObjectImpl)value);
    }

    @objid ("e963d91b-eb79-41ae-b362-76768405894b")
    @Override
    public CommunicationNode getStart() {
        Object obj = getDepVal(((CommunicationChannelSmClass)getClassOf()).getStartDep());
        return (obj instanceof CommunicationNode)? (CommunicationNode)obj : null;
    }

    @objid ("30f82a67-17c7-4c18-9c57-b136e1d6b77d")
    @Override
    public void setStart(CommunicationNode value) {
        appendDepVal(((CommunicationChannelSmClass)getClassOf()).getStartDep(), (SmObjectImpl)value);
    }

    @objid ("d9f2658e-8188-4ac9-9464-bb9136c9bd50")
    @Override
    public NaryLink getNaryChannel() {
        Object obj = getDepVal(((CommunicationChannelSmClass)getClassOf()).getNaryChannelDep());
        return (obj instanceof NaryLink)? (NaryLink)obj : null;
    }

    @objid ("869c617f-85dd-463c-9bf8-e65148bd391d")
    @Override
    public void setNaryChannel(NaryLink value) {
        appendDepVal(((CommunicationChannelSmClass)getClassOf()).getNaryChannelDep(), (SmObjectImpl)value);
    }

    @objid ("02d5e4ea-aaa5-4cf0-99ad-8cf0c8a04f30")
    @Override
    public EList<CommunicationMessage> getEndToStartMessage() {
        return new SmList<>(this, ((CommunicationChannelSmClass)getClassOf()).getEndToStartMessageDep());
    }

    @objid ("dfc7c4e6-d23e-441d-b1ff-b3a34c8bbe28")
    @Override
    public <T extends CommunicationMessage> List<T> getEndToStartMessage(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CommunicationMessage element : getEndToStartMessage()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8ebe71c2-4e7c-481d-a07c-fd5093a0b487")
    @Override
    public CommunicationNode getEnd() {
        Object obj = getDepVal(((CommunicationChannelSmClass)getClassOf()).getEndDep());
        return (obj instanceof CommunicationNode)? (CommunicationNode)obj : null;
    }

    @objid ("3ac7c957-35a4-4879-8c89-f6d0a2b26b8d")
    @Override
    public void setEnd(CommunicationNode value) {
        appendDepVal(((CommunicationChannelSmClass)getClassOf()).getEndDep(), (SmObjectImpl)value);
    }

    @objid ("ff0916ae-42eb-4a74-810e-906958c9f615")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Start
        obj = (SmObjectImpl)this.getDepVal(((CommunicationChannelSmClass)getClassOf()).getStartDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9cd46c58-30e5-4cbf-89da-43fa2d849416")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Start
        dep = ((CommunicationChannelSmClass)getClassOf()).getStartDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("4b078a07-62cc-4874-9edd-0064b23584a6")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationChannel(this);
        else
          return null;
    }

}
