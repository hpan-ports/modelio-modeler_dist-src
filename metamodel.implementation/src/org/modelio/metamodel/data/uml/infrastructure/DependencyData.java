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
    @objid ("5572d8d5-35b7-4a0d-bfe7-83201d954af6")
    @SmaMetaAttribute(metaName="DependsOnId", type=String.class, smAttributeClass=Metadata.DependsOnIdSmAttribute.class, fpindexed=true)
     Object mDependsOnId = "";

    @objid ("4972f7bc-b812-42fb-8adf-368c18ed8872")
    @SmaMetaAttribute(metaName="DependsOnName", type=String.class, smAttributeClass=Metadata.DependsOnNameSmAttribute.class)
     Object mDependsOnName = "";

    @objid ("a1aa3421-dc82-4f1f-bfd3-486528f47072")
    @SmaMetaAssociation(metaName="DependsOn", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.DependsOnSmDependency.class, partof = true)
     SmObjectImpl mDependsOn;

    @objid ("8ebebe80-a3b4-466d-83ff-40707edb7787")
    @SmaMetaAssociation(metaName="Impacted", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.ImpactedSmDependency.class)
     SmObjectImpl mImpacted;

    @objid ("4f93d7ca-304d-4b26-9e4d-8ccd9df13c83")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00457590-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2302c393-85a7-4c08-8b80-7c18c10b2614")
        private static SmClass smClass = null;

        @objid ("4877828f-a49c-460d-a11a-3f9257799163")
        private static SmAttribute DependsOnIdAtt = null;

        @objid ("0e7a2ad2-6adb-49ef-895e-ae6150024353")
        private static SmAttribute DependsOnNameAtt = null;

        @objid ("062935e5-09a3-4ad9-bf71-d7eff1af09e2")
        private static SmDependency DependsOnDep = null;

        @objid ("8e9edb21-45d8-4edb-8231-4fd541614e33")
        private static SmDependency ImpactedDep = null;

        @objid ("ea9bb11f-2d52-4bdc-b4b4-0c37d6a69e3c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DependencyData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f1af3413-ea7f-4c66-9822-33e690c068ce")
        public static SmAttribute DependsOnIdAtt() {
            if (DependsOnIdAtt == null) {
            	DependsOnIdAtt = classof().getAttributeDef("DependsOnId");
            }
            return DependsOnIdAtt;
        }

        @objid ("a54e54f9-6af9-49c2-89da-ab09e5c0960a")
        public static SmAttribute DependsOnNameAtt() {
            if (DependsOnNameAtt == null) {
            	DependsOnNameAtt = classof().getAttributeDef("DependsOnName");
            }
            return DependsOnNameAtt;
        }

        @objid ("cf04643a-f502-4215-bb09-cca72301f7ad")
        public static SmDependency DependsOnDep() {
            if (DependsOnDep == null) {
            	DependsOnDep = classof().getDependencyDef("DependsOn");
            }
            return DependsOnDep;
        }

        @objid ("f87d14fa-3db4-462f-92ec-3177d6dbd636")
        public static SmDependency ImpactedDep() {
            if (ImpactedDep == null) {
            	ImpactedDep = classof().getDependencyDef("Impacted");
            }
            return ImpactedDep;
        }

        @objid ("c9e4034d-f1c6-46f6-987b-dc871bf752cc")
        public static SmAttribute getDependsOnIdAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnIdAtt;
        }

        @objid ("ed82c931-8068-429c-9bce-1790ebf112db")
        public static SmAttribute getDependsOnNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnNameAtt;
        }

        @objid ("974dd273-b570-4386-a974-3d91741f4283")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7ad7e491-ed42-415a-a7d6-04fc835b8040")
        public static SmDependency getDependsOnDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnDep;
        }

        @objid ("bbb40dca-37a5-43b5-81d7-8d4ea1501885")
        public static SmDependency getImpactedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImpactedDep;
        }

        @objid ("0045bab4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("19bc6423-0007-45ad-90cb-d7d2ddf10e80")
            public ISmObjectData createData() {
                return new DependencyData();
            }

            @objid ("08c177d5-f83e-48cc-a83b-0f3722d16aa2")
            public SmObjectImpl createImpl() {
                return new DependencyImpl();
            }

        }

        @objid ("00461c48-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DependsOnIdSmAttribute extends SmAttribute {
            @objid ("895003be-2c1a-4fa0-8845-b3bf5d7e084a")
            public Object getValue(ISmObjectData data) {
                return ((DependencyData) data).mDependsOnId;
            }

            @objid ("cdd4f37a-ee5e-48f9-8505-3df86c681411")
            public void setValue(ISmObjectData data, Object value) {
                ((DependencyData) data).mDependsOnId = value;
            }

        }

        @objid ("00467dfa-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DependsOnNameSmAttribute extends SmAttribute {
            @objid ("0ababc2f-d549-4791-aa44-e66127b0a17e")
            public Object getValue(ISmObjectData data) {
                return ((DependencyData) data).mDependsOnName;
            }

            @objid ("54bdd0f5-3e27-4a5a-ba0b-a012b440b841")
            public void setValue(ISmObjectData data, Object value) {
                ((DependencyData) data).mDependsOnName = value;
            }

        }

        @objid ("0046e1be-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImpactedSmDependency extends SmSingleDependency {
            @objid ("f8270d61-bc14-4466-9d22-5c9a143fa9c5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DependencyData) data).mImpacted;
            }

            @objid ("071e76b7-c1f8-43af-a2dd-de7f08ecf805")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DependencyData) data).mImpacted = value;
            }

            @objid ("cc709bd6-2a0c-48db-aae1-cb8441ea1010")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DependsOnDependencyDep();
            }

        }

        @objid ("00475a7c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DependsOnSmDependency extends SmSingleDependency {
            @objid ("b994ec38-de93-4623-b97b-f4dd46819aff")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DependencyData) data).mDependsOn;
            }

            @objid ("a2e430e6-614d-4529-8a25-52f44a109273")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DependencyData) data).mDependsOn = value;
            }

            @objid ("769ab79c-623b-46b4-aa52-7d9d9a0dac86")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ImpactedDependencyDep();
            }

        }

    }

}
