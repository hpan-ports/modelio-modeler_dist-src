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
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.data.analyst.BusinessRuleContainerData;
import org.modelio.metamodel.impl.analyst.BusinessRuleImpl;
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

@objid ("4da7b9f3-596c-4989-b28e-a35e40d48073")
@SmaMetaClass(mmClass=BusinessRule.class, factory=BusinessRuleData.Metadata.ObjectFactory.class, cmsnode=true)
public class BusinessRuleData extends AnalystElementData {
    @objid ("53f6c590-2e04-4bd1-8645-12b0afbf795e")
    @SmaMetaAssociation(metaName="SubRule", typeDataClass=BusinessRuleData.class, min=0, max=-1, smAssociationClass=Metadata.SubRuleSmDependency.class, component = true)
     List<SmObjectImpl> mSubRule = null;

    @objid ("c419d41a-f285-4301-a937-8b79ce120183")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=BusinessRuleContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("2bfdb3f4-0519-4727-a556-eca5ad2fc590")
    @SmaMetaAssociation(metaName="ParentRule", typeDataClass=BusinessRuleData.class, min=0, max=1, smAssociationClass=Metadata.ParentRuleSmDependency.class)
     SmObjectImpl mParentRule;

    @objid ("23c3301b-bdb7-4a57-8d1d-582f484867a7")
    @SmaMetaAssociation(metaName="LastRuleVersion", typeDataClass=BusinessRuleData.class, min=0, max=1, smAssociationClass=Metadata.LastRuleVersionSmDependency.class)
     SmObjectImpl mLastRuleVersion;

    @objid ("d832e6b1-674a-42ed-92e7-cdb0ca98d574")
    @SmaMetaAssociation(metaName="ArchivedRuleVersion", typeDataClass=BusinessRuleData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedRuleVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedRuleVersion = null;

    @objid ("aa5d67a2-1a5d-4025-8e49-83348c38a386")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("785300db-57ee-4e9e-8380-59b5550f902c")
    public static class Metadata {
        @objid ("5942ea97-2614-4a3a-b5c2-838cec1d52d1")
        private static SmClass smClass = null;

        @objid ("4421c633-737d-4c37-aca0-c343761b87ab")
        private static SmDependency SubRuleDep = null;

        @objid ("75c7ad51-ee84-4641-90f1-44fa319997e8")
        private static SmDependency OwnerContainerDep = null;

        @objid ("5b41b162-6515-4902-91f9-068be873c784")
        private static SmDependency ParentRuleDep = null;

        @objid ("fecc34f3-3550-4ab3-a6b4-750b94780166")
        private static SmDependency LastRuleVersionDep = null;

        @objid ("e81c0c95-42bf-44d9-9bbf-74e3fed176a0")
        private static SmDependency ArchivedRuleVersionDep = null;

        @objid ("6ac7c1b2-8558-4798-80a0-6fd76e9934aa")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BusinessRuleData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c1ab5474-e131-4540-aff8-bff818627fe8")
        public static SmDependency SubRuleDep() {
            if (SubRuleDep == null) {
            	SubRuleDep = classof().getDependencyDef("SubRule");
            }
            return SubRuleDep;
        }

        @objid ("4929889d-549a-49b7-9dcd-36c08e82c9e1")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("d3109175-0473-40ce-9168-0c34edc25c54")
        public static SmDependency ParentRuleDep() {
            if (ParentRuleDep == null) {
            	ParentRuleDep = classof().getDependencyDef("ParentRule");
            }
            return ParentRuleDep;
        }

        @objid ("d294cb78-2ad9-4925-b10a-fe41e86bd2d6")
        public static SmDependency LastRuleVersionDep() {
            if (LastRuleVersionDep == null) {
            	LastRuleVersionDep = classof().getDependencyDef("LastRuleVersion");
            }
            return LastRuleVersionDep;
        }

        @objid ("2e03ada1-8509-480d-aac8-9c18e877d238")
        public static SmDependency ArchivedRuleVersionDep() {
            if (ArchivedRuleVersionDep == null) {
            	ArchivedRuleVersionDep = classof().getDependencyDef("ArchivedRuleVersion");
            }
            return ArchivedRuleVersionDep;
        }

        @objid ("b8476d4e-d83c-4420-b895-c1ffd2d64822")
        public static SmDependency getParentRuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentRuleDep;
        }

        @objid ("3157be25-e64e-45ed-9c28-be953ab22043")
        public static SmDependency getArchivedRuleVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedRuleVersionDep;
        }

