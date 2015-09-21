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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSubProcessSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnLaneSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnProcessSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnGroupSmClass;
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

@objid ("0fb485f4-fbfb-45e4-abbf-71abd33d6804")
public class BpmnFlowElementSmClass extends BpmnBaseElementSmClass {
    @objid ("57779104-3cdf-4209-9152-f4437714013d")
    private SmDependency groupsDep;

    @objid ("b5e3adc0-345a-44d3-bb40-7bbcadab31a5")
    private SmDependency subProcessDep;

    @objid ("bb1b8e1f-ac60-439e-873c-31ce0fe110c3")
    private SmDependency laneDep;

    @objid ("7c5db9c2-bc23-4189-9e5a-a5e6806f6a59")
    private SmDependency containerDep;

    @objid ("72de674d-3f48-453a-a1c3-542cdb29d73f")
    public BpmnFlowElementSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("229deebf-8c72-47ac-9e9e-21949f781766")
    @Override
    public String getName() {
        return "BpmnFlowElement";
    }

    @objid ("f17fca63-e531-44df-9289-f09cb69e0db6")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("78b8246b-a04b-442f-be0c-eaea707f0f72")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnFlowElement.class;
    }

    @objid ("ea8ec611-2663-48d6-bfc7-b9dc1b2079ae")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("f503bfd8-b053-4fbe-b2a8-923dba96bc4c")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("e53654ec-7eb4-4c9c-8058-eb60de066c3d")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnFlowElementObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.groupsDep = new GroupsSmDependency();
        this.groupsDep.init("Groups", this, metamodel.getMClass("BpmnGroup"), 0, -1 );
        registerDependency(this.groupsDep);
        
        this.subProcessDep = new SubProcessSmDependency();
        this.subProcessDep.init("SubProcess", this, metamodel.getMClass("BpmnSubProcess"), 0, 1 );
        registerDependency(this.subProcessDep);
        
        this.laneDep = new LaneSmDependency();
        this.laneDep.init("Lane", this, metamodel.getMClass("BpmnLane"), 0, -1 );
        registerDependency(this.laneDep);
        
        this.containerDep = new ContainerSmDependency();
        this.containerDep.init("Container", this, metamodel.getMClass("BpmnProcess"), 0, 1 );
        registerDependency(this.containerDep);
    }

    @objid ("a9e7beec-421b-4bb8-892b-5bcbefc650f5")
    public SmDependency getGroupsDep() {
        if (this.groupsDep == null) {
        	this.groupsDep = this.getDependencyDef("Groups");
        }
        return this.groupsDep;
    }

    @objid ("66fd96b8-4e0f-435e-a42d-0905cd6f5810")
    public SmDependency getSubProcessDep() {
        if (this.subProcessDep == null) {
        	this.subProcessDep = this.getDependencyDef("SubProcess");
        }
        return this.subProcessDep;
    }

    @objid ("125918ce-9e92-4ffb-93f7-fdba0c0868f3")
    public SmDependency getLaneDep() {
        if (this.laneDep == null) {
        	this.laneDep = this.getDependencyDef("Lane");
        }
        return this.laneDep;
    }

    @objid ("770bd45d-f7a3-43cf-b1d8-6e8040272183")
    public SmDependency getContainerDep() {
        if (this.containerDep == null) {
        	this.containerDep = this.getDependencyDef("Container");
        }
        return this.containerDep;
    }

    @objid ("c024f144-6aa6-4099-a137-72bd3e436948")
    private static class BpmnFlowElementObjectFactory implements ISmObjectFactory {
        @objid ("9cc2b37d-b064-42fe-8183-e144d03a8d0f")
        private BpmnFlowElementSmClass smClass;

        @objid ("801cb3ac-c15a-46ce-bfb0-14abbf8d0382")
        public BpmnFlowElementObjectFactory(BpmnFlowElementSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("7accd48a-733c-483b-826b-53eb488cce0f")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("36901f20-cc82-4f89-9bbb-2165c0f7845c")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("781f7086-5192-420c-86bb-ba5510da6803")
    public static class GroupsSmDependency extends SmMultipleDependency {
        @objid ("c3903c59-62f2-4c9d-961f-b0eebd54c610")
        private SmDependency symetricDep;

        @objid ("3480b412-3401-4df0-91cb-c4c176925479")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnFlowElementData)data).mGroups != null)? ((BpmnFlowElementData)data).mGroups:SmMultipleDependency.EMPTY;
        }

        @objid ("4d5f023d-fa97-4e24-8798-d5718925d534")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnFlowElementData) data).mGroups = values;
        }

        @objid ("a1a23388-673c-4dde-9b2b-76667ca6df06")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnGroupSmClass)this.getTarget()).getCategorizedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b70f9d39-67dc-4ca4-9080-9cd592172b95")
    public static class SubProcessSmDependency extends SmSingleDependency {
        @objid ("4c8cb3b6-e02d-465e-a7ef-51ca5875b1b5")
        private SmDependency symetricDep;

        @objid ("1455e5c0-4854-4662-ac0d-c49aa216303b")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnFlowElementData) data).mSubProcess;
        }

        @objid ("2e56028f-2812-4bed-badd-7d97bae82035")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnFlowElementData) data).mSubProcess = value;
        }

        @objid ("87af4b36-d742-45e5-a7ad-26834c2b59db")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSubProcessSmClass)this.getTarget()).getFlowElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("fe7598e2-26f9-47a9-ba6d-9cf44280f57a")
    public static class LaneSmDependency extends SmMultipleDependency {
        @objid ("d4103279-9ba9-4aef-ac50-88811756f12c")
        private SmDependency symetricDep;

        @objid ("20c1c180-cf80-4290-b059-a1905013599d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnFlowElementData)data).mLane != null)? ((BpmnFlowElementData)data).mLane:SmMultipleDependency.EMPTY;
        }

        @objid ("dfe713c3-7631-4f19-a6a6-eb9e5eb12927")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnFlowElementData) data).mLane = values;
        }

        @objid ("5efd501f-d028-4d9c-9838-7e9ac2c816aa")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnLaneSmClass)this.getTarget()).getFlowElementRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ac6cea1f-1193-4073-a081-3553b3454dc2")
    public static class ContainerSmDependency extends SmSingleDependency {
        @objid ("56a84720-fe2c-4a85-8e65-b88c16ea9e28")
        private SmDependency symetricDep;

        @objid ("76b46873-e62b-4b32-91e3-728378d3ad78")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnFlowElementData) data).mContainer;
        }

        @objid ("fde0fc8e-d90d-44a7-a88b-b8e927f620ba")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnFlowElementData) data).mContainer = value;
        }

        @objid ("a24b07eb-7384-4673-af79-59cecc4f57cb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnProcessSmClass)this.getTarget()).getFlowElementDep();
            }
            return this.symetricDep;
        }

    }

}
