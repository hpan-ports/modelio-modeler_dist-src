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
    @objid ("c81a943d-1a25-4eda-a2e7-f3fbea988d33")
    @SmaMetaAttribute(metaName="ActivationExpression", type=String.class, smAttributeClass=Metadata.ActivationExpressionSmAttribute.class)
     Object mActivationExpression = "";

    @objid ("d69607ce-f552-4b79-931d-059ca55b04d2")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("66cafec3-34d9-427f-a466-a73292bd8566")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000bc408-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e58b90d6-4f57-43ea-bfe6-9c3b884801b6")
        private static SmClass smClass = null;

        @objid ("cc8c5423-c104-4fe1-b6e4-59a6571aa141")
        private static SmAttribute ActivationExpressionAtt = null;

        @objid ("c6cc0c1f-ab35-40d2-8c2c-5860aa094ed8")
        private static SmDependency DefaultFlowDep = null;

        @objid ("4367ea6d-cbaa-44e3-b02c-c876a23cddea")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnComplexGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8c2dd1d1-6901-4e84-b19f-3290c46b418a")
        public static SmAttribute ActivationExpressionAtt() {
            if (ActivationExpressionAtt == null) {
            	ActivationExpressionAtt = classof().getAttributeDef("ActivationExpression");
            }
            return ActivationExpressionAtt;
        }

        @objid ("2f095536-9235-4440-b108-61259a9a959d")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("b92f54fd-9f97-4752-aa82-d51841ea66e6")
        public static SmAttribute getActivationExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActivationExpressionAtt;
        }

        @objid ("73df36e4-ec28-40b8-91e8-f2ddd1c693c7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b5996d7e-5007-428c-a2cb-623d57719c51")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("000c053a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d3452ef4-786e-40c1-bfc4-dc33f736b32d")
            public ISmObjectData createData() {
                return new BpmnComplexGatewayData();
            }

            @objid ("f8117316-2f42-4687-9055-6f1a907f2859")
            public SmObjectImpl createImpl() {
                return new BpmnComplexGatewayImpl();
            }

        }

        @objid ("000c66d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ActivationExpressionSmAttribute extends SmAttribute {
            @objid ("79a8944d-0f51-443d-b6e8-eda52998e9bc")
            public Object getValue(ISmObjectData data) {
                return ((BpmnComplexGatewayData) data).mActivationExpression;
            }

            @objid ("b496aa05-78ba-4f88-b036-eae31b251c8a")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnComplexGatewayData) data).mActivationExpression = value;
            }

        }

        @objid ("000cc8f8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("05d2afe5-bf79-4280-ae31-7c953bbd69a1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnComplexGatewayData) data).mDefaultFlow;
            }

            @objid ("53b80038-05cf-45f3-b9f4-d097657cc239")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnComplexGatewayData) data).mDefaultFlow = value;
            }

            @objid ("3ed0fd16-3b1e-471a-b882-d8332847b9db")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultOfComplexDep();
            }

        }

    }

}
