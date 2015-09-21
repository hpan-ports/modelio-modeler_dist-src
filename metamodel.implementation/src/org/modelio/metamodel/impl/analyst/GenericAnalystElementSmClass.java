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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.GenericAnalystElement;
import org.modelio.metamodel.impl.analyst.AnalystElementSmClass;
import org.modelio.metamodel.impl.analyst.GenericAnalystContainerSmClass;
import org.modelio.metamodel.impl.analyst.GenericAnalystElementSmClass;
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

@objid ("002258e7-33c0-4455-ba47-4bc1959d6d6b")
public class GenericAnalystElementSmClass extends AnalystElementSmClass {
    @objid ("dde7a4f4-07fc-4059-ad0a-e836d785f298")
    private SmDependency subElementDep;

    @objid ("7984ab9d-edb3-4f51-950d-a5c6b1407d17")
    private SmDependency ownerContainerDep;

    @objid ("9f801215-8407-43f2-9d7d-30c8e4d3a90d")
    private SmDependency parentElementDep;

    @objid ("b6526049-b119-4e69-89ad-94b9d3aa1816")
    private SmDependency lastElementVersionDep;

    @objid ("6d57b2d9-9a7b-4adb-8588-442f03337b05")
    private SmDependency archivedElementVersionDep;

    @objid ("3b5ada23-17ca-445d-9c91-6fae8b682412")
    public GenericAnalystElementSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("490fe38c-ab82-4e98-aff6-c15fa78f9877")
    @Override
    public String getName() {
        return "GenericAnalystElement";
    }

