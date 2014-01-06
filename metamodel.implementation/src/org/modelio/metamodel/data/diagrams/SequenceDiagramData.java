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
package org.modelio.metamodel.data.diagrams;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.SequenceDiagram;
import org.modelio.metamodel.impl.diagrams.SequenceDiagramImpl;
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

@objid ("006fd556-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=SequenceDiagram.class, factory=SequenceDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class SequenceDiagramData extends BehaviorDiagramData {
    @objid ("f827d2c4-c90d-4ca3-9f51-c0cbee4b5d9d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0011cd94-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("57da1444-e3e3-4ce8-ad25-84744d79c30b")
        private static SmClass smClass = null;

        @objid ("5c555884-ca20-49f2-9dc6-05a28d0e8a11")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SequenceDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("446f3fce-7484-4ac6-9b47-c00054d860c0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00120c28-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("85d7213b-a1ee-4d11-a159-6ff3312685dd")
            public ISmObjectData createData() {
                return new SequenceDiagramData();
            }

            @objid ("63282418-76eb-4b44-81b3-1eadbe5b9c88")
            public SmObjectImpl createImpl() {
                return new SequenceDiagramImpl();
            }

        }

    }

}
