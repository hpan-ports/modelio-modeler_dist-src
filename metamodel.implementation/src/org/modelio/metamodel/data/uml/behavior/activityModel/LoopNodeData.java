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
    @objid ("6efb6a54-e12e-4e0d-b020-c76014b77367")
    @SmaMetaAttribute(metaName="IsTestedFirst", type=Boolean.class, smAttributeClass=Metadata.IsTestedFirstSmAttribute.class)
     Object mIsTestedFirst = false;

    @objid ("363ef4fc-0e8f-4580-a1b3-299a331550a1")
    @SmaMetaAttribute(metaName="Setup", type=String.class, smAttributeClass=Metadata.SetupSmAttribute.class)
     Object mSetup = "";

    @objid ("c475dc95-b723-456e-a7c8-31fd79d8c73f")
    @SmaMetaAttribute(metaName="Test", type=String.class, smAttributeClass=Metadata.TestSmAttribute.class)
     Object mTest = "";

    @objid ("8f34b635-8caf-43e8-ae01-59e8d1b96ffe")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003bf510-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e906060a-b7fe-4c1a-964e-864b02d7fe19")
        private static SmClass smClass = null;

        @objid ("ef4dbb96-efe7-433a-9032-a990d0c39f04")
        private static SmAttribute IsTestedFirstAtt = null;

        @objid ("af3d0886-3825-494c-ba42-9a04b3872bd7")
        private static SmAttribute SetupAtt = null;

        @objid ("6b0da8e6-5981-403f-9a6f-66f5fdf189ce")
        private static SmAttribute TestAtt = null;

        @objid ("acaae0bf-a742-47f6-8567-ca3a3cb4475d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LoopNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cddc0f01-1cb3-4fbb-a3d6-fd25e5e5ef67")
        public static SmAttribute IsTestedFirstAtt() {
            if (IsTestedFirstAtt == null) {
            	IsTestedFirstAtt = classof().getAttributeDef("IsTestedFirst");
            }
            return IsTestedFirstAtt;
        }

        @objid ("c9d2ff76-d004-4de7-813a-e4e45a298886")
        public static SmAttribute SetupAtt() {
            if (SetupAtt == null) {
            	SetupAtt = classof().getAttributeDef("Setup");
            }
            return SetupAtt;
        }

        @objid ("a4a6de49-fb43-48f9-8d2b-473f0b868562")
        public static SmAttribute TestAtt() {
            if (TestAtt == null) {
            	TestAtt = classof().getAttributeDef("Test");
            }
            return TestAtt;
        }

        @objid ("0175c05f-f5fb-4021-b014-914f778c4eae")
        public static SmAttribute getSetupAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SetupAtt;
        }

        @objid ("1eb650ff-02c4-4fa4-9ce6-7651f86116be")
        public static SmAttribute getTestAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TestAtt;
        }

        @objid ("2feb5328-c010-4a8f-916c-938924a8a070")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("106a89ce-65d6-4f8f-b273-aea4f153e34b")
        public static SmAttribute getIsTestedFirstAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsTestedFirstAtt;
        }

        @objid ("003c37f0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9759413d-69ee-4aae-8510-1b731be87f15")
            public ISmObjectData createData() {
                return new LoopNodeData();
            }

            @objid ("eb51e59a-68c0-4466-9d77-e31ce2104c08")
            public SmObjectImpl createImpl() {
                return new LoopNodeImpl();
            }

        }

        @objid ("003c9b6e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsTestedFirstSmAttribute extends SmAttribute {
            @objid ("761e9580-191d-4b3b-8dde-87f00a0d3a45")
            public Object getValue(ISmObjectData data) {
                return ((LoopNodeData) data).mIsTestedFirst;
            }

            @objid ("c8b10899-8384-4329-8b00-e45bea674311")
            public void setValue(ISmObjectData data, Object value) {
                ((LoopNodeData) data).mIsTestedFirst = value;
            }

        }

        @objid ("003cfe10-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SetupSmAttribute extends SmAttribute {
            @objid ("3da78b85-dd22-4c79-864c-769bb31ada5e")
            public Object getValue(ISmObjectData data) {
                return ((LoopNodeData) data).mSetup;
            }

            @objid ("640fb2c6-6275-46a1-a11c-84031a82812a")
            public void setValue(ISmObjectData data, Object value) {
                ((LoopNodeData) data).mSetup = value;
            }

        }

        @objid ("003d62c4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TestSmAttribute extends SmAttribute {
            @objid ("d7fbd34a-e0e8-4f18-a161-d546ab7a7668")
            public Object getValue(ISmObjectData data) {
                return ((LoopNodeData) data).mTest;
            }

            @objid ("7b855064-d026-450f-b24a-9094a31d58f8")
            public void setValue(ISmObjectData data, Object value) {
                ((LoopNodeData) data).mTest = value;
            }

        }

    }

}
