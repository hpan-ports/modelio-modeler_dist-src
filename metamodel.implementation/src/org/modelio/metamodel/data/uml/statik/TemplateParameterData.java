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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterSubstitutionData;
import org.modelio.metamodel.impl.uml.statik.TemplateParameterImpl;
import org.modelio.metamodel.uml.statik.TemplateParameter;
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

@objid ("001da934-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TemplateParameter.class, factory=TemplateParameterData.Metadata.ObjectFactory.class)
public class TemplateParameterData extends GeneralClassData {
    @objid ("3539a965-f217-463b-8646-360563a29d88")
    @SmaMetaAttribute(metaName="DefaultValue", type=String.class, smAttributeClass=Metadata.DefaultValueSmAttribute.class)
     Object mDefaultValue = "";

    @objid ("9fb631f5-1f49-45b4-9bdf-fefe76e4582e")
    @SmaMetaAttribute(metaName="IsValueParameter", type=Boolean.class, smAttributeClass=Metadata.IsValueParameterSmAttribute.class)
     Object mIsValueParameter = false;

    @objid ("25ed1fba-d33b-4789-889a-535960a97609")
    @SmaMetaAssociation(metaName="ParameterSubstitution", typeDataClass=TemplateParameterSubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSubstitutionSmDependency.class, istodelete = true)
     List<SmObjectImpl> mParameterSubstitution = null;

    @objid ("587e4e5a-e486-412d-8c13-92a9182622a0")
    @SmaMetaAssociation(metaName="Type", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("01c85a84-7881-4912-93eb-2ebf8662ea2c")
    @SmaMetaAssociation(metaName="Parameterized", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ParameterizedSmDependency.class)
     SmObjectImpl mParameterized;

    @objid ("6f247692-1fd5-4785-bb97-18401c18ff2a")
    @SmaMetaAssociation(metaName="OwnedParameterElement", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.OwnedParameterElementSmDependency.class, component = true)
     SmObjectImpl mOwnedParameterElement;

    @objid ("8da206bf-b0d9-4560-927e-c002bd598de6")
    @SmaMetaAssociation(metaName="DefaultType", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.DefaultTypeSmDependency.class, partof = true)
     SmObjectImpl mDefaultType;

    @objid ("88923789-e1e6-4a78-bafc-b8a6edcc763d")
    @SmaMetaAssociation(metaName="ParameterizedOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ParameterizedOperationSmDependency.class)
     SmObjectImpl mParameterizedOperation;

    @objid ("645920d9-ea62-4ea0-86db-c0331c1e7f5e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00343d02-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a841e0cb-2374-44ff-bb1a-2d57a5e4f04c")
        private static SmClass smClass = null;

        @objid ("fae36fb1-7a8f-410b-aadd-264a01a83998")
        private static SmAttribute DefaultValueAtt = null;

        @objid ("fe0eee69-01f0-4fbb-bba9-826efef37433")
        private static SmAttribute IsValueParameterAtt = null;

        @objid ("aaa2dcd1-10c1-42b7-9a83-9a0723d2f167")
        private static SmDependency ParameterSubstitutionDep = null;

        @objid ("abf6aa2b-8417-4198-8e64-622fdc301664")
        private static SmDependency TypeDep = null;

        @objid ("b3d1578b-75fd-47ed-b51c-df409522d635")
        private static SmDependency ParameterizedDep = null;

        @objid ("0d18a366-a088-454e-ace1-2d6b21c2805c")
        private static SmDependency OwnedParameterElementDep = null;

        @objid ("a37dcf21-9fc1-4d9a-9ec4-3a880f2cea32")
        private static SmDependency DefaultTypeDep = null;

        @objid ("c7693870-0dca-4bf7-8888-bffb2b6ad78f")
        private static SmDependency ParameterizedOperationDep = null;

        @objid ("0ff30f19-034b-46ce-8515-f063fc135fb5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TemplateParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ad673d12-a05c-42c4-beb9-d177f4f70683")
        public static SmAttribute DefaultValueAtt() {
            if (DefaultValueAtt == null) {
            	DefaultValueAtt = classof().getAttributeDef("DefaultValue");
            }
            return DefaultValueAtt;
        }

        @objid ("7c77c75c-66ac-4ad5-8cb2-3e4d453e8726")
        public static SmAttribute IsValueParameterAtt() {
            if (IsValueParameterAtt == null) {
            	IsValueParameterAtt = classof().getAttributeDef("IsValueParameter");
            }
            return IsValueParameterAtt;
        }

        @objid ("0d150617-fefe-44b3-a851-e95654a288c7")
        public static SmDependency ParameterSubstitutionDep() {
            if (ParameterSubstitutionDep == null) {
            	ParameterSubstitutionDep = classof().getDependencyDef("ParameterSubstitution");
            }
            return ParameterSubstitutionDep;
        }

        @objid ("e366ea93-e193-4a26-abdb-fc72b083f7f3")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("a0e375c6-9897-49bd-8314-d2451c0a0741")
        public static SmDependency ParameterizedDep() {
            if (ParameterizedDep == null) {
            	ParameterizedDep = classof().getDependencyDef("Parameterized");
            }
            return ParameterizedDep;
        }

        @objid ("667bc3fd-c3ef-4784-95cd-d58ed31a19e0")
        public static SmDependency OwnedParameterElementDep() {
            if (OwnedParameterElementDep == null) {
            	OwnedParameterElementDep = classof().getDependencyDef("OwnedParameterElement");
            }
            return OwnedParameterElementDep;
        }

        @objid ("d50f0505-4608-4e52-b646-b1a6541a8923")
        public static SmDependency DefaultTypeDep() {
            if (DefaultTypeDep == null) {
            	DefaultTypeDep = classof().getDependencyDef("DefaultType");
            }
            return DefaultTypeDep;
        }

        @objid ("75a59f19-0fd0-4320-87cd-5935fb343585")
        public static SmDependency ParameterizedOperationDep() {
            if (ParameterizedOperationDep == null) {
            	ParameterizedOperationDep = classof().getDependencyDef("ParameterizedOperation");
            }
            return ParameterizedOperationDep;
        }

        @objid ("5c17ec4e-508f-42c6-8ac6-f2f59864128e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("39df68bc-7d22-49b5-bd05-6800732d1eab")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("c2432ccc-2cae-4c51-a248-390ad3f9f84d")
        public static SmAttribute getDefaultValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultValueAtt;
        }

        @objid ("cea5d83f-d479-46d2-b8c2-c9852a028f9c")
        public static SmDependency getOwnedParameterElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedParameterElementDep;
        }

        @objid ("72ff5749-5489-4ec5-8d97-ecee863dad9a")
        public static SmAttribute getIsValueParameterAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsValueParameterAtt;
        }

        @objid ("22f749c7-75ac-40c4-938a-274493a3c068")
        public static SmDependency getParameterizedOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterizedOperationDep;
        }

        @objid ("814e8245-a34b-4b24-bb64-6d292b6ee7d7")
        public static SmDependency getParameterSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterSubstitutionDep;
        }

        @objid ("b018b788-74b6-49fc-83fd-02db0c05f9ec")
        public static SmDependency getParameterizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterizedDep;
        }

        @objid ("16c0e576-c0cf-4b21-adb2-5a687560ae0c")
        public static SmDependency getDefaultTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultTypeDep;
        }

        @objid ("00348046-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("735b3bc0-e295-4c3a-9258-d4c8951d242a")
            public ISmObjectData createData() {
                return new TemplateParameterData();
            }

            @objid ("c67e9ccd-6df0-40e2-a15d-1a54226235e8")
            public SmObjectImpl createImpl() {
                return new TemplateParameterImpl();
            }

        }

        @objid ("0034e27a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefaultValueSmAttribute extends SmAttribute {
            @objid ("f797a51b-c2e9-44eb-8479-443d81978d87")
            public Object getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mDefaultValue;
            }

            @objid ("f298daec-3f28-4ce5-8739-338feb61dcbc")
            public void setValue(ISmObjectData data, Object value) {
                ((TemplateParameterData) data).mDefaultValue = value;
            }

        }

        @objid ("00354332-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsValueParameterSmAttribute extends SmAttribute {
            @objid ("ca47723e-e4a9-4d4d-b7ef-2b9a790f6260")
            public Object getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mIsValueParameter;
            }

            @objid ("37a415c7-1309-4913-91ab-91fea7e84031")
            public void setValue(ISmObjectData data, Object value) {
                ((TemplateParameterData) data).mIsValueParameter = value;
            }

        }

        @objid ("0035a714-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterizedSmDependency extends SmSingleDependency {
            @objid ("0119e8a6-72d5-49e9-a409-55dfffa3fa0b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mParameterized;
            }

            @objid ("61433580-6faa-42ae-8dea-53e4c38c532e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mParameterized = value;
            }

            @objid ("8d1f6b0f-9b20-414b-ba5f-7d65c9d316ea")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.TemplateDep();
            }

        }

        @objid ("00361e4c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterizedOperationSmDependency extends SmSingleDependency {
            @objid ("c34c2cb0-74cb-489f-afa1-df6c8603b130")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mParameterizedOperation;
            }

            @objid ("3620711f-e5db-4655-a46c-43e0fd579c1d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mParameterizedOperation = value;
            }

            @objid ("a2994492-08d1-4e61-ad4a-40431f0e32a2")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.TemplateDep();
            }

        }

        @objid ("00369412-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("30093912-1096-4c62-bed1-e369de573996")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TemplateParameterData)data).mParameterSubstitution != null)? ((TemplateParameterData)data).mParameterSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("98f82d03-56a6-4649-8e92-d4b33cd6fa01")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TemplateParameterData) data).mParameterSubstitution = new ArrayList<>(initialCapacity);
                return ((TemplateParameterData) data).mParameterSubstitution;
            }

            @objid ("43c04d67-bce4-48ab-9274-f6dbaafb7827")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterSubstitutionData.Metadata.FormalParameterDep();
            }

        }

        @objid ("003701fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefaultTypeSmDependency extends SmSingleDependency {
            @objid ("9573b3ba-cb58-431d-a318-dec65c3abd97")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mDefaultType;
            }

            @objid ("6f0bc8b4-0d91-48cc-9f5e-d5e75070192a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mDefaultType = value;
            }

            @objid ("cc5b0d5e-b479-4309-b572-98010d5d6655")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DefaultParameteringDep();
            }

        }

        @objid ("003778dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedParameterElementSmDependency extends SmSingleDependency {
            @objid ("d3f975d2-437a-4402-b1b7-927345f1e53b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mOwnedParameterElement;
            }

            @objid ("cea33336-2ff6-4528-b29d-633ff1a73186")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mOwnedParameterElement = value;
            }

            @objid ("0b7c7d8d-e0c8-46ba-8ef6-fa5055497b8d")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.OwnerTemplateParameterDep();
            }

        }

        @objid ("0037efd8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("e82d7664-e46c-4111-a22d-0c0b185b38be")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mType;
            }

            @objid ("2554e94c-b8d6-4038-af44-0395fd426b38")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mType = value;
            }

            @objid ("8b6a9967-a686-4460-aeeb-970363a6fa1c")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.TypingParameterDep();
            }

        }

    }

}
