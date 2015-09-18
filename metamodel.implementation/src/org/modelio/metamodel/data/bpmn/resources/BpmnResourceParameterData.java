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
    @objid ("e49d0126-a5b6-4768-932d-bc530a9549f9")
    @SmaMetaAttribute(metaName="IsRequired", type=Boolean.class, smAttributeClass=Metadata.IsRequiredSmAttribute.class)
     Object mIsRequired = false;

    @objid ("ee3ead7e-6a81-4f9d-9684-6cd3160f07d5")
    @SmaMetaAssociation(metaName="Resource", typeDataClass=BpmnResourceData.class, min=1, max=1, smAssociationClass=Metadata.ResourceSmDependency.class)
     SmObjectImpl mResource;

    @objid ("b7d847b9-e973-4946-8464-d533d9d63620")
    @SmaMetaAssociation(metaName="Type", typeDataClass=BpmnItemDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("14fbfc93-32e8-432b-830d-7a9be81400a5")
    @SmaMetaAssociation(metaName="ParameterBindingRefs", typeDataClass=BpmnResourceParameterBindingData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterBindingRefsSmDependency.class)
     List<SmObjectImpl> mParameterBindingRefs = null;

    @objid ("4c178c78-1a67-4604-b8d5-60b744a8ee60")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00160210-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6d7382af-2beb-44bd-843b-55122e4520ff")
        private static SmClass smClass = null;

        @objid ("f6d0102e-7cfb-4a55-91ba-32c5fe046b89")
        private static SmAttribute IsRequiredAtt = null;

        @objid ("a19eb24e-a1fe-4d34-8247-43760c277a41")
        private static SmDependency ResourceDep = null;

        @objid ("379452e2-63bc-432e-a592-75a9568f0e95")
        private static SmDependency TypeDep = null;

        @objid ("e58d78aa-540c-407e-bdc0-0b4a3a9ad4c0")
        private static SmDependency ParameterBindingRefsDep = null;

        @objid ("897532f3-93bd-4603-beae-769c0c50839b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("363edb0f-1a86-47b4-98f9-98f4c79843f3")
        public static SmAttribute IsRequiredAtt() {
            if (IsRequiredAtt == null) {
            	IsRequiredAtt = classof().getAttributeDef("IsRequired");
            }
            return IsRequiredAtt;
        }

        @objid ("8c14c97f-34fc-48ac-b976-e68f164b5fe1")
        public static SmDependency ResourceDep() {
            if (ResourceDep == null) {
            	ResourceDep = classof().getDependencyDef("Resource");
            }
            return ResourceDep;
        }

        @objid ("384feade-8520-4057-9139-557a24339334")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("5ff01cfe-0211-4304-ab28-c931e2e1ad22")
        public static SmDependency ParameterBindingRefsDep() {
            if (ParameterBindingRefsDep == null) {
            	ParameterBindingRefsDep = classof().getDependencyDef("ParameterBindingRefs");
            }
            return ParameterBindingRefsDep;
        }

        @objid ("dbb5f21a-af24-435f-87f9-b3b27661ddc3")
        public static SmDependency getParameterBindingRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterBindingRefsDep;
        }

        @objid ("9dcc0f40-c814-4730-857c-9ffedbdfa73d")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("71bf6e34-21e7-4b26-b86c-60c489064726")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5d71a5c1-4b09-4465-aabb-90a55076500c")
        public static SmDependency getResourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceDep;
        }

        @objid ("b13b7880-34a0-4b50-9c7e-2947a4da10e5")
        public static SmAttribute getIsRequiredAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsRequiredAtt;
        }

        @objid ("00164a9a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f171c7ab-1898-4785-a0dc-45907bab5259")
            public ISmObjectData createData() {
                return new BpmnResourceParameterData();
            }

            @objid ("e9d4b65d-8a03-4389-8761-1ec8781da4ea")
            public SmObjectImpl createImpl() {
                return new BpmnResourceParameterImpl();
            }

        }

        @objid ("0016ac60-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsRequiredSmAttribute extends SmAttribute {
            @objid ("afe653e3-e444-4ce6-ba90-ad6515bf3536")
            public Object getValue(ISmObjectData data) {
                return ((BpmnResourceParameterData) data).mIsRequired;
            }

            @objid ("d49b072e-1485-45a3-9e73-e7b441a56c85")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnResourceParameterData) data).mIsRequired = value;
            }

        }

        @objid ("00170ee4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("d53aa53a-c9c5-46af-8f54-71083e43f603")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterData) data).mType;
            }

            @objid ("2f5fd8ba-8b92-4c13-90e6-486ecb37d5fc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterData) data).mType = value;
            }

            @objid ("feebb0c7-7f31-49e2-97db-f70c4ce26d3c")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.TypedResourceParameterDep();
            }

        }

        @objid ("00178a90-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ResourceSmDependency extends SmSingleDependency {
            @objid ("cc55e969-564b-4fb9-b2d3-aef87eef70ab")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterData) data).mResource;
            }

            @objid ("2d9890d2-6ec2-4b6b-823d-b1b723e21e82")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterData) data).mResource = value;
            }

            @objid ("0350a8db-f60c-4b71-ad5e-951cb5e6c22f")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceData.Metadata.ParameterDep();
            }

        }

        @objid ("00180d26-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParameterBindingRefsSmDependency extends SmMultipleDependency {
            @objid ("42b9593e-6c52-46a9-a9d5-306f9b4e4045")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceParameterData)data).mParameterBindingRefs != null)? ((BpmnResourceParameterData)data).mParameterBindingRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("6401496b-cba7-4dfd-b72c-2a63fd7bc43c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceParameterData) data).mParameterBindingRefs = new ArrayList<>(initialCapacity);
                return ((BpmnResourceParameterData) data).mParameterBindingRefs;
            }

            @objid ("0e58a2cb-8ccf-4d44-9d47-0864f5e07702")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterBindingData.Metadata.ParameterRefDep();
            }

        }

    }

}
