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
    @objid ("bb9f6a77-2f18-4605-ab53-bf68e9c863a6")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("259bb6c0-0776-4eea-b659-942b5b7157be")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00923290-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c469ed3a-9d4c-438b-b3a2-aac0f3f034d3")
        private static SmClass smClass = null;

        @objid ("7b92e0f6-dd79-44aa-9dc2-1ac48f28b4a3")
        private static SmAttribute ImplementationAtt = null;

        @objid ("8da7bda9-c1fc-44b6-b7ea-d6b4ec4a15f0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnUserTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5dd62c01-315b-47a4-b3e2-d992bbe1bd03")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("f31c6318-f742-4204-9e76-b043bb015c0e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("03c026c9-5c38-44dd-a209-84623ce54d91")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("00927fb6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1416a8ae-2cee-4372-96a2-cbccf9a0cc50")
            public ISmObjectData createData() {
                return new BpmnUserTaskData();
            }

            @objid ("9e42599b-025e-401e-8f5d-2982abea4e53")
            public SmObjectImpl createImpl() {
                return new BpmnUserTaskImpl();
            }

        }

        @objid ("0092e366-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("967315c4-bed7-45c5-bdab-0fddc4033815")
            public Object getValue(ISmObjectData data) {
                return ((BpmnUserTaskData) data).mImplementation;
            }

            @objid ("501ce571-6586-4716-8abb-206f4f5b89e2")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnUserTaskData) data).mImplementation = value;
            }

        }

    }

}
