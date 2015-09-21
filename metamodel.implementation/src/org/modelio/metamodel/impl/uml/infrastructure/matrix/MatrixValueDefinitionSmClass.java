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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ExternProcessorSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.MatrixDefinitionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableSmClass;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
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

@objid ("85101926-43cd-4c85-8d01-10d896562bcf")
public class MatrixValueDefinitionSmClass extends ElementSmClass {
    @objid ("beaa4713-640c-4760-b305-ff12cac20151")
    private SmDependency processorDep;

    @objid ("6a5c68f9-6b83-4c09-ac52-7df714ae3c53")
    private SmDependency parametersDep;

    @objid ("767bd169-cd76-4f39-a5f1-401495fb4c00")
    private SmDependency matrixDep;

    @objid ("86a7543e-0ee4-49ae-80eb-ae825ab29c93")
    public MatrixValueDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("7076884c-97f6-4afd-8024-a5c66972b0b7")
    @Override
    public String getName() {
        return "MatrixValueDefinition";
    }

    @objid ("4a6c0f36-60f9-4bcd-9c75-1b798989e76d")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("431ceba3-bcb4-4e11-8cf1-4dcb50d401a4")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return MatrixValueDefinition.class;
    }

    @objid ("f2ea7ec3-21ec-45b8-9812-60cd0fd507a5")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("0954b0b5-847f-4288-9424-627c907f962d")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("06858b39-2afa-44aa-8e51-77320598599c")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Element");
        this.registerFactory(new MatrixValueDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.processorDep = new ProcessorSmDependency();
        this.processorDep.init("Processor", this, metamodel.getMClass("ExternProcessor"), 1, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.processorDep);
        
        this.parametersDep = new ParametersSmDependency();
        this.parametersDep.init("Parameters", this, metamodel.getMClass("PropertyTable"), 1, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.parametersDep);
        
        this.matrixDep = new MatrixSmDependency();
        this.matrixDep.init("Matrix", this, metamodel.getMClass("MatrixDefinition"), 1, 1 );
        registerDependency(this.matrixDep);
    }

    @objid ("90d92fc1-b47a-4900-8ddb-38302169c2fa")
    public SmDependency getProcessorDep() {
        if (this.processorDep == null) {
        	this.processorDep = this.getDependencyDef("Processor");
        }
        return this.processorDep;
    }

    @objid ("c2697813-e833-40ff-9993-2419182a7745")
    public SmDependency getParametersDep() {
        if (this.parametersDep == null) {
        	this.parametersDep = this.getDependencyDef("Parameters");
        }
        return this.parametersDep;
    }

    @objid ("911083f9-777b-449b-8eaf-3dd10f03e4f5")
    public SmDependency getMatrixDep() {
        if (this.matrixDep == null) {
        	this.matrixDep = this.getDependencyDef("Matrix");
        }
        return this.matrixDep;
    }

    @objid ("afb8312e-9035-4289-b27d-58710e8d8031")
    private static class MatrixValueDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("3a93889e-3ad2-4300-9d7f-2c8de48839b0")
        private MatrixValueDefinitionSmClass smClass;

        @objid ("e382e173-7d56-4e64-8b54-21330d260bf3")
        public MatrixValueDefinitionObjectFactory(MatrixValueDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("d3892ad5-60fa-4b91-9116-c26023de5f0b")
        @Override
        public ISmObjectData createData() {
            return new MatrixValueDefinitionData(this.smClass);
        }

        @objid ("898bead1-eacb-4111-83ff-4ef09b589947")
        @Override
        public SmObjectImpl createImpl() {
            return new MatrixValueDefinitionImpl();
        }

    }

    @objid ("c47f074d-807f-4050-8c58-ba0d8c88b539")
    public static class ProcessorSmDependency extends SmSingleDependency {
        @objid ("c42c70b0-19cc-4e4b-b9c0-97924474c24a")
        private SmDependency symetricDep;

        @objid ("77de6014-f636-4ab6-aa72-b4cfd5fdfd44")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MatrixValueDefinitionData) data).mProcessor;
        }

        @objid ("2319db58-5e7d-4470-bcc7-12402749fdee")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MatrixValueDefinitionData) data).mProcessor = value;
        }

        @objid ("b94e0ee9-71e4-4c3b-9a0e-2cf95e7e9ddb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExternProcessorSmClass)this.getTarget()).getOwnerValDefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4bd916ae-68ef-4f7f-9237-3194a5981c21")
    public static class ParametersSmDependency extends SmSingleDependency {
        @objid ("c6317c60-193e-448c-afc5-2ceac96236f4")
        private SmDependency symetricDep;

        @objid ("46a13400-29f4-4b4c-97fb-47732b2d957e")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MatrixValueDefinitionData) data).mParameters;
        }

        @objid ("d21c85c6-fea3-4f38-beff-70af2855fdac")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MatrixValueDefinitionData) data).mParameters = value;
        }

        @objid ("067d9fc9-ba40-4e30-9d8e-57c1cec6b849")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyTableSmClass)this.getTarget()).getOwnerValDefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("15aa2071-e2c8-4ee7-9056-9a0b512e1130")
    public static class MatrixSmDependency extends SmSingleDependency {
        @objid ("5bd376c2-f435-44b8-95ae-7b51ca2420f2")
        private SmDependency symetricDep;

        @objid ("f6400edd-7b29-444d-8e00-b438d96eb47a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MatrixValueDefinitionData) data).mMatrix;
        }

        @objid ("95abe688-5b0c-43d8-a517-9a1b29c5c337")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MatrixValueDefinitionData) data).mMatrix = value;
        }

        @objid ("cb6e16c4-7c70-4e95-8c24-fe3296ea5a04")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MatrixDefinitionSmClass)this.getTarget()).getValuesDefinitionDep();
            }
            return this.symetricDep;
        }

    }

}
