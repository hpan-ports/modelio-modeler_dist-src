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
    @objid ("cf2044fa-4db0-4cbb-9dc7-74a6ace77a9e")
    @SmaMetaAssociation(metaName="OwnedGoal", typeDataClass=GoalData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedGoalSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedGoal = null;

    @objid ("a9d2bbf1-6af4-4292-b868-838ea7a1234f")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GoalContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("6260d02c-5d34-4728-9e32-d5ed7eb938f7")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=GoalContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("0fafec0e-7059-493d-9e8e-ff67bbc248ea")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("5f253588-3c9e-4ded-a0ff-729f29a35ce6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("b726a173-e683-4024-82f5-fb9cf9ec2787")
    public static class Metadata {
        @objid ("c8ce3737-dc8d-49c9-ad29-ce24fc00afff")
        private static SmClass smClass = null;

        @objid ("033af509-2b42-4d35-98cf-09c17224aa91")
        private static SmDependency OwnedGoalDep = null;

        @objid ("192b6ba4-1d2d-454a-8fc1-3f63b26067f3")
        private static SmDependency OwnerContainerDep = null;

        @objid ("13fdd49d-1cd1-4f08-b05e-e5e918229bc0")
        private static SmDependency OwnedContainerDep = null;

        @objid ("8cec0800-edc9-4f58-a821-da583a5fc24e")
        private static SmDependency OwnerProjectDep = null;

        @objid ("67c19dd8-da02-41a7-8330-c27fbdf232b2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GoalContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("274c2772-4529-476c-8fa0-043ec36a932f")
        public static SmDependency OwnedGoalDep() {
            if (OwnedGoalDep == null) {
            	OwnedGoalDep = classof().getDependencyDef("OwnedGoal");
            }
            return OwnedGoalDep;
        }

        @objid ("e7ca7692-8b6b-4545-95b2-1fa3c002d274")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("5aad72a4-7de2-4792-9876-0fb0ff144583")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("824f996a-719e-468f-afc6-30ff459dd533")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("6ddb4ac9-7691-4846-bf54-7f75e0747bec")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("692a69ea-bbda-43f9-a12d-faf3872bcb06")
        public static SmDependency getOwnedGoalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedGoalDep;
        }

        @objid ("2e104df1-0feb-4980-93d1-8176fda5df71")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("52a2b4db-7e86-4be3-ae8f-d0d4fad57445")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("61d5f01a-1f17-4722-a2eb-474ffcce6c90")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("82c1966e-dd5d-46c7-8a86-b49b89d360c6")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("89dac4dd-fb13-4562-b29b-7f1e2012db79")
            public ISmObjectData createData() {
                return new GoalContainerData();
            }

            @objid ("0eaf6f43-9358-4959-8213-fa8fc983ba35")
            public SmObjectImpl createImpl() {
                return new GoalContainerImpl();
            }

        }

        @objid ("0d4cd347-046e-4635-bc3c-50fce1f4e17d")
        public static class OwnedGoalSmDependency extends SmMultipleDependency {
            @objid ("d7f7cb8e-407c-457e-9c8d-ebf9b7b0f06b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalContainerData)data).mOwnedGoal != null)? ((GoalContainerData)data).mOwnedGoal:SmMultipleDependency.EMPTY;
            }

            @objid ("979dd5f2-484a-491e-b9a5-67bd35bac419")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalContainerData) data).mOwnedGoal = new ArrayList<>(initialCapacity);
                return ((GoalContainerData) data).mOwnedGoal;
            }

            @objid ("e5182e88-0251-4165-8f22-229a232d29c9")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("932a9100-f806-4031-a72a-cb0c9e2c06bd")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("19acace9-ce8f-46b6-bbeb-57d0a45c431b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalContainerData) data).mOwnerContainer;
            }

            @objid ("3edbf22c-c902-421c-828e-ee5a1f7fc370")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalContainerData) data).mOwnerContainer = value;
            }

            @objid ("dda37f94-3dcf-4a09-ba08-62fe5b668bef")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("c9f9aee3-5b94-40c4-bbf8-b89e6cb27e14")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("44eebce7-573b-42bc-ab85-e3169d68e179")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalContainerData)data).mOwnedContainer != null)? ((GoalContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("6cb807dc-9cc8-430e-8d87-2be3fe976ef2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((GoalContainerData) data).mOwnedContainer;
            }

            @objid ("822ab700-9db3-42e5-b0a3-4b5e80cdffe7")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("e868d39d-9d8b-427a-8309-1b428f86fc4f")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("a4123123-3b06-463f-bd03-2dc4eaf6aabc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalContainerData) data).mOwnerProject;
            }

            @objid ("649a68ad-97f5-431e-9baa-bb02e728dcf1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalContainerData) data).mOwnerProject = value;
            }

            @objid ("a8f8a02f-2427-41c9-87f4-ee2459ca0aae")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.GoalRootDep();
            }

        }

    }

}
