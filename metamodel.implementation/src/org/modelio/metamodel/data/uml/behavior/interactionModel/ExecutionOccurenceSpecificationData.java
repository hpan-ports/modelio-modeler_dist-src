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
    @objid ("784385d0-af06-4829-934c-de41af7021ff")
    @SmaMetaAssociation(metaName="Finished", typeDataClass=ExecutionSpecificationData.class, min=0, max=1, smAssociationClass=Metadata.FinishedSmDependency.class, istodelete = true)
     SmObjectImpl mFinished;

    @objid ("bcc4a47e-f1e9-4351-b3a9-c00fe6d45ae9")
    @SmaMetaAssociation(metaName="Started", typeDataClass=ExecutionSpecificationData.class, min=0, max=1, smAssociationClass=Metadata.StartedSmDependency.class, partof = true, istodelete = true)
     SmObjectImpl mStarted;

    @objid ("bd8f00b6-674e-402d-85a9-dd8962aa5788")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004d57e2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("87af8b2c-841b-4797-a545-818a3d7c3acf")
        private static SmClass smClass = null;

        @objid ("0e4d0238-9279-42cf-9da6-ec0ff4f4f837")
        private static SmDependency FinishedDep = null;

        @objid ("79f976c6-e388-46d1-8790-3a0e03364138")
        private static SmDependency StartedDep = null;

        @objid ("8de6b9f5-4ce8-4c9d-96ac-be71f6a0d90d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExecutionOccurenceSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bc9c8183-25f5-408d-aed8-c81592709dbc")
        public static SmDependency FinishedDep() {
            if (FinishedDep == null) {
            	FinishedDep = classof().getDependencyDef("Finished");
            }
            return FinishedDep;
        }

        @objid ("5f767ceb-2410-4107-9d42-1d79575803a4")
        public static SmDependency StartedDep() {
            if (StartedDep == null) {
            	StartedDep = classof().getDependencyDef("Started");
            }
            return StartedDep;
        }

        @objid ("7d247321-cf92-4ec8-9966-0ba8206342b5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("68c700ee-0043-4749-b5ac-7a0a3639620b")
        public static SmDependency getStartedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartedDep;
        }

        @objid ("795a3b9a-36d3-41e9-a56c-7b9d01d1fb71")
        public static SmDependency getFinishedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FinishedDep;
        }

        @objid ("004d99f0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("057f800a-dce4-4910-8123-8d1350fc529c")
            public ISmObjectData createData() {
                return new ExecutionOccurenceSpecificationData();
            }

            @objid ("e23e6cb0-a317-4cdc-b880-3481144c0854")
            public SmObjectImpl createImpl() {
                return new ExecutionOccurenceSpecificationImpl();
            }

        }

        @objid ("004dfcba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class StartedSmDependency extends SmSingleDependency {
            @objid ("a89db68c-198f-4e30-a035-0cfa9716c9ba")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionOccurenceSpecificationData) data).mStarted;
            }

            @objid ("71da2f4a-9954-4ac9-920c-77d03dca7b25")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionOccurenceSpecificationData) data).mStarted = value;
            }

            @objid ("d8ae6ae8-59d1-4067-b9be-fe84eb492187")
            @Override
            public SmDependency getSymetric() {
                return ExecutionSpecificationData.Metadata.StartDep();
            }

        }

        @objid ("004e7b90-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FinishedSmDependency extends SmSingleDependency {
            @objid ("618ea7af-9651-40c4-ad84-aa5fc341c9c1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionOccurenceSpecificationData) data).mFinished;
            }

            @objid ("dcf0d369-0595-43e4-b321-2b0773d426d4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionOccurenceSpecificationData) data).mFinished = value;
            }

            @objid ("88b3f5e3-7589-47e1-8efb-80c307f774dd")
            @Override
            public SmDependency getSymetric() {
                return ExecutionSpecificationData.Metadata.FinishDep();
            }

        }

    }

}
