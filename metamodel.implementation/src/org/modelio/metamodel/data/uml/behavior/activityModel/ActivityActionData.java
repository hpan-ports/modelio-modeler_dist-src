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
    @objid ("f427ce1f-aa4a-4e92-bae6-35d4b07ee877")
    @SmaMetaAttribute(metaName="IsMultipleInstance", type=Boolean.class, smAttributeClass=Metadata.IsMultipleInstanceSmAttribute.class)
     Object mIsMultipleInstance = false;

    @objid ("2618fb4c-a7f5-4396-b845-f68436238c8a")
    @SmaMetaAttribute(metaName="IsCompensation", type=Boolean.class, smAttributeClass=Metadata.IsCompensationSmAttribute.class)
     Object mIsCompensation = false;

    @objid ("5a2c1fd1-7cac-4fa2-a62e-900c71df4df5")
    @SmaMetaAssociation(metaName="Output", typeDataClass=OutputPinData.class, min=0, max=-1, smAssociationClass=Metadata.OutputSmDependency.class, component = true)
     List<SmObjectImpl> mOutput = null;

    @objid ("beb53791-fe7e-47fb-9693-a639d6f15f8e")
    @SmaMetaAssociation(metaName="Input", typeDataClass=InputPinData.class, min=0, max=-1, smAssociationClass=Metadata.InputSmDependency.class, component = true)
     List<SmObjectImpl> mInput = null;

    @objid ("457bebae-d70d-4309-b51d-4d504b8e5bd2")
    @SmaMetaAssociation(metaName="Handler", typeDataClass=ExceptionHandlerData.class, min=0, max=-1, smAssociationClass=Metadata.HandlerSmDependency.class, component = true)
     List<SmObjectImpl> mHandler = null;

    @objid ("28196c9f-b2dc-4dea-a213-53dbfb409fdf")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007b796a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("873dda9f-2a4e-4416-9a45-de25fd5247ec")
        private static SmClass smClass = null;

        @objid ("df6cd987-9742-42d6-a812-aa30a5697225")
        private static SmAttribute IsMultipleInstanceAtt = null;

        @objid ("61efde42-4a6e-438a-9495-a9c6b4843c18")
        private static SmAttribute IsCompensationAtt = null;

        @objid ("d4a7de21-81e0-4cbd-8cb9-ae250216f75b")
        private static SmDependency OutputDep = null;

        @objid ("1dbc2dfa-a35a-422f-89bc-b54d27c0c20f")
        private static SmDependency InputDep = null;

        @objid ("3d728003-9133-430f-a4e3-cf877745f6d9")
        private static SmDependency HandlerDep = null;

        @objid ("a8a7084a-bc46-4eec-82d2-4b5aaaf6559a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d9c1f0c6-a4a5-4a6f-a76c-c72ca58ee961")
        public static SmAttribute IsMultipleInstanceAtt() {
            if (IsMultipleInstanceAtt == null) {
            	IsMultipleInstanceAtt = classof().getAttributeDef("IsMultipleInstance");
            }
            return IsMultipleInstanceAtt;
        }

        @objid ("41d70543-55f1-4cd6-978f-68a901e0af0f")
        public static SmAttribute IsCompensationAtt() {
            if (IsCompensationAtt == null) {
            	IsCompensationAtt = classof().getAttributeDef("IsCompensation");
            }
            return IsCompensationAtt;
        }

        @objid ("827c21a0-177f-46b0-912d-498f10ac4abe")
        public static SmDependency OutputDep() {
            if (OutputDep == null) {
            	OutputDep = classof().getDependencyDef("Output");
            }
            return OutputDep;
        }

        @objid ("98cd7573-4752-4c03-ac57-dc3caeea38cb")
        public static SmDependency InputDep() {
            if (InputDep == null) {
            	InputDep = classof().getDependencyDef("Input");
            }
            return InputDep;
        }

        @objid ("d901c533-6aed-49b8-b54b-8086f3de28a9")
        public static SmDependency HandlerDep() {
            if (HandlerDep == null) {
            	HandlerDep = classof().getDependencyDef("Handler");
            }
            return HandlerDep;
        }

        @objid ("f4d38888-651f-4681-b8f1-450dfd14fe8f")
        public static SmDependency getInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputDep;
        }

        @objid ("c7798c2e-52af-4a84-81e1-e261e25dbbdb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("aa38a334-4a4b-4775-8d62-865e4b7e5b99")
        public static SmAttribute getIsMultipleInstanceAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMultipleInstanceAtt;
        }

        @objid ("c02ec649-81ee-4038-ab9e-4c886a5618c0")
        public static SmAttribute getIsCompensationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsCompensationAtt;
        }

        @objid ("f2bdf271-d0a5-4be2-aa28-f83c75cd72bc")
        public static SmDependency getOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputDep;
        }

        @objid ("148990df-c154-469f-9ffb-9d189a84090f")
        public static SmDependency getHandlerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return HandlerDep;
        }

        @objid ("007bbc7c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d1a63063-8357-4954-8220-de1d6d5ceb80")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("f440c71a-51be-4ad5-9119-1c7de9b46a86")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("007c1fbe-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsMultipleInstanceSmAttribute extends SmAttribute {
            @objid ("6750f5a9-a1f8-4d97-a30c-c567b00dba8e")
            public Object getValue(ISmObjectData data) {
                return ((ActivityActionData) data).mIsMultipleInstance;
            }

            @objid ("5061adc6-ac22-4220-bb0b-6ce1ee3e1af6")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityActionData) data).mIsMultipleInstance = value;
            }

        }

        @objid ("007c8e72-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsCompensationSmAttribute extends SmAttribute {
            @objid ("c356ea1c-e42d-47e2-9d73-abb1fa530c84")
            public Object getValue(ISmObjectData data) {
                return ((ActivityActionData) data).mIsCompensation;
            }

            @objid ("3717a1fe-acdf-4e6b-a390-5c6ddc6a7458")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityActionData) data).mIsCompensation = value;
            }

        }

        @objid ("007cf4f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InputSmDependency extends SmMultipleDependency {
            @objid ("554324a6-4985-47af-bda7-9f92861a027f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityActionData)data).mInput != null)? ((ActivityActionData)data).mInput:SmMultipleDependency.EMPTY;
            }

            @objid ("408d7bd8-9829-4d88-9a6d-c5f970039bc8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityActionData) data).mInput = new ArrayList<>(initialCapacity);
                return ((ActivityActionData) data).mInput;
            }

            @objid ("971f1dab-e632-4310-b6a8-6c700b1132de")
            @Override
            public SmDependency getSymetric() {
                return InputPinData.Metadata.InputingDep();
            }

        }

        @objid ("007d5a1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutputSmDependency extends SmMultipleDependency {
            @objid ("c4274fc1-7419-4824-ac2f-a059c26e2c9b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityActionData)data).mOutput != null)? ((ActivityActionData)data).mOutput:SmMultipleDependency.EMPTY;
            }

            @objid ("151e7865-1f11-48eb-903b-13aa511bc535")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityActionData) data).mOutput = new ArrayList<>(initialCapacity);
                return ((ActivityActionData) data).mOutput;
            }

            @objid ("2bffc750-e086-4350-bdb1-ce0762a3ee35")
            @Override
            public SmDependency getSymetric() {
                return OutputPinData.Metadata.OutputingDep();
            }

        }

        @objid ("007dbf22-c4c3-1fd8-97fe-001ec947cd2a")
        public static class HandlerSmDependency extends SmMultipleDependency {
            @objid ("84c4768f-a47b-466d-b713-99f46b323534")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityActionData)data).mHandler != null)? ((ActivityActionData)data).mHandler:SmMultipleDependency.EMPTY;
            }

            @objid ("b11a5b71-92cf-427d-87a1-26b6549df799")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityActionData) data).mHandler = new ArrayList<>(initialCapacity);
                return ((ActivityActionData) data).mHandler;
            }

            @objid ("ffd7e003-1bc9-4ba6-ad93-bd6a4752fd3c")
            @Override
            public SmDependency getSymetric() {
                return ExceptionHandlerData.Metadata.ProtectedNodeDep();
            }

        }

    }

}
