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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.impl.bpmn.activities.BpmnActivitySmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventDefinitionSmClass;
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

@objid ("dae9bc16-62d9-4710-8180-d149139425f7")
public class BpmnCompensateEventDefinitionSmClass extends BpmnEventDefinitionSmClass {
    @objid ("256fb809-01a1-48bf-905f-f628dc0ea0e7")
    private SmDependency activityRefDep;

    @objid ("13c4ec39-7c9b-4214-a6f1-bfa66bfc532c")
    public BpmnCompensateEventDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("0b67bc24-1fa1-42cf-907b-ba9d7e7a1c99")
    @Override
    public String getName() {
        return "BpmnCompensateEventDefinition";
    }

    @objid ("0158a181-e05c-476b-bdc0-4e9a3413d887")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("dc777eed-1ca8-42fd-b7d0-328273680c4e")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnCompensateEventDefinition.class;
    }

    @objid ("31690813-e390-4092-b94e-4ca97e422a6c")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("36a2012f-0a10-47b6-9c8f-dd3b5fe88419")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("ca62914c-7b67-49ef-b7e4-0d08f544617e")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnEventDefinition");
        this.registerFactory(new BpmnCompensateEventDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.activityRefDep = new ActivityRefSmDependency();
        this.activityRefDep.init("ActivityRef", this, metamodel.getMClass("BpmnActivity"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.activityRefDep);
    }

    @objid ("5ca8d333-b361-4d9c-b0f6-6ee8ba22d772")
    public SmDependency getActivityRefDep() {
        if (this.activityRefDep == null) {
        	this.activityRefDep = this.getDependencyDef("ActivityRef");
        }
        return this.activityRefDep;
    }

    @objid ("f045d4ff-540c-453e-8b01-6a34682a0a5c")
    private static class BpmnCompensateEventDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("a6c8cff9-a607-43f1-af92-c16615fcd1d5")
        private BpmnCompensateEventDefinitionSmClass smClass;

        @objid ("b2d5ddcc-adff-45c6-a4c7-633b12ba9a36")
        public BpmnCompensateEventDefinitionObjectFactory(BpmnCompensateEventDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("a088577d-6734-4683-9d3c-1010a43aae74")
        @Override
        public ISmObjectData createData() {
            return new BpmnCompensateEventDefinitionData(this.smClass);
        }

        @objid ("1549db0a-d3b5-4756-8fe0-6d0cd02ecb87")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnCompensateEventDefinitionImpl();
        }

    }

    @objid ("d7208a00-4ba4-4f45-b4e9-e8f53163331c")
    public static class ActivityRefSmDependency extends SmSingleDependency {
        @objid ("1e09ef44-da04-463e-8e69-3e73960c6d94")
        private SmDependency symetricDep;

        @objid ("ce4e313e-748b-4e02-ad01-fafb55527daa")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnCompensateEventDefinitionData) data).mActivityRef;
        }

        @objid ("676d3a9f-eb8a-430e-83f8-db8900fae420")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnCompensateEventDefinitionData) data).mActivityRef = value;
        }

        @objid ("83c1264e-521e-4bbf-996f-3d49462a7042")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnActivitySmClass)this.getTarget()).getCompensateEventDefinitionsDep();
            }
            return this.symetricDep;
        }

    }

}
