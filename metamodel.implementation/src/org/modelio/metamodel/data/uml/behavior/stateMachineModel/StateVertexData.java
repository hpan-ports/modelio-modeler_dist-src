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
    @objid ("f10fc52a-1ba0-4b60-a727-982ad4004068")
    @SmaMetaAssociation(metaName="OutGoing", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.OutGoingSmDependency.class, component = true)
     List<SmObjectImpl> mOutGoing = null;

    @objid ("dc5ebd1f-80a1-4865-bab7-e0af0aa50788")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mIncoming = null;

    @objid ("90353734-6c37-4f03-905c-1668d2fffa87")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=RegionData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class)
     SmObjectImpl mParent;

    @objid ("1d9b1a45-d520-4c4e-8ea8-16d0f68d0751")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000edb5c-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cdbc48d7-178d-452c-b66b-b7cd137b7e09")
        private static SmClass smClass = null;

        @objid ("04748c0b-52d1-47fb-b75f-b697d237ac22")
        private static SmDependency OutGoingDep = null;

        @objid ("37b8f0f1-5cef-49a8-a066-63bb2e42e22c")
        private static SmDependency IncomingDep = null;

        @objid ("6bdfbe98-e249-4fa4-9dad-2c366122348d")
        private static SmDependency ParentDep = null;

        @objid ("1795840d-4bcc-4ab5-a810-b99df1ab2965")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateVertexData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("30aecf0a-7dfc-4494-9279-1e03c56c130d")
        public static SmDependency OutGoingDep() {
            if (OutGoingDep == null) {
            	OutGoingDep = classof().getDependencyDef("OutGoing");
            }
            return OutGoingDep;
        }

        @objid ("edeb1575-dd27-4db3-af32-9ed73f3398d5")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("d7dc610c-e6f0-4918-8b6e-c9dc23c0fc2d")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("61443e83-b1a9-4d06-b829-79b22b543009")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("58041960-2715-4bc5-99a6-c50b4cd17218")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a6035494-aaa5-427a-9471-5ffde7929aa3")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("8c86a176-fff1-4a2b-b3f2-388a707948db")
        public static SmDependency getOutGoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutGoingDep;
        }

        @objid ("000f1db0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("75769df5-1312-4b15-bede-544e7d8adf0b")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("f462526b-4799-430c-8b25-ddacfd875f91")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("000f8106-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("6c515c56-e677-465b-b9a3-133ce33ba8dc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateVertexData)data).mIncoming != null)? ((StateVertexData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("f029c1c4-cfec-4ddb-b29a-5081bb0c813d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateVertexData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((StateVertexData) data).mIncoming;
            }

            @objid ("a87989b6-8ac1-4be1-895b-0e583c5a000f")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.TargetDep();
            }

        }

        @objid ("000fe51a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutGoingSmDependency extends SmMultipleDependency {
            @objid ("68881645-ef7a-4287-9bae-38a919d54ffe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateVertexData)data).mOutGoing != null)? ((StateVertexData)data).mOutGoing:SmMultipleDependency.EMPTY;
            }

            @objid ("adcff862-a2a1-40a8-bc16-16766ccf3085")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateVertexData) data).mOutGoing = new ArrayList<>(initialCapacity);
                return ((StateVertexData) data).mOutGoing;
            }

            @objid ("78fd2ec7-93de-4a53-a95a-e7622cd36eb1")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.SourceDep();
            }

        }

        @objid ("00104a14-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("1f28c0eb-8fea-4292-b577-17b1fab38d58")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StateVertexData) data).mParent;
            }

            @objid ("5db814db-45d5-4eca-9fa4-a2ef1f799cfe")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StateVertexData) data).mParent = value;
            }

            @objid ("6f0b399f-df52-49f0-8622-da71ca65c199")
            @Override
            public SmDependency getSymetric() {
                return RegionData.Metadata.SubDep();
            }

        }

    }

}
