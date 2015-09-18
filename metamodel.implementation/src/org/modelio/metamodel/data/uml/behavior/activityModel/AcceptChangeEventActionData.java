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
import org.modelio.metamodel.impl.uml.behavior.activityModel.AcceptChangeEventActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptChangeEventAction;
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

@objid ("0024e258-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AcceptChangeEventAction.class, factory=AcceptChangeEventActionData.Metadata.ObjectFactory.class)
public class AcceptChangeEventActionData extends ActivityActionData {
    @objid ("028cbdfd-02da-410a-87c5-0025705bc59a")
    @SmaMetaAttribute(metaName="ChangeExpresion", type=String.class, smAttributeClass=Metadata.ChangeExpresionSmAttribute.class)
     Object mChangeExpresion = "";

    @objid ("d1b3f565-bfa0-424f-88fb-d37ee5f4c107")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001765b0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fe4a6597-d65c-438b-9316-7651213639fb")
        private static SmClass smClass = null;

        @objid ("a25a9621-6503-48a3-8bd0-c63095858aca")
        private static SmAttribute ChangeExpresionAtt = null;

        @objid ("458c6396-72e0-4097-85bb-fc35439f82ea")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptChangeEventActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4dc2f0c5-dbe1-421c-977e-e6e0cc2c0439")
        public static SmAttribute ChangeExpresionAtt() {
            if (ChangeExpresionAtt == null) {
            	ChangeExpresionAtt = classof().getAttributeDef("ChangeExpresion");
            }
            return ChangeExpresionAtt;
        }

        @objid ("5a885914-52a9-4e3c-b527-238a196f7390")
        public static SmAttribute getChangeExpresionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChangeExpresionAtt;
        }

        @objid ("d41aea83-300c-4ca9-ac1e-0263ce1f8a0c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0017a908-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1cf9f5de-fed9-4bf5-a405-a32de657817d")
            public ISmObjectData createData() {
                return new AcceptChangeEventActionData();
            }

            @objid ("388eed09-9b2f-4378-ac35-673e3fa973d1")
            public SmObjectImpl createImpl() {
                return new AcceptChangeEventActionImpl();
            }

        }

        @objid ("00180c9a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ChangeExpresionSmAttribute extends SmAttribute {
            @objid ("0f89fdab-43ff-467f-befb-1bc587db361c")
            public Object getValue(ISmObjectData data) {
                return ((AcceptChangeEventActionData) data).mChangeExpresion;
            }

            @objid ("912978dd-35e1-47a0-89d8-193839ad5fb3")
            public void setValue(ISmObjectData data, Object value) {
                ((AcceptChangeEventActionData) data).mChangeExpresion = value;
            }

        }

    }

}
