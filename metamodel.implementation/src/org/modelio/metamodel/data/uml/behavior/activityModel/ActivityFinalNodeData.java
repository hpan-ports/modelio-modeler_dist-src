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
    @objid ("54b6d193-4b05-44ba-b138-d0b394c4e762")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00107638-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5cea7524-c330-4fa8-ba3e-acb4189a365f")
        private static SmClass smClass = null;

        @objid ("942c7764-3adc-40ec-8afc-b3a2525d6c27")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityFinalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6d0144cc-528c-418b-8ba4-9ab73be461b6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0010b878-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("90f84684-cec2-4944-97cd-e48c685efa25")
            public ISmObjectData createData() {
                return new ActivityFinalNodeData();
            }

            @objid ("46ae939f-860c-40f3-b3d8-610d9999b40a")
            public SmObjectImpl createImpl() {
                return new ActivityFinalNodeImpl();
            }

        }

    }

}
