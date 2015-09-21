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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectNodeData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00397a06-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ObjectNodeImpl extends ActivityNodeImpl implements ObjectNode {
    @objid ("89478e35-b58d-4677-b1c3-c7268c6a98e2")
    @Override
    public boolean isIsControlType() {
        return (Boolean) getAttVal(((ObjectNodeSmClass)getClassOf()).getIsControlTypeAtt());
    }

    @objid ("6f06be45-dfd3-4169-acfe-1b71d84f289e")
    @Override
    public void setIsControlType(boolean value) {
        setAttVal(((ObjectNodeSmClass)getClassOf()).getIsControlTypeAtt(), value);
    }

    @objid ("2f6feca3-2659-49d2-bc60-e3b538b56f56")
    @Override
    public ObjectNodeOrderingKind getOrdering() {
        return (ObjectNodeOrderingKind) getAttVal(((ObjectNodeSmClass)getClassOf()).getOrderingAtt());
    }

    @objid ("8ba818c8-39b1-4a99-8abf-850fb7ff1645")
    @Override
    public void setOrdering(ObjectNodeOrderingKind value) {
        setAttVal(((ObjectNodeSmClass)getClassOf()).getOrderingAtt(), value);
    }

    @objid ("ec63a1e1-8b9e-437f-a602-7538e54b85d1")
    @Override
    public String getSelectionBehavior() {
        return (String) getAttVal(((ObjectNodeSmClass)getClassOf()).getSelectionBehaviorAtt());
    }

    @objid ("361ef5ee-9037-423c-9b50-ed20fd552709")
    @Override
    public void setSelectionBehavior(String value) {
        setAttVal(((ObjectNodeSmClass)getClassOf()).getSelectionBehaviorAtt(), value);
    }

    @objid ("63727fae-3afb-4356-a9d5-2db1a5ff26f3")
    @Override
    public String getUpperBound() {
        return (String) getAttVal(((ObjectNodeSmClass)getClassOf()).getUpperBoundAtt());
    }

    @objid ("4fb022d2-4e51-4b83-934e-79a01962d30b")
    @Override
    public void setUpperBound(String value) {
        setAttVal(((ObjectNodeSmClass)getClassOf()).getUpperBoundAtt(), value);
    }

    @objid ("e0c4f327-e932-4136-9856-0d275c297794")
    @Override
    public Instance getRepresented() {
        Object obj = getDepVal(((ObjectNodeSmClass)getClassOf()).getRepresentedDep());
        return (obj instanceof Instance)? (Instance)obj : null;
    }

    @objid ("e0942b69-6f0d-4492-9d7e-da64cb088a90")
    @Override
    public void setRepresented(Instance value) {
        appendDepVal(((ObjectNodeSmClass)getClassOf()).getRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("19de8b71-8ffe-4b3b-b5e3-7b9a5cfd64f3")
    @Override
    public BehaviorParameter getRepresentedRealParameter() {
        Object obj = getDepVal(((ObjectNodeSmClass)getClassOf()).getRepresentedRealParameterDep());
        return (obj instanceof BehaviorParameter)? (BehaviorParameter)obj : null;
    }

    @objid ("b8b5add8-402b-4cbe-977a-9bc307ed38b5")
    @Override
    public void setRepresentedRealParameter(BehaviorParameter value) {
        appendDepVal(((ObjectNodeSmClass)getClassOf()).getRepresentedRealParameterDep(), (SmObjectImpl)value);
    }

    @objid ("78bcf510-41e9-4dec-a779-8b47656addc5")
    @Override
    public GeneralClass getType() {
        Object obj = getDepVal(((ObjectNodeSmClass)getClassOf()).getTypeDep());
        return (obj instanceof GeneralClass)? (GeneralClass)obj : null;
    }

    @objid ("fc8068ad-b678-4f05-b740-86ff2f580a11")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(((ObjectNodeSmClass)getClassOf()).getTypeDep(), (SmObjectImpl)value);
    }

    @objid ("7bf744d6-64b2-463a-973e-0b8655090e8a")
    @Override
    public AssociationEnd getRepresentedRole() {
        Object obj = getDepVal(((ObjectNodeSmClass)getClassOf()).getRepresentedRoleDep());
        return (obj instanceof AssociationEnd)? (AssociationEnd)obj : null;
    }

    @objid ("e3a8f540-971d-42fa-9da5-30b35586e27d")
    @Override
    public void setRepresentedRole(AssociationEnd value) {
        appendDepVal(((ObjectNodeSmClass)getClassOf()).getRepresentedRoleDep(), (SmObjectImpl)value);
    }

    @objid ("97364de5-50e5-4a81-953c-9c0c095de4b4")
    @Override
    public Attribute getRepresentedAttribute() {
        Object obj = getDepVal(((ObjectNodeSmClass)getClassOf()).getRepresentedAttributeDep());
        return (obj instanceof Attribute)? (Attribute)obj : null;
    }

    @objid ("51454f8b-5590-449b-ad87-e63ce43230a0")
    @Override
    public void setRepresentedAttribute(Attribute value) {
        appendDepVal(((ObjectNodeSmClass)getClassOf()).getRepresentedAttributeDep(), (SmObjectImpl)value);
    }

    @objid ("f222354b-fe75-41f8-900d-da07cb534242")
    @Override
    public State getInState() {
        Object obj = getDepVal(((ObjectNodeSmClass)getClassOf()).getInStateDep());
        return (obj instanceof State)? (State)obj : null;
    }

    @objid ("60304ad4-8c3c-4dd7-a88b-fc3dc85f8e47")
    @Override
    public void setInState(State value) {
        appendDepVal(((ObjectNodeSmClass)getClassOf()).getInStateDep(), (SmObjectImpl)value);
    }

    @objid ("4a6902b8-e32d-4890-bde3-de8937db88ff")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("4d35bd9b-e5f4-445e-a18d-12f56a9692db")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("959e5f7a-110d-4eaa-bc70-51dc1618a419")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitObjectNode(this);
        else
          return null;
    }

}
