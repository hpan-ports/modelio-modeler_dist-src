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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ProvidedInterfaceData;
import org.modelio.metamodel.data.uml.statik.RequiredInterfaceData;
import org.modelio.metamodel.impl.uml.statik.PortImpl;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
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

@objid ("00193926-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Port.class, factory=PortData.Metadata.ObjectFactory.class)
public class PortData extends BindableInstanceData {
    @objid ("d3200efb-7c47-4baf-a60d-e9d6d2ce9598")
    @SmaMetaAttribute(metaName="IsBehavior", type=Boolean.class, smAttributeClass=Metadata.IsBehaviorSmAttribute.class)
     Object mIsBehavior = false;

    @objid ("49bed6ce-d545-4565-9a85-34b015b1c893")
    @SmaMetaAttribute(metaName="IsService", type=Boolean.class, smAttributeClass=Metadata.IsServiceSmAttribute.class)
     Object mIsService = false;

    @objid ("4f810c45-3088-48c0-8408-e9ad2dd34b32")
    @SmaMetaAttribute(metaName="IsConjugated", type=Boolean.class, smAttributeClass=Metadata.IsConjugatedSmAttribute.class)
     Object mIsConjugated = false;

    @objid ("358025cc-3180-4a05-8ec3-180b163b9afd")
    @SmaMetaAttribute(metaName="Direction", type=PortOrientation.class, smAttributeClass=Metadata.DirectionSmAttribute.class)
     Object mDirection = PortOrientation.NONE;

    @objid ("d3d9c4ab-89fe-40ee-b0fc-6ec8690ec20c")
    @SmaMetaAssociation(metaName="Provided", typeDataClass=ProvidedInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.ProvidedSmDependency.class, component = true)
     List<SmObjectImpl> mProvided = null;

    @objid ("1995dee6-ec0a-4581-ac67-85a2286198f8")
    @SmaMetaAssociation(metaName="Required", typeDataClass=RequiredInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredSmDependency.class, component = true)
     List<SmObjectImpl> mRequired = null;

    @objid ("20b7c7ee-ef7e-4a73-bc7e-f633c5fe4b9f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007f05e4-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bb6d735c-4cea-4381-b695-2fd69fe6d5a5")
        private static SmClass smClass = null;

        @objid ("6a80b85e-12cf-49c7-af26-dca8c2a48531")
        private static SmAttribute IsBehaviorAtt = null;

        @objid ("fc5f9f9f-cd48-4e42-9fe3-b101e6abf554")
        private static SmAttribute IsServiceAtt = null;

        @objid ("e3b1c072-5251-4879-974b-67dfa69da580")
        private static SmAttribute IsConjugatedAtt = null;

        @objid ("ba99245a-40c7-4ce1-aa54-f3d22b831dc0")
        private static SmAttribute DirectionAtt = null;

        @objid ("bb296f10-0140-4c68-9b4f-75cac4f20ecd")
        private static SmDependency ProvidedDep = null;

        @objid ("27998781-f530-49f5-ac53-e03089911c04")
        private static SmDependency RequiredDep = null;

        @objid ("dd5f38cb-712d-41ba-b5eb-314d3789ad02")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PortData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("155a9262-262f-428f-8475-21c8e55bda99")
        public static SmAttribute IsBehaviorAtt() {
            if (IsBehaviorAtt == null) {
            	IsBehaviorAtt = classof().getAttributeDef("IsBehavior");
            }
            return IsBehaviorAtt;
        }

        @objid ("bcd36a32-763a-48a2-a60d-37a6a4f7d78b")
        public static SmAttribute IsServiceAtt() {
            if (IsServiceAtt == null) {
            	IsServiceAtt = classof().getAttributeDef("IsService");
            }
            return IsServiceAtt;
        }

        @objid ("d2af3ac3-81b1-4bd5-8776-58eae3fdbeb0")
        public static SmAttribute IsConjugatedAtt() {
            if (IsConjugatedAtt == null) {
            	IsConjugatedAtt = classof().getAttributeDef("IsConjugated");
            }
            return IsConjugatedAtt;
        }

        @objid ("a013ae76-c1a0-40c0-a0d0-814475175a6d")
        public static SmAttribute DirectionAtt() {
            if (DirectionAtt == null) {
            	DirectionAtt = classof().getAttributeDef("Direction");
            }
            return DirectionAtt;
        }

        @objid ("a3dcf5a7-0a09-4376-a748-ee08c10a90cb")
        public static SmDependency ProvidedDep() {
            if (ProvidedDep == null) {
            	ProvidedDep = classof().getDependencyDef("Provided");
            }
            return ProvidedDep;
        }

        @objid ("8ee311de-880d-471e-ab39-36c282d3d95e")
        public static SmDependency RequiredDep() {
            if (RequiredDep == null) {
            	RequiredDep = classof().getDependencyDef("Required");
            }
            return RequiredDep;
        }

        @objid ("850a5b4a-c3e4-4404-ba0d-d0b917062a96")
        public static SmAttribute getDirectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DirectionAtt;
        }

        @objid ("ce145ad2-f988-4276-a3c3-0d4c6ed3543e")
        public static SmDependency getProvidedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidedDep;
        }

        @objid ("8336b4a8-8045-4158-adcc-4ae5e27cf038")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("72524aa7-1054-4944-a40e-ac611bd20706")
        public static SmAttribute getIsConjugatedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsConjugatedAtt;
        }

        @objid ("a154ab15-082b-4675-88d6-75eeaa2ea7c6")
        public static SmAttribute getIsBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsBehaviorAtt;
        }

        @objid ("d13fde77-9a15-4f38-98e5-b5b78699a7df")
        public static SmAttribute getIsServiceAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsServiceAtt;
        }

        @objid ("d9922547-2c0b-4fda-abc4-db22dbad3826")
        public static SmDependency getRequiredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredDep;
        }

        @objid ("007f4734-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f8c219b9-3257-47aa-99b6-cba1ae691015")
            public ISmObjectData createData() {
                return new PortData();
            }

            @objid ("ddb00e7d-0262-40d9-8d7e-3e86ba565d66")
            public SmObjectImpl createImpl() {
                return new PortImpl();
            }

        }

        @objid ("007fa936-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsBehaviorSmAttribute extends SmAttribute {
            @objid ("f6389f36-2435-4040-b054-2f183a83ba77")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mIsBehavior;
            }

            @objid ("f3ccca64-f87b-4552-af21-0ae85dd3b65d")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mIsBehavior = value;
            }

        }

        @objid ("00800b6a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsServiceSmAttribute extends SmAttribute {
            @objid ("b2aaf151-d044-497f-8af9-1d23760d247f")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mIsService;
            }

            @objid ("f08aa1ee-bf06-4ff6-bab5-343ca800ff0c")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mIsService = value;
            }

        }

        @objid ("00806fec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsConjugatedSmAttribute extends SmAttribute {
            @objid ("057ee08d-f011-4628-a8c3-5122bec36dc0")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mIsConjugated;
            }

            @objid ("995d580c-26c6-4eec-be58-c1490f416cde")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mIsConjugated = value;
            }

        }

        @objid ("0080d41e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RequiredSmDependency extends SmMultipleDependency {
            @objid ("4c5337d6-4285-4911-8224-c2e50a991be8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PortData)data).mRequired != null)? ((PortData)data).mRequired:SmMultipleDependency.EMPTY;
            }

            @objid ("19dd2382-68b9-490b-b87a-6a70d8949cc2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PortData) data).mRequired = new ArrayList<>(initialCapacity);
                return ((PortData) data).mRequired;
            }

            @objid ("9de37757-bf0d-4aa3-882d-5432a5ca41e6")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.RequiringDep();
            }

        }

        @objid ("00813904-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProvidedSmDependency extends SmMultipleDependency {
            @objid ("bbee7530-5c3f-4a35-8e3f-9c96f6edc9fc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PortData)data).mProvided != null)? ((PortData)data).mProvided:SmMultipleDependency.EMPTY;
            }

            @objid ("dc895b61-665b-4a8d-a203-2704ec9328ec")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PortData) data).mProvided = new ArrayList<>(initialCapacity);
                return ((PortData) data).mProvided;
            }

            @objid ("9f47ffa8-0e6c-4c91-ac79-2857b628b840")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.ProvidingDep();
            }

        }

        @objid ("004dfbca-7950-1fe9-b4b9-001ec947cd2a")
        public static class DirectionSmAttribute extends SmAttribute {
            @objid ("7e0d1623-5d91-460d-a828-f7bc2ace2345")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mDirection;
            }

            @objid ("1f86eb90-1c06-42ad-a0cc-c7321913d6e8")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mDirection = value;
            }

        }

    }

}
