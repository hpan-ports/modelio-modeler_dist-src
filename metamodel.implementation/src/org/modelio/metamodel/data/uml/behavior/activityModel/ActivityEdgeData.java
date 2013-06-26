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
    @objid ("f4a52c41-a949-4c1f-9be8-1794df7092f2")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("5039c75b-42e6-4397-86e4-8531834cf873")
    @SmaMetaAttribute(metaName="Weight", type=String.class, smAttributeClass=Metadata.WeightSmAttribute.class)
     Object mWeight = "1";

    @objid ("f330f0c3-7e91-4fd2-8735-7e35a3bc5afe")
    @SmaMetaAssociation(metaName="Target", typeDataClass=ActivityNodeData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("2bad3410-43dc-420d-a50e-29b69882cd8e")
    @SmaMetaAssociation(metaName="Source", typeDataClass=ActivityNodeData.class, min=0, max=1, smAssociationClass=Metadata.SourceSmDependency.class)
     SmObjectImpl mSource;

    @objid ("5f6a621a-52aa-4100-80b0-cbcb15f9c2ff")
    @SmaMetaAssociation(metaName="Interrupts", typeDataClass=InterruptibleActivityRegionData.class, min=0, max=1, smAssociationClass=Metadata.InterruptsSmDependency.class)
     SmObjectImpl mInterrupts;

    @objid ("acc56de0-5d2a-4d28-9135-ceb0d50c33bc")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("fdf2d197-0110-4b0c-8f02-e7ad2e0b188a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008b5eca-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0c148ec8-d689-4eaa-94ea-4f89d016599c")
        private static SmClass smClass = null;

        @objid ("97ecf895-a379-4d3d-bdf1-cddee9ac7cf7")
        private static SmAttribute GuardAtt = null;

        @objid ("2dbdba4b-c6b8-4ebc-a3ef-b038adf524cb")
        private static SmAttribute WeightAtt = null;

        @objid ("97936646-8137-4821-aced-6b7fe9ff4ea4")
        private static SmDependency TargetDep = null;

        @objid ("0216a32f-e816-4426-995d-d19f9017fb99")
        private static SmDependency SourceDep = null;

        @objid ("0b333546-933d-4d6c-8462-1f1f2d467b69")
        private static SmDependency InterruptsDep = null;

        @objid ("f9fa8b51-1103-4d99-89e3-8e399625be24")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("0e436a9a-c7c0-41f6-bc4a-40e10862fb01")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityEdgeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("962c7f09-5cca-49eb-ab33-e551c3643b9c")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("c7cc04a4-b77e-4336-8f15-8374080e005e")
        public static SmAttribute WeightAtt() {
            if (WeightAtt == null) {
            	WeightAtt = classof().getAttributeDef("Weight");
            }
            return WeightAtt;
        }

        @objid ("4196ab1b-cee6-4daf-b014-05e9b7f964a1")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("6c0eb276-05ce-4178-b240-a57a8ad0b222")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("f6fa0c65-d019-41db-a204-ad70c81ed194")
        public static SmDependency InterruptsDep() {
            if (InterruptsDep == null) {
            	InterruptsDep = classof().getDependencyDef("Interrupts");
            }
            return InterruptsDep;
        }

        @objid ("9a3305a9-92fe-4300-ba47-70734e50e673")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("ec68b552-a39c-42e9-9fa7-23aacf08898c")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("b2fd65f0-43bb-431f-8255-0f0af33229a0")
        public static SmDependency getInterruptsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InterruptsDep;
        }

        @objid ("09489ece-6363-4115-9134-425a547e69a2")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("060729e3-cd50-4d57-9235-55967ecb821e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3dd977ca-c385-4785-bea2-39761e680f92")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("fbf40305-e976-473f-829e-18b023de4325")
        public static SmAttribute getWeightAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return WeightAtt;
        }

        @objid ("bde7112d-4f97-409d-97a7-f0ef4a5883c5")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("008bb0f0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b4f01786-f9f3-430b-a1bd-395ddc506ae3")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("858f156d-a0fa-4e4c-a724-6fe5ce2ba992")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("008c23a0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("214d12b9-4e37-427b-83c9-8fd4ad9592fe")
            public Object getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mGuard;
            }

            @objid ("fe940ca2-7725-4452-aa3f-c6a4c99d40e3")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityEdgeData) data).mGuard = value;
            }

        }

        @objid ("008c984e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class WeightSmAttribute extends SmAttribute {
            @objid ("afc54f2c-8c84-49a8-801a-5af38358f1fe")
            public Object getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mWeight;
            }

            @objid ("d3b3dc06-f2c8-4ba5-86cd-6edda7f16ece")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityEdgeData) data).mWeight = value;
            }

        }

        @objid ("008d0de2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("ce92f9ce-b76a-4517-834f-8a6df374e3c4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mTarget;
            }

            @objid ("1fd0fb51-cabf-4710-812c-43492e1952e9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityEdgeData) data).mTarget = value;
            }

            @objid ("4684eecd-47fb-480d-be99-2a88d2024c32")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.IncomingDep();
            }

        }

        @objid ("008d973a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("237bce0d-4485-47ff-853a-3caf692f4c71")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mSource;
            }

            @objid ("f69294ec-7aa2-474c-bdac-1495b75f448b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityEdgeData) data).mSource = value;
            }

            @objid ("2038af9c-790a-48f5-bb17-0d565258199d")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OutgoingDep();
            }

        }

        @objid ("008e209c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InterruptsSmDependency extends SmSingleDependency {
            @objid ("bef506c4-7a9e-40e9-a984-5c927513af54")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityEdgeData) data).mInterrupts;
            }

            @objid ("02462005-f95b-4806-a73a-e374012aa31f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityEdgeData) data).mInterrupts = value;
            }

            @objid ("4f55336b-2b09-49c8-9ac6-edf261a1fce2")
            @Override
            public SmDependency getSymetric() {
                return InterruptibleActivityRegionData.Metadata.InterruptingEdgeDep();
            }

        }

        @objid ("008e9f54-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("d8154c9b-16d8-4d6d-832f-002511d44412")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityEdgeData)data).mRealizedInformationFlow != null)? ((ActivityEdgeData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("1394b9f5-d3e5-4f19-8857-83708c95d0ee")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityEdgeData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((ActivityEdgeData) data).mRealizedInformationFlow;
            }

            @objid ("c959e368-46fe-4b59-8676-ba4861fed69c")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingActivityEdgeDep();
            }

        }

    }

}
