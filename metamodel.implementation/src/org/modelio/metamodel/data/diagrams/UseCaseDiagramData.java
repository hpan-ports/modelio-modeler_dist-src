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
import org.modelio.metamodel.diagrams.UseCaseDiagram;
import org.modelio.metamodel.impl.diagrams.UseCaseDiagramImpl;
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

@objid ("0071f0fc-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=UseCaseDiagram.class, factory=UseCaseDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class UseCaseDiagramData extends StaticDiagramData {
    @objid ("65451e6e-0903-49b9-a7ee-0b40cdfb700b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002c6442-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bf00fbbd-deb9-4403-b515-8f57e5b2da10")
        private static SmClass smClass = null;

        @objid ("06bd636c-905f-4479-b687-6159dba2bc52")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UseCaseDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e0aeec9c-f2b3-47cb-a9ec-c23af84ca3fe")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002ca4b6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b20b5800-9f04-4b64-8f29-6f7316777453")
            public ISmObjectData createData() {
                return new UseCaseDiagramData();
            }

            @objid ("9035f5f2-86f5-4143-ae0d-7aa6cb688278")
            public SmObjectImpl createImpl() {
                return new UseCaseDiagramImpl();
            }

        }

    }

}
