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
    @objid ("780b318e-c1e4-4c30-9021-7ef201c794f5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0087d138-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("438fc109-3f9b-4379-9d3b-5953e0dc82af")
        private static SmClass smClass = null;

        @objid ("abfa2421-201e-4379-a0cb-03be1d6f94b9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TerminateSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("909983e5-9785-4004-9db7-8734047e6888")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008811f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1201b685-e99e-4846-bd18-7a330600c2d7")
            public ISmObjectData createData() {
                return new TerminateSpecificationData();
            }

            @objid ("a6cd4bff-e499-44ac-bd1e-23c0f52ebc78")
            public SmObjectImpl createImpl() {
                return new TerminateSpecificationImpl();
            }

        }

    }

}
