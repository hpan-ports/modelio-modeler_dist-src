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
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.data.analyst.BusinessRuleContainerData;
import org.modelio.metamodel.data.analyst.DictionaryData;
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
    @objid ("421b17b8-f5da-482f-bc1a-047d02f88f39")
    @SmaMetaAssociation(metaName="PropertyRoot", typeDataClass=PropertyContainerData.class, min=1, max=1, smAssociationClass=Metadata.PropertyRootSmDependency.class, component = true)
     SmObjectImpl mPropertyRoot;

    @objid ("3066b00e-f5a9-4fd1-9d03-cc872f87424c")
    @SmaMetaAssociation(metaName="GoalRoot", typeDataClass=GoalContainerData.class, min=0, max=-1, smAssociationClass=Metadata.GoalRootSmDependency.class, component = true)
     List<SmObjectImpl> mGoalRoot = null;

    @objid ("5b0cbb1f-7ed6-40e6-87dd-95c91c5ed26d")
    @SmaMetaAssociation(metaName="BusinessRuleRoot", typeDataClass=BusinessRuleContainerData.class, min=0, max=-1, smAssociationClass=Metadata.BusinessRuleRootSmDependency.class, component = true)
     List<SmObjectImpl> mBusinessRuleRoot = null;

    @objid ("2222c6a0-4e4d-4c3a-80b7-70400de24827")
    @SmaMetaAssociation(metaName="DictionaryRoot", typeDataClass=DictionaryData.class, min=0, max=-1, smAssociationClass=Metadata.DictionaryRootSmDependency.class, component = true)
     List<SmObjectImpl> mDictionaryRoot = null;

    @objid ("156e6f2c-daf1-49be-a2a7-016589e92e2a")
    @SmaMetaAssociation(metaName="RequirementRoot", typeDataClass=RequirementContainerData.class, min=0, max=-1, smAssociationClass=Metadata.RequirementRootSmDependency.class, component = true)
     List<SmObjectImpl> mRequirementRoot = null;

    @objid ("571abd73-fe96-436f-b811-4251a4293ca7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0038fd06-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f4d24664-405b-40c1-841f-243822bc7168")
        private static SmClass smClass = null;

        @objid ("4f0c3339-ba37-449e-a7a6-216d7baabdb3")
        private static SmDependency PropertyRootDep = null;

        @objid ("e18d2919-0257-4fd1-b725-96d79fdeba3c")
        private static SmDependency GoalRootDep = null;

        @objid ("acd48079-e10d-43c9-b7da-f7baea3a9ea6")
        private static SmDependency BusinessRuleRootDep = null;

        @objid ("654e25e3-eda1-417c-9295-a156ecbf7ddb")
        private static SmDependency DictionaryRootDep = null;

        @objid ("c6ea40b0-e1c8-4e93-b254-b995c2620369")
        private static SmDependency RequirementRootDep = null;

        @objid ("295bbded-5d20-434b-a8ba-0cc5ff5020be")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystProjectData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("96bad3dd-72be-4754-bce8-01832c1b620a")
        public static SmDependency PropertyRootDep() {
            if (PropertyRootDep == null) {
            	PropertyRootDep = classof().getDependencyDef("PropertyRoot");
            }
            return PropertyRootDep;
        }

        @objid ("ac659d63-7169-46ec-82a0-6715c7ffbcc0")
        public static SmDependency GoalRootDep() {
            if (GoalRootDep == null) {
            	GoalRootDep = classof().getDependencyDef("GoalRoot");
            }
            return GoalRootDep;
        }

        @objid ("091e2f62-787c-4410-8c65-4066a31d97c1")
        public static SmDependency BusinessRuleRootDep() {
            if (BusinessRuleRootDep == null) {
            	BusinessRuleRootDep = classof().getDependencyDef("BusinessRuleRoot");
            }
            return BusinessRuleRootDep;
        }

        @objid ("2bebdced-d8d3-4404-93a3-7515ce6da606")
        public static SmDependency DictionaryRootDep() {
            if (DictionaryRootDep == null) {
            	DictionaryRootDep = classof().getDependencyDef("DictionaryRoot");
            }
            return DictionaryRootDep;
        }

        @objid ("a04d66e8-ca1b-4eaa-a8e3-d5b158cd1516")
        public static SmDependency RequirementRootDep() {
            if (RequirementRootDep == null) {
            	RequirementRootDep = classof().getDependencyDef("RequirementRoot");
            }
            return RequirementRootDep;
        }

        @objid ("2f506429-b671-44ed-8883-63b103045dc7")
        public static SmDependency getBusinessRuleRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BusinessRuleRootDep;
        }

        @objid ("a266b2a2-e90c-4299-8584-db45c3ce954d")
        public static SmDependency getGoalRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GoalRootDep;
        }

        @objid ("8499e7d4-1947-44e0-ad8d-029352bd3918")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("bfaf3907-1271-4c29-a4d2-0943ff31d456")
        public static SmDependency getDictionaryRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DictionaryRootDep;
        }

        @objid ("ab4d863a-6f7e-4f35-99a0-d4fe4bc7837e")
        public static SmDependency getRequirementRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequirementRootDep;
        }

        @objid ("a1f1ec92-e5c0-432a-a078-72a06bf9de69")
        public static SmDependency getPropertyRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PropertyRootDep;
        }

        @objid ("00394cac-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f6651590-c2e1-4959-a14d-b72ef8a31e7d")
            public ISmObjectData createData() {
                return new AnalystProjectData();
            }

            @objid ("b0f132cd-b8d2-4d82-bc3e-f0b3be063116")
            public SmObjectImpl createImpl() {
                return new AnalystProjectImpl();
            }

        }

        @objid ("003a3d56-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DictionaryRootSmDependency extends SmMultipleDependency {
            @objid ("3b58d60d-90df-4956-9cde-fa4720f9e253")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mDictionaryRoot != null)? ((AnalystProjectData)data).mDictionaryRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("280ae702-eceb-4970-95de-f3d2db973035")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mDictionaryRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mDictionaryRoot;
            }

            @objid ("819fd46f-08f7-474f-b028-92bdb86d15e1")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("003abdbc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RequirementRootSmDependency extends SmMultipleDependency {
            @objid ("8ffe81d9-27d0-4ee0-b1ab-386023cedc41")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mRequirementRoot != null)? ((AnalystProjectData)data).mRequirementRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("079f7fe9-bb85-456d-a6a7-0a8983a3e2c2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mRequirementRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mRequirementRoot;
            }

            @objid ("90a603bf-443f-42f4-bb7a-1dce3d9e1ab1")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("003b3ef4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class GoalRootSmDependency extends SmMultipleDependency {
            @objid ("8d06b83e-25e6-4682-a56c-d32404325431")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mGoalRoot != null)? ((AnalystProjectData)data).mGoalRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("a34e2f2c-a2bc-4424-b929-5140e18cc542")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mGoalRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mGoalRoot;
            }

            @objid ("3f448458-b965-4d00-93ea-b6c9f488485c")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("003be39a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class BusinessRuleRootSmDependency extends SmMultipleDependency {
            @objid ("77cd5dbc-48b6-4db7-801b-5bf5bbaff77c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AnalystProjectData)data).mBusinessRuleRoot != null)? ((AnalystProjectData)data).mBusinessRuleRoot:SmMultipleDependency.EMPTY;
            }

            @objid ("c0ec5cac-e37d-4751-8999-ee20361890ed")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AnalystProjectData) data).mBusinessRuleRoot = new ArrayList<>(initialCapacity);
                return ((AnalystProjectData) data).mBusinessRuleRoot;
            }

            @objid ("b9542aa1-f541-4519-977a-7433c895d027")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnerProjectDep();
            }

        }

        @objid ("af575df3-2811-11e2-b500-001ec947ccaf")
        public static class PropertyRootSmDependency extends SmSingleDependency {
            @objid ("49d5eb95-7c65-4f17-a253-60e53617c534")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AnalystProjectData) data).mPropertyRoot;
            }

            @objid ("6e9b859d-26da-4886-bc50-f770b0c9fa26")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AnalystProjectData) data).mPropertyRoot = value;
            }

            @objid ("03145827-79ed-4a81-9c83-d3cd4442f29f")
            @Override
            public SmDependency getSymetric() {
                return PropertyContainerData.Metadata.OwnerProjectDep();
            }

        }

    }

}