        @objid ("6d1b653d-b7f6-45c2-b5db-49126cb11d2e")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("83dd9497-8c42-4522-89d5-d6f7e43d95be")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("9fe307b0-5445-4168-8568-3af72ca78ce1")
        public static SmDependency getSubRuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubRuleDep;
        }

        @objid ("9d8cacec-d89e-4654-96a5-8110641be19c")
        public static SmDependency getLastRuleVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastRuleVersionDep;
        }

        @objid ("89f134e8-1104-4a8f-8f98-c2c2fc658691")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3e5cce93-a575-4d1b-b264-1b304a357ecf")
            public ISmObjectData createData() {
                return new BusinessRuleData();
            }

            @objid ("48ebd71a-5c06-4612-838c-18855a8574a7")
            public SmObjectImpl createImpl() {
                return new BusinessRuleImpl();
            }

        }

        @objid ("415085fe-8305-48ba-823b-cfe61e2be578")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("f1a4fe2b-3672-4d58-b381-62e542a9f554")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleData) data).mOwnerContainer;
            }

            @objid ("3d26b5fa-5f09-4923-be7c-ef017c9925cd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleData) data).mOwnerContainer = value;
            }

            @objid ("37535ced-e491-4a6a-8501-e267a52b628d")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnedRuleDep();
            }

        }

        @objid ("3405a99c-020c-4223-8372-bc73f519d55a")
        public static class ParentRuleSmDependency extends SmSingleDependency {
            @objid ("58c05258-825e-44b2-8e37-c7d39a4f7ddd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleData) data).mParentRule;
            }

            @objid ("0b6f8cdf-438e-4f30-ac24-1880d168f74f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleData) data).mParentRule = value;
            }

            @objid ("00848b73-09c1-46e3-9052-e9f714f7c276")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.SubRuleDep();
            }

        }

        @objid ("8e4029b8-e2ad-418a-90b7-315612b06ca9")
        public static class SubRuleSmDependency extends SmMultipleDependency {
            @objid ("eb815c3a-4286-4b59-b10d-f44a18a16e47")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleData)data).mSubRule != null)? ((BusinessRuleData)data).mSubRule:SmMultipleDependency.EMPTY;
            }

            @objid ("6b846dc2-51c4-4b0a-b763-1796b562af5a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleData) data).mSubRule = new ArrayList<>(initialCapacity);
                return ((BusinessRuleData) data).mSubRule;
            }

            @objid ("fdea2a24-b014-458b-8081-c18a0b5d0a2e")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.ParentRuleDep();
            }

        }

        @objid ("26ffe0fa-f31b-47dd-bb85-368e627f5526")
        public static class LastRuleVersionSmDependency extends SmSingleDependency {
            @objid ("a748e0e4-8c7a-46ed-b339-bff1a8953fef")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleData) data).mLastRuleVersion;
            }

            @objid ("8ef85332-e780-406a-9741-2a3d51807edf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleData) data).mLastRuleVersion = value;
            }

            @objid ("3d40fe96-7ed2-40ec-9896-f069881f223e")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.ArchivedRuleVersionDep();
            }

        }

        @objid ("d272e18f-a535-4f50-b622-5d7b4bf7659a")
        public static class ArchivedRuleVersionSmDependency extends SmMultipleDependency {
            @objid ("4f14dc4a-f3da-46d5-9b30-b1840e13f1a4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleData)data).mArchivedRuleVersion != null)? ((BusinessRuleData)data).mArchivedRuleVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("3d457828-63c8-433c-872c-9043e92fb211")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleData) data).mArchivedRuleVersion = new ArrayList<>(initialCapacity);
                return ((BusinessRuleData) data).mArchivedRuleVersion;
            }

            @objid ("d17aece4-ddac-45b9-9594-d203a3c2e76d")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.LastRuleVersionDep();
            }

        }

    }

}
