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
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.analyst.BusinessRuleData;
import org.modelio.metamodel.impl.analyst.BusinessRuleContainerImpl;
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

@objid ("43bed3c3-3cdf-4dab-9cc1-98967bdd90dc")
@SmaMetaClass(mmClass=BusinessRuleContainer.class, factory=BusinessRuleContainerData.Metadata.ObjectFactory.class, cmsnode=true)
public class BusinessRuleContainerData extends AnalystContainerData {
    @objid ("f42eff49-3b4e-4f86-8b68-67b37c872370")
    @SmaMetaAssociation(metaName="OwnedRule", typeDataClass=BusinessRuleData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedRuleSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedRule = null;

    @objid ("b911a738-5ab7-44d7-be87-8b324deb1916")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=BusinessRuleContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("b14f9ea8-f3bc-4de1-9fff-cb5aab6e20fc")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=BusinessRuleContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("ccf50e83-6fc1-4c04-bbc3-d904b0d10a2f")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("4470f404-53d5-4d2b-b48c-415f70e4b55c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("1f0fdee9-10fb-46f9-9676-75528ad7021f")
    public static class Metadata {
        @objid ("1c2d3f0f-4a94-48f8-824b-8fbdadb12eee")
        private static SmClass smClass = null;

        @objid ("b166cc35-870c-4f0a-b1eb-b966a065126c")
        private static SmDependency OwnedRuleDep = null;

        @objid ("2ca7ec0a-e2b1-4595-a791-51e32a6deccd")
        private static SmDependency OwnerContainerDep = null;

        @objid ("ea0b22d6-f46b-4358-a7a5-2727d594e1ab")
        private static SmDependency OwnedContainerDep = null;

        @objid ("111c114b-e469-45fa-b325-0634de063ee6")
        private static SmDependency OwnerProjectDep = null;

        @objid ("24c7d9ee-9f3f-4e53-9294-9768d02ef75a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BusinessRuleContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a9c899e1-b0a6-4c34-b484-a99c8537d394")
        public static SmDependency OwnedRuleDep() {
            if (OwnedRuleDep == null) {
            	OwnedRuleDep = classof().getDependencyDef("OwnedRule");
            }
            return OwnedRuleDep;
        }

        @objid ("883cb97d-6073-46c5-ab63-a0cef7cdbbb0")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("9c3b95b4-db22-4e9e-9b1e-c928a42c1be9")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("39492a69-d081-463f-8f9e-f9941d240ea0")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("8dd2282f-4356-493b-942e-67fbd819799f")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("0babfa7b-1095-4186-947f-c6e773a32a70")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("89bee12a-2509-44f2-94b7-8b5a656fa9a8")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("73e608ee-be0d-4318-b2d0-a11ecb9696f2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6ea595b9-429e-4a62-95fb-c22aa31ad4b6")
        public static SmDependency getOwnedRuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedRuleDep;
        }

        @objid ("add7bde6-5e2f-42eb-b11b-f900a0512600")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7534a277-d435-4ab0-8f4c-5b9e7607027c")
            public ISmObjectData createData() {
                return new BusinessRuleContainerData();
            }

            @objid ("36d0afc1-a00b-47be-95df-462744768359")
            public SmObjectImpl createImpl() {
                return new BusinessRuleContainerImpl();
            }

        }

        @objid ("91c3c906-d5c2-407c-bf2e-2e538edb4138")
        public static class OwnedRuleSmDependency extends SmMultipleDependency {
            @objid ("cc1a6462-0999-459e-afd5-55e1bdea6d8e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleContainerData)data).mOwnedRule != null)? ((BusinessRuleContainerData)data).mOwnedRule:SmMultipleDependency.EMPTY;
            }

            @objid ("83c789d9-623a-41a2-8c87-f6cf7a45864a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleContainerData) data).mOwnedRule = new ArrayList<>(initialCapacity);
                return ((BusinessRuleContainerData) data).mOwnedRule;
            }

            @objid ("7d277b05-b627-4a1b-8735-efac174e0e14")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("b39f2139-cfab-4468-b932-b76486c1ccfb")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("b44ccaba-3b19-4864-9215-68fcf3a8f470")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleContainerData) data).mOwnerContainer;
            }

            @objid ("d8f33dc8-c4e0-41cb-88a4-d653f3136386")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleContainerData) data).mOwnerContainer = value;
            }

            @objid ("7e0bb870-99d1-44e8-8a8f-f9b52293921a")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("958e7f97-3131-4622-a4c3-ce7602658833")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("2505665b-5aba-4de2-a330-2292a1640db1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleContainerData)data).mOwnedContainer != null)? ((BusinessRuleContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("77d2cf6c-aedf-42c4-991f-0014014d645d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((BusinessRuleContainerData) data).mOwnedContainer;
            }

            @objid ("f43a8503-88b2-46a2-9a27-f8842e271aa1")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("248d50af-0124-4053-98d9-d30a4503ac33")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("cbda0c77-d8ac-4835-bd45-4568ac5b124f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleContainerData) data).mOwnerProject;
            }

            @objid ("bae2535a-6f94-4d4e-bf6b-533b660393fc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleContainerData) data).mOwnerProject = value;
            }

            @objid ("4fc317fa-a4a9-40a4-8669-8b65d1cd56bf")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.BusinessRuleRootDep();
            }

        }

    }

}
