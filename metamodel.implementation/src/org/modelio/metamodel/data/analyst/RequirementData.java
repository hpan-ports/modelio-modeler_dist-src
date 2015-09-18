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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.data.analyst.RequirementContainerData;
import org.modelio.metamodel.impl.analyst.RequirementImpl;
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

@objid ("cdb4e302-697f-4730-9228-27f71f3c6d4d")
@SmaMetaClass(mmClass=Requirement.class, factory=RequirementData.Metadata.ObjectFactory.class, cmsnode=true)
public class RequirementData extends AnalystElementData {
    @objid ("540bd0ad-ff3f-400f-9702-603284a901c4")
    @SmaMetaAssociation(metaName="SubRequirement", typeDataClass=RequirementData.class, min=0, max=-1, smAssociationClass=Metadata.SubRequirementSmDependency.class, component = true)
     List<SmObjectImpl> mSubRequirement = null;

    @objid ("80044697-5a8a-4f55-80dd-4887a8cd05f3")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=RequirementContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("6edd3e1e-5d11-4822-80c1-964c3ee39230")
    @SmaMetaAssociation(metaName="ParentRequirement", typeDataClass=RequirementData.class, min=0, max=1, smAssociationClass=Metadata.ParentRequirementSmDependency.class)
     SmObjectImpl mParentRequirement;

    @objid ("d916565d-3e8a-4b08-96a2-31a23bf8e05e")
    @SmaMetaAssociation(metaName="ArchivedRequirementVersion", typeDataClass=RequirementData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedRequirementVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedRequirementVersion = null;

    @objid ("2a66de84-5898-449f-8791-33f157b10caf")
    @SmaMetaAssociation(metaName="LastRequirementVersion", typeDataClass=RequirementData.class, min=0, max=1, smAssociationClass=Metadata.LastRequirementVersionSmDependency.class)
     SmObjectImpl mLastRequirementVersion;

    @objid ("6c97ad89-8655-48b1-9d7a-3624696468b3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("59115fc6-ae77-4d6e-8459-548c5891e205")
    public static class Metadata {
        @objid ("6d358280-21c8-4c19-b3fc-46b9c5468373")
        private static SmClass smClass = null;

        @objid ("0a002777-9884-4b80-af4c-c68729046544")
        private static SmDependency SubRequirementDep = null;

        @objid ("661836a3-7930-4a99-8c47-9dfc638bf6fb")
        private static SmDependency OwnerContainerDep = null;

        @objid ("380e903b-9c0c-44aa-a5bf-4deff3dba4c7")
        private static SmDependency ParentRequirementDep = null;

        @objid ("ed0c6259-7bcb-45d4-bab1-ad545a2d80fa")
        private static SmDependency ArchivedRequirementVersionDep = null;

        @objid ("9a86a583-1407-4864-8cba-b0c3ffbd7125")
        private static SmDependency LastRequirementVersionDep = null;

        @objid ("822b2c07-54f4-4c2e-9ed5-dbcdf906a279")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RequirementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("aff188cc-92b2-4840-a994-eb4ba7f64540")
        public static SmDependency SubRequirementDep() {
            if (SubRequirementDep == null) {
            	SubRequirementDep = classof().getDependencyDef("SubRequirement");
            }
            return SubRequirementDep;
        }

        @objid ("bb4a37d7-ce49-44ed-a032-2cb6edf8ee5e")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("ff038a3e-d45b-4d68-923f-8b0c164ffad4")
        public static SmDependency ParentRequirementDep() {
            if (ParentRequirementDep == null) {
            	ParentRequirementDep = classof().getDependencyDef("ParentRequirement");
            }
            return ParentRequirementDep;
        }

        @objid ("8420c906-e538-4ae6-bd50-feca14daebb6")
        public static SmDependency ArchivedRequirementVersionDep() {
            if (ArchivedRequirementVersionDep == null) {
            	ArchivedRequirementVersionDep = classof().getDependencyDef("ArchivedRequirementVersion");
            }
            return ArchivedRequirementVersionDep;
        }

        @objid ("80b10490-acaa-4e24-a764-6772ea97dbb5")
        public static SmDependency LastRequirementVersionDep() {
            if (LastRequirementVersionDep == null) {
            	LastRequirementVersionDep = classof().getDependencyDef("LastRequirementVersion");
            }
            return LastRequirementVersionDep;
        }

        @objid ("ac99f491-3e81-4d67-bf81-d407e309dddd")
        public static SmDependency getLastRequirementVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastRequirementVersionDep;
        }

        @objid ("65d9ad61-e5e2-4e0c-8f74-f6ad2db531d8")
        public static SmDependency getParentRequirementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentRequirementDep;
        }

        @objid ("6cb8bdc8-dbca-4eb1-b2fe-1c6986888286")
        public static SmDependency getArchivedRequirementVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedRequirementVersionDep;
        }

