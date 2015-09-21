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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectNodeSmClass;
import org.modelio.metamodel.impl.uml.statik.AssociationEndSmClass;
import org.modelio.metamodel.impl.uml.statik.AttributeLinkSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
import org.modelio.metamodel.impl.uml.statik.StructuralFeatureSmClass;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("2f1be0bc-d6ac-4f7e-87ff-4cf52bbe2a87")
public class AttributeSmClass extends StructuralFeatureSmClass {
    @objid ("4f36eba9-f189-4ede-8d33-d1d75244c0cd")
    private SmAttribute typeConstraintAtt;

    @objid ("a215b819-5ec0-43a4-a9c1-4e1ae79c41bb")
    private SmAttribute valueAtt;

    @objid ("93631b4d-88b5-4f69-9784-ff529392919a")
    private SmAttribute targetIsClassAtt;

    @objid ("e40fe934-d7d7-4ae2-b7e1-2c032c473f48")
    private SmDependency typeDep;

    @objid ("4927eb2c-2955-4401-a7cb-e2ac03024096")
    private SmDependency ownerDep;

    @objid ("50d0c821-65ed-40d4-be21-e16e14d4810e")
    private SmDependency occurenceDep;

    @objid ("4d5a0151-3c5a-474e-aeca-0d5c8604cff1")
    private SmDependency representingItemDep;

    @objid ("54d9ea52-c01f-4910-b793-7d922722c3fc")
    private SmDependency representingObjectNodeDep;

    @objid ("648667d3-7501-4daf-983d-c72252a137d2")
    private SmDependency qualifiedDep;

    @objid ("fa9714de-a1f3-4830-89ee-d3ca957d5b9f")
    public AttributeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("061ce7c1-e661-4af2-83df-b2f208dd85af")
    @Override
    public String getName() {
        return "Attribute";
    }

