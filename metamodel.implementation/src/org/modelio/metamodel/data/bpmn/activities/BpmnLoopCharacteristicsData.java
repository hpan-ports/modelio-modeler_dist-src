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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnLoopCharacteristicsImpl;
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

@objid ("00804c1a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnLoopCharacteristics.class, factory=BpmnLoopCharacteristicsData.Metadata.ObjectFactory.class)
public abstract class BpmnLoopCharacteristicsData extends BpmnBaseElementData {
    @objid ("7e8fab1d-48a1-47a7-a7a9-0fa2c1e49188")
    @SmaMetaAssociation(metaName="OwnerActivity", typeDataClass=BpmnActivityData.class, min=1, max=1, smAssociationClass=Metadata.OwnerActivitySmDependency.class)
     SmObjectImpl mOwnerActivity;

    @objid ("64d505e8-27c1-4456-85bb-361a6383115d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00448e1e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9cb2ae9a-b5df-464b-b00e-db4937b19041")
        private static SmClass smClass = null;

        @objid ("599486ea-4445-4b2d-8729-08487eb8663a")
        private static SmDependency OwnerActivityDep = null;

        @objid ("92574202-c50c-4dd9-8f46-cce89f1697a9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLoopCharacteristicsData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f6a565c7-c42e-45b8-a462-c69ab87e6146")
        public static SmDependency OwnerActivityDep() {
            if (OwnerActivityDep == null) {
            	OwnerActivityDep = classof().getDependencyDef("OwnerActivity");
            }
            return OwnerActivityDep;
        }

        @objid ("7d157494-3d43-4c42-bd0d-c3ab24b49617")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7f52aa59-6082-4914-9c3d-d4a0cfa8ed0e")
        public static SmDependency getOwnerActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerActivityDep;
        }

        @objid ("0044cfd2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e5eca689-1ae1-43a4-8761-e7055fdb69ad")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("e3666ea3-f317-4d04-b509-511df03f5bff")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004531e8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerActivitySmDependency extends SmSingleDependency {
            @objid ("67c3714c-caf1-473f-9173-3cbf25445ae2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLoopCharacteristicsData) data).mOwnerActivity;
            }

            @objid ("004508e6-3eee-4aa4-b244-b8a84f22dc7b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLoopCharacteristicsData) data).mOwnerActivity = value;
            }

            @objid ("42ee44d8-68ba-4416-8b95-fb1cbf969a62")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.LoopCharacteristicsDep();
            }

        }

    }

}
