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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixValueDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.QueryDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ExternProcessorImpl;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
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

@objid ("9bf75d8b-a1fe-4551-b3ea-8285c1a28683")
@SmaMetaClass(mmClass=ExternProcessor.class, factory=ExternProcessorData.Metadata.ObjectFactory.class)
public class ExternProcessorData extends ModelElementData {
    @objid ("2532b7b4-ca35-4f2d-a951-05a23f5b5ce4")
    @SmaMetaAttribute(metaName="ClassName", type=String.class, smAttributeClass=Metadata.ClassNameSmAttribute.class)
     Object mClassName = "";

    @objid ("8eae5c2b-3862-469b-9fc5-699591b07cc4")
    @SmaMetaAssociation(metaName="OwnerQuery", typeDataClass=QueryDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerQuerySmDependency.class)
     SmObjectImpl mOwnerQuery;

    @objid ("88989ca3-1f9c-4a3e-a79e-9fb20cc60829")
    @SmaMetaAssociation(metaName="OwnerValDef", typeDataClass=MatrixValueDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerValDefSmDependency.class)
     SmObjectImpl mOwnerValDef;

    @objid ("fbb52703-16b5-4235-942c-5df415d1cbbd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("87b8e284-b2bf-4b90-9639-d885c0fa7e79")
    public static class Metadata {
        @objid ("9bc7fa1b-b8e5-4d9b-893a-c9296e3ccdb6")
        private static SmClass smClass = null;

        @objid ("936ad973-12c4-4428-844a-6b6153e47477")
        private static SmAttribute ClassNameAtt = null;

        @objid ("9d87fbfc-3bcd-460b-b4d8-164e0bb6ca19")
        private static SmDependency OwnerQueryDep = null;

        @objid ("0671ccfd-4678-48cf-8923-1a28510ba68b")
        private static SmDependency OwnerValDefDep = null;

        @objid ("bde7804a-5498-475d-95ca-8133fa7a8e58")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExternProcessorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6682c4ec-2eeb-4947-b362-302169922680")
        public static SmAttribute ClassNameAtt() {
            if (ClassNameAtt == null) {
            	ClassNameAtt = classof().getAttributeDef("ClassName");
            }
            return ClassNameAtt;
        }

        @objid ("98f1046d-5a36-4219-94b6-35abfb41f421")
        public static SmDependency OwnerQueryDep() {
            if (OwnerQueryDep == null) {
            	OwnerQueryDep = classof().getDependencyDef("OwnerQuery");
            }
            return OwnerQueryDep;
        }

        @objid ("70c9cf78-c8ac-408c-8b20-1b1c7a82f4a5")
        public static SmDependency OwnerValDefDep() {
            if (OwnerValDefDep == null) {
            	OwnerValDefDep = classof().getDependencyDef("OwnerValDef");
            }
            return OwnerValDefDep;
        }

        @objid ("23622bfb-80fa-4cfa-a52f-998293460f44")
        public static SmDependency getOwnerValDefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerValDefDep;
        }

        @objid ("c833c664-22d8-4649-9e88-68d7466e95ec")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("56de1a71-fecf-4178-91c7-e4d81d805811")
        public static SmAttribute getClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ClassNameAtt;
        }

        @objid ("a9d7fe2c-ce44-4d5d-b1eb-71f1e8d65e85")
        public static SmDependency getOwnerQueryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerQueryDep;
        }

        @objid ("39ab5dc2-26c9-44a6-a9c5-33fd5b5db60a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e287a0e6-362e-4d91-a982-e0af9c4d975b")
            public ISmObjectData createData() {
                return new ExternProcessorData();
            }

            @objid ("e69a62b5-4476-4a96-b553-370dca4ca225")
            public SmObjectImpl createImpl() {
                return new ExternProcessorImpl();
            }

        }

        @objid ("adb0b02e-fff8-4898-b495-aedcdd744710")
        public static class ClassNameSmAttribute extends SmAttribute {
            @objid ("a23ee747-45be-4dad-bc64-283e666301f7")
            public Object getValue(ISmObjectData data) {
                return ((ExternProcessorData) data).mClassName;
            }

            @objid ("344fe160-deb2-4193-a57b-eec5d6757dd0")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternProcessorData) data).mClassName = value;
            }

        }

        @objid ("d19c493d-5f55-4ba4-ae34-f0f778dedbb8")
        public static class OwnerQuerySmDependency extends SmSingleDependency {
            @objid ("ae896ea6-a076-4cfa-bd74-dd1bb7a7df09")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternProcessorData) data).mOwnerQuery;
            }

            @objid ("c3e19f1b-fc1e-4197-b544-d5d0de0aa139")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternProcessorData) data).mOwnerQuery = value;
            }

            @objid ("2686b2d2-e18d-412c-8ae4-52e79f33b098")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.ProcessorDep();
            }

        }

        @objid ("181612bc-0201-42f4-8b08-226bc4392f01")
        public static class OwnerValDefSmDependency extends SmSingleDependency {
            @objid ("28ec8110-09d4-45aa-bb8e-adcce7cefa3d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternProcessorData) data).mOwnerValDef;
            }

            @objid ("43d8c693-9b36-49ed-a3f1-180a9de84eb8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternProcessorData) data).mOwnerValDef = value;
            }

            @objid ("02ce2add-f9e7-4dfa-a7da-83419bdc54d0")
            @Override
            public SmDependency getSymetric() {
                return MatrixValueDefinitionData.Metadata.ProcessorDep();
            }

        }

    }

}
