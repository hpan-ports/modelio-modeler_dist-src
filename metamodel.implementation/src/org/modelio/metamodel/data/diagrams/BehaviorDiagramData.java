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
package org.modelio.metamodel.data.diagrams;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.BehaviorDiagram;
import org.modelio.metamodel.impl.diagrams.BehaviorDiagramImpl;
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

@objid ("0069fdac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BehaviorDiagram.class, factory=BehaviorDiagramData.Metadata.ObjectFactory.class)
public abstract class BehaviorDiagramData extends AbstractDiagramData {
    @objid ("ad4e355f-96b4-483a-bad7-ca11eab2ad98")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000b34c0-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("58ce96b7-1495-4225-809f-ff8fe21c845d")
        private static SmClass smClass = null;

        @objid ("09048c1f-eff9-4fe4-a017-f70623d631e4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BehaviorDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1d0a7dc9-3d03-442f-bb43-794f2e09d618")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000b8c68-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0bb81c9c-95cc-4bbf-9af5-de7b08818f72")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("0336d031-8edc-47e3-9641-89120fa1f996")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

    }

}
