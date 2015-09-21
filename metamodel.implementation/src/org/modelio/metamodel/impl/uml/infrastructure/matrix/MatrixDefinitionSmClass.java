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
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.MatrixValueDefinitionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.QueryDefinitionSmClass;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
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

@objid ("2e3cf8ca-2a31-49dc-9304-38b05b812c6c")
public class MatrixDefinitionSmClass extends ModelElementSmClass {
    @objid ("bc1af573-1733-417d-850f-31a7f2cb3d2e")
    private SmDependency linesDefinitionDep;

    @objid ("9f5f4f20-c716-4818-9045-4a57f6743aad")
    private SmDependency columnsDefinitionDep;

    @objid ("3adb9e8b-782f-4544-a266-b938665e8636")
    private SmDependency valuesDefinitionDep;

    @objid ("4970291c-4500-496d-833c-6cc5b70b5a5e")
    private SmDependency depthDefinitionDep;

    @objid ("3b2b8525-7046-4841-82b5-94b676da6417")
    private SmDependency ownerDep;

    @objid ("47718e1a-2bba-4a93-8389-e45015855ef9")
    public MatrixDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("de4b05bc-b405-40a1-893b-14916d43ad89")
    @Override
    public String getName() {
        return "MatrixDefinition";
    }

    @objid ("6e8b01dd-9c90-4bd8-8f8a-05e5232e87ec")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("9bdc0ebc-e290-4953-a06e-2ea89d2a8515")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return MatrixDefinition.class;
    }

    @objid ("bf3fdfdd-f7cc-4afe-bfe2-3a7cefdc5274")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("d03e3fb0-4067-48cc-a9d6-e0f8395f2a46")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("2dd1a835-560b-428f-8063-1ed6184feda0")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new MatrixDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.linesDefinitionDep = new LinesDefinitionSmDependency();
        this.linesDefinitionDep.init("LinesDefinition", this, metamodel.getMClass("QueryDefinition"), 1, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.linesDefinitionDep);
        
        this.columnsDefinitionDep = new ColumnsDefinitionSmDependency();
        this.columnsDefinitionDep.init("ColumnsDefinition", this, metamodel.getMClass("QueryDefinition"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.columnsDefinitionDep);
        
        this.valuesDefinitionDep = new ValuesDefinitionSmDependency();
        this.valuesDefinitionDep.init("ValuesDefinition", this, metamodel.getMClass("MatrixValueDefinition"), 1, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.valuesDefinitionDep);
        
        this.depthDefinitionDep = new DepthDefinitionSmDependency();
        this.depthDefinitionDep.init("DepthDefinition", this, metamodel.getMClass("QueryDefinition"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.depthDefinitionDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("ModelElement"), 1, 1 );
        registerDependency(this.ownerDep);
    }

    @objid ("dafe262d-25bd-4e6b-9b87-618cca6ced43")
    public SmDependency getLinesDefinitionDep() {
        if (this.linesDefinitionDep == null) {
        	this.linesDefinitionDep = this.getDependencyDef("LinesDefinition");
        }
        return this.linesDefinitionDep;
    }

    @objid ("b8022cad-d8c0-4477-8ad3-ad712d1bb210")
    public SmDependency getColumnsDefinitionDep() {
        if (this.columnsDefinitionDep == null) {
        	this.columnsDefinitionDep = this.getDependencyDef("ColumnsDefinition");
        }
        return this.columnsDefinitionDep;
    }

    @objid ("fcb78106-37a6-43c5-9297-f4f947d462db")
    public SmDependency getValuesDefinitionDep() {
        if (this.valuesDefinitionDep == null) {
        	this.valuesDefinitionDep = this.getDependencyDef("ValuesDefinition");
        }
        return this.valuesDefinitionDep;
    }

    @objid ("0a158929-360d-4082-968e-9158cfdb4b62")
    public SmDependency getDepthDefinitionDep() {
        if (this.depthDefinitionDep == null) {
        	this.depthDefinitionDep = this.getDependencyDef("DepthDefinition");
        }
        return this.depthDefinitionDep;
    }

    @objid ("506ba817-b624-46b3-b127-d520a410cfed")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("48a4fe1c-7386-4fae-aa75-51a1f15731c9")
    private static class MatrixDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("a3fee401-940b-4bc2-9792-2dc239e65ced")
        private MatrixDefinitionSmClass smClass;

        @objid ("91b8d436-cca9-408a-a6ec-7f3138e9d1db")
        public MatrixDefinitionObjectFactory(MatrixDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("421200e7-1d98-4d91-a80d-f511e978b74b")
        @Override
        public ISmObjectData createData() {
            return new MatrixDefinitionData(this.smClass);
        }

        @objid ("466889e5-6f47-4669-96ec-cbbd1f98cbc4")
        @Override
        public SmObjectImpl createImpl() {
            return new MatrixDefinitionImpl();
        }

    }

    @objid ("260239cd-a6dc-4511-8631-5d9f6eefb235")
    public static class LinesDefinitionSmDependency extends SmSingleDependency {
        @objid ("d8941481-eb64-4140-a8c9-5d60c3530bff")
        private SmDependency symetricDep;

        @objid ("4c26768f-4b00-4d64-8b99-fa7140dea1ab")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MatrixDefinitionData) data).mLinesDefinition;
        }

        @objid ("7b2aea45-7501-42b0-af37-833ca76de892")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MatrixDefinitionData) data).mLinesDefinition = value;
        }

        @objid ("53b64ff1-b5e2-4b12-918d-1e4ad450bc52")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((QueryDefinitionSmClass)this.getTarget()).getOwnerAsLineDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3e90066e-f09b-4830-9bb9-e59815292f6a")
    public static class ColumnsDefinitionSmDependency extends SmSingleDependency {
        @objid ("34fc3796-837b-4b1e-940a-406bac6455b6")
        private SmDependency symetricDep;

        @objid ("330fa287-ccb4-48b6-b734-88891c0ae47f")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MatrixDefinitionData) data).mColumnsDefinition;
        }

        @objid ("08d88bb9-9770-40cb-9fe3-77a24ecff5eb")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MatrixDefinitionData) data).mColumnsDefinition = value;
        }

        @objid ("74ee2379-4236-41ba-8e40-3fe2ed1a6c86")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((QueryDefinitionSmClass)this.getTarget()).getOwnerAsColDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3a18b0bc-9763-435d-87b8-8a974fa71c51")
    public static class ValuesDefinitionSmDependency extends SmSingleDependency {
        @objid ("219fabca-72bd-4ab1-8d5a-094ecd028b12")
        private SmDependency symetricDep;

        @objid ("a6aa7eb9-9af4-4b6f-aec3-cd5aedc68991")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MatrixDefinitionData) data).mValuesDefinition;
        }

        @objid ("c4afe759-e3c3-4729-be9e-f129fe7de140")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MatrixDefinitionData) data).mValuesDefinition = value;
        }

        @objid ("f6d058a9-b6cc-4474-983c-d5d898064bbe")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MatrixValueDefinitionSmClass)this.getTarget()).getMatrixDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("8a35bb0d-de9f-43ba-94a9-b3d31909586b")
    public static class DepthDefinitionSmDependency extends SmSingleDependency {
        @objid ("fc132ab8-2e44-4743-8faf-ef0c72b86e60")
        private SmDependency symetricDep;

        @objid ("a4e0952a-1c97-4aa1-8b3d-746014c5dc81")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MatrixDefinitionData) data).mDepthDefinition;
        }

        @objid ("9e022619-e13a-49a5-b885-dada40e4e83e")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MatrixDefinitionData) data).mDepthDefinition = value;
        }

        @objid ("99fb6065-cd48-4304-852a-f27e482bb716")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((QueryDefinitionSmClass)this.getTarget()).getOwnerAsDepthDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6cd8f4de-792f-45ec-b931-002e7d2ede5c")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("d3a4717e-a13a-4111-9e28-1ca5533989ee")
        private SmDependency symetricDep;

        @objid ("189f7c7e-2770-431b-a83d-b9b21ef9c9a0")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MatrixDefinitionData) data).mOwner;
        }

        @objid ("9e29994f-16ed-473e-944f-06e581a6f8f5")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MatrixDefinitionData) data).mOwner = value;
        }

        @objid ("c456e55d-503c-4c06-9220-a8f494c58f32")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getMatrixDep();
            }
            return this.symetricDep;
        }

    }

}
