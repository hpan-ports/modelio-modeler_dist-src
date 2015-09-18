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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociationDirection;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnAssociationData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00775b3c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnAssociationImpl extends BpmnArtifactImpl implements BpmnAssociation {
    @objid ("2a4af63c-be5b-416c-abf4-f99c935154b3")
    @Override
    public BpmnAssociationDirection getAssociationDirection() {
        return (BpmnAssociationDirection) getAttVal(BpmnAssociationData.Metadata.AssociationDirectionAtt());
    }

    @objid ("a2209643-ad07-49be-b17e-585945293db8")
    @Override
    public void setAssociationDirection(BpmnAssociationDirection value) {
        setAttVal(BpmnAssociationData.Metadata.AssociationDirectionAtt(), value);
    }

    @objid ("242ac2d0-55a0-4ef4-bbca-71666c462eb4")
    @Override
    public BpmnBaseElement getTargetRef() {
        return (BpmnBaseElement) getDepVal(BpmnAssociationData.Metadata.TargetRefDep());
    }

    @objid ("d388340b-bb96-42e6-82e8-f2cba37e3b05")
    @Override
    public void setTargetRef(BpmnBaseElement value) {
        appendDepVal(BpmnAssociationData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("fb4ad99b-cf32-40e0-abe6-28b381d2715c")
    @Override
    public BpmnBaseElement getSourceRef() {
        return (BpmnBaseElement) getDepVal(BpmnAssociationData.Metadata.SourceRefDep());
    }

    @objid ("9b09b6d5-23a5-4b4e-beb6-f5319989c3bc")
    @Override
    public void setSourceRef(BpmnBaseElement value) {
        appendDepVal(BpmnAssociationData.Metadata.SourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("7501b763-7166-49d1-9ed1-aea808419607")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e9b3d1cb-9496-441f-a902-0e9b7694f285")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("baae618f-349b-40e3-884a-df2347cb8aa4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnAssociation(this);
        else
          return null;
    }

}
