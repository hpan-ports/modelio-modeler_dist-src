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
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.analyst.PropertyContainerSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.MetaclassReferenceSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.StereotypeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyDefinitionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.TypedPropertyTableSmClass;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
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

@objid ("0d6c2aea-8dca-4863-a004-7fbfad275c72")
public class PropertyTableDefinitionSmClass extends ModelElementSmClass {
    @objid ("c7040072-3e5e-4c45-9078-993c3c19d0ae")
    private SmDependency ownerDep;

    @objid ("601b2be9-5d28-4c21-ac6c-078385d34986")
    private SmDependency typedTableDep;

    @objid ("86a4d701-48c9-4110-8532-4496b71449aa")
    private SmDependency ownerReferenceDep;

    @objid ("98415f28-206e-44f4-9ac2-685f932bab10")
    private SmDependency ownerStereotypeDep;

    @objid ("bd804b8c-cbb5-4969-b8a5-dab3800564b4")
    private SmDependency ownedDep;

    @objid ("9f8a64d2-fffd-46f8-a373-d3429a18e11c")
    public PropertyTableDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("94697a18-f095-4c46-bb42-a70d9539f622")
    @Override
    public String getName() {
        return "PropertyTableDefinition";
    }

    @objid ("1e3259bd-c2e6-4e1e-9d20-aebdafeb4204")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("c1120837-2104-4ad8-bacb-d9548d7044ab")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return PropertyTableDefinition.class;
    }

    @objid ("3f56bc9a-780f-4ebc-b272-345e4dd4381a")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("8a56b452-646b-4814-ae03-8d40416300ab")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("eda3c585-cf9a-4e69-b569-b4e12f9ca626")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new PropertyTableDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("PropertyContainer"), 1, 1 );
        registerDependency(this.ownerDep);
        
        this.typedTableDep = new TypedTableSmDependency();
        this.typedTableDep.init("TypedTable", this, metamodel.getMClass("TypedPropertyTable"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.typedTableDep);
        
        this.ownerReferenceDep = new OwnerReferenceSmDependency();
        this.ownerReferenceDep.init("OwnerReference", this, metamodel.getMClass("MetaclassReference"), 0, 1 );
        registerDependency(this.ownerReferenceDep);
        
        this.ownerStereotypeDep = new OwnerStereotypeSmDependency();
        this.ownerStereotypeDep.init("OwnerStereotype", this, metamodel.getMClass("Stereotype"), 0, 1 );
        registerDependency(this.ownerStereotypeDep);
        
        this.ownedDep = new OwnedSmDependency();
        this.ownedDep.init("Owned", this, metamodel.getMClass("PropertyDefinition"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedDep);
    }

    @objid ("7bb92459-3a3e-4cda-a88d-7d242ca08c4d")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("9bb44552-6420-4613-b92f-15bebda27f21")
    public SmDependency getTypedTableDep() {
        if (this.typedTableDep == null) {
        	this.typedTableDep = this.getDependencyDef("TypedTable");
        }
        return this.typedTableDep;
    }

    @objid ("a669cd7a-40ed-444b-8fa9-a111c060f32b")
    public SmDependency getOwnerReferenceDep() {
        if (this.ownerReferenceDep == null) {
        	this.ownerReferenceDep = this.getDependencyDef("OwnerReference");
        }
        return this.ownerReferenceDep;
    }

    @objid ("e7806c34-aded-4958-9c47-4f64801ed699")
    public SmDependency getOwnerStereotypeDep() {
        if (this.ownerStereotypeDep == null) {
        	this.ownerStereotypeDep = this.getDependencyDef("OwnerStereotype");
        }
        return this.ownerStereotypeDep;
    }

    @objid ("57045967-8053-4c78-bc8d-454e9c66b27c")
    public SmDependency getOwnedDep() {
        if (this.ownedDep == null) {
        	this.ownedDep = this.getDependencyDef("Owned");
        }
        return this.ownedDep;
    }

    @objid ("e223aed3-5058-4dde-88c0-d1c609eff27a")
    private static class PropertyTableDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("d51a2f23-024c-4623-9685-fe134c203860")
        private PropertyTableDefinitionSmClass smClass;

        @objid ("98bb2b13-3636-4ce1-be6b-255af32740d2")
        public PropertyTableDefinitionObjectFactory(PropertyTableDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4b41aad6-fbd2-4187-8f17-04f6933d77b5")
        @Override
        public ISmObjectData createData() {
            return new PropertyTableDefinitionData(this.smClass);
        }

        @objid ("320cf9b1-574a-4de3-9084-4b45ebb4930e")
        @Override
        public SmObjectImpl createImpl() {
            return new PropertyTableDefinitionImpl();
        }

    }

    @objid ("675a9526-99fa-435d-8581-1db55f3ccee2")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("a9552326-ee9a-420d-a5b1-841aedbb5f5b")
        private SmDependency symetricDep;

        @objid ("d17dbf60-e47b-438c-8581-081f936d2751")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PropertyTableDefinitionData) data).mOwner;
        }

        @objid ("0d6a5a2b-f8a4-4451-bfd6-7ce2f2b021f1")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PropertyTableDefinitionData) data).mOwner = value;
        }

        @objid ("669c7505-b6b0-4bde-929c-8b2939677d74")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyContainerSmClass)this.getTarget()).getDefinedTableDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("750d3241-6a6c-4d92-a9ec-27f808fb0cc8")
    public static class TypedTableSmDependency extends SmMultipleDependency {
        @objid ("3f904b72-2631-47f9-8184-e79e1d2aca5f")
        private SmDependency symetricDep;

        @objid ("f24802b7-87bc-4270-8c46-ecd65bd2fdd2")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((PropertyTableDefinitionData)data).mTypedTable != null)? ((PropertyTableDefinitionData)data).mTypedTable:SmMultipleDependency.EMPTY;
        }

        @objid ("65829d10-1d55-453c-9900-a84945988e70")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((PropertyTableDefinitionData) data).mTypedTable = values;
        }

        @objid ("ae3b5301-5ecf-49a4-9a85-fba3892fbca0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TypedPropertyTableSmClass)this.getTarget()).getTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f7527872-fd44-4bed-b669-a2cf815c3f1c")
    public static class OwnerReferenceSmDependency extends SmSingleDependency {
        @objid ("971360ff-17e8-49e6-a48b-96eff8522e07")
        private SmDependency symetricDep;

        @objid ("add82292-8e92-44eb-9b3c-70c2ab207ea0")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PropertyTableDefinitionData) data).mOwnerReference;
        }

        @objid ("da1bed38-8753-499a-8815-ff93a9165c79")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PropertyTableDefinitionData) data).mOwnerReference = value;
        }

        @objid ("487ba4b0-777e-41b2-b126-3cf61a4cbbf6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MetaclassReferenceSmClass)this.getTarget()).getDefinedTableDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("8bc55473-b997-47be-a155-4d12e9e9545d")
    public static class OwnerStereotypeSmDependency extends SmSingleDependency {
        @objid ("aa2ad26b-d581-4789-87c8-b93d2d5e77a4")
        private SmDependency symetricDep;

        @objid ("26b91e6d-2240-4b06-946e-8fa1e177aa47")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PropertyTableDefinitionData) data).mOwnerStereotype;
        }

        @objid ("62d47daa-869e-4219-ac54-0cef379500ee")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PropertyTableDefinitionData) data).mOwnerStereotype = value;
        }

        @objid ("512ce62e-8141-4374-bf1d-bd5cf2faafce")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StereotypeSmClass)this.getTarget()).getDefinedTableDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4755562d-dbd2-457a-a35b-e3e170efb3b5")
    public static class OwnedSmDependency extends SmMultipleDependency {
        @objid ("ea7aa878-309a-4833-ba76-5a327dff0809")
        private SmDependency symetricDep;

        @objid ("89841f6a-7544-448c-8fd2-35a7deaaf58f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((PropertyTableDefinitionData)data).mOwned != null)? ((PropertyTableDefinitionData)data).mOwned:SmMultipleDependency.EMPTY;
        }

        @objid ("b1727869-e947-4cc0-af27-53367b1409e8")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((PropertyTableDefinitionData) data).mOwned = values;
        }

        @objid ("941c805b-a23e-43fe-8605-e8b9b408f23f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyDefinitionSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

}
