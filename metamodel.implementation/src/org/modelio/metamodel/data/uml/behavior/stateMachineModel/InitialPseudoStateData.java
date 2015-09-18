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
    @objid ("5c6b447f-b842-4a1a-9350-fb9ab5290ec6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0005be8c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1b6bc0b7-3280-4680-94e8-e61c2fb83816")
        private static SmClass smClass = null;

        @objid ("70b73d92-b316-4202-89ef-180dfe48cd88")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InitialPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("eb0d619f-6d9c-41e9-8e81-d5840479b310")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00061166-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("52bd6e36-2dca-4ec7-858b-8fda58a38db1")
            public ISmObjectData createData() {
                return new InitialPseudoStateData();
            }

            @objid ("783768fd-4dde-4dd5-811e-047298fda4d5")
            public SmObjectImpl createImpl() {
                return new InitialPseudoStateImpl();
            }

        }

    }

}
