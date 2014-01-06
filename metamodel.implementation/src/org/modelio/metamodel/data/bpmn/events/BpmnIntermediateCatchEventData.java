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
import org.modelio.metamodel.bpmn.events.BpmnIntermediateCatchEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnIntermediateCatchEventImpl;
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

@objid ("008f16f0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnIntermediateCatchEvent.class, factory=BpmnIntermediateCatchEventData.Metadata.ObjectFactory.class)
public class BpmnIntermediateCatchEventData extends BpmnCatchEventData {
    @objid ("159689a6-909d-475e-a8d9-b16deff29ac4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0010ad74-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1bc16186-8d69-4881-b535-80e805ca8382")
        private static SmClass smClass = null;

        @objid ("2e977c80-bce5-4f05-ac86-1c80d53010f1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnIntermediateCatchEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("46ccf048-9816-463d-bdf8-2ef157b192f5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0010ece4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b29faddf-fea0-4b43-a975-6efd828c69b4")
            public ISmObjectData createData() {
                return new BpmnIntermediateCatchEventData();
            }

            @objid ("cb477ac6-a8c5-4790-8642-a2a0014ec25f")
            public SmObjectImpl createImpl() {
                return new BpmnIntermediateCatchEventImpl();
            }

        }

    }

}
