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
    @objid ("d9552b83-4f4a-42fb-8abf-425d1b73b48b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ebffc-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b26a0697-699b-4505-817f-49408fceaf50")
        private static SmClass smClass = null;

        @objid ("caf60bb4-e7f3-4175-95ab-f081ab29959d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fcb6b789-2295-4bda-b911-11f78572e39a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003f0264-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("201fb453-5955-49c4-84a1-99c956b188a2")
            public ISmObjectData createData() {
                return new ActorData();
            }

            @objid ("749cf729-9e07-45c7-9b85-5c9800eeecaa")
            public SmObjectImpl createImpl() {
                return new ActorImpl();
            }

        }

    }

}
