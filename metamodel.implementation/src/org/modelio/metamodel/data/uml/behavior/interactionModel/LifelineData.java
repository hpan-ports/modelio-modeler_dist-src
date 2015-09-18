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
    @objid ("9e454ce0-e698-4597-af57-93b19df77050")
    @SmaMetaAttribute(metaName="Selector", type=String.class, smAttributeClass=Metadata.SelectorSmAttribute.class)
     Object mSelector = "";

    @objid ("e4251cc2-fc86-4de9-a516-10706418f268")
    @SmaMetaAssociation(metaName="CoveredBy", typeDataClass=InteractionFragmentData.class, min=0, max=-1, smAssociationClass=Metadata.CoveredBySmDependency.class)
     List<SmObjectImpl> mCoveredBy = null;

    @objid ("36a8038a-1375-4f0c-8843-5fb78351f052")
    @SmaMetaAssociation(metaName="DecomposedAs", typeDataClass=PartDecompositionData.class, min=0, max=1, smAssociationClass=Metadata.DecomposedAsSmDependency.class, component = true)
     SmObjectImpl mDecomposedAs;

    @objid ("27ad1f55-f8e3-4bef-a534-1c154b8a1abe")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=InteractionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("bb87f47b-dffb-4c69-8c58-859db5cdfc71")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("ea7092e0-2d93-4ed1-a1af-8404aa48f708")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0051c94e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("14672b6a-bfe1-4320-afae-be1fb2f5a0cb")
        private static SmClass smClass = null;

        @objid ("a8401c67-b84d-43de-9443-c9548359886b")
        private static SmAttribute SelectorAtt = null;

        @objid ("7e0fef3b-6789-4f53-8982-1870b543e478")
        private static SmDependency CoveredByDep = null;

        @objid ("ff3fa784-adec-4174-b467-ea9f121dd688")
        private static SmDependency DecomposedAsDep = null;

        @objid ("41e5fe54-ccdb-4927-83d0-f76589edbb91")
        private static SmDependency OwnerDep = null;

        @objid ("1ce3bd90-503a-4424-9d76-08f9c5d64f82")
        private static SmDependency RepresentedDep = null;

        @objid ("0842ed0d-3f18-4b69-9ebe-f730c6fdf576")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LifelineData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1ff6058e-d5ac-4a77-b779-3de814f63410")
        public static SmAttribute SelectorAtt() {
            if (SelectorAtt == null) {
            	SelectorAtt = classof().getAttributeDef("Selector");
            }
            return SelectorAtt;
        }

        @objid ("cdefa3cf-cdb9-4388-a926-dfaad86d25f3")
        public static SmDependency CoveredByDep() {
            if (CoveredByDep == null) {
            	CoveredByDep = classof().getDependencyDef("CoveredBy");
            }
            return CoveredByDep;
        }

        @objid ("8a53cb90-7e22-4ad7-ad64-af6081e97e5a")
        public static SmDependency DecomposedAsDep() {
            if (DecomposedAsDep == null) {
            	DecomposedAsDep = classof().getDependencyDef("DecomposedAs");
            }
            return DecomposedAsDep;
        }

        @objid ("288f70cd-fcaf-43f0-9174-3bf10269a23e")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("c688c85c-d12f-4fb4-b54f-5461b27f933e")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("8066faf3-ba58-4514-81b0-3458c46e70c0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("05fa5941-8e8d-47e9-999c-f73daf0ea194")
        public static SmDependency getCoveredByDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CoveredByDep;
        }

        @objid ("091fff6e-ebdc-4f37-9700-d53c5718a021")
        public static SmDependency getDecomposedAsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecomposedAsDep;
        }

        @objid ("49a5699b-268e-4519-b57c-5c4d59949086")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("02579b17-98d8-47f4-a729-9d5133c3a78e")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("33862075-5e1a-48a2-ac5f-fe7a4d6531bc")
        public static SmAttribute getSelectorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectorAtt;
        }

        @objid ("00520b52-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a4dcb5b6-c613-4a43-b220-37fdd79ee7e7")
            public ISmObjectData createData() {
                return new LifelineData();
            }

            @objid ("d02f25e0-ddf9-43af-9346-df74f57a34ae")
            public SmObjectImpl createImpl() {
                return new LifelineImpl();
            }

        }

        @objid ("00526e30-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SelectorSmAttribute extends SmAttribute {
            @objid ("53154416-dda4-44d5-9efa-941071c3eb8a")
            public Object getValue(ISmObjectData data) {
                return ((LifelineData) data).mSelector;
            }

            @objid ("8584d4aa-05ea-4cad-88b0-5ac9a3014256")
            public void setValue(ISmObjectData data, Object value) {
                ((LifelineData) data).mSelector = value;
            }

        }

        @objid ("0052d1f4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CoveredBySmDependency extends SmMultipleDependency {
            @objid ("9158b50e-755b-41f0-b9be-1aca9ce12fb4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((LifelineData)data).mCoveredBy != null)? ((LifelineData)data).mCoveredBy:SmMultipleDependency.EMPTY;
            }

            @objid ("d111709e-cb85-40ce-9291-edae56cd6094")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((LifelineData) data).mCoveredBy = new ArrayList<>(initialCapacity);
                return ((LifelineData) data).mCoveredBy;
            }

            @objid ("c3a22557-7eb4-4d60-8209-7b5b84c26b5f")
            @Override
            public SmDependency getSymetric() {
                return InteractionFragmentData.Metadata.CoveredDep();
            }

        }

        @objid ("00533694-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DecomposedAsSmDependency extends SmSingleDependency {
            @objid ("d3278ec5-3147-4afd-b778-8cb138e058d6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LifelineData) data).mDecomposedAs;
            }

            @objid ("25595c0d-da62-4695-ae03-2427ecf34d4b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LifelineData) data).mDecomposedAs = value;
            }

            @objid ("8bfc96ef-20a4-4b58-b3c3-e7702b97b4f3")
            @Override
            public SmDependency getSymetric() {
                return PartDecompositionData.Metadata.DecomposedDep();
            }

        }

        @objid ("0053adc2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("a9af5829-fb25-4b62-80e6-96c70f870f8c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LifelineData) data).mOwner;
            }

            @objid ("97248e51-7fbd-4aea-8e1e-b876fb70a8bd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LifelineData) data).mOwner = value;
            }

            @objid ("a010bf77-0026-4e06-b843-1fac2364ccf6")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.OwnedLineDep();
            }

        }

        @objid ("005424aa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("bc3bba0a-14d8-43e0-95a0-656438825401")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LifelineData) data).mRepresented;
            }

            @objid ("5540c04d-d89e-41c6-bc6f-e14766f1da4c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LifelineData) data).mRepresented = value;
            }

            @objid ("441d0de6-bc19-4cf1-a8f2-66027f1242f6")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentedLifeLineDep();
            }

        }

    }

}
