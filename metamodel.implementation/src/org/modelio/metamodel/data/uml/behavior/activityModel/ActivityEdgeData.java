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
    @objid ("288c065f-7130-4e65-b4c9-ad93d6c3c5c7")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("c81a68d4-26d3-4268-af78-40445f7d6b37")
    @SmaMetaAttribute(metaName="Weight", type=String.class, smAttributeClass=Metadata.WeightSmAttribute.class)
     Object mWeight = "1";

    @objid ("ce8960f4-111c-427f-bd3e-8e33608bbc15")
    @SmaMetaAssociation(metaName="Target", typeDataClass=ActivityNodeData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("2649411f-cf47-418a-aeea-46671172bf4b")
    @SmaMetaAssociation(metaName="Source", typeDataClass=ActivityNodeData.class, min=0, max=1, smAssociationClass=Metadata.SourceSmDependency.class)
     SmObjectImpl mSource;

    @objid ("1ed4c7fd-89c8-4d8e-a400-e2a2ab0f76cb")
    @SmaMetaAssociation(metaName="Interrupts", typeDataClass=InterruptibleActivityRegionData.class, min=0, max=1, smAssociationClass=Metadata.InterruptsSmDependency.class)
     SmObjectImpl mInterrupts;

    @objid ("983bcd15-c78a-49d9-8ae2-a45d7b2ea992")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("5e68565c-da48-4a0a-9349-c5829b813e13")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008b5eca-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f0a96cc0-7deb-4c6f-b559-c838649f266c")
        private static SmClass smClass = null;

        @objid ("6602ce58-3a17-4eb0-8cdf-620b026e4868")
        private static SmAttribute GuardAtt = null;

        @objid ("ea9d5271-e7e3-47cd-898e-7060ab0cb127")
        private static SmAttribute WeightAtt = null;

        @objid ("b27d8060-f964-4da8-8823-d0b552f0bc30")
        private static SmDependency TargetDep = null;

        @objid ("05a95e35-67d8-43f6-8d08-e8283fbf8471")
        private static SmDependency SourceDep = null;

        @objid ("e39a0ec4-a442-4ad6-a73f-cc519563a450")
        private static SmDependency InterruptsDep = null;

        @objid ("b78ec46d-08e8-4db5-98ee-ad74ad3ae5d4")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("be5e0e1a-5d5e-42fa-96a2-dd51a4a90013")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityEdgeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ae69bb3b-3136-44db-ab79-789ba63826d4")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("dc38516b-9d61-4dbd-b173-6670d3ebb033")
        public static SmAttribute WeightAtt() {
            if (WeightAtt == null) {
            	WeightAtt = classof().getAttributeDef("Weight");
            }
            return WeightAtt;
        }

        @objid ("bd181f14-217b-4fb2-a53d-7b614fd0511e")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("b75a62fa-055f-435a-8734-2f662f3ca1db")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("e97eae4c-0bb2-4e10-b10e-0502389416f1")
        public static SmDependency InterruptsDep() {
            if (InterruptsDep == null) {
            	InterruptsDep = classof().getDependencyDef("Interrupts");
            }
            return InterruptsDep;
        }

        @objid ("7581947f-7966-47ab-b760-564344adf75b")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("692da3d5-9898-4731-bb01-19630b2daf3c")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("fd77f8e9-efcd-4714-8a62-a08d71e4ab5c")
        public static SmAttribute getWeightAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return WeightAtt;
        }

        @objid ("e4c21103-05da-4b14-a0cb-21cef28b8d4b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("edba3e70-86e4-4ff1-9527-6b3b3d9af318")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("42ae1039-2fe2-4693-93da-a8c7f1086207")
        public static SmDependency getInterruptsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InterruptsDep;
        }

        @objid ("d6d5a8e9-614d-43b8-bcb7-6b047735587f")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("06a8b7ae-c591-4720-a0ed-784c24e2e601")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("008bb0f0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e5dab998-b816-466b-b7a4-1f0f06a92cd0")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("e1e9cadc-bfd9-47bb-992a-ba795ff059ce")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("008c23a0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("8d0db439-8afa-4abf-aa9d-aff81c39d134")
            public Object getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mGuard;
            }

            @objid ("54d217eb-9ea1-45a0-a481-c94bfc9e23d2")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityEdgeData) data).mGuard = value;
            }

        }

        @objid ("008c984e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class WeightSmAttribute extends SmAttribute {
            @objid ("705fb736-0ef8-4ecf-a7a2-d4cd9fd3c5bf")
            public Object getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mWeight;
            }

            @objid ("ccc0fc2f-1aea-4cba-9542-65084811f23d")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityEdgeData) data).mWeight = value;
            }

        }

        @objid ("008d0de2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("531a6c4e-1af5-4c60-895b-8a6a2a24bdf7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mTarget;
            }

            @objid ("4e13c34e-df3d-4b6d-ad0a-14a9c4a51561")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityEdgeData) data).mTarget = value;
            }

            @objid ("033ef444-61ad-495e-abf4-1ab045eb0328")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.IncomingDep();
            }

        }

        @objid ("008d973a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("9e0d827b-279e-4a73-aa4f-8d1e6e6d3572")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mSource;
            }

            @objid ("67e96685-e5f1-4b81-9679-629df14d7451")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityEdgeData) data).mSource = value;
            }

            @objid ("c9131524-91ec-4ebd-bc32-63a64f1f164c")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OutgoingDep();
            }

        }

        @objid ("008e209c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InterruptsSmDependency extends SmSingleDependency {
            @objid ("7da96285-c027-4629-ac6d-4e502c6d9a69")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mInterrupts;
            }

            @objid ("d3fa43ee-2ace-4d4e-8e01-36ad3e9dab14")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityEdgeData) data).mInterrupts = value;
            }

            @objid ("f14ee669-aec6-4edf-95a3-a77579a5a464")
            @Override
            public SmDependency getSymetric() {
                return InterruptibleActivityRegionData.Metadata.InterruptingEdgeDep();
            }

        }

        @objid ("008e9f54-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("ccb4268a-754e-4337-b434-0e0497e74780")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityEdgeData)data).mRealizedInformationFlow != null)? ((ActivityEdgeData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("3600c876-1c91-4207-a33d-4f1cbe63de93")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityEdgeData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((ActivityEdgeData) data).mRealizedInformationFlow;
            }

            @objid ("8f41b0ed-a7e8-4bb7-a1f9-b41a7692158e")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingActivityEdgeDep();
            }

        }

    }

}
