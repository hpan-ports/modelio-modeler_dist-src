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
    @objid ("73d65aed-02b7-4daf-b02e-59425344a35c")
    @SmaMetaAssociation(metaName="Source", typeDataClass=BpmnLinkEventDefinitionData.class, min=1, max=-1, smAssociationClass=Metadata.SourceSmDependency.class)
     List<SmObjectImpl> mSource = null;

    @objid ("0d17e051-e149-498d-8d94-be7e9478dd00")
    @SmaMetaAssociation(metaName="Target", typeDataClass=BpmnLinkEventDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("c27feb85-840f-419a-9987-a3e8312868d8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00790e28-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("38e2999b-54cf-4c5e-9e19-b5aab81391c6")
        private static SmClass smClass = null;

        @objid ("1d4fbe83-ebab-4da5-951d-292aac333a92")
        private static SmDependency SourceDep = null;

        @objid ("ca7e1be6-272e-4d15-9926-923fb0dfbff4")
        private static SmDependency TargetDep = null;

        @objid ("28f8b6e6-2ce7-4fdc-a8af-02aa7de98311")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLinkEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("557ab0d4-a9f2-4028-bfd3-51f9478b8e27")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("fe241739-4032-4aef-8a4b-5be97a966fbb")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("6b78f604-46a1-40ef-bf66-e96b18a19b51")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("eed247d0-db68-4d09-8796-b84ec708c3a1")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("b3bdad67-43b7-4c3b-b9fd-2e43dd5eae48")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("00794fc8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("10bd6877-c4a2-442c-a573-5746522606bb")
            public ISmObjectData createData() {
                return new BpmnLinkEventDefinitionData();
            }

            @objid ("569fa34f-a8af-4cbd-a83a-5c45ee18df1b")
            public SmObjectImpl createImpl() {
                return new BpmnLinkEventDefinitionImpl();
            }

        }

        @objid ("0079b292-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("8e7777d6-ce42-44bf-a16b-59febbd2eb14")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLinkEventDefinitionData) data).mTarget;
            }

            @objid ("f954b7c7-3d24-4940-9ef6-4ca083995739")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLinkEventDefinitionData) data).mTarget = value;
            }

            @objid ("92830bc0-e2d0-444c-97c3-ea72cf0355f5")
            @Override
            public SmDependency getSymetric() {
                return BpmnLinkEventDefinitionData.Metadata.SourceDep();
            }

        }

        @objid ("007a2966-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SourceSmDependency extends SmMultipleDependency {
            @objid ("5405448f-4598-45c7-ac81-7ad27d8a2de4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnLinkEventDefinitionData)data).mSource != null)? ((BpmnLinkEventDefinitionData)data).mSource:SmMultipleDependency.EMPTY;
            }

            @objid ("a29c6c94-0382-4fe0-bb14-aaba723717f1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnLinkEventDefinitionData) data).mSource = new ArrayList<>(initialCapacity);
                return ((BpmnLinkEventDefinitionData) data).mSource;
            }

            @objid ("9902148b-bfd9-4a69-ba92-39233110d5c0")
            @Override
            public SmDependency getSymetric() {
                return BpmnLinkEventDefinitionData.Metadata.TargetDep();
            }

        }

    }

}
