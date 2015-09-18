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
    @objid ("1f2c8d6e-3618-44b9-993c-1eec7f98069e")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnMessageFlowData.Metadata.MessageRefDep());
    }

    @objid ("397609e5-13a5-4608-be4c-2ac820248979")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnMessageFlowData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("e81cc015-ab02-4148-ab39-bbbb7a3e669d")
    @Override
    public BpmnBaseElement getSourceRef() {
        return (BpmnBaseElement) getDepVal(BpmnMessageFlowData.Metadata.SourceRefDep());
    }

    @objid ("08a28355-903f-433d-ba1f-4dc2d601014a")
    @Override
    public void setSourceRef(BpmnBaseElement value) {
        appendDepVal(BpmnMessageFlowData.Metadata.SourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("8b17801a-22b2-4c31-b160-4938ea779422")
    @Override
    public BpmnBaseElement getTargetRef() {
        return (BpmnBaseElement) getDepVal(BpmnMessageFlowData.Metadata.TargetRefDep());
    }

    @objid ("de26a830-a2a2-4c10-b53b-2fb13c5f5ade")
    @Override
    public void setTargetRef(BpmnBaseElement value) {
        appendDepVal(BpmnMessageFlowData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("24550814-22bf-41fd-b7ec-f876e04ba8b8")
    @Override
    public BpmnCollaboration getCollaboration() {
        return (BpmnCollaboration) getDepVal(BpmnMessageFlowData.Metadata.CollaborationDep());
    }

    @objid ("1792fe43-f927-4278-a57d-d52089512e7e")
    @Override
    public void setCollaboration(BpmnCollaboration value) {
        appendDepVal(BpmnMessageFlowData.Metadata.CollaborationDep(), (SmObjectImpl)value);
    }

    @objid ("a0981bcf-d7d6-4363-ac20-6c4851bf4532")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnMessageFlowData.Metadata.CollaborationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4377c58c-af58-4961-9f39-d54a602e8764")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnMessageFlowData.Metadata.CollaborationDep());
        if (obj != null)
          return new SmDepVal(BpmnMessageFlowData.Metadata.CollaborationDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("564330f3-fb5a-49bf-a053-ba45e480921f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessageFlow(this);
        else
          return null;
    }

}
