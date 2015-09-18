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
    @objid ("02eac3d7-80c1-42e5-ac17-42b7470f5196")
    @SmaMetaAssociation(metaName="ParticipantRefs", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.ParticipantRefsSmDependency.class)
     List<SmObjectImpl> mParticipantRefs = null;

    @objid ("19a67504-6653-4c3f-8267-269683916f3a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007ef086-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4c19a2ee-1dd0-423a-bc5a-df56eb19af33")
        private static SmClass smClass = null;

        @objid ("96f16535-d80e-4001-994b-2915ed98e3f0")
        private static SmDependency ParticipantRefsDep = null;

        @objid ("6b574e8f-1a20-4519-8fce-a261a55d4ad5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEndPointData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("69cae2b5-31c9-4058-a2f2-4e826f259638")
        public static SmDependency ParticipantRefsDep() {
            if (ParticipantRefsDep == null) {
            	ParticipantRefsDep = classof().getDependencyDef("ParticipantRefs");
            }
            return ParticipantRefsDep;
        }

        @objid ("28173055-f368-480c-8b7f-cc4c104e358e")
        public static SmDependency getParticipantRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantRefsDep;
        }

        @objid ("cf192ee5-b5ea-4bf7-9426-f92992872492")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007f4068-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("91d0ac46-30dd-4338-9eb9-93d19e0e452b")
            public ISmObjectData createData() {
                return new BpmnEndPointData();
            }

            @objid ("135a2e0a-d3f4-462f-975b-13170bb97fef")
            public SmObjectImpl createImpl() {
                return new BpmnEndPointImpl();
            }

        }

        @objid ("007fb336-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParticipantRefsSmDependency extends SmMultipleDependency {
            @objid ("3027329e-f509-4335-8a86-228f9b9256c7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnEndPointData)data).mParticipantRefs != null)? ((BpmnEndPointData)data).mParticipantRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("ff02f9fa-9b4f-4a20-9ad3-9d6010605a7c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnEndPointData) data).mParticipantRefs = new ArrayList<>(initialCapacity);
                return ((BpmnEndPointData) data).mParticipantRefs;
            }

            @objid ("9150c77f-9490-40dc-bb44-37fdefe169ab")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.EndPointRefsDep();
            }

        }

    }

}
