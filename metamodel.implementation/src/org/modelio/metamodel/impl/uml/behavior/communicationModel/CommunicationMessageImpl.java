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
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationMessageData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("005b2ef8-c4bf-1fd8-97fe-001ec947cd2a")
public class CommunicationMessageImpl extends ModelElementImpl implements CommunicationMessage {
    @objid ("a91986ef-73cb-4013-b1b2-438ce7689a16")
    @Override
    public String getArgument() {
        return (String) getAttVal(((CommunicationMessageSmClass)getClassOf()).getArgumentAtt());
    }

    @objid ("8b5cf531-fd66-41c0-a870-9ba7c7f5ded8")
    @Override
    public void setArgument(String value) {
        setAttVal(((CommunicationMessageSmClass)getClassOf()).getArgumentAtt(), value);
    }

    @objid ("c16fab37-8b96-44af-9967-62bc5f6f73e5")
    @Override
    public String getSequence() {
        return (String) getAttVal(((CommunicationMessageSmClass)getClassOf()).getSequenceAtt());
    }

    @objid ("723c9ec6-ddd9-4a88-8d4d-202f2e2774b0")
    @Override
    public void setSequence(String value) {
        setAttVal(((CommunicationMessageSmClass)getClassOf()).getSequenceAtt(), value);
    }

    @objid ("18c5232c-cd7a-4fbf-90f6-54b20587705a")
    @Override
    public MessageSort getSortOfMessage() {
        return (MessageSort) getAttVal(((CommunicationMessageSmClass)getClassOf()).getSortOfMessageAtt());
    }

    @objid ("b2cd957b-bad9-47e0-a43f-6521e3d53a9f")
    @Override
    public void setSortOfMessage(MessageSort value) {
        setAttVal(((CommunicationMessageSmClass)getClassOf()).getSortOfMessageAtt(), value);
    }

    @objid ("d271b456-afc7-4b18-be6b-d3082d4f0e99")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, ((CommunicationMessageSmClass)getClassOf()).getRealizedInformationFlowDep());
    }

    @objid ("8050a459-20b0-42dc-aefe-4b96146e1d0a")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InformationFlow element : getRealizedInformationFlow()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("680c8a0f-9dcd-4a8b-88dc-2eae7cd9e035")
    @Override
    public CommunicationChannel getChannel() {
        Object obj = getDepVal(((CommunicationMessageSmClass)getClassOf()).getChannelDep());
        return (obj instanceof CommunicationChannel)? (CommunicationChannel)obj : null;
    }

    @objid ("06bf99a5-f84b-453d-92f8-3f59d1b97cff")
    @Override
    public void setChannel(CommunicationChannel value) {
        appendDepVal(((CommunicationMessageSmClass)getClassOf()).getChannelDep(), (SmObjectImpl)value);
    }

    @objid ("08608fd4-8b3d-4ff9-84e0-e6fa700258ee")
    @Override
    public CommunicationChannel getInvertedChannel() {
        Object obj = getDepVal(((CommunicationMessageSmClass)getClassOf()).getInvertedChannelDep());
        return (obj instanceof CommunicationChannel)? (CommunicationChannel)obj : null;
    }

    @objid ("f82efbea-8b08-40dc-bc89-da96e501b874")
    @Override
    public void setInvertedChannel(CommunicationChannel value) {
        appendDepVal(((CommunicationMessageSmClass)getClassOf()).getInvertedChannelDep(), (SmObjectImpl)value);
    }

    @objid ("f9f2df0d-58d5-4046-bfb3-7cde55bfb10f")
    @Override
    public Operation getInvoked() {
        Object obj = getDepVal(((CommunicationMessageSmClass)getClassOf()).getInvokedDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("63646bf5-0bc8-40bd-8974-ef9e10140fe2")
    @Override
    public void setInvoked(Operation value) {
        appendDepVal(((CommunicationMessageSmClass)getClassOf()).getInvokedDep(), (SmObjectImpl)value);
    }

    @objid ("03545b9f-255f-48f5-a87a-49ca135a63ca")
    @Override
    public Signal getSignalSignature() {
        Object obj = getDepVal(((CommunicationMessageSmClass)getClassOf()).getSignalSignatureDep());
        return (obj instanceof Signal)? (Signal)obj : null;
    }

    @objid ("698b7362-3587-4db8-9485-0dc47aac3ca5")
    @Override
    public void setSignalSignature(Signal value) {
        appendDepVal(((CommunicationMessageSmClass)getClassOf()).getSignalSignatureDep(), (SmObjectImpl)value);
    }

    @objid ("2fcff248-f879-467d-ab8a-dc731270ea70")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Channel
        obj = (SmObjectImpl)this.getDepVal(((CommunicationMessageSmClass)getClassOf()).getChannelDep());
        if (obj != null)
          return obj;
        // InvertedChannel
        obj = (SmObjectImpl)this.getDepVal(((CommunicationMessageSmClass)getClassOf()).getInvertedChannelDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7046880c-e0dc-41ad-8313-3d99a8176d5f")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Channel
        dep = ((CommunicationMessageSmClass)getClassOf()).getChannelDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // InvertedChannel
        dep = ((CommunicationMessageSmClass)getClassOf()).getInvertedChannelDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("24f1c73c-85da-4352-9439-41207832d142")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationMessage(this);
        else
          return null;
    }

}
