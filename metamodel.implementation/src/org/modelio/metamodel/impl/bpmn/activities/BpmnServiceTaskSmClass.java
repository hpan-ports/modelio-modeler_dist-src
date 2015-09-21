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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnTaskSmClass;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnOperationSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("7fd93dec-e8fc-4871-8288-ff273df77741")
public class BpmnServiceTaskSmClass extends BpmnTaskSmClass {
    @objid ("6fb80d5d-9646-415e-b6ab-30e3cd30bc28")
    private SmAttribute implementationAtt;

    @objid ("937bef1b-c5a1-4fbd-a12a-47e5004b7fda")
    private SmDependency calledOperationDep;

    @objid ("c0b20ee0-a86d-4fb8-8ba9-c22e2991456b")
    private SmDependency operationRefDep;

    @objid ("2dd9a223-fadf-480c-9051-bddcab2835dd")
    public BpmnServiceTaskSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("df857099-8690-41b8-9ab9-648db6fcf83d")
    @Override
    public String getName() {
        return "BpmnServiceTask";
    }

    @objid ("f3b5e3d8-102e-4c86-9530-70523392d992")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("149fadbb-f105-4108-a61c-66433794b09e")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnServiceTask.class;
    }

    @objid ("e6795965-a56b-4e33-9210-08d67e913793")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("374dbf03-f754-40da-b24a-6956b98b91d9")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("dfc84e35-dfde-4209-a8fb-9845a166b370")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnTask");
        this.registerFactory(new BpmnServiceTaskObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.implementationAtt = new ImplementationSmAttribute();
        this.implementationAtt.init("Implementation", this, String.class );
        registerAttribute(this.implementationAtt);
        
        
        // Initialize and register the SmDependency
        this.calledOperationDep = new CalledOperationSmDependency();
        this.calledOperationDep.init("CalledOperation", this, metamodel.getMClass("Operation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.calledOperationDep);
        
        this.operationRefDep = new OperationRefSmDependency();
        this.operationRefDep.init("OperationRef", this, metamodel.getMClass("BpmnOperation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.operationRefDep);
    }

    @objid ("ca4003cc-a88d-4067-b71c-bb25c7178498")
    public SmAttribute getImplementationAtt() {
        if (this.implementationAtt == null) {
        	this.implementationAtt = this.getAttributeDef("Implementation");
        }
        return this.implementationAtt;
    }

    @objid ("16955fb4-d83a-4474-b425-3f206caa99ec")
    public SmDependency getCalledOperationDep() {
        if (this.calledOperationDep == null) {
        	this.calledOperationDep = this.getDependencyDef("CalledOperation");
        }
        return this.calledOperationDep;
    }

    @objid ("d2331d47-0f5c-4ef7-871c-5184c466524c")
    public SmDependency getOperationRefDep() {
        if (this.operationRefDep == null) {
        	this.operationRefDep = this.getDependencyDef("OperationRef");
        }
        return this.operationRefDep;
    }

    @objid ("d8a69342-6945-4f4f-bfac-53435bc85a38")
    private static class BpmnServiceTaskObjectFactory implements ISmObjectFactory {
        @objid ("d95d79bc-df2c-479b-9b6e-2e710fff1525")
        private BpmnServiceTaskSmClass smClass;

        @objid ("0368636b-af9b-4f6c-9cc4-a796c42eec9f")
        public BpmnServiceTaskObjectFactory(BpmnServiceTaskSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("10d6fe07-9c66-4b6b-8002-d558789bae31")
        @Override
        public ISmObjectData createData() {
            return new BpmnServiceTaskData(this.smClass);
        }

        @objid ("ae4e8d63-18a3-44ce-9042-aa3b70efed42")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnServiceTaskImpl();
        }

    }

    @objid ("8f04c0a3-1bda-42ca-8fef-b2e144a442a7")
    public static class ImplementationSmAttribute extends SmAttribute {
        @objid ("db36ddef-399d-4e33-8851-1e9fbac79bbd")
        public Object getValue(ISmObjectData data) {
            return ((BpmnServiceTaskData) data).mImplementation;
        }

        @objid ("4f39c009-1ca4-4ff6-ad54-3c05dec61439")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnServiceTaskData) data).mImplementation = value;
        }

    }

    @objid ("62489e06-bb2e-43e6-976d-691c32371b5a")
    public static class CalledOperationSmDependency extends SmSingleDependency {
        @objid ("a390a99a-9b47-47b5-a05b-3e6eb85ee769")
        private SmDependency symetricDep;

        @objid ("8b9e39ee-113d-4272-b704-67722a42d307")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnServiceTaskData) data).mCalledOperation;
        }

        @objid ("c1bf6bfc-c439-4750-a141-fd8b0dfb5c18")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnServiceTaskData) data).mCalledOperation = value;
        }

        @objid ("05a3784e-ac35-4ccc-b852-32bd06c5f84d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getCallerServiceTaskDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("eeee7d00-e5cf-45a2-8eb3-75fcb2b9bc87")
    public static class OperationRefSmDependency extends SmSingleDependency {
        @objid ("ce74d76d-4cfa-4b73-bc04-0e980d852ed6")
        private SmDependency symetricDep;

        @objid ("be138005-8dab-4c12-806d-c9e8bad6dfb8")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnServiceTaskData) data).mOperationRef;
        }

        @objid ("567988b5-89dc-4ab5-a020-4efe76c53e9d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnServiceTaskData) data).mOperationRef = value;
        }

        @objid ("16612a98-0f16-47e5-8e31-f8aecb300599")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnOperationSmClass)this.getTarget()).getCallerDep();
            }
            return this.symetricDep;
        }

    }

}
