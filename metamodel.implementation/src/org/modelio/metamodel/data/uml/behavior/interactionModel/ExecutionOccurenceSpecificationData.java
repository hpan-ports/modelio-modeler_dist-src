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
    @objid ("1fed1cea-5ffe-464c-9b65-8010f9205826")
    @SmaMetaAssociation(metaName="Finished", typeDataClass=ExecutionSpecificationData.class, min=0, max=1, smAssociationClass=Metadata.FinishedSmDependency.class, istodelete = true)
     SmObjectImpl mFinished;

    @objid ("5dc01ea2-fe6d-4369-be45-9499715145e5")
    @SmaMetaAssociation(metaName="Started", typeDataClass=ExecutionSpecificationData.class, min=0, max=1, smAssociationClass=Metadata.StartedSmDependency.class, partof = true, istodelete = true)
     SmObjectImpl mStarted;

    @objid ("ba72caa1-7aa4-424e-868f-921bc75d06d7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004d57e2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e769df61-37bc-41d4-8435-7a6ac59cdb9b")
        private static SmClass smClass = null;

        @objid ("68b50f1f-779a-48cc-bead-9edd582fe83c")
        private static SmDependency FinishedDep = null;

        @objid ("9d96313e-9313-4cf8-9469-7897200b322f")
        private static SmDependency StartedDep = null;

        @objid ("3f7fd8ef-b0fe-4a95-93cb-4d8e6727cb02")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExecutionOccurenceSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7c7c1f0f-77dc-45b7-b099-eb5a19854384")
        public static SmDependency FinishedDep() {
            if (FinishedDep == null) {
            	FinishedDep = classof().getDependencyDef("Finished");
            }
            return FinishedDep;
        }

        @objid ("c3b8de53-937a-478e-9790-460c6452ea61")
        public static SmDependency StartedDep() {
            if (StartedDep == null) {
            	StartedDep = classof().getDependencyDef("Started");
            }
            return StartedDep;
        }

        @objid ("22f94ce5-ffc5-4d83-b30d-d7171baee6a9")
        public static SmDependency getStartedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartedDep;
        }

        @objid ("b0dbf62f-f6c2-4435-96d2-ddc4fbaf44d8")
        public static SmDependency getFinishedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FinishedDep;
        }

        @objid ("9349749e-1310-4ea9-85ef-8dd45fc96dd3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("004d99f0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ec3e80f7-c9d6-476e-96b9-9b602b641954")
            public ISmObjectData createData() {
                return new ExecutionOccurenceSpecificationData();
            }

            @objid ("b98f961c-7314-45c0-bf50-2c2a9c0c71f1")
            public SmObjectImpl createImpl() {
                return new ExecutionOccurenceSpecificationImpl();
            }

        }

        @objid ("004dfcba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class StartedSmDependency extends SmSingleDependency {
            @objid ("3bc92baf-9103-44b8-a74c-c6aafa96d269")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionOccurenceSpecificationData) data).mStarted;
            }

            @objid ("d0ad2635-3d74-493b-9e87-c3304d511cc5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionOccurenceSpecificationData) data).mStarted = value;
            }

            @objid ("63d07ceb-20f4-4723-8232-97432796c953")
            @Override
            public SmDependency getSymetric() {
                return ExecutionSpecificationData.Metadata.StartDep();
            }

        }

        @objid ("004e7b90-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FinishedSmDependency extends SmSingleDependency {
            @objid ("bf6b573a-1316-469a-a36f-562bbfed8a2c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionOccurenceSpecificationData) data).mFinished;
            }

            @objid ("664310cd-e953-4781-bf5e-4a60d2a605dd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionOccurenceSpecificationData) data).mFinished = value;
            }

            @objid ("2664bca4-9acb-4beb-bfad-9e59553e9bb5")
            @Override
            public SmDependency getSymetric() {
                return ExecutionSpecificationData.Metadata.FinishDep();
            }

        }

    }

}
