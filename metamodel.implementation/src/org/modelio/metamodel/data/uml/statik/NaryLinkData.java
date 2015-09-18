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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationChannelData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.NaryAssociationData;
import org.modelio.metamodel.data.uml.statik.NaryLinkEndData;
import org.modelio.metamodel.impl.uml.statik.NaryLinkImpl;
import org.modelio.metamodel.uml.statik.NaryLink;
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

@objid ("0022bc4e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NaryLink.class, factory=NaryLinkData.Metadata.ObjectFactory.class)
public class NaryLinkData extends ModelElementData {
    @objid ("0444d640-c42d-4e9f-b717-adcb32b6e543")
    @SmaMetaAssociation(metaName="NaryLinkEnd", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryLinkEndSmDependency.class, sharedComponent = true)
     List<SmObjectImpl> mNaryLinkEnd = null;

    @objid ("2844bd2a-3660-4ae3-8cfd-09a2d9765362")
    @SmaMetaAssociation(metaName="Model", typeDataClass=NaryAssociationData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("7ebf9519-936f-4d28-83de-ed09c99d8be1")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("d64425c3-69b8-4c48-9382-2489d15b7356")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=CommunicationChannelData.class, min=0, max=-1, smAssociationClass=Metadata.SentSmDependency.class)
     List<SmObjectImpl> mSent = null;

    @objid ("5cf46245-1470-4440-953c-ac0c39e198a8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008ef2c4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5d839b70-be40-4abf-86f5-9020b5363b64")
        private static SmClass smClass = null;

        @objid ("494b903d-4193-4069-ab68-f2b61c504a7f")
        private static SmDependency NaryLinkEndDep = null;

        @objid ("a3f83e02-3bf4-4ca3-97ac-ccbb76182b88")
        private static SmDependency ModelDep = null;

        @objid ("e40ebb85-9053-42a7-a537-f11bbe1efea8")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("d70dc469-0e10-4bfb-a0ee-a48ff0d3737f")
        private static SmDependency SentDep = null;

        @objid ("7fb91775-14a2-48c8-8ff3-6993ca58ce41")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryLinkData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7ec191c3-1e42-4893-ae7b-61d4bfed00e1")
        public static SmDependency NaryLinkEndDep() {
            if (NaryLinkEndDep == null) {
            	NaryLinkEndDep = classof().getDependencyDef("NaryLinkEnd");
            }
            return NaryLinkEndDep;
        }

        @objid ("0265a7fd-3e7a-4f44-8891-cb0d4065cba1")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("d4ccd06b-59b9-4a25-92e9-b39e2b1ac15f")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("a9041e1b-4eb8-4c28-9fba-730b07dafd52")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("9d7cb46d-573b-4bfa-a1f7-f838aba73685")
        public static SmDependency getNaryLinkEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryLinkEndDep;
        }

        @objid ("4a96e0b8-70a0-4318-9b4c-dba4db002236")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("ab8ef67d-11e0-4687-bb23-68019c1cb0e7")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("69bc4a5c-8381-45dd-98f3-153be1dac101")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d4bd9dba-426d-4bc5-8179-abf201086d68")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("008f3284-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dfc92757-80cb-4667-83eb-95fca5f41c9b")
            public ISmObjectData createData() {
                return new NaryLinkData();
            }

            @objid ("d13c573b-c46e-47d6-a437-bf46a648e19d")
            public SmObjectImpl createImpl() {
                return new NaryLinkImpl();
            }

        }

        @objid ("008f94ea-c4c5-1fd8-97fe-001ec947cd2a")
        public static class NaryLinkEndSmDependency extends SmMultipleDependency {
            @objid ("bf95990b-d780-44ef-a9f7-ac18e09e2bd3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryLinkData)data).mNaryLinkEnd != null)? ((NaryLinkData)data).mNaryLinkEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("1168f7cb-911a-42c3-87b9-1345eac5f9d4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryLinkData) data).mNaryLinkEnd = new ArrayList<>(initialCapacity);
                return ((NaryLinkData) data).mNaryLinkEnd;
            }

            @objid ("55c602db-e593-4c72-a1c2-d7a90c9f5a64")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.NaryLinkDep();
            }

        }

        @objid ("008ff64c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("72ba5185-ed3d-4938-ab6b-e4a00e3cad93")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkData) data).mModel;
            }

            @objid ("0b21d327-969d-4df7-9723-c4443c0d13da")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkData) data).mModel = value;
            }

            @objid ("8b393878-432e-4e9f-aca0-cfd6866817aa")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationData.Metadata.OccurenceDep();
            }

        }

        @objid ("00551928-17f4-10a1-88a0-001ec947cd2a")
        public static class SentSmDependency extends SmMultipleDependency {
            @objid ("7dc0e1dd-a222-4257-8a5a-2659562eb937")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryLinkData)data).mSent != null)? ((NaryLinkData)data).mSent:SmMultipleDependency.EMPTY;
            }

            @objid ("c21662d2-a130-4fc6-a563-51ebb8db739b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryLinkData) data).mSent = new ArrayList<>(initialCapacity);
                return ((NaryLinkData) data).mSent;
            }

            @objid ("c38611ba-4dcd-4061-aaca-cfb932323c7a")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.NaryChannelDep();
            }

        }

        @objid ("0055c3e6-17f4-10a1-88a0-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("575d732b-f7f8-4935-bab3-a9f6652554c9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryLinkData)data).mRealizedInformationFlow != null)? ((NaryLinkData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("6e4038d1-2cdd-499f-99a9-de43ae32e4e3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryLinkData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((NaryLinkData) data).mRealizedInformationFlow;
            }

            @objid ("946aa9f9-874b-4972-98df-cfab794a5a42")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingNaryLinkDep();
            }

        }

    }

}
