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
import org.modelio.metamodel.bpmn.events.BpmnEndEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnEndEventImpl;
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

@objid ("008af8f4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnEndEvent.class, factory=BpmnEndEventData.Metadata.ObjectFactory.class)
public class BpmnEndEventData extends BpmnThrowEventData {
    @objid ("a86c9278-be85-4e9a-bd1a-b2e36c479744")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001e127a-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b7a6826c-465b-4c26-80a2-85e30e5378ba")
        private static SmClass smClass = null;

        @objid ("865b3810-6c3f-49e9-b9eb-c6c61eaa8d8c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEndEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9f1b0549-30f4-429c-ba96-903dacd47f3a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001e5208-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("55940a58-bd32-4372-9536-4b3b4fca10ed")
            public ISmObjectData createData() {
                return new BpmnEndEventData();
            }

            @objid ("3bdb7b32-cebd-4661-adf2-a24a305cef68")
            public SmObjectImpl createImpl() {
                return new BpmnEndEventImpl();
            }

        }

    }

}
