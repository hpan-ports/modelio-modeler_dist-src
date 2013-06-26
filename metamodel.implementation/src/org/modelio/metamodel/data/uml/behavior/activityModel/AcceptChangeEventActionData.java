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
    @objid ("74def6da-35a3-4f9f-be13-a7b71a17cccb")
    @SmaMetaAttribute(metaName="ChangeExpresion", type=String.class, smAttributeClass=Metadata.ChangeExpresionSmAttribute.class)
     Object mChangeExpresion = "";

    @objid ("ae5788cd-e113-4f87-93e1-f32712ae6d7c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001765b0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f0afd86b-11f9-45f6-ba99-90ccdbfa879f")
        private static SmClass smClass = null;

        @objid ("7bb5921c-8804-46d4-bb54-7b3d2224d709")
        private static SmAttribute ChangeExpresionAtt = null;

        @objid ("3cc596e4-424e-4ad8-b568-b40f7fa0ff24")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptChangeEventActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("265e8146-ab6a-40c5-ab9e-25314aeba406")
        public static SmAttribute ChangeExpresionAtt() {
            if (ChangeExpresionAtt == null) {
            	ChangeExpresionAtt = classof().getAttributeDef("ChangeExpresion");
            }
            return ChangeExpresionAtt;
        }

        @objid ("2cc5c233-2bfd-4b00-aa57-13b1bc03c921")
        public static SmAttribute getChangeExpresionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChangeExpresionAtt;
        }

        @objid ("999a4eb0-48e3-459d-9d7f-581550695c66")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0017a908-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c33b52d1-0ad9-4fac-8f2c-76e7b3f3864b")
            public ISmObjectData createData() {
                return new AcceptChangeEventActionData();
            }

            @objid ("2ee7a71c-2ce2-4563-98d2-744426d1f197")
            public SmObjectImpl createImpl() {
                return new AcceptChangeEventActionImpl();
            }

        }

        @objid ("00180c9a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ChangeExpresionSmAttribute extends SmAttribute {
            @objid ("bd2faf45-cc53-4279-885e-2b64b9c43142")
            public Object getValue(ISmObjectData data) {
                return ((AcceptChangeEventActionData) data).mChangeExpresion;
            }

            @objid ("af715efe-8698-4e2b-9815-bef39aad4c9c")
            public void setValue(ISmObjectData data, Object value) {
                ((AcceptChangeEventActionData) data).mChangeExpresion = value;
            }

        }

    }

}
