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
/*   Metamodel version: 9019              */
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
    @objid ("0aa82bf1-b7ab-4863-97f6-86bb862a0ad5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008d9cd0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5d65b0b9-5648-4911-94ac-9c8a8ba7ebc7")
        private static SmClass smClass = null;

        @objid ("a295b66d-6981-4dbc-88a7-1f8c1fdcb84f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ControlNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("63b4b868-a3f4-40d0-9b57-35c293c77cea")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008de078-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d987b145-3939-4eb7-81fb-f27bd25ba22e")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("27fcfa7e-6438-442a-9318-411549b5c3f6")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

    }

}
