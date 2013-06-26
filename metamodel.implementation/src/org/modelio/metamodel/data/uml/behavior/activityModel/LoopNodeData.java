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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.LoopNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.LoopNode;
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

@objid ("00379c9a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=LoopNode.class, factory=LoopNodeData.Metadata.ObjectFactory.class)
public class LoopNodeData extends StructuredActivityNodeData {
    @objid ("bb3b1442-69a9-43c8-b873-2cb54f9d5813")
    @SmaMetaAttribute(metaName="IsTestedFirst", type=Boolean.class, smAttributeClass=Metadata.IsTestedFirstSmAttribute.class)
     Object mIsTestedFirst = false;

    @objid ("a3de0a2a-f34f-4d49-a63b-53bc958afdd7")
    @SmaMetaAttribute(metaName="Setup", type=String.class, smAttributeClass=Metadata.SetupSmAttribute.class)
     Object mSetup = "";

    @objid ("75a469ba-b241-4516-b4b2-e29a1906df97")
    @SmaMetaAttribute(metaName="Test", type=String.class, smAttributeClass=Metadata.TestSmAttribute.class)
     Object mTest = "";

    @objid ("9431718d-d902-46a3-aec5-1efe6069690e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003bf510-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("69035546-d45b-4983-bda6-dd1650966fe3")
        private static SmClass smClass = null;

        @objid ("f367bcd8-6d4e-4f22-aabb-42341bf16211")
        private static SmAttribute IsTestedFirstAtt = null;

        @objid ("6f9b64d0-c399-4d03-9037-80b0f8b2436d")
        private static SmAttribute SetupAtt = null;

        @objid ("6b07d3c4-f0dc-476a-b976-6b7a67414128")
        private static SmAttribute TestAtt = null;

        @objid ("38a98e49-a5ea-49f3-b32d-7c38cbc52a21")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LoopNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cce2e409-b379-4e1b-8f16-1870f3c373c1")
        public static SmAttribute IsTestedFirstAtt() {
            if (IsTestedFirstAtt == null) {
            	IsTestedFirstAtt = classof().getAttributeDef("IsTestedFirst");
            }
            return IsTestedFirstAtt;
        }

        @objid ("bb0c7092-4b96-4d48-b613-14dc2363ff56")
        public static SmAttribute SetupAtt() {
            if (SetupAtt == null) {
            	SetupAtt = classof().getAttributeDef("Setup");
            }
            return SetupAtt;
        }

        @objid ("e8172949-2c6a-467a-8098-7ff4c749bd1e")
        public static SmAttribute TestAtt() {
            if (TestAtt == null) {
            	TestAtt = classof().getAttributeDef("Test");
            }
            return TestAtt;
        }

        @objid ("b205d79c-e944-460f-a522-5887f853e506")
        public static SmAttribute getSetupAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SetupAtt;
        }

        @objid ("68e727e1-b8e1-4016-8fbe-022f732f7f8a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("aff14d5d-3797-4070-b7f6-d1c0b93a4a91")
        public static SmAttribute getTestAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TestAtt;
        }

        @objid ("067da559-b09f-44ff-a10c-c49a25c65cdc")
        public static SmAttribute getIsTestedFirstAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsTestedFirstAtt;
        }

        @objid ("003c37f0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("db8347b1-d0e1-4e73-92df-b5aecb5c99db")
            public ISmObjectData createData() {
                return new LoopNodeData();
            }

            @objid ("da75b941-101b-4ae8-8b67-cd541cc4d700")
            public SmObjectImpl createImpl() {
                return new LoopNodeImpl();
            }

        }

        @objid ("003c9b6e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsTestedFirstSmAttribute extends SmAttribute {
            @objid ("98bf907d-b305-4188-9063-9423fdbf7902")
            public Object getValue(ISmObjectData data) {
                return ((LoopNodeData) data).mIsTestedFirst;
            }

            @objid ("d3086060-5df4-4cdf-9321-c9a332223eb6")
            public void setValue(ISmObjectData data, Object value) {
                ((LoopNodeData) data).mIsTestedFirst = value;
            }

        }

        @objid ("003cfe10-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SetupSmAttribute extends SmAttribute {
            @objid ("97b2dcac-dc58-46ec-bb5a-7325c2607626")
            public Object getValue(ISmObjectData data) {
                return ((LoopNodeData) data).mSetup;
            }

            @objid ("79d71098-f6ad-4ea8-b4e3-0b0797ee10a5")
            public void setValue(ISmObjectData data, Object value) {
                ((LoopNodeData) data).mSetup = value;
            }

        }

        @objid ("003d62c4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TestSmAttribute extends SmAttribute {
            @objid ("2883b423-e0cb-4c0f-9635-73e1167acd85")
            public Object getValue(ISmObjectData data) {
                return ((LoopNodeData) data).mTest;
            }

            @objid ("69a94061-718d-4bdd-988e-9f731a685a31")
            public void setValue(ISmObjectData data, Object value) {
                ((LoopNodeData) data).mTest = value;
            }

        }

    }

}
