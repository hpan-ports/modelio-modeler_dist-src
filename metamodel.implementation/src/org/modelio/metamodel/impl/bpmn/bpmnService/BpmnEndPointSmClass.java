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
package org.modelio.metamodel.impl.bpmn.bpmnService;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnService.BpmnEndPoint;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnParticipantSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementSmClass;
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

@objid ("cda66a80-ee68-4580-a0eb-53130d952aaa")
public class BpmnEndPointSmClass extends BpmnRootElementSmClass {
    @objid ("0ec903e9-109a-4ca0-8b5b-f161b17e349a")
    private SmDependency participantRefsDep;

    @objid ("ee5db5d1-d4e9-4b6d-b75d-87abe77ba68c")
    public BpmnEndPointSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("a6b0d66c-ed49-4757-baf3-d2aa6c43622b")
    @Override
    public String getName() {
        return "BpmnEndPoint";
    }

    @objid ("387913b2-2995-4ced-8824-06a41bd69000")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("0b4f1530-4dd2-40ee-91e6-34f9ceb0de8c")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnEndPoint.class;
    }

    @objid ("8c2cfe96-7c93-4b0a-b290-d9c2861c93dd")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("31511b45-be0a-4b88-9757-0c008771e7fd")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("cd30d132-d85e-4d26-9fb6-51b826c13da0")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnRootElement");
        this.registerFactory(new BpmnEndPointObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.participantRefsDep = new ParticipantRefsSmDependency();
        this.participantRefsDep.init("ParticipantRefs", this, metamodel.getMClass("BpmnParticipant"), 0, -1 );
        registerDependency(this.participantRefsDep);
    }

    @objid ("04789bc3-8652-41d3-802b-b0558e1fb228")
    public SmDependency getParticipantRefsDep() {
        if (this.participantRefsDep == null) {
        	this.participantRefsDep = this.getDependencyDef("ParticipantRefs");
        }
        return this.participantRefsDep;
    }

    @objid ("4cc795e1-74e6-47ca-8435-7390c8e0cfe4")
    private static class BpmnEndPointObjectFactory implements ISmObjectFactory {
        @objid ("2ddbe220-aee4-455a-8da1-db5a89d157af")
        private BpmnEndPointSmClass smClass;

        @objid ("549d54f6-9cbd-42f1-9f58-409e703938f2")
        public BpmnEndPointObjectFactory(BpmnEndPointSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("7848b6cd-1c20-44b5-ac24-14c8ca9f5d2c")
        @Override
        public ISmObjectData createData() {
            return new BpmnEndPointData(this.smClass);
        }

        @objid ("e03e0193-26e8-42c3-8fda-8373817ef92c")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnEndPointImpl();
        }

    }

    @objid ("492ce6b2-27b6-45d4-8ca1-04dcff1ecaa6")
    public static class ParticipantRefsSmDependency extends SmMultipleDependency {
        @objid ("dbda83b1-97bb-4280-80d9-b50ba5399c53")
        private SmDependency symetricDep;

        @objid ("d454ffc4-b384-4d4d-83e1-5eb5a85d4533")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnEndPointData)data).mParticipantRefs != null)? ((BpmnEndPointData)data).mParticipantRefs:SmMultipleDependency.EMPTY;
        }

        @objid ("d3b5f2f1-09b3-4d25-a159-de6119f808ae")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnEndPointData) data).mParticipantRefs = values;
        }

        @objid ("1c53713b-694a-4a6f-abe6-991b74a67fcf")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnParticipantSmClass)this.getTarget()).getEndPointRefsDep();
            }
            return this.symetricDep;
        }

    }

}
