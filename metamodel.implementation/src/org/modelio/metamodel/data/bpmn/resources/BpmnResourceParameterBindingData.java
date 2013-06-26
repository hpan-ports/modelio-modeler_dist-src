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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceRoleData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceParameterBindingImpl;
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

@objid ("000b8d44-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnResourceParameterBinding.class, factory=BpmnResourceParameterBindingData.Metadata.ObjectFactory.class)
public class BpmnResourceParameterBindingData extends BpmnBaseElementData {
    @objid ("d378d2da-8640-4fa1-83df-9baab886de50")
    @SmaMetaAttribute(metaName="Expression", type=String.class, smAttributeClass=Metadata.ExpressionSmAttribute.class)
     Object mExpression = "";

    @objid ("07633720-3038-4e73-8dc2-7b9ab7ce2c2d")
    @SmaMetaAssociation(metaName="ResourceRole", typeDataClass=BpmnResourceRoleData.class, min=1, max=1, smAssociationClass=Metadata.ResourceRoleSmDependency.class)
     SmObjectImpl mResourceRole;

    @objid ("062525d9-a319-4e7f-aeb2-8fd2b6e1a7a4")
    @SmaMetaAssociation(metaName="ParameterRef", typeDataClass=BpmnResourceParameterData.class, min=1, max=1, smAssociationClass=Metadata.ParameterRefSmDependency.class, partof = true)
     SmObjectImpl mParameterRef;

    @objid ("5c9bd276-e1f7-4f84-a39e-4b004a124d62")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0072dd3c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8b49a28e-885f-4a12-8b0a-d6dd60271952")
        private static SmClass smClass = null;

        @objid ("11174f92-0673-4bd5-af5f-f3db91e61da1")
        private static SmAttribute ExpressionAtt = null;

        @objid ("f3f2c1ac-3672-4290-86fe-1255a1f5a820")
        private static SmDependency ResourceRoleDep = null;

        @objid ("e0f14fb2-913a-421f-ba32-6255825efc76")
        private static SmDependency ParameterRefDep = null;

        @objid ("7ae3e285-74fd-49b5-9d43-6eb65494c08e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceParameterBindingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("84d5f457-551a-49d6-9bbd-bbe4616d73ad")
        public static SmAttribute ExpressionAtt() {
            if (ExpressionAtt == null) {
            	ExpressionAtt = classof().getAttributeDef("Expression");
            }
            return ExpressionAtt;
        }

        @objid ("ef4715f5-f177-41ad-876f-12f36d91bb02")
        public static SmDependency ResourceRoleDep() {
            if (ResourceRoleDep == null) {
            	ResourceRoleDep = classof().getDependencyDef("ResourceRole");
            }
            return ResourceRoleDep;
        }

        @objid ("933b8e7d-8167-4e72-8c22-9acd2e391f1c")
        public static SmDependency ParameterRefDep() {
            if (ParameterRefDep == null) {
            	ParameterRefDep = classof().getDependencyDef("ParameterRef");
            }
            return ParameterRefDep;
        }

        @objid ("2a0670ee-2ef0-4937-b0f9-11a660ffd845")
        public static SmDependency getResourceRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceRoleDep;
        }

        @objid ("2db034a3-0082-4dfc-81c6-59f9364a91d4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("64890007-0b87-4b75-a0ec-2c854f0bd3dd")
        public static SmDependency getParameterRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterRefDep;
        }

        @objid ("3fa29ce6-db05-4a61-829e-163dfb32b2ae")
        public static SmAttribute getExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExpressionAtt;
        }

        @objid ("00732f44-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7f47e5e6-3010-4bb8-b180-44ae8009267f")
            public ISmObjectData createData() {
                return new BpmnResourceParameterBindingData();
            }

            @objid ("b3b1bba9-1ceb-43ba-97e9-04d9830ab792")
            public SmObjectImpl createImpl() {
                return new BpmnResourceParameterBindingImpl();
            }

        }

        @objid ("0073a0e6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExpressionSmAttribute extends SmAttribute {
            @objid ("56d348db-4f96-412c-8be7-568a4c713c26")
            public Object getValue(ISmObjectData data) {
                return ((BpmnResourceParameterBindingData) data).mExpression;
            }

            @objid ("d41e5187-90f3-4300-8982-d5db9ad0893f")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnResourceParameterBindingData) data).mExpression = value;
            }

        }

        @objid ("00741530-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParameterRefSmDependency extends SmSingleDependency {
            @objid ("a6a77293-6431-49f5-ba56-c2bf7bdd28c8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterBindingData) data).mParameterRef;
            }

            @objid ("72027d9a-1648-4749-b7d8-25380052ade5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterBindingData) data).mParameterRef = value;
            }

            @objid ("abb2b8fa-ade2-41b3-941a-93f245c2f8d1")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterData.Metadata.ParameterBindingRefsDep();
            }

        }

        @objid ("00749af0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ResourceRoleSmDependency extends SmSingleDependency {
            @objid ("23168eba-957b-47b2-b047-9c93993f8a2e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterBindingData) data).mResourceRole;
            }

            @objid ("184e5130-cd4c-4f19-8881-6dfebb2d7358")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterBindingData) data).mResourceRole = value;
            }

            @objid ("622784b1-dddc-43b6-83ca-18d3b5fdfe92")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.ResourceParameterBindingDep();
            }

        }

    }

}
