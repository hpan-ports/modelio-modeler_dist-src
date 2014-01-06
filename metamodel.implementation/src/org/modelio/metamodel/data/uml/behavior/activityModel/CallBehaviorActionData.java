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
    @objid ("89e63a4f-1d28-494d-8119-de949bcf63d0")
    @SmaMetaAssociation(metaName="Called", typeDataClass=BehaviorData.class, min=1, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("6da6adf6-df6a-4321-a3a2-51c12f1da1fb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00274dc2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("af28c1a9-adca-46ea-a7ef-76808342d07a")
        private static SmClass smClass = null;

        @objid ("b8b2d4dd-342e-4751-bb65-7162c8a2cced")
        private static SmDependency CalledDep = null;

        @objid ("1850128e-e92d-4859-a0f2-c394af0cca40")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CallBehaviorActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5c45807c-6c46-43da-8f35-32a0988c7023")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("61ec5ddf-0b7e-4869-b413-a9256750d754")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("3374fb0c-b999-41e9-8e06-cef3309967b3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00278eb8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1edd95d6-5c96-4cac-8a70-3495225f73fc")
            public ISmObjectData createData() {
                return new CallBehaviorActionData();
            }

            @objid ("4831cee4-bb04-4f2a-aeff-53858af03644")
            public SmObjectImpl createImpl() {
                return new CallBehaviorActionImpl();
            }

        }

        @objid ("0027f0ec-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("978b9faa-67eb-4660-9777-d33093cefee8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CallBehaviorActionData) data).mCalled;
            }

            @objid ("097dd409-1ed5-4469-86d4-51f9449118d3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CallBehaviorActionData) data).mCalled = value;
            }

            @objid ("14ab6442-0916-4bcd-aa35-85b1c3fdde46")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.CallerDep();
            }

        }

    }

}
