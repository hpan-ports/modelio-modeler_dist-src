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
    @objid ("89a68090-daa5-42a2-a0f9-72493e026b10")
    @SmaMetaAssociation(metaName="ThrownType", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.ThrownTypeSmDependency.class, partof = true)
     SmObjectImpl mThrownType;

    @objid ("bf468323-26af-4143-b0b1-56fa5375486c")
    @SmaMetaAssociation(metaName="Thrower", typeDataClass=OperationData.class, min=1, max=1, smAssociationClass=Metadata.ThrowerSmDependency.class)
     SmObjectImpl mThrower;

    @objid ("3cbbabbe-e1ee-4cd1-a247-e3fd342e274f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0032c044-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4451a380-5d2f-4bbf-8e3f-0629f4fceb20")
        private static SmClass smClass = null;

        @objid ("65e116d0-9118-43a4-8494-332d52d79839")
        private static SmDependency ThrownTypeDep = null;

        @objid ("06fad4ec-5c51-4b55-a5da-1d9076343625")
        private static SmDependency ThrowerDep = null;

        @objid ("593918a3-0b6d-4e47-a0a5-5a362634d828")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RaisedExceptionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b003468f-9c4b-492b-9aad-c1c660f27bb5")
        public static SmDependency ThrownTypeDep() {
            if (ThrownTypeDep == null) {
            	ThrownTypeDep = classof().getDependencyDef("ThrownType");
            }
            return ThrownTypeDep;
        }

        @objid ("7f7410cf-47db-4e0e-9d19-51567b5fb159")
        public static SmDependency ThrowerDep() {
            if (ThrowerDep == null) {
            	ThrowerDep = classof().getDependencyDef("Thrower");
            }
            return ThrowerDep;
        }

        @objid ("1dad6e54-e249-4f8e-af43-b7f7b44498e6")
        public static SmDependency getThrowerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrowerDep;
        }

        @objid ("081250e2-9611-4cfc-981c-d8ef0ab2a957")
        public static SmDependency getThrownTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrownTypeDep;
        }

        @objid ("99f10478-f0bf-4590-bb5a-2599e99b0619")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00330270-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("37a17ed6-7ff7-41ae-a0d8-61d36ccb4961")
            public ISmObjectData createData() {
                return new RaisedExceptionData();
            }

            @objid ("97ed0580-e8b5-44c8-ad18-923c9587c420")
            public SmObjectImpl createImpl() {
                return new RaisedExceptionImpl();
            }

        }

        @objid ("003366fc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ThrowerSmDependency extends SmSingleDependency {
            @objid ("2a1fa2df-6aef-4baa-8223-173a32b02517")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RaisedExceptionData) data).mThrower;
            }

            @objid ("b9641dfc-32a0-437f-b4f5-65160b317d80")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RaisedExceptionData) data).mThrower = value;
            }

            @objid ("90e4d7cb-d65f-4807-a58f-09d7a9c073a0")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.ThrownDep();
            }

        }

        @objid ("0033db82-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ThrownTypeSmDependency extends SmSingleDependency {
            @objid ("00f9441e-d9df-4488-989f-132a6b1348fe")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RaisedExceptionData) data).mThrownType;
            }

            @objid ("25efd10e-6b33-41ed-a89f-ad0c6ee8e854")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RaisedExceptionData) data).mThrownType = value;
            }

            @objid ("67b1a58f-46fc-46f3-b63b-25e35f3db76e")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.ThrowingDep();
            }

        }

    }

}
