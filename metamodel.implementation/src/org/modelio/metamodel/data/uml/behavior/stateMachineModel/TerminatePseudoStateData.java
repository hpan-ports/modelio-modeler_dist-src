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
    @objid ("daef6e90-8e5a-4b73-a8b6-47538f15f2ad")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007e38d0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0dd6917a-bbc1-4409-b96e-4543388189da")
        private static SmClass smClass = null;

        @objid ("bafa4d05-1a33-467b-a3bd-e0cfe6bf47a9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TerminatePseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4ee5cdab-8cff-40a3-9fd6-21e5e3fa8b20")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007e8ca4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("13966aa1-9fae-48d0-870a-7ec87235c994")
            public ISmObjectData createData() {
                return new TerminatePseudoStateData();
            }

            @objid ("686be806-6e28-4884-bfa6-803282a600b0")
            public SmObjectImpl createImpl() {
                return new TerminatePseudoStateImpl();
            }

        }

    }

}
