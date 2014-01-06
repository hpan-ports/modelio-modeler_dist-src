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
import org.modelio.metamodel.impl.uml.behavior.activityModel.CentralBufferNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.CentralBufferNode;
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

@objid ("002c7f7c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CentralBufferNode.class, factory=CentralBufferNodeData.Metadata.ObjectFactory.class)
public class CentralBufferNodeData extends ObjectNodeData {
    @objid ("949077c1-0b22-4081-bba8-fad28af7ee46")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001ebcd4-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fa78d00e-e2f1-46fb-a0bc-bb75717d33a9")
        private static SmClass smClass = null;

        @objid ("536b1a31-90dc-47e2-8fc2-97e40ea81035")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CentralBufferNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bb7091e6-2e79-4ab8-899a-9c4d26f32ba1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001efe24-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("98f2f6bf-fdc7-4592-ae09-45b6e75890d3")
            public ISmObjectData createData() {
                return new CentralBufferNodeData();
            }

            @objid ("cb12fa1b-faa8-4d83-a9a2-70e69df467cb")
            public SmObjectImpl createImpl() {
                return new CentralBufferNodeImpl();
            }

        }

    }

}
