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
    @objid ("9954fce1-f0fb-4111-8cdf-2f5a7c72087e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001e127a-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("034e49ae-d010-421f-944e-27b0318ef36c")
        private static SmClass smClass = null;

        @objid ("9b4ae0b8-f8f5-4268-8e6a-5537508f41e5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEndEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ca09e7c5-1586-4f65-a379-14439a58fa33")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001e5208-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a6ab0851-ea0a-4626-a318-482321d0f75b")
            public ISmObjectData createData() {
                return new BpmnEndEventData();
            }

            @objid ("aea7f001-afe3-4cda-9700-6d1e249203d0")
            public SmObjectImpl createImpl() {
                return new BpmnEndEventImpl();
            }

        }

    }

}
