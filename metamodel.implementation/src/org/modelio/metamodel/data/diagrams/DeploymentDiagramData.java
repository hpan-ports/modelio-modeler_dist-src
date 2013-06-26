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
    @objid ("50b4c5cb-3ad4-45ca-82e8-81714c722177")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00966248-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("32f2ff86-fba6-413e-a439-637750f81025")
        private static SmClass smClass = null;

        @objid ("c778b2dd-485b-4204-9c91-4a4d6cbb0f29")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DeploymentDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6c08f57c-7387-490d-b5a7-d580e64aaa37")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0096a352-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("33d8025b-448e-41bf-8a11-a5b913e00035")
            public ISmObjectData createData() {
                return new DeploymentDiagramData();
            }

            @objid ("3bf1fae4-33f6-446c-8705-bb1837bad704")
            public SmObjectImpl createImpl() {
                return new DeploymentDiagramImpl();
            }

        }

    }

}
