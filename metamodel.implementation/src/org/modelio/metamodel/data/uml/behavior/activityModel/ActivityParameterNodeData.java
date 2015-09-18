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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityParameterNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityParameterNode;
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

@objid ("00299e56-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityParameterNode.class, factory=ActivityParameterNodeData.Metadata.ObjectFactory.class)
public class ActivityParameterNodeData extends ObjectNodeData {
    @objid ("a31e061e-9373-4e4c-b269-f59b33c359a6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007e6706-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0c74c873-0da6-4865-9df7-f574a328da1c")
        private static SmClass smClass = null;

        @objid ("254357ab-143a-40d7-a979-e0956e262583")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityParameterNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4e508f93-0d8e-4eff-a440-3a142667d375")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007eb346-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fc3d101c-fb53-4233-ac9f-b849dccb1301")
            public ISmObjectData createData() {
                return new ActivityParameterNodeData();
            }

            @objid ("fef3acd4-f176-485a-ad5d-ee3c2bb4e902")
            public SmObjectImpl createImpl() {
                return new ActivityParameterNodeImpl();
            }

        }

    }

}
