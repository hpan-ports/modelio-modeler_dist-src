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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnUserTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnUserTaskImpl;
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

@objid ("0086919c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnUserTask.class, factory=BpmnUserTaskData.Metadata.ObjectFactory.class)
public class BpmnUserTaskData extends BpmnTaskData {
    @objid ("7e98251f-b77e-4d16-b0d4-0d28a1aa2748")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("50091c14-c465-42bf-9277-449295f591af")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00923290-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a8b606e5-0631-4caa-ad8f-2a6f39005d52")
        private static SmClass smClass = null;

        @objid ("fbd8ae5a-5df7-40a0-ba05-3801b376e22f")
        private static SmAttribute ImplementationAtt = null;

        @objid ("cb10328a-5924-49cf-ab75-7840e694d496")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnUserTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("787775f6-fffd-4254-b494-9d8582f14743")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("3e45c774-3993-4a04-be3f-be15a6876750")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("20781ade-e0a6-4e0e-9678-de5ada77cefb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00927fb6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("417fc63c-4ba5-4de3-b6b5-077477226b68")
            public ISmObjectData createData() {
                return new BpmnUserTaskData();
            }

            @objid ("9bf2112a-7d71-4cc0-a421-061eb56ad067")
            public SmObjectImpl createImpl() {
                return new BpmnUserTaskImpl();
            }

        }

        @objid ("0092e366-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("1f874a2c-fd82-425c-a5ca-f36e4718cbe0")
            public Object getValue(ISmObjectData data) {
                return ((BpmnUserTaskData) data).mImplementation;
            }

            @objid ("6f494b39-92b1-4a21-8e25-407fd522fae3")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnUserTaskData) data).mImplementation = value;
            }

        }

    }

}
