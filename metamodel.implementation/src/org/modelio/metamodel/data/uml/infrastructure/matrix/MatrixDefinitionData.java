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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixValueDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.QueryDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.MatrixDefinitionImpl;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
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

@objid ("efa02e20-bfde-4080-8f8e-4890ce002c4f")
@SmaMetaClass(mmClass=MatrixDefinition.class, factory=MatrixDefinitionData.Metadata.ObjectFactory.class)
public class MatrixDefinitionData extends ModelElementData {
    @objid ("ffb76a75-e704-4b65-a530-8bd0266f5855")
    @SmaMetaAssociation(metaName="LinesDefinition", typeDataClass=QueryDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.LinesDefinitionSmDependency.class, component = true)
     SmObjectImpl mLinesDefinition;

    @objid ("fe38e7d0-e132-420a-8f0a-a92d2c0f760d")
    @SmaMetaAssociation(metaName="ColumnsDefinition", typeDataClass=QueryDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.ColumnsDefinitionSmDependency.class, component = true)
     SmObjectImpl mColumnsDefinition;

    @objid ("e5db29cf-6284-4ee0-b8f7-43eadd7143de")
    @SmaMetaAssociation(metaName="ValuesDefinition", typeDataClass=MatrixValueDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.ValuesDefinitionSmDependency.class, component = true)
     SmObjectImpl mValuesDefinition;

    @objid ("3e46bcba-fc76-487d-852e-55cf4909d5d5")
    @SmaMetaAssociation(metaName="DepthDefinition", typeDataClass=QueryDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.DepthDefinitionSmDependency.class, component = true)
     SmObjectImpl mDepthDefinition;

    @objid ("a20393bc-386c-47c0-91cf-6215199879a3")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("fcc46ad5-a11d-4f65-9e40-0c985b10c05d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("4b1b51aa-c196-45b4-a123-80cf044667a3")
    public static class Metadata {
        @objid ("acd91cc4-3148-4ba1-a695-22cb122a7d17")
        private static SmClass smClass = null;

        @objid ("5e6a99b6-dbc2-43e6-98f3-1847680b4025")
        private static SmDependency LinesDefinitionDep = null;

        @objid ("5e456969-daba-4fd6-9126-2be255d41a57")
        private static SmDependency ColumnsDefinitionDep = null;

        @objid ("3b4f82a1-5bef-4ef0-9fdd-e17152168df4")
        private static SmDependency ValuesDefinitionDep = null;

        @objid ("acff369c-216f-4c37-ada7-30c394617fb1")
        private static SmDependency DepthDefinitionDep = null;

        @objid ("b6ce83be-7a37-4362-b454-e8c612709b93")
        private static SmDependency OwnerDep = null;

        @objid ("e1d370c0-b2b4-473b-8acc-5e17413c2fe9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MatrixDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d1c484d6-9500-46d9-b080-6a2958393ff1")
        public static SmDependency LinesDefinitionDep() {
            if (LinesDefinitionDep == null) {
            	LinesDefinitionDep = classof().getDependencyDef("LinesDefinition");
            }
            return LinesDefinitionDep;
        }

        @objid ("c4cebb08-2021-49f5-ad38-ca751997a90c")
        public static SmDependency ColumnsDefinitionDep() {
            if (ColumnsDefinitionDep == null) {
            	ColumnsDefinitionDep = classof().getDependencyDef("ColumnsDefinition");
            }
            return ColumnsDefinitionDep;
        }

        @objid ("5fbeb93d-601e-4bf1-9b4a-e36d49096d13")
        public static SmDependency ValuesDefinitionDep() {
            if (ValuesDefinitionDep == null) {
            	ValuesDefinitionDep = classof().getDependencyDef("ValuesDefinition");
            }
            return ValuesDefinitionDep;
        }

        @objid ("8b201d8b-d74a-45f6-9ed1-00502fb07f7f")
        public static SmDependency DepthDefinitionDep() {
            if (DepthDefinitionDep == null) {
            	DepthDefinitionDep = classof().getDependencyDef("DepthDefinition");
            }
            return DepthDefinitionDep;
        }

        @objid ("be8af281-840e-4f73-89a8-95ebfb4bddea")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("46b200a0-9c74-43f8-91cb-8f071494b0e5")
        public static SmDependency getLinesDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinesDefinitionDep;
        }

        @objid ("d185395a-ae1e-4018-b045-b1c75efff9f3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("426a552c-248e-4208-84f0-4dd29f031a1b")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("e33e4d85-c348-4091-a396-f322a8cf6e68")
        public static SmDependency getDepthDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DepthDefinitionDep;
        }

        @objid ("5f6d6ec8-0855-4269-ba87-4c1f60bd5ced")
        public static SmDependency getColumnsDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ColumnsDefinitionDep;
        }

