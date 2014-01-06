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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.RegionData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.TransitionData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateVertexImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
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

@objid ("0054f060-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StateVertex.class, factory=StateVertexData.Metadata.ObjectFactory.class)
public abstract class StateVertexData extends ModelElementData {
    @objid ("66910af8-d6c2-4194-8752-6faf26d1545f")
    @SmaMetaAssociation(metaName="OutGoing", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.OutGoingSmDependency.class, component = true)
     List<SmObjectImpl> mOutGoing = null;

    @objid ("c1b26083-b9b6-4003-9083-f3ebf15326ff")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mIncoming = null;

    @objid ("0a32c7a0-52b1-4db0-a528-48e95dc1525d")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=RegionData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class)
     SmObjectImpl mParent;

    @objid ("5736ed19-d268-4114-84ea-e0b46c0bf768")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000edb5c-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8660d637-84c9-4f91-946d-ade845036bf6")
        private static SmClass smClass = null;

        @objid ("ec9b8bcc-c5e5-45f4-83ee-5de734bf0f6d")
        private static SmDependency OutGoingDep = null;

        @objid ("ffc2c3f7-5e6a-4933-a896-bc6e93031089")
        private static SmDependency IncomingDep = null;

        @objid ("e67d30a1-8d48-4046-8e38-4ceb5ce10904")
        private static SmDependency ParentDep = null;

        @objid ("23c92768-1a99-4c88-9d11-a29037995d9a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateVertexData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8d8018d9-6ab5-47a7-a045-8110d2853011")
        public static SmDependency OutGoingDep() {
            if (OutGoingDep == null) {
            	OutGoingDep = classof().getDependencyDef("OutGoing");
            }
            return OutGoingDep;
        }

        @objid ("0e487352-9144-4ea7-b3c2-e4e4382c5391")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("7217761b-96dd-4da2-b007-27505917e426")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("45e48350-2659-45da-8da4-42cc1cfe2149")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("64c87d68-4052-4efc-9c89-a5c04f21731f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5e5bb8a0-00ad-4cc5-bc7a-93b6deadf92d")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("c2e83bf2-f97e-4d84-9f73-48751e1fbf9c")
        public static SmDependency getOutGoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutGoingDep;
        }

        @objid ("000f1db0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("85e46cc3-de6c-4eb2-ad42-941fbfdd7c41")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("f1a334fa-e916-4a1a-bca9-c18d6ebda4a7")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("000f8106-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("92405999-bb80-42a6-a187-7174ac0ea542")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateVertexData)data).mIncoming != null)? ((StateVertexData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("b6df503d-09b2-4475-b170-23793ae3d16c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateVertexData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((StateVertexData) data).mIncoming;
            }

            @objid ("4ad18743-54e1-45ef-91b8-9cd8edce35aa")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.TargetDep();
            }

        }

        @objid ("000fe51a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutGoingSmDependency extends SmMultipleDependency {
            @objid ("76fc8a40-46ef-43ef-952b-30421d64d764")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateVertexData)data).mOutGoing != null)? ((StateVertexData)data).mOutGoing:SmMultipleDependency.EMPTY;
            }

            @objid ("5bd3d8dc-92c0-4221-80ee-e91055de9c6d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateVertexData) data).mOutGoing = new ArrayList<>(initialCapacity);
                return ((StateVertexData) data).mOutGoing;
            }

            @objid ("f5e0034b-6e46-44c3-8e3c-bcf3bb8ecc36")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.SourceDep();
            }

        }

        @objid ("00104a14-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("eb534639-8fb1-4f33-961f-93a13cb659e4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StateVertexData) data).mParent;
            }

            @objid ("a6e0a799-689d-4024-803a-e2a8d8e62df5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StateVertexData) data).mParent = value;
            }

            @objid ("c12ad1f2-776b-477e-8240-ab9ca9deec28")
            @Override
            public SmDependency getSymetric() {
                return RegionData.Metadata.SubDep();
            }

        }

    }

}
