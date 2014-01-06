/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.uml.infrastructure.matrix;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.data.uml.infrastructure.ExternProcessorData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableData;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.QueryDefinitionImpl;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("8fe79750-6ab9-4493-b4ef-2e199f7d4dea")
@SmaMetaClass(mmClass=QueryDefinition.class, factory=QueryDefinitionData.Metadata.ObjectFactory.class)
public class QueryDefinitionData extends ElementData {
    @objid ("fa661ef7-6ed6-496d-9d42-843d86c4ac12")
    @SmaMetaAttribute(metaName="UsingAdditions", type=Boolean.class, smAttributeClass=Metadata.UsingAdditionsSmAttribute.class)
     Object mUsingAdditions = true;

    @objid ("55445b9e-64b1-41d6-9467-33fb8c7dd26f")
    @SmaMetaAssociation(metaName="Added", typeDataClass=ElementData.class, min=0, max=-1, smAssociationClass=Metadata.AddedSmDependency.class, partof = true)
     List<SmObjectImpl> mAdded = null;

    @objid ("650b4af3-e8eb-4f70-8e7f-1dbfe3b1413a")
    @SmaMetaAssociation(metaName="Processor", typeDataClass=ExternProcessorData.class, min=1, max=1, smAssociationClass=Metadata.ProcessorSmDependency.class, component = true)
     SmObjectImpl mProcessor;

    @objid ("ec47f2e8-84bd-4096-8784-c7f796ece40c")
    @SmaMetaAssociation(metaName="Parameters", typeDataClass=PropertyTableData.class, min=1, max=1, smAssociationClass=Metadata.ParametersSmDependency.class, component = true)
     SmObjectImpl mParameters;

    @objid ("0dcf3b95-cb1a-4431-a7c8-7c824a81f04e")
    @SmaMetaAssociation(metaName="OwnerAsLine", typeDataClass=MatrixDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerAsLineSmDependency.class)
     SmObjectImpl mOwnerAsLine;

    @objid ("094461ff-7fcd-49f5-8eec-0b82533c79d9")
    @SmaMetaAssociation(metaName="OwnerAsCol", typeDataClass=MatrixDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerAsColSmDependency.class)
     SmObjectImpl mOwnerAsCol;

    @objid ("4edfa96f-c0f6-48e2-9c7d-398ccb0383fe")
    @SmaMetaAssociation(metaName="OwnerAsDepth", typeDataClass=MatrixDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerAsDepthSmDependency.class)
     SmObjectImpl mOwnerAsDepth;

    @objid ("f6e6f031-4537-43f8-9641-c23b2b9bf895")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("aa475d53-b639-4477-a156-b97734b6654b")
    public static class Metadata {
        @objid ("bcb312dc-d5f6-4d04-9163-5962236c9ad1")
        private static SmClass smClass = null;

        @objid ("356a74bf-e0a3-44cc-bea1-4217a610c2ae")
        private static SmAttribute UsingAdditionsAtt = null;

        @objid ("445ee403-59ef-4440-8f75-a0a18ebcfa1c")
        private static SmDependency AddedDep = null;

        @objid ("1d4c1691-37ea-4be7-9444-6bb5f202c904")
        private static SmDependency ProcessorDep = null;

        @objid ("e26551f3-63d5-43e0-a7a7-aaf47942e88d")
        private static SmDependency ParametersDep = null;

        @objid ("4ebf3ec9-c5c9-4ee0-bae3-12faa5be47c0")
        private static SmDependency OwnerAsLineDep = null;

        @objid ("70ffd87b-15df-4950-a962-aeb346e9312f")
        private static SmDependency OwnerAsColDep = null;

        @objid ("55c8d6fc-d014-4a79-914d-16814ee2a20d")
        private static SmDependency OwnerAsDepthDep = null;

