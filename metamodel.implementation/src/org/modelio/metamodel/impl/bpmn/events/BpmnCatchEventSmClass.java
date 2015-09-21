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
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataAssociationSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataOutputSmClass;
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
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("ceb33b5e-17bc-4df5-a2f8-26a0da3670c6")
public class BpmnCatchEventSmClass extends BpmnEventSmClass {
    @objid ("5642efb0-e83e-4a08-9d45-e1ab6d626782")
    private SmAttribute parallelMultipleAtt;

    @objid ("b6061b56-90a0-4301-928b-c77e8413a99a")
    private SmDependency dataOutputAssociationDep;

    @objid ("9a8162c1-fd88-49af-9179-cb26f3824359")
    private SmDependency dataOutputDep;

    @objid ("4ed77cda-e091-4774-b267-ccb6937ba310")
    public BpmnCatchEventSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("0115152a-b914-486c-ab59-be9a1321df75")
    @Override
    public String getName() {
        return "BpmnCatchEvent";
    }

    @objid ("28b6bf46-d3fb-4788-938a-4610faa1e1a1")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("79c612f6-7376-4a6f-ba25-41f04b383be0")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnCatchEvent.class;
    }

    @objid ("50ee6524-94a5-4959-92c6-dea4aab61e38")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("450bd028-dcf2-403d-8e91-f112c08f7c20")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("1f6e1194-2fad-4ffd-b65f-d75ca9dcf2cd")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnEvent");
        this.registerFactory(new BpmnCatchEventObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.parallelMultipleAtt = new ParallelMultipleSmAttribute();
        this.parallelMultipleAtt.init("ParallelMultiple", this, Boolean.class );
        registerAttribute(this.parallelMultipleAtt);
        
        
        // Initialize and register the SmDependency
        this.dataOutputAssociationDep = new DataOutputAssociationSmDependency();
        this.dataOutputAssociationDep.init("DataOutputAssociation", this, metamodel.getMClass("BpmnDataAssociation"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.dataOutputAssociationDep);
        
        this.dataOutputDep = new DataOutputSmDependency();
        this.dataOutputDep.init("DataOutput", this, metamodel.getMClass("BpmnDataOutput"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.dataOutputDep);
    }

    @objid ("acd3c34e-6f94-4bb9-8f7a-3513b3ddc2ef")
    public SmAttribute getParallelMultipleAtt() {
        if (this.parallelMultipleAtt == null) {
        	this.parallelMultipleAtt = this.getAttributeDef("ParallelMultiple");
        }
        return this.parallelMultipleAtt;
    }

    @objid ("c072aa32-acc9-4234-a1d7-557c5f95f3f3")
    public SmDependency getDataOutputAssociationDep() {
        if (this.dataOutputAssociationDep == null) {
        	this.dataOutputAssociationDep = this.getDependencyDef("DataOutputAssociation");
        }
        return this.dataOutputAssociationDep;
    }

    @objid ("c63ba0c1-5ff5-4b65-ac2d-73f12474fb37")
    public SmDependency getDataOutputDep() {
        if (this.dataOutputDep == null) {
        	this.dataOutputDep = this.getDependencyDef("DataOutput");
        }
        return this.dataOutputDep;
    }

    @objid ("fcd95353-5b08-49fb-89e4-352fd9643e39")
    private static class BpmnCatchEventObjectFactory implements ISmObjectFactory {
        @objid ("d47f400b-e11d-44f8-8b71-2d094679c87f")
        private BpmnCatchEventSmClass smClass;

        @objid ("df2a19aa-0046-427e-b3e2-0375925c7fb9")
        public BpmnCatchEventObjectFactory(BpmnCatchEventSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("66e54637-bf9c-4fe5-8dc7-fe3cac4669cb")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("26d401b1-510c-4364-99d9-eeb3c9082818")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("18151cd0-11ef-4db9-b0db-cadb0b3836cd")
    public static class ParallelMultipleSmAttribute extends SmAttribute {
        @objid ("9e4482d9-1d67-40d0-baf4-50ac5b021a2f")
        public Object getValue(ISmObjectData data) {
            return ((BpmnCatchEventData) data).mParallelMultiple;
        }

        @objid ("89b79b57-5e0f-435b-8802-0e83f2341c95")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnCatchEventData) data).mParallelMultiple = value;
        }

    }

    @objid ("01945d62-90a1-4f15-b982-b74462467db7")
    public static class DataOutputAssociationSmDependency extends SmMultipleDependency {
        @objid ("df496f54-877d-4d13-9139-1f0765d8d3b9")
        private SmDependency symetricDep;

        @objid ("f1ff3ec3-20c6-4c5e-884b-26bcf0e13e35")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnCatchEventData)data).mDataOutputAssociation != null)? ((BpmnCatchEventData)data).mDataOutputAssociation:SmMultipleDependency.EMPTY;
        }

        @objid ("d9ea0aa4-81e1-4ece-a161-ed50a4c8fa77")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnCatchEventData) data).mDataOutputAssociation = values;
        }

        @objid ("c529bdf6-7236-4846-aa41-659f3269734e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataAssociationSmClass)this.getTarget()).getEndingEventDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e4bf7041-cbff-49fc-9c78-fa5b8743194e")
    public static class DataOutputSmDependency extends SmSingleDependency {
        @objid ("31ad8f84-f3f5-42cd-87ff-58d21cf7fa00")
        private SmDependency symetricDep;

        @objid ("e9326b24-1d5c-41d5-b69a-c44a829d27b6")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnCatchEventData) data).mDataOutput;
        }

        @objid ("41fcf6e2-78be-4712-b1f0-c5de8bbc05b6")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnCatchEventData) data).mDataOutput = value;
        }

        @objid ("b2713388-02d2-49f9-b04d-0c1bd74d2595")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataOutputSmClass)this.getTarget()).getCatchedDep();
            }
            return this.symetricDep;
        }

    }

}
