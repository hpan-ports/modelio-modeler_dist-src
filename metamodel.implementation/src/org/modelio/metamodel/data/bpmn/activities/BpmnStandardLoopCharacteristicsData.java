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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnStandardLoopCharacteristics;
import org.modelio.metamodel.impl.bpmn.activities.BpmnStandardLoopCharacteristicsImpl;
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

@objid ("0083ff36-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnStandardLoopCharacteristics.class, factory=BpmnStandardLoopCharacteristicsData.Metadata.ObjectFactory.class)
public class BpmnStandardLoopCharacteristicsData extends BpmnLoopCharacteristicsData {
    @objid ("4334c4fd-d5b5-4168-9403-65c50655ada6")
    @SmaMetaAttribute(metaName="TestBefore", type=Boolean.class, smAttributeClass=Metadata.TestBeforeSmAttribute.class)
     Object mTestBefore = false;

    @objid ("18c0d350-1168-4add-9b1a-22153ea84276")
    @SmaMetaAttribute(metaName="LoopCondition", type=String.class, smAttributeClass=Metadata.LoopConditionSmAttribute.class)
     Object mLoopCondition = "";

    @objid ("cda60716-da3b-4929-989a-1dffb5bc02e9")
    @SmaMetaAttribute(metaName="LoopMaximum", type=String.class, smAttributeClass=Metadata.LoopMaximumSmAttribute.class)
     Object mLoopMaximum = "";

    @objid ("30a80266-2c18-4e2a-a353-3cf9139189d6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0058fc1e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e9791a28-8282-47c7-81e2-33c8ed7a1486")
        private static SmClass smClass = null;

        @objid ("27547cdb-eb81-4a68-bdaa-e3ff91036ab8")
        private static SmAttribute TestBeforeAtt = null;

        @objid ("138d8eec-de46-428d-9d77-7eab32306363")
        private static SmAttribute LoopConditionAtt = null;

        @objid ("44438447-ba2f-4848-b3b6-6b83e892b6ba")
        private static SmAttribute LoopMaximumAtt = null;

        @objid ("2fb5dfdc-69f7-461f-87dc-01aaf6d9f947")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnStandardLoopCharacteristicsData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2517bcd6-cd4b-48d6-a6b9-35285c40480d")
        public static SmAttribute TestBeforeAtt() {
            if (TestBeforeAtt == null) {
            	TestBeforeAtt = classof().getAttributeDef("TestBefore");
            }
            return TestBeforeAtt;
        }

        @objid ("6bd60902-a39e-4fc4-ad73-0e024aa9a484")
        public static SmAttribute LoopConditionAtt() {
            if (LoopConditionAtt == null) {
            	LoopConditionAtt = classof().getAttributeDef("LoopCondition");
            }
            return LoopConditionAtt;
        }

        @objid ("329d72da-00af-46fb-9e77-01b83b0cf126")
        public static SmAttribute LoopMaximumAtt() {
            if (LoopMaximumAtt == null) {
            	LoopMaximumAtt = classof().getAttributeDef("LoopMaximum");
            }
            return LoopMaximumAtt;
        }

        @objid ("c7712087-7a77-4ebc-8ef2-4f978a7ed08f")
        public static SmAttribute getLoopConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopConditionAtt;
        }

        @objid ("2ec24081-3ad3-468a-b681-f313b99a95e7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1a0c313b-4326-4604-a02d-c4ba0a166138")
        public static SmAttribute getLoopMaximumAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopMaximumAtt;
        }

        @objid ("67dbc4a2-64c2-4933-8b16-c01d6ff53e18")
        public static SmAttribute getTestBeforeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TestBeforeAtt;
        }

        @objid ("00593d82-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("79a88ec0-052d-49ab-9cf0-9a5f4561466d")
            public ISmObjectData createData() {
                return new BpmnStandardLoopCharacteristicsData();
            }

            @objid ("ca240455-52b0-4169-90a9-24e86d76436c")
            public SmObjectImpl createImpl() {
                return new BpmnStandardLoopCharacteristicsImpl();
            }

        }

        @objid ("00599e6c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TestBeforeSmAttribute extends SmAttribute {
            @objid ("055cb7e1-0c17-4c7b-b6be-cf021dac08dd")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStandardLoopCharacteristicsData) data).mTestBefore;
            }

            @objid ("361bfee0-bba1-4c9a-9c4a-ba0688ac9233")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStandardLoopCharacteristicsData) data).mTestBefore = value;
            }

        }

        @objid ("005a0a6e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LoopConditionSmAttribute extends SmAttribute {
            @objid ("438a887d-7302-46e0-9636-5f4c26709cc9")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStandardLoopCharacteristicsData) data).mLoopCondition;
            }

            @objid ("fe118fba-e4c7-4b21-8336-4b17bf9b7964")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStandardLoopCharacteristicsData) data).mLoopCondition = value;
            }

        }

        @objid ("005a6c3e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LoopMaximumSmAttribute extends SmAttribute {
            @objid ("14fd43e7-6bef-41a2-94f9-3dffb8189362")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStandardLoopCharacteristicsData) data).mLoopMaximum;
            }

            @objid ("61d8b63b-55d6-4190-acd6-1efc7b411a0a")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStandardLoopCharacteristicsData) data).mLoopMaximum = value;
            }

        }

    }

}
