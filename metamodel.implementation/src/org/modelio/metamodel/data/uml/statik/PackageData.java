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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.data.mda.ProjectData;
import org.modelio.metamodel.data.uml.statik.PackageImportData;
import org.modelio.metamodel.data.uml.statik.PackageMergeData;
import org.modelio.metamodel.impl.uml.statik.PackageImpl;
import org.modelio.metamodel.uml.statik.Package;
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

@objid ("0015b9f4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Package.class, factory=PackageData.Metadata.ObjectFactory.class, cmsnode=true)
public class PackageData extends NameSpaceData {
    @objid ("21c6c812-6ab7-427f-a752-bfdd3958d339")
    @SmaMetaAttribute(metaName="IsInstantiable", type=Boolean.class, smAttributeClass=Metadata.IsInstantiableSmAttribute.class)
     Object mIsInstantiable = false;

    @objid ("664880a8-5b60-440d-86bf-f16a95e180ca")
    @SmaMetaAssociation(metaName="BpmnRepresents", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentsSmDependency.class)
     List<SmObjectImpl> mBpmnRepresents = null;

    @objid ("b5ea520d-c94e-4582-9d11-e301a04b568a")
    @SmaMetaAssociation(metaName="ReceivingMerge", typeDataClass=PackageMergeData.class, min=0, max=-1, smAssociationClass=Metadata.ReceivingMergeSmDependency.class, istodelete = true)
     List<SmObjectImpl> mReceivingMerge = null;

    @objid ("ecfdcbac-704c-498b-9d2f-8e83028113a9")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ProjectData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class)
     SmObjectImpl mRepresented;

    @objid ("2ba15f04-9164-4a35-8b2f-404c65ede45b")
    @SmaMetaAssociation(metaName="Merge", typeDataClass=PackageMergeData.class, min=0, max=-1, smAssociationClass=Metadata.MergeSmDependency.class, component = true)
     List<SmObjectImpl> mMerge = null;

    @objid ("e2014803-7d35-4996-a756-859086b63fa1")
    @SmaMetaAssociation(metaName="PackageImporting", typeDataClass=PackageImportData.class, min=0, max=-1, smAssociationClass=Metadata.PackageImportingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mPackageImporting = null;

    @objid ("623d32c7-70b0-47b7-bcc6-64dd97ddf8f4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007fbb56-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("55024101-e6c3-46d6-ba9d-dcfd74b7f97d")
        private static SmClass smClass = null;

        @objid ("1ef44504-be94-4ced-957d-6b48446c5218")
        private static SmAttribute IsInstantiableAtt = null;

        @objid ("5002d4f6-1ab6-4d9c-aa2c-d6f8f93c4360")
        private static SmDependency BpmnRepresentsDep = null;

        @objid ("04a9a50a-cf21-4af0-8a7a-5ed7665de8ac")
        private static SmDependency ReceivingMergeDep = null;

        @objid ("840364cf-26bb-454d-9eab-4c884c6d5d72")
        private static SmDependency RepresentedDep = null;

        @objid ("828e0037-f6bf-4b69-9cac-50c43b4d94fa")
        private static SmDependency MergeDep = null;

        @objid ("c6c64e62-f0ab-4d46-89c6-97fc1f5da120")
        private static SmDependency PackageImportingDep = null;

        @objid ("92dfc32d-e8ae-4be2-b99f-319a88ac2a24")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PackageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("287cc363-e8d4-4d47-ab5e-fcf4f20a6a79")
        public static SmAttribute IsInstantiableAtt() {
            if (IsInstantiableAtt == null) {
            	IsInstantiableAtt = classof().getAttributeDef("IsInstantiable");
            }
            return IsInstantiableAtt;
        }

        @objid ("5dbfa100-a5e7-4e67-baaf-edb95b7a9177")
        public static SmDependency BpmnRepresentsDep() {
            if (BpmnRepresentsDep == null) {
            	BpmnRepresentsDep = classof().getDependencyDef("BpmnRepresents");
            }
            return BpmnRepresentsDep;
        }

        @objid ("f1b31275-1d50-49f0-ba75-f39f1f028e86")
        public static SmDependency ReceivingMergeDep() {
            if (ReceivingMergeDep == null) {
            	ReceivingMergeDep = classof().getDependencyDef("ReceivingMerge");
            }
            return ReceivingMergeDep;
        }

        @objid ("9a6015ea-0370-4e9c-9941-de2679e83c3d")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("59f578fe-652b-427b-a189-8befac8bd85c")
        public static SmDependency MergeDep() {
            if (MergeDep == null) {
            	MergeDep = classof().getDependencyDef("Merge");
            }
            return MergeDep;
        }

        @objid ("a173a116-2147-4fec-b417-b413250ac979")
        public static SmDependency PackageImportingDep() {
            if (PackageImportingDep == null) {
            	PackageImportingDep = classof().getDependencyDef("PackageImporting");
            }
            return PackageImportingDep;
        }

        @objid ("ad3709a9-5bfe-49aa-8f5e-d824190c3348")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1a3691a0-6fb7-4ca8-9d92-a5013072ed87")
        public static SmDependency getMergeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MergeDep;
        }

        @objid ("2cfd5cc0-a7c1-4f0a-845e-9625088b3a4b")
        public static SmDependency getBpmnRepresentsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentsDep;
        }

        @objid ("05e78b11-1512-4820-a973-adfe5e828d03")
        public static SmAttribute getIsInstantiableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsInstantiableAtt;
        }

        @objid ("1d41c5a3-96c7-44ee-bebd-6b6f3089fac8")
        public static SmDependency getPackageImportingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PackageImportingDep;
        }

        @objid ("a52de209-a32b-42f7-ad40-1b690eea51dd")
        public static SmDependency getReceivingMergeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivingMergeDep;
        }

        @objid ("d9885c66-f5d7-4302-b8a6-324206ae9828")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("007ffc9c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e2525bfb-068c-45db-85c3-c298e8fba37f")
            public ISmObjectData createData() {
                return new PackageData();
            }

            @objid ("97e69be8-d312-4efb-808f-772d9bfbf5ed")
            public SmObjectImpl createImpl() {
                return new PackageImpl();
            }

        }

        @objid ("008061be-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsInstantiableSmAttribute extends SmAttribute {
            @objid ("dcf92579-2627-4291-8f50-0099b1d6082c")
            public Object getValue(ISmObjectData data) {
                return ((PackageData) data).mIsInstantiable;
            }

            @objid ("4c092cdb-6ff4-407d-bc71-375114fc7b34")
            public void setValue(ISmObjectData data, Object value) {
                ((PackageData) data).mIsInstantiable = value;
            }

        }

        @objid ("0080c546-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MergeSmDependency extends SmMultipleDependency {
            @objid ("2cc9d9ef-e103-4ce0-a9be-b3e00c12d8f1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mMerge != null)? ((PackageData)data).mMerge:SmMultipleDependency.EMPTY;
            }

            @objid ("0d05138d-7c3a-4389-b06c-5a3bf9b92610")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mMerge = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mMerge;
            }

            @objid ("82bc2fe3-cc9a-4594-a9a5-497b8e2577be")
            @Override
            public SmDependency getSymetric() {
                return PackageMergeData.Metadata.ReceivingPackageDep();
            }

        }

        @objid ("008128e2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class PackageImportingSmDependency extends SmMultipleDependency {
            @objid ("9b0e0c97-41a3-42c2-a8f6-e019d2ef3e56")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mPackageImporting != null)? ((PackageData)data).mPackageImporting:SmMultipleDependency.EMPTY;
            }

            @objid ("9f109a57-0fe8-43b0-a16c-d2e5560a9600")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mPackageImporting = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mPackageImporting;
            }

            @objid ("a887f088-ef36-46be-8052-15276db5e7a0")
            @Override
            public SmDependency getSymetric() {
                return PackageImportData.Metadata.ImportedPackageDep();
            }

        }

        @objid ("00818ee0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceivingMergeSmDependency extends SmMultipleDependency {
            @objid ("36aa1bf1-4119-4612-99ba-05e592099e82")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mReceivingMerge != null)? ((PackageData)data).mReceivingMerge:SmMultipleDependency.EMPTY;
            }

            @objid ("fe2c3959-062c-46d2-a3f5-e0b1240f8017")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mReceivingMerge = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mReceivingMerge;
            }

            @objid ("80dbaed1-b493-44ab-bb3b-b467d6f679ee")
            @Override
            public SmDependency getSymetric() {
                return PackageMergeData.Metadata.MergedPackageDep();
            }

        }

        @objid ("0081f2a4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("52013554-b39b-4802-83e9-195d9b4f938d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageData) data).mRepresented;
            }

            @objid ("19114d7e-cecf-4956-999d-9218b462636a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageData) data).mRepresented = value;
            }

            @objid ("8793af27-9c24-4c2c-b2cd-2714d19d9686")
            @Override
            public SmDependency getSymetric() {
                return ProjectData.Metadata.ModelDep();
            }

        }

        @objid ("00826a4a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentsSmDependency extends SmMultipleDependency {
            @objid ("5e3f7b55-e31b-4da9-a71a-0a1b0699d0f4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mBpmnRepresents != null)? ((PackageData)data).mBpmnRepresents:SmMultipleDependency.EMPTY;
            }

            @objid ("e38d9bb2-9d5e-4289-96c9-470802a2ab1f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mBpmnRepresents = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mBpmnRepresents;
            }

            @objid ("383547cd-9dc3-4124-a668-7e5ee82b86b1")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.PackageRefDep();
            }

        }

    }

}
