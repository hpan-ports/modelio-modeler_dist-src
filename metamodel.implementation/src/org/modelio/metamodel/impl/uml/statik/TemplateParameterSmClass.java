/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.impl.uml.statik.TemplateParameterSubstitutionSmClass;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("b5f86fdd-6b97-467b-a13c-48b4ec111c67")
public class TemplateParameterSmClass extends GeneralClassSmClass {
    @objid ("49f41f02-e4af-42ef-9b87-a78063985637")
    private SmAttribute defaultValueAtt;

    @objid ("23472750-9b83-4525-bb9d-ca566d4a4447")
    private SmAttribute isValueParameterAtt;

    @objid ("846a16e8-e0ad-40dd-929d-737f2e48928c")
    private SmDependency parameterSubstitutionDep;

    @objid ("b9e1e8f5-c617-4184-a951-f1dddc902fbe")
    private SmDependency typeDep;

    @objid ("d41c3347-9bc6-4bc1-a474-ecd8ee476d5b")
    private SmDependency parameterizedDep;

    @objid ("8b94a931-2e8a-4210-b385-2c1f4dce27e3")
    private SmDependency ownedParameterElementDep;

    @objid ("d0de6c58-f69b-47ca-8637-7b06609a4fc4")
    private SmDependency defaultTypeDep;

    @objid ("d11ab48f-8581-4b2f-9bc1-f20cb22fefb8")
    private SmDependency parameterizedOperationDep;

    @objid ("30fa9c16-3848-4c5c-a2e6-49eedec17647")
    public TemplateParameterSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("ade66d58-3af1-4271-a126-0ed46a23408c")
    @Override
    public String getName() {
        return "TemplateParameter";
    }

