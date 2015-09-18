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
import org.modelio.metamodel.bpmn.events.BpmnCancelEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnCancelEventDefinitionImpl;
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

@objid ("00886378-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnCancelEventDefinition.class, factory=BpmnCancelEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnCancelEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("b3dfbfc0-116f-4d07-9e41-3ffc33f27344")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0028ea1a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a6aa311c-d99a-4db5-8c94-8603dd8c69c4")
        private static SmClass smClass = null;

        @objid ("12646dba-dc8b-43dc-a321-7ba3e70c20e7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCancelEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("73dab644-09d7-4b78-b5a9-7725e0764a62")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00292b74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ac8ae10b-eca4-4587-a9ce-2b722526ca70")
            public ISmObjectData createData() {
                return new BpmnCancelEventDefinitionData();
            }

            @objid ("c870402c-d6c5-4fa3-adb4-154e9a565c10")
            public SmObjectImpl createImpl() {
                return new BpmnCancelEventDefinitionImpl();
            }

        }

    }

}
