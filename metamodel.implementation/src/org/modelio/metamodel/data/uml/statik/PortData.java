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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ProvidedInterfaceData;
import org.modelio.metamodel.data.uml.statik.RequiredInterfaceData;
import org.modelio.metamodel.impl.uml.statik.PortImpl;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
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

@objid ("00193926-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Port.class, factory=PortData.Metadata.ObjectFactory.class)
public class PortData extends BindableInstanceData {
    @objid ("049573ed-6cf2-436c-9e54-aa7fe3ccfd53")
    @SmaMetaAttribute(metaName="IsBehavior", type=Boolean.class, smAttributeClass=Metadata.IsBehaviorSmAttribute.class)
     Object mIsBehavior = false;

    @objid ("ea5382cf-2861-4460-8c57-edffc32d8414")
    @SmaMetaAttribute(metaName="IsService", type=Boolean.class, smAttributeClass=Metadata.IsServiceSmAttribute.class)
     Object mIsService = false;

    @objid ("8ec357a4-c576-48f8-a1f0-6dab6db1785f")
    @SmaMetaAttribute(metaName="IsConjugated", type=Boolean.class, smAttributeClass=Metadata.IsConjugatedSmAttribute.class)
     Object mIsConjugated = false;

    @objid ("c878bf63-6672-4840-8f26-affe763d22b0")
    @SmaMetaAttribute(metaName="Direction", type=PortOrientation.class, smAttributeClass=Metadata.DirectionSmAttribute.class)
     Object mDirection = PortOrientation.NONE;

    @objid ("12776e4c-c985-4fda-aeef-0118dc29d30f")
    @SmaMetaAssociation(metaName="Provided", typeDataClass=ProvidedInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.ProvidedSmDependency.class, component = true)
     List<SmObjectImpl> mProvided = null;

    @objid ("a2a8ea28-fa67-4200-944d-fb60f8d45ef7")
    @SmaMetaAssociation(metaName="Required", typeDataClass=RequiredInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredSmDependency.class, component = true)
     List<SmObjectImpl> mRequired = null;

    @objid ("e81c69d1-f13b-4f46-9efd-e06ddacbc13a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007f05e4-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0f40c49c-53e6-4d73-a466-18f70457ffe2")
        private static SmClass smClass = null;

        @objid ("087ba44e-e3e1-4368-a47a-859109a72868")
        private static SmAttribute IsBehaviorAtt = null;

        @objid ("24a652d4-9387-48a9-a6db-10e916fa0e5b")
        private static SmAttribute IsServiceAtt = null;

        @objid ("f378dbae-ede3-4ff3-95cf-e1698fcd9802")
        private static SmAttribute IsConjugatedAtt = null;

        @objid ("f3eb1a10-34a0-419c-b034-294dec80ef08")
        private static SmAttribute DirectionAtt = null;

        @objid ("039fd9a8-1840-44da-ad2a-18c94bf980af")
        private static SmDependency ProvidedDep = null;

        @objid ("b0e155da-94b9-4b61-ac64-2d7bf733e3bc")
        private static SmDependency RequiredDep = null;

        @objid ("71a975c4-7b0e-459b-b69f-c01d61d31b3a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PortData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f98cc478-e05a-4c93-a5bc-013c17000404")
        public static SmAttribute IsBehaviorAtt() {
            if (IsBehaviorAtt == null) {
            	IsBehaviorAtt = classof().getAttributeDef("IsBehavior");
            }
            return IsBehaviorAtt;
        }

        @objid ("ff66496e-f76c-49da-81d5-ee0309784ef1")
        public static SmAttribute IsServiceAtt() {
            if (IsServiceAtt == null) {
            	IsServiceAtt = classof().getAttributeDef("IsService");
            }
            return IsServiceAtt;
        }

        @objid ("aeebf94a-c9e7-4c6c-9995-7cc8eb014ed9")
        public static SmAttribute IsConjugatedAtt() {
            if (IsConjugatedAtt == null) {
            	IsConjugatedAtt = classof().getAttributeDef("IsConjugated");
            }
            return IsConjugatedAtt;
        }

        @objid ("7e8011f3-9402-4ac2-a798-6d1046c8b2dc")
        public static SmAttribute DirectionAtt() {
            if (DirectionAtt == null) {
            	DirectionAtt = classof().getAttributeDef("Direction");
            }
            return DirectionAtt;
        }

        @objid ("d2873a63-b79b-4e40-8ecc-714ca56a132d")
        public static SmDependency ProvidedDep() {
            if (ProvidedDep == null) {
            	ProvidedDep = classof().getDependencyDef("Provided");
            }
            return ProvidedDep;
        }

        @objid ("d8e442b2-0bff-4292-b209-e449ced0e88e")
        public static SmDependency RequiredDep() {
            if (RequiredDep == null) {
            	RequiredDep = classof().getDependencyDef("Required");
            }
            return RequiredDep;
        }

        @objid ("7a0a5372-70c0-4d9c-ad8e-8ae8cd3d0fbf")
        public static SmAttribute getIsConjugatedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsConjugatedAtt;
        }

        @objid ("1d36d496-5f9b-44fe-862d-7d92c12ebefe")
        public static SmAttribute getIsServiceAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsServiceAtt;
        }

        @objid ("c6e43d36-fa69-46e7-b174-f716ad788628")
        public static SmAttribute getIsBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsBehaviorAtt;
        }

        @objid ("a0c10203-9318-450a-8b97-75f58606dce9")
        public static SmDependency getRequiredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredDep;
        }

        @objid ("1aefbac8-9b18-4974-8c95-f8998ed0def7")
        public static SmAttribute getDirectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DirectionAtt;
        }

        @objid ("d77b2cc2-a5ab-4a14-a08c-cddba1756fd6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("041d9d65-56b9-4f80-8ffe-f7efae785b4b")
        public static SmDependency getProvidedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidedDep;
        }

        @objid ("007f4734-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fdcb8197-abb3-42ae-86c4-e4d7f1f556a1")
            public ISmObjectData createData() {
                return new PortData();
            }

            @objid ("26cccce9-2104-4b95-9ea4-d4afab9a2d19")
            public SmObjectImpl createImpl() {
                return new PortImpl();
            }

        }

        @objid ("007fa936-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsBehaviorSmAttribute extends SmAttribute {
            @objid ("c7234b8f-490d-46df-bd4b-6805305282e1")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mIsBehavior;
            }

            @objid ("4115cfc7-f055-432f-9bca-ffc6ea77fb34")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mIsBehavior = value;
            }

        }

        @objid ("00800b6a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsServiceSmAttribute extends SmAttribute {
            @objid ("21db6fc8-212f-4038-9186-ef1becc1675a")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mIsService;
            }

            @objid ("34a3f7e9-489c-4ad1-a110-9a74ed9607e0")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mIsService = value;
            }

        }

        @objid ("00806fec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsConjugatedSmAttribute extends SmAttribute {
            @objid ("521fdc99-52f9-4b0f-827e-582f2dc6a56e")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mIsConjugated;
            }

            @objid ("72af4145-a6e4-4b6a-844b-e84044bf8ee1")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mIsConjugated = value;
            }

        }

        @objid ("0080d41e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RequiredSmDependency extends SmMultipleDependency {
            @objid ("54445720-93cb-4c0c-baff-4059229a6948")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PortData)data).mRequired != null)? ((PortData)data).mRequired:SmMultipleDependency.EMPTY;
            }

            @objid ("b284eeb6-1d42-4816-98b9-b08724ba599c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PortData) data).mRequired = new ArrayList<>(initialCapacity);
                return ((PortData) data).mRequired;
            }

            @objid ("1d854025-af2a-4982-bb23-f4f5634b2887")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.RequiringDep();
            }

        }

        @objid ("00813904-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProvidedSmDependency extends SmMultipleDependency {
            @objid ("48d70752-2a75-489e-8a28-1bb800635121")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PortData)data).mProvided != null)? ((PortData)data).mProvided:SmMultipleDependency.EMPTY;
            }

            @objid ("d55c542a-e353-4050-b2de-347ef35e7b8e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PortData) data).mProvided = new ArrayList<>(initialCapacity);
                return ((PortData) data).mProvided;
            }

            @objid ("0a55e77d-de11-4faa-a560-533faf04d240")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.ProvidingDep();
            }

        }

        @objid ("004dfbca-7950-1fe9-b4b9-001ec947cd2a")
        public static class DirectionSmAttribute extends SmAttribute {
            @objid ("3ba07f67-3947-4e9c-846a-bc8615c6f2bb")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mDirection;
            }

            @objid ("c3d0919a-2bd7-4bfb-b971-3297b1cba465")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mDirection = value;
            }

        }

    }

}
