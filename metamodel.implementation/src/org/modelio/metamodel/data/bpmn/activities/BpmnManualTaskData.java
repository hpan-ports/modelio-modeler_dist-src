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
import org.modelio.metamodel.bpmn.activities.BpmnManualTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnManualTaskImpl;
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

@objid ("0080c9b0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnManualTask.class, factory=BpmnManualTaskData.Metadata.ObjectFactory.class)
public class BpmnManualTaskData extends BpmnTaskData {
    @objid ("3c3eb145-a92e-4d06-ae5d-9473f989514a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0042476c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e2a24d26-90ce-4dfa-9669-6265394c8aee")
        private static SmClass smClass = null;

        @objid ("deff4e91-abbb-473f-9551-8653a5bf0eaf")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnManualTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("650ecdf5-6faf-4584-a0dc-6551b660608d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("004287f4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9b5de5e9-c79e-44b6-b9f9-685a62745e5d")
            public ISmObjectData createData() {
                return new BpmnManualTaskData();
            }

            @objid ("f4f78659-0f3c-4c0f-9ee0-b65898770936")
            public SmObjectImpl createImpl() {
                return new BpmnManualTaskImpl();
            }

        }

    }

}
