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
    @objid ("86a5d0a6-1cc3-4a43-a7fc-3663d570f55d")
    @SmaMetaAttribute(metaName="IsInstantiable", type=Boolean.class, smAttributeClass=Metadata.IsInstantiableSmAttribute.class)
     Object mIsInstantiable = false;

    @objid ("304d031c-76b5-4ce7-bb02-4b5565b58076")
    @SmaMetaAssociation(metaName="BpmnRepresents", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentsSmDependency.class)
     List<SmObjectImpl> mBpmnRepresents = null;

    @objid ("4ae77828-78b2-4d15-818d-4428e959de9d")
    @SmaMetaAssociation(metaName="ReceivingMerge", typeDataClass=PackageMergeData.class, min=0, max=-1, smAssociationClass=Metadata.ReceivingMergeSmDependency.class, istodelete = true)
     List<SmObjectImpl> mReceivingMerge = null;

    @objid ("8a46fd32-025f-439e-865f-d688c9193ff6")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ProjectData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class)
     SmObjectImpl mRepresented;

    @objid ("9e6ad7ae-42a7-4179-95d3-f16c9f74558c")
    @SmaMetaAssociation(metaName="Merge", typeDataClass=PackageMergeData.class, min=0, max=-1, smAssociationClass=Metadata.MergeSmDependency.class, component = true)
     List<SmObjectImpl> mMerge = null;

    @objid ("d164ef51-ec56-44d2-85f7-5af7b7b36a17")
    @SmaMetaAssociation(metaName="PackageImporting", typeDataClass=PackageImportData.class, min=0, max=-1, smAssociationClass=Metadata.PackageImportingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mPackageImporting = null;

    @objid ("9a5dac79-d956-4c28-a80e-f92f2eae63b8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007fbb56-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b79bcd3c-824d-40bd-b675-670b8f96b807")
        private static SmClass smClass = null;

        @objid ("e042226e-f820-45ae-97a2-1a52533de900")
        private static SmAttribute IsInstantiableAtt = null;

        @objid ("3db4bc41-604e-4fdc-b0df-0d6264aa2bba")
        private static SmDependency BpmnRepresentsDep = null;

        @objid ("b40b053b-8d3f-4e03-a2d5-5a28f4f77833")
        private static SmDependency ReceivingMergeDep = null;

        @objid ("0e586ec1-bf2d-448b-9ba6-b42e36ca69a4")
        private static SmDependency RepresentedDep = null;

        @objid ("a3980899-88dd-4833-bac0-04387efcb51d")
        private static SmDependency MergeDep = null;

        @objid ("d11ab2b3-8816-436b-b6b7-37de063dfc30")
        private static SmDependency PackageImportingDep = null;

        @objid ("525f9f4a-cf13-4fcb-af5c-b8531c6ce4d8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PackageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1df30434-43e7-4848-b168-67b40cc3f913")
        public static SmAttribute IsInstantiableAtt() {
            if (IsInstantiableAtt == null) {
            	IsInstantiableAtt = classof().getAttributeDef("IsInstantiable");
            }
            return IsInstantiableAtt;
        }

        @objid ("28382b47-7a7c-4eb7-9b9f-2d14dfc3c6e9")
        public static SmDependency BpmnRepresentsDep() {
            if (BpmnRepresentsDep == null) {
            	BpmnRepresentsDep = classof().getDependencyDef("BpmnRepresents");
            }
            return BpmnRepresentsDep;
        }

        @objid ("b6a785cd-a2fc-46fe-ab60-b8343804e6f9")
        public static SmDependency ReceivingMergeDep() {
            if (ReceivingMergeDep == null) {
            	ReceivingMergeDep = classof().getDependencyDef("ReceivingMerge");
            }
            return ReceivingMergeDep;
        }

        @objid ("03420f86-b92d-457e-b15b-25f3508389b8")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("c21e9614-96ad-4227-8fc2-96f2eabf7ddc")
        public static SmDependency MergeDep() {
            if (MergeDep == null) {
            	MergeDep = classof().getDependencyDef("Merge");
            }
            return MergeDep;
        }

        @objid ("65c10d41-6ff1-47f7-8ae2-8aec8b3e73f2")
        public static SmDependency PackageImportingDep() {
            if (PackageImportingDep == null) {
            	PackageImportingDep = classof().getDependencyDef("PackageImporting");
            }
            return PackageImportingDep;
        }

        @objid ("b4ed76fa-d894-4284-a429-ac17e8b93fea")
        public static SmDependency getReceivingMergeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivingMergeDep;
        }

        @objid ("cda9043f-bfbb-4fc1-beac-36d1284e015f")
        public static SmDependency getMergeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MergeDep;
        }

        @objid ("e6a4317a-3058-4cbd-8c74-61af967a8ae3")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("054108d6-7ebf-452d-a5fb-1c63cd2ecdaf")
        public static SmDependency getPackageImportingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PackageImportingDep;
        }

        @objid ("27f3c9e8-be7a-4aee-8c6e-40be30d08d4d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c8a4c1ce-635f-4700-82c4-3acc44f25980")
        public static SmAttribute getIsInstantiableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsInstantiableAtt;
        }

        @objid ("9700061f-91cc-454e-ba3e-ff4e626da443")
        public static SmDependency getBpmnRepresentsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentsDep;
        }

        @objid ("007ffc9c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b740c670-302d-4648-b15b-0543bd1063da")
            public ISmObjectData createData() {
                return new PackageData();
            }

            @objid ("13a68aa1-306e-4b83-9ad9-2a264bd702cb")
            public SmObjectImpl createImpl() {
                return new PackageImpl();
            }

        }

        @objid ("008061be-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsInstantiableSmAttribute extends SmAttribute {
            @objid ("387b380b-59a9-4ae0-baca-8876257bcf29")
            public Object getValue(ISmObjectData data) {
                return ((PackageData) data).mIsInstantiable;
            }

            @objid ("807d68fb-a8d8-4d10-a518-c3c515fffc0b")
            public void setValue(ISmObjectData data, Object value) {
                ((PackageData) data).mIsInstantiable = value;
            }

        }

        @objid ("0080c546-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MergeSmDependency extends SmMultipleDependency {
            @objid ("07e7c50a-9c1b-4554-9047-cee56ae3b78b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mMerge != null)? ((PackageData)data).mMerge:SmMultipleDependency.EMPTY;
            }

            @objid ("4e7448b0-1068-4a7f-bc96-a298e8060523")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mMerge = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mMerge;
            }

            @objid ("2e747110-f78d-494b-86dc-dac669e266a9")
            @Override
            public SmDependency getSymetric() {
                return PackageMergeData.Metadata.ReceivingPackageDep();
            }

        }

        @objid ("008128e2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class PackageImportingSmDependency extends SmMultipleDependency {
            @objid ("84009b5d-b325-4504-928e-dac27252f752")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mPackageImporting != null)? ((PackageData)data).mPackageImporting:SmMultipleDependency.EMPTY;
            }

            @objid ("44fdc5ce-42f7-44eb-a87d-71f60d25eae6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mPackageImporting = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mPackageImporting;
            }

            @objid ("b2e2d77e-a204-4df3-8d4d-0a3609112749")
            @Override
            public SmDependency getSymetric() {
                return PackageImportData.Metadata.ImportedPackageDep();
            }

        }

        @objid ("00818ee0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceivingMergeSmDependency extends SmMultipleDependency {
            @objid ("d6f0ab94-52c3-41fe-ac01-190ca6117bce")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mReceivingMerge != null)? ((PackageData)data).mReceivingMerge:SmMultipleDependency.EMPTY;
            }

            @objid ("d5ee5b0d-3fd1-42ae-92ec-e9d1720b6dd3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mReceivingMerge = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mReceivingMerge;
            }

            @objid ("84c2c556-673c-4348-ad33-b08e3633ae48")
            @Override
            public SmDependency getSymetric() {
                return PackageMergeData.Metadata.MergedPackageDep();
            }

        }

        @objid ("0081f2a4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("25173499-b46e-4b38-bdeb-d154949d1898")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageData) data).mRepresented;
            }

            @objid ("479e42de-f718-4612-8b61-5b12bd275825")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageData) data).mRepresented = value;
            }

            @objid ("3f6ae0ec-fe22-44e9-b46b-b44cd73e4f31")
            @Override
            public SmDependency getSymetric() {
                return ProjectData.Metadata.ModelDep();
            }

        }

        @objid ("00826a4a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentsSmDependency extends SmMultipleDependency {
            @objid ("5a578783-4019-49f6-b67f-1278f8fca2e0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mBpmnRepresents != null)? ((PackageData)data).mBpmnRepresents:SmMultipleDependency.EMPTY;
            }

            @objid ("2e3aa9a7-2aa2-4c39-a81f-2d33b3960274")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mBpmnRepresents = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mBpmnRepresents;
            }

            @objid ("99105259-db10-42b6-ade4-5c309f23ec42")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.PackageRefDep();
            }

        }

    }

}
