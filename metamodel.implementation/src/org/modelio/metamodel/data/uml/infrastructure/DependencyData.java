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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.infrastructure.DependencyImpl;
import org.modelio.metamodel.uml.infrastructure.Dependency;
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

@objid ("0086407a-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Dependency.class, factory=DependencyData.Metadata.ObjectFactory.class)
public class DependencyData extends ModelElementData {
    @objid ("e02cad6e-460d-41db-a789-16e1e65d358b")
    @SmaMetaAttribute(metaName="DependsOnId", type=String.class, smAttributeClass=Metadata.DependsOnIdSmAttribute.class, fpindexed=true)
     Object mDependsOnId = "";

    @objid ("17ee8bc4-4019-41ca-bb9b-5005078803c4")
    @SmaMetaAttribute(metaName="DependsOnName", type=String.class, smAttributeClass=Metadata.DependsOnNameSmAttribute.class)
     Object mDependsOnName = "";

    @objid ("d3a343ce-eef6-4a80-94a7-500d68d1c8a5")
    @SmaMetaAssociation(metaName="DependsOn", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.DependsOnSmDependency.class, partof = true)
     SmObjectImpl mDependsOn;

    @objid ("94e457d5-9f39-422b-ad46-7591f67773e9")
    @SmaMetaAssociation(metaName="Impacted", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.ImpactedSmDependency.class)
     SmObjectImpl mImpacted;

    @objid ("c8a87829-c674-4f2f-9359-c8bcab0b8be2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00457590-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("03c39c78-6d53-460b-8b97-b41c0e6e2e19")
        private static SmClass smClass = null;

        @objid ("9f60f600-99cf-4f7c-bf41-7aa8546b5d4f")
        private static SmAttribute DependsOnIdAtt = null;

        @objid ("69bf8064-6f47-4e98-84ef-6014570b4f7d")
        private static SmAttribute DependsOnNameAtt = null;

        @objid ("70e200ed-b53b-468d-8667-e47bed81b694")
        private static SmDependency DependsOnDep = null;

        @objid ("6da86b12-636d-4ee0-b8a9-0cbb3e4121aa")
        private static SmDependency ImpactedDep = null;

        @objid ("c635346f-34b9-44d1-bf9c-aa39680904de")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DependencyData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0b6b105e-3706-4c94-b627-c41836b94375")
        public static SmAttribute DependsOnIdAtt() {
            if (DependsOnIdAtt == null) {
            	DependsOnIdAtt = classof().getAttributeDef("DependsOnId");
            }
            return DependsOnIdAtt;
        }

        @objid ("47b561ee-1918-4db4-a876-0f2dc5989431")
        public static SmAttribute DependsOnNameAtt() {
            if (DependsOnNameAtt == null) {
            	DependsOnNameAtt = classof().getAttributeDef("DependsOnName");
            }
            return DependsOnNameAtt;
        }

        @objid ("2ad3d7e8-e7a8-48c3-a936-38faede460ea")
        public static SmDependency DependsOnDep() {
            if (DependsOnDep == null) {
            	DependsOnDep = classof().getDependencyDef("DependsOn");
            }
            return DependsOnDep;
        }

        @objid ("a2aa7d5d-e446-4175-855f-1c40fe5bc27b")
        public static SmDependency ImpactedDep() {
            if (ImpactedDep == null) {
            	ImpactedDep = classof().getDependencyDef("Impacted");
            }
            return ImpactedDep;
        }

        @objid ("d74463fc-671a-46ec-8e67-524f6572c8c0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("93caabe9-fcdc-4419-9970-d25e13417e35")
        public static SmAttribute getDependsOnNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnNameAtt;
        }

        @objid ("4fa39e68-4051-4708-912c-f64ac68797dc")
        public static SmDependency getImpactedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImpactedDep;
        }

        @objid ("cc02cbff-856a-404c-b8d8-ccb8e0c55b81")
        public static SmDependency getDependsOnDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnDep;
        }

        @objid ("780a0e10-7494-4b99-b462-755a7280b468")
        public static SmAttribute getDependsOnIdAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnIdAtt;
        }

        @objid ("0045bab4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("07f53f29-d62a-4554-83e3-76dcee7e7b07")
            public ISmObjectData createData() {
                return new DependencyData();
            }

            @objid ("334d2249-1d88-4d2b-95fa-bd204551e806")
            public SmObjectImpl createImpl() {
                return new DependencyImpl();
            }

        }

        @objid ("00461c48-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DependsOnIdSmAttribute extends SmAttribute {
            @objid ("fdbef632-96b2-4438-bfd8-db625ca97626")
            public Object getValue(ISmObjectData data) {
                return ((DependencyData) data).mDependsOnId;
            }

            @objid ("c29dabeb-d341-44c1-8997-59cd6bf0df14")
            public void setValue(ISmObjectData data, Object value) {
                ((DependencyData) data).mDependsOnId = value;
            }

        }

        @objid ("00467dfa-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DependsOnNameSmAttribute extends SmAttribute {
            @objid ("d082c7e0-68c0-4997-95dd-f2db301cf754")
            public Object getValue(ISmObjectData data) {
                return ((DependencyData) data).mDependsOnName;
            }

            @objid ("b543aed7-2a84-469d-9ce4-8e4d0c1c90b0")
            public void setValue(ISmObjectData data, Object value) {
                ((DependencyData) data).mDependsOnName = value;
            }

        }

        @objid ("0046e1be-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImpactedSmDependency extends SmSingleDependency {
            @objid ("f7a26f62-e9ce-42a1-9c4c-e646f344b8f1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DependencyData) data).mImpacted;
            }

            @objid ("cc5daeef-9b3a-4a05-b47b-a4e8b58294ff")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DependencyData) data).mImpacted = value;
            }

            @objid ("ba0b1b71-4952-41f5-a166-54949981cb45")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DependsOnDependencyDep();
            }

        }

        @objid ("00475a7c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DependsOnSmDependency extends SmSingleDependency {
            @objid ("0812ab68-2ca7-4870-9f96-8738399244ab")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DependencyData) data).mDependsOn;
            }

            @objid ("855467c6-86e6-4c05-b296-a6535ed331b7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DependencyData) data).mDependsOn = value;
            }

            @objid ("60a0fd76-21a3-4bea-8f84-5bece5762f89")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ImpactedDependencyDep();
            }

        }

    }

}
