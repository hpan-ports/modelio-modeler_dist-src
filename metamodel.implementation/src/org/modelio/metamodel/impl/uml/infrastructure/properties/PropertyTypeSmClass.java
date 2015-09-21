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
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.analyst.PropertyContainerSmClass;
import org.modelio.metamodel.impl.mda.ModuleComponentSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyDefinitionSmClass;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyBaseType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
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

@objid ("3959d3e8-7a71-49d7-90a5-715e119033e0")
public class PropertyTypeSmClass extends ModelElementSmClass {
    @objid ("dcc8152f-ec13-42aa-aca7-c69782772ff6")
    private SmAttribute baseTypeAtt;

    @objid ("ec3bba63-651a-4743-9f1d-2eff1cf3a9fb")
    private SmDependency analystOwnerDep;

    @objid ("458d3b0d-1029-4d7f-a040-25bbeaeb858b")
    private SmDependency typedDep;

    @objid ("cdedfd4d-d94a-4a4e-9847-1bc119d6b80f")
    private SmDependency moduleOwnerDep;

    @objid ("db0c3c1e-06c0-4c13-a25c-baf1ee9e81ee")
    public PropertyTypeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("8654c6fb-b9de-462c-8195-1dab172bf57d")
    @Override
    public String getName() {
        return "PropertyType";
    }

    @objid ("40427740-112f-4f6f-8a1d-524224b3040f")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("277c7ccc-1c96-4120-a58d-b01bf8d806a4")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return PropertyType.class;
    }

    @objid ("14eb95f1-93f8-44f2-a72d-4d6e739011ca")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("0d1ee9eb-5b08-4969-accf-c3b037eec8d8")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("9ba932b0-78ab-401a-85be-ee52efc6adfd")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new PropertyTypeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.baseTypeAtt = new BaseTypeSmAttribute();
        this.baseTypeAtt.init("BaseType", this, PropertyBaseType.class );
        registerAttribute(this.baseTypeAtt);
        
        
        // Initialize and register the SmDependency
        this.analystOwnerDep = new AnalystOwnerSmDependency();
        this.analystOwnerDep.init("AnalystOwner", this, metamodel.getMClass("PropertyContainer"), 1, 1 );
        registerDependency(this.analystOwnerDep);
        
        this.typedDep = new TypedSmDependency();
        this.typedDep.init("Typed", this, metamodel.getMClass("PropertyDefinition"), 0, -1 );
        registerDependency(this.typedDep);
        
        this.moduleOwnerDep = new ModuleOwnerSmDependency();
        this.moduleOwnerDep.init("ModuleOwner", this, metamodel.getMClass("ModuleComponent"), 1, 1 );
        registerDependency(this.moduleOwnerDep);
    }

    @objid ("76d3c214-a3ef-4ef0-b25a-1b212f9e5af8")
    public SmAttribute getBaseTypeAtt() {
        if (this.baseTypeAtt == null) {
        	this.baseTypeAtt = this.getAttributeDef("BaseType");
        }
        return this.baseTypeAtt;
    }

    @objid ("8542642d-1679-4d56-a171-cd75a3729087")
    public SmDependency getAnalystOwnerDep() {
        if (this.analystOwnerDep == null) {
        	this.analystOwnerDep = this.getDependencyDef("AnalystOwner");
        }
        return this.analystOwnerDep;
    }

    @objid ("df02a3ad-eb8f-4603-869c-3387c88874c7")
    public SmDependency getTypedDep() {
        if (this.typedDep == null) {
        	this.typedDep = this.getDependencyDef("Typed");
        }
        return this.typedDep;
    }

    @objid ("4a5d2a35-e4d4-4c88-8f6e-ec02ed7c4be1")
    public SmDependency getModuleOwnerDep() {
        if (this.moduleOwnerDep == null) {
        	this.moduleOwnerDep = this.getDependencyDef("ModuleOwner");
        }
        return this.moduleOwnerDep;
    }

    @objid ("aac3ffc6-9e0d-4574-b109-0051cf032b7f")
    private static class PropertyTypeObjectFactory implements ISmObjectFactory {
        @objid ("3895bc0a-2b93-4bc1-a04e-058d175656ca")
        private PropertyTypeSmClass smClass;

        @objid ("ecb40d92-440b-4857-88bd-543996334c20")
        public PropertyTypeObjectFactory(PropertyTypeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("fcc1b6ca-f47c-49f3-bb6b-9b76a4ca4706")
        @Override
        public ISmObjectData createData() {
            return new PropertyTypeData(this.smClass);
        }

        @objid ("e13e2b8e-c336-4c88-8ba7-fb380bf3df93")
        @Override
        public SmObjectImpl createImpl() {
            return new PropertyTypeImpl();
        }

    }

    @objid ("fde42f21-0e09-47de-9dcb-6fe7f3a87372")
    public static class BaseTypeSmAttribute extends SmAttribute {
        @objid ("4c518512-6ca5-4287-90e7-3be6df7fc9b7")
        public Object getValue(ISmObjectData data) {
            return ((PropertyTypeData) data).mBaseType;
        }

        @objid ("e76fbcbc-69a3-4731-9ce8-47bc269e6604")
        public void setValue(ISmObjectData data, Object value) {
            ((PropertyTypeData) data).mBaseType = value;
        }

    }

    @objid ("80b3285c-1fc2-4a54-b47a-04d9c62e1939")
    public static class AnalystOwnerSmDependency extends SmSingleDependency {
        @objid ("af1e4089-a266-4a27-a283-453fae2d5eb7")
        private SmDependency symetricDep;

        @objid ("8652802e-e283-4cd7-b1ed-4ba482b58b41")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PropertyTypeData) data).mAnalystOwner;
        }

        @objid ("7cc7e6ac-a0ad-4c78-a8e6-a9ec37af5c50")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PropertyTypeData) data).mAnalystOwner = value;
        }

        @objid ("e107931a-094a-4afe-960a-5db14f39c6ec")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyContainerSmClass)this.getTarget()).getDefinedTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6b5d99eb-3574-40aa-871d-d1fba87d050c")
    public static class TypedSmDependency extends SmMultipleDependency {
        @objid ("630343dd-6d11-454f-8e8d-1ffa2191bfe9")
        private SmDependency symetricDep;

        @objid ("388d03d0-ab1a-4634-bdd5-473c02c7cb75")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((PropertyTypeData)data).mTyped != null)? ((PropertyTypeData)data).mTyped:SmMultipleDependency.EMPTY;
        }

        @objid ("c16173ed-1a24-4ae2-8da4-b2a28f93e6c9")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((PropertyTypeData) data).mTyped = values;
        }

        @objid ("741db7d2-46f5-465d-ae8f-9ac45e18b1a5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyDefinitionSmClass)this.getTarget()).getTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5074b8e7-9391-4156-aab8-776908e021fa")
    public static class ModuleOwnerSmDependency extends SmSingleDependency {
        @objid ("25efc585-4817-4c4f-bba8-480855f13fbb")
        private SmDependency symetricDep;

        @objid ("31312791-f911-40c3-9cf1-57c860926c38")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PropertyTypeData) data).mModuleOwner;
        }

        @objid ("057629d5-9743-470f-9652-0375511aed5a")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PropertyTypeData) data).mModuleOwner = value;
        }

        @objid ("038a24c3-54d6-4249-ad53-0e3ba7405d95")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModuleComponentSmClass)this.getTarget()).getDefinedPropertyTypeDep();
            }
            return this.symetricDep;
        }

    }

}
