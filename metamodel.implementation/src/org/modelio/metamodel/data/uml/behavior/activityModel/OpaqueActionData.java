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
import org.modelio.metamodel.impl.uml.behavior.activityModel.OpaqueActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
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

@objid ("003a6c18-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=OpaqueAction.class, factory=OpaqueActionData.Metadata.ObjectFactory.class)
public class OpaqueActionData extends ActivityActionData {
    @objid ("c498ea52-8bea-482b-809d-b18b73dd2ba3")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("786a1c8d-5764-4bba-9a4e-fb8291dfba3d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005b0374-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e6780409-8ad3-495b-bc90-8c8964e5c443")
        private static SmClass smClass = null;

        @objid ("e13f4ceb-b157-4a7e-b7ef-7b7826eaa2b1")
        private static SmAttribute BodyAtt = null;

        @objid ("612b5a31-9cea-4a9a-a552-ee9e12772808")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OpaqueActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4ccc3fb6-1f1e-425e-b783-b5fa9fdbeb98")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("b04f3f8c-556f-4030-bed9-5a78273a1e4d")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("0b924749-9d23-46ca-bf5f-b19a9c98f0c8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("005b4564-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("39739904-86c2-43c8-bcad-66dbc5c8c899")
            public ISmObjectData createData() {
                return new OpaqueActionData();
            }

            @objid ("feaf3794-ce7f-4a28-b10d-727640ebea4b")
            public SmObjectImpl createImpl() {
                return new OpaqueActionImpl();
            }

        }

        @objid ("005ba810-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("8f304f27-67e4-4a0e-a5b5-dc2d0fc8b8f1")
            public Object getValue(ISmObjectData data) {
                return ((OpaqueActionData) data).mBody;
            }

            @objid ("7f8a5bb1-b9f1-4d3f-ad19-01da7e3081d9")
            public void setValue(ISmObjectData data, Object value) {
                ((OpaqueActionData) data).mBody = value;
            }

        }

    }

}
