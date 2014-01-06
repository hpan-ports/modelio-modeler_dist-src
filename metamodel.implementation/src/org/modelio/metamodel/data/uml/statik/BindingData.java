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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.BindableInstanceData;
import org.modelio.metamodel.data.uml.statik.CollaborationUseData;
import org.modelio.metamodel.data.uml.statik.ConnectorEndData;
import org.modelio.metamodel.data.uml.statik.NaryConnectorData;
import org.modelio.metamodel.impl.uml.statik.BindingImpl;
import org.modelio.metamodel.uml.statik.Binding;
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

@objid ("0001ce8a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Binding.class, factory=BindingData.Metadata.ObjectFactory.class)
public class BindingData extends ModelElementData {
    @objid ("c3f7812a-3ad5-4163-9bff-dac32aa16734")
    @SmaMetaAssociation(metaName="ConnectorEndRole", typeDataClass=ConnectorEndData.class, min=0, max=1, smAssociationClass=Metadata.ConnectorEndRoleSmDependency.class, partof = true)
     SmObjectImpl mConnectorEndRole;

    @objid ("70b3eb02-fef1-420d-9d49-d024643fed5e")
    @SmaMetaAssociation(metaName="ConnectorRole", typeDataClass=NaryConnectorData.class, min=0, max=1, smAssociationClass=Metadata.ConnectorRoleSmDependency.class, partof = true)
     SmObjectImpl mConnectorRole;

    @objid ("fc40c50b-44ee-4168-979e-e11e12c09289")
    @SmaMetaAssociation(metaName="Role", typeDataClass=BindableInstanceData.class, min=0, max=1, smAssociationClass=Metadata.RoleSmDependency.class, partof = true)
     SmObjectImpl mRole;

    @objid ("484b0af7-8b9d-443f-901d-8e64fc98669b")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("774c7105-9237-4728-81d6-9cab5d8182fa")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=CollaborationUseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("a7f2ef59-eeee-4f65-ac61-b12ef522cd1c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0068f63c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("82cb6607-5169-4e4f-9e7e-720d330d0e54")
        private static SmClass smClass = null;

        @objid ("17b5ed46-9488-454a-84ea-f652b1386cff")
        private static SmDependency ConnectorEndRoleDep = null;

        @objid ("6623bf7f-a143-43a4-b339-95c2e3bbd0e4")
        private static SmDependency ConnectorRoleDep = null;

        @objid ("48059995-ba12-47c4-8753-892d09546a46")
        private static SmDependency RoleDep = null;

        @objid ("172952fc-534f-47df-b9aa-d87815803540")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("c0fe83e1-e009-43f3-a07f-0e910c9cd846")
        private static SmDependency OwnerDep = null;

        @objid ("00c8138f-08eb-4073-b9c8-c57a69d7bde0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BindingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("58d36341-0965-4b7b-b6b2-4a6e6f6e73c4")
        public static SmDependency ConnectorEndRoleDep() {
            if (ConnectorEndRoleDep == null) {
            	ConnectorEndRoleDep = classof().getDependencyDef("ConnectorEndRole");
            }
            return ConnectorEndRoleDep;
        }

        @objid ("465c382f-4f61-435d-91d2-8b0e477be048")
        public static SmDependency ConnectorRoleDep() {
            if (ConnectorRoleDep == null) {
            	ConnectorRoleDep = classof().getDependencyDef("ConnectorRole");
            }
            return ConnectorRoleDep;
        }

        @objid ("d08aa8f0-3790-4a5f-8c5e-2baae25eb058")
        public static SmDependency RoleDep() {
            if (RoleDep == null) {
            	RoleDep = classof().getDependencyDef("Role");
            }
            return RoleDep;
        }

        @objid ("61531e26-6082-436a-a4d2-b95150f31856")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("4550c714-2631-473f-b4cf-2ea608fc8275")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("afe14e0d-4b5c-411c-b29f-0c9b2b4871d6")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("e213c65d-0973-4eaf-9958-8a0746a54bf5")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("47b9d79a-fd9d-419a-9382-43e2304544d0")
        public static SmDependency getConnectorEndRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectorEndRoleDep;
        }

        @objid ("dd9b2ae9-8bf7-4801-b127-734830d8e1d1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5501eecd-66de-4bfe-8ccc-a263274ebc41")
        public static SmDependency getRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RoleDep;
        }

        @objid ("e968f3ad-2d8f-4be6-b413-1898133812fc")
        public static SmDependency getConnectorRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectorRoleDep;
        }

        @objid ("00693750-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6961a0a2-9897-4e79-a8d7-29946243915a")
            public ISmObjectData createData() {
                return new BindingData();
            }

            @objid ("df0e17c5-bb29-499c-a366-8dc1643f5031")
            public SmObjectImpl createImpl() {
                return new BindingImpl();
            }

        }

        @objid ("006999b6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("fb585971-e4e4-4284-b6e1-280c081c7a28")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mRepresentedFeature;
            }

            @objid ("11f450f4-8ec9-4eb6-b9b3-c16f525a3d60")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mRepresentedFeature = value;
            }

            @objid ("045cebb3-f57e-4e6c-96b3-b290f69a4d0f")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentsDep();
            }

        }

        @objid ("006a0dba-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("39b2b47f-4cd7-4ebc-9edf-a3919b35d28a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mOwner;
            }

            @objid ("1b5b1d5c-f76b-40f5-9f98-b3df993c22f4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mOwner = value;
            }

            @objid ("5b8a2331-6c58-4f71-a4ac-82bdae660f4a")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.RoleBindingDep();
            }

        }

        @objid ("006a825e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ConnectorRoleSmDependency extends SmSingleDependency {
            @objid ("be74bf4f-1d55-4510-876d-89c4b04d7b02")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mConnectorRole;
            }

            @objid ("e8abf951-a26d-4913-8150-7051cdbb685e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mConnectorRole = value;
            }

            @objid ("5e550227-ae28-4c0f-95cf-5da2dee6acec")
            @Override
            public SmDependency getSymetric() {
                return NaryConnectorData.Metadata.RepresentationDep();
            }

        }

        @objid ("006af75c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RoleSmDependency extends SmSingleDependency {
            @objid ("5a54c9e4-1fd4-4459-a3fb-0273861d3078")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mRole;
            }

            @objid ("5d853d73-ce87-46c4-8f77-712788623f6a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mRole = value;
            }

            @objid ("d3c254d1-044b-4e02-9e1f-e0a5dc9dd98a")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.RepresentationDep();
            }

        }

        @objid ("006b6fe8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ConnectorEndRoleSmDependency extends SmSingleDependency {
            @objid ("0cdad775-d821-4574-9893-f8035d3cbb51")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mConnectorEndRole;
            }

            @objid ("e300f79f-7505-44c6-8ca1-2c5992edeff9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mConnectorEndRole = value;
            }

            @objid ("eb22fbe7-18ee-49f2-a657-4c06f636da93")
            @Override
            public SmDependency getSymetric() {
                return ConnectorEndData.Metadata.RepresentationDep();
            }

        }

    }

}
