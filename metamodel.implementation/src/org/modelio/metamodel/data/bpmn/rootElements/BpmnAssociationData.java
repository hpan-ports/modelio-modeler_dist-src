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
package org.modelio.metamodel.data.bpmn.rootElements;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociationDirection;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnAssociationImpl;
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

@objid ("00779282-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnAssociation.class, factory=BpmnAssociationData.Metadata.ObjectFactory.class)
public class BpmnAssociationData extends BpmnArtifactData {
    @objid ("72ef050b-ba76-4436-afa7-c9cc3b9c8de7")
    @SmaMetaAttribute(metaName="AssociationDirection", type=BpmnAssociationDirection.class, smAttributeClass=Metadata.AssociationDirectionSmAttribute.class)
     Object mAssociationDirection = BpmnAssociationDirection.NONEDIRECTION;

    @objid ("9d7ffbd8-0dc0-4c66-b4f0-2279211aca8d")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("835f3e3b-1adf-4a11-ad68-6941aa15c22f")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     SmObjectImpl mSourceRef;

    @objid ("6cc0c657-1454-45c9-89d6-1225e9d947c6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006bd8ca-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c04d5a49-3450-40c4-83ca-7f691ac40573")
        private static SmClass smClass = null;

        @objid ("637bf126-d48f-40ce-8f77-2be3d8d1b8ed")
        private static SmAttribute AssociationDirectionAtt = null;

        @objid ("ba323d6d-48c4-45b6-8a98-ab4412da22b3")
        private static SmDependency TargetRefDep = null;

        @objid ("f1a2376c-b91b-42ef-97b9-65b064f406e2")
        private static SmDependency SourceRefDep = null;

        @objid ("2339c68c-05f8-44fa-8590-21e4878c6ae7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a79154fc-68ab-4aa6-94d6-cf958554d259")
        public static SmAttribute AssociationDirectionAtt() {
            if (AssociationDirectionAtt == null) {
            	AssociationDirectionAtt = classof().getAttributeDef("AssociationDirection");
            }
            return AssociationDirectionAtt;
        }

        @objid ("a52eee88-5775-4044-b3c2-51c196e13fff")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("99184f14-46a4-49fd-988d-668eb2c38978")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("26c07995-7be2-4938-ab52-8124669f2be5")
        public static SmAttribute getAssociationDirectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociationDirectionAtt;
        }

        @objid ("8a92dcf0-bbc8-4a81-b4bf-c93de9f77b90")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("fe374cc8-8108-4925-a6a7-4ead8ff7d9dd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("39d55eff-79df-4936-8572-94932930302b")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("006c1b50-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("50d4e9bd-18eb-43d1-86f6-ced7a5552681")
            public ISmObjectData createData() {
                return new BpmnAssociationData();
            }

            @objid ("dad92c60-eb5b-45bf-a1de-1d90cfd7d775")
            public SmObjectImpl createImpl() {
                return new BpmnAssociationImpl();
            }

        }

        @objid ("006c7c94-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AssociationDirectionSmAttribute extends SmAttribute {
            @objid ("2cbd0bbf-743c-41fd-9805-e0a38cb29f93")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAssociationData) data).mAssociationDirection;
            }

            @objid ("36e2d0b2-31b7-41cd-8451-707f7d4ee9db")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAssociationData) data).mAssociationDirection = value;
            }

        }

        @objid ("006cdf4a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmSingleDependency {
            @objid ("8788fdca-f357-450c-b4ab-ba50e970810f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnAssociationData) data).mSourceRef;
            }

            @objid ("a173f7b8-0a4c-4155-820c-e145de8904f8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnAssociationData) data).mSourceRef = value;
            }

            @objid ("2201a6f0-b643-44b7-9c6d-ab27a6a38558")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.OutgoingAssocDep();
            }

        }

        @objid ("006d563c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("92e32efb-83b7-4d5a-83f3-9b8b9aedfffa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnAssociationData) data).mTargetRef;
            }

            @objid ("a1ea2ed3-8dce-47ef-abc1-628fe8e1a53f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnAssociationData) data).mTargetRef = value;
            }

            @objid ("ba150dda-8f69-43bc-888b-9fe82008f510")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.IncomingAssocDep();
            }

        }

    }

}
