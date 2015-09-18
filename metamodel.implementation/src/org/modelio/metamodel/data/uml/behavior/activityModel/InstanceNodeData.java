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
    @objid ("8e6b9bdc-a8fd-485e-8a49-c784e5c35ac5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007e12ba-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6d30e239-5290-450a-9d10-1ce472a2278a")
        private static SmClass smClass = null;

        @objid ("b927fe97-7c49-4968-9482-36501518d7c9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InstanceNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("84c762f0-f35a-431e-887d-8bdb3c447f8d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007e54b4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("174615a7-e426-490a-ad5c-2cb50dcca9fc")
            public ISmObjectData createData() {
                return new InstanceNodeData();
            }

            @objid ("ca3ea7a6-e037-47bf-b261-e4b65c1eaf48")
            public SmObjectImpl createImpl() {
                return new InstanceNodeImpl();
            }

        }

    }

}
