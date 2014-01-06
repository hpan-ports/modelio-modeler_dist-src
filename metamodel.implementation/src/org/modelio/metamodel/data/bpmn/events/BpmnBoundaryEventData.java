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
    @objid ("9ac8e9b0-b00c-4fe0-b829-b405806a5c4b")
    @SmaMetaAttribute(metaName="CancelActivity", type=Boolean.class, smAttributeClass=Metadata.CancelActivitySmAttribute.class)
     Object mCancelActivity = false;

    @objid ("b81f0322-48c2-4f9b-98e9-fa6389738b7b")
    @SmaMetaAssociation(metaName="AttachedToRef", typeDataClass=BpmnActivityData.class, min=1, max=1, smAssociationClass=Metadata.AttachedToRefSmDependency.class)
     SmObjectImpl mAttachedToRef;

    @objid ("70f0d5ec-d7da-4494-ac13-207d8906d865")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003d5748-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("825f66f8-c4c1-4afe-8680-9979b5be1a84")
        private static SmClass smClass = null;

        @objid ("39a8c9dd-91c5-4235-8f37-7d2744866f6e")
        private static SmAttribute CancelActivityAtt = null;

        @objid ("30f8cea8-420c-4662-8c13-77a8091b843c")
        private static SmDependency AttachedToRefDep = null;

        @objid ("2995c5ce-7e47-4cf1-ac99-3521b1ff7eb2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBoundaryEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d4d9b962-6678-496e-af9f-5ab97ddcd79b")
        public static SmAttribute CancelActivityAtt() {
            if (CancelActivityAtt == null) {
            	CancelActivityAtt = classof().getAttributeDef("CancelActivity");
            }
            return CancelActivityAtt;
        }

        @objid ("24397949-8f43-424a-bc92-ae2b6bcef19a")
        public static SmDependency AttachedToRefDep() {
            if (AttachedToRefDep == null) {
            	AttachedToRefDep = classof().getDependencyDef("AttachedToRef");
            }
            return AttachedToRefDep;
        }

        @objid ("4ea5d4fd-c9cf-4df9-af76-a4042c2012f0")
        public static SmDependency getAttachedToRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AttachedToRefDep;
        }

        @objid ("fb150635-386d-47e5-95ad-f963ebe71d2b")
        public static SmAttribute getCancelActivityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CancelActivityAtt;
        }

        @objid ("d2d03f90-081d-428a-8f84-dadaac8fa648")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003d9726-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c966c545-7645-43a7-8f03-6d5cede60d1c")
            public ISmObjectData createData() {
                return new BpmnBoundaryEventData();
            }

            @objid ("702cab86-0031-48c7-8e2d-54c25dca666d")
            public SmObjectImpl createImpl() {
                return new BpmnBoundaryEventImpl();
            }

        }

        @objid ("003df752-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CancelActivitySmAttribute extends SmAttribute {
            @objid ("cbfb5967-5e52-4bfc-b203-17f9edc1c2ef")
            public Object getValue(ISmObjectData data) {
                return ((BpmnBoundaryEventData) data).mCancelActivity;
            }

            @objid ("26112175-f9f2-4b75-b9a9-7cf7c07373ad")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnBoundaryEventData) data).mCancelActivity = value;
            }

        }

        @objid ("003e58f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class AttachedToRefSmDependency extends SmSingleDependency {
            @objid ("959212be-0573-4423-a808-a7c295b0d6ba")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnBoundaryEventData) data).mAttachedToRef;
            }

            @objid ("59c0de23-5d53-4708-93f4-8debeb12e88e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnBoundaryEventData) data).mAttachedToRef = value;
            }

            @objid ("73a2ad4b-2f5b-4d81-8591-6b6c60751999")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.BoundaryEventRefDep();
            }

        }

    }

}
