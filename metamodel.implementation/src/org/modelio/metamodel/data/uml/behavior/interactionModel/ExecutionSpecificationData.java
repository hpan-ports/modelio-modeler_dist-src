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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.ExecutionOccurenceSpecificationData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.ExecutionSpecificationImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
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

@objid ("004518ac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExecutionSpecification.class, factory=ExecutionSpecificationData.Metadata.ObjectFactory.class)
public class ExecutionSpecificationData extends InteractionFragmentData {
    @objid ("6f1c8e79-bdef-422f-bdcb-4c9aa2d47ab7")
    @SmaMetaAssociation(metaName="Finish", typeDataClass=ExecutionOccurenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.FinishSmDependency.class, partof = true)
     SmObjectImpl mFinish;

    @objid ("e8853141-a97b-4e7f-8972-4892beb9fc7b")
    @SmaMetaAssociation(metaName="Start", typeDataClass=ExecutionOccurenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.StartSmDependency.class)
     SmObjectImpl mStart;

    @objid ("c1bd4b46-1687-4dcf-91c3-6c001fe69a80")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0048687c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7000365e-89e4-4bbe-af8d-bd9a2af6a96e")
        private static SmClass smClass = null;

        @objid ("b64d0252-7d04-4a7e-a696-7f2060475a37")
        private static SmDependency FinishDep = null;

        @objid ("65d1315f-a1a0-4ab2-aeb9-47d5138aa2b6")
        private static SmDependency StartDep = null;

        @objid ("6396f05b-bb70-4d71-ad3f-50ef0a9da1c5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExecutionSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a9a31dd9-1046-4845-ab9c-e59da035ba89")
        public static SmDependency FinishDep() {
            if (FinishDep == null) {
            	FinishDep = classof().getDependencyDef("Finish");
            }
            return FinishDep;
        }

        @objid ("c9b53980-d024-477f-92e0-87a87d0ce06b")
        public static SmDependency StartDep() {
            if (StartDep == null) {
            	StartDep = classof().getDependencyDef("Start");
            }
            return StartDep;
        }

        @objid ("a2090fd1-08cb-44b2-b913-ad2ccbc5ffd2")
        public static SmDependency getFinishDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FinishDep;
        }

        @objid ("237685a2-bb56-40a9-be59-3d961f517d50")
        public static SmDependency getStartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartDep;
        }

        @objid ("d63c9959-1754-4036-817b-da4d0bd37def")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0048ab02-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("42114db1-2c07-4971-994e-76e49a47eb72")
            public ISmObjectData createData() {
                return new ExecutionSpecificationData();
            }

            @objid ("6de600f6-d26f-4d7a-8e45-0128e84ae084")
            public SmObjectImpl createImpl() {
                return new ExecutionSpecificationImpl();
            }

        }

        @objid ("00490dae-c4c3-1fd8-97fe-001ec947cd2a")
        public static class StartSmDependency extends SmSingleDependency {
            @objid ("e09383f1-c2ad-47f6-b021-0fda01832e8a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionSpecificationData) data).mStart;
            }

            @objid ("038df990-b2d0-4509-9a91-36c96c40f919")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionSpecificationData) data).mStart = value;
            }

            @objid ("e96fc52b-b454-421e-808d-928c12a3eed1")
            @Override
            public SmDependency getSymetric() {
                return ExecutionOccurenceSpecificationData.Metadata.StartedDep();
            }

        }

        @objid ("004983ba-c4c3-1fd8-97fe-001ec947cd2a")
        public static class FinishSmDependency extends SmSingleDependency {
            @objid ("e95159ac-785c-43c0-8925-d94f86a2f21a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionSpecificationData) data).mFinish;
            }

            @objid ("784b05bc-20c6-48a5-9d65-f8ac6f2d364f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionSpecificationData) data).mFinish = value;
            }

            @objid ("1a1339b6-3cde-4ae3-8bcc-9897a295a789")
            @Override
            public SmDependency getSymetric() {
                return ExecutionOccurenceSpecificationData.Metadata.FinishedDep();
            }

        }

    }

}
