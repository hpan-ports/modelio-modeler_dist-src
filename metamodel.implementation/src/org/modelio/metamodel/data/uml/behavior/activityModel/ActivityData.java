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
    @objid ("3e5277b1-1c62-466a-8c46-fa3580f1c887")
    @SmaMetaAttribute(metaName="IsSingleExecution", type=Boolean.class, smAttributeClass=Metadata.IsSingleExecutionSmAttribute.class)
     Object mIsSingleExecution = false;

    @objid ("f8f51cbd-3f34-4631-afc2-8bebdffe2fdf")
    @SmaMetaAttribute(metaName="IsReadOnly", type=Boolean.class, smAttributeClass=Metadata.IsReadOnlySmAttribute.class)
     Object mIsReadOnly = false;

    @objid ("104db45f-4e78-4a3c-add8-76a55782112d")
    @SmaMetaAssociation(metaName="OwnedGroup", typeDataClass=ActivityGroupData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedGroupSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedGroup = null;

    @objid ("3d73c490-7422-43b3-81cc-4f15df5a5d5a")
    @SmaMetaAssociation(metaName="OwnedNode", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedNodeSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedNode = null;

    @objid ("b9d22ef4-6d17-4fb7-85a2-6d4c3fbf9e0c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0044107e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("79365e23-de7d-4b86-9af8-0db64c15579f")
        private static SmClass smClass = null;

        @objid ("d1e7c77b-f1a5-41d3-ad70-106a22fbbf90")
        private static SmAttribute IsSingleExecutionAtt = null;

        @objid ("af455605-4e30-48c3-a879-24adf216568c")
        private static SmAttribute IsReadOnlyAtt = null;

        @objid ("701c7e59-3627-4d70-ab48-540dcdf1cb43")
        private static SmDependency OwnedGroupDep = null;

        @objid ("bb0da36b-4f89-4d4e-a52c-27407caaaf5d")
        private static SmDependency OwnedNodeDep = null;

        @objid ("701221aa-3a98-456c-b2bc-07841a7143a9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8adc977e-677c-4628-8f7f-d6831771d40b")
        public static SmAttribute IsSingleExecutionAtt() {
            if (IsSingleExecutionAtt == null) {
            	IsSingleExecutionAtt = classof().getAttributeDef("IsSingleExecution");
            }
            return IsSingleExecutionAtt;
        }

        @objid ("c68cf7ca-3555-43b8-a9a3-4e771b5841cc")
        public static SmAttribute IsReadOnlyAtt() {
            if (IsReadOnlyAtt == null) {
            	IsReadOnlyAtt = classof().getAttributeDef("IsReadOnly");
            }
            return IsReadOnlyAtt;
        }

        @objid ("3a60f591-841e-4398-8763-cbddd4e69f00")
        public static SmDependency OwnedGroupDep() {
            if (OwnedGroupDep == null) {
            	OwnedGroupDep = classof().getDependencyDef("OwnedGroup");
            }
            return OwnedGroupDep;
        }

        @objid ("3948c19f-2c03-4dbb-aadc-c71ac88c9464")
        public static SmDependency OwnedNodeDep() {
            if (OwnedNodeDep == null) {
            	OwnedNodeDep = classof().getDependencyDef("OwnedNode");
            }
            return OwnedNodeDep;
        }

        @objid ("3232b623-7686-4038-8c4a-f4154746a5e2")
        public static SmAttribute getIsReadOnlyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsReadOnlyAtt;
        }

        @objid ("21c15d66-2736-4c52-a766-6681ef716098")
        public static SmAttribute getIsSingleExecutionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSingleExecutionAtt;
        }

        @objid ("c7b6a834-f0e0-4313-814b-417d7275870a")
        public static SmDependency getOwnedGroupDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedGroupDep;
        }

        @objid ("24b12e03-eb6e-46a5-a242-8384ca4df20a")
        public static SmDependency getOwnedNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedNodeDep;
        }

        @objid ("87d2f12d-c9f9-427d-b482-2e0aff29ff1c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("004450fc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4caa2bac-0ae8-40b8-878d-c252a2e36b27")
            public ISmObjectData createData() {
                return new ActivityData();
            }

            @objid ("3945cb58-d427-493f-a424-e4073cdd0803")
            public SmObjectImpl createImpl() {
                return new ActivityImpl();
            }

        }

        @objid ("0044b2fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsSingleExecutionSmAttribute extends SmAttribute {
            @objid ("88456a22-41e8-48b6-8ba8-dd92bd4c5963")
            public Object getValue(ISmObjectData data) {
                return ((ActivityData) data).mIsSingleExecution;
            }

            @objid ("cc8f952a-eef7-4a56-8643-623e59090876")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityData) data).mIsSingleExecution = value;
            }

        }

        @objid ("004513a2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsReadOnlySmAttribute extends SmAttribute {
            @objid ("745d3907-15a4-4fc1-89fc-c7c64dfd4793")
            public Object getValue(ISmObjectData data) {
                return ((ActivityData) data).mIsReadOnly;
            }

            @objid ("bf22f46a-0558-47e9-9e0a-bb723d63d4d8")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityData) data).mIsReadOnly = value;
            }

        }

        @objid ("004575d6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedNodeSmDependency extends SmMultipleDependency {
            @objid ("722254c9-ef9b-4332-8269-fbb577b86f09")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityData)data).mOwnedNode != null)? ((ActivityData)data).mOwnedNode:SmMultipleDependency.EMPTY;
            }

            @objid ("e8975d0b-91dd-438c-96ae-e6283bbd2b6a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityData) data).mOwnedNode = new ArrayList<>(initialCapacity);
                return ((ActivityData) data).mOwnedNode;
            }

            @objid ("4555948a-f567-4068-8ada-bea80af8111d")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerDep();
            }

        }

        @objid ("0045d922-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedGroupSmDependency extends SmMultipleDependency {
            @objid ("e9ae8ab3-7d51-465a-996c-eba8193e979a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityData)data).mOwnedGroup != null)? ((ActivityData)data).mOwnedGroup:SmMultipleDependency.EMPTY;
            }

            @objid ("8c56a842-b4cd-4d5f-b2d6-e0c4731acc2a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityData) data).mOwnedGroup = new ArrayList<>(initialCapacity);
                return ((ActivityData) data).mOwnedGroup;
            }

            @objid ("32932163-0e2c-46d9-8416-eac973afabe2")
            @Override
            public SmDependency getSymetric() {
                return ActivityGroupData.Metadata.InActivityDep();
            }

        }

    }

}
