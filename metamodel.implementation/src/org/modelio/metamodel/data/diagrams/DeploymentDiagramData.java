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
    @objid ("8e9f2a9b-5f61-43a4-a60b-eb16a3e8f39b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00966248-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1ff15faa-5b69-4c04-a2f2-c2cae1ab3195")
        private static SmClass smClass = null;

        @objid ("2b744057-ef24-4dac-b64d-2d2c818d0951")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DeploymentDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("694e837f-db1b-4221-b403-35dd91783be6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0096a352-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("08b5e657-c860-44b6-a739-77f745531c7d")
            public ISmObjectData createData() {
                return new DeploymentDiagramData();
            }

            @objid ("5c54f618-bd23-4455-b7b8-4183769b7833")
            public SmObjectImpl createImpl() {
                return new DeploymentDiagramImpl();
            }

        }

    }

}
