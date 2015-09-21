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
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnParticipantSmClass;
import org.modelio.metamodel.impl.uml.informationFlow.InformationFlowSmClass;
import org.modelio.metamodel.impl.uml.informationFlow.InformationItemSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.SubstitutionSmClass;
import org.modelio.metamodel.impl.uml.statik.AssociationEndSmClass;
import org.modelio.metamodel.impl.uml.statik.AttributeSmClass;
import org.modelio.metamodel.impl.uml.statik.BindableInstanceSmClass;
import org.modelio.metamodel.impl.uml.statik.ComponentRealizationSmClass;
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryAssociationEndSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.impl.uml.statik.RaisedExceptionSmClass;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("c6d08e12-abc9-48e2-9aad-856b7d6bec01")
public class ClassifierSmClass extends NameSpaceSmClass {
    @objid ("d0065cbe-b17f-448d-899e-69b1a199e9ef")
    private SmDependency ownedOperationDep;

    @objid ("fb8ad335-2ef8-46e3-8208-16552aba599a")
    private SmDependency representationDep;

    @objid ("d008b6a7-b047-440c-9b70-5b4136ed92d7")
    private SmDependency substituedDep;

    @objid ("1fde5d85-687d-47e6-89b0-18c48d6404b9")
    private SmDependency ownedAttributeDep;

    @objid ("c93df8d6-0638-4277-a0f7-be3b31091e5a")
    private SmDependency ownedNaryEndDep;

    @objid ("75f3072a-fc98-4e28-9317-47ed5f4a475c")
    private SmDependency conveyerDep;

    @objid ("5f0622f8-406b-4e08-8ee4-c234cc0e0b97")
    private SmDependency substitutingSubstitutionDep;

    @objid ("74fe28b4-9db2-4588-99ac-f6cfe011e079")
    private SmDependency targetingEndDep;

    @objid ("7eb019c9-f39f-4a8e-9f08-1e5ab235fd1b")
    private SmDependency ownedEndDep;

    @objid ("e3806689-e7d0-4ed3-9e49-bb0adc53c1aa")
    private SmDependency bpmnRepresentsDep;

    @objid ("800f73b9-c6bf-4596-9554-7082c79e329b")
    private SmDependency throwingDep;

    @objid ("52e27c15-453e-48b7-9642-fe6749b856b5")
    private SmDependency internalStructureDep;

    @objid ("2d90eb70-476a-4837-a8f8-b9c16d3e7d70")
    private SmDependency realizedComponentDep;

    @objid ("3d560ef6-8559-4cbc-a85c-861ce71f1ea9")
    public ClassifierSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("fdb0ff58-6f14-4dc0-8d2f-905300a97df0")
    @Override
    public String getName() {
        return "Classifier";
    }

