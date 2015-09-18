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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnUserTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnUserTaskImpl;
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

@objid ("0086919c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnUserTask.class, factory=BpmnUserTaskData.Metadata.ObjectFactory.class)
public class BpmnUserTaskData extends BpmnTaskData {
    @objid ("8d2e4e0c-6341-4cae-b4ec-d5cc9215f45b")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("9e323b6f-dd36-4397-9a31-ec1a1c278247")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00923290-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("29cbf2d1-2816-44ec-8a67-6b2670f821f0")
        private static SmClass smClass = null;

        @objid ("9deb94c4-3f48-4794-8f3c-2c45e9c64187")
        private static SmAttribute ImplementationAtt = null;

        @objid ("69919701-6d74-4844-8fea-ddb698377066")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnUserTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7dd6cd5c-7e1b-496c-8d1b-30e222e21c39")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("b146a6ab-4af3-4a85-8a32-1c15237cac32")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("2897f6bf-84ff-41d5-ac34-e24e373b4f96")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00927fb6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e3d0316b-8494-4c3e-8291-4e046c0a8f3b")
            public ISmObjectData createData() {
                return new BpmnUserTaskData();
            }

            @objid ("be64818c-ae0d-41af-880e-c905f92f3594")
            public SmObjectImpl createImpl() {
                return new BpmnUserTaskImpl();
            }

        }

        @objid ("0092e366-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("549a3a90-dbdc-4527-95b7-37146a6a8d84")
            public Object getValue(ISmObjectData data) {
                return ((BpmnUserTaskData) data).mImplementation;
            }

            @objid ("f37ec4b8-bbd4-4cc8-b405-3eff2071803a")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnUserTaskData) data).mImplementation = value;
            }

        }

    }

}
