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
    @objid ("333c3325-0b92-44f0-a1cc-10fdb1ad4a13")
    @SmaMetaAttribute(metaName="IsSelf", type=Boolean.class, smAttributeClass=Metadata.IsSelfSmAttribute.class)
     Object mIsSelf = false;

    @objid ("5ff07adc-57d6-48d4-8fea-b9ffb01554ab")
    @SmaMetaAssociation(metaName="Handler", typeDataClass=ExceptionHandlerData.class, min=0, max=-1, smAssociationClass=Metadata.HandlerSmDependency.class, istodelete = true)
     List<SmObjectImpl> mHandler = null;

    @objid ("7fbea01a-8f87-4424-86bd-315d62b3ee99")
    @SmaMetaAssociation(metaName="Inputing", typeDataClass=ActivityActionData.class, min=0, max=1, smAssociationClass=Metadata.InputingSmDependency.class)
     SmObjectImpl mInputing;

    @objid ("2be98bb5-47b3-4291-b0e0-71958508f9ee")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00668f32-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1871380c-e59d-487c-b0a7-bae6ff3c50de")
        private static SmClass smClass = null;

        @objid ("09b851d5-4c21-402c-9176-e7b1d476d6a2")
        private static SmAttribute IsSelfAtt = null;

        @objid ("ae98bb52-41bf-4934-be56-462c07f40162")
        private static SmDependency HandlerDep = null;

        @objid ("afd684f7-deff-4d71-901e-3c3cd1c3c813")
        private static SmDependency InputingDep = null;

        @objid ("188a6200-c5ee-44d3-83f2-c76acb6376e5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InputPinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("de190b28-e089-4b17-8d8e-cb7ed99c545c")
        public static SmAttribute IsSelfAtt() {
            if (IsSelfAtt == null) {
            	IsSelfAtt = classof().getAttributeDef("IsSelf");
            }
            return IsSelfAtt;
        }

        @objid ("becf8253-6018-4dac-84f8-e0704b62ede3")
        public static SmDependency HandlerDep() {
            if (HandlerDep == null) {
            	HandlerDep = classof().getDependencyDef("Handler");
            }
            return HandlerDep;
        }

        @objid ("c0388015-2a01-49ba-815a-eb5ef71afd10")
        public static SmDependency InputingDep() {
            if (InputingDep == null) {
            	InputingDep = classof().getDependencyDef("Inputing");
            }
            return InputingDep;
        }

        @objid ("46802348-903c-4c17-afcb-4f8b8b32e22b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0ae64e0d-1dd2-49e6-8b7d-6563737c8aca")
        public static SmDependency getHandlerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return HandlerDep;
        }

        @objid ("e7976231-03d6-4708-9a66-fb318d2b739d")
        public static SmAttribute getIsSelfAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSelfAtt;
        }

        @objid ("a2dd129d-e5c7-4a21-a0f7-b8c71d4ab0d8")
        public static SmDependency getInputingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputingDep;
        }

        @objid ("0066d0d2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9ab81bee-f525-4127-a65e-c19725192ae8")
            public ISmObjectData createData() {
                return new InputPinData();
            }

            @objid ("52af3425-5e83-467f-86e5-f1fde688656f")
            public SmObjectImpl createImpl() {
                return new InputPinImpl();
            }

        }

        @objid ("00673324-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsSelfSmAttribute extends SmAttribute {
            @objid ("6e526427-dae2-4ef7-aec4-35f657887975")
            public Object getValue(ISmObjectData data) {
                return ((InputPinData) data).mIsSelf;
            }

            @objid ("25ded4fa-9115-4d13-9bca-3e8f974d6ce1")
            public void setValue(ISmObjectData data, Object value) {
                ((InputPinData) data).mIsSelf = value;
            }

        }

        @objid ("006795da-c4c2-1fd8-97fe-001ec947cd2a")
        public static class InputingSmDependency extends SmSingleDependency {
            @objid ("374c8168-f9e5-48c0-b7a7-8e5b68f10f20")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InputPinData) data).mInputing;
            }

            @objid ("f12b31e0-f1ab-434f-a87d-114ca678defb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InputPinData) data).mInputing = value;
            }

            @objid ("11eed8f4-af6e-4a3f-b87c-db443bbed5c2")
            @Override
            public SmDependency getSymetric() {
                return ActivityActionData.Metadata.InputDep();
            }

        }

        @objid ("00681136-c4c2-1fd8-97fe-001ec947cd2a")
        public static class HandlerSmDependency extends SmMultipleDependency {
            @objid ("50550c24-d8de-4c38-9e75-d379205793fc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InputPinData)data).mHandler != null)? ((InputPinData)data).mHandler:SmMultipleDependency.EMPTY;
            }

            @objid ("d5d67d0f-04e3-4463-a4c7-ab608df03e2e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InputPinData) data).mHandler = new ArrayList<>(initialCapacity);
                return ((InputPinData) data).mHandler;
            }

            @objid ("ee1012bd-d953-48ab-b0d3-3be2f9a7ea9e")
            @Override
            public SmDependency getSymetric() {
                return ExceptionHandlerData.Metadata.ExceptionInputDep();
            }

        }

    }

}
