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
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.data.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsData;
import org.modelio.metamodel.data.bpmn.events.BpmnEventData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventDefinitionImpl;
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

@objid ("008db116-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnEventDefinition.class, factory=BpmnEventDefinitionData.Metadata.ObjectFactory.class)
public abstract class BpmnEventDefinitionData extends BpmnBaseElementData {
    @objid ("d57e3bec-65b6-4201-9518-fd148f20f40d")
    @SmaMetaAssociation(metaName="Defined", typeDataClass=BpmnEventData.class, min=0, max=1, smAssociationClass=Metadata.DefinedSmDependency.class)
     SmObjectImpl mDefined;

    @objid ("4b3c96a2-64c1-4dd3-9711-3d863c84bf38")
    @SmaMetaAssociation(metaName="LoopRef", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=0, max=-1, smAssociationClass=Metadata.LoopRefSmDependency.class)
     List<SmObjectImpl> mLoopRef = null;

    @objid ("f6084fe6-ba2d-44b8-b0bf-b188d1929e59")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0090d9e0-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7e398002-b284-487b-b168-8e30a45e8b2f")
        private static SmClass smClass = null;

        @objid ("ef3429de-c304-4505-a8c5-eb4d630e3a22")
        private static SmDependency DefinedDep = null;

        @objid ("aad978b0-3ac0-418f-973a-55e25f2c1345")
        private static SmDependency LoopRefDep = null;

        @objid ("8b61255d-defe-423b-adbd-b8c234aa89df")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e589614c-8491-4109-8b80-a74fcaf37f80")
        public static SmDependency DefinedDep() {
            if (DefinedDep == null) {
            	DefinedDep = classof().getDependencyDef("Defined");
            }
            return DefinedDep;
        }

        @objid ("3d0cdbfa-e978-4fbd-894c-a5a4bf2cbf7e")
        public static SmDependency LoopRefDep() {
            if (LoopRefDep == null) {
            	LoopRefDep = classof().getDependencyDef("LoopRef");
            }
            return LoopRefDep;
        }

        @objid ("db85257d-035f-4513-82dc-df394f7af4a8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("51d169cc-ae78-42bc-9dca-d213fdddb9a2")
        public static SmDependency getDefinedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedDep;
        }

        @objid ("70ead839-da1a-4c32-b9d6-f8ea8b644fae")
        public static SmDependency getLoopRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopRefDep;
        }

        @objid ("009130ca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("da5ff021-5d1d-4a94-900b-1c7d6549ce1a")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("5a710b1e-57b7-4a05-bb15-8b4048ed8adc")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0091a442-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopRefSmDependency extends SmMultipleDependency {
            @objid ("3fac0f4e-8bae-4ca1-8354-ed6d67df1dd7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnEventDefinitionData)data).mLoopRef != null)? ((BpmnEventDefinitionData)data).mLoopRef:SmMultipleDependency.EMPTY;
            }

            @objid ("08e3022b-f874-4d37-bf67-a657c89f093d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnEventDefinitionData) data).mLoopRef = new ArrayList<>(initialCapacity);
                return ((BpmnEventDefinitionData) data).mLoopRef;
            }

            @objid ("bfda7c78-bcfd-48c9-b511-13311ab48748")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionEventRefDep();
            }

        }

        @objid ("00921ada-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedSmDependency extends SmSingleDependency {
            @objid ("347bb493-9683-4fd1-8ae5-a7ecd89326d2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnEventDefinitionData) data).mDefined;
            }

            @objid ("5a6a1e42-59f0-460e-99d8-493994ec2bb2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnEventDefinitionData) data).mDefined = value;
            }

            @objid ("bee70cba-aab9-45c8-bdc9-a0d466bf1479")
            @Override
            public SmDependency getSymetric() {
                return BpmnEventData.Metadata.EventDefinitionsDep();
            }

        }

    }

}
