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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.TemplateBindingSmClass;
import org.modelio.metamodel.impl.uml.statik.TemplateParameterSmClass;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
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

@objid ("4be06bc1-c4cd-476a-beed-ac5652682111")
public class TemplateParameterSubstitutionSmClass extends ModelElementSmClass {
    @objid ("9e13f74d-09b6-4a63-897e-da893f11a985")
    private SmAttribute valueAtt;

    @objid ("0ba6975d-ec97-4162-a99a-0dba8a0df5ad")
    private SmDependency ownerDep;

    @objid ("beabdcd2-44d3-4338-8530-2d13c4c3ca70")
    private SmDependency actualDep;

    @objid ("60079c01-0680-4434-bfcd-7b62f34f03e2")
    private SmDependency formalParameterDep;

    @objid ("0b28eb42-5a08-4e69-a337-9242c38f6d1d")
    public TemplateParameterSubstitutionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("4b56b4a9-1c13-455e-889f-a1c838ba6052")
    @Override
    public String getName() {
        return "TemplateParameterSubstitution";
    }

    @objid ("1322e12e-7787-4f87-ba7f-b5bff0ef27f5")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("e6f70843-2338-4e63-90ac-a3fec874ead3")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return TemplateParameterSubstitution.class;
    }

    @objid ("c92c33ff-598e-42c7-b502-35cb218c7c44")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("749db4bf-5165-4ccd-8021-1e454d6b83f4")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("b1095aa0-e2f3-4a1a-a0e6-cbf930f1ac2c")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new TemplateParameterSubstitutionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.valueAtt = new ValueSmAttribute();
        this.valueAtt.init("Value", this, String.class );
        registerAttribute(this.valueAtt);
        
        
        // Initialize and register the SmDependency
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("TemplateBinding"), 1, 1 );
        registerDependency(this.ownerDep);
        
        this.actualDep = new ActualSmDependency();
        this.actualDep.init("Actual", this, metamodel.getMClass("ModelElement"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.actualDep);
        
        this.formalParameterDep = new FormalParameterSmDependency();
        this.formalParameterDep.init("FormalParameter", this, metamodel.getMClass("TemplateParameter"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.formalParameterDep);
    }

    @objid ("b14fcb94-204b-4ed9-b3f2-e8488daa7b80")
    public SmAttribute getValueAtt() {
        if (this.valueAtt == null) {
        	this.valueAtt = this.getAttributeDef("Value");
        }
        return this.valueAtt;
    }

    @objid ("3072c560-a95b-4ecd-b258-feb2ebd608e6")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("eb5d0c6e-5333-4123-bb72-54fb786360dc")
    public SmDependency getActualDep() {
        if (this.actualDep == null) {
        	this.actualDep = this.getDependencyDef("Actual");
        }
        return this.actualDep;
    }

    @objid ("e9f01dfa-5b07-4d41-855e-97735100cb04")
    public SmDependency getFormalParameterDep() {
        if (this.formalParameterDep == null) {
        	this.formalParameterDep = this.getDependencyDef("FormalParameter");
        }
        return this.formalParameterDep;
    }

    @objid ("5a7c03f2-5710-425f-8e4f-e00dac0d01b4")
    private static class TemplateParameterSubstitutionObjectFactory implements ISmObjectFactory {
        @objid ("41786975-f753-4bd9-a4ec-209762f50514")
        private TemplateParameterSubstitutionSmClass smClass;

        @objid ("8186985c-afef-492c-83cd-ca57157d53df")
        public TemplateParameterSubstitutionObjectFactory(TemplateParameterSubstitutionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("a14b1672-5866-45f6-adfe-fd3d79515191")
        @Override
        public ISmObjectData createData() {
            return new TemplateParameterSubstitutionData(this.smClass);
        }

        @objid ("fc71ebd2-0fc6-485e-9e19-b615bf00dab8")
        @Override
        public SmObjectImpl createImpl() {
            return new TemplateParameterSubstitutionImpl();
        }

    }

    @objid ("2a0bfaff-f634-4f87-b38e-1ad4100a7d52")
    public static class ValueSmAttribute extends SmAttribute {
        @objid ("7044e7d7-6d36-4b86-ab49-12c671ef1749")
        public Object getValue(ISmObjectData data) {
            return ((TemplateParameterSubstitutionData) data).mValue;
        }

        @objid ("75e08869-dd41-4e0c-9355-ccd905d9e176")
        public void setValue(ISmObjectData data, Object value) {
            ((TemplateParameterSubstitutionData) data).mValue = value;
        }

    }

    @objid ("007e605d-efa0-4d2d-9a69-2205ad6f552d")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("41267d4b-908c-4631-b8f3-bd6c6a3a05d4")
        private SmDependency symetricDep;

        @objid ("69d4ebd0-5ba0-4a39-9702-c4c68ad07903")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TemplateParameterSubstitutionData) data).mOwner;
        }

        @objid ("918442a0-df49-4408-ba27-ecbb0dd21db6")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TemplateParameterSubstitutionData) data).mOwner = value;
        }

        @objid ("399b5eb2-cab3-461d-b276-8dcd44bf1b42")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateBindingSmClass)this.getTarget()).getParameterSubstitutionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0dc07ea3-6d40-4fbc-9837-c84e744e0894")
    public static class ActualSmDependency extends SmSingleDependency {
        @objid ("8d870147-55c6-47dd-88ad-e2587b7169b1")
        private SmDependency symetricDep;

        @objid ("a35c2c62-c68d-4e22-9d83-5179ab29d08a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TemplateParameterSubstitutionData) data).mActual;
        }

        @objid ("1bd6b9cf-f3dc-4c1a-9348-d80dc939c192")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TemplateParameterSubstitutionData) data).mActual = value;
        }

        @objid ("eb711bd0-8643-47e1-995a-9be357f9b638")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getTemplateSubstitutionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9fae6b93-ef78-487d-89ee-55c0e7f545c2")
    public static class FormalParameterSmDependency extends SmSingleDependency {
        @objid ("646616c8-9eb1-40db-a832-b9def1deb115")
        private SmDependency symetricDep;

        @objid ("b6fae48d-d471-44dd-a952-248393ce838a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TemplateParameterSubstitutionData) data).mFormalParameter;
        }

        @objid ("6d7d24c9-c3da-4b32-a9c4-02cad9bcf812")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TemplateParameterSubstitutionData) data).mFormalParameter = value;
        }

        @objid ("24245a67-edf1-43c2-9f23-eface60ec80e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateParameterSmClass)this.getTarget()).getParameterSubstitutionDep();
            }
            return this.symetricDep;
        }

    }

}
