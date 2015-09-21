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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystItem;
import org.modelio.metamodel.impl.analyst.AnalystPropertyTableSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("a90574f2-cca9-43da-9036-d71e505ced03")
public class AnalystItemSmClass extends ModelElementSmClass {
    @objid ("2bb8d54f-c3ef-4ce4-a2aa-59f497e228b0")
    private SmAttribute definitionAtt;

    @objid ("8e02467b-ec11-4236-b7e1-0c61fb6cafe2")
    private SmDependency analystPropertiesDep;

    @objid ("5edded4a-bd29-4900-8d14-edcb34467baf")
    public AnalystItemSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("dabd08f9-235b-4bf5-a88e-9cdb4ac63800")
    @Override
    public String getName() {
        return "AnalystItem";
    }

    @objid ("a2e4ca21-e079-4706-b7a3-6d86888f52e4")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("b81a7809-73b5-4034-82a0-532bc8a88dd8")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return AnalystItem.class;
    }

    @objid ("22c04ef3-ef4c-4c30-81b8-d87a1083ebec")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("f616098d-dc77-45ec-982b-ce910a26d855")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("4a824cb8-b2ef-423a-9fad-de35ef3c7f5a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new AnalystItemObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.definitionAtt = new DefinitionSmAttribute();
        this.definitionAtt.init("Definition", this, String.class );
        registerAttribute(this.definitionAtt);
        
        
        // Initialize and register the SmDependency
        this.analystPropertiesDep = new AnalystPropertiesSmDependency();
        this.analystPropertiesDep.init("AnalystProperties", this, metamodel.getMClass("AnalystPropertyTable"), 1, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.analystPropertiesDep);
    }

    @objid ("73dc4c78-5163-41cc-97bb-5d501c1ec98b")
    public SmAttribute getDefinitionAtt() {
        if (this.definitionAtt == null) {
        	this.definitionAtt = this.getAttributeDef("Definition");
        }
        return this.definitionAtt;
    }

    @objid ("70d574e8-aee7-4a6b-8a36-7eaf9b3f7078")
    public SmDependency getAnalystPropertiesDep() {
        if (this.analystPropertiesDep == null) {
        	this.analystPropertiesDep = this.getDependencyDef("AnalystProperties");
        }
        return this.analystPropertiesDep;
    }

    @objid ("52bffb53-f2df-44b7-b50b-900cff33206c")
    private static class AnalystItemObjectFactory implements ISmObjectFactory {
        @objid ("93b79b89-d0aa-4717-9f89-840497b553e2")
        private AnalystItemSmClass smClass;

        @objid ("93e40b5c-eca4-4192-b899-c33852ca849a")
        public AnalystItemObjectFactory(AnalystItemSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("6857e0a0-eb40-42e6-bcd0-93aee3f26166")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("854c6aac-defc-4c73-8445-65d41ba2fc90")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("cae3c135-7c65-4775-a859-8bb4b4f2b6c2")
    public static class DefinitionSmAttribute extends SmAttribute {
        @objid ("b608e7bc-3e75-4003-bee7-73596345b9ec")
        public Object getValue(ISmObjectData data) {
            return ((AnalystItemData) data).mDefinition;
        }

        @objid ("d72cace3-976f-4ae1-8a17-18b19c6ed3be")
        public void setValue(ISmObjectData data, Object value) {
            ((AnalystItemData) data).mDefinition = value;
        }

    }

    @objid ("b0dc5de0-c561-4d71-b7d4-a8d3a70813cb")
    public static class AnalystPropertiesSmDependency extends SmSingleDependency {
        @objid ("ccca5774-7971-4ccf-bee4-2ecdb41e9c43")
        private SmDependency symetricDep;

        @objid ("39241d9a-10d8-41c3-b13a-94aa569c86c8")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AnalystItemData) data).mAnalystProperties;
        }

        @objid ("954ba1c0-d801-4861-bc06-a003e2453a18")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AnalystItemData) data).mAnalystProperties = value;
        }

        @objid ("1dee3fdb-7934-4b10-9b39-747e0f21098f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AnalystPropertyTableSmClass)this.getTarget()).getAnalystOwnerDep();
            }
            return this.symetricDep;
        }

    }

}
