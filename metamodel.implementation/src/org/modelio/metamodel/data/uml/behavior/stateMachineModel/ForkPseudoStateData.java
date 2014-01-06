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
    @objid ("80086429-2e86-47d0-8648-444f2e0a81b6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0068642e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("25d3d16a-76cb-4533-b32f-ae4545258886")
        private static SmClass smClass = null;

        @objid ("632f5c0e-e58c-45ec-8d14-ceb7def9c893")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ForkPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fa7e4ff8-f84a-40a3-b43d-fb8c466f0621")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0068a5d8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a66c6beb-af2c-480a-92ba-88e8d638682c")
            public ISmObjectData createData() {
                return new ForkPseudoStateData();
            }

            @objid ("ab9e71eb-b529-41e3-a3a8-5a2de11a48fc")
            public SmObjectImpl createImpl() {
                return new ForkPseudoStateImpl();
            }

        }

    }

}
