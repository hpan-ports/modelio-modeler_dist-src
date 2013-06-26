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
    @objid ("1d741181-d919-4010-9b54-66db969f3d35")
    @SmaMetaAssociation(metaName="Cluster", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.ClusterSmDependency.class)
     SmObjectImpl mCluster;

    @objid ("b4c06b02-f994-4cc7-ba21-bcdf488bfacd")
    @SmaMetaAssociation(metaName="InternalOwner", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.InternalOwnerSmDependency.class)
     SmObjectImpl mInternalOwner;

    @objid ("67849c1a-f692-46e2-ab99-552736b35ed4")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("e65be802-a8af-4999-ba64-f67711219880")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("0364055d-7b9d-4d83-8e86-032ff1c0c04a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008b43fe-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bd010eb9-0f6f-46f7-9992-d46b22d47c39")
        private static SmClass smClass = null;

        @objid ("98328bee-f415-4b85-bad2-3ac23fcb441b")
        private static SmDependency ClusterDep = null;

        @objid ("7d5204da-eb09-4212-a61e-d60636e2cbbb")
        private static SmDependency InternalOwnerDep = null;

        @objid ("dcb0bec2-c05d-41cb-9b9c-42b748385672")
        private static SmDependency RepresentationDep = null;

        @objid ("ab842beb-fb5e-43b5-802b-24f675fe76c2")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("904de24e-62e8-4b25-bf83-534fc76c0d96")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BindableInstanceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c93dc762-f254-4447-ba41-b3676394f4b1")
        public static SmDependency ClusterDep() {
            if (ClusterDep == null) {
            	ClusterDep = classof().getDependencyDef("Cluster");
            }
            return ClusterDep;
        }

        @objid ("94637e54-5ac2-4ac8-830d-c6387ccc099c")
        public static SmDependency InternalOwnerDep() {
            if (InternalOwnerDep == null) {
            	InternalOwnerDep = classof().getDependencyDef("InternalOwner");
            }
            return InternalOwnerDep;
        }

        @objid ("d47b5924-96ff-4496-9199-93a5345886ad")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("59421845-4050-43e2-a4eb-11fae0f53181")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("7d530ffa-6b22-400c-975e-3f050833995f")
        public static SmDependency getInternalOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InternalOwnerDep;
        }

        @objid ("cec367d9-2e4d-4dbd-958d-f242fab45117")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("be304331-77b5-45a2-aa94-c33b2266902c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("268e6cbc-45ed-4243-b99d-83902d76655d")
        public static SmDependency getClusterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ClusterDep;
        }

        @objid ("c8c5b202-d2ce-4539-a1ea-94f7e3e1f0a8")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("008b85ee-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0fb57c06-b13c-4427-b801-3fab0281e300")
            public ISmObjectData createData() {
                return new BindableInstanceData();
            }

            @objid ("55801f26-2bb4-466f-b41e-b081d4ed40df")
            public SmObjectImpl createImpl() {
                return new BindableInstanceImpl();
            }

        }

        @objid ("008be93a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ClusterSmDependency extends SmSingleDependency {
            @objid ("5685aaf0-de38-42fc-ab7a-1cdeb7b6b63f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindableInstanceData) data).mCluster;
            }

            @objid ("16b9e197-50bd-4545-bab6-43913a7496d2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindableInstanceData) data).mCluster = value;
            }

            @objid ("3b66d3a9-92bd-4ae0-b10a-50c64fe757a3")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.PartDep();
            }

        }

        @objid ("008c5e06-c4c2-1fd8-97fe-001ec947cd2a")
        public static class InternalOwnerSmDependency extends SmSingleDependency {
            @objid ("ede2787c-12b7-49bd-81d3-288a003c3c13")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindableInstanceData) data).mInternalOwner;
            }

            @objid ("bd63e7d0-c6b2-48f9-bcf4-8e12980a45fe")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindableInstanceData) data).mInternalOwner = value;
            }

            @objid ("191b28bb-64c5-422c-ba17-bc159dd05639")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.InternalStructureDep();
            }

        }

        @objid ("008cd5a2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("472cb2d1-997a-47a2-b33e-761bc2149dab")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BindableInstanceData)data).mRepresentation != null)? ((BindableInstanceData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("ad4b0822-7f2a-4f86-a604-8bdd0de8a70b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BindableInstanceData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((BindableInstanceData) data).mRepresentation;
            }

            @objid ("de35e4d9-3260-44c7-acbb-a8921b64d51b")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.RoleDep();
            }

        }

        @objid ("008d3934-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("9af28d8f-7b14-4255-9e0f-da15683671f2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindableInstanceData) data).mRepresentedFeature;
            }

            @objid ("f4fa3316-05ac-4568-9634-f59cc92b2afb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindableInstanceData) data).mRepresentedFeature = value;
            }

            @objid ("f8a1f2e0-03bf-4ce3-8482-c9b768a354fa")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingInstanceDep();
            }

        }

    }

}