    @objid ("c8ed2382-6b58-49a7-becf-a4e823a0d9f1")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("96cc4ede-e953-4cf3-88d6-728b997589ff")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Attribute.class;
    }

    @objid ("3ca2120e-b991-488d-b5d2-f63c6b82d026")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("e793b1a3-ce39-4204-bbfe-d5d751c12ea6")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("836be6a7-1b1e-41d6-9513-56461bf80ea2")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StructuralFeature");
        this.registerFactory(new AttributeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.typeConstraintAtt = new TypeConstraintSmAttribute();
        this.typeConstraintAtt.init("TypeConstraint", this, String.class );
        registerAttribute(this.typeConstraintAtt);
        
        this.valueAtt = new ValueSmAttribute();
        this.valueAtt.init("Value", this, String.class );
        registerAttribute(this.valueAtt);
        
        this.targetIsClassAtt = new TargetIsClassSmAttribute();
        this.targetIsClassAtt.init("TargetIsClass", this, Boolean.class );
        registerAttribute(this.targetIsClassAtt);
        
        
        // Initialize and register the SmDependency
        this.typeDep = new TypeSmDependency();
        this.typeDep.init("Type", this, metamodel.getMClass("GeneralClass"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.typeDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("Classifier"), 0, 1 );
        registerDependency(this.ownerDep);
        
        this.occurenceDep = new OccurenceSmDependency();
        this.occurenceDep.init("Occurence", this, metamodel.getMClass("AttributeLink"), 0, -1 );
        registerDependency(this.occurenceDep);
        
        this.representingItemDep = new RepresentingItemSmDependency();
        this.representingItemDep.init("RepresentingItem", this, metamodel.getMClass("BpmnItemAwareElement"), 0, -1 );
        registerDependency(this.representingItemDep);
        
        this.representingObjectNodeDep = new RepresentingObjectNodeSmDependency();
        this.representingObjectNodeDep.init("RepresentingObjectNode", this, metamodel.getMClass("ObjectNode"), 0, -1 );
        registerDependency(this.representingObjectNodeDep);
        
        this.qualifiedDep = new QualifiedSmDependency();
        this.qualifiedDep.init("Qualified", this, metamodel.getMClass("AssociationEnd"), 0, 1 );
        registerDependency(this.qualifiedDep);
    }

    @objid ("6675fba6-fec0-41f2-8fbf-dc2dbc7a8d16")
    public SmAttribute getTypeConstraintAtt() {
        if (this.typeConstraintAtt == null) {
        	this.typeConstraintAtt = this.getAttributeDef("TypeConstraint");
        }
        return this.typeConstraintAtt;
    }

    @objid ("b7465f4d-daf7-489d-acc4-61606c375392")
    public SmAttribute getValueAtt() {
        if (this.valueAtt == null) {
        	this.valueAtt = this.getAttributeDef("Value");
        }
        return this.valueAtt;
    }

    @objid ("e9a86261-bc0d-4a98-bb36-05676d9fdddb")
    public SmAttribute getTargetIsClassAtt() {
        if (this.targetIsClassAtt == null) {
        	this.targetIsClassAtt = this.getAttributeDef("TargetIsClass");
        }
        return this.targetIsClassAtt;
    }

    @objid ("c0fb46ea-0bf6-49bd-a0bb-18aa065f0f72")
    public SmDependency getTypeDep() {
        if (this.typeDep == null) {
        	this.typeDep = this.getDependencyDef("Type");
        }
        return this.typeDep;
    }

    @objid ("c22d228f-1941-4683-bee7-307af6602988")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("c96a56c3-0ef9-4029-a592-637d50d721eb")
    public SmDependency getOccurenceDep() {
        if (this.occurenceDep == null) {
        	this.occurenceDep = this.getDependencyDef("Occurence");
        }
        return this.occurenceDep;
    }

    @objid ("e062e272-5e33-410a-a6e1-9bc0cd220706")
    public SmDependency getRepresentingItemDep() {
        if (this.representingItemDep == null) {
        	this.representingItemDep = this.getDependencyDef("RepresentingItem");
        }
        return this.representingItemDep;
    }

    @objid ("c72e3d1b-a9d2-426e-8914-cbf1390fcbc4")
    public SmDependency getRepresentingObjectNodeDep() {
        if (this.representingObjectNodeDep == null) {
        	this.representingObjectNodeDep = this.getDependencyDef("RepresentingObjectNode");
        }
        return this.representingObjectNodeDep;
    }

    @objid ("fd7d608f-698d-4789-9a2e-74dee4e86dc3")
    public SmDependency getQualifiedDep() {
        if (this.qualifiedDep == null) {
        	this.qualifiedDep = this.getDependencyDef("Qualified");
        }
        return this.qualifiedDep;
    }

    @objid ("cda19b6f-426f-4c3d-a376-0dff321ccb0f")
    private static class AttributeObjectFactory implements ISmObjectFactory {
        @objid ("d333a775-4c43-4606-a236-2f88886fad63")
        private AttributeSmClass smClass;

        @objid ("e90d9a84-b988-4d4f-a256-bb15e61dc6db")
        public AttributeObjectFactory(AttributeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("e0bdf641-1ee1-4165-b837-2f5814a91255")
        @Override
        public ISmObjectData createData() {
            return new AttributeData(this.smClass);
        }

        @objid ("580a587e-f640-4dbd-96c9-1670807c32a6")
        @Override
        public SmObjectImpl createImpl() {
            return new AttributeImpl();
        }

    }

    @objid ("eb037867-26bb-4525-b71d-55f98ab124b1")
    public static class TypeConstraintSmAttribute extends SmAttribute {
        @objid ("ea8a9740-a099-4bf2-9d4a-adb4122d30b7")
        public Object getValue(ISmObjectData data) {
            return ((AttributeData) data).mTypeConstraint;
        }

        @objid ("e35bc1a3-f430-4c60-870a-83380bb5e8b6")
        public void setValue(ISmObjectData data, Object value) {
            ((AttributeData) data).mTypeConstraint = value;
        }

    }

    @objid ("552511cd-95d2-49b2-8d76-950d194e8b78")
    public static class ValueSmAttribute extends SmAttribute {
        @objid ("2f2ea1e0-43af-4974-9893-9766cac185f3")
        public Object getValue(ISmObjectData data) {
            return ((AttributeData) data).mValue;
        }

        @objid ("5f93de27-7ad2-49e2-9733-da666500e3f5")
        public void setValue(ISmObjectData data, Object value) {
            ((AttributeData) data).mValue = value;
        }

    }

    @objid ("23feb51e-ca47-4754-a80c-921d454dcdc6")
    public static class TargetIsClassSmAttribute extends SmAttribute {
        @objid ("c547139d-d7e4-4a1d-82ed-e9a5fb4aae12")
        public Object getValue(ISmObjectData data) {
            return ((AttributeData) data).mTargetIsClass;
        }

        @objid ("f0ca475c-5d41-45b4-8a6a-1dcc9ec23269")
        public void setValue(ISmObjectData data, Object value) {
            ((AttributeData) data).mTargetIsClass = value;
        }

    }

    @objid ("9c1e63ae-4c81-404c-80bd-1e0d63b30cad")
    public static class TypeSmDependency extends SmSingleDependency {
        @objid ("f0e63875-126c-4252-8c72-6f0c976336d5")
        private SmDependency symetricDep;

        @objid ("84f8a2c1-23cb-438d-8b65-a9a8ced1068e")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AttributeData) data).mType;
        }

        @objid ("6145213d-c8aa-4ae7-85ad-c62adb3baf13")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AttributeData) data).mType = value;
        }

        @objid ("69aef474-3410-4e58-b985-9848e0f92b86")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GeneralClassSmClass)this.getTarget()).getObjectDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3d965a43-2951-4109-9773-74757be9dbdf")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("ab8762c2-d363-472e-bfa1-0c67d0b133b1")
        private SmDependency symetricDep;

        @objid ("19361fbd-6544-4d83-8aad-7ebe35661082")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AttributeData) data).mOwner;
        }

        @objid ("c79597c0-fe53-4a72-94e0-bcd8c4918920")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AttributeData) data).mOwner = value;
        }

        @objid ("7dff38ba-0b7f-44a5-ab35-14f3c2bc753d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassifierSmClass)this.getTarget()).getOwnedAttributeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5da73d51-e02f-4988-9493-11e486343649")
    public static class OccurenceSmDependency extends SmMultipleDependency {
        @objid ("c468f606-fb34-4ddb-8d5b-1da9654f3d79")
        private SmDependency symetricDep;

        @objid ("ea2e6fe6-6fe9-4764-9b30-1462d04ce6f0")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AttributeData)data).mOccurence != null)? ((AttributeData)data).mOccurence:SmMultipleDependency.EMPTY;
        }

        @objid ("0c95f2e6-9dba-47cf-ae6d-5aa5e07b173c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AttributeData) data).mOccurence = values;
        }

        @objid ("b4c05c37-b0ab-4f5b-9dea-94b0fff4a3ff")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AttributeLinkSmClass)this.getTarget()).getBaseDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e1767a05-e0cb-48f7-b3ae-f1715d484a0e")
    public static class RepresentingItemSmDependency extends SmMultipleDependency {
        @objid ("74404bf9-6528-4340-86a9-b99578257f8d")
        private SmDependency symetricDep;

        @objid ("6e88a0d3-9359-4252-99ec-5b9d640e8aa7")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AttributeData)data).mRepresentingItem != null)? ((AttributeData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
        }

        @objid ("07209ccc-353c-4fa8-9a05-9dfcbd2f2844")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AttributeData) data).mRepresentingItem = values;
        }

        @objid ("f2f2d76d-7d3f-4b91-af9c-2ae9d52e043e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnItemAwareElementSmClass)this.getTarget()).getRepresentedAttributeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a41dbfd1-7761-45cd-868a-7c1cf8489a92")
    public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
        @objid ("4372fa7a-71ce-4fd1-ae67-030158bfc198")
        private SmDependency symetricDep;

        @objid ("9c14a4bc-8f59-4e21-bca1-bf6aea40b214")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AttributeData)data).mRepresentingObjectNode != null)? ((AttributeData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
        }

        @objid ("fdad119b-fe06-4dab-9449-93a2625f67a4")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AttributeData) data).mRepresentingObjectNode = values;
        }

        @objid ("8908cf25-b1fd-4666-98d6-2f751edc3191")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ObjectNodeSmClass)this.getTarget()).getRepresentedAttributeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c7a75557-ff16-4270-8075-4227a0d139be")
    public static class QualifiedSmDependency extends SmSingleDependency {
        @objid ("b114617a-9373-4f64-b650-cc97a470fdeb")
        private SmDependency symetricDep;

        @objid ("88161fb0-f844-46e8-8e5e-a690cae98d56")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AttributeData) data).mQualified;
        }

        @objid ("f4629b47-6800-40df-8754-b85f900ef897")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AttributeData) data).mQualified = value;
        }

        @objid ("aa0bb59b-9376-4159-a4e7-3d745dc94073")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AssociationEndSmClass)this.getTarget()).getQualifierDep();
            }
            return this.symetricDep;
        }

    }

}
