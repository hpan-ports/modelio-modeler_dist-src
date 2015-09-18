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
    @objid ("847ab679-f913-4564-a0f6-b80bc1ff779e")
    @SmaMetaAttribute(metaName="TestBefore", type=Boolean.class, smAttributeClass=Metadata.TestBeforeSmAttribute.class)
     Object mTestBefore = false;

    @objid ("2dbb404a-7bc3-4d13-8670-e3d2e784b995")
    @SmaMetaAttribute(metaName="LoopCondition", type=String.class, smAttributeClass=Metadata.LoopConditionSmAttribute.class)
     Object mLoopCondition = "";

    @objid ("4e67551f-d308-4baf-b676-4d003cb05be4")
    @SmaMetaAttribute(metaName="LoopMaximum", type=String.class, smAttributeClass=Metadata.LoopMaximumSmAttribute.class)
     Object mLoopMaximum = "";

    @objid ("8a94d5f2-5259-4606-89a4-ff3ed7b64e6b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0058fc1e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("276c3995-ab94-4d59-8f3f-df7096e64bc7")
        private static SmClass smClass = null;

        @objid ("b257be73-5464-4dc8-bf47-9b75a74bc270")
        private static SmAttribute TestBeforeAtt = null;

        @objid ("a2b8eec1-1a75-4f72-bfb9-9647ba0ef39e")
        private static SmAttribute LoopConditionAtt = null;

        @objid ("242fb0a2-4274-4dad-8d3d-447fb0d5078f")
        private static SmAttribute LoopMaximumAtt = null;

        @objid ("74539462-6fa6-4490-8049-05ce7e3d9484")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnStandardLoopCharacteristicsData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fd21c501-322f-41c7-ab82-9cd9bd7d4179")
        public static SmAttribute TestBeforeAtt() {
            if (TestBeforeAtt == null) {
            	TestBeforeAtt = classof().getAttributeDef("TestBefore");
            }
            return TestBeforeAtt;
        }

        @objid ("852b6c27-f7e1-4818-8f53-b236162986cf")
        public static SmAttribute LoopConditionAtt() {
            if (LoopConditionAtt == null) {
            	LoopConditionAtt = classof().getAttributeDef("LoopCondition");
            }
            return LoopConditionAtt;
        }

        @objid ("af17ad86-5245-4214-8b2c-2940e57fea05")
        public static SmAttribute LoopMaximumAtt() {
            if (LoopMaximumAtt == null) {
            	LoopMaximumAtt = classof().getAttributeDef("LoopMaximum");
            }
            return LoopMaximumAtt;
        }

        @objid ("57260e07-f1e3-4ea7-958c-6b90a7dbd42e")
        public static SmAttribute getLoopMaximumAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopMaximumAtt;
        }

        @objid ("f11f5eb2-3de3-4bfc-828a-193a05371276")
        public static SmAttribute getTestBeforeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TestBeforeAtt;
        }

        @objid ("ade38f6a-d216-417c-9ce1-428f02209034")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ea6a7a99-b16c-4ffc-a388-e3c048a7afd1")
        public static SmAttribute getLoopConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopConditionAtt;
        }

        @objid ("00593d82-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1142f22b-8615-4f54-9dd7-0351803919e2")
            public ISmObjectData createData() {
                return new BpmnStandardLoopCharacteristicsData();
            }

            @objid ("04e995db-6f39-4187-a5c9-a849adea94af")
            public SmObjectImpl createImpl() {
                return new BpmnStandardLoopCharacteristicsImpl();
            }

        }

        @objid ("00599e6c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TestBeforeSmAttribute extends SmAttribute {
            @objid ("bea59d45-0385-44d6-b9d9-5e7dbf8d616d")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStandardLoopCharacteristicsData) data).mTestBefore;
            }

            @objid ("04ab3ed6-82c7-46af-8e3b-6884e8fbe83e")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStandardLoopCharacteristicsData) data).mTestBefore = value;
            }

        }

        @objid ("005a0a6e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LoopConditionSmAttribute extends SmAttribute {
            @objid ("dd5b55be-c39e-48c0-b029-b3ea01a7010c")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStandardLoopCharacteristicsData) data).mLoopCondition;
            }

            @objid ("41f403cf-386a-4c6f-a998-45247a4c5233")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStandardLoopCharacteristicsData) data).mLoopCondition = value;
            }

        }

        @objid ("005a6c3e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LoopMaximumSmAttribute extends SmAttribute {
            @objid ("94437be9-55d8-4acf-b409-07d9ffb2bab9")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStandardLoopCharacteristicsData) data).mLoopMaximum;
            }

            @objid ("c37dc027-7362-4467-bbf4-fdf8eb5c2da7")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStandardLoopCharacteristicsData) data).mLoopMaximum = value;
            }

        }

    }

}
