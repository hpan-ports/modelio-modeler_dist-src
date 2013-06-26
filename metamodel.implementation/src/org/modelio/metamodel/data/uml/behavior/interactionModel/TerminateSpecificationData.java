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
    @objid ("dd4d4b6a-b3a3-45ca-9b11-5cf9b4b072f1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0087d138-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9f9c79c4-3bbb-47f5-9e58-a2d8317fa58b")
        private static SmClass smClass = null;

        @objid ("603eac55-4be8-4468-9f12-748e103c9fde")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TerminateSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("51627957-b9e8-4cfd-8a22-b95cb62793e0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008811f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c23eb13f-5147-4929-a70b-618fd2a9f4bd")
            public ISmObjectData createData() {
                return new TerminateSpecificationData();
            }

            @objid ("dd8cb7a4-beb7-49a3-8bc8-cd8ba81903ae")
            public SmObjectImpl createImpl() {
                return new TerminateSpecificationImpl();
            }

        }

    }

}
