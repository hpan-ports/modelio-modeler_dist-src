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
package org.modelio.metamodel.data.bpmn.gateways;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.gateways.BpmnComplexGateway;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnComplexGatewayImpl;
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

@objid ("0097a93c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnComplexGateway.class, factory=BpmnComplexGatewayData.Metadata.ObjectFactory.class)
public class BpmnComplexGatewayData extends BpmnGatewayData {
    @objid ("d0b67fad-e8c4-442a-9a68-ac3db97cb538")
    @SmaMetaAttribute(metaName="ActivationExpression", type=String.class, smAttributeClass=Metadata.ActivationExpressionSmAttribute.class)
     Object mActivationExpression = "";

    @objid ("74967738-f2ac-488a-981a-7a71a0c529ef")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("ac68cb57-8363-4c66-83b7-5e3db7ce48ca")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000bc408-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("36120a64-6f5d-4695-99ce-94f9a03dd5a3")
        private static SmClass smClass = null;

        @objid ("1a931c99-08ce-469c-b8aa-7753063d442f")
        private static SmAttribute ActivationExpressionAtt = null;

        @objid ("415b8761-65da-4196-9683-eb2c6ed49e49")
        private static SmDependency DefaultFlowDep = null;

        @objid ("34c63ff0-c20c-4b69-bc34-f39b50e806c1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnComplexGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d309ff62-821d-4635-a5c5-9a3b8ae27bf2")
        public static SmAttribute ActivationExpressionAtt() {
            if (ActivationExpressionAtt == null) {
            	ActivationExpressionAtt = classof().getAttributeDef("ActivationExpression");
            }
            return ActivationExpressionAtt;
        }

        @objid ("b21e21b6-c021-451d-8861-f692e737c5ea")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("bf83f087-63d6-4012-848e-1a58d78e4e55")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6d7275de-354f-40d9-9f24-84a0e5fd2700")
        public static SmAttribute getActivationExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActivationExpressionAtt;
        }

        @objid ("5ffb8e90-dd82-41aa-94e2-62201f9af881")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("000c053a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c893e69b-b424-4743-b7ec-268de3d90155")
            public ISmObjectData createData() {
                return new BpmnComplexGatewayData();
            }

            @objid ("6cd53aee-23c4-4a7b-84d8-3062876a8394")
            public SmObjectImpl createImpl() {
                return new BpmnComplexGatewayImpl();
            }

        }

        @objid ("000c66d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ActivationExpressionSmAttribute extends SmAttribute {
            @objid ("e3f0bb38-2ddd-47f7-8e01-33721b9a812a")
            public Object getValue(ISmObjectData data) {
                return ((BpmnComplexGatewayData) data).mActivationExpression;
            }

            @objid ("76cbd06b-d2c6-4e6e-b8c3-258e5ac699da")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnComplexGatewayData) data).mActivationExpression = value;
            }

        }

        @objid ("000cc8f8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("907a9421-ffa3-42c6-b73f-e2c0d0a1a455")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnComplexGatewayData) data).mDefaultFlow;
            }

            @objid ("61547765-4845-45ab-a8ad-4935a9e57f01")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnComplexGatewayData) data).mDefaultFlow = value;
            }

            @objid ("0f2030cc-51f9-4704-b050-a5cc97ec2f0d")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultOfComplexDep();
            }

        }

    }

}
