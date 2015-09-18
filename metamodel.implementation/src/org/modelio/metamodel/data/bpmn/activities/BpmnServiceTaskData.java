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
    @objid ("a7557c68-5f85-4d0a-aa48-8262d0a80e73")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("c2dd13f6-4d51-4762-80fa-664f5da08a26")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("e85888d5-f83a-4ee6-ab4b-e14f27fea7cc")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("f1855edc-d456-4dd8-b5c7-71c6ea06e519")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00636668-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("15206e6e-40c6-4236-96e1-44164bf0b1e9")
        private static SmClass smClass = null;

        @objid ("db58e8b8-3b9d-4ce9-addc-c58fabd58ea6")
        private static SmAttribute ImplementationAtt = null;

        @objid ("0211b86e-8a47-44ed-b0f1-bedd89fe4130")
        private static SmDependency CalledOperationDep = null;

        @objid ("3da22012-0940-49a5-88fd-a26f369a3cd8")
        private static SmDependency OperationRefDep = null;

        @objid ("1ef65c79-5f74-4b28-9329-7a3979101933")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnServiceTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("efcebff5-cfff-477f-acf5-dfbf37ca4f2a")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("d722cf02-7666-4b72-a05c-f522f3fdab47")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("4bcb2a64-f253-470b-8b64-561e44a4f408")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("00399f78-64ac-4080-a66d-20b3a8e82066")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("9262bea6-0ef0-4472-a616-ac8f835b29ec")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d5e9b0f8-cc3f-4e01-bb7b-4949a74fa830")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("2e73fb70-b84c-4614-8db8-1513d7bc7fd6")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("0063a6dc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c9ab432e-c236-4fb2-9834-fbda03ccce07")
            public ISmObjectData createData() {
                return new BpmnServiceTaskData();
            }

            @objid ("5e35c987-67a5-449f-bdcc-1030bedff1f8")
            public SmObjectImpl createImpl() {
                return new BpmnServiceTaskImpl();
            }

        }

        @objid ("006407b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("e14dc8ad-0551-4f65-a7e9-24cb500fdaea")
            public Object getValue(ISmObjectData data) {
                return ((BpmnServiceTaskData) data).mImplementation;
            }

            @objid ("cbbe4135-0251-4dd2-a4b1-8ea62e7fbcc9")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnServiceTaskData) data).mImplementation = value;
            }

        }

        @objid ("00646914-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("4668d1f8-fb45-4e78-aa91-f7637fe8df52")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnServiceTaskData) data).mOperationRef;
            }

            @objid ("36834332-0a6f-47be-8fe2-7a0560720a08")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnServiceTaskData) data).mOperationRef = value;
            }

            @objid ("87cdcd27-bd7f-4864-826b-87c80121f965")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.CallerDep();
            }

        }

        @objid ("0064dce6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("c0f19a52-5c07-47a4-8460-ee0672e898fe")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnServiceTaskData) data).mCalledOperation;
            }

            @objid ("a8b1768a-2762-4a84-9600-851a0655a778")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnServiceTaskData) data).mCalledOperation = value;
            }

            @objid ("a1b52a6b-1f85-4e40-9ab8-c5899e4d7cc6")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerServiceTaskDep();
            }

        }

    }

}
