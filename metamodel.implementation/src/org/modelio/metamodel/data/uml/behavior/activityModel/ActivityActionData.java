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
import org.modelio.metamodel.data.uml.behavior.activityModel.ExceptionHandlerData;
import org.modelio.metamodel.data.uml.behavior.activityModel.InputPinData;
import org.modelio.metamodel.data.uml.behavior.activityModel.OutputPinData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
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

@objid ("0026da86-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityAction.class, factory=ActivityActionData.Metadata.ObjectFactory.class)
public abstract class ActivityActionData extends ActivityNodeData {
    @objid ("854f9121-0c82-420a-96d3-21b529ddbb19")
    @SmaMetaAttribute(metaName="IsMultipleInstance", type=Boolean.class, smAttributeClass=Metadata.IsMultipleInstanceSmAttribute.class)
     Object mIsMultipleInstance = false;

    @objid ("7614f671-4089-4ebb-b4d8-eacdf06f6981")
    @SmaMetaAttribute(metaName="IsCompensation", type=Boolean.class, smAttributeClass=Metadata.IsCompensationSmAttribute.class)
     Object mIsCompensation = false;

    @objid ("812432ff-a9e9-46f8-a276-a74bb8476e2e")
    @SmaMetaAssociation(metaName="Output", typeDataClass=OutputPinData.class, min=0, max=-1, smAssociationClass=Metadata.OutputSmDependency.class, component = true)
     List<SmObjectImpl> mOutput = null;

    @objid ("b7647f85-376e-4c9f-9de7-2a37b4cb561a")
    @SmaMetaAssociation(metaName="Input", typeDataClass=InputPinData.class, min=0, max=-1, smAssociationClass=Metadata.InputSmDependency.class, component = true)
     List<SmObjectImpl> mInput = null;

    @objid ("8afa87a9-97bc-4c90-bc45-a83caec4d0aa")
    @SmaMetaAssociation(metaName="Handler", typeDataClass=ExceptionHandlerData.class, min=0, max=-1, smAssociationClass=Metadata.HandlerSmDependency.class, component = true)
     List<SmObjectImpl> mHandler = null;

    @objid ("4bddde74-26f5-4765-b579-45697920c400")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007b796a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c33e6eff-0032-47c7-85eb-56bc6b6e15d6")
        private static SmClass smClass = null;

        @objid ("18cebfe6-3658-409c-8683-03c9616799eb")
        private static SmAttribute IsMultipleInstanceAtt = null;

        @objid ("90fef062-3e8d-4b56-b3dd-c608d8652781")
        private static SmAttribute IsCompensationAtt = null;

        @objid ("81c843c9-7bc2-4a4b-8573-6f6343c224c7")
        private static SmDependency OutputDep = null;

        @objid ("59c6d52c-1c26-4f16-a615-4cba2ba01de6")
        private static SmDependency InputDep = null;

        @objid ("d46edd5f-7019-4aad-86f5-c3f83a6b2fcd")
        private static SmDependency HandlerDep = null;

        @objid ("946eca8b-3265-412d-b6ae-bf846927295d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6f18cc43-47c2-4dba-86c6-e2a796b64d07")
        public static SmAttribute IsMultipleInstanceAtt() {
            if (IsMultipleInstanceAtt == null) {
            	IsMultipleInstanceAtt = classof().getAttributeDef("IsMultipleInstance");
            }
            return IsMultipleInstanceAtt;
        }

        @objid ("c1d67076-7776-4b7f-b7c5-354f6dc0e48d")
        public static SmAttribute IsCompensationAtt() {
            if (IsCompensationAtt == null) {
            	IsCompensationAtt = classof().getAttributeDef("IsCompensation");
            }
            return IsCompensationAtt;
        }

        @objid ("a5dafca4-48ed-457c-b37f-793c7384b2c9")
        public static SmDependency OutputDep() {
            if (OutputDep == null) {
            	OutputDep = classof().getDependencyDef("Output");
            }
            return OutputDep;
        }

        @objid ("314a5116-75dd-4db1-8c1a-3f8c6d173e4a")
        public static SmDependency InputDep() {
            if (InputDep == null) {
            	InputDep = classof().getDependencyDef("Input");
            }
            return InputDep;
        }

        @objid ("1c567f35-3093-4add-a78e-a6a17d43ee56")
        public static SmDependency HandlerDep() {
            if (HandlerDep == null) {
            	HandlerDep = classof().getDependencyDef("Handler");
            }
            return HandlerDep;
        }

        @objid ("44cdc908-222a-4838-a799-17411a552b13")
        public static SmDependency getOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputDep;
        }

        @objid ("1136797c-3c71-462b-b551-9678cd327cf9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f2cb9d3b-3fd0-4212-9c4b-3756a25478d2")
        public static SmDependency getInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputDep;
        }

        @objid ("a04c1956-a768-4b50-9c02-394f3861d256")
        public static SmDependency getHandlerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return HandlerDep;
        }

        @objid ("8da5431a-2880-4034-b9bf-ad9ded62b224")
        public static SmAttribute getIsCompensationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsCompensationAtt;
        }

        @objid ("a173c6a5-dbda-4fd1-8574-878c53a20815")
        public static SmAttribute getIsMultipleInstanceAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMultipleInstanceAtt;
        }

        @objid ("007bbc7c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("19012287-c72b-409c-abc7-ab9c824401b0")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("a7acfffe-4b16-4420-a77c-9f23530fa5d5")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("007c1fbe-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsMultipleInstanceSmAttribute extends SmAttribute {
            @objid ("80db11de-b64f-4770-9a3d-caa1bdb2a55a")
            public Object getValue(ISmObjectData data) {
                return ((ActivityActionData) data).mIsMultipleInstance;
            }

            @objid ("97acff22-18cf-45b5-a79b-3a3c235e30d7")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityActionData) data).mIsMultipleInstance = value;
            }

        }

        @objid ("007c8e72-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsCompensationSmAttribute extends SmAttribute {
            @objid ("ad67f675-6c2c-401f-93d9-db70b6f1bc7e")
            public Object getValue(ISmObjectData data) {
                return ((ActivityActionData) data).mIsCompensation;
            }

            @objid ("c5fd8cc4-bbf5-47d9-9287-bb5b9e74a6be")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityActionData) data).mIsCompensation = value;
            }

        }

        @objid ("007cf4f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InputSmDependency extends SmMultipleDependency {
            @objid ("2e5d548f-cf59-4d43-adeb-d7db058568cd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityActionData)data).mInput != null)? ((ActivityActionData)data).mInput:SmMultipleDependency.EMPTY;
            }

            @objid ("72fe6b9d-4e4f-494d-9d8d-df3db59f2be0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityActionData) data).mInput = new ArrayList<>(initialCapacity);
                return ((ActivityActionData) data).mInput;
            }

            @objid ("6fe0f961-d584-4ce2-ab09-e06d9be00f95")
            @Override
            public SmDependency getSymetric() {
                return InputPinData.Metadata.InputingDep();
            }

        }

        @objid ("007d5a1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutputSmDependency extends SmMultipleDependency {
            @objid ("720e05eb-512e-4151-a3b4-27cda572e98e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityActionData)data).mOutput != null)? ((ActivityActionData)data).mOutput:SmMultipleDependency.EMPTY;
            }

            @objid ("c8090ca2-078f-4abc-b02e-a8b5e3d854af")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityActionData) data).mOutput = new ArrayList<>(initialCapacity);
                return ((ActivityActionData) data).mOutput;
            }

            @objid ("364536ab-27d0-4930-8a5d-40f5e7d17992")
            @Override
            public SmDependency getSymetric() {
                return OutputPinData.Metadata.OutputingDep();
            }

        }

        @objid ("007dbf22-c4c3-1fd8-97fe-001ec947cd2a")
        public static class HandlerSmDependency extends SmMultipleDependency {
            @objid ("54aff302-4086-49b3-a0b6-110e37b2727d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityActionData)data).mHandler != null)? ((ActivityActionData)data).mHandler:SmMultipleDependency.EMPTY;
            }

            @objid ("1a6b91e9-4267-4c4f-a5f3-2eb5edee5a60")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityActionData) data).mHandler = new ArrayList<>(initialCapacity);
                return ((ActivityActionData) data).mHandler;
            }

            @objid ("8fce0512-6547-4c5e-a722-ba8ec853fc62")
            @Override
            public SmDependency getSymetric() {
                return ExceptionHandlerData.Metadata.ProtectedNodeDep();
            }

        }

    }

}
