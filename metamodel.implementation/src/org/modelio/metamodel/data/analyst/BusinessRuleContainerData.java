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
    @objid ("d4a542c3-98a4-45c5-8143-748b8983cb0e")
    @SmaMetaAssociation(metaName="OwnedRule", typeDataClass=BusinessRuleData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedRuleSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedRule = null;

    @objid ("df4648ab-64d3-4a39-a933-d0feb723813c")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=BusinessRuleContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("edf51510-2809-4b79-a763-a1b9b9dc3976")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=BusinessRuleContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("95c0f683-4ebe-425f-9ef7-e02c6c329a5b")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("e0876c7f-dcaf-4bbe-9415-7d31e19a9a09")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("1f0fdee9-10fb-46f9-9676-75528ad7021f")
    public static class Metadata {
        @objid ("c738784c-215a-4ad5-86a5-15d0bb363d2b")
        private static SmClass smClass = null;

        @objid ("b57a3aa8-e164-49c7-bcc1-91e1e5001263")
        private static SmDependency OwnedRuleDep = null;

        @objid ("10b02694-6129-426d-be55-40752dd81747")
        private static SmDependency OwnerContainerDep = null;

        @objid ("9add42d6-9767-4961-be0a-cb3895fd02fc")
        private static SmDependency OwnedContainerDep = null;

        @objid ("c0f2d12d-2ed8-4edb-9beb-61785f193601")
        private static SmDependency OwnerProjectDep = null;

        @objid ("ffe181dc-70c2-46d3-b4de-baeafaee68cd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BusinessRuleContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("76a112e8-3e83-4f62-a790-36e504080d6d")
        public static SmDependency OwnedRuleDep() {
            if (OwnedRuleDep == null) {
            	OwnedRuleDep = classof().getDependencyDef("OwnedRule");
            }
            return OwnedRuleDep;
        }

        @objid ("1c8527cc-d398-488b-bc05-50eb29af5c73")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("c785edf6-26b5-4217-a020-6b94bd20dfe9")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("b24b0b99-c14a-4bc7-b86c-b3e0bdd70994")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("a0efacbb-1a8e-4437-b3d1-6015b129cbee")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("fba22880-9539-473a-9d1e-5c0612b65e5a")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("8ee5e1bf-e36d-4b0c-aebb-b512cf197056")
        public static SmDependency getOwnedRuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedRuleDep;
        }

        @objid ("12653f83-4992-49d9-bb05-cf0c4394962c")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("ddcc1d1d-5b5d-47fd-8646-175f6fe0f130")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("add7bde6-5e2f-42eb-b11b-f900a0512600")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ee7edc2b-6078-4cdc-82ed-f98aff2070eb")
            public ISmObjectData createData() {
                return new BusinessRuleContainerData();
            }

            @objid ("57c06ba9-f900-42f5-ac9e-f1659bcee9e0")
            public SmObjectImpl createImpl() {
                return new BusinessRuleContainerImpl();
            }

        }

        @objid ("91c3c906-d5c2-407c-bf2e-2e538edb4138")
        public static class OwnedRuleSmDependency extends SmMultipleDependency {
            @objid ("67284d57-68d2-4601-a406-7185c77ea670")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleContainerData)data).mOwnedRule != null)? ((BusinessRuleContainerData)data).mOwnedRule:SmMultipleDependency.EMPTY;
            }

            @objid ("1f135435-c3b0-45c2-b998-8eccc4529dbb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleContainerData) data).mOwnedRule = new ArrayList<>(initialCapacity);
                return ((BusinessRuleContainerData) data).mOwnedRule;
            }

            @objid ("3317503c-827a-4be8-aaca-9a23374fe792")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("b39f2139-cfab-4468-b932-b76486c1ccfb")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("b21cc050-fb02-44b6-baac-0d89528d7002")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleContainerData) data).mOwnerContainer;
            }

            @objid ("4a763721-498b-41ed-94c3-c50828d801ce")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleContainerData) data).mOwnerContainer = value;
            }

            @objid ("bd0fd3bb-9a0d-4a87-a8b4-3f4d4a1a00cf")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("958e7f97-3131-4622-a4c3-ce7602658833")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("9e6756a4-10d9-481a-b282-1ddc63113b76")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleContainerData)data).mOwnedContainer != null)? ((BusinessRuleContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("90bedd1b-fc26-46fd-a9e0-5a983be8c2d8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((BusinessRuleContainerData) data).mOwnedContainer;
            }

            @objid ("8fd66705-1677-4cc1-95cf-093101ebe32b")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("248d50af-0124-4053-98d9-d30a4503ac33")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("33a21dbb-1e70-4525-b555-fe17886c3dfa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleContainerData) data).mOwnerProject;
            }

            @objid ("bc6d071a-4fbd-41a2-a1ac-70f447de5483")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleContainerData) data).mOwnerProject = value;
            }

            @objid ("a1810ee3-2271-46e7-88d9-556e83e5ddca")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.BusinessRuleRootDep();
            }

        }

    }

}