        @objid ("69b8efb9-074b-4482-963b-730e1cca88b9")
        public static SmDependency getValuesDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValuesDefinitionDep;
        }

        @objid ("353e49f4-e6ba-442b-b348-551f0f3991ee")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("52c8139c-0979-4597-bd8a-a42d94ee042c")
            public ISmObjectData createData() {
                return new MatrixDefinitionData();
            }

            @objid ("7ee2e0a6-f5cf-4a13-9f58-ac98893174c4")
            public SmObjectImpl createImpl() {
                return new MatrixDefinitionImpl();
            }

        }

        @objid ("312268ab-8ce0-4d47-90d0-a97cbca8adca")
        public static class LinesDefinitionSmDependency extends SmSingleDependency {
            @objid ("4ad5c6b4-93d0-4191-a7d3-09c5d18d3f9a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mLinesDefinition;
            }

            @objid ("5164aa8b-5e16-484d-af9c-04d9035d84e7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mLinesDefinition = value;
            }

            @objid ("db04bd17-0648-4ed7-9b3c-f46ce70695ca")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.OwnerAsLineDep();
            }

        }

        @objid ("c3a35f5a-6379-417c-af79-50498ad3df45")
        public static class ColumnsDefinitionSmDependency extends SmSingleDependency {
            @objid ("d9f77428-0bcf-4657-b6c3-544d0be019ca")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mColumnsDefinition;
            }

            @objid ("659ecd89-7cb4-4cfb-97f2-8ed4d822561e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mColumnsDefinition = value;
            }

            @objid ("54eeee40-4858-4735-97ae-f68f37aa4885")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.OwnerAsColDep();
            }

        }

        @objid ("06bf0d03-447d-4f15-8333-edc44face5af")
        public static class ValuesDefinitionSmDependency extends SmSingleDependency {
            @objid ("a94109b7-b062-455d-be32-0373aa10a47d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mValuesDefinition;
            }

            @objid ("00dfd84f-a6cf-400c-9778-85d15a74404c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mValuesDefinition = value;
            }

            @objid ("470bf948-c78a-4c91-890d-1d313a0a9986")
            @Override
            public SmDependency getSymetric() {
                return MatrixValueDefinitionData.Metadata.MatrixDep();
            }

        }

        @objid ("f06d0a77-a0ef-46ad-ae4a-f028f49d5f9e")
        public static class DepthDefinitionSmDependency extends SmSingleDependency {
            @objid ("8d32a2c7-8685-4364-92ee-0e941d85bc0a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mDepthDefinition;
            }

            @objid ("00ff5a07-354b-4de5-bb08-e0fab396bf5d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mDepthDefinition = value;
            }

            @objid ("7bb633bd-69ac-4aad-bdf6-c8a0bf145a26")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.OwnerAsDepthDep();
            }

        }

        @objid ("7b02d436-855a-4d70-8808-3284764c5f6d")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("e2566cd6-dcc0-4ac8-80e9-20755c8815f1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mOwner;
            }

            @objid ("08fe465b-1b65-4d8e-ba8c-f2a87295ea01")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mOwner = value;
            }

            @objid ("138cdb5c-6d6c-434d-83aa-0bd52f102e1e")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.MatrixDep();
            }

        }

    }

}
