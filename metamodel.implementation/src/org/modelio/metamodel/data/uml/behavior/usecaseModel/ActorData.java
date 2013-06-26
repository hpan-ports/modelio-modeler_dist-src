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
package org.modelio.metamodel.data.uml.behavior.usecaseModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.ActorImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
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

@objid ("00585d72-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Actor.class, factory=ActorData.Metadata.ObjectFactory.class, cmsnode=true)
public class ActorData extends GeneralClassData {
    @objid ("9ffae868-d6be-49df-b642-f38197b81554")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ebffc-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7bcd395d-8397-4409-bc5a-2c164c7f3e50")
        private static SmClass smClass = null;

        @objid ("e3d37b18-b973-4291-bd79-3c5f0630d994")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cf03cad7-d81a-44db-a921-b26453f59f0a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003f0264-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5ebf9649-ce46-4e29-b67c-d2fbe67f7c16")
            public ISmObjectData createData() {
                return new ActorData();
            }

            @objid ("ff4447a4-d334-49e5-a06d-826c3d3be8d6")
            public SmObjectImpl createImpl() {
                return new ActorImpl();
            }

        }

    }

}
