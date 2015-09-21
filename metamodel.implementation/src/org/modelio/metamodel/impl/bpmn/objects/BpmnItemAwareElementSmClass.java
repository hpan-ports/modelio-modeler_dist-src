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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataAssociationSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataStateSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemDefinitionSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateSmClass;
import org.modelio.metamodel.impl.uml.statik.AssociationEndSmClass;
import org.modelio.metamodel.impl.uml.statik.AttributeSmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
import org.modelio.metamodel.impl.uml.statik.InstanceSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("9d09d883-ae4e-4654-8809-ad2a3437581b")
public class BpmnItemAwareElementSmClass extends BpmnFlowElementSmClass {
    @objid ("f2c8e887-5777-4d92-baee-b7bfa08afc71")
    private SmDependency typeDep;

    @objid ("bf52d53e-5631-4ff6-ade6-8f9133424ae1")
    private SmDependency targetOfDataAssociationDep;

    @objid ("bac2b27f-06eb-4ba6-bf06-c7a70dfa2e60")
    private SmDependency itemSubjectRefDep;

    @objid ("8a24a998-c964-4790-86a3-7a7a956c588e")
    private SmDependency inStateDep;

    @objid ("618f0c0b-ca40-47c1-8732-720477d2d570")
    private SmDependency representedAssociationEndDep;

    @objid ("94376647-67bf-4da5-9a91-3ba1634e5e24")
    private SmDependency dataStateDep;

    @objid ("5741a479-5922-4371-8dfd-235da3b8e4e8")
    private SmDependency sourceOfDataAssociationDep;

    @objid ("5e415b91-78d7-4c4e-acde-13cd8ecf9b7a")
    private SmDependency representedAttributeDep;

    @objid ("44b1e0a1-ecb7-4a3f-9e1f-5b8efb943dc5")
    private SmDependency representedInstanceDep;

    @objid ("be96bc57-6ffa-45a7-b4aa-61709fa977ca")
    public BpmnItemAwareElementSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("3f9f97b2-56e3-47f4-b5ed-1b9f370d936b")
    @Override
    public String getName() {
        return "BpmnItemAwareElement";
    }

