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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.CallBehaviorActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.CallBehaviorAction;
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

@objid ("002b4f08-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CallBehaviorAction.class, factory=CallBehaviorActionData.Metadata.ObjectFactory.class)
public class CallBehaviorActionData extends CallActionData {
    @objid ("2a7a39b8-d4e3-4cbe-bbc1-9fc2b87911e9")
    @SmaMetaAssociation(metaName="Called", typeDataClass=BehaviorData.class, min=1, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("3cda456d-2ee4-4025-980d-5f54e440258e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00274dc2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4709d036-586a-47c2-bb5e-fb64859c9b13")
        private static SmClass smClass = null;

        @objid ("30320062-8244-439e-a0af-b6cc4f6c0fba")
        private static SmDependency CalledDep = null;

        @objid ("f7f714f0-794f-4b16-acb8-d3545d509340")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CallBehaviorActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("85e7812b-fd0b-4c60-9311-4a9b5c317e71")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("797eb49f-cb99-419a-a081-980ed99a1ba9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f6b0f64d-4c28-471e-8890-c83fcd92d597")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("00278eb8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("71e676b4-836c-4489-8c1f-1fe205c471d0")
            public ISmObjectData createData() {
                return new CallBehaviorActionData();
            }

            @objid ("93c99a96-c2b8-424a-a424-0f41c2981023")
            public SmObjectImpl createImpl() {
                return new CallBehaviorActionImpl();
            }

        }

        @objid ("0027f0ec-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("290c5b99-09b3-4e45-848c-49bd8dab2b00")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CallBehaviorActionData) data).mCalled;
            }

            @objid ("d9299d56-d10d-456c-a8ff-022a5244cb37")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CallBehaviorActionData) data).mCalled = value;
            }

            @objid ("d931acf1-8491-4534-8620-ec536a281775")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.CallerDep();
            }

        }

    }

}
