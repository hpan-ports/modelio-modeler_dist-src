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
package org.modelio.metamodel.data.diagrams;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.diagrams.AbstractDiagramData;
import org.modelio.metamodel.data.mda.ProjectData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.impl.diagrams.DiagramSetImpl;
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

@objid ("006e66a8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DiagramSet.class, factory=DiagramSetData.Metadata.ObjectFactory.class, cmsnode=true)
public class DiagramSetData extends ModelElementData {
    @objid ("aa021394-de74-43c2-b949-8dd7be321533")
    @SmaMetaAssociation(metaName="Sub", typeDataClass=DiagramSetData.class, min=0, max=-1, smAssociationClass=Metadata.SubSmDependency.class, component = true)
     List<SmObjectImpl> mSub = null;

    @objid ("2deeda92-f62c-4e64-9619-d9e069c09b3a")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=DiagramSetData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class)
     SmObjectImpl mParent;

    @objid ("78f9d79a-3090-478e-b1ec-ae82cf513e8b")
    @SmaMetaAssociation(metaName="ReferencedDiagram", typeDataClass=AbstractDiagramData.class, min=0, max=-1, smAssociationClass=Metadata.ReferencedDiagramSmDependency.class, partof = true)
     List<SmObjectImpl> mReferencedDiagram = null;

    @objid ("7f93c995-be53-42b4-b9d9-e4c4e909eabd")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("e6707c1f-8622-4335-9717-b6c2bcda96a1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001f4e88-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e0cb18f6-c9af-4054-9f12-2fb39071a9bb")
        private static SmClass smClass = null;

        @objid ("9072cb6b-6399-4e76-a5ef-f9766f39c486")
        private static SmDependency SubDep = null;

        @objid ("2b482076-7220-4582-b6f3-1e1d4932c9f9")
        private static SmDependency ParentDep = null;

        @objid ("b5f81e22-2016-45e3-888d-52c45c6586fc")
        private static SmDependency ReferencedDiagramDep = null;

        @objid ("dd7cbf65-c1d3-4fd7-89e2-c20024ec5273")
        private static SmDependency OwnerDep = null;

        @objid ("12d8a60a-c9b1-49bc-84d7-55d670448ddb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DiagramSetData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8fffa2f7-c1b2-441b-9911-19d68562a116")
        public static SmDependency SubDep() {
            if (SubDep == null) {
            	SubDep = classof().getDependencyDef("Sub");
            }
            return SubDep;
        }

        @objid ("bb9012f7-ee87-407a-a7d9-47df931a7c47")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("fab06c7a-21af-468f-a1fc-f79b98a4d5aa")
        public static SmDependency ReferencedDiagramDep() {
            if (ReferencedDiagramDep == null) {
            	ReferencedDiagramDep = classof().getDependencyDef("ReferencedDiagram");
            }
            return ReferencedDiagramDep;
        }

        @objid ("c155a84f-2226-4070-8f56-5f12219d49fa")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("a325ed50-f13a-4aef-aa6d-8ac776448e77")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("15335545-a478-4ae4-b29d-589f13d95e92")
        public static SmDependency getReferencedDiagramDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferencedDiagramDep;
        }

        @objid ("8fb4883a-290f-466f-86b4-a36610d24e2e")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("1a7c9616-83a2-4c17-9e3e-cd3b95119a8f")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("d4570469-c9ec-426e-a7e1-0b814588061e")
        public static SmDependency getSubDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubDep;
        }

        @objid ("001f8cb8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("62e9b1bf-97ef-45b0-aae1-e48c1efc8d7c")
            public ISmObjectData createData() {
                return new DiagramSetData();
            }

            @objid ("863aee99-41d0-44eb-889b-0ac6451504ce")
            public SmObjectImpl createImpl() {
                return new DiagramSetImpl();
            }

        }

        @objid ("0020643a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SubSmDependency extends SmMultipleDependency {
            @objid ("b60eed11-3ebf-4a6f-bbae-21b5a34a87a7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DiagramSetData)data).mSub != null)? ((DiagramSetData)data).mSub:SmMultipleDependency.EMPTY;
            }

            @objid ("96c271cb-415c-4c65-8dd2-f790f69458c7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DiagramSetData) data).mSub = new ArrayList<>(initialCapacity);
                return ((DiagramSetData) data).mSub;
            }

            @objid ("28b72b51-25cb-432e-8217-21a32524c185")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.ParentDep();
            }

        }

        @objid ("0020c542-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("6b091ce7-efcc-41c5-90a2-467e5fb67266")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DiagramSetData) data).mParent;
            }

            @objid ("af50e533-c505-42fa-879f-44343e44d682")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DiagramSetData) data).mParent = value;
            }

            @objid ("1cf87c63-b653-48d5-b578-c2dabc23ef26")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.SubDep();
            }

        }

        @objid ("00213c8e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReferencedDiagramSmDependency extends SmMultipleDependency {
            @objid ("76a48752-a4b1-4529-b616-561b07b6c9e5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DiagramSetData)data).mReferencedDiagram != null)? ((DiagramSetData)data).mReferencedDiagram:SmMultipleDependency.EMPTY;
            }

            @objid ("e594efca-b12d-4c98-8e12-ab3c0c22d623")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DiagramSetData) data).mReferencedDiagram = new ArrayList<>(initialCapacity);
                return ((DiagramSetData) data).mReferencedDiagram;
            }

            @objid ("0e314349-2e13-40a7-a11c-bbc9aeccbc73")
            @Override
            public SmDependency getSymetric() {
                return AbstractDiagramData.Metadata.ReferencingSetDep();
            }

        }

        @objid ("005cd410-70e0-1048-a9ad-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("4572c72c-ccb7-40d6-813c-f0fc16b2f6c8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DiagramSetData) data).mOwner;
            }

            @objid ("20630bba-48da-4e55-b8a6-39d837bd3528")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DiagramSetData) data).mOwner = value;
            }

            @objid ("eb1cc4e0-2c17-40a2-b016-d0d82782358e")
            @Override
            public SmDependency getSymetric() {
                return ProjectData.Metadata.DiagramRootDep();
            }

        }

    }

}
