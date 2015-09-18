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
    @objid ("76a139a4-0dfb-403b-8835-36bfb3e7ea1c")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("88517871-e3ac-4d95-bb5f-c3b67c5b4266")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=TemplateBindingData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("bb49675c-382f-4177-a24b-3a2d192581d6")
    @SmaMetaAssociation(metaName="Actual", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.ActualSmDependency.class, partof = true)
     SmObjectImpl mActual;

    @objid ("aaa5ee96-8cbd-42c5-a282-917089fda10b")
    @SmaMetaAssociation(metaName="FormalParameter", typeDataClass=TemplateParameterData.class, min=1, max=1, smAssociationClass=Metadata.FormalParameterSmDependency.class, partof = true)
     SmObjectImpl mFormalParameter;

    @objid ("20b66874-0d78-4021-820e-fc455a18f668")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00653eca-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ce4657f3-914a-469e-959b-59c7f555cb21")
        private static SmClass smClass = null;

        @objid ("b3a25a5b-e493-4d68-8057-4bc7eb7a78e0")
        private static SmAttribute ValueAtt = null;

        @objid ("25b35a13-c8d3-4825-9637-39421ac9774b")
        private static SmDependency OwnerDep = null;

        @objid ("b4849324-f8b5-4bfb-900e-7591068e6d64")
        private static SmDependency ActualDep = null;

        @objid ("b4a713f6-086b-491a-aca2-3bcb63c7a68f")
        private static SmDependency FormalParameterDep = null;

        @objid ("24a541da-4e20-4c58-8f5e-9ff59fb03233")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TemplateParameterSubstitutionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5c71110d-a244-4175-8238-26e72a4c842d")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("8d4f47e7-8a74-444c-acb2-2e53ab980f1b")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("5cf36a71-eb77-48af-8a83-5091825cfece")
        public static SmDependency ActualDep() {
            if (ActualDep == null) {
            	ActualDep = classof().getDependencyDef("Actual");
            }
            return ActualDep;
        }

        @objid ("d7a7673c-f832-46ad-9ed3-04789091c64d")
        public static SmDependency FormalParameterDep() {
            if (FormalParameterDep == null) {
            	FormalParameterDep = classof().getDependencyDef("FormalParameter");
            }
            return FormalParameterDep;
        }

        @objid ("016beb93-7f98-415b-a4c9-f45738b5078c")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("a54ab0f5-bcba-4afa-b742-e29164ab8b8f")
        public static SmDependency getFormalParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FormalParameterDep;
        }

        @objid ("7e6d91f3-15f9-44b6-ae36-471d1071cddb")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("b04a48e3-291b-446b-826f-fd50c6d04eea")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5d25bc3e-e0e3-42a4-bc85-8a92a7aa1f97")
        public static SmDependency getActualDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualDep;
        }

        @objid ("00657ef8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c80d62e8-f357-4668-9232-43fc9de65f0d")
            public ISmObjectData createData() {
                return new TemplateParameterSubstitutionData();
            }

            @objid ("4e07c024-5ac1-41a8-838e-11eb42e386e3")
            public SmObjectImpl createImpl() {
                return new TemplateParameterSubstitutionImpl();
            }

        }

        @objid ("0065df7e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("00b5c108-4916-431a-bc6c-bd2ccb60e80f")
            public Object getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mValue;
            }

            @objid ("898e0144-fcc4-4bfe-9094-653e13d0c308")
            public void setValue(ISmObjectData data, Object value) {
                ((TemplateParameterSubstitutionData) data).mValue = value;
            }

        }

        @objid ("00664158-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ActualSmDependency extends SmSingleDependency {
            @objid ("97201e1d-f67d-4146-acab-404aa0cf4824")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mActual;
            }

            @objid ("2e02d87b-d9c0-4675-81fd-60b9962a8a39")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterSubstitutionData) data).mActual = value;
            }

            @objid ("5a82c044-c1cf-436d-8732-52b9447f8f83")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.TemplateSubstitutionDep();
            }

        }

        @objid ("0066b5de-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("c7bf9baf-d0b4-4b69-87b8-de252df2d764")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mOwner;
            }

            @objid ("98e40879-cb11-4caf-b308-9fa21efcf3b8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterSubstitutionData) data).mOwner = value;
            }

            @objid ("fa6badaa-21af-478c-8eca-9f2047692702")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.ParameterSubstitutionDep();
            }

        }

        @objid ("00672a46-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FormalParameterSmDependency extends SmSingleDependency {
            @objid ("509fcf7e-2f60-4bfc-86d8-be758cb48475")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterSubstitutionData) data).mFormalParameter;
            }

            @objid ("ea8738de-e535-400b-bd7b-c2c01a82aadb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterSubstitutionData) data).mFormalParameter = value;
            }

            @objid ("02300bb7-c159-4f42-ab60-2ec640646e95")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.ParameterSubstitutionDep();
            }

        }

    }

}
