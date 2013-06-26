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
import org.modelio.metamodel.impl.uml.behavior.activityModel.AcceptTimeEventActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptTimeEventAction;
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

@objid ("0025dabe-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AcceptTimeEventAction.class, factory=AcceptTimeEventActionData.Metadata.ObjectFactory.class)
public class AcceptTimeEventActionData extends ActivityActionData {
    @objid ("bda03ca2-a2f7-46eb-8052-a27595abac11")
    @SmaMetaAttribute(metaName="TimeExpresion", type=String.class, smAttributeClass=Metadata.TimeExpresionSmAttribute.class)
     Object mTimeExpresion = "";

    @objid ("9eaddd53-e4e9-4f29-99e8-df82bb8085e5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000f808e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("50cab8c9-7539-4674-b2b7-3bfa09445f21")
        private static SmClass smClass = null;

        @objid ("96358935-0c93-4f3e-a5cf-cf74f0512a90")
        private static SmAttribute TimeExpresionAtt = null;

        @objid ("851c21ed-6f58-4744-a734-3b6395dcdaef")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptTimeEventActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2d4fdf7b-b5fd-430f-9051-01abfd2d145a")
        public static SmAttribute TimeExpresionAtt() {
            if (TimeExpresionAtt == null) {
            	TimeExpresionAtt = classof().getAttributeDef("TimeExpresion");
            }
            return TimeExpresionAtt;
        }

        @objid ("c89e2ebc-5a6b-48d3-af5c-48cf5eb63b95")
        public static SmAttribute getTimeExpresionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TimeExpresionAtt;
        }

        @objid ("2b652de0-cc6d-406c-a943-6c39628ecb2b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000fc2ec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("01e43297-049e-439d-968e-66ab9bdf1c9c")
            public ISmObjectData createData() {
                return new AcceptTimeEventActionData();
            }

            @objid ("3105e4fd-5e4f-4ef3-990a-7cee061c266f")
            public SmObjectImpl createImpl() {
                return new AcceptTimeEventActionImpl();
            }

        }

        @objid ("00102584-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TimeExpresionSmAttribute extends SmAttribute {
            @objid ("967c58ca-4dc8-4fcc-92f2-5ae4dcd8a23e")
            public Object getValue(ISmObjectData data) {
                return ((AcceptTimeEventActionData) data).mTimeExpresion;
            }

            @objid ("1310523a-66a5-4912-a5ac-b8fdabff6943")
            public void setValue(ISmObjectData data, Object value) {
                ((AcceptTimeEventActionData) data).mTimeExpresion = value;
            }

        }

    }

}
