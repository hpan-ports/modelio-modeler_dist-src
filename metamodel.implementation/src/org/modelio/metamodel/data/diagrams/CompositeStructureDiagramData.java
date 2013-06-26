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
    @objid ("90040c24-57a8-4e9f-ab91-00b142576b7d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0007c0ec-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f6c8d9d8-5095-4581-8332-45b47147b55c")
        private static SmClass smClass = null;

        @objid ("21090928-c792-43eb-978a-153fa138a4b6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CompositeStructureDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7b9ee49a-90c3-40a9-8612-8e95c481541e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00080f52-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("48d25ddc-ac6d-430c-ac34-a1107d4a8f46")
            public ISmObjectData createData() {
                return new CompositeStructureDiagramData();
            }

            @objid ("b5406a62-fd7d-42f3-8ff5-9132e63350fd")
            public SmObjectImpl createImpl() {
                return new CompositeStructureDiagramImpl();
            }

        }

    }

}
