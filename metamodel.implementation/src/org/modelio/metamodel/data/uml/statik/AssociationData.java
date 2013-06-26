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
    @objid ("1593c4b3-5680-40a1-a92e-2c55ce485acb")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=LinkData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("ea585904-39b5-4ef9-9401-dc6618388deb")
    @SmaMetaAssociation(metaName="End", typeDataClass=AssociationEndData.class, min=2, max=2, smAssociationClass=Metadata.EndSmDependency.class)
     List<SmObjectImpl> mEnd = null;

    @objid ("4cf69519-f94e-4cd9-9ef7-c32cfb1a8c96")
    @SmaMetaAssociation(metaName="LinkToClass", typeDataClass=ClassAssociationData.class, min=0, max=1, smAssociationClass=Metadata.LinkToClassSmDependency.class, component = true)
     SmObjectImpl mLinkToClass;

    @objid ("54767d34-68e9-4315-b407-19627bba96bb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("32600112-9aaa-4552-95c6-cbae64b630dc")
    public static class Metadata {
        @objid ("82518eea-b215-45f8-95fd-1a4a120838fe")
        private static SmClass smClass = null;

        @objid ("9741942d-6fc4-4133-b7f7-5dc438178719")
        private static SmDependency OccurenceDep = null;

        @objid ("2c07880b-cfe7-4322-8846-d3f183023973")
        private static SmDependency EndDep = null;

        @objid ("4174ae79-6dbb-4e0c-9949-3153a3646388")
        private static SmDependency LinkToClassDep = null;

        @objid ("4ef66402-41e1-492a-a8d6-149b50fad9d9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ab6c2f8f-f843-4267-b250-536372ebc539")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("9b76dfc0-f41f-4989-96eb-f5514e81040a")
        public static SmDependency EndDep() {
            if (EndDep == null) {
            	EndDep = classof().getDependencyDef("End");
            }
            return EndDep;
        }

        @objid ("93e05494-c3f9-4a9d-b1ac-64b1f1346502")
        public static SmDependency LinkToClassDep() {
            if (LinkToClassDep == null) {
            	LinkToClassDep = classof().getDependencyDef("LinkToClass");
            }
            return LinkToClassDep;
        }

        @objid ("2af43e73-03d9-4397-8240-bf9573475d38")
        public static SmDependency getLinkToClassDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkToClassDep;
        }

        @objid ("94313b92-3e70-4280-a722-d20e400e7558")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("55b922db-1af8-409b-b3a5-d530d275cf34")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("a8c5d4f3-2e72-47f1-bd3e-6e96137c6d78")
        public static SmDependency getEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndDep;
        }

        @objid ("a7dff537-813d-4f3b-a464-3d0e86192921")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8495f286-d47a-4b1d-b728-d8e4d383327e")
            public ISmObjectData createData() {
                return new AssociationData();
            }

            @objid ("2419fe40-787d-4459-946c-12f43689af1b")
            public SmObjectImpl createImpl() {
                return new AssociationImpl();
            }

        }

        @objid ("0261e29d-1a44-42cd-8f82-3bf54f78ece7")
        public static class EndSmDependency extends SmMultipleDependency {
            @objid ("d41e6e05-8ec6-4738-8f41-43ac688dea2b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationData)data).mEnd != null)? ((AssociationData)data).mEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("b4757c69-c39e-489b-ab5e-f769f750243b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationData) data).mEnd = new ArrayList<>(initialCapacity);
                return ((AssociationData) data).mEnd;
            }

            @objid ("5743d408-e41c-4681-a6c8-bffc4df4e510")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.AssociationDep();
            }

        }

        @objid ("8fa6978e-a66a-4ff0-9125-51324bfe6778")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("3b4cb81a-a631-44b8-abf6-4054528920d5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationData)data).mOccurence != null)? ((AssociationData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("84b0a0c0-76db-4b8e-90c0-bf9303d1945b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((AssociationData) data).mOccurence;
            }

            @objid ("123fd362-2d1d-42eb-b68f-5f6801e0a7a7")
            @Override
            public SmDependency getSymetric() {
                return LinkData.Metadata.ModelDep();
            }

        }

        @objid ("01ab63fa-43bb-4b31-baf2-66e380e75c27")
        public static class LinkToClassSmDependency extends SmSingleDependency {
            @objid ("7107a765-0aa9-4fde-bf48-3c6140aecde2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationData) data).mLinkToClass;
            }

            @objid ("ec5dc30e-db29-4f19-b616-d35700f3f422")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationData) data).mLinkToClass = value;
            }

            @objid ("b0bc12f9-e006-4272-9f84-eca8a6a62733")
            @Override
            public SmDependency getSymetric() {
                return ClassAssociationData.Metadata.AssociationPartDep();
            }

        }

    }

}
