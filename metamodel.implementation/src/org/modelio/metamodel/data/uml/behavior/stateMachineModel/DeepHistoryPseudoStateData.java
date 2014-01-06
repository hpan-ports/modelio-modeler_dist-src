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
    @objid ("fc4a7a2a-ef18-4ec5-bc61-c6ae25b8dea8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00579e14-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("efa0d332-32e3-4593-8ebd-f08bf686a302")
        private static SmClass smClass = null;

        @objid ("6aa7260b-ff69-41b9-9691-ac7612a4f04a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DeepHistoryPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a219b032-a297-4f8f-a5c3-db7228bb9e6b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0057e086-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("514f9577-b2fa-4b4c-a6bf-5d06aa14a5f8")
            public ISmObjectData createData() {
                return new DeepHistoryPseudoStateData();
            }

            @objid ("93b8d254-ed0f-4072-8a38-b700f3bff4f9")
            public SmObjectImpl createImpl() {
                return new DeepHistoryPseudoStateImpl();
            }

        }

    }

}
