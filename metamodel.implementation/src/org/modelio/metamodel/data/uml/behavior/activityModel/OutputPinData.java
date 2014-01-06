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
    @objid ("2a431b5c-c36a-4c5d-9198-3b7ac12c2b08")
    @SmaMetaAssociation(metaName="Outputing", typeDataClass=ActivityActionData.class, min=0, max=1, smAssociationClass=Metadata.OutputingSmDependency.class)
     SmObjectImpl mOutputing;

    @objid ("cd02729d-a2f4-4050-9bbb-3db03c355c6d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050c058-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("04f4a627-09f9-43cf-9c62-30d7a5df384a")
        private static SmClass smClass = null;

        @objid ("45b7d847-6728-406a-8427-aa7525a3e5e3")
        private static SmDependency OutputingDep = null;

        @objid ("156fb60f-bc07-45ad-b23d-af6aae358c72")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OutputPinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6b110cf9-f500-4f16-accc-1db67ad3e762")
        public static SmDependency OutputingDep() {
            if (OutputingDep == null) {
            	OutputingDep = classof().getDependencyDef("Outputing");
            }
            return OutputingDep;
        }

        @objid ("304646b0-2b78-4d5a-89a3-537f492fa213")
        public static SmDependency getOutputingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputingDep;
        }

        @objid ("dde16525-097d-4ce5-bba1-2b682164329d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00510252-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b2861afd-a36a-4899-945a-d6595afa1d9c")
            public ISmObjectData createData() {
                return new OutputPinData();
            }

            @objid ("83bb305e-6dca-413d-b702-0725eb4271da")
            public SmObjectImpl createImpl() {
                return new OutputPinImpl();
            }

        }

        @objid ("00516562-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutputingSmDependency extends SmSingleDependency {
            @objid ("999d3d7e-ebcb-480c-9cb2-e0b71778bb6b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OutputPinData) data).mOutputing;
            }

            @objid ("a315965d-c484-4d54-9707-6b55da14f5bf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OutputPinData) data).mOutputing = value;
            }

            @objid ("4301dad2-4385-4a99-9996-cab62c5e4e59")
            @Override
            public SmDependency getSymetric() {
                return ActivityActionData.Metadata.OutputDep();
            }

        }

    }

}
