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
    @objid ("644f0ee0-91b3-4a21-9d40-9c1cbe8bb136")
    @SmaMetaAssociation(metaName="ImplementationRef", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.ImplementationRefSmDependency.class, partof = true)
     SmObjectImpl mImplementationRef;

    @objid ("b71f75eb-2efa-4c5e-a21d-4e6d4e74964e")
    @SmaMetaAssociation(metaName="Operation", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.OperationSmDependency.class, component = true)
     List<SmObjectImpl> mOperation = null;

    @objid ("60cf7128-b8d5-488e-a200-0e3d470bb7af")
    @SmaMetaAssociation(metaName="ParticipantRef", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.ParticipantRefSmDependency.class)
     List<SmObjectImpl> mParticipantRef = null;

    @objid ("6fc8af1e-d7f6-42c4-b9fe-dd5de4662516")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0001b468-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b765b3f8-62b7-4a5a-b35a-193a5d18861a")
        private static SmClass smClass = null;

        @objid ("c37a85a4-79da-48f4-9a4e-5ef8d78d4a79")
        private static SmDependency ImplementationRefDep = null;

        @objid ("2a6640eb-7dc5-4030-9585-eb77b52fb69d")
        private static SmDependency OperationDep = null;

        @objid ("91cb2c10-12ac-4f0a-899a-e95bf3fb7494")
        private static SmDependency ParticipantRefDep = null;

        @objid ("4a562110-af56-456a-8120-f455a68b660f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnInterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("56e9cf72-c59c-4638-a56e-b219ae441edf")
        public static SmDependency ImplementationRefDep() {
            if (ImplementationRefDep == null) {
            	ImplementationRefDep = classof().getDependencyDef("ImplementationRef");
            }
            return ImplementationRefDep;
        }

        @objid ("ce964910-4011-4d7b-8e70-e25a9e1f073c")
        public static SmDependency OperationDep() {
            if (OperationDep == null) {
            	OperationDep = classof().getDependencyDef("Operation");
            }
            return OperationDep;
        }

        @objid ("4ed159da-7d60-4ee8-91c4-f32dcf93ab6a")
        public static SmDependency ParticipantRefDep() {
            if (ParticipantRefDep == null) {
            	ParticipantRefDep = classof().getDependencyDef("ParticipantRef");
            }
            return ParticipantRefDep;
        }

        @objid ("e7d06c6f-367e-4564-bd13-4d206bfc4148")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d581c127-7063-451b-8e1e-90f94f5e78df")
        public static SmDependency getOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationDep;
        }

        @objid ("c5062ec1-fbce-4e4f-bbb4-a355f3c41c51")
        public static SmDependency getParticipantRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantRefDep;
        }

        @objid ("ebfb8d25-47af-4cad-aebb-fc1cf72b2c70")
        public static SmDependency getImplementationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationRefDep;
        }

        @objid ("0001f5cc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e52b95f0-b8b4-41e1-815b-2c0ec9502b1d")
            public ISmObjectData createData() {
                return new BpmnInterfaceData();
            }

            @objid ("27bf17c9-f28e-403c-a531-f492e8601d11")
            public SmObjectImpl createImpl() {
                return new BpmnInterfaceImpl();
            }

        }

        @objid ("0002581e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperationSmDependency extends SmMultipleDependency {
            @objid ("2b222d9f-180d-4db2-bae6-f804bcdc9954")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnInterfaceData)data).mOperation != null)? ((BpmnInterfaceData)data).mOperation:SmMultipleDependency.EMPTY;
            }

            @objid ("97615f9f-082c-4af4-9d22-bb9d978b6f39")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnInterfaceData) data).mOperation = new ArrayList<>(initialCapacity);
                return ((BpmnInterfaceData) data).mOperation;
            }

            @objid ("087ab4d5-2413-44e8-9997-c67c24898d1f")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.BpmnInterfaceRefDep();
            }

        }

        @objid ("0002bffc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementationRefSmDependency extends SmSingleDependency {
            @objid ("6dc86202-498d-4eeb-94af-c2a9006aa3a5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnInterfaceData) data).mImplementationRef;
            }

            @objid ("ac645ab8-df14-45c6-930b-68b879d53bb1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnInterfaceData) data).mImplementationRef = value;
            }

            @objid ("8ab55f3f-cfaf-48e7-b886-94a397c776e1")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnInterfaceRefsDep();
            }

        }

        @objid ("000335a4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParticipantRefSmDependency extends SmMultipleDependency {
            @objid ("8acdc5a2-14d0-406a-8676-bf74b6fe5c74")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnInterfaceData)data).mParticipantRef != null)? ((BpmnInterfaceData)data).mParticipantRef:SmMultipleDependency.EMPTY;
            }

            @objid ("2a7abb55-cf6e-47f8-80d8-5c0a8b1ed5e6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnInterfaceData) data).mParticipantRef = new ArrayList<>(initialCapacity);
                return ((BpmnInterfaceData) data).mParticipantRef;
            }

            @objid ("8165aff2-a262-4953-bb68-b2061d0b4534")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.InterfaceRefsDep();
            }

        }

    }

}
