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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.JunctionPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.JunctionPseudoState;
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

@objid ("0052b73c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=JunctionPseudoState.class, factory=JunctionPseudoStateData.Metadata.ObjectFactory.class)
public class JunctionPseudoStateData extends AbstractPseudoStateData {
    @objid ("69237c3a-68fe-47ae-a49e-3c7d5e3712e7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001ea3d4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0782122a-59fb-4f82-8f8a-11f83a62bc54")
        private static SmClass smClass = null;

        @objid ("190c734b-4d73-4bfc-bac5-d08027dd1507")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(JunctionPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("53c9fff4-e6dc-4aaf-b7f6-c305728eedca")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001ee8da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("abc63586-8a0d-4cca-8ad0-6024811c6d5b")
            public ISmObjectData createData() {
                return new JunctionPseudoStateData();
            }

            @objid ("1a7e3aab-2c97-4a4a-a929-1a45e7191991")
            public SmObjectImpl createImpl() {
                return new JunctionPseudoStateImpl();
            }

        }

    }

}
