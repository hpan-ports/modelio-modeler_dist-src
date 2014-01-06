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
    @objid ("b46de061-b544-4a90-b96e-fa7f27a3c065")
    @SmaMetaAttribute(metaName="TimeExpresion", type=String.class, smAttributeClass=Metadata.TimeExpresionSmAttribute.class)
     Object mTimeExpresion = "";

    @objid ("1a4a47ef-d381-40de-a030-7945f03e4fb3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000f808e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4ae80173-2882-4300-a766-b7b1c4129291")
        private static SmClass smClass = null;

        @objid ("363713da-96e1-45e4-82dd-46cb976e1e31")
        private static SmAttribute TimeExpresionAtt = null;

        @objid ("8508f6b7-1386-40a0-b553-10e4ae0306f5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptTimeEventActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("91b9bf89-59e2-4fb3-98ac-0f069447fe20")
        public static SmAttribute TimeExpresionAtt() {
            if (TimeExpresionAtt == null) {
            	TimeExpresionAtt = classof().getAttributeDef("TimeExpresion");
            }
            return TimeExpresionAtt;
        }

        @objid ("b8da8cd6-e14b-482a-9117-106be46a6598")
        public static SmAttribute getTimeExpresionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TimeExpresionAtt;
        }

        @objid ("ef6de5ad-dc2c-4968-b7f4-f69900cdcbb1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000fc2ec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d6612d9d-89ae-450e-a5d2-b40737133f78")
            public ISmObjectData createData() {
                return new AcceptTimeEventActionData();
            }

            @objid ("68e3d0be-638a-4a55-9ff2-574b823754ac")
            public SmObjectImpl createImpl() {
                return new AcceptTimeEventActionImpl();
            }

        }

        @objid ("00102584-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TimeExpresionSmAttribute extends SmAttribute {
            @objid ("6e9678aa-ee0d-487a-9985-247cd84b7c45")
            public Object getValue(ISmObjectData data) {
                return ((AcceptTimeEventActionData) data).mTimeExpresion;
            }

            @objid ("6e44758d-cf3e-4818-8b81-ac9a75bd0c39")
            public void setValue(ISmObjectData data, Object value) {
                ((AcceptTimeEventActionData) data).mTimeExpresion = value;
            }

        }

    }

}
