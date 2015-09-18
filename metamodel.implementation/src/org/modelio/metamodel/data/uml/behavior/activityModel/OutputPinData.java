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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityActionData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.OutputPinImpl;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;
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

@objid ("003b23ec-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=OutputPin.class, factory=OutputPinData.Metadata.ObjectFactory.class)
public class OutputPinData extends PinData {
    @objid ("625635b5-db95-4dcc-9fe7-a14f29adeb08")
    @SmaMetaAssociation(metaName="Outputing", typeDataClass=ActivityActionData.class, min=0, max=1, smAssociationClass=Metadata.OutputingSmDependency.class)
     SmObjectImpl mOutputing;

    @objid ("e1b39e95-9d32-4ad8-8557-ac3940a740aa")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050c058-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("96178758-537e-448d-9b65-afc5b6c0bfbd")
        private static SmClass smClass = null;

        @objid ("65845a3b-0092-4733-bcbd-a2a2158d0bfb")
        private static SmDependency OutputingDep = null;

        @objid ("1454d76b-488e-4d9e-bec4-038eb10f1722")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OutputPinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f6074219-d2d4-49cf-bc5e-0d7a0cc84df1")
        public static SmDependency OutputingDep() {
            if (OutputingDep == null) {
            	OutputingDep = classof().getDependencyDef("Outputing");
            }
            return OutputingDep;
        }

        @objid ("61844dd7-4fe6-4bd3-8184-bc1f05c6d7a4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("9d68702c-fec7-4613-8d27-af4e4620f551")
        public static SmDependency getOutputingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputingDep;
        }

        @objid ("00510252-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a53e27df-075d-4e60-b886-0dffafff95bc")
            public ISmObjectData createData() {
                return new OutputPinData();
            }

            @objid ("bb3560ad-e4fd-4fab-a15e-274ce0fa8d95")
            public SmObjectImpl createImpl() {
                return new OutputPinImpl();
            }

        }

        @objid ("00516562-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutputingSmDependency extends SmSingleDependency {
            @objid ("4092903c-363a-4dcf-9099-fe90df34c1ee")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OutputPinData) data).mOutputing;
            }

            @objid ("42829c95-3208-4e9c-82a5-80ceb421d080")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OutputPinData) data).mOutputing = value;
            }

            @objid ("2f293485-1531-46d4-a921-edd85122a558")
            @Override
            public SmDependency getSymetric() {
                return ActivityActionData.Metadata.OutputDep();
            }

        }

    }

}
