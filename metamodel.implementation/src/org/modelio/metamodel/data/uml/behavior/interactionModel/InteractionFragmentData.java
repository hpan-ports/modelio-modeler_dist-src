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
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionOperandData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.LifelineData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionFragmentImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
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

@objid ("0047676a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InteractionFragment.class, factory=InteractionFragmentData.Metadata.ObjectFactory.class)
public abstract class InteractionFragmentData extends ModelElementData {
    @objid ("ac410017-e59c-44ab-82d4-173b6ac525a7")
    @SmaMetaAttribute(metaName="LineNumber", type=Integer.class, smAttributeClass=Metadata.LineNumberSmAttribute.class)
     Object mLineNumber = -1;

    @objid ("0ace360e-f47c-48ae-928c-2d5c00be3d6d")
    @SmaMetaAssociation(metaName="EnclosingOperand", typeDataClass=InteractionOperandData.class, min=0, max=1, smAssociationClass=Metadata.EnclosingOperandSmDependency.class)
     SmObjectImpl mEnclosingOperand;

    @objid ("0f7e516e-df6b-40ef-905c-dec6c73d01c3")
    @SmaMetaAssociation(metaName="EnclosingInteraction", typeDataClass=InteractionData.class, min=0, max=1, smAssociationClass=Metadata.EnclosingInteractionSmDependency.class)
     SmObjectImpl mEnclosingInteraction;

    @objid ("b4c4611e-4e0a-44d8-a3ac-2f7177a39ebc")
    @SmaMetaAssociation(metaName="Covered", typeDataClass=LifelineData.class, min=0, max=-1, smAssociationClass=Metadata.CoveredSmDependency.class, partof = true)
     List<SmObjectImpl> mCovered = null;

    @objid ("2f1e7a29-80fe-4161-83ff-ea4dee8f5b76")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0025b64c-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cdde3566-dd86-4201-942a-fe7782294721")
        private static SmClass smClass = null;

        @objid ("d7347cd9-3801-4797-82c4-7dfab93a42e9")
        private static SmAttribute LineNumberAtt = null;

        @objid ("ed0d472a-94bd-4c3a-9096-4bffe296269e")
        private static SmDependency EnclosingOperandDep = null;

        @objid ("8ac1fb6a-18a6-48af-be68-6e60e3978a28")
        private static SmDependency EnclosingInteractionDep = null;

        @objid ("d38f3b43-dddc-4edd-afe4-a710109a6ee5")
        private static SmDependency CoveredDep = null;

        @objid ("666879c2-5419-43cb-92a1-2ce83ce8d1a9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionFragmentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b47e7ace-724d-4528-8504-efdab31e467e")
        public static SmAttribute LineNumberAtt() {
            if (LineNumberAtt == null) {
            	LineNumberAtt = classof().getAttributeDef("LineNumber");
            }
            return LineNumberAtt;
        }

        @objid ("8ed862cc-dc19-4e88-a174-f78b22e3ca3c")
        public static SmDependency EnclosingOperandDep() {
            if (EnclosingOperandDep == null) {
            	EnclosingOperandDep = classof().getDependencyDef("EnclosingOperand");
            }
            return EnclosingOperandDep;
        }

        @objid ("b0def9d1-64e9-4a5f-878e-58af75332e04")
        public static SmDependency EnclosingInteractionDep() {
            if (EnclosingInteractionDep == null) {
            	EnclosingInteractionDep = classof().getDependencyDef("EnclosingInteraction");
            }
            return EnclosingInteractionDep;
        }

        @objid ("12f0952a-54bc-454c-becc-d990918e7ebf")
        public static SmDependency CoveredDep() {
            if (CoveredDep == null) {
            	CoveredDep = classof().getDependencyDef("Covered");
            }
            return CoveredDep;
        }

        @objid ("52fe8198-eb13-4550-9ceb-4c23b23351cb")
        public static SmDependency getEnclosingOperandDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EnclosingOperandDep;
        }

        @objid ("e6f33b64-3e9e-49c0-a293-a0884b777fb6")
        public static SmAttribute getLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LineNumberAtt;
        }

        @objid ("7452d64a-bfbc-43d6-8b82-80f04d35d851")
        public static SmDependency getCoveredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CoveredDep;
        }

        @objid ("76c21553-3be9-4d3e-a6bd-006a4e935f47")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b9b18bc7-2860-4b99-94fa-0586e152e243")
        public static SmDependency getEnclosingInteractionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EnclosingInteractionDep;
        }

        @objid ("0025f990-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d3d365bb-7e2a-4dcb-bf5c-7ea0406ec227")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("eb2b90ad-5a0e-4f84-a470-759902acbf9a")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00265c32-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LineNumberSmAttribute extends SmAttribute {
            @objid ("0b9743cf-0903-4f2c-a8e8-8580b01e84b6")
            public Object getValue(ISmObjectData data) {
                return ((InteractionFragmentData) data).mLineNumber;
            }

            @objid ("a2cc6469-a0a3-4ed3-b87a-4d5179818aed")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionFragmentData) data).mLineNumber = value;
            }

        }

        @objid ("0026bf7e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EnclosingInteractionSmDependency extends SmSingleDependency {
            @objid ("133516b3-1032-4fd0-b4ba-49cec63d99a9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionFragmentData) data).mEnclosingInteraction;
            }

            @objid ("2c5f26b8-4663-4486-b1e4-8700adae75d1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionFragmentData) data).mEnclosingInteraction = value;
            }

            @objid ("2037b114-a26b-4e98-96ea-de822eeae0f3")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.FragmentDep();
            }

        }

        @objid ("00273756-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EnclosingOperandSmDependency extends SmSingleDependency {
            @objid ("def2752b-090f-4501-8f47-7db16f86c3b3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionFragmentData) data).mEnclosingOperand;
            }

            @objid ("293018fe-2705-4c12-881f-d2d413743eab")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionFragmentData) data).mEnclosingOperand = value;
            }

            @objid ("5d28e020-668c-45bb-b088-e2d455aef5d8")
            @Override
            public SmDependency getSymetric() {
                return InteractionOperandData.Metadata.FragmentDep();
            }

        }

        @objid ("0027ad62-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CoveredSmDependency extends SmMultipleDependency {
            @objid ("63a26351-2cd3-4586-86c7-11241536bb5b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionFragmentData)data).mCovered != null)? ((InteractionFragmentData)data).mCovered:SmMultipleDependency.EMPTY;
            }

            @objid ("28a55e45-4181-4c8c-b0a5-1e4521acae51")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionFragmentData) data).mCovered = new ArrayList<>(initialCapacity);
                return ((InteractionFragmentData) data).mCovered;
            }

            @objid ("2374b850-a86e-4381-8d09-d3a97befd453")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.CoveredByDep();
            }

        }

    }

}
