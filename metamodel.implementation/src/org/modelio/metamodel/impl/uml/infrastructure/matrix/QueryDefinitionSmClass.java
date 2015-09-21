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
package org.modelio.metamodel.impl.uml.infrastructure.matrix;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ExternProcessorSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.MatrixDefinitionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableSmClass;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
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

@objid ("7e599826-c1b6-47d6-9fec-178ce027d0e1")
public class QueryDefinitionSmClass extends ElementSmClass {
    @objid ("31d497cb-52e5-4b73-a169-3543fa453d67")
    private SmAttribute usingAdditionsAtt;

    @objid ("28aa448f-9815-41a9-864c-99be2d61f2ce")
    private SmDependency addedDep;

    @objid ("20ebeabb-d909-40cb-9172-0e6bdf9f7365")
    private SmDependency processorDep;

    @objid ("85014ae3-23a7-4851-bfa0-c2a414c1f1fe")
    private SmDependency parametersDep;

    @objid ("5e776bf0-9412-4df6-98f6-d71d123c6c9b")
    private SmDependency ownerAsLineDep;

    @objid ("6f4c5f0d-aa60-4b81-a2d9-8351ca4b342a")
    private SmDependency ownerAsColDep;

    @objid ("66cdfa6a-df19-4a55-bb1f-c349de07c03c")
    private SmDependency ownerAsDepthDep;

    @objid ("357169c1-3d8d-4131-b789-2269b4d29129")
    public QueryDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("44d3f3e3-8bac-438a-bf2d-e4eecd4b6ad8")
    @Override
    public String getName() {
        return "QueryDefinition";
    }

