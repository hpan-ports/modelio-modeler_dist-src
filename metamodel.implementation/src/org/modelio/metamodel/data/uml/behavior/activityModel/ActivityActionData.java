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
    @objid ("4d9da9a6-4214-4586-a27c-f413889f8253")
    @SmaMetaAttribute(metaName="IsMultipleInstance", type=Boolean.class, smAttributeClass=Metadata.IsMultipleInstanceSmAttribute.class)
     Object mIsMultipleInstance = false;

    @objid ("1c490ca9-96d2-431e-a9de-a68a77c93a70")
    @SmaMetaAttribute(metaName="IsCompensation", type=Boolean.class, smAttributeClass=Metadata.IsCompensationSmAttribute.class)
     Object mIsCompensation = false;

    @objid ("04934298-d57e-41c2-a4c9-e1be474fbeb7")
    @SmaMetaAssociation(metaName="Output", typeDataClass=OutputPinData.class, min=0, max=-1, smAssociationClass=Metadata.OutputSmDependency.class, component = true)
     List<SmObjectImpl> mOutput = null;

    @objid ("29d70562-468a-446e-ad04-760dc2a152e9")
    @SmaMetaAssociation(metaName="Input", typeDataClass=InputPinData.class, min=0, max=-1, smAssociationClass=Metadata.InputSmDependency.class, component = true)
     List<SmObjectImpl> mInput = null;

    @objid ("cec54298-30ab-464f-9fde-d4977e687049")
    @SmaMetaAssociation(metaName="Handler", typeDataClass=ExceptionHandlerData.class, min=0, max=-1, smAssociationClass=Metadata.HandlerSmDependency.class, component = true)
     List<SmObjectImpl> mHandler = null;

    @objid ("2cdb513a-7fcb-4323-964b-5972af663cf4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007b796a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2728c6e3-198f-472c-a3e7-1a4eb04cedc7")
        private static SmClass smClass = null;

        @objid ("dbef5cf3-c39f-475a-9e7b-86c4177b5b85")
        private static SmAttribute IsMultipleInstanceAtt = null;

        @objid ("47f4463f-c3bf-4688-af18-0fd3bd0367c0")
        private static SmAttribute IsCompensationAtt = null;

        @objid ("045958dd-bc09-4996-8aa0-c16f5bcecea8")
        private static SmDependency OutputDep = null;

        @objid ("f7f741e4-f977-4f25-8c0c-ac8e9964b9c1")
        private static SmDependency InputDep = null;

        @objid ("c2fa9048-2ace-4ea8-b0ba-869f2f521ae4")
        private static SmDependency HandlerDep = null;

        @objid ("2ae53e17-6e73-43b1-b7af-ac2e9a6312a9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4a3a96cd-dc86-428a-bba4-10ffc68c9d3e")
        public static SmAttribute IsMultipleInstanceAtt() {
            if (IsMultipleInstanceAtt == null) {
            	IsMultipleInstanceAtt = classof().getAttributeDef("IsMultipleInstance");
            }
            return IsMultipleInstanceAtt;
        }

        @objid ("85d8df62-610a-495c-9f2b-17781eb3c7a0")
        public static SmAttribute IsCompensationAtt() {
            if (IsCompensationAtt == null) {
            	IsCompensationAtt = classof().getAttributeDef("IsCompensation");
            }
            return IsCompensationAtt;
        }

        @objid ("77693854-ea3a-4a4a-b940-319b8e75c922")
        public static SmDependency OutputDep() {
            if (OutputDep == null) {
            	OutputDep = classof().getDependencyDef("Output");
            }
            return OutputDep;
        }

        @objid ("9df3f9e4-ac3c-417d-a687-0a94b1477afd")
        public static SmDependency InputDep() {
            if (InputDep == null) {
            	InputDep = classof().getDependencyDef("Input");
            }
            return InputDep;
        }

        @objid ("614bd5da-9375-4b03-a423-5c3a1cc159f0")
        public static SmDependency HandlerDep() {
            if (HandlerDep == null) {
            	HandlerDep = classof().getDependencyDef("Handler");
            }
            return HandlerDep;
        }

        @objid ("411dbebf-a00f-45f0-b36c-c6ec7bba193b")
        public static SmDependency getHandlerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return HandlerDep;
        }

        @objid ("7e3f4758-ba46-4eac-ac92-fc2420fdc928")
        public static SmDependency getOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputDep;
        }

        @objid ("ba19ae10-b5c3-4223-91f2-60e7e794db40")
        public static SmAttribute getIsMultipleInstanceAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMultipleInstanceAtt;
        }

        @objid ("7e23a487-4b9e-4480-97b4-744f87264804")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("10eaa364-f510-45b2-a2e1-917ee6f3fd65")
        public static SmAttribute getIsCompensationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsCompensationAtt;
        }

        @objid ("f1a58c10-5b30-4dd0-8f91-309f1bef92aa")
        public static SmDependency getInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputDep;
        }

        @objid ("007bbc7c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e7c56cd4-0e1d-4b2c-bc19-08beccbe3234")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("f0c32bb9-6a0e-43bc-9bcd-b16fffabdae0")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("007c1fbe-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsMultipleInstanceSmAttribute extends SmAttribute {
            @objid ("58a8dc9a-b3d5-457b-a0a2-56ad38bcd648")
            public Object getValue(ISmObjectData data) {
                return ((ActivityActionData) data).mIsMultipleInstance;
            }

            @objid ("d400e3f2-e189-4c49-bd90-edb56b0cf238")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityActionData) data).mIsMultipleInstance = value;
            }

        }

        @objid ("007c8e72-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsCompensationSmAttribute extends SmAttribute {
            @objid ("118a89ac-63ce-4c03-b8a8-0dc88d77cbd0")
            public Object getValue(ISmObjectData data) {
                return ((ActivityActionData) data).mIsCompensation;
            }

            @objid ("3a888697-9e3e-4c9f-9d80-e424c33a3e37")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityActionData) data).mIsCompensation = value;
            }

        }

        @objid ("007cf4f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InputSmDependency extends SmMultipleDependency {
            @objid ("09891c08-116b-4df2-8b6b-ee73ef2d7aac")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityActionData)data).mInput != null)? ((ActivityActionData)data).mInput:SmMultipleDependency.EMPTY;
            }

            @objid ("d6091bcc-cd5f-4d97-b564-66d354906cd4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityActionData) data).mInput = new ArrayList<>(initialCapacity);
                return ((ActivityActionData) data).mInput;
            }

            @objid ("a37bf6ed-2bbb-4fc9-b1c6-4fc29cbf0e23")
            @Override
            public SmDependency getSymetric() {
                return InputPinData.Metadata.InputingDep();
            }

        }

        @objid ("007d5a1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutputSmDependency extends SmMultipleDependency {
            @objid ("d41cc27a-949d-4d86-97d3-5fda0e74f249")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityActionData)data).mOutput != null)? ((ActivityActionData)data).mOutput:SmMultipleDependency.EMPTY;
            }

            @objid ("d7ae4211-3950-4ed5-8de9-c0d6d96e8bb3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityActionData) data).mOutput = new ArrayList<>(initialCapacity);
                return ((ActivityActionData) data).mOutput;
            }

            @objid ("777ceca1-dec3-491a-829b-382e0e1ab85e")
            @Override
            public SmDependency getSymetric() {
                return OutputPinData.Metadata.OutputingDep();
            }

        }

        @objid ("007dbf22-c4c3-1fd8-97fe-001ec947cd2a")
        public static class HandlerSmDependency extends SmMultipleDependency {
            @objid ("91c417ce-ff8a-497b-baba-cf13e269dd0e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityActionData)data).mHandler != null)? ((ActivityActionData)data).mHandler:SmMultipleDependency.EMPTY;
            }

            @objid ("c7f64cd4-2744-4554-bb5f-409ace3cbf22")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityActionData) data).mHandler = new ArrayList<>(initialCapacity);
                return ((ActivityActionData) data).mHandler;
            }

            @objid ("648634ac-1e05-44ef-9e2e-c12694a65d0b")
            @Override
            public SmDependency getSymetric() {
                return ExceptionHandlerData.Metadata.ProtectedNodeDep();
            }

        }

    }

}
