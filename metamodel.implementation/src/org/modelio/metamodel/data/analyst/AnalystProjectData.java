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
    @objid ("6edb415e-312e-49ba-8e23-b05b428e1c23")
    @SmaMetaAssociation(metaName="PropertyRoot", typeDataClass=PropertyContainerData.class, min=1, max=1, smAssociationClass=Metadata.PropertyRootSmDependency.class, component = true)
     SmObjectImpl mPropertyRoot;

    @objid ("b1f60899-6b11-48d3-9aec-9e817129e421")
    @SmaMetaAssociation(metaName="GoalRoot", typeDataClass=GoalContainerData.class, min=0, max=-1, smAssociationClass=Metadata.GoalRootSmDependency.class, component = true)
     List<SmObjectImpl> mGoalRoot = null;

    @objid ("64fdb582-f548-42c3-8e87-baec23e2c17d")
    @SmaMetaAssociation(metaName="BusinessRuleRoot", typeDataClass=BusinessRuleContainerData.class, min=0, max=-1, smAssociationClass=Metadata.BusinessRuleRootSmDependency.class, component = true)
     List<SmObjectImpl> mBusinessRuleRoot = null;

    @objid ("236db4e1-a880-4cee-865a-e3ffdc0babb6")
    @SmaMetaAssociation(metaName="DictionaryRoot", typeDataClass=DictionaryData.class, min=0, max=-1, smAssociationClass=Metadata.DictionaryRootSmDependency.class, component = true)
     List<SmObjectImpl> mDictionaryRoot = null;

    @objid ("04af258f-3ade-4c28-a2dd-287b433f722a")
    @SmaMetaAssociation(metaName="RequirementRoot", typeDataClass=RequirementContainerData.class, min=0, max=-1, smAssociationClass=Metadata.RequirementRootSmDependency.class, component = true)
     List<SmObjectImpl> mRequirementRoot = null;

    @objid ("a20c5f1c-2771-4c82-aa22-edb10e23fd70")
    @SmaMetaAssociation(metaName="GenericRoot", typeDataClass=GenericAnalystContainerData.class, min=0, max=-1, smAssociationClass=Metadata.GenericRootSmDependency.class, component = true)
     List<SmObjectImpl> mGenericRoot = null;

    @objid ("09b4ba5f-10fc-4d51-afe3-c1148a2107c1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0038fd06-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b5b248f7-ab54-4cc5-ab62-4b20e595b865")
        private static SmClass smClass = null;

        @objid ("fb914091-1a1c-426f-b348-aae27d9b6773")
        private static SmDependency PropertyRootDep = null;

        @objid ("c55d16f3-f492-4c28-8000-8735b7d00336")
        private static SmDependency GoalRootDep = null;

        @objid ("316171f6-075b-465e-90f0-fdff5d392230")
        private static SmDependency BusinessRuleRootDep = null;

        @objid ("94d4c25e-a2df-44d1-a80a-0779a08a9f28")
        private static SmDependency DictionaryRootDep = null;

        @objid ("4b2d86db-776e-49ce-bf4a-29e79c1bc24d")
        private static SmDependency RequirementRootDep = null;

        @objid ("732d931e-0f05-424a-b157-8db66b3d7d0e")
        private static SmDependency GenericRootDep = null;

        @objid ("002db59d-53a2-49dd-b8fe-39548133338d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystProjectData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7cb6596f-4027-48ae-9c32-ae3571845eca")
        public static SmDependency PropertyRootDep() {
            if (PropertyRootDep == null) {
            	PropertyRootDep = classof().getDependencyDef("PropertyRoot");
            }
            return PropertyRootDep;
        }

        @objid ("f98eb73e-fcf7-4221-8d59-62f80fc88c96")
        public static SmDependency GoalRootDep() {
            if (GoalRootDep == null) {
            	GoalRootDep = classof().getDependencyDef("GoalRoot");
            }
            return GoalRootDep;
        }

        @objid ("f5a2b181-34ad-434a-847d-bcc32e3db80f")
        public static SmDependency BusinessRuleRootDep() {
            if (BusinessRuleRootDep == null) {
            	BusinessRuleRootDep = classof().getDependencyDef("BusinessRuleRoot");
            }
            return BusinessRuleRootDep;
        }

        @objid ("d965cde5-7a83-4076-ab49-62951e26dcfb")
        public static SmDependency DictionaryRootDep() {
            if (DictionaryRootDep == null) {
            	DictionaryRootDep = classof().getDependencyDef("DictionaryRoot");
            }
            return DictionaryRootDep;
        }

        @objid ("640b4c2d-8f1d-47c8-a1e6-826f697d9490")
        public static SmDependency RequirementRootDep() {
            if (RequirementRootDep == null) {
            	RequirementRootDep = classof().getDependencyDef("RequirementRoot");
            }
            return RequirementRootDep;
        }

        @objid ("1a43350c-37e1-41aa-bb06-f8c3bef73802")
        public static SmDependency GenericRootDep() {
            if (GenericRootDep == null) {
            	GenericRootDep = classof().getDependencyDef("GenericRoot");
            }
            return GenericRootDep;
        }

        @objid ("a1bb4d95-8b76-472a-9f7a-00668391ed3c")
        public static SmDependency getDictionaryRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DictionaryRootDep;
        }

        @objid ("242346b6-5a83-4e8c-a89b-c444c84bdf7e")
        public static SmDependency getGenericRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GenericRootDep;
        }

        @objid ("38cb74a7-16b8-4ced-ab47-8594da6da91e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("191fd63e-f7db-4e2e-9154-4d1aa3f0e686")
        public static SmDependency getPropertyRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PropertyRootDep;
        }

        @objid ("ab9aff09-f447-488c-9a54-f5b32c6c9ce5")
        public static SmDependency getRequirementRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequirementRootDep;
        }

        @objid ("e12dec5f-84f3-4095-8d2d-fb92e8458657")
        public static SmDependency getGoalRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GoalRootDep;
        }

        @objid ("3559353e-31d6-4bd6-b992-07892a140ac6")
        public static SmDependency getBusinessRuleRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BusinessRuleRootDep;
        }

        @objid ("00394cac-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8fad7740-fd8d-41cb-bd71-b2376e80c8b0")
            public ISmObjectData createData() {
                return new AnalystProjectData();
            }

            @objid ("29afecaf-c00c-4128-8a8c-cf0050c4f50c")
            public SmObjectImpl createImpl() {
                return new AnalystProjectImpl();
            }

        }

        @objid ("003a3d56-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DictionaryRootSmDependency extends SmMultipleDependency {
            @objid ("6be44f37-6b23-4d7b-8a81-c4a469d365a9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mDictionaryRoot != null)? ((AnalystProjectData)data).mDictionaryRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("384b5322-00b3-44eb-b250-97f61c24a0a2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mDictionaryRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mDictionaryRoot;
            }

            @objid ("a8d2f827-9477-4a10-90f2-6a31e37c6fec")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("003abdbc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RequirementRootSmDependency extends SmMultipleDependency {
            @objid ("c8fb2797-32a1-467c-b3d3-c497d11bf3f1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mRequirementRoot != null)? ((AnalystProjectData)data).mRequirementRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("9eee25df-bda1-41ab-8539-b00f8c423e9c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mRequirementRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mRequirementRoot;
            }

            @objid ("795b6fca-5784-4a7b-902f-7c842a7a2793")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("003b3ef4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class GoalRootSmDependency extends SmMultipleDependency {
            @objid ("9a778e7f-9a71-4bce-a488-f29ee0c1de5a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mGoalRoot != null)? ((AnalystProjectData)data).mGoalRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("a6a5ffab-4009-4ee8-867a-06fdd118f240")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mGoalRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mGoalRoot;
            }

            @objid ("418bcdc2-6d52-4681-8f30-21b3af2af4b1")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("003be39a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class BusinessRuleRootSmDependency extends SmMultipleDependency {
            @objid ("d26d1615-0ccb-4646-824b-2c96de45cca5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mBusinessRuleRoot != null)? ((AnalystProjectData)data).mBusinessRuleRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("f0e49727-b8c6-4e35-819b-641c5185d1cf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mBusinessRuleRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mBusinessRuleRoot;
            }

            @objid ("99861599-4c39-4c7e-bbc1-1e4f348f1e06")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("af575df3-2811-11e2-b500-001ec947ccaf")
        public static class PropertyRootSmDependency extends SmSingleDependency {
            @objid ("bd6797ee-62f6-4dc6-9b45-fdcd6d8c3659")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AnalystProjectData) data).mPropertyRoot;
            }

            @objid ("250870de-9472-47fc-9f6b-29738d209b1b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AnalystProjectData) data).mPropertyRoot = value;
            }

            @objid ("1cbb33ee-5d5a-4f3b-b502-5d27040a5a03")
            @Override
            public SmDependency getSymetric() {
                return PropertyContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("78378f24-7471-44c1-8df2-112e58790f75")
        public static class GenericRootSmDependency extends SmMultipleDependency {
            @objid ("129b7541-95bc-4268-af8e-3569338fff4c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mGenericRoot != null)? ((AnalystProjectData)data).mGenericRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("ab6ff33f-1574-4819-99e2-3aabf97772b4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mGenericRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mGenericRoot;
            }

            @objid ("3c604591-b981-4c74-b250-8999ca409afe")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystContainerData.Metadata.OwnerProjectDep();
            }

        }

    }

}
