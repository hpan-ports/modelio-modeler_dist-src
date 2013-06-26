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
    @objid ("fcb8bdda-f535-4d91-b04f-205c2fb72c7f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0010ad74-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9a42efb2-184b-4daa-a317-9edda65587f1")
        private static SmClass smClass = null;

        @objid ("af07b7f2-7318-45cb-b018-74e598da9fc8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnIntermediateCatchEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("45dd501d-76bf-414f-9748-0bb75a788c97")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0010ece4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("882e64a6-2274-497f-93f9-b39cab044255")
            public ISmObjectData createData() {
                return new BpmnIntermediateCatchEventData();
            }

            @objid ("4c91af3d-6356-4eb3-a502-7ac08589b986")
            public SmObjectImpl createImpl() {
                return new BpmnIntermediateCatchEventImpl();
            }

        }

    }

}
