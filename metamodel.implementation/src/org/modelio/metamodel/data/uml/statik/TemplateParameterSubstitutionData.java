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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.TemplateBindingData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterData;
import org.modelio.metamodel.impl.uml.statik.TemplateParameterSubstitutionImpl;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
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

@objid ("001e961e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TemplateParameterSubstitution.class, factory=TemplateParameterSubstitutionData.Metadata.ObjectFactory.class)
public class TemplateParameterSubstitutionData extends ModelElementData {
    @objid ("459170a9-7c15-4697-9f0a-709ff660f507")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("9958f94d-32e7-4275-a764-5a2a92fa7b36")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=TemplateBindingData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("1af3c658-9ef1-460d-81e2-1f16afc35956")
    @SmaMetaAssociation(metaName="Actual", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.ActualSmDependency.class, partof = true)
     SmObjectImpl mActual;

    @objid ("de52ccb2-b42f-4099-9654-b4f669bf04d7")
    @SmaMetaAssociation(metaName="FormalParameter", typeDataClass=TemplateParameterData.class, min=1, max=1, smAssociationClass=Metadata.FormalParameterSmDependency.class, partof = true)
     SmObjectImpl mFormalParameter;

    @objid ("a42fa6b7-5f5a-49e0-a576-db0d2863a156")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00653eca-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("50a968e6-2418-4e1b-b4bd-af95943386c7")
        private static SmClass smClass = null;

        @objid ("63669fbc-68a1-419b-aac9-14d9e523b21a")
        private static SmAttribute ValueAtt = null;

        @objid ("546423f4-b3d0-481e-b225-bfdaacb07a23")
        private static SmDependency OwnerDep = null;

        @objid ("8546fdae-940a-4c12-97f0-eadbf0f3587f")
        private static SmDependency ActualDep = null;

        @objid ("b3f69384-0ad4-445a-87b8-5642a62d89ad")
        private static SmDependency FormalParameterDep = null;

        @objid ("1a680646-1814-4650-8c4a-40683ee0f004")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TemplateParameterSubstitutionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("47f78838-c935-4aa0-9f4e-8597ecca746a")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("7c66ea24-36e5-4e0a-b94e-47f09ef38514")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("9b0b612c-d50d-4c19-8b6d-799ae8db16d2")
        public static SmDependency ActualDep() {
            if (ActualDep == null) {
            	ActualDep = classof().getDependencyDef("Actual");
            }
            return ActualDep;
        }

        @objid ("974d7540-7cbf-4649-9966-caf9a7df96eb")
        public static SmDependency FormalParameterDep() {
            if (FormalParameterDep == null) {
            	FormalParameterDep = classof().getDependencyDef("FormalParameter");
            }
            return FormalParameterDep;
        }

        @objid ("b5370674-da3f-4ec1-9628-a4cad4caac6c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7f0b0a39-4215-4755-bcec-8ff294fd3097")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("d81b1e3c-cd02-4889-9b19-843b6f27c912")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("5888b910-b780-45bc-924d-77b779628367")
        public static SmDependency getFormalParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FormalParameterDep;
        }

        @objid ("e6dac68e-100e-4a50-8805-eac315a8edb5")
        public static SmDependency getActualDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualDep;
        }

        @objid ("00657ef8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("69c4d959-2b97-4cea-89ad-e11e6abbadf5")
            public ISmObjectData createData() {
                return new TemplateParameterSubstitutionData();
            }

            @objid ("329dc04e-a830-41f2-b39d-3883bfb49f9a")
            public SmObjectImpl createImpl() {
                return new TemplateParameterSubstitutionImpl();
            }

        }

        @objid ("0065df7e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("52a34d9c-084d-4c00-8614-264ffe97ba4d")
            public Object getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mValue;
            }

            @objid ("eea205ad-e52c-43d9-bd7d-9e4e6416f67c")
            public void setValue(ISmObjectData data, Object value) {
                ((TemplateParameterSubstitutionData) data).mValue = value;
            }

        }

        @objid ("00664158-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ActualSmDependency extends SmSingleDependency {
            @objid ("bce452fc-5ed0-4136-a9cf-1db93fa2c547")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mActual;
            }

            @objid ("ced86062-eedd-4dc8-90bb-204c2f1b8a86")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterSubstitutionData) data).mActual = value;
            }

            @objid ("24705314-6132-4ad3-8d81-321acc7bceaa")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.TemplateSubstitutionDep();
            }

        }

        @objid ("0066b5de-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("06f03bc1-1345-4053-a512-14f4875ae727")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mOwner;
            }

            @objid ("aa9885b5-2f2f-4ae9-9a33-602a4492b0bc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterSubstitutionData) data).mOwner = value;
            }

            @objid ("31583064-655a-4ac7-9266-d741ca360b31")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.ParameterSubstitutionDep();
            }

        }

        @objid ("00672a46-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FormalParameterSmDependency extends SmSingleDependency {
            @objid ("bdcc5221-ab2c-4853-a07a-5c834e376c69")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mFormalParameter;
            }

            @objid ("0285a4e2-3094-4770-819d-d2b2c13756bc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterSubstitutionData) data).mFormalParameter = value;
            }

            @objid ("e09762f9-8c50-4b24-86f8-b98221483c24")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.ParameterSubstitutionDep();
            }

        }

    }

}
