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
    @objid ("15e7de1f-4096-41cc-ba16-eacc84e9420e")
    @SmaMetaAttribute(metaName="DecisionKind", type=DecisionNodeKind.class, smAttributeClass=Metadata.DecisionKindSmAttribute.class)
     Object mDecisionKind = DecisionNodeKind.EXCLUSIVEDECISION;

    @objid ("84b525d0-38d4-44c9-8b91-74af8253d924")
    @SmaMetaAttribute(metaName="DecisionInputBehavior", type=String.class, smAttributeClass=Metadata.DecisionInputBehaviorSmAttribute.class)
     Object mDecisionInputBehavior = "";

    @objid ("63ead1d0-e6db-404f-a262-9fcbdb7e07dd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005bf8c4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7e0e1495-f447-4f34-bca5-838ebf682ca7")
        private static SmClass smClass = null;

        @objid ("646e9d71-041b-4d07-afdd-8ff285b88130")
        private static SmAttribute DecisionKindAtt = null;

        @objid ("875bcada-ac60-442b-aa01-4340a091abaa")
        private static SmAttribute DecisionInputBehaviorAtt = null;

        @objid ("b5e1bcef-d761-4320-9956-2b7605d0d5ba")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DecisionMergeNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("042b8706-5216-4396-a7ff-c7259c7da098")
        public static SmAttribute DecisionKindAtt() {
            if (DecisionKindAtt == null) {
            	DecisionKindAtt = classof().getAttributeDef("DecisionKind");
            }
            return DecisionKindAtt;
        }

        @objid ("6671cf77-a78b-43b2-bec9-aa6459ddf464")
        public static SmAttribute DecisionInputBehaviorAtt() {
            if (DecisionInputBehaviorAtt == null) {
            	DecisionInputBehaviorAtt = classof().getAttributeDef("DecisionInputBehavior");
            }
            return DecisionInputBehaviorAtt;
        }

        @objid ("89ce997b-0a24-48b4-aff1-ec7ce8f78328")
        public static SmAttribute getDecisionInputBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecisionInputBehaviorAtt;
        }

        @objid ("5e4190b7-63fa-4f30-a302-e2ba819f5840")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("543e4ed9-5500-4c57-b43a-050a22080637")
        public static SmAttribute getDecisionKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecisionKindAtt;
        }

        @objid ("005c3ad2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("faea9314-bec4-4635-8e6e-67668884cb9c")
            public ISmObjectData createData() {
                return new DecisionMergeNodeData();
            }

            @objid ("2019fbaa-39da-4bd3-b902-a8555e92af1e")
            public SmObjectImpl createImpl() {
                return new DecisionMergeNodeImpl();
            }

        }

        @objid ("005c9d56-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DecisionKindSmAttribute extends SmAttribute {
            @objid ("131250b9-24e8-4eb3-934d-62feb6903f10")
            public Object getValue(ISmObjectData data) {
                return ((DecisionMergeNodeData) data).mDecisionKind;
            }

            @objid ("21c8cc65-c823-4950-b286-72ea5d6d1dcd")
            public void setValue(ISmObjectData data, Object value) {
                ((DecisionMergeNodeData) data).mDecisionKind = value;
            }

        }

        @objid ("005f81b0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DecisionInputBehaviorSmAttribute extends SmAttribute {
            @objid ("632dc905-9cbf-4a75-a0c3-d62fffc80020")
            public Object getValue(ISmObjectData data) {
                return ((DecisionMergeNodeData) data).mDecisionInputBehavior;
            }

            @objid ("9d77e1e8-6467-4409-8501-37ed560efeba")
            public void setValue(ISmObjectData data, Object value) {
                ((DecisionMergeNodeData) data).mDecisionInputBehavior = value;
            }

        }

    }

}
