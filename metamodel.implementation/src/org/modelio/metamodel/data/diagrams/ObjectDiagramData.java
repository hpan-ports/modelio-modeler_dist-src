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
    @objid ("3db20856-13ed-4392-8c94-bf2bb9d5fa6c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004e747e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c03d0ce1-132e-41ac-8341-f2465c483927")
        private static SmClass smClass = null;

        @objid ("6f6ee691-7021-45b8-a722-3804a22e5477")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ObjectDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ab289e0c-6ad0-4af0-a662-9b8f5327ac0c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("004eb376-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a1543ff9-1cea-4530-a610-1c000efeec86")
            public ISmObjectData createData() {
                return new ObjectDiagramData();
            }

            @objid ("94b81891-89b8-4ed7-b129-1ea69afde007")
            public SmObjectImpl createImpl() {
                return new ObjectDiagramImpl();
            }

        }

    }

}
