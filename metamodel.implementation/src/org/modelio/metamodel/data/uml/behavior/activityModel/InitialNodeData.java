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
import org.modelio.metamodel.impl.uml.behavior.activityModel.InitialNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.InitialNode;
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

@objid ("0034c7ae-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InitialNode.class, factory=InitialNodeData.Metadata.ObjectFactory.class)
public class InitialNodeData extends ControlNodeData {
    @objid ("8112536e-a35d-41f3-a519-f19efa905d3b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0043f530-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1a52130e-ee77-4146-86b7-4e3bbde600f1")
        private static SmClass smClass = null;

        @objid ("67a74cb2-64c0-4126-8609-9ebcf529bae5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InitialNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5ce3e73b-8179-4325-bdb3-caeed7624fb8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00443702-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("09bb128e-d7a2-4dec-878c-f191e06309d7")
            public ISmObjectData createData() {
                return new InitialNodeData();
            }

            @objid ("fcf1c3ce-5574-4eef-ae92-151509af292a")
            public SmObjectImpl createImpl() {
                return new InitialNodeImpl();
            }

        }

    }

}
