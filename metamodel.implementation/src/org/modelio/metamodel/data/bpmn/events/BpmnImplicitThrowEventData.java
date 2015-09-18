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
    @objid ("0a66cb73-d1c6-493e-978d-372db20748eb")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BpmnComplexBehaviorDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("df20ab35-0b20-49f5-8dfc-7969dcbc7bf7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0064aa00-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("326e9af3-49cb-4567-b4b9-8aef05723097")
        private static SmClass smClass = null;

        @objid ("5436d5a3-9477-4200-9152-b779ebfcc640")
        private static SmDependency OwnerDep = null;

        @objid ("b5fc7de4-f0f0-4aa5-8029-8958fd66e991")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnImplicitThrowEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6a7074bf-575d-49c4-8d0e-2ea79dc46610")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("e1c7fbbd-4a0e-4026-a22f-070ebf002c85")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("af5c0778-e047-4fa9-bc0e-ab42444343ea")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("0064e9d4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a345e078-eb5b-4d8b-b2ec-f7724295c89c")
            public ISmObjectData createData() {
                return new BpmnImplicitThrowEventData();
            }

            @objid ("86d7ec6d-a01f-4d5b-bbb9-945e69a234d1")
            public SmObjectImpl createImpl() {
                return new BpmnImplicitThrowEventImpl();
            }

        }

        @objid ("00655784-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("8ffd793b-f91f-4321-a055-fd4f09c73ef6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnImplicitThrowEventData) data).mOwner;
            }

            @objid ("e35ab79f-f420-420c-8f7c-593dc07ad1ad")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnImplicitThrowEventData) data).mOwner = value;
            }

            @objid ("898423e3-e00e-492f-b8a6-162260184dc0")
            @Override
            public SmDependency getSymetric() {
                return BpmnComplexBehaviorDefinitionData.Metadata.EventDep();
            }

        }

    }

}
