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
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityNodeSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorParameterSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateSmClass;
import org.modelio.metamodel.impl.uml.statik.AssociationEndSmClass;
import org.modelio.metamodel.impl.uml.statik.AttributeSmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
import org.modelio.metamodel.impl.uml.statik.InstanceSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNodeOrderingKind;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("60b71769-0305-4555-b642-3fd3eccd55e4")
public class ObjectNodeSmClass extends ActivityNodeSmClass {
    @objid ("203db2e9-d09c-4ab1-92b3-d42f8ac548f9")
    private SmAttribute isControlTypeAtt;

    @objid ("6f086736-f55e-4c0b-9c63-a6de652e6b30")
    private SmAttribute orderingAtt;

    @objid ("82dfa0a0-cc05-4cb8-b5ae-bfa18cd3a786")
    private SmAttribute selectionBehaviorAtt;

    @objid ("ad517bf4-8d23-4cb1-abee-45abd115703b")
    private SmAttribute upperBoundAtt;

    @objid ("6b52e229-b4d4-46f3-9e88-bd91f430c0e7")
    private SmDependency representedDep;

    @objid ("75777632-da65-48ea-8173-0e938ffffd6e")
    private SmDependency representedRealParameterDep;

    @objid ("abd7e761-b5c0-45b7-88e1-3ac99674a573")
    private SmDependency typeDep;

    @objid ("1d3d471f-c6b6-4600-a10e-f28fa221152c")
    private SmDependency representedRoleDep;

    @objid ("060beeb0-ac63-48fb-80e9-ecfda105efcf")
    private SmDependency representedAttributeDep;

    @objid ("7fbdf3dd-3a72-4b47-9f87-f6eb59385c3b")
    private SmDependency inStateDep;

    @objid ("ac004bb3-999c-491b-8634-218e78c93ff1")
    public ObjectNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("e3c21514-7541-4146-afaf-6fa7b0e5df8c")
    @Override
    public String getName() {
        return "ObjectNode";
    }

