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
    @objid ("c4827f3e-ae68-42ab-8bb4-933b53bc7b2d")
    @SmaMetaAttribute(metaName="Expression", type=String.class, smAttributeClass=Metadata.ExpressionSmAttribute.class)
     Object mExpression = "";

    @objid ("1a435642-f48c-41b5-93dc-a78291b74598")
    @SmaMetaAssociation(metaName="ResourceRole", typeDataClass=BpmnResourceRoleData.class, min=1, max=1, smAssociationClass=Metadata.ResourceRoleSmDependency.class)
     SmObjectImpl mResourceRole;

    @objid ("bc57a8ad-845f-4a1e-af6e-618046a6ecb0")
    @SmaMetaAssociation(metaName="ParameterRef", typeDataClass=BpmnResourceParameterData.class, min=1, max=1, smAssociationClass=Metadata.ParameterRefSmDependency.class, partof = true)
     SmObjectImpl mParameterRef;

    @objid ("0423ff49-b572-49e9-84ec-481724516f30")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0072dd3c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5893c588-f895-40c6-a800-14386fd0d8b4")
        private static SmClass smClass = null;

        @objid ("ecb1a811-e329-4e63-8ab4-101417a9e5e3")
        private static SmAttribute ExpressionAtt = null;

        @objid ("9dc43c46-2da8-456a-90bc-deea66661732")
        private static SmDependency ResourceRoleDep = null;

        @objid ("ab0a25e1-7d39-41ea-8eea-64521a566cd0")
        private static SmDependency ParameterRefDep = null;

        @objid ("16f3f6c4-17c6-4126-bb2f-81e6258dd107")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceParameterBindingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dea3e003-27d7-4770-a45e-cbd42cdee2c6")
        public static SmAttribute ExpressionAtt() {
            if (ExpressionAtt == null) {
            	ExpressionAtt = classof().getAttributeDef("Expression");
            }
            return ExpressionAtt;
        }

        @objid ("b1f4bc64-db0a-403d-afdd-3caa7687f205")
        public static SmDependency ResourceRoleDep() {
            if (ResourceRoleDep == null) {
            	ResourceRoleDep = classof().getDependencyDef("ResourceRole");
            }
            return ResourceRoleDep;
        }

        @objid ("c2b46a0c-084e-453d-ba63-dee7daecedd4")
        public static SmDependency ParameterRefDep() {
            if (ParameterRefDep == null) {
            	ParameterRefDep = classof().getDependencyDef("ParameterRef");
            }
            return ParameterRefDep;
        }

        @objid ("e0647b54-0f06-422f-b843-ad9a3af9a4e3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("576b8ca3-e18e-4299-a170-8e6bfa221d7e")
        public static SmDependency getParameterRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterRefDep;
        }

        @objid ("56be0c18-2515-4891-9dd2-af1ab3142748")
        public static SmAttribute getExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExpressionAtt;
        }

        @objid ("48c5f020-67fc-461d-86b9-a447f3830746")
        public static SmDependency getResourceRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceRoleDep;
        }

        @objid ("00732f44-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("35b294a0-5a06-4169-8a2f-179431081a1d")
            public ISmObjectData createData() {
                return new BpmnResourceParameterBindingData();
            }

            @objid ("540efd9a-3a15-4673-9f53-34ab653599c4")
            public SmObjectImpl createImpl() {
                return new BpmnResourceParameterBindingImpl();
            }

        }

        @objid ("0073a0e6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExpressionSmAttribute extends SmAttribute {
            @objid ("f50fed30-9b05-4b38-a2ca-065b25a501ef")
            public Object getValue(ISmObjectData data) {
                return ((BpmnResourceParameterBindingData) data).mExpression;
            }

            @objid ("4b09222c-7e2f-430f-9611-574c7e81be6c")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnResourceParameterBindingData) data).mExpression = value;
            }

        }

        @objid ("00741530-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParameterRefSmDependency extends SmSingleDependency {
            @objid ("d0bbb606-c320-4505-8f6f-6f21d176af77")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterBindingData) data).mParameterRef;
            }

            @objid ("8f70a0b5-4b87-4d56-93e4-a4e5627cdf96")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterBindingData) data).mParameterRef = value;
            }

            @objid ("6a066c92-c947-4545-b970-82a3669beb8a")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterData.Metadata.ParameterBindingRefsDep();
            }

        }

        @objid ("00749af0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ResourceRoleSmDependency extends SmSingleDependency {
            @objid ("35d0dbda-d0ff-44ff-82da-6484c224ace9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceParameterBindingData) data).mResourceRole;
            }

            @objid ("d98db8f0-5ebb-4503-924e-e185f30b4e5d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceParameterBindingData) data).mResourceRole = value;
            }

            @objid ("06666d9f-3785-43b0-83ac-75afc8584172")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.ResourceParameterBindingDep();
            }

        }

    }

}
