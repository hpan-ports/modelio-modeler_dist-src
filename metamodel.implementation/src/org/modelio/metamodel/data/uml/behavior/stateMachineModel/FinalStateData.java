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
    @objid ("49d9e4f2-9f50-4f94-adb0-34f95385500b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000d2c26-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fe6036ba-f025-4346-9800-d002087a6ec9")
        private static SmClass smClass = null;

        @objid ("f9be5349-2c19-409d-9935-156b2cae6658")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FinalStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6832700e-615c-48fa-a76f-e4feb46d4619")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000d6de4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e9e3f0a4-3831-4f89-a232-bdc05ae98339")
            public ISmObjectData createData() {
                return new FinalStateData();
            }

            @objid ("5174cb8b-20bf-4891-a9a1-37b08cc63287")
            public SmObjectImpl createImpl() {
                return new FinalStateImpl();
            }

        }

    }

}
