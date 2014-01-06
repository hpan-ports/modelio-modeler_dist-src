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
    @objid ("620e7cde-64aa-44ac-bd78-d96116a80db1")
    @SmaMetaAttribute(metaName="AssociationDirection", type=BpmnAssociationDirection.class, smAttributeClass=Metadata.AssociationDirectionSmAttribute.class)
     Object mAssociationDirection = BpmnAssociationDirection.NONEDIRECTION;

    @objid ("5acf0cd6-04c2-4b29-9a59-395e116b3a8d")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("9049f5ad-6f4c-4020-b76a-f335ce5b4b9e")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     SmObjectImpl mSourceRef;

    @objid ("74cd9f91-985b-46b6-82d9-52743611f02a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006bd8ca-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("56ec25e5-1d7b-4a37-946e-117692522265")
        private static SmClass smClass = null;

        @objid ("f3403e0f-99f7-45f7-a0ce-3bf9693fef5e")
        private static SmAttribute AssociationDirectionAtt = null;

        @objid ("794f318b-1fb0-4f52-9aaa-aa2c96440d11")
        private static SmDependency TargetRefDep = null;

        @objid ("1d919326-e327-4348-8aa4-ce554e2eafbb")
        private static SmDependency SourceRefDep = null;

        @objid ("b0d243b5-192c-4b28-b939-c5cc0f38db34")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9a03921f-2b1c-4038-88d2-0080a5fbb07d")
        public static SmAttribute AssociationDirectionAtt() {
            if (AssociationDirectionAtt == null) {
            	AssociationDirectionAtt = classof().getAttributeDef("AssociationDirection");
            }
            return AssociationDirectionAtt;
        }

        @objid ("b9c68eee-b968-4500-b49c-10fa92888950")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("10874d8a-607e-4899-a1fb-448b723a5d53")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("b9a9bc3f-582d-4ad5-936e-9a6f5b42702c")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("4f74219a-269f-4466-a03f-3a972185fdbd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c3271f2b-c938-44f8-bfc2-da06153fa673")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("67f9c2dd-cefd-43af-8537-12797e86e56b")
        public static SmAttribute getAssociationDirectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociationDirectionAtt;
        }

        @objid ("006c1b50-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8a26b567-a3b0-4774-87a9-7b8ddd87a7fc")
            public ISmObjectData createData() {
                return new BpmnAssociationData();
            }

            @objid ("557b777f-0e73-4683-b7c2-b4e65c3c7278")
            public SmObjectImpl createImpl() {
                return new BpmnAssociationImpl();
            }

        }

        @objid ("006c7c94-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AssociationDirectionSmAttribute extends SmAttribute {
            @objid ("651cd8c6-18e5-4eaf-87f5-41ce1abe3ef7")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAssociationData) data).mAssociationDirection;
            }

            @objid ("9d348477-6659-4c64-a3d3-c46b84a18ca7")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAssociationData) data).mAssociationDirection = value;
            }

        }

        @objid ("006cdf4a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmSingleDependency {
            @objid ("f530ff23-1371-4e25-aea4-c233c7e6f59a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnAssociationData) data).mSourceRef;
            }

            @objid ("b134c46a-365f-45a2-8db4-b41f846ac2ed")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnAssociationData) data).mSourceRef = value;
            }

            @objid ("43c5c5bb-7bd2-4b31-948f-45e9dd2d1ccf")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.OutgoingAssocDep();
            }

        }

        @objid ("006d563c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("9ca107c6-48ba-4ffd-87ed-f33bd42868f4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnAssociationData) data).mTargetRef;
            }

            @objid ("54ac75ef-cfb0-494c-a4cf-98abd38a0278")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnAssociationData) data).mTargetRef = value;
            }

            @objid ("36177e59-e3d3-4737-a6c1-c2b7a10d2b84")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.IncomingAssocDep();
            }

        }

    }

}
