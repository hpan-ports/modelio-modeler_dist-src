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
    @objid ("fc830acb-15fe-4531-acb3-a0699789ea4c")
    @SmaMetaAttribute(metaName="IsActive", type=Boolean.class, smAttributeClass=Metadata.IsActiveSmAttribute.class)
     Object mIsActive = false;

    @objid ("5b5a817b-3054-44da-b287-fab827239cca")
    @SmaMetaAttribute(metaName="IsMain", type=Boolean.class, smAttributeClass=Metadata.IsMainSmAttribute.class)
     Object mIsMain = false;

    @objid ("3e3d0485-34e3-4358-b7aa-c99bb40c8ae8")
    @SmaMetaAssociation(metaName="LinkToAssociation", typeDataClass=ClassAssociationData.class, min=0, max=1, smAssociationClass=Metadata.LinkToAssociationSmDependency.class, istodelete = true)
     SmObjectImpl mLinkToAssociation;

    @objid ("e97a8466-3ba6-43cc-a1f3-a1412bb63cc4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0088a950-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2688b0a9-f714-49ab-a5f3-e0d85dca7d05")
        private static SmClass smClass = null;

        @objid ("1d1aad7b-5e78-4372-92c5-40529160481a")
        private static SmAttribute IsActiveAtt = null;

        @objid ("d56eea01-09e5-47dd-aa9a-d85243d3e964")
        private static SmAttribute IsMainAtt = null;

        @objid ("bf67a3e8-b8aa-42fc-b1a9-bb605955a4b0")
        private static SmDependency LinkToAssociationDep = null;

        @objid ("638d92a1-96a3-4dcf-85b3-3aac40c9280b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("628d8afd-d014-403a-aa1d-6ad2f709cfff")
        public static SmAttribute IsActiveAtt() {
            if (IsActiveAtt == null) {
            	IsActiveAtt = classof().getAttributeDef("IsActive");
            }
            return IsActiveAtt;
        }

        @objid ("aa008b73-6fb6-4145-bec7-a6144fbb851d")
        public static SmAttribute IsMainAtt() {
            if (IsMainAtt == null) {
            	IsMainAtt = classof().getAttributeDef("IsMain");
            }
            return IsMainAtt;
        }

        @objid ("8d0c4fd6-c189-4a8c-a336-b0e7bee20238")
        public static SmDependency LinkToAssociationDep() {
            if (LinkToAssociationDep == null) {
            	LinkToAssociationDep = classof().getDependencyDef("LinkToAssociation");
            }
            return LinkToAssociationDep;
        }

        @objid ("392dd512-04e3-4e3d-bd3e-bc45eb5dc356")
        public static SmAttribute getIsMainAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMainAtt;
        }

        @objid ("d6304f20-cab8-43ec-ae01-3467e698bc26")
        public static SmDependency getLinkToAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkToAssociationDep;
        }

        @objid ("54274c45-5435-4335-99c9-73a9a4bd54fc")
        public static SmAttribute getIsActiveAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsActiveAtt;
        }

        @objid ("aa07e33f-c907-47a5-8c75-47bc8e9750b1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0088eaaa-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7fcce3f7-3e61-409e-86d2-0135ce2bab8f")
            public ISmObjectData createData() {
                return new ClassData();
            }

            @objid ("7cd394f0-3aa1-4de2-95fd-7ca7801c3413")
            public SmObjectImpl createImpl() {
                return new ClassImpl();
            }

        }

        @objid ("00894bd0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsActiveSmAttribute extends SmAttribute {
            @objid ("f216a430-3001-4371-84c3-50319068439a")
            public Object getValue(ISmObjectData data) {
                return ((ClassData) data).mIsActive;
            }

            @objid ("35c7ebda-611a-4ddd-91f9-910e4e03ad31")
            public void setValue(ISmObjectData data, Object value) {
                ((ClassData) data).mIsActive = value;
            }

        }

        @objid ("0089ac92-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsMainSmAttribute extends SmAttribute {
            @objid ("ccfa6d0f-70b3-463b-9f8b-8d5a0b53384c")
            public Object getValue(ISmObjectData data) {
                return ((ClassData) data).mIsMain;
            }

            @objid ("a94515eb-e811-4a38-b424-cc7a0f4b453c")
            public void setValue(ISmObjectData data, Object value) {
                ((ClassData) data).mIsMain = value;
            }

        }

        @objid ("008a138a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LinkToAssociationSmDependency extends SmSingleDependency {
            @objid ("49fb5de1-d0aa-48fa-98cc-d1434a7908a0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassData) data).mLinkToAssociation;
            }

            @objid ("f90083f9-dcb6-44ad-aa45-7f6211a575f5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassData) data).mLinkToAssociation = value;
            }

            @objid ("7a2a5b55-f1ac-4be8-af9e-fd2380713630")
            @Override
            public SmDependency getSymetric() {
                return ClassAssociationData.Metadata.ClassPartDep();
            }

        }

    }

}
