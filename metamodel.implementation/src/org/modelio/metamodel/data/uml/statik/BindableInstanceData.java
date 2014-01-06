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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.BindingData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.uml.statik.BindableInstanceImpl;
import org.modelio.metamodel.uml.statik.BindableInstance;
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

@objid ("00011508-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BindableInstance.class, factory=BindableInstanceData.Metadata.ObjectFactory.class)
public class BindableInstanceData extends InstanceData {
    @objid ("260794be-4df6-4126-a3a4-3bde27de4278")
    @SmaMetaAssociation(metaName="Cluster", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.ClusterSmDependency.class)
     SmObjectImpl mCluster;

    @objid ("661fb0d1-6add-4dfd-a051-e915a1cb58cf")
    @SmaMetaAssociation(metaName="InternalOwner", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.InternalOwnerSmDependency.class)
     SmObjectImpl mInternalOwner;

    @objid ("7c9101b9-5671-4f31-b0b7-785fab8f9685")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("2d421c9b-d41b-4947-b60d-072cae855df9")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("30b5079c-9586-4f79-b0c5-dadd65a878be")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008b43fe-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3b5e1b4f-9017-4b63-a0cc-234efe5f9f61")
        private static SmClass smClass = null;

        @objid ("e54e791a-4d3e-4a5d-8909-0fcce79084fa")
        private static SmDependency ClusterDep = null;

        @objid ("660ebd26-d146-43ba-86ef-8d6bfae8998a")
        private static SmDependency InternalOwnerDep = null;

        @objid ("3a7b767c-1a26-4601-9dd2-b3db9413464e")
        private static SmDependency RepresentationDep = null;

        @objid ("83d95132-bf98-4775-833c-303884d913e7")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("39ccb1ea-3433-4254-b4ae-62290cefc66d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BindableInstanceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("18821ed7-f6c9-420e-aa2f-37bc8eb2ec2c")
        public static SmDependency ClusterDep() {
            if (ClusterDep == null) {
            	ClusterDep = classof().getDependencyDef("Cluster");
            }
            return ClusterDep;
        }

        @objid ("9e3169ee-ffa1-4bcc-9de8-0bf7bc3d5b6e")
        public static SmDependency InternalOwnerDep() {
            if (InternalOwnerDep == null) {
            	InternalOwnerDep = classof().getDependencyDef("InternalOwner");
            }
            return InternalOwnerDep;
        }

        @objid ("32c3c688-4a7c-4790-ace8-cf17a6691bda")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("d4fd7bc7-cb8a-4373-bc0f-13ea62768968")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("00e9501f-1885-4e92-935b-af563eb106c5")
        public static SmDependency getClusterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ClusterDep;
        }

        @objid ("a1182160-8067-4146-9377-edcfa3df0204")
        public static SmDependency getInternalOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InternalOwnerDep;
        }

        @objid ("ca888bcd-2f51-46dd-83f2-a2f30b917a58")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1256dfab-7364-4b38-a30a-30eb540edd78")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("5654897e-89d9-47d5-9996-87bcc0fb9520")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("008b85ee-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8292def8-7d20-4767-8925-333596532664")
            public ISmObjectData createData() {
                return new BindableInstanceData();
            }

            @objid ("a31242ea-707e-43e3-8c70-db18fff48bf2")
            public SmObjectImpl createImpl() {
                return new BindableInstanceImpl();
            }

        }

        @objid ("008be93a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ClusterSmDependency extends SmSingleDependency {
            @objid ("f26de7ea-6c26-41a7-abcb-c2e8647f203b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindableInstanceData) data).mCluster;
            }

            @objid ("43a263e9-67c3-4510-b346-87c221554fdd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindableInstanceData) data).mCluster = value;
            }

            @objid ("e1cf459f-3c8c-4076-9416-ad36b2e8f263")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.PartDep();
            }

        }

        @objid ("008c5e06-c4c2-1fd8-97fe-001ec947cd2a")
        public static class InternalOwnerSmDependency extends SmSingleDependency {
            @objid ("dd005ddc-c368-45bf-86bd-b22d204f8e9a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindableInstanceData) data).mInternalOwner;
            }

            @objid ("e6e769a7-b869-4fe4-9b52-69ce7bb970f5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindableInstanceData) data).mInternalOwner = value;
            }

            @objid ("ab736208-afa0-400f-a3f1-abd96acc70b4")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.InternalStructureDep();
            }

        }

        @objid ("008cd5a2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("6014488e-1cab-45b8-a41c-32f6c0a6f1be")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BindableInstanceData)data).mRepresentation != null)? ((BindableInstanceData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("c9a7bfd6-d027-42df-8d3e-6f3e221d1457")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BindableInstanceData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((BindableInstanceData) data).mRepresentation;
            }

            @objid ("f67ba091-209f-411a-bc5f-7cf78b8e1a4f")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.RoleDep();
            }

        }

        @objid ("008d3934-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("0a340b43-c53a-4fe6-9289-9c9acf681267")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindableInstanceData) data).mRepresentedFeature;
            }

            @objid ("72f71029-d8da-4232-85cf-46d86bd26928")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindableInstanceData) data).mRepresentedFeature = value;
            }

            @objid ("8e4c2e50-99d7-4d66-8329-619c30ec9e71")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingInstanceDep();
            }

        }

    }

}
