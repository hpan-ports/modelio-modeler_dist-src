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
    @objid ("6a3b7677-8352-4317-bf27-64f18e31ff84")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008d3560-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("36cfc515-abe5-4912-a7f3-45205a41f42c")
        private static SmClass smClass = null;

        @objid ("9b10a1d0-1537-41ca-a7a4-cceb01cf9a94")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StaticDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6a3361ca-d7b6-4192-ba0e-e10eebe2dfd8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008d746c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fd66e5e1-8600-4850-bac2-178d5a6c5d59")
            public ISmObjectData createData() {
                return new StaticDiagramData();
            }

            @objid ("daebe39c-f900-4925-b455-9d79ceea86ca")
            public SmObjectImpl createImpl() {
                return new StaticDiagramImpl();
            }

        }

    }

}
