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
    @objid ("4db4758e-d0f1-473a-9f2d-636c7939509f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005fda2a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8981af1f-fc70-47dd-86b9-28bc28264e8d")
        private static SmClass smClass = null;

        @objid ("1a600d0a-d9ce-4333-b29b-c981f8e7080f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("71075162-4967-4c35-94f5-4916f5eb94c6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00601bac-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("04442e12-3b1a-4ef3-96ff-862dd9aa6e8c")
            public ISmObjectData createData() {
                return new CommunicationDiagramData();
            }

            @objid ("0fb8b061-cb5f-4e3c-a7f3-3092b28a7578")
            public SmObjectImpl createImpl() {
                return new CommunicationDiagramImpl();
            }

        }

    }

}
