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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.DeepHistoryPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.DeepHistoryPseudoState;
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

@objid ("004f11fe-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DeepHistoryPseudoState.class, factory=DeepHistoryPseudoStateData.Metadata.ObjectFactory.class)
public class DeepHistoryPseudoStateData extends AbstractPseudoStateData {
    @objid ("4e25a05a-15cd-4247-8b6e-20b7ce8614d6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00579e14-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0e697970-c055-4a23-83be-9dcbff97675a")
        private static SmClass smClass = null;

        @objid ("2c6d3864-0b98-490d-9299-f616393bd167")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DeepHistoryPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c12c9042-a5ee-47c4-83bc-2d04cda68df3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0057e086-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b1a2ea4a-67ac-49e7-ab02-0c0b07182218")
            public ISmObjectData createData() {
                return new DeepHistoryPseudoStateData();
            }

            @objid ("38b60384-c89e-4873-b3d2-eaa733978ecb")
            public SmObjectImpl createImpl() {
                return new DeepHistoryPseudoStateImpl();
            }

        }

    }

}
