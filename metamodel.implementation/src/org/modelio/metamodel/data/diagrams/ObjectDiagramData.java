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
import org.modelio.metamodel.diagrams.ObjectDiagram;
import org.modelio.metamodel.impl.diagrams.ObjectDiagramImpl;
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

@objid ("00729c6e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ObjectDiagram.class, factory=ObjectDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class ObjectDiagramData extends StaticDiagramData {
    @objid ("ed639d8c-6465-4f24-aa6e-64251f6f10c8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004e747e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0c0203dc-8e1b-4c0b-bec0-e40f62e35bd5")
        private static SmClass smClass = null;

        @objid ("913e8bc1-2848-419a-a45c-cb330c306ede")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ObjectDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("77ef8f30-b723-403f-9526-125948f4d327")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("004eb376-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c54e1f2b-f569-44fa-b41a-f2494f0d3292")
            public ISmObjectData createData() {
                return new ObjectDiagramData();
            }

            @objid ("41a50e9f-7a50-495b-ba07-6b4728e9126a")
            public SmObjectImpl createImpl() {
                return new ObjectDiagramImpl();
            }

        }

    }

}
