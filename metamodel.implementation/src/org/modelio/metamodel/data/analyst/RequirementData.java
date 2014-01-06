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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.data.analyst.RequirementContainerData;
import org.modelio.metamodel.impl.analyst.RequirementImpl;
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

@objid ("cdb4e302-697f-4730-9228-27f71f3c6d4d")
@SmaMetaClass(mmClass=Requirement.class, factory=RequirementData.Metadata.ObjectFactory.class)
public class RequirementData extends AnalystElementData {
    @objid ("0c858b26-7897-4fdd-a94f-b226cfc77a0b")
    @SmaMetaAssociation(metaName="SubRequirement", typeDataClass=RequirementData.class, min=0, max=-1, smAssociationClass=Metadata.SubRequirementSmDependency.class, component = true)
     List<SmObjectImpl> mSubRequirement = null;

    @objid ("dac720f2-e966-4673-8ae4-f7a280a0b195")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=RequirementContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("514e74c0-047d-4237-813c-cb1fd9c2bda1")
    @SmaMetaAssociation(metaName="ParentRequirement", typeDataClass=RequirementData.class, min=0, max=1, smAssociationClass=Metadata.ParentRequirementSmDependency.class)
     SmObjectImpl mParentRequirement;

    @objid ("3d5bcc6a-5aa3-4c5c-aabe-38598556f65b")
    @SmaMetaAssociation(metaName="ArchivedRequirementVersion", typeDataClass=RequirementData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedRequirementVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedRequirementVersion = null;

    @objid ("10069600-90bb-445e-9889-2a9237a8e8f0")
    @SmaMetaAssociation(metaName="LastRequirementVersion", typeDataClass=RequirementData.class, min=0, max=1, smAssociationClass=Metadata.LastRequirementVersionSmDependency.class)
     SmObjectImpl mLastRequirementVersion;

    @objid ("4b7f2480-e2b3-4a59-a931-0f0fdd73c374")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("59115fc6-ae77-4d6e-8459-548c5891e205")
    public static class Metadata {
        @objid ("ed95635f-0f33-4b06-b773-a6e61cd7ad0c")
        private static SmClass smClass = null;

        @objid ("077f7cf4-00f5-4a68-baa8-637b86100b68")
        private static SmDependency SubRequirementDep = null;

        @objid ("44f1bc61-d85e-4842-8a52-549479844e6f")
        private static SmDependency OwnerContainerDep = null;

        @objid ("2f9a99e6-2773-451f-9fe5-0b0b936a8599")
        private static SmDependency ParentRequirementDep = null;

        @objid ("cb9d6eff-b997-4e39-a1c3-9dcdd330a136")
        private static SmDependency ArchivedRequirementVersionDep = null;

        @objid ("6ed2baa6-c9c7-4493-bf32-6d8b4f2f4d0a")
        private static SmDependency LastRequirementVersionDep = null;

        @objid ("0c95335a-7e0d-4762-8998-f60326635088")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RequirementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4b53701e-9ffe-4c4f-97bc-4ee5959d2e45")
        public static SmDependency SubRequirementDep() {
            if (SubRequirementDep == null) {
            	SubRequirementDep = classof().getDependencyDef("SubRequirement");
            }
            return SubRequirementDep;
        }

        @objid ("0df46208-4a50-4efc-bd0f-260405bb5054")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("286bb950-b03e-4ba7-997f-dc6ba9ef523d")
        public static SmDependency ParentRequirementDep() {
            if (ParentRequirementDep == null) {
            	ParentRequirementDep = classof().getDependencyDef("ParentRequirement");
            }
            return ParentRequirementDep;
        }

        @objid ("183801d2-bf39-4fd2-a93b-fa623d652ef7")
        public static SmDependency ArchivedRequirementVersionDep() {
            if (ArchivedRequirementVersionDep == null) {
            	ArchivedRequirementVersionDep = classof().getDependencyDef("ArchivedRequirementVersion");
            }
            return ArchivedRequirementVersionDep;
        }

        @objid ("2227fb4f-c02c-4d61-af80-a49825e18531")
        public static SmDependency LastRequirementVersionDep() {
            if (LastRequirementVersionDep == null) {
            	LastRequirementVersionDep = classof().getDependencyDef("LastRequirementVersion");
            }
            return LastRequirementVersionDep;
        }

        @objid ("0a0fcef6-38ba-4cdb-9444-d2ff722e879a")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("32f5426a-04fe-4e17-b151-50f69f2d625f")
        public static SmDependency getLastRequirementVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastRequirementVersionDep;
        }

        @objid ("1b65e156-6f40-4210-9a8b-3917be346fc8")
        public static SmDependency getArchivedRequirementVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedRequirementVersionDep;
        }