        @objid ("048aab36-922c-4de0-84f0-4e4eba781e63")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(QueryDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2656b3c5-1887-451b-8e70-ea33d162fb39")
        public static SmAttribute UsingAdditionsAtt() {
            if (UsingAdditionsAtt == null) {
            	UsingAdditionsAtt = classof().getAttributeDef("UsingAdditions");
            }
            return UsingAdditionsAtt;
        }

        @objid ("bd525534-dcf2-4aad-a8dd-bb2335adfbe3")
        public static SmDependency AddedDep() {
            if (AddedDep == null) {
            	AddedDep = classof().getDependencyDef("Added");
            }
            return AddedDep;
        }

        @objid ("4ec8278d-aac4-4d4f-bf68-170eed584a5a")
        public static SmDependency ProcessorDep() {
            if (ProcessorDep == null) {
            	ProcessorDep = classof().getDependencyDef("Processor");
            }
            return ProcessorDep;
        }

        @objid ("98d4aabc-47dc-4852-aecb-f351965c4b90")
        public static SmDependency ParametersDep() {
            if (ParametersDep == null) {
            	ParametersDep = classof().getDependencyDef("Parameters");
            }
            return ParametersDep;
        }

        @objid ("817a78cb-7ee9-45c7-b0be-5d4f7aa28422")
        public static SmDependency OwnerAsLineDep() {
            if (OwnerAsLineDep == null) {
            	OwnerAsLineDep = classof().getDependencyDef("OwnerAsLine");
            }
            return OwnerAsLineDep;
        }

        @objid ("eb53fb6b-9f57-460e-b309-d8ecfa5326d2")
        public static SmDependency OwnerAsColDep() {
            if (OwnerAsColDep == null) {
            	OwnerAsColDep = classof().getDependencyDef("OwnerAsCol");
            }
            return OwnerAsColDep;
        }

        @objid ("f86cb917-8215-4e21-8da6-c060d8e83e3f")
        public static SmDependency OwnerAsDepthDep() {
            if (OwnerAsDepthDep == null) {
            	OwnerAsDepthDep = classof().getDependencyDef("OwnerAsDepth");
            }
            return OwnerAsDepthDep;
        }

        @objid ("fcd18e1f-3cd6-4aa7-bfcf-5c83fbad610f")
        public static SmDependency getParametersDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParametersDep;
        }

        @objid ("1ec6f3d8-0532-4aa6-b2a1-98e741047600")
        public static SmDependency getProcessorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessorDep;
        }

