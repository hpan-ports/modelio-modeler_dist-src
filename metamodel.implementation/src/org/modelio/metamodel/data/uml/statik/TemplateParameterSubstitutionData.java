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
    @objid ("d86e9a08-fcef-48f9-9001-e08f09fe0817")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("1ff0fae2-24c3-40a0-8bb4-23452929ed15")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=TemplateBindingData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("6d11b472-86d6-462f-82ca-6e7f02e5a5de")
    @SmaMetaAssociation(metaName="Actual", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.ActualSmDependency.class, partof = true)
     SmObjectImpl mActual;

    @objid ("88b7c815-1db8-4ddb-839a-c7a66eb0a797")
    @SmaMetaAssociation(metaName="FormalParameter", typeDataClass=TemplateParameterData.class, min=1, max=1, smAssociationClass=Metadata.FormalParameterSmDependency.class, partof = true)
     SmObjectImpl mFormalParameter;

    @objid ("a8312b24-7855-4ccb-adea-86a8f93f5eed")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00653eca-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("becbf064-f738-4cb4-888d-82f514b025de")
        private static SmClass smClass = null;

        @objid ("855b26a0-2590-4203-947d-f46b988cef66")
        private static SmAttribute ValueAtt = null;

        @objid ("48971cee-62f5-44ef-b81c-42d7c8828790")
        private static SmDependency OwnerDep = null;

        @objid ("3203fd39-bae4-4588-a8cc-5cd968163d06")
        private static SmDependency ActualDep = null;

        @objid ("53c1c42c-5e5f-4139-a53e-c9e1635528c5")
        private static SmDependency FormalParameterDep = null;

        @objid ("7ea024d9-e5cb-4d5c-b1b9-f52d25bdef4e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TemplateParameterSubstitutionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d024de72-d3a1-4814-acc2-4fb9e0621736")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("55175d80-c51e-4734-bf34-0169bd247f70")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("fa363a4e-6dfc-4cc6-825c-272b58c0d8a6")
        public static SmDependency ActualDep() {
            if (ActualDep == null) {
            	ActualDep = classof().getDependencyDef("Actual");
            }
            return ActualDep;
        }

        @objid ("5cce10dd-7829-4053-895f-89c0a4a2e0af")
        public static SmDependency FormalParameterDep() {
            if (FormalParameterDep == null) {
            	FormalParameterDep = classof().getDependencyDef("FormalParameter");
            }
            return FormalParameterDep;
        }

        @objid ("bb7793e6-e974-4a04-9220-c15833ff10fd")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("7bc3a137-ac52-405d-b6e8-a6e08e0ebe3f")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("a58d8a35-0e6f-4e3c-a3a9-30fb997ada02")
        public static SmDependency getFormalParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FormalParameterDep;
        }

        @objid ("8f296496-651b-4635-bf27-ab83f1a287c1")
        public static SmDependency getActualDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualDep;
        }

        @objid ("e7dcc30e-4a60-4a92-b01c-161abcd15d69")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00657ef8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9e3b26e8-1425-4dbf-9d7c-7f09a625f04e")
            public ISmObjectData createData() {
                return new TemplateParameterSubstitutionData();
            }

            @objid ("f0acf605-c762-43de-877c-4ce389743a32")
            public SmObjectImpl createImpl() {
                return new TemplateParameterSubstitutionImpl();
            }

        }

        @objid ("0065df7e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("a3924b79-3bec-4e1a-90b9-d2e54ae749b2")
            public Object getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mValue;
            }

            @objid ("0c919719-f794-495b-9d1d-f63f8d95810c")
            public void setValue(ISmObjectData data, Object value) {
                ((TemplateParameterSubstitutionData) data).mValue = value;
            }

        }

        @objid ("00664158-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ActualSmDependency extends SmSingleDependency {
            @objid ("4f4682a6-b17e-4b57-ae3f-83b398b68f76")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mActual;
            }

            @objid ("c436f1a1-739c-4830-a23f-61eab86549bb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterSubstitutionData) data).mActual = value;
            }

            @objid ("ddc36414-7d0a-43eb-8aba-ac3db646a08d")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.TemplateSubstitutionDep();
            }

        }

        @objid ("0066b5de-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("f287420c-4b75-453b-b595-8caaa95012d4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mOwner;
            }

            @objid ("f9dac176-1bc7-42fe-bccb-915ad822ac1d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterSubstitutionData) data).mOwner = value;
            }

            @objid ("14240a68-5b88-4cab-9e3b-d06d8d9376fa")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.ParameterSubstitutionDep();
            }

        }

        @objid ("00672a46-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FormalParameterSmDependency extends SmSingleDependency {
            @objid ("8353db3e-f240-4671-8ad3-1e8e38540085")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mFormalParameter;
            }

            @objid ("45e7a296-6722-45c0-9b14-43b09a04ab42")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterSubstitutionData) data).mFormalParameter = value;
            }

            @objid ("04617036-ca7f-4b9d-883a-8b1bf67955fb")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.ParameterSubstitutionDep();
            }

        }

    }

}
