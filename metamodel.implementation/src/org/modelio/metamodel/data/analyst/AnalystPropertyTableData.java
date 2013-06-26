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
    @objid ("ea9846ee-c5de-44a1-889d-e9d8e8eb9135")
    @SmaMetaAssociation(metaName="AnalystOwner", typeDataClass=AnalystItemData.class, min=0, max=1, smAssociationClass=Metadata.AnalystOwnerSmDependency.class)
     SmObjectImpl mAnalystOwner;

    @objid ("a64ebe31-add7-4f39-9c38-4958c7837d2a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008ece48-ec96-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("e2eeaab2-9a45-414d-9618-d87b061af28a")
        private static SmClass smClass = null;

        @objid ("e8310cd6-8f86-4ec7-afa1-90b008a689a2")
        private static SmDependency AnalystOwnerDep = null;

        @objid ("43967f84-2f4b-49b2-a411-5bf0499fdeac")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystPropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6ca2781f-7a7f-4cca-9268-e2cb248e07b7")
        public static SmDependency AnalystOwnerDep() {
            if (AnalystOwnerDep == null) {
            	AnalystOwnerDep = classof().getDependencyDef("AnalystOwner");
            }
            return AnalystOwnerDep;
        }

        @objid ("fdd0ffd8-7c78-4441-b21c-19a70df8820c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("450b4334-f884-4a14-a39b-1fc49a8849cf")
        public static SmDependency getAnalystOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnalystOwnerDep;
        }

        @objid ("008f337e-ec96-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fa180584-825a-4553-83c2-cf98b4d539db")
            public ISmObjectData createData() {
                return new AnalystPropertyTableData();
            }

            @objid ("59e50ded-dc2b-45e2-b4ac-73e5fb399de3")
            public SmObjectImpl createImpl() {
                return new AnalystPropertyTableImpl();
            }

        }

        @objid ("8cb18adc-07cb-4e36-8e8b-2d2432beae56")
        public static class AnalystOwnerSmDependency extends SmSingleDependency {
            @objid ("e90b4994-b21e-4791-9dba-4e95c99e1200")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AnalystPropertyTableData) data).mAnalystOwner;
            }

            @objid ("88ccfdf8-1c24-4f1f-8e1f-fe3cf373bccb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AnalystPropertyTableData) data).mAnalystOwner = value;
            }

            @objid ("6c540357-1071-4bda-8338-a5e2b2ffee44")
            @Override
            public SmDependency getSymetric() {
                return AnalystItemData.Metadata.AnalystPropertiesDep();
            }

        }

    }

}
