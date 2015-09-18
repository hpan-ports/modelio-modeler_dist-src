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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityGroupData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityNodeData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityImpl;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
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

@objid ("002659ee-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Activity.class, factory=ActivityData.Metadata.ObjectFactory.class, cmsnode=true)
public class ActivityData extends BehaviorData {
    @objid ("6c92101a-695d-47b6-ac07-9c782acc26c7")
    @SmaMetaAttribute(metaName="IsSingleExecution", type=Boolean.class, smAttributeClass=Metadata.IsSingleExecutionSmAttribute.class)
     Object mIsSingleExecution = false;

    @objid ("7b57cced-bb4e-4d78-8d9e-ab815c5075bd")
    @SmaMetaAttribute(metaName="IsReadOnly", type=Boolean.class, smAttributeClass=Metadata.IsReadOnlySmAttribute.class)
     Object mIsReadOnly = false;

    @objid ("50076134-0b11-4d42-95d6-cad6ebc48bfe")
    @SmaMetaAssociation(metaName="OwnedGroup", typeDataClass=ActivityGroupData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedGroupSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedGroup = null;

    @objid ("15b805a5-9553-4d25-9eb7-37b3c0c10a57")
    @SmaMetaAssociation(metaName="OwnedNode", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedNodeSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedNode = null;

    @objid ("f8977b50-e585-4682-bd7e-2cb6955d0254")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0044107e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("57217bbf-d446-4a5d-89f2-90d9b1f5cef5")
        private static SmClass smClass = null;

        @objid ("6273e399-4aab-4ff1-90e3-345b36fb67c3")
        private static SmAttribute IsSingleExecutionAtt = null;

        @objid ("c33af1db-bf23-43af-a5b8-35d1e37506f5")
        private static SmAttribute IsReadOnlyAtt = null;

        @objid ("a1220a57-281e-4738-bd56-4dc52e5f9520")
        private static SmDependency OwnedGroupDep = null;

        @objid ("7b2b86e6-28c1-4848-ab98-7e6450026a79")
        private static SmDependency OwnedNodeDep = null;

        @objid ("d20ee319-3bab-461e-bb93-3535f29d8584")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fb7d39a2-7f4c-465d-bfe6-1ecee9b898e9")
        public static SmAttribute IsSingleExecutionAtt() {
            if (IsSingleExecutionAtt == null) {
            	IsSingleExecutionAtt = classof().getAttributeDef("IsSingleExecution");
            }
            return IsSingleExecutionAtt;
        }

        @objid ("336ee4c2-507a-4206-8551-db294ff1c2e8")
        public static SmAttribute IsReadOnlyAtt() {
            if (IsReadOnlyAtt == null) {
            	IsReadOnlyAtt = classof().getAttributeDef("IsReadOnly");
            }
            return IsReadOnlyAtt;
        }

        @objid ("41b165d9-9e38-4363-8064-ba0166f0bdb0")
        public static SmDependency OwnedGroupDep() {
            if (OwnedGroupDep == null) {
            	OwnedGroupDep = classof().getDependencyDef("OwnedGroup");
            }
            return OwnedGroupDep;
        }

        @objid ("3431f7a4-265a-48ba-bfb7-14137a79a0f7")
        public static SmDependency OwnedNodeDep() {
            if (OwnedNodeDep == null) {
            	OwnedNodeDep = classof().getDependencyDef("OwnedNode");
            }
            return OwnedNodeDep;
        }

        @objid ("3062e21f-b25c-4b50-bc01-65256272b0b7")
        public static SmDependency getOwnedGroupDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedGroupDep;
        }

        @objid ("5c171106-7fac-43b6-85f7-e9cba74bebfc")
        public static SmDependency getOwnedNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedNodeDep;
        }

        @objid ("fe90afea-c23b-4043-bca5-0348b102931d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6bb35153-b566-419f-a25c-0aae0d534458")
        public static SmAttribute getIsSingleExecutionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSingleExecutionAtt;
        }

        @objid ("2117072c-5003-4f57-9525-a54d1f6fe1a8")
        public static SmAttribute getIsReadOnlyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsReadOnlyAtt;
        }

        @objid ("004450fc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d5a5787a-8eeb-4552-b2db-964c0ab54ff8")
            public ISmObjectData createData() {
                return new ActivityData();
            }

            @objid ("68fd5d8e-f186-4814-add8-f85b339fb843")
            public SmObjectImpl createImpl() {
                return new ActivityImpl();
            }

        }

        @objid ("0044b2fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsSingleExecutionSmAttribute extends SmAttribute {
            @objid ("bc425c85-c15d-46f5-93fe-30c81e8b99f3")
            public Object getValue(ISmObjectData data) {
                return ((ActivityData) data).mIsSingleExecution;
            }

            @objid ("d59dc429-6333-47a4-b41e-eac126a52581")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityData) data).mIsSingleExecution = value;
            }

        }

        @objid ("004513a2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsReadOnlySmAttribute extends SmAttribute {
            @objid ("3fcb0ddf-eb3a-49cf-9daa-0305f2d9a5b9")
            public Object getValue(ISmObjectData data) {
                return ((ActivityData) data).mIsReadOnly;
            }

            @objid ("e09e9d39-dfa6-4aa9-8f11-7bc694b8ed1d")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityData) data).mIsReadOnly = value;
            }

        }

        @objid ("004575d6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedNodeSmDependency extends SmMultipleDependency {
            @objid ("2da698df-e9ec-4fb2-95ee-a83ae2b0cc76")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityData)data).mOwnedNode != null)? ((ActivityData)data).mOwnedNode:SmMultipleDependency.EMPTY;
            }

            @objid ("317d982d-6740-40ba-944a-d652d9a5e4c0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityData) data).mOwnedNode = new ArrayList<>(initialCapacity);
                return ((ActivityData) data).mOwnedNode;
            }

            @objid ("ddd286ec-9d4a-47be-bb50-a06b51ab159e")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerDep();
            }

        }

        @objid ("0045d922-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedGroupSmDependency extends SmMultipleDependency {
            @objid ("3396ba9e-6ab9-43aa-bb14-b563d409cf2f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityData)data).mOwnedGroup != null)? ((ActivityData)data).mOwnedGroup:SmMultipleDependency.EMPTY;
            }

            @objid ("665b7422-78b8-4eb4-9335-360b857e2f81")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityData) data).mOwnedGroup = new ArrayList<>(initialCapacity);
                return ((ActivityData) data).mOwnedGroup;
            }

            @objid ("878b2016-c61a-4212-aba9-f96d7784d2db")
            @Override
            public SmDependency getSymetric() {
                return ActivityGroupData.Metadata.InActivityDep();
            }

        }

    }

}
