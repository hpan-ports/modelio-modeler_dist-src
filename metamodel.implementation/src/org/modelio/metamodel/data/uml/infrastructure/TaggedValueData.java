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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.TagParameterData;
import org.modelio.metamodel.data.uml.infrastructure.TagTypeData;
import org.modelio.metamodel.impl.uml.infrastructure.TaggedValueImpl;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
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

@objid ("00907a4a-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TaggedValue.class, factory=TaggedValueData.Metadata.ObjectFactory.class)
public class TaggedValueData extends ModelElementData {
    @objid ("407f8f6f-3fcf-433d-b4e0-be6c671504b9")
    @SmaMetaAssociation(metaName="Annoted", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.AnnotedSmDependency.class)
     SmObjectImpl mAnnoted;

    @objid ("3c0f9019-8954-412f-b590-f3e68dfa8f18")
    @SmaMetaAssociation(metaName="Actual", typeDataClass=TagParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ActualSmDependency.class, component = true)
     List<SmObjectImpl> mActual = null;

    @objid ("634f76f0-a57a-46b7-a9fe-a3f917380db1")
    @SmaMetaAssociation(metaName="Qualifier", typeDataClass=TagParameterData.class, min=0, max=1, smAssociationClass=Metadata.QualifierSmDependency.class, component = true)
     SmObjectImpl mQualifier;

    @objid ("2b075765-a115-46a2-ae9a-93b994039e33")
    @SmaMetaAssociation(metaName="Definition", typeDataClass=TagTypeData.class, min=1, max=1, smAssociationClass=Metadata.DefinitionSmDependency.class, partof = true)
     SmObjectImpl mDefinition;

    @objid ("38b7eb97-30f5-4e28-b127-5245c064deb2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00818b0c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("dc11366f-1725-498a-a71a-6c5be19c6fdd")
        private static SmClass smClass = null;

        @objid ("f3b2b8dd-fda0-4cd9-bb79-84b8bb36bb89")
        private static SmDependency AnnotedDep = null;

        @objid ("5ba91486-967f-4eaf-8fb6-f0e93cfa4119")
        private static SmDependency ActualDep = null;

        @objid ("d2753138-d256-4e9c-9287-7121e69bfa2e")
        private static SmDependency QualifierDep = null;

        @objid ("f806ac04-5433-410b-a60d-72bb4675265d")
        private static SmDependency DefinitionDep = null;

        @objid ("0b50b8a1-4286-458a-b592-046307b87e13")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TaggedValueData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a542bbaa-3bb6-4409-abd8-14ae3bf1bf10")
        public static SmDependency AnnotedDep() {
            if (AnnotedDep == null) {
            	AnnotedDep = classof().getDependencyDef("Annoted");
            }
            return AnnotedDep;
        }

        @objid ("dea86f7b-8869-4d27-8dc1-9d8c0b6cb74d")
        public static SmDependency ActualDep() {
            if (ActualDep == null) {
            	ActualDep = classof().getDependencyDef("Actual");
            }
            return ActualDep;
        }

        @objid ("ee06bfb7-7464-46e2-bf94-18d775b44f46")
        public static SmDependency QualifierDep() {
            if (QualifierDep == null) {
            	QualifierDep = classof().getDependencyDef("Qualifier");
            }
            return QualifierDep;
        }

        @objid ("2c2acbf9-a64b-42e3-b40f-e3d350b63236")
        public static SmDependency DefinitionDep() {
            if (DefinitionDep == null) {
            	DefinitionDep = classof().getDependencyDef("Definition");
            }
            return DefinitionDep;
        }

        @objid ("71c22743-044b-4fb7-bf45-cd2cfe95bd32")
        public static SmDependency getDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinitionDep;
        }

        @objid ("00b36953-c1f8-445f-acb3-dc8043610332")
        public static SmDependency getAnnotedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnnotedDep;
        }

        @objid ("f53cc1f2-17c2-4383-8034-bbac0b82b47f")
        public static SmDependency getActualDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualDep;
        }

        @objid ("0fe6b441-3374-4267-acfd-c27b58ac1461")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c62f1fcf-3ff8-4769-99ea-c9215a57bc1e")
        public static SmDependency getQualifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifierDep;
        }

        @objid ("0081cc2a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("88e210bb-e0eb-4195-859e-8dc2495ceb7c")
            public ISmObjectData createData() {
                return new TaggedValueData();
            }

            @objid ("1979ee61-ceaa-4f8e-9b97-42751e4b3be9")
            public SmObjectImpl createImpl() {
                return new TaggedValueImpl();
            }

        }

        @objid ("00822eae-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AnnotedSmDependency extends SmSingleDependency {
            @objid ("f9bdcaa6-7b24-4ee5-8a1d-3a0b1a176c41")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TaggedValueData) data).mAnnoted;
            }

            @objid ("ca12542d-fee7-40b2-bd69-9591c4b6cd5a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TaggedValueData) data).mAnnoted = value;
            }

            @objid ("73148318-d242-47d3-9964-846be7283e40")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.TagDep();
            }

        }

        @objid ("0082a2b2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ActualSmDependency extends SmMultipleDependency {
            @objid ("9b179c6b-10fd-4e0e-be79-488e54fc00aa")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TaggedValueData)data).mActual != null)? ((TaggedValueData)data).mActual:SmMultipleDependency.EMPTY;
            }

            @objid ("8c8621d1-a059-478a-9c62-1d2aa3203bdb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TaggedValueData) data).mActual = new ArrayList<>(initialCapacity);
                return ((TaggedValueData) data).mActual;
            }

            @objid ("9455b6b2-86fd-4778-b252-3f7635ddd440")
            @Override
            public SmDependency getSymetric() {
                return TagParameterData.Metadata.AnnotedDep();
            }

        }

        @objid ("008305c2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class QualifierSmDependency extends SmSingleDependency {
            @objid ("e2cb5fd6-19e2-476b-8ca3-f9f87bc0103a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TaggedValueData) data).mQualifier;
            }

            @objid ("69f49da0-f4d1-44f0-baea-da547e82c7db")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TaggedValueData) data).mQualifier = value;
            }

            @objid ("4a1c03e0-f448-46e9-aca3-fad1a0b332bc")
            @Override
            public SmDependency getSymetric() {
                return TagParameterData.Metadata.QualifiedDep();
            }

        }

        @objid ("00837bc4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinitionSmDependency extends SmSingleDependency {
            @objid ("45f6a4d6-aac9-491d-8f82-cea200d62c17")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TaggedValueData) data).mDefinition;
            }

            @objid ("fa0f30ce-4bf5-48c5-bd0f-a2592d6219d8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TaggedValueData) data).mDefinition = value;
            }

            @objid ("22f3cb74-171f-4064-95e9-f04cc7d74fcf")
            @Override
            public SmDependency getSymetric() {
                return TagTypeData.Metadata.TagOccurenceDep();
            }

        }

    }

}
