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
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.data.analyst.BusinessRuleContainerData;
import org.modelio.metamodel.impl.analyst.BusinessRuleImpl;
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

@objid ("4da7b9f3-596c-4989-b28e-a35e40d48073")
@SmaMetaClass(mmClass=BusinessRule.class, factory=BusinessRuleData.Metadata.ObjectFactory.class)
public class BusinessRuleData extends AnalystElementData {
    @objid ("4728eafb-9f74-4f3c-ad49-7cda9631d4a8")
    @SmaMetaAttribute(metaName="Version", type=Integer.class, smAttributeClass=Metadata.VersionSmAttribute.class)
     Object mVersion = 0;

    @objid ("cb053959-6ba3-4eda-9d1f-1a232f75e7e2")
    @SmaMetaAssociation(metaName="SubRule", typeDataClass=BusinessRuleData.class, min=0, max=-1, smAssociationClass=Metadata.SubRuleSmDependency.class, component = true)
     List<SmObjectImpl> mSubRule = null;

    @objid ("7c576a95-ad7a-461b-9525-2ff911946390")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=BusinessRuleContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("2d17b056-9a6b-4bbc-a8d7-37dad0977491")
    @SmaMetaAssociation(metaName="ParentRule", typeDataClass=BusinessRuleData.class, min=0, max=1, smAssociationClass=Metadata.ParentRuleSmDependency.class)
     SmObjectImpl mParentRule;

    @objid ("4029444e-16ce-4d50-afab-4bf7a5988224")
    @SmaMetaAssociation(metaName="LastRuleVersion", typeDataClass=BusinessRuleData.class, min=0, max=1, smAssociationClass=Metadata.LastRuleVersionSmDependency.class)
     SmObjectImpl mLastRuleVersion;

    @objid ("cc8bc97d-22ec-45ee-b459-0516aa61ef3f")
    @SmaMetaAssociation(metaName="ArchivedRuleVersion", typeDataClass=BusinessRuleData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedRuleVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedRuleVersion = null;

    @objid ("6242e792-9c4d-4396-9c17-da6ae195f6e8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("785300db-57ee-4e9e-8380-59b5550f902c")
    public static class Metadata {
        @objid ("5a8e754d-7e94-44c5-890f-0baa6c5bdc52")
        private static SmClass smClass = null;

        @objid ("4b114541-bf54-44eb-8d63-a9d387537b68")
        private static SmAttribute VersionAtt = null;

        @objid ("59e66ccb-acf1-4977-9863-653320386fb8")
        private static SmDependency SubRuleDep = null;

        @objid ("d02ef703-d9e3-4a80-9ca8-82dc818b91b5")
        private static SmDependency OwnerContainerDep = null;

        @objid ("6bc90ff4-bac8-4bc0-9610-54bd83e0ee44")
        private static SmDependency ParentRuleDep = null;

        @objid ("a3aeb379-6edf-4880-a7a6-08ddcd8b7643")
        private static SmDependency LastRuleVersionDep = null;

        @objid ("066e5e3d-be7f-4ffc-8af1-b61b43fde1c6")
        private static SmDependency ArchivedRuleVersionDep = null;

        @objid ("b60cfc08-8c4a-4488-8b8f-aff44e874f30")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BusinessRuleData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8302917e-6c3b-4230-86f6-8dcd3ec5c120")
        public static SmAttribute VersionAtt() {
            if (VersionAtt == null) {
            	VersionAtt = classof().getAttributeDef("Version");
            }
            return VersionAtt;
        }

        @objid ("332a3d5c-b5ee-481c-bfd3-16e1f4608751")
        public static SmDependency SubRuleDep() {
            if (SubRuleDep == null) {
            	SubRuleDep = classof().getDependencyDef("SubRule");
            }
            return SubRuleDep;
        }

        @objid ("c72d92c8-9d46-4ce6-8986-0105e017a71f")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("b04cbae1-7ad9-43b6-b295-86509f4b4d1b")
        public static SmDependency ParentRuleDep() {
            if (ParentRuleDep == null) {
            	ParentRuleDep = classof().getDependencyDef("ParentRule");
            }
            return ParentRuleDep;
        }

        @objid ("46bd2daf-8090-414e-9c58-690eee3b8558")
        public static SmDependency LastRuleVersionDep() {
            if (LastRuleVersionDep == null) {
            	LastRuleVersionDep = classof().getDependencyDef("LastRuleVersion");
            }
            return LastRuleVersionDep;
        }

        @objid ("d2665e8f-e90b-4378-a2d2-afa2e6f1a07c")
        public static SmDependency ArchivedRuleVersionDep() {
            if (ArchivedRuleVersionDep == null) {
            	ArchivedRuleVersionDep = classof().getDependencyDef("ArchivedRuleVersion");
            }
            return ArchivedRuleVersionDep;
        }

        @objid ("aba79739-c69b-455a-a58b-7baadb31cb98")
        public static SmDependency getLastRuleVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastRuleVersionDep;
        }

        @objid ("ceec3ea1-af81-4ccf-8322-7f904e503209")
        public static SmDependency getParentRuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentRuleDep;
        }

        @objid ("b5cc67b9-b964-438a-9c65-5697f37b9c8f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("95208866-099d-45df-af9e-ed04da820a11")
        public static SmAttribute getVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VersionAtt;
        }

        @objid ("4c20235e-51a1-443b-8567-ab7849e29c31")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("88a8d601-8c41-4a93-b673-8891b47703cd")
        public static SmDependency getArchivedRuleVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedRuleVersionDep;
        }

