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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.mda.ModuleComponentData;
import org.modelio.metamodel.data.uml.infrastructure.MetaclassReferenceData;
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.data.uml.statik.PackageData;
import org.modelio.metamodel.impl.uml.infrastructure.ProfileImpl;
import org.modelio.metamodel.uml.infrastructure.Profile;
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

@objid ("008ce3b2-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Profile.class, factory=ProfileData.Metadata.ObjectFactory.class, cmsnode=true)
public class ProfileData extends PackageData {
    @objid ("361a941e-4e3a-4f7c-b12f-951208e9a65c")
    @SmaMetaAttribute(metaName="JCode", type=String.class, smAttributeClass=Metadata.JCodeSmAttribute.class)
     Object mJCode = "";

    @objid ("75582489-d326-4da7-af7f-78a325f9fb9f")
    @SmaMetaAssociation(metaName="DefinedStereotype", typeDataClass=StereotypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedStereotypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedStereotype = null;

    @objid ("ae6bea50-77f4-453c-b7a4-1d9675076bd1")
    @SmaMetaAssociation(metaName="OwnerModule", typeDataClass=ModuleComponentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerModuleSmDependency.class)
     SmObjectImpl mOwnerModule;

    @objid ("e55062a8-f038-4155-80cb-df9a49c80ade")
    @SmaMetaAssociation(metaName="OwnedReference", typeDataClass=MetaclassReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedReferenceSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedReference = null;

    @objid ("69b5289f-e5fd-4c75-bdf0-e922acd1c3bd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0073c670-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bcd6cc17-6ce9-4077-b0e9-e8f32a060847")
        private static SmClass smClass = null;

        @objid ("e1b432fc-c502-417d-9548-9a929d475606")
        private static SmAttribute JCodeAtt = null;

        @objid ("52aa6f36-b640-4c81-9618-999fed811c36")
        private static SmDependency DefinedStereotypeDep = null;

        @objid ("f9e04237-11ab-4a9a-bc6f-c96ba48804f4")
        private static SmDependency OwnerModuleDep = null;

        @objid ("81cf5330-8885-481b-b312-a8a216af07c0")
        private static SmDependency OwnedReferenceDep = null;

        @objid ("363cf48a-187b-493c-9d61-08dc41fee1f8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ProfileData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("99f61b12-d198-4cf6-8e50-11f49f5614d0")
        public static SmAttribute JCodeAtt() {
            if (JCodeAtt == null) {
            	JCodeAtt = classof().getAttributeDef("JCode");
            }
            return JCodeAtt;
        }

        @objid ("c9ab38a8-cafb-4799-a99a-b9bd572a262c")
        public static SmDependency DefinedStereotypeDep() {
            if (DefinedStereotypeDep == null) {
            	DefinedStereotypeDep = classof().getDependencyDef("DefinedStereotype");
            }
            return DefinedStereotypeDep;
        }

        @objid ("201df553-8772-4bd8-b2ae-ecfd66776723")
        public static SmDependency OwnerModuleDep() {
            if (OwnerModuleDep == null) {
            	OwnerModuleDep = classof().getDependencyDef("OwnerModule");
            }
            return OwnerModuleDep;
        }

        @objid ("68f284fb-74d5-442e-a646-3d0d1abed455")
        public static SmDependency OwnedReferenceDep() {
            if (OwnedReferenceDep == null) {
            	OwnedReferenceDep = classof().getDependencyDef("OwnedReference");
            }
            return OwnedReferenceDep;
        }

        @objid ("46b06e7c-49cc-45b9-a187-77b0fd59f42a")
        public static SmDependency getOwnerModuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerModuleDep;
        }

        @objid ("f5a19e46-a641-4332-907e-18cdc1d45cbf")
        public static SmDependency getDefinedStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedStereotypeDep;
        }

        @objid ("474b7b4b-9cd9-489d-8403-ab8dc389481e")
        public static SmAttribute getJCodeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return JCodeAtt;
        }

        @objid ("623fd5bf-f138-49f9-a3aa-167f23b48592")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8a192861-b053-47b1-872e-3d71277fabc5")
        public static SmDependency getOwnedReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedReferenceDep;
        }

        @objid ("007407ac-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("74f2f428-6351-4dc9-a15b-c06bf55b6979")
            public ISmObjectData createData() {
                return new ProfileData();
            }

            @objid ("adc2b19f-2941-43fc-8ace-ad547718a538")
            public SmObjectImpl createImpl() {
                return new ProfileImpl();
            }

        }

        @objid ("00746896-c4c2-1fd8-97fe-001ec947cd2a")
        public static class JCodeSmAttribute extends SmAttribute {
            @objid ("b776da98-1611-4fd6-933c-7c2d1401782c")
            public Object getValue(ISmObjectData data) {
                return ((ProfileData) data).mJCode;
            }

            @objid ("6a4420b6-b380-4193-89ab-2d0c4374ecd6")
            public void setValue(ISmObjectData data, Object value) {
                ((ProfileData) data).mJCode = value;
            }

        }

        @objid ("0074cb38-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerModuleSmDependency extends SmSingleDependency {
            @objid ("cd697d03-c123-4ecb-8183-9ee3ce11730c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProfileData) data).mOwnerModule;
            }

            @objid ("80bd7c9c-e21d-4605-8c5e-e24a6a021436")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProfileData) data).mOwnerModule = value;
            }

            @objid ("752e4a71-8c01-4319-a795-1e01e2c4d570")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.OwnedProfileDep();
            }

        }

        @objid ("00753f96-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedStereotypeSmDependency extends SmMultipleDependency {
            @objid ("4c32c7b6-77e2-44b5-9767-177759e9b2d3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProfileData)data).mDefinedStereotype != null)? ((ProfileData)data).mDefinedStereotype:SmMultipleDependency.EMPTY;
            }

            @objid ("1f29c771-40a5-4460-8952-32eed96c123e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProfileData) data).mDefinedStereotype = new ArrayList<>(initialCapacity);
                return ((ProfileData) data).mDefinedStereotype;
            }

            @objid ("7248e9bb-3b2a-41d9-bc63-14e7a9d7df11")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.OwnerDep();
            }

        }

        @objid ("0075a2e2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnedReferenceSmDependency extends SmMultipleDependency {
            @objid ("08fe5962-4de5-40d9-9f64-791aab4a009b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProfileData)data).mOwnedReference != null)? ((ProfileData)data).mOwnedReference:SmMultipleDependency.EMPTY;
            }

            @objid ("a269d15c-5672-40aa-8f86-6dbc6b57f9a3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProfileData) data).mOwnedReference = new ArrayList<>(initialCapacity);
                return ((ProfileData) data).mOwnedReference;
            }

            @objid ("9af911f0-8b7e-4589-a0c6-7d1b1326c8e4")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.OwnerProfileDep();
            }

        }

    }

}
