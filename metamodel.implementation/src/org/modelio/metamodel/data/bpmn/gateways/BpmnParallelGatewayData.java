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
package org.modelio.metamodel.data.bpmn.gateways;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.gateways.BpmnParallelGateway;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnParallelGatewayImpl;
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

@objid ("0002addc-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnParallelGateway.class, factory=BpmnParallelGatewayData.Metadata.ObjectFactory.class)
public class BpmnParallelGatewayData extends BpmnGatewayData {
    @objid ("d25c70f4-66ae-4b1b-9409-500c05b18300")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008aaca0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9057c719-f0cc-4ffc-b24f-2f949843dd90")
        private static SmClass smClass = null;

        @objid ("c576bc9c-67f3-4d63-ad22-869a1078cefe")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnParallelGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b2caf424-33a4-42df-a6fb-53dee858163c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008afc46-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2313dd22-6992-48c4-b297-bb7c27b7ff65")
            public ISmObjectData createData() {
                return new BpmnParallelGatewayData();
            }

            @objid ("a432bc2e-f5b8-47b3-a93a-d329e0859223")
            public SmObjectImpl createImpl() {
                return new BpmnParallelGatewayImpl();
            }

        }

    }

}
