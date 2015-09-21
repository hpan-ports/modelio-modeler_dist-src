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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExpansionNodeSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.StructuredActivityNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionKind;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("fa02fd4e-8957-4742-9fbc-785a02b815fc")
public class ExpansionRegionSmClass extends StructuredActivityNodeSmClass {
    @objid ("3a6f1e7c-97c3-4a0b-b6f8-3d3de512492f")
    private SmAttribute modeAtt;

    @objid ("2886ca63-38d8-4baa-bc8d-44fc6925716f")
    private SmDependency outputElementDep;

    @objid ("388a63fd-d03e-461c-bfda-f47fc170422b")
    private SmDependency inputElementDep;

    @objid ("08a3bd4a-b554-416c-b6b3-12af608a4f06")
    public ExpansionRegionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("91c5fbab-2c7d-4a48-9acd-d08e7bdf1463")
    @Override
    public String getName() {
        return "ExpansionRegion";
    }

    @objid ("f540e288-c5df-4f7c-8dfa-9b904fc4f60f")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("1f3d619e-b221-4135-9b72-aa0d69622827")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ExpansionRegion.class;
    }

    @objid ("90fe4e41-d032-45d2-ab7b-348f9f976c97")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("20688f86-e2dd-4467-8757-00bc84ea5b46")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("8870215c-900e-4d79-bd30-c8c2512b85fe")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StructuredActivityNode");
        this.registerFactory(new ExpansionRegionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.modeAtt = new ModeSmAttribute();
        this.modeAtt.init("Mode", this, ExpansionKind.class );
        registerAttribute(this.modeAtt);
        
        
        // Initialize and register the SmDependency
        this.outputElementDep = new OutputElementSmDependency();
        this.outputElementDep.init("OutputElement", this, metamodel.getMClass("ExpansionNode"), 0, -1 , SmDirective.SMCDCOMPONENT, SmDirective.SMCDPARTOF);
        registerDependency(this.outputElementDep);
        
        this.inputElementDep = new InputElementSmDependency();
        this.inputElementDep.init("InputElement", this, metamodel.getMClass("ExpansionNode"), 1, -1 , SmDirective.SMCDCOMPONENT, SmDirective.SMCDPARTOF);
        registerDependency(this.inputElementDep);
    }

    @objid ("89f76e4d-e3b2-4ec8-b94b-bf787a50b347")
    public SmAttribute getModeAtt() {
        if (this.modeAtt == null) {
        	this.modeAtt = this.getAttributeDef("Mode");
        }
        return this.modeAtt;
    }

    @objid ("5be22bad-4295-4c4b-a106-fe0407d7f7cf")
    public SmDependency getOutputElementDep() {
        if (this.outputElementDep == null) {
        	this.outputElementDep = this.getDependencyDef("OutputElement");
        }
        return this.outputElementDep;
    }

    @objid ("d709d4e8-c62d-4fed-b13f-eace6e753444")
    public SmDependency getInputElementDep() {
        if (this.inputElementDep == null) {
        	this.inputElementDep = this.getDependencyDef("InputElement");
        }
        return this.inputElementDep;
    }

    @objid ("36821039-abf5-471f-a5ae-b9c380cf171b")
    private static class ExpansionRegionObjectFactory implements ISmObjectFactory {
        @objid ("35fe6d7d-c721-412c-b324-2f45d70ecd75")
        private ExpansionRegionSmClass smClass;

        @objid ("87c13b3f-142d-4808-8e32-827e533e49de")
        public ExpansionRegionObjectFactory(ExpansionRegionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("d6a0336b-1adc-4d22-b65d-8393e7957945")
        @Override
        public ISmObjectData createData() {
            return new ExpansionRegionData(this.smClass);
        }

        @objid ("27797ee6-ece3-4e03-8571-63c2fc2a8a57")
        @Override
        public SmObjectImpl createImpl() {
            return new ExpansionRegionImpl();
        }

    }

    @objid ("4d08dadf-c899-4dc3-b518-907b0e30eab0")
    public static class ModeSmAttribute extends SmAttribute {
        @objid ("250a924e-9968-40db-bca6-af6e0c7e679c")
        public Object getValue(ISmObjectData data) {
            return ((ExpansionRegionData) data).mMode;
        }

        @objid ("366643af-c1a2-4626-b0a5-58df7712858c")
        public void setValue(ISmObjectData data, Object value) {
            ((ExpansionRegionData) data).mMode = value;
        }

    }

    @objid ("a70a2d22-c603-4130-9cfd-5db14f4ed5f2")
    public static class OutputElementSmDependency extends SmMultipleDependency {
        @objid ("96bf3519-455c-446a-9e87-2af7212e64f1")
        private SmDependency symetricDep;

        @objid ("ea662dc0-1a10-49e0-898b-6f17c37cfadc")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ExpansionRegionData)data).mOutputElement != null)? ((ExpansionRegionData)data).mOutputElement:SmMultipleDependency.EMPTY;
        }

        @objid ("e9126241-971a-4bcc-b89b-c53df362755f")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ExpansionRegionData) data).mOutputElement = values;
        }

        @objid ("458f8f0b-3d28-4fdd-9044-90c06d41f9c8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExpansionNodeSmClass)this.getTarget()).getRegionAsOutputDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("cc05fd39-f469-40f4-98dc-29739728b4e2")
    public static class InputElementSmDependency extends SmMultipleDependency {
        @objid ("ea448afd-4ed3-414b-a13f-51eb54427ab1")
        private SmDependency symetricDep;

        @objid ("653e0ac4-b7a6-40e2-9e0e-886fd8ee5755")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ExpansionRegionData)data).mInputElement != null)? ((ExpansionRegionData)data).mInputElement:SmMultipleDependency.EMPTY;
        }

        @objid ("324c3885-df8b-4294-b865-d63056ee193a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ExpansionRegionData) data).mInputElement = values;
        }

        @objid ("8e7396ab-01d0-418d-bbee-445871c5db12")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExpansionNodeSmClass)this.getTarget()).getRegionAsInputDep();
            }
            return this.symetricDep;
        }

    }

}
