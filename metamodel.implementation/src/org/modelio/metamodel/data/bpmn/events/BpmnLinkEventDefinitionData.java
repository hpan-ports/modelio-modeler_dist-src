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
    @objid ("a87a58a7-a370-4d7e-9ec2-3f85b3b79898")
    @SmaMetaAssociation(metaName="Source", typeDataClass=BpmnLinkEventDefinitionData.class, min=1, max=-1, smAssociationClass=Metadata.SourceSmDependency.class)
     List<SmObjectImpl> mSource = null;

    @objid ("fb7bd981-7f05-4cda-879e-764bc7015793")
    @SmaMetaAssociation(metaName="Target", typeDataClass=BpmnLinkEventDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("5a2c8538-eff8-4050-8e77-0d1627397138")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00790e28-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("930bcda5-79da-4324-a92e-5ba89fc76e5e")
        private static SmClass smClass = null;

        @objid ("5548a797-cf31-475e-a9c6-d5d484a09b15")
        private static SmDependency SourceDep = null;

        @objid ("cfd1adcc-f031-4047-957b-1cd015798208")
        private static SmDependency TargetDep = null;

        @objid ("8b892250-4b56-42c4-9c8c-d11bef56b966")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLinkEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e8b38f69-3985-4069-a8cb-31f5037b9a62")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("42ca6c0a-1fc8-429d-842a-650fe16c021e")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("cd71a942-e9dd-4394-a5ef-610d92d64f8b")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("69a7ba99-9069-4df5-bac9-e703c56ace9c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a105a13d-6edf-4dd6-ad75-3ec737057437")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("00794fc8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d0667d05-0265-4556-b820-60ff75bf664d")
            public ISmObjectData createData() {
                return new BpmnLinkEventDefinitionData();
            }

            @objid ("e47d0a61-61b8-476a-bc3e-7c7ffccf0da3")
            public SmObjectImpl createImpl() {
                return new BpmnLinkEventDefinitionImpl();
            }

        }

        @objid ("0079b292-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("6f1dc379-2c38-4f31-a1bf-6006d2a3b6e3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLinkEventDefinitionData) data).mTarget;
            }

            @objid ("af15e5c3-019b-4bca-9bbd-bea1f568229b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLinkEventDefinitionData) data).mTarget = value;
            }

            @objid ("a70f8b88-5149-4aeb-b621-3abfddaaaf60")
            @Override
            public SmDependency getSymetric() {
                return BpmnLinkEventDefinitionData.Metadata.SourceDep();
            }

        }

        @objid ("007a2966-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SourceSmDependency extends SmMultipleDependency {
            @objid ("d407a08e-6244-4b76-87e1-0eb79464d14c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnLinkEventDefinitionData)data).mSource != null)? ((BpmnLinkEventDefinitionData)data).mSource:SmMultipleDependency.EMPTY;
            }

            @objid ("a289e62e-7517-4fd2-aaa1-f614a7a6d496")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnLinkEventDefinitionData) data).mSource = new ArrayList<>(initialCapacity);
                return ((BpmnLinkEventDefinitionData) data).mSource;
            }

            @objid ("523aa13f-f3f5-4942-9bda-974c08932ad9")
            @Override
            public SmDependency getSymetric() {
                return BpmnLinkEventDefinitionData.Metadata.TargetDep();
            }

        }

    }

}
