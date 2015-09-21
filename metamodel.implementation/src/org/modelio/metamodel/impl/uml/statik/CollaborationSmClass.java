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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.metamodel.impl.uml.statik.CollaborationUseSmClass;
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.uml.statik.Collaboration;
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

@objid ("35b0920b-939c-4bb9-8b77-434d6f784cd3")
public class CollaborationSmClass extends NameSpaceSmClass {
    @objid ("05993b94-9c45-4614-bdf4-1e89e5739dad")
    private SmAttribute isConcurrentAtt;

    @objid ("5c19d3b1-6d4d-4069-9f03-14df9ec694ba")
    private SmDependency oRepresentedDep;

    @objid ("f4e34e13-d25c-46be-85ee-7d6ab7f5b5be")
    private SmDependency bRepresentedDep;

    @objid ("f7b2a66c-ccc3-4bd0-8464-7d778903a5dd")
    private SmDependency occurrenceDep;

    @objid ("467b2e7d-036a-43f2-b312-8bdca178bf82")
    public CollaborationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("45d79174-1cb9-4db5-91f3-23af612b3f92")
    @Override
    public String getName() {
        return "Collaboration";
    }

    @objid ("196ff251-9426-420e-8940-2ec5cdb77103")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("1efb617a-0c93-498a-8352-58906f65ca72")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Collaboration.class;
    }

    @objid ("0fe0d644-e124-49e5-868c-d08dbc4e9b1e")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("eb96ad8b-fb2d-450e-acbc-7b7460f240da")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("20c9ed35-27e6-4e45-af67-5b62ebfb0eba")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("NameSpace");
        this.registerFactory(new CollaborationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isConcurrentAtt = new IsConcurrentSmAttribute();
        this.isConcurrentAtt.init("IsConcurrent", this, Boolean.class );
        registerAttribute(this.isConcurrentAtt);
        
        
        // Initialize and register the SmDependency
        this.oRepresentedDep = new ORepresentedSmDependency();
        this.oRepresentedDep.init("ORepresented", this, metamodel.getMClass("Operation"), 0, 1 );
        registerDependency(this.oRepresentedDep);
        
        this.bRepresentedDep = new BRepresentedSmDependency();
        this.bRepresentedDep.init("BRepresented", this, metamodel.getMClass("Behavior"), 0, 1 );
        registerDependency(this.bRepresentedDep);
        
        this.occurrenceDep = new OccurrenceSmDependency();
        this.occurrenceDep.init("Occurrence", this, metamodel.getMClass("CollaborationUse"), 0, -1 );
        registerDependency(this.occurrenceDep);
    }

    @objid ("e21eaf17-ca30-44aa-864f-dd56da3b1d8d")
    public SmAttribute getIsConcurrentAtt() {
        if (this.isConcurrentAtt == null) {
        	this.isConcurrentAtt = this.getAttributeDef("IsConcurrent");
        }
        return this.isConcurrentAtt;
    }

    @objid ("72b8641d-cdbb-4bc2-9e45-44d385994f5f")
    public SmDependency getORepresentedDep() {
        if (this.oRepresentedDep == null) {
        	this.oRepresentedDep = this.getDependencyDef("ORepresented");
        }
        return this.oRepresentedDep;
    }

    @objid ("38c157e8-3bd4-4019-9cbc-ac27c8a50faf")
    public SmDependency getBRepresentedDep() {
        if (this.bRepresentedDep == null) {
        	this.bRepresentedDep = this.getDependencyDef("BRepresented");
        }
        return this.bRepresentedDep;
    }

    @objid ("de8885a7-f1ed-4652-823d-d5ea51d1fce5")
    public SmDependency getOccurrenceDep() {
        if (this.occurrenceDep == null) {
        	this.occurrenceDep = this.getDependencyDef("Occurrence");
        }
        return this.occurrenceDep;
    }

    @objid ("609f5ff5-b538-4bf5-ae45-ee67c50cc535")
    private static class CollaborationObjectFactory implements ISmObjectFactory {
        @objid ("c6fbd898-4c68-46b7-88fd-14e5cccc2393")
        private CollaborationSmClass smClass;

        @objid ("6dddddc8-62eb-4adb-801c-c02c5ac09b4d")
        public CollaborationObjectFactory(CollaborationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("a440c85b-72b6-439c-a64f-2690aebf056a")
        @Override
        public ISmObjectData createData() {
            return new CollaborationData(this.smClass);
        }

        @objid ("42ab4939-6185-47cb-8c10-7d128e0ad998")
        @Override
        public SmObjectImpl createImpl() {
            return new CollaborationImpl();
        }

    }

    @objid ("e109349c-19b9-4dd6-bcf9-f4320eb5f489")
    public static class IsConcurrentSmAttribute extends SmAttribute {
        @objid ("b637d606-cc3c-4f54-9ff3-c618d7b4a88d")
        public Object getValue(ISmObjectData data) {
            return ((CollaborationData) data).mIsConcurrent;
        }

        @objid ("cefa513d-d58a-4e59-a1b3-48dedbd075de")
        public void setValue(ISmObjectData data, Object value) {
            ((CollaborationData) data).mIsConcurrent = value;
        }

    }

    @objid ("f0b11925-3883-4b01-94cb-5910e8ccbdac")
    public static class ORepresentedSmDependency extends SmSingleDependency {
        @objid ("dcd27c82-65f0-436c-a6ef-712b1b45d486")
        private SmDependency symetricDep;

        @objid ("447e679d-52cb-4972-80df-641b59a004a2")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CollaborationData) data).mORepresented;
        }

        @objid ("42a68d4e-09fb-468a-892d-5c837491666c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CollaborationData) data).mORepresented = value;
        }

        @objid ("e750c8a8-fab6-423a-a49c-201322a73d2b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getExampleDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4d8bc1a7-3af0-480d-bcf0-deeb00d8eea3")
    public static class BRepresentedSmDependency extends SmSingleDependency {
        @objid ("1a098a8a-0a6b-441b-b801-3e85cf426d5f")
        private SmDependency symetricDep;

        @objid ("d89e5814-4120-452e-94a2-ec7ef492c096")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CollaborationData) data).mBRepresented;
        }

        @objid ("fcdd87c7-c19b-480c-ab6f-0418a52449f7")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CollaborationData) data).mBRepresented = value;
        }

        @objid ("4566888e-0b56-4896-a7e8-37cb8ce01b3e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BehaviorSmClass)this.getTarget()).getOwnedCollaborationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("96596e45-3b02-4734-b00b-9649e342be90")
    public static class OccurrenceSmDependency extends SmMultipleDependency {
        @objid ("7a99119d-270e-4a91-b01b-e6abe04b95f9")
        private SmDependency symetricDep;

        @objid ("d6a1a11b-899d-4fe5-ab7f-08e0604522a3")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((CollaborationData)data).mOccurrence != null)? ((CollaborationData)data).mOccurrence:SmMultipleDependency.EMPTY;
        }

        @objid ("5c7e53e7-22b0-4bf5-adbc-ebcd8f00bb2b")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((CollaborationData) data).mOccurrence = values;
        }

        @objid ("956fb75f-58e0-44a9-9016-7b0c59640c69")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CollaborationUseSmClass)this.getTarget()).getTypeDep();
            }
            return this.symetricDep;
        }

    }

}
