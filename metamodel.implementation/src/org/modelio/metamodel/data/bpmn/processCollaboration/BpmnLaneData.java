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
package org.modelio.metamodel.data.bpmn.processCollaboration;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneSetData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnLaneImpl;
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

@objid ("0074d240-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnLane.class, factory=BpmnLaneData.Metadata.ObjectFactory.class)
public class BpmnLaneData extends BpmnBaseElementData {
    @objid ("d2ff1b25-57ef-49a8-bb5d-c13b7730e585")
    @SmaMetaAssociation(metaName="ChildLaneSet", typeDataClass=BpmnLaneSetData.class, min=0, max=1, smAssociationClass=Metadata.ChildLaneSetSmDependency.class, component = true)
     SmObjectImpl mChildLaneSet;

    @objid ("f953145d-0395-4d01-ba21-c021fede5043")
    @SmaMetaAssociation(metaName="PartitionElement", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.PartitionElementSmDependency.class, partof = true)
     SmObjectImpl mPartitionElement;

    @objid ("02e118c3-f4a0-44ed-9a68-ac304739501b")
    @SmaMetaAssociation(metaName="FlowElementRef", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.FlowElementRefSmDependency.class, partof = true, istodelete = true)
     List<SmObjectImpl> mFlowElementRef = null;

    @objid ("db52c784-9df7-4436-8936-cfc9f3cc7a8f")
    @SmaMetaAssociation(metaName="LaneSet", typeDataClass=BpmnLaneSetData.class, min=1, max=1, smAssociationClass=Metadata.LaneSetSmDependency.class)
     SmObjectImpl mLaneSet;

    @objid ("e53ed654-cff3-4512-a759-40969c6e848d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004af650-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d7ed334a-5489-49fc-b806-711727c5313e")
        private static SmClass smClass = null;

        @objid ("4b63319c-6b1a-499b-8b2f-e291d6371468")
        private static SmDependency ChildLaneSetDep = null;

        @objid ("14613e5c-fea6-4fcc-8119-89fc7c0896de")
        private static SmDependency PartitionElementDep = null;

        @objid ("d1d5506b-9dce-4d4d-bb0a-248f0cd6e33a")
        private static SmDependency FlowElementRefDep = null;

        @objid ("1da7e601-0f25-419e-b12e-ea557f7bda13")
        private static SmDependency LaneSetDep = null;

        @objid ("e0a3040f-e5be-4d85-b182-d24bb9fc3871")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLaneData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f3134efa-ccfd-49e8-a0f5-70c77c1f3339")
        public static SmDependency ChildLaneSetDep() {
            if (ChildLaneSetDep == null) {
            	ChildLaneSetDep = classof().getDependencyDef("ChildLaneSet");
            }
            return ChildLaneSetDep;
        }

        @objid ("008d8fe6-c501-4746-9e59-ee856f486def")
        public static SmDependency PartitionElementDep() {
            if (PartitionElementDep == null) {
            	PartitionElementDep = classof().getDependencyDef("PartitionElement");
            }
            return PartitionElementDep;
        }

        @objid ("5eb726e8-6f94-4d69-92c2-d37ea836c130")
        public static SmDependency FlowElementRefDep() {
            if (FlowElementRefDep == null) {
            	FlowElementRefDep = classof().getDependencyDef("FlowElementRef");
            }
            return FlowElementRefDep;
        }

        @objid ("0ed479a6-fc21-4389-b4b8-89e9b08cb672")
        public static SmDependency LaneSetDep() {
            if (LaneSetDep == null) {
            	LaneSetDep = classof().getDependencyDef("LaneSet");
            }
            return LaneSetDep;
        }

        @objid ("a18d10bb-fb62-4042-bb3b-957e53704f78")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("22b6a5d7-7b7d-49c2-885e-4f108c9246d7")
        public static SmDependency getFlowElementRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FlowElementRefDep;
        }

        @objid ("52cf67d4-787d-4c62-becc-d61aa65f4ee6")
        public static SmDependency getPartitionElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PartitionElementDep;
        }

        @objid ("6f90b6f3-1931-4d04-9730-0d12ba4e1dd4")
        public static SmDependency getLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneSetDep;
        }

        @objid ("11b2b63e-c9ad-4b1d-bf79-faf051e860d7")
        public static SmDependency getChildLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChildLaneSetDep;
        }

        @objid ("004b3688-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ff68ff08-6b38-4bd8-8342-05922b04774a")
            public ISmObjectData createData() {
                return new BpmnLaneData();
            }

            @objid ("37c64bfe-6b95-4752-b3f3-4edc10aabfec")
            public SmObjectImpl createImpl() {
                return new BpmnLaneImpl();
            }

        }

        @objid ("004b97d6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ChildLaneSetSmDependency extends SmSingleDependency {
            @objid ("bb4db093-f8dc-4b05-b43a-d6c349fa7494")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneData) data).mChildLaneSet;
            }

            @objid ("2908e1de-4319-4126-8699-ee2b91135c26")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneData) data).mChildLaneSet = value;
            }

            @objid ("968e5952-f42d-4f68-8771-c14bf56dc360")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.ParentLaneDep();
            }

        }

        @objid ("004c0b30-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PartitionElementSmDependency extends SmSingleDependency {
            @objid ("a07d9bf3-61d1-44b7-8830-bba39c426932")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneData) data).mPartitionElement;
            }

            @objid ("1794d7bb-e8fa-4560-b114-ca208e096eef")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneData) data).mPartitionElement = value;
            }

            @objid ("3f5c7eda-2f6e-48e4-927c-8a08f607a106")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.BpmnLaneRefsDep();
            }

        }

        @objid ("004c7f0c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FlowElementRefSmDependency extends SmMultipleDependency {
            @objid ("7d175520-170b-4219-85a5-c14c0a2bbf28")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnLaneData)data).mFlowElementRef != null)? ((BpmnLaneData)data).mFlowElementRef:SmMultipleDependency.EMPTY;
            }

            @objid ("212e9efa-c754-464a-b77f-a0073e5fa041")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnLaneData) data).mFlowElementRef = new ArrayList<>(initialCapacity);
                return ((BpmnLaneData) data).mFlowElementRef;
            }

            @objid ("bc546f57-e6ca-4ca7-a2e8-9a2ffd25ce38")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.LaneDep();
            }

        }

        @objid ("004cf220-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LaneSetSmDependency extends SmSingleDependency {
            @objid ("156b4542-71ae-48f6-83bf-10c813bfe280")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneData) data).mLaneSet;
            }

            @objid ("00c812a2-088d-40e2-aa84-1e8d61ffa633")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneData) data).mLaneSet = value;
            }

            @objid ("bd867c16-9579-40cc-92c9-fafc71327efd")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.LaneDep();
            }

        }

    }

}
