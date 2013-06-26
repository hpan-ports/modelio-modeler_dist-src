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
package org.modelio.metamodel.data.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ObjectNodeData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorParameterImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
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

@objid ("00416784-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BehaviorParameter.class, factory=BehaviorParameterData.Metadata.ObjectFactory.class)
public class BehaviorParameterData extends ParameterData {
    @objid ("f23702b1-7d6e-4697-94a9-04cc9a23b9d9")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("2dd845a8-d83e-40f5-a8b3-d685f50f39af")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("ba90a226-f6fc-4ca5-944b-436c04b3275a")
    @SmaMetaAssociation(metaName="Mapped", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.MappedSmDependency.class, partof = true)
     SmObjectImpl mMapped;

    @objid ("4d86484e-2cf1-47b7-83f3-58502e1d7325")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002def06-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c20f3fd3-3497-45a9-b821-3fda5bb8e178")
        private static SmClass smClass = null;

        @objid ("15f217af-3b8d-416e-9d2c-968dc0131385")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("cd4946b5-4826-4b0e-89eb-32e322b013ca")
        private static SmDependency OwnerDep = null;

        @objid ("97a66858-d8ee-40d1-8d00-d51ae2ef3359")
        private static SmDependency MappedDep = null;

        @objid ("340a8ba6-4d3c-44d7-97dc-07666f5cd68f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BehaviorParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("970df235-2aa9-4a46-9171-10b32d3d6451")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("047d988d-444a-42ed-8263-f0b117d9cc94")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("80349489-e8db-4d6c-8247-62f84572f4df")
        public static SmDependency MappedDep() {
            if (MappedDep == null) {
            	MappedDep = classof().getDependencyDef("Mapped");
            }
            return MappedDep;
        }

        @objid ("7a76fdda-93f3-4a5a-a982-782f5dd9a354")
        public static SmDependency getMappedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MappedDep;
        }

        @objid ("d2fa486d-5589-4c9d-8653-05cd2035f5e2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("fb320e21-47f7-48b2-89f9-4348ec27d5a8")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("9f04c44e-b994-465b-b279-d4b01e7a4361")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("002e315a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3757ab7c-ab21-4f43-a428-6818a7c864eb")
            public ISmObjectData createData() {
                return new BehaviorParameterData();
            }

            @objid ("3d25f78b-8987-457d-af7c-29d469474c99")
            public SmObjectImpl createImpl() {
                return new BehaviorParameterImpl();
            }

        }

        @objid ("002e9834-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("3f0af832-a8dd-4133-89a3-2ee3b8b6db65")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorParameterData) data).mOwner;
            }

            @objid ("6deb73d0-b4ef-42ec-95c6-69d01d631f22")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorParameterData) data).mOwner = value;
            }

            @objid ("6e37b298-9c96-4399-b299-9422c28c861c")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.ParameterDep();
            }

        }

        @objid ("002f0ee0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("58587ad9-c400-4c51-8cc7-cbf2f06bf35a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorParameterData)data).mRepresentingObjectNode != null)? ((BehaviorParameterData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("7b69fc8f-8bef-41d7-b6ec-1fad34593857")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorParameterData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((BehaviorParameterData) data).mRepresentingObjectNode;
            }

            @objid ("8ea84a1d-02a0-4bca-bbb8-f25b896b1950")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedRealParameterDep();
            }

        }

        @objid ("002f7268-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MappedSmDependency extends SmSingleDependency {
            @objid ("a83f07ca-aee6-42ea-a85a-4129a451b915")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorParameterData) data).mMapped;
            }

            @objid ("74f7dad4-2e14-4d26-9c55-25df189a7ff8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorParameterData) data).mMapped = value;
            }

            @objid ("2e730896-7a92-47c9-bb2d-4bbb38b01eea")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.BehaviorParamDep();
            }

        }

    }

}
