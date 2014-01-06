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
    @objid ("a6ff5b68-231c-4dc4-8156-9a44d171bf9c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007e12ba-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3ac09f83-1505-4a0e-be2f-07a2c3441d9a")
        private static SmClass smClass = null;

        @objid ("7406d9f0-2769-42db-acb0-7a73504afe69")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InstanceNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bc323584-11cd-4bf7-9290-757bda9a73d9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007e54b4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1d8474f4-6134-4014-b098-07f2746a4608")
            public ISmObjectData createData() {
                return new InstanceNodeData();
            }

            @objid ("52772cc7-7c39-4621-9ad2-beebaf4e2b6e")
            public SmObjectImpl createImpl() {
                return new InstanceNodeImpl();
            }

        }

    }

}
