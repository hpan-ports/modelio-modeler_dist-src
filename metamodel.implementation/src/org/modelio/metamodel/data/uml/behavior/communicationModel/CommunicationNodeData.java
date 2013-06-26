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
    @objid ("2c8222ca-99cc-47d5-bdb0-01586e98d652")
    @SmaMetaAttribute(metaName="Selector", type=String.class, smAttributeClass=Metadata.SelectorSmAttribute.class)
     Object mSelector = "";

    @objid ("fa293045-6fd5-479a-9610-684e31fadd31")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=CommunicationInteractionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("bad24b04-6367-4d03-99e8-1e4e95d69821")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("a54f41e8-72a0-4ed6-a9f3-c2ffd77752c5")
    @SmaMetaAssociation(metaName="Started", typeDataClass=CommunicationChannelData.class, min=0, max=-1, smAssociationClass=Metadata.StartedSmDependency.class, component = true, istodelete = true)
     List<SmObjectImpl> mStarted = null;

    @objid ("8379474e-edf0-4ec5-ab26-78babd7357b1")
    @SmaMetaAssociation(metaName="Ended", typeDataClass=CommunicationChannelData.class, min=0, max=-1, smAssociationClass=Metadata.EndedSmDependency.class, istodelete = true)
     List<SmObjectImpl> mEnded = null;

    @objid ("b8e48045-13da-4b54-8121-13fcfbb10942")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050be1e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5e045141-1528-40a1-a27d-9f8ade40c812")
        private static SmClass smClass = null;

        @objid ("8ce492d0-f0d0-46d4-ad63-0ba3e57e44e0")
        private static SmAttribute SelectorAtt = null;

        @objid ("8a275bf1-dafa-4f2e-b039-ab9988f505be")
        private static SmDependency OwnerDep = null;

        @objid ("15f3eb21-271e-4fc9-9d73-72aa6a832cd7")
        private static SmDependency RepresentedDep = null;

        @objid ("2f5378ec-4f77-422d-9fcf-eb8c64f4d9c4")
        private static SmDependency StartedDep = null;

        @objid ("fd96ce1b-e2c1-4e20-a105-65579d9ed8fa")
        private static SmDependency EndedDep = null;

        @objid ("ffff979b-9d92-451d-bda3-eef80074127c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("23bc361c-b233-4688-b7c7-c2b4f41a29c2")
        public static SmAttribute SelectorAtt() {
            if (SelectorAtt == null) {
            	SelectorAtt = classof().getAttributeDef("Selector");
            }
            return SelectorAtt;
        }

        @objid ("4558dce4-344e-4196-99cc-aef9c28d8a5e")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("0a263699-16eb-4637-9993-8d6896c833b3")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("893075ce-977b-4004-97ca-f9513fcb432c")
        public static SmDependency StartedDep() {
            if (StartedDep == null) {
            	StartedDep = classof().getDependencyDef("Started");
            }
            return StartedDep;
        }

        @objid ("c7b5a7d6-0dc9-49e4-bcd8-bbcf2630da2c")
        public static SmDependency EndedDep() {
            if (EndedDep == null) {
            	EndedDep = classof().getDependencyDef("Ended");
            }
            return EndedDep;
        }

        @objid ("ec6ce82f-ca50-4c16-8ee2-e5463ba41934")
        public static SmDependency getStartedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartedDep;
        }

        @objid ("6ec65581-cefb-4245-8b25-39b5663482e6")
        public static SmAttribute getSelectorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectorAtt;
        }

        @objid ("53c864ca-0692-454e-b888-5ef8cf032f81")
        public static SmDependency getEndedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndedDep;
        }

        @objid ("2ef49763-9193-48f7-ba6d-5dbb78ce43b2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("63f0533d-30cb-432f-8941-5e87c5d46517")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("9ed018e3-dc6c-4333-819d-dc23f7536cf9")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("0050ff00-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("13c0c987-2e7e-47ac-a742-9dc5560b1da6")
            public ISmObjectData createData() {
                return new CommunicationNodeData();
            }

            @objid ("5a0db843-b23d-45b9-a073-2a121db5f2b1")
            public SmObjectImpl createImpl() {
                return new CommunicationNodeImpl();
            }

        }

        @objid ("005160ee-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SelectorSmAttribute extends SmAttribute {
            @objid ("40ec8b9c-e599-4c6c-b1ab-c0de06c31dea")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationNodeData) data).mSelector;
            }

            @objid ("e2ac9689-acb3-46f8-8556-e9093d461639")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationNodeData) data).mSelector = value;
            }

        }

        @objid ("0051d042-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("4713068d-d8a2-4c8e-a1f9-2b5c60753afb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationNodeData) data).mOwner;
            }

            @objid ("2c4f9d7c-923a-4d49-a379-737459bc2a09")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationNodeData) data).mOwner = value;
            }

            @objid ("e47ca254-676b-48ad-ac49-f68339a30935")
            @Override
            public SmDependency getSymetric() {
                return CommunicationInteractionData.Metadata.OwnedDep();
            }

        }

        @objid ("00524cd4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("0c237d21-0605-42f9-b83c-74747bb3b18e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationNodeData) data).mRepresented;
            }

            @objid ("a8ebc6e8-30a0-4432-9119-0a2d27a16ebf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationNodeData) data).mRepresented = value;
            }

            @objid ("16dcf895-fc82-4056-98b1-21684d6a9fb9")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentedCommunicationNodeDep();
            }

        }

        @objid ("0052c1f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StartedSmDependency extends SmMultipleDependency {
            @objid ("0a4f6bc0-482e-4e1f-8202-10d96ddc7f9a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationNodeData)data).mStarted != null)? ((CommunicationNodeData)data).mStarted:SmMultipleDependency.EMPTY;
            }

            @objid ("41136ff4-53b7-4102-a2ba-0d4b6d8afd3f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationNodeData) data).mStarted = new ArrayList<>(initialCapacity);
                return ((CommunicationNodeData) data).mStarted;
            }

            @objid ("9ffbc7ed-e0eb-474d-bd38-c49a27a00e20")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.StartDep();
            }

        }

        @objid ("00532820-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EndedSmDependency extends SmMultipleDependency {
            @objid ("ea6e9f21-adfd-48e3-957f-b90a40b56869")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationNodeData)data).mEnded != null)? ((CommunicationNodeData)data).mEnded:SmMultipleDependency.EMPTY;
            }

            @objid ("6f8bd1aa-b1f4-4dff-9301-0a4b7a962fec")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationNodeData) data).mEnded = new ArrayList<>(initialCapacity);
                return ((CommunicationNodeData) data).mEnded;
            }

            @objid ("11214cbf-146e-4709-b0df-d32e58996f7e")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.EndDep();
            }

        }

    }

}
