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
package org.modelio.metamodel.impl.bpmn.flows;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageFlowData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("007c895e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMessageFlowImpl extends BpmnBaseElementImpl implements BpmnMessageFlow {
    @objid ("fdb2e62c-c45b-4fce-8b5b-8382144537fd")
    @Override
    public BpmnMessage getMessageRef() {
        Object obj = getDepVal(((BpmnMessageFlowSmClass)getClassOf()).getMessageRefDep());
        return (obj instanceof BpmnMessage)? (BpmnMessage)obj : null;
    }

    @objid ("8d39aa8e-7aba-4239-8a51-79dc8bf21a99")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(((BpmnMessageFlowSmClass)getClassOf()).getMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("548d7fbc-6c84-44fb-b7da-acf8bf7723d7")
    @Override
    public BpmnBaseElement getSourceRef() {
        Object obj = getDepVal(((BpmnMessageFlowSmClass)getClassOf()).getSourceRefDep());
        return (obj instanceof BpmnBaseElement)? (BpmnBaseElement)obj : null;
    }

    @objid ("1ee3b389-aed0-4a9e-8d91-868c109da181")
    @Override
    public void setSourceRef(BpmnBaseElement value) {
        appendDepVal(((BpmnMessageFlowSmClass)getClassOf()).getSourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("d04a522d-569b-41cb-bf92-139800e36e1d")
    @Override
    public BpmnBaseElement getTargetRef() {
        Object obj = getDepVal(((BpmnMessageFlowSmClass)getClassOf()).getTargetRefDep());
        return (obj instanceof BpmnBaseElement)? (BpmnBaseElement)obj : null;
    }

    @objid ("2a0fbec4-a36f-467d-aceb-b129f3e1a4e7")
    @Override
    public void setTargetRef(BpmnBaseElement value) {
        appendDepVal(((BpmnMessageFlowSmClass)getClassOf()).getTargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("2fb10343-0a00-419c-9406-01408baa7523")
    @Override
    public BpmnCollaboration getCollaboration() {
        Object obj = getDepVal(((BpmnMessageFlowSmClass)getClassOf()).getCollaborationDep());
        return (obj instanceof BpmnCollaboration)? (BpmnCollaboration)obj : null;
    }

    @objid ("83a55fcd-28f7-4b41-9edc-15b1c8c84a72")
    @Override
    public void setCollaboration(BpmnCollaboration value) {
        appendDepVal(((BpmnMessageFlowSmClass)getClassOf()).getCollaborationDep(), (SmObjectImpl)value);
    }

    @objid ("324a49a0-963a-4825-8d2f-cf9db892f990")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Collaboration
        obj = (SmObjectImpl)this.getDepVal(((BpmnMessageFlowSmClass)getClassOf()).getCollaborationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("62b863a6-c200-4555-a1d6-ac8a56ec0b90")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Collaboration
        dep = ((BpmnMessageFlowSmClass)getClassOf()).getCollaborationDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("7bc4dce1-4efb-4552-83bb-87e881f2866d")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessageFlow(this);
        else
          return null;
    }

}
