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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.InterfaceSmClass;
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("af5d6ee8-f94d-4e95-84be-6bebc0cc3fdd")
public class InterfaceRealizationSmClass extends ModelElementSmClass {
    @objid ("866461cb-05c1-4997-a0ad-140e9f555ff6")
    private SmDependency implementedDep;

    @objid ("469b279e-35fd-4bfd-a4f6-43cf85f43543")
    private SmDependency implementerDep;

    @objid ("f5772759-915a-4abf-b9bd-a8b10457f4a3")
    public InterfaceRealizationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("b11e94a6-0d8b-408f-b504-78f5d4669828")
    @Override
    public String getName() {
        return "InterfaceRealization";
    }

    @objid ("4b152452-b21f-4fd8-a242-34a79fbcc88f")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("b295e413-0751-453b-b546-26fe0360af33")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return InterfaceRealization.class;
    }

    @objid ("fa727420-1e3d-4236-b6c2-8be9af0502b3")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("689376a2-ec88-44c4-aab8-0de810832651")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("d217c915-b68a-40ce-bcd3-22bf3891f531")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new InterfaceRealizationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.implementedDep = new ImplementedSmDependency();
        this.implementedDep.init("Implemented", this, metamodel.getMClass("Interface"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.implementedDep);
        
        this.implementerDep = new ImplementerSmDependency();
        this.implementerDep.init("Implementer", this, metamodel.getMClass("NameSpace"), 0, 1 );
        registerDependency(this.implementerDep);
    }

    @objid ("2f55a573-0e90-4469-8eef-604b6cd7fc0f")
    public SmDependency getImplementedDep() {
        if (this.implementedDep == null) {
        	this.implementedDep = this.getDependencyDef("Implemented");
        }
        return this.implementedDep;
    }

    @objid ("7c423b6b-83b1-49be-9481-c243401d43bd")
    public SmDependency getImplementerDep() {
        if (this.implementerDep == null) {
        	this.implementerDep = this.getDependencyDef("Implementer");
        }
        return this.implementerDep;
    }

    @objid ("a9edc9a3-4a83-4074-8e48-3f8db6e29871")
    private static class InterfaceRealizationObjectFactory implements ISmObjectFactory {
        @objid ("4fcedc98-b6c2-46f1-bdf8-68c505d824bf")
        private InterfaceRealizationSmClass smClass;

        @objid ("fb14fbce-e10b-48d4-92e9-dad238d73673")
        public InterfaceRealizationObjectFactory(InterfaceRealizationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("b006c294-fc35-4665-9a9b-acfc4e099bc9")
        @Override
        public ISmObjectData createData() {
            return new InterfaceRealizationData(this.smClass);
        }

        @objid ("4c49cda5-d699-443c-b161-d486724dc52a")
        @Override
        public SmObjectImpl createImpl() {
            return new InterfaceRealizationImpl();
        }

    }

    @objid ("75238a04-d57c-4cd6-abf0-937acced6ac2")
    public static class ImplementedSmDependency extends SmSingleDependency {
        @objid ("a7be7e61-68ec-4273-b3f5-aa4884b4ccc3")
        private SmDependency symetricDep;

        @objid ("937ae6ae-f6f8-44c8-9206-c1610dc647d9")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((InterfaceRealizationData) data).mImplemented;
        }

        @objid ("32e3af65-490c-4d12-87cd-e048c91f577d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((InterfaceRealizationData) data).mImplemented = value;
        }

        @objid ("32adec26-147e-49fc-a86b-86bad414e434")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InterfaceSmClass)this.getTarget()).getImplementedLinkDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f19fa479-1560-4d84-91e6-75fc0896765c")
    public static class ImplementerSmDependency extends SmSingleDependency {
        @objid ("55bbf480-3f89-4d48-a41a-bbde28f7a80c")
        private SmDependency symetricDep;

        @objid ("714f0a6a-9109-42ba-af0a-7fd1b2b17b00")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((InterfaceRealizationData) data).mImplementer;
        }

        @objid ("e5981aef-b43f-45a7-8dec-9feb40c20af5")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((InterfaceRealizationData) data).mImplementer = value;
        }

        @objid ("b1c750cf-4b32-48e2-a06f-65a36aa40d3e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getRealizedDep();
            }
            return this.symetricDep;
        }

    }

}
