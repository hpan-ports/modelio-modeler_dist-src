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
    @objid ("834522fd-9b39-49ed-bc42-d7ca1cb46869")
    @SmaMetaAttribute(metaName="DependsOnId", type=String.class, smAttributeClass=Metadata.DependsOnIdSmAttribute.class, fpindexed=true)
     Object mDependsOnId = "";

    @objid ("b62e0e3a-efe5-42f3-8c39-54899818c66b")
    @SmaMetaAttribute(metaName="DependsOnName", type=String.class, smAttributeClass=Metadata.DependsOnNameSmAttribute.class)
     Object mDependsOnName = "";

    @objid ("e214a5bc-5686-4e2b-b935-894157af4803")
    @SmaMetaAssociation(metaName="DependsOn", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.DependsOnSmDependency.class, partof = true)
     SmObjectImpl mDependsOn;

    @objid ("6fbf9e08-35eb-4fad-924b-a275df78c44c")
    @SmaMetaAssociation(metaName="Impacted", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.ImpactedSmDependency.class)
     SmObjectImpl mImpacted;

    @objid ("f81839c6-b8fd-4574-bf13-7d75f71653c6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00457590-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("801a8364-fc98-4c6c-9c4c-6787d80d9be8")
        private static SmClass smClass = null;

        @objid ("c6e4067f-f82c-4086-b058-fb18d439b32a")
        private static SmAttribute DependsOnIdAtt = null;

        @objid ("f0dca2da-ca7b-406b-a20f-4021c67c474d")
        private static SmAttribute DependsOnNameAtt = null;

        @objid ("3dc136aa-649e-484d-bdda-5864cf222235")
        private static SmDependency DependsOnDep = null;

        @objid ("3210a098-6719-4286-9399-54606ddc6fe6")
        private static SmDependency ImpactedDep = null;

        @objid ("9f980a83-2f0f-4f0b-88fc-0d17771abd82")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DependencyData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4e3421c2-6399-46d6-928c-0e65cf2aa64f")
        public static SmAttribute DependsOnIdAtt() {
            if (DependsOnIdAtt == null) {
            	DependsOnIdAtt = classof().getAttributeDef("DependsOnId");
            }
            return DependsOnIdAtt;
        }

        @objid ("55ce6b15-cd4b-4f1d-bfb9-0476b7ff19c4")
        public static SmAttribute DependsOnNameAtt() {
            if (DependsOnNameAtt == null) {
            	DependsOnNameAtt = classof().getAttributeDef("DependsOnName");
            }
            return DependsOnNameAtt;
        }

        @objid ("4ae401d2-3768-43f2-b9b6-6c19e703bd07")
        public static SmDependency DependsOnDep() {
            if (DependsOnDep == null) {
            	DependsOnDep = classof().getDependencyDef("DependsOn");
            }
            return DependsOnDep;
        }

        @objid ("e9a70d8a-1823-4f98-8136-f2626447bb27")
        public static SmDependency ImpactedDep() {
            if (ImpactedDep == null) {
            	ImpactedDep = classof().getDependencyDef("Impacted");
            }
            return ImpactedDep;
        }

        @objid ("58b9fabc-bfb9-431b-82c9-a924e50f9258")
        public static SmAttribute getDependsOnIdAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnIdAtt;
        }

        @objid ("974c4261-89e7-4f9b-8e05-c61bfeba6cb0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d1baef27-466d-42f3-b6a3-5f6d3134927f")
        public static SmDependency getDependsOnDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnDep;
        }

        @objid ("b02b909e-c99e-419c-8333-f56a924ade13")
        public static SmAttribute getDependsOnNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnNameAtt;
        }

        @objid ("5fabbe0e-5eeb-4e5b-b2d1-0ede40836b59")
        public static SmDependency getImpactedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImpactedDep;
        }

        @objid ("0045bab4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("74650589-bdc2-4a23-b083-91129bdaa867")
            public ISmObjectData createData() {
                return new DependencyData();
            }

            @objid ("5f01d5dd-7f83-468f-867d-2dcd4914976c")
            public SmObjectImpl createImpl() {
                return new DependencyImpl();
            }

        }

        @objid ("00461c48-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DependsOnIdSmAttribute extends SmAttribute {
            @objid ("01c2089b-9f63-49bd-8dfc-1032563f35bd")
            public Object getValue(ISmObjectData data) {
                return ((DependencyData) data).mDependsOnId;
            }

            @objid ("12e16dca-74d0-4f19-8762-e0c36fe6d572")
            public void setValue(ISmObjectData data, Object value) {
                ((DependencyData) data).mDependsOnId = value;
            }

        }

        @objid ("00467dfa-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DependsOnNameSmAttribute extends SmAttribute {
            @objid ("a60c5f1d-f85e-49d6-a0f0-6de4fde5672f")
            public Object getValue(ISmObjectData data) {
                return ((DependencyData) data).mDependsOnName;
            }

            @objid ("de545d00-a774-4406-9535-9403bad9b40d")
            public void setValue(ISmObjectData data, Object value) {
                ((DependencyData) data).mDependsOnName = value;
            }

        }

        @objid ("0046e1be-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImpactedSmDependency extends SmSingleDependency {
            @objid ("04a30c7e-4b3f-4eda-a1ef-90df74be31b8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DependencyData) data).mImpacted;
            }

            @objid ("a6b5d9c2-ffe1-4a7a-b7fb-74e0740c89bc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DependencyData) data).mImpacted = value;
            }

            @objid ("39cdcf55-76cd-44b6-8fc0-9018f2f46ab1")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DependsOnDependencyDep();
            }

        }

        @objid ("00475a7c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DependsOnSmDependency extends SmSingleDependency {
            @objid ("d7cc8c81-dbf4-49fe-a870-d9f97a2630ae")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DependencyData) data).mDependsOn;
            }

            @objid ("448e73b3-21b4-4354-9469-d9d1337974ea")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DependencyData) data).mDependsOn = value;
            }

            @objid ("4969f316-f9a5-45a9-85d1-36dca80f6e4e")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ImpactedDependencyDep();
            }

        }

    }

}
