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
    @objid ("84a94afc-54e6-48b1-b199-674c13dc6c9b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0076bab0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("824f5dde-f838-4790-a0d8-8c74d974ed18")
        private static SmClass smClass = null;

        @objid ("718e8d60-95b5-429d-8019-33f02a20ce62")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnIntermediateThrowEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c4c353be-3ce2-418d-a78c-d7c8e010c319")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0077d8a0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("20963aaf-8739-48a6-b393-e32d1d7101ce")
            public ISmObjectData createData() {
                return new BpmnIntermediateThrowEventData();
            }

            @objid ("33eb6c10-4b62-41f9-8094-3a9fdd4fd61c")
            public SmObjectImpl createImpl() {
                return new BpmnIntermediateThrowEventImpl();
            }

        }

    }

}
