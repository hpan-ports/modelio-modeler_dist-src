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
package org.modelio.metamodel.impl.bpmn.flows;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageFlowData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007c895e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMessageFlowImpl extends BpmnBaseElementImpl implements BpmnMessageFlow {
    @objid ("4da56a54-e501-41f4-9d24-0a04f91eefe6")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnMessageFlowData.Metadata.MessageRefDep());
    }

    @objid ("4724691a-8206-467d-bb36-f50d3f2a7d20")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnMessageFlowData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("4a92fa59-977d-4522-9609-25a5cb5efc6c")
    @Override
    public BpmnBaseElement getSourceRef() {
        return (BpmnBaseElement) getDepVal(BpmnMessageFlowData.Metadata.SourceRefDep());
    }

    @objid ("fdcc456d-f82e-4937-af15-9129fb0d13e8")
    @Override
    public void setSourceRef(BpmnBaseElement value) {
        appendDepVal(BpmnMessageFlowData.Metadata.SourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("45f8ee3a-ea9c-4fc4-a36e-91c8f5acb233")
    @Override
    public BpmnBaseElement getTargetRef() {
        return (BpmnBaseElement) getDepVal(BpmnMessageFlowData.Metadata.TargetRefDep());
    }

    @objid ("1f0b013e-6d35-4193-aaba-5ceb32a44260")
    @Override
    public void setTargetRef(BpmnBaseElement value) {
        appendDepVal(BpmnMessageFlowData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("8bbfc0e5-0c44-4574-af8c-ec0b1284fc63")
    @Override
    public BpmnCollaboration getCollaboration() {
        return (BpmnCollaboration) getDepVal(BpmnMessageFlowData.Metadata.CollaborationDep());
    }

    @objid ("125d4ced-a66c-45ad-a5b6-e4a5bf58d679")
    @Override
    public void setCollaboration(BpmnCollaboration value) {
        appendDepVal(BpmnMessageFlowData.Metadata.CollaborationDep(), (SmObjectImpl)value);
    }

    @objid ("1ab33dc9-b1a1-4a93-af62-2333b7832479")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnMessageFlowData.Metadata.CollaborationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7c1c6f17-8cbc-4406-aa22-2fd75f002cd1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnMessageFlowData.Metadata.CollaborationDep());
        if (obj != null)
          return new SmDepVal(BpmnMessageFlowData.Metadata.CollaborationDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e1daed4e-5529-42f0-b461-8a7cf63bd699")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessageFlow(this);
        else
          return null;
    }

}
