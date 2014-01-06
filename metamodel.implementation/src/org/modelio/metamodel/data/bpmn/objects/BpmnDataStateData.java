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
package org.modelio.metamodel.data.bpmn.objects;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataStateImpl;
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

@objid ("0008b3d0-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnDataState.class, factory=BpmnDataStateData.Metadata.ObjectFactory.class)
public class BpmnDataStateData extends BpmnBaseElementData {
    @objid ("64e8853c-eb58-46db-8548-85d92122d93a")
    @SmaMetaAssociation(metaName="Item", typeDataClass=BpmnItemAwareElementData.class, min=1, max=1, smAssociationClass=Metadata.ItemSmDependency.class)
     SmObjectImpl mItem;

    @objid ("28c4299a-3c05-45d0-b9ce-61889774f404")
    @SmaMetaAssociation(metaName="UmlState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.UmlStateSmDependency.class, partof = true)
     SmObjectImpl mUmlState;

    @objid ("0d4caa83-d6f3-4fcb-89a9-79db419152ec")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000a4880-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("84686a45-fe9c-490e-951c-390d0c019b84")
        private static SmClass smClass = null;

        @objid ("a94c15f9-87f3-4093-ac7a-29522697f5c9")
        private static SmDependency ItemDep = null;

        @objid ("ceaecd78-8b90-42e5-9a63-fd850d645365")
        private static SmDependency UmlStateDep = null;

        @objid ("a5248d30-0634-4f80-be94-dfab2fb0402b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a56e24c9-219b-4dcb-a06d-4272ff787294")
        public static SmDependency ItemDep() {
            if (ItemDep == null) {
            	ItemDep = classof().getDependencyDef("Item");
            }
            return ItemDep;
        }

        @objid ("ca69c10f-fa2a-4e97-a722-50d53dfa2637")
        public static SmDependency UmlStateDep() {
            if (UmlStateDep == null) {
            	UmlStateDep = classof().getDependencyDef("UmlState");
            }
            return UmlStateDep;
        }

        @objid ("d5e32b25-5285-4037-8c8b-01fd156b614f")
        public static SmDependency getUmlStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UmlStateDep;
        }

        @objid ("15fbabe1-aa94-4b15-8be5-3a9f52ea554b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6a4c19e3-68f4-43d3-bd00-81dd957c9798")
        public static SmDependency getItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemDep;
        }

        @objid ("000a898a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4fcc7bed-98c6-46ac-8588-416a3d68ff80")
            public ISmObjectData createData() {
                return new BpmnDataStateData();
            }

            @objid ("74d55855-bd92-40bb-a8a0-2616f873ab0b")
            public SmObjectImpl createImpl() {
                return new BpmnDataStateImpl();
            }

        }

        @objid ("000aebb4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class UmlStateSmDependency extends SmSingleDependency {
            @objid ("a683acba-bc45-4a57-b3aa-8a3e403fb618")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataStateData) data).mUmlState;
            }

            @objid ("56714054-5753-428b-951e-38528f9fc7a2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataStateData) data).mUmlState = value;
            }

            @objid ("defd7db3-c140-4ace-88d9-63640976e7cb")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.BpmnDataStateRefsDep();
            }

        }

        @objid ("000b60b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ItemSmDependency extends SmSingleDependency {
            @objid ("f34d7608-92ca-4863-b65c-0b735f504db4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataStateData) data).mItem;
            }

            @objid ("d14e6049-fd9c-4ff9-b134-a1846eabd877")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataStateData) data).mItem = value;
            }

            @objid ("a0a115de-7ba5-4a0a-8254-637ec1421148")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.DataStateDep();
            }

        }

    }

}
