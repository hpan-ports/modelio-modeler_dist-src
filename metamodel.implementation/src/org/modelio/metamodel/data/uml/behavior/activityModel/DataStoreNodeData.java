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
    @objid ("bc5bddf3-c629-4a0b-9e22-c08b5f80f323")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0076b844-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0fffffdf-8228-47f8-96d6-41d0aa575a58")
        private static SmClass smClass = null;

        @objid ("1af92333-11e2-408f-945c-b184af7acf2f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DataStoreNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3cf0cde1-a9d2-41bb-a1b5-3e3944710271")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007705a6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("389fbceb-5f63-454a-b1df-3aa05fae90bb")
            public ISmObjectData createData() {
                return new DataStoreNodeData();
            }

            @objid ("e1bc4f99-6b9d-4cdd-9d96-fbfd58b9782b")
            public SmObjectImpl createImpl() {
                return new DataStoreNodeImpl();
            }

        }

    }

}
