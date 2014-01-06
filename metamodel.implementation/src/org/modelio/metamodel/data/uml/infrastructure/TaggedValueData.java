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
    @objid ("ad3b2009-5500-4a54-8e50-ef5edb183f83")
    @SmaMetaAssociation(metaName="Annoted", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.AnnotedSmDependency.class)
     SmObjectImpl mAnnoted;

    @objid ("2f0f91c0-1db4-431c-a0f8-ee322e086bad")
    @SmaMetaAssociation(metaName="Actual", typeDataClass=TagParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ActualSmDependency.class, component = true)
     List<SmObjectImpl> mActual = null;

    @objid ("439fa88b-2fc8-4021-84d2-ce76f918e1f0")
    @SmaMetaAssociation(metaName="Qualifier", typeDataClass=TagParameterData.class, min=0, max=1, smAssociationClass=Metadata.QualifierSmDependency.class, component = true)
     SmObjectImpl mQualifier;

    @objid ("12966f67-d285-46b2-be71-963b55adb590")
    @SmaMetaAssociation(metaName="Definition", typeDataClass=TagTypeData.class, min=1, max=1, smAssociationClass=Metadata.DefinitionSmDependency.class, partof = true)
     SmObjectImpl mDefinition;

    @objid ("6bb3e12c-56bb-4832-830d-a657d538c014")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00818b0c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("36274a92-1ed3-4056-9d93-096888984b74")
        private static SmClass smClass = null;

        @objid ("3a073a97-f2b1-4269-a781-bb7e038b22e2")
        private static SmDependency AnnotedDep = null;

        @objid ("9abf3469-faeb-4f31-adae-5a07e70ca1fb")
        private static SmDependency ActualDep = null;

        @objid ("d25c376b-954e-4aa3-8407-73de33a1b72c")
        private static SmDependency QualifierDep = null;

        @objid ("92503003-ffa3-42ba-8e73-9f62c3270fea")
        private static SmDependency DefinitionDep = null;

        @objid ("fa31e1b4-97bd-4772-abf7-1738725b2979")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TaggedValueData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2dd63ae9-214b-4bb2-8c63-9bb6d7028116")
        public static SmDependency AnnotedDep() {
            if (AnnotedDep == null) {
            	AnnotedDep = classof().getDependencyDef("Annoted");
            }
            return AnnotedDep;
        }

        @objid ("060e8085-1e20-4c0b-acca-6f6f0661ca0d")
        public static SmDependency ActualDep() {
            if (ActualDep == null) {
            	ActualDep = classof().getDependencyDef("Actual");
            }
            return ActualDep;
        }

        @objid ("87ca5e92-28c5-45af-bef5-bb32d295d8b9")
        public static SmDependency QualifierDep() {
            if (QualifierDep == null) {
            	QualifierDep = classof().getDependencyDef("Qualifier");
            }
            return QualifierDep;
        }

        @objid ("e8bb906f-4eef-4468-8b81-d122d511b86c")
        public static SmDependency DefinitionDep() {
            if (DefinitionDep == null) {
            	DefinitionDep = classof().getDependencyDef("Definition");
            }
            return DefinitionDep;
        }

        @objid ("79e297a3-8041-4f12-a03d-17e21cd65855")
        public static SmDependency getQualifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifierDep;
        }

        @objid ("3020d5f5-4c77-46eb-a9f0-1cd0b1474f56")
        public static SmDependency getDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinitionDep;
        }

        @objid ("758c363d-0b52-4368-a800-3207b6f7e1a2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("32f78f35-2a54-45cd-8163-32ed8b629af6")
        public static SmDependency getActualDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualDep;
        }

        @objid ("2b74da9b-397a-41b6-8107-82dac83c380d")
        public static SmDependency getAnnotedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnnotedDep;
        }

        @objid ("0081cc2a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("af1b6599-3edb-4337-a7b7-9820cdd4d000")
            public ISmObjectData createData() {
                return new TaggedValueData();
            }

            @objid ("dbb687ec-d9c9-4ba4-8266-136bb6692efa")
            public SmObjectImpl createImpl() {
                return new TaggedValueImpl();
            }

        }

        @objid ("00822eae-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AnnotedSmDependency extends SmSingleDependency {
            @objid ("5c75d134-2fad-4e02-b654-5ecedae443e4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TaggedValueData) data).mAnnoted;
            }

            @objid ("a8dab344-fb49-47c9-810e-b1a0fed66cd1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TaggedValueData) data).mAnnoted = value;
            }

            @objid ("0159afd2-b43c-47fe-9c55-c2c8b11bc4b6")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.TagDep();
            }

        }

        @objid ("0082a2b2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ActualSmDependency extends SmMultipleDependency {
            @objid ("3ebc9395-38da-4abd-8476-ca4fc8db53c4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TaggedValueData)data).mActual != null)? ((TaggedValueData)data).mActual:SmMultipleDependency.EMPTY;
            }

            @objid ("e275db35-f995-41a0-99da-841b2c5fc726")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TaggedValueData) data).mActual = new ArrayList<>(initialCapacity);
                return ((TaggedValueData) data).mActual;
            }

            @objid ("62e64e46-d3ac-497f-841d-62dd4b0e840c")
            @Override
            public SmDependency getSymetric() {
                return TagParameterData.Metadata.AnnotedDep();
            }

        }

        @objid ("008305c2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class QualifierSmDependency extends SmSingleDependency {
            @objid ("7828fafb-5e29-417b-a41a-286642ad3ec6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TaggedValueData) data).mQualifier;
            }

            @objid ("07e92e95-5250-4177-a504-93d3f2682a8f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TaggedValueData) data).mQualifier = value;
            }

            @objid ("d27c84cd-cd02-4206-850c-1ca4c3f2e670")
            @Override
            public SmDependency getSymetric() {
                return TagParameterData.Metadata.QualifiedDep();
            }

        }

        @objid ("00837bc4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinitionSmDependency extends SmSingleDependency {
            @objid ("b274773e-6a94-441d-9b9b-ba2e14b27692")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TaggedValueData) data).mDefinition;
            }

            @objid ("e07fe12b-a52a-4ae0-a41b-3b2d443c0779")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TaggedValueData) data).mDefinition = value;
            }

            @objid ("1596e180-ae3b-4f5e-b7b0-52c3b37fb5bc")
            @Override
            public SmDependency getSymetric() {
                return TagTypeData.Metadata.TagOccurenceDep();
            }

        }

    }

}
