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
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnStartEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnStartEventImpl;
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

@objid ("0092bf4e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnStartEvent.class, factory=BpmnStartEventData.Metadata.ObjectFactory.class)
public class BpmnStartEventData extends BpmnCatchEventData {
    @objid ("d5e6540e-5dc0-47ea-8252-13ff4aa73cf4")
    @SmaMetaAttribute(metaName="IsInterrupting", type=Boolean.class, smAttributeClass=Metadata.IsInterruptingSmAttribute.class)
     Object mIsInterrupting = false;

    @objid ("415b146f-3141-4b44-aa1e-6a4361f49743")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000835fe-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8c103899-2138-4e82-9b08-19b01daaa9c2")
        private static SmClass smClass = null;

        @objid ("d1178773-391c-4293-b683-0c60df5c5c9e")
        private static SmAttribute IsInterruptingAtt = null;

        @objid ("6bcfd31f-2a41-4989-aabb-84894cefea6b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnStartEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("90819984-9966-4053-9149-6cf92d1dc939")
        public static SmAttribute IsInterruptingAtt() {
            if (IsInterruptingAtt == null) {
            	IsInterruptingAtt = classof().getAttributeDef("IsInterrupting");
            }
            return IsInterruptingAtt;
        }

        @objid ("d8474a5f-e51f-4dd2-abec-8082ba6dda00")
        public static SmAttribute getIsInterruptingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsInterruptingAtt;
        }

        @objid ("f12ffc51-8276-46cb-afef-d6c186714390")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000876d6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3686b52b-3dbb-4df8-834a-9695c8df98ea")
            public ISmObjectData createData() {
                return new BpmnStartEventData();
            }

            @objid ("f5767c48-ea7d-4601-8dba-ad77828f1981")
            public SmObjectImpl createImpl() {
                return new BpmnStartEventImpl();
            }

        }

        @objid ("0008d810-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsInterruptingSmAttribute extends SmAttribute {
            @objid ("b4707a38-450e-47ba-8723-c51c7a480d99")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStartEventData) data).mIsInterrupting;
            }

            @objid ("b79aef24-f906-4351-aecc-3dc408e341a0")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStartEventData) data).mIsInterrupting = value;
            }

        }

    }

}
