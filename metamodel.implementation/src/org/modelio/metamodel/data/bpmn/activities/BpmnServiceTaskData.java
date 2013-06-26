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
    @objid ("1d23e3e5-087e-4393-8b2d-8b453c8d3d63")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("ef444d49-66ab-45f4-ba54-470395860cc4")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("2cf61bfe-f87f-414f-9c2f-4923c6408b1e")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("cb1efd20-acfc-4901-82c1-304284ca5a68")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00636668-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("76e930ea-448e-48b7-ad0d-717157d0601d")
        private static SmClass smClass = null;

        @objid ("bbbee97c-1d35-4de0-8a50-2636c65c2bd1")
        private static SmAttribute ImplementationAtt = null;

        @objid ("f9688a4c-a878-45b4-bb86-7d4af2f48eb1")
        private static SmDependency CalledOperationDep = null;

        @objid ("d037431e-562f-43d6-a427-e69f67e580cd")
        private static SmDependency OperationRefDep = null;

        @objid ("27479c9b-2ecc-4cec-a995-aac56b51fcb9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnServiceTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("60c86b94-a7e8-49ce-b60e-9f4d04399226")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("21222e15-2ddb-469a-8e8a-97f52667cc53")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("e6b8673f-484b-46e0-84b8-1c24e441f126")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("9371031e-7233-43b7-af7b-fcab4e02d959")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("e3cd8a07-1f2c-48e7-ab57-4b6f37a8d235")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("eb1b6da1-2c3d-4c41-9378-092807251698")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("ed1abd8b-83da-4356-8743-d12f82a583f7")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("0063a6dc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dc04b754-f3c6-4fa3-9396-ab3da7e6c8a1")
            public ISmObjectData createData() {
                return new BpmnServiceTaskData();
            }

            @objid ("14277390-ec34-4af3-a66d-b75ec8d643a6")
            public SmObjectImpl createImpl() {
                return new BpmnServiceTaskImpl();
            }

        }

        @objid ("006407b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("56f66443-ec1a-4962-8e7c-fc299924a387")
            public Object getValue(ISmObjectData data) {
                return ((BpmnServiceTaskData) data).mImplementation;
            }

            @objid ("8213d6e3-0994-420f-9672-c9070286aa2e")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnServiceTaskData) data).mImplementation = value;
            }

        }

        @objid ("00646914-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("e947a843-67ce-478a-8c80-a3f53732f1ee")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnServiceTaskData) data).mOperationRef;
            }

            @objid ("f646fa65-9a76-4f33-972e-d21e94156b26")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnServiceTaskData) data).mOperationRef = value;
            }

            @objid ("f1d71719-b2f2-46f5-8e39-55f892076a12")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.CallerDep();
            }

        }

        @objid ("0064dce6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("d8559d13-3bd5-4579-9e43-08a9bd8b5355")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnServiceTaskData) data).mCalledOperation;
            }

            @objid ("73958425-519c-4d25-863f-a376b6680f49")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnServiceTaskData) data).mCalledOperation = value;
            }

            @objid ("f1f3ab6e-9ea4-4d8a-b067-f12b6db33f76")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerServiceTaskDep();
            }

        }

    }

}
