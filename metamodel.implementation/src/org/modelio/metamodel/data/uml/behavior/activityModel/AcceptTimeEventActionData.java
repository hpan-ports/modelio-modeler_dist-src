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
    @objid ("59b985b7-016c-4e02-9e52-47fefe0be5fe")
    @SmaMetaAttribute(metaName="TimeExpresion", type=String.class, smAttributeClass=Metadata.TimeExpresionSmAttribute.class)
     Object mTimeExpresion = "";

    @objid ("a4b639d6-1790-4bbf-95f5-5f6df2800188")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000f808e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c08a564b-a1dd-4816-873b-3ac9716939bf")
        private static SmClass smClass = null;

        @objid ("8942b288-fcbb-461f-95e1-2c29ba872b09")
        private static SmAttribute TimeExpresionAtt = null;

        @objid ("003d96aa-1671-4df5-8b65-72a7e0a99a81")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptTimeEventActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("60c05ebd-da6d-4408-81ae-dd1bb2f6fd09")
        public static SmAttribute TimeExpresionAtt() {
            if (TimeExpresionAtt == null) {
            	TimeExpresionAtt = classof().getAttributeDef("TimeExpresion");
            }
            return TimeExpresionAtt;
        }

        @objid ("98a73e17-757b-4947-a54a-554674e4e934")
        public static SmAttribute getTimeExpresionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TimeExpresionAtt;
        }

        @objid ("fde82718-7f28-4c75-bcd7-c1b323a31ace")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000fc2ec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5d58415a-69b8-4b7a-b077-e410baf2666f")
            public ISmObjectData createData() {
                return new AcceptTimeEventActionData();
            }

            @objid ("8e91b3f2-6849-44a4-a9e8-4e7091040476")
            public SmObjectImpl createImpl() {
                return new AcceptTimeEventActionImpl();
            }

        }

        @objid ("00102584-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TimeExpresionSmAttribute extends SmAttribute {
            @objid ("929c3784-36f4-4e2e-9270-85545aedd496")
            public Object getValue(ISmObjectData data) {
                return ((AcceptTimeEventActionData) data).mTimeExpresion;
            }

            @objid ("0d00d246-ec3f-4c39-add8-18d393bc002e")
            public void setValue(ISmObjectData data, Object value) {
                ((AcceptTimeEventActionData) data).mTimeExpresion = value;
            }

        }

    }

}
