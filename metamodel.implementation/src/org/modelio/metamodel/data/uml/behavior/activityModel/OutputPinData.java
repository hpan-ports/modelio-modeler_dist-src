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
    @objid ("8148f99e-351f-4548-9783-45b0c0b130ed")
    @SmaMetaAssociation(metaName="Outputing", typeDataClass=ActivityActionData.class, min=0, max=1, smAssociationClass=Metadata.OutputingSmDependency.class)
     SmObjectImpl mOutputing;

    @objid ("dac222e7-d295-4538-b437-e5212aabe80c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050c058-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ee08b419-ddea-483a-b460-902385a42cce")
        private static SmClass smClass = null;

        @objid ("35884a79-8751-464a-b4d2-bd8f90439e1a")
        private static SmDependency OutputingDep = null;

        @objid ("753f3c28-93b6-4203-bb44-37af7c3c5508")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OutputPinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a1b8a733-ae7a-49eb-80e6-0a43a74de3d0")
        public static SmDependency OutputingDep() {
            if (OutputingDep == null) {
            	OutputingDep = classof().getDependencyDef("Outputing");
            }
            return OutputingDep;
        }

        @objid ("b3e09787-0a93-4e24-a26a-aed7d4a5e189")
        public static SmDependency getOutputingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputingDep;
        }

        @objid ("825253ef-33f6-41df-ba4d-395e146615c3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00510252-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cb45fd2f-2bc6-4a2c-808f-748f3d448cc8")
            public ISmObjectData createData() {
                return new OutputPinData();
            }

            @objid ("446588e6-46c4-4533-994b-b81b225709b0")
            public SmObjectImpl createImpl() {
                return new OutputPinImpl();
            }

        }

        @objid ("00516562-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutputingSmDependency extends SmSingleDependency {
            @objid ("d27566a2-28bb-44a0-aa9e-2fd558656070")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OutputPinData) data).mOutputing;
            }

            @objid ("948f61c6-fc5b-487c-b081-47b3d076ac8d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OutputPinData) data).mOutputing = value;
            }

            @objid ("926486b4-45a2-4622-ac37-9d57aef59a20")
            @Override
            public SmDependency getSymetric() {
                return ActivityActionData.Metadata.OutputDep();
            }

        }

    }

}
