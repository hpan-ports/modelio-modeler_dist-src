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
package org.modelio.metamodel.data.bpmn.bpmnService;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnService.BpmnEndPoint;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnEndPointImpl;
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

@objid ("000ef07e-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnEndPoint.class, factory=BpmnEndPointData.Metadata.ObjectFactory.class)
public class BpmnEndPointData extends BpmnRootElementData {
    @objid ("bc093456-c7d7-46e6-a83f-126907740a76")
    @SmaMetaAssociation(metaName="ParticipantRefs", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.ParticipantRefsSmDependency.class)
     List<SmObjectImpl> mParticipantRefs = null;

    @objid ("433d3bd0-18b9-4bfa-84d4-7db3865b7c4f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007ef086-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f110f5f0-87a0-4280-b924-b5522f0167fd")
        private static SmClass smClass = null;

        @objid ("66bd84d8-adca-4f0e-b1a5-0b5ef227b196")
        private static SmDependency ParticipantRefsDep = null;

        @objid ("7b03c4c0-68e4-497b-8c58-b71fde59c00a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEndPointData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5702a06f-369c-4ab9-9dae-1831da2374ce")
        public static SmDependency ParticipantRefsDep() {
            if (ParticipantRefsDep == null) {
            	ParticipantRefsDep = classof().getDependencyDef("ParticipantRefs");
            }
            return ParticipantRefsDep;
        }

        @objid ("839087fa-cfc4-4f39-9e0b-4966cefd14f1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d95798a0-071d-4cb5-9b51-ee38040b0325")
        public static SmDependency getParticipantRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantRefsDep;
        }

        @objid ("007f4068-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9b7cf5d7-9325-42b2-a15d-d4046a1dddcc")
            public ISmObjectData createData() {
                return new BpmnEndPointData();
            }

            @objid ("89dbdcd6-0543-4858-8290-e60b1db7c9ad")
            public SmObjectImpl createImpl() {
                return new BpmnEndPointImpl();
            }

        }

        @objid ("007fb336-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParticipantRefsSmDependency extends SmMultipleDependency {
            @objid ("646cd489-4944-4e71-a145-ddee87fa3c7d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnEndPointData)data).mParticipantRefs != null)? ((BpmnEndPointData)data).mParticipantRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("9518ac37-c06b-49b3-865f-ccba27068cd1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnEndPointData) data).mParticipantRefs = new ArrayList<>(initialCapacity);
                return ((BpmnEndPointData) data).mParticipantRefs;
            }

            @objid ("f880d034-b4f2-4f2b-a095-3b10d9fe986e")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.EndPointRefsDep();
            }

        }

    }

}
