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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.impl.analyst.AnalystProjectSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableDefinitionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTypeSmClass;
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

@objid ("81623496-6d51-4192-a238-0623485bc63f")
public class PropertyContainerSmClass extends ModelElementSmClass {
    @objid ("e1cda9e9-f1f8-44de-a0e7-ec061147a1d3")
    private SmDependency definedTableDep;

    @objid ("c2667492-22a7-42d3-ad62-350a2a60db29")
    private SmDependency ownerProjectDep;

    @objid ("011b9dea-02cc-4164-bb27-c7d807ddd4ee")
    private SmDependency definedTypeDep;

    @objid ("efae4ca0-76fa-45f1-a3ec-19d76301b3bd")
    public PropertyContainerSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("bee6a552-cb92-4d75-b4c4-eeb2602bb47d")
    @Override
    public String getName() {
        return "PropertyContainer";
    }

    @objid ("2a4e15b9-b986-4ac6-b0b7-dd2adb740ac2")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("c1a879d7-8b68-4888-bf70-4708e97773c6")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return PropertyContainer.class;
    }

    @objid ("7f539a1d-7a82-4e39-94cb-9a8fc960c829")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("8d5e9a10-e6ab-4e09-a360-e8478e06382f")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("b7134066-5330-4ff1-a45a-732f4830044b")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new PropertyContainerObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.definedTableDep = new DefinedTableSmDependency();
        this.definedTableDep.init("DefinedTable", this, metamodel.getMClass("PropertyTableDefinition"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.definedTableDep);
        
        this.ownerProjectDep = new OwnerProjectSmDependency();
        this.ownerProjectDep.init("OwnerProject", this, metamodel.getMClass("AnalystProject"), 1, 1 );
        registerDependency(this.ownerProjectDep);
        
        this.definedTypeDep = new DefinedTypeSmDependency();
        this.definedTypeDep.init("DefinedType", this, metamodel.getMClass("PropertyType"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.definedTypeDep);
    }

    @objid ("ff3389bb-f481-46c9-9036-be066961e5a4")
    public SmDependency getDefinedTableDep() {
        if (this.definedTableDep == null) {
        	this.definedTableDep = this.getDependencyDef("DefinedTable");
        }
        return this.definedTableDep;
    }

    @objid ("af5f0d7c-4c70-4518-9c58-7ffc860f979d")
    public SmDependency getOwnerProjectDep() {
        if (this.ownerProjectDep == null) {
        	this.ownerProjectDep = this.getDependencyDef("OwnerProject");
        }
        return this.ownerProjectDep;
    }

    @objid ("2d3bc1ea-0a9b-42bd-ae47-7200aeb44f66")
    public SmDependency getDefinedTypeDep() {
        if (this.definedTypeDep == null) {
        	this.definedTypeDep = this.getDependencyDef("DefinedType");
        }
        return this.definedTypeDep;
    }

    @objid ("2816276f-4d43-4dd0-8773-093754266bf9")
    private static class PropertyContainerObjectFactory implements ISmObjectFactory {
        @objid ("2d6ec074-c81e-416c-a54b-08ea2d0abbb8")
        private PropertyContainerSmClass smClass;

        @objid ("837f7d06-6b56-43fb-8081-8de29893c5ce")
        public PropertyContainerObjectFactory(PropertyContainerSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("398ee542-8259-4a18-a0f2-891f9b0a867e")
        @Override
        public ISmObjectData createData() {
            return new PropertyContainerData(this.smClass);
        }

        @objid ("11447b36-5fb2-4d67-991a-774286d9d167")
        @Override
        public SmObjectImpl createImpl() {
            return new PropertyContainerImpl();
        }

    }

    @objid ("2f747cea-3806-4a42-bf54-327f12359f30")
    public static class DefinedTableSmDependency extends SmMultipleDependency {
        @objid ("d840fda5-7939-4d28-a718-b7e1c9380bcf")
        private SmDependency symetricDep;

        @objid ("222be8c1-122e-4935-b844-073fc03b71ce")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((PropertyContainerData)data).mDefinedTable != null)? ((PropertyContainerData)data).mDefinedTable:SmMultipleDependency.EMPTY;
        }

        @objid ("558bf79b-4a1a-4bb5-8144-6bf8e7194230")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((PropertyContainerData) data).mDefinedTable = values;
        }

        @objid ("388dcbdb-5777-4b56-a33b-9f12e71a70e8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyTableDefinitionSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("21b1a3c8-8e8e-4037-9653-6f23fc861fbe")
    public static class OwnerProjectSmDependency extends SmSingleDependency {
        @objid ("d9a8a3bd-cff2-438f-9545-566d1deb0f2d")
        private SmDependency symetricDep;

        @objid ("7cad6291-f579-4843-862b-74dff82f4e2d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PropertyContainerData) data).mOwnerProject;
        }

        @objid ("04d92b85-7356-4dce-bedd-d4736a6f4a6a")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PropertyContainerData) data).mOwnerProject = value;
        }

        @objid ("a0e33346-e0d7-42be-9e37-9c1385b73edc")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AnalystProjectSmClass)this.getTarget()).getPropertyRootDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d3a7a768-80ee-4d96-86fd-2ecd2d72e8c3")
    public static class DefinedTypeSmDependency extends SmMultipleDependency {
        @objid ("d749be3a-40de-4016-bb76-f01f4b76ee3b")
        private SmDependency symetricDep;

        @objid ("8a9c2722-b1df-455c-9cfe-c0371b39f1e5")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((PropertyContainerData)data).mDefinedType != null)? ((PropertyContainerData)data).mDefinedType:SmMultipleDependency.EMPTY;
        }

        @objid ("a8f91cae-e07f-4dea-bb6d-8ffa5ca2157c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((PropertyContainerData) data).mDefinedType = values;
        }

        @objid ("9ae0cacc-8f18-4a8c-96be-9e597a68740a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyTypeSmClass)this.getTarget()).getAnalystOwnerDep();
            }
            return this.symetricDep;
        }

    }

}
