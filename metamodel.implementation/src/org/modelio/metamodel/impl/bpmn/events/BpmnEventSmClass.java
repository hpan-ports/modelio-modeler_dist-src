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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventDefinitionSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowNodeSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("b176ad0b-b65b-4dd5-9dad-1af827c191b1")
public class BpmnEventSmClass extends BpmnFlowNodeSmClass {
    @objid ("cae93241-50df-4114-a5b3-5743cabdef1e")
    private SmDependency eventDefinitionsDep;

    @objid ("ed5e5db0-2fe8-4a21-9a35-d241919571ab")
    public BpmnEventSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("b69c1185-e946-4da1-a125-30e70725d6d2")
    @Override
    public String getName() {
        return "BpmnEvent";
    }

    @objid ("f620c35d-36f3-4255-96d9-0e1787a3b81e")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("59a88dcb-3ae3-4e0f-b81e-136f05aec21a")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnEvent.class;
    }

    @objid ("029ec522-7efa-4f65-b20f-a9f0dabddc76")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("9dee0668-ff5c-499c-8cb5-b5a3f414b300")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("ae1d7988-e04c-4ee8-b589-2c7698e2be2f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnFlowNode");
        this.registerFactory(new BpmnEventObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.eventDefinitionsDep = new EventDefinitionsSmDependency();
        this.eventDefinitionsDep.init("EventDefinitions", this, metamodel.getMClass("BpmnEventDefinition"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.eventDefinitionsDep);
    }

    @objid ("ad2d93a8-aab8-49cd-b33f-0de8ef43f268")
    public SmDependency getEventDefinitionsDep() {
        if (this.eventDefinitionsDep == null) {
        	this.eventDefinitionsDep = this.getDependencyDef("EventDefinitions");
        }
        return this.eventDefinitionsDep;
    }

    @objid ("e7e3cf6f-48f0-4c0f-9689-06feb0b3e1d7")
    private static class BpmnEventObjectFactory implements ISmObjectFactory {
        @objid ("bd94f233-edf5-406b-9339-7662715c74ef")
        private BpmnEventSmClass smClass;

        @objid ("98ff376c-d2b6-4879-aea9-cdd22550c573")
        public BpmnEventObjectFactory(BpmnEventSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("e92b7161-c44f-4bfc-b6d1-189e3932ba9e")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("8f4d09f3-debb-4c9b-a8f4-b592a5bd3024")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("245ab7a1-f2f6-46ce-a2d2-8cabd1a95a7f")
    public static class EventDefinitionsSmDependency extends SmMultipleDependency {
        @objid ("e75b4ef1-89eb-422b-863f-0ffd6f32f8e7")
        private SmDependency symetricDep;

        @objid ("00cca89d-a657-4bbd-acd5-13548093d1ee")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnEventData)data).mEventDefinitions != null)? ((BpmnEventData)data).mEventDefinitions:SmMultipleDependency.EMPTY;
        }

        @objid ("6b8c0ccf-5249-4c0f-ad17-cb57afb0c178")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnEventData) data).mEventDefinitions = values;
        }

        @objid ("5f888637-c2f8-4b5f-8f3f-cee9b820b041")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnEventDefinitionSmClass)this.getTarget()).getDefinedDep();
            }
            return this.symetricDep;
        }

    }

}
