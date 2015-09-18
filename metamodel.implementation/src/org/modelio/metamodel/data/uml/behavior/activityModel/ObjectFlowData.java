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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectFlowImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;
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

@objid ("0038ffd6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ObjectFlow.class, factory=ObjectFlowData.Metadata.ObjectFactory.class)
public class ObjectFlowData extends ActivityEdgeData {
    @objid ("a8406db0-7c0a-4acd-85c0-f36b8924e4c0")
    @SmaMetaAttribute(metaName="TransformationBehavior", type=String.class, smAttributeClass=Metadata.TransformationBehaviorSmAttribute.class)
     Object mTransformationBehavior = "";

    @objid ("4e269e78-9506-4958-ad5d-db044b87be7c")
    @SmaMetaAttribute(metaName="SelectionBehavior", type=String.class, smAttributeClass=Metadata.SelectionBehaviorSmAttribute.class)
     Object mSelectionBehavior = "";

    @objid ("25cc4581-537d-4239-acbf-3800e53a4f31")
    @SmaMetaAttribute(metaName="IsMultiCast", type=Boolean.class, smAttributeClass=Metadata.IsMultiCastSmAttribute.class)
     Object mIsMultiCast = false;

    @objid ("4298d7a4-8a56-4a75-829e-deb3928d47c7")
    @SmaMetaAttribute(metaName="IsMultiReceive", type=Boolean.class, smAttributeClass=Metadata.IsMultiReceiveSmAttribute.class)
     Object mIsMultiReceive = false;

    @objid ("61b6e697-1ff7-4664-aac2-b350b5065bf3")
    @SmaMetaAttribute(metaName="Effect", type=ObjectFlowEffectKind.class, smAttributeClass=Metadata.EffectSmAttribute.class)
     Object mEffect = ObjectFlowEffectKind.READFLOW;

    @objid ("9f1a2e3d-c33c-45d5-8c4f-a22f8086afcc")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006907f8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8c360152-7c74-42d3-93ab-32aea3f99f23")
        private static SmClass smClass = null;

        @objid ("1a616b18-c14c-482e-88b6-45c3fdad9af8")
        private static SmAttribute TransformationBehaviorAtt = null;

        @objid ("8c362ba3-dfde-423e-b9d4-67d6dcd8e885")
        private static SmAttribute SelectionBehaviorAtt = null;

        @objid ("5137925d-02c4-415f-ae1e-f826ac409cc5")
        private static SmAttribute IsMultiCastAtt = null;

        @objid ("93664741-20cf-44b4-ab65-a380351f78e9")
        private static SmAttribute IsMultiReceiveAtt = null;

        @objid ("5ee7fef7-e4b9-4f0f-bba1-aa56ac61b286")
        private static SmAttribute EffectAtt = null;

        @objid ("2f774002-63ac-4507-84ec-b855e8525f7b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ObjectFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("41582efe-fb9c-45fb-b8c4-959aab6b5cd5")
        public static SmAttribute TransformationBehaviorAtt() {
            if (TransformationBehaviorAtt == null) {
            	TransformationBehaviorAtt = classof().getAttributeDef("TransformationBehavior");
            }
            return TransformationBehaviorAtt;
        }

        @objid ("60b65050-50b2-49e0-8c7c-6a379addfd6a")
        public static SmAttribute SelectionBehaviorAtt() {
            if (SelectionBehaviorAtt == null) {
            	SelectionBehaviorAtt = classof().getAttributeDef("SelectionBehavior");
            }
            return SelectionBehaviorAtt;
        }

        @objid ("ba1b425d-30c5-41a6-92a6-fa3368ef629a")
        public static SmAttribute IsMultiCastAtt() {
            if (IsMultiCastAtt == null) {
            	IsMultiCastAtt = classof().getAttributeDef("IsMultiCast");
            }
            return IsMultiCastAtt;
        }

        @objid ("d130edf5-fc6f-4617-943b-c703e5e58d3a")
        public static SmAttribute IsMultiReceiveAtt() {
            if (IsMultiReceiveAtt == null) {
            	IsMultiReceiveAtt = classof().getAttributeDef("IsMultiReceive");
            }
            return IsMultiReceiveAtt;
        }

        @objid ("7333e0cd-6b0f-4671-9269-a14163ef9875")
        public static SmAttribute EffectAtt() {
            if (EffectAtt == null) {
            	EffectAtt = classof().getAttributeDef("Effect");
            }
            return EffectAtt;
        }

        @objid ("3aa345f9-dafb-4f75-91dc-baceea4efb37")
        public static SmAttribute getIsMultiCastAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMultiCastAtt;
        }

        @objid ("c2025b05-a39a-4e90-95cc-a67aa2caa374")
        public static SmAttribute getEffectAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectAtt;
        }

        @objid ("e5fbae83-b5eb-43be-ac09-fbd7ab9e71d6")
        public static SmAttribute getTransformationBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TransformationBehaviorAtt;
        }

        @objid ("29fabe82-af9f-470f-b18c-7b25d48ab044")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e1fb7743-75a8-457c-adcc-7f03b695393e")
        public static SmAttribute getIsMultiReceiveAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMultiReceiveAtt;
        }

        @objid ("5e6d7562-e338-43f8-8a69-814835b0c5ea")
        public static SmAttribute getSelectionBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectionBehaviorAtt;
        }

        @objid ("00695320-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("70ac163a-ac98-491b-8dd8-05ae60438527")
            public ISmObjectData createData() {
                return new ObjectFlowData();
            }

            @objid ("aba0e797-d6bd-4bf1-87d1-00bc3c7fd21c")
            public SmObjectImpl createImpl() {
                return new ObjectFlowImpl();
            }

        }

        @objid ("0069b5d6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TransformationBehaviorSmAttribute extends SmAttribute {
            @objid ("eca034ab-0224-41ab-8f3f-fcb73aebebb6")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mTransformationBehavior;
            }

            @objid ("b385fcec-e585-459d-a4fa-36b0c446d5a0")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mTransformationBehavior = value;
            }

        }

        @objid ("006a1670-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SelectionBehaviorSmAttribute extends SmAttribute {
            @objid ("6ee3a6b8-b8aa-4b5b-80f6-fa4972379019")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mSelectionBehavior;
            }

            @objid ("df3c4920-5fc3-461f-8d78-44e8c5ab96e7")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mSelectionBehavior = value;
            }

        }

        @objid ("006a7854-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsMultiCastSmAttribute extends SmAttribute {
            @objid ("c1dc99a5-0d6c-4711-ae5e-babea8c76ff8")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mIsMultiCast;
            }

            @objid ("3b329028-5ba1-4666-9336-89470f79c470")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mIsMultiCast = value;
            }

        }

        @objid ("006ada56-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsMultiReceiveSmAttribute extends SmAttribute {
            @objid ("a8290c70-df94-4001-aa42-f11a4200c883")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mIsMultiReceive;
            }

            @objid ("ef94690e-656e-4d5c-87ee-348cad06ec55")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mIsMultiReceive = value;
            }

        }

        @objid ("006b3cf8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EffectSmAttribute extends SmAttribute {
            @objid ("ce318767-4c3e-4cab-9283-ef3049e71567")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mEffect;
            }

            @objid ("58adde7b-0f49-463d-86bc-b02b5a3db212")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mEffect = value;
            }

        }

    }

}
