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
    @objid ("50fe2a9e-9af1-4381-b9c2-f640e1e0b83b")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("b5a2fbb8-e21a-4033-91ea-aae7d4ee3f58")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006d3b7a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("656d5f68-236c-4478-ad91-73de77621564")
        private static SmClass smClass = null;

        @objid ("0e79a562-1ad1-4733-8169-6382bd5c6fe4")
        private static SmAttribute BodyAtt = null;

        @objid ("f1ad9bb7-0624-4ec2-a658-00c93ddeeee8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OpaqueBehaviorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b86236c7-be82-4154-b27d-9d46aeae5579")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("6b2b4f7e-4e4d-4826-99e4-49e11561a745")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f0744156-e670-4a1b-b851-5ca227157915")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("006d7d56-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("51608f9f-b694-4e2e-8b9d-d5cbbb5de53a")
            public ISmObjectData createData() {
                return new OpaqueBehaviorData();
            }

            @objid ("08f7c87c-bb72-4179-997a-db6905d3bd90")
            public SmObjectImpl createImpl() {
                return new OpaqueBehaviorImpl();
            }

        }

        @objid ("006ddfb2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("a1e755ac-8415-482b-9ed8-feca3a61130e")
            public Object getValue(ISmObjectData data) {
                return ((OpaqueBehaviorData) data).mBody;
            }

            @objid ("4310d5a5-7a3b-4353-a1e3-008f01714800")
            public void setValue(ISmObjectData data, Object value) {
                ((OpaqueBehaviorData) data).mBody = value;
            }

        }

    }

}
