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
    @objid ("0293a3a4-b54d-43c5-b212-f8d7ffa5dd9f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002dff1e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8fa601ee-e5e0-4005-a7fd-e5c447f2631f")
        private static SmClass smClass = null;

        @objid ("644e3ee9-207d-4d20-a4ec-59b6f5703dd1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e641f7cb-a34e-4ca4-b09c-f31e6aa62304")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002e3e48-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("20b036fe-a350-4638-8a30-c6b01763481c")
            public ISmObjectData createData() {
                return new ClassDiagramData();
            }

            @objid ("b066c232-be2c-4f14-9607-261f4bc46db4")
            public SmObjectImpl createImpl() {
                return new ClassDiagramImpl();
            }

        }

    }

}
