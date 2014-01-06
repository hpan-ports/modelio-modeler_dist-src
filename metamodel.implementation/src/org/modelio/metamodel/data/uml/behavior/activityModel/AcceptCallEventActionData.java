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
    @objid ("8b5a1e54-eaa1-4c6f-9a47-bdbeb908f26f")
    @SmaMetaAssociation(metaName="Called", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("26901360-83e1-495c-9836-d7fc42ba693a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00443982-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b6abb3d1-f59b-4832-8ddc-bb306ace86fd")
        private static SmClass smClass = null;

        @objid ("8e86b585-203a-4760-a1f7-78e001f6cb6c")
        private static SmDependency CalledDep = null;

        @objid ("76a7846b-c9c9-495e-8739-40add5f56c29")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptCallEventActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c8af073e-05e8-416f-b435-c419c2335e72")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("7296a485-eb7f-4d9f-8a1d-9428cdedfdd0")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("cca9728e-3414-4dbc-be7e-0902e4b856ed")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00447e10-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("06489bb4-48d7-4ddf-93e1-7954e599d433")
            public ISmObjectData createData() {
                return new AcceptCallEventActionData();
            }

            @objid ("de5e56cf-0c17-4a05-8a38-b958cf4b6da2")
            public SmObjectImpl createImpl() {
                return new AcceptCallEventActionImpl();
            }

        }

        @objid ("0044e102-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("8d7395b6-a2ce-4441-a812-54cf351cd6d7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AcceptCallEventActionData) data).mCalled;
            }

            @objid ("effa43a3-1561-4d0c-b506-a78f402bfd65")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AcceptCallEventActionData) data).mCalled = value;
            }

            @objid ("3f94efcf-c874-41cd-bd8f-0858a4d16fd6")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.EntryPointActionDep();
            }

        }

    }

}
