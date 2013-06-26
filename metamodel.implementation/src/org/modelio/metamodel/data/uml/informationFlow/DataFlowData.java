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
    @objid ("bf445660-de19-4561-91b4-bc113f03bc6b")
    @SmaMetaAssociation(metaName="Destination", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.DestinationSmDependency.class, partof = true)
     SmObjectImpl mDestination;

    @objid ("e54ce0de-93c1-41f3-bec5-ef38ce8fa7a2")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OriginSmDependency.class)
     SmObjectImpl mOrigin;

    @objid ("2baf81e7-4154-4e66-9131-873ae6d44ec1")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("4a979223-d8d6-4d73-998f-1d724497b1d3")
    @SmaMetaAssociation(metaName="SModel", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SModelSmDependency.class, partof = true)
     SmObjectImpl mSModel;

    @objid ("4476c930-917a-494f-b342-7f0bfc9f620f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006103dc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("43667839-d7b5-4a26-a7ac-7331700cf385")
        private static SmClass smClass = null;

        @objid ("0e9f40c3-c160-4baa-b1a0-96ee2e372bdd")
        private static SmDependency DestinationDep = null;

        @objid ("be968159-2eeb-49e5-bc21-b7071a67ff73")
        private static SmDependency OriginDep = null;

        @objid ("3043c875-102e-43bc-a86c-446d025f67e9")
        private static SmDependency OwnerDep = null;

        @objid ("cfb5eaad-0360-40c9-95d2-dbf57aeccf67")
        private static SmDependency SModelDep = null;

        @objid ("2cc9b3b0-35ca-46c2-896d-b78091427287")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DataFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dfab44bc-fa03-4ce3-8135-5ba4ccb00068")
        public static SmDependency DestinationDep() {
            if (DestinationDep == null) {
            	DestinationDep = classof().getDependencyDef("Destination");
            }
            return DestinationDep;
        }

        @objid ("d012517e-1c3f-4425-af3a-a7c20dc53251")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("2197689d-6e22-491a-9497-56a525987642")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("00bcf0ff-131b-4190-89d7-433091db94d2")
        public static SmDependency SModelDep() {
            if (SModelDep == null) {
            	SModelDep = classof().getDependencyDef("SModel");
            }
            return SModelDep;
        }

        @objid ("009ad08c-1c7b-4cd3-9394-573272df6f72")
        public static SmDependency getSModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SModelDep;
        }

        @objid ("a8830f8c-0daf-4caf-aa89-41d8493b6033")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("e6b15550-286e-4a88-8b78-5e117ccb7ffa")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("cd015c9f-819b-4577-bdb9-b59fdd2effb3")
        public static SmDependency getDestinationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DestinationDep;
        }

        @objid ("bee4b0e9-9db3-4d62-9deb-b6abc3a052bc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00614504-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("09fe1f0f-8d50-4248-87e5-5fac904e5615")
            public ISmObjectData createData() {
                return new DataFlowData();
            }

            @objid ("ee97366d-228a-4872-9af8-1684a2c8170d")
            public SmObjectImpl createImpl() {
                return new DataFlowImpl();
            }

        }

        @objid ("0061a666-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DestinationSmDependency extends SmSingleDependency {
            @objid ("6cc89e5b-9ba5-4aa9-876f-72f913064a92")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mDestination;
            }

            @objid ("1f131883-a82a-4a2a-8994-91d9499dd72e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mDestination = value;
            }

            @objid ("cbdbff85-ad60-480f-9545-328f169013a3")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.ReceivedDep();
            }

        }

        @objid ("00621984-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmSingleDependency {
            @objid ("d386dc64-628d-447a-bd79-c10020212aa1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mOrigin;
            }

            @objid ("974583f4-4205-4cd0-be63-832516e0b59d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mOrigin = value;
            }

            @objid ("d2840225-cb7a-4793-b164-5fe13c6cc89a")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.SentDep();
            }

        }

        @objid ("00628d88-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("bb48767d-d63e-4d95-9816-ff546a1ed70b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mOwner;
            }

            @objid ("a22b918e-244a-4aad-afb7-c016325009f0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mOwner = value;
            }

            @objid ("71e95907-ae67-494d-bbc5-ea17489dd88b")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedDataFlowDep();
            }

        }

        @objid ("00630362-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SModelSmDependency extends SmSingleDependency {
            @objid ("8eb0b1ef-8a13-4e61-9236-baf50133f49b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DataFlowData) data).mSModel;
            }

            @objid ("a38bb81d-6f0b-4a0f-9b00-d6c15d43d0c7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DataFlowData) data).mSModel = value;
            }

            @objid ("8f16998c-31e1-4d1e-8488-d66b7c4a8d09")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.DOccurenceDep();
            }

        }

    }

}
