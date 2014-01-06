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
    @objid ("67a8b28a-35ac-4456-9c7c-87d93b70d91d")
    @SmaMetaAttribute(metaName="TestBefore", type=Boolean.class, smAttributeClass=Metadata.TestBeforeSmAttribute.class)
     Object mTestBefore = false;

    @objid ("2e4e82ac-5fe6-417e-9a39-2db7f98995b5")
    @SmaMetaAttribute(metaName="LoopCondition", type=String.class, smAttributeClass=Metadata.LoopConditionSmAttribute.class)
     Object mLoopCondition = "";

    @objid ("8a91f84c-8dd9-4642-9796-08b81fdedc9e")
    @SmaMetaAttribute(metaName="LoopMaximum", type=String.class, smAttributeClass=Metadata.LoopMaximumSmAttribute.class)
     Object mLoopMaximum = "";

    @objid ("b69321d3-b402-4e41-a9e0-63e25a738f95")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0058fc1e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2c000dfd-de38-47d9-a119-659e4b453845")
        private static SmClass smClass = null;

        @objid ("10596fb9-f3d9-484d-8c28-64189c432451")
        private static SmAttribute TestBeforeAtt = null;

        @objid ("d4c325d6-d155-4f32-98fa-686cd6ea7c05")
        private static SmAttribute LoopConditionAtt = null;

        @objid ("653503b0-4bb7-4ec3-98c6-a51a55b2bb6d")
        private static SmAttribute LoopMaximumAtt = null;

        @objid ("779a46e5-aa42-4d4f-8f6a-096fce625183")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnStandardLoopCharacteristicsData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7d6f30f3-6c36-4f5d-9577-448583a674bb")
        public static SmAttribute TestBeforeAtt() {
            if (TestBeforeAtt == null) {
            	TestBeforeAtt = classof().getAttributeDef("TestBefore");
            }
            return TestBeforeAtt;
        }

        @objid ("52d80377-4e14-4f37-92c3-d61653424f2e")
        public static SmAttribute LoopConditionAtt() {
            if (LoopConditionAtt == null) {
            	LoopConditionAtt = classof().getAttributeDef("LoopCondition");
            }
            return LoopConditionAtt;
        }

        @objid ("31020b9d-1853-4182-9ab5-42dd94737dc2")
        public static SmAttribute LoopMaximumAtt() {
            if (LoopMaximumAtt == null) {
            	LoopMaximumAtt = classof().getAttributeDef("LoopMaximum");
            }
            return LoopMaximumAtt;
        }

        @objid ("ac065d7a-b6be-4f90-9a3b-e77caeb741c3")
        public static SmAttribute getLoopConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopConditionAtt;
        }

        @objid ("8a9cb2ba-8eb7-4a85-9d60-f8d1cd2073cf")
        public static SmAttribute getLoopMaximumAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopMaximumAtt;
        }

        @objid ("75be864d-4edb-4fe3-a488-35eafb6c40bc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f5a75bc2-62c6-4a4a-92f5-fc3adde6a7f1")
        public static SmAttribute getTestBeforeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TestBeforeAtt;
        }

        @objid ("00593d82-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("10570eaa-bbb4-42dd-829e-c7304a2f2d22")
            public ISmObjectData createData() {
                return new BpmnStandardLoopCharacteristicsData();
            }

            @objid ("dc44522c-bacd-4c28-8d1a-564838a65caa")
            public SmObjectImpl createImpl() {
                return new BpmnStandardLoopCharacteristicsImpl();
            }

        }

        @objid ("00599e6c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TestBeforeSmAttribute extends SmAttribute {
            @objid ("bdd3aae4-e4eb-4ee3-a7fd-72a7c3c987e1")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStandardLoopCharacteristicsData) data).mTestBefore;
            }

            @objid ("0c69f9a5-3b5e-4ff3-a92e-967c912e0587")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStandardLoopCharacteristicsData) data).mTestBefore = value;
            }

        }

        @objid ("005a0a6e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LoopConditionSmAttribute extends SmAttribute {
            @objid ("7b7b19ce-fc45-4f51-a474-2d85741b3919")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStandardLoopCharacteristicsData) data).mLoopCondition;
            }

            @objid ("8e9dd4ac-9bf1-4fab-8a1d-675a61325823")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStandardLoopCharacteristicsData) data).mLoopCondition = value;
            }

        }

        @objid ("005a6c3e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LoopMaximumSmAttribute extends SmAttribute {
            @objid ("b2b04ff0-b92f-4818-ad36-db6d789a3144")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStandardLoopCharacteristicsData) data).mLoopMaximum;
            }

            @objid ("293874e8-f4da-4421-a62f-d379114bd1fc")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStandardLoopCharacteristicsData) data).mLoopMaximum = value;
            }

        }

    }

}
