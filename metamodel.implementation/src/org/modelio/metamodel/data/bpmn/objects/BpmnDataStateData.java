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
    @objid ("1a9b446a-dfef-4033-90c9-e099334a183c")
    @SmaMetaAssociation(metaName="Item", typeDataClass=BpmnItemAwareElementData.class, min=1, max=1, smAssociationClass=Metadata.ItemSmDependency.class)
     SmObjectImpl mItem;

    @objid ("c62521dc-e854-433b-aaa3-f157d48eee17")
    @SmaMetaAssociation(metaName="UmlState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.UmlStateSmDependency.class, partof = true)
     SmObjectImpl mUmlState;

    @objid ("dbe1835c-fbcc-4c30-ba0c-787c0ce62f48")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000a4880-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("db9ef31c-38be-4404-a2fc-b1f8d8afcc01")
        private static SmClass smClass = null;

        @objid ("1a9aea9d-e0b2-4e36-b3a3-66f0e75c1152")
        private static SmDependency ItemDep = null;

        @objid ("64320284-951a-40fc-b0f7-72d9cd84ef0b")
        private static SmDependency UmlStateDep = null;

        @objid ("aeb1d4ee-97af-48a3-a454-62ade7d8ddd5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("78222195-12da-42ee-9a91-479df3cde047")
        public static SmDependency ItemDep() {
            if (ItemDep == null) {
            	ItemDep = classof().getDependencyDef("Item");
            }
            return ItemDep;
        }

        @objid ("11d746e4-ee3b-45b8-8a15-daa40fc77c88")
        public static SmDependency UmlStateDep() {
            if (UmlStateDep == null) {
            	UmlStateDep = classof().getDependencyDef("UmlState");
            }
            return UmlStateDep;
        }

        @objid ("4d4a8c78-c9c1-4ac4-9fa8-99bd74b4d84d")
        public static SmDependency getUmlStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UmlStateDep;
        }

        @objid ("0a4dc916-fb34-42a2-8212-77b6d6726e58")
        public static SmDependency getItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemDep;
        }

        @objid ("f7be9a07-df31-4ad6-a4fd-2de519ebd5dc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000a898a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("32d6e7f6-b33b-4215-9421-f71af8fd0ee5")
            public ISmObjectData createData() {
                return new BpmnDataStateData();
            }

            @objid ("c34103bc-997e-4837-9730-e6bd1d2c819c")
            public SmObjectImpl createImpl() {
                return new BpmnDataStateImpl();
            }

        }

        @objid ("000aebb4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class UmlStateSmDependency extends SmSingleDependency {
            @objid ("a6d5da9b-975d-4533-a0f5-06d319b15ddf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataStateData) data).mUmlState;
            }

            @objid ("393ad082-11c8-47ba-859f-ccdf8063b0e3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataStateData) data).mUmlState = value;
            }

            @objid ("c9d878e1-0e1a-4cbc-bfd5-71e3f2d95b82")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.BpmnDataStateRefsDep();
            }

        }

        @objid ("000b60b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ItemSmDependency extends SmSingleDependency {
            @objid ("cfcbbcb6-43f9-4890-9c25-f28f41f69e47")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataStateData) data).mItem;
            }

            @objid ("374ecbf2-7356-49dd-9d71-dec7475b6ed9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataStateData) data).mItem = value;
            }

            @objid ("419c288c-b279-442d-b065-f71ba10e47a5")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.DataStateDep();
            }

        }

    }

}
