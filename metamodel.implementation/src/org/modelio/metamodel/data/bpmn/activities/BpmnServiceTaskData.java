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
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnServiceTaskImpl;
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

@objid ("00836ee0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnServiceTask.class, factory=BpmnServiceTaskData.Metadata.ObjectFactory.class)
public class BpmnServiceTaskData extends BpmnTaskData {
    @objid ("e792d6c9-7d92-4515-83ee-4e459cdcc818")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("fe458489-7ab5-47a6-8548-27a461c00aa6")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("d60bf21c-e915-414e-9379-8983896d4a03")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("4e29ae28-d440-4775-aa60-bbdf73deaa2a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00636668-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cb7e04e5-128d-48d8-b307-d9f666c89d13")
        private static SmClass smClass = null;

        @objid ("ae629941-47ee-4fda-9b03-6c394adffc10")
        private static SmAttribute ImplementationAtt = null;

        @objid ("aa3c32a5-1ff5-4e0c-a005-7c9181290d9d")
        private static SmDependency CalledOperationDep = null;

        @objid ("b03bb308-9905-44a0-b39a-6c5f965bab75")
        private static SmDependency OperationRefDep = null;

        @objid ("d0b3839a-a06f-45d8-8d7f-98681ce0a6ab")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnServiceTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6ac5bf59-2eb3-46ce-8185-92374b5a76a2")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("b2a10188-d753-4c08-b007-d6a99af9ff6c")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("76318473-d387-493e-94ab-77a852bc413e")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("1d3286c2-3824-4ffe-845d-85604dbb3118")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("828e077c-1743-40c5-9858-2f1e5ea219eb")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("d28498f3-a77e-4ae0-8dbc-27df79f3b2c2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("55958d93-a63b-40be-ae92-60106267d1e3")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("0063a6dc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7e69f4bd-5e2f-43de-8337-599793b1269f")
            public ISmObjectData createData() {
                return new BpmnServiceTaskData();
            }

            @objid ("c01c3444-e1ed-4c1e-b03e-9446700e6f8d")
            public SmObjectImpl createImpl() {
                return new BpmnServiceTaskImpl();
            }

        }

        @objid ("006407b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("6620f9fc-7ed2-4e85-a7a1-574e0daf90c0")
            public Object getValue(ISmObjectData data) {
                return ((BpmnServiceTaskData) data).mImplementation;
            }

            @objid ("a0255247-ff93-4d75-b127-9421f784cbd2")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnServiceTaskData) data).mImplementation = value;
            }

        }

        @objid ("00646914-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("82a5a15e-077e-43ac-a4df-85d90867696c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnServiceTaskData) data).mOperationRef;
            }

            @objid ("3bb0af95-0b50-4753-9abf-56c34585e4a3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnServiceTaskData) data).mOperationRef = value;
            }

            @objid ("d7b416a3-8be2-48b0-a847-003961a89f61")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.CallerDep();
            }

        }

        @objid ("0064dce6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("050bf866-c095-414b-a6fc-ad1aa3192f3d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnServiceTaskData) data).mCalledOperation;
            }

            @objid ("0e92fbae-48cd-4aff-a812-5528a29a259e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnServiceTaskData) data).mCalledOperation = value;
            }

            @objid ("b4ca0a9b-57bd-47ce-9f4c-46b3e1bd9614")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerServiceTaskDep();
            }

        }

    }

}
