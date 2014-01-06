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
    @objid ("769cf2e5-40a7-49fb-a0ce-b948557038dd")
    @SmaMetaAttribute(metaName="IsInstantiable", type=Boolean.class, smAttributeClass=Metadata.IsInstantiableSmAttribute.class)
     Object mIsInstantiable = false;

    @objid ("3282f119-6550-4c2d-bdd6-860e3eb2bcbc")
    @SmaMetaAssociation(metaName="BpmnRepresents", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentsSmDependency.class)
     List<SmObjectImpl> mBpmnRepresents = null;

    @objid ("df976c65-98d4-4837-a5c1-bc71bda2fd95")
    @SmaMetaAssociation(metaName="ReceivingMerge", typeDataClass=PackageMergeData.class, min=0, max=-1, smAssociationClass=Metadata.ReceivingMergeSmDependency.class, istodelete = true)
     List<SmObjectImpl> mReceivingMerge = null;

    @objid ("36efcc4b-bcca-4d75-a33e-b41d95fbd730")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ProjectData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class)
     SmObjectImpl mRepresented;

    @objid ("9ca3f8c6-466c-4dd5-a9f0-fac2e289d909")
    @SmaMetaAssociation(metaName="Merge", typeDataClass=PackageMergeData.class, min=0, max=-1, smAssociationClass=Metadata.MergeSmDependency.class, component = true)
     List<SmObjectImpl> mMerge = null;

    @objid ("c1723e34-d5c4-402c-ae74-bdabbf32256c")
    @SmaMetaAssociation(metaName="PackageImporting", typeDataClass=PackageImportData.class, min=0, max=-1, smAssociationClass=Metadata.PackageImportingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mPackageImporting = null;

    @objid ("551b4149-7f22-46a8-b5ea-6ae98ae72148")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007fbb56-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0b0e4ec9-45c0-4559-aa3c-e6621d0843b1")
        private static SmClass smClass = null;

        @objid ("5e2dfb82-fd81-4170-9142-58a2322a9424")
        private static SmAttribute IsInstantiableAtt = null;

        @objid ("9d7b8c9b-a247-4c50-8ed4-ecf2313f800a")
        private static SmDependency BpmnRepresentsDep = null;

        @objid ("74d6d7f2-a91c-42e2-b5b5-13870fe6e258")
        private static SmDependency ReceivingMergeDep = null;

        @objid ("84f4af3c-7503-4a48-82f4-09b65d53105d")
        private static SmDependency RepresentedDep = null;

        @objid ("080a4e90-7a94-469f-a582-54f2cf4531cc")
        private static SmDependency MergeDep = null;

        @objid ("324a4155-060e-4ab5-8d23-e922300e9229")
        private static SmDependency PackageImportingDep = null;

        @objid ("a531e0a5-86e7-44ee-93d6-ad5c361b5853")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PackageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6a3bf170-8e25-4640-9131-a6f718190d36")
        public static SmAttribute IsInstantiableAtt() {
            if (IsInstantiableAtt == null) {
            	IsInstantiableAtt = classof().getAttributeDef("IsInstantiable");
            }
            return IsInstantiableAtt;
        }

        @objid ("defb0050-0e35-4b3c-afef-5e44f7a3cf87")
        public static SmDependency BpmnRepresentsDep() {
            if (BpmnRepresentsDep == null) {
            	BpmnRepresentsDep = classof().getDependencyDef("BpmnRepresents");
            }
            return BpmnRepresentsDep;
        }

        @objid ("7a691c13-0dbc-4764-8f06-2987b0a804c7")
        public static SmDependency ReceivingMergeDep() {
            if (ReceivingMergeDep == null) {
            	ReceivingMergeDep = classof().getDependencyDef("ReceivingMerge");
            }
            return ReceivingMergeDep;
        }

        @objid ("0464021d-2be1-42aa-a190-3258cc86985b")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("5ac5dbef-1191-4a61-a65d-2c1b286d4a55")
        public static SmDependency MergeDep() {
            if (MergeDep == null) {
            	MergeDep = classof().getDependencyDef("Merge");
            }
            return MergeDep;
        }

        @objid ("f3925b67-a534-422b-b014-975cb6e3df7e")
        public static SmDependency PackageImportingDep() {
            if (PackageImportingDep == null) {
            	PackageImportingDep = classof().getDependencyDef("PackageImporting");
            }
            return PackageImportingDep;
        }

        @objid ("d6a5696b-c6b8-448a-8d63-03d72ca42241")
        public static SmDependency getPackageImportingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PackageImportingDep;
        }

        @objid ("6abdbae0-98c2-4c6a-b593-38cab62b2e72")
        public static SmDependency getBpmnRepresentsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentsDep;
        }

        @objid ("c09c6ea6-a46a-4796-9cce-97073497d840")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("aac9391f-df12-4346-b761-77cb7b54a0b5")
        public static SmAttribute getIsInstantiableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsInstantiableAtt;
        }

        @objid ("ce3b70b6-564f-4bf5-ae39-4c35e76c43e0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8574dac4-f941-4680-b0ec-f75cb5a57cbd")
        public static SmDependency getReceivingMergeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivingMergeDep;
        }

        @objid ("ed6de7bf-4187-4c4a-aa35-926d4418f630")
        public static SmDependency getMergeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MergeDep;
        }

        @objid ("007ffc9c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("da39881f-2403-48ce-b1f9-a4555e7413c0")
            public ISmObjectData createData() {
                return new PackageData();
            }

            @objid ("a897c7b1-8493-4281-ad96-73ba0e86916d")
            public SmObjectImpl createImpl() {
                return new PackageImpl();
            }

        }

        @objid ("008061be-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsInstantiableSmAttribute extends SmAttribute {
            @objid ("68514bad-40cc-476d-a616-0948d0560918")
            public Object getValue(ISmObjectData data) {
                return ((PackageData) data).mIsInstantiable;
            }

            @objid ("a691cf38-2c8d-48b0-b968-7555689581dd")
            public void setValue(ISmObjectData data, Object value) {
                ((PackageData) data).mIsInstantiable = value;
            }

        }

        @objid ("0080c546-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MergeSmDependency extends SmMultipleDependency {
            @objid ("1edd1a53-38af-464a-9b73-d2417cba3e20")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mMerge != null)? ((PackageData)data).mMerge:SmMultipleDependency.EMPTY;
            }

            @objid ("44b660ef-bfc8-44e1-b350-a5b6869b7e5e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mMerge = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mMerge;
            }

            @objid ("93b53df3-c017-4c83-b4d9-97457569d09e")
            @Override
            public SmDependency getSymetric() {
                return PackageMergeData.Metadata.ReceivingPackageDep();
            }

        }

        @objid ("008128e2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class PackageImportingSmDependency extends SmMultipleDependency {
            @objid ("40ad2012-1fec-4fe4-a0a6-f4a84acf89d5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mPackageImporting != null)? ((PackageData)data).mPackageImporting:SmMultipleDependency.EMPTY;
            }

            @objid ("2ba23e5d-691a-45f0-b8a6-12428e2a6a28")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mPackageImporting = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mPackageImporting;
            }

            @objid ("1e29945a-5e65-4bd3-bfad-83e5c04684ad")
            @Override
            public SmDependency getSymetric() {
                return PackageImportData.Metadata.ImportedPackageDep();
            }

        }

        @objid ("00818ee0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceivingMergeSmDependency extends SmMultipleDependency {
            @objid ("2cf0a0d8-bed0-42b3-acfa-39f913e844e7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mReceivingMerge != null)? ((PackageData)data).mReceivingMerge:SmMultipleDependency.EMPTY;
            }

            @objid ("eb33b63c-72f8-4f38-a9c4-3c7c3f5fcfc0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mReceivingMerge = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mReceivingMerge;
            }

            @objid ("3a0b73bf-cf18-4dc5-9a9d-1ad4d9bfb096")
            @Override
            public SmDependency getSymetric() {
                return PackageMergeData.Metadata.MergedPackageDep();
            }

        }

        @objid ("0081f2a4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("d4858e4f-8565-41cd-9017-99fba95c9726")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageData) data).mRepresented;
            }

            @objid ("cb23a7a6-a4bd-4738-83af-3147a6934973")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageData) data).mRepresented = value;
            }

            @objid ("c2bc0f0c-ba51-4743-a922-94638f5ffb57")
            @Override
            public SmDependency getSymetric() {
                return ProjectData.Metadata.ModelDep();
            }

        }

        @objid ("00826a4a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentsSmDependency extends SmMultipleDependency {
            @objid ("280a2176-81fa-42f1-84ed-8eb45631f7a4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PackageData)data).mBpmnRepresents != null)? ((PackageData)data).mBpmnRepresents:SmMultipleDependency.EMPTY;
            }

            @objid ("befa4e5a-9fb7-47b4-adb8-58236deb4d86")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PackageData) data).mBpmnRepresents = new ArrayList<>(initialCapacity);
                return ((PackageData) data).mBpmnRepresents;
            }

            @objid ("12001ce9-255a-453e-8a83-44351483caf5")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.PackageRefDep();
            }

        }

    }

}
