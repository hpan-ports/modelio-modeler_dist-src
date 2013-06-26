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
    @objid ("17add650-d088-436c-8d90-d6a0fbb4e423")
    @SmaMetaAssociation(metaName="OwnerActivity", typeDataClass=BpmnActivityData.class, min=1, max=1, smAssociationClass=Metadata.OwnerActivitySmDependency.class)
     SmObjectImpl mOwnerActivity;

    @objid ("060ba7fa-4dab-47ec-afb3-d878f50b7576")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00448e1e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e08914f5-ab5f-4599-bacf-862e27546030")
        private static SmClass smClass = null;

        @objid ("af345eb4-50f9-435b-b595-980576db4cf7")
        private static SmDependency OwnerActivityDep = null;

        @objid ("57db0a0b-8596-451d-86dd-733a9cd001c4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLoopCharacteristicsData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("168294c2-5368-4808-abe3-9aa6fe8b68bc")
        public static SmDependency OwnerActivityDep() {
            if (OwnerActivityDep == null) {
            	OwnerActivityDep = classof().getDependencyDef("OwnerActivity");
            }
            return OwnerActivityDep;
        }

        @objid ("8cb5c38f-95a0-4a56-bbb9-5f7584e3450e")
        public static SmDependency getOwnerActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerActivityDep;
        }

        @objid ("eb15304b-40ca-4066-9c10-729bea779284")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0044cfd2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c0459609-3a5e-4844-8431-8e79e768e79d")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("a2492e09-d09f-423d-a5ab-9ee1f251bf94")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004531e8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerActivitySmDependency extends SmSingleDependency {
            @objid ("7a2a67f4-d631-4978-b5fb-6582d6cf2936")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLoopCharacteristicsData) data).mOwnerActivity;
            }

            @objid ("bac21073-cadb-4849-a4c3-2d47c8f5f37c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLoopCharacteristicsData) data).mOwnerActivity = value;
            }

            @objid ("99ca68c9-a99d-472b-85e4-c16eefa910b2")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.LoopCharacteristicsDep();
            }

        }

    }

}
