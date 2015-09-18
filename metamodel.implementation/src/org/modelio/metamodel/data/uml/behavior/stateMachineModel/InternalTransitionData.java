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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.InternalTransitionImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
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

@objid ("0051a63a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InternalTransition.class, factory=InternalTransitionData.Metadata.ObjectFactory.class)
public class InternalTransitionData extends TransitionData {
    @objid ("a5979c4b-0864-4625-ab27-34111b565f8e")
    @SmaMetaAssociation(metaName="SComposed", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.SComposedSmDependency.class)
     SmObjectImpl mSComposed;

    @objid ("f5f6ecf7-f445-4a06-bbf7-46440dc71ff9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005e8472-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4a1363b4-6fc6-48bb-8db4-10ecf93bbce9")
        private static SmClass smClass = null;

        @objid ("2713dc45-e1bc-477c-9984-9629f18f05ea")
        private static SmDependency SComposedDep = null;

        @objid ("6c4e6ffa-5e7e-4e36-b5f0-5f594a70a3b7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InternalTransitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e025acac-b582-443f-859c-bbd69508e9a1")
        public static SmDependency SComposedDep() {
            if (SComposedDep == null) {
            	SComposedDep = classof().getDependencyDef("SComposed");
            }
            return SComposedDep;
        }

        @objid ("212ec2e5-0780-4ce6-b8e6-d471fba38588")
        public static SmDependency getSComposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SComposedDep;
        }

        @objid ("45236453-f191-4216-9dce-6ddc62b19a42")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("005ec6da-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("01366dc0-399d-4d1c-8ea0-8b43e8dc377c")
            public ISmObjectData createData() {
                return new InternalTransitionData();
            }

            @objid ("49420454-7cb3-4523-a221-f9b2c86d90a4")
            public SmObjectImpl createImpl() {
                return new InternalTransitionImpl();
            }

        }

        @objid ("005f2a1c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SComposedSmDependency extends SmSingleDependency {
            @objid ("915eeb92-7d54-4c03-8f9c-59b329388fbc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InternalTransitionData) data).mSComposed;
            }

            @objid ("934ac92f-d611-4a03-925d-1534146a2f11")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InternalTransitionData) data).mSComposed = value;
            }

            @objid ("eef6211b-07ed-441f-9d0f-7c85373dc823")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.InternalDep();
            }

        }

    }

}