        @objid ("99f07a62-c724-44d4-abbd-10db3609cab8")
        public static SmDependency getOwnerAsDepthDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerAsDepthDep;
        }

        @objid ("85d9f6e5-52a3-4429-93f5-c501e0d57349")
        public static SmDependency getOwnerAsLineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerAsLineDep;
        }

        @objid ("2e9ce7d3-e27b-46fb-9afa-be827a5a1dc9")
        public static SmDependency getAddedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AddedDep;
        }

        @objid ("95c35e40-f4c1-40f7-98b3-1bf87855efe1")
        public static SmDependency getOwnerAsColDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerAsColDep;
        }

        @objid ("d0ddb9a6-bd8a-44fb-9ada-a7f5af30b610")
        public static SmAttribute getUsingAdditionsAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsingAdditionsAtt;
        }

        @objid ("964b5f21-e517-4b39-ace7-283dbe96d382")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1a1d705f-9fbf-40ed-ac01-67e8a1917fbe")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("848b185d-fe3a-4890-8bdc-cbe50c65ceee")
            public ISmObjectData createData() {
                return new QueryDefinitionData();
            }

            @objid ("7bc2fda9-8423-4492-b553-08176570abe9")
            public SmObjectImpl createImpl() {
                return new QueryDefinitionImpl();
            }

        }

        @objid ("c8767896-f9f7-44cb-8ce7-89da9b8856ec")
        public static class AddedSmDependency extends SmMultipleDependency {
            @objid ("cc3b5346-27c0-4088-96b2-4a93cb6dd610")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((QueryDefinitionData)data).mAdded != null)? ((QueryDefinitionData)data).mAdded:SmMultipleDependency.EMPTY;
            }

            @objid ("3942b5db-ba82-4309-b719-856157e9e359")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((QueryDefinitionData) data).mAdded = new ArrayList<>(initialCapacity);
                return ((QueryDefinitionData) data).mAdded;
            }

            @objid ("fec272ac-2b03-4492-a9f4-a3614ab2d44b")
            @Override
            public SmDependency getSymetric() {
                return ElementData.Metadata.AddedToQueryDep();
            }

        }

        @objid ("5147b9ae-0d6d-4326-828c-6879c8eea331")
        public static class ProcessorSmDependency extends SmSingleDependency {
            @objid ("1812f03c-ab71-4e91-b207-f0024ffc5ed8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mProcessor;
            }

            @objid ("5000ebca-2896-40c2-89bc-aaa085f97b31")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mProcessor = value;
            }

            @objid ("ed916605-3ecc-427f-b4d1-0c5b4aed0c05")
            @Override
            public SmDependency getSymetric() {
                return ExternProcessorData.Metadata.OwnerQueryDep();
            }

        }

        @objid ("45d924c9-eb1c-40f0-9383-4db844a25a3b")
        public static class ParametersSmDependency extends SmSingleDependency {
            @objid ("cfa0387b-da62-4794-ba47-b11a2c8f3f6a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mParameters;
            }

            @objid ("53e01229-62f7-4c12-a0bb-88833b3be82c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mParameters = value;
            }

            @objid ("26b5468e-080a-4672-881d-95712c8d318b")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableData.Metadata.OwnerQueryDep();
            }

        }

        @objid ("f7a493f1-3d47-46c6-b183-9150bfac354c")
        public static class OwnerAsLineSmDependency extends SmSingleDependency {
            @objid ("ceeb8c08-fe20-486b-96bb-8e406be11178")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mOwnerAsLine;
            }

            @objid ("f0cc5ef1-3b86-4c1d-97cd-8598d46eeb12")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mOwnerAsLine = value;
            }

            @objid ("1eb14bcb-a84b-454a-9589-f25978b25d1d")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.LinesDefinitionDep();
            }

        }

        @objid ("13d860d6-f226-4d6b-ae74-e4d241b245d5")
        public static class OwnerAsColSmDependency extends SmSingleDependency {
            @objid ("09d96ca3-4821-4f2a-8e1b-7e5910534e60")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mOwnerAsCol;
            }

            @objid ("393c9c04-817d-4138-a10f-e6978a1ede75")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mOwnerAsCol = value;
            }

            @objid ("962f48c1-5db0-47e9-a998-2413976acc13")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.ColumnsDefinitionDep();
            }

        }

        @objid ("9e961b61-f020-49c7-8a82-b690787bb142")
        public static class OwnerAsDepthSmDependency extends SmSingleDependency {
            @objid ("d36e2c14-dc37-48dc-8252-a674f61ec406")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mOwnerAsDepth;
            }

            @objid ("9cf2c9e1-81e2-4e35-869d-648a20560f9f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mOwnerAsDepth = value;
            }

            @objid ("67badfe1-245e-4401-a923-8cf4bc0d834a")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.DepthDefinitionDep();
            }

        }

        @objid ("77ab59ce-66fe-4adb-a6ed-e5749003f0bd")
        public static class UsingAdditionsSmAttribute extends SmAttribute {
            @objid ("b6347814-891f-4590-8f07-8b1cc40f40fd")
            public Object getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mUsingAdditions;
            }

            @objid ("31d4e2b1-07cf-4fb8-8b19-5def7fb15910")
            public void setValue(ISmObjectData data, Object value) {
                ((QueryDefinitionData) data).mUsingAdditions = value;
            }

        }

    }

}
