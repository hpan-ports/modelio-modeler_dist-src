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
    @objid ("2b611fd6-061b-4a59-b886-4e2559b64f04")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00606c60-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("22b81631-1050-4899-8a14-07fb96d0a95a")
        private static SmClass smClass = null;

        @objid ("7577a084-9a53-4417-94dd-9cabc884c6c4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(JoinPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9e42899b-1b6c-429b-b616-f8c4dd2e74d7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0060af36-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fa943dd3-e2e8-42a3-b201-166bfaf0e0e8")
            public ISmObjectData createData() {
                return new JoinPseudoStateData();
            }

            @objid ("e62f2c43-b5c8-456a-98e4-8cb8095d9217")
            public SmObjectImpl createImpl() {
                return new JoinPseudoStateImpl();
            }

        }

    }

}
