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
    @objid ("fc5e233c-8240-4c54-a916-260dad885263")
    @SmaMetaAssociation(metaName="User", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.UserSmDependency.class, partof = true)
     SmObjectImpl mUser;

    @objid ("11c20bf9-4881-4c36-a7a1-942f2116e3b8")
    @SmaMetaAssociation(metaName="Used", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.UsedSmDependency.class, partof = true)
     SmObjectImpl mUsed;

    @objid ("ec1a16ef-f49d-4bca-8724-08ecf5e6ddbe")
    @SmaMetaAssociation(metaName="Cause", typeDataClass=ElementData.class, min=0, max=-1, smAssociationClass=Metadata.CauseSmDependency.class, partof = true)
     List<SmObjectImpl> mCause = null;

    @objid ("638adfa4-f004-4e5d-8bb9-d1efb011d17d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0048f54e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("20de4f1a-cd58-477f-91ba-a275b59ecf06")
        private static SmClass smClass = null;

        @objid ("a4384794-665f-481c-9f17-71cc44e3274e")
        private static SmDependency UserDep = null;

        @objid ("6d43c99c-5e88-485a-ba95-00b70af03f09")
        private static SmDependency UsedDep = null;

        @objid ("3378046b-a25b-4eb6-bce5-539a2a6ef6ac")
        private static SmDependency CauseDep = null;

        @objid ("cec507fa-4af4-4e9c-8f2d-a0907b7e04bc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NamespaceUseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("99d34e4d-f4f5-417c-afc8-d0c5147700e4")
        public static SmDependency UserDep() {
            if (UserDep == null) {
            	UserDep = classof().getDependencyDef("User");
            }
            return UserDep;
        }

        @objid ("c503c3c8-f98a-4162-bd85-7e3065b30f23")
        public static SmDependency UsedDep() {
            if (UsedDep == null) {
            	UsedDep = classof().getDependencyDef("Used");
            }
            return UsedDep;
        }

        @objid ("a5b42f28-706c-4ecc-b8cb-efb947746f31")
        public static SmDependency CauseDep() {
            if (CauseDep == null) {
            	CauseDep = classof().getDependencyDef("Cause");
            }
            return CauseDep;
        }

        @objid ("d706e4f9-6c79-4c73-bc23-303cbe0451e7")
        public static SmDependency getCauseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CauseDep;
        }

        @objid ("d9eae375-ba67-4034-b71c-ae306f8eb1b4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("85862430-030d-41a5-9fdb-c9f53cfe275d")
        public static SmDependency getUserDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UserDep;
        }

        @objid ("426baff3-2d1e-4b05-a287-e58c5de8e0f0")
        public static SmDependency getUsedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsedDep;
        }

        @objid ("0049355e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b66c375e-3304-4dd3-8d77-84079a6c049e")
            public ISmObjectData createData() {
                return new NamespaceUseData();
            }

            @objid ("e7611678-2162-4728-bd35-178727471c82")
            public SmObjectImpl createImpl() {
                return new NamespaceUseImpl();
            }

        }

        @objid ("004996a2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UsedSmDependency extends SmSingleDependency {
            @objid ("e1302d7b-01a2-46e8-97ce-a5288a800898")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NamespaceUseData) data).mUsed;
            }

            @objid ("fbd73e9d-5db0-4506-bfbf-7635f3cd22e0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NamespaceUseData) data).mUsed = value;
            }

            @objid ("17289958-ebdc-43cf-8a43-362ed45e2ead")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.UserNsuDep();
            }

        }

        @objid ("004a09f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UserSmDependency extends SmSingleDependency {
            @objid ("e421bc35-a30e-4874-8075-140e72d8d375")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NamespaceUseData) data).mUser;
            }

            @objid ("f0e0da53-7758-417d-8526-14798426376c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NamespaceUseData) data).mUser = value;
            }

            @objid ("e61d5976-de50-411e-bf26-d7df0440a2ac")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.UsedNsuDep();
            }

        }

        @objid ("004a7cde-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CauseSmDependency extends SmMultipleDependency {
            @objid ("3a6ccf5f-472f-46b5-b54f-6a7ffb6f181b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NamespaceUseData)data).mCause != null)? ((NamespaceUseData)data).mCause:SmMultipleDependency.EMPTY;
            }

            @objid ("a4cc205c-307e-428f-8c28-818638544726")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NamespaceUseData) data).mCause = new ArrayList<>(initialCapacity);
                return ((NamespaceUseData) data).mCause;
            }

            @objid ("cf2c1032-bf6d-41eb-ba10-d8e4f796f978")
            @Override
            public SmDependency getSymetric() {
                return ElementData.Metadata.CausingDep();
            }

        }

    }

}
