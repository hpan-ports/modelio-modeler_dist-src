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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.AbstractPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.AbstractPseudoState;
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

@objid ("004d978e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AbstractPseudoState.class, factory=AbstractPseudoStateData.Metadata.ObjectFactory.class)
public abstract class AbstractPseudoStateData extends StateVertexData {
    @objid ("0998a863-5658-414c-aac4-f46ee17ae534")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00462af8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4edaa2a3-41e0-46d4-b1d9-736fe0641f82")
        private static SmClass smClass = null;

        @objid ("5b71167b-47c7-4733-b09e-8f3a106f0a28")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AbstractPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ffa60490-f9b6-4e50-8528-bf3ce34fffd1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00472dae-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("88d2125a-43b1-40a3-bdf4-32757ae36c4f")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("aa56d877-2ac3-4fe2-be26-11aeb7d5b3b2")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

    }

}
