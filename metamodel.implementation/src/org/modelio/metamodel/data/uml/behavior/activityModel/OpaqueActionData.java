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
    @objid ("5a7544c3-f450-48b3-9990-c42bc6d25a81")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("f6beb36f-e67c-45ea-8249-390686f58ba7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005b0374-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0c997230-c754-453d-9793-fb00f316aff7")
        private static SmClass smClass = null;

        @objid ("935697e5-bc2d-4fb2-950c-be6a885f22b3")
        private static SmAttribute BodyAtt = null;

        @objid ("f9e12cc5-a617-49f0-b4c4-a3309d320259")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OpaqueActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("328f8699-2afb-4a44-9fcb-cf80eb206f97")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("ca163b05-dec1-4d11-9e47-737129bf1128")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0c40f142-aaac-4e26-a823-a5ee31aaa20e")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("005b4564-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c22cdef6-4400-4eee-bd4c-4ecfd8008bc2")
            public ISmObjectData createData() {
                return new OpaqueActionData();
            }

            @objid ("331b7258-7e9d-4c0d-bc25-1177d5d88e15")
            public SmObjectImpl createImpl() {
                return new OpaqueActionImpl();
            }

        }

        @objid ("005ba810-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("759954b1-2c2e-4d34-ae09-1af1518f9186")
            public Object getValue(ISmObjectData data) {
                return ((OpaqueActionData) data).mBody;
            }

            @objid ("172a3fe6-4b39-4ee5-b9f4-8f27cc965065")
            public void setValue(ISmObjectData data, Object value) {
                ((OpaqueActionData) data).mBody = value;
            }

        }

    }

}
