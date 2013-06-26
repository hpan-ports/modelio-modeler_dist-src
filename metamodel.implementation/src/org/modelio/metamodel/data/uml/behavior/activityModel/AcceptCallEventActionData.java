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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.AcceptCallEventActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptCallEventAction;
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

@objid ("00246896-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AcceptCallEventAction.class, factory=AcceptCallEventActionData.Metadata.ObjectFactory.class)
public class AcceptCallEventActionData extends ActivityActionData {
    @objid ("ffa16a76-1515-482b-b2ed-b407dfab2282")
    @SmaMetaAssociation(metaName="Called", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("d0449eb8-8aaf-4372-acdb-62a3ce665916")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00443982-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3f0731dc-3491-40aa-b367-df1042da3a9c")
        private static SmClass smClass = null;

        @objid ("53b2733f-1a9d-4489-9bdc-4d6caf4ac1c5")
        private static SmDependency CalledDep = null;

        @objid ("7d6a5ef3-b332-45b5-a6dc-998e9aa71754")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptCallEventActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cf4de497-1d08-4f3c-81ee-f7e4c2c80c0a")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("d91b151a-f5e8-47a5-b94c-4f51488f4961")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4736c662-c695-41a3-90b8-57084fc2e71f")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("00447e10-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("79263861-b8ad-4a02-a78d-fb36a1396134")
            public ISmObjectData createData() {
                return new AcceptCallEventActionData();
            }

            @objid ("138a59ab-d9ee-4f88-afe9-ebfedbb58977")
            public SmObjectImpl createImpl() {
                return new AcceptCallEventActionImpl();
            }

        }

        @objid ("0044e102-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("ca52e49e-cd19-4a0e-a686-48372885bd82")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AcceptCallEventActionData) data).mCalled;
            }

            @objid ("d15bba11-def7-460d-977f-e50c2dd9d72e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AcceptCallEventActionData) data).mCalled = value;
            }

            @objid ("65c341b1-7e28-4c07-b7a7-5100b726116c")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.EntryPointActionDep();
            }

        }

    }

}
