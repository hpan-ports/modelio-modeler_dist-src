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
    @objid ("3cd6ccac-e3b8-4282-b7e0-57d72fae28c8")
    @SmaMetaAssociation(metaName="ParticipantRefs", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.ParticipantRefsSmDependency.class)
     List<SmObjectImpl> mParticipantRefs = null;

    @objid ("ce44e7e1-fd1d-4b86-8ac3-7b3ea88693b4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007ef086-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b254193a-9989-403d-a175-b48262e78731")
        private static SmClass smClass = null;

        @objid ("9599eb6f-9031-42c9-9bac-7702791f1609")
        private static SmDependency ParticipantRefsDep = null;

        @objid ("2dfbaa06-ffc2-49ea-a603-03152983088d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEndPointData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("284d5cfc-5782-4c76-bc04-b38034c40b20")
        public static SmDependency ParticipantRefsDep() {
            if (ParticipantRefsDep == null) {
            	ParticipantRefsDep = classof().getDependencyDef("ParticipantRefs");
            }
            return ParticipantRefsDep;
        }

        @objid ("c5f93163-c6d2-4b0e-9dd8-6d239480760c")
        public static SmDependency getParticipantRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantRefsDep;
        }

        @objid ("912aa2cf-006d-429c-acda-9021a9404110")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007f4068-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0ab9fbeb-ea48-4432-a418-b830957a3b15")
            public ISmObjectData createData() {
                return new BpmnEndPointData();
            }

            @objid ("13ecd322-e8f2-4782-8983-97064ca96290")
            public SmObjectImpl createImpl() {
                return new BpmnEndPointImpl();
            }

        }

        @objid ("007fb336-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParticipantRefsSmDependency extends SmMultipleDependency {
            @objid ("4be3b185-6e1d-4307-9afc-f1329045c177")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnEndPointData)data).mParticipantRefs != null)? ((BpmnEndPointData)data).mParticipantRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("e5737b35-6e58-40a9-892f-9ce7ec340f4d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnEndPointData) data).mParticipantRefs = new ArrayList<>(initialCapacity);
                return ((BpmnEndPointData) data).mParticipantRefs;
            }

            @objid ("5fef652f-035b-452f-8ee6-4f9ee4e87a54")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.EndPointRefsDep();
            }

        }

    }

}
