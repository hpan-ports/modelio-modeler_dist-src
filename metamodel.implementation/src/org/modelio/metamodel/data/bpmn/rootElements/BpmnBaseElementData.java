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
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageFlowData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnAssociationData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
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

@objid ("00783e94-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnBaseElement.class, factory=BpmnBaseElementData.Metadata.ObjectFactory.class)
public abstract class BpmnBaseElementData extends ModelElementData {
    @objid ("9fd6fcba-53f8-41ec-8a8c-eacf6736c3f1")
    @SmaMetaAssociation(metaName="OutgoingAssoc", typeDataClass=BpmnAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingAssocSmDependency.class)
     List<SmObjectImpl> mOutgoingAssoc = null;

    @objid ("aa459b8d-0be5-40ca-8035-7d1240024da5")
    @SmaMetaAssociation(metaName="IncomingAssoc", typeDataClass=BpmnAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingAssocSmDependency.class)
     List<SmObjectImpl> mIncomingAssoc = null;

    @objid ("3f14b547-ace7-4088-b1a2-938d2f92953c")
    @SmaMetaAssociation(metaName="IncomingFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingFlowSmDependency.class)
     List<SmObjectImpl> mIncomingFlow = null;

    @objid ("7326947c-d226-4311-9aea-a9568a9744a6")
    @SmaMetaAssociation(metaName="OutgoingFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingFlowSmDependency.class)
     List<SmObjectImpl> mOutgoingFlow = null;

    @objid ("e84d95a4-046b-4f77-872d-ac5a4c73c882")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004c525c-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2397f4a4-f2e6-4c9b-a07a-4805419ede5a")
        private static SmClass smClass = null;

        @objid ("75449f9d-fdb6-4066-b6c6-cf6bebe77bea")
        private static SmDependency OutgoingAssocDep = null;

        @objid ("9109d6cf-df15-4101-8b6d-d95bf6438e7c")
        private static SmDependency IncomingAssocDep = null;

        @objid ("c1b26cab-5501-45ed-9d68-d7401692514d")
        private static SmDependency IncomingFlowDep = null;

        @objid ("05145478-7161-4b5f-bbb7-fa978a1818f5")
        private static SmDependency OutgoingFlowDep = null;

        @objid ("1cab7ff1-53b8-4bd2-9416-de22b212e2eb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBaseElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b9410698-7769-40f8-84b4-ddb3bc14fc37")
        public static SmDependency OutgoingAssocDep() {
            if (OutgoingAssocDep == null) {
            	OutgoingAssocDep = classof().getDependencyDef("OutgoingAssoc");
            }
            return OutgoingAssocDep;
        }

        @objid ("553ad764-3442-484c-84df-0afa98802026")
        public static SmDependency IncomingAssocDep() {
            if (IncomingAssocDep == null) {
            	IncomingAssocDep = classof().getDependencyDef("IncomingAssoc");
            }
            return IncomingAssocDep;
        }

        @objid ("278f6d86-c3b4-4a78-9a9a-b22ffd0a264d")
        public static SmDependency IncomingFlowDep() {
            if (IncomingFlowDep == null) {
            	IncomingFlowDep = classof().getDependencyDef("IncomingFlow");
            }
            return IncomingFlowDep;
        }

        @objid ("cf1a74d1-69ab-4b65-8274-daccd20abd73")
        public static SmDependency OutgoingFlowDep() {
            if (OutgoingFlowDep == null) {
            	OutgoingFlowDep = classof().getDependencyDef("OutgoingFlow");
            }
            return OutgoingFlowDep;
        }

        @objid ("d82d1669-8e3b-4179-b34a-dc961f745581")
        public static SmDependency getIncomingFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingFlowDep;
        }

        @objid ("5d619a9f-f290-4891-9dc6-2ec94aa1e4ea")
        public static SmDependency getOutgoingAssocDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingAssocDep;
        }

        @objid ("964c9a8b-8337-4ca4-93b4-005b45aa263f")
        public static SmDependency getOutgoingFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingFlowDep;
        }

        @objid ("15e52235-6809-4db0-899e-f6c84ee4d792")
        public static SmDependency getIncomingAssocDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingAssocDep;
        }

        @objid ("30d28bc2-b804-48b8-89ef-b0bb04f1090b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("004c926c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("78d4e7a1-496e-47f1-bf7c-8aab514e41f6")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("f3aeb6e6-444b-406b-b006-7d0fa40eb897")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004cf446-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutgoingAssocSmDependency extends SmMultipleDependency {
            @objid ("2ccfd784-1c75-43e5-8487-2e4d2e569fe6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mOutgoingAssoc != null)? ((BpmnBaseElementData)data).mOutgoingAssoc:SmMultipleDependency.EMPTY;
            }

            @objid ("06bdd93d-0b61-4289-b6db-cb447459e794")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mOutgoingAssoc = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mOutgoingAssoc;
            }

            @objid ("5cd0335f-c960-4a67-96a6-b78b4d106031")
            @Override
            public SmDependency getSymetric() {
                return BpmnAssociationData.Metadata.SourceRefDep();
            }

        }

        @objid ("004d5530-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IncomingAssocSmDependency extends SmMultipleDependency {
            @objid ("4aba61e0-b19d-49cc-be6a-651eff0a0f15")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mIncomingAssoc != null)? ((BpmnBaseElementData)data).mIncomingAssoc:SmMultipleDependency.EMPTY;
            }

            @objid ("a8ec683c-247a-4032-85ba-5451704b080c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mIncomingAssoc = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mIncomingAssoc;
            }

            @objid ("5793236b-1479-48c9-818a-4d267d1646b2")
            @Override
            public SmDependency getSymetric() {
                return BpmnAssociationData.Metadata.TargetRefDep();
            }

        }

        @objid ("004db6ec-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IncomingFlowSmDependency extends SmMultipleDependency {
            @objid ("9ff317f2-49d8-4cdd-8607-596032a140d1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mIncomingFlow != null)? ((BpmnBaseElementData)data).mIncomingFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("b9a9bd7d-d8cd-4044-87fb-43330f8aab87")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mIncomingFlow = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mIncomingFlow;
            }

            @objid ("c1bb47e4-87b6-428a-bdab-283f231645af")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.TargetRefDep();
            }

        }

        @objid ("004e2366-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutgoingFlowSmDependency extends SmMultipleDependency {
            @objid ("65cbf654-abfc-4c2a-95c8-94ba5d9aeeb1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mOutgoingFlow != null)? ((BpmnBaseElementData)data).mOutgoingFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("5f7f2da5-b29c-48d1-831c-30fde0a2049b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mOutgoingFlow = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mOutgoingFlow;
            }

            @objid ("fd0a4801-7311-47b4-b22a-676015a6c63d")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.SourceRefDep();
            }

        }

    }

}
