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
package org.modelio.metamodel.data.uml.infrastructure.matrix;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.data.uml.infrastructure.ExternProcessorData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableData;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.MatrixValueDefinitionImpl;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
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

@objid ("f8547119-965d-492b-818a-83746a647c78")
@SmaMetaClass(mmClass=MatrixValueDefinition.class, factory=MatrixValueDefinitionData.Metadata.ObjectFactory.class)
public class MatrixValueDefinitionData extends ElementData {
    @objid ("72b16407-f229-44a0-bb83-0fbedd168394")
    @SmaMetaAssociation(metaName="Processor", typeDataClass=ExternProcessorData.class, min=1, max=1, smAssociationClass=Metadata.ProcessorSmDependency.class, component = true)
     SmObjectImpl mProcessor;

    @objid ("f017f95f-0ad9-4993-9c80-5797b4106183")
    @SmaMetaAssociation(metaName="Parameters", typeDataClass=PropertyTableData.class, min=1, max=1, smAssociationClass=Metadata.ParametersSmDependency.class, component = true)
     SmObjectImpl mParameters;

    @objid ("e20c3df3-0a06-4a98-9dcd-76ace959a4dd")
    @SmaMetaAssociation(metaName="Matrix", typeDataClass=MatrixDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.MatrixSmDependency.class)
     SmObjectImpl mMatrix;

    @objid ("565bf7c2-9171-4c21-b9ed-133ff792ebd5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("3158f254-b1ee-46ad-8292-8d24135be062")
    public static class Metadata {
        @objid ("eb880985-a81e-4873-8635-6a58e57c01bc")
        private static SmClass smClass = null;

        @objid ("d9df98bc-162d-4564-9a9f-9a4c7faea224")
        private static SmDependency ProcessorDep = null;

        @objid ("9ca6767e-a349-49e6-b212-01a9ede0d388")
        private static SmDependency ParametersDep = null;

        @objid ("8cdf8bc3-0a68-4694-995f-29b31b6d19da")
        private static SmDependency MatrixDep = null;

        @objid ("1d97d44a-bfd1-44ed-a25e-13e88aecb9d0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MatrixValueDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dfb64512-475c-4659-98c6-024c6ebe29c6")
        public static SmDependency ProcessorDep() {
            if (ProcessorDep == null) {
            	ProcessorDep = classof().getDependencyDef("Processor");
            }
            return ProcessorDep;
        }

        @objid ("ba791a82-ff1a-4e50-8b83-612a62ec9c79")
        public static SmDependency ParametersDep() {
            if (ParametersDep == null) {
            	ParametersDep = classof().getDependencyDef("Parameters");
            }
            return ParametersDep;
        }

        @objid ("3cec4bc2-5b54-4268-a95e-f3647ecc7eaf")
        public static SmDependency MatrixDep() {
            if (MatrixDep == null) {
            	MatrixDep = classof().getDependencyDef("Matrix");
            }
            return MatrixDep;
        }

        @objid ("ce50921f-b326-401c-8465-aa3709f36327")
        public static SmDependency getMatrixDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatrixDep;
        }

        @objid ("e64401ab-921d-424d-8ca0-f5468f9962e5")
        public static SmDependency getParametersDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParametersDep;
        }

        @objid ("d4251ffe-50e2-4ed0-bf6e-dd196cd3508f")
        public static SmDependency getProcessorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessorDep;
        }

        @objid ("a0d42d72-f90e-431c-a9e2-f32c6011d0ff")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b7c061ff-1453-44df-ad09-48683dfdbb0a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cb543f45-c644-454e-a57c-5b1036ccac9b")
            public ISmObjectData createData() {
                return new MatrixValueDefinitionData();
            }

            @objid ("35c26d7a-8050-41ee-ad09-3e56656e5389")
            public SmObjectImpl createImpl() {
                return new MatrixValueDefinitionImpl();
            }

        }

        @objid ("8256c3c4-63bf-473a-87b6-ac5f01cf6d1c")
        public static class ProcessorSmDependency extends SmSingleDependency {
            @objid ("eade7710-b067-4a53-b9e5-17191991f5c7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixValueDefinitionData) data).mProcessor;
            }

            @objid ("7d8de09f-90c8-484b-b907-ece65a84a744")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixValueDefinitionData) data).mProcessor = value;
            }

            @objid ("3434dde8-460d-4427-964f-1249edba228a")
            @Override
            public SmDependency getSymetric() {
                return ExternProcessorData.Metadata.OwnerValDefDep();
            }

        }

        @objid ("3b95ac5c-fc97-4565-b47c-d5d912e3d695")
        public static class ParametersSmDependency extends SmSingleDependency {
            @objid ("264c7c81-4fb9-45a3-a63f-2c2e1482a870")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixValueDefinitionData) data).mParameters;
            }

            @objid ("4e8c455a-1431-4a5d-90cd-fd09db5ca419")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixValueDefinitionData) data).mParameters = value;
            }

            @objid ("3bafa4de-6092-4301-8a28-30f4356092ef")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableData.Metadata.OwnerValDefDep();
            }

        }

        @objid ("d6462794-1201-4292-90c3-9f2057f46ae8")
        public static class MatrixSmDependency extends SmSingleDependency {
            @objid ("f2054564-0e20-48b4-a4c9-fe29ba5f5930")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixValueDefinitionData) data).mMatrix;
            }

            @objid ("0c428e8a-4f47-4190-8cec-34d964fafb55")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixValueDefinitionData) data).mMatrix = value;
            }

            @objid ("b1ed9d2b-1199-47d9-ab26-7592a73ff754")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.ValuesDefinitionDep();
            }

        }

    }

}
