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
    @objid ("4f8a732e-6185-4ed5-a293-7cb5d3c4d0e1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0043f530-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9d9d0ca4-084f-4552-aaa6-c8386dbd6d01")
        private static SmClass smClass = null;

        @objid ("44c18faf-537e-4ac3-9012-3bf413a62b0d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InitialNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1a894a03-7a92-4d78-ae35-48d8d350a202")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00443702-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("35302066-ab2b-49b6-8bd1-0c5954896cf4")
            public ISmObjectData createData() {
                return new InitialNodeData();
            }

            @objid ("a191106e-16e2-4fa2-9e87-8a505774b6de")
            public SmObjectImpl createImpl() {
                return new InitialNodeImpl();
            }

        }

    }

}
