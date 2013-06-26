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
    @objid ("eeeaede4-8d09-4b90-9098-9afaf1c164d6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0005be8c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d6ee9d71-e0f4-44b9-8b64-9e6f6888cb83")
        private static SmClass smClass = null;

        @objid ("de2800a7-49df-40a3-9050-851caa98eedc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InitialPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dd0a843e-5b6d-4ed2-8f38-d75d567f1491")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00061166-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0118dd8b-b5c9-44b1-be61-5503389bbdf0")
            public ISmObjectData createData() {
                return new InitialPseudoStateData();
            }

            @objid ("23cd61d6-8831-4951-8eef-beb4a38a6581")
            public SmObjectImpl createImpl() {
                return new InitialPseudoStateImpl();
            }

        }

    }

}
