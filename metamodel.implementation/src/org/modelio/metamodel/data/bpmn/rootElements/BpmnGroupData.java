/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.bpmn.rootElements;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnGroup;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnGroupImpl;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("007a84d8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnGroup.class, factory=BpmnGroupData.Metadata.ObjectFactory.class)
public class BpmnGroupData extends BpmnArtifactData {
    @objid ("215b00e1-9ae9-4efc-bdfb-bb7aa5a555a8")
    @SmaMetaAttribute(metaName="Category", type=String.class, smAttributeClass=Metadata.CategorySmAttribute.class)
     Object mCategory = "";

    @objid ("d63d3377-77e4-48a7-baaf-9ae1d6c9aa0e")
    @SmaMetaAssociation(metaName="Categorized", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.CategorizedSmDependency.class, partof = true)
     List<SmObjectImpl> mCategorized = null;

    @objid ("88086162-bae0-4790-aa7b-080d966dee46")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00942bb8-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2a8e45c0-301a-40c5-bf63-b7ed0592ded1")
        private static SmClass smClass = null;

        @objid ("0cf4e26f-96d6-4c2a-af04-0e44f7016e55")
        private static SmAttribute CategoryAtt = null;

        @objid ("259e34b1-d5ad-40d6-9062-a06421eb7cad")
        private static SmDependency CategorizedDep = null;

        @objid ("e2fa9a37-353a-4929-9274-8e657a8e2f7c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnGroupData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b7be9a38-47af-4155-91f6-53d8c98cbb33")
        public static SmAttribute CategoryAtt() {
            if (CategoryAtt == null) {
            	CategoryAtt = classof().getAttributeDef("Category");
            }
            return CategoryAtt;
        }

        @objid ("c200bb9a-643f-407b-a843-71832f428f54")
        public static SmDependency CategorizedDep() {
            if (CategorizedDep == null) {
            	CategorizedDep = classof().getDependencyDef("Categorized");
            }
            return CategorizedDep;
        }

        @objid ("ffdb4bdd-417c-4367-a6b3-e7f2a22eaa04")
        public static SmDependency getCategorizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CategorizedDep;
        }

        @objid ("063d8a1b-b29c-474d-a7d9-095718d7d6d9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6aee63d6-b9d0-48d6-a0d2-523ed38363fc")
        public static SmAttribute getCategoryAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CategoryAtt;
        }

        @objid ("009533dc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("99b931d4-2dda-48fd-be16-1084fee21213")
            public ISmObjectData createData() {
                return new BpmnGroupData();
            }

            @objid ("8fd1e241-690c-4f22-ac11-93a39b7306fa")
            public SmObjectImpl createImpl() {
                return new BpmnGroupImpl();
            }

        }

        @objid ("0095a7ea-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CategorySmAttribute extends SmAttribute {
            @objid ("e5cbf434-b171-4aa7-bf4a-6bad07d054d6")
            public Object getValue(ISmObjectData data) {
                return ((BpmnGroupData) data).mCategory;
            }

            @objid ("30731272-c0ae-4d64-b514-25d84ad726b3")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnGroupData) data).mCategory = value;
            }

        }

        @objid ("00960bae-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CategorizedSmDependency extends SmMultipleDependency {
            @objid ("c3009f8e-5995-4e67-9e3b-f5c84e9cadb6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnGroupData)data).mCategorized != null)? ((BpmnGroupData)data).mCategorized:SmMultipleDependency.EMPTY;
            }

            @objid ("188a8407-09dc-4936-b126-dc01e30edeea")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnGroupData) data).mCategorized = new ArrayList<>(initialCapacity);
                return ((BpmnGroupData) data).mCategorized;
            }

            @objid ("a86dd655-6256-4a21-a8e5-9ad11e23871c")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.GroupsDep();
            }

        }

    }

}
