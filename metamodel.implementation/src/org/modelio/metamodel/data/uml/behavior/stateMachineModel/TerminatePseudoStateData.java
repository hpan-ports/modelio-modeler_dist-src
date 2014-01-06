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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.TerminatePseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.TerminatePseudoState;
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

@objid ("0055823c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TerminatePseudoState.class, factory=TerminatePseudoStateData.Metadata.ObjectFactory.class)
public class TerminatePseudoStateData extends AbstractPseudoStateData {
    @objid ("50d0ddb9-40b7-445e-a419-29c141e66cc1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007e38d0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1e8ce866-f604-4425-ae13-a6724f5f7caa")
        private static SmClass smClass = null;

        @objid ("1e8bc264-1048-4a7a-992d-198cb52896e4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TerminatePseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ae550bc3-eec8-4367-a766-745d14bdf927")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007e8ca4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("50c66248-8b16-4184-bc0c-0ffa04a39b35")
            public ISmObjectData createData() {
                return new TerminatePseudoStateData();
            }

            @objid ("7e3a665d-384a-4212-91b3-ac946a2f53ae")
            public SmObjectImpl createImpl() {
                return new TerminatePseudoStateImpl();
            }

        }

    }

}
