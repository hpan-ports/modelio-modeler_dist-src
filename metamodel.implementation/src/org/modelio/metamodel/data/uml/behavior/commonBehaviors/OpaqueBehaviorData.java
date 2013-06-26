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
    @objid ("fc71b73e-4aa7-445f-af98-a952310b49ff")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("3ead8314-9990-41b8-8043-939b1890d646")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006d3b7a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9a4f4af4-97e6-4a6a-9b8e-60fb23ec22b1")
        private static SmClass smClass = null;

        @objid ("a03b8bd9-7b1f-44b5-8618-ada83fea89b4")
        private static SmAttribute BodyAtt = null;

        @objid ("8dd0b337-55e8-46a4-9863-ab04eb00ff46")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OpaqueBehaviorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6e6df143-a0db-4968-b03b-ec2a59d93d8f")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("e98fbf86-e066-45c0-b9f9-6c4a44e6a77e")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("275c7544-586e-4b6b-b92a-385ae22a3e39")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("006d7d56-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("334a7ba3-26c3-40b8-a7e5-c395c1134381")
            public ISmObjectData createData() {
                return new OpaqueBehaviorData();
            }

            @objid ("722c742d-5684-4909-940a-8f02f6b08a90")
            public SmObjectImpl createImpl() {
                return new OpaqueBehaviorImpl();
            }

        }

        @objid ("006ddfb2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("cea656aa-1294-41b4-86b0-30680f812c69")
            public Object getValue(ISmObjectData data) {
                return ((OpaqueBehaviorData) data).mBody;
            }

            @objid ("47b0885d-3660-449b-ae6e-577ef84184e4")
            public void setValue(ISmObjectData data, Object value) {
                ((OpaqueBehaviorData) data).mBody = value;
            }

        }

    }

}
