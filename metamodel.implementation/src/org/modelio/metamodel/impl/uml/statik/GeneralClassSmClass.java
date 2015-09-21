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
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnInterfaceSmClass;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemDefinitionSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExceptionHandlerSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectNodeSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.SignalSmClass;
import org.modelio.metamodel.impl.uml.statik.AttributeSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.impl.uml.statik.ParameterSmClass;
import org.modelio.metamodel.uml.statik.GeneralClass;
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

@objid ("68b143c4-1f67-48f8-9d81-057416dd3db1")
public class GeneralClassSmClass extends ClassifierSmClass {
    @objid ("efe322c5-17c6-4f88-bb22-f1953890d4ed")
    private SmAttribute isElementaryAtt;

    @objid ("0ca365e3-3518-4e9e-90a5-0eef4c6c6607")
    private SmDependency bpmnInterfaceRefsDep;

    @objid ("d7ad63c6-1bd1-43c5-873a-71a99484c1d6")
    private SmDependency occurenceDep;

    @objid ("72b5a710-86f8-445b-a717-50d0f926fe7b")
    private SmDependency exceptionInputDep;

    @objid ("c5e20ec0-7788-4843-af35-43ad450069dc")
    private SmDependency objectDep;

    @objid ("01ca1dd0-48c8-42ad-9402-6f9010d61469")
    private SmDependency bpmnMessageRefsDep;

    @objid ("bb214153-9c40-4720-94ba-7c8ce8b2d9c5")
    private SmDependency sRepresentationDep;

    @objid ("6081321c-03db-4952-879a-1e27230b9078")
    private SmDependency bpmnItemDefinitionRefsDep;

    @objid ("a06999de-d5ab-4e17-b644-12ea45ff822d")
    private SmDependency occurenceObjectNodeDep;

    @objid ("797f9a10-f587-4e20-9840-40e4ab166c72")
    private SmDependency bpmnItemAwareRefsDep;

    @objid ("c3eda483-8ce9-4d15-bbb8-4b9d776b03d0")
    public GeneralClassSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("428a4c9b-6973-4671-85cf-58f7f9a7bec9")
    @Override
    public String getName() {
        return "GeneralClass";
    }

