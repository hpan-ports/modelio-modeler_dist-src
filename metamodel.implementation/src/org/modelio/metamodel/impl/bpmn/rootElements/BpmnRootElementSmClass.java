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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBehaviorSmClass;
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

@objid ("7a1ed797-03ca-4ad2-8707-d677166d020f")
public class BpmnRootElementSmClass extends BpmnBaseElementSmClass {
    @objid ("552b019f-309b-40d3-b647-672acc6854d8")
    private SmDependency ownerDep;

    @objid ("d1fe85e1-1564-4d28-8105-38b5f6663641")
    public BpmnRootElementSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("c163315f-02a7-40b0-b7df-7087f18751b1")
    @Override
    public String getName() {
        return "BpmnRootElement";
    }

    @objid ("c3351283-0e21-4c5a-a6c0-a23ef5705397")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("2a56a44e-73d5-42c2-8f0e-d7ee0aedbcf3")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnRootElement.class;
    }

    @objid ("b76f18e1-17d8-46c1-9a43-dfe90073c6b4")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("ef663b37-af07-4edf-83e0-28a2cfbf50db")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("08f6407d-a159-4770-9ab2-fa13d53fa6b7")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnRootElementObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("BpmnBehavior"), 0, 1 );
        registerDependency(this.ownerDep);
    }

    @objid ("4247cc62-ac2e-4ab5-ba50-c09f0d19c119")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("406ccb44-b57f-455c-8ec7-2247acb53a7f")
    private static class BpmnRootElementObjectFactory implements ISmObjectFactory {
        @objid ("918f6cfd-cfdc-4308-8ec6-3605c9e957e6")
        private BpmnRootElementSmClass smClass;

        @objid ("086ccd62-c55a-4bfc-8244-b7dc89c751e4")
        public BpmnRootElementObjectFactory(BpmnRootElementSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("5717506c-4c83-4c0e-a0f2-135cd6d7813e")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("8c75da36-f1af-4cd8-8ad9-637a7132a2c8")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("a45bb194-6258-4f54-a01c-229cb85b735f")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("47463c9e-1375-4c01-8657-85094b4bdfc2")
        private SmDependency symetricDep;

        @objid ("a42e19e4-5718-4b6d-90f7-857528a21a4b")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnRootElementData) data).mOwner;
        }

        @objid ("fd8db4f8-cd24-4281-b670-efa122b59c0b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnRootElementData) data).mOwner = value;
        }

        @objid ("e6ee5fac-fef8-48f8-ab61-947a782b17a6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnBehaviorSmClass)this.getTarget()).getRootElementDep();
            }
            return this.symetricDep;
        }

    }

}
