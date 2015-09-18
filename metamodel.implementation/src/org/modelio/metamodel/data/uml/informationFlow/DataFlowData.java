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
    @objid ("e2fb23c2-ec8f-4e36-bdad-31d5e43cb48d")
    @SmaMetaAssociation(metaName="Destination", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.DestinationSmDependency.class, partof = true)
     SmObjectImpl mDestination;

    @objid ("2a5f6305-23ae-4533-9f56-82bda805160a")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OriginSmDependency.class)
     SmObjectImpl mOrigin;

    @objid ("f3154108-51ab-422a-a770-272473796900")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("241568a6-c683-458d-82d6-2bf9248b155a")
    @SmaMetaAssociation(metaName="SModel", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SModelSmDependency.class, partof = true)
     SmObjectImpl mSModel;

    @objid ("66ac0da5-7cbf-4eba-8221-ff32f1779230")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006103dc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("efc8ad3b-0e0f-4254-aabf-1ef1b775c566")
        private static SmClass smClass = null;

        @objid ("5d1e49fe-abb6-4766-870b-03553a325868")
        private static SmDependency DestinationDep = null;

        @objid ("b7d0512d-1e8d-406a-99c4-b90d656993bb")
        private static SmDependency OriginDep = null;

        @objid ("b919931b-c56c-4e5a-abb6-52bd7df7682f")
        private static SmDependency OwnerDep = null;

        @objid ("164572c9-d396-46a2-a7e2-c820d38abf16")
        private static SmDependency SModelDep = null;

        @objid ("6556a8d6-e2fa-4335-b62b-26ccd50d0388")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DataFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("87b8b3f3-a214-4181-8ee2-13f3fb6ff3eb")
        public static SmDependency DestinationDep() {
            if (DestinationDep == null) {
            	DestinationDep = classof().getDependencyDef("Destination");
            }
            return DestinationDep;
        }

        @objid ("b62fa1da-1759-47d8-82f9-5c6ec6309cdb")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("3cd0ee76-15e5-457e-9bec-d96b1d86ff66")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("e4955224-5e80-4fea-8789-56932f60b810")
        public static SmDependency SModelDep() {
            if (SModelDep == null) {
            	SModelDep = classof().getDependencyDef("SModel");
            }
            return SModelDep;
        }

        @objid ("a8548c17-159c-493b-8e57-f75b9a96c514")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("c05f6963-938f-4fb7-b991-70888102f7de")
        public static SmDependency getSModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SModelDep;
        }

        @objid ("39e42cfa-f646-4c3e-97c5-6c475ad4c941")
        public static SmDependency getDestinationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DestinationDep;
        }

        @objid ("e76d5d0f-af59-4e46-adbc-d4ed2138d3dc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("21596dd9-f12e-4abe-9f1f-5b6d2bccec48")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("00614504-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("046ffcaf-fd74-4679-9532-04a96c9b5425")
            public ISmObjectData createData() {
                return new DataFlowData();
            }

            @objid ("29156c4f-a14a-490d-8276-966e2739af78")
            public SmObjectImpl createImpl() {
                return new DataFlowImpl();
            }

        }

        @objid ("0061a666-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DestinationSmDependency extends SmSingleDependency {
            @objid ("08733f7a-12ab-4c00-9687-69371d16e41f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mDestination;
            }

            @objid ("695944f7-1efa-4d67-b2e3-24a003f23cd9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mDestination = value;
            }

            @objid ("953dc575-567d-4ae0-9358-53197c356df9")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.ReceivedDep();
            }

        }

        @objid ("00621984-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmSingleDependency {
            @objid ("d31cfa86-bd92-4183-af82-87f87751a8fb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mOrigin;
            }

            @objid ("f8c2ba89-3ed0-45f8-807b-60facd544834")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mOrigin = value;
            }

            @objid ("7df75fd7-9686-42e2-859b-c99d57e423b0")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.SentDep();
            }

        }

        @objid ("00628d88-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("01647980-c35f-44f8-81b7-9ce33d7c375f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mOwner;
            }

            @objid ("24494aed-94ee-43e0-bca5-88fc2ab463d2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mOwner = value;
            }

            @objid ("d2eea345-2a12-44a6-b97c-688b93578f2c")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedDataFlowDep();
            }

        }

        @objid ("00630362-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SModelSmDependency extends SmSingleDependency {
            @objid ("fad12d09-3560-4f3f-9eec-46eab86c8118")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mSModel;
            }

            @objid ("2025136b-7385-43cc-8fc6-71410aa54994")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mSModel = value;
            }

            @objid ("55607c68-2bfe-4e4d-ba83-4c82978c4322")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.DOccurenceDep();
            }

        }

    }

}
