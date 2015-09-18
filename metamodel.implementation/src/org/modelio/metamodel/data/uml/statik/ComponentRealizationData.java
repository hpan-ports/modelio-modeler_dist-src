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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.ComponentData;
import org.modelio.metamodel.impl.uml.statik.ComponentRealizationImpl;
import org.modelio.metamodel.uml.statik.ComponentRealization;
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

@objid ("085ab992-591c-4bfe-a9dd-e52568b31bc1")
@SmaMetaClass(mmClass=ComponentRealization.class, factory=ComponentRealizationData.Metadata.ObjectFactory.class)
public class ComponentRealizationData extends ModelElementData {
    @objid ("ef118ecf-e80c-42d6-875c-46247d6b878f")
    @SmaMetaAssociation(metaName="RealizingClassifier", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.RealizingClassifierSmDependency.class, partof = true)
     SmObjectImpl mRealizingClassifier;

    @objid ("b1a8aea4-7e63-4a20-9127-26b277204624")
    @SmaMetaAssociation(metaName="Abstraction", typeDataClass=ComponentData.class, min=1, max=1, smAssociationClass=Metadata.AbstractionSmDependency.class)
     SmObjectImpl mAbstraction;

    @objid ("19d07ee9-dcd3-46d9-8b3c-83a1fa0f1c1b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("6e4ef81f-0098-42d8-bed7-74982373cf11")
    public static class Metadata {
        @objid ("8e551eca-8322-48b4-956d-ee93bc5badfb")
        private static SmClass smClass = null;

        @objid ("73360429-e8ba-435f-bb5f-3d720443175a")
        private static SmDependency RealizingClassifierDep = null;

        @objid ("302b67c4-6a34-4a79-8eeb-52f1f00d9de3")
        private static SmDependency AbstractionDep = null;

        @objid ("187e876f-3cab-43e5-8b94-2a8b01edf9a1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ComponentRealizationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8f0e44e4-dd76-4e69-92e1-0ebebb5f3a4a")
        public static SmDependency RealizingClassifierDep() {
            if (RealizingClassifierDep == null) {
            	RealizingClassifierDep = classof().getDependencyDef("RealizingClassifier");
            }
            return RealizingClassifierDep;
        }

        @objid ("396a2012-79bd-496f-999d-25cc2a69b136")
        public static SmDependency AbstractionDep() {
            if (AbstractionDep == null) {
            	AbstractionDep = classof().getDependencyDef("Abstraction");
            }
            return AbstractionDep;
        }

        @objid ("4fd6ad81-7529-4c4c-80d1-2b5dde3f2c38")
        public static SmDependency getAbstractionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AbstractionDep;
        }

        @objid ("a9c33ec5-5e35-41be-95c2-f03ee8c2eff0")
        public static SmDependency getRealizingClassifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingClassifierDep;
        }

        @objid ("0de09f75-e2c2-4ac0-a23a-d092cc7540ee")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1812942e-747f-496c-9e18-d01bd8796d2b")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("421bd14a-a96d-41be-8919-9cc0af96e467")
            public ISmObjectData createData() {
                return new ComponentRealizationData();
            }

            @objid ("e46129cd-762a-4508-868e-ae78cd4b2969")
            public SmObjectImpl createImpl() {
                return new ComponentRealizationImpl();
            }

        }

        @objid ("36536f6f-8be8-4f9e-b8c9-c5edcf8e4fb7")
        public static class RealizingClassifierSmDependency extends SmSingleDependency {
            @objid ("28358bc6-37af-45ac-9db0-788302d63959")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ComponentRealizationData) data).mRealizingClassifier;
            }

            @objid ("309c8ccb-5953-4771-aa0e-5f93e7cb11e2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ComponentRealizationData) data).mRealizingClassifier = value;
            }

            @objid ("cfdd0b2f-49de-40d8-96cd-ea627b65c8ec")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.RealizedComponentDep();
            }

        }

        @objid ("4f228a60-bd71-49f8-acd3-79bd06eba8d2")
        public static class AbstractionSmDependency extends SmSingleDependency {
            @objid ("997be956-6b6c-412b-990f-c892f4480ad2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ComponentRealizationData) data).mAbstraction;
            }

            @objid ("55c784b6-cafd-4125-ac40-e4336019c12b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ComponentRealizationData) data).mAbstraction = value;
            }

            @objid ("36260f94-9edd-4805-beaf-859377a683d5")
            @Override
            public SmDependency getSymetric() {
                return ComponentData.Metadata.RealizationDep();
            }

        }

    }

}
