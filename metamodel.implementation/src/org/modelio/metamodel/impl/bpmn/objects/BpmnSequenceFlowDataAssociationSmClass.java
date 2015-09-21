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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.impl.bpmn.flows.BpmnSequenceFlowSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataAssociationSmClass;
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

@objid ("1be2fce9-1ef8-4ede-bafa-7464c144738d")
public class BpmnSequenceFlowDataAssociationSmClass extends BpmnBaseElementSmClass {
    @objid ("524b7e8b-63d3-40ed-aa77-afbcc06f8c76")
    private SmDependency connectedDep;

    @objid ("3eb28b47-2cc6-4e40-9cbb-94989a855e24")
    private SmDependency dataAssociationDep;

    @objid ("3c466859-c5df-484b-a319-55d82b029ff1")
    public BpmnSequenceFlowDataAssociationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("274fc08e-0597-4326-a60a-a945b9bf9ff0")
    @Override
    public String getName() {
        return "BpmnSequenceFlowDataAssociation";
    }

    @objid ("d2a8bd23-8983-41e7-8bc8-c6156eb822b6")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("6f584d99-7d77-430e-9efd-c56f6a45f0ef")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnSequenceFlowDataAssociation.class;
    }

    @objid ("e14b83ce-4f89-4fdb-97b6-f36385f34542")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("003723a8-2e5e-4a40-aea6-8043abc3ef00")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("e1d09bcf-a008-4417-8713-8dc325860b5b")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnSequenceFlowDataAssociationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.connectedDep = new ConnectedSmDependency();
        this.connectedDep.init("Connected", this, metamodel.getMClass("BpmnSequenceFlow"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.connectedDep);
        
        this.dataAssociationDep = new DataAssociationSmDependency();
        this.dataAssociationDep.init("DataAssociation", this, metamodel.getMClass("BpmnDataAssociation"), 2, 2 , SmDirective.SMCDPARTOF);
        registerDependency(this.dataAssociationDep);
    }

    @objid ("776177ea-4b59-4cc4-a3e1-f4d9aa51e7d1")
    public SmDependency getConnectedDep() {
        if (this.connectedDep == null) {
        	this.connectedDep = this.getDependencyDef("Connected");
        }
        return this.connectedDep;
    }

    @objid ("567505d3-d49f-47d2-8bb1-b97489223605")
    public SmDependency getDataAssociationDep() {
        if (this.dataAssociationDep == null) {
        	this.dataAssociationDep = this.getDependencyDef("DataAssociation");
        }
        return this.dataAssociationDep;
    }

    @objid ("45ab91b2-a865-4535-a82e-29aff710b875")
    private static class BpmnSequenceFlowDataAssociationObjectFactory implements ISmObjectFactory {
        @objid ("dcfed23d-fe65-4e8a-bfd5-dde13f5416c8")
        private BpmnSequenceFlowDataAssociationSmClass smClass;

        @objid ("8596dca4-602a-4f08-aaf1-74e20ad1011f")
        public BpmnSequenceFlowDataAssociationObjectFactory(BpmnSequenceFlowDataAssociationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("744d3280-7b0d-491e-bb35-b2459ec578c7")
        @Override
        public ISmObjectData createData() {
            return new BpmnSequenceFlowDataAssociationData(this.smClass);
        }

        @objid ("f0804ea4-67a2-48c1-afe6-416ac3e91d78")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnSequenceFlowDataAssociationImpl();
        }

    }

    @objid ("3a45643b-b6af-45f0-be44-9e2f06936122")
    public static class ConnectedSmDependency extends SmSingleDependency {
        @objid ("bf8b5204-1b84-4257-a6b1-8f8aa593a5b8")
        private SmDependency symetricDep;

        @objid ("54631cfe-cbb2-4ab5-9c9f-a0ecd7f004c7")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnSequenceFlowDataAssociationData) data).mConnected;
        }

        @objid ("fdf3474e-d3e0-4795-be28-238225532be0")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnSequenceFlowDataAssociationData) data).mConnected = value;
        }

        @objid ("213ea0db-c33c-40e4-9219-4dc1f48b8211")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSequenceFlowSmClass)this.getTarget()).getConnectorDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a0a8d67d-fd54-4179-b473-47f5148c28b3")
    public static class DataAssociationSmDependency extends SmMultipleDependency {
        @objid ("71a880f0-4d9d-4f14-bc59-ccfbb33c0b1f")
        private SmDependency symetricDep;

        @objid ("5da66968-2600-46c0-b66d-65031490b3c1")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnSequenceFlowDataAssociationData)data).mDataAssociation != null)? ((BpmnSequenceFlowDataAssociationData)data).mDataAssociation:SmMultipleDependency.EMPTY;
        }

        @objid ("041f745e-8fd7-461c-9a8a-fafe800daa26")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnSequenceFlowDataAssociationData) data).mDataAssociation = values;
        }

        @objid ("03b4c181-2c1f-4ae2-825a-f3b3a7ed9e8c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataAssociationSmClass)this.getTarget()).getVisualShortCutDep();
            }
            return this.symetricDep;
        }

    }

}
