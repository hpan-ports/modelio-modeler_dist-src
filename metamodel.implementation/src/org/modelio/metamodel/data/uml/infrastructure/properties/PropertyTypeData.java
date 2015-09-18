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
package org.modelio.metamodel.data.uml.infrastructure.properties;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.analyst.PropertyContainerData;
import org.modelio.metamodel.data.mda.ModuleComponentData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTypeImpl;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyBaseType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
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

@objid ("006f8eac-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=PropertyType.class, factory=PropertyTypeData.Metadata.ObjectFactory.class, cmsnode=true)
public class PropertyTypeData extends ModelElementData {
    @objid ("66ddb7f0-b51d-42b3-a761-7dcfa9f31c07")
    @SmaMetaAttribute(metaName="BaseType", type=PropertyBaseType.class, smAttributeClass=Metadata.BaseTypeSmAttribute.class)
     Object mBaseType = PropertyBaseType.STRING;

    @objid ("bdc56613-b209-45c5-a40d-571876c30189")
    @SmaMetaAssociation(metaName="AnalystOwner", typeDataClass=PropertyContainerData.class, min=1, max=1, smAssociationClass=Metadata.AnalystOwnerSmDependency.class)
     SmObjectImpl mAnalystOwner;

    @objid ("ee9daa1b-f6ef-49be-bc05-dd76140df5c5")
    @SmaMetaAssociation(metaName="Typed", typeDataClass=PropertyDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.TypedSmDependency.class)
     List<SmObjectImpl> mTyped = null;

    @objid ("734b0e5c-a365-4da4-b924-847851b7d5c3")
    @SmaMetaAssociation(metaName="ModuleOwner", typeDataClass=ModuleComponentData.class, min=1, max=1, smAssociationClass=Metadata.ModuleOwnerSmDependency.class)
     SmObjectImpl mModuleOwner;

    @objid ("42df44c5-2756-4078-8ff2-b5076d6310ae")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00499648-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("06e3e2b3-6af0-4f68-ba2a-67cb6461a87f")
        private static SmClass smClass = null;

        @objid ("aa1e600c-6238-4417-ba66-cff2083e77ee")
        private static SmAttribute BaseTypeAtt = null;

        @objid ("d736cea4-87e1-4d4a-bdca-7aea2214e905")
        private static SmDependency AnalystOwnerDep = null;

        @objid ("092b2923-de79-40b9-ba9d-19aafce7a217")
        private static SmDependency TypedDep = null;

        @objid ("3b4335a7-b6fe-4106-acd4-3a58c857a152")
        private static SmDependency ModuleOwnerDep = null;

        @objid ("324954c0-478a-4adf-8272-b32687f8f824")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fc124e9d-c064-4924-8ce3-606831c2e7ab")
        public static SmAttribute BaseTypeAtt() {
            if (BaseTypeAtt == null) {
            	BaseTypeAtt = classof().getAttributeDef("BaseType");
            }
            return BaseTypeAtt;
        }

        @objid ("c543d290-f0ca-47ae-98c7-6d4718c51425")
        public static SmDependency AnalystOwnerDep() {
            if (AnalystOwnerDep == null) {
            	AnalystOwnerDep = classof().getDependencyDef("AnalystOwner");
            }
            return AnalystOwnerDep;
        }

        @objid ("8cc64c76-d7cf-4a7f-9c71-c6e165de75e2")
        public static SmDependency TypedDep() {
            if (TypedDep == null) {
            	TypedDep = classof().getDependencyDef("Typed");
            }
            return TypedDep;
        }

        @objid ("6a1aa3c8-d546-4f69-affe-9dae7ad96268")
        public static SmDependency ModuleOwnerDep() {
            if (ModuleOwnerDep == null) {
            	ModuleOwnerDep = classof().getDependencyDef("ModuleOwner");
            }
            return ModuleOwnerDep;
        }

        @objid ("e5b1b47b-1d98-4e39-8c35-9dbb1a1a650a")
        public static SmAttribute getBaseTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseTypeAtt;
        }

        @objid ("cd4a8306-57c3-4a13-8499-4f53543049c4")
        public static SmDependency getAnalystOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnalystOwnerDep;
        }

        @objid ("ab7b845d-4146-4c25-9ccc-80ee3f414588")
        public static SmDependency getTypedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedDep;
        }

        @objid ("9f3c1a99-9bff-4512-a9ad-c6c5f85664a8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("49315fc2-1ab9-4fe5-b0ab-c04ead5c129d")
        public static SmDependency getModuleOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModuleOwnerDep;
        }

        @objid ("0049f962-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dabffc6b-3981-4cc5-bf9b-2aca6a9e2c3c")
            public ISmObjectData createData() {
                return new PropertyTypeData();
            }

            @objid ("5e06f6a8-a6a2-40b6-9c8a-e769d035ca78")
            public SmObjectImpl createImpl() {
                return new PropertyTypeImpl();
            }

        }

        @objid ("004ad864-ec98-1098-b22e-001ec947cd2a")
        public static class TypedSmDependency extends SmMultipleDependency {
            @objid ("671b2dd1-8cea-48c3-8b63-719223d3a74c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyTypeData)data).mTyped != null)? ((PropertyTypeData)data).mTyped:SmMultipleDependency.EMPTY;
            }

            @objid ("316e8052-d986-491d-aa44-e9078c9298dd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyTypeData) data).mTyped = new ArrayList<>(initialCapacity);
                return ((PropertyTypeData) data).mTyped;
            }

            @objid ("fa455c2d-3cbe-4777-9e5a-e760a5450a89")
            @Override
            public SmDependency getSymetric() {
                return PropertyDefinitionData.Metadata.TypeDep();
            }

        }

        @objid ("099f04db-280e-11e2-b500-001ec947ccaf")
        public static class AnalystOwnerSmDependency extends SmSingleDependency {
            @objid ("83338405-6207-453e-84e1-ea03d0699465")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTypeData) data).mAnalystOwner;
            }

            @objid ("bfb74a8a-e5df-4a76-8c4b-7c0f46dcf70d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTypeData) data).mAnalystOwner = value;
            }

            @objid ("1ab04e27-bacb-40da-9b42-0df606379fdc")
            @Override
            public SmDependency getSymetric() {
                return PropertyContainerData.Metadata.DefinedTypeDep();
            }

        }

        @objid ("09a3c987-280e-11e2-b500-001ec947ccaf")
        public static class ModuleOwnerSmDependency extends SmSingleDependency {
            @objid ("f7980e94-a5f6-427d-befa-510a59ebc2d1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTypeData) data).mModuleOwner;
            }

            @objid ("29567402-7dc6-41ce-9afa-6d75d2fb54d0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTypeData) data).mModuleOwner = value;
            }

            @objid ("7cdeb25b-7304-482e-84b7-7623374f8aa0")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.DefinedPropertyTypeDep();
            }

        }

        @objid ("13c25e19-281f-11e2-bf07-001ec947ccaf")
        public static class BaseTypeSmAttribute extends SmAttribute {
            @objid ("2794b96b-18a1-4d62-9d0f-93ceca3a56eb")
            public Object getValue(ISmObjectData data) {
                return ((PropertyTypeData) data).mBaseType;
            }

            @objid ("382b2553-a272-4087-b11b-067373448816")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyTypeData) data).mBaseType = value;
            }

        }

    }

}
