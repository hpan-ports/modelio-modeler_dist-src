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
    @objid ("d522b073-f64b-4533-a13a-e66591cc0865")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0011cd94-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fdf8688e-68ef-484d-9220-6c6ff9be824a")
        private static SmClass smClass = null;

        @objid ("d4c72d0f-7401-4bff-841f-c2dc7eb76591")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SequenceDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("51266479-5dba-4089-a927-a3eb63d25f03")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00120c28-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9b7935c4-a5f7-481a-978c-1f5218100cc1")
            public ISmObjectData createData() {
                return new SequenceDiagramData();
            }

            @objid ("c181f8a6-1fc4-4de6-a8b3-7d1fe8ab7c69")
            public SmObjectImpl createImpl() {
                return new SequenceDiagramImpl();
            }

        }

    }

}
