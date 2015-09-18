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
    @objid ("04e11957-0df5-46fb-a403-3a0ce1148a81")
    @SmaMetaAttribute(metaName="CancelActivity", type=Boolean.class, smAttributeClass=Metadata.CancelActivitySmAttribute.class)
     Object mCancelActivity = false;

    @objid ("435dc2ea-06fd-4aa9-953d-858f14a7f6b9")
    @SmaMetaAssociation(metaName="AttachedToRef", typeDataClass=BpmnActivityData.class, min=1, max=1, smAssociationClass=Metadata.AttachedToRefSmDependency.class)
     SmObjectImpl mAttachedToRef;

    @objid ("90bd7862-85f3-4d7e-949f-a2701c298c57")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003d5748-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("266ad7a9-8970-4f44-8912-e53404747d9f")
        private static SmClass smClass = null;

        @objid ("6a819bee-9145-475f-879b-11531393576f")
        private static SmAttribute CancelActivityAtt = null;

        @objid ("a7bff366-e086-4573-ae48-65eb8ce1d8d0")
        private static SmDependency AttachedToRefDep = null;

        @objid ("d26f8b25-e209-45b0-bfce-38458d61823a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBoundaryEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d7595ab4-ee29-41c5-9b9f-f2d9841b940e")
        public static SmAttribute CancelActivityAtt() {
            if (CancelActivityAtt == null) {
            	CancelActivityAtt = classof().getAttributeDef("CancelActivity");
            }
            return CancelActivityAtt;
        }

        @objid ("9d85f95f-5258-475d-9e27-3722b577939b")
        public static SmDependency AttachedToRefDep() {
            if (AttachedToRefDep == null) {
            	AttachedToRefDep = classof().getDependencyDef("AttachedToRef");
            }
            return AttachedToRefDep;
        }

        @objid ("0470e542-91cb-4265-a41b-ee9adfa1b4e3")
        public static SmDependency getAttachedToRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AttachedToRefDep;
        }

        @objid ("13020c8a-40a3-40b4-af17-5c33b212b5fc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("01b3b78e-80b1-4b40-8c40-3223d4db0847")
        public static SmAttribute getCancelActivityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CancelActivityAtt;
        }

        @objid ("003d9726-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("009f209e-208a-49fd-a93a-6de9cdb8b707")
            public ISmObjectData createData() {
                return new BpmnBoundaryEventData();
            }

            @objid ("a7ef708c-884f-4cf6-9a24-746578a7adb8")
            public SmObjectImpl createImpl() {
                return new BpmnBoundaryEventImpl();
            }

        }

        @objid ("003df752-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CancelActivitySmAttribute extends SmAttribute {
            @objid ("e894334c-89e4-40d9-bacb-8aff430c0dfd")
            public Object getValue(ISmObjectData data) {
                return ((BpmnBoundaryEventData) data).mCancelActivity;
            }

            @objid ("5ed64142-bec0-4510-ab65-086392f6b394")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnBoundaryEventData) data).mCancelActivity = value;
            }

        }

        @objid ("003e58f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class AttachedToRefSmDependency extends SmSingleDependency {
            @objid ("5018403c-7d2a-45eb-bbdd-d706ad64b291")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnBoundaryEventData) data).mAttachedToRef;
            }

            @objid ("8fba63fa-5c6e-4ba6-b2c6-ed0b263b5e66")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnBoundaryEventData) data).mAttachedToRef = value;
            }

            @objid ("3700aaf7-38db-4e78-b4f1-b1f329d24428")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.BoundaryEventRefDep();
            }

        }

    }

}
