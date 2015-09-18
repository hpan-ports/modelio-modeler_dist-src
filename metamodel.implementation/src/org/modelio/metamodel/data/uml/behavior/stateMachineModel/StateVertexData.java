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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.RegionData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.TransitionData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateVertexImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
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

@objid ("0054f060-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StateVertex.class, factory=StateVertexData.Metadata.ObjectFactory.class)
public abstract class StateVertexData extends ModelElementData {
    @objid ("8d9d7d32-d3a5-4941-9555-431bafcccc46")
    @SmaMetaAssociation(metaName="OutGoing", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.OutGoingSmDependency.class, component = true)
     List<SmObjectImpl> mOutGoing = null;

    @objid ("c06aac48-9a94-424f-ad8f-5d7417031721")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mIncoming = null;

    @objid ("4b11cbb1-e94f-4673-942d-1cbf7c562cf8")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=RegionData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class)
     SmObjectImpl mParent;

    @objid ("5002044c-bf19-4565-9b41-38b9b787d9dd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000edb5c-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3fd1a724-d245-4520-8d81-bc27d4b0af65")
        private static SmClass smClass = null;

        @objid ("f2e99fc7-a687-4ecf-9147-e1c31ca715bd")
        private static SmDependency OutGoingDep = null;

        @objid ("e6047e6f-2f09-48bc-9696-2dc75ecf2881")
        private static SmDependency IncomingDep = null;

        @objid ("8c7d998f-d882-486e-8b25-835c1f9ba4d7")
        private static SmDependency ParentDep = null;

        @objid ("0996a0c4-70d5-4570-b383-5c8a3af724c6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateVertexData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("59b63ab0-8ff4-4520-b133-b48923eb83bb")
        public static SmDependency OutGoingDep() {
            if (OutGoingDep == null) {
            	OutGoingDep = classof().getDependencyDef("OutGoing");
            }
            return OutGoingDep;
        }

        @objid ("f0e2d945-b519-4517-b0ae-5c1df7a8b65b")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("dcc731d7-f62c-4175-9b69-eaab1b3b1983")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("331adb69-ff65-4f9a-8e14-a96d8b91b6b1")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("dfcf9274-ca35-481a-9382-df805af2823f")
        public static SmDependency getOutGoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutGoingDep;
        }

        @objid ("c46b79d0-991a-4b8f-96bc-d4d6f333fb32")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("34e3fc0d-5379-4e48-94a7-2f10d85cfcfd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000f1db0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d2e4b491-e5d4-4a8c-9ca2-0949024db306")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("be5ed171-3908-4893-961d-05960aaf75b6")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("000f8106-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("36a8e8e3-a174-405d-bdaa-2d1f2f7787ef")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateVertexData)data).mIncoming != null)? ((StateVertexData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("f23f68d7-1ba5-49fc-a391-21e63edec76e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateVertexData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((StateVertexData) data).mIncoming;
            }

            @objid ("af09384c-33bc-4816-bea1-1b049d422dd9")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.TargetDep();
            }

        }

        @objid ("000fe51a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutGoingSmDependency extends SmMultipleDependency {
            @objid ("3ba47727-4636-46d4-aca5-2ad98bb3b071")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateVertexData)data).mOutGoing != null)? ((StateVertexData)data).mOutGoing:SmMultipleDependency.EMPTY;
            }

            @objid ("7f1af18c-e482-4c4c-9128-9e24d20df4fa")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateVertexData) data).mOutGoing = new ArrayList<>(initialCapacity);
                return ((StateVertexData) data).mOutGoing;
            }

            @objid ("3182415b-3aaa-4a51-8b4b-2aeec8d47af6")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.SourceDep();
            }

        }

        @objid ("00104a14-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("5f673f05-c0ec-4884-8927-a86bf8102aef")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StateVertexData) data).mParent;
            }

            @objid ("89a9c198-b41c-4175-8980-3c9b09f4bf77")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StateVertexData) data).mParent = value;
            }

            @objid ("dcec9436-615d-4dc6-a4f3-6896d1044d6f")
            @Override
            public SmDependency getSymetric() {
                return RegionData.Metadata.SubDep();
            }

        }

    }

}
