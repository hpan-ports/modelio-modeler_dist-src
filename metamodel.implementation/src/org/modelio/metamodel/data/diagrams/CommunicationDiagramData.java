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
    @objid ("b76c3eda-cc66-44cc-aaf1-5a14a0e3ba2f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005fda2a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("95fa1726-f7dc-4eeb-9539-701da5058f9a")
        private static SmClass smClass = null;

        @objid ("8079db45-368b-4d3a-b3cb-4a209222d52a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fe5b927f-157b-43b8-b397-e53a5bec40c5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00601bac-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("526b6509-d073-4525-9fe8-6580cd524e6d")
            public ISmObjectData createData() {
                return new CommunicationDiagramData();
            }

            @objid ("1be8544a-b698-4443-8427-f841642b7e3e")
            public SmObjectImpl createImpl() {
                return new CommunicationDiagramImpl();
            }

        }

    }

}