    @objid ("8c62f2c1-91eb-4412-95cb-8e72311fbca9")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("b3ad56e7-2329-4fc0-9218-76ddeb778d45")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return GenericAnalystElement.class;
    }

    @objid ("4c9562bf-b988-47de-80a3-15a440a57e55")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("5c813ddd-412a-49ee-9440-cbdcab0b1d2d")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("99a20c8b-5675-4553-a91c-420d207b9c76")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystElement");
        this.registerFactory(new GenericAnalystElementObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.subElementDep = new SubElementSmDependency();
        this.subElementDep.init("SubElement", this, metamodel.getMClass("GenericAnalystElement"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.subElementDep);
        
        this.ownerContainerDep = new OwnerContainerSmDependency();
        this.ownerContainerDep.init("OwnerContainer", this, metamodel.getMClass("GenericAnalystContainer"), 0, 1 );
        registerDependency(this.ownerContainerDep);
        
        this.parentElementDep = new ParentElementSmDependency();
        this.parentElementDep.init("ParentElement", this, metamodel.getMClass("GenericAnalystElement"), 0, 1 );
        registerDependency(this.parentElementDep);
        
        this.lastElementVersionDep = new LastElementVersionSmDependency();
        this.lastElementVersionDep.init("LastElementVersion", this, metamodel.getMClass("GenericAnalystElement"), 0, 1 );
        registerDependency(this.lastElementVersionDep);
        
        this.archivedElementVersionDep = new ArchivedElementVersionSmDependency();
        this.archivedElementVersionDep.init("ArchivedElementVersion", this, metamodel.getMClass("GenericAnalystElement"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.archivedElementVersionDep);
    }

    @objid ("244fba06-41fd-447a-802d-6458c0912d93")
    public SmDependency getSubElementDep() {
        if (this.subElementDep == null) {
        	this.subElementDep = this.getDependencyDef("SubElement");
        }
        return this.subElementDep;
    }

    @objid ("8cefb8f5-15bd-4ae0-a7a3-8037d585b30c")
    public SmDependency getOwnerContainerDep() {
        if (this.ownerContainerDep == null) {
        	this.ownerContainerDep = this.getDependencyDef("OwnerContainer");
        }
        return this.ownerContainerDep;
    }

    @objid ("6395e4f0-6dd2-4001-951a-76853c3c766e")
    public SmDependency getParentElementDep() {
        if (this.parentElementDep == null) {
        	this.parentElementDep = this.getDependencyDef("ParentElement");
        }
        return this.parentElementDep;
    }

    @objid ("0ddfc3ed-5579-4d1f-85f9-8339f13a68d8")
    public SmDependency getLastElementVersionDep() {
        if (this.lastElementVersionDep == null) {
        	this.lastElementVersionDep = this.getDependencyDef("LastElementVersion");
        }
        return this.lastElementVersionDep;
    }

    @objid ("d0ab7bb8-e456-4175-a750-6ba5ec761a6e")
    public SmDependency getArchivedElementVersionDep() {
        if (this.archivedElementVersionDep == null) {
        	this.archivedElementVersionDep = this.getDependencyDef("ArchivedElementVersion");
        }
        return this.archivedElementVersionDep;
    }

    @objid ("77b9c22b-015a-4bdd-b34a-98d44ff3f46d")
    private static class GenericAnalystElementObjectFactory implements ISmObjectFactory {
        @objid ("bb086bf8-afdb-47b2-b44a-06f2f322c252")
        private GenericAnalystElementSmClass smClass;

        @objid ("4d3dc9ee-471b-4a0f-b13c-4547538880d6")
        public GenericAnalystElementObjectFactory(GenericAnalystElementSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("2ce58c07-795c-4cbb-9ea7-b82e6772ab67")
        @Override
        public ISmObjectData createData() {
            return new GenericAnalystElementData(this.smClass);
        }

        @objid ("4c4f7f9b-b5cf-403f-b471-4fc6c2f849fa")
        @Override
        public SmObjectImpl createImpl() {
            return new GenericAnalystElementImpl();
        }

    }

    @objid ("3574c149-72a0-4935-98e2-450f87675752")
    public static class SubElementSmDependency extends SmMultipleDependency {
        @objid ("f886cc41-0691-44ce-895e-d903a403a9a5")
        private SmDependency symetricDep;

        @objid ("9e46aac8-fbcb-4ed6-93f3-297fa63cc797")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GenericAnalystElementData)data).mSubElement != null)? ((GenericAnalystElementData)data).mSubElement:SmMultipleDependency.EMPTY;
        }

        @objid ("457c1531-21e4-45e7-a569-1aa42c110ee7")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GenericAnalystElementData) data).mSubElement = values;
        }

        @objid ("2514569c-8925-4360-a337-2c0001117d37")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GenericAnalystElementSmClass)this.getTarget()).getParentElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6704ad4b-1336-4adf-a379-7621bb307de1")
    public static class OwnerContainerSmDependency extends SmSingleDependency {
        @objid ("2e1c189b-3d5d-4159-b6da-e698b2f349d4")
        private SmDependency symetricDep;

        @objid ("c529f0d2-3a42-4b43-94d5-32e9144fc35c")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GenericAnalystElementData) data).mOwnerContainer;
        }

        @objid ("3ec5958d-f953-49f2-825b-2753c86c6a64")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GenericAnalystElementData) data).mOwnerContainer = value;
        }

        @objid ("acd3454a-0757-4d70-a20f-2c7b9c3317e0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GenericAnalystContainerSmClass)this.getTarget()).getOwnedElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("903cbc81-4312-4251-bd7a-1dbbd36ec9f7")
    public static class ParentElementSmDependency extends SmSingleDependency {
        @objid ("b2b0df49-6e97-42b8-bfa1-21435fba64f3")
        private SmDependency symetricDep;

        @objid ("d1f720a6-671f-4437-bb9d-90914b9d09da")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GenericAnalystElementData) data).mParentElement;
        }

        @objid ("e8ba8aa1-6ccd-4587-972b-f075211e65e8")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GenericAnalystElementData) data).mParentElement = value;
        }

        @objid ("e8f0db87-b940-4011-993f-9f8ba867aeaf")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GenericAnalystElementSmClass)this.getTarget()).getSubElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("15566f2b-e187-4cae-b6a4-9c626ebd0d0a")
    public static class LastElementVersionSmDependency extends SmSingleDependency {
        @objid ("da8ad7b0-45d0-40da-93ac-04184b20c949")
        private SmDependency symetricDep;

        @objid ("fb07a6f5-ec96-4b0c-b2a2-30c8d99fa780")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GenericAnalystElementData) data).mLastElementVersion;
        }

        @objid ("388c9200-1a60-4dc7-8f05-3978b8e68e5c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GenericAnalystElementData) data).mLastElementVersion = value;
        }

        @objid ("96ffd4cd-cde4-45f6-8d43-f3de93de1330")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GenericAnalystElementSmClass)this.getTarget()).getArchivedElementVersionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e2be3e8a-9709-43a3-972c-c898c62ef293")
    public static class ArchivedElementVersionSmDependency extends SmMultipleDependency {
        @objid ("e17946f7-4c31-4281-87ba-42f23cdab3c3")
        private SmDependency symetricDep;

        @objid ("087bc55b-fd08-413e-8ee8-ef97b97abd26")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GenericAnalystElementData)data).mArchivedElementVersion != null)? ((GenericAnalystElementData)data).mArchivedElementVersion:SmMultipleDependency.EMPTY;
        }

        @objid ("73238860-0d85-4f25-9f98-5916acd38483")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GenericAnalystElementData) data).mArchivedElementVersion = values;
        }

        @objid ("78fc5072-1923-461d-bda1-f9fb11c1e8e9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GenericAnalystElementSmClass)this.getTarget()).getLastElementVersionDep();
            }
            return this.symetricDep;
        }

    }

}
