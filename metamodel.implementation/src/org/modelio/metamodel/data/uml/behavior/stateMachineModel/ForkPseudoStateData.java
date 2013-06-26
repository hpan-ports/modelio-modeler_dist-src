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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ForkPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ForkPseudoState;
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

@objid ("00509d58-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ForkPseudoState.class, factory=ForkPseudoStateData.Metadata.ObjectFactory.class)
public class ForkPseudoStateData extends AbstractPseudoStateData {
    @objid ("de6d8f36-b676-4d44-ab88-7db2fec985f1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0068642e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d5f4f07a-b5d6-4b10-88b0-45d32cca5ad2")
        private static SmClass smClass = null;

        @objid ("4636a8da-7b3e-4851-8b43-62af30b388a4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ForkPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f6af2039-9df9-4771-9cb0-b02373cee4d7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0068a5d8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("19724d68-2150-45b9-b64e-c064d5b836a1")
            public ISmObjectData createData() {
                return new ForkPseudoStateData();
            }

            @objid ("6e572403-e6f3-409a-8f2a-c7f6be9f5d5e")
            public SmObjectImpl createImpl() {
                return new ForkPseudoStateImpl();
            }

        }

    }

}
