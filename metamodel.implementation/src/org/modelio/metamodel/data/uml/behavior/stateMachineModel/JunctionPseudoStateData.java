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
    @objid ("a49dfa2f-f99c-49b0-9cf0-c99cd1b5c815")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001ea3d4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cf9e30a0-035f-4891-88b0-ac2ee57830a9")
        private static SmClass smClass = null;

        @objid ("880a71e0-1e6c-4e87-a869-2d60305ab717")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(JunctionPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("095565ee-8dce-4bf7-a9d4-352070f9f99e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001ee8da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6cca16df-b2eb-45da-8ccd-4a1ff86fe580")
            public ISmObjectData createData() {
                return new JunctionPseudoStateData();
            }

            @objid ("544f69b4-f65f-490e-9975-5f15f0d59f40")
            public SmObjectImpl createImpl() {
                return new JunctionPseudoStateImpl();
            }

        }

    }

}
