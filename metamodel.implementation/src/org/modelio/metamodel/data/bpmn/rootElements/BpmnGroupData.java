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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("7f60849c-f4a0-4a91-9f78-523fc8d7af98")
    @SmaMetaAttribute(metaName="Category", type=String.class, smAttributeClass=Metadata.CategorySmAttribute.class)
     Object mCategory = "";

    @objid ("bbea8b7e-9610-40d7-bb90-cf6e6db80fb3")
    @SmaMetaAssociation(metaName="Categorized", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.CategorizedSmDependency.class, partof = true)
     List<SmObjectImpl> mCategorized = null;

    @objid ("a7a5cf37-0f87-4d39-ad01-d2b9b95195ec")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00942bb8-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("01a2e03f-71e1-4211-b24a-e98196a8af4d")
        private static SmClass smClass = null;

        @objid ("b8b54686-83b7-454c-a876-94ea2dc37f52")
        private static SmAttribute CategoryAtt = null;

        @objid ("89c0e9b5-c904-479a-95b4-1c19224a1183")
        private static SmDependency CategorizedDep = null;

        @objid ("69aed248-d603-41f0-b5e9-80104256834c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnGroupData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("07a2cfee-0b4e-4982-9356-1e4ff61c6ba9")
        public static SmAttribute CategoryAtt() {
            if (CategoryAtt == null) {
            	CategoryAtt = classof().getAttributeDef("Category");
            }
            return CategoryAtt;
        }

        @objid ("c8db7481-50c9-475a-954e-7734f4c8f03c")
        public static SmDependency CategorizedDep() {
            if (CategorizedDep == null) {
            	CategorizedDep = classof().getDependencyDef("Categorized");
            }
            return CategorizedDep;
        }

        @objid ("af81374b-aca6-4399-a6f8-6565a1c9280f")
        public static SmDependency getCategorizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CategorizedDep;
        }

        @objid ("9ed3f9f5-167e-4fbb-a569-81798af04eb4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("19d569e2-54dc-4eba-bf5e-76de77420a9e")
        public static SmAttribute getCategoryAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CategoryAtt;
        }

        @objid ("009533dc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("68b8becf-1c45-4fde-b741-0000085016a0")
            public ISmObjectData createData() {
                return new BpmnGroupData();
            }

            @objid ("f2c5638c-4b70-4f39-a523-feb499b5be19")
            public SmObjectImpl createImpl() {
                return new BpmnGroupImpl();
            }

        }

        @objid ("0095a7ea-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CategorySmAttribute extends SmAttribute {
            @objid ("6266acb3-0b0b-46ad-b222-d288c220dd16")
            public Object getValue(ISmObjectData data) {
                return ((BpmnGroupData) data).mCategory;
            }

            @objid ("b622275a-13a2-4e5e-a86f-6bdba651802d")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnGroupData) data).mCategory = value;
            }

        }

        @objid ("00960bae-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CategorizedSmDependency extends SmMultipleDependency {
            @objid ("2f59b52b-fb4c-40ef-8a70-06419eeba49b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnGroupData)data).mCategorized != null)? ((BpmnGroupData)data).mCategorized:SmMultipleDependency.EMPTY;
            }

            @objid ("2f9aba8d-b4a9-4a47-a46f-e92524e07dc6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnGroupData) data).mCategorized = new ArrayList<>(initialCapacity);
                return ((BpmnGroupData) data).mCategorized;
            }

            @objid ("fcfadcba-b678-44a5-92bf-9793dddc2e71")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.GroupsDep();
            }

        }

    }

}
