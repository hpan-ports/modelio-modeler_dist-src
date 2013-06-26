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
import org.modelio.metamodel.bpmn.events.BpmnTerminateEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnTerminateEventDefinitionImpl;
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

@objid ("009533e6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnTerminateEventDefinition.class, factory=BpmnTerminateEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnTerminateEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("5cae868a-f09f-48a4-a511-be14094a4eb1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0056fcd4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("749f0a4b-d125-4305-be61-983c109c33b3")
        private static SmClass smClass = null;

        @objid ("fced5352-acde-4e2c-ae01-8978a4fcbe2e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTerminateEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2727c08c-047d-48b3-81c5-c439a802abaf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00573c76-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("631397d5-e86b-41a1-9f80-b47f48ab7dc0")
            public ISmObjectData createData() {
                return new BpmnTerminateEventDefinitionData();
            }

            @objid ("47541417-88fe-44cb-9cae-617e9b4a72f6")
            public SmObjectImpl createImpl() {
                return new BpmnTerminateEventDefinitionImpl();
            }

        }

    }

}
