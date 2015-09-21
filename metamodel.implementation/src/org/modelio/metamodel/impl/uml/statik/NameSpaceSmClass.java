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
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.metamodel.impl.uml.informationFlow.DataFlowSmClass;
import org.modelio.metamodel.impl.uml.informationFlow.InformationFlowSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelTreeSmClass;
import org.modelio.metamodel.impl.uml.statik.CollaborationUseSmClass;
import org.modelio.metamodel.impl.uml.statik.ElementImportSmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralizationSmClass;
import org.modelio.metamodel.impl.uml.statik.InstanceSmClass;
import org.modelio.metamodel.impl.uml.statik.InterfaceRealizationSmClass;
import org.modelio.metamodel.impl.uml.statik.NamespaceUseSmClass;
import org.modelio.metamodel.impl.uml.statik.PackageImportSmClass;
import org.modelio.metamodel.impl.uml.statik.TemplateBindingSmClass;
import org.modelio.metamodel.impl.uml.statik.TemplateParameterSmClass;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.VisibilityMode;
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
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("13b9e8d9-1cce-4eb0-886d-3ddd04faefcc")
public class NameSpaceSmClass extends ModelTreeSmClass {
    @objid ("c985f320-3dd9-495c-a14b-26e05ac57f74")
    private SmAttribute isAbstractAtt;

    @objid ("0e10f6a6-a864-4742-bbdf-8ce601edb444")
    private SmAttribute isLeafAtt;

    @objid ("d61a34cb-b32d-4820-b8bb-2e789431243d")
    private SmAttribute isRootAtt;

    @objid ("8d1e3aa3-6bff-481f-a5b5-27841938de3a")
    private SmAttribute visibilityAtt;

    @objid ("07fe6a25-c267-4ffa-af82-ea5934899b66")
    private SmDependency parentDep;

    @objid ("25531f18-cd34-4539-b10b-88e8c92c64e9")
    private SmDependency templateInstanciationDep;

    @objid ("889e6c91-4dbe-4432-b2ed-10c51188fe8f")
    private SmDependency representingDep;

    @objid ("d54cb721-0602-4d65-8d43-1e6f1f09388c")
    private SmDependency ownedBehaviorDep;

    @objid ("dcca38e3-ef91-455b-850d-ddbbc98361a5")
    private SmDependency receivedDep;

    @objid ("dc5d606f-26f3-4fcb-b174-08fe6ad981ce")
    private SmDependency usedNsuDep;

    @objid ("6a1f54be-842a-46ef-9f10-72bf3352a2d9")
    private SmDependency ownedInformationFlowDep;

    @objid ("e75b19f9-b5e6-4190-9adc-8dfa3f3f8f4a")
    private SmDependency importingDep;

    @objid ("33011d43-4ac8-4bc3-b9e5-60ea9114a31a")
    private SmDependency sentDep;

    @objid ("9b7f043a-8375-459f-9dff-42414a394132")
    private SmDependency ownedDataFlowDep;

    @objid ("9e829d2f-cbc2-4324-a1f9-b5afb4ef9870")
    private SmDependency ownedCollaborationUseDep;

    @objid ("0c3c1031-d65d-4552-bb15-cef3bbd948fd")
    private SmDependency ownedPackageImportDep;

    @objid ("8e5b13c9-c407-445a-854e-31bf37b37e54")
    private SmDependency templateDep;

    @objid ("84718f1f-61c2-4f78-9731-5407e9b70b65")
    private SmDependency specializationDep;

    @objid ("511a4d95-8e17-4138-8955-c2a92a8da05f")
    private SmDependency realizedDep;

    @objid ("414c9606-6a1b-4719-9c72-b0a17c90e2dc")
    private SmDependency declaredDep;

    @objid ("d25b4e99-c6df-479f-960a-dbb1ceb95ca8")
    private SmDependency instanciatingBindingDep;

    @objid ("a68855eb-7d18-47d6-b783-8a5dbdf4b17a")
    private SmDependency ownedImportDep;

    @objid ("38d1d4ff-ad0e-4e6d-97fc-b494a7f9a1aa")
    private SmDependency userNsuDep;