    @objid ("7242b866-07d1-40fe-9da1-c2806623975b")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("8d399fa7-9a22-4ab0-ae25-d38e347336fd")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return GeneralClass.class;
    }

    @objid ("dd5fdeb1-c564-4856-864b-29037abcffba")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("f3168d6c-fdb9-4514-b450-6e6e7d826a16")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("93adf4d0-7392-4310-83a9-2e6113b68e7b")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Classifier");
        this.registerFactory(new GeneralClassObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isElementaryAtt = new IsElementarySmAttribute();
        this.isElementaryAtt.init("IsElementary", this, Boolean.class );
        registerAttribute(this.isElementaryAtt);
        
        
        // Initialize and register the SmDependency
        this.bpmnInterfaceRefsDep = new BpmnInterfaceRefsSmDependency();
        this.bpmnInterfaceRefsDep.init("BpmnInterfaceRefs", this, metamodel.getMClass("BpmnInterface"), 0, -1 );
        registerDependency(this.bpmnInterfaceRefsDep);
        
        this.occurenceDep = new OccurenceSmDependency();
        this.occurenceDep.init("Occurence", this, metamodel.getMClass("Parameter"), 0, -1 , SmDirective.SMCDDYNAMIC);
        registerDependency(this.occurenceDep);
        
        this.exceptionInputDep = new ExceptionInputSmDependency();
        this.exceptionInputDep.init("ExceptionInput", this, metamodel.getMClass("ExceptionHandler"), 1, 1 );
        registerDependency(this.exceptionInputDep);
        
        this.objectDep = new ObjectSmDependency();
        this.objectDep.init("Object", this, metamodel.getMClass("Attribute"), 0, -1 , SmDirective.SMCDDYNAMIC);
        registerDependency(this.objectDep);
        
        this.bpmnMessageRefsDep = new BpmnMessageRefsSmDependency();
        this.bpmnMessageRefsDep.init("BpmnMessageRefs", this, metamodel.getMClass("BpmnMessage"), 0, -1 , SmDirective.SMCDDYNAMIC);
        registerDependency(this.bpmnMessageRefsDep);
        
        this.sRepresentationDep = new SRepresentationSmDependency();
        this.sRepresentationDep.init("SRepresentation", this, metamodel.getMClass("Signal"), 0, -1 , SmDirective.SMCDDYNAMIC);
        registerDependency(this.sRepresentationDep);
        
        this.bpmnItemDefinitionRefsDep = new BpmnItemDefinitionRefsSmDependency();
        this.bpmnItemDefinitionRefsDep.init("BpmnItemDefinitionRefs", this, metamodel.getMClass("BpmnItemDefinition"), 0, -1 );
        registerDependency(this.bpmnItemDefinitionRefsDep);
        
        this.occurenceObjectNodeDep = new OccurenceObjectNodeSmDependency();
        this.occurenceObjectNodeDep.init("OccurenceObjectNode", this, metamodel.getMClass("ObjectNode"), 0, -1 , SmDirective.SMCDDYNAMIC);
        registerDependency(this.occurenceObjectNodeDep);
        
        this.bpmnItemAwareRefsDep = new BpmnItemAwareRefsSmDependency();
        this.bpmnItemAwareRefsDep.init("BpmnItemAwareRefs", this, metamodel.getMClass("BpmnItemAwareElement"), 0, -1 , SmDirective.SMCDDYNAMIC);
        registerDependency(this.bpmnItemAwareRefsDep);
    }

    @objid ("d440b3e0-3194-451e-ad92-dbc91f152296")
    public SmAttribute getIsElementaryAtt() {
        if (this.isElementaryAtt == null) {
        	this.isElementaryAtt = this.getAttributeDef("IsElementary");
        }
        return this.isElementaryAtt;
    }

    @objid ("d2585efc-bcd9-48a5-88f6-7dd55baabb47")
    public SmDependency getBpmnInterfaceRefsDep() {
        if (this.bpmnInterfaceRefsDep == null) {
        	this.bpmnInterfaceRefsDep = this.getDependencyDef("BpmnInterfaceRefs");
        }
        return this.bpmnInterfaceRefsDep;
    }

    @objid ("eb234bb8-0e61-4b82-8b03-5b99a27dec51")
    public SmDependency getOccurenceDep() {
        if (this.occurenceDep == null) {
        	this.occurenceDep = this.getDependencyDef("Occurence");
        }
        return this.occurenceDep;
    }

    @objid ("9e233794-2189-4d6b-9e8a-07293b07b126")
    public SmDependency getExceptionInputDep() {
        if (this.exceptionInputDep == null) {
        	this.exceptionInputDep = this.getDependencyDef("ExceptionInput");
        }
        return this.exceptionInputDep;
    }

    @objid ("f2ca15a9-81b1-4921-96aa-9edfb5c00333")
    public SmDependency getObjectDep() {
        if (this.objectDep == null) {
        	this.objectDep = this.getDependencyDef("Object");
        }
        return this.objectDep;
    }

    @objid ("4d57fdb4-5691-4a03-a9a4-a1833a352f74")
    public SmDependency getBpmnMessageRefsDep() {
        if (this.bpmnMessageRefsDep == null) {
        	this.bpmnMessageRefsDep = this.getDependencyDef("BpmnMessageRefs");
        }
        return this.bpmnMessageRefsDep;
    }

    @objid ("252cde08-563f-446a-a96e-ad028bff9d11")
    public SmDependency getSRepresentationDep() {
        if (this.sRepresentationDep == null) {
        	this.sRepresentationDep = this.getDependencyDef("SRepresentation");
        }
        return this.sRepresentationDep;
    }

    @objid ("0b7aa4d8-4c3d-4994-95fd-0e6cc5948ad8")
    public SmDependency getBpmnItemDefinitionRefsDep() {
        if (this.bpmnItemDefinitionRefsDep == null) {
        	this.bpmnItemDefinitionRefsDep = this.getDependencyDef("BpmnItemDefinitionRefs");
        }
        return this.bpmnItemDefinitionRefsDep;
    }

    @objid ("6811840e-0414-4807-b5f4-f7ae01defca0")
    public SmDependency getOccurenceObjectNodeDep() {
        if (this.occurenceObjectNodeDep == null) {
        	this.occurenceObjectNodeDep = this.getDependencyDef("OccurenceObjectNode");
        }
        return this.occurenceObjectNodeDep;
    }

    @objid ("50bd6221-392c-4de7-aa85-703fba58e283")
    public SmDependency getBpmnItemAwareRefsDep() {
        if (this.bpmnItemAwareRefsDep == null) {
        	this.bpmnItemAwareRefsDep = this.getDependencyDef("BpmnItemAwareRefs");
        }
        return this.bpmnItemAwareRefsDep;
    }

    @objid ("a50b7414-db08-4607-b62c-b22a880b7d75")
    private static class GeneralClassObjectFactory implements ISmObjectFactory {
        @objid ("c092a6b3-5516-48cd-a764-68f7043f8b40")
        private GeneralClassSmClass smClass;

        @objid ("df9f0f3f-fdf8-4bfe-bce9-fa29d7070393")
        public GeneralClassObjectFactory(GeneralClassSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("17e096ae-68f5-460d-a9a7-a27656277a14")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("b1041dc7-d41e-4213-badf-2c13edfd78da")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("ce69c68f-3064-4238-9a57-070ad1705de5")
    public static class IsElementarySmAttribute extends SmAttribute {
        @objid ("ca959a84-16f2-499c-ba65-67026f5f1132")
        public Object getValue(ISmObjectData data) {
            return ((GeneralClassData) data).mIsElementary;
        }

        @objid ("f9009801-fb07-4d01-b6c0-4f3eb8a2355a")
        public void setValue(ISmObjectData data, Object value) {
            ((GeneralClassData) data).mIsElementary = value;
        }

    }

    @objid ("878c4471-7aa7-4c47-8851-38f7d0b82078")
    public static class BpmnInterfaceRefsSmDependency extends SmMultipleDependency {
        @objid ("7e73b16b-0f27-4bc9-be1a-9303ae26460d")
        private SmDependency symetricDep;

        @objid ("242b6f17-ccac-449e-8f82-0a7c3783f6da")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GeneralClassData)data).mBpmnInterfaceRefs != null)? ((GeneralClassData)data).mBpmnInterfaceRefs:SmMultipleDependency.EMPTY;
        }

        @objid ("8f120e75-918b-4fb9-85d3-6cd7cae5e8a6")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GeneralClassData) data).mBpmnInterfaceRefs = values;
        }

        @objid ("b5c7c7d7-7855-4d0c-970b-5c70fc84e46d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnInterfaceSmClass)this.getTarget()).getImplementationRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b606a6c3-0a1d-4bd1-b49e-ecb46174617d")
    public static class OccurenceSmDependency extends SmMultipleDependency {
        @objid ("79e64d40-8492-45ef-960b-316a32fdcbd0")
        private SmDependency symetricDep;

        @objid ("c11e64d1-4361-4476-a9d0-74932b59fc89")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GeneralClassData)data).mOccurence != null)? ((GeneralClassData)data).mOccurence:SmMultipleDependency.EMPTY;
        }

        @objid ("1b334075-12da-4d99-8ee3-a9594d6feffc")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GeneralClassData) data).mOccurence = values;
        }

        @objid ("a5f2df08-6762-4954-b04b-d98b23bf9eda")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ParameterSmClass)this.getTarget()).getTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b6814abe-94a6-401f-aacd-e2181f3f3048")
    public static class ExceptionInputSmDependency extends SmSingleDependency {
        @objid ("3090aa7f-ce56-4b51-94c6-4dbb12b7b26b")
        private SmDependency symetricDep;

        @objid ("78909fae-0f84-4a45-8e8d-54008c0d5ca2")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GeneralClassData) data).mExceptionInput;
        }

        @objid ("177b8dbe-003b-42aa-ad7f-d8f515720cf6")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GeneralClassData) data).mExceptionInput = value;
        }

        @objid ("33c06c58-b14b-41c3-bef4-6e311232747b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExceptionHandlerSmClass)this.getTarget()).getExceptionTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("264ce0b8-4e0f-4104-b962-05c729b5ce10")
    public static class ObjectSmDependency extends SmMultipleDependency {
        @objid ("2ea43dea-c8e4-4efb-8791-23a79557979e")
        private SmDependency symetricDep;

        @objid ("43da89b1-644f-4e9d-b82e-523991b2d653")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GeneralClassData)data).mObject != null)? ((GeneralClassData)data).mObject:SmMultipleDependency.EMPTY;
        }

        @objid ("51b8f554-683f-42f8-b824-6297ae9abcb3")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GeneralClassData) data).mObject = values;
        }

        @objid ("cc7dfbd8-92c5-4d7f-a4d4-49a601cc0ddb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AttributeSmClass)this.getTarget()).getTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("595dd681-a991-4819-a111-10009b2c4fa0")
    public static class BpmnMessageRefsSmDependency extends SmMultipleDependency {
        @objid ("661eaeac-b9b9-4846-85b1-f0d314d465f5")
        private SmDependency symetricDep;

        @objid ("68bb8950-1cd0-4600-a749-36c63e614596")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GeneralClassData)data).mBpmnMessageRefs != null)? ((GeneralClassData)data).mBpmnMessageRefs:SmMultipleDependency.EMPTY;
        }

        @objid ("17ca3254-7578-4d28-b5af-d62201a3f5e9")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GeneralClassData) data).mBpmnMessageRefs = values;
        }

        @objid ("297a1eb3-43c5-4383-b493-7216a10184a6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageSmClass)this.getTarget()).getTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("bb63b43c-a5e7-4453-9b41-83c586142bca")
    public static class SRepresentationSmDependency extends SmMultipleDependency {
        @objid ("7978c3e7-7134-40a1-a851-257fc689fc3f")
        private SmDependency symetricDep;

        @objid ("cdabb4fc-14ca-457f-af26-f94504b44c6a")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GeneralClassData)data).mSRepresentation != null)? ((GeneralClassData)data).mSRepresentation:SmMultipleDependency.EMPTY;
        }

        @objid ("4e8d0ca2-1b42-4764-a009-fcbff9a17192")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GeneralClassData) data).mSRepresentation = values;
        }

        @objid ("bbab715e-f2ba-4ac7-a3ed-1498ba435ac2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((SignalSmClass)this.getTarget()).getBaseDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("eddbe823-dac6-461c-b16f-645f223deb28")
    public static class BpmnItemDefinitionRefsSmDependency extends SmMultipleDependency {
        @objid ("252e789c-8558-409d-888c-01d3e634ef5c")
        private SmDependency symetricDep;

        @objid ("6009aff6-a4f3-4b1a-8e32-3f7e1657d374")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GeneralClassData)data).mBpmnItemDefinitionRefs != null)? ((GeneralClassData)data).mBpmnItemDefinitionRefs:SmMultipleDependency.EMPTY;
        }

        @objid ("16323806-da2a-44d0-8eb7-5b815a454b21")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GeneralClassData) data).mBpmnItemDefinitionRefs = values;
        }

        @objid ("edcb948e-d6e5-4259-8aa9-24b1e94b6287")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnItemDefinitionSmClass)this.getTarget()).getStructureRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b17f5cde-dbf0-48d0-8859-45649e17743c")
    public static class OccurenceObjectNodeSmDependency extends SmMultipleDependency {
        @objid ("44d9508a-2fb3-4ea7-bb5e-f1a443c33f90")
        private SmDependency symetricDep;

        @objid ("9477d31c-e047-46d8-8e38-13efaf01800d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GeneralClassData)data).mOccurenceObjectNode != null)? ((GeneralClassData)data).mOccurenceObjectNode:SmMultipleDependency.EMPTY;
        }

        @objid ("45efc6fa-a6f5-4284-8c3c-f1ec7ad3e222")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GeneralClassData) data).mOccurenceObjectNode = values;
        }

        @objid ("011d369f-e9d5-40b2-87a9-dd3afe952093")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ObjectNodeSmClass)this.getTarget()).getTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("88691422-c8fb-4cf3-b4dd-970b6b03f338")
    public static class BpmnItemAwareRefsSmDependency extends SmMultipleDependency {
        @objid ("a62609cc-4ff6-4dc5-b27a-5b5a3bbb1ace")
        private SmDependency symetricDep;

        @objid ("a0b70dff-6a54-45e8-bef1-e1a39c07fa05")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GeneralClassData)data).mBpmnItemAwareRefs != null)? ((GeneralClassData)data).mBpmnItemAwareRefs:SmMultipleDependency.EMPTY;
        }

        @objid ("e0071d3c-a738-4724-bc82-8ea930003f50")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GeneralClassData) data).mBpmnItemAwareRefs = values;
        }

        @objid ("4118e767-90a4-4322-bbb9-c934eab57e33")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnItemAwareElementSmClass)this.getTarget()).getTypeDep();
            }
            return this.symetricDep;
        }

    }

}
