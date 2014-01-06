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
import org.modelio.metamodel.data.diagrams.AbstractDiagramData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.QueryDefinitionData;
import org.modelio.metamodel.data.uml.statik.NamespaceUseData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("0086e58e-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Element.class, factory=ElementData.Metadata.ObjectFactory.class)
public abstract class ElementData extends SmObjectData {
    @objid ("1ef15666-a5d4-44c7-b13b-1cb0d83afb1b")
    @SmaMetaAssociation(metaName="DiagramElement", typeDataClass=AbstractDiagramData.class, min=0, max=-1, smAssociationClass=Metadata.DiagramElementSmDependency.class)
     List<SmObjectImpl> mDiagramElement = null;

    @objid ("41cc57ef-4cfc-43b8-a7cf-8d97f25f07a5")
    @SmaMetaAssociation(metaName="Causing", typeDataClass=NamespaceUseData.class, min=0, max=-1, smAssociationClass=Metadata.CausingSmDependency.class)
     List<SmObjectImpl> mCausing = null;

    @objid ("5ef8b80f-ce3c-4ce2-afa1-9cab5294570c")
    @SmaMetaAssociation(metaName="AddedToQuery", typeDataClass=QueryDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.AddedToQuerySmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mAddedToQuery = null;

    @objid ("f961003d-dcd2-4be7-aa90-1f03896b7f5a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000669ae-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fbea465e-b822-4f75-870a-bcdf01dd387c")
        private static SmClass smClass = null;

        @objid ("bf00329f-2b91-47ef-a220-4fd530038a8e")
        private static SmDependency DiagramElementDep = null;

        @objid ("57482615-6938-4a28-9b1b-b2e9da44785d")
        private static SmDependency CausingDep = null;

        @objid ("c63d6969-8746-457b-a6bd-f8818d71f8ca")
        private static SmDependency AddedToQueryDep = null;

        @objid ("8361c90a-1f2d-46b7-9443-544f92a435dc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4086f0dd-ee10-47b0-978f-313686eecb14")
        public static SmDependency DiagramElementDep() {
            if (DiagramElementDep == null) {
            	DiagramElementDep = classof().getDependencyDef("DiagramElement");
            }
            return DiagramElementDep;
        }

        @objid ("7d180184-5d29-41e3-93f6-378942bdc22e")
        public static SmDependency CausingDep() {
            if (CausingDep == null) {
            	CausingDep = classof().getDependencyDef("Causing");
            }
            return CausingDep;
        }

        @objid ("1262e881-f766-453e-9e11-817d333ca7d8")
        public static SmDependency AddedToQueryDep() {
            if (AddedToQueryDep == null) {
            	AddedToQueryDep = classof().getDependencyDef("AddedToQuery");
            }
            return AddedToQueryDep;
        }

        @objid ("a6f6a443-7c31-41d0-9729-610f1bf3b36e")
        public static SmDependency getAddedToQueryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AddedToQueryDep;
        }

        @objid ("c4d8eeb5-655c-494f-9883-b801a1a77ea4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("39f716b6-c8d1-42b1-b70d-69a3d9d2c8f7")
        public static SmDependency getCausingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CausingDep;
        }

        @objid ("d39b28c5-64d7-4632-a677-1422a36552b6")
        public static SmDependency getDiagramElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DiagramElementDep;
        }

        @objid ("0006aa22-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("576345fc-16c4-4b8f-9d0e-7a28c149f9f2")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("8513b9ca-6924-40c7-9a22-69672ba0675c")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00070c6a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CausingSmDependency extends SmMultipleDependency {
            @objid ("00ebebea-7168-488d-bae3-bed759e9bbcb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ElementData)data).mCausing != null)? ((ElementData)data).mCausing:SmMultipleDependency.EMPTY;
            }

            @objid ("3bbb4769-04c5-46d1-84a8-5e4bbc610b65")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ElementData) data).mCausing = new ArrayList<>(initialCapacity);
                return ((ElementData) data).mCausing;
            }

            @objid ("3a169c6a-dfb7-42e3-b5ec-da4e3586f306")
            @Override
            public SmDependency getSymetric() {
                return NamespaceUseData.Metadata.CauseDep();
            }

        }

        @objid ("00077042-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DiagramElementSmDependency extends SmMultipleDependency {
            @objid ("e52edaf9-6a70-49ea-ab9b-b918abdcb708")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ElementData)data).mDiagramElement != null)? ((ElementData)data).mDiagramElement:SmMultipleDependency.EMPTY;
            }

            @objid ("fdfaa77c-66b4-4b15-9efa-2a54764f927c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ElementData) data).mDiagramElement = new ArrayList<>(initialCapacity);
                return ((ElementData) data).mDiagramElement;
            }

            @objid ("3451e21e-c996-46d8-a687-67e24aa00eb3")
            @Override
            public SmDependency getSymetric() {
                return AbstractDiagramData.Metadata.RepresentedDep();
            }

        }

        @objid ("ca85f4fa-79d9-4bab-bdf8-d9bac22bc9a7")
        public static class AddedToQuerySmDependency extends SmMultipleDependency {
            @objid ("d14870af-0151-4582-83b3-3371d03795fa")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ElementData)data).mAddedToQuery != null)? ((ElementData)data).mAddedToQuery:SmMultipleDependency.EMPTY;
            }

            @objid ("762eab4f-26ee-4734-9dd8-0973751d3294")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ElementData) data).mAddedToQuery = new ArrayList<>(initialCapacity);
                return ((ElementData) data).mAddedToQuery;
            }

            @objid ("7a57e02d-7db7-4b76-8245-1961652a6d91")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.AddedDep();
            }

        }

    }

}
