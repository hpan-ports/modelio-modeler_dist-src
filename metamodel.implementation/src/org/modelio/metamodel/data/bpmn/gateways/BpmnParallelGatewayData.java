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
    @objid ("10a4fd33-54b5-4449-baeb-f1a47ced7afd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008aaca0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b89ac819-4cee-4be1-b4fe-c6fadccb8356")
        private static SmClass smClass = null;

        @objid ("c749ca1c-63b0-4052-86be-95e065885c2d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnParallelGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a4a6036b-e543-437e-a390-a9252002bfb6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008afc46-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("42699b6d-ff30-4911-88cf-ee45f1c25348")
            public ISmObjectData createData() {
                return new BpmnParallelGatewayData();
            }

            @objid ("50710dff-0cfd-4e90-9501-732307740b95")
            public SmObjectImpl createImpl() {
                return new BpmnParallelGatewayImpl();
            }

        }

    }

}
