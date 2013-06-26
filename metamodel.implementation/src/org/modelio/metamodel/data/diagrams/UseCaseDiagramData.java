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
    @objid ("0ba30edf-dbf8-4562-a1ba-cfb29ac3372d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002c6442-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b5744278-bb3c-4110-808c-eab348d5a52d")
        private static SmClass smClass = null;

        @objid ("1eb455cd-7672-4ffd-af76-8264e4a82607")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UseCaseDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9afcd67c-0ec7-435e-aaf8-680cca2ac23e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002ca4b6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e7d58d06-4a71-46b9-b65a-26e0b4065ce3")
            public ISmObjectData createData() {
                return new UseCaseDiagramData();
            }

            @objid ("452df64a-2f0d-4cd7-88c3-e0d4a276263d")
            public SmObjectImpl createImpl() {
                return new UseCaseDiagramImpl();
            }

        }

    }

}
