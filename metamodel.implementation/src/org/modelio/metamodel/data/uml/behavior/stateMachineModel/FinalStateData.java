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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.FinalStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.FinalState;
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

@objid ("0056aa36-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=FinalState.class, factory=FinalStateData.Metadata.ObjectFactory.class)
public class FinalStateData extends StateData {
    @objid ("a0f1ecc1-7107-4971-8622-f7168b83b445")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000d2c26-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b78b9290-5dba-4825-aee4-b190889005bb")
        private static SmClass smClass = null;

        @objid ("50647fb4-202c-4c4c-9a0b-d7fe1999fa8f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FinalStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("65b12038-7610-4388-bcb8-e1467e4ea0dc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000d6de4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("92e5439a-b43f-4dfe-a3ff-ed2044a668e1")
            public ISmObjectData createData() {
                return new FinalStateData();
            }

            @objid ("37259b69-0e8f-4756-b6b2-4c5255688a54")
            public SmObjectImpl createImpl() {
                return new FinalStateImpl();
            }

        }

    }

}
