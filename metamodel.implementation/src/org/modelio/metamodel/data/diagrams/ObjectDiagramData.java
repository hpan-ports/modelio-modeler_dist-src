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
import org.modelio.metamodel.diagrams.ObjectDiagram;
import org.modelio.metamodel.impl.diagrams.ObjectDiagramImpl;
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

@objid ("00729c6e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ObjectDiagram.class, factory=ObjectDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class ObjectDiagramData extends StaticDiagramData {
    @objid ("f81584ba-55a5-410a-9ada-03a65056ecfa")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004e747e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("381ccb42-e0ab-4543-81eb-43ffe108afba")
        private static SmClass smClass = null;

        @objid ("0701a02c-c773-4c01-9ed5-fd51ee44e1d9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ObjectDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ae51ddc9-e5a3-4941-bca3-3e577fe9b337")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("004eb376-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9f97b712-873c-4dcf-95c8-dc2d95931a6f")
            public ISmObjectData createData() {
                return new ObjectDiagramData();
            }

            @objid ("1e460159-b569-4d3b-aca7-3b7ec535e428")
            public SmObjectImpl createImpl() {
                return new ObjectDiagramImpl();
            }

        }

    }

}
