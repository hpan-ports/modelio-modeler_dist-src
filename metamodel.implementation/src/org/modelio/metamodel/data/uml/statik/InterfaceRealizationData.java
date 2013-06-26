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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.InterfaceData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.impl.uml.statik.InterfaceRealizationImpl;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
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

@objid ("000f6478-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InterfaceRealization.class, factory=InterfaceRealizationData.Metadata.ObjectFactory.class)
public class InterfaceRealizationData extends ModelElementData {
    @objid ("0dd3b60a-fadb-4e61-aab4-4c1972f57c4c")
    @SmaMetaAssociation(metaName="Implemented", typeDataClass=InterfaceData.class, min=1, max=1, smAssociationClass=Metadata.ImplementedSmDependency.class, partof = true)
     SmObjectImpl mImplemented;

    @objid ("9452a1ff-b341-4937-acca-efb26f684e1b")
    @SmaMetaAssociation(metaName="Implementer", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ImplementerSmDependency.class)
     SmObjectImpl mImplementer;

    @objid ("b3be5ad1-ff5f-4130-9ced-8bf29cbd803b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ebae8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a4dced9c-381c-40cd-b75b-abb6ddbaa8ee")
        private static SmClass smClass = null;

        @objid ("9a5a15d7-fa05-4f33-b1ac-3a07515585da")
        private static SmDependency ImplementedDep = null;

        @objid ("451b1c08-b17a-4bc9-badb-29e7b0a3906e")
        private static SmDependency ImplementerDep = null;

        @objid ("3a5d23da-dc3f-43f5-9e10-9287ac00eda3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InterfaceRealizationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("274f370a-7878-4981-aff6-2b96fdff6ce9")
        public static SmDependency ImplementedDep() {
            if (ImplementedDep == null) {
            	ImplementedDep = classof().getDependencyDef("Implemented");
            }
            return ImplementedDep;
        }

        @objid ("f86f681d-51c6-40d2-abab-0b9eaaa2d66b")
        public static SmDependency ImplementerDep() {
            if (ImplementerDep == null) {
            	ImplementerDep = classof().getDependencyDef("Implementer");
            }
            return ImplementerDep;
        }

        @objid ("a3a834f7-73ca-4902-8197-012e8f5eba18")
        public static SmDependency getImplementerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementerDep;
        }

        @objid ("53aad2f0-2709-4b1a-810b-aff6e1b96e75")
        public static SmDependency getImplementedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementedDep;
        }

        @objid ("b5e3eb30-cf31-47f3-9d53-038093ae8c6e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003efb02-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ee57d6e3-75e4-450d-8145-0a448fc386d6")
            public ISmObjectData createData() {
                return new InterfaceRealizationData();
            }

            @objid ("d957196d-19dc-43f3-8397-47a1d36c9322")
            public SmObjectImpl createImpl() {
                return new InterfaceRealizationImpl();
            }

        }

        @objid ("003f5c50-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImplementerSmDependency extends SmSingleDependency {
            @objid ("1f82c23d-f3b0-4b07-881c-69b4886a17e5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InterfaceRealizationData) data).mImplementer;
            }

            @objid ("45519434-42e8-4e89-92f6-8629cb798e8e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InterfaceRealizationData) data).mImplementer = value;
            }

            @objid ("ac78557b-9ec2-4798-9fa5-43a481ec4f70")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.RealizedDep();
            }

        }

        @objid ("003fd00e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImplementedSmDependency extends SmSingleDependency {
            @objid ("5eb4f21f-0879-4a75-b91e-f69de57f0db0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InterfaceRealizationData) data).mImplemented;
            }

            @objid ("f2eae4b5-143c-4d04-990d-5daa73ce8c87")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InterfaceRealizationData) data).mImplemented = value;
            }

            @objid ("45d9d01d-ddb0-4ba6-bdf2-2ac3a8db8fef")
            @Override
            public SmDependency getSymetric() {
                return InterfaceData.Metadata.ImplementedLinkDep();
            }

        }

    }

}
