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
    @objid ("96e037e3-15d8-41e2-9cb2-c43afadaa5bf")
    @SmaMetaAssociation(metaName="OwnedGoal", typeDataClass=GoalData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedGoalSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedGoal = null;

    @objid ("51c1848c-9b6e-4cfd-a7cf-bec49e6dfd4e")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GoalContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("c1de6c43-f479-4824-bb49-e6bd79152816")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=GoalContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("6b43565c-8b95-4b5c-b31e-86561b04d55f")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("10d88927-d823-4258-8aa5-f97795f3522a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("b726a173-e683-4024-82f5-fb9cf9ec2787")
    public static class Metadata {
        @objid ("2c4a2e41-ba74-49dd-9d00-252731483c4c")
        private static SmClass smClass = null;

        @objid ("7b5a1fc1-5706-4ccf-b420-6d9fdbc48847")
        private static SmDependency OwnedGoalDep = null;

        @objid ("679382ee-be68-4f56-8336-50962d5186db")
        private static SmDependency OwnerContainerDep = null;

        @objid ("3d6d3795-0d76-472d-a0c4-44d2f7c05abd")
        private static SmDependency OwnedContainerDep = null;

        @objid ("e3012395-3ed4-4a27-91f2-d6d327803029")
        private static SmDependency OwnerProjectDep = null;

        @objid ("977cb42b-30a9-4b18-aead-ba8bfb6d6f78")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GoalContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0981b83c-81ea-4667-b4ca-552c26d121c9")
        public static SmDependency OwnedGoalDep() {
            if (OwnedGoalDep == null) {
            	OwnedGoalDep = classof().getDependencyDef("OwnedGoal");
            }
            return OwnedGoalDep;
        }

        @objid ("cc06c803-6176-487b-83cf-e58dd658c0e5")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("1daa349f-dee0-4658-948d-2fd3123d6fc3")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("d2a1e63b-536e-4118-b2ca-f96e2e60d2a1")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("c2ef91c8-4f53-4cb0-a06d-d08e773868dc")
        public static SmDependency getOwnedGoalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedGoalDep;
        }

        @objid ("03b695f6-60a0-4172-836f-58190164f27e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5cf9059e-0633-413a-a9cf-a15156a7961f")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("312858b4-b6b5-4a31-99b0-6ab2f0d401c3")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("24a117ea-a000-44d1-9dd4-35d91294fc1a")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("82c1966e-dd5d-46c7-8a86-b49b89d360c6")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9dfbfd65-c5f3-4381-a713-3f0eadb58882")
            public ISmObjectData createData() {
                return new GoalContainerData();
            }

            @objid ("fbb91d3d-dfb7-45ca-8856-83e748e89841")
            public SmObjectImpl createImpl() {
                return new GoalContainerImpl();
            }

        }

        @objid ("0d4cd347-046e-4635-bc3c-50fce1f4e17d")
        public static class OwnedGoalSmDependency extends SmMultipleDependency {
            @objid ("ed043dc7-cd2f-4ae3-982d-78b0fb9e5db3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalContainerData)data).mOwnedGoal != null)? ((GoalContainerData)data).mOwnedGoal:SmMultipleDependency.EMPTY;
            }

            @objid ("ba40d376-7b80-4308-8717-41a2f702503c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalContainerData) data).mOwnedGoal = new ArrayList<>(initialCapacity);
                return ((GoalContainerData) data).mOwnedGoal;
            }

            @objid ("db9f6bb8-bfb9-412f-b2d7-ec3d2d00a0af")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("932a9100-f806-4031-a72a-cb0c9e2c06bd")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("6a1e0e76-3d08-427c-9e7c-5a5e30fd82bb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalContainerData) data).mOwnerContainer;
            }

            @objid ("91ba0672-9a60-4e21-8567-f868257a7ceb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalContainerData) data).mOwnerContainer = value;
            }

            @objid ("4dec7318-4239-4113-a2e1-bfa41f8b121a")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("c9f9aee3-5b94-40c4-bbf8-b89e6cb27e14")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("c3356e09-c945-48bc-8536-be6cb7c13b05")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalContainerData)data).mOwnedContainer != null)? ((GoalContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("f23f9549-358f-4b4b-81d6-526d1dc259d9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((GoalContainerData) data).mOwnedContainer;
            }

            @objid ("c7977c53-97e9-4b25-b6cc-949a12ef8ee0")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("e868d39d-9d8b-427a-8309-1b428f86fc4f")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("ecbb5968-6a33-44cf-a2ce-853d7e9f3610")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalContainerData) data).mOwnerProject;
            }

            @objid ("5d084a61-5a8c-49c0-9a75-644ae8726d1d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalContainerData) data).mOwnerProject = value;
            }

            @objid ("84f99d33-de9f-4011-8df8-7ac534a31441")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.GoalRootDep();
            }

        }

    }

}
