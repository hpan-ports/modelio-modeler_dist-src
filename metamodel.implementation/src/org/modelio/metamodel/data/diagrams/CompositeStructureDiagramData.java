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
    @objid ("05dceee5-0a87-4423-b825-97afd6d874be")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0007c0ec-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1cba88ed-2776-4df9-b7c5-26d8620f7299")
        private static SmClass smClass = null;

        @objid ("d43f11fa-ab7b-4a30-b3b9-7385b436929f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CompositeStructureDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("08e644f2-bb00-4b1f-9f75-d88a6174f4ed")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00080f52-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b7c5cbf6-e044-40b4-aa59-f65a37d7f606")
            public ISmObjectData createData() {
                return new CompositeStructureDiagramData();
            }

            @objid ("2723b6a5-e2fe-4f99-9667-2ff83e11e724")
            public SmObjectImpl createImpl() {
                return new CompositeStructureDiagramImpl();
            }

        }

    }

}
