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
    @objid ("93b472ad-0814-4fc7-b14c-5fcc154a3b15")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0076b844-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("372bad0c-3c73-4757-8837-99225eca2bea")
        private static SmClass smClass = null;

        @objid ("f04574a7-a9e3-4bf5-bbc1-8c0de522086f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DataStoreNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fd69463a-0a19-412b-b160-c7cca6e1131e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007705a6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("885cade1-3527-4619-ab50-f93b5aa3376d")
            public ISmObjectData createData() {
                return new DataStoreNodeData();
            }

            @objid ("5dc802f3-a9a0-4063-8b54-7ff756044991")
            public SmObjectImpl createImpl() {
                return new DataStoreNodeImpl();
            }

        }

    }

}
