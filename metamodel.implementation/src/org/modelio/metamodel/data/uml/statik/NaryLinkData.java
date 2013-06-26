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
    @objid ("ede04d71-f36c-4bce-8a8a-9f9b423a341f")
    @SmaMetaAssociation(metaName="NaryLinkEnd", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryLinkEndSmDependency.class, sharedComponent = true)
     List<SmObjectImpl> mNaryLinkEnd = null;

    @objid ("ec440710-fcea-4e8f-9ed0-e95fda31b92b")
    @SmaMetaAssociation(metaName="Model", typeDataClass=NaryAssociationData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("36543d4b-4ad9-4fdc-b58a-818288572a1c")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("fa257dc0-8bd9-4854-8aac-f6c51c5136fd")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=CommunicationChannelData.class, min=0, max=-1, smAssociationClass=Metadata.SentSmDependency.class)
     List<SmObjectImpl> mSent = null;

    @objid ("b47462b6-f5d6-4d67-99ea-623239d5ba12")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008ef2c4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1a638009-c193-467a-870a-e5dff6b2654e")
        private static SmClass smClass = null;

        @objid ("0a0f22ef-849a-4a6b-ad2f-5633d8526943")
        private static SmDependency NaryLinkEndDep = null;

        @objid ("1444ad69-dd26-4b63-94fc-3478e6a3b754")
        private static SmDependency ModelDep = null;

        @objid ("5a622489-fa66-482d-a555-2d5a0bc2b8ee")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("98366525-2dbc-4f28-b6a0-889b8b4c25ae")
        private static SmDependency SentDep = null;

        @objid ("9cd7f59f-d62f-47fb-b91b-2bab833564f9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryLinkData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("67fa21c0-3e26-473f-96fa-7a3280ab708f")
        public static SmDependency NaryLinkEndDep() {
            if (NaryLinkEndDep == null) {
            	NaryLinkEndDep = classof().getDependencyDef("NaryLinkEnd");
            }
            return NaryLinkEndDep;
        }

        @objid ("db3eaeac-4eae-4135-94c1-a899f238a455")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("71fadf99-cae7-47dc-918a-c294500ce67b")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("61535be7-fdb6-4080-8299-29188cf6491c")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("e86354ff-4b67-4388-ae3a-3f0b555c343f")
        public static SmDependency getNaryLinkEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryLinkEndDep;
        }

        @objid ("8d17596f-abd1-4d19-9e1c-178d57213c4e")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("5bc71ea6-4237-4829-9804-5fdc78bf0222")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2b938166-6ffd-4478-b3be-5b3038be2978")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("0ca4e57e-fb6d-43ba-a499-4ddf2a0b9888")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("008f3284-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3af4bd8a-b35b-46df-98bd-451a9796f0b2")
            public ISmObjectData createData() {
                return new NaryLinkData();
            }

            @objid ("799d414b-3d59-4b81-8ecd-edf9cc783db2")
            public SmObjectImpl createImpl() {
                return new NaryLinkImpl();
            }

        }

        @objid ("008f94ea-c4c5-1fd8-97fe-001ec947cd2a")
        public static class NaryLinkEndSmDependency extends SmMultipleDependency {
            @objid ("272caaa7-7f34-43b4-84f4-8472df445823")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryLinkData)data).mNaryLinkEnd != null)? ((NaryLinkData)data).mNaryLinkEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("47e00814-f306-4059-a370-5d2d9f84c187")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryLinkData) data).mNaryLinkEnd = new ArrayList<>(initialCapacity);
                return ((NaryLinkData) data).mNaryLinkEnd;
            }

            @objid ("c30cda16-25f8-42db-8798-f2c9217f8399")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.NaryLinkDep();
            }

        }

        @objid ("008ff64c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("a31dcad3-4037-45d8-a37d-645f1d471cab")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkData) data).mModel;
            }

            @objid ("0346b5ca-bc6a-4888-8a27-f5bdf67d19f1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkData) data).mModel = value;
            }

            @objid ("c3b0df61-bb71-4453-b52a-dff390751de3")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationData.Metadata.OccurenceDep();
            }

        }

        @objid ("00551928-17f4-10a1-88a0-001ec947cd2a")
        public static class SentSmDependency extends SmMultipleDependency {
            @objid ("6a33f6d2-4e65-426a-acd6-72748c80e1e6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryLinkData)data).mSent != null)? ((NaryLinkData)data).mSent:SmMultipleDependency.EMPTY;
            }

            @objid ("5be87250-3064-438a-bdfd-73a27655d761")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryLinkData) data).mSent = new ArrayList<>(initialCapacity);
                return ((NaryLinkData) data).mSent;
            }

            @objid ("4e6053c0-6d4e-44e0-bae2-fbcaa635cfc3")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.NaryChannelDep();
            }

        }

        @objid ("0055c3e6-17f4-10a1-88a0-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("0b6148c6-eeda-4d1e-bcff-fcdde8a1a2e4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryLinkData)data).mRealizedInformationFlow != null)? ((NaryLinkData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("553c956d-5822-4524-9c28-f8d5ad82d8b9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryLinkData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((NaryLinkData) data).mRealizedInformationFlow;
            }

            @objid ("6843e5ca-15e5-4746-a3ad-6205777086fe")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingNaryLinkDep();
            }

        }

    }

}
