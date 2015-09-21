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
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.objects.BpmnItemKind;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementSmClass;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceParameterSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementSmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
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

@objid ("1c7d8bdd-dbfc-4c81-9979-040335d7b02b")
public class BpmnItemDefinitionSmClass extends BpmnRootElementSmClass {
    @objid ("5d2ed820-aafc-4f04-9790-674b5f9dedc9")
    private SmAttribute itemKindAtt;

    @objid ("93567ac8-6d04-4194-a9f0-2b17734a4b00")
    private SmAttribute isCollectionAtt;

    @objid ("669d2d7b-5ae6-492e-b8fe-6821c7c5622f")
    private SmDependency structureRefDep;

    @objid ("e5de0b57-d4fb-486d-835c-5bb6af2a30c7")
    private SmDependency typedMessageDep;

    @objid ("df8c620a-9772-495d-9787-5e7e6aef8a08")
    private SmDependency typedItemDep;

    @objid ("73c030ac-1c81-4ed6-acce-57c525ed51a1")
    private SmDependency typedResourceParameterDep;

    @objid ("38e13104-b2f0-457e-9298-1f2b7ae0f85b")
    public BpmnItemDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("b1a66508-6df0-43d8-9a56-7b321cacee73")
    @Override
    public String getName() {
        return "BpmnItemDefinition";
    }

