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
    @objid ("c20293df-0e11-4955-a248-1dc5ad89c054")
    @SmaMetaAssociation(metaName="AnalystOwner", typeDataClass=AnalystItemData.class, min=0, max=1, smAssociationClass=Metadata.AnalystOwnerSmDependency.class)
     SmObjectImpl mAnalystOwner;

    @objid ("7e9b2bee-a1c2-4a53-94c1-5e8d885b55e2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008ece48-ec96-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("c4f91f55-db48-405f-ac38-171365c20db1")
        private static SmClass smClass = null;

        @objid ("6d9a3ebe-4baf-44af-9b8e-72f4e362aad7")
        private static SmDependency AnalystOwnerDep = null;

        @objid ("716bc329-cb51-4581-81c2-e28c4b54586a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystPropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7c0a3de4-487e-4628-8491-0b1d5d12b688")
        public static SmDependency AnalystOwnerDep() {
            if (AnalystOwnerDep == null) {
            	AnalystOwnerDep = classof().getDependencyDef("AnalystOwner");
            }
            return AnalystOwnerDep;
        }

        @objid ("fcb32948-c83d-4238-8acc-437a9190db3d")
        public static SmDependency getAnalystOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnalystOwnerDep;
        }

        @objid ("eeca73b7-17b0-4a31-8d4f-11f0bf23bde3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008f337e-ec96-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("072c136f-b38b-44f3-b97e-907e875610de")
            public ISmObjectData createData() {
                return new AnalystPropertyTableData();
            }

            @objid ("183e7a07-1645-411d-a351-552e2ecb034c")
            public SmObjectImpl createImpl() {
                return new AnalystPropertyTableImpl();
            }

        }

        @objid ("8cb18adc-07cb-4e36-8e8b-2d2432beae56")
        public static class AnalystOwnerSmDependency extends SmSingleDependency {
            @objid ("573a5198-6583-45aa-bfc0-91e73dd2bbed")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AnalystPropertyTableData) data).mAnalystOwner;
            }

            @objid ("d00a790c-5db8-4ca2-bc32-ccb615bd8b15")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AnalystPropertyTableData) data).mAnalystOwner = value;
            }

            @objid ("1688364b-a69b-4f15-b186-b09b58bccc2d")
            @Override
            public SmDependency getSymetric() {
                return AnalystItemData.Metadata.AnalystPropertiesDep();
            }

        }

    }

}
