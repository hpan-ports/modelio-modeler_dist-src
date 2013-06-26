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
    @objid ("38615376-0461-4b0b-bf40-bad1f0e5f867")
    @Override
    public boolean isIsControlType() {
        return (Boolean) getAttVal(ObjectNodeData.Metadata.IsControlTypeAtt());
    }

    @objid ("1cf0a66a-3c90-47d4-8beb-6718b3b65d18")
    @Override
    public void setIsControlType(boolean value) {
        setAttVal(ObjectNodeData.Metadata.IsControlTypeAtt(), value);
    }

    @objid ("e6a6fda4-4ef5-44d4-8e0e-54de25625131")
    @Override
    public ObjectNodeOrderingKind getOrdering() {
        return (ObjectNodeOrderingKind) getAttVal(ObjectNodeData.Metadata.OrderingAtt());
    }

    @objid ("1851eed6-2202-4db1-8324-fe3e4d986fb3")
    @Override
    public void setOrdering(ObjectNodeOrderingKind value) {
        setAttVal(ObjectNodeData.Metadata.OrderingAtt(), value);
    }

    @objid ("d2dcc716-a64f-4bf0-920a-000d96db427b")
    @Override
    public String getSelectionBehavior() {
        return (String) getAttVal(ObjectNodeData.Metadata.SelectionBehaviorAtt());
    }

    @objid ("c1fbf019-d061-4cb6-9847-196b1f5b9789")
    @Override
    public void setSelectionBehavior(String value) {
        setAttVal(ObjectNodeData.Metadata.SelectionBehaviorAtt(), value);
    }

    @objid ("9f0b75fa-994b-408c-991d-4c0806d43633")
    @Override
    public String getUpperBound() {
        return (String) getAttVal(ObjectNodeData.Metadata.UpperBoundAtt());
    }

    @objid ("0d903de2-74b6-40f8-b23e-32c386836078")
    @Override
    public void setUpperBound(String value) {
        setAttVal(ObjectNodeData.Metadata.UpperBoundAtt(), value);
    }

    @objid ("99ddfe34-a9e7-441c-8cf4-95aff22a0ea1")
    @Override
    public Instance getRepresented() {
        return (Instance) getDepVal(ObjectNodeData.Metadata.RepresentedDep());
    }

    @objid ("19ac8c2b-2480-41bd-9a0c-bb13f1db1782")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("e2c4af57-f2c0-4e8f-a7ea-500dca3868c3")
    @Override
    public BehaviorParameter getRepresentedRealParameter() {
        return (BehaviorParameter) getDepVal(ObjectNodeData.Metadata.RepresentedRealParameterDep());
    }

    @objid ("d19d538a-a221-42c1-b238-39cfb7af7cbd")
    @Override
    public void setRepresentedRealParameter(BehaviorParameter value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedRealParameterDep(), (SmObjectImpl)value);
    }

    @objid ("50f4c985-9098-485f-be0e-0fe238a3fbe7")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(ObjectNodeData.Metadata.TypeDep());
    }

    @objid ("eebd90cb-a14d-4f95-a710-b356816f73b4")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(ObjectNodeData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("0f10006a-7d0e-40a8-ad3f-8839fa4ad7db")
    @Override
    public AssociationEnd getRepresentedRole() {
        return (AssociationEnd) getDepVal(ObjectNodeData.Metadata.RepresentedRoleDep());
    }

    @objid ("9b6a4ea5-48a7-4097-8784-3821c423eff7")
    @Override
    public void setRepresentedRole(AssociationEnd value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedRoleDep(), (SmObjectImpl)value);
    }

    @objid ("b1e525db-de59-499c-b4cb-6645ba487568")
    @Override
    public Attribute getRepresentedAttribute() {
        return (Attribute) getDepVal(ObjectNodeData.Metadata.RepresentedAttributeDep());
    }

    @objid ("d862a941-4ba6-4303-aa52-87da18080e6a")
    @Override
    public void setRepresentedAttribute(Attribute value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedAttributeDep(), (SmObjectImpl)value);
    }

    @objid ("561ee586-2188-4943-a7bf-a7bc07fa4111")
    @Override
    public State getInState() {
        return (State) getDepVal(ObjectNodeData.Metadata.InStateDep());
    }

    @objid ("fe800f72-24a5-489a-b742-0b1a37989f49")
    @Override
    public void setInState(State value) {
        appendDepVal(ObjectNodeData.Metadata.InStateDep(), (SmObjectImpl)value);
    }

    @objid ("f1667d71-8452-4de7-aabe-ffa207f6f223")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("bed44862-e2e2-4528-8d4b-d288a5f73e13")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("34ccc2df-d794-48df-ac5d-e751e9ec87fd")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitObjectNode(this);
        else
          return null;
    }

}
