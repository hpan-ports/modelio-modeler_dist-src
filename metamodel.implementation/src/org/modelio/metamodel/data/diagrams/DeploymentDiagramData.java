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
import org.modelio.metamodel.diagrams.DeploymentDiagram;
import org.modelio.metamodel.impl.diagrams.DeploymentDiagramImpl;
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

@objid ("006d73c4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DeploymentDiagram.class, factory=DeploymentDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class DeploymentDiagramData extends StaticDiagramData {
    @objid ("c8701f54-840c-4508-8dc8-1d44dce352bd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00966248-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d1ed80a5-e647-45b9-9b4c-bc47efc398fc")
        private static SmClass smClass = null;

        @objid ("45d82d8c-dec9-41e0-8db2-863aa39048d7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DeploymentDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("247323ea-7d3b-4de8-8678-077b1e07c183")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0096a352-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a7dba81f-fe9f-4bbb-9c64-d2f37a894a40")
            public ISmObjectData createData() {
                return new DeploymentDiagramData();
            }

            @objid ("b9925c87-2498-449c-a786-4dd49ff71ce1")
            public SmObjectImpl createImpl() {
                return new DeploymentDiagramImpl();
            }

        }

    }

}
