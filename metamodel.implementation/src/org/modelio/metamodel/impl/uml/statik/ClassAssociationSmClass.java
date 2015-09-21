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
import org.modelio.metamodel.impl.uml.statik.AssociationSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryAssociationSmClass;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("0534b2ae-67e6-4bca-8aef-baaef28233e1")
public class ClassAssociationSmClass extends ModelElementSmClass {
    @objid ("a0e3972f-dee7-445e-b1d8-954925335d3f")
    private SmDependency naryAssociationPartDep;

    @objid ("dbcd9188-102e-4632-b1cb-64beef9a0c05")
    private SmDependency classPartDep;

    @objid ("93e5d88a-da3f-4714-8729-fe4152225441")
    private SmDependency associationPartDep;

    @objid ("46e309b5-4712-49ca-a808-d0eab8195028")
    public ClassAssociationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("c6faf96e-d1c8-4f15-a666-a73180d3c47c")
    @Override
    public String getName() {
        return "ClassAssociation";
    }

    @objid ("32323900-2317-4b82-823e-0d8e21a231aa")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("ebe21ec0-2358-4a40-9f09-422a651fb24f")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ClassAssociation.class;
    }

    @objid ("41f7e907-5da4-46ff-b6ab-3d429f9b40f4")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("3a088b85-1870-41cf-9341-5a99878bacfc")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("2c909e8a-d135-4d2c-85a0-4c588fa1860c")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ClassAssociationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.naryAssociationPartDep = new NaryAssociationPartSmDependency();
        this.naryAssociationPartDep.init("NaryAssociationPart", this, metamodel.getMClass("NaryAssociation"), 0, 1 );
        registerDependency(this.naryAssociationPartDep);
        
        this.classPartDep = new ClassPartSmDependency();
        this.classPartDep.init("ClassPart", this, metamodel.getMClass("Class"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.classPartDep);
        
        this.associationPartDep = new AssociationPartSmDependency();
        this.associationPartDep.init("AssociationPart", this, metamodel.getMClass("Association"), 0, 1 );
        registerDependency(this.associationPartDep);
    }

    @objid ("cd6a7add-fca1-44fb-895f-9547be5484d7")
    public SmDependency getNaryAssociationPartDep() {
        if (this.naryAssociationPartDep == null) {
        	this.naryAssociationPartDep = this.getDependencyDef("NaryAssociationPart");
        }
        return this.naryAssociationPartDep;
    }

    @objid ("0445b900-e14d-44fd-986c-6095f93f0ff4")
    public SmDependency getClassPartDep() {
        if (this.classPartDep == null) {
        	this.classPartDep = this.getDependencyDef("ClassPart");
        }
        return this.classPartDep;
    }

    @objid ("4512f1dd-4fef-4404-81b5-decc67002df9")
    public SmDependency getAssociationPartDep() {
        if (this.associationPartDep == null) {
        	this.associationPartDep = this.getDependencyDef("AssociationPart");
        }
        return this.associationPartDep;
    }

    @objid ("cc11805e-e1ec-461d-8b8b-f25a31793942")
    private static class ClassAssociationObjectFactory implements ISmObjectFactory {
        @objid ("4eb9d75a-1cf4-4572-9121-0d8e83332aaf")
        private ClassAssociationSmClass smClass;

        @objid ("d7b68a9c-d522-4a1f-928f-f32d11f87178")
        public ClassAssociationObjectFactory(ClassAssociationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("33faf4b7-34df-462b-9b84-30b10864a4c6")
        @Override
        public ISmObjectData createData() {
            return new ClassAssociationData(this.smClass);
        }

        @objid ("997c3c8c-e067-4e5f-8fea-097147888b3a")
        @Override
        public SmObjectImpl createImpl() {
            return new ClassAssociationImpl();
        }

    }

    @objid ("282abe66-5e9b-47c3-a97f-206df7c5edc9")
    public static class NaryAssociationPartSmDependency extends SmSingleDependency {
        @objid ("fc69a523-f37a-4620-b900-bf76d64261a9")
        private SmDependency symetricDep;

        @objid ("ea904e69-38c5-40f7-8d74-5319e93c8a46")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ClassAssociationData) data).mNaryAssociationPart;
        }

        @objid ("eceec0c9-c04f-4e94-ac9a-c6b04f53209d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ClassAssociationData) data).mNaryAssociationPart = value;
        }

        @objid ("f983779d-2f70-422b-a48b-3f8eb79900db")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryAssociationSmClass)this.getTarget()).getLinkToClassDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("17d79fa2-d02f-49f6-968b-56765659be35")
    public static class ClassPartSmDependency extends SmSingleDependency {
        @objid ("14f9743e-8f78-45c9-b123-de0f1f05ef8e")
        private SmDependency symetricDep;

        @objid ("a57ff682-3085-41cf-831f-4a3a1fc738b1")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ClassAssociationData) data).mClassPart;
        }

        @objid ("40782db9-8501-4a84-b9f4-802305f34db2")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ClassAssociationData) data).mClassPart = value;
        }

        @objid ("3e951d51-d615-41cc-9a0b-f25fb4a060d3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassSmClass)this.getTarget()).getLinkToAssociationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("88228aeb-b907-4aeb-a8ed-e220e5ffb484")
    public static class AssociationPartSmDependency extends SmSingleDependency {
        @objid ("93984629-eb07-4319-970e-a2fb8b7a6a47")
        private SmDependency symetricDep;

        @objid ("69c24de6-6e59-47f2-a3a0-38abf84c57c1")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ClassAssociationData) data).mAssociationPart;
        }

        @objid ("e71ef4da-5ed4-4e00-8a3e-3c5e9ce12125")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ClassAssociationData) data).mAssociationPart = value;
        }

        @objid ("a810daa4-3f9f-4669-9872-e607e41e4c54")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AssociationSmClass)this.getTarget()).getLinkToClassDep();
            }
            return this.symetricDep;
        }

    }

}
