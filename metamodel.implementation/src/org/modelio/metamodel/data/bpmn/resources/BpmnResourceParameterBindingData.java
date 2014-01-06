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
    @objid ("61d643fc-dc15-4fb9-8f02-7bb16754853d")
    @SmaMetaAttribute(metaName="Expression", type=String.class, smAttributeClass=Metadata.ExpressionSmAttribute.class)
     Object mExpression = "";

    @objid ("8e5b0dd7-7333-4703-a0d1-bb92ac1feb9e")
    @SmaMetaAssociation(metaName="ResourceRole", typeDataClass=BpmnResourceRoleData.class, min=1, max=1, smAssociationClass=Metadata.ResourceRoleSmDependency.class)
     SmObjectImpl mResourceRole;

    @objid ("e78a74da-82a3-4dbf-bd35-4cb7e7de7302")
    @SmaMetaAssociation(metaName="ParameterRef", typeDataClass=BpmnResourceParameterData.class, min=1, max=1, smAssociationClass=Metadata.ParameterRefSmDependency.class, partof = true)
     SmObjectImpl mParameterRef;

    @objid ("9801b81a-9467-4d15-90c9-85476a5696db")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0072dd3c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("81f65470-814b-4a2f-95b9-eaa7c9722428")
        private static SmClass smClass = null;

        @objid ("1e838ee4-9827-4ed9-b231-1b7c06769c5d")
        private static SmAttribute ExpressionAtt = null;

        @objid ("7daba3d3-934b-42b1-85e7-c3f36c648050")
        private static SmDependency ResourceRoleDep = null;

        @objid ("0fe1e7e8-0441-40c0-ae53-e43759590bb1")
        private static SmDependency ParameterRefDep = null;

        @objid ("3e3e1e7b-4fad-4efb-973a-78dbf0191983")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceParameterBindingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a122a7e4-dee8-4095-9188-fafd788042e6")
        public static SmAttribute ExpressionAtt() {
            if (ExpressionAtt == null) {
            	ExpressionAtt = classof().getAttributeDef("Expression");
            }
            return ExpressionAtt;
        }

        @objid ("725b28bc-9495-4fff-b27e-1c7352e8ac9f")
        public static SmDependency ResourceRoleDep() {
            if (ResourceRoleDep == null) {
            	ResourceRoleDep = classof().getDependencyDef("ResourceRole");
            }
            return ResourceRoleDep;
        }

        @objid ("0fe5675f-1052-459d-8b2d-740d451d51d1")
        public static SmDependency ParameterRefDep() {
            if (ParameterRefDep == null) {
            	ParameterRefDep = classof().getDependencyDef("ParameterRef");
            }
            return ParameterRefDep;
        }

        @objid ("a9525756-08e4-417f-81a3-d363e3ba1276")
        public static SmDependency getResourceRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceRoleDep;
        }

        @objid ("a8f14e5a-83e9-4229-a160-67d9c5e187e7")
        public static SmDependency getParameterRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterRefDep;
        }

        @objid ("07fab735-7594-40c7-b41e-2a09e3a92bad")
        public static SmAttribute getExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExpressionAtt;
        }

        @objid ("89ee7dea-890a-48e8-8bb3-9d036927e84f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00732f44-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ee061add-bca6-4125-b31f-9dfb9265eca5")
            public ISmObjectData createData() {
                return new BpmnResourceParameterBindingData();
            }

            @objid ("3936bd51-ce77-4fc6-8eca-6e633d4fd5ad")
            public SmObjectImpl createImpl() {
                return new BpmnResourceParameterBindingImpl();
            }

        }

        @objid ("0073a0e6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExpressionSmAttribute extends SmAttribute {
            @objid ("92926756-5465-4014-8578-676eaca73d4e")
            public Object getValue(ISmObjectData data) {
                return ((BpmnResourceParameterBindingData) data).mExpression;
            }

            @objid ("e3e2bc51-386f-43c5-8198-2b974b47f966")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnResourceParameterBindingData) data).mExpression = value;
            }

        }

        @objid ("00741530-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParameterRefSmDependency extends SmSingleDependency {
            @objid ("d294bbbd-fa6b-4eff-917c-d16a0517f6bd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterBindingData) data).mParameterRef;
            }

            @objid ("634a1db8-6d50-44fa-838d-80d83b9ed441")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterBindingData) data).mParameterRef = value;
            }

            @objid ("c26ba3df-a579-4ff3-a7af-2bf228a57e50")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterData.Metadata.ParameterBindingRefsDep();
            }

        }

        @objid ("00749af0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ResourceRoleSmDependency extends SmSingleDependency {
            @objid ("e93aaacf-3156-4079-b82d-6639d73c7202")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterBindingData) data).mResourceRole;
            }

            @objid ("58cdbf65-040b-4ea0-9cfa-1951aed030e1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterBindingData) data).mResourceRole = value;
            }

            @objid ("a64cd55d-07b2-4dd0-abd0-9939dba11416")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.ResourceParameterBindingDep();
            }

        }

    }

}
