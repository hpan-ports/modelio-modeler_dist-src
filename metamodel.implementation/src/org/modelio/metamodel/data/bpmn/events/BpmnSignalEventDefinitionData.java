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
import org.modelio.metamodel.bpmn.events.BpmnSignalEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnSignalEventDefinitionImpl;
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

@objid ("0092002c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnSignalEventDefinition.class, factory=BpmnSignalEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnSignalEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("870b4c65-b0f8-4717-b8f4-aafe710d1f29")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00567822-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e423b7c8-9f86-4705-b04f-729feb3de153")
        private static SmClass smClass = null;

        @objid ("ba8c1131-2c0c-48f1-b0ab-65332693163d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSignalEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d9169eb6-d1b2-43d2-b274-30411996d7eb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0056ba58-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a5862564-4b09-405a-8392-10a41b8d6bf6")
            public ISmObjectData createData() {
                return new BpmnSignalEventDefinitionData();
            }

            @objid ("f55b2d64-2c8b-40b8-a8ee-0dbab2109be7")
            public SmObjectImpl createImpl() {
                return new BpmnSignalEventDefinitionImpl();
            }

        }

    }

}
