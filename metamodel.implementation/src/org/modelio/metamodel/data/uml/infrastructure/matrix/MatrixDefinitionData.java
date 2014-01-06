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
    @objid ("8d6a0cdd-c535-4fe0-a717-f53100517943")
    @SmaMetaAssociation(metaName="LinesDefinition", typeDataClass=QueryDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.LinesDefinitionSmDependency.class, component = true)
     SmObjectImpl mLinesDefinition;

    @objid ("45381190-302a-4d9a-a06e-4b00f768cc98")
    @SmaMetaAssociation(metaName="ColumnsDefinition", typeDataClass=QueryDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.ColumnsDefinitionSmDependency.class, component = true)
     SmObjectImpl mColumnsDefinition;

    @objid ("59afb1de-ed20-4173-9cc8-0a064f054cd7")
    @SmaMetaAssociation(metaName="ValuesDefinition", typeDataClass=MatrixValueDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.ValuesDefinitionSmDependency.class, component = true)
     SmObjectImpl mValuesDefinition;

    @objid ("4de00df7-24db-4bb3-87c9-2e65316ab6f6")
    @SmaMetaAssociation(metaName="DepthDefinition", typeDataClass=QueryDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.DepthDefinitionSmDependency.class, component = true)
     SmObjectImpl mDepthDefinition;

    @objid ("bfcf94ab-ef6c-4280-9c0d-dc5847cc5bcb")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("63de8f9b-a73d-4261-91f9-120e530a8be2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("4b1b51aa-c196-45b4-a123-80cf044667a3")
    public static class Metadata {
        @objid ("8f4a7a4c-b69b-4026-bf37-a21e65dabba0")
        private static SmClass smClass = null;

        @objid ("20dcbd17-17fa-4c50-bc98-0afdef24d6db")
        private static SmDependency LinesDefinitionDep = null;

        @objid ("501c3b01-3867-4ecb-a341-ef3864de9bf2")
        private static SmDependency ColumnsDefinitionDep = null;

        @objid ("321bfc87-b53f-4994-9608-3fde2e7c5f91")
        private static SmDependency ValuesDefinitionDep = null;

        @objid ("ae8a74d9-13fd-40d1-9e46-bc2244a13842")
        private static SmDependency DepthDefinitionDep = null;

        @objid ("3ee9a733-8a6b-413b-aa71-1ba7f882ba03")
        private static SmDependency OwnerDep = null;

        @objid ("72ac9f50-8fb5-4a08-b783-d587e944c3c6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MatrixDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c893881f-a397-4ddb-be3c-59c8eb4c3f09")
        public static SmDependency LinesDefinitionDep() {
            if (LinesDefinitionDep == null) {
            	LinesDefinitionDep = classof().getDependencyDef("LinesDefinition");
            }
            return LinesDefinitionDep;
        }

        @objid ("9c571250-2564-400b-ad87-669924d2f673")
        public static SmDependency ColumnsDefinitionDep() {
            if (ColumnsDefinitionDep == null) {
            	ColumnsDefinitionDep = classof().getDependencyDef("ColumnsDefinition");
            }
            return ColumnsDefinitionDep;
        }

        @objid ("310c5297-dee8-4320-bd7c-febf86ebde7c")
        public static SmDependency ValuesDefinitionDep() {
            if (ValuesDefinitionDep == null) {
            	ValuesDefinitionDep = classof().getDependencyDef("ValuesDefinition");
            }
            return ValuesDefinitionDep;
        }

        @objid ("06318f18-89f5-465a-873a-65c1df0a8729")
        public static SmDependency DepthDefinitionDep() {
            if (DepthDefinitionDep == null) {
            	DepthDefinitionDep = classof().getDependencyDef("DepthDefinition");
            }
            return DepthDefinitionDep;
        }

        @objid ("2b248e05-01a2-4848-8d89-9d6d8e87bb10")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("b10842ba-4af2-4977-b8e3-602b15a0d1d4")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("6ba881f6-1801-4976-baff-7881f4d2764d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d0dd16f3-89c8-4c9e-8169-adf75cc31e89")
        public static SmDependency getLinesDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinesDefinitionDep;
        }

        @objid ("0aa74826-00c4-4908-9ec2-b679b1c0fa35")
        public static SmDependency getDepthDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DepthDefinitionDep;
        }

        @objid ("cb12fdf8-2a35-40c3-91f6-ee2cf3197454")
        public static SmDependency getValuesDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValuesDefinitionDep;
        }

        @objid ("935860c4-c692-4716-ac86-571e7203252e")
        public static SmDependency getColumnsDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ColumnsDefinitionDep;
        }

        @objid ("353e49f4-e6ba-442b-b348-551f0f3991ee")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1a0f416e-e8e6-487e-a34b-6649539ff17b")
            public ISmObjectData createData() {
                return new MatrixDefinitionData();
            }

            @objid ("ce59ffe3-3745-4746-9670-8351bb979eba")
            public SmObjectImpl createImpl() {
                return new MatrixDefinitionImpl();
            }

        }

        @objid ("312268ab-8ce0-4d47-90d0-a97cbca8adca")
        public static class LinesDefinitionSmDependency extends SmSingleDependency {
            @objid ("c075da58-9434-45f8-b7d5-6f4fedfe0dfa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mLinesDefinition;
            }

            @objid ("2b070347-e802-4805-95bc-dda905a3e746")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mLinesDefinition = value;
            }

            @objid ("e95b2d92-9fde-4031-a352-f871cb3e3cc3")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.OwnerAsLineDep();
            }

        }

        @objid ("c3a35f5a-6379-417c-af79-50498ad3df45")
        public static class ColumnsDefinitionSmDependency extends SmSingleDependency {
            @objid ("1f6a13f9-65da-4985-9cab-ec5854321967")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mColumnsDefinition;
            }

            @objid ("6b53dcfb-7e74-4016-96ff-74dd2c116188")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mColumnsDefinition = value;
            }

            @objid ("83307f8d-f356-4514-94b6-3adbbd5787e9")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.OwnerAsColDep();
            }

        }

        @objid ("06bf0d03-447d-4f15-8333-edc44face5af")
        public static class ValuesDefinitionSmDependency extends SmSingleDependency {
            @objid ("30c0ea63-2eb0-4e1b-bf69-5b5cace3d7e2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mValuesDefinition;
            }

            @objid ("78d1e77a-8422-41fa-8d0f-8dd030041537")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mValuesDefinition = value;
            }

            @objid ("1534a17b-fb7d-4a21-8c08-a198580ceefe")
            @Override
            public SmDependency getSymetric() {
                return MatrixValueDefinitionData.Metadata.MatrixDep();
            }

        }

        @objid ("f06d0a77-a0ef-46ad-ae4a-f028f49d5f9e")
        public static class DepthDefinitionSmDependency extends SmSingleDependency {
            @objid ("02d6d039-38e4-4453-99bf-fe3e8db7ca05")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mDepthDefinition;
            }

            @objid ("af0806c5-9277-4233-a68b-9b6a5ec68f1b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mDepthDefinition = value;
            }

            @objid ("95a85c7a-2c71-4718-8775-2a8d62db2e5b")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.OwnerAsDepthDep();
            }

        }

        @objid ("7b02d436-855a-4d70-8808-3284764c5f6d")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("8457460b-d3e5-4425-9265-0dbaca8a4425")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixDefinitionData) data).mOwner;
            }

            @objid ("c9ba0e08-5ee8-4452-82f2-dab692118e3b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixDefinitionData) data).mOwner = value;
            }

            @objid ("cb2f0b9c-5ee0-4c43-a95f-2076e3b32598")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.MatrixDep();
            }

        }

    }

}
