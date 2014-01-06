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
    @objid ("e2de8cfc-525e-4fbc-bba1-ce0d473c95c8")
    @SmaMetaAssociation(metaName="ThrownType", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.ThrownTypeSmDependency.class, partof = true)
     SmObjectImpl mThrownType;

    @objid ("5a3b12cf-83c7-4816-958e-7ba74d6490d5")
    @SmaMetaAssociation(metaName="Thrower", typeDataClass=OperationData.class, min=1, max=1, smAssociationClass=Metadata.ThrowerSmDependency.class)
     SmObjectImpl mThrower;

    @objid ("1dc598a1-9513-4f82-b01e-9a32597edba5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0032c044-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("08f3d007-5397-4dbf-b470-b9d03f7c8a79")
        private static SmClass smClass = null;

        @objid ("cd8ddc97-f9af-47b3-9a96-4a4aa31f59b1")
        private static SmDependency ThrownTypeDep = null;

        @objid ("7dcbc8a3-ffea-4ea3-841a-a7dd26eb1253")
        private static SmDependency ThrowerDep = null;

        @objid ("cf2a6c2a-382d-42cc-8a96-a1b9f1d83851")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RaisedExceptionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("231ee945-b3da-49ba-9014-f56181debc4d")
        public static SmDependency ThrownTypeDep() {
            if (ThrownTypeDep == null) {
            	ThrownTypeDep = classof().getDependencyDef("ThrownType");
            }
            return ThrownTypeDep;
        }

        @objid ("dbf6a909-95f1-46a1-8537-b04b7c11995a")
        public static SmDependency ThrowerDep() {
            if (ThrowerDep == null) {
            	ThrowerDep = classof().getDependencyDef("Thrower");
            }
            return ThrowerDep;
        }

        @objid ("6dbd6706-de58-4526-b27c-a940e1c370e0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8ce05f91-01d6-4a8a-b022-d8f1a3ee7945")
        public static SmDependency getThrowerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrowerDep;
        }

        @objid ("f98bd413-fd29-41ed-8f16-f0fce9d3390d")
        public static SmDependency getThrownTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrownTypeDep;
        }

        @objid ("00330270-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4badf973-7ece-4732-9050-7269f34890c8")
            public ISmObjectData createData() {
                return new RaisedExceptionData();
            }

            @objid ("b047ab12-ae86-4287-8db1-8753271684b9")
            public SmObjectImpl createImpl() {
                return new RaisedExceptionImpl();
            }

        }

        @objid ("003366fc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ThrowerSmDependency extends SmSingleDependency {
            @objid ("196e0adf-f15e-4ef8-80a5-2633d40a47f8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RaisedExceptionData) data).mThrower;
            }

            @objid ("024bba15-20ac-4089-ad5c-e476b2199129")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RaisedExceptionData) data).mThrower = value;
            }

            @objid ("db1438ce-eec8-4889-9d88-2dff49b238fb")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.ThrownDep();
            }

        }

        @objid ("0033db82-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ThrownTypeSmDependency extends SmSingleDependency {
            @objid ("9d3f8665-6b75-4c97-a743-39268caae0e9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RaisedExceptionData) data).mThrownType;
            }

            @objid ("6dab9049-38c1-44be-b92a-21c843f7ebac")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RaisedExceptionData) data).mThrownType = value;
            }

            @objid ("dbbe0a16-5b25-4d0f-8473-d4c2b4cf3720")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.ThrowingDep();
            }

        }

    }

}
