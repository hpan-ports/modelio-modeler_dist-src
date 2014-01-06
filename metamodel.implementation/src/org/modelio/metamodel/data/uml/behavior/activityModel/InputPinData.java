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
    @objid ("39a2dc7c-bd14-4b7a-bf0b-56048443a319")
    @SmaMetaAttribute(metaName="IsSelf", type=Boolean.class, smAttributeClass=Metadata.IsSelfSmAttribute.class)
     Object mIsSelf = false;

    @objid ("b0b81ecb-8145-422d-9eec-3d75468aa390")
    @SmaMetaAssociation(metaName="Handler", typeDataClass=ExceptionHandlerData.class, min=0, max=-1, smAssociationClass=Metadata.HandlerSmDependency.class, istodelete = true)
     List<SmObjectImpl> mHandler = null;

    @objid ("187076dc-ce0d-4c7b-a80a-94e77cb7f305")
    @SmaMetaAssociation(metaName="Inputing", typeDataClass=ActivityActionData.class, min=0, max=1, smAssociationClass=Metadata.InputingSmDependency.class)
     SmObjectImpl mInputing;

    @objid ("d1aa93cb-dbeb-4379-8d57-037d38cf0ef4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00668f32-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ea09586c-8944-4adb-959d-4cabedcc5953")
        private static SmClass smClass = null;

        @objid ("5d3dd68d-c596-47d5-b995-705a1d2842e7")
        private static SmAttribute IsSelfAtt = null;

        @objid ("9c11d507-2a2e-412c-a9fb-7b49d74b1204")
        private static SmDependency HandlerDep = null;

        @objid ("30aae087-9d79-4c3c-aaf9-51de3109006d")
        private static SmDependency InputingDep = null;

        @objid ("4fdaa07b-abb5-4765-907d-f344c8987390")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InputPinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3e76930f-7ad6-435d-8b3c-a1f9b9e9bb49")
        public static SmAttribute IsSelfAtt() {
            if (IsSelfAtt == null) {
            	IsSelfAtt = classof().getAttributeDef("IsSelf");
            }
            return IsSelfAtt;
        }

        @objid ("c2a71004-84ad-4a74-b9a7-78d195c90358")
        public static SmDependency HandlerDep() {
            if (HandlerDep == null) {
            	HandlerDep = classof().getDependencyDef("Handler");
            }
            return HandlerDep;
        }

        @objid ("4e24ebd1-f39a-4110-aadd-3b9e60950a26")
        public static SmDependency InputingDep() {
            if (InputingDep == null) {
            	InputingDep = classof().getDependencyDef("Inputing");
            }
            return InputingDep;
        }

        @objid ("e4c7445c-89f1-4155-8867-15f634bfff81")
        public static SmAttribute getIsSelfAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSelfAtt;
        }

        @objid ("48cf6831-48be-462a-a2d4-8cd3da159115")
        public static SmDependency getInputingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputingDep;
        }

        @objid ("e663f118-78b3-4f38-a640-9e8c2360af81")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b132c25a-feca-4eaf-b115-01fa9e1e5a2d")
        public static SmDependency getHandlerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return HandlerDep;
        }

        @objid ("0066d0d2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cc6a71ab-33bc-4967-9e78-53dc8b97c92a")
            public ISmObjectData createData() {
                return new InputPinData();
            }

            @objid ("2a232035-e1a1-48dc-ad9a-144114c317dc")
            public SmObjectImpl createImpl() {
                return new InputPinImpl();
            }

        }

        @objid ("00673324-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsSelfSmAttribute extends SmAttribute {
            @objid ("814003a0-c239-42ef-9ba8-9d900d35bb20")
            public Object getValue(ISmObjectData data) {
                return ((InputPinData) data).mIsSelf;
            }

            @objid ("7e340177-d01c-4cd3-b409-0a88851fb6c0")
            public void setValue(ISmObjectData data, Object value) {
                ((InputPinData) data).mIsSelf = value;
            }

        }

        @objid ("006795da-c4c2-1fd8-97fe-001ec947cd2a")
        public static class InputingSmDependency extends SmSingleDependency {
            @objid ("9a9469fb-5a9e-4f4c-bf85-45b04bf3756e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InputPinData) data).mInputing;
            }

            @objid ("f5e6dfc4-0329-4574-92d7-064adf757a55")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InputPinData) data).mInputing = value;
            }

            @objid ("ac855780-ac05-41e1-8876-e6098ab3760b")
            @Override
            public SmDependency getSymetric() {
                return ActivityActionData.Metadata.InputDep();
            }

        }

        @objid ("00681136-c4c2-1fd8-97fe-001ec947cd2a")
        public static class HandlerSmDependency extends SmMultipleDependency {
            @objid ("8f33069c-b4d8-4b22-aad6-fca72a823ee7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InputPinData)data).mHandler != null)? ((InputPinData)data).mHandler:SmMultipleDependency.EMPTY;
            }

            @objid ("32902c99-23fa-456e-97b4-7ed82e40a2f2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InputPinData) data).mHandler = new ArrayList<>(initialCapacity);
                return ((InputPinData) data).mHandler;
            }

            @objid ("12efae7f-94c0-4476-a105-a63b1883d973")
            @Override
            public SmDependency getSymetric() {
                return ExceptionHandlerData.Metadata.ExceptionInputDep();
            }

        }

    }

}
