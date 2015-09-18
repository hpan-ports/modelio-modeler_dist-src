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
    @objid ("8dd1a8ec-6a35-4b8e-a26b-f5e78748eece")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ebffc-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c6776f08-834a-438d-84ad-f05f3e08a9c8")
        private static SmClass smClass = null;

        @objid ("80929460-05f4-40e8-8506-d04f0d6191d3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("53ed9ec2-eb4c-4067-a149-bc8d3e8da628")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003f0264-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ba174c34-38f2-4572-964b-bce491895d30")
            public ISmObjectData createData() {
                return new ActorData();
            }

            @objid ("6924e6d6-69f3-4282-8415-0db800b779f1")
            public SmObjectImpl createImpl() {
                return new ActorImpl();
            }

        }

    }

}
