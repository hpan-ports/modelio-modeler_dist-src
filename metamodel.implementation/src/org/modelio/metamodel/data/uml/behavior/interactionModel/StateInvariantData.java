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
    @objid ("b929e6e1-272e-488e-a286-973eb9840c7c")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("2252e579-1cd0-4ce5-a07d-327e22d81630")
    @SmaMetaAttribute(metaName="EndLineNumber", type=Integer.class, smAttributeClass=Metadata.EndLineNumberSmAttribute.class)
     Object mEndLineNumber = 0;

    @objid ("f8f8b4f3-9e66-4b72-9660-049ec1eb1797")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0075111a-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f7c1af89-f536-4060-8339-eea8dfd3a09d")
        private static SmClass smClass = null;

        @objid ("5c63933e-7e0e-4fec-bd7b-44148ce84259")
        private static SmAttribute BodyAtt = null;

        @objid ("c7a913e9-1d05-4e99-bacf-99d7eeaec56f")
        private static SmAttribute EndLineNumberAtt = null;

        @objid ("1f37b046-387a-4eba-ad1b-327a7b227069")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateInvariantData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dd6cfb85-75f3-4e6e-b220-22d6307609a0")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("af83c3cc-84c8-44f1-b252-175a6009d8b4")
        public static SmAttribute EndLineNumberAtt() {
            if (EndLineNumberAtt == null) {
            	EndLineNumberAtt = classof().getAttributeDef("EndLineNumber");
            }
            return EndLineNumberAtt;
        }

        @objid ("6818a673-4689-45ba-aadf-392d312c8679")
        public static SmAttribute getEndLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndLineNumberAtt;
        }

        @objid ("76850ddc-7219-47e1-ad19-d49eb3e17a18")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("e3f8acc7-e9eb-4553-97b6-4d15c266949c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00756e76-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("385fbb85-1df7-4a49-8f3e-59cd86866633")
            public ISmObjectData createData() {
                return new StateInvariantData();
            }

            @objid ("8c4a6b8f-dc31-4b18-9523-d38b4e6a0f98")
            public SmObjectImpl createImpl() {
                return new StateInvariantImpl();
            }

        }

        @objid ("0075e2d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("951a3b3a-d231-4070-8313-4de3fe0a5500")
            public Object getValue(ISmObjectData data) {
                return ((StateInvariantData) data).mBody;
            }

            @objid ("a45b6c10-19ff-4177-8f65-73de8001d3f1")
            public void setValue(ISmObjectData data, Object value) {
                ((StateInvariantData) data).mBody = value;
            }

        }

        @objid ("00765660-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EndLineNumberSmAttribute extends SmAttribute {
            @objid ("3d1d5d7b-ff53-402d-8424-429c7c25349d")
            public Object getValue(ISmObjectData data) {
                return ((StateInvariantData) data).mEndLineNumber;
            }

            @objid ("0b845d84-5f5e-4c97-9839-4c1aa92b5503")
            public void setValue(ISmObjectData data, Object value) {
                ((StateInvariantData) data).mEndLineNumber = value;
            }

        }

    }

}
