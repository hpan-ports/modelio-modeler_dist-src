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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.DataStoreNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.DataStoreNode;
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

@objid ("002f83c0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DataStoreNode.class, factory=DataStoreNodeData.Metadata.ObjectFactory.class)
public class DataStoreNodeData extends CentralBufferNodeData {
    @objid ("b64279df-069f-41b1-9e61-bdc3a289d1fb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0076b844-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1e2201af-6d3f-482d-b1da-f373ae99d216")
        private static SmClass smClass = null;

        @objid ("5349ffac-7c16-4d01-9794-f57a640e398d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DataStoreNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cb3d9ae9-f8b8-4320-a835-bab60d8f74fd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007705a6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2561f2df-695a-4164-a7bd-269352b692bd")
            public ISmObjectData createData() {
                return new DataStoreNodeData();
            }

            @objid ("dd8c645a-2c61-4c5f-bd46-8e7612f4bca9")
            public SmObjectImpl createImpl() {
                return new DataStoreNodeImpl();
            }

        }

    }

}
