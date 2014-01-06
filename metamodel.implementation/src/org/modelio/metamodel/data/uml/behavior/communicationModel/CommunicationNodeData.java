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
package org.modelio.metamodel.data.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationChannelData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationInteractionData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationNodeImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
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

@objid ("005adeee-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CommunicationNode.class, factory=CommunicationNodeData.Metadata.ObjectFactory.class)
public class CommunicationNodeData extends ModelElementData {
    @objid ("f3f7d8e5-eece-493d-8f3e-d21003e75a2b")
    @SmaMetaAttribute(metaName="Selector", type=String.class, smAttributeClass=Metadata.SelectorSmAttribute.class)
     Object mSelector = "";

    @objid ("1615b816-720d-4d43-aa19-add8272282fd")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=CommunicationInteractionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("cb31675f-305a-4c77-abe9-1c78cbb36345")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("0add10d5-d2e3-4606-bb01-80b63deb791e")
    @SmaMetaAssociation(metaName="Started", typeDataClass=CommunicationChannelData.class, min=0, max=-1, smAssociationClass=Metadata.StartedSmDependency.class, component = true, istodelete = true)
     List<SmObjectImpl> mStarted = null;

    @objid ("e3d0cedb-a629-4bab-bd12-bef6d393d4c0")
    @SmaMetaAssociation(metaName="Ended", typeDataClass=CommunicationChannelData.class, min=0, max=-1, smAssociationClass=Metadata.EndedSmDependency.class, istodelete = true)
     List<SmObjectImpl> mEnded = null;

    @objid ("71c4111e-4502-48e2-b53e-4890bc04f863")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050be1e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e80b0923-1cc9-48a2-8e4e-e6ef42959840")
        private static SmClass smClass = null;

        @objid ("7f73e5ab-292b-40b3-aa23-622cc894836b")
        private static SmAttribute SelectorAtt = null;

        @objid ("7e089e8d-c10b-4ead-920a-0ab5c1691bf8")
        private static SmDependency OwnerDep = null;

        @objid ("4fb44640-48d9-43ce-ac1c-c086de285291")
        private static SmDependency RepresentedDep = null;

        @objid ("5de0cb20-6b3d-4656-a711-488b84194fe0")
        private static SmDependency StartedDep = null;

        @objid ("5a90bbf3-bf88-4ae4-b15d-71d7ee2b504c")
        private static SmDependency EndedDep = null;

        @objid ("4e85f70e-0214-4202-9e85-e3ad7fceb0de")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5384ff78-074a-47e8-b794-7fcec77dcaa5")
        public static SmAttribute SelectorAtt() {
            if (SelectorAtt == null) {
            	SelectorAtt = classof().getAttributeDef("Selector");
            }
            return SelectorAtt;
        }

        @objid ("d033494b-1707-4f52-84ca-31a33f393062")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("16657d38-3376-4c51-b7a5-ad2f586fc82c")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("be9fe415-a90f-407c-9d8f-51b0fffd160d")
        public static SmDependency StartedDep() {
            if (StartedDep == null) {
            	StartedDep = classof().getDependencyDef("Started");
            }
            return StartedDep;
        }

        @objid ("46ceeb77-ebdf-420e-994b-23d9328c3793")
        public static SmDependency EndedDep() {
            if (EndedDep == null) {
            	EndedDep = classof().getDependencyDef("Ended");
            }
            return EndedDep;
        }

        @objid ("868c6554-345e-4af7-9475-47fbf86808e1")
        public static SmDependency getStartedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartedDep;
        }

        @objid ("06e6c36e-c1b0-4b87-be94-d6ce05af9e22")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("0a460fcf-7208-4635-bf70-8b18c4c8f967")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("94922357-3aea-43e4-a7d9-37ad554d0336")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("4529e8bc-7cec-40f2-8392-f6fba4270dcf")
        public static SmAttribute getSelectorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectorAtt;
        }

        @objid ("9afb03da-427f-497e-9705-d217e59c2ef7")
        public static SmDependency getEndedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndedDep;
        }

        @objid ("0050ff00-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e8e52f3d-89e8-40ca-9624-59c4246c00b7")
            public ISmObjectData createData() {
                return new CommunicationNodeData();
            }

            @objid ("e5256420-26da-44d4-b814-46cf037f7cba")
            public SmObjectImpl createImpl() {
                return new CommunicationNodeImpl();
            }

        }

        @objid ("005160ee-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SelectorSmAttribute extends SmAttribute {
            @objid ("32d49448-603d-4dc1-a080-7c3b6cefcac5")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationNodeData) data).mSelector;
            }

            @objid ("e57ccab8-f4b2-4f38-9c53-8ec889fa324a")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationNodeData) data).mSelector = value;
            }

        }

        @objid ("0051d042-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("53bf5552-290d-4b8e-ad98-ded96433abbb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationNodeData) data).mOwner;
            }

            @objid ("cf3d6748-7b03-4fd9-b676-0292709e4d92")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationNodeData) data).mOwner = value;
            }

            @objid ("8f6724bb-f3b4-4604-a3b6-936a8e8fd8e1")
            @Override
            public SmDependency getSymetric() {
                return CommunicationInteractionData.Metadata.OwnedDep();
            }

        }

        @objid ("00524cd4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("2ac812d3-37c4-44b5-9732-430bb59f1964")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationNodeData) data).mRepresented;
            }

            @objid ("224453e6-e1a0-41bf-82d2-7f64e4b29e93")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationNodeData) data).mRepresented = value;
            }

            @objid ("cd2c8f83-d3b0-4e4c-92f9-2a5a64beabf9")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentedCommunicationNodeDep();
            }

        }

        @objid ("0052c1f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StartedSmDependency extends SmMultipleDependency {
            @objid ("480265cc-43e8-48d9-9d2b-9bcf479700eb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationNodeData)data).mStarted != null)? ((CommunicationNodeData)data).mStarted:SmMultipleDependency.EMPTY;
            }

            @objid ("f2b7837f-e4f9-4322-8291-07df230abc4f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationNodeData) data).mStarted = new ArrayList<>(initialCapacity);
                return ((CommunicationNodeData) data).mStarted;
            }

            @objid ("1a86943d-2d8a-45f0-bb9d-0f6d5ff69e10")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.StartDep();
            }

        }

        @objid ("00532820-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EndedSmDependency extends SmMultipleDependency {
            @objid ("21423a55-c91a-44b9-9a01-9be7517349ca")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationNodeData)data).mEnded != null)? ((CommunicationNodeData)data).mEnded:SmMultipleDependency.EMPTY;
            }

            @objid ("6ae08dac-e0ce-4a2a-8ac3-742eeaad0fa6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationNodeData) data).mEnded = new ArrayList<>(initialCapacity);
                return ((CommunicationNodeData) data).mEnded;
            }

            @objid ("756d949a-1711-4c9c-a3ba-e3cbc439b049")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.EndDep();
            }

        }

    }

}
