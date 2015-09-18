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
import org.modelio.metamodel.impl.uml.behavior.activityModel.FinalNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.FinalNode;
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

@objid ("0032c97c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=FinalNode.class, factory=FinalNodeData.Metadata.ObjectFactory.class)
public abstract class FinalNodeData extends ControlNodeData {
    @objid ("5b1b1521-473c-4df5-8808-e32b8898cf03")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006fafae-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b1929082-1c6a-48c4-aa63-873d9c8ef0e4")
        private static SmClass smClass = null;

        @objid ("843c845d-6786-4f8c-b497-100ccd3f5b19")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FinalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f845cbee-9f89-42e2-86d3-535a02b7a53a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007000b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dee4e569-7675-47db-81c9-ce3190ec7ac4")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("3e062f57-a7a9-450e-846b-cd22b650f1c6")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

    }

}
