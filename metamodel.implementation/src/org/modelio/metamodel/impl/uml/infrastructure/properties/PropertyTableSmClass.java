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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.MatrixValueDefinitionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.QueryDefinitionSmClass;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
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

@objid ("8b24307d-4164-47ea-a31e-4840ee34aa3e")
public class PropertyTableSmClass extends ElementSmClass {
    @objid ("4b33dd6a-c700-4cc3-a837-075c581fafc0")
    private SmAttribute nameAtt;

    @objid ("75791a04-b31c-49e7-a622-eb1fd86c9077")
    private SmAttribute contentAtt;

    @objid ("45f4577f-fff2-4533-b330-d29d7660e24f")
    private SmDependency ownerDep;

    @objid ("efc5f427-fe7f-44d2-b328-d777ffb0a10f")
    private SmDependency ownerValDefDep;

    @objid ("ad507263-2d1a-43a7-80c4-36c8878d45ed")
    private SmDependency ownerQueryDep;

    @objid ("a497eb23-eb18-45a9-813c-c12345d35343")
    public PropertyTableSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("6d013952-528f-4b3f-86cd-b69a030c0ae0")
    @Override
    public String getName() {
        return "PropertyTable";
    }

    @objid ("40f4d96b-b66a-4e88-81ec-7eb4e1aa23ed")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("e82ad072-3815-47c5-bcb9-ee18793f7652")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return PropertyTable.class;
    }

    @objid ("e40ebd59-47d4-4a95-a333-b9997ee143de")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("62ce6ecc-a970-48e2-94ce-005c3bd77535")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("add18ac3-1d73-4e13-91d1-908fecc78f64")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Element");
        this.registerFactory(new PropertyTableObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.nameAtt = new NameSmAttribute();
        this.nameAtt.init("Name", this, String.class );
        registerAttribute(this.nameAtt);
        
        this.contentAtt = new ContentSmAttribute();
        this.contentAtt.init("Content", this, String.class );
        registerAttribute(this.contentAtt);
        
        
        // Initialize and register the SmDependency
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("ModelElement"), 0, 1 );
        registerDependency(this.ownerDep);
        
        this.ownerValDefDep = new OwnerValDefSmDependency();
        this.ownerValDefDep.init("OwnerValDef", this, metamodel.getMClass("MatrixValueDefinition"), 0, 1 );
        registerDependency(this.ownerValDefDep);
        
        this.ownerQueryDep = new OwnerQuerySmDependency();
        this.ownerQueryDep.init("OwnerQuery", this, metamodel.getMClass("QueryDefinition"), 0, 1 );
        registerDependency(this.ownerQueryDep);
    }

    @objid ("7044045f-255c-42fb-aeb1-99ab70900c41")
    public SmAttribute getNameAtt() {
        if (this.nameAtt == null) {
        	this.nameAtt = this.getAttributeDef("Name");
        }
        return this.nameAtt;
    }

    @objid ("a8012d03-aa4b-4c99-baf3-aba11ef31651")
    public SmAttribute getContentAtt() {
        if (this.contentAtt == null) {
        	this.contentAtt = this.getAttributeDef("Content");
        }
        return this.contentAtt;
    }

    @objid ("023d648f-ea47-402b-8427-c53ac7431a66")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("942f902b-2778-45fe-b3d7-8fab3606fe9b")
    public SmDependency getOwnerValDefDep() {
        if (this.ownerValDefDep == null) {
        	this.ownerValDefDep = this.getDependencyDef("OwnerValDef");
        }
        return this.ownerValDefDep;
    }

    @objid ("d3649d48-ec99-45d1-b755-4356a576fa38")
    public SmDependency getOwnerQueryDep() {
        if (this.ownerQueryDep == null) {
        	this.ownerQueryDep = this.getDependencyDef("OwnerQuery");
        }
        return this.ownerQueryDep;
    }

    @objid ("c140d1c6-0685-45ad-ab4f-29bd2dec574c")
    private static class PropertyTableObjectFactory implements ISmObjectFactory {
        @objid ("0c5abf47-17e0-4db4-a09d-d3982ad2ff1b")
        private PropertyTableSmClass smClass;

        @objid ("c2d19b1a-00da-4747-9a60-3f21571e7c24")
        public PropertyTableObjectFactory(PropertyTableSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("b391fdaf-9be6-47b1-b7aa-83b6025cb074")
        @Override
        public ISmObjectData createData() {
            return new PropertyTableData(this.smClass);
        }

        @objid ("a3b43161-c66f-4a4b-ab1f-d8d19e636993")
        @Override
        public SmObjectImpl createImpl() {
            return new PropertyTableImpl();
        }

    }

    @objid ("61bd0ea6-72a2-4848-8322-d7432419e76c")
    public static class NameSmAttribute extends SmAttribute {
        @objid ("d0f3af15-8722-44d6-8552-58310e0e29fa")
        public Object getValue(ISmObjectData data) {
            return ((PropertyTableData) data).mName;
        }

        @objid ("802617a2-ddd7-4b30-beeb-0be50d4cc409")
        public void setValue(ISmObjectData data, Object value) {
            ((PropertyTableData) data).mName = value;
        }

    }

    @objid ("42a26c08-7de2-4eb7-b018-d4ad10f20981")
    public static class ContentSmAttribute extends SmAttribute {
        @objid ("6d35ce07-7a13-46da-8072-b02ba652b71d")
        public Object getValue(ISmObjectData data) {
            return ((PropertyTableData) data).mContent;
        }

        @objid ("8d29a215-dc33-45c3-8dbd-346935d958dd")
        public void setValue(ISmObjectData data, Object value) {
            ((PropertyTableData) data).mContent = value;
        }

    }

    @objid ("ecff4daf-bf19-4148-9080-1cd1e4061774")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("3164521e-8ab8-4a19-b460-29358725a7d2")
        private SmDependency symetricDep;

        @objid ("7084bbeb-da64-4112-aa3b-1d010f0e191e")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PropertyTableData) data).mOwner;
        }

        @objid ("13bc2550-d5e8-460a-9bbb-bc6109f4c835")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PropertyTableData) data).mOwner = value;
        }

        @objid ("9e126c56-1560-406e-864c-5c057f22c3c6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getPropertiesDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ca7d7759-2d3f-4ade-a211-cead9390970a")
    public static class OwnerValDefSmDependency extends SmSingleDependency {
        @objid ("4f90d5ec-d475-47d1-a3b5-c3444a12ea64")
        private SmDependency symetricDep;

        @objid ("40f5ef91-fb59-4caa-a119-db4359ae4276")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PropertyTableData) data).mOwnerValDef;
        }

        @objid ("d96fda25-abf4-42b5-beeb-0363878622d3")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PropertyTableData) data).mOwnerValDef = value;
        }

        @objid ("d45f0080-2ea3-4729-8d26-f6a597035b55")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MatrixValueDefinitionSmClass)this.getTarget()).getParametersDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d94cc514-baed-41b9-991f-7eb31e04c4f9")
    public static class OwnerQuerySmDependency extends SmSingleDependency {
        @objid ("598c24e3-540a-494b-aae6-3c9a303dabe9")
        private SmDependency symetricDep;

        @objid ("7890707a-3a7f-411e-8e6b-724605a33497")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PropertyTableData) data).mOwnerQuery;
        }

        @objid ("39760269-dd0b-4664-a55b-7f23d019fae7")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PropertyTableData) data).mOwnerQuery = value;
        }

        @objid ("8cee1cf6-4b3c-4fff-a5bc-16a4adebe400")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((QueryDefinitionSmClass)this.getTarget()).getParametersDep();
            }
            return this.symetricDep;
        }

    }

}
