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
package org.modelio.metamodel.data.bpmn.resources;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemDefinitionData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterBindingData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceParameterImpl;
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

@objid ("000a49ca-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnResourceParameter.class, factory=BpmnResourceParameterData.Metadata.ObjectFactory.class)
public class BpmnResourceParameterData extends BpmnBaseElementData {
    @objid ("9e335fc6-8998-4478-910a-6c145e116582")
    @SmaMetaAttribute(metaName="IsRequired", type=Boolean.class, smAttributeClass=Metadata.IsRequiredSmAttribute.class)
     Object mIsRequired = false;

    @objid ("c71220c1-1de7-42e1-902f-1df88fa05c73")
    @SmaMetaAssociation(metaName="Resource", typeDataClass=BpmnResourceData.class, min=1, max=1, smAssociationClass=Metadata.ResourceSmDependency.class)
     SmObjectImpl mResource;

    @objid ("99f186a7-998e-468a-9d4f-bbbc65b4496e")
    @SmaMetaAssociation(metaName="Type", typeDataClass=BpmnItemDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("95a6747e-4d3f-42db-8c02-2ff4f62da19d")
    @SmaMetaAssociation(metaName="ParameterBindingRefs", typeDataClass=BpmnResourceParameterBindingData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterBindingRefsSmDependency.class)
     List<SmObjectImpl> mParameterBindingRefs = null;

    @objid ("024a793e-94db-44d3-8866-7e6e822f0280")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00160210-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a1b0f826-b315-4f13-8b45-d804936bd827")
        private static SmClass smClass = null;

        @objid ("9899046e-0280-4be9-b797-f30413f31eb4")
        private static SmAttribute IsRequiredAtt = null;

        @objid ("95dbd52e-2978-49f2-8f3e-7e39189b2f1d")
        private static SmDependency ResourceDep = null;

        @objid ("cb4850b3-39ce-4647-bc10-5fd765485982")
        private static SmDependency TypeDep = null;

        @objid ("ae5fed67-5cac-4bbb-b4fd-6beace06f8a4")
        private static SmDependency ParameterBindingRefsDep = null;

        @objid ("47d0f15a-4dfb-4d85-bf8e-b178c24a1187")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dc1366c6-6bec-4339-89e4-a9e42f3034ca")
        public static SmAttribute IsRequiredAtt() {
            if (IsRequiredAtt == null) {
            	IsRequiredAtt = classof().getAttributeDef("IsRequired");
            }
            return IsRequiredAtt;
        }

        @objid ("0a0c1365-f1e9-496a-bb9a-871e4ffef4b9")
        public static SmDependency ResourceDep() {
            if (ResourceDep == null) {
            	ResourceDep = classof().getDependencyDef("Resource");
            }
            return ResourceDep;
        }

        @objid ("cdea1c22-83e2-4f5c-b34d-81cc773cbfb8")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("a0f70dc4-24ed-4ca2-ba66-5ac9549568ba")
        public static SmDependency ParameterBindingRefsDep() {
            if (ParameterBindingRefsDep == null) {
            	ParameterBindingRefsDep = classof().getDependencyDef("ParameterBindingRefs");
            }
            return ParameterBindingRefsDep;
        }

        @objid ("ba03a5dd-b2e8-46c3-b59b-262c28f0c395")
        public static SmDependency getResourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceDep;
        }

        @objid ("9d0f9dc8-1859-43be-a1db-8656fba012ad")
        public static SmAttribute getIsRequiredAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsRequiredAtt;
        }

        @objid ("b79a1893-a7d8-4f03-a56d-3e7916c26189")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("233ec6fb-43f4-4d7c-aea5-870b4871a71b")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("5cf5113b-bd33-4bd3-bfc0-4eb64acbdb77")
        public static SmDependency getParameterBindingRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterBindingRefsDep;
        }

        @objid ("00164a9a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("68b34b99-2751-4ebc-8b83-aa569dbdf7ac")
            public ISmObjectData createData() {
                return new BpmnResourceParameterData();
            }

            @objid ("937f8824-19f8-4f8c-838a-74f2549b2d9f")
            public SmObjectImpl createImpl() {
                return new BpmnResourceParameterImpl();
            }

        }

        @objid ("0016ac60-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsRequiredSmAttribute extends SmAttribute {
            @objid ("97175969-a6ca-40d8-8cee-df6672aa4a9f")
            public Object getValue(ISmObjectData data) {
                return ((BpmnResourceParameterData) data).mIsRequired;
            }

            @objid ("523758de-e127-428d-a3f9-6024fdbcca5e")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnResourceParameterData) data).mIsRequired = value;
            }

        }

        @objid ("00170ee4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("77350bb6-8bda-4683-b36c-055be3bafd30")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterData) data).mType;
            }

            @objid ("28ca71c0-086b-4daa-834d-1791eadff898")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterData) data).mType = value;
            }

            @objid ("b222470b-9b4a-466f-aa8c-2de74a4a0c90")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.TypedResourceParameterDep();
            }

        }

        @objid ("00178a90-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ResourceSmDependency extends SmSingleDependency {
            @objid ("e04ff132-a81f-4c8f-b06d-c03548c3ec8f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterData) data).mResource;
            }

            @objid ("1bf03ae4-4aa0-4e4a-810d-6f312e9b4448")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterData) data).mResource = value;
            }

            @objid ("e33b1f4f-5e74-4370-b1db-1af19e0d58d2")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceData.Metadata.ParameterDep();
            }

        }

        @objid ("00180d26-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParameterBindingRefsSmDependency extends SmMultipleDependency {
            @objid ("ab9909a9-e82a-4cf4-be88-85289da8f889")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceParameterData)data).mParameterBindingRefs != null)? ((BpmnResourceParameterData)data).mParameterBindingRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("b8e735cb-e7c2-4491-874b-614854a9460e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceParameterData) data).mParameterBindingRefs = new ArrayList<>(initialCapacity);
                return ((BpmnResourceParameterData) data).mParameterBindingRefs;
            }

            @objid ("6e99bb91-4d1f-4eea-a68b-d06f97dd0029")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterBindingData.Metadata.ParameterRefDep();
            }

        }

    }

}
