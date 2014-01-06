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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.TerminateSpecificationImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.TerminateSpecification;
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

@objid ("004c77aa-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TerminateSpecification.class, factory=TerminateSpecificationData.Metadata.ObjectFactory.class)
public class TerminateSpecificationData extends ExecutionOccurenceSpecificationData {
    @objid ("49ee9597-4803-4d37-9865-4d617a571551")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0087d138-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b8b011b2-f158-47a2-acea-df265db5398d")
        private static SmClass smClass = null;

        @objid ("f9eb4196-74cb-4962-b23b-ecc1ede45488")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TerminateSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d22c91b1-40db-43aa-8429-4c41c8f9de6c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008811f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("61736d27-1263-4bff-b7e1-d787ce7cb815")
            public ISmObjectData createData() {
                return new TerminateSpecificationData();
            }

            @objid ("f9209cd4-e31e-427b-92a2-a05de52312a2")
            public SmObjectImpl createImpl() {
                return new TerminateSpecificationImpl();
            }

        }

    }

}
