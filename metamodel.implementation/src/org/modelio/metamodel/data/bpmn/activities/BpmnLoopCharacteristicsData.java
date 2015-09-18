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
    @objid ("8106e210-f0a0-4005-8b74-d2db91ea7bda")
    @SmaMetaAssociation(metaName="OwnerActivity", typeDataClass=BpmnActivityData.class, min=1, max=1, smAssociationClass=Metadata.OwnerActivitySmDependency.class)
     SmObjectImpl mOwnerActivity;

    @objid ("8f170677-7d30-4ac2-99a9-47ab6bf54602")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00448e1e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a6ec4c62-9823-4462-9e1e-15b774403b22")
        private static SmClass smClass = null;

        @objid ("6abf85f3-532c-4579-b9cf-05b8a967ace6")
        private static SmDependency OwnerActivityDep = null;

        @objid ("292eaa93-8eb5-4ee8-9d6f-dee043adb5ae")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLoopCharacteristicsData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1158e99d-4dd2-4b3f-8a66-7c633f17ea29")
        public static SmDependency OwnerActivityDep() {
            if (OwnerActivityDep == null) {
            	OwnerActivityDep = classof().getDependencyDef("OwnerActivity");
            }
            return OwnerActivityDep;
        }

        @objid ("eea86f7d-f97e-4403-9055-da9ac0e08dd7")
        public static SmDependency getOwnerActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerActivityDep;
        }

        @objid ("22da9b56-f125-422f-989f-cdd36aaf3c72")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0044cfd2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0e53e508-3697-4d02-99e3-b824a7305e4d")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("3fa9a5f8-d3d5-47c8-b6dd-1790843bae06")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004531e8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerActivitySmDependency extends SmSingleDependency {
            @objid ("846bdc44-ae58-41b9-9a34-41b5da5a4feb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLoopCharacteristicsData) data).mOwnerActivity;
            }

            @objid ("6d56c883-3b70-4602-90e4-e8825ba03cb6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLoopCharacteristicsData) data).mOwnerActivity = value;
            }

            @objid ("e408c50a-e084-4a01-b3ff-ece4857f60e5")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.LoopCharacteristicsDep();
            }

        }

    }

}
