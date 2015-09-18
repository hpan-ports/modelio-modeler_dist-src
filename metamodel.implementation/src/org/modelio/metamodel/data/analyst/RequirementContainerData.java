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
    @objid ("8f9d653a-01c0-4e29-a0ce-157939cfaeeb")
    @SmaMetaAssociation(metaName="OwnedRequirement", typeDataClass=RequirementData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedRequirementSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedRequirement = null;

    @objid ("6d50a400-d35f-48e9-bccf-81d49c6f8a13")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=RequirementContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("3f31255d-92ef-40d3-a8ac-121c50ad3ba4")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=RequirementContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("42f0c00e-cb9e-46a6-98a1-a12f354066c6")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("bef87fc6-4457-4cbc-a151-00925821b8f8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("528dce26-56e4-47cd-93e2-650a832a447b")
    public static class Metadata {
        @objid ("f64c2d9b-dd38-4de6-bc24-f58f1990bcb1")
        private static SmClass smClass = null;

        @objid ("f138c387-a679-4d40-8383-fb1ac04a6c12")
        private static SmDependency OwnedRequirementDep = null;

        @objid ("b75d9d4d-1101-44c1-b3aa-a0c65aa2cd8f")
        private static SmDependency OwnerContainerDep = null;

        @objid ("439b0353-df0d-4c0e-a954-2c2c085cb786")
        private static SmDependency OwnedContainerDep = null;

        @objid ("2f4febdc-51f4-4849-bfbf-46484540dd31")
        private static SmDependency OwnerProjectDep = null;

        @objid ("f2f72786-ea33-4c55-b03e-475f281a35eb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RequirementContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("18987c44-c2b8-4485-94cd-faf0fd84dbe8")
        public static SmDependency OwnedRequirementDep() {
            if (OwnedRequirementDep == null) {
            	OwnedRequirementDep = classof().getDependencyDef("OwnedRequirement");
            }
            return OwnedRequirementDep;
        }

        @objid ("933be9ea-0ea0-40a3-9779-3584be325a8a")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("6b859e94-730e-439c-a8f0-ebaee95ee68f")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("c8eaf57b-5a5b-437c-80fc-461fda14b49c")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("189c4099-996c-4aad-8e6f-90554aff909f")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("970b918e-5461-4f50-a51c-97f27f8ad9ed")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("b4822bcc-72c2-4a9c-a188-90780c015179")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6a10fd08-06a4-449b-95c8-4902530ed4a8")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("a1d2d865-c286-4bd2-aa29-23c2a21bbb63")
        public static SmDependency getOwnedRequirementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedRequirementDep;
        }

        @objid ("07ce1ca0-a488-42bb-a7cf-4eeb4f1ff33e")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bcfa5569-62e8-4056-8c3d-ae7b43d5c054")
            public ISmObjectData createData() {
                return new RequirementContainerData();
            }

            @objid ("36fbf420-b462-4d7d-a1c5-c798cae4be5d")
            public SmObjectImpl createImpl() {
                return new RequirementContainerImpl();
            }

        }

        @objid ("f1c82696-4fcd-4b1b-b5c0-d18f2f74a598")
        public static class OwnedRequirementSmDependency extends SmMultipleDependency {
            @objid ("7a3f7923-9e60-4214-be20-6d69cbae532b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementContainerData)data).mOwnedRequirement != null)? ((RequirementContainerData)data).mOwnedRequirement:SmMultipleDependency.EMPTY;
            }

            @objid ("cff7943b-b995-4908-82bb-f8b97b6bc4a1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementContainerData) data).mOwnedRequirement = new ArrayList<>(initialCapacity);
                return ((RequirementContainerData) data).mOwnedRequirement;
            }

            @objid ("5c080b53-ca1a-43dd-ab8b-c92e09d98426")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("c5897d15-00b0-4e45-bb22-aebcb970058a")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("013fad75-b193-4ea0-a84c-a4dd940dafab")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementContainerData) data).mOwnerContainer;
            }

            @objid ("bcb1c0f1-63c6-41c4-91c9-28e28c1e27a9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementContainerData) data).mOwnerContainer = value;
            }

            @objid ("5ac2f79b-b348-4758-828a-05f14e2fa4d5")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("330d97fb-2196-4371-91a5-ab6af7e69c7a")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("b5f9213f-b1f3-409b-94a4-72adb0f2cbe2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementContainerData)data).mOwnedContainer != null)? ((RequirementContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("d2491ed5-b566-40f8-91ae-b1d829217865")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((RequirementContainerData) data).mOwnedContainer;
            }

            @objid ("cf247f67-0149-4588-bf9e-b12230676d68")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("42ad14b7-d56e-4447-9f4e-e75140745b73")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("ad2b3f24-57fe-4fa2-959d-266ab0ac2522")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementContainerData) data).mOwnerProject;
            }

            @objid ("23e3d771-a878-404e-bd76-ddfa8f0b0e04")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementContainerData) data).mOwnerProject = value;
            }

            @objid ("4936e4bc-0a72-4ea9-a838-add46226b6c9")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.RequirementRootDep();
            }

        }

    }

}
