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
    @objid ("6f8d6bdf-870b-4c64-bb31-27d9acd9722a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0077c680-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("17ca71f3-973f-4253-8eb5-4dea765b4bea")
        private static SmClass smClass = null;

        @objid ("c957282f-a2e8-4bc1-8c1c-c7d3d32be9ef")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ChoicePseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6e9cf28d-ff90-4d9a-a54d-bdaa0921239f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00780834-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1048a71b-847b-47ae-9c37-727949ccf12f")
            public ISmObjectData createData() {
                return new ChoicePseudoStateData();
            }

            @objid ("d7859ed7-b387-4c4e-997c-b3908a7fb2ee")
            public SmObjectImpl createImpl() {
                return new ChoicePseudoStateImpl();
            }

        }

    }

}
