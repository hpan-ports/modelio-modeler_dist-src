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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.data.analyst.AnalystItemData;
import org.modelio.metamodel.data.uml.infrastructure.properties.TypedPropertyTableData;
import org.modelio.metamodel.impl.analyst.AnalystPropertyTableImpl;
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

@objid ("008ad1bc-ec8f-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=AnalystPropertyTable.class, factory=AnalystPropertyTableData.Metadata.ObjectFactory.class)
public class AnalystPropertyTableData extends TypedPropertyTableData {
    @objid ("529d6c61-0c49-4d62-9fd4-3caa7ef974ce")
    @SmaMetaAssociation(metaName="AnalystOwner", typeDataClass=AnalystItemData.class, min=0, max=1, smAssociationClass=Metadata.AnalystOwnerSmDependency.class)
     SmObjectImpl mAnalystOwner;

    @objid ("9b7400f0-2b84-4b27-b92e-054bc457269a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008ece48-ec96-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("01e493ae-2177-4c3a-9ea4-76dbb795aa96")
        private static SmClass smClass = null;

        @objid ("c966e075-7f06-41ce-b333-1151eed5d56d")
        private static SmDependency AnalystOwnerDep = null;

        @objid ("8e502ec3-71e4-4cd3-a8e1-2cf6a1edef33")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystPropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1b62c239-d178-4cd8-b264-ff76b158a66b")
        public static SmDependency AnalystOwnerDep() {
            if (AnalystOwnerDep == null) {
            	AnalystOwnerDep = classof().getDependencyDef("AnalystOwner");
            }
            return AnalystOwnerDep;
        }

        @objid ("5a7b271f-3572-4c7f-a545-f37ada61c62b")
        public static SmDependency getAnalystOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnalystOwnerDep;
        }

        @objid ("642d16c9-5b28-411e-a057-e4df1a49c4d6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008f337e-ec96-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("777eaddd-8f90-4d1c-86a6-ca01371d9036")
            public ISmObjectData createData() {
                return new AnalystPropertyTableData();
            }

            @objid ("1ebddb1e-b74c-4c0b-bd6d-86599bfdaf68")
            public SmObjectImpl createImpl() {
                return new AnalystPropertyTableImpl();
            }

        }

        @objid ("8cb18adc-07cb-4e36-8e8b-2d2432beae56")
        public static class AnalystOwnerSmDependency extends SmSingleDependency {
            @objid ("9433bbf6-f5eb-4024-961f-b45bc7455997")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AnalystPropertyTableData) data).mAnalystOwner;
            }

            @objid ("76382727-00ee-46fb-bd25-466db3892d2c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AnalystPropertyTableData) data).mAnalystOwner = value;
            }

            @objid ("62dc3183-c958-4c05-9163-80afa596fda0")
            @Override
            public SmDependency getSymetric() {
                return AnalystItemData.Metadata.AnalystPropertiesDep();
            }

        }

    }

}
