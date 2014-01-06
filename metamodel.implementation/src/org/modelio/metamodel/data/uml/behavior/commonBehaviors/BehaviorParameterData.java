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
    @objid ("6732a997-0c87-4d0e-a6e6-520f76ec3d8e")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("4e690ede-275d-4218-b409-c6286a5d442f")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("42c3ba0e-c49d-43de-bec5-5a2d8a883efc")
    @SmaMetaAssociation(metaName="Mapped", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.MappedSmDependency.class, partof = true)
     SmObjectImpl mMapped;

    @objid ("fee19e8c-68a5-4e11-8a2f-c2530886c863")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002def06-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("052bfabb-c706-4126-8398-90848ec5b611")
        private static SmClass smClass = null;

        @objid ("4f4a2f28-09ed-4623-994a-88b9e9363d77")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("50a8e9c5-3ab7-4753-8b84-dcde9e31dd41")
        private static SmDependency OwnerDep = null;

        @objid ("96405c21-6ad4-4428-b261-5673459f555b")
        private static SmDependency MappedDep = null;

        @objid ("6bb01a28-c68a-40cf-bd06-137d1fd361c5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BehaviorParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("066c2059-0c24-451b-a780-6eada3d34d15")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("f63bdcb3-3353-4d3c-9f96-d6b420504f86")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("a0fbfa5e-038f-4b89-b5c6-264fb2929022")
        public static SmDependency MappedDep() {
            if (MappedDep == null) {
            	MappedDep = classof().getDependencyDef("Mapped");
            }
            return MappedDep;
        }

        @objid ("03071bc8-f222-47b3-afb6-a572ae1de803")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("9b5a98b8-3638-4a60-95b3-39aa4064ec54")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("a4c716e3-576a-473b-8b64-a260caf246f0")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("abfabb75-7a1e-4dd5-a2f2-669a8e66bfa9")
        public static SmDependency getMappedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MappedDep;
        }

        @objid ("002e315a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9d8dc2c2-4ba0-48d6-b2b0-215f2ff3aa63")
            public ISmObjectData createData() {
                return new BehaviorParameterData();
            }

            @objid ("57c10754-7721-44d6-8a88-df61b903d612")
            public SmObjectImpl createImpl() {
                return new BehaviorParameterImpl();
            }

        }

        @objid ("002e9834-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("ec44eee4-7ee7-4c1c-9ec5-d4cdf557374d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorParameterData) data).mOwner;
            }

            @objid ("57e26004-1d87-4da0-9a81-d0429c223926")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorParameterData) data).mOwner = value;
            }

            @objid ("f76ce009-c6fb-4bc7-b080-6b562cb90973")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.ParameterDep();
            }

        }

        @objid ("002f0ee0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("b5b85d01-6459-4880-af37-89074eebf120")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorParameterData)data).mRepresentingObjectNode != null)? ((BehaviorParameterData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("8ae78dcc-ed14-40c5-b773-91518b3504f2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorParameterData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((BehaviorParameterData) data).mRepresentingObjectNode;
            }

            @objid ("71a59719-040e-4446-b2a5-99a15da4aabc")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedRealParameterDep();
            }

        }

        @objid ("002f7268-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MappedSmDependency extends SmSingleDependency {
            @objid ("e1029c39-5969-4ac5-bee9-107bd7e6bbc4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorParameterData) data).mMapped;
            }

            @objid ("bb23f3e6-4ab0-4f30-bae1-9fb4fc0611c3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorParameterData) data).mMapped = value;
            }

            @objid ("cba31724-a0f7-4656-8afe-a3aaeb31b3ef")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.BehaviorParamDep();
            }

        }

    }

}
