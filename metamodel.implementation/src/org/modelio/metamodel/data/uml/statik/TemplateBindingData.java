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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterSubstitutionData;
import org.modelio.metamodel.impl.uml.statik.TemplateBindingImpl;
import org.modelio.metamodel.uml.statik.TemplateBinding;
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

@objid ("001cc6ae-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TemplateBinding.class, factory=TemplateBindingData.Metadata.ObjectFactory.class)
public class TemplateBindingData extends ModelElementData {
    @objid ("b385dde5-dfa6-460a-aaea-287cf22d91de")
    @SmaMetaAssociation(metaName="ParameterSubstitution", typeDataClass=TemplateParameterSubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSubstitutionSmDependency.class, component = true)
     List<SmObjectImpl> mParameterSubstitution = null;

    @objid ("ce02b4d2-3f53-4154-90d8-ba998e605be0")
    @SmaMetaAssociation(metaName="BoundOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.BoundOperationSmDependency.class)
     SmObjectImpl mBoundOperation;

    @objid ("8fd5fb87-85c4-434d-8dee-c49ed34aeddf")
    @SmaMetaAssociation(metaName="InstanciatedTemplateOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.InstanciatedTemplateOperationSmDependency.class, partof = true)
     SmObjectImpl mInstanciatedTemplateOperation;

    @objid ("2875a3d7-6af5-48ac-9d44-f42993c52119")
    @SmaMetaAssociation(metaName="InstanciatedTemplate", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.InstanciatedTemplateSmDependency.class, partof = true)
     SmObjectImpl mInstanciatedTemplate;

    @objid ("b4a7d281-6ed6-4580-a382-eaab8b674fb4")
    @SmaMetaAssociation(metaName="BoundElement", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.BoundElementSmDependency.class)
     SmObjectImpl mBoundElement;

    @objid ("026f4866-6b6e-4a39-a774-9a88a2565e6b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006f23ae-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("dfa9e621-0a00-4f32-beab-fbac1e93a282")
        private static SmClass smClass = null;

        @objid ("ea36274f-9994-48a7-afe1-dbf83ea258de")
        private static SmDependency ParameterSubstitutionDep = null;

        @objid ("b73799bd-240c-487b-b46a-852ca1356be9")
        private static SmDependency BoundOperationDep = null;

        @objid ("acb222a3-7de6-43dc-9b9a-39a8e31291f9")
        private static SmDependency InstanciatedTemplateOperationDep = null;

        @objid ("ba641acc-3534-4378-a366-3a3f18309c7c")
        private static SmDependency InstanciatedTemplateDep = null;

        @objid ("a9ee2e54-29b1-453c-bcf5-302ab2e4d00d")
        private static SmDependency BoundElementDep = null;

        @objid ("a5204313-14aa-4854-b2b8-c4115a76729b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TemplateBindingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("47c4ce14-95d7-4d73-a42b-8aa499f9ba4b")
        public static SmDependency ParameterSubstitutionDep() {
            if (ParameterSubstitutionDep == null) {
            	ParameterSubstitutionDep = classof().getDependencyDef("ParameterSubstitution");
            }
            return ParameterSubstitutionDep;
        }

        @objid ("59d72563-4ad5-4555-a0ce-70723e4ca128")
        public static SmDependency BoundOperationDep() {
            if (BoundOperationDep == null) {
            	BoundOperationDep = classof().getDependencyDef("BoundOperation");
            }
            return BoundOperationDep;
        }

        @objid ("5de07326-f03b-4bfa-8604-29243242a986")
        public static SmDependency InstanciatedTemplateOperationDep() {
            if (InstanciatedTemplateOperationDep == null) {
            	InstanciatedTemplateOperationDep = classof().getDependencyDef("InstanciatedTemplateOperation");
            }
            return InstanciatedTemplateOperationDep;
        }

        @objid ("11e115bd-8487-40ff-b4ed-2985823c1e5e")
        public static SmDependency InstanciatedTemplateDep() {
            if (InstanciatedTemplateDep == null) {
            	InstanciatedTemplateDep = classof().getDependencyDef("InstanciatedTemplate");
            }
            return InstanciatedTemplateDep;
        }

        @objid ("0bd3edc3-00b5-4224-95dd-6ea2693147be")
        public static SmDependency BoundElementDep() {
            if (BoundElementDep == null) {
            	BoundElementDep = classof().getDependencyDef("BoundElement");
            }
            return BoundElementDep;
        }

        @objid ("a88beaab-0e24-49c2-b96a-6c144ac86e21")
        public static SmDependency getInstanciatedTemplateOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatedTemplateOperationDep;
        }

        @objid ("f45d91f0-c895-4761-a38a-80a7bdb9f183")
        public static SmDependency getBoundElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BoundElementDep;
        }

        @objid ("4acbd506-eddf-4190-8011-9d5701433846")
        public static SmDependency getBoundOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BoundOperationDep;
        }

        @objid ("804f28db-fe74-47be-b983-e4d14095d691")
        public static SmDependency getInstanciatedTemplateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatedTemplateDep;
        }

        @objid ("90a52e6c-8fde-40a6-a6a0-e1dd04d0ff98")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f8d7686a-8664-4b3b-8ad8-305e0139d516")
        public static SmDependency getParameterSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterSubstitutionDep;
        }

        @objid ("006f6300-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("77aa5cdd-a3c9-43fa-8f0d-ffb3ab246374")
            public ISmObjectData createData() {
                return new TemplateBindingData();
            }

            @objid ("03effcbe-5f66-4a4d-a250-8331f008f71a")
            public SmObjectImpl createImpl() {
                return new TemplateBindingImpl();
            }

        }

        @objid ("006fc516-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciatedTemplateSmDependency extends SmSingleDependency {
            @objid ("3c25cac1-54b5-4663-9142-06a5e7a24ac7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mInstanciatedTemplate;
            }

            @objid ("3e73db61-5c8a-4df7-a4f9-1fa5a7467cf9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mInstanciatedTemplate = value;
            }

            @objid ("5250fdc5-ab24-43d0-955d-a5ff7afbb1da")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.InstanciatingBindingDep();
            }

        }

        @objid ("007037c6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BoundElementSmDependency extends SmSingleDependency {
            @objid ("2aa8cd11-92ab-4ecd-9d17-ed3ebc30fd32")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mBoundElement;
            }

            @objid ("a81862ec-1c49-4463-b30c-0317f0e5160b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mBoundElement = value;
            }

            @objid ("3b11ec39-47d9-49c0-bf0e-1d19b7d632a5")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.TemplateInstanciationDep();
            }

        }

        @objid ("0070abac-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BoundOperationSmDependency extends SmSingleDependency {
            @objid ("199aa609-6524-4998-9438-6704eaf94ae0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mBoundOperation;
            }

            @objid ("e8774f41-aea7-4354-8959-605447bb6de0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mBoundOperation = value;
            }

            @objid ("8c942efd-2e2b-4df7-af97-77135d95451d")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.TemplateInstanciationDep();
            }

        }

        @objid ("00712014-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciatedTemplateOperationSmDependency extends SmSingleDependency {
            @objid ("854c59a5-6fdb-4b4d-9f70-a5805ee5320f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mInstanciatedTemplateOperation;
            }

            @objid ("5cac38c3-f33b-40a8-9efa-b9aae5b1f22a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mInstanciatedTemplateOperation = value;
            }

            @objid ("4ffe9933-df1d-401c-a04f-d56d2d14d1aa")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.InstanciatingBindingDep();
            }

        }

        @objid ("0071959e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("c8ceee99-c690-4893-bbcf-d1b034b2db30")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TemplateBindingData)data).mParameterSubstitution != null)? ((TemplateBindingData)data).mParameterSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("c1f1f76b-3fb0-4c25-a4f3-bfe520e74469")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TemplateBindingData) data).mParameterSubstitution = new ArrayList<>(initialCapacity);
                return ((TemplateBindingData) data).mParameterSubstitution;
            }

            @objid ("3e8714eb-e457-4169-a505-509bcd9e62ab")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterSubstitutionData.Metadata.OwnerDep();
            }

        }

    }

}
