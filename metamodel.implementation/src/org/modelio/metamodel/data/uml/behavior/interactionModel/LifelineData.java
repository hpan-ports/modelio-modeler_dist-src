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
    @objid ("0b57711f-4db0-41cf-89a2-e10c731cf39b")
    @SmaMetaAttribute(metaName="Selector", type=String.class, smAttributeClass=Metadata.SelectorSmAttribute.class)
     Object mSelector = "";

    @objid ("7d2ae5a2-d1b1-4b2d-a5a4-83381e16fd13")
    @SmaMetaAssociation(metaName="CoveredBy", typeDataClass=InteractionFragmentData.class, min=0, max=-1, smAssociationClass=Metadata.CoveredBySmDependency.class)
     List<SmObjectImpl> mCoveredBy = null;

    @objid ("59627da3-1554-4c5a-8b50-e4c2915aa06a")
    @SmaMetaAssociation(metaName="DecomposedAs", typeDataClass=PartDecompositionData.class, min=0, max=1, smAssociationClass=Metadata.DecomposedAsSmDependency.class, component = true)
     SmObjectImpl mDecomposedAs;

    @objid ("8bdeef6b-37b7-4bf9-982a-b99dd5b4172d")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=InteractionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("7d21d1f8-aefe-4a29-a086-4f393843fa64")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("4e623a2f-e1fd-4ee5-b9d8-97bf863da65b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0051c94e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6085c7a3-38f2-476b-8dda-6ca3709dd30c")
        private static SmClass smClass = null;

        @objid ("61f2ec0d-1d84-4e85-97e1-b8b0f1337f54")
        private static SmAttribute SelectorAtt = null;

        @objid ("8fc56db1-d3bc-4508-9623-87087cd8e6ce")
        private static SmDependency CoveredByDep = null;

        @objid ("e69fd15c-463a-4de0-a9cf-9c7c09f7f10a")
        private static SmDependency DecomposedAsDep = null;

        @objid ("35685b90-8ae0-4f08-bdfb-2e134df87e85")
        private static SmDependency OwnerDep = null;

        @objid ("b4455b5d-40ef-4c63-927c-e350155babe4")
        private static SmDependency RepresentedDep = null;

        @objid ("981c2dec-9134-4abb-b49a-1e4dde08f9f0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LifelineData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6fde7fdc-cfb9-4a92-8e3c-a426e376dd92")
        public static SmAttribute SelectorAtt() {
            if (SelectorAtt == null) {
            	SelectorAtt = classof().getAttributeDef("Selector");
            }
            return SelectorAtt;
        }

        @objid ("21cdec65-a02d-4541-a882-9529d37e8c25")
        public static SmDependency CoveredByDep() {
            if (CoveredByDep == null) {
            	CoveredByDep = classof().getDependencyDef("CoveredBy");
            }
            return CoveredByDep;
        }

        @objid ("470670a6-e625-4ed7-8caf-e42da8da1a24")
        public static SmDependency DecomposedAsDep() {
            if (DecomposedAsDep == null) {
            	DecomposedAsDep = classof().getDependencyDef("DecomposedAs");
            }
            return DecomposedAsDep;
        }

        @objid ("9e081905-d9e7-4d31-b5a9-9b55fc063ed6")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("72a93f0c-8dde-41c4-ac29-5b862cce4a96")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("42aa33d4-39c1-45c0-b857-0c3e3581ab82")
        public static SmDependency getCoveredByDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CoveredByDep;
        }

        @objid ("5f00faec-79e4-4703-b149-b46caa64483f")
        public static SmAttribute getSelectorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectorAtt;
        }

        @objid ("e2d78177-c31d-492d-831b-f57fa151f461")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("838a3cea-e17f-4111-b81d-dbbe2e9b672e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0c2b8fd9-61da-47be-8a57-feb7611ca6b3")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("ec71bfa5-c275-4914-9b83-55d95182e21b")
        public static SmDependency getDecomposedAsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecomposedAsDep;
        }

        @objid ("00520b52-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f41538eb-3d66-4ec0-a7a3-f85c4085e90c")
            public ISmObjectData createData() {
                return new LifelineData();
            }

            @objid ("6d41a0be-e2f8-44a1-99f2-ab06a46f2197")
            public SmObjectImpl createImpl() {
                return new LifelineImpl();
            }

        }

        @objid ("00526e30-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SelectorSmAttribute extends SmAttribute {
            @objid ("509c11cc-6957-4d8a-ac22-6817b330b8ed")
            public Object getValue(ISmObjectData data) {
                return ((LifelineData) data).mSelector;
            }

            @objid ("81d7c78f-d9d7-42a3-87f8-9ff67a2567bd")
            public void setValue(ISmObjectData data, Object value) {
                ((LifelineData) data).mSelector = value;
            }

        }

        @objid ("0052d1f4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CoveredBySmDependency extends SmMultipleDependency {
            @objid ("af70a376-e3ae-47bc-b5e0-7f179d7bbb3d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((LifelineData)data).mCoveredBy != null)? ((LifelineData)data).mCoveredBy:SmMultipleDependency.EMPTY;
            }

            @objid ("e8d5a31b-c709-4195-90a3-0e82c7445e27")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((LifelineData) data).mCoveredBy = new ArrayList<>(initialCapacity);
                return ((LifelineData) data).mCoveredBy;
            }

            @objid ("bf9ec48c-f71f-417d-baf8-a143865f3b3c")
            @Override
            public SmDependency getSymetric() {
                return InteractionFragmentData.Metadata.CoveredDep();
            }

        }

        @objid ("00533694-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DecomposedAsSmDependency extends SmSingleDependency {
            @objid ("a28dec90-a203-4a86-af56-baa8fdbc7a38")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LifelineData) data).mDecomposedAs;
            }

            @objid ("53aa9264-6271-4777-bd2c-519afff614e1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LifelineData) data).mDecomposedAs = value;
            }

            @objid ("987e402c-3b25-4928-a069-46128bc6cc2f")
            @Override
            public SmDependency getSymetric() {
                return PartDecompositionData.Metadata.DecomposedDep();
            }

        }

        @objid ("0053adc2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("91cd52c8-6d96-4596-9c67-2d1f468a96ba")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LifelineData) data).mOwner;
            }

            @objid ("3a2bffc8-61e8-48d1-80c2-2cea5a22087a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LifelineData) data).mOwner = value;
            }

            @objid ("c909b63b-b257-475b-b20c-242c2c94cac6")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.OwnedLineDep();
            }

        }

        @objid ("005424aa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("52c0ed3e-2e97-47d2-ae9d-ff61b3f62d92")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LifelineData) data).mRepresented;
            }

            @objid ("65e5252f-366e-4560-b81a-e2a6041f4e0d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LifelineData) data).mRepresented = value;
            }

            @objid ("d26be470-2079-4a98-90cf-d18d9d952bba")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentedLifeLineDep();
            }

        }

    }

}
