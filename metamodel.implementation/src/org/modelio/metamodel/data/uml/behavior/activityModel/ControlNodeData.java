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
    @objid ("f27dfa88-0168-4eec-8f78-4d1edf5b6720")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008d9cd0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("19f4c102-956a-4999-b12f-42c43f7a97e5")
        private static SmClass smClass = null;

        @objid ("248c9434-57e7-4e9a-90f3-7fafea5db0ef")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ControlNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ab8552e9-227f-47a6-905a-e7c3009c493f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008de078-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6177bdcc-75d2-4a64-85fd-4e6c363c687f")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("03229b0c-faa9-45f8-8438-da4c8d789ad6")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

    }

}
