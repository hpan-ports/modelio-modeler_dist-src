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
    @objid ("7069cf98-9b22-4f1d-a46d-330dd2c3d2f7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0077c680-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d24d6754-7194-41c4-a4c4-c179488751ec")
        private static SmClass smClass = null;

        @objid ("77252fa7-ec4a-4460-9137-4bdef159832d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ChoicePseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3aec9532-b35c-42b0-8caf-2e68ed72512d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00780834-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dce83d6a-1863-4d04-93de-ac7fe806dd24")
            public ISmObjectData createData() {
                return new ChoicePseudoStateData();
            }

            @objid ("a10e0c26-f8e2-41f2-8621-9a147ebb23aa")
            public SmObjectImpl createImpl() {
                return new ChoicePseudoStateImpl();
            }

        }

    }

}
