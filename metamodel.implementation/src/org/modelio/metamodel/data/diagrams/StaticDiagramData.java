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
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.impl.diagrams.StaticDiagramImpl;
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

@objid ("00710426-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StaticDiagram.class, factory=StaticDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class StaticDiagramData extends AbstractDiagramData {
    @objid ("97270fc7-a16b-4b95-a1c8-ff4e4f3dd266")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008d3560-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1003a536-43ea-4c24-a092-8da662af6f51")
        private static SmClass smClass = null;

        @objid ("bd543a7c-b6cd-416b-8ba7-2457bc351e02")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StaticDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e968e7ea-c603-4d79-99ea-2c7bead0ebbe")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008d746c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("946ecaeb-a003-4d5b-97d5-97ec8bfa0895")
            public ISmObjectData createData() {
                return new StaticDiagramData();
            }

            @objid ("af1e6b62-be56-4b1d-95c5-4e234a573ea0")
            public SmObjectImpl createImpl() {
                return new StaticDiagramImpl();
            }

        }

    }

}
