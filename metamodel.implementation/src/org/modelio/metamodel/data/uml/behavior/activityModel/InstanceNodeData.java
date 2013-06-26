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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.InstanceNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.InstanceNode;
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

@objid ("00362dba-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InstanceNode.class, factory=InstanceNodeData.Metadata.ObjectFactory.class)
public class InstanceNodeData extends ObjectNodeData {
    @objid ("aa175637-ae11-45dd-b6eb-4d15b0c75af1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007e12ba-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("365d5aac-097c-43d8-b44d-a0e195824906")
        private static SmClass smClass = null;

        @objid ("313b319d-7cd5-4f66-81ac-a18a2eb7b5ca")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InstanceNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("11845b0c-2c0e-4289-b5f0-1e37908ee419")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007e54b4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f28e27a6-b207-4fa3-b3f1-733c27e62946")
            public ISmObjectData createData() {
                return new InstanceNodeData();
            }

            @objid ("a9e650e6-41fb-4ef4-b0dd-7e62f1a64e59")
            public SmObjectImpl createImpl() {
                return new InstanceNodeImpl();
            }

        }

    }

}
