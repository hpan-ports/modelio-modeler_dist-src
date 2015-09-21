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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnArtifactData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0078aed8-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnArtifactImpl extends BpmnBaseElementImpl implements BpmnArtifact {
    @objid ("7ea7d4ad-e5a9-4a70-bad5-691f12b74001")
    @Override
    public BpmnSubProcess getSubProcess() {
        Object obj = getDepVal(((BpmnArtifactSmClass)getClassOf()).getSubProcessDep());
        return (obj instanceof BpmnSubProcess)? (BpmnSubProcess)obj : null;
    }

    @objid ("f0ddbcf8-634e-47a7-86f6-63765ff1e3da")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(((BpmnArtifactSmClass)getClassOf()).getSubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("5f67ab04-908e-4806-b931-e331484389ba")
    @Override
    public BpmnCollaboration getCollaboration() {
        Object obj = getDepVal(((BpmnArtifactSmClass)getClassOf()).getCollaborationDep());
        return (obj instanceof BpmnCollaboration)? (BpmnCollaboration)obj : null;
    }

    @objid ("5ac44458-c2d3-421f-b860-793cd6f83d3f")
    @Override
    public void setCollaboration(BpmnCollaboration value) {
        appendDepVal(((BpmnArtifactSmClass)getClassOf()).getCollaborationDep(), (SmObjectImpl)value);
    }

    @objid ("73745f84-8955-4984-ab97-f68da66cf256")
    @Override
    public BpmnProcess getProcess() {
        Object obj = getDepVal(((BpmnArtifactSmClass)getClassOf()).getProcessDep());
        return (obj instanceof BpmnProcess)? (BpmnProcess)obj : null;
    }

    @objid ("f6082837-59d7-41a6-acc4-87f8121b962b")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(((BpmnArtifactSmClass)getClassOf()).getProcessDep(), (SmObjectImpl)value);
    }

    @objid ("58c8a7bf-7c87-439a-abc7-e9ded796552b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // SubProcess
        obj = (SmObjectImpl)this.getDepVal(((BpmnArtifactSmClass)getClassOf()).getSubProcessDep());
        if (obj != null)
          return obj;
        // Collaboration
        obj = (SmObjectImpl)this.getDepVal(((BpmnArtifactSmClass)getClassOf()).getCollaborationDep());
        if (obj != null)
          return obj;
        // Process
        obj = (SmObjectImpl)this.getDepVal(((BpmnArtifactSmClass)getClassOf()).getProcessDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("949d2577-cfd5-4a54-abfd-cc37f80cd44a")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // SubProcess
        dep = ((BpmnArtifactSmClass)getClassOf()).getSubProcessDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // Collaboration
        dep = ((BpmnArtifactSmClass)getClassOf()).getCollaborationDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // Process
        dep = ((BpmnArtifactSmClass)getClassOf()).getProcessDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("4e55441c-fb85-457a-bdfc-6261cca87871")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnArtifact(this);
        else
          return null;
    }

}
