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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.activities.BpmnCallActivitySmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.CallBehaviorActionSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorParameterSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.EventSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.TransitionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.CollaborationSmClass;
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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

@objid ("263559ae-b792-4606-bc85-3bc49331fac4")
public class BehaviorSmClass extends ModelElementSmClass {
    @objid ("2a323c5c-dc36-46e4-b2ec-32afb682d3d0")
    private SmAttribute isReentrantAtt;

    @objid ("dc02c984-bb02-434b-8345-48ed362dedba")
    private SmDependency bpmnCallerDep;

    @objid ("152b5d21-9b27-4087-930b-b9d908e5ad08")
    private SmDependency ownerDep;

    @objid ("5a52c634-a305-46f9-85a0-1c85f226e69f")
    private SmDependency parameterDep;

    @objid ("a30c6cdb-3655-41e6-b2b9-1074bd15c3c5")
    private SmDependency ownerOperationDep;

    @objid ("c0b3bddf-9fc8-43a6-a8e3-8ef295a53757")
    private SmDependency ownedCollaborationDep;

    @objid ("1227c2d6-f12a-4a72-8d17-37edea81fc89")
    private SmDependency callerDep;

    @objid ("dba2c12b-c6a4-4c6b-9a0f-a661d10e7435")
    private SmDependency eComponentDep;

    @objid ("951b9b3a-2e83-4d48-8295-7f10df79339e")
    private SmDependency effectOfDep;

    @objid ("fda83fa4-2c3a-4dcb-8046-59393952a761")
    public BehaviorSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("4110b6bb-4242-4ada-8802-ede9f1f91ea9")
    @Override
    public String getName() {
        return "Behavior";
    }

