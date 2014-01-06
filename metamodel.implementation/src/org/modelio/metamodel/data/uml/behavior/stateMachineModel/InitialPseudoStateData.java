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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.InitialPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InitialPseudoState;
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

@objid ("00512192-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InitialPseudoState.class, factory=InitialPseudoStateData.Metadata.ObjectFactory.class)
public class InitialPseudoStateData extends AbstractPseudoStateData {
    @objid ("adf8f816-a51a-44ca-8fb4-c746603ab36b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0005be8c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3abee237-6c94-4b3c-be0b-5142bbb2c940")
        private static SmClass smClass = null;

        @objid ("7f19c108-b5cf-462c-9b81-1f45a4a60b78")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InitialPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("63f4779d-3fc1-417e-8d9f-7d46442d342f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00061166-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9500c748-da5b-4d3b-ade9-592e1b5f4994")
            public ISmObjectData createData() {
                return new InitialPseudoStateData();
            }

            @objid ("adc00356-f768-404b-9197-d19781584245")
            public SmObjectImpl createImpl() {
                return new InitialPseudoStateImpl();
            }

        }

    }

}
