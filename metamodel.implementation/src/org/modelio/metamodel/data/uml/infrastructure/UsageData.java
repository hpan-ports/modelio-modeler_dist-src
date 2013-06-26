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
    @objid ("b62247da-56fb-4f6a-9f03-0b3f34fb2d17")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0009b80c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ceb6d715-9825-4b97-8fa1-ad3834261ee3")
        private static SmClass smClass = null;

        @objid ("8b88a4ef-aba4-4cc9-8e46-49d43b0a61cb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UsageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("821a4dff-6749-4ab0-9fc1-1a850e6a192d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0009f920-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6a6fef58-199c-4938-85d2-3e8f22ef1d49")
            public ISmObjectData createData() {
                return new UsageData();
            }

            @objid ("d1e784b9-ce9b-43ea-b22d-7e47de23b526")
            public SmObjectImpl createImpl() {
                return new UsageImpl();
            }

        }

    }

}
