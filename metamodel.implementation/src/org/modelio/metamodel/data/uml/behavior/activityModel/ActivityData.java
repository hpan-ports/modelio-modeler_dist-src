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
    @objid ("09231f2d-0ab8-4514-aac1-a0cdef35b4fc")
    @SmaMetaAttribute(metaName="IsSingleExecution", type=Boolean.class, smAttributeClass=Metadata.IsSingleExecutionSmAttribute.class)
     Object mIsSingleExecution = false;

    @objid ("9b4cd2ab-b35c-4357-9dc1-0893ee7d4fa9")
    @SmaMetaAttribute(metaName="IsReadOnly", type=Boolean.class, smAttributeClass=Metadata.IsReadOnlySmAttribute.class)
     Object mIsReadOnly = false;

    @objid ("f541a7b3-9a10-49ab-8671-a9bebd1862df")
    @SmaMetaAssociation(metaName="OwnedGroup", typeDataClass=ActivityGroupData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedGroupSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedGroup = null;

    @objid ("56934ec2-0947-4608-9750-0fe1931352ad")
    @SmaMetaAssociation(metaName="OwnedNode", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedNodeSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedNode = null;

    @objid ("d17373cd-10ef-4e36-aeff-c96f8e0dabe3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0044107e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1bc0bbd8-b5f2-43be-a5b9-bfd247bae497")
        private static SmClass smClass = null;

        @objid ("2c4a886c-d5d3-48fa-89a5-589e1e5c98b3")
        private static SmAttribute IsSingleExecutionAtt = null;

        @objid ("12ee2915-2203-44f6-b8ee-982b12fc2eec")
        private static SmAttribute IsReadOnlyAtt = null;

        @objid ("6606d1c9-47db-4a65-91cc-266b0be5722e")
        private static SmDependency OwnedGroupDep = null;

        @objid ("4213e084-0914-4b62-ab4f-44e33015e262")
        private static SmDependency OwnedNodeDep = null;

        @objid ("a476c82b-d7d0-4956-89cf-f2090afb48c8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f52d2be1-90a5-4e53-83df-c744a3478c5d")
        public static SmAttribute IsSingleExecutionAtt() {
            if (IsSingleExecutionAtt == null) {
            	IsSingleExecutionAtt = classof().getAttributeDef("IsSingleExecution");
            }
            return IsSingleExecutionAtt;
        }

        @objid ("6f341f02-4346-4fbd-b85a-e49b0dca0683")
        public static SmAttribute IsReadOnlyAtt() {
            if (IsReadOnlyAtt == null) {
            	IsReadOnlyAtt = classof().getAttributeDef("IsReadOnly");
            }
            return IsReadOnlyAtt;
        }

        @objid ("0df3b3f7-0f27-4e24-b6a1-3dcca96bb273")
        public static SmDependency OwnedGroupDep() {
            if (OwnedGroupDep == null) {
            	OwnedGroupDep = classof().getDependencyDef("OwnedGroup");
            }
            return OwnedGroupDep;
        }

        @objid ("38b2acb4-8ba2-412f-842f-9a346b4a0b3a")
        public static SmDependency OwnedNodeDep() {
            if (OwnedNodeDep == null) {
            	OwnedNodeDep = classof().getDependencyDef("OwnedNode");
            }
            return OwnedNodeDep;
        }

        @objid ("864e244f-dbd5-43e1-9fc6-4e6ff2421b11")
        public static SmAttribute getIsSingleExecutionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSingleExecutionAtt;
        }

        @objid ("2c48581d-bf37-401c-b4f1-0904f44e2a5b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d6c1a471-8c27-4498-834b-9c32177fb1f8")
        public static SmDependency getOwnedGroupDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedGroupDep;
        }

        @objid ("eec36519-02fd-49c2-a466-4b809b33a43a")
        public static SmDependency getOwnedNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedNodeDep;
        }

        @objid ("b4848e3c-91f1-419d-92d1-2a21a24e0d70")
        public static SmAttribute getIsReadOnlyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsReadOnlyAtt;
        }

        @objid ("004450fc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8431fa07-d12c-4a0f-8175-c8135cba4f69")
            public ISmObjectData createData() {
                return new ActivityData();
            }

            @objid ("d72a1399-89ae-491c-81ad-8d8e700c4dbe")
            public SmObjectImpl createImpl() {
                return new ActivityImpl();
            }

        }

        @objid ("0044b2fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsSingleExecutionSmAttribute extends SmAttribute {
            @objid ("6165eb48-b331-4d9d-9769-cc40a70fc808")
            public Object getValue(ISmObjectData data) {
                return ((ActivityData) data).mIsSingleExecution;
            }

            @objid ("17f9e4ca-bee6-42af-8e3f-835a303c907f")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityData) data).mIsSingleExecution = value;
            }

        }

        @objid ("004513a2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsReadOnlySmAttribute extends SmAttribute {
            @objid ("afe54200-2a29-4f70-99d2-b8a18756370f")
            public Object getValue(ISmObjectData data) {
                return ((ActivityData) data).mIsReadOnly;
            }

            @objid ("3cad2831-58da-4b8e-8bc0-fd835ea91bb3")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityData) data).mIsReadOnly = value;
            }

        }

        @objid ("004575d6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedNodeSmDependency extends SmMultipleDependency {
            @objid ("79e9998e-d4d0-46fd-b773-180acb2605e3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityData)data).mOwnedNode != null)? ((ActivityData)data).mOwnedNode:SmMultipleDependency.EMPTY;
            }

            @objid ("254495d9-dcdd-4394-b259-d821d2c585a0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityData) data).mOwnedNode = new ArrayList<>(initialCapacity);
                return ((ActivityData) data).mOwnedNode;
            }

            @objid ("6821f519-c746-4c11-9bb3-064f2f893353")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerDep();
            }

        }

        @objid ("0045d922-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedGroupSmDependency extends SmMultipleDependency {
            @objid ("6312c7fd-f412-48ce-8a57-c334e5fb2a8f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityData)data).mOwnedGroup != null)? ((ActivityData)data).mOwnedGroup:SmMultipleDependency.EMPTY;
            }

            @objid ("b3ed821f-d6b1-4191-b8bf-ae2f2e4d22e7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityData) data).mOwnedGroup = new ArrayList<>(initialCapacity);
                return ((ActivityData) data).mOwnedGroup;
            }

            @objid ("4472a97d-d9d5-4906-b5ea-ca6665a3becb")
            @Override
            public SmDependency getSymetric() {
                return ActivityGroupData.Metadata.InActivityDep();
            }

        }

    }

}
