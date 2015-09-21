/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.behavior.usecaseModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("75ac7365-5024-4e1f-a996-4d7ea2b787c3")
public class ActorSmClass extends GeneralClassSmClass {
    @objid ("c82303ac-f2bf-45f8-b0eb-820d04b65595")
    public ActorSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("93c5bd9d-cdef-4a24-b450-03958ac32b90")
    @Override
    public String getName() {
        return "Actor";
    }

    @objid ("5341dfc0-8cd4-42ee-8fcd-cbaf39850a42")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("428af1e9-d978-4f81-9858-2632e6e68082")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Actor.class;
    }

    @objid ("a0a3b718-e569-4edd-b246-3f5efc63e4ab")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("ee2df4bd-abd8-4952-b9ab-85ebbcdfc871")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("e66f2be2-7a24-463b-8adc-aeb8661292f3")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("GeneralClass");
        this.registerFactory(new ActorObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("bd96685b-7ebe-4c25-860c-f63889f21919")
    private static class ActorObjectFactory implements ISmObjectFactory {
        @objid ("ecfa3568-dbdf-4077-a642-04a59a3136cb")
        private ActorSmClass smClass;

        @objid ("fe795131-8ae5-4f61-b323-ccf73bbbb003")
        public ActorObjectFactory(ActorSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("afaf086c-d8e6-4081-bb88-13492ee96a63")
        @Override
        public ISmObjectData createData() {
            return new ActorData(this.smClass);
        }

        @objid ("8881480e-46a7-4ff6-8725-661911c11ca4")
        @Override
        public SmObjectImpl createImpl() {
            return new ActorImpl();
        }

    }

}
