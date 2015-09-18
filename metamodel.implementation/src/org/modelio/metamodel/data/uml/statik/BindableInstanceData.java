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
    @objid ("7892adec-ff00-4224-851b-5d35c90304ac")
    @SmaMetaAssociation(metaName="Cluster", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.ClusterSmDependency.class)
     SmObjectImpl mCluster;

    @objid ("d57c2dfd-9701-4e4c-b569-549b742e9a5b")
    @SmaMetaAssociation(metaName="InternalOwner", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.InternalOwnerSmDependency.class)
     SmObjectImpl mInternalOwner;

    @objid ("e6619e4c-85fe-4949-b5c5-a12a4aa6ef6f")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("40820678-9cfe-4698-a5ed-9476c48953f6")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("cf2c15f5-8dcd-477b-9aec-4b4ff36565f1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008b43fe-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2ec632b2-3ee8-45fe-8ab3-824611ed8765")
        private static SmClass smClass = null;

        @objid ("3d5f954a-2e91-4b20-a79f-5a29dc8e1322")
        private static SmDependency ClusterDep = null;

        @objid ("fb5b0b99-c6d7-4b84-8366-b689b6b92334")
        private static SmDependency InternalOwnerDep = null;

        @objid ("0fb4840e-c5ce-4ec6-aa47-9ed22b1a51ac")
        private static SmDependency RepresentationDep = null;

        @objid ("04ca7be1-92c4-4ec5-8136-fbdf24fb8217")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("afb8ff80-bcf4-4ddb-b874-7b463b5f6660")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BindableInstanceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3da630d4-3e84-48e4-83db-b5281e381968")
        public static SmDependency ClusterDep() {
            if (ClusterDep == null) {
            	ClusterDep = classof().getDependencyDef("Cluster");
            }
            return ClusterDep;
        }

        @objid ("dee6b83b-9850-4918-986d-f37fb89ddaca")
        public static SmDependency InternalOwnerDep() {
            if (InternalOwnerDep == null) {
            	InternalOwnerDep = classof().getDependencyDef("InternalOwner");
            }
            return InternalOwnerDep;
        }

        @objid ("991fd13d-10ab-4a7e-a920-f7731c1bb2be")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("2bb51d1a-7ef4-4981-a459-2f1fe510f2a6")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("b6d4c2f5-ef12-4b70-9d45-46ac2fe26085")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("759dfd39-aa21-487f-9897-9fa6171e7eed")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c30d4aca-6b44-4592-8568-b4fbbd49e2c3")
        public static SmDependency getInternalOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InternalOwnerDep;
        }

        @objid ("4156738d-ed18-4566-a84d-a875c7029463")
        public static SmDependency getClusterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ClusterDep;
        }

        @objid ("d688bd2e-7d59-4fbc-abe0-5e52f72fce91")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("008b85ee-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("62c05dfe-ea7f-4da0-a2a3-52f917041700")
            public ISmObjectData createData() {
                return new BindableInstanceData();
            }

            @objid ("06a14435-8475-4210-9ec3-10084243bd7a")
            public SmObjectImpl createImpl() {
                return new BindableInstanceImpl();
            }

        }

        @objid ("008be93a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ClusterSmDependency extends SmSingleDependency {
            @objid ("cebfeff0-9671-4799-b105-d82c03c1626d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindableInstanceData) data).mCluster;
            }

            @objid ("e2fe01e4-945b-4653-8ba7-8cd16a8c47f8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindableInstanceData) data).mCluster = value;
            }

            @objid ("bee95fd7-e7eb-4e1c-9bb9-4b442563d2e4")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.PartDep();
            }

        }

        @objid ("008c5e06-c4c2-1fd8-97fe-001ec947cd2a")
        public static class InternalOwnerSmDependency extends SmSingleDependency {
            @objid ("bf7576bc-3c5a-486e-81e7-1b640fb6cd24")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindableInstanceData) data).mInternalOwner;
            }

            @objid ("70dce6a5-7d07-49a8-bdff-8884056ab8c7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindableInstanceData) data).mInternalOwner = value;
            }

            @objid ("fba6c3a0-689c-4e52-9001-fa5529220b89")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.InternalStructureDep();
            }

        }

        @objid ("008cd5a2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("228bd701-501a-48ef-b70b-1602f90d949d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BindableInstanceData)data).mRepresentation != null)? ((BindableInstanceData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("73155472-7d2c-4946-bfec-aaaf45a186e8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BindableInstanceData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((BindableInstanceData) data).mRepresentation;
            }

            @objid ("309dcfd9-786f-40de-add0-4c16a7a292df")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.RoleDep();
            }

        }

        @objid ("008d3934-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("2885da27-845d-4ef3-852f-f767a2563517")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindableInstanceData) data).mRepresentedFeature;
            }

            @objid ("e7d9f3e4-17dc-4122-8a94-4a87e472c546")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindableInstanceData) data).mRepresentedFeature = value;
            }

            @objid ("5cd07ef5-1599-443b-b0b7-7532460567ba")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingInstanceDep();
            }

        }

    }

}
