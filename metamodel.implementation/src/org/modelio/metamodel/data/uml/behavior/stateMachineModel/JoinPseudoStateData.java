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
    @objid ("65a560c1-3f25-4687-b172-52ae69feb961")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00606c60-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f51968a4-6989-44d8-8352-2caf220e0f2f")
        private static SmClass smClass = null;

        @objid ("224b8c97-555e-41d5-9967-333cf6161bd7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(JoinPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2c5b9248-8508-43a2-875c-ab54fc532e11")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0060af36-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fae3960d-7bb4-4db8-aa88-d27009448a9f")
            public ISmObjectData createData() {
                return new JoinPseudoStateData();
            }

            @objid ("6007f3b0-e00e-4880-8667-39713052e04f")
            public SmObjectImpl createImpl() {
                return new JoinPseudoStateImpl();
            }

        }

    }

}
