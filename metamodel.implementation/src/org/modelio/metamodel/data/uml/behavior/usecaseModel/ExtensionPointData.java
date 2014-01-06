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
package org.modelio.metamodel.data.uml.behavior.usecaseModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.UseCaseData;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.UseCaseDependencyData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.ExtensionPointImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.statik.VisibilityMode;
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

@objid ("0059d030-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExtensionPoint.class, factory=ExtensionPointData.Metadata.ObjectFactory.class)
public class ExtensionPointData extends ModelElementData {
    @objid ("29869377-2db1-4afb-b307-59a634d2cfd2")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("abe1a3a4-76b6-4620-af14-b012abcf078f")
    @SmaMetaAssociation(metaName="Extended", typeDataClass=UseCaseDependencyData.class, min=0, max=-1, smAssociationClass=Metadata.ExtendedSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mExtended = null;

    @objid ("c4091d07-cdfb-447f-a1f7-79993f64b5df")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=UseCaseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("92454b40-75d4-44a9-9771-357010bac1a0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003f5322-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("16254600-ecd7-4293-8714-8325ee3c669c")
        private static SmClass smClass = null;

        @objid ("c3d818f5-0c41-45af-a951-adb04a9973ce")
        private static SmAttribute VisibilityAtt = null;

        @objid ("441dd476-f447-4e33-b607-6ac088d717ad")
        private static SmDependency ExtendedDep = null;

        @objid ("4dd20f4a-b19d-4e6a-af6d-a370aff7f691")
        private static SmDependency OwnerDep = null;

        @objid ("78bfafca-feff-46b6-81c8-569c694f0464")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExtensionPointData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f06ea760-2955-4ceb-87d5-e5f08bf77155")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("2a74bfd8-9396-46e7-8786-81b4f8bb0b3a")
        public static SmDependency ExtendedDep() {
            if (ExtendedDep == null) {
            	ExtendedDep = classof().getDependencyDef("Extended");
            }
            return ExtendedDep;
        }

        @objid ("03d9187f-e62f-440b-96b4-9f12ca082c58")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("d002a58d-df6f-407e-99c6-663637fd21e8")
        public static SmDependency getExtendedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtendedDep;
        }

        @objid ("39d04cfd-aec5-4635-b848-472d49d8f78d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6794002c-43e4-4eba-8102-4233e6cc2394")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("dd77d135-c24a-43d2-89ba-f48fdb14d1d1")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("003f98e6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("463e6af6-5675-412e-8bc6-903f47ac9298")
            public ISmObjectData createData() {
                return new ExtensionPointData();
            }

            @objid ("40b6545e-6742-4f48-9b04-abf86c4a737d")
            public SmObjectImpl createImpl() {
                return new ExtensionPointImpl();
            }

        }

        @objid ("003ffb92-c4c3-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("cb989ef2-34db-45be-8e88-5b078c8f226e")
            public Object getValue(ISmObjectData data) {
                return ((ExtensionPointData) data).mVisibility;
            }

            @objid ("027b097e-3eac-4cf6-acce-4fc44e1159b4")
            public void setValue(ISmObjectData data, Object value) {
                ((ExtensionPointData) data).mVisibility = value;
            }

        }

        @objid ("00405fd8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("b585e2f1-d17b-4bd7-beac-939dcf112a7f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExtensionPointData) data).mOwner;
            }

            @objid ("36c164dc-4dea-41e7-a1c1-4b18d75d2578")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExtensionPointData) data).mOwner = value;
            }

            @objid ("a348690e-1ec5-44c7-90cc-d8fee0a9f90a")
            @Override
            public SmDependency getSymetric() {
                return UseCaseData.Metadata.OwnedExtensionDep();
            }

        }

        @objid ("00419ac4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ExtendedSmDependency extends SmMultipleDependency {
            @objid ("f6380933-babf-4c89-804c-dcbf79f36879")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExtensionPointData)data).mExtended != null)? ((ExtensionPointData)data).mExtended:SmMultipleDependency.EMPTY;
            }

            @objid ("4b91ed14-3e94-47b9-b30d-85d1ce704475")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExtensionPointData) data).mExtended = new ArrayList<>(initialCapacity);
                return ((ExtensionPointData) data).mExtended;
            }

            @objid ("c1929b58-09f2-4966-a9f1-8f4be70fdab3")
            @Override
            public SmDependency getSymetric() {
                return UseCaseDependencyData.Metadata.ExtensionLocationDep();
            }

        }

    }

}
