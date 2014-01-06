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
    @objid ("d99242f8-4413-458b-bc15-573478dce149")
    @SmaMetaAttribute(metaName="DecisionKind", type=DecisionNodeKind.class, smAttributeClass=Metadata.DecisionKindSmAttribute.class)
     Object mDecisionKind = DecisionNodeKind.EXCLUSIVEDECISION;

    @objid ("25dad50a-387b-4cb0-8a0a-66fada8b1e32")
    @SmaMetaAttribute(metaName="DecisionInputBehavior", type=String.class, smAttributeClass=Metadata.DecisionInputBehaviorSmAttribute.class)
     Object mDecisionInputBehavior = "";

    @objid ("2c089186-5137-4e56-a552-737a1a3c5795")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005bf8c4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("86496e7c-e50c-4f1c-8e71-b14555fc91c7")
        private static SmClass smClass = null;

        @objid ("1d963b8d-ab97-4f68-88d1-3270463eddda")
        private static SmAttribute DecisionKindAtt = null;

        @objid ("dd0a35a6-c872-4d84-b594-d54f8fadea3f")
        private static SmAttribute DecisionInputBehaviorAtt = null;

        @objid ("e93ea920-7446-4854-b3a7-73e9ae74abd0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DecisionMergeNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4917f533-19fd-448b-a970-47124517f1c6")
        public static SmAttribute DecisionKindAtt() {
            if (DecisionKindAtt == null) {
            	DecisionKindAtt = classof().getAttributeDef("DecisionKind");
            }
            return DecisionKindAtt;
        }

        @objid ("21ae7cce-478f-4d61-922d-f6fbb03ee1ac")
        public static SmAttribute DecisionInputBehaviorAtt() {
            if (DecisionInputBehaviorAtt == null) {
            	DecisionInputBehaviorAtt = classof().getAttributeDef("DecisionInputBehavior");
            }
            return DecisionInputBehaviorAtt;
        }

        @objid ("903a2538-9c66-4bb9-8723-43c08ad2272a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3720cdef-5cdd-4813-b695-47c69ac6042c")
        public static SmAttribute getDecisionInputBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecisionInputBehaviorAtt;
        }

        @objid ("f952473d-1ae8-4940-a1e5-ffc8ddf61c3a")
        public static SmAttribute getDecisionKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecisionKindAtt;
        }

        @objid ("005c3ad2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("90410fb5-8a4f-4def-9d80-469d86719c65")
            public ISmObjectData createData() {
                return new DecisionMergeNodeData();
            }

            @objid ("c5e86256-4688-4282-b688-b947fdd9b846")
            public SmObjectImpl createImpl() {
                return new DecisionMergeNodeImpl();
            }

        }

        @objid ("005c9d56-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DecisionKindSmAttribute extends SmAttribute {
            @objid ("18019dbc-5141-4e00-916f-3debe3d5775e")
            public Object getValue(ISmObjectData data) {
                return ((DecisionMergeNodeData) data).mDecisionKind;
            }

            @objid ("b58899f3-12e7-4101-836e-4f596e6aa027")
            public void setValue(ISmObjectData data, Object value) {
                ((DecisionMergeNodeData) data).mDecisionKind = value;
            }

        }

        @objid ("005f81b0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DecisionInputBehaviorSmAttribute extends SmAttribute {
            @objid ("21ae3c8d-fc2f-4766-b06e-01362b4de6e9")
            public Object getValue(ISmObjectData data) {
                return ((DecisionMergeNodeData) data).mDecisionInputBehavior;
            }

            @objid ("3b7ed8fa-a7fc-4071-8854-d275e720ee45")
            public void setValue(ISmObjectData data, Object value) {
                ((DecisionMergeNodeData) data).mDecisionInputBehavior = value;
            }

        }

    }

}