    @objid ("eb02a096-70b6-4e57-9f4d-47c298d5ba60")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("e2c4e2f5-d0c8-4f66-8995-b2a304df1a87")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Behavior.class;
    }

    @objid ("2531dbd1-4ef8-4296-86b0-32b89ca91952")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("4ecafcf9-aaef-4a47-bc33-d97c6cb2b40a")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("7942c618-1cd9-4568-a725-61c86a2f577f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new BehaviorObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isReentrantAtt = new IsReentrantSmAttribute();
        this.isReentrantAtt.init("IsReentrant", this, Boolean.class );
        registerAttribute(this.isReentrantAtt);
        
        
        // Initialize and register the SmDependency
        this.bpmnCallerDep = new BpmnCallerSmDependency();
        this.bpmnCallerDep.init("BpmnCaller", this, metamodel.getMClass("BpmnCallActivity"), 0, -1 );
        registerDependency(this.bpmnCallerDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("NameSpace"), 0, 1 );
        registerDependency(this.ownerDep);
        
        this.parameterDep = new ParameterSmDependency();
        this.parameterDep.init("Parameter", this, metamodel.getMClass("BehaviorParameter"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.parameterDep);
        
        this.ownerOperationDep = new OwnerOperationSmDependency();
        this.ownerOperationDep.init("OwnerOperation", this, metamodel.getMClass("Operation"), 0, 1 );
        registerDependency(this.ownerOperationDep);
        
        this.ownedCollaborationDep = new OwnedCollaborationSmDependency();
        this.ownedCollaborationDep.init("OwnedCollaboration", this, metamodel.getMClass("Collaboration"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedCollaborationDep);
        
        this.callerDep = new CallerSmDependency();
        this.callerDep.init("Caller", this, metamodel.getMClass("CallBehaviorAction"), 0, -1 );
        registerDependency(this.callerDep);
        
        this.eComponentDep = new EComponentSmDependency();
        this.eComponentDep.init("EComponent", this, metamodel.getMClass("Event"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.eComponentDep);
        
        this.effectOfDep = new EffectOfSmDependency();
        this.effectOfDep.init("EffectOf", this, metamodel.getMClass("Transition"), 0, -1 );
        registerDependency(this.effectOfDep);
    }

    @objid ("3962c7ec-06cb-4083-a905-11066a7e8a01")
    public SmAttribute getIsReentrantAtt() {
        if (this.isReentrantAtt == null) {
        	this.isReentrantAtt = this.getAttributeDef("IsReentrant");
        }
        return this.isReentrantAtt;
    }

    @objid ("6f5c6113-7f33-4bb5-98cd-81c95236938a")
    public SmDependency getBpmnCallerDep() {
        if (this.bpmnCallerDep == null) {
        	this.bpmnCallerDep = this.getDependencyDef("BpmnCaller");
        }
        return this.bpmnCallerDep;
    }

    @objid ("c4ca7ef0-68fa-4f7c-b4f7-30088b9d953c")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("9a054ae6-0b65-47d7-9b26-def50013f414")
    public SmDependency getParameterDep() {
        if (this.parameterDep == null) {
        	this.parameterDep = this.getDependencyDef("Parameter");
        }
        return this.parameterDep;
    }

    @objid ("ecef1dcb-03a0-4c7d-95df-6e999ace312e")
    public SmDependency getOwnerOperationDep() {
        if (this.ownerOperationDep == null) {
        	this.ownerOperationDep = this.getDependencyDef("OwnerOperation");
        }
        return this.ownerOperationDep;
    }

    @objid ("a9d0eb19-9b1c-4619-9938-0b99419374ed")
    public SmDependency getOwnedCollaborationDep() {
        if (this.ownedCollaborationDep == null) {
        	this.ownedCollaborationDep = this.getDependencyDef("OwnedCollaboration");
        }
        return this.ownedCollaborationDep;
    }

    @objid ("314f5277-a73b-4abc-a3ce-c78ddbddaae7")
    public SmDependency getCallerDep() {
        if (this.callerDep == null) {
        	this.callerDep = this.getDependencyDef("Caller");
        }
        return this.callerDep;
    }

    @objid ("41002c01-2a28-4cb2-a1b4-26c9995509b3")
    public SmDependency getEComponentDep() {
        if (this.eComponentDep == null) {
        	this.eComponentDep = this.getDependencyDef("EComponent");
        }
        return this.eComponentDep;
    }

    @objid ("7b30217b-69ae-4365-9c5c-542ee2c05f9e")
    public SmDependency getEffectOfDep() {
        if (this.effectOfDep == null) {
        	this.effectOfDep = this.getDependencyDef("EffectOf");
        }
        return this.effectOfDep;
    }

    @objid ("32535ee1-13b1-416b-988c-6f07de74f729")
    private static class BehaviorObjectFactory implements ISmObjectFactory {
        @objid ("938dbe39-ef8d-4976-a47c-8d6272d62704")
        private BehaviorSmClass smClass;

        @objid ("999110d1-b557-4f64-a545-0c1329f9122f")
        public BehaviorObjectFactory(BehaviorSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("29a5c42a-204f-4b87-8cf1-410b2515aa86")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("b758d94b-0af7-4747-937b-dc33810f6394")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("21c00f8a-8172-4c56-ac8f-8b99e3e9f62b")
    public static class IsReentrantSmAttribute extends SmAttribute {
        @objid ("e03ecd82-6632-4ea4-8c9c-3cfde94bb7f9")
        public Object getValue(ISmObjectData data) {
            return ((BehaviorData) data).mIsReentrant;
        }

        @objid ("3afbe0b6-2abd-4f5c-86a0-22f2b9a63335")
        public void setValue(ISmObjectData data, Object value) {
            ((BehaviorData) data).mIsReentrant = value;
        }

    }

    @objid ("8b437b34-d337-4655-b210-7ca3f4ce9dac")
    public static class BpmnCallerSmDependency extends SmMultipleDependency {
        @objid ("67402bf5-860f-45c0-b143-c725dec54436")
        private SmDependency symetricDep;

        @objid ("0292206d-377a-4e02-a8e0-b0cca36de33b")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BehaviorData)data).mBpmnCaller != null)? ((BehaviorData)data).mBpmnCaller:SmMultipleDependency.EMPTY;
        }

        @objid ("7336a618-8b08-43da-adad-906c6b952fe5")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BehaviorData) data).mBpmnCaller = values;
        }

        @objid ("f3909585-f438-48ef-898d-66c71f9c90ce")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnCallActivitySmClass)this.getTarget()).getCalledBehaviorDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("43bed17d-2d14-4fc6-a92c-e26525f4ec26")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("90a6f85c-b7fa-4365-93a5-59de45e88e11")
        private SmDependency symetricDep;

        @objid ("ef40c2d0-68f8-4167-a2ac-10c50e0cb142")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BehaviorData) data).mOwner;
        }

        @objid ("074f87b2-3f9a-4244-a2a3-24f607f6bae5")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BehaviorData) data).mOwner = value;
        }

        @objid ("02b761e4-e681-466d-8c63-decd493d98d7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getOwnedBehaviorDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("98870336-45c2-43ed-815a-fe512e6dcabd")
    public static class ParameterSmDependency extends SmMultipleDependency {
        @objid ("9a2721d3-fca8-4f33-864e-1d5bb16b7afb")
        private SmDependency symetricDep;

        @objid ("0eab773c-43e0-4584-81cb-73759e6954ff")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BehaviorData)data).mParameter != null)? ((BehaviorData)data).mParameter:SmMultipleDependency.EMPTY;
        }

        @objid ("a82317d2-e30b-45c5-bcf9-2239d875d4d4")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BehaviorData) data).mParameter = values;
        }

        @objid ("6f258e08-f8cc-4ba3-9c4b-881695138a47")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BehaviorParameterSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("05934f1d-a851-4b76-acb4-2c1851d3cd44")
    public static class OwnerOperationSmDependency extends SmSingleDependency {
        @objid ("f90e779d-3cf7-4df3-95d6-642543d86399")
        private SmDependency symetricDep;

        @objid ("240712af-290f-40df-89b6-2bd675490fd0")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BehaviorData) data).mOwnerOperation;
        }

        @objid ("d6da1801-d660-4ea4-94b9-43013774d136")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BehaviorData) data).mOwnerOperation = value;
        }

        @objid ("db360c24-50ea-420a-961d-2af22cd9dc55")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getOwnedBehaviorDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b337b77e-3b60-46d1-bee9-df1e9e4b306a")
    public static class OwnedCollaborationSmDependency extends SmMultipleDependency {
        @objid ("521688ba-d935-42bd-bb1e-303ac8a58fd6")
        private SmDependency symetricDep;

        @objid ("40221be8-ffa4-4553-8f25-87463ac7cee2")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BehaviorData)data).mOwnedCollaboration != null)? ((BehaviorData)data).mOwnedCollaboration:SmMultipleDependency.EMPTY;
        }

        @objid ("b1c5024f-8357-4493-9c79-7e8cc4738ab4")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BehaviorData) data).mOwnedCollaboration = values;
        }

        @objid ("842bf24a-29da-4e5b-8305-660387b23cf8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CollaborationSmClass)this.getTarget()).getBRepresentedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("23f3a0f3-0bae-4dec-a9ce-248077a1a7a7")
    public static class CallerSmDependency extends SmMultipleDependency {
        @objid ("3fdeccce-db06-45e8-a762-fea7a44f3b73")
        private SmDependency symetricDep;

        @objid ("11455934-bb6b-46da-8f57-270a88ce5143")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BehaviorData)data).mCaller != null)? ((BehaviorData)data).mCaller:SmMultipleDependency.EMPTY;
        }

        @objid ("784feec6-cbc2-43ad-bcaf-4af2bac3b94a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BehaviorData) data).mCaller = values;
        }

        @objid ("6e9eecf8-e36c-4e0b-8323-2a21080138c0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CallBehaviorActionSmClass)this.getTarget()).getCalledDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d783cf99-3daf-4af4-970e-1edae1e03e64")
    public static class EComponentSmDependency extends SmMultipleDependency {
        @objid ("3f9f0435-d755-4326-9910-374d7adbd53e")
        private SmDependency symetricDep;

        @objid ("df2cc9db-1521-452b-81ea-a3e8a8639c50")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BehaviorData)data).mEComponent != null)? ((BehaviorData)data).mEComponent:SmMultipleDependency.EMPTY;
        }

        @objid ("eed33c8c-bf97-4ca4-986d-a22b70ab5af7")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BehaviorData) data).mEComponent = values;
        }

        @objid ("7854b22a-2fce-4a08-9e50-2dd0a2743916")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((EventSmClass)this.getTarget()).getComposedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0226d690-6331-45ee-b558-4bb9d11e383f")
    public static class EffectOfSmDependency extends SmMultipleDependency {
        @objid ("3eef89e2-f27d-4786-8e15-bcd3f1aeae66")
        private SmDependency symetricDep;

        @objid ("1740c43a-bd81-4753-9f0e-6d94aa309069")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BehaviorData)data).mEffectOf != null)? ((BehaviorData)data).mEffectOf:SmMultipleDependency.EMPTY;
        }

        @objid ("ee490c27-8630-43ed-a96b-89d7d5549263")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BehaviorData) data).mEffectOf = values;
        }

        @objid ("979b66c1-e4c6-4e0b-96be-ec3e1a12f86f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TransitionSmClass)this.getTarget()).getBehaviorEffectDep();
            }
            return this.symetricDep;
        }

    }

}
