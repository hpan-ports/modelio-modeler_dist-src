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
import org.modelio.metamodel.impl.uml.behavior.activityModel.DecisionMergeNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionMergeNode;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionNodeKind;
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

@objid ("0030401c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DecisionMergeNode.class, factory=DecisionMergeNodeData.Metadata.ObjectFactory.class)
public class DecisionMergeNodeData extends ControlNodeData {
    @objid ("7e81aea2-96a5-4dd8-a24e-a082e693b087")
    @SmaMetaAttribute(metaName="DecisionKind", type=DecisionNodeKind.class, smAttributeClass=Metadata.DecisionKindSmAttribute.class)
     Object mDecisionKind = DecisionNodeKind.EXCLUSIVEDECISION;

    @objid ("5e93c76b-004d-41f2-9793-025d9956b784")
    @SmaMetaAttribute(metaName="DecisionInputBehavior", type=String.class, smAttributeClass=Metadata.DecisionInputBehaviorSmAttribute.class)
     Object mDecisionInputBehavior = "";

    @objid ("6116e91b-c81f-4a40-bbdf-5ede385e2b6c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005bf8c4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f3dd678e-9643-47a5-a4d5-a68288eba458")
        private static SmClass smClass = null;

        @objid ("160d257c-9c2a-451d-a85d-3f0fd7e21f2d")
        private static SmAttribute DecisionKindAtt = null;

        @objid ("6e96f2e5-9e4a-4122-8cf2-e0b74a92dc02")
        private static SmAttribute DecisionInputBehaviorAtt = null;

        @objid ("78d37532-c7a0-4e53-ac36-d85fa4339934")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DecisionMergeNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f4499f0a-9715-4a15-89fe-8de8964e683c")
        public static SmAttribute DecisionKindAtt() {
            if (DecisionKindAtt == null) {
            	DecisionKindAtt = classof().getAttributeDef("DecisionKind");
            }
            return DecisionKindAtt;
        }

        @objid ("81534e7a-2a70-434b-9e1f-2817bd3d6942")
        public static SmAttribute DecisionInputBehaviorAtt() {
            if (DecisionInputBehaviorAtt == null) {
            	DecisionInputBehaviorAtt = classof().getAttributeDef("DecisionInputBehavior");
            }
            return DecisionInputBehaviorAtt;
        }

        @objid ("9bdf058a-de43-4b21-bea3-b7d909d22ebb")
        public static SmAttribute getDecisionKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecisionKindAtt;
        }

        @objid ("805564db-394e-422f-bbe8-22a5bd0b1fc9")
        public static SmAttribute getDecisionInputBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecisionInputBehaviorAtt;
        }

        @objid ("1fb97698-a84a-4fc3-a84e-04f0f3b5efce")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("005c3ad2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9915a6b7-ff56-4410-ac66-0a553b765874")
            public ISmObjectData createData() {
                return new DecisionMergeNodeData();
            }

            @objid ("098b8e9a-bd3b-488e-b2f3-fdfee83a200a")
            public SmObjectImpl createImpl() {
                return new DecisionMergeNodeImpl();
            }

        }

        @objid ("005c9d56-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DecisionKindSmAttribute extends SmAttribute {
            @objid ("fee59c3c-b380-42cd-89f5-376962a19143")
            public Object getValue(ISmObjectData data) {
                return ((DecisionMergeNodeData) data).mDecisionKind;
            }

            @objid ("1d5fd36d-7942-414a-a800-190c8f7af723")
            public void setValue(ISmObjectData data, Object value) {
                ((DecisionMergeNodeData) data).mDecisionKind = value;
            }

        }

        @objid ("005f81b0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DecisionInputBehaviorSmAttribute extends SmAttribute {
            @objid ("0c4a0e6b-7a28-456f-b770-af0eb298f0d3")
            public Object getValue(ISmObjectData data) {
                return ((DecisionMergeNodeData) data).mDecisionInputBehavior;
            }

            @objid ("be3f2af4-6eeb-4a4e-bee1-e77bea8ffa8e")
            public void setValue(ISmObjectData data, Object value) {
                ((DecisionMergeNodeData) data).mDecisionInputBehavior = value;
            }

        }

    }

}
