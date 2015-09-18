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
    @objid ("34118a2b-0606-46c1-b298-75a1f022ece7")
    @SmaMetaAttribute(metaName="DefaultValue", type=String.class, smAttributeClass=Metadata.DefaultValueSmAttribute.class)
     Object mDefaultValue = "";

    @objid ("f1840674-3c2c-4f3b-8af6-9f93d3550313")
    @SmaMetaAttribute(metaName="IsValueParameter", type=Boolean.class, smAttributeClass=Metadata.IsValueParameterSmAttribute.class)
     Object mIsValueParameter = false;

    @objid ("d5c2cab5-6f12-4736-b0d7-5e36555d7ef7")
    @SmaMetaAssociation(metaName="ParameterSubstitution", typeDataClass=TemplateParameterSubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSubstitutionSmDependency.class, istodelete = true)
     List<SmObjectImpl> mParameterSubstitution = null;

    @objid ("308ce007-58a5-4f07-adac-4cfc6cb17d7a")
    @SmaMetaAssociation(metaName="Type", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("aadf9a5d-fcbd-4689-af65-c9428d3a7cd3")
    @SmaMetaAssociation(metaName="Parameterized", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ParameterizedSmDependency.class)
     SmObjectImpl mParameterized;

    @objid ("56512471-391d-4fd7-bd4f-31e466d9db42")
    @SmaMetaAssociation(metaName="OwnedParameterElement", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.OwnedParameterElementSmDependency.class, component = true)
     SmObjectImpl mOwnedParameterElement;

    @objid ("d2863584-4001-470e-82fd-4cc1d449e38c")
    @SmaMetaAssociation(metaName="DefaultType", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.DefaultTypeSmDependency.class, partof = true)
     SmObjectImpl mDefaultType;

    @objid ("c22fc752-a217-4c36-887d-0a44ebca44a8")
    @SmaMetaAssociation(metaName="ParameterizedOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ParameterizedOperationSmDependency.class)
     SmObjectImpl mParameterizedOperation;

    @objid ("7918ae07-11e4-451d-8afc-fcdaa95932ba")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00343d02-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a2e11fd3-1eb4-4113-809a-9b7d82752573")
        private static SmClass smClass = null;

        @objid ("e17b9c9e-25e8-492a-9c4c-ba9bc61de4f2")
        private static SmAttribute DefaultValueAtt = null;

        @objid ("546c68de-8cdb-4f20-a800-3606fd79e82b")
        private static SmAttribute IsValueParameterAtt = null;

        @objid ("d2ff5b7c-b559-406e-8d4f-e2d942b3a712")
        private static SmDependency ParameterSubstitutionDep = null;

        @objid ("426154d5-dd16-4a68-ad11-b872fb7c3876")
        private static SmDependency TypeDep = null;

        @objid ("00dcfb7b-bec4-4e29-b268-98326bbe327f")
        private static SmDependency ParameterizedDep = null;

        @objid ("6738aa0f-5cbc-4e12-bd03-38cdd4adad98")
        private static SmDependency OwnedParameterElementDep = null;

        @objid ("6d450159-5b86-48c5-939e-957b63b1e230")
        private static SmDependency DefaultTypeDep = null;

        @objid ("46c82d29-5264-40d8-92f5-5aa9fd8ef022")
        private static SmDependency ParameterizedOperationDep = null;

        @objid ("7249d171-b1b3-4cf3-a7b8-a3317a125200")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TemplateParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("50abc888-d058-4cd8-ac84-5840130d9bb0")
        public static SmAttribute DefaultValueAtt() {
            if (DefaultValueAtt == null) {
            	DefaultValueAtt = classof().getAttributeDef("DefaultValue");
            }
            return DefaultValueAtt;
        }

        @objid ("64e4b374-d35e-4c8c-a45c-e450c50f7cc3")
        public static SmAttribute IsValueParameterAtt() {
            if (IsValueParameterAtt == null) {
            	IsValueParameterAtt = classof().getAttributeDef("IsValueParameter");
            }
            return IsValueParameterAtt;
        }

        @objid ("1ed5968e-f980-4817-8757-865662c13c25")
        public static SmDependency ParameterSubstitutionDep() {
            if (ParameterSubstitutionDep == null) {
            	ParameterSubstitutionDep = classof().getDependencyDef("ParameterSubstitution");
            }
            return ParameterSubstitutionDep;
        }

        @objid ("24e8be5b-145b-411f-8565-a9934b8cd416")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("44dfd823-b816-424b-a36d-dde31530f608")
        public static SmDependency ParameterizedDep() {
            if (ParameterizedDep == null) {
            	ParameterizedDep = classof().getDependencyDef("Parameterized");
            }
            return ParameterizedDep;
        }

        @objid ("f49477f6-921a-4f6e-808f-a9541f4c4879")
        public static SmDependency OwnedParameterElementDep() {
            if (OwnedParameterElementDep == null) {
            	OwnedParameterElementDep = classof().getDependencyDef("OwnedParameterElement");
            }
            return OwnedParameterElementDep;
        }

        @objid ("576b3eff-9c7d-42aa-ba17-4d5e28f4ba26")
        public static SmDependency DefaultTypeDep() {
            if (DefaultTypeDep == null) {
            	DefaultTypeDep = classof().getDependencyDef("DefaultType");
            }
            return DefaultTypeDep;
        }

        @objid ("6c9fc2e4-288d-4a44-8e29-ce6786af2def")
        public static SmDependency ParameterizedOperationDep() {
            if (ParameterizedOperationDep == null) {
            	ParameterizedOperationDep = classof().getDependencyDef("ParameterizedOperation");
            }
            return ParameterizedOperationDep;
        }

        @objid ("ca637fb4-d4a6-425f-a8b1-7131244a91ab")
        public static SmDependency getParameterizedOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterizedOperationDep;
        }

        @objid ("811a0c6e-150d-4c13-a0ef-2e9eb55ccaf0")
        public static SmDependency getOwnedParameterElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedParameterElementDep;
        }

        @objid ("ab3ef436-65e4-45c2-80a0-3a5bcdded62c")
        public static SmDependency getParameterizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterizedDep;
        }

        @objid ("b9414f52-84d7-410a-b928-594c8583f8d4")
        public static SmDependency getParameterSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterSubstitutionDep;
        }

        @objid ("8ea3bfb2-613f-4116-bc8c-fb0f762a7ef8")
        public static SmAttribute getDefaultValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultValueAtt;
        }

        @objid ("48925b81-3672-493d-aa12-06dc4a9f370f")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("f1931ede-dea5-40f0-8ad0-8c1ac8129315")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("eab3451a-00b5-47ad-b548-e118681c699e")
        public static SmDependency getDefaultTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultTypeDep;
        }

        @objid ("3ccb73d0-8ca5-494e-b136-4399313313f5")
        public static SmAttribute getIsValueParameterAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsValueParameterAtt;
        }

        @objid ("00348046-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("52ff84e7-fb28-4325-879b-0c182053e316")
            public ISmObjectData createData() {
                return new TemplateParameterData();
            }

            @objid ("d0bdc44d-b9ea-4c15-9779-22a9ec884402")
            public SmObjectImpl createImpl() {
                return new TemplateParameterImpl();
            }

        }

        @objid ("0034e27a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefaultValueSmAttribute extends SmAttribute {
            @objid ("2c8b9276-1951-44b2-87ae-2cde43b9347f")
            public Object getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mDefaultValue;
            }

            @objid ("efa186fa-3943-4b77-84c7-68cf2b624c01")
            public void setValue(ISmObjectData data, Object value) {
                ((TemplateParameterData) data).mDefaultValue = value;
            }

        }

        @objid ("00354332-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsValueParameterSmAttribute extends SmAttribute {
            @objid ("3de9b01f-2b90-409c-b36a-e3bd05f858c9")
            public Object getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mIsValueParameter;
            }

            @objid ("d259d0f3-157b-4090-b180-9c9452dac874")
            public void setValue(ISmObjectData data, Object value) {
                ((TemplateParameterData) data).mIsValueParameter = value;
            }

        }

        @objid ("0035a714-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterizedSmDependency extends SmSingleDependency {
            @objid ("0958d272-cc82-418c-9d26-46a23c63662d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mParameterized;
            }

            @objid ("17b03d2d-95a8-4d98-a8c2-33fd660e04ac")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mParameterized = value;
            }

            @objid ("15f440fa-9b84-4937-ae63-a8af018b43d9")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.TemplateDep();
            }

        }

        @objid ("00361e4c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterizedOperationSmDependency extends SmSingleDependency {
            @objid ("caf83053-8415-4109-a2f0-503c2eb0f070")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mParameterizedOperation;
            }

            @objid ("57bfcef2-5a0c-4b52-97e3-a3b43e6831bb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mParameterizedOperation = value;
            }

            @objid ("43db1c2f-9199-4a49-bcb4-332f3bbb01b1")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.TemplateDep();
            }

        }

        @objid ("00369412-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("29e44d29-9306-40e9-aeef-5a29353a2ba5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TemplateParameterData)data).mParameterSubstitution != null)? ((TemplateParameterData)data).mParameterSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("14dc1165-827c-4f51-8b25-334619c1c9fe")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TemplateParameterData) data).mParameterSubstitution = new ArrayList<>(initialCapacity);
                return ((TemplateParameterData) data).mParameterSubstitution;
            }

            @objid ("3d18e15e-75e0-4405-9143-9ba3ac451496")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterSubstitutionData.Metadata.FormalParameterDep();
            }

        }

        @objid ("003701fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefaultTypeSmDependency extends SmSingleDependency {
            @objid ("7fcaa0a2-d8fb-49d4-a3c1-92ae28e48525")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mDefaultType;
            }

            @objid ("c4710094-0cd7-454e-ace4-f7e2ff4edc6f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mDefaultType = value;
            }

            @objid ("b84e5419-a0c7-4305-85b6-c8d68d1851f8")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DefaultParameteringDep();
            }

        }

        @objid ("003778dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedParameterElementSmDependency extends SmSingleDependency {
            @objid ("76cc3820-009b-49fc-a75a-02a84ce755b9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mOwnedParameterElement;
            }

            @objid ("f98e32b5-94e0-4dc3-85f8-c5af104620ae")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mOwnedParameterElement = value;
            }

            @objid ("f69e7a22-df7d-456c-b085-9f9ac374bb6a")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.OwnerTemplateParameterDep();
            }

        }

        @objid ("0037efd8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("504f8413-8056-4401-b10c-b82eba079982")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mType;
            }

            @objid ("130878a8-50e9-4fb9-bae3-6df00944a1b8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mType = value;
            }

            @objid ("91c28a01-51f2-4ee9-be0c-6c96368a40fb")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.TypingParameterDep();
            }

        }

    }

}
