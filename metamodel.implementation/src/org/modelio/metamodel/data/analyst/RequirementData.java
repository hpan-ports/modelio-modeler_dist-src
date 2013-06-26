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
    @objid ("f3fc4445-f75c-4d04-a4b5-eb8896ba1595")
    @SmaMetaAssociation(metaName="SubRequirement", typeDataClass=RequirementData.class, min=0, max=-1, smAssociationClass=Metadata.SubRequirementSmDependency.class, component = true)
     List<SmObjectImpl> mSubRequirement = null;

    @objid ("cde5d96f-5bc7-4fb2-bc02-5bf8a2cfb607")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=RequirementContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("af611907-d252-4fbc-b76e-84f10b4090ff")
    @SmaMetaAssociation(metaName="ParentRequirement", typeDataClass=RequirementData.class, min=0, max=1, smAssociationClass=Metadata.ParentRequirementSmDependency.class)
     SmObjectImpl mParentRequirement;

    @objid ("9dd56366-8217-450f-b843-7786583169ca")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("59115fc6-ae77-4d6e-8459-548c5891e205")
    public static class Metadata {
        @objid ("1e3836be-da74-4a23-8068-94cf2b9843a9")
        private static SmClass smClass = null;

        @objid ("cf7973c7-d11a-4d1e-8008-ef097ef5b040")
        private static SmDependency SubRequirementDep = null;

        @objid ("cc6d4279-6775-4c8f-ba21-18bffd23e736")
        private static SmDependency OwnerContainerDep = null;

        @objid ("57912025-13bf-4e72-a030-82f4b59def8e")
        private static SmDependency ParentRequirementDep = null;

        @objid ("1e088d7a-ea8c-495b-a4ff-30020da1c98d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RequirementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("54152cf3-bbe5-41a5-b961-790b7c99ea39")
        public static SmDependency SubRequirementDep() {
            if (SubRequirementDep == null) {
            	SubRequirementDep = classof().getDependencyDef("SubRequirement");
            }
            return SubRequirementDep;
        }

        @objid ("3ea2f989-aa17-4e0f-b208-69293e5319ce")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("ae7be304-5449-4f82-bac8-73874fa532b4")
        public static SmDependency ParentRequirementDep() {
            if (ParentRequirementDep == null) {
            	ParentRequirementDep = classof().getDependencyDef("ParentRequirement");
            }
            return ParentRequirementDep;
        }

        @objid ("7f13ca72-b77a-4aa6-9743-8467e91f33aa")
        public static SmDependency getParentRequirementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentRequirementDep;
        }

        @objid ("71633371-5ac6-45d9-a5bc-abaf2798ce32")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("13800148-0187-4715-8bd3-9fae38de5322")
        public static SmDependency getSubRequirementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubRequirementDep;
        }

        @objid ("6179adf6-6490-41f2-9400-7a64f5554486")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("8fb3c95f-267c-4e60-a366-5d23f93059b6")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fea8b055-bb52-4593-a27f-42d79b69b6af")
            public ISmObjectData createData() {
                return new RequirementData();
            }

            @objid ("be646771-a20f-4a46-b0dc-0ab6b6d28281")
            public SmObjectImpl createImpl() {
                return new RequirementImpl();
            }

        }

        @objid ("0b16d465-8e0b-4917-97aa-728cfbd9e4db")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("211c5776-f0de-46aa-99d1-ae6cda087277")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementData) data).mOwnerContainer;
            }

            @objid ("1b11e641-f4e6-4cca-8fdd-0e1522c49bf7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementData) data).mOwnerContainer = value;
            }

            @objid ("5299bd15-33a8-47d6-9c06-7f82aec001ae")
            @Override
            public SmDependency getSymetric() {
                return RequirementContainerData.Metadata.OwnedRequirementDep();
            }

        }

        @objid ("015ad436-44bb-4f76-adac-305c1e5dad32")
        public static class SubRequirementSmDependency extends SmMultipleDependency {
            @objid ("fcb0df36-ab8c-4bd1-8fdb-cd19b65ae52f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequirementData)data).mSubRequirement != null)? ((RequirementData)data).mSubRequirement:SmMultipleDependency.EMPTY;
            }

            @objid ("ecbc369c-3b0a-45a5-98df-6558ad4713c2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequirementData) data).mSubRequirement = new ArrayList<>(initialCapacity);
                return ((RequirementData) data).mSubRequirement;
            }

            @objid ("760fe582-3db1-4427-ba05-1e6bc6ad17dc")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.ParentRequirementDep();
            }

        }

        @objid ("1248b591-50dc-48a8-a038-f96a5e89a40a")
        public static class ParentRequirementSmDependency extends SmSingleDependency {
            @objid ("8a738e1b-1796-4f79-a9c7-50384492103b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequirementData) data).mParentRequirement;
            }

            @objid ("7dd40a24-3a14-4cfd-8f01-1a1401d94db2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequirementData) data).mParentRequirement = value;
            }

            @objid ("94bb942a-2ce5-4978-9780-613f1cdd7ed3")
            @Override
            public SmDependency getSymetric() {
                return RequirementData.Metadata.SubRequirementDep();
            }

        }

    }

}
