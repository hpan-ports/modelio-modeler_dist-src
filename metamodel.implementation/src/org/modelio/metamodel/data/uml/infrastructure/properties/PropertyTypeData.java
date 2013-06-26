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
    @objid ("6b961fb7-82bb-40cb-89fe-788d3be83d1f")
    @SmaMetaAttribute(metaName="BaseType", type=PropertyBaseType.class, smAttributeClass=Metadata.BaseTypeSmAttribute.class)
     Object mBaseType = PropertyBaseType.STRING;

    @objid ("4d2e8380-9208-48fc-a048-317ed13cdc0e")
    @SmaMetaAssociation(metaName="AnalystOwner", typeDataClass=PropertyContainerData.class, min=1, max=1, smAssociationClass=Metadata.AnalystOwnerSmDependency.class)
     SmObjectImpl mAnalystOwner;

    @objid ("8568be55-3094-4b3b-9dc6-9f818fd72c16")
    @SmaMetaAssociation(metaName="Typed", typeDataClass=PropertyDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.TypedSmDependency.class)
     List<SmObjectImpl> mTyped = null;

    @objid ("18b296a7-3fa1-469b-9dd6-a266edd84b4a")
    @SmaMetaAssociation(metaName="ModuleOwner", typeDataClass=ModuleComponentData.class, min=1, max=1, smAssociationClass=Metadata.ModuleOwnerSmDependency.class)
     SmObjectImpl mModuleOwner;

    @objid ("22c30150-7baf-478a-80f2-d79a021fc5e4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00499648-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("5e433992-3b98-4b3a-bbb2-46319fbd7a90")
        private static SmClass smClass = null;

        @objid ("a921aa24-918c-4dd8-882e-4823f5875e18")
        private static SmAttribute BaseTypeAtt = null;

        @objid ("f08a34dc-8974-4669-82e4-4dfaf55e82d4")
        private static SmDependency AnalystOwnerDep = null;

        @objid ("1b0929b3-e958-416a-bc92-9d83b383cf5c")
        private static SmDependency TypedDep = null;

        @objid ("728daeac-f2ca-42ed-9207-cf95a328112f")
        private static SmDependency ModuleOwnerDep = null;

        @objid ("a7ba8eed-a6ac-4d29-8efa-34ef2b74a560")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("79bf10f5-d08f-4ea0-b9ce-ed45cc9a8c14")
        public static SmAttribute BaseTypeAtt() {
            if (BaseTypeAtt == null) {
            	BaseTypeAtt = classof().getAttributeDef("BaseType");
            }
            return BaseTypeAtt;
        }

        @objid ("b7295740-2734-4e16-9fa6-4973c4fb2cc9")
        public static SmDependency AnalystOwnerDep() {
            if (AnalystOwnerDep == null) {
            	AnalystOwnerDep = classof().getDependencyDef("AnalystOwner");
            }
            return AnalystOwnerDep;
        }

        @objid ("61122ec1-b348-4958-bb58-f6d6e71ba980")
        public static SmDependency TypedDep() {
            if (TypedDep == null) {
            	TypedDep = classof().getDependencyDef("Typed");
            }
            return TypedDep;
        }

        @objid ("07a0fe45-aa1e-47ed-821d-f12b3ee843c7")
        public static SmDependency ModuleOwnerDep() {
            if (ModuleOwnerDep == null) {
            	ModuleOwnerDep = classof().getDependencyDef("ModuleOwner");
            }
            return ModuleOwnerDep;
        }

        @objid ("a62f89b8-6f3b-4f67-aca0-fe9ce31fcf5e")
        public static SmDependency getAnalystOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnalystOwnerDep;
        }

        @objid ("a4cddd68-1ffa-40a7-8bbb-e623a74c4b61")
        public static SmDependency getTypedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedDep;
        }

        @objid ("890db728-7018-497a-934b-bae95d400460")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("35adeaed-40df-4c35-97e1-8807225f8256")
        public static SmAttribute getBaseTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseTypeAtt;
        }

        @objid ("da4ead82-de43-4f93-9c82-f6efc2e6fefb")
        public static SmDependency getModuleOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModuleOwnerDep;
        }

        @objid ("0049f962-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("077d2ac9-b6df-47c6-b029-abf0b8a2a112")
            public ISmObjectData createData() {
                return new PropertyTypeData();
            }

            @objid ("37d042e8-8b49-4b3a-bc27-8c54e7b568aa")
            public SmObjectImpl createImpl() {
                return new PropertyTypeImpl();
            }

        }

        @objid ("004ad864-ec98-1098-b22e-001ec947cd2a")
        public static class TypedSmDependency extends SmMultipleDependency {
            @objid ("da729fe8-c95a-4e90-88de-10e01464aaea")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyTypeData)data).mTyped != null)? ((PropertyTypeData)data).mTyped:SmMultipleDependency.EMPTY;
            }

            @objid ("d3301ba1-14b6-4922-9ffb-2cea647315b4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyTypeData) data).mTyped = new ArrayList<>(initialCapacity);
                return ((PropertyTypeData) data).mTyped;
            }

            @objid ("06329e79-f204-41ff-99cf-27169b4a1132")
            @Override
            public SmDependency getSymetric() {
                return PropertyDefinitionData.Metadata.TypeDep();
            }

        }

        @objid ("099f04db-280e-11e2-b500-001ec947ccaf")
        public static class AnalystOwnerSmDependency extends SmSingleDependency {
            @objid ("891768b0-9d85-4062-8cdb-5c0f8ad10e9a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTypeData) data).mAnalystOwner;
            }

            @objid ("6d307e67-0691-4227-922b-a77d21587b36")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTypeData) data).mAnalystOwner = value;
            }

            @objid ("221c7371-ffac-4d5e-8052-f40a236b6e82")
            @Override
            public SmDependency getSymetric() {
                return PropertyContainerData.Metadata.DefinedTypeDep();
            }

        }

        @objid ("09a3c987-280e-11e2-b500-001ec947ccaf")
        public static class ModuleOwnerSmDependency extends SmSingleDependency {
            @objid ("c3d05ef3-1677-4534-9721-daba41b1af67")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTypeData) data).mModuleOwner;
            }

            @objid ("b2f6a641-fca4-44bd-84ff-40d3556ef9bf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTypeData) data).mModuleOwner = value;
            }

            @objid ("abe31736-96b1-4b0c-a51b-09ca00528dfa")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.DefinedPropertyTypeDep();
            }

        }

        @objid ("13c25e19-281f-11e2-bf07-001ec947ccaf")
        public static class BaseTypeSmAttribute extends SmAttribute {
            @objid ("afcf17df-0e6b-42d6-ba74-5ae53ac48658")
            public Object getValue(ISmObjectData data) {
                return ((PropertyTypeData) data).mBaseType;
            }

            @objid ("7d00953f-c243-438e-909b-cb51075c6530")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyTypeData) data).mBaseType = value;
            }

        }

    }

}
