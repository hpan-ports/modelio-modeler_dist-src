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
    @objid ("1aa31ef9-f323-4e07-a5e6-cbcc4cd31346")
    @SmaMetaAssociation(metaName="Defined", typeDataClass=BpmnEventData.class, min=0, max=1, smAssociationClass=Metadata.DefinedSmDependency.class)
     SmObjectImpl mDefined;

    @objid ("a63e4859-881c-4a95-8a8f-12115aa426c3")
    @SmaMetaAssociation(metaName="LoopRef", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=0, max=-1, smAssociationClass=Metadata.LoopRefSmDependency.class)
     List<SmObjectImpl> mLoopRef = null;

    @objid ("68e466b3-a220-4fe0-af24-01d1ce816c54")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0090d9e0-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7d494505-67ba-4c21-829b-4f853fd00ee9")
        private static SmClass smClass = null;

        @objid ("59fd8185-69ca-4336-871d-f066d4dd71ff")
        private static SmDependency DefinedDep = null;

        @objid ("35703a8c-b55f-4f95-bac6-168fe299a1e1")
        private static SmDependency LoopRefDep = null;

        @objid ("0318c106-ba7c-40f0-b3d3-e6af01c817ca")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("242705d3-d5ac-4a34-ae87-ad47ba4f5a40")
        public static SmDependency DefinedDep() {
            if (DefinedDep == null) {
            	DefinedDep = classof().getDependencyDef("Defined");
            }
            return DefinedDep;
        }

        @objid ("3b75e385-dee8-4a41-b894-33cc30c2543a")
        public static SmDependency LoopRefDep() {
            if (LoopRefDep == null) {
            	LoopRefDep = classof().getDependencyDef("LoopRef");
            }
            return LoopRefDep;
        }

        @objid ("6efbd777-07c0-400a-a2f0-64a0a44104bc")
        public static SmDependency getDefinedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedDep;
        }

        @objid ("9839bc89-74c9-4387-b007-88034c130eb8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4c52a936-5a3f-49b4-a02a-02ac8f3d3791")
        public static SmDependency getLoopRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopRefDep;
        }

        @objid ("009130ca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dab70f36-fd2f-4a5c-bb2e-8bd44befd246")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("db971123-6a74-4f83-982f-42cfdb9f18b2")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0091a442-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopRefSmDependency extends SmMultipleDependency {
            @objid ("1b1e2711-877a-4932-a1d8-19ed0758a406")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnEventDefinitionData)data).mLoopRef != null)? ((BpmnEventDefinitionData)data).mLoopRef:SmMultipleDependency.EMPTY;
            }

            @objid ("4a6addf7-0789-4a85-9b78-e9504f69ea29")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnEventDefinitionData) data).mLoopRef = new ArrayList<>(initialCapacity);
                return ((BpmnEventDefinitionData) data).mLoopRef;
            }

            @objid ("6f4bb7cf-b539-43f1-9414-43ad8c9d1c39")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionEventRefDep();
            }

        }

        @objid ("00921ada-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedSmDependency extends SmSingleDependency {
            @objid ("4ac502f0-7ae9-4f8c-98b3-ed5ca8833cf2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnEventDefinitionData) data).mDefined;
            }

            @objid ("15db47a1-35f9-4c8b-805c-1da644300a82")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnEventDefinitionData) data).mDefined = value;
            }

            @objid ("c07e3efe-935b-4ddc-bc79-9356eb0425ec")
            @Override
            public SmDependency getSymetric() {
                return BpmnEventData.Metadata.EventDefinitionsDep();
            }

        }

    }

}
