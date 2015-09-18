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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ControlNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ControlNode;
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

@objid ("002ee852-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ControlNode.class, factory=ControlNodeData.Metadata.ObjectFactory.class)
public abstract class ControlNodeData extends ActivityNodeData {
    @objid ("b16df411-6eca-4dcf-86b3-33c6edc9217e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008d9cd0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("182beb5c-d347-44e6-ada4-e3f87e00b77e")
        private static SmClass smClass = null;

        @objid ("9ddf596b-4ee7-4a5f-ab4d-999519398c7d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ControlNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("410a0069-49c0-4ee2-9204-8529adb9dfd4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008de078-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b9df62fb-4287-4eeb-bcec-39da32f2e757")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("193a3c72-036e-4794-88f3-c3997e3fdf23")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

    }

}