        @objid ("22743793-4610-49e3-9ecb-553f208c0fdc")
        public static SmDependency getParentRequirementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentRequirementDep;
        }

        @objid ("20fb58c6-cfa3-4b6f-a59f-fd850a4007ca")
        public static SmDependency getSubRequirementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubRequirementDep;
        }

        @objid ("a7491541-f868-4589-9f5f-fc4c204d14d9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8fb3c95f-267c-4e60-a366-5d23f93059b6")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("04891434-1437-47b4-9f6e-7ccded246d6c")
            public ISmObjectData createData() {
                return new RequirementData();
            }

            @objid ("8e219a47-599a-4e2f-a8a0-211a36e6ff8d")
            public SmObjectImpl createImpl() {
                return new RequirementImpl();
            }

        }

        @objid ("0b16d465-8e0b-4917-97aa-728cfbd9e4db")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("d343fb85-a486-4158-a3fc-a7e60cf5e44f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementData) data).mOwnerContainer;
            }

            @objid ("7a8cdcbd-d83d-442c-9aa2-2f0ec302c0b8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementData) data).mOwnerContainer = value;
            }

            @objid ("633358c2-2294-4fc6-9974-5f6275ab345c")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnedRequirementDep();
            }

        }

        @objid ("015ad436-44bb-4f76-adac-305c1e5dad32")
        public static class SubRequirementSmDependency extends SmMultipleDependency {
            @objid ("c60415a5-d19b-403c-9786-d4e710d43c7f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementData)data).mSubRequirement != null)? ((RequirementData)data).mSubRequirement:SmMultipleDependency.EMPTY;
            }

            @objid ("1b0115b9-b327-4507-a9c6-b84885a66ee5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementData) data).mSubRequirement = new ArrayList<>(initialCapacity);
                return ((RequirementData) data).mSubRequirement;
            }

            @objid ("9fb6d916-3b7e-4b47-998d-710052166d8b")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.ParentRequirementDep();
            }

        }

        @objid ("1248b591-50dc-48a8-a038-f96a5e89a40a")
        public static class ParentRequirementSmDependency extends SmSingleDependency {
            @objid ("383a59ca-941b-4d40-b988-595f6681dfc9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementData) data).mParentRequirement;
            }

            @objid ("93dc9d69-338f-4c12-ac6a-0a3d52359039")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementData) data).mParentRequirement = value;
            }

            @objid ("dfa824ae-d7e9-4bbd-bab1-d82fa80fdf19")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.SubRequirementDep();
            }

        }

        @objid ("bfc5dc7f-ce0c-4cee-8b52-566b87a02aac")
        public static class ArchivedRequirementVersionSmDependency extends SmMultipleDependency {
            @objid ("5e8cb0fb-8a23-474e-b6a7-ddc4c04e4b14")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementData)data).mArchivedRequirementVersion != null)? ((RequirementData)data).mArchivedRequirementVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("86d731f1-2be6-474e-881f-2fb40b14fea6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementData) data).mArchivedRequirementVersion = new ArrayList<>(initialCapacity);
                return ((RequirementData) data).mArchivedRequirementVersion;
            }

            @objid ("145f70eb-f390-4dda-bae3-4bcdef6c9d20")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.LastRequirementVersionDep();
            }

        }

        @objid ("a8f74006-3f14-4d0c-93c0-8acb2dcda313")
        public static class LastRequirementVersionSmDependency extends SmSingleDependency {
            @objid ("daf7beb5-974c-4fa6-830d-8fccb0e6937f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementData) data).mLastRequirementVersion;
            }

            @objid ("79d81dba-1802-4344-b2a5-7aa88e395831")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementData) data).mLastRequirementVersion = value;
            }

            @objid ("cd1e49b2-39e7-44e1-8029-2530d2504791")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.ArchivedRequirementVersionDep();
            }

        }

    }

}
