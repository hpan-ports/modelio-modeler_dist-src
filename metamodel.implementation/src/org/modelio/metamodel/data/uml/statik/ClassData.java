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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ClassAssociationData;
import org.modelio.metamodel.impl.uml.statik.ClassImpl;
import org.modelio.metamodel.uml.statik.Class;
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

@objid ("00027d80-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Class.class, factory=ClassData.Metadata.ObjectFactory.class, cmsnode=true)
public class ClassData extends GeneralClassData {
    @objid ("84422e4f-b3d3-4ae2-9942-4d634d0725f6")
    @SmaMetaAttribute(metaName="IsActive", type=Boolean.class, smAttributeClass=Metadata.IsActiveSmAttribute.class)
     Object mIsActive = false;

    @objid ("a5cd5e5d-c67e-4de2-9ee2-80f7b11cfb6b")
    @SmaMetaAttribute(metaName="IsMain", type=Boolean.class, smAttributeClass=Metadata.IsMainSmAttribute.class)
     Object mIsMain = false;

    @objid ("158e240b-05c7-4f8d-865c-a4da5626236c")
    @SmaMetaAssociation(metaName="LinkToAssociation", typeDataClass=ClassAssociationData.class, min=0, max=1, smAssociationClass=Metadata.LinkToAssociationSmDependency.class, istodelete = true)
     SmObjectImpl mLinkToAssociation;

    @objid ("6d2bbf65-6388-466d-ab3e-934bf912a618")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0088a950-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("68737768-f3c6-484e-84c6-e68f16d02afd")
        private static SmClass smClass = null;

        @objid ("f0319b66-5118-489e-bb1d-450882a21f6f")
        private static SmAttribute IsActiveAtt = null;

        @objid ("64c57a81-3c41-4602-8d1a-433bb856d753")
        private static SmAttribute IsMainAtt = null;

        @objid ("98cb344a-49f9-4886-92ab-d4c644650e14")
        private static SmDependency LinkToAssociationDep = null;

        @objid ("b87c8fc8-81c5-4390-bfbd-8815cf0e3f74")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("51ec7808-fef9-4dbf-a9e6-751ecbc3014e")
        public static SmAttribute IsActiveAtt() {
            if (IsActiveAtt == null) {
            	IsActiveAtt = classof().getAttributeDef("IsActive");
            }
            return IsActiveAtt;
        }

        @objid ("c8c58d9b-e5e9-43f1-89b4-3e0feba96efe")
        public static SmAttribute IsMainAtt() {
            if (IsMainAtt == null) {
            	IsMainAtt = classof().getAttributeDef("IsMain");
            }
            return IsMainAtt;
        }

        @objid ("f68ee485-de04-4420-9737-98f9e86e50f3")
        public static SmDependency LinkToAssociationDep() {
            if (LinkToAssociationDep == null) {
            	LinkToAssociationDep = classof().getDependencyDef("LinkToAssociation");
            }
            return LinkToAssociationDep;
        }

        @objid ("1de1c295-aff3-4fd1-8d25-4d7c52ae4f32")
        public static SmAttribute getIsMainAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMainAtt;
        }

        @objid ("181e76c3-0e10-4a1a-8ec3-94f3861ac332")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e3e2ba90-9764-41af-adbe-edf385f1a73a")
        public static SmDependency getLinkToAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkToAssociationDep;
        }

        @objid ("131b47c1-5fa0-408c-ac7e-a198412f3818")
        public static SmAttribute getIsActiveAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsActiveAtt;
        }

        @objid ("0088eaaa-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4fb76303-97be-4d40-8bdd-cac34d85a0cd")
            public ISmObjectData createData() {
                return new ClassData();
            }

            @objid ("55e1e8b1-5227-439a-9207-b71052ab1194")
            public SmObjectImpl createImpl() {
                return new ClassImpl();
            }

        }

        @objid ("00894bd0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsActiveSmAttribute extends SmAttribute {
            @objid ("2680b657-8a0e-4677-9578-7df25e74eb15")
            public Object getValue(ISmObjectData data) {
                return ((ClassData) data).mIsActive;
            }

            @objid ("b8bdb03c-8d33-4373-8919-8bd5e95e8d30")
            public void setValue(ISmObjectData data, Object value) {
                ((ClassData) data).mIsActive = value;
            }

        }

        @objid ("0089ac92-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsMainSmAttribute extends SmAttribute {
            @objid ("5e69731d-10c3-4f83-9e29-33d9e6b16eb5")
            public Object getValue(ISmObjectData data) {
                return ((ClassData) data).mIsMain;
            }

            @objid ("522e9ca7-f025-4dff-887d-7874ee1ee405")
            public void setValue(ISmObjectData data, Object value) {
                ((ClassData) data).mIsMain = value;
            }

        }

        @objid ("008a138a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LinkToAssociationSmDependency extends SmSingleDependency {
            @objid ("6b7fd864-f577-4a3a-a8ef-a434ea3460ce")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassData) data).mLinkToAssociation;
            }

            @objid ("ad7a44f7-9596-4fe0-95fc-2d8d5590cba2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassData) data).mLinkToAssociation = value;
            }

            @objid ("b314e2e7-89d9-43ac-a7bc-ab53fd321d65")
            @Override
            public SmDependency getSymetric() {
                return ClassAssociationData.Metadata.ClassPartDep();
            }

        }

    }

}
