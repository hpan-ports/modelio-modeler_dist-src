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
    @objid ("01d55b02-6dbe-4ad8-aa42-3cdc4ef4c23d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0011cd94-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f5d95626-f863-43c2-bfc1-c59360a3e29a")
        private static SmClass smClass = null;

        @objid ("c45db8f1-650b-4188-b062-7f7d4d421a2e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SequenceDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e8464a76-9e2b-497c-b404-b56eaff366cf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00120c28-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("319b866b-1de7-4f4c-95a7-588a8c75c138")
            public ISmObjectData createData() {
                return new SequenceDiagramData();
            }

            @objid ("e75beed6-142b-41eb-b962-b2663375251b")
            public SmObjectImpl createImpl() {
                return new SequenceDiagramImpl();
            }

        }

    }

}
