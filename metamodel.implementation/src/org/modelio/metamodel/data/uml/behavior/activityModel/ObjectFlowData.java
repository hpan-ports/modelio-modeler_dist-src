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
    @objid ("3ada2116-4d9d-4790-b636-05aaf8c7de07")
    @SmaMetaAttribute(metaName="TransformationBehavior", type=String.class, smAttributeClass=Metadata.TransformationBehaviorSmAttribute.class)
     Object mTransformationBehavior = "";

    @objid ("d6b87337-f8b9-4b44-a7be-83ec94dcc136")
    @SmaMetaAttribute(metaName="SelectionBehavior", type=String.class, smAttributeClass=Metadata.SelectionBehaviorSmAttribute.class)
     Object mSelectionBehavior = "";

    @objid ("cec9c167-c536-42d0-b649-11cf23808050")
    @SmaMetaAttribute(metaName="IsMultiCast", type=Boolean.class, smAttributeClass=Metadata.IsMultiCastSmAttribute.class)
     Object mIsMultiCast = false;

    @objid ("d16e1bdb-1fd3-4ef8-bbde-6bbe71e1b2db")
    @SmaMetaAttribute(metaName="IsMultiReceive", type=Boolean.class, smAttributeClass=Metadata.IsMultiReceiveSmAttribute.class)
     Object mIsMultiReceive = false;

    @objid ("6387bc3b-1b48-4a3f-a81f-4e0a2d332b04")
    @SmaMetaAttribute(metaName="Effect", type=ObjectFlowEffectKind.class, smAttributeClass=Metadata.EffectSmAttribute.class)
     Object mEffect = ObjectFlowEffectKind.READFLOW;

    @objid ("e4269cd8-18a9-4921-b89e-db291370a7e5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006907f8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("98d3265e-a485-4942-bf66-e9bb18e6994b")
        private static SmClass smClass = null;

        @objid ("0747a55f-e46f-4d81-9602-cae8311706d5")
        private static SmAttribute TransformationBehaviorAtt = null;

        @objid ("504debfb-7b59-48e6-95b8-226816feedd9")
        private static SmAttribute SelectionBehaviorAtt = null;

        @objid ("45ee92b4-89ae-423f-9150-6dd4c8dcee70")
        private static SmAttribute IsMultiCastAtt = null;

        @objid ("36b3c53c-b682-4816-8aa2-0c0281da4892")
        private static SmAttribute IsMultiReceiveAtt = null;

        @objid ("66ea2f72-87fc-4290-9c10-158a405c6b73")
        private static SmAttribute EffectAtt = null;

        @objid ("b97c90ba-0cd5-468c-87ba-be1cd00fe363")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ObjectFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4fc7f09f-8b06-4e6e-8fcf-c3b7bcdc782c")
        public static SmAttribute TransformationBehaviorAtt() {
            if (TransformationBehaviorAtt == null) {
            	TransformationBehaviorAtt = classof().getAttributeDef("TransformationBehavior");
            }
            return TransformationBehaviorAtt;
        }

        @objid ("efde76df-8848-4c04-8234-133f548d3a84")
        public static SmAttribute SelectionBehaviorAtt() {
            if (SelectionBehaviorAtt == null) {
            	SelectionBehaviorAtt = classof().getAttributeDef("SelectionBehavior");
            }
            return SelectionBehaviorAtt;
        }

        @objid ("d3fa70e6-598e-4596-acde-d869a98f8008")
        public static SmAttribute IsMultiCastAtt() {
            if (IsMultiCastAtt == null) {
            	IsMultiCastAtt = classof().getAttributeDef("IsMultiCast");
            }
            return IsMultiCastAtt;
        }

        @objid ("8d2e665c-c366-48b4-9f60-87f49d870598")
        public static SmAttribute IsMultiReceiveAtt() {
            if (IsMultiReceiveAtt == null) {
            	IsMultiReceiveAtt = classof().getAttributeDef("IsMultiReceive");
            }
            return IsMultiReceiveAtt;
        }

        @objid ("5b827bc5-1327-477b-9249-24d3f2fe7e30")
        public static SmAttribute EffectAtt() {
            if (EffectAtt == null) {
            	EffectAtt = classof().getAttributeDef("Effect");
            }
            return EffectAtt;
        }

        @objid ("ae7261a2-b66e-4d82-8866-9e893f033684")
        public static SmAttribute getIsMultiReceiveAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMultiReceiveAtt;
        }

        @objid ("fdca4d02-eecf-46fc-b917-43f637868851")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("fe5373b3-a9ec-4f5b-b8a6-596ae14a93bf")
        public static SmAttribute getEffectAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectAtt;
        }

        @objid ("ca518c65-d3ee-4ae7-8a57-2003cee71ef5")
        public static SmAttribute getTransformationBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TransformationBehaviorAtt;
        }

        @objid ("86b4304a-abde-4a3d-965f-83cc1a2a9346")
        public static SmAttribute getSelectionBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectionBehaviorAtt;
        }

        @objid ("3d0e078d-a5c2-4f88-b139-cf14837883fb")
        public static SmAttribute getIsMultiCastAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMultiCastAtt;
        }

        @objid ("00695320-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f4a88255-406d-475f-b46e-1e6b1648afd5")
            public ISmObjectData createData() {
                return new ObjectFlowData();
            }

            @objid ("73efa666-1f81-428e-ab23-b550c0746b9f")
            public SmObjectImpl createImpl() {
                return new ObjectFlowImpl();
            }

        }

        @objid ("0069b5d6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TransformationBehaviorSmAttribute extends SmAttribute {
            @objid ("3b80c162-e620-4c4a-9f28-c43f11c0bdf7")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mTransformationBehavior;
            }

            @objid ("c88dd650-7d73-4860-a0f0-2780841d7c0b")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mTransformationBehavior = value;
            }

        }

        @objid ("006a1670-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SelectionBehaviorSmAttribute extends SmAttribute {
            @objid ("b2b857f1-6759-4bd1-8153-4a33cb475250")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mSelectionBehavior;
            }

            @objid ("7893328e-5685-4171-879d-f57f8670aaf4")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mSelectionBehavior = value;
            }

        }

        @objid ("006a7854-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsMultiCastSmAttribute extends SmAttribute {
            @objid ("0af1ae1e-8736-4fa4-9f7a-58c08c702401")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mIsMultiCast;
            }

            @objid ("312e1326-b335-4024-85a7-d6d9d6dfc7ed")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mIsMultiCast = value;
            }

        }

        @objid ("006ada56-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsMultiReceiveSmAttribute extends SmAttribute {
            @objid ("8cf035e6-e3ae-46b6-967c-062c154a8d5c")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mIsMultiReceive;
            }

            @objid ("8c2b0bc4-acee-46ca-8cbd-c5b7028ba8c6")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mIsMultiReceive = value;
            }

        }

        @objid ("006b3cf8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EffectSmAttribute extends SmAttribute {
            @objid ("df995252-8d0a-430c-aef3-06a39089287f")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mEffect;
            }

            @objid ("f877729d-d372-411c-b203-30b5a9fd3850")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mEffect = value;
            }

        }

    }

}
