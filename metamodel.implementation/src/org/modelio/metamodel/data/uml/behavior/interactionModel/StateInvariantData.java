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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.StateInvariantImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
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

@objid ("004be470-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StateInvariant.class, factory=StateInvariantData.Metadata.ObjectFactory.class)
public class StateInvariantData extends OccurrenceSpecificationData {
    @objid ("a3206bc1-a42a-4f63-805b-7188ffd3d6de")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("db98dc2f-8810-4a84-954c-a70dc11dd52a")
    @SmaMetaAttribute(metaName="EndLineNumber", type=Integer.class, smAttributeClass=Metadata.EndLineNumberSmAttribute.class)
     Object mEndLineNumber = 0;

    @objid ("015d6fa4-c739-4513-9ce4-e19993f73513")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0075111a-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("aa894425-725e-4e41-8e95-056d3ff86671")
        private static SmClass smClass = null;

        @objid ("f0e1bfd1-b1a4-442f-a12a-9530ba9194d1")
        private static SmAttribute BodyAtt = null;

        @objid ("5e4d0d5c-a36e-43e2-b675-b6c150772cbf")
        private static SmAttribute EndLineNumberAtt = null;

        @objid ("42f257d5-3b43-4014-b6d9-61db1d4aea8e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateInvariantData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("83068bcf-c6a8-4d23-a2e4-69b209679ac2")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("8dcb09e3-a27b-4a14-8a8f-3368528b539b")
        public static SmAttribute EndLineNumberAtt() {
            if (EndLineNumberAtt == null) {
            	EndLineNumberAtt = classof().getAttributeDef("EndLineNumber");
            }
            return EndLineNumberAtt;
        }

        @objid ("c2751a8d-3d5d-4716-8d4d-c8de4931b4c0")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("dc8486d3-bb15-4f23-a082-7aa9ab81f4f2")
        public static SmAttribute getEndLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndLineNumberAtt;
        }

        @objid ("d8a2904b-fcfc-4d2a-b092-92ea1fef489d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00756e76-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("404dbf1e-c873-44c0-ab18-66802145cdb5")
            public ISmObjectData createData() {
                return new StateInvariantData();
            }

            @objid ("1c23514e-132a-456f-8cf2-7ff75d328395")
            public SmObjectImpl createImpl() {
                return new StateInvariantImpl();
            }

        }

        @objid ("0075e2d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("a5b6eddd-1882-4e08-a165-def7200f8b92")
            public Object getValue(ISmObjectData data) {
                return ((StateInvariantData) data).mBody;
            }

            @objid ("fcabf74a-cade-483a-b17c-39354488376f")
            public void setValue(ISmObjectData data, Object value) {
                ((StateInvariantData) data).mBody = value;
            }

        }

        @objid ("00765660-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EndLineNumberSmAttribute extends SmAttribute {
            @objid ("70bc5ffb-8923-46ca-8a82-f6e36ab3f9c5")
            public Object getValue(ISmObjectData data) {
                return ((StateInvariantData) data).mEndLineNumber;
            }

            @objid ("3f05ebb6-89f3-46b7-beda-c3af08fc6232")
            public void setValue(ISmObjectData data, Object value) {
                ((StateInvariantData) data).mEndLineNumber = value;
            }

        }

    }

}
