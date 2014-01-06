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
    @objid ("574ffd8a-0060-4bab-97d6-cee1981104b6")
    @SmaMetaAttribute(metaName="LineNumber", type=Integer.class, smAttributeClass=Metadata.LineNumberSmAttribute.class)
     Object mLineNumber = -1;

    @objid ("a374ea61-36d3-4a8b-a8a8-d3864a3b0b23")
    @SmaMetaAssociation(metaName="EnclosingOperand", typeDataClass=InteractionOperandData.class, min=0, max=1, smAssociationClass=Metadata.EnclosingOperandSmDependency.class)
     SmObjectImpl mEnclosingOperand;

    @objid ("4e75195e-bccc-4e13-82b5-10e21ba50d9f")
    @SmaMetaAssociation(metaName="EnclosingInteraction", typeDataClass=InteractionData.class, min=0, max=1, smAssociationClass=Metadata.EnclosingInteractionSmDependency.class)
     SmObjectImpl mEnclosingInteraction;

    @objid ("8f7ba159-ecab-4b46-a6b7-8e32b08a9371")
    @SmaMetaAssociation(metaName="Covered", typeDataClass=LifelineData.class, min=0, max=-1, smAssociationClass=Metadata.CoveredSmDependency.class, partof = true)
     List<SmObjectImpl> mCovered = null;

    @objid ("48ac7b74-0bff-4f39-a023-ca9b54904003")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0025b64c-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("05ed8a93-4e09-4e06-9516-464311a55b63")
        private static SmClass smClass = null;

        @objid ("76fcdccf-da51-44b8-8c3c-48b2a532de6f")
        private static SmAttribute LineNumberAtt = null;

        @objid ("8af9f12c-5101-4b77-8700-d43a3fdb824c")
        private static SmDependency EnclosingOperandDep = null;

        @objid ("2a1d3ba2-28d8-43f1-a2a0-1258b9e290e1")
        private static SmDependency EnclosingInteractionDep = null;

        @objid ("f83e2b97-7d5d-425a-97ff-b527c2bc86fe")
        private static SmDependency CoveredDep = null;

        @objid ("7d428327-e174-4622-8414-bb175053524e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionFragmentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d31f5f2e-ee6c-4050-98cc-8df6b80538df")
        public static SmAttribute LineNumberAtt() {
            if (LineNumberAtt == null) {
            	LineNumberAtt = classof().getAttributeDef("LineNumber");
            }
            return LineNumberAtt;
        }

        @objid ("79afdea5-6411-4e09-acc6-7e159dba2097")
        public static SmDependency EnclosingOperandDep() {
            if (EnclosingOperandDep == null) {
            	EnclosingOperandDep = classof().getDependencyDef("EnclosingOperand");
            }
            return EnclosingOperandDep;
        }

        @objid ("7490c718-d15c-41a2-9696-42cb6595c997")
        public static SmDependency EnclosingInteractionDep() {
            if (EnclosingInteractionDep == null) {
            	EnclosingInteractionDep = classof().getDependencyDef("EnclosingInteraction");
            }
            return EnclosingInteractionDep;
        }

        @objid ("51280b43-ab58-49d6-8be7-d0732a9eee50")
        public static SmDependency CoveredDep() {
            if (CoveredDep == null) {
            	CoveredDep = classof().getDependencyDef("Covered");
            }
            return CoveredDep;
        }

        @objid ("f3d1182e-fb99-4680-ab00-9d42c15bd432")
        public static SmDependency getEnclosingInteractionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EnclosingInteractionDep;
        }

        @objid ("a0c3ad52-7b2a-4659-977b-7aebb3e80daa")
        public static SmDependency getEnclosingOperandDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EnclosingOperandDep;
        }

        @objid ("fa6e8d81-c264-44c8-83b8-29c2100acbf1")
        public static SmAttribute getLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LineNumberAtt;
        }

        @objid ("5f9ae99b-5ca2-4828-b1db-37574ec7ff1c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("331de017-aae2-42e1-b0a7-a2027f186006")
        public static SmDependency getCoveredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CoveredDep;
        }

        @objid ("0025f990-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ed93c1b7-c873-4d00-b374-5b8d81b0cef1")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("b148f771-2b01-4e29-9628-90fd52150b13")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00265c32-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LineNumberSmAttribute extends SmAttribute {
            @objid ("a9221b25-1ae0-41a5-ab70-0129c3e5a349")
            public Object getValue(ISmObjectData data) {
                return ((InteractionFragmentData) data).mLineNumber;
            }

            @objid ("e8fa2bc4-b264-47f8-906e-1fb5933ae210")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionFragmentData) data).mLineNumber = value;
            }

        }

        @objid ("0026bf7e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EnclosingInteractionSmDependency extends SmSingleDependency {
            @objid ("f6514d91-0d4c-403e-94c2-3f8af4b0c310")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionFragmentData) data).mEnclosingInteraction;
            }

            @objid ("d6b0de20-cef2-42c2-96bc-40981636f2ef")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionFragmentData) data).mEnclosingInteraction = value;
            }

            @objid ("065a3fb2-4a54-4a6c-aec4-906e4aa6b472")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.FragmentDep();
            }

        }

        @objid ("00273756-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EnclosingOperandSmDependency extends SmSingleDependency {
            @objid ("e51f95c2-ff42-468e-a08f-a70555a27bad")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionFragmentData) data).mEnclosingOperand;
            }

            @objid ("cd50a730-a9e6-43da-9e13-3ce6da4b377a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionFragmentData) data).mEnclosingOperand = value;
            }

            @objid ("76619b33-d2d2-4961-b5a7-c53ba59ab528")
            @Override
            public SmDependency getSymetric() {
                return InteractionOperandData.Metadata.FragmentDep();
            }

        }

        @objid ("0027ad62-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CoveredSmDependency extends SmMultipleDependency {
            @objid ("e8cb811a-908b-4ac3-bd71-0f8c4ab6cf51")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionFragmentData)data).mCovered != null)? ((InteractionFragmentData)data).mCovered:SmMultipleDependency.EMPTY;
            }

            @objid ("64fc50a6-79fb-4c23-80bf-45eb22d64c75")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionFragmentData) data).mCovered = new ArrayList<>(initialCapacity);
                return ((InteractionFragmentData) data).mCovered;
            }

            @objid ("06c3376d-06b5-4112-adc1-5a8567fec56c")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.CoveredByDep();
            }

        }

    }

}
