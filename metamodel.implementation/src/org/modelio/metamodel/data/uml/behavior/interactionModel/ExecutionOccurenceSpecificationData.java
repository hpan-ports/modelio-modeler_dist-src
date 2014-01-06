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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.ExecutionSpecificationData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.ExecutionOccurenceSpecificationImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;
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

@objid ("00449c74-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExecutionOccurenceSpecification.class, factory=ExecutionOccurenceSpecificationData.Metadata.ObjectFactory.class)
public class ExecutionOccurenceSpecificationData extends MessageEndData {
    @objid ("87d953b6-7e26-4f57-b0c8-61d94203f1fc")
    @SmaMetaAssociation(metaName="Finished", typeDataClass=ExecutionSpecificationData.class, min=0, max=1, smAssociationClass=Metadata.FinishedSmDependency.class, istodelete = true)
     SmObjectImpl mFinished;

    @objid ("1c0bcd3f-39b1-44a8-9753-6aaa627f8004")
    @SmaMetaAssociation(metaName="Started", typeDataClass=ExecutionSpecificationData.class, min=0, max=1, smAssociationClass=Metadata.StartedSmDependency.class, partof = true, istodelete = true)
     SmObjectImpl mStarted;

    @objid ("50c015f4-c2e1-47cf-9c29-9a3114b94d47")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004d57e2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d67f6b80-02e4-412a-8287-b9fdf9325286")
        private static SmClass smClass = null;

        @objid ("8ab4b57e-e21a-417c-9d8d-77a093db2950")
        private static SmDependency FinishedDep = null;

        @objid ("1f3ce11c-c155-4b8b-8387-765de4c4e41c")
        private static SmDependency StartedDep = null;

        @objid ("0114a27d-2272-4a8e-85f5-efa399df86af")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExecutionOccurenceSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("66fc13ce-bcfe-4dba-9062-38ee4a86cc46")
        public static SmDependency FinishedDep() {
            if (FinishedDep == null) {
            	FinishedDep = classof().getDependencyDef("Finished");
            }
            return FinishedDep;
        }

        @objid ("e144195c-e543-4ad4-b29a-ff371fd574a6")
        public static SmDependency StartedDep() {
            if (StartedDep == null) {
            	StartedDep = classof().getDependencyDef("Started");
            }
            return StartedDep;
        }

        @objid ("02e2bfbe-8d28-40f4-bbf1-95ff3f4975c1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d02aa9f1-d1bb-491e-9e3d-7534d5095d9e")
        public static SmDependency getStartedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartedDep;
        }

        @objid ("d5e690be-4476-4860-a85d-c396689002a2")
        public static SmDependency getFinishedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FinishedDep;
        }

        @objid ("004d99f0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("13f36e60-4b66-4ee5-b2c1-d717dd27a0a4")
            public ISmObjectData createData() {
                return new ExecutionOccurenceSpecificationData();
            }

            @objid ("3c741f29-f4be-4ac3-83b7-29cb58e3e00c")
            public SmObjectImpl createImpl() {
                return new ExecutionOccurenceSpecificationImpl();
            }

        }

        @objid ("004dfcba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class StartedSmDependency extends SmSingleDependency {
            @objid ("4fffcebd-9b5a-438e-9f8e-4236458c61d7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionOccurenceSpecificationData) data).mStarted;
            }

            @objid ("588b6289-c767-4d66-a0fb-6d70b23f9c61")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionOccurenceSpecificationData) data).mStarted = value;
            }

            @objid ("f5bf6722-754e-4dd0-bd2c-b65d4daeae26")
            @Override
            public SmDependency getSymetric() {
                return ExecutionSpecificationData.Metadata.StartDep();
            }

        }

        @objid ("004e7b90-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FinishedSmDependency extends SmSingleDependency {
            @objid ("5ba7db38-b2d7-4b7a-a0c9-1ffaeb9db812")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionOccurenceSpecificationData) data).mFinished;
            }

            @objid ("550aae23-1367-40c6-a1df-34a04cca7208")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionOccurenceSpecificationData) data).mFinished = value;
            }

            @objid ("f04a206c-62df-454d-b2a7-57f88a9cafd9")
            @Override
            public SmDependency getSymetric() {
                return ExecutionSpecificationData.Metadata.FinishDep();
            }

        }

    }

}
