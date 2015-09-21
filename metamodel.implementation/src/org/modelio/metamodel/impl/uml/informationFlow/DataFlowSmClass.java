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
package org.modelio.metamodel.impl.uml.informationFlow;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.SignalSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
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

@objid ("5e287ca6-25cf-4a81-bd76-c3652252c3ae")
public class DataFlowSmClass extends ModelElementSmClass {
    @objid ("da2a1aae-3fb9-492b-a0be-2fc8165a4694")
    private SmDependency destinationDep;

    @objid ("8ec7d9dc-60cd-4236-b4b3-5b223c7b1714")
    private SmDependency originDep;

    @objid ("316a6b1f-d285-438d-9fff-69db8a1733f6")
    private SmDependency ownerDep;

    @objid ("8b429e1a-0fca-46a9-aa4e-bb6e40e5a2cb")
    private SmDependency sModelDep;

    @objid ("aadeb362-9847-41b0-b4e5-5bf7c2b7d31e")
    public DataFlowSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("0c9ddbf6-d126-4688-96c8-ca32611ae3c2")
    @Override
    public String getName() {
        return "DataFlow";
    }

    @objid ("624fffad-4b0d-41da-9ac0-4f17391753f3")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("223a78c2-e856-4cbc-aded-2b25b42f5e26")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return DataFlow.class;
    }

    @objid ("f1f043ff-3f9a-42c4-bf0f-9d5696cd2154")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("f5b60150-6715-4409-b4c7-ba9536fbcc39")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("2baab561-8f40-40ef-b314-f7525a95e7d2")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new DataFlowObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.destinationDep = new DestinationSmDependency();
        this.destinationDep.init("Destination", this, metamodel.getMClass("NameSpace"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.destinationDep);
        
        this.originDep = new OriginSmDependency();
        this.originDep.init("Origin", this, metamodel.getMClass("NameSpace"), 0, 1 );
        registerDependency(this.originDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("NameSpace"), 1, 1 );
        registerDependency(this.ownerDep);
        
        this.sModelDep = new SModelSmDependency();
        this.sModelDep.init("SModel", this, metamodel.getMClass("Signal"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.sModelDep);
    }

    @objid ("ad34a68f-9dcb-4b06-832a-edea695152c2")
    public SmDependency getDestinationDep() {
        if (this.destinationDep == null) {
        	this.destinationDep = this.getDependencyDef("Destination");
        }
        return this.destinationDep;
    }

    @objid ("d4ab33e4-d7b2-483f-8700-8cc0e42f346b")
    public SmDependency getOriginDep() {
        if (this.originDep == null) {
        	this.originDep = this.getDependencyDef("Origin");
        }
        return this.originDep;
    }

    @objid ("bfbd9055-9706-4d91-a4fe-b0a941021955")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("e4e2840c-66b3-448a-8508-7b12a4778069")
    public SmDependency getSModelDep() {
        if (this.sModelDep == null) {
        	this.sModelDep = this.getDependencyDef("SModel");
        }
        return this.sModelDep;
    }

    @objid ("513f6af2-6bdf-4195-bb82-0b7860b8a921")
    private static class DataFlowObjectFactory implements ISmObjectFactory {
        @objid ("ca976936-8d14-4935-b6a1-1ffe8ea0c952")
        private DataFlowSmClass smClass;

        @objid ("c3a604c6-c7d4-46a6-9882-8ec3824224b5")
        public DataFlowObjectFactory(DataFlowSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("8acd5786-ba76-4b47-842d-5063c9d8a7be")
        @Override
        public ISmObjectData createData() {
            return new DataFlowData(this.smClass);
        }

        @objid ("e9df36bf-ed93-442f-aec6-879d10dd955e")
        @Override
        public SmObjectImpl createImpl() {
            return new DataFlowImpl();
        }

    }

    @objid ("d20e6540-dde5-4de5-a748-91d6c4d0235e")
    public static class DestinationSmDependency extends SmSingleDependency {
        @objid ("0c5873bf-e971-41b3-9e44-c5ff80f9d225")
        private SmDependency symetricDep;

        @objid ("c405fc00-5ab0-4bce-9c84-fd37dbd21a18")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((DataFlowData) data).mDestination;
        }

        @objid ("40d5cf7b-ef57-4eb2-8a44-c4aa12803b48")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((DataFlowData) data).mDestination = value;
        }

        @objid ("84fbb0a7-c831-4670-9262-f5446bb74acc")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getReceivedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("acf322e1-909d-4e34-b1f0-4d589472f8d1")
    public static class OriginSmDependency extends SmSingleDependency {
        @objid ("b553df89-cd44-4639-8121-fb3c84890f30")
        private SmDependency symetricDep;

        @objid ("996c1991-1572-4ad8-9b39-911e05f484d5")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((DataFlowData) data).mOrigin;
        }

        @objid ("f818c897-e5be-48b4-bced-f8da78f47000")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((DataFlowData) data).mOrigin = value;
        }

        @objid ("2130db3b-8053-4690-ad0e-fb8ad0025c1a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getSentDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("05003e7b-3b96-4de7-8a6d-1410748fd27b")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("ecc232d1-9c1d-4759-b690-cd6646dd1bcc")
        private SmDependency symetricDep;

        @objid ("f540e1dc-be97-42c9-9a2a-beb228bd8697")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((DataFlowData) data).mOwner;
        }

        @objid ("e1219582-e517-4e3a-89ab-c03a6de1dd71")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((DataFlowData) data).mOwner = value;
        }

        @objid ("bd1b7698-0a25-4d51-8337-a816b3448327")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getOwnedDataFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4d948a65-bc37-4d34-bc96-ad3e0e91b58b")
    public static class SModelSmDependency extends SmSingleDependency {
        @objid ("823c83dc-58b1-4679-98e3-2f3b47339dad")
        private SmDependency symetricDep;

        @objid ("b591174c-530d-43ae-8776-c9726ce0b788")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((DataFlowData) data).mSModel;
        }

        @objid ("760fb0af-e01d-4b9d-a8d4-a61177b1be3e")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((DataFlowData) data).mSModel = value;
        }

        @objid ("50c3e725-1e18-4f01-8a61-6983c018cf29")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((SignalSmClass)this.getTarget()).getDOccurenceDep();
            }
            return this.symetricDep;
        }

    }

}
