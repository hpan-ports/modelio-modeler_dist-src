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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityNodeData;
import org.modelio.metamodel.data.uml.behavior.activityModel.InterruptibleActivityRegionData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityEdgeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
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

@objid ("00275f10-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityEdge.class, factory=ActivityEdgeData.Metadata.ObjectFactory.class)
public abstract class ActivityEdgeData extends ModelElementData {
    @objid ("569dc38e-4a01-4bae-81c0-b39855b1b380")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("7be6224c-2c49-4e26-8a51-479ddfbd417a")
    @SmaMetaAttribute(metaName="Weight", type=String.class, smAttributeClass=Metadata.WeightSmAttribute.class)
     Object mWeight = "1";

    @objid ("f5a79b72-dc53-4843-9424-4ddaed86a751")
    @SmaMetaAssociation(metaName="Target", typeDataClass=ActivityNodeData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("6e276a30-bea6-4f45-a3f3-16ac9944fabb")
    @SmaMetaAssociation(metaName="Source", typeDataClass=ActivityNodeData.class, min=0, max=1, smAssociationClass=Metadata.SourceSmDependency.class)
     SmObjectImpl mSource;

    @objid ("c3db3e69-f72e-4f09-8119-3ea631cb45be")
    @SmaMetaAssociation(metaName="Interrupts", typeDataClass=InterruptibleActivityRegionData.class, min=0, max=1, smAssociationClass=Metadata.InterruptsSmDependency.class)
     SmObjectImpl mInterrupts;

    @objid ("7a224cbb-d234-477b-bf50-106433e66252")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("0522924a-1444-447d-a5a6-fe37872b041f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008b5eca-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("18460cf3-3ef3-4950-837e-14bb131538cc")
        private static SmClass smClass = null;

        @objid ("4764e47d-adf8-4035-ac69-5cd45eda23d4")
        private static SmAttribute GuardAtt = null;

        @objid ("889c5095-0e5d-44bc-a9e3-7f48264dd7f0")
        private static SmAttribute WeightAtt = null;

        @objid ("7712a7e9-f30b-4659-883f-18161c316191")
        private static SmDependency TargetDep = null;

        @objid ("6b556ee3-feab-449d-a0c3-7a578d081563")
        private static SmDependency SourceDep = null;

        @objid ("9014be57-12de-40c2-9d99-5e76613adf3d")
        private static SmDependency InterruptsDep = null;

        @objid ("e6f33d61-d055-4c81-8b56-9e8b822432de")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("ece2a918-fdee-4611-81bd-9eca089eea04")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityEdgeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ce230698-ee70-40d4-8e04-3627223e3ad6")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("44ebbab1-d55d-4216-867b-3270a2bfab3f")
        public static SmAttribute WeightAtt() {
            if (WeightAtt == null) {
            	WeightAtt = classof().getAttributeDef("Weight");
            }
            return WeightAtt;
        }

        @objid ("4d8c8709-e833-4a64-8a04-3ffe8651f198")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("c881005a-7256-4fc5-be9e-2e37afe69a2b")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("705173d9-1273-49ed-bf50-c61669c97fa5")
        public static SmDependency InterruptsDep() {
            if (InterruptsDep == null) {
            	InterruptsDep = classof().getDependencyDef("Interrupts");
            }
            return InterruptsDep;
        }

        @objid ("9483c1f2-0435-490d-be68-7bad27468fdf")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("599f0d83-c9d4-4c75-923b-3d1cb94bf850")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("140df100-c6e1-4eef-9c26-81a1ffa558c2")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("efeb46f7-16d4-418f-bcf3-f3ada8b6046b")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("3985bd72-cf21-4156-94e9-3bf311d53ccd")
        public static SmDependency getInterruptsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InterruptsDep;
        }

        @objid ("115bb81f-921a-4270-87ad-6a7ee362d8bd")
        public static SmAttribute getWeightAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return WeightAtt;
        }

        @objid ("76b5c020-d40f-4083-844b-6c9553cb1970")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("ef963e79-de48-41f7-832b-7067c47e8cdd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008bb0f0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1db8be63-de3d-4430-8a1b-558498439ebe")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("71e00ebb-e38a-43fd-9da0-1d8eccebf096")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("008c23a0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("bfb712d2-c195-4ca6-a5eb-5353fab7e596")
            public Object getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mGuard;
            }

            @objid ("36509c2e-fff3-41f2-9ddd-9bb741f8431d")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityEdgeData) data).mGuard = value;
            }

        }

        @objid ("008c984e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class WeightSmAttribute extends SmAttribute {
            @objid ("0248b28e-398d-47f0-a0a2-3b3fefe08a56")
            public Object getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mWeight;
            }

            @objid ("34a0c3bc-82bc-4280-911d-edf03911aa19")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityEdgeData) data).mWeight = value;
            }

        }

        @objid ("008d0de2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("422566a2-b487-4bf7-b3c7-6797ff4351d5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mTarget;
            }

            @objid ("00baf9f5-de43-4ca5-af5b-87a5e9a348d2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityEdgeData) data).mTarget = value;
            }

            @objid ("e8758d4c-8560-4522-bfd2-ec5da61cfcc5")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.IncomingDep();
            }

        }

        @objid ("008d973a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("de6e8cf5-cf33-4589-a45d-7383e9281780")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mSource;
            }

            @objid ("21b0ae37-2cb3-48cd-b50a-a25bb8d70433")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityEdgeData) data).mSource = value;
            }

            @objid ("3fa82044-e54c-4f26-86f6-780a07414011")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OutgoingDep();
            }

        }

        @objid ("008e209c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InterruptsSmDependency extends SmSingleDependency {
            @objid ("8a373a4d-e4af-469b-b896-d28c6d86a942")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mInterrupts;
            }

            @objid ("7d09bee5-4b86-405b-bb67-ac3008331ff9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityEdgeData) data).mInterrupts = value;
            }

            @objid ("6ba212c5-3c83-44b5-8936-1c653688a915")
            @Override
            public SmDependency getSymetric() {
                return InterruptibleActivityRegionData.Metadata.InterruptingEdgeDep();
            }

        }

        @objid ("008e9f54-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("1efa4ca7-ab14-486a-a3ee-b31da0179d7d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityEdgeData)data).mRealizedInformationFlow != null)? ((ActivityEdgeData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("161b7d6b-12ee-4caa-b2c7-74026d17c6cf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityEdgeData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((ActivityEdgeData) data).mRealizedInformationFlow;
            }

            @objid ("fc9d290f-2840-434c-9698-2162a947a0b4")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingActivityEdgeDep();
            }

        }

    }

}
