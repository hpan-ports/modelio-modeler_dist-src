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
    @objid ("ca9942f6-7f72-4eac-8421-20e648a5469d")
    @SmaMetaAssociation(metaName="Defined", typeDataClass=BpmnEventData.class, min=0, max=1, smAssociationClass=Metadata.DefinedSmDependency.class)
     SmObjectImpl mDefined;

    @objid ("4f1bdcba-9e1b-41aa-90f0-8183b7611c56")
    @SmaMetaAssociation(metaName="LoopRef", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=0, max=-1, smAssociationClass=Metadata.LoopRefSmDependency.class)
     List<SmObjectImpl> mLoopRef = null;

    @objid ("64b4c365-6d2f-4613-a8bb-68772e07b7c2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0090d9e0-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f10d086a-d21a-4a41-8a3c-f6650e4b718f")
        private static SmClass smClass = null;

        @objid ("de45b40b-031d-48e5-8eb6-a765aac4e2a4")
        private static SmDependency DefinedDep = null;

        @objid ("84b33a87-00fb-49b9-834b-73b85c6d79c0")
        private static SmDependency LoopRefDep = null;

        @objid ("90183af3-fe36-4a22-9a4f-540c4640bf55")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9fc3d02f-d880-4f05-93ab-e14aca20c3e3")
        public static SmDependency DefinedDep() {
            if (DefinedDep == null) {
            	DefinedDep = classof().getDependencyDef("Defined");
            }
            return DefinedDep;
        }

        @objid ("0c788a1f-bc98-4cb7-913b-2c6cd41c5762")
        public static SmDependency LoopRefDep() {
            if (LoopRefDep == null) {
            	LoopRefDep = classof().getDependencyDef("LoopRef");
            }
            return LoopRefDep;
        }

        @objid ("cfa76d76-727f-4b98-9da8-65e95949e87f")
        public static SmDependency getDefinedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedDep;
        }

        @objid ("9e553883-20b9-438c-bdd4-85c310da82bd")
        public static SmDependency getLoopRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopRefDep;
        }

        @objid ("2783f2b1-bc6e-4d86-9d9d-76afcae319a4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("009130ca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("39d68ef5-57db-4d82-a1c2-f23d2ba4c7eb")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("fe75317c-4ae8-4bfe-b443-cfae2b134d15")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0091a442-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopRefSmDependency extends SmMultipleDependency {
            @objid ("20a97ab5-9dd6-4d8e-825c-5176106cb6cc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnEventDefinitionData)data).mLoopRef != null)? ((BpmnEventDefinitionData)data).mLoopRef:SmMultipleDependency.EMPTY;
            }

            @objid ("78179259-f6bc-4b37-a77c-d79f2f04f1f8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnEventDefinitionData) data).mLoopRef = new ArrayList<>(initialCapacity);
                return ((BpmnEventDefinitionData) data).mLoopRef;
            }

            @objid ("b12f0997-dcbd-48c4-b2bd-1fccb77bcc7b")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionEventRefDep();
            }

        }

        @objid ("00921ada-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedSmDependency extends SmSingleDependency {
            @objid ("1d6ac915-1e1e-42a3-8a97-294cc059b948")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnEventDefinitionData) data).mDefined;
            }

            @objid ("0e58fd1d-7dc7-42d1-9caf-3cd4ee00fc80")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnEventDefinitionData) data).mDefined = value;
            }

            @objid ("6467be51-bf1c-41eb-8272-a6fcf7b3f4d7")
            @Override
            public SmDependency getSymetric() {
                return BpmnEventData.Metadata.EventDefinitionsDep();
            }

        }

    }

}
