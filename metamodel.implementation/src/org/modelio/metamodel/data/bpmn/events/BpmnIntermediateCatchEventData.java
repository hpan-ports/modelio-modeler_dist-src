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
    @objid ("95e1d79d-b5fd-4e41-b1e9-abe793370350")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0010ad74-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ac0c4f6b-00a9-45a8-ac54-408919e1d560")
        private static SmClass smClass = null;

        @objid ("1c9a9352-da48-4fcd-bde4-5e6cf36de684")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnIntermediateCatchEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("90d5bbf1-2021-46a2-a9ff-f025dd571754")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0010ece4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f7580ea2-dcf0-4baf-9e99-54d012cdad33")
            public ISmObjectData createData() {
                return new BpmnIntermediateCatchEventData();
            }

            @objid ("3d455035-1579-4c7a-95f2-e72ed6b3c089")
            public SmObjectImpl createImpl() {
                return new BpmnIntermediateCatchEventImpl();
            }

        }

    }

}
