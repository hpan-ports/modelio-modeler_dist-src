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
    @objid ("94aa1076-abb9-43bd-9990-9db32b785825")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007e38d0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ccea30a0-759e-4d0b-8ba9-839f3feef91f")
        private static SmClass smClass = null;

        @objid ("0e932e45-a2c5-4917-8618-89a0fec62dea")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TerminatePseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("449b4a77-8bc4-435b-ba07-9f536255800d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007e8ca4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("22005afc-c6ec-4cd3-8b65-cced2a82cbdc")
            public ISmObjectData createData() {
                return new TerminatePseudoStateData();
            }

            @objid ("f1380a4b-8670-420f-b3ef-e5367f89d871")
            public SmObjectImpl createImpl() {
                return new TerminatePseudoStateImpl();
            }

        }

    }

}
