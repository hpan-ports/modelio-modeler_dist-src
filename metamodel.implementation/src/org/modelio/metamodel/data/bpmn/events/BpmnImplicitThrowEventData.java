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
    @objid ("4ba82369-d01f-40e1-baaa-16029d54b41b")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BpmnComplexBehaviorDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("1cc85c2f-d16a-4238-b499-de6a519aefa2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0064aa00-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f26cf0ec-5b5f-4965-bec3-f9736fd834a4")
        private static SmClass smClass = null;

        @objid ("a78bfc1e-2795-467f-b000-cc7cbce3d47c")
        private static SmDependency OwnerDep = null;

        @objid ("b27ee50b-5f81-4676-be59-166bf6a42b04")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnImplicitThrowEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ffab5dc8-764c-4a43-8ad5-bedf463d9e83")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("046dd4e7-abba-4f59-9e30-8f87a4b09ba1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("72fcf355-0a96-492d-874c-e95d89002f44")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("0064e9d4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5b7a9af3-408a-4241-af13-463c2ac94271")
            public ISmObjectData createData() {
                return new BpmnImplicitThrowEventData();
            }

            @objid ("002360eb-b641-4d38-bfa3-fc97cc188858")
            public SmObjectImpl createImpl() {
                return new BpmnImplicitThrowEventImpl();
            }

        }

        @objid ("00655784-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("ee2c3a82-0dee-4dea-8a29-d7351937b54d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnImplicitThrowEventData) data).mOwner;
            }

            @objid ("4de03042-c134-4479-b8a1-5913342ca433")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnImplicitThrowEventData) data).mOwner = value;
            }

            @objid ("98875175-dbc3-4a91-a325-2915a740783b")
            @Override
            public SmDependency getSymetric() {
                return BpmnComplexBehaviorDefinitionData.Metadata.EventDep();
            }

        }

    }

}
