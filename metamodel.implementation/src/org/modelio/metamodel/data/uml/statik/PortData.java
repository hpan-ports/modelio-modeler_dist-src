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
    @objid ("7e15c599-1d34-4998-b148-e380ad37a016")
    @SmaMetaAttribute(metaName="IsBehavior", type=Boolean.class, smAttributeClass=Metadata.IsBehaviorSmAttribute.class)
     Object mIsBehavior = false;

    @objid ("984ce31e-a35e-4f1f-8353-20e984bde769")
    @SmaMetaAttribute(metaName="IsService", type=Boolean.class, smAttributeClass=Metadata.IsServiceSmAttribute.class)
     Object mIsService = false;

    @objid ("466a7063-a06a-4be1-8108-69072ceabc9d")
    @SmaMetaAttribute(metaName="IsConjugated", type=Boolean.class, smAttributeClass=Metadata.IsConjugatedSmAttribute.class)
     Object mIsConjugated = false;

    @objid ("5dc95a44-223d-4ab6-b806-84aa162bc532")
    @SmaMetaAttribute(metaName="Direction", type=PortOrientation.class, smAttributeClass=Metadata.DirectionSmAttribute.class)
     Object mDirection = PortOrientation.NONE;

    @objid ("d5161fd9-4c53-447b-8e09-d7cca4f53816")
    @SmaMetaAssociation(metaName="Provided", typeDataClass=ProvidedInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.ProvidedSmDependency.class, component = true)
     List<SmObjectImpl> mProvided = null;

    @objid ("66f3e2df-0cac-4d8e-9c8f-1f04f6f6a8f6")
    @SmaMetaAssociation(metaName="Required", typeDataClass=RequiredInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredSmDependency.class, component = true)
     List<SmObjectImpl> mRequired = null;

    @objid ("901a4259-59bf-4ed5-b5fb-ebb621fb5bea")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007f05e4-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f9995311-99e6-4545-9d40-31d08af30124")
        private static SmClass smClass = null;

        @objid ("4edb4845-5e10-4c49-b357-5f4c7e611524")
        private static SmAttribute IsBehaviorAtt = null;

        @objid ("5cbfe78e-5032-45fa-95bf-efa7c12d1577")
        private static SmAttribute IsServiceAtt = null;

        @objid ("dd5515c6-2d32-46db-852a-124d32c61366")
        private static SmAttribute IsConjugatedAtt = null;

        @objid ("d27e0a82-7346-4132-a0a8-d4028efc2a24")
        private static SmAttribute DirectionAtt = null;

        @objid ("bf4c63e2-2523-4f3e-bcfd-0211d1f76817")
        private static SmDependency ProvidedDep = null;

        @objid ("d042ab51-fdf8-42e6-aee7-8d466afb31fe")
        private static SmDependency RequiredDep = null;

        @objid ("fd31c4f8-899f-4e62-b44f-dd5d55fdc3a1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PortData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("346c1b4a-5a16-4e25-b860-6379ad1617fe")
        public static SmAttribute IsBehaviorAtt() {
            if (IsBehaviorAtt == null) {
            	IsBehaviorAtt = classof().getAttributeDef("IsBehavior");
            }
            return IsBehaviorAtt;
        }

        @objid ("084f64c1-5c58-49bf-87c5-07ec02725a85")
        public static SmAttribute IsServiceAtt() {
            if (IsServiceAtt == null) {
            	IsServiceAtt = classof().getAttributeDef("IsService");
            }
            return IsServiceAtt;
        }

        @objid ("d66af7d0-8f8b-492a-95a1-994870267a63")
        public static SmAttribute IsConjugatedAtt() {
            if (IsConjugatedAtt == null) {
            	IsConjugatedAtt = classof().getAttributeDef("IsConjugated");
            }
            return IsConjugatedAtt;
        }

        @objid ("639cd3d3-ef8a-415f-85f6-30b082b60c01")
        public static SmAttribute DirectionAtt() {
            if (DirectionAtt == null) {
            	DirectionAtt = classof().getAttributeDef("Direction");
            }
            return DirectionAtt;
        }

        @objid ("ec1fcebe-d5fa-4a43-bcb1-0658a0127d8b")
        public static SmDependency ProvidedDep() {
            if (ProvidedDep == null) {
            	ProvidedDep = classof().getDependencyDef("Provided");
            }
            return ProvidedDep;
        }

        @objid ("92aba70b-41db-41cc-b7b0-63ef546287e3")
        public static SmDependency RequiredDep() {
            if (RequiredDep == null) {
            	RequiredDep = classof().getDependencyDef("Required");
            }
            return RequiredDep;
        }

        @objid ("7d8fb52f-c4ac-4647-a7e7-b3f2cdd2dbec")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1f0d5a1d-4caf-4b8b-8fe1-9cec736caa23")
        public static SmDependency getRequiredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredDep;
        }

        @objid ("5d58e12c-1524-4110-92dc-3111e52b0c67")
        public static SmDependency getProvidedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidedDep;
        }

        @objid ("12054354-87c1-466d-8367-2c9dae1e6f9c")
        public static SmAttribute getIsBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsBehaviorAtt;
        }

        @objid ("cd49190e-665b-4a93-bd0d-d96b205c46cc")
        public static SmAttribute getIsConjugatedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsConjugatedAtt;
        }

        @objid ("5afc167a-c5dc-4856-a207-087d4805b290")
        public static SmAttribute getDirectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DirectionAtt;
        }

        @objid ("a86ddceb-9f63-4c7f-b8fb-ed4923426da1")
        public static SmAttribute getIsServiceAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsServiceAtt;
        }

        @objid ("007f4734-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9d602f52-f1a0-4ad9-9c86-390876b10e47")
            public ISmObjectData createData() {
                return new PortData();
            }

            @objid ("d35750b2-0fde-4fe9-92d1-80b813b4bd50")
            public SmObjectImpl createImpl() {
                return new PortImpl();
            }

        }

        @objid ("007fa936-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsBehaviorSmAttribute extends SmAttribute {
            @objid ("69666aff-573e-4572-953d-6a61fd08bd03")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mIsBehavior;
            }

            @objid ("1c086286-295b-499a-8e27-a4a96c4a9ecd")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mIsBehavior = value;
            }

        }

        @objid ("00800b6a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsServiceSmAttribute extends SmAttribute {
            @objid ("74ef4edc-bb09-40a9-937b-3aa80e582f75")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mIsService;
            }

            @objid ("4c33247d-64e3-479f-941e-3bf3784dd947")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mIsService = value;
            }

        }

        @objid ("00806fec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsConjugatedSmAttribute extends SmAttribute {
            @objid ("b39a1a3d-7afb-4d15-a4dc-090fe84eaa5d")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mIsConjugated;
            }

            @objid ("37dce728-40cb-42d6-935e-c7594392ad86")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mIsConjugated = value;
            }

        }

        @objid ("0080d41e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RequiredSmDependency extends SmMultipleDependency {
            @objid ("815e3dbe-8244-44f1-9e60-3f7cfcc6e237")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PortData)data).mRequired != null)? ((PortData)data).mRequired:SmMultipleDependency.EMPTY;
            }

            @objid ("07772ec9-0c81-44e7-97ba-7692afd9140f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PortData) data).mRequired = new ArrayList<>(initialCapacity);
                return ((PortData) data).mRequired;
            }

            @objid ("a5224e64-70e5-4ab8-ba99-93df33f0dae2")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.RequiringDep();
            }

        }

        @objid ("00813904-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProvidedSmDependency extends SmMultipleDependency {
            @objid ("bce6464c-f7c8-4aca-a70d-b15da0d9bf73")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PortData)data).mProvided != null)? ((PortData)data).mProvided:SmMultipleDependency.EMPTY;
            }

            @objid ("5e9f2825-4342-4ec7-95d8-89cc0492210d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PortData) data).mProvided = new ArrayList<>(initialCapacity);
                return ((PortData) data).mProvided;
            }

            @objid ("27c0aa0a-0f08-40a1-8e7e-5b80be748a5a")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.ProvidingDep();
            }

        }

        @objid ("004dfbca-7950-1fe9-b4b9-001ec947cd2a")
        public static class DirectionSmAttribute extends SmAttribute {
            @objid ("14ff53f7-c5d5-4558-b6e8-45c0f87eb3d2")
            public Object getValue(ISmObjectData data) {
                return ((PortData) data).mDirection;
            }

            @objid ("d78de8aa-4521-470f-861b-48bc0a69ac5f")
            public void setValue(ISmObjectData data, Object value) {
                ((PortData) data).mDirection = value;
            }

        }

    }

}
