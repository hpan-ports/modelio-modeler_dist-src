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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityActionData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ExceptionHandlerData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.InputPinImpl;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
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

@objid ("003580cc-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InputPin.class, factory=InputPinData.Metadata.ObjectFactory.class)
public class InputPinData extends PinData {
    @objid ("45868af1-a096-4af7-800d-907f0b37ea43")
    @SmaMetaAttribute(metaName="IsSelf", type=Boolean.class, smAttributeClass=Metadata.IsSelfSmAttribute.class)
     Object mIsSelf = false;

    @objid ("6bbc2f18-96b1-4a78-af7b-558f6096c386")
    @SmaMetaAssociation(metaName="Handler", typeDataClass=ExceptionHandlerData.class, min=0, max=-1, smAssociationClass=Metadata.HandlerSmDependency.class, istodelete = true)
     List<SmObjectImpl> mHandler = null;

    @objid ("07427802-e7bd-49fb-9cb4-d2d737f21cfd")
    @SmaMetaAssociation(metaName="Inputing", typeDataClass=ActivityActionData.class, min=0, max=1, smAssociationClass=Metadata.InputingSmDependency.class)
     SmObjectImpl mInputing;

    @objid ("7cefdc4b-b650-4396-9424-516140fc4d96")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00668f32-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("943a53cb-63ed-4303-872a-53a107c58fd9")
        private static SmClass smClass = null;

        @objid ("7d78b317-71f1-49f4-883d-6352c922643d")
        private static SmAttribute IsSelfAtt = null;

        @objid ("c185afe6-0490-444c-8c2a-3a37f411abaa")
        private static SmDependency HandlerDep = null;

        @objid ("95d8e223-80c6-4e37-9012-ef9e23dffd9f")
        private static SmDependency InputingDep = null;

        @objid ("7f5c4d83-b072-4e48-8219-9bb6b2c8a10e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InputPinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ddec4866-cff8-492a-91dd-9c524a66b684")
        public static SmAttribute IsSelfAtt() {
            if (IsSelfAtt == null) {
            	IsSelfAtt = classof().getAttributeDef("IsSelf");
            }
            return IsSelfAtt;
        }

        @objid ("f4abb3a6-3445-46f7-9d72-97767ca6160f")
        public static SmDependency HandlerDep() {
            if (HandlerDep == null) {
            	HandlerDep = classof().getDependencyDef("Handler");
            }
            return HandlerDep;
        }

        @objid ("b384685e-0313-4385-9e66-79a1678cfd69")
        public static SmDependency InputingDep() {
            if (InputingDep == null) {
            	InputingDep = classof().getDependencyDef("Inputing");
            }
            return InputingDep;
        }

        @objid ("eaa86adf-4c67-4d0c-9f2d-1f21ffcd1fed")
        public static SmAttribute getIsSelfAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSelfAtt;
        }

        @objid ("b890573e-fdff-4f66-a978-998fe684e646")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("44b7dbd0-59b8-41d6-8aea-2ca440e99dce")
        public static SmDependency getHandlerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return HandlerDep;
        }

        @objid ("a5aeb397-93e8-4870-8359-757705b1c1d9")
        public static SmDependency getInputingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputingDep;
        }

        @objid ("0066d0d2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4fb353a1-cd4d-45f8-b87f-23757d0219ca")
            public ISmObjectData createData() {
                return new InputPinData();
            }

            @objid ("ff428157-ee26-45a0-869e-6026ef5d74cd")
            public SmObjectImpl createImpl() {
                return new InputPinImpl();
            }

        }

        @objid ("00673324-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsSelfSmAttribute extends SmAttribute {
            @objid ("5c22495e-d37a-4cb8-86db-5a9bde45cf46")
            public Object getValue(ISmObjectData data) {
                return ((InputPinData) data).mIsSelf;
            }

            @objid ("50929141-0f84-4221-a401-04952f1ac1ee")
            public void setValue(ISmObjectData data, Object value) {
                ((InputPinData) data).mIsSelf = value;
            }

        }

        @objid ("006795da-c4c2-1fd8-97fe-001ec947cd2a")
        public static class InputingSmDependency extends SmSingleDependency {
            @objid ("bb65a277-83c1-4532-8d9f-b8d15471eb0c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InputPinData) data).mInputing;
            }

            @objid ("a67f75f5-1a53-4bbb-a457-3999483bcbc6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InputPinData) data).mInputing = value;
            }

            @objid ("a4ba12b6-72a9-4857-a385-acb93943395d")
            @Override
            public SmDependency getSymetric() {
                return ActivityActionData.Metadata.InputDep();
            }

        }

        @objid ("00681136-c4c2-1fd8-97fe-001ec947cd2a")
        public static class HandlerSmDependency extends SmMultipleDependency {
            @objid ("9c28c07d-2b89-451a-a948-be7ad5cfef49")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InputPinData)data).mHandler != null)? ((InputPinData)data).mHandler:SmMultipleDependency.EMPTY;
            }

            @objid ("8a92a31c-1539-4c3f-99c3-98d58385a933")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InputPinData) data).mHandler = new ArrayList<>(initialCapacity);
                return ((InputPinData) data).mHandler;
            }

            @objid ("8b009d98-60c6-4644-851c-a904fcd364bc")
            @Override
            public SmDependency getSymetric() {
                return ExceptionHandlerData.Metadata.ExceptionInputDep();
            }

        }

    }

}
