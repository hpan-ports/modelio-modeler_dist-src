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
    @objid ("5f14daa9-7042-4f76-8a7c-4ebbf4362bf6")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("9e18750a-8d5a-4176-81ee-345f320e1fba")
    @SmaMetaAttribute(metaName="Weight", type=String.class, smAttributeClass=Metadata.WeightSmAttribute.class)
     Object mWeight = "1";

    @objid ("68a6a923-f8f2-422a-9ad0-c1968037a3b2")
    @SmaMetaAssociation(metaName="ProtectedNode", typeDataClass=ActivityActionData.class, min=1, max=1, smAssociationClass=Metadata.ProtectedNodeSmDependency.class)
     SmObjectImpl mProtectedNode;

    @objid ("69bd5ec5-9c40-4b79-9ec4-0ab682bbe493")
    @SmaMetaAssociation(metaName="ExceptionInput", typeDataClass=InputPinData.class, min=1, max=1, smAssociationClass=Metadata.ExceptionInputSmDependency.class, partof = true)
     SmObjectImpl mExceptionInput;

    @objid ("09a460c7-1fc7-4c9f-a82d-54dcae976d93")
    @SmaMetaAssociation(metaName="ExceptionType", typeDataClass=GeneralClassData.class, min=0, max=-1, smAssociationClass=Metadata.ExceptionTypeSmDependency.class, partof = true)
     List<SmObjectImpl> mExceptionType = null;

    @objid ("da737de0-6139-4caa-a21e-33bc4f101952")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000cff94-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ff624c97-6e5d-432b-a180-8f2e40f762de")
        private static SmClass smClass = null;

        @objid ("a595e9ee-cf2e-430d-9510-e215846d03b8")
        private static SmAttribute GuardAtt = null;

        @objid ("611abde2-4fe9-4e00-901a-a07f2d3e2ada")
        private static SmAttribute WeightAtt = null;

        @objid ("bb96aa22-ec53-40cd-bd10-dffbcd4e57c6")
        private static SmDependency ProtectedNodeDep = null;

        @objid ("4ae2565a-9ac2-4192-9d3e-d66cb0bd6458")
        private static SmDependency ExceptionInputDep = null;

        @objid ("37b87701-5317-484a-b0de-fd7711e62599")
        private static SmDependency ExceptionTypeDep = null;

        @objid ("f2069d02-5976-48c4-a776-1c24a98d25ff")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExceptionHandlerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e68af5ea-d2db-4c3b-9890-bc9a15df7c85")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("04c00594-4165-458a-91cf-56b40eb58c4d")
        public static SmAttribute WeightAtt() {
            if (WeightAtt == null) {
            	WeightAtt = classof().getAttributeDef("Weight");
            }
            return WeightAtt;
        }

        @objid ("edadcda8-6c56-489c-8a4d-37d824c4669e")
        public static SmDependency ProtectedNodeDep() {
            if (ProtectedNodeDep == null) {
            	ProtectedNodeDep = classof().getDependencyDef("ProtectedNode");
            }
            return ProtectedNodeDep;
        }

        @objid ("483a9d48-655b-469c-9835-ceb388f4ecd6")
        public static SmDependency ExceptionInputDep() {
            if (ExceptionInputDep == null) {
            	ExceptionInputDep = classof().getDependencyDef("ExceptionInput");
            }
            return ExceptionInputDep;
        }

        @objid ("ec139031-54c9-4dc4-93e0-f221e15589a1")
        public static SmDependency ExceptionTypeDep() {
            if (ExceptionTypeDep == null) {
            	ExceptionTypeDep = classof().getDependencyDef("ExceptionType");
            }
            return ExceptionTypeDep;
        }

        @objid ("994c1646-f997-48b7-8b3d-4388f6d6fc9a")
        public static SmAttribute getWeightAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return WeightAtt;
        }

        @objid ("284ca3eb-3408-43f4-892a-4eafb708f57d")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("97841d5d-5ab7-401a-9360-11edb78a8184")
        public static SmDependency getExceptionInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExceptionInputDep;
        }

        @objid ("f86f36c4-cdcd-4c33-aefa-88e973527d06")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5fe74dd7-2e17-47b0-a238-0755cb181e9a")
        public static SmDependency getExceptionTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExceptionTypeDep;
        }

        @objid ("2ffefd9e-b2cc-47a8-8e30-fceddb1932bd")
        public static SmDependency getProtectedNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProtectedNodeDep;
        }

        @objid ("000d40d0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ae2394b2-04af-4d48-afa1-a80e8bdb4d67")
            public ISmObjectData createData() {
                return new ExceptionHandlerData();
            }

            @objid ("16fa8724-9b0e-4c05-b01a-9319f7fd13c6")
            public SmObjectImpl createImpl() {
                return new ExceptionHandlerImpl();
            }

        }

        @objid ("000da2d2-c4c6-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("c93ae493-1f5a-4bb2-b034-5c60d740d6ac")
            public Object getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mGuard;
            }

            @objid ("46727028-debf-4076-894b-e46a08a8f461")
            public void setValue(ISmObjectData data, Object value) {
                ((ExceptionHandlerData) data).mGuard = value;
            }

        }

        @objid ("000e092a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class WeightSmAttribute extends SmAttribute {
            @objid ("fe49df62-a7f8-44df-b870-8a76ef518e48")
            public Object getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mWeight;
            }

            @objid ("c8f8a4bd-4633-4e68-a6d3-1542515e093b")
            public void setValue(ISmObjectData data, Object value) {
                ((ExceptionHandlerData) data).mWeight = value;
            }

        }

        @objid ("000e6c9e-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ExceptionInputSmDependency extends SmSingleDependency {
            @objid ("d5567f5b-cddb-4bcf-be2d-50de1902f3ce")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mExceptionInput;
            }

            @objid ("5b44fedd-d1de-4c92-865a-9ddf7050a523")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExceptionHandlerData) data).mExceptionInput = value;
            }

            @objid ("8379e8ef-e0dc-424b-a1bf-b6136db563c4")
            @Override
            public SmDependency getSymetric() {
                return InputPinData.Metadata.HandlerDep();
            }

        }

        @objid ("000ee368-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ProtectedNodeSmDependency extends SmSingleDependency {
            @objid ("6ccfd69f-b8d8-46c6-a1a3-65efd1ae2285")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mProtectedNode;
            }

            @objid ("ccd8653f-e7cb-4812-854e-dc6cadce8935")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExceptionHandlerData) data).mProtectedNode = value;
            }

            @objid ("30ad3a4a-4b0a-48d4-ab30-161f3f8f7349")
            @Override
            public SmDependency getSymetric() {
                return ActivityActionData.Metadata.HandlerDep();
            }

        }

        @objid ("000f5974-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ExceptionTypeSmDependency extends SmMultipleDependency {
            @objid ("2e947dbf-4421-4a6e-9cc6-80f6e27d7a9e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExceptionHandlerData)data).mExceptionType != null)? ((ExceptionHandlerData)data).mExceptionType:SmMultipleDependency.EMPTY;
            }

            @objid ("8732adb3-8022-4fbb-af84-3c5b84953f8c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExceptionHandlerData) data).mExceptionType = new ArrayList<>(initialCapacity);
                return ((ExceptionHandlerData) data).mExceptionType;
            }

            @objid ("81a5f165-058f-4505-ac13-6251211685d9")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.ExceptionInputDep();
            }

        }

    }

}
