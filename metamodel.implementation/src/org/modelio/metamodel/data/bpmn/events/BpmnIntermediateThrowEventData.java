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
import org.modelio.metamodel.bpmn.events.BpmnIntermediateThrowEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnIntermediateThrowEventImpl;
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

@objid ("008fcfb4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnIntermediateThrowEvent.class, factory=BpmnIntermediateThrowEventData.Metadata.ObjectFactory.class)
public class BpmnIntermediateThrowEventData extends BpmnThrowEventData {
    @objid ("ad43ab5d-c18f-4fed-b04a-0e0a2c44c85e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0076bab0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fe044069-3b50-4385-ad38-f0051f3a8234")
        private static SmClass smClass = null;

        @objid ("0be90c7f-3c3e-4333-bc8f-ac922199009c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnIntermediateThrowEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5de85187-1b66-45ff-8f1b-dd10e0931e1d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0077d8a0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d34b24c1-7907-4e0a-98a1-e27e9af4ec10")
            public ISmObjectData createData() {
                return new BpmnIntermediateThrowEventData();
            }

            @objid ("2c3bce28-5269-456e-b788-e41e1709099a")
            public SmObjectImpl createImpl() {
                return new BpmnIntermediateThrowEventImpl();
            }

        }

    }

}
