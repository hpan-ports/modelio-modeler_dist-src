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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.analyst.RequirementData;
import org.modelio.metamodel.impl.analyst.RequirementContainerImpl;
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

@objid ("3ae27d60-636c-4129-aaed-34265d379087")
@SmaMetaClass(mmClass=RequirementContainer.class, factory=RequirementContainerData.Metadata.ObjectFactory.class, cmsnode=true)
public class RequirementContainerData extends AnalystContainerData {
    @objid ("e4ac0743-1edb-4c87-9268-5df4d92d5b43")
    @SmaMetaAssociation(metaName="OwnedRequirement", typeDataClass=RequirementData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedRequirementSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedRequirement = null;

    @objid ("4cc9c7ae-ad76-404f-b3e5-f48049c6460c")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=RequirementContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("e346c445-cff3-4c77-894f-438f00ff8020")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=RequirementContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("7c3ecd76-a0ac-434b-ace4-75c6e3ddeec3")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("ee065dd3-19fa-42f4-9a63-5d206ef8f740")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("528dce26-56e4-47cd-93e2-650a832a447b")
    public static class Metadata {
        @objid ("4daa7799-c345-46e1-ad89-27f9b7413082")
        private static SmClass smClass = null;

        @objid ("11e5a2cf-cdf4-42b5-a647-7cd7d2d90605")
        private static SmDependency OwnedRequirementDep = null;

        @objid ("19d7b454-514a-48f0-a5be-f9ba83cf3669")
        private static SmDependency OwnerContainerDep = null;

        @objid ("9166721d-ddfc-4de3-8eb2-7651359922c5")
        private static SmDependency OwnedContainerDep = null;

        @objid ("587fa18f-0fe1-454a-a2bc-443ef506d6b5")
        private static SmDependency OwnerProjectDep = null;

        @objid ("3e8c25e5-bf57-4adc-bfd0-84192c311f7f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RequirementContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9ec47b8a-6876-4888-b190-960ba022f58a")
        public static SmDependency OwnedRequirementDep() {
            if (OwnedRequirementDep == null) {
            	OwnedRequirementDep = classof().getDependencyDef("OwnedRequirement");
            }
            return OwnedRequirementDep;
        }

        @objid ("04e097a0-9139-4f11-b607-af5fe788a42f")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("690e6a1f-b334-422b-a01f-4b5cc4c1dbd1")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("a19ca3d5-6daa-4e69-b749-835d476a8430")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("e8cd6f15-9570-47b5-a34b-f1ef78cdab4f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("878d6540-2e1f-409f-91bc-1735c04e1dcf")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("8d2811a6-0f5c-4a23-ab5a-6aa3ab84d966")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("31f300b5-1c17-4d50-81be-1c7dca536b91")
        public static SmDependency getOwnedRequirementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedRequirementDep;
        }

        @objid ("f8b4f89e-ffb2-4531-a085-d9f691649da0")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("07ce1ca0-a488-42bb-a7cf-4eeb4f1ff33e")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5705c5c5-5a82-4f74-8679-2b9e7bd802ac")
            public ISmObjectData createData() {
                return new RequirementContainerData();
            }

            @objid ("4ddd9fc4-1611-47e7-9b13-c288fb024006")
            public SmObjectImpl createImpl() {
                return new RequirementContainerImpl();
            }

        }

        @objid ("f1c82696-4fcd-4b1b-b5c0-d18f2f74a598")
        public static class OwnedRequirementSmDependency extends SmMultipleDependency {
            @objid ("dcc5613a-c123-4830-816d-ea3505684968")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementContainerData)data).mOwnedRequirement != null)? ((RequirementContainerData)data).mOwnedRequirement:SmMultipleDependency.EMPTY;
            }

            @objid ("5c63f1b0-4179-4e6d-93d6-e51abff1e9dc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementContainerData) data).mOwnedRequirement = new ArrayList<>(initialCapacity);
                return ((RequirementContainerData) data).mOwnedRequirement;
            }

            @objid ("b5632d9e-876a-4a09-8927-7c2d96e60a41")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("c5897d15-00b0-4e45-bb22-aebcb970058a")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("c011f762-a432-4b44-bf1b-385d77e757b2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementContainerData) data).mOwnerContainer;
            }

            @objid ("63e9dca9-4574-45d0-98f6-0986dacbafc4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementContainerData) data).mOwnerContainer = value;
            }

            @objid ("8b109d3d-c1bf-4f1d-841b-c97500c4b631")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("330d97fb-2196-4371-91a5-ab6af7e69c7a")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("bcf10da7-f9ce-411f-83da-d15229951389")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementContainerData)data).mOwnedContainer != null)? ((RequirementContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("1a699f99-99a7-4006-9d96-3d7d9c532bef")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((RequirementContainerData) data).mOwnedContainer;
            }

            @objid ("d9d30c83-a09e-4b4b-b537-81cd9d07df34")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("42ad14b7-d56e-4447-9f4e-e75140745b73")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("369c93d2-1fa4-4c6f-966b-1edcb69aa8a7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementContainerData) data).mOwnerProject;
            }

            @objid ("53105af5-69dd-45ef-961e-38183202ddc9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementContainerData) data).mOwnerProject = value;
            }

            @objid ("05285faf-65ce-4b2f-bd70-e87b47414a1a")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.RequirementRootDep();
            }

        }

    }

}
