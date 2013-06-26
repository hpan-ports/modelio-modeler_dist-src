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
    @objid ("ebedb3d0-68f9-4151-b1ac-f5dff63546f2")
    @SmaMetaAssociation(metaName="Called", typeDataClass=BehaviorData.class, min=1, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("09da34fd-0ba5-43e7-913b-f613fc2b5923")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00274dc2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("dd1390f5-0fb0-456b-ad7c-6758770dfd34")
        private static SmClass smClass = null;

        @objid ("8cfa7e24-b290-4ace-a2cc-bd07d98ffe8b")
        private static SmDependency CalledDep = null;

        @objid ("61825ff8-2e30-4f9a-84fe-d04f0aae9838")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CallBehaviorActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c20d1b57-914d-431e-a8ea-534ccbb23829")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("711504ff-f061-44a3-a75b-2cfe6527e4cf")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("3018faa9-e96b-4883-b809-40dc0db7ebef")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00278eb8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9166643e-d03a-4423-8a70-5813370c2286")
            public ISmObjectData createData() {
                return new CallBehaviorActionData();
            }

            @objid ("0adac8e3-dbbf-497e-82f7-ba65f95781c4")
            public SmObjectImpl createImpl() {
                return new CallBehaviorActionImpl();
            }

        }

        @objid ("0027f0ec-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("13a2df58-07e4-4432-822a-8ddfa72cef52")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CallBehaviorActionData) data).mCalled;
            }

            @objid ("cc40776c-39d1-478c-b140-2dc1ac670faa")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CallBehaviorActionData) data).mCalled = value;
            }

            @objid ("a4c8356f-ee9c-409e-9593-7fee1a5fbaec")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.CallerDep();
            }

        }

    }

}
