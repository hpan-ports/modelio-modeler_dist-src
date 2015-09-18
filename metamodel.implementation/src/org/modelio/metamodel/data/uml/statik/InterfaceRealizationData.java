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
    @objid ("068eb225-0a69-44f2-b45b-74c2b77d12fb")
    @SmaMetaAssociation(metaName="Implemented", typeDataClass=InterfaceData.class, min=1, max=1, smAssociationClass=Metadata.ImplementedSmDependency.class, partof = true)
     SmObjectImpl mImplemented;

    @objid ("a419497b-2d82-4f9c-90c0-29ca1fee89b6")
    @SmaMetaAssociation(metaName="Implementer", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ImplementerSmDependency.class)
     SmObjectImpl mImplementer;

    @objid ("0221412c-e105-45be-861e-807e292b10ed")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ebae8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("be73fc41-e470-4524-88ca-5d494ce01db5")
        private static SmClass smClass = null;

        @objid ("d4a1908c-9ed8-4231-9452-213b9118c3c2")
        private static SmDependency ImplementedDep = null;

        @objid ("a5760adb-ea62-4ff8-9f8f-cf28548ed5ce")
        private static SmDependency ImplementerDep = null;

        @objid ("52dc5833-2bd2-4a58-bfb5-164a00bfa831")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InterfaceRealizationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("08aae9da-be2a-4d07-9364-3f12e93974a9")
        public static SmDependency ImplementedDep() {
            if (ImplementedDep == null) {
            	ImplementedDep = classof().getDependencyDef("Implemented");
            }
            return ImplementedDep;
        }

        @objid ("dc9640c6-03d2-4734-a39d-5729d08a35d3")
        public static SmDependency ImplementerDep() {
            if (ImplementerDep == null) {
            	ImplementerDep = classof().getDependencyDef("Implementer");
            }
            return ImplementerDep;
        }

        @objid ("1ba0b076-57dd-4e32-97aa-68a5ec8e2c0d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f10b8b5c-10a7-4785-8610-f814d3ec11b1")
        public static SmDependency getImplementedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementedDep;
        }

        @objid ("7c03704e-7e18-45b2-9f46-6fac2c43e28c")
        public static SmDependency getImplementerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementerDep;
        }

        @objid ("003efb02-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2037ea11-c778-4bed-bfe5-99d9f6c64d03")
            public ISmObjectData createData() {
                return new InterfaceRealizationData();
            }

            @objid ("049db4ba-7ab4-43db-8654-358c90c16294")
            public SmObjectImpl createImpl() {
                return new InterfaceRealizationImpl();
            }

        }

        @objid ("003f5c50-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImplementerSmDependency extends SmSingleDependency {
            @objid ("dbfa9193-bf56-4482-9497-723837626e97")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InterfaceRealizationData) data).mImplementer;
            }

            @objid ("a479d21c-0b45-4fa3-916d-1e6ec34a8f61")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InterfaceRealizationData) data).mImplementer = value;
            }

            @objid ("5534b4e8-0f29-46b3-9d44-07beddd7b994")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.RealizedDep();
            }

        }

        @objid ("003fd00e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImplementedSmDependency extends SmSingleDependency {
            @objid ("c57f577c-5374-4432-b85e-9d37c54a30c1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InterfaceRealizationData) data).mImplemented;
            }

            @objid ("549c89ef-8d3f-49b0-a419-b286940b1c83")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InterfaceRealizationData) data).mImplemented = value;
            }

            @objid ("188a8e58-bda0-4c86-a6ad-d69ac06757c2")
            @Override
            public SmDependency getSymetric() {
                return InterfaceData.Metadata.ImplementedLinkDep();
            }

        }

    }

}
