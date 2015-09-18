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
    @objid ("e6f9c6c3-ce03-4171-9ae5-a629f0418583")
    @SmaMetaAssociation(metaName="ParameterSubstitution", typeDataClass=TemplateParameterSubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSubstitutionSmDependency.class, component = true)
     List<SmObjectImpl> mParameterSubstitution = null;

    @objid ("03e23d80-4d0b-4114-85e8-e8f0965c69de")
    @SmaMetaAssociation(metaName="BoundOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.BoundOperationSmDependency.class)
     SmObjectImpl mBoundOperation;

    @objid ("833e0144-e07e-4b14-b8e0-6ed479d706a5")
    @SmaMetaAssociation(metaName="InstanciatedTemplateOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.InstanciatedTemplateOperationSmDependency.class, partof = true)
     SmObjectImpl mInstanciatedTemplateOperation;

    @objid ("5e5c811a-fc32-4264-b06f-41453be5c230")
    @SmaMetaAssociation(metaName="InstanciatedTemplate", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.InstanciatedTemplateSmDependency.class, partof = true)
     SmObjectImpl mInstanciatedTemplate;

    @objid ("fedac1bc-c063-46bf-b172-c9f4a26337c9")
    @SmaMetaAssociation(metaName="BoundElement", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.BoundElementSmDependency.class)
     SmObjectImpl mBoundElement;

    @objid ("de900912-347b-4bab-aba9-f9db51ac7818")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006f23ae-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9ab36f32-641f-4aae-8e20-43bdc7bb55f1")
        private static SmClass smClass = null;

        @objid ("f6647312-e5fa-4827-a3f1-6763e9f4b97a")
        private static SmDependency ParameterSubstitutionDep = null;

        @objid ("9175aa8c-a72c-42cd-aa75-e3e8795c982d")
        private static SmDependency BoundOperationDep = null;

        @objid ("bf330139-5733-4707-a506-fe733dd12290")
        private static SmDependency InstanciatedTemplateOperationDep = null;

        @objid ("7004253e-a9f0-435c-8677-e8acca5c357a")
        private static SmDependency InstanciatedTemplateDep = null;

        @objid ("658105a3-5afa-43f0-9b36-4153e9cdd9e6")
        private static SmDependency BoundElementDep = null;

        @objid ("65977c97-e720-40d1-abf1-7a941d5fd62b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TemplateBindingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b0138add-9d34-4f12-826e-08090d6f54c0")
        public static SmDependency ParameterSubstitutionDep() {
            if (ParameterSubstitutionDep == null) {
            	ParameterSubstitutionDep = classof().getDependencyDef("ParameterSubstitution");
            }
            return ParameterSubstitutionDep;
        }

        @objid ("94339f62-69c0-455f-b18c-2c19029df5ac")
        public static SmDependency BoundOperationDep() {
            if (BoundOperationDep == null) {
            	BoundOperationDep = classof().getDependencyDef("BoundOperation");
            }
            return BoundOperationDep;
        }

        @objid ("a781e8a4-56e9-43e3-9eda-ebbf4ce91524")
        public static SmDependency InstanciatedTemplateOperationDep() {
            if (InstanciatedTemplateOperationDep == null) {
            	InstanciatedTemplateOperationDep = classof().getDependencyDef("InstanciatedTemplateOperation");
            }
            return InstanciatedTemplateOperationDep;
        }

        @objid ("3d900373-cec8-4f7a-ae6a-c1ac8d075a4f")
        public static SmDependency InstanciatedTemplateDep() {
            if (InstanciatedTemplateDep == null) {
            	InstanciatedTemplateDep = classof().getDependencyDef("InstanciatedTemplate");
            }
            return InstanciatedTemplateDep;
        }

        @objid ("c44a2ad1-d3f1-49bb-915f-d995e010f93b")
        public static SmDependency BoundElementDep() {
            if (BoundElementDep == null) {
            	BoundElementDep = classof().getDependencyDef("BoundElement");
            }
            return BoundElementDep;
        }

        @objid ("383aeb02-e83c-4ddd-85c6-c2b1243e8878")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c609479d-4611-457f-a533-2d6b3ffb483a")
        public static SmDependency getBoundElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BoundElementDep;
        }

        @objid ("b0fa27cb-ecde-4177-a65f-1d890c70bd1a")
        public static SmDependency getParameterSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterSubstitutionDep;
        }

        @objid ("e23c45a8-84e8-4746-b57b-d4a43ac4dd79")
        public static SmDependency getInstanciatedTemplateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatedTemplateDep;
        }

        @objid ("05cecb2b-7159-46a4-be30-45a8c85af124")
        public static SmDependency getBoundOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BoundOperationDep;
        }

        @objid ("a36cb460-f03e-4963-916f-af1b26af24f9")
        public static SmDependency getInstanciatedTemplateOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatedTemplateOperationDep;
        }

        @objid ("006f6300-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("15ef8a5b-7236-474e-ab44-3be57bd56351")
            public ISmObjectData createData() {
                return new TemplateBindingData();
            }

            @objid ("bb8c6e5e-c5a1-452d-95c8-92318a3a297a")
            public SmObjectImpl createImpl() {
                return new TemplateBindingImpl();
            }

        }

        @objid ("006fc516-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciatedTemplateSmDependency extends SmSingleDependency {
            @objid ("9eb1d035-4d6c-490e-aab3-62f9ae740be6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mInstanciatedTemplate;
            }

            @objid ("14b63c29-ee17-4059-862e-e97d3ca51075")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mInstanciatedTemplate = value;
            }

            @objid ("3c1edad6-033f-4278-8ea7-2b75e559058d")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.InstanciatingBindingDep();
            }

        }

        @objid ("007037c6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BoundElementSmDependency extends SmSingleDependency {
            @objid ("f4d4c0d3-de27-41ef-95a5-85c4674e1d3d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mBoundElement;
            }

            @objid ("ea8245e0-a3fe-45d4-91ca-7a6ca2281532")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mBoundElement = value;
            }

            @objid ("b5d99695-5af3-45d3-b97a-2bb2729fbcf8")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.TemplateInstanciationDep();
            }

        }

        @objid ("0070abac-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BoundOperationSmDependency extends SmSingleDependency {
            @objid ("c4374351-d255-40d7-a56d-19cfbdd8a4b4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mBoundOperation;
            }

            @objid ("8eba27ed-6cc4-426f-9a32-ec57e05aead3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mBoundOperation = value;
            }

            @objid ("7398f0f3-cff8-4135-9894-03512846efd7")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.TemplateInstanciationDep();
            }

        }

        @objid ("00712014-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciatedTemplateOperationSmDependency extends SmSingleDependency {
            @objid ("2f6d18e7-7045-421e-95f1-ff528b2ab489")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateBindingData) data).mInstanciatedTemplateOperation;
            }

            @objid ("c2480842-6b40-4f44-8c0a-6cc56a93bfe8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateBindingData) data).mInstanciatedTemplateOperation = value;
            }

            @objid ("b0c893d9-81b4-45be-a55b-c26f7b2dc54e")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.InstanciatingBindingDep();
            }

        }

        @objid ("0071959e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("d0143cfb-f7fd-47f0-bde6-1a5651c41dcc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TemplateBindingData)data).mParameterSubstitution != null)? ((TemplateBindingData)data).mParameterSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("9a6d18d3-feb4-47ee-a986-ed6696619395")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TemplateBindingData) data).mParameterSubstitution = new ArrayList<>(initialCapacity);
                return ((TemplateBindingData) data).mParameterSubstitution;
            }

            @objid ("c4876e4e-e0cf-4d8a-a299-905b7b61cdcc")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterSubstitutionData.Metadata.OwnerDep();
            }

        }

    }

}
