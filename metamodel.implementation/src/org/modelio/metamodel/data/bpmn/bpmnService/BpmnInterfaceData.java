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
    @objid ("4e68a034-f63a-41e4-bc03-398399998e39")
    @SmaMetaAssociation(metaName="ImplementationRef", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.ImplementationRefSmDependency.class, partof = true)
     SmObjectImpl mImplementationRef;

    @objid ("c6c30561-666a-4f62-83f0-1cc47aa853e4")
    @SmaMetaAssociation(metaName="Operation", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.OperationSmDependency.class, component = true)
     List<SmObjectImpl> mOperation = null;

    @objid ("1a4ee139-a62a-4ab3-b4ff-9138332ae837")
    @SmaMetaAssociation(metaName="ParticipantRef", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.ParticipantRefSmDependency.class)
     List<SmObjectImpl> mParticipantRef = null;

    @objid ("cfaf6656-d698-44c9-a0e5-890cf44386bb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0001b468-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c1197681-020e-4951-9dfb-dc69c6432ce6")
        private static SmClass smClass = null;

        @objid ("9d583602-aa80-41d4-a370-2d13fead512e")
        private static SmDependency ImplementationRefDep = null;

        @objid ("862ab517-5ad7-4461-8aaf-9f9b95a621d4")
        private static SmDependency OperationDep = null;

        @objid ("9bf47d5d-9ff3-4204-94ca-f7f04e501d42")
        private static SmDependency ParticipantRefDep = null;

        @objid ("f9e74024-bd4f-45d8-91bc-a802134bc607")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnInterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b8653d0b-c4ec-4e65-bd3e-8b2fd580094e")
        public static SmDependency ImplementationRefDep() {
            if (ImplementationRefDep == null) {
            	ImplementationRefDep = classof().getDependencyDef("ImplementationRef");
            }
            return ImplementationRefDep;
        }

        @objid ("2cb79daa-a016-44b8-920a-206fd3e1f665")
        public static SmDependency OperationDep() {
            if (OperationDep == null) {
            	OperationDep = classof().getDependencyDef("Operation");
            }
            return OperationDep;
        }

        @objid ("5aa5bf34-6b1e-4fbc-81a3-0149917004a5")
        public static SmDependency ParticipantRefDep() {
            if (ParticipantRefDep == null) {
            	ParticipantRefDep = classof().getDependencyDef("ParticipantRef");
            }
            return ParticipantRefDep;
        }

        @objid ("cdcaf5eb-064f-4125-aad9-24307b082866")
        public static SmDependency getParticipantRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantRefDep;
        }

        @objid ("dbef5076-e4a4-48bf-9c3c-44e61ba9d3a0")
        public static SmDependency getOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationDep;
        }

        @objid ("9660b329-f0d1-45ec-a564-88f11b66815a")
        public static SmDependency getImplementationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationRefDep;
        }

        @objid ("3ddb2d42-9062-4488-b5b6-3074c4ec1391")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0001f5cc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4eda069a-a608-4ad7-9289-e527be055b1c")
            public ISmObjectData createData() {
                return new BpmnInterfaceData();
            }

            @objid ("44e6dd8c-1772-4de0-9190-04c7704ada27")
            public SmObjectImpl createImpl() {
                return new BpmnInterfaceImpl();
            }

        }

        @objid ("0002581e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperationSmDependency extends SmMultipleDependency {
            @objid ("0303750b-26ed-42d4-9cfe-89786c3f6809")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnInterfaceData)data).mOperation != null)? ((BpmnInterfaceData)data).mOperation:SmMultipleDependency.EMPTY;
            }

            @objid ("becc1893-57c2-4e20-ac42-879bfe0bd006")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnInterfaceData) data).mOperation = new ArrayList<>(initialCapacity);
                return ((BpmnInterfaceData) data).mOperation;
            }

            @objid ("949e6860-8cc6-4fea-8fdf-cacbf9422de0")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.BpmnInterfaceRefDep();
            }

        }

        @objid ("0002bffc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementationRefSmDependency extends SmSingleDependency {
            @objid ("7cb2a86c-9fbb-493e-b978-a66147da0b4f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnInterfaceData) data).mImplementationRef;
            }

            @objid ("1bb578bc-622a-4a7f-bba0-86703c94bbb9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnInterfaceData) data).mImplementationRef = value;
            }

            @objid ("d6060b0d-fa2d-4eb4-893c-39db2193f7b3")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnInterfaceRefsDep();
            }

        }

        @objid ("000335a4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParticipantRefSmDependency extends SmMultipleDependency {
            @objid ("3888de60-2a12-49c2-af7e-6691716a512a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnInterfaceData)data).mParticipantRef != null)? ((BpmnInterfaceData)data).mParticipantRef:SmMultipleDependency.EMPTY;
            }

            @objid ("8458062e-5c49-4834-a472-e87adfb66d57")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnInterfaceData) data).mParticipantRef = new ArrayList<>(initialCapacity);
                return ((BpmnInterfaceData) data).mParticipantRef;
            }

            @objid ("adba8e7d-9218-4c5b-980e-ff8a40c9c8d3")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.InterfaceRefsDep();
            }

        }

    }

}
