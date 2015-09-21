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
import org.modelio.metamodel.bpmn.gateways.BpmnExclusiveGateway;
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

@objid ("74ebbbc4-d063-450d-bcd0-a747eb364dff")
public class BpmnExclusiveGatewaySmClass extends BpmnGatewaySmClass {
    @objid ("8391953e-ecd0-4b7e-8c5d-0f1dfbfd628b")
    private SmDependency defaultFlowDep;

    @objid ("ca8472f1-b177-4021-b94c-a84de027343a")
    public BpmnExclusiveGatewaySmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("235f808d-80e1-4ac1-be3a-733176a877e8")
    @Override
    public String getName() {
        return "BpmnExclusiveGateway";
    }

    @objid ("c1d2d5d5-faa7-466d-93aa-39ca98f9630b")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("5927e872-8587-4113-b977-fd8d1326ea86")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnExclusiveGateway.class;
    }

    @objid ("f043478d-169b-4d12-8ab9-b20518e394ed")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("99e645a9-5b89-4b3d-a144-ce9acbb0c762")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("0b71916a-ceab-4aa3-bc8d-0423e432f40b")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnGateway");
        this.registerFactory(new BpmnExclusiveGatewayObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.defaultFlowDep = new DefaultFlowSmDependency();
        this.defaultFlowDep.init("DefaultFlow", this, metamodel.getMClass("BpmnSequenceFlow"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.defaultFlowDep);
    }

    @objid ("b2418733-762e-4134-a5fc-25e68c904dcf")
    public SmDependency getDefaultFlowDep() {
        if (this.defaultFlowDep == null) {
        	this.defaultFlowDep = this.getDependencyDef("DefaultFlow");
        }
        return this.defaultFlowDep;
    }

    @objid ("963ae2fd-3bfa-4c9c-8657-19c9ab206436")
    private static class BpmnExclusiveGatewayObjectFactory implements ISmObjectFactory {
        @objid ("232224e3-dc4e-4a77-a21d-e4b9c9fbb703")
        private BpmnExclusiveGatewaySmClass smClass;

        @objid ("0333a968-7fee-4b92-ba32-c91add1429ca")
        public BpmnExclusiveGatewayObjectFactory(BpmnExclusiveGatewaySmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4d7f5146-c735-49d9-9fe4-a7b608880179")
        @Override
        public ISmObjectData createData() {
            return new BpmnExclusiveGatewayData(this.smClass);
        }

        @objid ("efccb5de-4668-4e73-80a5-f0964a9a4bc1")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnExclusiveGatewayImpl();
        }

    }

    @objid ("cf634e08-bce5-435d-81b2-b32a439f4cce")
    public static class DefaultFlowSmDependency extends SmSingleDependency {
        @objid ("bf0a1c69-f1f5-4001-8b9e-e62f4a328927")
        private SmDependency symetricDep;

        @objid ("17d988b3-f4ec-466d-8527-506f7eb38bec")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnExclusiveGatewayData) data).mDefaultFlow;
        }

        @objid ("0628d760-7b02-4372-ae41-934d3fedd118")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnExclusiveGatewayData) data).mDefaultFlow = value;
        }

        @objid ("db48086f-89d7-454a-b7b2-a4d0a3a42873")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSequenceFlowSmClass)this.getTarget()).getDefaultOfExclusiveDep();
            }
            return this.symetricDep;
        }

    }

}
