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
package org.modelio.metamodel.data.uml.infrastructure.properties;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.LocalPropertyTableImpl;
import org.modelio.metamodel.uml.infrastructure.properties.LocalPropertyTable;
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

@objid ("006d9110-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=LocalPropertyTable.class, factory=LocalPropertyTableData.Metadata.ObjectFactory.class, cmsnode=true)
public class LocalPropertyTableData extends PropertyTableData {
    @objid ("ef661728-35a3-49d0-a7b1-183b2080d8a9")
    @SmaMetaAssociation(metaName="LocalAnnoted", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.LocalAnnotedSmDependency.class, partof = true)
     SmObjectImpl mLocalAnnoted;

    @objid ("01f2430b-28e1-468a-84b2-6d58beacbaf2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0069776a-ec97-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("4e43de63-4483-4284-bd04-a1486a7b564e")
        private static SmClass smClass = null;

        @objid ("57d77fc1-e798-4cae-bd2b-e926d235000e")
        private static SmDependency LocalAnnotedDep = null;

        @objid ("2bdb2ef7-1d2e-42da-aadb-bc210c5c4935")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LocalPropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9f3a47fb-0ebf-4b7f-9ff9-ba2482f473a3")
        public static SmDependency LocalAnnotedDep() {
            if (LocalAnnotedDep == null) {
            	LocalAnnotedDep = classof().getDependencyDef("LocalAnnoted");
            }
            return LocalAnnotedDep;
        }

        @objid ("759789c8-510c-41ac-bdf8-94da502fcc8a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("18f64fe6-b224-4b5e-a1f2-8569e4579fc3")
        public static SmDependency getLocalAnnotedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalAnnotedDep;
        }

        @objid ("006a0202-ec97-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("53acd780-9368-4c3b-aa6c-3a0440ec4aae")
            public ISmObjectData createData() {
                return new LocalPropertyTableData();
            }

            @objid ("19e04932-c465-47d9-9833-f395585afdfc")
            public SmObjectImpl createImpl() {
                return new LocalPropertyTableImpl();
            }

        }

        @objid ("006af61c-ec97-1098-b22e-001ec947cd2a")
        public static class LocalAnnotedSmDependency extends SmSingleDependency {
            @objid ("4e97f5c4-39fd-4ad7-a14a-409dd984d072")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LocalPropertyTableData) data).mLocalAnnoted;
            }

            @objid ("b9fcae81-a772-450b-91a3-313715fd5144")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LocalPropertyTableData) data).mLocalAnnoted = value;
            }

            @objid ("20c2f082-d460-40cb-86de-556c2d277d26")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.LocalPropertiesDep();
            }

        }

    }

}