    @objid ("32edbb3d-e3e8-4ef9-922d-f8e11a327d44")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("8d64536e-51c6-467c-b8f1-b498c0f12402")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnItemDefinition.class;
    }

    @objid ("183b28be-4830-49b9-a58c-1d1119d659d2")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("7a23779d-1532-4c7f-8539-adcd08ab3c3f")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("0e72f788-30f5-4fdc-bfc3-6ae941dcf0f2")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnRootElement");
        this.registerFactory(new BpmnItemDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.itemKindAtt = new ItemKindSmAttribute();
        this.itemKindAtt.init("ItemKind", this, BpmnItemKind.class );
        registerAttribute(this.itemKindAtt);
        
        this.isCollectionAtt = new IsCollectionSmAttribute();
        this.isCollectionAtt.init("IsCollection", this, Boolean.class );
        registerAttribute(this.isCollectionAtt);
        
        
        // Initialize and register the SmDependency
        this.structureRefDep = new StructureRefSmDependency();
        this.structureRefDep.init("StructureRef", this, metamodel.getMClass("GeneralClass"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.structureRefDep);
        
        this.typedMessageDep = new TypedMessageSmDependency();
        this.typedMessageDep.init("TypedMessage", this, metamodel.getMClass("BpmnMessage"), 0, -1 );
        registerDependency(this.typedMessageDep);
        
        this.typedItemDep = new TypedItemSmDependency();
        this.typedItemDep.init("TypedItem", this, metamodel.getMClass("BpmnItemAwareElement"), 0, -1 );
        registerDependency(this.typedItemDep);
        
        this.typedResourceParameterDep = new TypedResourceParameterSmDependency();
        this.typedResourceParameterDep.init("TypedResourceParameter", this, metamodel.getMClass("BpmnResourceParameter"), 0, -1 );
        registerDependency(this.typedResourceParameterDep);
    }

    @objid ("a0d425f2-2fe5-473e-9e84-8b64d2548ed9")
    public SmAttribute getItemKindAtt() {
        if (this.itemKindAtt == null) {
        	this.itemKindAtt = this.getAttributeDef("ItemKind");
        }
        return this.itemKindAtt;
    }

    @objid ("acd2a56b-dc7d-406b-b60d-25d0fc313db0")
    public SmAttribute getIsCollectionAtt() {
        if (this.isCollectionAtt == null) {
        	this.isCollectionAtt = this.getAttributeDef("IsCollection");
        }
        return this.isCollectionAtt;
    }

    @objid ("bc26f819-dd57-46a1-8d27-898524bb9dd7")
    public SmDependency getStructureRefDep() {
        if (this.structureRefDep == null) {
        	this.structureRefDep = this.getDependencyDef("StructureRef");
        }
        return this.structureRefDep;
    }

    @objid ("9e232c47-75f1-4ab9-bf7f-4010fc9ff355")
    public SmDependency getTypedMessageDep() {
        if (this.typedMessageDep == null) {
        	this.typedMessageDep = this.getDependencyDef("TypedMessage");
        }
        return this.typedMessageDep;
    }

    @objid ("5670338c-baab-4580-bc64-c288880d5bfb")
    public SmDependency getTypedItemDep() {
        if (this.typedItemDep == null) {
        	this.typedItemDep = this.getDependencyDef("TypedItem");
        }
        return this.typedItemDep;
    }

    @objid ("75c5641e-0072-4c6c-85db-571bf2ca4274")
    public SmDependency getTypedResourceParameterDep() {
        if (this.typedResourceParameterDep == null) {
        	this.typedResourceParameterDep = this.getDependencyDef("TypedResourceParameter");
        }
        return this.typedResourceParameterDep;
    }

    @objid ("9166de83-ec10-4439-ac90-911eb303d3fa")
    private static class BpmnItemDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("ea60cae7-ecf1-4fb3-b928-4fd14680f2da")
        private BpmnItemDefinitionSmClass smClass;

        @objid ("83d53494-08b2-4d62-bb59-593671310a7a")
        public BpmnItemDefinitionObjectFactory(BpmnItemDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("a1f8aad1-c6e3-4eaa-b22c-64341795e621")
        @Override
        public ISmObjectData createData() {
            return new BpmnItemDefinitionData(this.smClass);
        }

        @objid ("aa3ed7e2-fe55-4087-97d7-f553ce349e60")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnItemDefinitionImpl();
        }

    }

    @objid ("6fd7c265-e856-47a3-b6d3-90c47aca9f37")
    public static class ItemKindSmAttribute extends SmAttribute {
        @objid ("0f3732f0-0aa2-45da-b998-478f3db3f823")
        public Object getValue(ISmObjectData data) {
            return ((BpmnItemDefinitionData) data).mItemKind;
        }

        @objid ("41414cd7-a461-4b52-901c-eb45eb7a974c")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnItemDefinitionData) data).mItemKind = value;
        }

    }

    @objid ("94c849b1-8aea-47a1-a63d-2ac59d21fff5")
    public static class IsCollectionSmAttribute extends SmAttribute {
        @objid ("968fd36c-45a4-41fe-bc25-70ead072e0b2")
        public Object getValue(ISmObjectData data) {
            return ((BpmnItemDefinitionData) data).mIsCollection;
        }

        @objid ("d6fe985d-ff54-4862-941c-6575de7eddd5")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnItemDefinitionData) data).mIsCollection = value;
        }

    }

    @objid ("e708bfaf-7617-4640-a723-435939460fa2")
    public static class StructureRefSmDependency extends SmSingleDependency {
        @objid ("cc174e9f-67da-4eda-9beb-5dcd4c1b372e")
        private SmDependency symetricDep;

        @objid ("7f4fd0d7-60fd-4f91-aaee-bc4f098f9927")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnItemDefinitionData) data).mStructureRef;
        }

        @objid ("c5e56aff-4c6d-4140-a0ec-0050734d3c37")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnItemDefinitionData) data).mStructureRef = value;
        }

        @objid ("d3e774fd-96c5-4650-a507-a826b5b36b00")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GeneralClassSmClass)this.getTarget()).getBpmnItemDefinitionRefsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b9f24375-2caf-40a2-8ce1-b8a0f8679c84")
    public static class TypedMessageSmDependency extends SmMultipleDependency {
        @objid ("2b3f92fd-49f1-4686-a3f3-4a42dbe21925")
        private SmDependency symetricDep;

        @objid ("4c9896c4-e4a1-4109-844a-3766a9a48bf1")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnItemDefinitionData)data).mTypedMessage != null)? ((BpmnItemDefinitionData)data).mTypedMessage:SmMultipleDependency.EMPTY;
        }

        @objid ("b3a44411-9cd7-4c73-a99e-7cff9202518d")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnItemDefinitionData) data).mTypedMessage = values;
        }

        @objid ("82caa3f5-bcb6-437b-8acb-ead5e6a3172d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageSmClass)this.getTarget()).getItemRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("70d9511c-702b-49ac-920d-6b05d0c7432d")
    public static class TypedItemSmDependency extends SmMultipleDependency {
        @objid ("8eae4f7b-a642-4f19-92a2-bb6c8ac91c82")
        private SmDependency symetricDep;

        @objid ("7456a15d-fc46-4b72-af5f-15e60b6e80f1")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnItemDefinitionData)data).mTypedItem != null)? ((BpmnItemDefinitionData)data).mTypedItem:SmMultipleDependency.EMPTY;
        }

        @objid ("19c9f890-582e-4edb-989b-d897420a55c3")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnItemDefinitionData) data).mTypedItem = values;
        }

        @objid ("ec2622d0-a8da-4825-8c05-4f6d0d4e38d1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnItemAwareElementSmClass)this.getTarget()).getItemSubjectRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5d4e32aa-edc0-458a-8a2c-627d31f46c9a")
    public static class TypedResourceParameterSmDependency extends SmMultipleDependency {
        @objid ("698ba97f-c765-4c42-82d6-99b5c2417284")
        private SmDependency symetricDep;

        @objid ("89ffb387-e75d-4d9d-bb80-3ad6de54193f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnItemDefinitionData)data).mTypedResourceParameter != null)? ((BpmnItemDefinitionData)data).mTypedResourceParameter:SmMultipleDependency.EMPTY;
        }

        @objid ("621c3eab-8394-4cbf-a79c-95232d426eee")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnItemDefinitionData) data).mTypedResourceParameter = values;
        }

        @objid ("3535d4aa-385b-4fcc-a550-ec569da499be")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnResourceParameterSmClass)this.getTarget()).getTypeDep();
            }
            return this.symetricDep;
        }

    }

}