    @objid ("a7827ebd-f7be-4887-8847-29d2ebaacd40")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("2a4d543a-4f77-428c-9d35-cf99847a916a")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return QueryDefinition.class;
    }

    @objid ("a71c84b0-0444-4e04-ae7c-842c68b2be37")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("45a3f884-b69a-478a-a33a-9acdd86e90ed")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("c8147614-5c5c-45b2-8d04-31a8a38cb590")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Element");
        this.registerFactory(new QueryDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.usingAdditionsAtt = new UsingAdditionsSmAttribute();
        this.usingAdditionsAtt.init("UsingAdditions", this, Boolean.class );
        registerAttribute(this.usingAdditionsAtt);
        
        
        // Initialize and register the SmDependency
        this.addedDep = new AddedSmDependency();
        this.addedDep.init("Added", this, metamodel.getMClass("Element"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.addedDep);
        
        this.processorDep = new ProcessorSmDependency();
        this.processorDep.init("Processor", this, metamodel.getMClass("ExternProcessor"), 1, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.processorDep);
        
        this.parametersDep = new ParametersSmDependency();
        this.parametersDep.init("Parameters", this, metamodel.getMClass("PropertyTable"), 1, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.parametersDep);
        
        this.ownerAsLineDep = new OwnerAsLineSmDependency();
        this.ownerAsLineDep.init("OwnerAsLine", this, metamodel.getMClass("MatrixDefinition"), 0, 1 );
        registerDependency(this.ownerAsLineDep);
        
        this.ownerAsColDep = new OwnerAsColSmDependency();
        this.ownerAsColDep.init("OwnerAsCol", this, metamodel.getMClass("MatrixDefinition"), 0, 1 );
        registerDependency(this.ownerAsColDep);
        
        this.ownerAsDepthDep = new OwnerAsDepthSmDependency();
        this.ownerAsDepthDep.init("OwnerAsDepth", this, metamodel.getMClass("MatrixDefinition"), 0, 1 );
        registerDependency(this.ownerAsDepthDep);
    }

    @objid ("69d0de8d-fa99-4bf3-899c-88283ac065d0")
    public SmAttribute getUsingAdditionsAtt() {
        if (this.usingAdditionsAtt == null) {
        	this.usingAdditionsAtt = this.getAttributeDef("UsingAdditions");
        }
        return this.usingAdditionsAtt;
    }

    @objid ("a8c7969b-1bb1-409b-9deb-48557af9e52f")
    public SmDependency getAddedDep() {
        if (this.addedDep == null) {
        	this.addedDep = this.getDependencyDef("Added");
        }
        return this.addedDep;
    }

    @objid ("796b5974-8d6c-43b0-a64a-2202c0ff1092")
    public SmDependency getProcessorDep() {
        if (this.processorDep == null) {
        	this.processorDep = this.getDependencyDef("Processor");
        }
        return this.processorDep;
    }

    @objid ("82cf8f19-2a6d-4faf-b71e-fc768b6837ae")
    public SmDependency getParametersDep() {
        if (this.parametersDep == null) {
        	this.parametersDep = this.getDependencyDef("Parameters");
        }
        return this.parametersDep;
    }

    @objid ("cd39d21f-88f8-476f-a542-b686d546383c")
    public SmDependency getOwnerAsLineDep() {
        if (this.ownerAsLineDep == null) {
        	this.ownerAsLineDep = this.getDependencyDef("OwnerAsLine");
        }
        return this.ownerAsLineDep;
    }

    @objid ("9b3beb9c-b070-4a9a-a6fc-b21b83ae2195")
    public SmDependency getOwnerAsColDep() {
        if (this.ownerAsColDep == null) {
        	this.ownerAsColDep = this.getDependencyDef("OwnerAsCol");
        }
        return this.ownerAsColDep;
    }

    @objid ("0b165da6-4a9d-4993-a879-69ea7a906973")
    public SmDependency getOwnerAsDepthDep() {
        if (this.ownerAsDepthDep == null) {
        	this.ownerAsDepthDep = this.getDependencyDef("OwnerAsDepth");
        }
        return this.ownerAsDepthDep;
    }

    @objid ("6233d673-5195-4451-be62-bc918de7099c")
    private static class QueryDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("30ab3a80-e31b-4b46-9a16-4871a04da390")
        private QueryDefinitionSmClass smClass;

        @objid ("2e997968-3c1e-44c4-b118-8c0bf87f2a99")
        public QueryDefinitionObjectFactory(QueryDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("e3b10fcb-d78a-41f7-b0e4-43a99bf6a0ab")
        @Override
        public ISmObjectData createData() {
            return new QueryDefinitionData(this.smClass);
        }

        @objid ("9af8cb39-b843-4cb9-a35f-2c9a4574a88b")
        @Override
        public SmObjectImpl createImpl() {
            return new QueryDefinitionImpl();
        }

    }

    @objid ("d8666286-c374-4d3e-a3b2-a80f01355aed")
    public static class UsingAdditionsSmAttribute extends SmAttribute {
        @objid ("12f8e3ac-6004-4f05-816f-f47f34b7b1e7")
        public Object getValue(ISmObjectData data) {
            return ((QueryDefinitionData) data).mUsingAdditions;
        }

        @objid ("7b92bf83-52c3-4067-b389-65b6845b9a4b")
        public void setValue(ISmObjectData data, Object value) {
            ((QueryDefinitionData) data).mUsingAdditions = value;
        }

    }

    @objid ("b1bccc19-7580-4a2a-856d-3685fc15d6a6")
    public static class AddedSmDependency extends SmMultipleDependency {
        @objid ("a9081d96-8d27-46e5-b944-15b6df025502")
        private SmDependency symetricDep;

        @objid ("5c381729-5bc4-4ef4-b430-85a0fa8f9872")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((QueryDefinitionData)data).mAdded != null)? ((QueryDefinitionData)data).mAdded:SmMultipleDependency.EMPTY;
        }

        @objid ("112eae2f-6b02-4988-b0ae-02c3efa62ec2")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((QueryDefinitionData) data).mAdded = values;
        }

        @objid ("d79b5ce5-e8ae-48d1-aa26-6523e85dcd87")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ElementSmClass)this.getTarget()).getAddedToQueryDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4665451e-bd5c-4347-a377-8e0d6c05e106")
    public static class ProcessorSmDependency extends SmSingleDependency {
        @objid ("204c3d36-2fcd-442a-b872-6187c99b6a38")
        private SmDependency symetricDep;

        @objid ("a5074ceb-dbe8-4626-a311-fbc7aa8fc340")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((QueryDefinitionData) data).mProcessor;
        }

        @objid ("138c39dc-482e-4a76-8e92-863b80c87ba9")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((QueryDefinitionData) data).mProcessor = value;
        }

        @objid ("8aa3822a-fcff-4dbe-8518-9bbe4808fd9a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExternProcessorSmClass)this.getTarget()).getOwnerQueryDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4c495a54-8e6a-449e-9ade-43574f1c1000")
    public static class ParametersSmDependency extends SmSingleDependency {
        @objid ("4ea1d22d-4ca7-4808-951c-211685647a76")
        private SmDependency symetricDep;

        @objid ("0cfdf5a9-09db-41bb-860b-e1edf86a9958")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((QueryDefinitionData) data).mParameters;
        }

        @objid ("25345bd6-6a72-40fc-a600-fd16bea74b27")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((QueryDefinitionData) data).mParameters = value;
        }

        @objid ("ece53ca2-aca4-4a0c-9d96-bdf879a394ae")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyTableSmClass)this.getTarget()).getOwnerQueryDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7812ec6a-8934-4ecb-9127-99293ef680e1")
    public static class OwnerAsLineSmDependency extends SmSingleDependency {
        @objid ("b43870b4-28d5-4328-9d92-8307c65a877e")
        private SmDependency symetricDep;

        @objid ("53401604-7502-4a75-b8b9-bbc75d7eccca")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((QueryDefinitionData) data).mOwnerAsLine;
        }

        @objid ("e1039c25-fa7f-49cb-8435-24cc2b831e21")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((QueryDefinitionData) data).mOwnerAsLine = value;
        }

        @objid ("840f1015-465e-4e71-b6c3-78a7fadf3848")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MatrixDefinitionSmClass)this.getTarget()).getLinesDefinitionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("00806c35-9ca7-4a4e-871b-a4057c74adb6")
    public static class OwnerAsColSmDependency extends SmSingleDependency {
        @objid ("81dbaf1b-aa52-4117-90ec-a955bf11734a")
        private SmDependency symetricDep;

        @objid ("69efee31-9bde-4895-b7f2-721f2753e260")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((QueryDefinitionData) data).mOwnerAsCol;
        }

        @objid ("23013603-9698-4132-9d26-0652974a271f")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((QueryDefinitionData) data).mOwnerAsCol = value;
        }

        @objid ("5ba038c8-4b0b-40b7-a074-5c0197481555")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MatrixDefinitionSmClass)this.getTarget()).getColumnsDefinitionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("21173fb5-b11e-4d51-ad00-99c0734d2f87")
    public static class OwnerAsDepthSmDependency extends SmSingleDependency {
        @objid ("9d342758-0ba4-4120-963c-b56f2377c3c8")
        private SmDependency symetricDep;

        @objid ("0ffc8ed6-df40-44ee-bd73-68dc559d450e")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((QueryDefinitionData) data).mOwnerAsDepth;
        }

        @objid ("ce4d5ec6-a1ad-44ea-a00c-ed1fc27b0c90")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((QueryDefinitionData) data).mOwnerAsDepth = value;
        }

        @objid ("c108eae0-d796-4530-96cb-4dd2c44ed448")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MatrixDefinitionSmClass)this.getTarget()).getDepthDefinitionDep();
            }
            return this.symetricDep;
        }

    }

}
