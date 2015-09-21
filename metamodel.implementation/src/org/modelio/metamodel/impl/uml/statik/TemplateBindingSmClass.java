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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.impl.uml.statik.TemplateParameterSubstitutionSmClass;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("3f0d167f-f8f6-4084-b5f9-ccbcaa07e981")
public class TemplateBindingSmClass extends ModelElementSmClass {
    @objid ("69d21359-5a37-44c3-b41d-a5b1d8b83083")
    private SmDependency parameterSubstitutionDep;

    @objid ("e404c120-d61c-428f-8b37-b6132ab8d69e")
    private SmDependency boundOperationDep;

    @objid ("1801e84a-5622-4933-8635-5b3274cddfb9")
    private SmDependency instanciatedTemplateOperationDep;

    @objid ("68a7294e-012e-4d9e-adc0-04a0b7acf550")
    private SmDependency instanciatedTemplateDep;

    @objid ("cc0c023b-1919-46ce-a86a-5cc7278b4520")
    private SmDependency boundElementDep;

    @objid ("6d06f7e2-4b9d-4cc9-8eb6-e1199484f4df")
    public TemplateBindingSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("88c91b84-2a8b-41a0-808a-b204034d554e")
    @Override
    public String getName() {
        return "TemplateBinding";
    }

    @objid ("fdb5c7d4-7cd6-401a-8f06-69735b6ff47c")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("337739ba-8649-4ddc-a791-af23e7cedbce")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return TemplateBinding.class;
    }

    @objid ("8520dffb-3baf-4cc0-a5a6-f02730ff0312")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("6eadfde0-44ae-4125-af2c-e34b3f695a2c")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("5b8cda1b-9af4-4da7-b014-e8bd876fa18f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new TemplateBindingObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.parameterSubstitutionDep = new ParameterSubstitutionSmDependency();
        this.parameterSubstitutionDep.init("ParameterSubstitution", this, metamodel.getMClass("TemplateParameterSubstitution"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.parameterSubstitutionDep);
        
        this.boundOperationDep = new BoundOperationSmDependency();
        this.boundOperationDep.init("BoundOperation", this, metamodel.getMClass("Operation"), 0, 1 );
        registerDependency(this.boundOperationDep);
        
        this.instanciatedTemplateOperationDep = new InstanciatedTemplateOperationSmDependency();
        this.instanciatedTemplateOperationDep.init("InstanciatedTemplateOperation", this, metamodel.getMClass("Operation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.instanciatedTemplateOperationDep);
        
        this.instanciatedTemplateDep = new InstanciatedTemplateSmDependency();
        this.instanciatedTemplateDep.init("InstanciatedTemplate", this, metamodel.getMClass("NameSpace"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.instanciatedTemplateDep);
        
        this.boundElementDep = new BoundElementSmDependency();
        this.boundElementDep.init("BoundElement", this, metamodel.getMClass("NameSpace"), 0, 1 );
        registerDependency(this.boundElementDep);
    }

    @objid ("b2c00f26-d718-48af-91e1-e02c5c3a3960")
    public SmDependency getParameterSubstitutionDep() {
        if (this.parameterSubstitutionDep == null) {
        	this.parameterSubstitutionDep = this.getDependencyDef("ParameterSubstitution");
        }
        return this.parameterSubstitutionDep;
    }

    @objid ("7cdda354-6ef5-4530-b8db-d6b47ea19044")
    public SmDependency getBoundOperationDep() {
        if (this.boundOperationDep == null) {
        	this.boundOperationDep = this.getDependencyDef("BoundOperation");
        }
        return this.boundOperationDep;
    }

    @objid ("85f3eb6a-32e6-4375-85fc-851197c6ac88")
    public SmDependency getInstanciatedTemplateOperationDep() {
        if (this.instanciatedTemplateOperationDep == null) {
        	this.instanciatedTemplateOperationDep = this.getDependencyDef("InstanciatedTemplateOperation");
        }
        return this.instanciatedTemplateOperationDep;
    }

    @objid ("c6461e37-760c-4ee8-939e-c9b9588a6832")
    public SmDependency getInstanciatedTemplateDep() {
        if (this.instanciatedTemplateDep == null) {
        	this.instanciatedTemplateDep = this.getDependencyDef("InstanciatedTemplate");
        }
        return this.instanciatedTemplateDep;
    }

    @objid ("0c0d98a0-5e7b-4539-81bf-fed07b175ce4")
    public SmDependency getBoundElementDep() {
        if (this.boundElementDep == null) {
        	this.boundElementDep = this.getDependencyDef("BoundElement");
        }
        return this.boundElementDep;
    }

    @objid ("66adfb9a-41c8-45de-bbb3-2a46f822c33d")
    private static class TemplateBindingObjectFactory implements ISmObjectFactory {
        @objid ("ebd96af9-d198-4a9f-9138-afbeb8251aea")
        private TemplateBindingSmClass smClass;

        @objid ("814a44d5-a3d1-48c7-8e77-17492125fbbf")
        public TemplateBindingObjectFactory(TemplateBindingSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("57dcccbe-faf1-427f-81ac-9d5efaf3e953")
        @Override
        public ISmObjectData createData() {
            return new TemplateBindingData(this.smClass);
        }

        @objid ("724f12aa-745d-44c5-a686-0575e32fe14d")
        @Override
        public SmObjectImpl createImpl() {
            return new TemplateBindingImpl();
        }

    }

    @objid ("2d8e3c1c-8b91-4a58-b6bc-d1383da92f52")
    public static class ParameterSubstitutionSmDependency extends SmMultipleDependency {
        @objid ("b7bcf275-ed55-4ae9-8d01-f7eee47fc576")
        private SmDependency symetricDep;

        @objid ("e431058b-ed51-4ae1-9679-426932670fa2")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((TemplateBindingData)data).mParameterSubstitution != null)? ((TemplateBindingData)data).mParameterSubstitution:SmMultipleDependency.EMPTY;
        }

        @objid ("60d81316-43ae-40ca-8e0d-df8835e28d79")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((TemplateBindingData) data).mParameterSubstitution = values;
        }

        @objid ("534bc0ba-9fa2-4298-aecc-d48ea16d4c24")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateParameterSubstitutionSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0379747a-d4ae-414b-9253-45a48b93ea82")
    public static class BoundOperationSmDependency extends SmSingleDependency {
        @objid ("941ccbc8-bf66-468d-940e-2d8ed9e5f10e")
        private SmDependency symetricDep;

        @objid ("7e86f664-1326-46fe-9e31-51ff682c53d9")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TemplateBindingData) data).mBoundOperation;
        }

        @objid ("f6630522-399d-47c1-9754-469a2ea094c8")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TemplateBindingData) data).mBoundOperation = value;
        }

        @objid ("fca8d869-5eb1-4aa5-a24a-f19667ef5bf3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getTemplateInstanciationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b30c811e-179a-443a-9dea-891e062ecd97")
    public static class InstanciatedTemplateOperationSmDependency extends SmSingleDependency {
        @objid ("b1df36d2-3617-4b9b-b39e-426bd7b573dc")
        private SmDependency symetricDep;

        @objid ("0e85ebb7-8536-4bb7-a0fd-dd874e5b322d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TemplateBindingData) data).mInstanciatedTemplateOperation;
        }

        @objid ("58607ed8-f877-4800-bfca-378b094c86a5")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TemplateBindingData) data).mInstanciatedTemplateOperation = value;
        }

        @objid ("d11f76ed-78a4-4c3f-96a9-cb2d91fef32f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getInstanciatingBindingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7fc41c50-6f6c-445b-8b78-b903375d38a4")
    public static class InstanciatedTemplateSmDependency extends SmSingleDependency {
        @objid ("45f8f92b-dd12-4871-9322-5ff41fca69e3")
        private SmDependency symetricDep;

        @objid ("8174210e-3d1d-4a62-b30b-2dd8187c15ce")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TemplateBindingData) data).mInstanciatedTemplate;
        }

        @objid ("43ee7731-551d-4ccf-b27d-65e926960082")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TemplateBindingData) data).mInstanciatedTemplate = value;
        }

        @objid ("738afbfe-f34c-48a3-826a-ecbebdb383ba")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getInstanciatingBindingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("058ab1ea-5186-4d32-a55a-a25573824b01")
    public static class BoundElementSmDependency extends SmSingleDependency {
        @objid ("8196ba62-57a8-452c-83eb-e228eae7a2cd")
        private SmDependency symetricDep;

        @objid ("68a21676-294c-41c1-aa68-a7abd388ed8f")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TemplateBindingData) data).mBoundElement;
        }

        @objid ("7bf44da1-8d25-4440-b0c7-48761a2395e4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TemplateBindingData) data).mBoundElement = value;
        }

        @objid ("2b078785-50fd-464e-9e63-f093cc75e55a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getTemplateInstanciationDep();
            }
            return this.symetricDep;
        }

    }

}
