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
    @objid ("e07db3dd-2b30-4450-9486-cf238349cac1")
    @SmaMetaAssociation(metaName="SComposed", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.SComposedSmDependency.class)
     SmObjectImpl mSComposed;

    @objid ("9d0cbdd9-7cc0-475a-83fd-6e21791bc07c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005e8472-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("92b5d714-4937-4b54-aebf-428634ccf0ee")
        private static SmClass smClass = null;

        @objid ("a119512d-28de-4408-be8b-79724fbf827c")
        private static SmDependency SComposedDep = null;

        @objid ("03e24fff-99ec-45b4-834e-8ddb568cc1ac")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InternalTransitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("00b84384-6b58-4717-b9d3-79a413da5c35")
        public static SmDependency SComposedDep() {
            if (SComposedDep == null) {
            	SComposedDep = classof().getDependencyDef("SComposed");
            }
            return SComposedDep;
        }

        @objid ("126fef86-3f29-4f5b-bb39-c5aa75b3c4b9")
        public static SmDependency getSComposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SComposedDep;
        }

        @objid ("7c5ace05-70d5-4b25-aa75-399981b4766a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("005ec6da-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("867ab841-37be-41f0-b51f-33f90a2721e1")
            public ISmObjectData createData() {
                return new InternalTransitionData();
            }

            @objid ("a3edec34-bca6-47c4-9675-94c2e6aed92f")
            public SmObjectImpl createImpl() {
                return new InternalTransitionImpl();
            }

        }

        @objid ("005f2a1c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SComposedSmDependency extends SmSingleDependency {
            @objid ("57baeaee-5ff6-40e2-9f7b-82cabd4a49b4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InternalTransitionData) data).mSComposed;
            }

            @objid ("c75a7317-03ad-4d55-a79d-22cba02c118c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InternalTransitionData) data).mSComposed = value;
            }

            @objid ("6f59b00b-29ab-4561-a5f4-878689f0ea81")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.InternalDep();
            }

        }

    }

}
