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
import org.modelio.metamodel.diagrams.CompositeStructureDiagram;
import org.modelio.metamodel.impl.diagrams.CompositeStructureDiagramImpl;
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

@objid ("00735334-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CompositeStructureDiagram.class, factory=CompositeStructureDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class CompositeStructureDiagramData extends StaticDiagramData {
    @objid ("60498d55-bc9e-4de2-83b5-9fbacc45ddf9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0007c0ec-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e6b8e962-c173-40f3-8ae4-f3a5918cef7a")
        private static SmClass smClass = null;

        @objid ("b10271d0-f12b-4bdb-a61d-5b387594dba5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CompositeStructureDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e8ab6df1-2b9d-4d79-8782-a7eae426341e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00080f52-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a4c0cb96-1ccd-4f12-885a-e4723c3226db")
            public ISmObjectData createData() {
                return new CompositeStructureDiagramData();
            }

            @objid ("a5fbb294-468e-492f-bdfa-1d7e974daeb2")
            public SmObjectImpl createImpl() {
                return new CompositeStructureDiagramImpl();
            }

        }

    }

}
