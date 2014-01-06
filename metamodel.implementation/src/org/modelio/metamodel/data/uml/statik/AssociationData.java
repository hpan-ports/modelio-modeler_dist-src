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
    @objid ("07778f7d-6744-42d1-9e36-038dc121b170")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=LinkData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("462abd02-0c1e-4d51-bf80-26ea67f6c1ad")
    @SmaMetaAssociation(metaName="End", typeDataClass=AssociationEndData.class, min=2, max=2, smAssociationClass=Metadata.EndSmDependency.class)
     List<SmObjectImpl> mEnd = null;

    @objid ("1001aa63-333e-4c8a-bd08-2f5cdd68d5b3")
    @SmaMetaAssociation(metaName="LinkToClass", typeDataClass=ClassAssociationData.class, min=0, max=1, smAssociationClass=Metadata.LinkToClassSmDependency.class, component = true)
     SmObjectImpl mLinkToClass;

    @objid ("8b8531af-98f7-4f39-bf15-c3f638ce29d9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("32600112-9aaa-4552-95c6-cbae64b630dc")
    public static class Metadata {
        @objid ("b6ea8a05-9522-4a7d-b60d-80e7f8c12f7a")
        private static SmClass smClass = null;

        @objid ("32905c29-846a-4e36-bd94-f394f9cf1d11")
        private static SmDependency OccurenceDep = null;

        @objid ("1c16b3f6-bc0a-4ae1-95a3-fe56b8e6c584")
        private static SmDependency EndDep = null;

        @objid ("ddf96355-4635-4252-8d36-8576657de057")
        private static SmDependency LinkToClassDep = null;

        @objid ("6cc774cb-8bf3-49a7-8d48-01847fd49910")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("08241503-6cf8-45ea-9049-a6f0b15aba74")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("f933d3d1-d8c0-4b4d-9bed-2677eb3ef6f4")
        public static SmDependency EndDep() {
            if (EndDep == null) {
            	EndDep = classof().getDependencyDef("End");
            }
            return EndDep;
        }

        @objid ("84bf8d8b-6c91-418e-ab78-fc8559812190")
        public static SmDependency LinkToClassDep() {
            if (LinkToClassDep == null) {
            	LinkToClassDep = classof().getDependencyDef("LinkToClass");
            }
            return LinkToClassDep;
        }

        @objid ("4d30ffcc-8dec-4d71-b203-95edd044dfdc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("004e6b9a-9101-4fac-a0f0-d0446a8726d5")
        public static SmDependency getEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndDep;
        }

        @objid ("8d45bfcf-e87f-498c-a0f5-2da21677a137")
        public static SmDependency getLinkToClassDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkToClassDep;
        }

        @objid ("2eb01d86-f9d4-476d-910c-fdb22c0fc647")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("a7dff537-813d-4f3b-a464-3d0e86192921")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0a5c5d47-7671-4b0b-a9f3-fa64b14a5aa6")
            public ISmObjectData createData() {
                return new AssociationData();
            }

            @objid ("f5f40a08-9043-4795-b859-4289268bcde9")
            public SmObjectImpl createImpl() {
                return new AssociationImpl();
            }

        }

        @objid ("0261e29d-1a44-42cd-8f82-3bf54f78ece7")
        public static class EndSmDependency extends SmMultipleDependency {
            @objid ("b57685f3-308f-4231-851d-09fa45aa8495")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationData)data).mEnd != null)? ((AssociationData)data).mEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("a1cea06a-674a-4896-918f-5f501852dee1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationData) data).mEnd = new ArrayList<>(initialCapacity);
                return ((AssociationData) data).mEnd;
            }

            @objid ("c6ac967b-5470-470b-9b11-88b78d5209aa")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.AssociationDep();
            }

        }

        @objid ("8fa6978e-a66a-4ff0-9125-51324bfe6778")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("f7729179-9a89-4bee-a1c5-30ae315a4ed5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationData)data).mOccurence != null)? ((AssociationData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("d6648443-9640-4909-8bae-711c0e9255ce")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((AssociationData) data).mOccurence;
            }

            @objid ("d521abf2-8047-4c91-b4a2-06b9fd072461")
            @Override
            public SmDependency getSymetric() {
                return LinkData.Metadata.ModelDep();
            }

        }

        @objid ("01ab63fa-43bb-4b31-baf2-66e380e75c27")
        public static class LinkToClassSmDependency extends SmSingleDependency {
            @objid ("9a1ae94e-08d5-4669-b637-52f83dc7868a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationData) data).mLinkToClass;
            }

            @objid ("d8e1ac30-2bd0-45e9-82b0-9fcd631d1619")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationData) data).mLinkToClass = value;
            }

            @objid ("f7533c6f-5f04-4876-a05e-d68e8a16f271")
            @Override
            public SmDependency getSymetric() {
                return ClassAssociationData.Metadata.AssociationPartDep();
            }

        }

    }

}
