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
    @objid ("79f1873b-692a-493f-9aeb-5e7fe1a9c613")
    @SmaMetaAttribute(metaName="BaseType", type=PropertyBaseType.class, smAttributeClass=Metadata.BaseTypeSmAttribute.class)
     Object mBaseType = PropertyBaseType.STRING;

    @objid ("e6abf1a3-033c-4861-b600-3efe296c56d9")
    @SmaMetaAssociation(metaName="AnalystOwner", typeDataClass=PropertyContainerData.class, min=1, max=1, smAssociationClass=Metadata.AnalystOwnerSmDependency.class)
     SmObjectImpl mAnalystOwner;

    @objid ("044841c3-36b9-44b7-a9e7-df3ca080af82")
    @SmaMetaAssociation(metaName="Typed", typeDataClass=PropertyDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.TypedSmDependency.class)
     List<SmObjectImpl> mTyped = null;

    @objid ("51529b90-acc8-45fc-b10e-9b37c53a42a5")
    @SmaMetaAssociation(metaName="ModuleOwner", typeDataClass=ModuleComponentData.class, min=1, max=1, smAssociationClass=Metadata.ModuleOwnerSmDependency.class)
     SmObjectImpl mModuleOwner;

    @objid ("f0e435ba-3494-4685-aeaa-137698b4141c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00499648-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("0b38c82b-996b-439e-8e01-78326cf5139c")
        private static SmClass smClass = null;

        @objid ("7ca1099d-c55d-4cd7-bcf8-51b3d011766c")
        private static SmAttribute BaseTypeAtt = null;

        @objid ("0109178c-c2b4-4734-bf42-129201dd1ef8")
        private static SmDependency AnalystOwnerDep = null;

        @objid ("0722a167-aedf-4440-af7e-039b343cb06c")
        private static SmDependency TypedDep = null;

        @objid ("99885fcc-5ae0-4f5b-b7d4-c03a35b1e9fa")
        private static SmDependency ModuleOwnerDep = null;

        @objid ("1cec6980-90de-4909-95e7-e76a93670057")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("11e99aa8-d4af-4ed6-88a2-e80ba3ec81b0")
        public static SmAttribute BaseTypeAtt() {
            if (BaseTypeAtt == null) {
            	BaseTypeAtt = classof().getAttributeDef("BaseType");
            }
            return BaseTypeAtt;
        }

        @objid ("8e44b832-6c66-4b27-8098-41b86c7bd07b")
        public static SmDependency AnalystOwnerDep() {
            if (AnalystOwnerDep == null) {
            	AnalystOwnerDep = classof().getDependencyDef("AnalystOwner");
            }
            return AnalystOwnerDep;
        }

        @objid ("bed8c872-fce5-4e06-bcac-1c3ad2f1f969")
        public static SmDependency TypedDep() {
            if (TypedDep == null) {
            	TypedDep = classof().getDependencyDef("Typed");
            }
            return TypedDep;
        }

        @objid ("2bb6639e-c95f-4da3-96e0-29d10800ca49")
        public static SmDependency ModuleOwnerDep() {
            if (ModuleOwnerDep == null) {
            	ModuleOwnerDep = classof().getDependencyDef("ModuleOwner");
            }
            return ModuleOwnerDep;
        }

        @objid ("45d3e451-ff98-4496-a713-999ac3fce635")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("177546c9-e072-4a9a-b201-c5badd5775dc")
        public static SmDependency getAnalystOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnalystOwnerDep;
        }

        @objid ("e9a545a3-848f-4624-9bf3-30b3be98a663")
        public static SmAttribute getBaseTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseTypeAtt;
        }

        @objid ("6c4a7b5c-aabc-4228-bcec-57a710b2d652")
        public static SmDependency getModuleOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModuleOwnerDep;
        }

        @objid ("84e54fad-2d87-4b20-9907-8f0fb1a092a7")
        public static SmDependency getTypedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedDep;
        }

        @objid ("0049f962-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6ab9befe-fcb7-405a-b2fd-ca7cabf7c938")
            public ISmObjectData createData() {
                return new PropertyTypeData();
            }

            @objid ("9874fd51-db99-41ba-91a1-be7d09829028")
            public SmObjectImpl createImpl() {
                return new PropertyTypeImpl();
            }

        }

        @objid ("004ad864-ec98-1098-b22e-001ec947cd2a")
        public static class TypedSmDependency extends SmMultipleDependency {
            @objid ("458342ca-ec8d-480a-8e0e-0ea2d740b6a3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyTypeData)data).mTyped != null)? ((PropertyTypeData)data).mTyped:SmMultipleDependency.EMPTY;
            }

            @objid ("cb8aadcf-a40c-4212-9314-c913ffda3979")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyTypeData) data).mTyped = new ArrayList<>(initialCapacity);
                return ((PropertyTypeData) data).mTyped;
            }

            @objid ("e186011d-7a64-40c8-9d03-1adbdab23165")
            @Override
            public SmDependency getSymetric() {
                return PropertyDefinitionData.Metadata.TypeDep();
            }

        }

        @objid ("099f04db-280e-11e2-b500-001ec947ccaf")
        public static class AnalystOwnerSmDependency extends SmSingleDependency {
            @objid ("6b1fc0e6-1a7e-4054-808c-be7829b79a14")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTypeData) data).mAnalystOwner;
            }

            @objid ("b5ca9b81-d4ec-4d8f-8a09-b53ca2a9844e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTypeData) data).mAnalystOwner = value;
            }

            @objid ("4563bb75-8d82-4c26-9c66-ea2851420052")
            @Override
            public SmDependency getSymetric() {
                return PropertyContainerData.Metadata.DefinedTypeDep();
            }

        }

        @objid ("09a3c987-280e-11e2-b500-001ec947ccaf")
        public static class ModuleOwnerSmDependency extends SmSingleDependency {
            @objid ("d1de45fd-e6a9-4982-b632-de163db0757c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTypeData) data).mModuleOwner;
            }

            @objid ("011e3855-c3ff-49b6-8649-2c72f853c985")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTypeData) data).mModuleOwner = value;
            }

            @objid ("73054e0f-ebdd-4ad1-bb28-9d2ad6e2f510")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.DefinedPropertyTypeDep();
            }

        }

        @objid ("13c25e19-281f-11e2-bf07-001ec947ccaf")
        public static class BaseTypeSmAttribute extends SmAttribute {
            @objid ("683abb00-45b4-483e-928d-ee1f6826544d")
            public Object getValue(ISmObjectData data) {
                return ((PropertyTypeData) data).mBaseType;
            }

            @objid ("28f676e3-fa83-4d45-829f-69a172e4bff7")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyTypeData) data).mBaseType = value;
            }

        }

    }

}
