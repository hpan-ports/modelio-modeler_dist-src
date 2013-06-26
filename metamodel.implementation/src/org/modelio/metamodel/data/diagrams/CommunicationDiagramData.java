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
import org.modelio.metamodel.diagrams.CommunicationDiagram;
import org.modelio.metamodel.impl.diagrams.CommunicationDiagramImpl;
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

@objid ("006cfce6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CommunicationDiagram.class, factory=CommunicationDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class CommunicationDiagramData extends BehaviorDiagramData {
    @objid ("caefe8c6-49dc-460b-9ea0-f9e8274df6e7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005fda2a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fabd1845-5bfb-4e07-8a46-e48fd46d26a3")
        private static SmClass smClass = null;

        @objid ("6c6baed9-a4d5-4125-bbfe-2a0d0040884f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1be8640d-90b9-45ae-a85b-04a452f2cdbd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00601bac-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a23ef190-177a-472b-91ce-0f972556210c")
            public ISmObjectData createData() {
                return new CommunicationDiagramData();
            }

            @objid ("bd56ae18-11f3-409d-8122-4f9f026bbbc1")
            public SmObjectImpl createImpl() {
                return new CommunicationDiagramImpl();
            }

        }

    }

}