        @objid ("29104769-d46f-4fd5-b362-963b87912cfa")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("ab6a0b18-4f26-4d68-a6cf-c4796f40ed33")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a1a500d9-1655-47e7-97a1-a707ad492c36")
        public static SmDependency getSubRequirementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubRequirementDep;
        }

        @objid ("8fb3c95f-267c-4e60-a366-5d23f93059b6")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ad0e33a9-aced-49da-8acb-0a1f5190960a")
            public ISmObjectData createData() {
                return new RequirementData();
            }

            @objid ("e74cf77c-ecf5-40a4-8907-544524b75ee8")
            public SmObjectImpl createImpl() {
                return new RequirementImpl();
            }

        }

        @objid ("0b16d465-8e0b-4917-97aa-728cfbd9e4db")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("d527b9e9-cb6f-4384-b186-5c4f10a92fe2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementData) data).mOwnerContainer;
            }

            @objid ("f0f5a91c-6ece-4c45-b360-f417f77c29c1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementData) data).mOwnerContainer = value;
            }

            @objid ("02041bec-1d5a-48ad-bb76-11cd9cf52a81")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnedRequirementDep();
            }

        }

        @objid ("015ad436-44bb-4f76-adac-305c1e5dad32")
        public static class SubRequirementSmDependency extends SmMultipleDependency {
            @objid ("1d17237b-8e35-41fb-98b4-fb71e745835a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementData)data).mSubRequirement != null)? ((RequirementData)data).mSubRequirement:SmMultipleDependency.EMPTY;
            }

            @objid ("986ab312-3316-4a07-8383-2df4575fe8da")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementData) data).mSubRequirement = new ArrayList<>(initialCapacity);
                return ((RequirementData) data).mSubRequirement;
            }

            @objid ("9f62714b-bc63-4b42-a5a8-f35e6fdfcffa")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.ParentRequirementDep();
            }

        }

        @objid ("1248b591-50dc-48a8-a038-f96a5e89a40a")
        public static class ParentRequirementSmDependency extends SmSingleDependency {
            @objid ("ac41c9d7-73a1-4a24-b1cc-a60c8accbe00")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementData) data).mParentRequirement;
            }

            @objid ("317a8f17-0794-4cab-b776-c4fb0d5377b7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementData) data).mParentRequirement = value;
            }

            @objid ("100a34d7-f40f-4e3f-a2bd-e1ecd4093014")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.SubRequirementDep();
            }

        }

        @objid ("bfc5dc7f-ce0c-4cee-8b52-566b87a02aac")
        public static class ArchivedRequirementVersionSmDependency extends SmMultipleDependency {
            @objid ("ae3027ff-96f5-4875-b37e-07c2f94ac984")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementData)data).mArchivedRequirementVersion != null)? ((RequirementData)data).mArchivedRequirementVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("5f1c1c42-c59f-45f6-8f0d-7c29d5c7b69d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementData) data).mArchivedRequirementVersion = new ArrayList<>(initialCapacity);
                return ((RequirementData) data).mArchivedRequirementVersion;
            }

            @objid ("97201017-c1f2-4f94-84d1-766424c89b6f")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.LastRequirementVersionDep();
            }

        }

        @objid ("a8f74006-3f14-4d0c-93c0-8acb2dcda313")
        public static class LastRequirementVersionSmDependency extends SmSingleDependency {
            @objid ("eb4fa10c-c21c-4f21-aeb3-b9c342013099")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementData) data).mLastRequirementVersion;
            }

            @objid ("2d9f01a4-23b9-4722-b60c-675c15601a0e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementData) data).mLastRequirementVersion = value;
            }

            @objid ("357b9de9-1282-4853-ba7a-3c26199029bc")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.ArchivedRequirementVersionDep();
            }

        }

    }

}
