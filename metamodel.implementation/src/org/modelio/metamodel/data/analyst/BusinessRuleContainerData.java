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
    @objid ("7b4d7380-3241-4dfd-92e8-a31196eb0506")
    @SmaMetaAssociation(metaName="OwnedRule", typeDataClass=BusinessRuleData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedRuleSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedRule = null;

    @objid ("67f1062a-3bb0-4124-97d1-9a1c6a3a628a")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=BusinessRuleContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("f76bee14-dad5-427e-8cc8-00f8f335d247")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=BusinessRuleContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("41be43af-f2d4-46e5-be4d-a55ac0e932f7")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("28088744-a31c-43e1-aed7-11b7ea74072d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("1f0fdee9-10fb-46f9-9676-75528ad7021f")
    public static class Metadata {
        @objid ("24e9346c-4c53-415e-a989-610533aa4541")
        private static SmClass smClass = null;

        @objid ("f20096b9-d7e6-4805-bf2d-d8024530e3e3")
        private static SmDependency OwnedRuleDep = null;

        @objid ("1f7df0f5-3789-4964-a55d-5ed7c8a118c1")
        private static SmDependency OwnerContainerDep = null;

        @objid ("2979c84c-4896-455e-8804-e78fe521f107")
        private static SmDependency OwnedContainerDep = null;

        @objid ("aafa6dc7-7a54-4c83-8a2b-ece059d7e3e9")
        private static SmDependency OwnerProjectDep = null;

        @objid ("dfb01e38-25e7-4742-b74a-2731795ef716")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BusinessRuleContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("93392836-3a7f-43ca-97e6-1603e6fe3e07")
        public static SmDependency OwnedRuleDep() {
            if (OwnedRuleDep == null) {
            	OwnedRuleDep = classof().getDependencyDef("OwnedRule");
            }
            return OwnedRuleDep;
        }

        @objid ("bf3f5531-a9d8-4280-af49-5065e182f1d6")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("90ff61e7-6741-4970-bea7-ee5240edec5f")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("334b623a-91d3-4144-9050-1978b66edc84")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("75db78ff-9388-41e3-8142-d08642d6de5a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1a7dba23-d392-46d9-b9c2-be71152c4b7a")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("390426d2-57b2-4276-bd4d-25c500800799")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("974d4cb2-2d1f-4f99-9453-472e9a6f10da")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("a15aed2d-3b0f-4ba5-a6ac-22210b3439dd")
        public static SmDependency getOwnedRuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedRuleDep;
        }

        @objid ("add7bde6-5e2f-42eb-b11b-f900a0512600")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1c7ce8f4-ac18-45c8-8d71-d115012282bd")
            public ISmObjectData createData() {
                return new BusinessRuleContainerData();
            }

            @objid ("d90c2d90-16de-417c-bacc-4f2129d57001")
            public SmObjectImpl createImpl() {
                return new BusinessRuleContainerImpl();
            }

        }

        @objid ("91c3c906-d5c2-407c-bf2e-2e538edb4138")
        public static class OwnedRuleSmDependency extends SmMultipleDependency {
            @objid ("5356ec27-d04f-4a5a-aa9a-192978871807")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleContainerData)data).mOwnedRule != null)? ((BusinessRuleContainerData)data).mOwnedRule:SmMultipleDependency.EMPTY;
            }

            @objid ("1ec40af2-988b-4b70-a6ff-9c8d76efa30c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleContainerData) data).mOwnedRule = new ArrayList<>(initialCapacity);
                return ((BusinessRuleContainerData) data).mOwnedRule;
            }

            @objid ("4481adb7-b566-466d-8d13-e0e45c82b097")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("b39f2139-cfab-4468-b932-b76486c1ccfb")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("e6790751-f02b-42a1-b7d7-404fd05a02f4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleContainerData) data).mOwnerContainer;
            }

            @objid ("d36881a3-fa07-4948-8fcf-4a300c8ea5b1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleContainerData) data).mOwnerContainer = value;
            }

            @objid ("56f2d41f-dd86-4c89-9123-4aca52b48a53")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("958e7f97-3131-4622-a4c3-ce7602658833")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("5d4c385f-dba9-4401-8240-970a19b5e721")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleContainerData)data).mOwnedContainer != null)? ((BusinessRuleContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("0c2bac6b-97f3-45de-a434-17855cf30278")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((BusinessRuleContainerData) data).mOwnedContainer;
            }

            @objid ("d3e90d15-dd97-4ac7-a2c7-8bbbbca0c692")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("248d50af-0124-4053-98d9-d30a4503ac33")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("810e714d-57cf-4108-880f-9f6ce3b7020e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleContainerData) data).mOwnerProject;
            }

            @objid ("0a5ebb48-b9ce-41b6-abb9-3b535a74ce51")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleContainerData) data).mOwnerProject = value;
            }

            @objid ("d5222671-8065-4116-b692-1d8e05db47b3")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.BusinessRuleRootDep();
            }

        }

    }

}
