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
    @objid ("ef45f1c6-7aa4-450c-98bd-b3db0bc08980")
    @SmaMetaAssociation(metaName="Finish", typeDataClass=ExecutionOccurenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.FinishSmDependency.class, partof = true)
     SmObjectImpl mFinish;

    @objid ("841b1ba6-3cb1-44f3-a5c0-8ba8be0eba20")
    @SmaMetaAssociation(metaName="Start", typeDataClass=ExecutionOccurenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.StartSmDependency.class)
     SmObjectImpl mStart;

    @objid ("b42813ba-6fd2-4ae0-8b81-6e9fcfa0f003")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0048687c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ccfcd963-0b22-4dfc-aa5b-3f3ad1c74142")
        private static SmClass smClass = null;

        @objid ("a680f27b-b0d4-4a75-bbf4-77f479b2b27a")
        private static SmDependency FinishDep = null;

        @objid ("7ece43a9-e9e3-4439-abb8-9b2e8071a1a4")
        private static SmDependency StartDep = null;

        @objid ("d498641f-127a-4e7f-b4ef-f00b5dac51c1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExecutionSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("138677e8-dc07-497f-941f-05b325a4a1c8")
        public static SmDependency FinishDep() {
            if (FinishDep == null) {
            	FinishDep = classof().getDependencyDef("Finish");
            }
            return FinishDep;
        }

        @objid ("c3a58f06-27b7-4e55-b8ff-91ef4ef1a25f")
        public static SmDependency StartDep() {
            if (StartDep == null) {
            	StartDep = classof().getDependencyDef("Start");
            }
            return StartDep;
        }

        @objid ("862e3ff6-8fb0-4287-b7b2-e726eb9da0c7")
        public static SmDependency getFinishDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FinishDep;
        }

        @objid ("9a6ca794-7bd1-43e1-8dc8-26cc64781074")
        public static SmDependency getStartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartDep;
        }

        @objid ("bf3bbb99-bfb1-49a9-bd8c-1d1b70a9d639")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0048ab02-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("02e36d1f-7818-442c-900d-546b4ff81abc")
            public ISmObjectData createData() {
                return new ExecutionSpecificationData();
            }

            @objid ("caef8361-f70f-41a5-bc16-e056f05dd55c")
            public SmObjectImpl createImpl() {
                return new ExecutionSpecificationImpl();
            }

        }

        @objid ("00490dae-c4c3-1fd8-97fe-001ec947cd2a")
        public static class StartSmDependency extends SmSingleDependency {
            @objid ("5b8d0dce-8272-4641-b248-2558aa398786")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionSpecificationData) data).mStart;
            }

            @objid ("8da28fef-6844-41e0-a80d-d15f5313032a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionSpecificationData) data).mStart = value;
            }

            @objid ("6418a539-c319-43f4-9031-1834a4bd68f0")
            @Override
            public SmDependency getSymetric() {
                return ExecutionOccurenceSpecificationData.Metadata.StartedDep();
            }

        }

        @objid ("004983ba-c4c3-1fd8-97fe-001ec947cd2a")
        public static class FinishSmDependency extends SmSingleDependency {
            @objid ("acef3ac4-f48a-4429-a686-6480b7862c5e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionSpecificationData) data).mFinish;
            }

            @objid ("cf9fc272-04d9-4605-aec4-9be12aa351da")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionSpecificationData) data).mFinish = value;
            }

            @objid ("7adf1da0-daf0-43fe-be5a-e2a5cf5dc0d2")
            @Override
            public SmDependency getSymetric() {
                return ExecutionOccurenceSpecificationData.Metadata.FinishedDep();
            }

        }

    }

}
