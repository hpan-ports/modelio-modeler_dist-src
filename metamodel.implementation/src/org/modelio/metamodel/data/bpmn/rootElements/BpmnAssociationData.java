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
    @objid ("83af1ac8-5e3c-4fbe-a52f-dc386154924f")
    @SmaMetaAttribute(metaName="AssociationDirection", type=BpmnAssociationDirection.class, smAttributeClass=Metadata.AssociationDirectionSmAttribute.class)
     Object mAssociationDirection = BpmnAssociationDirection.NONEDIRECTION;

    @objid ("8ff9d0f5-43ff-49ec-9bb1-98b17d7a64d9")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("32bf5c96-18b3-4fbb-8d53-a8cf6cc19124")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     SmObjectImpl mSourceRef;

    @objid ("abbfda96-e285-42e6-8205-6cdabba02850")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006bd8ca-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f9f57cdd-719d-404f-abe0-fe38a8244e2e")
        private static SmClass smClass = null;

        @objid ("19f36931-0a5e-4353-b53a-fb30a5ffee2e")
        private static SmAttribute AssociationDirectionAtt = null;

        @objid ("cc5f7212-1d1d-4f8a-91c7-de495b95b87c")
        private static SmDependency TargetRefDep = null;

        @objid ("1c2c40c3-4c09-4e6d-a803-72c2a8fc13cf")
        private static SmDependency SourceRefDep = null;

        @objid ("0bdb3e86-096b-4049-9f5c-11861a469bc5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5f021edf-fa30-4763-885d-2af1b6827afc")
        public static SmAttribute AssociationDirectionAtt() {
            if (AssociationDirectionAtt == null) {
            	AssociationDirectionAtt = classof().getAttributeDef("AssociationDirection");
            }
            return AssociationDirectionAtt;
        }

        @objid ("15815e9c-11fe-4a66-b5ea-7e0fb69fe60c")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("56e713e2-cd96-4460-a118-83a8508e0249")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("24be4676-6624-426f-b29f-ff0f60420bd1")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("e00ad280-6e5c-432d-ae40-236d87fc92a1")
        public static SmAttribute getAssociationDirectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociationDirectionAtt;
        }

        @objid ("ac42e271-128e-4855-92b8-23c63386d7ca")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("6432c86f-d42e-467c-86f2-62ebf85ec351")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("006c1b50-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("89896875-9322-4d95-9724-369c7bc07ed3")
            public ISmObjectData createData() {
                return new BpmnAssociationData();
            }

            @objid ("e8d26a05-4f40-4991-bcb6-c75b50b22cdc")
            public SmObjectImpl createImpl() {
                return new BpmnAssociationImpl();
            }

        }

        @objid ("006c7c94-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AssociationDirectionSmAttribute extends SmAttribute {
            @objid ("ed9aa56f-00fb-4dad-90dc-0f1572340a2a")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAssociationData) data).mAssociationDirection;
            }

            @objid ("130c7a97-cc79-4f52-b16b-9f6297aadc98")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAssociationData) data).mAssociationDirection = value;
            }

        }

        @objid ("006cdf4a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmSingleDependency {
            @objid ("70189c54-7953-466c-b295-6f6a2ad04473")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnAssociationData) data).mSourceRef;
            }

            @objid ("a8ad53dc-c322-49e8-94af-88e122682dcb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnAssociationData) data).mSourceRef = value;
            }

            @objid ("445fbc13-5441-4b5c-85b0-126855192f8e")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.OutgoingAssocDep();
            }

        }

        @objid ("006d563c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("e77283a6-030c-4190-aace-d804f1e436f7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnAssociationData) data).mTargetRef;
            }

            @objid ("aa381404-61c6-4e1a-8f4e-e5e1ea0d4436")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnAssociationData) data).mTargetRef = value;
            }

            @objid ("b42dcfeb-b4a8-4db8-9e86-f47ce5ec3568")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.IncomingAssocDep();
            }

        }

    }

}
