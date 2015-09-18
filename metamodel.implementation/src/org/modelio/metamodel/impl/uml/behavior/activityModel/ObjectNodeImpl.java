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
    @objid ("b509122c-578f-4c42-9e76-b05c4958c274")
    @Override
    public boolean isIsControlType() {
        return (Boolean) getAttVal(ObjectNodeData.Metadata.IsControlTypeAtt());
    }

    @objid ("785dbde1-9c43-49b9-b2fb-dfd11e98a384")
    @Override
    public void setIsControlType(boolean value) {
        setAttVal(ObjectNodeData.Metadata.IsControlTypeAtt(), value);
    }

    @objid ("f72f2708-b9a9-47e3-b035-d04bedd09c7e")
    @Override
    public ObjectNodeOrderingKind getOrdering() {
        return (ObjectNodeOrderingKind) getAttVal(ObjectNodeData.Metadata.OrderingAtt());
    }

    @objid ("0e1cd53a-3856-4fcd-8728-40d92dbf0060")
    @Override
    public void setOrdering(ObjectNodeOrderingKind value) {
        setAttVal(ObjectNodeData.Metadata.OrderingAtt(), value);
    }

    @objid ("10c9b762-80f3-49f6-bf7a-45cf80b9f19f")
    @Override
    public String getSelectionBehavior() {
        return (String) getAttVal(ObjectNodeData.Metadata.SelectionBehaviorAtt());
    }

    @objid ("68ce0226-77f8-4a79-98da-587fcb4bdcf7")
    @Override
    public void setSelectionBehavior(String value) {
        setAttVal(ObjectNodeData.Metadata.SelectionBehaviorAtt(), value);
    }

    @objid ("3a7a2f5e-6f7e-4526-892d-b5a9e4256a1d")
    @Override
    public String getUpperBound() {
        return (String) getAttVal(ObjectNodeData.Metadata.UpperBoundAtt());
    }

    @objid ("650c11a1-92a8-487a-ba16-9a2340247979")
    @Override
    public void setUpperBound(String value) {
        setAttVal(ObjectNodeData.Metadata.UpperBoundAtt(), value);
    }

    @objid ("d83511e0-075e-422f-8233-7c96f2aef37c")
    @Override
    public Instance getRepresented() {
        return (Instance) getDepVal(ObjectNodeData.Metadata.RepresentedDep());
    }

    @objid ("a5e1a5d4-43a5-47fd-af02-0c8db107a8a9")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("c56a50de-c3b9-4e7e-8ed7-4f0590290786")
    @Override
    public BehaviorParameter getRepresentedRealParameter() {
        return (BehaviorParameter) getDepVal(ObjectNodeData.Metadata.RepresentedRealParameterDep());
    }

    @objid ("f685aa48-4237-4d2a-bbc5-62ff35d0778d")
    @Override
    public void setRepresentedRealParameter(BehaviorParameter value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedRealParameterDep(), (SmObjectImpl)value);
    }

    @objid ("90e56c7d-2169-432c-a865-3c5d47d5da0a")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(ObjectNodeData.Metadata.TypeDep());
    }

    @objid ("7ca11ebb-04d6-446e-bf0b-45b98fefbfaa")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(ObjectNodeData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("fe6d0a87-03a2-4d74-b548-3aa8fcf8ef09")
    @Override
    public AssociationEnd getRepresentedRole() {
        return (AssociationEnd) getDepVal(ObjectNodeData.Metadata.RepresentedRoleDep());
    }

    @objid ("3ffbf19c-df71-4388-a9a3-d2966ddcab83")
    @Override
    public void setRepresentedRole(AssociationEnd value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedRoleDep(), (SmObjectImpl)value);
    }

    @objid ("3d981824-e19b-4170-b2ad-a214e90ff529")
    @Override
    public Attribute getRepresentedAttribute() {
        return (Attribute) getDepVal(ObjectNodeData.Metadata.RepresentedAttributeDep());
    }

    @objid ("73ffd8ac-4b02-4598-b714-02854ff6aa1a")
    @Override
    public void setRepresentedAttribute(Attribute value) {
        appendDepVal(ObjectNodeData.Metadata.RepresentedAttributeDep(), (SmObjectImpl)value);
    }

    @objid ("09dfd919-fa38-4e3b-a5f7-a0ed7d585d0e")
    @Override
    public State getInState() {
        return (State) getDepVal(ObjectNodeData.Metadata.InStateDep());
    }

    @objid ("65922474-ec62-4012-be4e-5198869e40ef")
    @Override
    public void setInState(State value) {
        appendDepVal(ObjectNodeData.Metadata.InStateDep(), (SmObjectImpl)value);
    }

    @objid ("81a2ba46-d44e-4e64-88cf-ddf4d001bc09")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("9a72f4b3-d25b-41a9-b901-e018f78515fe")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("01e85e62-10a8-408d-acff-3958de87a1b1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitObjectNode(this);
        else
          return null;
    }

}
