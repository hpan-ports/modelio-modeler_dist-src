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
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.uml.statik.Generalization;
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

@objid ("0eb120f2-b0a8-4ed0-846c-641a3466a664")
public class GeneralizationSmClass extends ModelElementSmClass {
    @objid ("ffbb760c-930d-4882-a15c-142f6ef469b3")
    private SmAttribute discriminatorAtt;

    @objid ("d80578b3-eba8-4d0c-a273-45aaf511833e")
    private SmDependency superTypeDep;

    @objid ("ab0d4f5b-1caa-4d19-af9c-4a5b191fade4")
    private SmDependency subTypeDep;

    @objid ("44b7db0b-4ed0-4748-abb9-b68b2fe33d28")
    public GeneralizationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("dd787a47-be66-4dd2-9254-d0e7cc6e8d40")
    @Override
    public String getName() {
        return "Generalization";
    }

    @objid ("19eac255-1539-4630-8274-0704fbfda1b2")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("3ed366fc-d084-4e4b-8da4-db53bba0734e")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Generalization.class;
    }

    @objid ("d0b54ba5-3f89-4271-8fbf-5913b1600e42")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("556059fa-0ab1-4790-b9fe-6277e85468c8")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("b093974c-f5a8-4b14-bfb3-c7f222e48755")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new GeneralizationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.discriminatorAtt = new DiscriminatorSmAttribute();
        this.discriminatorAtt.init("Discriminator", this, String.class );
        registerAttribute(this.discriminatorAtt);
        
        
        // Initialize and register the SmDependency
        this.superTypeDep = new SuperTypeSmDependency();
        this.superTypeDep.init("SuperType", this, metamodel.getMClass("NameSpace"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.superTypeDep);
        
        this.subTypeDep = new SubTypeSmDependency();
        this.subTypeDep.init("SubType", this, metamodel.getMClass("NameSpace"), 1, 1 );
        registerDependency(this.subTypeDep);
    }

    @objid ("914649a7-87e4-4640-8d6f-6d69aa0e845f")
    public SmAttribute getDiscriminatorAtt() {
        if (this.discriminatorAtt == null) {
        	this.discriminatorAtt = this.getAttributeDef("Discriminator");
        }
        return this.discriminatorAtt;
    }

    @objid ("476f4285-440b-45ce-8cd0-32b8180bd32c")
    public SmDependency getSuperTypeDep() {
        if (this.superTypeDep == null) {
        	this.superTypeDep = this.getDependencyDef("SuperType");
        }
        return this.superTypeDep;
    }

    @objid ("8a45a6ea-4d4c-49ad-a49d-eb99b0ebf679")
    public SmDependency getSubTypeDep() {
        if (this.subTypeDep == null) {
        	this.subTypeDep = this.getDependencyDef("SubType");
        }
        return this.subTypeDep;
    }

    @objid ("197495ce-7f00-4bb0-bf05-afe8ceacd312")
    private static class GeneralizationObjectFactory implements ISmObjectFactory {
        @objid ("b3af75c9-0f9d-423b-a008-789cdfbb816e")
        private GeneralizationSmClass smClass;

        @objid ("8b271000-169d-419d-b849-6a81c02463e0")
        public GeneralizationObjectFactory(GeneralizationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("f30e0b4b-91e5-42a7-92fa-aaba1b981a5f")
        @Override
        public ISmObjectData createData() {
            return new GeneralizationData(this.smClass);
        }

        @objid ("fd283a61-1351-4c46-8d93-85ba8f848dc8")
        @Override
        public SmObjectImpl createImpl() {
            return new GeneralizationImpl();
        }

    }

    @objid ("fa60edb4-3e52-4be6-8f5c-2946e03bd9df")
    public static class DiscriminatorSmAttribute extends SmAttribute {
        @objid ("09b23325-f283-4c30-a53f-b78b5f7ab0c9")
        public Object getValue(ISmObjectData data) {
            return ((GeneralizationData) data).mDiscriminator;
        }

        @objid ("f2bfc39a-0f84-423a-822c-4d90257d8287")
        public void setValue(ISmObjectData data, Object value) {
            ((GeneralizationData) data).mDiscriminator = value;
        }

    }

    @objid ("f661f3b6-9b3c-4334-b48f-444898688d29")
    public static class SuperTypeSmDependency extends SmSingleDependency {
        @objid ("2e0b3f29-fc7e-4db0-9f3d-5e8919594401")
        private SmDependency symetricDep;

        @objid ("7d9acf14-8d18-4b44-ac9f-a40679fe73f1")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GeneralizationData) data).mSuperType;
        }

        @objid ("0e84c0b8-86d4-4897-800f-d3215ca4f999")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GeneralizationData) data).mSuperType = value;
        }

        @objid ("3bf704de-a936-40b2-8837-e08ad77f723c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getSpecializationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("03a58ed3-4898-4634-ace2-d443c84823fd")
    public static class SubTypeSmDependency extends SmSingleDependency {
        @objid ("d1ebe19f-c56d-4831-9206-c64305bd174d")
        private SmDependency symetricDep;

        @objid ("6ac80275-00eb-404c-98af-dd5b1c9d8c3c")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GeneralizationData) data).mSubType;
        }

        @objid ("bf89cf3a-6901-4ac4-82ba-79accb75dcbd")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GeneralizationData) data).mSubType = value;
        }

        @objid ("7c4078cc-e1e2-464b-b405-a04c8fd015c4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getParentDep();
            }
            return this.symetricDep;
        }

    }

}
