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
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.data.analyst.GoalContainerData;
import org.modelio.metamodel.impl.analyst.GoalImpl;
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

@objid ("e8d12951-1ab0-47fa-a43b-bfbe216ceb44")
@SmaMetaClass(mmClass=Goal.class, factory=GoalData.Metadata.ObjectFactory.class)
public class GoalData extends AnalystElementData {
    @objid ("a6af09eb-6efc-408a-8c9a-57517d9c9954")
    @SmaMetaAssociation(metaName="SubGoal", typeDataClass=GoalData.class, min=0, max=-1, smAssociationClass=Metadata.SubGoalSmDependency.class, component = true)
     List<SmObjectImpl> mSubGoal = null;

    @objid ("9777fb06-065d-4e92-8508-5d0082eb1f76")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GoalContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("bea2f73d-9cd8-4f22-b113-78c870d93cc3")
    @SmaMetaAssociation(metaName="ParentGoal", typeDataClass=GoalData.class, min=0, max=1, smAssociationClass=Metadata.ParentGoalSmDependency.class)
     SmObjectImpl mParentGoal;

    @objid ("63d5f0a3-05e4-4200-8139-72ed951e4856")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("5e744ed9-032b-413d-9224-56a38b7d43ef")
    public static class Metadata {
        @objid ("3ea19fd8-002d-4f03-9dec-8f7e13988c12")
        private static SmClass smClass = null;

        @objid ("5c998cec-757d-4767-bd6b-44a21617fd2e")
        private static SmDependency SubGoalDep = null;

        @objid ("a66d3ea4-6893-4f36-b8d2-c278653ff573")
        private static SmDependency OwnerContainerDep = null;

        @objid ("eeecbc42-bde6-4d7c-ac83-b8b8aff773c8")
        private static SmDependency ParentGoalDep = null;

        @objid ("02c2c757-680a-40a9-a07d-b6348b5484a2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GoalData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8f859256-3f92-4774-b036-9b787d812277")
        public static SmDependency SubGoalDep() {
            if (SubGoalDep == null) {
            	SubGoalDep = classof().getDependencyDef("SubGoal");
            }
            return SubGoalDep;
        }

        @objid ("0a65c711-c739-4e36-acf3-1e24dd714dc3")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("513c1a74-8091-4245-aa86-d7cfe74c9a5e")
        public static SmDependency ParentGoalDep() {
            if (ParentGoalDep == null) {
            	ParentGoalDep = classof().getDependencyDef("ParentGoal");
            }
            return ParentGoalDep;
        }

        @objid ("f5e9c93f-6477-47c8-a454-d8c427a415f5")
        public static SmDependency getSubGoalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubGoalDep;
        }

        @objid ("9473e905-3a8d-4a88-80e5-07ee18b3c59a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5c949213-3300-4cf9-99ca-72f1b1ae2e02")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("1d096ecf-7628-457c-be29-928c4a5e3fa1")
        public static SmDependency getParentGoalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentGoalDep;
        }

        @objid ("0acdee9a-9cd3-4b6f-8c85-ffd3bad19cdb")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("00ccbbf0-2746-423f-8ca0-e156bb5674ab")
            public ISmObjectData createData() {
                return new GoalData();
            }

            @objid ("7e307770-60e7-40ab-aeaa-fc81da9a9809")
            public SmObjectImpl createImpl() {
                return new GoalImpl();
            }

        }

        @objid ("92a1be87-c6ac-45f9-8990-1f178ac7aaac")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("01e93df1-d83a-4c1b-b52a-80a31016ec48")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalData) data).mOwnerContainer;
            }

            @objid ("51c4367d-2151-4d7e-be6e-6a0621cc73e4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalData) data).mOwnerContainer = value;
            }

            @objid ("fcdb7bb9-b5d1-485d-8edd-157411ebaed3")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnedGoalDep();
            }

        }

        @objid ("d84c6795-9fc0-43be-97fc-a4fba6b4738b")
        public static class ParentGoalSmDependency extends SmSingleDependency {
            @objid ("0f9f32e3-4120-442f-91c7-27f820fef438")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalData) data).mParentGoal;
            }

            @objid ("e2639950-3f75-4d2f-bc1c-7a00db27522f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalData) data).mParentGoal = value;
            }

            @objid ("d278bec1-7e37-4cc2-847b-47ff7b5463f5")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.SubGoalDep();
            }

        }

        @objid ("0f92e307-bc8c-401e-9d37-ab23d953326a")
        public static class SubGoalSmDependency extends SmMultipleDependency {
            @objid ("fde955d3-e5ed-47cd-8244-e6bb48d2d2e2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalData)data).mSubGoal != null)? ((GoalData)data).mSubGoal:SmMultipleDependency.EMPTY;
            }

            @objid ("f7681456-ba41-49d9-bc4e-0c26b2c80e85")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalData) data).mSubGoal = new ArrayList<>(initialCapacity);
                return ((GoalData) data).mSubGoal;
            }

            @objid ("613a9ff6-9ebc-427e-900c-891e37a198c8")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.ParentGoalDep();
            }

        }

    }

}
