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
    @objid ("00cc36f1-6e42-4086-8343-ae716f9778dc")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001ebcd4-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c32db8e7-44ac-4814-8ef0-5e4372988a2e")
        private static SmClass smClass = null;

        @objid ("fb93c9ca-3832-48e4-8cb4-f9ef14f50b03")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CentralBufferNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("482b210b-29d5-49ce-aa9e-b15750961995")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001efe24-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("135b8a7e-c6eb-4e0b-9557-e7e334e60d5c")
            public ISmObjectData createData() {
                return new CentralBufferNodeData();
            }

            @objid ("8a62b083-796b-443f-a8c9-fe479f779082")
            public SmObjectImpl createImpl() {
                return new CentralBufferNodeImpl();
            }

        }

    }

}
