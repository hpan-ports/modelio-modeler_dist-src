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
    @objid ("08c46289-1e7b-46f3-b2b5-e09169e61f66")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00567822-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("33cb8d75-9a3a-4ee4-b70f-5d5780ee14c9")
        private static SmClass smClass = null;

        @objid ("200a082a-7508-40d2-908a-597a1a1687f5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSignalEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("602fa106-acb5-415f-af7e-af67a85cb0e7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0056ba58-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ff28338b-da67-44a1-8879-3ef44afbd642")
            public ISmObjectData createData() {
                return new BpmnSignalEventDefinitionData();
            }

            @objid ("3bdf2f0c-b40a-4b67-b724-e3391ea57e52")
            public SmObjectImpl createImpl() {
                return new BpmnSignalEventDefinitionImpl();
            }

        }

    }

}
