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
    @objid ("c84ed2e1-6823-4d8c-bdd5-b0cd8466070b")
    @SmaMetaAttribute(metaName="IsTestedFirst", type=Boolean.class, smAttributeClass=Metadata.IsTestedFirstSmAttribute.class)
     Object mIsTestedFirst = false;

    @objid ("09322bcb-a4dc-4af8-83f9-1dd111b6f5cd")
    @SmaMetaAttribute(metaName="Setup", type=String.class, smAttributeClass=Metadata.SetupSmAttribute.class)
     Object mSetup = "";

    @objid ("c195a101-f1a7-42ef-97b3-ceea1ae17b8b")
    @SmaMetaAttribute(metaName="Test", type=String.class, smAttributeClass=Metadata.TestSmAttribute.class)
     Object mTest = "";

    @objid ("5a98ca43-6d1a-4778-a928-3fec1c8b5780")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003bf510-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f8757119-5bdb-4044-8b53-e4947ae22728")
        private static SmClass smClass = null;

        @objid ("7613c5ad-fb63-430a-9514-cdc05c05f5f7")
        private static SmAttribute IsTestedFirstAtt = null;

        @objid ("b5dfb384-f528-4705-8236-a6817e733ba7")
        private static SmAttribute SetupAtt = null;

        @objid ("86c19ce1-f1dc-49e3-8a80-3db39eaa8b1e")
        private static SmAttribute TestAtt = null;

        @objid ("63914779-2795-44f6-bca1-5259c32112d3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LoopNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("12788948-5883-4514-98cb-64e588226875")
        public static SmAttribute IsTestedFirstAtt() {
            if (IsTestedFirstAtt == null) {
            	IsTestedFirstAtt = classof().getAttributeDef("IsTestedFirst");
            }
            return IsTestedFirstAtt;
        }

        @objid ("97bf6e91-8da4-4e85-9663-8d2ed9d57452")
        public static SmAttribute SetupAtt() {
            if (SetupAtt == null) {
            	SetupAtt = classof().getAttributeDef("Setup");
            }
            return SetupAtt;
        }

        @objid ("8a339741-49ed-4bd5-a5a3-7d4d30ffc361")
        public static SmAttribute TestAtt() {
            if (TestAtt == null) {
            	TestAtt = classof().getAttributeDef("Test");
            }
            return TestAtt;
        }

        @objid ("fc646789-d417-4b70-b289-cadfbfb970ea")
        public static SmAttribute getIsTestedFirstAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsTestedFirstAtt;
        }

        @objid ("0ec5a2e7-0d8b-4a54-9e9a-6816f3d27bd5")
        public static SmAttribute getSetupAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SetupAtt;
        }

        @objid ("59315a56-3744-46b3-9cbf-9e52ae5918a1")
        public static SmAttribute getTestAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TestAtt;
        }

        @objid ("beea8373-0ea9-46b0-862c-f9dcdd820170")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003c37f0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("15c61570-3e07-4e1a-b9e0-aa7fdb560a6d")
            public ISmObjectData createData() {
                return new LoopNodeData();
            }

            @objid ("cb4c3fa4-dca7-4bf0-b0e3-64acb865908f")
            public SmObjectImpl createImpl() {
                return new LoopNodeImpl();
            }

        }

        @objid ("003c9b6e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsTestedFirstSmAttribute extends SmAttribute {
            @objid ("a0fd62f1-d627-442c-82f4-cf458867711d")
            public Object getValue(ISmObjectData data) {
                return ((LoopNodeData) data).mIsTestedFirst;
            }

            @objid ("9c3338df-3331-475a-9d80-bda3636be84e")
            public void setValue(ISmObjectData data, Object value) {
                ((LoopNodeData) data).mIsTestedFirst = value;
            }

        }

        @objid ("003cfe10-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SetupSmAttribute extends SmAttribute {
            @objid ("9f5cb658-21a9-46dc-b8e4-ebbe9007af9f")
            public Object getValue(ISmObjectData data) {
                return ((LoopNodeData) data).mSetup;
            }

            @objid ("c08ad59a-9799-4d92-9bac-3872bf38be58")
            public void setValue(ISmObjectData data, Object value) {
                ((LoopNodeData) data).mSetup = value;
            }

        }

        @objid ("003d62c4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TestSmAttribute extends SmAttribute {
            @objid ("7d2a00ed-906e-4ae0-892a-065705c55186")
            public Object getValue(ISmObjectData data) {
                return ((LoopNodeData) data).mTest;
            }

            @objid ("a7b403ab-6070-480d-9838-61c77d091695")
            public void setValue(ISmObjectData data, Object value) {
                ((LoopNodeData) data).mTest = value;
            }

        }

    }

}
