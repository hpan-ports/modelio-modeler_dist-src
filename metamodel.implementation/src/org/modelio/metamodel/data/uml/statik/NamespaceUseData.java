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
    @objid ("8115f1fc-04bc-420e-9bb9-a045d9112bfa")
    @SmaMetaAssociation(metaName="User", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.UserSmDependency.class, partof = true)
     SmObjectImpl mUser;

    @objid ("38b349a7-606d-49fc-86da-826b5002129a")
    @SmaMetaAssociation(metaName="Used", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.UsedSmDependency.class, partof = true)
     SmObjectImpl mUsed;

    @objid ("3a8b00dd-d578-4dde-ad8e-e38f10b3f27a")
    @SmaMetaAssociation(metaName="Cause", typeDataClass=ElementData.class, min=0, max=-1, smAssociationClass=Metadata.CauseSmDependency.class, partof = true)
     List<SmObjectImpl> mCause = null;

    @objid ("2b74303c-af19-4a94-b904-85aaeac9e6d5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0048f54e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("28c54bba-e908-45ce-8134-26b32fcfed76")
        private static SmClass smClass = null;

        @objid ("1e91ad43-ed5c-466a-8eee-12702a6af46b")
        private static SmDependency UserDep = null;

        @objid ("3559c9fd-edea-444c-808c-2b357fd8a059")
        private static SmDependency UsedDep = null;

        @objid ("3d8f8f98-0c80-421c-9f61-e630810c9267")
        private static SmDependency CauseDep = null;

        @objid ("2074c4be-7247-4bbc-b22f-e6e3f3655992")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NamespaceUseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f2bc4830-7773-4d72-a1f2-ec9f3de87ba7")
        public static SmDependency UserDep() {
            if (UserDep == null) {
            	UserDep = classof().getDependencyDef("User");
            }
            return UserDep;
        }

        @objid ("579a8238-c226-4cdd-b3c2-892280f34169")
        public static SmDependency UsedDep() {
            if (UsedDep == null) {
            	UsedDep = classof().getDependencyDef("Used");
            }
            return UsedDep;
        }

        @objid ("9f384c15-b728-462c-b34e-2448cbf9e5b8")
        public static SmDependency CauseDep() {
            if (CauseDep == null) {
            	CauseDep = classof().getDependencyDef("Cause");
            }
            return CauseDep;
        }

        @objid ("69759f84-7a69-4053-b926-65fe0ffa4a23")
        public static SmDependency getUsedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsedDep;
        }

        @objid ("364d2a59-d9c4-40e2-8f35-831378211876")
        public static SmDependency getUserDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UserDep;
        }

        @objid ("119cc610-a74f-4974-88ac-601ff49412cd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("38652ed2-74a0-4767-a498-756c7b937520")
        public static SmDependency getCauseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CauseDep;
        }

        @objid ("0049355e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("10cec683-a0a0-4ffb-9e3e-8c55da36af8a")
            public ISmObjectData createData() {
                return new NamespaceUseData();
            }

            @objid ("45b7c2ad-f0fc-4558-b1b9-f585f3c797af")
            public SmObjectImpl createImpl() {
                return new NamespaceUseImpl();
            }

        }

        @objid ("004996a2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UsedSmDependency extends SmSingleDependency {
            @objid ("add6641b-8f6f-4650-b5cc-d6f91217489c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NamespaceUseData) data).mUsed;
            }

            @objid ("3c052d34-26b6-4a79-9390-ee0e7517ff9f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NamespaceUseData) data).mUsed = value;
            }

            @objid ("bf75d41a-96da-4b13-afee-5889c68e9322")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.UserNsuDep();
            }

        }

        @objid ("004a09f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UserSmDependency extends SmSingleDependency {
            @objid ("aab6ade4-90f8-4d3f-ab42-53cdcb894b95")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NamespaceUseData) data).mUser;
            }

            @objid ("60e186d9-3da8-4720-b037-d49a85ac65d6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NamespaceUseData) data).mUser = value;
            }

            @objid ("f7d21569-5042-43d6-aec4-9af50189cb9f")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.UsedNsuDep();
            }

        }

        @objid ("004a7cde-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CauseSmDependency extends SmMultipleDependency {
            @objid ("318806c3-60de-4d5e-8713-fbad83ddf772")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NamespaceUseData)data).mCause != null)? ((NamespaceUseData)data).mCause:SmMultipleDependency.EMPTY;
            }

            @objid ("b136b09c-dd28-4f91-b0a0-3af076b4009e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NamespaceUseData) data).mCause = new ArrayList<>(initialCapacity);
                return ((NamespaceUseData) data).mCause;
            }

            @objid ("af7e34e4-41ad-4d59-b1ac-4c5f54e7ebd6")
            @Override
            public SmDependency getSymetric() {
                return ElementData.Metadata.CausingDep();
            }

        }

    }

}
