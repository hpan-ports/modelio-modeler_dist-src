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
    @objid ("1a2df121-4e6d-409d-8876-499a80d7a085")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnMessageFlowData.Metadata.MessageRefDep());
    }

    @objid ("ba1e7eb0-f795-4905-bf35-9f42effad3f5")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnMessageFlowData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("8965cc57-8f0c-46a8-a990-35383553c1b0")
    @Override
    public BpmnBaseElement getSourceRef() {
        return (BpmnBaseElement) getDepVal(BpmnMessageFlowData.Metadata.SourceRefDep());
    }

    @objid ("a319d222-c182-47a4-949f-0d86f9ce61b5")
    @Override
    public void setSourceRef(BpmnBaseElement value) {
        appendDepVal(BpmnMessageFlowData.Metadata.SourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("67dcf2a9-d9aa-4234-b61b-bceee5cf3170")
    @Override
    public BpmnBaseElement getTargetRef() {
        return (BpmnBaseElement) getDepVal(BpmnMessageFlowData.Metadata.TargetRefDep());
    }

    @objid ("a6c46e7a-79f2-4612-96f5-f15d96fcd32d")
    @Override
    public void setTargetRef(BpmnBaseElement value) {
        appendDepVal(BpmnMessageFlowData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("7e05c49c-fe41-451a-a0d3-0b8395f467e4")
    @Override
    public BpmnCollaboration getCollaboration() {
        return (BpmnCollaboration) getDepVal(BpmnMessageFlowData.Metadata.CollaborationDep());
    }

    @objid ("a3a04f09-6ace-406c-81b3-e739298b32cc")
    @Override
    public void setCollaboration(BpmnCollaboration value) {
        appendDepVal(BpmnMessageFlowData.Metadata.CollaborationDep(), (SmObjectImpl)value);
    }

    @objid ("31c10c14-fb18-4c32-bd91-4c9efe97c5e8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnMessageFlowData.Metadata.CollaborationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("01125a26-d193-4174-b0bf-98feef1d3ecc")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnMessageFlowData.Metadata.CollaborationDep());
        if (obj != null)
          return new SmDepVal(BpmnMessageFlowData.Metadata.CollaborationDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e4e60dc9-7039-471b-9924-ae1323b069aa")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessageFlow(this);
        else
          return null;
    }

}
