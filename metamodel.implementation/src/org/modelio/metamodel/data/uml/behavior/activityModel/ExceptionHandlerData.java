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
import org.modelio.metamodel.data.uml.behavior.activityModel.InputPinData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExceptionHandlerImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
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

@objid ("0030e0d0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExceptionHandler.class, factory=ExceptionHandlerData.Metadata.ObjectFactory.class)
public class ExceptionHandlerData extends ModelElementData {
    @objid ("1437194d-313b-4796-b53b-b76544d0f247")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("25f57670-fc90-46d4-885c-d4453aa9a8d5")
    @SmaMetaAttribute(metaName="Weight", type=String.class, smAttributeClass=Metadata.WeightSmAttribute.class)
     Object mWeight = "1";

    @objid ("3c0a306e-9707-4f71-88a5-18d49a0be419")
    @SmaMetaAssociation(metaName="ProtectedNode", typeDataClass=ActivityActionData.class, min=1, max=1, smAssociationClass=Metadata.ProtectedNodeSmDependency.class)
     SmObjectImpl mProtectedNode;

    @objid ("c186b396-c2f3-408e-80f6-f44983b6c44b")
    @SmaMetaAssociation(metaName="ExceptionInput", typeDataClass=InputPinData.class, min=1, max=1, smAssociationClass=Metadata.ExceptionInputSmDependency.class, partof = true)
     SmObjectImpl mExceptionInput;

    @objid ("8c6d7370-62d4-4ea8-b29c-02c9d1430835")
    @SmaMetaAssociation(metaName="ExceptionType", typeDataClass=GeneralClassData.class, min=0, max=-1, smAssociationClass=Metadata.ExceptionTypeSmDependency.class, partof = true)
     List<SmObjectImpl> mExceptionType = null;

    @objid ("cbc056f4-9402-415d-a3d3-e55461d2cb80")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000cff94-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("92d4fbc7-94fd-4a0d-8141-8edf5acf3cfd")
        private static SmClass smClass = null;

        @objid ("eab3d81e-7dbf-40ec-8147-72e05f6ac831")
        private static SmAttribute GuardAtt = null;

        @objid ("aa300947-0bd4-4a1f-b999-e3dea88670ec")
        private static SmAttribute WeightAtt = null;

        @objid ("33c2bd9a-ffa1-41c6-b0a1-28f33652bd8f")
        private static SmDependency ProtectedNodeDep = null;

        @objid ("6ccec8f7-a6dd-493a-b94e-15b9d1673036")
        private static SmDependency ExceptionInputDep = null;

        @objid ("ce9e0885-0135-4723-9b2c-203a3dd82910")
        private static SmDependency ExceptionTypeDep = null;

        @objid ("78753c8d-bb28-41f9-be4e-5ddd64d6fe9f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExceptionHandlerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fcaa3cfa-f33c-47b2-bd9d-7c9d54b987dc")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("f4caa735-7d17-4c00-aee3-df4a031b66a5")
        public static SmAttribute WeightAtt() {
            if (WeightAtt == null) {
            	WeightAtt = classof().getAttributeDef("Weight");
            }
            return WeightAtt;
        }

        @objid ("eabf926a-bdd3-4b58-b9c7-cab30fcfcda8")
        public static SmDependency ProtectedNodeDep() {
            if (ProtectedNodeDep == null) {
            	ProtectedNodeDep = classof().getDependencyDef("ProtectedNode");
            }
            return ProtectedNodeDep;
        }

        @objid ("aa7283fc-e014-4ca3-8494-68ee62e27384")
        public static SmDependency ExceptionInputDep() {
            if (ExceptionInputDep == null) {
            	ExceptionInputDep = classof().getDependencyDef("ExceptionInput");
            }
            return ExceptionInputDep;
        }

        @objid ("1a74609b-faec-4f36-be79-35746076c6f6")
        public static SmDependency ExceptionTypeDep() {
            if (ExceptionTypeDep == null) {
            	ExceptionTypeDep = classof().getDependencyDef("ExceptionType");
            }
            return ExceptionTypeDep;
        }

        @objid ("627afa97-8743-49cb-927a-ff0cb9c2aebe")
        public static SmDependency getExceptionInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExceptionInputDep;
        }

        @objid ("ef1a3089-75ab-4ab2-b7c3-a19af3f7b267")
        public static SmDependency getExceptionTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExceptionTypeDep;
        }

        @objid ("7530f78f-5cda-4717-8e15-0de63db8ad07")
        public static SmDependency getProtectedNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProtectedNodeDep;
        }

        @objid ("702e6ec9-8637-4a70-a7fd-fe05aeae72ad")
        public static SmAttribute getWeightAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return WeightAtt;
        }

        @objid ("03ec15cb-85a5-463a-a1d1-8f0aadca6a07")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("787d19d8-0b6e-4056-a9f7-1f2c85b79526")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000d40d0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dd55f4c0-be7a-4aa4-b653-ce1dfa7201cf")
            public ISmObjectData createData() {
                return new ExceptionHandlerData();
            }

            @objid ("8a5d57ca-8c9b-4eca-ab45-1bb9400a638a")
            public SmObjectImpl createImpl() {
                return new ExceptionHandlerImpl();
            }

        }

        @objid ("000da2d2-c4c6-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("2cea968c-7d81-4610-9d3e-3b9cca386d6a")
            public Object getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mGuard;
            }

            @objid ("1d00fe5e-49c1-49ea-9334-72b749416036")
            public void setValue(ISmObjectData data, Object value) {
                ((ExceptionHandlerData) data).mGuard = value;
            }

        }

        @objid ("000e092a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class WeightSmAttribute extends SmAttribute {
            @objid ("880e2c52-3704-4339-8973-ad5075845e7e")
            public Object getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mWeight;
            }

            @objid ("dfddaff7-14ae-4b54-9c25-fa59833d90e4")
            public void setValue(ISmObjectData data, Object value) {
                ((ExceptionHandlerData) data).mWeight = value;
            }

        }

        @objid ("000e6c9e-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ExceptionInputSmDependency extends SmSingleDependency {
            @objid ("0ae3701b-a65a-4b21-abfd-6441a46c5776")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mExceptionInput;
            }

            @objid ("b6a43fdc-601c-493b-a731-353bf722c76e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExceptionHandlerData) data).mExceptionInput = value;
            }

            @objid ("aec90295-6a00-44d5-9b6a-66fba416e4e5")
            @Override
            public SmDependency getSymetric() {
                return InputPinData.Metadata.HandlerDep();
            }

        }

        @objid ("000ee368-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ProtectedNodeSmDependency extends SmSingleDependency {
            @objid ("74350549-8a58-40a4-b40f-c41b88d817f6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mProtectedNode;
            }

            @objid ("979c0547-6fcd-4d0f-bdb4-c25179d03a06")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExceptionHandlerData) data).mProtectedNode = value;
            }

            @objid ("ac77bb45-a813-4bff-8c50-d74c228f0b8b")
            @Override
            public SmDependency getSymetric() {
                return ActivityActionData.Metadata.HandlerDep();
            }

        }

        @objid ("000f5974-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ExceptionTypeSmDependency extends SmMultipleDependency {
            @objid ("607e6ef5-9db5-491c-945b-3939615dc024")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExceptionHandlerData)data).mExceptionType != null)? ((ExceptionHandlerData)data).mExceptionType:SmMultipleDependency.EMPTY;
            }

            @objid ("449f8287-08d5-4034-b21e-539fc64e92e7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExceptionHandlerData) data).mExceptionType = new ArrayList<>(initialCapacity);
                return ((ExceptionHandlerData) data).mExceptionType;
            }

            @objid ("da9a4428-ebcb-43e9-80df-b74293ec3a30")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.ExceptionInputDep();
            }

        }

    }

}
