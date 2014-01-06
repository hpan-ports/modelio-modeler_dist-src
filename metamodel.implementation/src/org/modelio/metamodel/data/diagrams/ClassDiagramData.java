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
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.impl.diagrams.ClassDiagramImpl;
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

@objid ("006c82f2-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ClassDiagram.class, factory=ClassDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class ClassDiagramData extends StaticDiagramData {
    @objid ("690b2143-1b26-4fd0-b1a8-a53bb1ef440d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002dff1e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("297f8b88-d657-401b-ac8d-8ffa32f1fbc2")
        private static SmClass smClass = null;

        @objid ("e13dc9e0-68db-4c12-a200-8414321252d0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dad982a4-2f6b-45de-afab-ab0823903396")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002e3e48-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("253a67b3-655e-4218-95ce-96877f1b1c7b")
            public ISmObjectData createData() {
                return new ClassDiagramData();
            }

            @objid ("51e5c3d4-ff38-4bb0-84ce-a9cf7ee926b4")
            public SmObjectImpl createImpl() {
                return new ClassDiagramImpl();
            }

        }

    }

}
