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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.ClassAssociationData;
import org.modelio.metamodel.data.uml.statik.LinkData;
import org.modelio.metamodel.impl.uml.statik.AssociationImpl;
import org.modelio.metamodel.uml.statik.Association;
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

@objid ("60b053d8-9a17-42c3-83bc-888ce3e68a7d")
@SmaMetaClass(mmClass=Association.class, factory=AssociationData.Metadata.ObjectFactory.class)
public class AssociationData extends ModelElementData {
    @objid ("332f33f2-62e3-40e1-93c5-fecccc6f38df")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=LinkData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("4834f69a-59d4-4656-87bc-a4d8513d98d6")
    @SmaMetaAssociation(metaName="End", typeDataClass=AssociationEndData.class, min=2, max=2, smAssociationClass=Metadata.EndSmDependency.class)
     List<SmObjectImpl> mEnd = null;

    @objid ("e1611232-b10d-46a9-bd25-0cab662c5c14")
    @SmaMetaAssociation(metaName="LinkToClass", typeDataClass=ClassAssociationData.class, min=0, max=1, smAssociationClass=Metadata.LinkToClassSmDependency.class, component = true)
     SmObjectImpl mLinkToClass;

    @objid ("f8120e47-852f-497b-9f13-723c6b00ee02")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("32600112-9aaa-4552-95c6-cbae64b630dc")
    public static class Metadata {
        @objid ("9ae7945e-58f3-418d-8290-5c6aaf19dc2f")
        private static SmClass smClass = null;

        @objid ("dbe89143-8a6c-4c4f-9417-6f9b3394eb3b")
        private static SmDependency OccurenceDep = null;

        @objid ("4e59eef4-b56c-45ec-91bb-547e1a9aec20")
        private static SmDependency EndDep = null;

        @objid ("f92801c8-95ad-4576-ac28-77eb965048da")
        private static SmDependency LinkToClassDep = null;

        @objid ("0b65dfd0-ecd7-44f3-961c-a95bd4a0427e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9a60498c-ba81-4b47-b04b-4a4a874888ff")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("20039901-8fc5-4ac8-9fff-abff5e08cca9")
        public static SmDependency EndDep() {
            if (EndDep == null) {
            	EndDep = classof().getDependencyDef("End");
            }
            return EndDep;
        }

        @objid ("5c52b4e7-fe83-44d0-b207-d164eb35c597")
        public static SmDependency LinkToClassDep() {
            if (LinkToClassDep == null) {
            	LinkToClassDep = classof().getDependencyDef("LinkToClass");
            }
            return LinkToClassDep;
        }

        @objid ("be495548-06f5-46f1-89e9-c68e03ebe808")
        public static SmDependency getEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndDep;
        }

        @objid ("99871410-5cfc-43c2-bbc9-683ead3cc889")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("2d27f3f6-17ed-481a-9a08-857d5602426c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ce847ed1-f99a-42f0-87d9-5ea690d935a1")
        public static SmDependency getLinkToClassDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkToClassDep;
        }

        @objid ("a7dff537-813d-4f3b-a464-3d0e86192921")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c44e829f-71a7-469d-bd99-52ef35382472")
            public ISmObjectData createData() {
                return new AssociationData();
            }

            @objid ("622b34c5-f81d-4592-a6cc-cf7683db267c")
            public SmObjectImpl createImpl() {
                return new AssociationImpl();
            }

        }

        @objid ("0261e29d-1a44-42cd-8f82-3bf54f78ece7")
        public static class EndSmDependency extends SmMultipleDependency {
            @objid ("9797621c-e62e-4298-b6b6-0d697a812a73")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationData)data).mEnd != null)? ((AssociationData)data).mEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("0b25b9c9-d963-4cc7-9fe5-d4a66e9ffdac")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationData) data).mEnd = new ArrayList<>(initialCapacity);
                return ((AssociationData) data).mEnd;
            }

            @objid ("ff7c153c-0bec-4d1d-8886-55dc06d30cf3")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.AssociationDep();
            }

        }

        @objid ("8fa6978e-a66a-4ff0-9125-51324bfe6778")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("b37560cf-c0ef-4f85-84ce-c95609ab2b68")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationData)data).mOccurence != null)? ((AssociationData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("075ee459-f66b-405c-8a95-6cdfdaf2b6ec")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((AssociationData) data).mOccurence;
            }

            @objid ("14487d69-c7be-4014-bb47-ac21cec8af3e")
            @Override
            public SmDependency getSymetric() {
                return LinkData.Metadata.ModelDep();
            }

        }

        @objid ("01ab63fa-43bb-4b31-baf2-66e380e75c27")
        public static class LinkToClassSmDependency extends SmSingleDependency {
            @objid ("37099d31-af71-41a9-b2fb-ea85282f7c7f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationData) data).mLinkToClass;
            }

            @objid ("cc643b0b-b9ef-4a37-a8d2-8008e3045777")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationData) data).mLinkToClass = value;
            }

            @objid ("8e28f4d9-1991-475d-93c5-ec954d72314e")
            @Override
            public SmDependency getSymetric() {
                return ClassAssociationData.Metadata.AssociationPartDep();
            }

        }

    }

}
