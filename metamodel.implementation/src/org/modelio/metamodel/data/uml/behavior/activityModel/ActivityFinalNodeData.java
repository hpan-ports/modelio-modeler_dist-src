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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityFinalNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityFinalNode;
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

@objid ("0027e354-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityFinalNode.class, factory=ActivityFinalNodeData.Metadata.ObjectFactory.class)
public class ActivityFinalNodeData extends FinalNodeData {
    @objid ("2c4ae76b-2374-45c1-a7a9-18af5dcd4d6a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00107638-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1b33232a-e594-40fc-8a83-ac325471d799")
        private static SmClass smClass = null;

        @objid ("691399a1-707b-408d-a21f-c1f0e7d441c2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityFinalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("97206048-6d26-4795-8647-a2e0ba1d9f1c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0010b878-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8bc9e46d-d988-49e7-aef9-2d4112f4ae4e")
            public ISmObjectData createData() {
                return new ActivityFinalNodeData();
            }

            @objid ("186b912c-2ed8-4ce3-995d-5b91d88f8b87")
            public SmObjectImpl createImpl() {
                return new ActivityFinalNodeImpl();
            }

        }

    }

}
