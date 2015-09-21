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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.MessageEndData;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0049f7c8-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class MessageEndImpl extends OccurrenceSpecificationImpl implements MessageEnd {
    @objid ("abd466ce-44eb-4db1-a412-1df3cd39ee51")
    @Override
    public Message getReceivedMessage() {
        Object obj = getDepVal(((MessageEndSmClass)getClassOf()).getReceivedMessageDep());
        return (obj instanceof Message)? (Message)obj : null;
    }

    @objid ("aee78ea8-be53-492c-b6df-2a65bbb14d55")
    @Override
    public void setReceivedMessage(Message value) {
        appendDepVal(((MessageEndSmClass)getClassOf()).getReceivedMessageDep(), (SmObjectImpl)value);
    }

    @objid ("41ab33e2-7c3b-4c83-bafa-dc0b43c23ae6")
    @Override
    public Message getSentMessage() {
        Object obj = getDepVal(((MessageEndSmClass)getClassOf()).getSentMessageDep());
        return (obj instanceof Message)? (Message)obj : null;
    }

    @objid ("eccd92e4-359d-4dab-bf7e-6868ec41b60c")
    @Override
    public void setSentMessage(Message value) {
        appendDepVal(((MessageEndSmClass)getClassOf()).getSentMessageDep(), (SmObjectImpl)value);
    }

    @objid ("72d19980-78a8-43a2-a22a-e64cf35354cf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("541b7ad4-3d87-467d-a49f-53256ffc693e")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("ea12d3a8-7319-4dfb-9a35-a9b0f6eadc9b")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessageEnd(this);
        else
          return null;
    }

}
