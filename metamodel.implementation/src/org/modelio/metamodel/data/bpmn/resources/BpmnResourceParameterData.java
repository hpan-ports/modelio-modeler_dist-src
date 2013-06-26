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
    @objid ("7e8b79d7-d4e8-4f76-ae74-1a58adacc8ca")
    @SmaMetaAttribute(metaName="IsRequired", type=Boolean.class, smAttributeClass=Metadata.IsRequiredSmAttribute.class)
     Object mIsRequired = false;

    @objid ("ee5e5414-0f4d-4df8-a279-4dd6451a41a0")
    @SmaMetaAssociation(metaName="Resource", typeDataClass=BpmnResourceData.class, min=1, max=1, smAssociationClass=Metadata.ResourceSmDependency.class)
     SmObjectImpl mResource;

    @objid ("2c602992-f51e-4c2c-964f-31e8dca6cbe0")
    @SmaMetaAssociation(metaName="Type", typeDataClass=BpmnItemDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("d81fa638-99c3-4d55-aecd-3f52eeadb815")
    @SmaMetaAssociation(metaName="ParameterBindingRefs", typeDataClass=BpmnResourceParameterBindingData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterBindingRefsSmDependency.class)
     List<SmObjectImpl> mParameterBindingRefs = null;

    @objid ("07c9da49-371a-4d07-95ce-9e99f85909a2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00160210-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f09d33f8-cb4b-46d6-a5b3-f60c443da67a")
        private static SmClass smClass = null;

        @objid ("980dc0e6-83c1-4fae-987c-cc717e532e9d")
        private static SmAttribute IsRequiredAtt = null;

        @objid ("98cd89d0-c248-4afa-8ec7-f42ce5283e3d")
        private static SmDependency ResourceDep = null;

        @objid ("810a4e95-514b-4461-862d-bd516872bb5a")
        private static SmDependency TypeDep = null;

        @objid ("82f3e86d-ae3c-4a76-8694-fa2b361f78ed")
        private static SmDependency ParameterBindingRefsDep = null;

        @objid ("26b31e8d-3b0e-42a7-aa33-c3eb30990598")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f79593b5-66aa-4298-b5e6-a7687730a61b")
        public static SmAttribute IsRequiredAtt() {
            if (IsRequiredAtt == null) {
            	IsRequiredAtt = classof().getAttributeDef("IsRequired");
            }
            return IsRequiredAtt;
        }

        @objid ("8d7405f6-ed0a-4373-9da0-7f34cd3e189a")
        public static SmDependency ResourceDep() {
            if (ResourceDep == null) {
            	ResourceDep = classof().getDependencyDef("Resource");
            }
            return ResourceDep;
        }

        @objid ("0e9789b0-caed-4add-9e3a-be3c82413d10")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("e2046f50-3b0e-471e-95b6-817138698802")
        public static SmDependency ParameterBindingRefsDep() {
            if (ParameterBindingRefsDep == null) {
            	ParameterBindingRefsDep = classof().getDependencyDef("ParameterBindingRefs");
            }
            return ParameterBindingRefsDep;
        }

        @objid ("8370ed26-c487-4be0-ba9c-64f1548bfad6")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("5df8ac65-269d-49ee-bf91-63440de2071d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7f6c6100-b5d1-42a9-92d4-eae71e929b43")
        public static SmAttribute getIsRequiredAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsRequiredAtt;
        }

        @objid ("3bac0416-5dd2-4c63-bcbd-732bd37d12d8")
        public static SmDependency getParameterBindingRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterBindingRefsDep;
        }

        @objid ("3a0ccf9e-9dcc-41f0-a4c7-606c94813a05")
        public static SmDependency getResourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceDep;
        }

        @objid ("00164a9a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c230d0fb-19ff-43ef-acd5-ecf07638664a")
            public ISmObjectData createData() {
                return new BpmnResourceParameterData();
            }

            @objid ("1ecfde36-7276-492d-98ac-d847ef68ad6e")
            public SmObjectImpl createImpl() {
                return new BpmnResourceParameterImpl();
            }

        }

        @objid ("0016ac60-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsRequiredSmAttribute extends SmAttribute {
            @objid ("9cb5437e-e5a9-4203-853d-623d3df764de")
            public Object getValue(ISmObjectData data) {
                return ((BpmnResourceParameterData) data).mIsRequired;
            }

            @objid ("05e53ac2-538e-4c82-a092-b7ee5c704f50")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnResourceParameterData) data).mIsRequired = value;
            }

        }

        @objid ("00170ee4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("dac8deee-7b10-4811-9b9f-0232ad9dc13d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterData) data).mType;
            }

            @objid ("c3f32234-8f6b-486d-9bb9-c64c4e450afe")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterData) data).mType = value;
            }

            @objid ("85f86a56-531e-4141-a1dd-2a2a214b9776")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.TypedResourceParameterDep();
            }

        }

        @objid ("00178a90-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ResourceSmDependency extends SmSingleDependency {
            @objid ("3951ed1a-c858-4c78-bf52-705d41b22e80")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterData) data).mResource;
            }

            @objid ("bee00433-eb46-451f-9402-8c4797025aaf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterData) data).mResource = value;
            }

            @objid ("341253bd-a5bf-49a1-be89-1a4034df2499")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceData.Metadata.ParameterDep();
            }

        }

        @objid ("00180d26-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParameterBindingRefsSmDependency extends SmMultipleDependency {
            @objid ("aaba933d-2a63-4831-b330-e95ec8e88ba9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceParameterData)data).mParameterBindingRefs != null)? ((BpmnResourceParameterData)data).mParameterBindingRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("f621f9cc-111c-417a-9e2a-6970be1ee070")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceParameterData) data).mParameterBindingRefs = new ArrayList<>(initialCapacity);
                return ((BpmnResourceParameterData) data).mParameterBindingRefs;
            }

            @objid ("af75bc78-d7c7-47b1-b78d-004ce25c9026")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterBindingData.Metadata.ParameterRefDep();
            }

        }

    }

}
