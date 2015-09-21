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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.TagParameterSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.TagTypeSmClass;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("ca86e242-965e-4c2a-b06e-2c12ee7543f8")
public class TaggedValueSmClass extends ModelElementSmClass {
    @objid ("6ebbdc40-b695-46e6-9d37-785647bf5171")
    private SmDependency annotedDep;

    @objid ("966263d6-a684-47b1-bccf-f1b72e043317")
    private SmDependency actualDep;

    @objid ("8d32063c-dc56-4a9a-a42d-7fa0e8cc67ef")
    private SmDependency qualifierDep;

    @objid ("13da11ce-04cd-4355-afd3-8e1208ff1ff9")
    private SmDependency definitionDep;

    @objid ("ca926a29-5731-4d7b-bf63-6c0440e5f660")
    public TaggedValueSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("e5ead769-d7b0-49ab-975c-ee131cc2ec76")
    @Override
    public String getName() {
        return "TaggedValue";
    }

    @objid ("50e1cd66-13cf-4799-b019-2139e0098d6c")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("8ba5a682-e24d-422b-8aac-bcf85497522e")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return TaggedValue.class;
    }

    @objid ("98213d2e-4f35-44c3-9b18-fe0ee6938515")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("c20953c2-cca2-4a16-bbe4-e0985c898aef")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("f604245c-332e-4cef-af1c-e5711ec76ecc")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new TaggedValueObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.annotedDep = new AnnotedSmDependency();
        this.annotedDep.init("Annoted", this, metamodel.getMClass("ModelElement"), 0, 1 );
        registerDependency(this.annotedDep);
        
        this.actualDep = new ActualSmDependency();
        this.actualDep.init("Actual", this, metamodel.getMClass("TagParameter"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.actualDep);
        
        this.qualifierDep = new QualifierSmDependency();
        this.qualifierDep.init("Qualifier", this, metamodel.getMClass("TagParameter"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.qualifierDep);
        
        this.definitionDep = new DefinitionSmDependency();
        this.definitionDep.init("Definition", this, metamodel.getMClass("TagType"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.definitionDep);
    }

    @objid ("4793708c-14a2-4792-bd5f-a77d0c4565b0")
    public SmDependency getAnnotedDep() {
        if (this.annotedDep == null) {
        	this.annotedDep = this.getDependencyDef("Annoted");
        }
        return this.annotedDep;
    }

    @objid ("f7a5bd2a-241f-4faa-9caa-3aec842c4832")
    public SmDependency getActualDep() {
        if (this.actualDep == null) {
        	this.actualDep = this.getDependencyDef("Actual");
        }
        return this.actualDep;
    }

    @objid ("82e30e01-e5ad-4989-a693-dcdcc496a651")
    public SmDependency getQualifierDep() {
        if (this.qualifierDep == null) {
        	this.qualifierDep = this.getDependencyDef("Qualifier");
        }
        return this.qualifierDep;
    }

    @objid ("24c4697d-46fb-4c40-801b-d04899e1ddd3")
    public SmDependency getDefinitionDep() {
        if (this.definitionDep == null) {
        	this.definitionDep = this.getDependencyDef("Definition");
        }
        return this.definitionDep;
    }

    @objid ("2073e493-5635-4f3f-800c-30d5cef5aa08")
    private static class TaggedValueObjectFactory implements ISmObjectFactory {
        @objid ("f2b8ce49-92a8-46fb-83e8-0ebb76df9d84")
        private TaggedValueSmClass smClass;

        @objid ("b0cfc86b-6705-446c-887f-afcb07eee396")
        public TaggedValueObjectFactory(TaggedValueSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("b2ffe359-bfbd-4d8c-9196-ce2ee7361cb7")
        @Override
        public ISmObjectData createData() {
            return new TaggedValueData(this.smClass);
        }

        @objid ("0b3f0480-7340-4a1e-a816-a4ec388a3984")
        @Override
        public SmObjectImpl createImpl() {
            return new TaggedValueImpl();
        }

    }

    @objid ("e98f1654-700c-46da-90a3-557dde6aa43a")
    public static class AnnotedSmDependency extends SmSingleDependency {
        @objid ("e5d4f678-4dfe-4155-89eb-2ab27af85d06")
        private SmDependency symetricDep;

        @objid ("6e2b3341-1214-42b0-b8b6-403528080d39")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TaggedValueData) data).mAnnoted;
        }

        @objid ("17e9adfb-b48c-4933-8720-dca3fbfe5926")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TaggedValueData) data).mAnnoted = value;
        }

        @objid ("ee2e0cf3-0f2e-4230-83c5-8f0d086187eb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getTagDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2e28a490-6561-409e-925a-2b0914291f13")
    public static class ActualSmDependency extends SmMultipleDependency {
        @objid ("480e82d5-9ff4-413b-8a2a-46d9907f9005")
        private SmDependency symetricDep;

        @objid ("51f39d44-52a5-4d03-8ad5-ba6ad7207e40")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((TaggedValueData)data).mActual != null)? ((TaggedValueData)data).mActual:SmMultipleDependency.EMPTY;
        }

        @objid ("8e3815fa-bf66-4a33-b99c-89380daa4cf6")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((TaggedValueData) data).mActual = values;
        }

        @objid ("29868314-7267-4074-b1f2-85c5bf11a807")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TagParameterSmClass)this.getTarget()).getAnnotedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e67bd575-00cc-4bfd-8adb-60ab48966a3c")
    public static class QualifierSmDependency extends SmSingleDependency {
        @objid ("984c06bf-25c4-43a5-91ef-6bd457ef9241")
        private SmDependency symetricDep;

        @objid ("17d93902-b930-4b39-ba14-2303b453dd15")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TaggedValueData) data).mQualifier;
        }

        @objid ("3bb31fc1-e23f-48b4-b6a1-a2cdbab51d0c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TaggedValueData) data).mQualifier = value;
        }

        @objid ("bc8a40b7-df34-4c00-adde-75c492fed805")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TagParameterSmClass)this.getTarget()).getQualifiedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5ed6986b-efc3-4238-9abe-d111ae0a3f10")
    public static class DefinitionSmDependency extends SmSingleDependency {
        @objid ("fbb6907d-5abe-4c80-909d-6bc37a023797")
        private SmDependency symetricDep;

        @objid ("da77ea65-a098-49ef-bbd9-3f96cc3453a2")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TaggedValueData) data).mDefinition;
        }

        @objid ("9c3658b7-8f68-449c-9ba6-a34cf4eb48bf")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TaggedValueData) data).mDefinition = value;
        }

        @objid ("9aef863a-9003-4abd-ba86-053034c891a9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TagTypeSmClass)this.getTarget()).getTagOccurenceDep();
            }
            return this.symetricDep;
        }

    }

}