    @objid ("d622c0ef-2490-491f-aafb-031797be0666")
    public NameSpaceSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("dee53793-0f95-4218-ad13-47bf845a4c5d")
    @Override
    public String getName() {
        return "NameSpace";
    }

    @objid ("c73ae020-f5a4-4e5e-8005-1d98eb501304")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("536aa7ed-591b-4bfc-bf03-4bc8a22bdbf7")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return NameSpace.class;
    }

    @objid ("af46ccef-2e25-4bcd-aaef-1169b2635367")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("77a01582-213f-45ee-bdd0-d2abc04ab18d")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("a5507577-ec45-4ee2-8ab1-8984dbe144f6")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelTree");
        this.registerFactory(new NameSpaceObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isAbstractAtt = new IsAbstractSmAttribute();
        this.isAbstractAtt.init("IsAbstract", this, Boolean.class );
        registerAttribute(this.isAbstractAtt);
        
        this.isLeafAtt = new IsLeafSmAttribute();
        this.isLeafAtt.init("IsLeaf", this, Boolean.class );
        registerAttribute(this.isLeafAtt);
        
        this.isRootAtt = new IsRootSmAttribute();
        this.isRootAtt.init("IsRoot", this, Boolean.class );
        registerAttribute(this.isRootAtt);
        
        this.visibilityAtt = new VisibilitySmAttribute();
        this.visibilityAtt.init("Visibility", this, VisibilityMode.class );
        registerAttribute(this.visibilityAtt);
        
        
        // Initialize and register the SmDependency
        this.parentDep = new ParentSmDependency();
        this.parentDep.init("Parent", this, metamodel.getMClass("Generalization"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.parentDep);
        
        this.templateInstanciationDep = new TemplateInstanciationSmDependency();
        this.templateInstanciationDep.init("TemplateInstanciation", this, metamodel.getMClass("TemplateBinding"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.templateInstanciationDep);
        
        this.representingDep = new RepresentingSmDependency();
        this.representingDep.init("Representing", this, metamodel.getMClass("Instance"), 0, -1 , SmDirective.SMCDDYNAMIC);
        registerDependency(this.representingDep);
        
        this.ownedBehaviorDep = new OwnedBehaviorSmDependency();
        this.ownedBehaviorDep.init("OwnedBehavior", this, metamodel.getMClass("Behavior"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedBehaviorDep);
        
        this.receivedDep = new ReceivedSmDependency();
        this.receivedDep.init("Received", this, metamodel.getMClass("DataFlow"), 0, -1 , SmDirective.SMCDDYNAMIC);
        registerDependency(this.receivedDep);
        
        this.usedNsuDep = new UsedNsuSmDependency();
        this.usedNsuDep.init("UsedNsu", this, metamodel.getMClass("NamespaceUse"), 0, -1 );
        registerDependency(this.usedNsuDep);
        
        this.ownedInformationFlowDep = new OwnedInformationFlowSmDependency();
        this.ownedInformationFlowDep.init("OwnedInformationFlow", this, metamodel.getMClass("InformationFlow"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedInformationFlowDep);
        
        this.importingDep = new ImportingSmDependency();
        this.importingDep.init("Importing", this, metamodel.getMClass("ElementImport"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.importingDep);
        
        this.sentDep = new SentSmDependency();
        this.sentDep.init("Sent", this, metamodel.getMClass("DataFlow"), 0, -1 , SmDirective.SMCDPARTOF, SmDirective.SMCDTODELETE);
        registerDependency(this.sentDep);
        
        this.ownedDataFlowDep = new OwnedDataFlowSmDependency();
        this.ownedDataFlowDep.init("OwnedDataFlow", this, metamodel.getMClass("DataFlow"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedDataFlowDep);
        
        this.ownedCollaborationUseDep = new OwnedCollaborationUseSmDependency();
        this.ownedCollaborationUseDep.init("OwnedCollaborationUse", this, metamodel.getMClass("CollaborationUse"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedCollaborationUseDep);
        
        this.ownedPackageImportDep = new OwnedPackageImportSmDependency();
        this.ownedPackageImportDep.init("OwnedPackageImport", this, metamodel.getMClass("PackageImport"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedPackageImportDep);
        
        this.templateDep = new TemplateSmDependency();
        this.templateDep.init("Template", this, metamodel.getMClass("TemplateParameter"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.templateDep);
        
        this.specializationDep = new SpecializationSmDependency();
        this.specializationDep.init("Specialization", this, metamodel.getMClass("Generalization"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.specializationDep);
        
        this.realizedDep = new RealizedSmDependency();
        this.realizedDep.init("Realized", this, metamodel.getMClass("InterfaceRealization"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.realizedDep);
        
        this.declaredDep = new DeclaredSmDependency();
        this.declaredDep.init("Declared", this, metamodel.getMClass("Instance"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.declaredDep);
        
        this.instanciatingBindingDep = new InstanciatingBindingSmDependency();
        this.instanciatingBindingDep.init("InstanciatingBinding", this, metamodel.getMClass("TemplateBinding"), 0, -1 , SmDirective.SMCDDYNAMIC);
        registerDependency(this.instanciatingBindingDep);
        
        this.ownedImportDep = new OwnedImportSmDependency();
        this.ownedImportDep.init("OwnedImport", this, metamodel.getMClass("ElementImport"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedImportDep);
        
        this.userNsuDep = new UserNsuSmDependency();
        this.userNsuDep.init("UserNsu", this, metamodel.getMClass("NamespaceUse"), 0, -1 );
        registerDependency(this.userNsuDep);
    }

    @objid ("d9e40474-51e8-4fc2-8f06-3fcf956b55e8")
    public SmAttribute getIsAbstractAtt() {
        if (this.isAbstractAtt == null) {
        	this.isAbstractAtt = this.getAttributeDef("IsAbstract");
        }
        return this.isAbstractAtt;
    }

    @objid ("16030285-97f5-410a-96bc-8af21301f1a2")
    public SmAttribute getIsLeafAtt() {
        if (this.isLeafAtt == null) {
        	this.isLeafAtt = this.getAttributeDef("IsLeaf");
        }
        return this.isLeafAtt;
    }

    @objid ("6732b2d3-5a14-4432-97af-4eec6357485f")
    public SmAttribute getIsRootAtt() {
        if (this.isRootAtt == null) {
        	this.isRootAtt = this.getAttributeDef("IsRoot");
        }
        return this.isRootAtt;
    }

    @objid ("524acc77-b0e2-4d23-a1e9-6800cb2194ca")
    public SmAttribute getVisibilityAtt() {
        if (this.visibilityAtt == null) {
        	this.visibilityAtt = this.getAttributeDef("Visibility");
        }
        return this.visibilityAtt;
    }

    @objid ("b9a1dc9b-2bf5-415d-9fca-b2feddfa8bd2")
    public SmDependency getParentDep() {
        if (this.parentDep == null) {
        	this.parentDep = this.getDependencyDef("Parent");
        }
        return this.parentDep;
    }

    @objid ("b8b9a862-6228-4dec-a318-5752b6603c2a")
    public SmDependency getTemplateInstanciationDep() {
        if (this.templateInstanciationDep == null) {
        	this.templateInstanciationDep = this.getDependencyDef("TemplateInstanciation");
        }
        return this.templateInstanciationDep;
    }

    @objid ("e8db4cd6-07d7-4b06-8aa5-307ed3175906")
    public SmDependency getRepresentingDep() {
        if (this.representingDep == null) {
        	this.representingDep = this.getDependencyDef("Representing");
        }
        return this.representingDep;
    }

    @objid ("030af941-44ba-48e6-a6e2-75094d75d744")
    public SmDependency getOwnedBehaviorDep() {
        if (this.ownedBehaviorDep == null) {
        	this.ownedBehaviorDep = this.getDependencyDef("OwnedBehavior");
        }
        return this.ownedBehaviorDep;
    }

    @objid ("e3d9b92d-d822-4c09-99f0-c08e16012f4a")
    public SmDependency getReceivedDep() {
        if (this.receivedDep == null) {
        	this.receivedDep = this.getDependencyDef("Received");
        }
        return this.receivedDep;
    }

    @objid ("b1b98554-363b-4523-a6f1-57cb60db1142")
    public SmDependency getUsedNsuDep() {
        if (this.usedNsuDep == null) {
        	this.usedNsuDep = this.getDependencyDef("UsedNsu");
        }
        return this.usedNsuDep;
    }

    @objid ("050818fd-ea46-410f-b02c-20642ad47df0")
    public SmDependency getOwnedInformationFlowDep() {
        if (this.ownedInformationFlowDep == null) {
        	this.ownedInformationFlowDep = this.getDependencyDef("OwnedInformationFlow");
        }
        return this.ownedInformationFlowDep;
    }

    @objid ("7af0165c-d804-46d1-bde7-4cc5103fcd02")
    public SmDependency getImportingDep() {
        if (this.importingDep == null) {
        	this.importingDep = this.getDependencyDef("Importing");
        }
        return this.importingDep;
    }

    @objid ("94bd70cc-c5d7-4b52-ad8f-bf4a2a09f92b")
    public SmDependency getSentDep() {
        if (this.sentDep == null) {
        	this.sentDep = this.getDependencyDef("Sent");
        }
        return this.sentDep;
    }

    @objid ("1d9e6d56-e67b-45c4-9e9b-b84711a59eaa")
    public SmDependency getOwnedDataFlowDep() {
        if (this.ownedDataFlowDep == null) {
        	this.ownedDataFlowDep = this.getDependencyDef("OwnedDataFlow");
        }
        return this.ownedDataFlowDep;
    }

    @objid ("ee402a78-8a20-4c3b-85b4-fff3623dd246")
    public SmDependency getOwnedCollaborationUseDep() {
        if (this.ownedCollaborationUseDep == null) {
        	this.ownedCollaborationUseDep = this.getDependencyDef("OwnedCollaborationUse");
        }
        return this.ownedCollaborationUseDep;
    }

    @objid ("d2a1fbe4-f274-4e46-beff-0e6612218228")
    public SmDependency getOwnedPackageImportDep() {
        if (this.ownedPackageImportDep == null) {
        	this.ownedPackageImportDep = this.getDependencyDef("OwnedPackageImport");
        }
        return this.ownedPackageImportDep;
    }

    @objid ("e4fcfe2e-77f2-4c31-a56a-25728299c159")
    public SmDependency getTemplateDep() {
        if (this.templateDep == null) {
        	this.templateDep = this.getDependencyDef("Template");
        }
        return this.templateDep;
    }

    @objid ("8f0d194e-c487-4902-bb5b-3832d4960063")
    public SmDependency getSpecializationDep() {
        if (this.specializationDep == null) {
        	this.specializationDep = this.getDependencyDef("Specialization");
        }
        return this.specializationDep;
    }

    @objid ("a63e1813-38a1-4d21-87ac-dda993242b13")
    public SmDependency getRealizedDep() {
        if (this.realizedDep == null) {
        	this.realizedDep = this.getDependencyDef("Realized");
        }
        return this.realizedDep;
    }

    @objid ("4694bdc5-d5f0-47ba-8a93-6a47cb261dbe")
    public SmDependency getDeclaredDep() {
        if (this.declaredDep == null) {
        	this.declaredDep = this.getDependencyDef("Declared");
        }
        return this.declaredDep;
    }

    @objid ("b01334cc-ed5a-4c45-bd91-58f8f29bedb2")
    public SmDependency getInstanciatingBindingDep() {
        if (this.instanciatingBindingDep == null) {
        	this.instanciatingBindingDep = this.getDependencyDef("InstanciatingBinding");
        }
        return this.instanciatingBindingDep;
    }

    @objid ("ba01348b-cbbe-4037-8da4-4975e44e96b4")
    public SmDependency getOwnedImportDep() {
        if (this.ownedImportDep == null) {
        	this.ownedImportDep = this.getDependencyDef("OwnedImport");
        }
        return this.ownedImportDep;
    }

    @objid ("fbab0a2b-4370-4f6e-b77e-0df79e4d7923")
    public SmDependency getUserNsuDep() {
        if (this.userNsuDep == null) {
        	this.userNsuDep = this.getDependencyDef("UserNsu");
        }
        return this.userNsuDep;
    }

    @objid ("dd1e98c0-e4e0-4c26-b0c2-f5aeb21887a1")
    private static class NameSpaceObjectFactory implements ISmObjectFactory {
        @objid ("53235c5b-9403-41c0-8fe7-fd934981f465")
        private NameSpaceSmClass smClass;

        @objid ("fce9653e-ddc3-46db-930e-cdd94ee544b3")
        public NameSpaceObjectFactory(NameSpaceSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("8932ded1-5f65-4239-b26f-e080d3940956")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("ba7cdc64-a2de-4bf9-bf5c-f25859aec3e0")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("809c3aa8-19c0-4feb-933d-7f2e6d4deac6")
    public static class IsAbstractSmAttribute extends SmAttribute {
        @objid ("4bd8401a-7772-40c0-988d-b417b2aadb9f")
        public Object getValue(ISmObjectData data) {
            return ((NameSpaceData) data).mIsAbstract;
        }

        @objid ("4e90c240-6b7c-4f3c-a227-9216df8c1e69")
        public void setValue(ISmObjectData data, Object value) {
            ((NameSpaceData) data).mIsAbstract = value;
        }

    }

    @objid ("e2e47931-e325-4b9e-867b-5e91c7a9bdf6")
    public static class IsLeafSmAttribute extends SmAttribute {
        @objid ("d684437f-928f-4598-b0ea-513a022e1277")
        public Object getValue(ISmObjectData data) {
            return ((NameSpaceData) data).mIsLeaf;
        }

        @objid ("9dde62cd-2944-4703-bdda-223ffc2ca4ee")
        public void setValue(ISmObjectData data, Object value) {
            ((NameSpaceData) data).mIsLeaf = value;
        }

    }

    @objid ("015e5272-1b41-498a-a85c-58194b314cf4")
    public static class IsRootSmAttribute extends SmAttribute {
        @objid ("e228d7b7-378c-406a-9660-6ffc0d8a002b")
        public Object getValue(ISmObjectData data) {
            return ((NameSpaceData) data).mIsRoot;
        }

        @objid ("66441430-52e9-4305-9fe4-64862145999b")
        public void setValue(ISmObjectData data, Object value) {
            ((NameSpaceData) data).mIsRoot = value;
        }

    }

    @objid ("aeb98a54-2347-4d97-8f47-5360685c3bd0")
    public static class VisibilitySmAttribute extends SmAttribute {
        @objid ("c9850be9-a690-4b89-a726-961797ca74d0")
        public Object getValue(ISmObjectData data) {
            return ((NameSpaceData) data).mVisibility;
        }

        @objid ("37bc6369-8ce0-4632-b5ef-91e6015e5048")
        public void setValue(ISmObjectData data, Object value) {
            ((NameSpaceData) data).mVisibility = value;
        }

    }

    @objid ("f995e992-9842-45d7-b390-191916ddbb1f")
    public static class ParentSmDependency extends SmMultipleDependency {
        @objid ("65aefa49-d43c-4802-bdb6-d8d9cfc4cbb3")
        private SmDependency symetricDep;

        @objid ("ff53e4e8-c48c-4405-b0d9-0b3ba183e169")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mParent != null)? ((NameSpaceData)data).mParent:SmMultipleDependency.EMPTY;
        }

        @objid ("70a4c7e7-2102-43ae-b50e-2fde3619486c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mParent = values;
        }

        @objid ("5f6bdc4c-127b-4143-90bc-8ecce9701e04")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GeneralizationSmClass)this.getTarget()).getSubTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("eec0e58a-898d-40e6-bc7b-4821105af56c")
    public static class TemplateInstanciationSmDependency extends SmMultipleDependency {
        @objid ("cf153347-6015-4c7b-a240-fcb0c90f0ff5")
        private SmDependency symetricDep;

        @objid ("012f4732-d85e-45db-9d99-58ec52efcae1")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mTemplateInstanciation != null)? ((NameSpaceData)data).mTemplateInstanciation:SmMultipleDependency.EMPTY;
        }

        @objid ("8800e999-6b7a-4cef-a0e3-dcad3b1e35e8")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mTemplateInstanciation = values;
        }

        @objid ("24f4132d-e685-4400-ac11-06b0c87ccd62")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateBindingSmClass)this.getTarget()).getBoundElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e4c9550f-7b7a-4967-950d-827e225d3eea")
    public static class RepresentingSmDependency extends SmMultipleDependency {
        @objid ("6f4b5985-b8ac-4ef6-a182-555282ad5fac")
        private SmDependency symetricDep;

        @objid ("76c659be-e487-40f8-b6c1-3fd5509e6521")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mRepresenting != null)? ((NameSpaceData)data).mRepresenting:SmMultipleDependency.EMPTY;
        }

        @objid ("8fd7ee45-8e64-4fc3-978a-483358ee814b")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mRepresenting = values;
        }

        @objid ("9ad75449-b85e-4cba-a225-c5d86167b61c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InstanceSmClass)this.getTarget()).getBaseDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("cc0c91f1-b323-4a6f-88c5-48f749d6d3ec")
    public static class OwnedBehaviorSmDependency extends SmMultipleDependency {
        @objid ("66fa2209-ca93-4b63-b662-cb2ebefe1f69")
        private SmDependency symetricDep;

        @objid ("172900cf-73b4-4f37-9a37-0fd0e3c0e5b0")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mOwnedBehavior != null)? ((NameSpaceData)data).mOwnedBehavior:SmMultipleDependency.EMPTY;
        }

        @objid ("be202390-c1b7-4576-9a34-5fa9e8dfeac1")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mOwnedBehavior = values;
        }

        @objid ("6614ffb1-4e0d-499b-a6fc-9048446f9413")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BehaviorSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1acad8b5-2df5-487b-985e-10b8b6d2f1a8")
    public static class ReceivedSmDependency extends SmMultipleDependency {
        @objid ("168556f0-9998-4ddc-82c7-5ef599a4d70e")
        private SmDependency symetricDep;

        @objid ("b717e368-0767-442d-a54a-f68c3cff10c3")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mReceived != null)? ((NameSpaceData)data).mReceived:SmMultipleDependency.EMPTY;
        }

        @objid ("90277097-a3cf-4339-a863-c7eb85d73476")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mReceived = values;
        }

        @objid ("1d6d9c9e-73ee-4909-b101-03f2a9dc806a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DataFlowSmClass)this.getTarget()).getDestinationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("bb508565-19f5-4207-a305-301c4e8fd7d7")
    public static class UsedNsuSmDependency extends SmMultipleDependency {
        @objid ("838b6b77-96f9-429d-bcfa-164b02fa33d9")
        private SmDependency symetricDep;

        @objid ("48a15158-0122-4071-8537-b4ca2007ad99")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mUsedNsu != null)? ((NameSpaceData)data).mUsedNsu:SmMultipleDependency.EMPTY;
        }

        @objid ("6e5b07dc-f25c-4eb0-8d8e-84493b2cc553")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mUsedNsu = values;
        }

        @objid ("ba25c9bc-fb12-4cf8-91b6-e5744059ac3b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NamespaceUseSmClass)this.getTarget()).getUserDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b7fe89be-2bf5-4501-88a8-8b218f2c8ec4")
    public static class OwnedInformationFlowSmDependency extends SmMultipleDependency {
        @objid ("5a819854-0163-4c44-86c5-44fa134202d5")
        private SmDependency symetricDep;

        @objid ("a8136a72-f915-4348-80c7-8f998590fc3a")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mOwnedInformationFlow != null)? ((NameSpaceData)data).mOwnedInformationFlow:SmMultipleDependency.EMPTY;
        }

        @objid ("4f28e50f-02bd-488a-8751-e6bc78d98f13")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mOwnedInformationFlow = values;
        }

        @objid ("3d617178-6d8e-4411-ab65-c5d3e297cfd6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InformationFlowSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("923e2c65-cdb0-4c3b-a63f-75526906df70")
    public static class ImportingSmDependency extends SmMultipleDependency {
        @objid ("8664f706-d2a5-4fb5-a100-65c5f3b1eaa6")
        private SmDependency symetricDep;

        @objid ("b90a49c9-c6d7-4e69-a928-5cea33be7a4e")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mImporting != null)? ((NameSpaceData)data).mImporting:SmMultipleDependency.EMPTY;
        }

        @objid ("22a80fad-26a1-4884-8764-b4badbc71539")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mImporting = values;
        }

        @objid ("1c789be6-e2f4-481f-8033-614300f0db16")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ElementImportSmClass)this.getTarget()).getImportedElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ef826f0c-b7bd-4243-a198-c1d12e8e4704")
    public static class SentSmDependency extends SmMultipleDependency {
        @objid ("99994bc0-687b-47f3-a238-5ce2b4856ccc")
        private SmDependency symetricDep;

        @objid ("24275d56-601b-43fc-b88a-41ac6550c4a3")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mSent != null)? ((NameSpaceData)data).mSent:SmMultipleDependency.EMPTY;
        }

        @objid ("8eb67e5f-951b-4753-8bec-b8ceb6093e85")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mSent = values;
        }

        @objid ("48d8501e-d8d5-4e1a-9b6f-e7232fd277e7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DataFlowSmClass)this.getTarget()).getOriginDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("192f5834-bb26-4338-bb1d-9fe549fb83d5")
    public static class OwnedDataFlowSmDependency extends SmMultipleDependency {
        @objid ("ad5e2beb-9433-4e2a-b584-cef4a0222422")
        private SmDependency symetricDep;

        @objid ("2b193bd6-3725-47cf-960f-6d8cadfa733d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mOwnedDataFlow != null)? ((NameSpaceData)data).mOwnedDataFlow:SmMultipleDependency.EMPTY;
        }

        @objid ("baa8476c-d242-4d94-a9aa-c27ef6b1a09d")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mOwnedDataFlow = values;
        }

        @objid ("d9e9bf03-7098-4a66-aef4-b970241b4e07")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DataFlowSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("8c447e1c-15af-41b8-be5a-551bd77d1fde")
    public static class OwnedCollaborationUseSmDependency extends SmMultipleDependency {
        @objid ("50617b07-0a4a-4fc7-ba9a-e2568ad95700")
        private SmDependency symetricDep;

        @objid ("d5ead651-a033-4ebe-b92a-abfdcae90938")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mOwnedCollaborationUse != null)? ((NameSpaceData)data).mOwnedCollaborationUse:SmMultipleDependency.EMPTY;
        }

        @objid ("fa70e44e-04ea-4908-87ac-1f656a9e2b3b")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mOwnedCollaborationUse = values;
        }

        @objid ("135b2a0d-3ae6-4c1a-aed6-308119ccc0b7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CollaborationUseSmClass)this.getTarget()).getNRepresentedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a3174df2-960d-4bf6-bb92-276c2cbb6292")
    public static class OwnedPackageImportSmDependency extends SmMultipleDependency {
        @objid ("20c58c01-d634-4f16-b394-49e2a27b6933")
        private SmDependency symetricDep;

        @objid ("079a3008-7273-4e2c-a4b0-73aa00ef612f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mOwnedPackageImport != null)? ((NameSpaceData)data).mOwnedPackageImport:SmMultipleDependency.EMPTY;
        }

        @objid ("66ef8b41-defa-41f2-923f-7840220d1c46")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mOwnedPackageImport = values;
        }

        @objid ("53060cc5-086c-4691-b30f-c8560dd40935")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PackageImportSmClass)this.getTarget()).getImportingNameSpaceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f39d8b5e-27ac-4429-9032-fbba76872aa2")
    public static class TemplateSmDependency extends SmMultipleDependency {
        @objid ("cac98a78-1259-400b-93a8-e8ae0492d3a5")
        private SmDependency symetricDep;

        @objid ("12b3eb65-7b9f-48a3-b968-e049fa8c27a1")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mTemplate != null)? ((NameSpaceData)data).mTemplate:SmMultipleDependency.EMPTY;
        }

        @objid ("596a03a6-805b-43b0-b6ec-715e27599040")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mTemplate = values;
        }

        @objid ("0ad83702-ba7f-4bd7-9803-70c2e36c6891")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateParameterSmClass)this.getTarget()).getParameterizedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a77a93fb-eae9-4f88-9820-6a233a8a329b")
    public static class SpecializationSmDependency extends SmMultipleDependency {
        @objid ("913b426f-8869-4523-9ef4-1bab5d727040")
        private SmDependency symetricDep;

        @objid ("264f9f12-ad79-4e78-9d30-d53f07ee954f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mSpecialization != null)? ((NameSpaceData)data).mSpecialization:SmMultipleDependency.EMPTY;
        }

        @objid ("48ef32bc-f35a-467d-9325-80c31981fcd4")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mSpecialization = values;
        }

        @objid ("8fb6db09-da2a-4c15-8c17-1a1281088caf")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GeneralizationSmClass)this.getTarget()).getSuperTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("937e54f7-6a77-4332-8320-af58446a3572")
    public static class RealizedSmDependency extends SmMultipleDependency {
        @objid ("c478db4d-fb08-4306-86a9-87aacdce4408")
        private SmDependency symetricDep;

        @objid ("4fba8add-77e7-4644-9821-43764c6c8aac")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mRealized != null)? ((NameSpaceData)data).mRealized:SmMultipleDependency.EMPTY;
        }

        @objid ("1daaa2c4-b039-4de5-ade2-4a140e3b4566")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mRealized = values;
        }

        @objid ("9695aa15-a2ee-441b-9c11-e1e9db6be4b5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InterfaceRealizationSmClass)this.getTarget()).getImplementerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0805da7e-641f-40e5-b199-d2db1aa655d0")
    public static class DeclaredSmDependency extends SmMultipleDependency {
        @objid ("9615fc03-0878-44ba-9f59-7c50999d1757")
        private SmDependency symetricDep;

        @objid ("a0f71043-3bb5-42d8-8992-3bb67759b842")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mDeclared != null)? ((NameSpaceData)data).mDeclared:SmMultipleDependency.EMPTY;
        }

        @objid ("4c450c04-73b8-4599-b970-fff208ae280e")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mDeclared = values;
        }

        @objid ("1e0d80d1-1121-4410-b0e7-859b0d950534")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InstanceSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("627cdee0-0e96-481b-954d-e86ea53a0bf6")
    public static class InstanciatingBindingSmDependency extends SmMultipleDependency {
        @objid ("4077355c-3b8f-4d92-af51-31fe564aafee")
        private SmDependency symetricDep;

        @objid ("9e63b446-a40e-48ea-96ad-92c4867b63bb")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mInstanciatingBinding != null)? ((NameSpaceData)data).mInstanciatingBinding:SmMultipleDependency.EMPTY;
        }

        @objid ("16c7818d-0aa2-477c-95d7-cb4e4f49da07")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mInstanciatingBinding = values;
        }

        @objid ("8d431871-5bb6-4936-9715-f1b1fa93c343")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateBindingSmClass)this.getTarget()).getInstanciatedTemplateDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("fa4ecbd3-f00b-42b7-876b-7f984ff08ced")
    public static class OwnedImportSmDependency extends SmMultipleDependency {
        @objid ("4739b542-e0f3-4a9b-bd4a-62e2f94e865e")
        private SmDependency symetricDep;

        @objid ("3e3e2297-c214-4aba-89b3-aae7d43c7049")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mOwnedImport != null)? ((NameSpaceData)data).mOwnedImport:SmMultipleDependency.EMPTY;
        }

        @objid ("16ee3df7-3e2d-4cd8-ae16-3cee24048088")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mOwnedImport = values;
        }

        @objid ("26e12b53-e277-4433-8502-4f524ec5174b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ElementImportSmClass)this.getTarget()).getImportingNameSpaceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a927e2d9-14ff-4339-a4e8-a01f7b50d3ba")
    public static class UserNsuSmDependency extends SmMultipleDependency {
        @objid ("74e8a626-518b-4fde-a427-0e5601d3c43c")
        private SmDependency symetricDep;

        @objid ("d0df03ba-dda0-4b7d-bd0c-ebed2a075340")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NameSpaceData)data).mUserNsu != null)? ((NameSpaceData)data).mUserNsu:SmMultipleDependency.EMPTY;
        }

        @objid ("7f8672f1-3f4d-49e1-8e1b-d017882ba279")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NameSpaceData) data).mUserNsu = values;
        }

        @objid ("a73a8586-cc73-4932-a4ba-74f7cfae5c88")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NamespaceUseSmClass)this.getTarget()).getUsedDep();
            }
            return this.symetricDep;
        }

    }

}
