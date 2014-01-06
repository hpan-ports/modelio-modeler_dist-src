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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.ObjectNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNodeOrderingKind;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00397a06-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ObjectNodeImpl extends ActivityNodeImpl implements ObjectNode {
    @objid ("3296d079-42fe-4c6e-8b36-437b22bbcdfa")
    @Override
    public boolean isIsControlType() {
        return (Boolean) getAttVal(ObjectNodeData.Metadata.IsControlTypeAtt());
    }

    @objid ("b1393c78-7cec-49d6-ba24-d894fa035759")
    @Override
    public void setIsControlType(boolean value) {
        setAttVal(ObjectNodeData.Metadata.IsControlTypeAtt(), value);
    }

    @objid ("7ff0e152-41b7-4702-a317-720605391881")
    @Override
    public ObjectNodeOrderingKind getOrdering() {
        return (ObjectNodeOrderingKind) getAttVal(ObjectNodeData.Metadata.OrderingAtt());
    }

    @objid ("918b3115-7d70-4fc7-add8-bb45f75361b7")
    @Override
    public void setOrdering(ObjectNodeOrderingKind value) {
        setAttVal(ObjectNodeData.Metadata.OrderingAtt(), value);
    }

    @objid ("da6f353a-bd87-41c0-8e25-b30dce4bf009")
    @Override
    public String getSelectionBehavior() {
        return (String) getAttVal(ObjectNodeData.Metadata.SelectionBehaviorAtt());
    }

    @objid ("7298b9e9-58d8-4035-9128-bcd20920edac")
    @Override
    public void setSelectionBehavior(String value) {
        setAttVal(ObjectNodeData.Metadata.SelectionBehaviorAtt(), value);
    }

    @objid ("e36f90d0-523b-4979-a3e5-cb31f03766f4")
    @Override
    public String getUpperBound() {
        return (String) getAttVal(ObjectNodeData.Metadata.UpperBoundAtt());
    }

    @objid ("e7c90b74-a55f-421a-90f8-8231f19a13f0")
    @Override
    public void setUpperBound(String value) {
        setAttVal(ObjectNodeData.Metadata.UpperBoundAtt(), value);
    }

    @objid ("53b647d6-031f-4790-b792-ba314835c2e4")
    @Override
    public Instance getRepresented() {
        return (Instance) getDepVal(ObjectNodeData.Metadata.RepresentedDep());
    }

    @objid ("04825aa7-22dc-49ae-904f-a0b6095a42b2")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("579fd487-dda0-49d8-8ba9-ccbf2ab17a9b")
    @Override
    public BehaviorParameter getRepresentedRealParameter() {
        return (BehaviorParameter) getDepVal(ObjectNodeData.Metadata.RepresentedRealParameterDep());
    }

    @objid ("a0d7192b-07fa-42fd-972b-1b2e2d6e0e35")
    @Override
    public void setRepresentedRealParameter(BehaviorParameter value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedRealParameterDep(), (SmObjectImpl)value);
    }

    @objid ("600c8cc7-60cb-4cdc-8b5e-272886e7c79d")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(ObjectNodeData.Metadata.TypeDep());
    }

    @objid ("8b84aea3-53bd-4182-857b-cad739e6bb1d")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(ObjectNodeData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("e261a5b4-a6dd-4aee-9bde-8b41e0979cd6")
    @Override
    public AssociationEnd getRepresentedRole() {
        return (AssociationEnd) getDepVal(ObjectNodeData.Metadata.RepresentedRoleDep());
    }

    @objid ("eba7e2a5-5fa1-4977-bd48-8182efbc3fe6")
    @Override
    public void setRepresentedRole(AssociationEnd value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedRoleDep(), (SmObjectImpl)value);
    }

    @objid ("7caf728b-3514-426b-8bb3-b17666509bb6")
    @Override
    public Attribute getRepresentedAttribute() {
        return (Attribute) getDepVal(ObjectNodeData.Metadata.RepresentedAttributeDep());
    }

    @objid ("768ae7da-4a74-4e34-8a64-4fc36b846a17")
    @Override
    public void setRepresentedAttribute(Attribute value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedAttributeDep(), (SmObjectImpl)value);
    }

    @objid ("a924c9a2-d24e-4ec5-9c36-f757d1047f50")
    @Override
    public State getInState() {
        return (State) getDepVal(ObjectNodeData.Metadata.InStateDep());
    }

    @objid ("f0128c58-4217-4912-bc1b-ab9aa4344825")
    @Override
    public void setInState(State value) {
        appendDepVal(ObjectNodeData.Metadata.InStateDep(), (SmObjectImpl)value);
    }

    @objid ("6a751472-e01e-4011-a811-2e53d0d418f8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("291dfe81-58e5-4ce6-b611-4203e19ddf0a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("e234aa72-c16b-4068-9745-a0f4bd4388b8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitObjectNode(this);
        else
          return null;
    }

}
