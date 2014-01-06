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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionFragmentData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.PartDecompositionData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.LifelineImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
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

@objid ("00490d86-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Lifeline.class, factory=LifelineData.Metadata.ObjectFactory.class)
public class LifelineData extends ModelElementData {
    @objid ("d506924e-2b00-4524-8247-3c42643b64db")
    @SmaMetaAttribute(metaName="Selector", type=String.class, smAttributeClass=Metadata.SelectorSmAttribute.class)
     Object mSelector = "";

    @objid ("c0bd6384-61bd-4a35-9d59-36af91278ab3")
    @SmaMetaAssociation(metaName="CoveredBy", typeDataClass=InteractionFragmentData.class, min=0, max=-1, smAssociationClass=Metadata.CoveredBySmDependency.class)
     List<SmObjectImpl> mCoveredBy = null;

    @objid ("69515d36-20b5-43b8-9c1c-5370bd7614ef")
    @SmaMetaAssociation(metaName="DecomposedAs", typeDataClass=PartDecompositionData.class, min=0, max=1, smAssociationClass=Metadata.DecomposedAsSmDependency.class, component = true)
     SmObjectImpl mDecomposedAs;

    @objid ("83b24d98-3d35-41f9-8191-581550513021")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=InteractionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("15cee6f7-d07a-4782-9f7e-bb44eb4b9333")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("578d1544-04e6-443f-b724-3d71ebe5608b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0051c94e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("60f7dea4-14f0-4107-8767-c91bcd7d7422")
        private static SmClass smClass = null;

        @objid ("e2bd54eb-7625-4838-a7e9-ff3b72475f91")
        private static SmAttribute SelectorAtt = null;

        @objid ("ebd9bd49-4b6f-4744-bf31-7b8d4c8c2223")
        private static SmDependency CoveredByDep = null;

        @objid ("c66af7b3-9c09-42ee-bb6b-3536e6fe834d")
        private static SmDependency DecomposedAsDep = null;

        @objid ("894c8953-e529-402c-ac57-ff4e7cfc5052")
        private static SmDependency OwnerDep = null;

        @objid ("59868306-9ea2-4460-a1c9-9e4c47b6d560")
        private static SmDependency RepresentedDep = null;

        @objid ("1cb37163-94cb-42a8-b8dc-1848beb368db")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LifelineData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4896b7a4-17b1-4e8c-87a4-eb6f46c5a7df")
        public static SmAttribute SelectorAtt() {
            if (SelectorAtt == null) {
            	SelectorAtt = classof().getAttributeDef("Selector");
            }
            return SelectorAtt;
        }

        @objid ("c6661f16-d35e-4c4d-80e0-761f2875187c")
        public static SmDependency CoveredByDep() {
            if (CoveredByDep == null) {
            	CoveredByDep = classof().getDependencyDef("CoveredBy");
            }
            return CoveredByDep;
        }

        @objid ("fc109057-af82-441b-914d-b320d2f7b4c7")
        public static SmDependency DecomposedAsDep() {
            if (DecomposedAsDep == null) {
            	DecomposedAsDep = classof().getDependencyDef("DecomposedAs");
            }
            return DecomposedAsDep;
        }

        @objid ("2f875f89-c6b3-44c8-a1ed-d4397846cb9e")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("0ce7ba3d-c94c-4e88-adbc-ad5984b1404d")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("63e77fef-8b5b-4040-bcfd-7113e720a206")
        public static SmDependency getCoveredByDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CoveredByDep;
        }

        @objid ("25b09c46-2f6e-4c5f-b038-8f402a0c08ea")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("286f2dae-1bb1-4765-8284-90ef0ca8a2ff")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("8c7f72b2-7afc-4f5c-b669-162556c7605c")
        public static SmAttribute getSelectorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectorAtt;
        }

        @objid ("338f0a0c-fbb7-4c29-a8a9-c85e2f0a3aa2")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("017bec1f-45a6-40d6-854b-089e3e5d3e5c")
        public static SmDependency getDecomposedAsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecomposedAsDep;
        }

        @objid ("00520b52-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6b8a99ce-a4ba-4fc1-a169-9b3d780a6884")
            public ISmObjectData createData() {
                return new LifelineData();
            }

            @objid ("b6171967-6722-4e6c-b967-e65b439e2f99")
            public SmObjectImpl createImpl() {
                return new LifelineImpl();
            }

        }

        @objid ("00526e30-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SelectorSmAttribute extends SmAttribute {
            @objid ("4ca7b862-af26-479a-8a78-cefc6f670fd4")
            public Object getValue(ISmObjectData data) {
                return ((LifelineData) data).mSelector;
            }

            @objid ("4461978e-1dcb-482e-9c0c-52f485af2de3")
            public void setValue(ISmObjectData data, Object value) {
                ((LifelineData) data).mSelector = value;
            }

        }

        @objid ("0052d1f4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CoveredBySmDependency extends SmMultipleDependency {
            @objid ("4c0e563c-c4fb-4d5b-bc11-cf5d598d5fab")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((LifelineData)data).mCoveredBy != null)? ((LifelineData)data).mCoveredBy:SmMultipleDependency.EMPTY;
            }

            @objid ("3b86dadc-8fc6-47ac-8492-fb29aa4bf08a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((LifelineData) data).mCoveredBy = new ArrayList<>(initialCapacity);
                return ((LifelineData) data).mCoveredBy;
            }

            @objid ("762935c0-270d-4c4f-8d22-339f3b443df6")
            @Override
            public SmDependency getSymetric() {
                return InteractionFragmentData.Metadata.CoveredDep();
            }

        }

        @objid ("00533694-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DecomposedAsSmDependency extends SmSingleDependency {
            @objid ("d90d1ffd-c507-4a6d-8b3d-ff429c2d9e2c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LifelineData) data).mDecomposedAs;
            }

            @objid ("aa84c2ec-3dca-400a-8571-1fd283b65244")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LifelineData) data).mDecomposedAs = value;
            }

            @objid ("e31dcdfd-e838-497a-90b5-0ba18a6e4d0b")
            @Override
            public SmDependency getSymetric() {
                return PartDecompositionData.Metadata.DecomposedDep();
            }

        }

        @objid ("0053adc2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("c4952246-68fb-423c-aa3c-9b891aac6035")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LifelineData) data).mOwner;
            }

            @objid ("5d1b56b4-bffd-4b0b-a2c0-f0099a6ec1d4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LifelineData) data).mOwner = value;
            }

            @objid ("44192083-510e-4ef9-9acf-3ea26eb46178")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.OwnedLineDep();
            }

        }

        @objid ("005424aa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("43f2894a-c5eb-4273-8eaf-419dfd244a3f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LifelineData) data).mRepresented;
            }

            @objid ("d3fb5002-ac0a-44a5-a8d1-1e20d5b0b017")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LifelineData) data).mRepresented = value;
            }

            @objid ("e3cdfe8c-bebf-4192-869e-86ed58a9c56f")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentedLifeLineDep();
            }

        }

    }

}
