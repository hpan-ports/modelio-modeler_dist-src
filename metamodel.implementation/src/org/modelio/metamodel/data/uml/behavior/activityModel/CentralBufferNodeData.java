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
    @objid ("d9df3793-7e38-47be-b46e-141692111342")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001ebcd4-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("202311c5-3e34-412a-9c77-afddd8ae6b6a")
        private static SmClass smClass = null;

        @objid ("f4b31875-2f3f-4b2d-8415-8db152fe783a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CentralBufferNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("80cae35c-2c79-4368-a6a3-877ee5a427af")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001efe24-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("588cab63-abd6-4957-afba-7443265f405e")
            public ISmObjectData createData() {
                return new CentralBufferNodeData();
            }

            @objid ("6eeb82ef-ee6f-49b1-8542-8991420bf9a1")
            public SmObjectImpl createImpl() {
                return new CentralBufferNodeImpl();
            }

        }

    }

}
