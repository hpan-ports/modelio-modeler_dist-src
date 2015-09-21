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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableDefinitionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableSmClass;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("864b6926-ae8d-4a3b-a96e-053b5bb7f2e3")
public class TypedPropertyTableSmClass extends PropertyTableSmClass {
    @objid ("6816a343-1019-4546-b3d9-dab98696a497")
    private SmDependency typeDep;

    @objid ("61492657-707f-4c30-9b0e-f0c436437406")
    public TypedPropertyTableSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("75429b91-5886-4373-aec5-2c4ce42742aa")
    @Override
    public String getName() {
        return "TypedPropertyTable";
    }

    @objid ("8c845577-a3e8-44a8-89d9-635f95e1be05")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("62e338ec-f57a-41b8-b026-297399f53843")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return TypedPropertyTable.class;
    }

    @objid ("bf78bee4-2931-4c2f-951b-8f389f8ed05d")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("a7b6d990-fe29-4b0c-b0b9-7b409f9c48ea")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("30fde9f6-033e-4d8b-8c9b-0d2def85caf3")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("PropertyTable");
        this.registerFactory(new TypedPropertyTableObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.typeDep = new TypeSmDependency();
        this.typeDep.init("Type", this, metamodel.getMClass("PropertyTableDefinition"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.typeDep);
    }

    @objid ("0977846e-b35a-471a-827b-54b6ccbe39b9")
    public SmDependency getTypeDep() {
        if (this.typeDep == null) {
        	this.typeDep = this.getDependencyDef("Type");
        }
        return this.typeDep;
    }

    @objid ("9e31c66f-f885-44b5-a17f-24a215500d95")
    private static class TypedPropertyTableObjectFactory implements ISmObjectFactory {
        @objid ("f9657c82-652e-48c3-9754-094733ff7107")
        private TypedPropertyTableSmClass smClass;

        @objid ("7bc1d708-a91b-4089-b2eb-40aa5fc7d2d3")
        public TypedPropertyTableObjectFactory(TypedPropertyTableSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("d6162597-98e8-41e1-824b-ebc72c075e98")
        @Override
        public ISmObjectData createData() {
            return new TypedPropertyTableData(this.smClass);
        }

        @objid ("65a8e01c-a020-4b34-abb7-b32fd012d7a3")
        @Override
        public SmObjectImpl createImpl() {
            return new TypedPropertyTableImpl();
        }

    }

    @objid ("d089d7da-b75e-4d5e-8072-7b7c0928568f")
    public static class TypeSmDependency extends SmSingleDependency {
        @objid ("f89bbece-0195-45df-9dc0-2697b5b072d7")
        private SmDependency symetricDep;

        @objid ("e44ab93c-b37e-4a04-94e7-5ebc6875d077")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TypedPropertyTableData) data).mType;
        }

        @objid ("ef75bd5d-dc62-4adb-b696-7edd8553d3e2")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TypedPropertyTableData) data).mType = value;
        }

        @objid ("d86786e8-170f-4771-892b-8ffe8a8b93dd")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyTableDefinitionSmClass)this.getTarget()).getTypedTableDep();
            }
            return this.symetricDep;
        }

    }

}
