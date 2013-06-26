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
package org.modelio.metamodel.data.bpmn.bpmnService;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnInterfaceImpl;
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

@objid ("000e4fac-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnInterface.class, factory=BpmnInterfaceData.Metadata.ObjectFactory.class)
public class BpmnInterfaceData extends BpmnRootElementData {
    @objid ("59ffedc7-ab4b-4cb0-9938-d6f77b7184bf")
    @SmaMetaAssociation(metaName="ImplementationRef", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.ImplementationRefSmDependency.class, partof = true)
     SmObjectImpl mImplementationRef;

    @objid ("be9dd417-fcc0-4595-a552-593c871833c5")
    @SmaMetaAssociation(metaName="Operation", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.OperationSmDependency.class, component = true)
     List<SmObjectImpl> mOperation = null;

    @objid ("a38ef67c-2e7f-4c96-8844-2729b0145f1c")
    @SmaMetaAssociation(metaName="ParticipantRef", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.ParticipantRefSmDependency.class)
     List<SmObjectImpl> mParticipantRef = null;

    @objid ("4b24116f-9eb7-48a4-9813-1a7f182cfaa0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0001b468-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d8073b13-2090-4a85-92e2-05b83ceafe6c")
        private static SmClass smClass = null;

        @objid ("611c1487-71b2-4f8f-9c9b-d67de4388588")
        private static SmDependency ImplementationRefDep = null;

        @objid ("a1d66955-8184-4d7b-9046-78402dd1414b")
        private static SmDependency OperationDep = null;

        @objid ("ddf4fc7f-a227-413f-9e00-74647435b57d")
        private static SmDependency ParticipantRefDep = null;

        @objid ("6c9ff1fa-8e8a-4649-9b3d-a1359a39498a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnInterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0a05f92e-5305-4f42-90f9-33208e5ca626")
        public static SmDependency ImplementationRefDep() {
            if (ImplementationRefDep == null) {
            	ImplementationRefDep = classof().getDependencyDef("ImplementationRef");
            }
            return ImplementationRefDep;
        }

        @objid ("b4b142e1-55c5-44a3-9a56-b67663fb894f")
        public static SmDependency OperationDep() {
            if (OperationDep == null) {
            	OperationDep = classof().getDependencyDef("Operation");
            }
            return OperationDep;
        }

        @objid ("3d14eddf-c557-46a5-b48a-5d2930d67171")
        public static SmDependency ParticipantRefDep() {
            if (ParticipantRefDep == null) {
            	ParticipantRefDep = classof().getDependencyDef("ParticipantRef");
            }
            return ParticipantRefDep;
        }

        @objid ("3adb2899-d493-4e50-9274-6f852f958355")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0ff12b62-b74b-47d8-baad-44c67190f192")
        public static SmDependency getImplementationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationRefDep;
        }

        @objid ("027a141d-454c-4d10-9b03-0296b926019b")
        public static SmDependency getOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationDep;
        }

        @objid ("226706b3-ff24-457d-ba61-9827066dd9f9")
        public static SmDependency getParticipantRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantRefDep;
        }

        @objid ("0001f5cc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8bafba3c-4cea-40c9-9dba-3835cbf5c9ff")
            public ISmObjectData createData() {
                return new BpmnInterfaceData();
            }

            @objid ("069959a4-948d-4d3c-b7ef-e09ab8e21f39")
            public SmObjectImpl createImpl() {
                return new BpmnInterfaceImpl();
            }

        }

        @objid ("0002581e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperationSmDependency extends SmMultipleDependency {
            @objid ("cdde8003-42e6-4b70-858c-9cf1f8f98c1b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnInterfaceData)data).mOperation != null)? ((BpmnInterfaceData)data).mOperation:SmMultipleDependency.EMPTY;
            }

            @objid ("ac5d22ed-2044-442b-af12-5515976ff5be")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnInterfaceData) data).mOperation = new ArrayList<>(initialCapacity);
                return ((BpmnInterfaceData) data).mOperation;
            }

            @objid ("c9583fcd-5c43-432a-b3aa-aad94463d685")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.BpmnInterfaceRefDep();
            }

        }

        @objid ("0002bffc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementationRefSmDependency extends SmSingleDependency {
            @objid ("644b9b7e-28ef-45f9-ad73-267f4ada0f3e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnInterfaceData) data).mImplementationRef;
            }

            @objid ("1e89907a-32c8-442b-a8f7-736934197b7d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnInterfaceData) data).mImplementationRef = value;
            }

            @objid ("70b9a791-e648-4218-95ab-65fd95dd8613")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnInterfaceRefsDep();
            }

        }

        @objid ("000335a4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParticipantRefSmDependency extends SmMultipleDependency {
            @objid ("1be49281-1f3e-445a-90b0-2de5319a59f8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnInterfaceData)data).mParticipantRef != null)? ((BpmnInterfaceData)data).mParticipantRef:SmMultipleDependency.EMPTY;
            }

            @objid ("c8a12f2b-74bd-4ec3-b4ac-023a7c4e17b2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnInterfaceData) data).mParticipantRef = new ArrayList<>(initialCapacity);
                return ((BpmnInterfaceData) data).mParticipantRef;
            }

            @objid ("24d098e4-d80d-481d-9656-b9cd13333f03")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.InterfaceRefsDep();
            }

        }

    }

}
