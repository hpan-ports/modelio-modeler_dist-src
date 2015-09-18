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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.UsageImpl;
import org.modelio.metamodel.uml.infrastructure.Usage;
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

@objid ("00913aa2-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Usage.class, factory=UsageData.Metadata.ObjectFactory.class)
public class UsageData extends DependencyData {
    @objid ("8738959f-80b6-44c0-9680-214e09d806f7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0009b80c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("922a0cc5-de23-4b12-90e5-93b75f8e5d47")
        private static SmClass smClass = null;

        @objid ("37616baf-22c2-4b79-96c4-c7be3dd40fb8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UsageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4e733f5e-9dfb-4523-a264-adf26ab2cfd0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0009f920-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("99bc3813-e407-40df-898c-f8c394304f6b")
            public ISmObjectData createData() {
                return new UsageData();
            }

            @objid ("9965b27e-3cfb-42ed-aae1-3bfea1aa9da7")
            public SmObjectImpl createImpl() {
                return new UsageImpl();
            }

        }

    }

}
