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
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociationDirection;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnAssociationData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00775b3c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnAssociationImpl extends BpmnArtifactImpl implements BpmnAssociation {
    @objid ("0096b981-10a8-4530-8c1e-b869a0f27de1")
    @Override
    public BpmnAssociationDirection getAssociationDirection() {
        return (BpmnAssociationDirection) getAttVal(((BpmnAssociationSmClass)getClassOf()).getAssociationDirectionAtt());
    }

    @objid ("69ebcca0-52ab-4860-9b50-d714c8e08a54")
    @Override
    public void setAssociationDirection(BpmnAssociationDirection value) {
        setAttVal(((BpmnAssociationSmClass)getClassOf()).getAssociationDirectionAtt(), value);
    }

    @objid ("19830ce0-d1ca-4f2b-a264-cb4eade831e4")
    @Override
    public BpmnBaseElement getTargetRef() {
        Object obj = getDepVal(((BpmnAssociationSmClass)getClassOf()).getTargetRefDep());
        return (obj instanceof BpmnBaseElement)? (BpmnBaseElement)obj : null;
    }

    @objid ("2730649d-2078-427a-bf60-d307e3b57170")
    @Override
    public void setTargetRef(BpmnBaseElement value) {
        appendDepVal(((BpmnAssociationSmClass)getClassOf()).getTargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("a28a96de-1d76-4d47-aa25-de06791eef78")
    @Override
    public BpmnBaseElement getSourceRef() {
        Object obj = getDepVal(((BpmnAssociationSmClass)getClassOf()).getSourceRefDep());
        return (obj instanceof BpmnBaseElement)? (BpmnBaseElement)obj : null;
    }

    @objid ("bf13599d-b80f-4092-b3e3-6cd1cd429224")
    @Override
    public void setSourceRef(BpmnBaseElement value) {
        appendDepVal(((BpmnAssociationSmClass)getClassOf()).getSourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("710c2160-82dc-4a2c-9401-40daa6816967")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("14ff232d-3c01-4e48-8146-ef735f811e8d")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("8e8a15ef-35f6-4c6f-98fd-08b7fbdbbe50")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnAssociation(this);
        else
          return null;
    }

}
