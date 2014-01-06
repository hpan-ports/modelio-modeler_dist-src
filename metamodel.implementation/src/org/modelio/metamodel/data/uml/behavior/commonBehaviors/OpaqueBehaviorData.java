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
package org.modelio.metamodel.data.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.OpaqueBehaviorImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.OpaqueBehavior;
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

@objid ("0041e20e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=OpaqueBehavior.class, factory=OpaqueBehaviorData.Metadata.ObjectFactory.class, cmsnode=true)
public class OpaqueBehaviorData extends BehaviorData {
    @objid ("6dea91d2-213a-445e-802a-3ee7fa887890")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("b5a0c8e1-759c-4976-bc3a-5b29ead4eb7b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006d3b7a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1be87a66-d906-4b6a-8bc9-a02a32b55bde")
        private static SmClass smClass = null;

        @objid ("f9c31d6b-b0cb-4e06-9fba-486cd3132573")
        private static SmAttribute BodyAtt = null;

        @objid ("7cc74364-9924-4600-aacf-25b715131ceb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OpaqueBehaviorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8512ab13-136c-4dba-aafa-e8abd16d54a7")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("6863f730-292e-49c9-aba1-11d498338661")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("39e7f75a-304b-4765-85f7-8221bce52696")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("006d7d56-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3d70fbfd-ea91-4b2b-ae3a-d7e28e79e3d0")
            public ISmObjectData createData() {
                return new OpaqueBehaviorData();
            }

            @objid ("4f9bd293-9544-44a6-8b94-9a208ab4e04a")
            public SmObjectImpl createImpl() {
                return new OpaqueBehaviorImpl();
            }

        }

        @objid ("006ddfb2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("97fe9521-b76b-41a4-a9b0-5c8b08911084")
            public Object getValue(ISmObjectData data) {
                return ((OpaqueBehaviorData) data).mBody;
            }

            @objid ("ba458c3f-de7c-4f3b-9881-f2ce0e56e660")
            public void setValue(ISmObjectData data, Object value) {
                ((OpaqueBehaviorData) data).mBody = value;
            }

        }

    }

}
