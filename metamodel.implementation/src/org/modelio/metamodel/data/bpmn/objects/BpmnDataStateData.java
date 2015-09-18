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
    @objid ("784dc0ca-5ed0-4f25-b955-3e94eb9872aa")
    @SmaMetaAssociation(metaName="Item", typeDataClass=BpmnItemAwareElementData.class, min=1, max=1, smAssociationClass=Metadata.ItemSmDependency.class)
     SmObjectImpl mItem;

    @objid ("ae100797-4b99-4420-b7aa-ee8200f74ee6")
    @SmaMetaAssociation(metaName="UmlState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.UmlStateSmDependency.class, partof = true)
     SmObjectImpl mUmlState;

    @objid ("5beac4d6-bbfa-4ffd-ba59-a7f04f555c83")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000a4880-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4aec7715-2746-4da6-9cd5-e99266bb0619")
        private static SmClass smClass = null;

        @objid ("aa2fd040-e51f-4c55-a166-8c7f38f191f6")
        private static SmDependency ItemDep = null;

        @objid ("7ec1212b-c892-4aa7-82ea-8776a55de0d1")
        private static SmDependency UmlStateDep = null;

        @objid ("56f2f084-77f5-45e4-a9bc-a1e804b67b74")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("32443e97-3d3d-4ec3-9fdf-9031f7993ecc")
        public static SmDependency ItemDep() {
            if (ItemDep == null) {
            	ItemDep = classof().getDependencyDef("Item");
            }
            return ItemDep;
        }

        @objid ("e217d1cf-7deb-40e2-8ca5-811c5afa008e")
        public static SmDependency UmlStateDep() {
            if (UmlStateDep == null) {
            	UmlStateDep = classof().getDependencyDef("UmlState");
            }
            return UmlStateDep;
        }

        @objid ("eb426735-97b4-4873-bf2c-2323863c5ee6")
        public static SmDependency getUmlStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UmlStateDep;
        }

        @objid ("2a7ec3e8-c637-4cd8-b082-bdb29ad5d635")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2f16ca50-3b17-4ff4-a0a6-413fd03f1997")
        public static SmDependency getItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemDep;
        }

        @objid ("000a898a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f3172524-c149-431a-996a-7e802e53288f")
            public ISmObjectData createData() {
                return new BpmnDataStateData();
            }

            @objid ("f573cbc3-911c-4973-9983-02303e619961")
            public SmObjectImpl createImpl() {
                return new BpmnDataStateImpl();
            }

        }

        @objid ("000aebb4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class UmlStateSmDependency extends SmSingleDependency {
            @objid ("28597816-e574-48a8-9b45-d457565cb70c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataStateData) data).mUmlState;
            }

            @objid ("e7b19937-7e99-4087-99b9-4f51f2fe8550")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataStateData) data).mUmlState = value;
            }

            @objid ("57edcabb-4a5e-4f2b-8f07-11fde3f6ba94")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.BpmnDataStateRefsDep();
            }

        }

        @objid ("000b60b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ItemSmDependency extends SmSingleDependency {
            @objid ("4b64d3f1-a999-4420-92f8-6032ece3aef0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataStateData) data).mItem;
            }

            @objid ("6a0136a7-ee27-42fe-97ab-0deac5788471")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataStateData) data).mItem = value;
            }

            @objid ("54d357ff-b6b5-49d8-be40-a6e6be36586b")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.DataStateDep();
            }

        }

    }

}
