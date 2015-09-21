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
import org.modelio.metamodel.bpmn.rootElements.BpmnGroup;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnArtifactSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementSmClass;
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

@objid ("ad11c0e8-184a-4703-8339-53a0a144d6b5")
public class BpmnGroupSmClass extends BpmnArtifactSmClass {
    @objid ("63fe5920-2e32-49ff-9a62-e18001e1f21f")
    private SmAttribute categoryAtt;

    @objid ("75f2a9a7-16f3-4682-b3c8-9931155aa168")
    private SmDependency categorizedDep;

    @objid ("70b42ef2-21df-4e20-9a72-0c205acceeae")
    public BpmnGroupSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("24d4fb1f-5521-42cd-827c-a7bc0d23a90e")
    @Override
    public String getName() {
        return "BpmnGroup";
    }

    @objid ("fac5944c-3edd-46b5-a202-3301831d9a38")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("05cd3f56-c89c-46dd-a894-0403e849b99f")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnGroup.class;
    }

    @objid ("19f042dd-7fc0-4467-bb5e-09a556f74b97")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("5426839f-d788-43ff-8b4d-32af6c7dce93")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("0553d16c-916b-40b3-9cd3-e144913bb030")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnArtifact");
        this.registerFactory(new BpmnGroupObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.categoryAtt = new CategorySmAttribute();
        this.categoryAtt.init("Category", this, String.class );
        registerAttribute(this.categoryAtt);
        
        
        // Initialize and register the SmDependency
        this.categorizedDep = new CategorizedSmDependency();
        this.categorizedDep.init("Categorized", this, metamodel.getMClass("BpmnFlowElement"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.categorizedDep);
    }

    @objid ("5b7a4540-4d77-44f1-ab94-9126884b1afe")
    public SmAttribute getCategoryAtt() {
        if (this.categoryAtt == null) {
        	this.categoryAtt = this.getAttributeDef("Category");
        }
        return this.categoryAtt;
    }

    @objid ("cd7bd1d6-b000-4b7e-a48e-d2bf8649db41")
    public SmDependency getCategorizedDep() {
        if (this.categorizedDep == null) {
        	this.categorizedDep = this.getDependencyDef("Categorized");
        }
        return this.categorizedDep;
    }

    @objid ("c2cb0c05-0bfb-4965-9707-94f63327c79e")
    private static class BpmnGroupObjectFactory implements ISmObjectFactory {
        @objid ("b9e470a7-47b5-459a-b217-fcaf7d3e01b2")
        private BpmnGroupSmClass smClass;

        @objid ("966adf55-1617-4cb3-8e25-f3fefaba3045")
        public BpmnGroupObjectFactory(BpmnGroupSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("a757efb7-1dad-47df-a683-d94402c075ef")
        @Override
        public ISmObjectData createData() {
            return new BpmnGroupData(this.smClass);
        }

        @objid ("12eadfd3-e676-42ee-8464-d9dc27096bc8")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnGroupImpl();
        }

    }

    @objid ("496f0ab2-32ca-4023-864a-83b2db0f6737")
    public static class CategorySmAttribute extends SmAttribute {
        @objid ("2a2e0b13-0ec0-4191-9ef2-f0898295f52b")
        public Object getValue(ISmObjectData data) {
            return ((BpmnGroupData) data).mCategory;
        }

        @objid ("02b96ad9-fd62-44bb-83d6-4c9e700b0513")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnGroupData) data).mCategory = value;
        }

    }

    @objid ("2145a7a0-970f-458e-94f7-f81aaca31120")
    public static class CategorizedSmDependency extends SmMultipleDependency {
        @objid ("afe074a1-d265-4a72-a00f-77cd7e3e611f")
        private SmDependency symetricDep;

        @objid ("f66e353d-1f7c-497a-9645-50cae22b4016")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnGroupData)data).mCategorized != null)? ((BpmnGroupData)data).mCategorized:SmMultipleDependency.EMPTY;
        }

        @objid ("2e4b7906-de0e-408a-8b22-9364c1f65815")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnGroupData) data).mCategorized = values;
        }

        @objid ("efaa4fdd-f042-4abf-bef1-0fbfd8df45d8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnFlowElementSmClass)this.getTarget()).getGroupsDep();
            }
            return this.symetricDep;
        }

    }

}