    @objid ("ee4d19e5-ed6c-4af4-9209-263156885989")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("bff64420-45e7-4ad5-9622-e3a114b5408e")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return TemplateParameter.class;
    }

    @objid ("6a163deb-e78e-4c40-a0ee-a55d515f3cfa")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("9a4f44a0-ad90-4d79-887e-e5e6057d42ca")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("e73bf932-5d6b-4dbf-a658-c9b17f5ec7c6")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("GeneralClass");
        this.registerFactory(new TemplateParameterObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.defaultValueAtt = new DefaultValueSmAttribute();
        this.defaultValueAtt.init("DefaultValue", this, String.class );
        registerAttribute(this.defaultValueAtt);
        
        this.isValueParameterAtt = new IsValueParameterSmAttribute();
        this.isValueParameterAtt.init("IsValueParameter", this, Boolean.class );
        registerAttribute(this.isValueParameterAtt);
        
        
        // Initialize and register the SmDependency
        this.parameterSubstitutionDep = new ParameterSubstitutionSmDependency();
        this.parameterSubstitutionDep.init("ParameterSubstitution", this, metamodel.getMClass("TemplateParameterSubstitution"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.parameterSubstitutionDep);
        
        this.typeDep = new TypeSmDependency();
        this.typeDep.init("Type", this, metamodel.getMClass("ModelElement"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.typeDep);
        
        this.parameterizedDep = new ParameterizedSmDependency();
        this.parameterizedDep.init("Parameterized", this, metamodel.getMClass("NameSpace"), 0, 1 );
        registerDependency(this.parameterizedDep);
        
        this.ownedParameterElementDep = new OwnedParameterElementSmDependency();
        this.ownedParameterElementDep.init("OwnedParameterElement", this, metamodel.getMClass("ModelElement"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedParameterElementDep);
        
        this.defaultTypeDep = new DefaultTypeSmDependency();
        this.defaultTypeDep.init("DefaultType", this, metamodel.getMClass("ModelElement"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.defaultTypeDep);
        
        this.parameterizedOperationDep = new ParameterizedOperationSmDependency();
        this.parameterizedOperationDep.init("ParameterizedOperation", this, metamodel.getMClass("Operation"), 0, 1 );
        registerDependency(this.parameterizedOperationDep);
    }

    @objid ("d7d0d013-83e0-47c1-8b47-e1c53f2e90c3")
    public SmAttribute getDefaultValueAtt() {
        if (this.defaultValueAtt == null) {
        	this.defaultValueAtt = this.getAttributeDef("DefaultValue");
        }
        return this.defaultValueAtt;
    }

    @objid ("535c918a-df11-43c1-8335-06cb1eb2c541")
    public SmAttribute getIsValueParameterAtt() {
        if (this.isValueParameterAtt == null) {
        	this.isValueParameterAtt = this.getAttributeDef("IsValueParameter");
        }
        return this.isValueParameterAtt;
    }

    @objid ("6e948e76-a727-4e75-835e-605b78200901")
    public SmDependency getParameterSubstitutionDep() {
        if (this.parameterSubstitutionDep == null) {
        	this.parameterSubstitutionDep = this.getDependencyDef("ParameterSubstitution");
        }
        return this.parameterSubstitutionDep;
    }

    @objid ("5f8585f9-7f9e-477a-9bda-52c560a271cf")
    public SmDependency getTypeDep() {
        if (this.typeDep == null) {
        	this.typeDep = this.getDependencyDef("Type");
        }
        return this.typeDep;
    }

    @objid ("62b0fc3f-8357-451c-bc7a-ddbb5e6c75d1")
    public SmDependency getParameterizedDep() {
        if (this.parameterizedDep == null) {
        	this.parameterizedDep = this.getDependencyDef("Parameterized");
        }
        return this.parameterizedDep;
    }

    @objid ("8d060746-ecbd-4200-a8d0-dab6c9977a74")
    public SmDependency getOwnedParameterElementDep() {
        if (this.ownedParameterElementDep == null) {
        	this.ownedParameterElementDep = this.getDependencyDef("OwnedParameterElement");
        }
        return this.ownedParameterElementDep;
    }

    @objid ("15fe5109-715a-43fd-a3b3-d78c545a8c88")
    public SmDependency getDefaultTypeDep() {
        if (this.defaultTypeDep == null) {
        	this.defaultTypeDep = this.getDependencyDef("DefaultType");
        }
        return this.defaultTypeDep;
    }

    @objid ("f85afbde-8a15-468a-b30e-7ed9f2df7e3b")
    public SmDependency getParameterizedOperationDep() {
        if (this.parameterizedOperationDep == null) {
        	this.parameterizedOperationDep = this.getDependencyDef("ParameterizedOperation");
        }
        return this.parameterizedOperationDep;
    }

    @objid ("e3514844-ac45-40a9-af8b-e916984b98ff")
    private static class TemplateParameterObjectFactory implements ISmObjectFactory {
        @objid ("378873c3-1abb-47ce-bab4-602b4ddb06c1")
        private TemplateParameterSmClass smClass;

        @objid ("8fe03668-508d-4ff9-a950-91afaa23fe06")
        public TemplateParameterObjectFactory(TemplateParameterSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("7b2603af-f342-47d9-a770-cec3b4229ce6")
        @Override
        public ISmObjectData createData() {
            return new TemplateParameterData(this.smClass);
        }

        @objid ("47826a4b-879d-4e45-a16d-0a9d7ac2a13f")
        @Override
        public SmObjectImpl createImpl() {
            return new TemplateParameterImpl();
        }

    }

    @objid ("8df04eb2-4d43-4a69-8822-269f889e5933")
    public static class DefaultValueSmAttribute extends SmAttribute {
        @objid ("3e0ad1e9-7f50-454a-b2c3-b3a27353229f")
        public Object getValue(ISmObjectData data) {
            return ((TemplateParameterData) data).mDefaultValue;
        }

        @objid ("d9eaaf35-f30f-461e-b3de-0bb7a80a3baa")
        public void setValue(ISmObjectData data, Object value) {
            ((TemplateParameterData) data).mDefaultValue = value;
        }

    }

    @objid ("05c00726-7530-48f6-98ee-2dfe4f25047a")
    public static class IsValueParameterSmAttribute extends SmAttribute {
        @objid ("e58ffaa2-8e33-4139-a6c3-a61536422497")
        public Object getValue(ISmObjectData data) {
            return ((TemplateParameterData) data).mIsValueParameter;
        }

        @objid ("d6266074-1047-40a3-8e60-235370ac0c64")
        public void setValue(ISmObjectData data, Object value) {
            ((TemplateParameterData) data).mIsValueParameter = value;
        }

    }

    @objid ("443856d7-74f5-4f05-848c-f6e7518509d4")
    public static class ParameterSubstitutionSmDependency extends SmMultipleDependency {
        @objid ("ad1d5ef1-d27c-4b82-88f6-59ec3b926c03")
        private SmDependency symetricDep;

        @objid ("c51bddb3-1533-44f1-9923-267b4ea8e647")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((TemplateParameterData)data).mParameterSubstitution != null)? ((TemplateParameterData)data).mParameterSubstitution:SmMultipleDependency.EMPTY;
        }

        @objid ("2d7da6c5-d44b-438a-8da8-bebadeed19a7")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((TemplateParameterData) data).mParameterSubstitution = values;
        }

        @objid ("7b6e975d-f567-453b-acc9-7791178bdea7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateParameterSubstitutionSmClass)this.getTarget()).getFormalParameterDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("794c515f-bfa1-4a93-abb0-fbac12eb1c2d")
    public static class TypeSmDependency extends SmSingleDependency {
        @objid ("757f2dd4-24e4-42ae-ad7e-9c40a13dcd09")
        private SmDependency symetricDep;

        @objid ("4bc83d62-8921-4ae5-9f9d-51226809601a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TemplateParameterData) data).mType;
        }

        @objid ("bec682b8-0a8b-4e65-9099-b627ccbb0ed7")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TemplateParameterData) data).mType = value;
        }

        @objid ("58d2d582-87ba-44ea-8665-160211eca8f0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getTypingParameterDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b1cb36ba-86da-4635-b3e0-dec2c95ed12f")
    public static class ParameterizedSmDependency extends SmSingleDependency {
        @objid ("226e5891-2a20-4c07-91a1-ee05414dd0a3")
        private SmDependency symetricDep;

        @objid ("5ca12611-6fa2-43c8-b868-d98739be619d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TemplateParameterData) data).mParameterized;
        }

        @objid ("32772e8c-0284-4e25-bde7-4fc9ec09fc15")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TemplateParameterData) data).mParameterized = value;
        }

        @objid ("d1cc0225-0059-4a7b-9d92-ab72a821b017")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getTemplateDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("fcc97fe9-27bf-4b52-9427-b17e02e41f03")
    public static class OwnedParameterElementSmDependency extends SmSingleDependency {
        @objid ("56cbaa6e-dbf4-45e6-b3c0-4783c391afd5")
        private SmDependency symetricDep;

        @objid ("d802feb1-3ab6-4bae-bbc6-87d927efc491")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TemplateParameterData) data).mOwnedParameterElement;
        }

        @objid ("c17af7c7-7a68-4fec-801a-16f3a3533609")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TemplateParameterData) data).mOwnedParameterElement = value;
        }

        @objid ("cf41bc0b-bec9-4dc4-87ea-8d594aa36e7d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getOwnerTemplateParameterDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("df5a5fe4-e1cf-43fb-b4f2-3fd7c79391a5")
    public static class DefaultTypeSmDependency extends SmSingleDependency {
        @objid ("fb50c184-8fd7-41d5-bf59-a51c3a557c40")
        private SmDependency symetricDep;

        @objid ("0e284281-304b-414c-b0c1-ca676778a70d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TemplateParameterData) data).mDefaultType;
        }

        @objid ("0d801ae5-4948-4fed-b856-bdc8220fba61")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TemplateParameterData) data).mDefaultType = value;
        }

        @objid ("624276b9-a05b-430e-94ba-52695da1b082")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getDefaultParameteringDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6c05be03-0757-443f-ae94-a1721a0923dc")
    public static class ParameterizedOperationSmDependency extends SmSingleDependency {
        @objid ("cdd47e24-31ab-4a6d-89ad-432e351050b7")
        private SmDependency symetricDep;

        @objid ("e0b1d797-348d-4a9a-b98e-30e50cc767ca")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TemplateParameterData) data).mParameterizedOperation;
        }

        @objid ("ba409c11-9075-46e5-a018-9c551123a66a")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TemplateParameterData) data).mParameterizedOperation = value;
        }

        @objid ("78acce38-847c-4eff-b623-17dc44855393")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getTemplateDep();
            }
            return this.symetricDep;
        }

    }

}
