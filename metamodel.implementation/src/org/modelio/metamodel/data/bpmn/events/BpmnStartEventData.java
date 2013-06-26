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
    @objid ("e183d429-c7b1-4940-b943-a3583ec43ee2")
    @SmaMetaAttribute(metaName="IsInterrupting", type=Boolean.class, smAttributeClass=Metadata.IsInterruptingSmAttribute.class)
     Object mIsInterrupting = false;

    @objid ("e4b0109a-efa0-4a6c-a053-86b34d571c5d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000835fe-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("dc2d0962-2252-42cd-a82a-18fba1db1f5f")
        private static SmClass smClass = null;

        @objid ("f8fe5459-9150-4671-98ca-4e7cef29a230")
        private static SmAttribute IsInterruptingAtt = null;

        @objid ("a1bf3a7d-6410-4c8b-a10e-c1ffd294b381")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnStartEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0e4949ad-60d7-49a5-80d4-b163ff750162")
        public static SmAttribute IsInterruptingAtt() {
            if (IsInterruptingAtt == null) {
            	IsInterruptingAtt = classof().getAttributeDef("IsInterrupting");
            }
            return IsInterruptingAtt;
        }

        @objid ("a8a50b85-ed5d-4ab7-9927-f78f6455abb5")
        public static SmAttribute getIsInterruptingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsInterruptingAtt;
        }

        @objid ("e4405d05-b337-464b-8e6b-87449de2b05a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000876d6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("76b96bfc-7bf7-4ee9-9a72-045fb4b1865a")
            public ISmObjectData createData() {
                return new BpmnStartEventData();
            }

            @objid ("c3264d72-eb4d-434e-91e9-024a6dc71e1a")
            public SmObjectImpl createImpl() {
                return new BpmnStartEventImpl();
            }

        }

        @objid ("0008d810-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsInterruptingSmAttribute extends SmAttribute {
            @objid ("155d59f1-66e3-4416-a2c3-f1876e9598e1")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStartEventData) data).mIsInterrupting;
            }

            @objid ("d2741e30-0e94-40b3-bdb8-0098376e013d")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStartEventData) data).mIsInterrupting = value;
            }

        }

    }

}
