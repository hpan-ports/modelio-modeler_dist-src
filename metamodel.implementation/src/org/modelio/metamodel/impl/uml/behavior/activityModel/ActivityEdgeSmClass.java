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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityNodeSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.InterruptibleActivityRegionSmClass;
import org.modelio.metamodel.impl.uml.informationFlow.InformationFlowSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
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

@objid ("8cf09d5a-5b45-402b-9ebd-b7d23239cb63")
public class ActivityEdgeSmClass extends ModelElementSmClass {
    @objid ("6821d268-29b2-49ec-a6e4-b50372e4c87d")
    private SmAttribute guardAtt;

    @objid ("18b35477-2f01-444c-a15f-3784fa71c24d")
    private SmAttribute weightAtt;

    @objid ("6ebfcea0-caab-437d-99a8-38e9fa15d7c2")
    private SmDependency targetDep;

    @objid ("24f86000-6994-4ae2-b38d-ece0704dcec7")
    private SmDependency sourceDep;

    @objid ("1c684d57-41c3-42cb-a975-3e1fe9517bf1")
    private SmDependency interruptsDep;

    @objid ("44a3ce7a-fbfc-4c95-826d-c24514b1f9ee")
    private SmDependency realizedInformationFlowDep;

    @objid ("e849d7ba-3fc2-44c6-a92c-be025a232530")
    public ActivityEdgeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("aa56365a-f176-46d7-9f3b-2c6914be66fb")
    @Override
    public String getName() {
        return "ActivityEdge";
    }

