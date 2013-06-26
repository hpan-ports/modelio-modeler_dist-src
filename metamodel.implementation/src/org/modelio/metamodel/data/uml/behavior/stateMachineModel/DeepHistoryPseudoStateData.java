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
    @objid ("077d10da-051b-4f33-b184-5c570a4d702c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00579e14-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d3677c89-7acd-4cb7-a5e9-ccf2513ad9fe")
        private static SmClass smClass = null;

        @objid ("aadbeb31-e4cd-4626-9a4e-9c95796bb17f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DeepHistoryPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("12318d3f-34a5-488a-8812-2a705e09b197")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0057e086-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cd0202ff-6305-46b1-a31c-12efc6926de3")
            public ISmObjectData createData() {
                return new DeepHistoryPseudoStateData();
            }

            @objid ("4a613d2a-4b67-48e2-9f85-644da30e2f9a")
            public SmObjectImpl createImpl() {
                return new DeepHistoryPseudoStateImpl();
            }

        }

    }

}
