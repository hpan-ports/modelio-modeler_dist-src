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
/*   Metamodel version: 9019              */
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
    @objid ("81ad6361-2566-4bef-8f69-4d4955c338a6")
    @SmaMetaAttribute(metaName="Category", type=String.class, smAttributeClass=Metadata.CategorySmAttribute.class)
     Object mCategory = "";

    @objid ("a9d334f2-2b97-4e01-afa9-4744e205595f")
    @SmaMetaAssociation(metaName="Categorized", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.CategorizedSmDependency.class, partof = true)
     List<SmObjectImpl> mCategorized = null;

    @objid ("39736cf5-53db-4ee8-b5e6-33f832f857b9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00942bb8-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6f0046ce-53bd-49f1-a81e-14eeb23fe467")
        private static SmClass smClass = null;

        @objid ("36e63b76-8a7a-4dc6-aca0-2532e6ffd3a6")
        private static SmAttribute CategoryAtt = null;

        @objid ("508801d5-65ad-46a6-b82c-b6bd14a506fe")
        private static SmDependency CategorizedDep = null;

        @objid ("20880cc5-d8d3-471e-bb9a-18ff5e9b49ae")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnGroupData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5a849c31-d815-4fb6-a668-a883966115c2")
        public static SmAttribute CategoryAtt() {
            if (CategoryAtt == null) {
            	CategoryAtt = classof().getAttributeDef("Category");
            }
            return CategoryAtt;
        }

        @objid ("f3d8c49f-1edd-4e27-b2e1-d7f065afaadd")
        public static SmDependency CategorizedDep() {
            if (CategorizedDep == null) {
            	CategorizedDep = classof().getDependencyDef("Categorized");
            }
            return CategorizedDep;
        }

        @objid ("7b8a6e7e-d30b-48d5-b765-7fd76b2c5905")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b345766f-7e23-400a-a762-f6b4b074c3d7")
        public static SmDependency getCategorizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CategorizedDep;
        }

        @objid ("e8515382-82ea-43a8-a760-e482f120e707")
        public static SmAttribute getCategoryAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CategoryAtt;
        }

        @objid ("009533dc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c0a46d15-f15d-46d1-968f-3d787f8ee378")
            public ISmObjectData createData() {
                return new BpmnGroupData();
            }

            @objid ("da0e12d1-c86f-40e1-99b0-084ed0586c4f")
            public SmObjectImpl createImpl() {
                return new BpmnGroupImpl();
            }

        }

        @objid ("0095a7ea-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CategorySmAttribute extends SmAttribute {
            @objid ("b4979a64-017f-47d0-a81f-9df46a298583")
            public Object getValue(ISmObjectData data) {
                return ((BpmnGroupData) data).mCategory;
            }

            @objid ("70dd280e-d7bc-4dcf-8e12-6c58135391c9")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnGroupData) data).mCategory = value;
            }

        }

        @objid ("00960bae-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CategorizedSmDependency extends SmMultipleDependency {
            @objid ("c93fccf0-efd6-4dd4-aeee-18700a865b64")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnGroupData)data).mCategorized != null)? ((BpmnGroupData)data).mCategorized:SmMultipleDependency.EMPTY;
            }

            @objid ("062ff6e4-51f7-460d-ba83-2e15ee1ba254")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnGroupData) data).mCategorized = new ArrayList<>(initialCapacity);
                return ((BpmnGroupData) data).mCategorized;
            }

            @objid ("3017bb59-f36b-4ed1-a440-c23d1294af69")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.GroupsDep();
            }

        }

    }

}
