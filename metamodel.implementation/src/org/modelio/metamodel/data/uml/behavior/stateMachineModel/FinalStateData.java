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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.FinalStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.FinalState;
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

@objid ("0056aa36-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=FinalState.class, factory=FinalStateData.Metadata.ObjectFactory.class)
public class FinalStateData extends StateData {
    @objid ("20c9c2f2-b656-473f-9982-d098fda49419")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000d2c26-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a653ff06-35d3-424d-9ce1-c761381145ff")
        private static SmClass smClass = null;

        @objid ("a09779ec-66a3-48f6-9ea0-ce959e5e5a48")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FinalStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9b1c46c9-30bf-4d4a-8f6d-b5cc599927c8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000d6de4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c6b8a649-8eed-48c6-a263-0276ad8bc5f7")
            public ISmObjectData createData() {
                return new FinalStateData();
            }

            @objid ("8b9cdfbc-cf74-425d-821e-8c76afa2dfc8")
            public SmObjectImpl createImpl() {
                return new FinalStateImpl();
            }

        }

    }

}
