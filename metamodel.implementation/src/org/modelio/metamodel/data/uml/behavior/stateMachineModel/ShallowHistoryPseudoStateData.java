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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ShallowHistoryPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ShallowHistoryPseudoState;
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

@objid ("00534670-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ShallowHistoryPseudoState.class, factory=ShallowHistoryPseudoStateData.Metadata.ObjectFactory.class)
public class ShallowHistoryPseudoStateData extends AbstractPseudoStateData {
    @objid ("982ceba1-2e09-439d-b97f-317e440c9801")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007858ca-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("46852bc8-9563-4632-88b5-cfe800d979f8")
        private static SmClass smClass = null;

        @objid ("545481da-8f5a-4fd0-a11b-318c55d12ae3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ShallowHistoryPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("42528784-1925-4847-8077-27ba613b05a0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00789d62-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("92d294dc-3227-4a05-9613-13dff7322b62")
            public ISmObjectData createData() {
                return new ShallowHistoryPseudoStateData();
            }

            @objid ("e13c2dc3-a159-462a-96f2-bbd4dc9ec7ef")
            public SmObjectImpl createImpl() {
                return new ShallowHistoryPseudoStateImpl();
            }

        }

    }

}
