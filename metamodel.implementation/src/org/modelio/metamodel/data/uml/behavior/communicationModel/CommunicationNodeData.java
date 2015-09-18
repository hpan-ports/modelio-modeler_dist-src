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
    @objid ("bc8e3f30-2d0f-4220-86c6-d9ea5eb8819e")
    @SmaMetaAttribute(metaName="Selector", type=String.class, smAttributeClass=Metadata.SelectorSmAttribute.class)
     Object mSelector = "";

    @objid ("7f14da41-758c-4da8-bb29-4b3556467a24")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=CommunicationInteractionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("7b7f7c67-ebf1-408d-ab24-ac56fd07ca6b")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("4354eecd-cc78-413e-8d45-4ad2fc7eb430")
    @SmaMetaAssociation(metaName="Started", typeDataClass=CommunicationChannelData.class, min=0, max=-1, smAssociationClass=Metadata.StartedSmDependency.class, component = true, istodelete = true)
     List<SmObjectImpl> mStarted = null;

    @objid ("1928f487-ee91-4bdc-9c5c-ca93811a2498")
    @SmaMetaAssociation(metaName="Ended", typeDataClass=CommunicationChannelData.class, min=0, max=-1, smAssociationClass=Metadata.EndedSmDependency.class, istodelete = true)
     List<SmObjectImpl> mEnded = null;

    @objid ("cbbe6be6-0d0c-4e77-9212-99358b122d22")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050be1e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("78c5a246-a185-478d-92e0-7f3dddcdead8")
        private static SmClass smClass = null;

        @objid ("c65f8172-ffcd-468b-a6af-08b54fd664dd")
        private static SmAttribute SelectorAtt = null;

        @objid ("bbacfe91-6e13-4d14-8fdf-6867b22057ec")
        private static SmDependency OwnerDep = null;

        @objid ("d1329488-5377-400b-966b-39ddf46105cc")
        private static SmDependency RepresentedDep = null;

        @objid ("0f51e767-dcd2-4aab-9272-cf205695df65")
        private static SmDependency StartedDep = null;

        @objid ("4b0a602c-6009-4b84-98cc-6e18b6237afb")
        private static SmDependency EndedDep = null;

        @objid ("e833ed89-476f-4e49-8160-076a6a173572")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c6bfdd6b-fbfc-4462-8566-286e38b0e554")
        public static SmAttribute SelectorAtt() {
            if (SelectorAtt == null) {
            	SelectorAtt = classof().getAttributeDef("Selector");
            }
            return SelectorAtt;
        }

        @objid ("c85c1d6a-b637-419e-bdd0-8cef872ec58e")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("b2cdd31f-a15c-4965-bbcb-2a19cd0d2c37")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("7389eebf-50d2-40db-b6f3-7e9e9862d624")
        public static SmDependency StartedDep() {
            if (StartedDep == null) {
            	StartedDep = classof().getDependencyDef("Started");
            }
            return StartedDep;
        }

        @objid ("06152f1d-e600-4d00-beba-a51614966087")
        public static SmDependency EndedDep() {
            if (EndedDep == null) {
            	EndedDep = classof().getDependencyDef("Ended");
            }
            return EndedDep;
        }

        @objid ("6f6d389f-13cd-481e-b430-4cc569cb6255")
        public static SmDependency getEndedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndedDep;
        }

        @objid ("88ed50a7-42bb-4e56-a0c3-9b4385d5a3a5")
        public static SmAttribute getSelectorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectorAtt;
        }

        @objid ("510ec6c6-85e9-4147-8287-0bf081f5dc04")
        public static SmDependency getStartedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartedDep;
        }

        @objid ("1194065d-c7ca-4245-acc0-78c96159f81e")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("9500232d-d72e-475e-a084-f6ec359db8a7")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("b83e6a54-0b1e-4f2e-8fbc-790a70e6864d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0050ff00-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3846b29b-70d3-4f01-8a06-cab2990ef59d")
            public ISmObjectData createData() {
                return new CommunicationNodeData();
            }

            @objid ("f322e432-ac19-493c-bd89-e4a8551cedfd")
            public SmObjectImpl createImpl() {
                return new CommunicationNodeImpl();
            }

        }

        @objid ("005160ee-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SelectorSmAttribute extends SmAttribute {
            @objid ("e5b80931-0319-4919-b63b-f06f6aaa1d2b")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationNodeData) data).mSelector;
            }

            @objid ("e02b4a77-2918-4dbf-8f31-f786865e2142")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationNodeData) data).mSelector = value;
            }

        }

        @objid ("0051d042-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("6ca40c3b-41d0-48c2-ad4b-6f28c44aa9c0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationNodeData) data).mOwner;
            }

            @objid ("ce37aa3c-25fc-4919-9e6e-a75f2e1cd6cd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationNodeData) data).mOwner = value;
            }

            @objid ("3e2fc3a7-0a41-49e6-8ed5-59a0e87464f0")
            @Override
            public SmDependency getSymetric() {
                return CommunicationInteractionData.Metadata.OwnedDep();
            }

        }

        @objid ("00524cd4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("55a9351e-9e21-4f67-975a-95a0fbcac9f0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationNodeData) data).mRepresented;
            }

            @objid ("66ccde91-5017-4106-986a-26e99434bdd6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationNodeData) data).mRepresented = value;
            }

            @objid ("0395f46a-f2dd-48b9-b193-1e7625aee174")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentedCommunicationNodeDep();
            }

        }

        @objid ("0052c1f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StartedSmDependency extends SmMultipleDependency {
            @objid ("58293756-46aa-4f22-a4c9-8d42a5299cb1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationNodeData)data).mStarted != null)? ((CommunicationNodeData)data).mStarted:SmMultipleDependency.EMPTY;
            }

            @objid ("1de24027-554c-434b-9be4-94249151e8eb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationNodeData) data).mStarted = new ArrayList<>(initialCapacity);
                return ((CommunicationNodeData) data).mStarted;
            }

            @objid ("ec14dc23-1703-402b-bb8e-e610c02309ea")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.StartDep();
            }

        }

        @objid ("00532820-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EndedSmDependency extends SmMultipleDependency {
            @objid ("52d9b94f-d7f2-43ce-af40-30f02a3c9d87")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationNodeData)data).mEnded != null)? ((CommunicationNodeData)data).mEnded:SmMultipleDependency.EMPTY;
            }

            @objid ("87c5b790-f680-4768-9589-235c5a4a4c0b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationNodeData) data).mEnded = new ArrayList<>(initialCapacity);
                return ((CommunicationNodeData) data).mEnded;
            }

            @objid ("4a9431dc-1ec8-44ec-b5cb-a5391d3fdd7b")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.EndDep();
            }

        }

    }

}
