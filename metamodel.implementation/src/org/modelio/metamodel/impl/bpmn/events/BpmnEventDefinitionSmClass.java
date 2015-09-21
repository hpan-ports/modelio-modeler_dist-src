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
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.impl.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsSmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
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

@objid ("38d2f50c-e36d-499e-9001-50707f981eb7")
public class BpmnEventDefinitionSmClass extends BpmnBaseElementSmClass {
    @objid ("8ebb1535-df0b-4e55-b8fd-d3b6a7abddff")
    private SmDependency definedDep;

    @objid ("1d1b4d8e-4231-4686-a2b6-a10422fb76c0")
    private SmDependency loopRefDep;

    @objid ("2394037f-de7d-490c-af37-ef47bf81f3e7")
    public BpmnEventDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("3a412c2a-6917-4bb5-8945-feb17358af13")
    @Override
    public String getName() {
        return "BpmnEventDefinition";
    }

    @objid ("300044d8-0b7a-4632-87f1-765d007d3de2")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("f74418ef-5f21-44ac-b09c-ce8908b48b66")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnEventDefinition.class;
    }

    @objid ("010e5765-9fe3-49cf-87c8-47a984721dc3")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("1d6f746a-912c-49f3-a342-ff1f55a0ccbf")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("45b6139b-6648-426b-9e2b-c4390f7130fb")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnEventDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.definedDep = new DefinedSmDependency();
        this.definedDep.init("Defined", this, metamodel.getMClass("BpmnEvent"), 0, 1 );
        registerDependency(this.definedDep);
        
        this.loopRefDep = new LoopRefSmDependency();
        this.loopRefDep.init("LoopRef", this, metamodel.getMClass("BpmnMultiInstanceLoopCharacteristics"), 0, -1 );
        registerDependency(this.loopRefDep);
    }

    @objid ("c3d20524-a586-4dd0-8ff6-dc0fa89b87be")
    public SmDependency getDefinedDep() {
        if (this.definedDep == null) {
        	this.definedDep = this.getDependencyDef("Defined");
        }
        return this.definedDep;
    }

    @objid ("4a5b68de-8ded-4bc2-af7a-23b5a8bf138c")
    public SmDependency getLoopRefDep() {
        if (this.loopRefDep == null) {
        	this.loopRefDep = this.getDependencyDef("LoopRef");
        }
        return this.loopRefDep;
    }

    @objid ("cae753c8-4130-495c-bfc6-c70098dc52bd")
    private static class BpmnEventDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("648d9cc7-d5c2-456f-a8cf-acfeb9c6f599")
        private BpmnEventDefinitionSmClass smClass;

        @objid ("c38fdb30-472c-4ba0-8dd9-d0ffea767b1a")
        public BpmnEventDefinitionObjectFactory(BpmnEventDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("6e5581d8-607c-43af-9987-da0f4df5bb11")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("87d7eb0f-a6fc-4609-baaf-9314a8577fb7")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("441cc036-dc89-4899-85dd-702d00674ec3")
    public static class DefinedSmDependency extends SmSingleDependency {
        @objid ("fc99c469-60b3-4b65-b07e-f8a255b41a18")
        private SmDependency symetricDep;

        @objid ("9ce84fe7-5f0a-47a4-bd7f-fc33616c679a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnEventDefinitionData) data).mDefined;
        }

        @objid ("c36fe736-ad99-4fee-9534-6d4f239b9e4b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnEventDefinitionData) data).mDefined = value;
        }

        @objid ("6e189038-b1ec-44f7-abf2-ab07399a4783")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnEventSmClass)this.getTarget()).getEventDefinitionsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e2c1e1a4-e7ef-43a2-9233-75587e2e8a45")
    public static class LoopRefSmDependency extends SmMultipleDependency {
        @objid ("e4e4cb88-aa4e-4d05-bf78-7cb8164dffec")
        private SmDependency symetricDep;

        @objid ("181160b3-1b44-489c-90ef-0dd1ebbd7156")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnEventDefinitionData)data).mLoopRef != null)? ((BpmnEventDefinitionData)data).mLoopRef:SmMultipleDependency.EMPTY;
        }

        @objid ("b7abac3b-efc7-4e60-a270-7538302b75d0")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnEventDefinitionData) data).mLoopRef = values;
        }

        @objid ("4dd61bd2-6fb2-41e2-89ea-454da3f3f902")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMultiInstanceLoopCharacteristicsSmClass)this.getTarget()).getCompletionEventRefDep();
            }
            return this.symetricDep;
        }

    }

}
