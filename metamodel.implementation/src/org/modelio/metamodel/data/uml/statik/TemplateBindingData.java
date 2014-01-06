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
    @objid ("ef133509-ec15-4786-a4f8-609d9115de96")
    @SmaMetaAssociation(metaName="ParameterSubstitution", typeDataClass=TemplateParameterSubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSubstitutionSmDependency.class, component = true)
     List<SmObjectImpl> mParameterSubstitution = null;

    @objid ("8fd72927-79f6-45b0-b20a-25641570d210")
    @SmaMetaAssociation(metaName="BoundOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.BoundOperationSmDependency.class)
     SmObjectImpl mBoundOperation;

    @objid ("94ccfb34-af43-429c-83b1-7f96096fa3ea")
    @SmaMetaAssociation(metaName="InstanciatedTemplateOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.InstanciatedTemplateOperationSmDependency.class, partof = true)
     SmObjectImpl mInstanciatedTemplateOperation;

    @objid ("4a7f7b97-65bc-41fc-99fa-1bbdba99f76e")
    @SmaMetaAssociation(metaName="InstanciatedTemplate", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.InstanciatedTemplateSmDependency.class, partof = true)
     SmObjectImpl mInstanciatedTemplate;

    @objid ("8caade2a-2d68-431f-9ec5-9b6850cd9c6b")
    @SmaMetaAssociation(metaName="BoundElement", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.BoundElementSmDependency.class)
     SmObjectImpl mBoundElement;

    @objid ("3fd02764-fd69-4134-bfa5-931fd6ce5d55")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006f23ae-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d5b04fb2-4d9d-4cf0-843b-3eeb48e5497a")
        private static SmClass smClass = null;

        @objid ("931aee63-c265-4837-9b33-5ae429cc3d2e")
        private static SmDependency ParameterSubstitutionDep = null;

        @objid ("cf10502c-47bc-43a7-a591-47a110b8a753")
        private static SmDependency BoundOperationDep = null;

        @objid ("af11bda1-6544-4d6a-a264-13fac8684ca3")
        private static SmDependency InstanciatedTemplateOperationDep = null;

        @objid ("0b37f281-9354-4351-8895-df2471c2d5cd")
        private static SmDependency InstanciatedTemplateDep = null;

        @objid ("dfe14e7e-d3a4-418d-9df7-6bae40ab65c7")
        private static SmDependency BoundElementDep = null;

        @objid ("87e9d9b7-bbfc-43ea-bdb9-df9930464d81")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TemplateBindingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2a49267b-1d79-4d27-8583-6beb69ac086f")
        public static SmDependency ParameterSubstitutionDep() {
            if (ParameterSubstitutionDep == null) {
            	ParameterSubstitutionDep = classof().getDependencyDef("ParameterSubstitution");
            }
            return ParameterSubstitutionDep;
        }

        @objid ("b6601af1-2768-4fea-bdc3-4922f70315f9")
        public static SmDependency BoundOperationDep() {
            if (BoundOperationDep == null) {
            	BoundOperationDep = classof().getDependencyDef("BoundOperation");
            }
            return BoundOperationDep;
        }

        @objid ("443558aa-4ab6-4068-85ce-29ca7f997c1a")
        public static SmDependency InstanciatedTemplateOperationDep() {
            if (InstanciatedTemplateOperationDep == null) {
            	InstanciatedTemplateOperationDep = classof().getDependencyDef("InstanciatedTemplateOperation");
            }
            return InstanciatedTemplateOperationDep;
        }

        @objid ("e49f266a-883f-4049-a22f-0ec6930c4945")
        public static SmDependency InstanciatedTemplateDep() {
            if (InstanciatedTemplateDep == null) {
            	InstanciatedTemplateDep = classof().getDependencyDef("InstanciatedTemplate");
            }
            return InstanciatedTemplateDep;
        }

        @objid ("b18af239-5fad-4a1f-a7b6-175b013ac555")
        public static SmDependency BoundElementDep() {
            if (BoundElementDep == null) {
            	BoundElementDep = classof().getDependencyDef("BoundElement");
            }
            return BoundElementDep;
        }

        @objid ("91642871-d6e8-4105-959c-decccc99e84e")
        public static SmDependency getParameterSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterSubstitutionDep;
        }

        @objid ("eaa9229e-9880-4567-b6a8-09f69872fec6")
        public static SmDependency getInstanciatedTemplateOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatedTemplateOperationDep;
        }

        @objid ("211b18de-ad99-4f89-998d-cc0d01f06f84")
        public static SmDependency getBoundElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BoundElementDep;
        }

        @objid ("1395d2c9-0625-4b3c-baaa-0dd12175edbb")
        public static SmDependency getBoundOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BoundOperationDep;
        }

        @objid ("a3a0d844-4792-4fa0-89fb-107a412ebba1")
        public static SmDependency getInstanciatedTemplateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatedTemplateDep;
        }

        @objid ("f00901d2-a79d-49f4-95ac-9aa5862864ef")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("006f6300-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6311cd1c-9035-4d77-89f0-fcc9f49d2ba8")
            public ISmObjectData createData() {
                return new TemplateBindingData();
            }

            @objid ("a0c1d44d-9335-4236-9787-fbe064af4e0e")
            public SmObjectImpl createImpl() {
                return new TemplateBindingImpl();
            }

        }

        @objid ("006fc516-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciatedTemplateSmDependency extends SmSingleDependency {
            @objid ("640a0bea-2705-4521-a3a8-be1e191ba802")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mInstanciatedTemplate;
            }

            @objid ("f5fe2c28-e5da-4afa-b4cc-551074f14d71")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mInstanciatedTemplate = value;
            }

            @objid ("e6284601-fb50-4cb3-9024-2bf74f525920")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.InstanciatingBindingDep();
            }

        }

        @objid ("007037c6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BoundElementSmDependency extends SmSingleDependency {
            @objid ("6c98cf3a-adfe-417f-8e72-c1aa4e8ee5be")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mBoundElement;
            }

            @objid ("100a75e0-3f6d-4992-baf7-b64aa488bbf8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mBoundElement = value;
            }

            @objid ("27a8cab3-6eb8-4754-87f8-4fb008aed600")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.TemplateInstanciationDep();
            }

        }

        @objid ("0070abac-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BoundOperationSmDependency extends SmSingleDependency {
            @objid ("c920f997-261b-4d7b-9033-836be17e7a9a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mBoundOperation;
            }

            @objid ("d0ac8068-6dae-4a97-82d0-8126c5a92c65")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mBoundOperation = value;
            }

            @objid ("5f057749-9f9d-43c7-ac59-26877f4f6fc2")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.TemplateInstanciationDep();
            }

        }

        @objid ("00712014-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciatedTemplateOperationSmDependency extends SmSingleDependency {
            @objid ("1f0e4ac4-585f-46cb-9393-48f420eda9a1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mInstanciatedTemplateOperation;
            }

            @objid ("f36ba847-9ff8-44d5-9dfe-4ad8b90eb883")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mInstanciatedTemplateOperation = value;
            }

            @objid ("c71dd47a-899a-4d0a-bcae-6b828026cbec")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.InstanciatingBindingDep();
            }

        }

        @objid ("0071959e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("fbcc6b88-f30f-4b5f-ac7d-8041d7b87673")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TemplateBindingData)data).mParameterSubstitution != null)? ((TemplateBindingData)data).mParameterSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("10949109-b3fd-4a87-b060-5d3bd65deff8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TemplateBindingData) data).mParameterSubstitution = new ArrayList<>(initialCapacity);
                return ((TemplateBindingData) data).mParameterSubstitution;
            }

            @objid ("d3f24019-ec0e-48e6-8d8b-58f99ae85cbf")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterSubstitutionData.Metadata.OwnerDep();
            }

        }

    }

}
