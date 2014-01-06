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
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.data.analyst.BusinessRuleContainerData;
import org.modelio.metamodel.data.analyst.DictionaryData;
import org.modelio.metamodel.data.analyst.GenericAnalystContainerData;
import org.modelio.metamodel.data.analyst.GoalContainerData;
import org.modelio.metamodel.data.analyst.PropertyContainerData;
import org.modelio.metamodel.data.analyst.RequirementContainerData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.analyst.AnalystProjectImpl;
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

@objid ("00621268-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AnalystProject.class, factory=AnalystProjectData.Metadata.ObjectFactory.class, cmsnode=true)
public class AnalystProjectData extends ModelElementData {
    @objid ("56c7108d-9303-452a-a6d8-9b34566139f2")
    @SmaMetaAssociation(metaName="PropertyRoot", typeDataClass=PropertyContainerData.class, min=1, max=1, smAssociationClass=Metadata.PropertyRootSmDependency.class, component = true)
     SmObjectImpl mPropertyRoot;

    @objid ("dc20a853-2afc-4f71-9d9b-f3a460de1474")
    @SmaMetaAssociation(metaName="GoalRoot", typeDataClass=GoalContainerData.class, min=0, max=-1, smAssociationClass=Metadata.GoalRootSmDependency.class, component = true)
     List<SmObjectImpl> mGoalRoot = null;

    @objid ("0a6f9ae0-0f21-42a4-b219-d6151fb711ac")
    @SmaMetaAssociation(metaName="BusinessRuleRoot", typeDataClass=BusinessRuleContainerData.class, min=0, max=-1, smAssociationClass=Metadata.BusinessRuleRootSmDependency.class, component = true)
     List<SmObjectImpl> mBusinessRuleRoot = null;

    @objid ("c3868933-904b-4b45-a400-f0e674ffe158")
    @SmaMetaAssociation(metaName="DictionaryRoot", typeDataClass=DictionaryData.class, min=0, max=-1, smAssociationClass=Metadata.DictionaryRootSmDependency.class, component = true)
     List<SmObjectImpl> mDictionaryRoot = null;

    @objid ("1c56bbfa-b731-4ebd-b924-a45cc3f301b9")
    @SmaMetaAssociation(metaName="RequirementRoot", typeDataClass=RequirementContainerData.class, min=0, max=-1, smAssociationClass=Metadata.RequirementRootSmDependency.class, component = true)
     List<SmObjectImpl> mRequirementRoot = null;

    @objid ("94d07cd1-c43e-4cdf-92e6-4f281118f317")
    @SmaMetaAssociation(metaName="GenericRoot", typeDataClass=GenericAnalystContainerData.class, min=0, max=-1, smAssociationClass=Metadata.GenericRootSmDependency.class, component = true)
     List<SmObjectImpl> mGenericRoot = null;

    @objid ("15bfc511-0f28-453e-9cae-49777e60160b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0038fd06-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4e251d71-4054-430d-a2c7-3f167d4e2951")
        private static SmClass smClass = null;

        @objid ("3f80d854-159c-4e8c-91e5-974f21a9debb")
        private static SmDependency PropertyRootDep = null;

        @objid ("55958d76-a750-4973-b0c4-4a8d4d26e3af")
        private static SmDependency GoalRootDep = null;

        @objid ("332a12a9-0ebc-420d-beaf-b96959c31ef3")
        private static SmDependency BusinessRuleRootDep = null;

        @objid ("2133fd14-da30-4e79-b2da-31125174af3e")
        private static SmDependency DictionaryRootDep = null;

        @objid ("e587e760-0ece-4829-b9b5-a684540a624c")
        private static SmDependency RequirementRootDep = null;

        @objid ("af275fd4-92b9-435d-b6d1-55656379357d")
        private static SmDependency GenericRootDep = null;

        @objid ("99d3b658-8417-4a61-b81a-d4bfbbb1aa85")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystProjectData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("379569c3-0b9c-4c15-b3a5-988e0c56d067")
        public static SmDependency PropertyRootDep() {
            if (PropertyRootDep == null) {
            	PropertyRootDep = classof().getDependencyDef("PropertyRoot");
            }
            return PropertyRootDep;
        }

        @objid ("3a28b896-aa2c-4a9e-9d23-6aebd012596f")
        public static SmDependency GoalRootDep() {
            if (GoalRootDep == null) {
            	GoalRootDep = classof().getDependencyDef("GoalRoot");
            }
            return GoalRootDep;
        }

        @objid ("e61083ad-7a64-4a6a-954d-1d56abb2343a")
        public static SmDependency BusinessRuleRootDep() {
            if (BusinessRuleRootDep == null) {
            	BusinessRuleRootDep = classof().getDependencyDef("BusinessRuleRoot");
            }
            return BusinessRuleRootDep;
        }

        @objid ("bd5a7fb2-60ee-4df8-98c0-6eabd90e7d93")
        public static SmDependency DictionaryRootDep() {
            if (DictionaryRootDep == null) {
            	DictionaryRootDep = classof().getDependencyDef("DictionaryRoot");
            }
            return DictionaryRootDep;
        }

        @objid ("d9dabdde-0520-4836-9e1f-7b60e99e870b")
        public static SmDependency RequirementRootDep() {
            if (RequirementRootDep == null) {
            	RequirementRootDep = classof().getDependencyDef("RequirementRoot");
            }
            return RequirementRootDep;
        }

        @objid ("7c583212-b3f8-4c59-9ab9-7bd9c93bfe67")
        public static SmDependency GenericRootDep() {
            if (GenericRootDep == null) {
            	GenericRootDep = classof().getDependencyDef("GenericRoot");
            }
            return GenericRootDep;
        }

        @objid ("7d49d51e-f639-461d-8e15-c0fbc8a3ab8d")
        public static SmDependency getDictionaryRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DictionaryRootDep;
        }

        @objid ("5ef51d17-b91e-4d1d-8c26-16e81c01075f")
        public static SmDependency getBusinessRuleRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BusinessRuleRootDep;
        }

        @objid ("fcf49754-af8a-4384-9456-a51d48a24060")
        public static SmDependency getGoalRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GoalRootDep;
        }

        @objid ("f33abc0b-a556-497d-8d60-1a735133cc87")
        public static SmDependency getPropertyRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PropertyRootDep;
        }

        @objid ("121bcce4-5946-473d-923a-77ec54ba8fee")
        public static SmDependency getRequirementRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequirementRootDep;
        }

        @objid ("d13c0b84-9256-4dbb-91d6-ea208c07a8ab")
        public static SmDependency getGenericRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GenericRootDep;
        }

        @objid ("fdaff840-aa5e-4716-a8ff-156cd006dd66")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00394cac-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3f84df51-de69-4b4d-a838-0b3171dc2c0e")
            public ISmObjectData createData() {
                return new AnalystProjectData();
            }

            @objid ("24198b73-5d1f-40ce-ba29-b453f35a537a")
            public SmObjectImpl createImpl() {
                return new AnalystProjectImpl();
            }

        }

        @objid ("003a3d56-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DictionaryRootSmDependency extends SmMultipleDependency {
            @objid ("c3471e92-c7c0-4425-857d-36eb61d9457b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mDictionaryRoot != null)? ((AnalystProjectData)data).mDictionaryRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("d36973c4-bd01-4b4d-bc9e-a026e7c7a385")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mDictionaryRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mDictionaryRoot;
            }

            @objid ("d065a897-e477-4cf1-b9f9-e78ed6d666b4")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("003abdbc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RequirementRootSmDependency extends SmMultipleDependency {
            @objid ("72c563e1-e47a-4952-a5b0-7c9fe6c6e4f3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mRequirementRoot != null)? ((AnalystProjectData)data).mRequirementRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("b3026f0c-37cd-46c4-b77b-d04f34e3dbb0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mRequirementRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mRequirementRoot;
            }

            @objid ("e1742cbf-e81e-4ad3-aeeb-dd60ff8c3839")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("003b3ef4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class GoalRootSmDependency extends SmMultipleDependency {
            @objid ("9775d995-6ee8-4ab9-b54e-b6d446c62df7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mGoalRoot != null)? ((AnalystProjectData)data).mGoalRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("a092c8db-a5c7-4349-8978-1050bda94188")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mGoalRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mGoalRoot;
            }

            @objid ("515d455e-e37f-4dbd-a282-13c84f24df02")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("003be39a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class BusinessRuleRootSmDependency extends SmMultipleDependency {
            @objid ("383084bb-4767-47fc-ae05-882337eb5e1c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mBusinessRuleRoot != null)? ((AnalystProjectData)data).mBusinessRuleRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("74a11d9e-ac3a-4176-aa66-01defaa8b9a5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mBusinessRuleRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mBusinessRuleRoot;
            }

            @objid ("a841206c-db27-49a4-936a-f6a0a38c957e")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("af575df3-2811-11e2-b500-001ec947ccaf")
        public static class PropertyRootSmDependency extends SmSingleDependency {
            @objid ("85a836aa-88d9-45d2-908f-05e85a1f05c7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AnalystProjectData) data).mPropertyRoot;
            }

            @objid ("43fe4fa2-25e8-4091-9f2b-4855c9258968")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AnalystProjectData) data).mPropertyRoot = value;
            }

            @objid ("63481778-0e91-45b5-a139-6d7f48b3779d")
            @Override
            public SmDependency getSymetric() {
                return PropertyContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("78378f24-7471-44c1-8df2-112e58790f75")
        public static class GenericRootSmDependency extends SmMultipleDependency {
            @objid ("f5f7073c-ee66-499c-84b4-345e1f4db388")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mGenericRoot != null)? ((AnalystProjectData)data).mGenericRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("0eb10020-4d8f-4820-9254-0dd43123f981")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mGenericRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mGenericRoot;
            }

            @objid ("70f193bc-8500-4a73-a361-7bdac2a0e306")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystContainerData.Metadata.OwnerProjectDep();
            }

        }

    }

}