    @objid ("4494afc4-521d-4f78-b592-38c2b9ac1d5c")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("f72ae3db-57c4-4a8f-a705-1b44bfa47641")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnItemAwareElement.class;
    }

    @objid ("469e242f-db6f-4417-a910-90b3e0a718ea")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("77b7ff5c-67ba-45d3-8ea8-ccd0285ed7ca")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("e0244acb-924a-4b55-93a3-a1ccd9ac7f4d")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnFlowElement");
        this.registerFactory(new BpmnItemAwareElementObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.typeDep = new TypeSmDependency();
        this.typeDep.init("Type", this, metamodel.getMClass("GeneralClass"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.typeDep);
        
        this.targetOfDataAssociationDep = new TargetOfDataAssociationSmDependency();
        this.targetOfDataAssociationDep.init("TargetOfDataAssociation", this, metamodel.getMClass("BpmnDataAssociation"), 0, -1 );
        registerDependency(this.targetOfDataAssociationDep);
        
        this.itemSubjectRefDep = new ItemSubjectRefSmDependency();
        this.itemSubjectRefDep.init("ItemSubjectRef", this, metamodel.getMClass("BpmnItemDefinition"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.itemSubjectRefDep);
        
        this.inStateDep = new InStateSmDependency();
        this.inStateDep.init("InState", this, metamodel.getMClass("State"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.inStateDep);
        
        this.representedAssociationEndDep = new RepresentedAssociationEndSmDependency();
        this.representedAssociationEndDep.init("RepresentedAssociationEnd", this, metamodel.getMClass("AssociationEnd"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedAssociationEndDep);
        
        this.dataStateDep = new DataStateSmDependency();
        this.dataStateDep.init("DataState", this, metamodel.getMClass("BpmnDataState"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.dataStateDep);
        
        this.sourceOfDataAssociationDep = new SourceOfDataAssociationSmDependency();
        this.sourceOfDataAssociationDep.init("SourceOfDataAssociation", this, metamodel.getMClass("BpmnDataAssociation"), 0, -1 );
        registerDependency(this.sourceOfDataAssociationDep);
        
        this.representedAttributeDep = new RepresentedAttributeSmDependency();
        this.representedAttributeDep.init("RepresentedAttribute", this, metamodel.getMClass("Attribute"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedAttributeDep);
        
        this.representedInstanceDep = new RepresentedInstanceSmDependency();
        this.representedInstanceDep.init("RepresentedInstance", this, metamodel.getMClass("Instance"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedInstanceDep);
    }

    @objid ("72b64d26-9f3f-42ab-bfd7-0f5b97bff89b")
    public SmDependency getTypeDep() {
        if (this.typeDep == null) {
        	this.typeDep = this.getDependencyDef("Type");
        }
        return this.typeDep;
    }

    @objid ("af566a94-81d3-4308-96f7-9792f350b8a6")
    public SmDependency getTargetOfDataAssociationDep() {
        if (this.targetOfDataAssociationDep == null) {
        	this.targetOfDataAssociationDep = this.getDependencyDef("TargetOfDataAssociation");
        }
        return this.targetOfDataAssociationDep;
    }

    @objid ("dbd7e61d-2d84-4937-a8b1-f7902cc5fd36")
    public SmDependency getItemSubjectRefDep() {
        if (this.itemSubjectRefDep == null) {
        	this.itemSubjectRefDep = this.getDependencyDef("ItemSubjectRef");
        }
        return this.itemSubjectRefDep;
    }

    @objid ("3e17f69f-8f3c-4541-a03c-5d2569cef921")
    public SmDependency getInStateDep() {
        if (this.inStateDep == null) {
        	this.inStateDep = this.getDependencyDef("InState");
        }
        return this.inStateDep;
    }

    @objid ("d4e44b62-dce9-48c4-8e11-f01f9963fe52")
    public SmDependency getRepresentedAssociationEndDep() {
        if (this.representedAssociationEndDep == null) {
        	this.representedAssociationEndDep = this.getDependencyDef("RepresentedAssociationEnd");
        }
        return this.representedAssociationEndDep;
    }

    @objid ("f0497318-98b2-4929-b0cb-3ab1917532b7")
    public SmDependency getDataStateDep() {
        if (this.dataStateDep == null) {
        	this.dataStateDep = this.getDependencyDef("DataState");
        }
        return this.dataStateDep;
    }

    @objid ("83e5d17e-6b26-4a23-b05e-6ec0577f8b29")
    public SmDependency getSourceOfDataAssociationDep() {
        if (this.sourceOfDataAssociationDep == null) {
        	this.sourceOfDataAssociationDep = this.getDependencyDef("SourceOfDataAssociation");
        }
        return this.sourceOfDataAssociationDep;
    }

    @objid ("6f3942cd-5fb5-4b08-9d40-ea4cae986ad8")
    public SmDependency getRepresentedAttributeDep() {
        if (this.representedAttributeDep == null) {
        	this.representedAttributeDep = this.getDependencyDef("RepresentedAttribute");
        }
        return this.representedAttributeDep;
    }

    @objid ("8a6e1df1-444b-4107-8c76-b34e56b8401e")
    public SmDependency getRepresentedInstanceDep() {
        if (this.representedInstanceDep == null) {
        	this.representedInstanceDep = this.getDependencyDef("RepresentedInstance");
        }
        return this.representedInstanceDep;
    }

    @objid ("f8520534-1cee-4746-9f90-2870a40c4d85")
    private static class BpmnItemAwareElementObjectFactory implements ISmObjectFactory {
        @objid ("b59b3c80-a559-437c-b835-05b4cc365794")
        private BpmnItemAwareElementSmClass smClass;

        @objid ("22da2f30-4863-43df-bb54-02814c8d1056")
        public BpmnItemAwareElementObjectFactory(BpmnItemAwareElementSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("458e95d4-e633-42ab-9038-abc7a072e8af")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("32ff34f2-0027-4812-abc9-aa2e01d77d49")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("1de3d376-8317-4833-a5b1-f61b552d03c1")
    public static class TypeSmDependency extends SmSingleDependency {
        @objid ("5f46d500-a100-464b-abcc-d90bb494a87c")
        private SmDependency symetricDep;

        @objid ("0584600d-125c-44b8-a17a-06e1da4225d4")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnItemAwareElementData) data).mType;
        }

        @objid ("cd331725-40fd-426c-99a9-05205d07ded6")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnItemAwareElementData) data).mType = value;
        }

        @objid ("11e76316-2f05-4b33-b48b-ffb8e13dee35")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GeneralClassSmClass)this.getTarget()).getBpmnItemAwareRefsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("59c8efb7-c66d-44a6-8c94-f78876a7b745")
    public static class TargetOfDataAssociationSmDependency extends SmMultipleDependency {
        @objid ("c49bf521-2dc9-44e0-8030-e90a58206a90")
        private SmDependency symetricDep;

        @objid ("3119b475-54fb-41e1-932e-fb2b62caf489")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnItemAwareElementData)data).mTargetOfDataAssociation != null)? ((BpmnItemAwareElementData)data).mTargetOfDataAssociation:SmMultipleDependency.EMPTY;
        }

        @objid ("56869b09-adc9-4400-998c-adf95f4368e0")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnItemAwareElementData) data).mTargetOfDataAssociation = values;
        }

        @objid ("50245357-b71d-4976-9e4f-4f7f9beba3da")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataAssociationSmClass)this.getTarget()).getTargetRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("20a28bc9-bd96-4b3b-a68c-ca6d623cd30f")
    public static class ItemSubjectRefSmDependency extends SmSingleDependency {
        @objid ("10b79dbb-88ef-468c-8c9e-7a4f8fee3043")
        private SmDependency symetricDep;

        @objid ("5831b718-79b6-47b2-9e00-2ba988066753")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnItemAwareElementData) data).mItemSubjectRef;
        }

        @objid ("f9a98323-dd08-4150-8b2a-f134454a8298")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnItemAwareElementData) data).mItemSubjectRef = value;
        }

        @objid ("402923d4-c91a-479c-ac7e-2fd0f05943bb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnItemDefinitionSmClass)this.getTarget()).getTypedItemDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("836d87e5-988c-49b5-b852-80eba3dcd70b")
    public static class InStateSmDependency extends SmSingleDependency {
        @objid ("bd9a31d3-0a4d-46df-a814-02f1e0005357")
        private SmDependency symetricDep;

        @objid ("67fe9f28-1b66-4e5a-955d-0298f5c8ffec")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnItemAwareElementData) data).mInState;
        }

        @objid ("3931beec-6b1c-44ce-960f-b92dcbbef117")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnItemAwareElementData) data).mInState = value;
        }

        @objid ("5fe29935-681d-4e92-8017-ed165b3e0d15")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateSmClass)this.getTarget()).getRequiredStateOfBpmnItemDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6ff8d619-e850-4249-9872-96352acfbb47")
    public static class RepresentedAssociationEndSmDependency extends SmSingleDependency {
        @objid ("f2916027-c598-4b5f-b1f9-613fa3e7e439")
        private SmDependency symetricDep;

        @objid ("7b7ea624-b29a-49d5-b7db-cfc03d328db7")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnItemAwareElementData) data).mRepresentedAssociationEnd;
        }

        @objid ("d5c85a58-fa11-4f74-8a0f-cf2b2d346412")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnItemAwareElementData) data).mRepresentedAssociationEnd = value;
        }

        @objid ("caef859f-4182-4273-aef0-2e61beb05c50")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AssociationEndSmClass)this.getTarget()).getRepresentingItemDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e17b1f65-75e1-4f3c-8e0e-1d05cce5603c")
    public static class DataStateSmDependency extends SmSingleDependency {
        @objid ("03fb0e7e-d6f7-42ff-9a84-93c8b72525f3")
        private SmDependency symetricDep;

        @objid ("df67ef0d-a7bd-4283-bb89-98dd2ab573e2")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnItemAwareElementData) data).mDataState;
        }

        @objid ("3e614641-994b-469d-8544-33eb62f160f6")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnItemAwareElementData) data).mDataState = value;
        }

        @objid ("0cffb17b-a166-48bb-bd2f-37df40e8017f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataStateSmClass)this.getTarget()).getItemDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("87e98d2a-5763-4ec0-a5ac-42204af047d6")
    public static class SourceOfDataAssociationSmDependency extends SmMultipleDependency {
        @objid ("a97c24ee-0c4f-4420-9edc-b454ae0d631f")
        private SmDependency symetricDep;

        @objid ("7cafaf9a-794d-4ce1-82a7-0cd1d612bcd7")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnItemAwareElementData)data).mSourceOfDataAssociation != null)? ((BpmnItemAwareElementData)data).mSourceOfDataAssociation:SmMultipleDependency.EMPTY;
        }

        @objid ("81dc261b-1e92-4b98-83bb-3f2420e9cbd9")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnItemAwareElementData) data).mSourceOfDataAssociation = values;
        }

        @objid ("9a432f47-7f50-4757-b864-554e9db7bb30")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataAssociationSmClass)this.getTarget()).getSourceRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("27fede62-1908-4902-929c-239c9af1bb9c")
    public static class RepresentedAttributeSmDependency extends SmSingleDependency {
        @objid ("77d25705-f3d2-4185-8bac-f1e4e1087f2a")
        private SmDependency symetricDep;

        @objid ("0f1d2021-ef4a-481b-ba2b-d031cdfc872e")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnItemAwareElementData) data).mRepresentedAttribute;
        }

        @objid ("f7e0cab9-22b9-443a-b7df-b1f84faef88a")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnItemAwareElementData) data).mRepresentedAttribute = value;
        }

        @objid ("ef5e53ce-47e8-43a4-b25d-980e39da2cec")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AttributeSmClass)this.getTarget()).getRepresentingItemDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("84d83685-dfaa-4072-af0c-0ed2719a97e3")
    public static class RepresentedInstanceSmDependency extends SmSingleDependency {
        @objid ("962dc9f0-3bca-491b-9920-2a00b7ebf015")
        private SmDependency symetricDep;

        @objid ("79d966b3-869a-44e6-8aed-739ed6e62e4c")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnItemAwareElementData) data).mRepresentedInstance;
        }

        @objid ("bfc1ba23-d1a3-4790-9b5f-f4be7b7493f7")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnItemAwareElementData) data).mRepresentedInstance = value;
        }

        @objid ("3d539bc9-6ef6-4db0-957a-d5b1b30306c0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InstanceSmClass)this.getTarget()).getRepresentingItemDep();
            }
            return this.symetricDep;
        }

    }

}