    @objid ("ab879630-ce51-474d-92b2-dd5dac52d21f")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("dd6534c0-7853-4a73-a3bb-cee1fad16f9c")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ObjectNode.class;
    }

    @objid ("e506730f-97c0-455f-bf3f-2ecefbe30572")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("d49ca243-0aaa-4a97-b6e9-e2eb11d408c3")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("d851c64f-0aa5-416d-9e00-0e3fa0b99a62")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityNode");
        this.registerFactory(new ObjectNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isControlTypeAtt = new IsControlTypeSmAttribute();
        this.isControlTypeAtt.init("IsControlType", this, Boolean.class );
        registerAttribute(this.isControlTypeAtt);
        
        this.orderingAtt = new OrderingSmAttribute();
        this.orderingAtt.init("Ordering", this, ObjectNodeOrderingKind.class );
        registerAttribute(this.orderingAtt);
        
        this.selectionBehaviorAtt = new SelectionBehaviorSmAttribute();
        this.selectionBehaviorAtt.init("SelectionBehavior", this, String.class );
        registerAttribute(this.selectionBehaviorAtt);
        
        this.upperBoundAtt = new UpperBoundSmAttribute();
        this.upperBoundAtt.init("UpperBound", this, String.class );
        registerAttribute(this.upperBoundAtt);
        
        
        // Initialize and register the SmDependency
        this.representedDep = new RepresentedSmDependency();
        this.representedDep.init("Represented", this, metamodel.getMClass("Instance"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedDep);
        
        this.representedRealParameterDep = new RepresentedRealParameterSmDependency();
        this.representedRealParameterDep.init("RepresentedRealParameter", this, metamodel.getMClass("BehaviorParameter"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedRealParameterDep);
        
        this.typeDep = new TypeSmDependency();
        this.typeDep.init("Type", this, metamodel.getMClass("GeneralClass"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.typeDep);
        
        this.representedRoleDep = new RepresentedRoleSmDependency();
        this.representedRoleDep.init("RepresentedRole", this, metamodel.getMClass("AssociationEnd"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedRoleDep);
        
        this.representedAttributeDep = new RepresentedAttributeSmDependency();
        this.representedAttributeDep.init("RepresentedAttribute", this, metamodel.getMClass("Attribute"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedAttributeDep);
        
        this.inStateDep = new InStateSmDependency();
        this.inStateDep.init("InState", this, metamodel.getMClass("State"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.inStateDep);
    }

    @objid ("52de8e15-65d5-4172-b414-adefd8b43de2")
    public SmAttribute getIsControlTypeAtt() {
        if (this.isControlTypeAtt == null) {
        	this.isControlTypeAtt = this.getAttributeDef("IsControlType");
        }
        return this.isControlTypeAtt;
    }

    @objid ("3e7eeb94-5c5b-45c6-a16e-d24cbc1a1202")
    public SmAttribute getOrderingAtt() {
        if (this.orderingAtt == null) {
        	this.orderingAtt = this.getAttributeDef("Ordering");
        }
        return this.orderingAtt;
    }

    @objid ("b73345a1-f880-4356-936d-7dfa7b9f1234")
    public SmAttribute getSelectionBehaviorAtt() {
        if (this.selectionBehaviorAtt == null) {
        	this.selectionBehaviorAtt = this.getAttributeDef("SelectionBehavior");
        }
        return this.selectionBehaviorAtt;
    }

    @objid ("9d0c1549-dc59-45f1-8613-8a10c6923a17")
    public SmAttribute getUpperBoundAtt() {
        if (this.upperBoundAtt == null) {
        	this.upperBoundAtt = this.getAttributeDef("UpperBound");
        }
        return this.upperBoundAtt;
    }

    @objid ("7e14d5c2-a48a-4128-aa03-de74cebbde82")
    public SmDependency getRepresentedDep() {
        if (this.representedDep == null) {
        	this.representedDep = this.getDependencyDef("Represented");
        }
        return this.representedDep;
    }

    @objid ("e2ff4238-64a0-4b4f-bfa7-5295fc3ffc26")
    public SmDependency getRepresentedRealParameterDep() {
        if (this.representedRealParameterDep == null) {
        	this.representedRealParameterDep = this.getDependencyDef("RepresentedRealParameter");
        }
        return this.representedRealParameterDep;
    }

    @objid ("a64bbd2b-29b6-410b-aeb0-65fd3c3b6c23")
    public SmDependency getTypeDep() {
        if (this.typeDep == null) {
        	this.typeDep = this.getDependencyDef("Type");
        }
        return this.typeDep;
    }

    @objid ("402e8246-f443-45f4-af37-7b509f3d7d1d")
    public SmDependency getRepresentedRoleDep() {
        if (this.representedRoleDep == null) {
        	this.representedRoleDep = this.getDependencyDef("RepresentedRole");
        }
        return this.representedRoleDep;
    }

    @objid ("15d966ef-ef35-4584-92b7-15972bf3dbee")
    public SmDependency getRepresentedAttributeDep() {
        if (this.representedAttributeDep == null) {
        	this.representedAttributeDep = this.getDependencyDef("RepresentedAttribute");
        }
        return this.representedAttributeDep;
    }

    @objid ("55a1cf42-8dbd-4bb9-a603-f89631addd12")
    public SmDependency getInStateDep() {
        if (this.inStateDep == null) {
        	this.inStateDep = this.getDependencyDef("InState");
        }
        return this.inStateDep;
    }

    @objid ("a8e0897d-6c5a-4d65-b081-9e9842800cbc")
    private static class ObjectNodeObjectFactory implements ISmObjectFactory {
        @objid ("4e3817fb-f5fa-4918-a3a1-630865b12ac3")
        private ObjectNodeSmClass smClass;

        @objid ("72152724-2020-4913-b6e8-a017fc76b94f")
        public ObjectNodeObjectFactory(ObjectNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("abeca350-383e-4b4a-8f75-0a2235b599ba")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("d6fc3cba-0e81-4df9-b54a-6317a617127c")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("f2620963-00aa-4f52-be40-530a50cbc354")
    public static class IsControlTypeSmAttribute extends SmAttribute {
        @objid ("4f9455d4-dcb2-4131-8f97-ba354e0534b3")
        public Object getValue(ISmObjectData data) {
            return ((ObjectNodeData) data).mIsControlType;
        }

        @objid ("7a3e53c4-2777-4e40-8c6f-fdad2a8dfdb1")
        public void setValue(ISmObjectData data, Object value) {
            ((ObjectNodeData) data).mIsControlType = value;
        }

    }

    @objid ("e71a155a-897e-4eb7-b000-5783c5174135")
    public static class OrderingSmAttribute extends SmAttribute {
        @objid ("f75404c1-20ac-40b4-95c3-5947847a538e")
        public Object getValue(ISmObjectData data) {
            return ((ObjectNodeData) data).mOrdering;
        }

        @objid ("69cd70b8-9ef4-4d5d-8389-0cbcd37039b6")
        public void setValue(ISmObjectData data, Object value) {
            ((ObjectNodeData) data).mOrdering = value;
        }

    }

    @objid ("7ce966b4-0c8d-4fd6-b863-95b51c1ab55f")
    public static class SelectionBehaviorSmAttribute extends SmAttribute {
        @objid ("fd732883-9390-4bb8-ac5f-67ee9f414363")
        public Object getValue(ISmObjectData data) {
            return ((ObjectNodeData) data).mSelectionBehavior;
        }

        @objid ("0ee77908-210a-42c9-9437-f977cfb83f2e")
        public void setValue(ISmObjectData data, Object value) {
            ((ObjectNodeData) data).mSelectionBehavior = value;
        }

    }

    @objid ("7ace4707-134e-412e-bb25-8a569c0cc1f0")
    public static class UpperBoundSmAttribute extends SmAttribute {
        @objid ("c0138737-368c-43e1-93eb-a450fc2d01fd")
        public Object getValue(ISmObjectData data) {
            return ((ObjectNodeData) data).mUpperBound;
        }

        @objid ("945ae2bf-c4f6-4aa6-a75c-24fd29d3aa16")
        public void setValue(ISmObjectData data, Object value) {
            ((ObjectNodeData) data).mUpperBound = value;
        }

    }

    @objid ("131573b6-5e0b-4f2e-882b-bbb7c50d8f43")
    public static class RepresentedSmDependency extends SmSingleDependency {
        @objid ("763b3fc3-6e7d-446f-bd73-8ad4c81ff829")
        private SmDependency symetricDep;

        @objid ("fb4c4321-05a2-48e7-9e3d-1637ba7fe46a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ObjectNodeData) data).mRepresented;
        }

        @objid ("68bc135d-7184-4a9f-aa15-bcb52ef67f9e")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ObjectNodeData) data).mRepresented = value;
        }

        @objid ("6f4f7ece-ac5e-4242-bc9f-0298af25dcb2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InstanceSmClass)this.getTarget()).getRepresentingObjectNodeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("aacf92df-86da-447c-9010-e85422e72cc0")
    public static class RepresentedRealParameterSmDependency extends SmSingleDependency {
        @objid ("1b47b940-5b2f-4eac-922e-7db8d45c5a7d")
        private SmDependency symetricDep;

        @objid ("376504e7-9c51-4d52-8e43-dfac1bd33baa")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ObjectNodeData) data).mRepresentedRealParameter;
        }

        @objid ("2cd7c9f7-f388-489d-bc04-c44d38beced0")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ObjectNodeData) data).mRepresentedRealParameter = value;
        }

        @objid ("9cb9c82a-afad-4167-ad06-7be08c48d219")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BehaviorParameterSmClass)this.getTarget()).getRepresentingObjectNodeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("06441e71-dba3-468e-bfc5-4cd1a236ee55")
    public static class TypeSmDependency extends SmSingleDependency {
        @objid ("09262c0d-5bf4-4914-806a-0ce14036b8bb")
        private SmDependency symetricDep;

        @objid ("c410dcc9-140e-4c31-8645-ca9a77435ab0")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ObjectNodeData) data).mType;
        }

        @objid ("6059955c-0737-41d5-9da4-a3f41c8fc7b1")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ObjectNodeData) data).mType = value;
        }

        @objid ("07aa7b59-6bc7-426d-b5f5-45880dd09be5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GeneralClassSmClass)this.getTarget()).getOccurenceObjectNodeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("16db6e6f-7275-4eb3-955f-42a8a71639ce")
    public static class RepresentedRoleSmDependency extends SmSingleDependency {
        @objid ("c2534235-2cbe-4a76-ab33-6c602f19ee91")
        private SmDependency symetricDep;

        @objid ("4d137c42-d359-41d6-bd51-db4badcb2c22")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ObjectNodeData) data).mRepresentedRole;
        }

        @objid ("21f27c1a-0ffa-404e-b5b2-8dd1239a192c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ObjectNodeData) data).mRepresentedRole = value;
        }

        @objid ("266423e7-258f-40dd-a755-8495b14ced73")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AssociationEndSmClass)this.getTarget()).getRepresentingObjectNodeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f35654fe-214a-41f2-806b-e972bb975930")
    public static class RepresentedAttributeSmDependency extends SmSingleDependency {
        @objid ("c817d4b7-4707-4e14-b6d5-1e54f89c55d8")
        private SmDependency symetricDep;

        @objid ("8bb5a669-d517-4d6b-9640-eae147c5d2e2")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ObjectNodeData) data).mRepresentedAttribute;
        }

        @objid ("0df268d2-09fa-4a02-9211-9356e8b43234")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ObjectNodeData) data).mRepresentedAttribute = value;
        }

        @objid ("576e0d96-1a66-4a7f-a5d7-c0b87541fd3f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AttributeSmClass)this.getTarget()).getRepresentingObjectNodeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("902052bb-0f04-4b55-a350-7f2a7001fe87")
    public static class InStateSmDependency extends SmSingleDependency {
        @objid ("aca1f621-41f1-4646-af9f-1927a8090ec0")
        private SmDependency symetricDep;

        @objid ("64059989-ecf0-4146-ac99-ee72e224ad06")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ObjectNodeData) data).mInState;
        }

        @objid ("5bf55a99-cbd0-4098-aaee-a66eaecbcd82")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ObjectNodeData) data).mInState = value;
        }

        @objid ("d79b855d-5a9a-4de9-ac7b-d084c7da360c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateSmClass)this.getTarget()).getRequiredStateOfDep();
            }
            return this.symetricDep;
        }

    }

}
