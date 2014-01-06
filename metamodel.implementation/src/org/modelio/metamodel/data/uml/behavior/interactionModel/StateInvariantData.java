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
    @objid ("9489f500-0e7e-45f2-8cf6-dad84f36b306")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("29742a19-b164-45b6-8171-d62422dd1d1b")
    @SmaMetaAttribute(metaName="EndLineNumber", type=Integer.class, smAttributeClass=Metadata.EndLineNumberSmAttribute.class)
     Object mEndLineNumber = 0;

    @objid ("b195ab3f-9a22-498c-870c-e8f62bf5ff71")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0075111a-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d00360c9-b2db-4df5-a3e9-f1aa63e45c45")
        private static SmClass smClass = null;

        @objid ("e753c239-fd0c-40f8-9e66-fa083fdcd5fd")
        private static SmAttribute BodyAtt = null;

        @objid ("b466990e-2988-46e4-a785-d2516ada8a18")
        private static SmAttribute EndLineNumberAtt = null;

        @objid ("41882b45-9221-44ba-b87f-c63361a3fcb5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateInvariantData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6d26d34c-b52e-47cc-a679-b21a0e3d2455")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("09f9d67a-f202-4cf0-ae3f-630c1f1ddbd4")
        public static SmAttribute EndLineNumberAtt() {
            if (EndLineNumberAtt == null) {
            	EndLineNumberAtt = classof().getAttributeDef("EndLineNumber");
            }
            return EndLineNumberAtt;
        }

        @objid ("ddafe6fb-6523-4e1e-ae84-bc63d401235a")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("d184374b-53ac-476b-a1eb-0b4cbabafc7e")
        public static SmAttribute getEndLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndLineNumberAtt;
        }

        @objid ("fabdea74-b60a-4e20-a68c-67bb6c96ae86")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00756e76-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9c80c741-a732-4380-a2e1-c6ae4d9af71e")
            public ISmObjectData createData() {
                return new StateInvariantData();
            }

            @objid ("523bddb3-5b82-481b-9890-d4779e091a73")
            public SmObjectImpl createImpl() {
                return new StateInvariantImpl();
            }

        }

        @objid ("0075e2d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("e0166402-f9e1-4acd-8373-9a7f75c6736d")
            public Object getValue(ISmObjectData data) {
                return ((StateInvariantData) data).mBody;
            }

            @objid ("7f80deb3-8e63-4f95-8fdf-a03b158f231e")
            public void setValue(ISmObjectData data, Object value) {
                ((StateInvariantData) data).mBody = value;
            }

        }

        @objid ("00765660-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EndLineNumberSmAttribute extends SmAttribute {
            @objid ("c29d338c-b520-47b7-84bc-632b9924c3dd")
            public Object getValue(ISmObjectData data) {
                return ((StateInvariantData) data).mEndLineNumber;
            }

            @objid ("2c7150fe-1866-44e7-86a6-10cc97f94dce")
            public void setValue(ISmObjectData data, Object value) {
                ((StateInvariantData) data).mEndLineNumber = value;
            }

        }

    }

}
