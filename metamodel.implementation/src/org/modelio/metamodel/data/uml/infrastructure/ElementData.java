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
    @objid ("4b3774f7-451d-4aef-a6f3-87ab870d5787")
    @SmaMetaAssociation(metaName="DiagramElement", typeDataClass=AbstractDiagramData.class, min=0, max=-1, smAssociationClass=Metadata.DiagramElementSmDependency.class)
     List<SmObjectImpl> mDiagramElement = null;

    @objid ("4505bc9b-9ec4-4d27-b1b9-900cf182fbb4")
    @SmaMetaAssociation(metaName="Causing", typeDataClass=NamespaceUseData.class, min=0, max=-1, smAssociationClass=Metadata.CausingSmDependency.class)
     List<SmObjectImpl> mCausing = null;

    @objid ("7aed024c-aaf6-40b9-9456-ba0670a5accb")
    @SmaMetaAssociation(metaName="AddedToQuery", typeDataClass=QueryDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.AddedToQuerySmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mAddedToQuery = null;

    @objid ("31bb60e8-f33e-4311-9c4a-724cfd94e684")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000669ae-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4f94824b-c0bb-4a10-a3ac-f9a4a6ec0719")
        private static SmClass smClass = null;

        @objid ("69ababa9-315e-4c82-b486-4d0ed7b08286")
        private static SmDependency DiagramElementDep = null;

        @objid ("a34a0a9b-8bb7-4178-92d0-00b72be4684a")
        private static SmDependency CausingDep = null;

        @objid ("8913206b-fe36-4b36-aa54-7156c9394fbf")
        private static SmDependency AddedToQueryDep = null;

        @objid ("1d4f84d4-22f8-478d-b61f-be2a6a1440ef")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("93aae118-6f2f-4c08-b532-5eefbbd8f8e6")
        public static SmDependency DiagramElementDep() {
            if (DiagramElementDep == null) {
            	DiagramElementDep = classof().getDependencyDef("DiagramElement");
            }
            return DiagramElementDep;
        }

        @objid ("18d7ae3a-4ccd-4776-b96a-548f0deb23ab")
        public static SmDependency CausingDep() {
            if (CausingDep == null) {
            	CausingDep = classof().getDependencyDef("Causing");
            }
            return CausingDep;
        }

        @objid ("07fa3f44-eaa5-4a0a-aca7-169e9f1a874d")
        public static SmDependency AddedToQueryDep() {
            if (AddedToQueryDep == null) {
            	AddedToQueryDep = classof().getDependencyDef("AddedToQuery");
            }
            return AddedToQueryDep;
        }

        @objid ("f857b2c2-fb21-4867-ba20-348a1ec61724")
        public static SmDependency getDiagramElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DiagramElementDep;
        }

        @objid ("339b72d5-c9f7-4ffd-b3e9-20a7c52f398c")
        public static SmDependency getAddedToQueryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AddedToQueryDep;
        }

        @objid ("da8c28d1-8768-46fa-a937-27a881d23b58")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c35c4141-9222-4f63-929b-fc8b551519e5")
        public static SmDependency getCausingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CausingDep;
        }

        @objid ("0006aa22-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("842c2d10-2d86-4a43-8c38-565b5ef65da6")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("88d30332-b05e-494a-8319-1731d34d7911")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00070c6a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CausingSmDependency extends SmMultipleDependency {
            @objid ("95ce8d0a-b8e5-403f-9fd8-58c161bbbdff")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ElementData)data).mCausing != null)? ((ElementData)data).mCausing:SmMultipleDependency.EMPTY;
            }

            @objid ("9a19347b-0490-4437-a9b7-9c4fd8b58cd9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ElementData) data).mCausing = new ArrayList<>(initialCapacity);
                return ((ElementData) data).mCausing;
            }

            @objid ("bcef3bf5-a94e-4fd8-9682-0ce2e0c064bf")
            @Override
            public SmDependency getSymetric() {
                return NamespaceUseData.Metadata.CauseDep();
            }

        }

        @objid ("00077042-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DiagramElementSmDependency extends SmMultipleDependency {
            @objid ("f4b2a9fb-cda1-4e0e-8ff7-c1d28c7726db")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ElementData)data).mDiagramElement != null)? ((ElementData)data).mDiagramElement:SmMultipleDependency.EMPTY;
            }

            @objid ("85aaf7b6-a42d-4efa-8e69-85b9386b8a8f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ElementData) data).mDiagramElement = new ArrayList<>(initialCapacity);
                return ((ElementData) data).mDiagramElement;
            }

            @objid ("d7fef521-9929-4e19-9a91-b6d6c1fc1923")
            @Override
            public SmDependency getSymetric() {
                return AbstractDiagramData.Metadata.RepresentedDep();
            }

        }

        @objid ("ca85f4fa-79d9-4bab-bdf8-d9bac22bc9a7")
        public static class AddedToQuerySmDependency extends SmMultipleDependency {
            @objid ("242dc8ab-008e-44b9-883f-ce5744f660b4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ElementData)data).mAddedToQuery != null)? ((ElementData)data).mAddedToQuery:SmMultipleDependency.EMPTY;
            }

            @objid ("54611e74-0c8e-4232-9f50-573655adf48a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ElementData) data).mAddedToQuery = new ArrayList<>(initialCapacity);
                return ((ElementData) data).mAddedToQuery;
            }

            @objid ("55635965-40ac-4bcd-820f-76d166f6e54c")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.AddedDep();
            }

        }

    }

}
