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
    @objid ("ac7c6614-275b-4858-ad98-5024eff6f221")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("5e9bb3cd-5688-48bd-931a-86381076ee0d")
    @SmaMetaAttribute(metaName="Weight", type=String.class, smAttributeClass=Metadata.WeightSmAttribute.class)
     Object mWeight = "1";

    @objid ("395f347f-ae5a-48df-9300-102f96527389")
    @SmaMetaAssociation(metaName="ProtectedNode", typeDataClass=ActivityActionData.class, min=1, max=1, smAssociationClass=Metadata.ProtectedNodeSmDependency.class)
     SmObjectImpl mProtectedNode;

    @objid ("352dc229-fa69-4b97-a72b-da8fbfe5d25a")
    @SmaMetaAssociation(metaName="ExceptionInput", typeDataClass=InputPinData.class, min=1, max=1, smAssociationClass=Metadata.ExceptionInputSmDependency.class, partof = true)
     SmObjectImpl mExceptionInput;

    @objid ("4ff8fc57-cef8-4c96-a831-07ac3d34f48b")
    @SmaMetaAssociation(metaName="ExceptionType", typeDataClass=GeneralClassData.class, min=0, max=-1, smAssociationClass=Metadata.ExceptionTypeSmDependency.class, partof = true)
     List<SmObjectImpl> mExceptionType = null;

    @objid ("adccf2d7-7475-4ed4-a5bc-12cdb55fefbd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000cff94-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("46ff09a5-cdc5-4a5c-a2cd-65e46d798274")
        private static SmClass smClass = null;

        @objid ("e577923c-90be-4d0b-ae70-6145058e0372")
        private static SmAttribute GuardAtt = null;

        @objid ("d12ef332-baed-4157-877d-269be1c8c278")
        private static SmAttribute WeightAtt = null;

        @objid ("c2595f97-fca3-41d6-9360-15aa35cd58df")
        private static SmDependency ProtectedNodeDep = null;

        @objid ("b7ef3cb5-cbab-4dd5-ae22-7b7b24c1e57c")
        private static SmDependency ExceptionInputDep = null;

        @objid ("4680aa62-37f5-4c64-ad9f-3e63b433f4ed")
        private static SmDependency ExceptionTypeDep = null;

        @objid ("c35f115f-722c-4c3e-8323-5c14fb03c575")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExceptionHandlerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("54972130-03ad-42f3-9172-acce9d8f3915")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("a060b506-c031-40c8-b912-3b36ea2d28c8")
        public static SmAttribute WeightAtt() {
            if (WeightAtt == null) {
            	WeightAtt = classof().getAttributeDef("Weight");
            }
            return WeightAtt;
        }

        @objid ("4e861c9f-7ee8-48b5-9243-5b177765bf58")
        public static SmDependency ProtectedNodeDep() {
            if (ProtectedNodeDep == null) {
            	ProtectedNodeDep = classof().getDependencyDef("ProtectedNode");
            }
            return ProtectedNodeDep;
        }

        @objid ("ea74bf45-08fe-42b7-a591-68d7d37bd350")
        public static SmDependency ExceptionInputDep() {
            if (ExceptionInputDep == null) {
            	ExceptionInputDep = classof().getDependencyDef("ExceptionInput");
            }
            return ExceptionInputDep;
        }

        @objid ("59780460-3123-48d3-bab1-66835e87f730")
        public static SmDependency ExceptionTypeDep() {
            if (ExceptionTypeDep == null) {
            	ExceptionTypeDep = classof().getDependencyDef("ExceptionType");
            }
            return ExceptionTypeDep;
        }

        @objid ("51e27f55-e23d-4572-9f92-78a44b5677ef")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("56be5336-789a-4fd6-a61b-abb541a67514")
        public static SmAttribute getWeightAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return WeightAtt;
        }

        @objid ("86a2f314-ff46-4204-9af3-c044b335fd57")
        public static SmDependency getExceptionInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExceptionInputDep;
        }

        @objid ("793e9588-a166-4cdc-9e92-e934b39993e1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5fc12cf1-7082-45c6-b33d-49d043543156")
        public static SmDependency getProtectedNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProtectedNodeDep;
        }

        @objid ("5b1cc6a1-44d3-4130-8310-34c53cd1ddd0")
        public static SmDependency getExceptionTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExceptionTypeDep;
        }

        @objid ("000d40d0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ecac7f0d-64d7-4361-9d1f-db82fafb7373")
            public ISmObjectData createData() {
                return new ExceptionHandlerData();
            }

            @objid ("4ee1cbc0-a61e-4521-bdaa-65f666c6f4be")
            public SmObjectImpl createImpl() {
                return new ExceptionHandlerImpl();
            }

        }

        @objid ("000da2d2-c4c6-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("931e68ce-2a12-4cbc-aa55-916b5c341401")
            public Object getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mGuard;
            }

            @objid ("51860c21-ca59-4454-9d06-990f2372adf1")
            public void setValue(ISmObjectData data, Object value) {
                ((ExceptionHandlerData) data).mGuard = value;
            }

        }

        @objid ("000e092a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class WeightSmAttribute extends SmAttribute {
            @objid ("3a2a144e-7836-48ce-9966-ddde338b74ad")
            public Object getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mWeight;
            }

            @objid ("b9b12e73-acbd-40c9-b7de-0878fdaedc7d")
            public void setValue(ISmObjectData data, Object value) {
                ((ExceptionHandlerData) data).mWeight = value;
            }

        }

        @objid ("000e6c9e-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ExceptionInputSmDependency extends SmSingleDependency {
            @objid ("fdd26e5e-7c5a-4a59-a03a-7713d7e96777")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mExceptionInput;
            }

            @objid ("5d466455-a8ef-425c-9043-93d34cb25f8f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExceptionHandlerData) data).mExceptionInput = value;
            }

            @objid ("89eb6324-f221-4fa3-8bf6-1deeb0593abb")
            @Override
            public SmDependency getSymetric() {
                return InputPinData.Metadata.HandlerDep();
            }

        }

        @objid ("000ee368-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ProtectedNodeSmDependency extends SmSingleDependency {
            @objid ("cefb5c56-25a5-42ae-bf57-c02dfba10273")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExceptionHandlerData) data).mProtectedNode;
            }

            @objid ("2a02b831-2257-4b25-8b1f-f180b79bcc0c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExceptionHandlerData) data).mProtectedNode = value;
            }

            @objid ("deb18450-6c9c-4800-b984-361863ea3cd3")
            @Override
            public SmDependency getSymetric() {
                return ActivityActionData.Metadata.HandlerDep();
            }

        }

        @objid ("000f5974-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ExceptionTypeSmDependency extends SmMultipleDependency {
            @objid ("d7a42b44-c3cb-4b7e-8280-339cd188cd66")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExceptionHandlerData)data).mExceptionType != null)? ((ExceptionHandlerData)data).mExceptionType:SmMultipleDependency.EMPTY;
            }

            @objid ("d83309e3-c917-4f63-8b5f-00a6e6fe4f58")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExceptionHandlerData) data).mExceptionType = new ArrayList<>(initialCapacity);
                return ((ExceptionHandlerData) data).mExceptionType;
            }

            @objid ("b198ca27-d935-404c-ad88-2d9e9e030621")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.ExceptionInputDep();
            }

        }

    }

}
