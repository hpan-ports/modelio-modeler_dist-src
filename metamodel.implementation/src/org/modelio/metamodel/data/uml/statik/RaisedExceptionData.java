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
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.statik.RaisedExceptionImpl;
import org.modelio.metamodel.uml.statik.RaisedException;
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

@objid ("001afd60-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=RaisedException.class, factory=RaisedExceptionData.Metadata.ObjectFactory.class)
public class RaisedExceptionData extends ModelElementData {
    @objid ("c7b52ea8-8379-4db2-81e0-918b9f29e6a2")
    @SmaMetaAssociation(metaName="ThrownType", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.ThrownTypeSmDependency.class, partof = true)
     SmObjectImpl mThrownType;

    @objid ("5f0f9620-045e-4865-8dd8-1643a6be6988")
    @SmaMetaAssociation(metaName="Thrower", typeDataClass=OperationData.class, min=1, max=1, smAssociationClass=Metadata.ThrowerSmDependency.class)
     SmObjectImpl mThrower;

    @objid ("894476e5-828e-472d-8031-56d233fc1703")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0032c044-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("44900b06-5a2f-48d8-9b02-5e110530c665")
        private static SmClass smClass = null;

        @objid ("744ba1c1-f336-4a82-91f7-5b5cac077240")
        private static SmDependency ThrownTypeDep = null;

        @objid ("acb6099c-ff4b-4321-816f-50b4def13526")
        private static SmDependency ThrowerDep = null;

        @objid ("810d3f59-1cce-4a7b-ab33-d5fe50b15c53")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RaisedExceptionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("05406a1e-e2be-484f-88ff-582e7f333360")
        public static SmDependency ThrownTypeDep() {
            if (ThrownTypeDep == null) {
            	ThrownTypeDep = classof().getDependencyDef("ThrownType");
            }
            return ThrownTypeDep;
        }

        @objid ("58d7258d-748b-4c05-9e50-76a0ce897020")
        public static SmDependency ThrowerDep() {
            if (ThrowerDep == null) {
            	ThrowerDep = classof().getDependencyDef("Thrower");
            }
            return ThrowerDep;
        }

        @objid ("dceb140d-d938-4b4e-af01-8cf1c640aa49")
        public static SmDependency getThrownTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrownTypeDep;
        }

        @objid ("1ef7bf7e-5284-44d9-86a9-f43558f30a22")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("345f5734-15d6-4ab5-8322-faccc2744ff9")
        public static SmDependency getThrowerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrowerDep;
        }

        @objid ("00330270-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e26cf45e-52ee-4c70-bd2a-ec281546118f")
            public ISmObjectData createData() {
                return new RaisedExceptionData();
            }

            @objid ("b5b95765-820b-4387-a19a-9690b20be14c")
            public SmObjectImpl createImpl() {
                return new RaisedExceptionImpl();
            }

        }

        @objid ("003366fc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ThrowerSmDependency extends SmSingleDependency {
            @objid ("94f5128d-81ee-4a85-b040-06bb58f27e31")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RaisedExceptionData) data).mThrower;
            }

            @objid ("c7f909ab-be50-4727-ad62-f62d543a363f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RaisedExceptionData) data).mThrower = value;
            }

            @objid ("1cf9b84b-26f6-4cd7-b25e-a4c217b55e5b")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.ThrownDep();
            }

        }

        @objid ("0033db82-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ThrownTypeSmDependency extends SmSingleDependency {
            @objid ("9ad09f89-5126-4f1f-894b-abe6546b2e83")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RaisedExceptionData) data).mThrownType;
            }

            @objid ("6a55c447-845a-4123-822d-6068c3df8b4e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RaisedExceptionData) data).mThrownType = value;
            }

            @objid ("6bd037d5-6e1d-45e7-993a-fc47704c501f")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.ThrowingDep();
            }

        }

    }

}
