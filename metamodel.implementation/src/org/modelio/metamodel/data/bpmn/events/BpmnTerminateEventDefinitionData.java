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
    @objid ("36fb19ea-7801-4580-aca7-276c66b3e232")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0056fcd4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2894e221-0559-4c92-86e5-8899b5f49341")
        private static SmClass smClass = null;

        @objid ("fd9aae6f-542e-434c-bbea-ee1faabf4fb7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTerminateEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3d05be22-cb39-4d7c-84b4-c97ce93cfdbe")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00573c76-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("552404c5-6108-40dc-bc6f-54006e4657e4")
            public ISmObjectData createData() {
                return new BpmnTerminateEventDefinitionData();
            }

            @objid ("f8d95909-51a9-41c7-8936-bbba49f3898a")
            public SmObjectImpl createImpl() {
                return new BpmnTerminateEventDefinitionImpl();
            }

        }

    }

}