    @objid ("a43d061b-5116-4054-beb0-15bc4d0b42c1")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("612c014d-61cf-4755-8497-a8d9912bf61f")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ActivityEdge.class;
    }

    @objid ("05870ab2-8418-48eb-ba73-4bdb628ecd13")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("e21eb250-0479-4071-ba93-395c3374b6c2")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("4c622493-41d8-4e8a-a659-1333341926c6")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ActivityEdgeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.guardAtt = new GuardSmAttribute();
        this.guardAtt.init("Guard", this, String.class );
        registerAttribute(this.guardAtt);
        
        this.weightAtt = new WeightSmAttribute();
        this.weightAtt.init("Weight", this, String.class );
        registerAttribute(this.weightAtt);
        
        
        // Initialize and register the SmDependency
        this.targetDep = new TargetSmDependency();
        this.targetDep.init("Target", this, metamodel.getMClass("ActivityNode"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.targetDep);
        
        this.sourceDep = new SourceSmDependency();
        this.sourceDep.init("Source", this, metamodel.getMClass("ActivityNode"), 0, 1 );
        registerDependency(this.sourceDep);
        
        this.interruptsDep = new InterruptsSmDependency();
        this.interruptsDep.init("Interrupts", this, metamodel.getMClass("InterruptibleActivityRegion"), 0, 1 );
        registerDependency(this.interruptsDep);
        
        this.realizedInformationFlowDep = new RealizedInformationFlowSmDependency();
        this.realizedInformationFlowDep.init("RealizedInformationFlow", this, metamodel.getMClass("InformationFlow"), 0, -1 );
        registerDependency(this.realizedInformationFlowDep);
    }

    @objid ("e9580aee-47ac-41a9-9fa0-191580ecc1ac")
    public SmAttribute getGuardAtt() {
        if (this.guardAtt == null) {
        	this.guardAtt = this.getAttributeDef("Guard");
        }
        return this.guardAtt;
    }

    @objid ("6dc39f2c-e34d-407a-9dde-eb9a43eb9ab3")
    public SmAttribute getWeightAtt() {
        if (this.weightAtt == null) {
        	this.weightAtt = this.getAttributeDef("Weight");
        }
        return this.weightAtt;
    }

    @objid ("b1f88a2d-aa86-4847-9799-c9cce0124c57")
    public SmDependency getTargetDep() {
        if (this.targetDep == null) {
        	this.targetDep = this.getDependencyDef("Target");
        }
        return this.targetDep;
    }

    @objid ("1283a831-1839-4d9f-8627-2354910e846e")
    public SmDependency getSourceDep() {
        if (this.sourceDep == null) {
        	this.sourceDep = this.getDependencyDef("Source");
        }
        return this.sourceDep;
    }

    @objid ("d1d644de-0e39-43b8-9ebf-4ecc615f6e87")
    public SmDependency getInterruptsDep() {
        if (this.interruptsDep == null) {
        	this.interruptsDep = this.getDependencyDef("Interrupts");
        }
        return this.interruptsDep;
    }

    @objid ("d418b51b-1449-4e80-b432-e113ab521acd")
    public SmDependency getRealizedInformationFlowDep() {
        if (this.realizedInformationFlowDep == null) {
        	this.realizedInformationFlowDep = this.getDependencyDef("RealizedInformationFlow");
        }
        return this.realizedInformationFlowDep;
    }

    @objid ("f7bbae1f-53a7-45de-8cc3-cc89d4a38a40")
    private static class ActivityEdgeObjectFactory implements ISmObjectFactory {
        @objid ("4dfee9cf-dcb7-4365-a1d0-78e36b58f2da")
        private ActivityEdgeSmClass smClass;

        @objid ("eed7df32-dcbf-4565-8f64-6986e67afc2d")
        public ActivityEdgeObjectFactory(ActivityEdgeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("6f003058-1f51-4858-8467-2be117d2f578")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("3fa88bf9-c5ab-46df-9009-0d18697c370e")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("fc35bc53-2e09-400f-911d-6e58d364df6b")
    public static class GuardSmAttribute extends SmAttribute {
        @objid ("f6b0a0e1-14cc-48f8-8212-08df72ca028d")
        public Object getValue(ISmObjectData data) {
            return ((ActivityEdgeData) data).mGuard;
        }

        @objid ("2363a706-0753-4898-965c-d7e6d4e7f05b")
        public void setValue(ISmObjectData data, Object value) {
            ((ActivityEdgeData) data).mGuard = value;
        }

    }

    @objid ("5fd7094e-ae5e-4c7c-ad60-0760153c3b68")
    public static class WeightSmAttribute extends SmAttribute {
        @objid ("afaca6d7-037d-49e7-8eb6-5c06e236481b")
        public Object getValue(ISmObjectData data) {
            return ((ActivityEdgeData) data).mWeight;
        }

        @objid ("0efc859a-789e-4c5f-8503-6e0e184cde7b")
        public void setValue(ISmObjectData data, Object value) {
            ((ActivityEdgeData) data).mWeight = value;
        }

    }

    @objid ("14696610-e32e-4a29-a3c0-aa40049868eb")
    public static class TargetSmDependency extends SmSingleDependency {
        @objid ("a0e56c6d-4ba3-45f8-a9c8-ffd8bef327b4")
        private SmDependency symetricDep;

        @objid ("70b93591-dcb2-42a3-af28-e0f19e4818d6")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ActivityEdgeData) data).mTarget;
        }

        @objid ("c5206b87-0a55-4996-9443-d43013eddb7a")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ActivityEdgeData) data).mTarget = value;
        }

        @objid ("65ea26db-54d8-4b5d-878f-feea13a9d7f1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityNodeSmClass)this.getTarget()).getIncomingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a011e236-9c9d-4937-a408-6756d8b97ef6")
    public static class SourceSmDependency extends SmSingleDependency {
        @objid ("e4b75fa3-5a73-436a-b80c-a35d49ffaa7d")
        private SmDependency symetricDep;

        @objid ("13a4e7da-e98c-4ebc-849f-8151169e567a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ActivityEdgeData) data).mSource;
        }

        @objid ("98d71fc4-dbe0-413c-bbac-c638aeee395c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ActivityEdgeData) data).mSource = value;
        }

        @objid ("4e75060b-77ed-4a68-86f6-1694f85e89b6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityNodeSmClass)this.getTarget()).getOutgoingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("eb389ec6-16ae-4dd7-9fd7-e914e48a6186")
    public static class InterruptsSmDependency extends SmSingleDependency {
        @objid ("1bde10b3-fbec-48df-94d7-91fba9e4ca8d")
        private SmDependency symetricDep;

        @objid ("646f6e73-ec18-4e58-9356-f1f8c85cb348")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ActivityEdgeData) data).mInterrupts;
        }

        @objid ("511e788b-ded5-4992-ae0e-28872d7bf682")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ActivityEdgeData) data).mInterrupts = value;
        }

        @objid ("2755762e-72eb-4967-9380-67d850b41715")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InterruptibleActivityRegionSmClass)this.getTarget()).getInterruptingEdgeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9f773617-9802-4058-a8bb-eead90dca971")
    public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
        @objid ("d99158d0-667f-4027-a0c1-893ffbfa688c")
        private SmDependency symetricDep;

        @objid ("82c596b7-cc74-4fde-a0db-ac7b1ac7e6c9")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ActivityEdgeData)data).mRealizedInformationFlow != null)? ((ActivityEdgeData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
        }

        @objid ("80f93d82-fb25-4ab6-a1c7-22782e52c1ef")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ActivityEdgeData) data).mRealizedInformationFlow = values;
        }

        @objid ("d055e4b0-a7f2-475b-80dc-d2da66197641")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InformationFlowSmClass)this.getTarget()).getRealizingActivityEdgeDep();
            }
            return this.symetricDep;
        }

    }

}
