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
package org.modelio.metamodel.impl.bpmn.gateways;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.gateways.BpmnInclusiveGateway;
import org.modelio.metamodel.impl.bpmn.flows.BpmnSequenceFlowSmClass;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnGatewaySmClass;
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

@objid ("b6cefc17-8520-4a81-aa9d-d15c52ef0901")
public class BpmnInclusiveGatewaySmClass extends BpmnGatewaySmClass {
    @objid ("0b6c28ab-1b4f-4d6b-b6fd-9fb6a9f57d31")
    private SmDependency defaultFlowDep;

    @objid ("d20fa11d-3e04-4eb2-a648-5a3b6d27d45c")
    public BpmnInclusiveGatewaySmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("b6f0da3b-5da3-4eaf-9e69-1e65cb5e902c")
    @Override
    public String getName() {
        return "BpmnInclusiveGateway";
    }

    @objid ("8c751a19-f485-41ae-8dbd-a9d55082732d")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("18c299fd-38a7-4589-8f21-6cb73f34070a")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnInclusiveGateway.class;
    }

    @objid ("16d9af49-3335-4c7d-9b5d-4835dafe5855")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("7b6c0e41-8953-4435-a2fe-aa9299dd948e")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("dacabda1-cb2d-49a7-a920-6e78728e92d0")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnGateway");
        this.registerFactory(new BpmnInclusiveGatewayObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.defaultFlowDep = new DefaultFlowSmDependency();
        this.defaultFlowDep.init("DefaultFlow", this, metamodel.getMClass("BpmnSequenceFlow"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.defaultFlowDep);
    }

    @objid ("a578edb5-4179-4081-8ff9-633c7d2e5a17")
    public SmDependency getDefaultFlowDep() {
        if (this.defaultFlowDep == null) {
        	this.defaultFlowDep = this.getDependencyDef("DefaultFlow");
        }
        return this.defaultFlowDep;
    }

    @objid ("47de289c-8c30-4de5-bb01-32a5843bde93")
    private static class BpmnInclusiveGatewayObjectFactory implements ISmObjectFactory {
        @objid ("5c2eabb5-29a8-4312-9b8f-969b6667fdd6")
        private BpmnInclusiveGatewaySmClass smClass;

        @objid ("5258e73a-193a-4e18-9e0f-8b5ae697373b")
        public BpmnInclusiveGatewayObjectFactory(BpmnInclusiveGatewaySmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("a82723c8-f847-4852-99b3-c38ff862e396")
        @Override
        public ISmObjectData createData() {
            return new BpmnInclusiveGatewayData(this.smClass);
        }

        @objid ("7a312c8f-7ee7-4cf5-a9c0-c76a8a36bb06")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnInclusiveGatewayImpl();
        }

    }

    @objid ("87186228-46ce-40bd-88a9-e8c01cb4cd8c")
    public static class DefaultFlowSmDependency extends SmSingleDependency {
        @objid ("9befcb54-a5d7-4b10-840f-b62ea4d2290e")
        private SmDependency symetricDep;

        @objid ("2c637026-0981-492d-a27c-1f5b742b4bbf")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnInclusiveGatewayData) data).mDefaultFlow;
        }

        @objid ("f93d9220-be3b-4cb3-bbf0-65e69b2ddc79")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnInclusiveGatewayData) data).mDefaultFlow = value;
        }

        @objid ("b3b2570e-0e09-4565-b875-50daa93e611c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSequenceFlowSmClass)this.getTarget()).getDefaultOfInclusiveDep();
            }
            return this.symetricDep;
        }

    }

}
