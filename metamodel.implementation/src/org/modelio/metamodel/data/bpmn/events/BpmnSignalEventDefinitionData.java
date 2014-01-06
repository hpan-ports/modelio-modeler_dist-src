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
    @objid ("2b12643c-8a85-489d-9c84-3b7c7bb80e06")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00567822-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e5e8b8c5-777c-4932-b0ed-17031c3724a2")
        private static SmClass smClass = null;

        @objid ("a4f81ecc-6704-4496-8705-50e965deff42")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSignalEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("58b04795-8042-4658-b9a0-9b1e88b6f7c5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0056ba58-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f56b90a3-807e-4045-a12f-23a57357db89")
            public ISmObjectData createData() {
                return new BpmnSignalEventDefinitionData();
            }

            @objid ("378ffb61-0b9a-4b6d-ac3b-7a2c22bda5dd")
            public SmObjectImpl createImpl() {
                return new BpmnSignalEventDefinitionImpl();
            }

        }

    }

}
