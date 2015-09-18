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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.JoinPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.JoinPseudoState;
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

@objid ("00522f1a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=JoinPseudoState.class, factory=JoinPseudoStateData.Metadata.ObjectFactory.class)
public class JoinPseudoStateData extends AbstractPseudoStateData {
    @objid ("00e64ed4-727b-4718-921d-34c752d97408")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00606c60-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6cfae806-5709-4d68-8fdc-4869123bf543")
        private static SmClass smClass = null;

        @objid ("84873530-f66b-4c9e-9834-0e88be222ef0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(JoinPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2fa6c9ae-40ff-4441-8dc3-5ed3c74c6d4d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0060af36-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("36c47303-3397-4423-b803-ac390c5f0970")
            public ISmObjectData createData() {
                return new JoinPseudoStateData();
            }

            @objid ("ee081dc5-49fe-4338-85eb-3adc0a973768")
            public SmObjectImpl createImpl() {
                return new JoinPseudoStateImpl();
            }

        }

    }

}