        @objid ("b2a19e18-e87b-4c37-ba89-acc96327066a")
        public static SmDependency getSubRuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubRuleDep;
        }

        @objid ("89f134e8-1104-4a8f-8f98-c2c2fc658691")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4c914b61-6bd5-4561-ad2f-14bc0a335634")
            public ISmObjectData createData() {
                return new BusinessRuleData();
            }

            @objid ("9070f1d6-fac5-4a7c-bebb-10095027824f")
            public SmObjectImpl createImpl() {
                return new BusinessRuleImpl();
            }

        }

        @objid ("415085fe-8305-48ba-823b-cfe61e2be578")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("699765be-ad63-49b3-bb0e-7dcc380a2552")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleData) data).mOwnerContainer;
            }

            @objid ("35a53681-c8d3-4c6a-8225-440002b01421")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleData) data).mOwnerContainer = value;
            }

            @objid ("3af6d511-da47-4b03-8f79-1f5cd689111a")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnedRuleDep();
            }

        }

        @objid ("3405a99c-020c-4223-8372-bc73f519d55a")
        public static class ParentRuleSmDependency extends SmSingleDependency {
            @objid ("5ffd502b-6936-4192-8ef3-95a1cf31934b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleData) data).mParentRule;
            }

            @objid ("d42e1fd2-f307-4f6d-af9d-c74b3fadf0a1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleData) data).mParentRule = value;
            }

            @objid ("4d22e98c-6b0a-43c2-a817-65eb93c1bc93")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.SubRuleDep();
            }

        }

        @objid ("8e4029b8-e2ad-418a-90b7-315612b06ca9")
        public static class SubRuleSmDependency extends SmMultipleDependency {
            @objid ("f9a9e7f4-5467-4852-b749-b4b7c0fd66c2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleData)data).mSubRule != null)? ((BusinessRuleData)data).mSubRule:SmMultipleDependency.EMPTY;
            }

            @objid ("b5d4c51e-cae0-4a38-9db6-0d5d996bcb4d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleData) data).mSubRule = new ArrayList<>(initialCapacity);
                return ((BusinessRuleData) data).mSubRule;
            }

            @objid ("ede0378e-a8c9-49cf-bf63-9c3d790ae0ca")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.ParentRuleDep();
            }

        }

        @objid ("d73c370c-752a-4e14-9faf-75540178b8bd")
        public static class VersionSmAttribute extends SmAttribute {
            @objid ("4cbb4a93-8355-438c-9a26-4b26c5a591a8")
            public Object getValue(ISmObjectData data) {
                return ((BusinessRuleData) data).mVersion;
            }

            @objid ("55664371-bf04-4a62-a7b6-88023cd6ac63")
            public void setValue(ISmObjectData data, Object value) {
                ((BusinessRuleData) data).mVersion = value;
            }

        }

        @objid ("26ffe0fa-f31b-47dd-bb85-368e627f5526")
        public static class LastRuleVersionSmDependency extends SmSingleDependency {
            @objid ("71304381-4c56-4391-9a35-67162dd5414b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleData) data).mLastRuleVersion;
            }

            @objid ("fea78cdb-ce43-46e8-86d9-5ddbbbb24efe")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleData) data).mLastRuleVersion = value;
            }

            @objid ("aa5bd239-fc36-442c-99a5-41d107d3b5b4")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.ArchivedRuleVersionDep();
            }

        }

        @objid ("d272e18f-a535-4f50-b622-5d7b4bf7659a")
        public static class ArchivedRuleVersionSmDependency extends SmMultipleDependency {
            @objid ("89c6a7cb-1106-4726-8182-3bf19f7bc359")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleData)data).mArchivedRuleVersion != null)? ((BusinessRuleData)data).mArchivedRuleVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("b7f22339-5987-4d44-a1f2-bea4f1518021")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleData) data).mArchivedRuleVersion = new ArrayList<>(initialCapacity);
                return ((BusinessRuleData) data).mArchivedRuleVersion;
            }

            @objid ("1509ed71-9082-46bd-9008-7f45a3317c12")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.LastRuleVersionDep();
            }

        }

    }

}
