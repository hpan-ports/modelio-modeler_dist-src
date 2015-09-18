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
    @objid ("e304ad70-006f-44cd-9d28-79df8fdc437f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007858ca-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e04a05cd-4719-45b7-927f-397e8eba4d77")
        private static SmClass smClass = null;

        @objid ("b13bd94f-6a6d-42bc-a7be-012830e21020")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ShallowHistoryPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("672bc0a9-28f0-4d8c-b837-3883961499c7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00789d62-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7a14b28b-3ed6-43ee-86ef-1dff96f258e0")
            public ISmObjectData createData() {
                return new ShallowHistoryPseudoStateData();
            }

            @objid ("ec3d7561-8f56-4a7a-9b4a-36afc6d1594b")
            public SmObjectImpl createImpl() {
                return new ShallowHistoryPseudoStateImpl();
            }

        }

    }

}
