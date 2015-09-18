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
    @objid ("75fdd658-c48a-418e-a0ac-f4dc06833c50")
    @SmaMetaAssociation(metaName="Processor", typeDataClass=ExternProcessorData.class, min=1, max=1, smAssociationClass=Metadata.ProcessorSmDependency.class, component = true)
     SmObjectImpl mProcessor;

    @objid ("a54dd2d4-0f84-4e3b-8444-a4eacab76d6c")
    @SmaMetaAssociation(metaName="Parameters", typeDataClass=PropertyTableData.class, min=1, max=1, smAssociationClass=Metadata.ParametersSmDependency.class, component = true)
     SmObjectImpl mParameters;

    @objid ("8f55ff3d-5621-438f-882e-a798bf344e93")
    @SmaMetaAssociation(metaName="Matrix", typeDataClass=MatrixDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.MatrixSmDependency.class)
     SmObjectImpl mMatrix;

    @objid ("20d3314c-2f3c-499a-b9c3-7fc933531f34")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("3158f254-b1ee-46ad-8292-8d24135be062")
    public static class Metadata {
        @objid ("78bed382-a40c-4d53-9813-f7bacb3076d8")
        private static SmClass smClass = null;

        @objid ("e80ff938-af2d-4bc5-8901-c8f1a4221ce4")
        private static SmDependency ProcessorDep = null;

        @objid ("2b84a95c-5a76-41fb-956e-7538c5640710")
        private static SmDependency ParametersDep = null;

        @objid ("36df84b8-b27c-46ba-8e53-07655a2cfd6b")
        private static SmDependency MatrixDep = null;

        @objid ("bb3825d1-be17-4d4f-bf81-cfba78a1833f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MatrixValueDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2c122cb8-cfb4-4404-ac94-d727953bbe6e")
        public static SmDependency ProcessorDep() {
            if (ProcessorDep == null) {
            	ProcessorDep = classof().getDependencyDef("Processor");
            }
            return ProcessorDep;
        }

        @objid ("a197249e-0ac0-4a15-8aac-650a85e11aad")
        public static SmDependency ParametersDep() {
            if (ParametersDep == null) {
            	ParametersDep = classof().getDependencyDef("Parameters");
            }
            return ParametersDep;
        }

        @objid ("ee9fba60-286a-453b-8c5c-ea48f515162b")
        public static SmDependency MatrixDep() {
            if (MatrixDep == null) {
            	MatrixDep = classof().getDependencyDef("Matrix");
            }
            return MatrixDep;
        }

        @objid ("aa3af55e-2cd8-4c31-bbc1-d21ccbe2f71d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2635c997-c91b-4adc-81e8-856be8ffa14b")
        public static SmDependency getProcessorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessorDep;
        }

        @objid ("2f6ba1e5-e3ae-4b8b-9624-517c30424493")
        public static SmDependency getMatrixDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatrixDep;
        }

        @objid ("fef938ed-0f3d-4ece-9891-35393967816a")
        public static SmDependency getParametersDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParametersDep;
        }

        @objid ("b7c061ff-1453-44df-ad09-48683dfdbb0a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7d185eaf-05ec-4b2d-bf75-558f9e453def")
            public ISmObjectData createData() {
                return new MatrixValueDefinitionData();
            }

            @objid ("b865477e-14e6-499a-9599-1847ba09a25d")
            public SmObjectImpl createImpl() {
                return new MatrixValueDefinitionImpl();
            }

        }

        @objid ("8256c3c4-63bf-473a-87b6-ac5f01cf6d1c")
        public static class ProcessorSmDependency extends SmSingleDependency {
            @objid ("ec873e78-887f-484c-aecb-74e8050f6707")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixValueDefinitionData) data).mProcessor;
            }

            @objid ("f071b4aa-dbf9-4f4e-82af-10646017986e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixValueDefinitionData) data).mProcessor = value;
            }

            @objid ("bb245b5c-fe72-4d43-aded-925cd08e4295")
            @Override
            public SmDependency getSymetric() {
                return ExternProcessorData.Metadata.OwnerValDefDep();
            }

        }

        @objid ("3b95ac5c-fc97-4565-b47c-d5d912e3d695")
        public static class ParametersSmDependency extends SmSingleDependency {
            @objid ("03e6e7de-4e1c-4aad-9a63-4dba4e119d81")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixValueDefinitionData) data).mParameters;
            }

            @objid ("4b510ab3-476f-4dca-a52c-63fe735ab803")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixValueDefinitionData) data).mParameters = value;
            }

            @objid ("92d5bd20-1a36-40f2-aa23-71aad38c8e80")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableData.Metadata.OwnerValDefDep();
            }

        }

        @objid ("d6462794-1201-4292-90c3-9f2057f46ae8")
        public static class MatrixSmDependency extends SmSingleDependency {
            @objid ("da3832d3-e95b-440d-9731-4d7366fc6256")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MatrixValueDefinitionData) data).mMatrix;
            }

            @objid ("99f89e09-f401-4e5e-908d-df40afad1589")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MatrixValueDefinitionData) data).mMatrix = value;
            }

            @objid ("7716e190-e408-454c-90b0-31e3f0bb94c6")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.ValuesDefinitionDep();
            }

        }

    }

}
