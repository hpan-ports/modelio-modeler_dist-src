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
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.analyst.GoalData;
import org.modelio.metamodel.impl.analyst.GoalContainerImpl;
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

@objid ("16f29540-3b49-4c2f-851d-a2d366fbab74")
@SmaMetaClass(mmClass=GoalContainer.class, factory=GoalContainerData.Metadata.ObjectFactory.class, cmsnode=true)
public class GoalContainerData extends AnalystContainerData {
    @objid ("46bd070e-0fbc-41c3-860d-ee10b354404f")
    @SmaMetaAssociation(metaName="OwnedGoal", typeDataClass=GoalData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedGoalSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedGoal = null;

    @objid ("e4f32a18-8640-411b-a193-07a3ca94b48b")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GoalContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("8fb62bfd-34a4-47b3-adc4-5334d902ef4b")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=GoalContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("072411b4-4339-42c2-a830-6a4449a210de")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("389de3fe-c20c-498e-9473-17fd63ec14e0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("b726a173-e683-4024-82f5-fb9cf9ec2787")
    public static class Metadata {
        @objid ("3f5c89ed-b435-4740-b225-8c3d9ae8b3e9")
        private static SmClass smClass = null;

        @objid ("fd27e498-1dca-4117-bb46-6b881c5eaf2d")
        private static SmDependency OwnedGoalDep = null;

        @objid ("ec7f274d-e794-4cd9-aa25-3292108cf581")
        private static SmDependency OwnerContainerDep = null;

        @objid ("4c8326c6-c146-442d-a28a-4b3823a2a19f")
        private static SmDependency OwnedContainerDep = null;

        @objid ("152f5ab1-d884-452d-ac02-c93195bd86e0")
        private static SmDependency OwnerProjectDep = null;

        @objid ("0ac40b88-79e5-466c-aa29-5c97faf229fc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GoalContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b487b6f6-4a25-451f-aa41-7176c45b9f3f")
        public static SmDependency OwnedGoalDep() {
            if (OwnedGoalDep == null) {
            	OwnedGoalDep = classof().getDependencyDef("OwnedGoal");
            }
            return OwnedGoalDep;
        }

        @objid ("11506f7b-4ce4-492e-bc51-13a9a343dbed")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("a5c073dd-4031-424a-8c13-699669ed09c7")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("36401a53-a5c9-4bb2-ae6f-71be066c7b70")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("23611946-25f1-4e4d-8ee4-9e077cc6187c")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("c2cc4680-16b7-4c27-8750-74156453fdaf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1b1f027f-f828-4dde-941a-ef8c479dca46")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("8e29018c-d9e3-4a29-93a3-6fda2750840a")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("14c2f5ff-7061-4ea3-8401-fe8bbdafde76")
        public static SmDependency getOwnedGoalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedGoalDep;
        }

        @objid ("82c1966e-dd5d-46c7-8a86-b49b89d360c6")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8f600ab2-ab55-44d4-b968-19b154eef7fb")
            public ISmObjectData createData() {
                return new GoalContainerData();
            }

            @objid ("58ded4e1-be7b-42c8-958b-f0fb88a32449")
            public SmObjectImpl createImpl() {
                return new GoalContainerImpl();
            }

        }

        @objid ("0d4cd347-046e-4635-bc3c-50fce1f4e17d")
        public static class OwnedGoalSmDependency extends SmMultipleDependency {
            @objid ("eef160df-1551-4899-a248-c60af1b20e88")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalContainerData)data).mOwnedGoal != null)? ((GoalContainerData)data).mOwnedGoal:SmMultipleDependency.EMPTY;
            }

            @objid ("d33df38a-1d61-4f84-9e28-10fbeaca7611")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalContainerData) data).mOwnedGoal = new ArrayList<>(initialCapacity);
                return ((GoalContainerData) data).mOwnedGoal;
            }

            @objid ("91a7447f-1fff-450e-8a65-37237703ca3f")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("932a9100-f806-4031-a72a-cb0c9e2c06bd")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("cf775977-5b58-427d-8550-2e78e70e35b3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalContainerData) data).mOwnerContainer;
            }

            @objid ("311ffbc3-c350-4d44-978b-a61350e06c52")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalContainerData) data).mOwnerContainer = value;
            }

            @objid ("81a29bf1-dee6-4290-bbaf-ad2c65e349eb")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("c9f9aee3-5b94-40c4-bbf8-b89e6cb27e14")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("4fc8f27d-4890-4269-86c9-face5378153a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalContainerData)data).mOwnedContainer != null)? ((GoalContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("ec5e0728-1670-4ffc-a67b-9cb4f2bdd2ec")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((GoalContainerData) data).mOwnedContainer;
            }

            @objid ("a8c6f797-3fed-45df-a624-1649e6b2fd24")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("e868d39d-9d8b-427a-8309-1b428f86fc4f")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("2b89a4cd-991b-4f67-851d-39e9d9b74f88")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalContainerData) data).mOwnerProject;
            }

            @objid ("43f5786b-ff22-4d73-8d3f-57a635810cc6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalContainerData) data).mOwnerProject = value;
            }

            @objid ("5fdaf2f8-706f-4003-aba0-6b36bc55eff2")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.GoalRootDep();
            }

        }

    }

}
