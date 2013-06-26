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
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.impl.uml.statik.NamespaceUseImpl;
import org.modelio.metamodel.uml.statik.NamespaceUse;
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

@objid ("0012ad86-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NamespaceUse.class, factory=NamespaceUseData.Metadata.ObjectFactory.class)
public class NamespaceUseData extends ElementData {
    @objid ("d0ef976c-e4a9-4cbd-a2b4-faa205632f27")
    @SmaMetaAssociation(metaName="User", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.UserSmDependency.class, partof = true)
     SmObjectImpl mUser;

    @objid ("f04c608f-a401-4a62-aabc-904697f7dfbc")
    @SmaMetaAssociation(metaName="Used", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.UsedSmDependency.class, partof = true)
     SmObjectImpl mUsed;

    @objid ("41568e2e-a59f-4e22-9029-c9b4d202d1b7")
    @SmaMetaAssociation(metaName="Cause", typeDataClass=ElementData.class, min=0, max=-1, smAssociationClass=Metadata.CauseSmDependency.class, partof = true)
     List<SmObjectImpl> mCause = null;

    @objid ("52372fb2-33c6-43f2-b756-a67aa0ece812")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0048f54e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8b3be5ab-62fd-4c19-867b-650cc0d60f87")
        private static SmClass smClass = null;

        @objid ("bbdb1e19-efea-45da-8879-c8e94e9a9bc9")
        private static SmDependency UserDep = null;

        @objid ("ab99f758-b380-431e-8384-eb9b53fbfa15")
        private static SmDependency UsedDep = null;

        @objid ("94a695c9-0313-4c21-9f0b-2f6ae566850f")
        private static SmDependency CauseDep = null;

        @objid ("6e0c7a81-9391-4bf5-bf83-97acebb64d58")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NamespaceUseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f62a2c02-8a45-46b4-a0cc-9cf66d8bfce0")
        public static SmDependency UserDep() {
            if (UserDep == null) {
            	UserDep = classof().getDependencyDef("User");
            }
            return UserDep;
        }

        @objid ("2619233d-6af3-432c-b6a7-0f015473197e")
        public static SmDependency UsedDep() {
            if (UsedDep == null) {
            	UsedDep = classof().getDependencyDef("Used");
            }
            return UsedDep;
        }

        @objid ("2d2200cb-229b-4acf-87e4-a88672b3e1d9")
        public static SmDependency CauseDep() {
            if (CauseDep == null) {
            	CauseDep = classof().getDependencyDef("Cause");
            }
            return CauseDep;
        }

        @objid ("e139620d-3d34-43ff-8bc3-dcdbf0e3ee35")
        public static SmDependency getUsedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsedDep;
        }

        @objid ("c7046071-e256-4c73-993c-4df012b037f5")
        public static SmDependency getUserDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UserDep;
        }

        @objid ("3dc5fd20-a154-4a9d-bf29-e9bfdfdd97a0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4951ba0b-b9ae-44a3-b8f1-12f7b8d073c3")
        public static SmDependency getCauseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CauseDep;
        }

        @objid ("0049355e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("38d236a0-ae05-4b5f-8dc0-65c2ac655318")
            public ISmObjectData createData() {
                return new NamespaceUseData();
            }

            @objid ("c85aecfd-4ed2-4ea4-a91b-537716f260f6")
            public SmObjectImpl createImpl() {
                return new NamespaceUseImpl();
            }

        }

        @objid ("004996a2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UsedSmDependency extends SmSingleDependency {
            @objid ("cc14c734-9659-43f2-822e-47ab0b148878")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NamespaceUseData) data).mUsed;
            }

            @objid ("70b9c4d6-d29d-40cd-b22c-c7b71bac94c4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NamespaceUseData) data).mUsed = value;
            }

            @objid ("6504c29c-851d-4654-b4de-cad68b6d7c62")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.UserNsuDep();
            }

        }

        @objid ("004a09f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UserSmDependency extends SmSingleDependency {
            @objid ("3f3f61ef-02bd-4714-9829-8bbf60bb0d8a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NamespaceUseData) data).mUser;
            }

            @objid ("71b39b7d-3b47-4251-934c-242121b74337")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NamespaceUseData) data).mUser = value;
            }

            @objid ("f52fba9c-723f-4226-bd8a-280d89efaa18")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.UsedNsuDep();
            }

        }

        @objid ("004a7cde-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CauseSmDependency extends SmMultipleDependency {
            @objid ("f0cb6a79-df04-4045-a3f8-e257b600c7f6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NamespaceUseData)data).mCause != null)? ((NamespaceUseData)data).mCause:SmMultipleDependency.EMPTY;
            }

            @objid ("5b45199f-4fb1-4ffd-b377-b44f797df6f1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NamespaceUseData) data).mCause = new ArrayList<>(initialCapacity);
                return ((NamespaceUseData) data).mCause;
            }

            @objid ("7083ce28-5094-4be8-8cf0-85d939218378")
            @Override
            public SmDependency getSymetric() {
                return ElementData.Metadata.CausingDep();
            }

        }

    }

}
