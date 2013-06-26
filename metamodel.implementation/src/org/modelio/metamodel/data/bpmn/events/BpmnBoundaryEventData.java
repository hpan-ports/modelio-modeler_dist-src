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
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.impl.bpmn.events.BpmnBoundaryEventImpl;
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

@objid ("0087c49a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnBoundaryEvent.class, factory=BpmnBoundaryEventData.Metadata.ObjectFactory.class)
public class BpmnBoundaryEventData extends BpmnCatchEventData {
    @objid ("9f8ff8d9-1d24-4aad-bbf3-3a407ff51d43")
    @SmaMetaAttribute(metaName="CancelActivity", type=Boolean.class, smAttributeClass=Metadata.CancelActivitySmAttribute.class)
     Object mCancelActivity = false;

    @objid ("def7090c-9add-4f87-9102-bd19d62ce409")
    @SmaMetaAssociation(metaName="AttachedToRef", typeDataClass=BpmnActivityData.class, min=1, max=1, smAssociationClass=Metadata.AttachedToRefSmDependency.class)
     SmObjectImpl mAttachedToRef;

    @objid ("d5e9fa59-7e38-4b48-b548-d70ef27509c3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003d5748-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0fd5310c-b7a0-4f74-a3ed-2a123eae3945")
        private static SmClass smClass = null;

        @objid ("a8c02dcd-79c0-474e-a72c-22a30f8a8444")
        private static SmAttribute CancelActivityAtt = null;

        @objid ("e3d111ea-c0a0-4a87-85c9-a0b13b754fe1")
        private static SmDependency AttachedToRefDep = null;

        @objid ("e7863a31-074e-43e2-a568-48dc30c800f7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBoundaryEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cd5de75d-683f-4a24-a1df-0e94fd6e0ead")
        public static SmAttribute CancelActivityAtt() {
            if (CancelActivityAtt == null) {
            	CancelActivityAtt = classof().getAttributeDef("CancelActivity");
            }
            return CancelActivityAtt;
        }

        @objid ("23e89a7f-ab2b-4365-94ac-d460af50b5d5")
        public static SmDependency AttachedToRefDep() {
            if (AttachedToRefDep == null) {
            	AttachedToRefDep = classof().getDependencyDef("AttachedToRef");
            }
            return AttachedToRefDep;
        }

        @objid ("ff856def-d942-4956-81d4-c8a56c692b7b")
        public static SmDependency getAttachedToRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AttachedToRefDep;
        }

        @objid ("3222528a-975f-4366-9ebe-006c5ac85d72")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ceb9f593-f942-49b5-8c85-6314f8dbcd34")
        public static SmAttribute getCancelActivityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CancelActivityAtt;
        }

        @objid ("003d9726-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3875582a-b572-4c28-9e04-98e940cd8bc0")
            public ISmObjectData createData() {
                return new BpmnBoundaryEventData();
            }

            @objid ("1b8dd093-7846-43d5-9106-e6f72f9a5b6d")
            public SmObjectImpl createImpl() {
                return new BpmnBoundaryEventImpl();
            }

        }

        @objid ("003df752-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CancelActivitySmAttribute extends SmAttribute {
            @objid ("862f61ff-687f-4e48-84e9-a53e4c339195")
            public Object getValue(ISmObjectData data) {
                return ((BpmnBoundaryEventData) data).mCancelActivity;
            }

            @objid ("9407e4dc-6946-43c5-86af-195649b95e72")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnBoundaryEventData) data).mCancelActivity = value;
            }

        }

        @objid ("003e58f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class AttachedToRefSmDependency extends SmSingleDependency {
            @objid ("56705113-9357-4e33-803b-fac69918b5d2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnBoundaryEventData) data).mAttachedToRef;
            }

            @objid ("89bddc19-4d36-439b-bebf-8fc577c2f4df")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnBoundaryEventData) data).mAttachedToRef = value;
            }

            @objid ("5c4c7031-7fc2-498d-80eb-bbce39dd95df")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.BoundaryEventRefDep();
            }

        }

    }

}
