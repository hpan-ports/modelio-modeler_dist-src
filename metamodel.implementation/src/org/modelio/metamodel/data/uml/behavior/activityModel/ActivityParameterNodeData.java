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
    @objid ("06c6918f-10c6-4254-8fcd-4b3b6b0df955")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007e6706-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7154167d-032b-4308-aa57-020f0024f845")
        private static SmClass smClass = null;

        @objid ("29d11049-d604-44a5-b4b4-564bc3e74394")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityParameterNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7eea3a7d-1241-456a-9254-b1c427cc0652")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007eb346-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2023a4e1-b695-4651-9e74-1653304cb47a")
            public ISmObjectData createData() {
                return new ActivityParameterNodeData();
            }

            @objid ("e4cbff2f-0bf8-4ecd-95c8-25540d90cea0")
            public SmObjectImpl createImpl() {
                return new ActivityParameterNodeImpl();
            }

        }

    }

}
