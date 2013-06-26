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
    @objid ("f71bc34e-9f07-4287-b410-c53e3e7c324c")
    @SmaMetaAttribute(metaName="LineNumber", type=Integer.class, smAttributeClass=Metadata.LineNumberSmAttribute.class)
     Object mLineNumber = -1;

    @objid ("e54a5d0e-a468-4181-930f-5d9ec013e87f")
    @SmaMetaAssociation(metaName="EnclosingOperand", typeDataClass=InteractionOperandData.class, min=0, max=1, smAssociationClass=Metadata.EnclosingOperandSmDependency.class)
     SmObjectImpl mEnclosingOperand;

    @objid ("3eb09de9-09ee-4bee-a6e5-dd225a648aca")
    @SmaMetaAssociation(metaName="EnclosingInteraction", typeDataClass=InteractionData.class, min=0, max=1, smAssociationClass=Metadata.EnclosingInteractionSmDependency.class)
     SmObjectImpl mEnclosingInteraction;

    @objid ("3ada574e-3647-4399-9de7-af160e3ff0f4")
    @SmaMetaAssociation(metaName="Covered", typeDataClass=LifelineData.class, min=0, max=-1, smAssociationClass=Metadata.CoveredSmDependency.class, partof = true)
     List<SmObjectImpl> mCovered = null;

    @objid ("032874f4-2a40-4528-91aa-7c93322a9a64")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0025b64c-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("98830cf8-bed8-4f27-9899-414fba1bc82a")
        private static SmClass smClass = null;

        @objid ("d3d9e97a-4425-4b0e-8bad-d562c923c5c5")
        private static SmAttribute LineNumberAtt = null;

        @objid ("685a15b7-6655-4039-86d5-e2acd6a43220")
        private static SmDependency EnclosingOperandDep = null;

        @objid ("37d6fd10-0401-4357-9a3e-b68ada7c7171")
        private static SmDependency EnclosingInteractionDep = null;

        @objid ("3477ae4d-75cc-4f28-8db2-7988d3793ff5")
        private static SmDependency CoveredDep = null;

        @objid ("36458aa5-5ba2-40d0-9c64-71d494e181a9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionFragmentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9665a45e-7d8e-4295-ab80-8d1667e7cd60")
        public static SmAttribute LineNumberAtt() {
            if (LineNumberAtt == null) {
            	LineNumberAtt = classof().getAttributeDef("LineNumber");
            }
            return LineNumberAtt;
        }

        @objid ("147ddd6b-45d1-4f25-b929-49b6fcf60ad3")
        public static SmDependency EnclosingOperandDep() {
            if (EnclosingOperandDep == null) {
            	EnclosingOperandDep = classof().getDependencyDef("EnclosingOperand");
            }
            return EnclosingOperandDep;
        }

        @objid ("4c255813-4aca-4760-9f23-d3e385fa41a2")
        public static SmDependency EnclosingInteractionDep() {
            if (EnclosingInteractionDep == null) {
            	EnclosingInteractionDep = classof().getDependencyDef("EnclosingInteraction");
            }
            return EnclosingInteractionDep;
        }

        @objid ("311610dd-2974-45a5-9445-74a7cffd3306")
        public static SmDependency CoveredDep() {
            if (CoveredDep == null) {
            	CoveredDep = classof().getDependencyDef("Covered");
            }
            return CoveredDep;
        }

        @objid ("09f87197-004e-4391-a5cb-9ff7e12cdf5b")
        public static SmDependency getEnclosingInteractionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EnclosingInteractionDep;
        }

        @objid ("4fc8d086-7efc-47ff-91fc-c3afe1f42268")
        public static SmDependency getCoveredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CoveredDep;
        }

        @objid ("49ee40a6-92ba-4c78-ad7a-fdfa97c13abf")
        public static SmAttribute getLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LineNumberAtt;
        }

        @objid ("d78336ba-4b2e-44a8-b5cd-5d97047d8625")
        public static SmDependency getEnclosingOperandDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EnclosingOperandDep;
        }

        @objid ("f56ed244-3bae-449e-810a-a4513f12b249")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0025f990-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1354bb41-e228-4577-890d-ffea606cac5e")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("0c2e4b58-6d95-402f-8d41-a084a6f89bd8")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00265c32-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LineNumberSmAttribute extends SmAttribute {
            @objid ("1c8834f4-08e2-4cca-a9df-e2745ff0be99")
            public Object getValue(ISmObjectData data) {
                return ((InteractionFragmentData) data).mLineNumber;
            }

            @objid ("1ac16144-a68f-4e6b-a22f-7f25901c5050")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionFragmentData) data).mLineNumber = value;
            }

        }

        @objid ("0026bf7e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EnclosingInteractionSmDependency extends SmSingleDependency {
            @objid ("aaa4911e-0d8d-4d72-a4ff-037441ab2e3f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionFragmentData) data).mEnclosingInteraction;
            }

            @objid ("79007676-5bd7-4a45-ba4d-dca6f58ac8ea")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionFragmentData) data).mEnclosingInteraction = value;
            }

            @objid ("47e75fd8-4a2d-45dc-bf14-9d67a1fe8d97")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.FragmentDep();
            }

        }

        @objid ("00273756-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EnclosingOperandSmDependency extends SmSingleDependency {
            @objid ("686cfa30-ccab-4777-9a42-2fa6b832f780")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionFragmentData) data).mEnclosingOperand;
            }

            @objid ("59869752-b97a-4ced-b948-9ecba08159fb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionFragmentData) data).mEnclosingOperand = value;
            }

            @objid ("9d630543-fb34-4210-beac-1d4959510a36")
            @Override
            public SmDependency getSymetric() {
                return InteractionOperandData.Metadata.FragmentDep();
            }

        }

        @objid ("0027ad62-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CoveredSmDependency extends SmMultipleDependency {
            @objid ("c8404674-d88d-4bd1-8874-be80bdefbbd2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionFragmentData)data).mCovered != null)? ((InteractionFragmentData)data).mCovered:SmMultipleDependency.EMPTY;
            }

            @objid ("97ffc801-37c6-44f7-84d2-62d97be7efb8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionFragmentData) data).mCovered = new ArrayList<>(initialCapacity);
                return ((InteractionFragmentData) data).mCovered;
            }

            @objid ("91e2421b-a83d-4bd5-901a-9d005a1b16e2")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.CoveredByDep();
            }

        }

    }

}