    @objid ("ccfefa96-c437-43a3-853a-e0895a2bb823")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d55048c3-bb15-42a7-8f65-4ff6df0ad275")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Classifier.class;
    }

    @objid ("eb43e126-653b-4559-91fe-aa55629f7dfe")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("08e97889-16ec-41c3-b6f9-f489a582a21c")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("4a17cc3a-f7e1-438e-a6e9-92cea54cb220")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("NameSpace");
        this.registerFactory(new ClassifierObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownedOperationDep = new OwnedOperationSmDependency();
        this.ownedOperationDep.init("OwnedOperation", this, metamodel.getMClass("Operation"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedOperationDep);
        
        this.representationDep = new RepresentationSmDependency();
        this.representationDep.init("Representation", this, metamodel.getMClass("InformationItem"), 0, -1 );
        registerDependency(this.representationDep);
        
        this.substituedDep = new SubstituedSmDependency();
        this.substituedDep.init("Substitued", this, metamodel.getMClass("Substitution"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.substituedDep);
        
        this.ownedAttributeDep = new OwnedAttributeSmDependency();
        this.ownedAttributeDep.init("OwnedAttribute", this, metamodel.getMClass("Attribute"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedAttributeDep);
        
        this.ownedNaryEndDep = new OwnedNaryEndSmDependency();
        this.ownedNaryEndDep.init("OwnedNaryEnd", this, metamodel.getMClass("NaryAssociationEnd"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedNaryEndDep);
        
        this.conveyerDep = new ConveyerSmDependency();
        this.conveyerDep.init("Conveyer", this, metamodel.getMClass("InformationFlow"), 0, -1 );
        registerDependency(this.conveyerDep);
        
        this.substitutingSubstitutionDep = new SubstitutingSubstitutionSmDependency();
        this.substitutingSubstitutionDep.init("SubstitutingSubstitution", this, metamodel.getMClass("Substitution"), 0, -1 );
        registerDependency(this.substitutingSubstitutionDep);
        
        this.targetingEndDep = new TargetingEndSmDependency();
        this.targetingEndDep.init("TargetingEnd", this, metamodel.getMClass("AssociationEnd"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.targetingEndDep);
        
        this.ownedEndDep = new OwnedEndSmDependency();
        this.ownedEndDep.init("OwnedEnd", this, metamodel.getMClass("AssociationEnd"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedEndDep);
        
        this.bpmnRepresentsDep = new BpmnRepresentsSmDependency();
        this.bpmnRepresentsDep.init("BpmnRepresents", this, metamodel.getMClass("BpmnParticipant"), 0, -1 );
        registerDependency(this.bpmnRepresentsDep);
        
        this.throwingDep = new ThrowingSmDependency();
        this.throwingDep.init("Throwing", this, metamodel.getMClass("RaisedException"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.throwingDep);
        
        this.internalStructureDep = new InternalStructureSmDependency();
        this.internalStructureDep.init("InternalStructure", this, metamodel.getMClass("BindableInstance"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.internalStructureDep);
        
        this.realizedComponentDep = new RealizedComponentSmDependency();
        this.realizedComponentDep.init("RealizedComponent", this, metamodel.getMClass("ComponentRealization"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.realizedComponentDep);
    }

    @objid ("cf2a1fa5-4d82-47f6-846c-6dbd242d266d")
    public SmDependency getOwnedOperationDep() {
        if (this.ownedOperationDep == null) {
        	this.ownedOperationDep = this.getDependencyDef("OwnedOperation");
        }
        return this.ownedOperationDep;
    }

    @objid ("93310088-3b68-41f7-a310-996c7492044e")
    public SmDependency getRepresentationDep() {
        if (this.representationDep == null) {
        	this.representationDep = this.getDependencyDef("Representation");
        }
        return this.representationDep;
    }

    @objid ("db0be282-4fb9-468f-9769-45d1bed40f4a")
    public SmDependency getSubstituedDep() {
        if (this.substituedDep == null) {
        	this.substituedDep = this.getDependencyDef("Substitued");
        }
        return this.substituedDep;
    }

    @objid ("f5a96cc6-65ed-4da3-894a-646da043b478")
    public SmDependency getOwnedAttributeDep() {
        if (this.ownedAttributeDep == null) {
        	this.ownedAttributeDep = this.getDependencyDef("OwnedAttribute");
        }
        return this.ownedAttributeDep;
    }

    @objid ("e6ed7d38-bfc6-4e8b-81fd-fc98ccc74b33")
    public SmDependency getOwnedNaryEndDep() {
        if (this.ownedNaryEndDep == null) {
        	this.ownedNaryEndDep = this.getDependencyDef("OwnedNaryEnd");
        }
        return this.ownedNaryEndDep;
    }

    @objid ("e1f9ca4a-e8a4-464e-bb1d-81e207fae461")
    public SmDependency getConveyerDep() {
        if (this.conveyerDep == null) {
        	this.conveyerDep = this.getDependencyDef("Conveyer");
        }
        return this.conveyerDep;
    }

    @objid ("a20bd95b-d4c3-444e-b3cc-d5cec7b8a790")
    public SmDependency getSubstitutingSubstitutionDep() {
        if (this.substitutingSubstitutionDep == null) {
        	this.substitutingSubstitutionDep = this.getDependencyDef("SubstitutingSubstitution");
        }
        return this.substitutingSubstitutionDep;
    }

    @objid ("d2e4c59d-5b68-4ebb-8b85-d069ed5ca14f")
    public SmDependency getTargetingEndDep() {
        if (this.targetingEndDep == null) {
        	this.targetingEndDep = this.getDependencyDef("TargetingEnd");
        }
        return this.targetingEndDep;
    }

    @objid ("8888f0e5-1899-40e3-84b3-d7a727b1b87a")
    public SmDependency getOwnedEndDep() {
        if (this.ownedEndDep == null) {
        	this.ownedEndDep = this.getDependencyDef("OwnedEnd");
        }
        return this.ownedEndDep;
    }

    @objid ("24725845-cdcf-40f0-a41f-4c359224e3a0")
    public SmDependency getBpmnRepresentsDep() {
        if (this.bpmnRepresentsDep == null) {
        	this.bpmnRepresentsDep = this.getDependencyDef("BpmnRepresents");
        }
        return this.bpmnRepresentsDep;
    }

    @objid ("bf7e1508-4141-48b5-9b24-607751996a5f")
    public SmDependency getThrowingDep() {
        if (this.throwingDep == null) {
        	this.throwingDep = this.getDependencyDef("Throwing");
        }
        return this.throwingDep;
    }

    @objid ("b0a4eefa-3422-4edf-9693-e2b3385a8b23")
    public SmDependency getInternalStructureDep() {
        if (this.internalStructureDep == null) {
        	this.internalStructureDep = this.getDependencyDef("InternalStructure");
        }
        return this.internalStructureDep;
    }

    @objid ("8548eb74-657c-421d-bdbe-b3ef54f1566c")
    public SmDependency getRealizedComponentDep() {
        if (this.realizedComponentDep == null) {
        	this.realizedComponentDep = this.getDependencyDef("RealizedComponent");
        }
        return this.realizedComponentDep;
    }

    @objid ("1dfbfd41-ea3f-4931-92c3-91b7b67b407d")
    private static class ClassifierObjectFactory implements ISmObjectFactory {
        @objid ("cb80d42a-3009-476a-9be3-b3d0bc036158")
        private ClassifierSmClass smClass;

        @objid ("d812acb2-e01b-43a2-9853-fd721f06cedf")
        public ClassifierObjectFactory(ClassifierSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("45050712-28ac-41f7-83a4-97acb19ab8d9")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("1a293fd0-2103-47f2-84a3-7450c261a846")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("2fdac9ba-387c-4a76-99fc-b7d7f980df1c")
    public static class OwnedOperationSmDependency extends SmMultipleDependency {
        @objid ("4243f36b-457a-4210-86ed-7b55a13d6d0d")
        private SmDependency symetricDep;

        @objid ("00f4fbef-4ef6-4155-8274-c00b8a3f9427")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClassifierData)data).mOwnedOperation != null)? ((ClassifierData)data).mOwnedOperation:SmMultipleDependency.EMPTY;
        }

        @objid ("e1ecd77d-9d5a-4190-855f-9a03c09cce28")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClassifierData) data).mOwnedOperation = values;
        }

        @objid ("dd1a373e-d54d-410d-97ac-df5bdf71c717")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("20db6bcb-06e4-48ff-a307-5fc4ab0c3970")
    public static class RepresentationSmDependency extends SmMultipleDependency {
        @objid ("2dd53533-fe05-48b7-982f-12988d46d18e")
        private SmDependency symetricDep;

        @objid ("85e80130-92fe-4abe-b74f-e007ab63ace6")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClassifierData)data).mRepresentation != null)? ((ClassifierData)data).mRepresentation:SmMultipleDependency.EMPTY;
        }

        @objid ("d64cc7a0-78ed-434b-94b6-b9fc6fa461eb")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClassifierData) data).mRepresentation = values;
        }

        @objid ("0577503d-0359-4cdf-999e-c6ce6bb87f29")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InformationItemSmClass)this.getTarget()).getRepresentedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9daced8d-33cc-4869-8c82-6aa1cb3cf980")
    public static class SubstituedSmDependency extends SmMultipleDependency {
        @objid ("c6534618-1909-4cd3-a616-2d49e0c92c5d")
        private SmDependency symetricDep;

        @objid ("c32b3799-97b5-47f9-95e9-d62c87d6a0b8")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClassifierData)data).mSubstitued != null)? ((ClassifierData)data).mSubstitued:SmMultipleDependency.EMPTY;
        }

        @objid ("a1a108ff-56f5-4d8a-bd3f-fb7575652ff4")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClassifierData) data).mSubstitued = values;
        }

        @objid ("c09fcb8d-95d4-4729-b922-d798bc464ec4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((SubstitutionSmClass)this.getTarget()).getSubstitutingClassifierDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5e878024-3ee8-4daa-9916-14ac9760a06a")
    public static class OwnedAttributeSmDependency extends SmMultipleDependency {
        @objid ("5f15f2c0-c9da-4b6c-a1de-bf4c56a6951d")
        private SmDependency symetricDep;

        @objid ("a05c564b-f6d7-4eb3-a981-70ec9eed1fe5")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClassifierData)data).mOwnedAttribute != null)? ((ClassifierData)data).mOwnedAttribute:SmMultipleDependency.EMPTY;
        }

        @objid ("7a3c05d7-af56-4b93-af25-2cfd4033197a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClassifierData) data).mOwnedAttribute = values;
        }

        @objid ("87dafadf-f6d4-4006-8320-c2d2ad8639fc")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AttributeSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9e46f5f2-7335-4bd9-9505-9892d86912ea")
    public static class OwnedNaryEndSmDependency extends SmMultipleDependency {
        @objid ("802383cc-3908-4672-b034-effe2a1191bd")
        private SmDependency symetricDep;

        @objid ("84f9a2ac-3108-48a4-9b79-c2f784388102")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClassifierData)data).mOwnedNaryEnd != null)? ((ClassifierData)data).mOwnedNaryEnd:SmMultipleDependency.EMPTY;
        }

        @objid ("52c289fd-aff0-4c97-99f5-9f10b477a5ae")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClassifierData) data).mOwnedNaryEnd = values;
        }

        @objid ("d776fd75-fd57-4a0a-a6ff-55f8a500f283")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryAssociationEndSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4f852fe4-b53c-4883-a820-7569f41e1b8b")
    public static class ConveyerSmDependency extends SmMultipleDependency {
        @objid ("87a7693f-7bfb-43f2-a474-f4a17169974a")
        private SmDependency symetricDep;

        @objid ("8f5384da-997d-40ce-b8bf-2f494c784cc1")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClassifierData)data).mConveyer != null)? ((ClassifierData)data).mConveyer:SmMultipleDependency.EMPTY;
        }

        @objid ("2a9edadc-8781-4fb4-bc23-3ced1538590d")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClassifierData) data).mConveyer = values;
        }

        @objid ("9557f53e-7d9c-40e2-a3f0-d0fa362df0b7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InformationFlowSmClass)this.getTarget()).getConveyedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ad611277-cac2-46ad-8f44-144c9e6b8611")
    public static class SubstitutingSubstitutionSmDependency extends SmMultipleDependency {
        @objid ("90de2d47-0396-49e8-9d5f-972aa958401d")
        private SmDependency symetricDep;

        @objid ("55e0b6d3-233a-4ce7-a895-22e00c4dac8a")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClassifierData)data).mSubstitutingSubstitution != null)? ((ClassifierData)data).mSubstitutingSubstitution:SmMultipleDependency.EMPTY;
        }

        @objid ("79cebc04-48d2-4d79-94bd-350e2d0b5c7b")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClassifierData) data).mSubstitutingSubstitution = values;
        }

        @objid ("83ac6d00-8806-4a99-900f-287c69a4d3ad")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((SubstitutionSmClass)this.getTarget()).getContractDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e90453df-ce5f-47d4-83db-11ffb0c9f7a4")
    public static class TargetingEndSmDependency extends SmMultipleDependency {
        @objid ("2d9a774a-7d31-42c8-8fae-b5f7712e2c1d")
        private SmDependency symetricDep;

        @objid ("a5797722-a491-41ad-9f40-e756da023715")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClassifierData)data).mTargetingEnd != null)? ((ClassifierData)data).mTargetingEnd:SmMultipleDependency.EMPTY;
        }

        @objid ("9fc97eaf-abea-4d50-99c7-2d82f37549ac")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClassifierData) data).mTargetingEnd = values;
        }

        @objid ("84270853-2c4b-436b-a73d-7b92f13a44f1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AssociationEndSmClass)this.getTarget()).getTargetDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d7680ca5-f83c-4f8e-9f67-cf0db1136ada")
    public static class OwnedEndSmDependency extends SmMultipleDependency {
        @objid ("d676e268-25e7-44d4-ba47-3b938983a7b4")
        private SmDependency symetricDep;

        @objid ("58edd927-21ee-4cce-bdcb-3af5b79af303")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClassifierData)data).mOwnedEnd != null)? ((ClassifierData)data).mOwnedEnd:SmMultipleDependency.EMPTY;
        }

        @objid ("28f0b779-05f2-4acd-b062-d0aa5d355d7a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClassifierData) data).mOwnedEnd = values;
        }

        @objid ("4e420eb0-28e0-4bbe-8f4c-46e722c966ea")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AssociationEndSmClass)this.getTarget()).getSourceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("230a167e-3501-4380-af30-d3c697aae1a8")
    public static class BpmnRepresentsSmDependency extends SmMultipleDependency {
        @objid ("d2682d00-e72a-44d8-a401-74f0d21fd09a")
        private SmDependency symetricDep;

        @objid ("c9b05d3b-f0a9-493f-96f3-5b174e9c9577")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClassifierData)data).mBpmnRepresents != null)? ((ClassifierData)data).mBpmnRepresents:SmMultipleDependency.EMPTY;
        }

        @objid ("47edcb31-88bb-4771-a716-3444cc885e44")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClassifierData) data).mBpmnRepresents = values;
        }

        @objid ("5ca98d13-bf1e-4137-9a2d-0c3ac149bfab")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnParticipantSmClass)this.getTarget()).getTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7204d42e-e3fd-4119-a5b8-17d503f15dc1")
    public static class ThrowingSmDependency extends SmMultipleDependency {
        @objid ("bcee5904-a011-4df4-8dcb-61f874eb2ac9")
        private SmDependency symetricDep;

        @objid ("31fd4b31-f170-4cba-a7f6-795d6318911c")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClassifierData)data).mThrowing != null)? ((ClassifierData)data).mThrowing:SmMultipleDependency.EMPTY;
        }

        @objid ("8b31a10d-da06-4830-bdad-71de8aad2154")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClassifierData) data).mThrowing = values;
        }

        @objid ("1ab357cd-57b0-4e10-a49a-6854b4461b68")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RaisedExceptionSmClass)this.getTarget()).getThrownTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5fba34b5-3bdc-48c5-8feb-2d5b5ce7ad3e")
    public static class InternalStructureSmDependency extends SmMultipleDependency {
        @objid ("a980394b-0a96-499d-b0f4-4fbd7a6b9146")
        private SmDependency symetricDep;

        @objid ("fbaa4012-163c-4a82-a114-0c22da552c2b")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClassifierData)data).mInternalStructure != null)? ((ClassifierData)data).mInternalStructure:SmMultipleDependency.EMPTY;
        }

        @objid ("f86178f7-170c-49dd-95c8-99542906d5ff")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClassifierData) data).mInternalStructure = values;
        }

        @objid ("694c7035-7aa1-4644-bba6-377cbe5a340b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BindableInstanceSmClass)this.getTarget()).getInternalOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a9d4bc73-2455-4bf9-8f9d-5062de8fbdef")
    public static class RealizedComponentSmDependency extends SmMultipleDependency {
        @objid ("551781ab-c60c-4472-8f86-5fa9a8bfca33")
        private SmDependency symetricDep;

        @objid ("255df3cc-53e9-47d6-b7dc-0f4394b03466")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClassifierData)data).mRealizedComponent != null)? ((ClassifierData)data).mRealizedComponent:SmMultipleDependency.EMPTY;
        }

        @objid ("aa8169a3-aa20-4757-a358-52ec457a567e")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClassifierData) data).mRealizedComponent = values;
        }

        @objid ("9c66ec27-f061-42d8-936b-319833d6515d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ComponentRealizationSmClass)this.getTarget()).getRealizingClassifierDep();
            }
            return this.symetricDep;
        }

    }

}
