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
    @objid ("e4598ca8-b56e-4c57-8397-30b1ed7956f2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0009b80c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a61bf3cc-7c2a-4c37-85cf-b6c7590578e8")
        private static SmClass smClass = null;

        @objid ("11e7ef6d-3974-43e4-9e32-1d83abc818df")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UsageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6de88f55-0904-4d12-8c3e-bdc8025e3aa4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0009f920-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0b908b84-2de0-401f-84c3-8862456b2f0c")
            public ISmObjectData createData() {
                return new UsageData();
            }

            @objid ("8d929f3a-7f5c-4365-9189-591938549e5b")
            public SmObjectImpl createImpl() {
                return new UsageImpl();
            }

        }

    }

}
