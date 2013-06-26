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
    @objid ("63ae1f84-ab49-421e-9dc4-946e83c79ced")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("ae242acf-42a2-486c-b10b-4de2227de9e4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005b0374-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cccc24ab-d893-4970-94d2-f083dd07d368")
        private static SmClass smClass = null;

        @objid ("cbdc0c7a-a296-4b46-9b50-a382ee6671b9")
        private static SmAttribute BodyAtt = null;

        @objid ("3c870733-15fb-4f66-b1e5-d77a64d03a95")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OpaqueActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b8fbb54d-a561-4c26-a2fd-8d9c219fa892")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("b51b1e8e-d46d-43b0-867b-397999f24915")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("83a590cc-ee07-4b0f-a848-a098595c9dd3")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("005b4564-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b17e9ff9-386f-4131-a852-8dd46fc0d918")
            public ISmObjectData createData() {
                return new OpaqueActionData();
            }

            @objid ("e4260afa-9e2a-4c7e-a228-50b9b618afcf")
            public SmObjectImpl createImpl() {
                return new OpaqueActionImpl();
            }

        }

        @objid ("005ba810-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("3ecfa4dc-d544-43ac-bcec-d29723acfc2e")
            public Object getValue(ISmObjectData data) {
                return ((OpaqueActionData) data).mBody;
            }

            @objid ("def484a5-ab85-4de8-8e04-5ca23aa4f022")
            public void setValue(ISmObjectData data, Object value) {
                ((OpaqueActionData) data).mBody = value;
            }

        }

    }

}
