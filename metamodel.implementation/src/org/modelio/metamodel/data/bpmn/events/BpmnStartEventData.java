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
    @objid ("befe2640-c6df-4547-a53a-c14b6ef33e87")
    @SmaMetaAttribute(metaName="IsInterrupting", type=Boolean.class, smAttributeClass=Metadata.IsInterruptingSmAttribute.class)
     Object mIsInterrupting = false;

    @objid ("d25e323f-628d-4d09-b31b-18a79b541bbe")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000835fe-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("09b44771-a1f5-4bed-82e8-61fd3f7fc1d8")
        private static SmClass smClass = null;

        @objid ("27afb5a4-1e70-408f-8443-8a2c449705aa")
        private static SmAttribute IsInterruptingAtt = null;

        @objid ("bacf99f3-a478-4d0a-910e-bea272852a66")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnStartEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ec02efba-b188-4fb4-84ac-49c701774d32")
        public static SmAttribute IsInterruptingAtt() {
            if (IsInterruptingAtt == null) {
            	IsInterruptingAtt = classof().getAttributeDef("IsInterrupting");
            }
            return IsInterruptingAtt;
        }

        @objid ("e197220f-6d74-4a56-83ca-261bf4188f3a")
        public static SmAttribute getIsInterruptingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsInterruptingAtt;
        }

        @objid ("60e2aedf-1751-4c6a-85d2-4e930d6719bb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000876d6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f6ee74ab-60b4-4722-8732-32a04542b68c")
            public ISmObjectData createData() {
                return new BpmnStartEventData();
            }

            @objid ("c2251017-4d05-4647-a34b-ee868af566f7")
            public SmObjectImpl createImpl() {
                return new BpmnStartEventImpl();
            }

        }

        @objid ("0008d810-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsInterruptingSmAttribute extends SmAttribute {
            @objid ("a16a44d4-c4bb-41b0-9b11-21c9c94042d9")
            public Object getValue(ISmObjectData data) {
                return ((BpmnStartEventData) data).mIsInterrupting;
            }

            @objid ("08eb3068-975f-4541-922f-5d0cebfacada")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnStartEventData) data).mIsInterrupting = value;
            }

        }

    }

}
