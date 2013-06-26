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
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.data.bpmn.activities.BpmnComplexBehaviorDefinitionData;
import org.modelio.metamodel.impl.bpmn.events.BpmnImplicitThrowEventImpl;
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

@objid ("008e6250-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnImplicitThrowEvent.class, factory=BpmnImplicitThrowEventData.Metadata.ObjectFactory.class)
public class BpmnImplicitThrowEventData extends BpmnThrowEventData {
    @objid ("bf7d2448-4255-41c7-b869-ee1fcb2669cf")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BpmnComplexBehaviorDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("b935027d-9b21-4edc-a1d9-e0a52c823436")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0064aa00-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b10a65bc-096d-470b-b112-05f9dd8bb68d")
        private static SmClass smClass = null;

        @objid ("08705efb-c205-40a2-af83-087004e6cfcb")
        private static SmDependency OwnerDep = null;

        @objid ("3e298ffb-d1e5-4749-97d9-09619d29160e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnImplicitThrowEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4437379e-a28c-4ade-b4ad-209859400ba4")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("952fa270-3a8c-4aea-8c32-f01ef98d0adc")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("ccbdae53-e9ce-4484-a4ee-28058b016b19")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0064e9d4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f59caf88-3f6f-4c6a-b565-410159bac11f")
            public ISmObjectData createData() {
                return new BpmnImplicitThrowEventData();
            }

            @objid ("a5112ffb-ce81-46cd-8ae2-959323a3bfd3")
            public SmObjectImpl createImpl() {
                return new BpmnImplicitThrowEventImpl();
            }

        }

        @objid ("00655784-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("15e66589-56bd-4f16-8f27-c7c81c83c795")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnImplicitThrowEventData) data).mOwner;
            }

            @objid ("aae86ccd-10a0-4890-abd6-c5cca235d8a5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnImplicitThrowEventData) data).mOwner = value;
            }

            @objid ("237121a8-b2d2-42d6-a84c-8715661c1a96")
            @Override
            public SmDependency getSymetric() {
                return BpmnComplexBehaviorDefinitionData.Metadata.EventDep();
            }

        }

    }

}
