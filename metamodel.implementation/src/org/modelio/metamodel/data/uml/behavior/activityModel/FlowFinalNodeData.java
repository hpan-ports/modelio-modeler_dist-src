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
import org.modelio.metamodel.impl.uml.behavior.activityModel.FlowFinalNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.FlowFinalNode;
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

@objid ("00337692-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=FlowFinalNode.class, factory=FlowFinalNodeData.Metadata.ObjectFactory.class)
public class FlowFinalNodeData extends FinalNodeData {
    @objid ("db0d3151-f4ee-4feb-b73c-b3fd0eab7386")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0072be60-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3cbab846-4020-4e03-98ed-94424049fcec")
        private static SmClass smClass = null;

        @objid ("5461e3fd-def5-4c62-9aa0-27bde6c4de42")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FlowFinalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f93dcc0e-21ba-46fd-8568-c801de5a648e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007300a0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5cf26378-b702-46fe-864c-6f529df21337")
            public ISmObjectData createData() {
                return new FlowFinalNodeData();
            }

            @objid ("278f3e14-bde8-4be5-a0c6-b6746d749eae")
            public SmObjectImpl createImpl() {
                return new FlowFinalNodeImpl();
            }

        }

    }

}
