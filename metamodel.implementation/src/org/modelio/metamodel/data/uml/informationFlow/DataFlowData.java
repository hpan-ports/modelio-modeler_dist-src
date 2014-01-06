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
package org.modelio.metamodel.data.uml.informationFlow;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.impl.uml.informationFlow.DataFlowImpl;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
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

@objid ("0064a956-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DataFlow.class, factory=DataFlowData.Metadata.ObjectFactory.class)
public class DataFlowData extends ModelElementData {
    @objid ("b032efcb-0bd7-43be-b8eb-a360e2966a7a")
    @SmaMetaAssociation(metaName="Destination", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.DestinationSmDependency.class, partof = true)
     SmObjectImpl mDestination;

    @objid ("28a1fa3a-dbd7-4162-8171-12d7223f1393")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OriginSmDependency.class)
     SmObjectImpl mOrigin;

    @objid ("37e43d21-22bd-43e4-b12f-7c33bc5e9673")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("7740d07f-95fc-41b2-969c-c356ab96e0fb")
    @SmaMetaAssociation(metaName="SModel", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SModelSmDependency.class, partof = true)
     SmObjectImpl mSModel;

    @objid ("ec167320-a050-4df1-a9a5-216b5120175f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006103dc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("96d15b09-0de6-4bbd-82e6-dab38cd7d19e")
        private static SmClass smClass = null;

        @objid ("88ad2011-da28-4828-8d14-6237c2cb1402")
        private static SmDependency DestinationDep = null;

        @objid ("b7a09d53-099d-4f61-82c7-ed72fa1be402")
        private static SmDependency OriginDep = null;

        @objid ("ec4327b4-dfd1-462e-8442-5b3a621c3e70")
        private static SmDependency OwnerDep = null;

        @objid ("b1a10698-8c6d-4635-a184-b8c4376c25bf")
        private static SmDependency SModelDep = null;

        @objid ("7e6011fd-56db-4415-a612-e908c3a2f472")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DataFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a24f734e-52fd-43cd-bfd0-6e37a8ed7358")
        public static SmDependency DestinationDep() {
            if (DestinationDep == null) {
            	DestinationDep = classof().getDependencyDef("Destination");
            }
            return DestinationDep;
        }

        @objid ("ae6c9430-c4ce-4b8e-91e1-13c7a7ef780d")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("1282016c-f33d-48a7-93d8-f43b022aaaa7")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("c60d4cae-6b98-46b3-b8bd-ec5556d55cca")
        public static SmDependency SModelDep() {
            if (SModelDep == null) {
            	SModelDep = classof().getDependencyDef("SModel");
            }
            return SModelDep;
        }

        @objid ("fd9b7641-37cf-46d5-83a3-d2757ff72f3d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("204a577e-eb44-414d-a718-c8fcfbe6547e")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("e70082a9-ee33-4d1b-9585-0912bcbd5919")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("a830504e-8e5c-44be-9751-4c497e90e9c0")
        public static SmDependency getDestinationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DestinationDep;
        }

        @objid ("ae133e88-a31a-414d-beae-13c275285d28")
        public static SmDependency getSModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SModelDep;
        }

        @objid ("00614504-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7c724e02-2e94-4958-a880-a7f9797a5c63")
            public ISmObjectData createData() {
                return new DataFlowData();
            }

            @objid ("c803eec8-f9fe-40f1-ab9d-0bd21e1e9920")
            public SmObjectImpl createImpl() {
                return new DataFlowImpl();
            }

        }

        @objid ("0061a666-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DestinationSmDependency extends SmSingleDependency {
            @objid ("95535c9d-7605-44d7-a11a-dc5b0a6276c4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mDestination;
            }

            @objid ("c37180bf-dddb-479c-817f-62d0bba54a29")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mDestination = value;
            }

            @objid ("95bbdda6-ba76-4d5b-aba3-7afe6e579079")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.ReceivedDep();
            }

        }

        @objid ("00621984-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmSingleDependency {
            @objid ("8f27cb94-ae61-492f-b631-30b07160c6db")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mOrigin;
            }

            @objid ("c6b017f6-799a-4891-a6fc-b3c28c93552d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mOrigin = value;
            }

            @objid ("9f600b87-78cb-4a65-aead-ab536733c8b6")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.SentDep();
            }

        }

        @objid ("00628d88-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("d0e338e5-4e53-42f4-b34b-aa922d020be8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mOwner;
            }

            @objid ("7a41ecd8-c938-4bc4-b838-53bf489e8751")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mOwner = value;
            }

            @objid ("c408189b-f985-4cbd-a44b-592677bbc015")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedDataFlowDep();
            }

        }

        @objid ("00630362-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SModelSmDependency extends SmSingleDependency {
            @objid ("a81f126e-f29d-42d2-92dd-bd32a050d328")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mSModel;
            }

            @objid ("e261f2c0-0bd2-4260-89d5-0b381fa981f7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mSModel = value;
            }

            @objid ("4f5b8abf-dfc9-4fbc-9806-effe7107df66")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.DOccurenceDep();
            }

        }

    }

}
