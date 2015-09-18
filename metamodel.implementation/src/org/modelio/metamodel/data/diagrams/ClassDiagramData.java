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
    @objid ("ce91d64f-5532-4584-884e-3834fe2a28d2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002dff1e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1539583d-0a56-4ad5-b393-dfac160dfe79")
        private static SmClass smClass = null;

        @objid ("4aea5e71-a9fa-489c-80fe-196ce5700bab")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5d06dbcf-337a-4e14-9faa-8727ef964b24")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002e3e48-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("87364fb9-1c3e-429e-a74a-06f165643ee4")
            public ISmObjectData createData() {
                return new ClassDiagramData();
            }

            @objid ("f055c56a-c9d5-4f4f-a931-2960e3c8667a")
            public SmObjectImpl createImpl() {
                return new ClassDiagramImpl();
            }

        }

    }

}
