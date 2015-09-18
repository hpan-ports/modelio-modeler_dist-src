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
    @objid ("2c2ec2e9-f8ce-4a5f-904b-063c24609755")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("e9216ba0-5700-4a58-9152-af8de10171f8")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("b87571d8-e62f-429f-ac7d-ddbd702365bc")
    @SmaMetaAssociation(metaName="Mapped", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.MappedSmDependency.class, partof = true)
     SmObjectImpl mMapped;

    @objid ("2c79d4fd-075d-494d-9958-dfebd4d32523")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002def06-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6f297ae0-e4ca-4744-bb72-0f2a6ab4d76d")
        private static SmClass smClass = null;

        @objid ("d4751278-6c7f-4c22-87ec-b923f368da05")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("9d72a482-0131-4f45-95ba-c5d4faf0574e")
        private static SmDependency OwnerDep = null;

        @objid ("eaca32b5-191c-4b20-98cd-6a1fbfd21f1e")
        private static SmDependency MappedDep = null;

        @objid ("bcbc4ce8-6014-4c2c-8e35-400c4a38e3ae")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BehaviorParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0dd122b3-61b0-4e73-b238-8bb83424a477")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("d354af51-9820-4514-a5cc-095283d7c855")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("1a76a845-67d9-4da3-83df-5c404855fb63")
        public static SmDependency MappedDep() {
            if (MappedDep == null) {
            	MappedDep = classof().getDependencyDef("Mapped");
            }
            return MappedDep;
        }

        @objid ("a20a0c0d-c595-46ab-ba4b-dfa2a8782d94")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e52536b5-96ec-4c42-9c91-2ca0766f9a25")
        public static SmDependency getMappedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MappedDep;
        }

        @objid ("c96c990f-9520-40eb-b9e5-a02b5181158d")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("8b31c4c9-3415-47ab-985c-ad5a0bc48335")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("002e315a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4896a17b-67cd-4b8c-9f5f-4eb75a5f170b")
            public ISmObjectData createData() {
                return new BehaviorParameterData();
            }

            @objid ("066e70b0-d067-4cc8-b092-6c3f9569a7b9")
            public SmObjectImpl createImpl() {
                return new BehaviorParameterImpl();
            }

        }

        @objid ("002e9834-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("87439878-2f91-427d-b0e0-a7d40e4644bd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorParameterData) data).mOwner;
            }

            @objid ("43ea2253-8768-487c-a2de-8306ad8c9625")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorParameterData) data).mOwner = value;
            }

            @objid ("d9d0d4d3-7bae-4dda-9556-682ce4798c09")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.ParameterDep();
            }

        }

        @objid ("002f0ee0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("8eaf3000-e3c6-4a24-b3b9-d08b8bc8c6e4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorParameterData)data).mRepresentingObjectNode != null)? ((BehaviorParameterData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("e7fce474-b0a2-4f81-8ca5-48b4d412c834")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorParameterData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((BehaviorParameterData) data).mRepresentingObjectNode;
            }

            @objid ("c8557464-f598-46ab-8ae7-305d7858b6fc")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedRealParameterDep();
            }

        }

        @objid ("002f7268-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MappedSmDependency extends SmSingleDependency {
            @objid ("d6e67019-81fe-4ee3-a78c-038a08af1767")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorParameterData) data).mMapped;
            }

            @objid ("a8c5268a-909c-4e2b-b9db-b3061e59338a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorParameterData) data).mMapped = value;
            }

            @objid ("5a619b12-4edf-4ecb-94cd-9a93bc580f5d")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.BehaviorParamDep();
            }

        }

    }

}
