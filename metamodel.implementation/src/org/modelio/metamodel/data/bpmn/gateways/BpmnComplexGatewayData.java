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
    @objid ("a5b269a9-9fbf-47fb-a838-21bb2de74163")
    @SmaMetaAttribute(metaName="ActivationExpression", type=String.class, smAttributeClass=Metadata.ActivationExpressionSmAttribute.class)
     Object mActivationExpression = "";

    @objid ("0b0dfde3-b2f7-4993-9295-9230f1c1ddca")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("985ad741-3c15-4144-99c2-c6196c284547")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000bc408-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d1fa0de9-0b60-45d5-9bf7-a7294a051f6e")
        private static SmClass smClass = null;

        @objid ("15cd9b2f-0873-4b4f-95da-4fa3444fe1ff")
        private static SmAttribute ActivationExpressionAtt = null;

        @objid ("d3916167-fc10-4da6-9bf4-710389e8839f")
        private static SmDependency DefaultFlowDep = null;

        @objid ("7d4759f8-c10a-4d2c-93d6-7b0633f1e08a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnComplexGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5cb6246b-0846-468f-8ac3-e22980459457")
        public static SmAttribute ActivationExpressionAtt() {
            if (ActivationExpressionAtt == null) {
            	ActivationExpressionAtt = classof().getAttributeDef("ActivationExpression");
            }
            return ActivationExpressionAtt;
        }

        @objid ("0b2df21f-a5ff-46e8-bcc1-840effda3af8")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("8597c7b0-1574-437f-8c29-7fc1852e5097")
        public static SmAttribute getActivationExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActivationExpressionAtt;
        }

        @objid ("b9ec2b99-3ca6-492f-84b8-f878af89b145")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8c550cc9-2571-4a16-958c-9266a882cf09")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("000c053a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3e189be3-53f8-4d4d-8da5-432542dd570c")
            public ISmObjectData createData() {
                return new BpmnComplexGatewayData();
            }

            @objid ("656acab4-9d79-4011-be0c-1bcde16ca402")
            public SmObjectImpl createImpl() {
                return new BpmnComplexGatewayImpl();
            }

        }

        @objid ("000c66d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ActivationExpressionSmAttribute extends SmAttribute {
            @objid ("e109b8e9-520f-42e3-a473-3b0324e9c840")
            public Object getValue(ISmObjectData data) {
                return ((BpmnComplexGatewayData) data).mActivationExpression;
            }

            @objid ("c7f32172-0d52-4fab-abac-ff1d435aa42d")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnComplexGatewayData) data).mActivationExpression = value;
            }

        }

        @objid ("000cc8f8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("739ea197-a401-45ed-9c56-9f358beb5977")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnComplexGatewayData) data).mDefaultFlow;
            }

            @objid ("55309f9e-ddf5-4960-9658-dc1837850996")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnComplexGatewayData) data).mDefaultFlow = value;
            }

            @objid ("4fa32892-450b-4ef0-b4af-d4fcc614dbb3")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultOfComplexDep();
            }

        }

    }

}
