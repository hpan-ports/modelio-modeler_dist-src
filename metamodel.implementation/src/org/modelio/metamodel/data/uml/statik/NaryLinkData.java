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
    @objid ("68a8f758-84a8-4907-9d27-3df6eb326a5d")
    @SmaMetaAssociation(metaName="NaryLinkEnd", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryLinkEndSmDependency.class, sharedComponent = true)
     List<SmObjectImpl> mNaryLinkEnd = null;

    @objid ("2d768fb8-1d3c-4b6d-a863-2f20ef7606ca")
    @SmaMetaAssociation(metaName="Model", typeDataClass=NaryAssociationData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("5a0876b6-e2cd-49ce-b3f4-0fed7583e255")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("0c8614b2-c20e-416c-8782-012eb78931bb")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=CommunicationChannelData.class, min=0, max=-1, smAssociationClass=Metadata.SentSmDependency.class)
     List<SmObjectImpl> mSent = null;

    @objid ("4eff5340-6570-4659-b711-3a896c422ec6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008ef2c4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a5e1543b-7732-4909-b33f-044dd6853b1b")
        private static SmClass smClass = null;

        @objid ("70fea785-b667-48be-b929-f9d3d2a0580a")
        private static SmDependency NaryLinkEndDep = null;

        @objid ("6c154c68-1c6f-44af-9ba4-8caa9b8e06ff")
        private static SmDependency ModelDep = null;

        @objid ("f0326225-88fd-427a-841c-77ffba9f56ec")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("a117d248-cd4e-4791-add1-398d72b4905c")
        private static SmDependency SentDep = null;

        @objid ("bafb4267-6bd5-4231-a022-fd902a246da8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryLinkData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("13953c8b-dac8-4594-8f38-d34ca5de1538")
        public static SmDependency NaryLinkEndDep() {
            if (NaryLinkEndDep == null) {
            	NaryLinkEndDep = classof().getDependencyDef("NaryLinkEnd");
            }
            return NaryLinkEndDep;
        }

        @objid ("4ee4ada5-cbf1-4054-813e-6b98d4c1c030")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("bb7b2366-36d2-43ec-80c1-13e2b6db7be2")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("a4530961-63ff-4fd2-8dec-26d1d5445e03")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("e840a412-70a4-43c2-a7ba-61eeedd02c73")
        public static SmDependency getNaryLinkEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryLinkEndDep;
        }

        @objid ("b4807870-04b6-48fa-aba4-6b63a85b1b34")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("41fbb751-35af-459f-8a12-808de617a75e")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("863008e0-6e9a-4083-a333-4ef637c4af45")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("85cdfdaa-270e-46e8-84fc-4901619e8042")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008f3284-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cb342be2-3d4f-4a82-9e60-248fa794ad30")
            public ISmObjectData createData() {
                return new NaryLinkData();
            }

            @objid ("b3fb6116-43e2-43e8-8c98-7b234f8e0de6")
            public SmObjectImpl createImpl() {
                return new NaryLinkImpl();
            }

        }

        @objid ("008f94ea-c4c5-1fd8-97fe-001ec947cd2a")
        public static class NaryLinkEndSmDependency extends SmMultipleDependency {
            @objid ("d14cba40-009c-45d5-946b-25c23b0a375c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryLinkData)data).mNaryLinkEnd != null)? ((NaryLinkData)data).mNaryLinkEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("0dba4112-423f-4fb6-9d65-a7beb3d39dd6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryLinkData) data).mNaryLinkEnd = new ArrayList<>(initialCapacity);
                return ((NaryLinkData) data).mNaryLinkEnd;
            }

            @objid ("4b403fa5-33e6-4f9a-bad2-05972fd4ef2a")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.NaryLinkDep();
            }

        }

        @objid ("008ff64c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("c1ca9be3-dec4-4ba4-badc-7b96dbc5c542")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkData) data).mModel;
            }

            @objid ("11635994-f491-4384-9a63-213ba5cf7cfa")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkData) data).mModel = value;
            }

            @objid ("90ebd364-2c22-418b-a213-b128078a127a")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationData.Metadata.OccurenceDep();
            }

        }

        @objid ("00551928-17f4-10a1-88a0-001ec947cd2a")
        public static class SentSmDependency extends SmMultipleDependency {
            @objid ("e7bd2b07-7afe-4241-ae33-59fb4b3d20c1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryLinkData)data).mSent != null)? ((NaryLinkData)data).mSent:SmMultipleDependency.EMPTY;
            }

            @objid ("8ffd9d09-5f34-4d7a-9c8d-45379b347954")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryLinkData) data).mSent = new ArrayList<>(initialCapacity);
                return ((NaryLinkData) data).mSent;
            }

            @objid ("cce1cc85-1da7-4608-9bff-5b626ea4a1d5")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.NaryChannelDep();
            }

        }

        @objid ("0055c3e6-17f4-10a1-88a0-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("097c6177-a5d8-4894-9c61-b8d76a915888")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryLinkData)data).mRealizedInformationFlow != null)? ((NaryLinkData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("2ef60cef-ccd9-46f2-ac5e-2e1b9ee81be4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryLinkData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((NaryLinkData) data).mRealizedInformationFlow;
            }

            @objid ("3f712463-96da-4a4e-8425-29ba51f3deda")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingNaryLinkDep();
            }

        }

    }

}
