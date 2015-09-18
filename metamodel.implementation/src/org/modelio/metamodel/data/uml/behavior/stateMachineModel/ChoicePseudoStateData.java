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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ChoicePseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ChoicePseudoState;
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

@objid ("004e106a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ChoicePseudoState.class, factory=ChoicePseudoStateData.Metadata.ObjectFactory.class)
public class ChoicePseudoStateData extends AbstractPseudoStateData {
    @objid ("e65cb236-4613-4123-ae22-0b3409702aee")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0077c680-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f78ab4af-39ec-4807-8a79-1102be889bd6")
        private static SmClass smClass = null;

        @objid ("9b7fcbd2-47e5-473f-9895-15f2292ffd84")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ChoicePseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b51827a2-cecc-4c7a-89ba-ac04e3c65709")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00780834-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6c57342d-d91c-4988-869b-1fac13351af8")
            public ISmObjectData createData() {
                return new ChoicePseudoStateData();
            }

            @objid ("a9173393-3af5-4e32-b1b0-dbc97c57428f")
            public SmObjectImpl createImpl() {
                return new ChoicePseudoStateImpl();
            }

        }

    }

}
