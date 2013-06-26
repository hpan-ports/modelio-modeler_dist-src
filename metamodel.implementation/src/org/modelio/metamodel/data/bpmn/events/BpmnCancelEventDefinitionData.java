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
    @objid ("41fa41e0-f4a5-4017-845f-c0882ada4f1d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0028ea1a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6a35755e-4616-4306-a58e-0ad5cc32777d")
        private static SmClass smClass = null;

        @objid ("df821cd8-c298-4cdf-8299-72611d21c7f2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCancelEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a478286c-d32e-4789-926e-2736c24995cf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00292b74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2720a662-97ee-4eeb-9e22-1ecd8e2f0e50")
            public ISmObjectData createData() {
                return new BpmnCancelEventDefinitionData();
            }

            @objid ("aa000026-b40b-4e86-a3ba-cf306a6408e8")
            public SmObjectImpl createImpl() {
                return new BpmnCancelEventDefinitionImpl();
            }

        }

    }

}
