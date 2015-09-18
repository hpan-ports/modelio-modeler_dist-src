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
/*   Metamodel version: 9022              */
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
    @objid ("ce391e11-92fc-4707-947c-b8bae8cb4587")
    @SmaMetaAttribute(metaName="UsingAdditions", type=Boolean.class, smAttributeClass=Metadata.UsingAdditionsSmAttribute.class)
     Object mUsingAdditions = true;

    @objid ("8bd4befc-6362-4d6e-abb9-db441ca45016")
    @SmaMetaAssociation(metaName="Added", typeDataClass=ElementData.class, min=0, max=-1, smAssociationClass=Metadata.AddedSmDependency.class, partof = true)
     List<SmObjectImpl> mAdded = null;

    @objid ("9ef9804f-ca5b-42c7-ad4e-493a10fef464")
    @SmaMetaAssociation(metaName="Processor", typeDataClass=ExternProcessorData.class, min=1, max=1, smAssociationClass=Metadata.ProcessorSmDependency.class, component = true)
     SmObjectImpl mProcessor;

    @objid ("684f417a-6be0-44fe-a976-36d1b1c87370")
    @SmaMetaAssociation(metaName="Parameters", typeDataClass=PropertyTableData.class, min=1, max=1, smAssociationClass=Metadata.ParametersSmDependency.class, component = true)
     SmObjectImpl mParameters;

    @objid ("b502f1f1-8d24-449e-93de-629fe9ec6372")
    @SmaMetaAssociation(metaName="OwnerAsLine", typeDataClass=MatrixDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerAsLineSmDependency.class)
     SmObjectImpl mOwnerAsLine;

    @objid ("09c4ed0b-a2e2-4459-85b3-052a7fe1487d")
    @SmaMetaAssociation(metaName="OwnerAsCol", typeDataClass=MatrixDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerAsColSmDependency.class)
     SmObjectImpl mOwnerAsCol;

    @objid ("7147a9bb-4b72-480d-aab6-04d19f4efdd0")
    @SmaMetaAssociation(metaName="OwnerAsDepth", typeDataClass=MatrixDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerAsDepthSmDependency.class)
     SmObjectImpl mOwnerAsDepth;

    @objid ("65df300f-c94f-4f76-ba8e-2a7926391a46")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("aa475d53-b639-4477-a156-b97734b6654b")
    public static class Metadata {
        @objid ("34e4838f-c468-4f65-bc77-29ace120a76b")
        private static SmClass smClass = null;

        @objid ("58f5c20b-5540-4a80-a461-206c3f1d2c48")
        private static SmAttribute UsingAdditionsAtt = null;

        @objid ("9d42d02b-3a22-4f11-b977-fd4313bacb5b")
        private static SmDependency AddedDep = null;

        @objid ("705a36f3-975a-4644-aca2-9ae1031ca0dd")
        private static SmDependency ProcessorDep = null;

        @objid ("03edda0f-6393-4791-b81d-78147501e50a")
        private static SmDependency ParametersDep = null;

        @objid ("3957bddc-2e6d-49a7-925d-07f6f85d693a")
        private static SmDependency OwnerAsLineDep = null;

        @objid ("f547ec21-e4e5-49ba-875c-3ace89c4914b")
        private static SmDependency OwnerAsColDep = null;

        @objid ("1cf8cfa8-d7fb-41ad-81e8-de6794ee871d")
        private static SmDependency OwnerAsDepthDep = null;

        @objid ("aac91b83-8249-4e46-9ea3-e9ed79e339c2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(QueryDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("505f8613-76fd-4582-94cc-f61193531a50")
        public static SmAttribute UsingAdditionsAtt() {
            if (UsingAdditionsAtt == null) {
            	UsingAdditionsAtt = classof().getAttributeDef("UsingAdditions");
            }
            return UsingAdditionsAtt;
        }

        @objid ("18f28958-1276-4ef9-bc06-1be4bbfe88de")
        public static SmDependency AddedDep() {
            if (AddedDep == null) {
            	AddedDep = classof().getDependencyDef("Added");
            }
            return AddedDep;
        }

        @objid ("d85efbe0-5ef0-4114-bd95-2f3b4405dd6c")
        public static SmDependency ProcessorDep() {
            if (ProcessorDep == null) {
            	ProcessorDep = classof().getDependencyDef("Processor");
            }
            return ProcessorDep;
        }

        @objid ("3de7d067-e3ac-47e5-83e7-adc0144ff485")
        public static SmDependency ParametersDep() {
            if (ParametersDep == null) {
            	ParametersDep = classof().getDependencyDef("Parameters");
            }
            return ParametersDep;
        }

        @objid ("390cf022-8a2e-41c6-804d-64154476b9e3")
        public static SmDependency OwnerAsLineDep() {
            if (OwnerAsLineDep == null) {
            	OwnerAsLineDep = classof().getDependencyDef("OwnerAsLine");
            }
            return OwnerAsLineDep;
        }

        @objid ("e60b179a-c073-426f-8b5f-d10a0ee8a98e")
        public static SmDependency OwnerAsColDep() {
            if (OwnerAsColDep == null) {
            	OwnerAsColDep = classof().getDependencyDef("OwnerAsCol");
            }
            return OwnerAsColDep;
        }

        @objid ("6da48578-27b4-495e-8013-651c5d3ce5aa")
        public static SmDependency OwnerAsDepthDep() {
            if (OwnerAsDepthDep == null) {
            	OwnerAsDepthDep = classof().getDependencyDef("OwnerAsDepth");
            }
            return OwnerAsDepthDep;
        }

        @objid ("776c37d4-effd-41eb-a04d-0a819335b50c")
        public static SmDependency getOwnerAsColDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerAsColDep;
        }

        @objid ("a7eb57f1-5ca2-42fa-956b-864b2e85cdac")
        public static SmDependency getProcessorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessorDep;
        }

        @objid ("35af642c-f4a6-42b8-bab4-690aeff16a63")
        public static SmAttribute getUsingAdditionsAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsingAdditionsAtt;
        }

        @objid ("4edb87d4-74eb-4209-893a-e095300fa58b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8c2e84c5-83c9-4316-8ce5-62ec5db2cced")
        public static SmDependency getParametersDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParametersDep;
        }

        @objid ("cb9653b7-3251-44cd-a8cf-8afae0f6e44e")
        public static SmDependency getAddedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AddedDep;
        }

        @objid ("b17d07fb-1411-42f2-8298-8e5a2f06008a")
        public static SmDependency getOwnerAsDepthDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerAsDepthDep;
        }

        @objid ("abcb22c0-f580-4711-b791-d93eb136db3c")
        public static SmDependency getOwnerAsLineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerAsLineDep;
        }

        @objid ("1a1d705f-9fbf-40ed-ac01-67e8a1917fbe")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a2641a59-457e-4c11-aa65-2f9ad572010a")
            public ISmObjectData createData() {
                return new QueryDefinitionData();
            }

            @objid ("9e8e3f46-e29a-4dc0-be0b-1c932ca87baf")
            public SmObjectImpl createImpl() {
                return new QueryDefinitionImpl();
            }

        }

        @objid ("c8767896-f9f7-44cb-8ce7-89da9b8856ec")
        public static class AddedSmDependency extends SmMultipleDependency {
            @objid ("96e440a1-5489-4a59-8823-549c7d1f54cc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((QueryDefinitionData)data).mAdded != null)? ((QueryDefinitionData)data).mAdded:SmMultipleDependency.EMPTY;
            }

            @objid ("8fea80da-12f7-4a5c-9252-0d5e69f4e975")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((QueryDefinitionData) data).mAdded = new ArrayList<>(initialCapacity);
                return ((QueryDefinitionData) data).mAdded;
            }

            @objid ("a70038f4-2528-4cc2-ba6b-2c40392741b1")
            @Override
            public SmDependency getSymetric() {
                return ElementData.Metadata.AddedToQueryDep();
            }

        }

        @objid ("5147b9ae-0d6d-4326-828c-6879c8eea331")
        public static class ProcessorSmDependency extends SmSingleDependency {
            @objid ("276fac8a-7e9a-4192-b709-ab5d8cbdba04")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mProcessor;
            }

            @objid ("158c6e37-1a61-4201-9891-20bb6160ceb2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mProcessor = value;
            }

            @objid ("453b441c-5908-49ce-b828-7d7adb3ba6be")
            @Override
            public SmDependency getSymetric() {
                return ExternProcessorData.Metadata.OwnerQueryDep();
            }

        }

        @objid ("45d924c9-eb1c-40f0-9383-4db844a25a3b")
        public static class ParametersSmDependency extends SmSingleDependency {
            @objid ("e70d30d4-e1cc-4386-9d98-56cc48468f77")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mParameters;
            }

            @objid ("2434ebce-d07f-431e-893d-24f2f58d5064")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mParameters = value;
            }

            @objid ("9b2f95d7-9920-473d-ae1f-5b0f2763eae6")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableData.Metadata.OwnerQueryDep();
            }

        }

        @objid ("f7a493f1-3d47-46c6-b183-9150bfac354c")
        public static class OwnerAsLineSmDependency extends SmSingleDependency {
            @objid ("5ac8f652-fafc-4ae3-9fd2-8a3d7e61f336")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mOwnerAsLine;
            }

            @objid ("a963994b-b203-4c17-98a5-3f5aee998eb8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mOwnerAsLine = value;
            }

            @objid ("c5965dd1-b246-401a-83ee-ca620f0abe84")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.LinesDefinitionDep();
            }

        }

        @objid ("13d860d6-f226-4d6b-ae74-e4d241b245d5")
        public static class OwnerAsColSmDependency extends SmSingleDependency {
            @objid ("261a8c26-aee5-4933-bd2e-7bcf2a71093c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mOwnerAsCol;
            }

            @objid ("cccad19b-b1fe-42e0-affc-f222309d0535")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mOwnerAsCol = value;
            }

            @objid ("f146860d-f89b-4b47-b5ca-cc6789809692")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.ColumnsDefinitionDep();
            }

        }

        @objid ("9e961b61-f020-49c7-8a82-b690787bb142")
        public static class OwnerAsDepthSmDependency extends SmSingleDependency {
            @objid ("80fcc354-a309-4878-92b9-07504fce50b7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mOwnerAsDepth;
            }

            @objid ("2d37c0ce-c9ca-47e4-8cc7-68175f336ddb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((QueryDefinitionData) data).mOwnerAsDepth = value;
            }

            @objid ("dc2c4e0a-8f4c-4cb7-aef6-0e27dfed5b67")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.DepthDefinitionDep();
            }

        }

        @objid ("77ab59ce-66fe-4adb-a6ed-e5749003f0bd")
        public static class UsingAdditionsSmAttribute extends SmAttribute {
            @objid ("cd770b7a-5dbe-42e0-b515-ad4cbc1ec32b")
            public Object getValue(ISmObjectData data) {
                return ((QueryDefinitionData) data).mUsingAdditions;
            }

            @objid ("55806a69-79d6-4649-a03e-d728418f30f7")
            public void setValue(ISmObjectData data, Object value) {
                ((QueryDefinitionData) data).mUsingAdditions = value;
            }

        }

    }

}
