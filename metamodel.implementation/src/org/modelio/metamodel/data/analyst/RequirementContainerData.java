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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.analyst.RequirementData;
import org.modelio.metamodel.impl.analyst.RequirementContainerImpl;
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

@objid ("3ae27d60-636c-4129-aaed-34265d379087")
@SmaMetaClass(mmClass=RequirementContainer.class, factory=RequirementContainerData.Metadata.ObjectFactory.class, cmsnode=true)
public class RequirementContainerData extends AnalystContainerData {
    @objid ("1546289c-080c-46df-9800-adb54b445444")
    @SmaMetaAssociation(metaName="OwnedRequirement", typeDataClass=RequirementData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedRequirementSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedRequirement = null;

    @objid ("c8a4bf3b-183b-4841-a097-8598d09c85fe")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=RequirementContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("4ed9e165-f91b-4208-a9e4-4a1d26123a50")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=RequirementContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("143e7127-66e8-4200-8cca-f240ae7ad8e7")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("9d53fe38-afa8-4092-a081-0227b2cd503d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("528dce26-56e4-47cd-93e2-650a832a447b")
    public static class Metadata {
        @objid ("7c66322d-c861-41ff-8bc1-6e78866cde4c")
        private static SmClass smClass = null;

        @objid ("f607c3ad-e748-4847-8584-ef1f25a4dd01")
        private static SmDependency OwnedRequirementDep = null;

        @objid ("3e5e909e-e3a5-44bf-88cf-5e448c534d5b")
        private static SmDependency OwnerContainerDep = null;

        @objid ("8e45a777-33aa-44d8-b130-f01a0e11e07f")
        private static SmDependency OwnedContainerDep = null;

        @objid ("19a60add-edc6-4483-92f6-e1dc749a2234")
        private static SmDependency OwnerProjectDep = null;

        @objid ("f5b4d099-4764-4aaf-8827-2e9875e5ab38")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RequirementContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dcd9f890-b4aa-473b-ab1c-1bb65e2c5d50")
        public static SmDependency OwnedRequirementDep() {
            if (OwnedRequirementDep == null) {
            	OwnedRequirementDep = classof().getDependencyDef("OwnedRequirement");
            }
            return OwnedRequirementDep;
        }

        @objid ("0d09f737-ec8b-4906-b4ca-e6d1f8abf0ce")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("def610d5-2d2f-4a81-8267-eee7e347c10e")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("4b306532-05fa-4ac3-ab1e-0d304484a810")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("190ec61a-bd48-4c9f-8ddc-003c4f3705a3")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("eb6f76bd-c958-423d-a768-1caf8d33b9bc")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("9c0addec-3d77-4e4a-8018-9d001fcf3d35")
        public static SmDependency getOwnedRequirementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedRequirementDep;
        }

        @objid ("fa334cb7-3433-4d6d-8d3e-80abdb6fe6f3")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("8aebdc3c-200d-41f4-891e-e96df9a1a0fa")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("07ce1ca0-a488-42bb-a7cf-4eeb4f1ff33e")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5d09907d-9f1a-4c08-bde2-a6c85790c6dd")
            public ISmObjectData createData() {
                return new RequirementContainerData();
            }

            @objid ("c065b1bc-91ce-41b1-b588-ec74a4396052")
            public SmObjectImpl createImpl() {
                return new RequirementContainerImpl();
            }

        }

        @objid ("f1c82696-4fcd-4b1b-b5c0-d18f2f74a598")
        public static class OwnedRequirementSmDependency extends SmMultipleDependency {
            @objid ("7d83d965-6720-4fad-a53c-c521bd81ca3b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementContainerData)data).mOwnedRequirement != null)? ((RequirementContainerData)data).mOwnedRequirement:SmMultipleDependency.EMPTY;
            }

            @objid ("aa6a31a0-650b-4569-8453-45f1d5be0531")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementContainerData) data).mOwnedRequirement = new ArrayList<>(initialCapacity);
                return ((RequirementContainerData) data).mOwnedRequirement;
            }

            @objid ("aa568683-063e-4546-81b6-de6e9c154d9b")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("c5897d15-00b0-4e45-bb22-aebcb970058a")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("079b75af-d199-47d2-91f4-ac43f2678966")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementContainerData) data).mOwnerContainer;
            }

            @objid ("515be1ec-3f06-44cb-9688-382517d43ce3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementContainerData) data).mOwnerContainer = value;
            }

            @objid ("c27bb744-a7cf-4db5-bea1-b4920768aac8")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("330d97fb-2196-4371-91a5-ab6af7e69c7a")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("d12d8998-4dd3-4585-94d8-31184a179355")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementContainerData)data).mOwnedContainer != null)? ((RequirementContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("3f7e246e-f045-46a6-a0f9-f9536177dae2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((RequirementContainerData) data).mOwnedContainer;
            }

            @objid ("f883961c-3b31-4ab9-aa70-b9e516f0c131")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("42ad14b7-d56e-4447-9f4e-e75140745b73")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("0e133d47-90dc-40fc-909a-3b5d7435f201")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementContainerData) data).mOwnerProject;
            }

            @objid ("cde03dde-7c5e-4690-b059-1e049902af84")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementContainerData) data).mOwnerProject = value;
            }

            @objid ("f286b36d-f9d5-4b19-8668-c24586a377f0")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.RequirementRootDep();
            }

        }

    }

}
