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
    @objid ("9b5f8c1e-a029-41c3-9d2a-b5e6564f08b3")
    @SmaMetaAssociation(metaName="Sub", typeDataClass=DiagramSetData.class, min=0, max=-1, smAssociationClass=Metadata.SubSmDependency.class, component = true)
     List<SmObjectImpl> mSub = null;

    @objid ("5050bdb8-c404-4b0c-9ed4-92373754e427")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=DiagramSetData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class)
     SmObjectImpl mParent;

    @objid ("f9dc1af8-76f0-44b4-aa6f-007f8b537c4d")
    @SmaMetaAssociation(metaName="ReferencedDiagram", typeDataClass=AbstractDiagramData.class, min=0, max=-1, smAssociationClass=Metadata.ReferencedDiagramSmDependency.class, partof = true)
     List<SmObjectImpl> mReferencedDiagram = null;

    @objid ("7d6a4675-9d26-4d27-97fe-5b23fc7f6c8b")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("9e4b097a-35ed-4366-93a9-74c39eeb4ddf")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001f4e88-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9a75c75b-c3f2-46f3-bbfa-35b40b3ebc6a")
        private static SmClass smClass = null;

        @objid ("c1bedd82-5c51-4938-9412-62d8c247301a")
        private static SmDependency SubDep = null;

        @objid ("5f7c8b85-588b-4c75-bb57-9ca6aef459c3")
        private static SmDependency ParentDep = null;

        @objid ("31ef6c88-0eb1-4593-b7e7-ef2fa3ce683d")
        private static SmDependency ReferencedDiagramDep = null;

        @objid ("82528428-bdfb-437a-8418-17433bb3ec0a")
        private static SmDependency OwnerDep = null;

        @objid ("c9a2a741-e856-4ed8-9db3-c0a940949734")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DiagramSetData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4be4e606-eb0e-4e39-b7e7-cbe1905062d8")
        public static SmDependency SubDep() {
            if (SubDep == null) {
            	SubDep = classof().getDependencyDef("Sub");
            }
            return SubDep;
        }

        @objid ("89cbbc35-4a4b-4941-aa66-11eae10b00c8")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("3549af25-17f1-403a-8665-5d0b450db25f")
        public static SmDependency ReferencedDiagramDep() {
            if (ReferencedDiagramDep == null) {
            	ReferencedDiagramDep = classof().getDependencyDef("ReferencedDiagram");
            }
            return ReferencedDiagramDep;
        }

        @objid ("48905fdc-4015-417a-9ce9-dfc9dc91bdb3")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("7421b303-3a32-4a37-9af8-5afa125d27d3")
        public static SmDependency getReferencedDiagramDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferencedDiagramDep;
        }

        @objid ("63aa6a0f-430b-4bfd-bc91-6b8a48faba5d")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("e37fbde4-a5e4-4b53-9272-e51ca692ba2f")
        public static SmDependency getSubDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubDep;
        }

        @objid ("7f33816e-ad5c-4d34-8926-9078601317c1")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("e739695e-c5c2-473b-a3ba-20856315e0ef")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001f8cb8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5786779a-9f3d-4720-b4fd-40a3b695622b")
            public ISmObjectData createData() {
                return new DiagramSetData();
            }

            @objid ("17718b1c-063a-4706-a397-295b2f8b1abd")
            public SmObjectImpl createImpl() {
                return new DiagramSetImpl();
            }

        }

        @objid ("0020643a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SubSmDependency extends SmMultipleDependency {
            @objid ("cb25e4f1-3529-41ad-9ee6-a53369274c9e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DiagramSetData)data).mSub != null)? ((DiagramSetData)data).mSub:SmMultipleDependency.EMPTY;
            }

            @objid ("e795b050-aa4e-4060-b3d9-a02cb9b5456f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DiagramSetData) data).mSub = new ArrayList<>(initialCapacity);
                return ((DiagramSetData) data).mSub;
            }

            @objid ("aa900bf6-b552-4227-a4c3-c737ad6edcd2")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.ParentDep();
            }

        }

        @objid ("0020c542-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("16ff273b-0a80-4644-be05-74fe3163173e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DiagramSetData) data).mParent;
            }

            @objid ("87072594-86af-4522-9561-63495feb780a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DiagramSetData) data).mParent = value;
            }

            @objid ("8966f648-495f-48f6-96f6-55a1e5cd0e1d")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.SubDep();
            }

        }

        @objid ("00213c8e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReferencedDiagramSmDependency extends SmMultipleDependency {
            @objid ("4e57ecd0-f4a9-401c-84a9-fe04ae6cf648")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DiagramSetData)data).mReferencedDiagram != null)? ((DiagramSetData)data).mReferencedDiagram:SmMultipleDependency.EMPTY;
            }

            @objid ("1732304d-1ab4-4b46-8f1c-ad06f0809ecd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DiagramSetData) data).mReferencedDiagram = new ArrayList<>(initialCapacity);
                return ((DiagramSetData) data).mReferencedDiagram;
            }

            @objid ("9f0c7c94-ee4a-43e8-ae49-53c81dcea99a")
            @Override
            public SmDependency getSymetric() {
                return AbstractDiagramData.Metadata.ReferencingSetDep();
            }

        }

        @objid ("005cd410-70e0-1048-a9ad-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("67502c36-33d3-44ea-b8af-26af49f02fcf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DiagramSetData) data).mOwner;
            }

            @objid ("07709aa1-eeae-4baf-ae49-e2b603114f21")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DiagramSetData) data).mOwner = value;
            }

            @objid ("9efdc5ea-51ba-4c2d-8e52-f7b11a458589")
            @Override
            public SmDependency getSymetric() {
                return ProjectData.Metadata.DiagramRootDep();
            }

        }

    }

}
