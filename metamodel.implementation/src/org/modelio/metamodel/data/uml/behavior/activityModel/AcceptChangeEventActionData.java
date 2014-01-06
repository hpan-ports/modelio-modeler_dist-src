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
    @objid ("a864baca-3f11-41da-9c8f-cb67772afe12")
    @SmaMetaAttribute(metaName="ChangeExpresion", type=String.class, smAttributeClass=Metadata.ChangeExpresionSmAttribute.class)
     Object mChangeExpresion = "";

    @objid ("16d2ef59-10ce-48d9-ab8c-7eab420e2317")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001765b0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6d9a26d2-a802-422f-8761-9d9c55374ad7")
        private static SmClass smClass = null;

        @objid ("4219eb4a-2486-4118-a531-07937b2e011a")
        private static SmAttribute ChangeExpresionAtt = null;

        @objid ("7db1be05-ef3a-41b5-9e30-383f006d47fd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptChangeEventActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("73b4dad3-4ec1-421a-95b3-5c4b6d1e9d22")
        public static SmAttribute ChangeExpresionAtt() {
            if (ChangeExpresionAtt == null) {
            	ChangeExpresionAtt = classof().getAttributeDef("ChangeExpresion");
            }
            return ChangeExpresionAtt;
        }

        @objid ("b8dbfddf-48f9-4042-8338-2216ebefa380")
        public static SmAttribute getChangeExpresionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChangeExpresionAtt;
        }

        @objid ("fcf1aef6-c211-434a-b2a4-ea3890fb3154")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0017a908-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("22068ff0-d320-493d-b982-e61e3675a8ab")
            public ISmObjectData createData() {
                return new AcceptChangeEventActionData();
            }

            @objid ("436c00b3-1be3-4622-8265-e92d9bc188e9")
            public SmObjectImpl createImpl() {
                return new AcceptChangeEventActionImpl();
            }

        }

        @objid ("00180c9a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ChangeExpresionSmAttribute extends SmAttribute {
            @objid ("91c7021a-5116-474c-95dd-1050911016d3")
            public Object getValue(ISmObjectData data) {
                return ((AcceptChangeEventActionData) data).mChangeExpresion;
            }

            @objid ("0fc1025e-d56e-40d1-a51a-2ecae6beb474")
            public void setValue(ISmObjectData data, Object value) {
                ((AcceptChangeEventActionData) data).mChangeExpresion = value;
            }

        }

    }

}
