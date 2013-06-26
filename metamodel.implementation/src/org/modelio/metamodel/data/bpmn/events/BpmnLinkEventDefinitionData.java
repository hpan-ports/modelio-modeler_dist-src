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
import org.modelio.metamodel.bpmn.events.BpmnLinkEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnLinkEventDefinitionImpl;
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

@objid ("009084b8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnLinkEventDefinition.class, factory=BpmnLinkEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnLinkEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("e3088669-cc4b-4470-a424-0c2d8fe9d9c3")
    @SmaMetaAssociation(metaName="Source", typeDataClass=BpmnLinkEventDefinitionData.class, min=1, max=-1, smAssociationClass=Metadata.SourceSmDependency.class)
     List<SmObjectImpl> mSource = null;

    @objid ("0b8118ac-1480-4f75-896d-ad39d0ef2170")
    @SmaMetaAssociation(metaName="Target", typeDataClass=BpmnLinkEventDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("02977fbd-30ec-4c6f-ab39-b56a003cdcd1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00790e28-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9f29e8f8-0ca4-4a73-96d4-29040019499c")
        private static SmClass smClass = null;

        @objid ("7fdd367b-4b38-420a-8920-fee5dd603e4e")
        private static SmDependency SourceDep = null;

        @objid ("5f288c3f-c2a1-4f85-b023-e24b2240d2dc")
        private static SmDependency TargetDep = null;

        @objid ("7aa79d57-f167-4881-8cc7-09d297bbb4d5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLinkEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b57b2c6c-e475-4e29-900d-112612eacba9")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("bbea9a2b-066e-4f53-8bea-04cb90cbf218")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("7c3adb53-f5ee-4eae-8fcf-9fe209853783")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("55dc1445-207a-4166-b842-3e4fb594318b")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("a489231c-52a3-4f4c-b953-cf931ddd3b68")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00794fc8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e4bb75bf-810d-4f81-abdc-6185709edf77")
            public ISmObjectData createData() {
                return new BpmnLinkEventDefinitionData();
            }

            @objid ("b7deaf92-2718-4bd0-9b95-158e0d00aa92")
            public SmObjectImpl createImpl() {
                return new BpmnLinkEventDefinitionImpl();
            }

        }

        @objid ("0079b292-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("5fb3a932-1c31-40aa-85dc-b7f757234ccb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLinkEventDefinitionData) data).mTarget;
            }

            @objid ("15379069-e084-4119-8b1f-d0ffa8333235")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLinkEventDefinitionData) data).mTarget = value;
            }

            @objid ("1cadc564-d156-43fd-b9fa-0e02778e24f6")
            @Override
            public SmDependency getSymetric() {
                return BpmnLinkEventDefinitionData.Metadata.SourceDep();
            }

        }

        @objid ("007a2966-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SourceSmDependency extends SmMultipleDependency {
            @objid ("f33d55d0-d818-415a-ae90-f11e45a3e184")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnLinkEventDefinitionData)data).mSource != null)? ((BpmnLinkEventDefinitionData)data).mSource:SmMultipleDependency.EMPTY;
            }

            @objid ("7e9470cd-a386-4ebb-8c49-405c571c9f12")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnLinkEventDefinitionData) data).mSource = new ArrayList<>(initialCapacity);
                return ((BpmnLinkEventDefinitionData) data).mSource;
            }

            @objid ("03eb7956-f46f-427f-a86b-8efb69f54485")
            @Override
            public SmDependency getSymetric() {
                return BpmnLinkEventDefinitionData.Metadata.TargetDep();
            }

        }

    }

}
