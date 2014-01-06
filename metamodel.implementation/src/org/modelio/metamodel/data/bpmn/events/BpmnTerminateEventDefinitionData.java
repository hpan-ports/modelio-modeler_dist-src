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
    @objid ("d9d5e27c-9398-42e7-86a2-3c369cf3953c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0056fcd4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("96819aae-551d-4bf3-8ea5-409a59eeb824")
        private static SmClass smClass = null;

        @objid ("e4bf55ba-fca9-45c2-aed1-d818bf504098")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTerminateEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8db99b9d-4d60-4b21-8925-c076bc1bb67e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00573c76-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e5443dee-3dce-4439-938a-dfb5ac9081eb")
            public ISmObjectData createData() {
                return new BpmnTerminateEventDefinitionData();
            }

            @objid ("9082bf8f-7fdf-41df-857e-486487c09b34")
            public SmObjectImpl createImpl() {
                return new BpmnTerminateEventDefinitionImpl();
            }

        }

    }

}
