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
    @objid ("faf87935-843b-400d-a837-fd66a2763db5")
    @SmaMetaAssociation(metaName="SComposed", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.SComposedSmDependency.class)
     SmObjectImpl mSComposed;

    @objid ("2df96909-8409-4af8-81e2-7ad6247218f5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005e8472-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d7fd71c5-f29b-4922-800e-f6a0492309fd")
        private static SmClass smClass = null;

        @objid ("3aa8b5c4-f252-4552-8ba0-739182133401")
        private static SmDependency SComposedDep = null;

        @objid ("b8d80885-5017-49c8-a21e-ab756cae142e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InternalTransitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8ce82b49-c75d-4d6f-8881-409b49b25708")
        public static SmDependency SComposedDep() {
            if (SComposedDep == null) {
            	SComposedDep = classof().getDependencyDef("SComposed");
            }
            return SComposedDep;
        }

        @objid ("39d79748-b267-4ea2-8235-328c5730361b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c66794fc-3f02-4132-b591-877a0fbad479")
        public static SmDependency getSComposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SComposedDep;
        }

        @objid ("005ec6da-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("387a3399-11cd-4ba4-92da-13a4c817ccd9")
            public ISmObjectData createData() {
                return new InternalTransitionData();
            }

            @objid ("3f0e4f39-45d2-4593-9a76-2e70f80358f1")
            public SmObjectImpl createImpl() {
                return new InternalTransitionImpl();
            }

        }

        @objid ("005f2a1c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SComposedSmDependency extends SmSingleDependency {
            @objid ("f280284d-bcc5-44ee-a608-b79990b47249")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InternalTransitionData) data).mSComposed;
            }

            @objid ("1ccc61fc-c3dd-4b91-abce-2e95d92c52f8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InternalTransitionData) data).mSComposed = value;
            }

            @objid ("45546fab-0dd3-4a59-a146-dd95d5ccba2c")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.InternalDep();
            }

        }

    }

}
