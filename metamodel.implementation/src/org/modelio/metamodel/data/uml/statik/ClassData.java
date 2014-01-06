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
    @objid ("4f1237a9-bc9e-4926-b442-835a6f582470")
    @SmaMetaAttribute(metaName="IsActive", type=Boolean.class, smAttributeClass=Metadata.IsActiveSmAttribute.class)
     Object mIsActive = false;

    @objid ("ce0fa1b0-4c09-448c-8406-c623f5730a2d")
    @SmaMetaAttribute(metaName="IsMain", type=Boolean.class, smAttributeClass=Metadata.IsMainSmAttribute.class)
     Object mIsMain = false;

    @objid ("3599472a-1499-4253-a891-5bac4ce158dd")
    @SmaMetaAssociation(metaName="LinkToAssociation", typeDataClass=ClassAssociationData.class, min=0, max=1, smAssociationClass=Metadata.LinkToAssociationSmDependency.class, istodelete = true)
     SmObjectImpl mLinkToAssociation;

    @objid ("e8a4c52c-8d3e-4e38-96eb-77c3ae45d471")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0088a950-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c1886eb9-f7d0-44d6-80e4-ddb8e97fcc2c")
        private static SmClass smClass = null;

        @objid ("7a1bdc67-a2dc-4b6e-8b5f-a6dd009c2ba8")
        private static SmAttribute IsActiveAtt = null;

        @objid ("eb72a8d4-3b5b-460b-b4ee-a0cc925f1c9d")
        private static SmAttribute IsMainAtt = null;

        @objid ("b4a61a99-849c-4c6c-bd2a-8a8f241afe9a")
        private static SmDependency LinkToAssociationDep = null;

        @objid ("94320095-d082-42a8-a4a0-9dfc016a7734")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("51847027-c215-4991-9df3-fae43f302dd5")
        public static SmAttribute IsActiveAtt() {
            if (IsActiveAtt == null) {
            	IsActiveAtt = classof().getAttributeDef("IsActive");
            }
            return IsActiveAtt;
        }

        @objid ("ca15a33b-56ec-4cb1-9d0b-bf9cc5fd2a4c")
        public static SmAttribute IsMainAtt() {
            if (IsMainAtt == null) {
            	IsMainAtt = classof().getAttributeDef("IsMain");
            }
            return IsMainAtt;
        }

        @objid ("72d4efee-98bc-49fe-8f9d-02888342fa79")
        public static SmDependency LinkToAssociationDep() {
            if (LinkToAssociationDep == null) {
            	LinkToAssociationDep = classof().getDependencyDef("LinkToAssociation");
            }
            return LinkToAssociationDep;
        }

        @objid ("96d3ebce-7926-4b61-ad0c-3fef9fb9535e")
        public static SmAttribute getIsActiveAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsActiveAtt;
        }

        @objid ("c48b560e-3672-489d-97d9-cb64a75df453")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8e83991f-defe-4980-8858-4fc9fb8f954e")
        public static SmAttribute getIsMainAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMainAtt;
        }

        @objid ("851c9f81-4f5e-42e8-a5ce-d23751f23dac")
        public static SmDependency getLinkToAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkToAssociationDep;
        }

        @objid ("0088eaaa-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("995d3a5c-2604-4c22-a035-b717471f9dea")
            public ISmObjectData createData() {
                return new ClassData();
            }

            @objid ("62277c21-f841-4119-a227-1115e8f6633d")
            public SmObjectImpl createImpl() {
                return new ClassImpl();
            }

        }

        @objid ("00894bd0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsActiveSmAttribute extends SmAttribute {
            @objid ("400e0da9-71cf-4bc8-a5db-12702ea1f940")
            public Object getValue(ISmObjectData data) {
                return ((ClassData) data).mIsActive;
            }

            @objid ("db60a47b-1032-4f4c-a560-6868699c49da")
            public void setValue(ISmObjectData data, Object value) {
                ((ClassData) data).mIsActive = value;
            }

        }

        @objid ("0089ac92-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsMainSmAttribute extends SmAttribute {
            @objid ("28c44f1d-aee4-427d-a9a6-08cc0715506e")
            public Object getValue(ISmObjectData data) {
                return ((ClassData) data).mIsMain;
            }

            @objid ("efb44bc8-831d-47f6-8c7c-133c3ea51432")
            public void setValue(ISmObjectData data, Object value) {
                ((ClassData) data).mIsMain = value;
            }

        }

        @objid ("008a138a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LinkToAssociationSmDependency extends SmSingleDependency {
            @objid ("4897b93f-2024-4fe1-812e-427cf64dd64d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassData) data).mLinkToAssociation;
            }

            @objid ("41899f31-b4ff-45f3-9139-23d5dffad1c1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassData) data).mLinkToAssociation = value;
            }

            @objid ("25197155-6c76-44eb-83c7-e02f7b9da095")
            @Override
            public SmDependency getSymetric() {
                return ClassAssociationData.Metadata.ClassPartDep();
            }

        }

    }

}
