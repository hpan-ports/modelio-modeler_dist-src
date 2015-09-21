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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ExternDocumentTypeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
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

@objid ("7fd8f258-bd39-4bba-b9f1-59475256ec89")
public class ExternDocumentSmClass extends ModelElementSmClass {
    @objid ("6d6ed5a6-2fcc-4e75-bea6-1453464747b2")
    private SmAttribute mimeTypeAtt;

    @objid ("cd2a5ddd-8b88-4169-a42e-ac5e8032de7c")
    private SmAttribute pathAtt;

    @objid ("774f0960-ecf4-4e04-8178-fd6864ec98a0")
    private SmAttribute abstractAtt;

    @objid ("3ba4c9c9-4c9f-4bbf-9eab-cf812228d1b6")
    private SmDependency typeDep;

    @objid ("a4134fe7-f54b-4c11-8880-face2d69fff8")
    private SmDependency subjectDep;

    @objid ("8f3e2eaa-f372-4ff7-bba2-814e4cab1c6a")
    public ExternDocumentSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("ca74c235-c7b7-4093-8247-226050f9d668")
    @Override
    public String getName() {
        return "ExternDocument";
    }

    @objid ("f1e9c409-1b1d-4ac7-b3da-1d4d55c57a8a")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("08c0d302-98b2-4dcf-ad68-35496d8ec86b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ExternDocument.class;
    }

    @objid ("d160f258-843a-4e30-829a-c3dd5f20358f")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("4b914208-939e-4d75-9e62-5d4faa9bbede")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("a0467397-c07b-4a1d-92ea-6d21cec1aa25")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ExternDocumentObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.mimeTypeAtt = new MimeTypeSmAttribute();
        this.mimeTypeAtt.init("MimeType", this, String.class );
        registerAttribute(this.mimeTypeAtt);
        
        this.pathAtt = new PathSmAttribute();
        this.pathAtt.init("Path", this, String.class );
        registerAttribute(this.pathAtt);
        
        this.abstractAtt = new AbstractSmAttribute();
        this.abstractAtt.init("Abstract", this, String.class );
        registerAttribute(this.abstractAtt);
        
        
        // Initialize and register the SmDependency
        this.typeDep = new TypeSmDependency();
        this.typeDep.init("Type", this, metamodel.getMClass("ExternDocumentType"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.typeDep);
        
        this.subjectDep = new SubjectSmDependency();
        this.subjectDep.init("Subject", this, metamodel.getMClass("ModelElement"), 0, 1 );
        registerDependency(this.subjectDep);
    }

    @objid ("45fa090b-5c44-4dc3-93d1-4d5e386b0bbc")
    public SmAttribute getMimeTypeAtt() {
        if (this.mimeTypeAtt == null) {
        	this.mimeTypeAtt = this.getAttributeDef("MimeType");
        }
        return this.mimeTypeAtt;
    }

    @objid ("58a53a3c-cb39-4e0b-9d44-fb5d278a5e93")
    public SmAttribute getPathAtt() {
        if (this.pathAtt == null) {
        	this.pathAtt = this.getAttributeDef("Path");
        }
        return this.pathAtt;
    }

    @objid ("36833dd3-b945-4c0a-89e9-563f827d0960")
    public SmAttribute getAbstractAtt() {
        if (this.abstractAtt == null) {
        	this.abstractAtt = this.getAttributeDef("Abstract");
        }
        return this.abstractAtt;
    }

    @objid ("ac1deb91-878a-4d97-8f12-6a14f5636e3a")
    public SmDependency getTypeDep() {
        if (this.typeDep == null) {
        	this.typeDep = this.getDependencyDef("Type");
        }
        return this.typeDep;
    }

    @objid ("15a64a37-edc9-4f7e-8fc5-300ff0d7113d")
    public SmDependency getSubjectDep() {
        if (this.subjectDep == null) {
        	this.subjectDep = this.getDependencyDef("Subject");
        }
        return this.subjectDep;
    }

    @objid ("fd073cc8-2dba-4094-a96b-5fb59eee5030")
    private static class ExternDocumentObjectFactory implements ISmObjectFactory {
        @objid ("61f65475-5ed5-431e-960d-8f3375479c4e")
        private ExternDocumentSmClass smClass;

        @objid ("f0e960e9-ccca-47b1-9231-4633d56e6af4")
        public ExternDocumentObjectFactory(ExternDocumentSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("a58b83e3-aa44-48f4-8075-706844de92ac")
        @Override
        public ISmObjectData createData() {
            return new ExternDocumentData(this.smClass);
        }

        @objid ("fefb888f-c5fa-4d6c-aa94-23f46a97c726")
        @Override
        public SmObjectImpl createImpl() {
            return new ExternDocumentImpl();
        }

    }

    @objid ("a57c5d12-6c87-4f2b-a68f-75cc818a7e76")
    public static class MimeTypeSmAttribute extends SmAttribute {
        @objid ("907498f7-cbd9-4273-acd5-ec39627ca548")
        public Object getValue(ISmObjectData data) {
            return ((ExternDocumentData) data).mMimeType;
        }

        @objid ("9d2941b7-430d-4c1c-bf41-ed6836748b02")
        public void setValue(ISmObjectData data, Object value) {
            ((ExternDocumentData) data).mMimeType = value;
        }

    }

    @objid ("88022a25-a36e-48e6-a76b-b67947beabd3")
    public static class PathSmAttribute extends SmAttribute {
        @objid ("0a37714d-d4f4-404b-815f-156c3dc3004d")
        public Object getValue(ISmObjectData data) {
            return ((ExternDocumentData) data).mPath;
        }

        @objid ("9c1cefa9-d49e-4af7-86cf-227d32f8a24e")
        public void setValue(ISmObjectData data, Object value) {
            ((ExternDocumentData) data).mPath = value;
        }

    }

    @objid ("5727f39f-9132-498c-9d27-827b36282328")
    public static class AbstractSmAttribute extends SmAttribute {
        @objid ("1de9e26a-2119-403b-b01c-de4c03b14a59")
        public Object getValue(ISmObjectData data) {
            return ((ExternDocumentData) data).mAbstract;
        }

        @objid ("5ac2e552-ba35-4e8b-a635-e99adf0c307a")
        public void setValue(ISmObjectData data, Object value) {
            ((ExternDocumentData) data).mAbstract = value;
        }

    }

    @objid ("9eeda7ed-dfda-43e6-8f07-ebc5ffb18925")
    public static class TypeSmDependency extends SmSingleDependency {
        @objid ("24cd25c3-34d8-4bdf-b685-4ff2d004315e")
        private SmDependency symetricDep;

        @objid ("ff61e40e-be9e-49f8-931f-897960442e13")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExternDocumentData) data).mType;
        }

        @objid ("5c0e57d2-3c5b-49cd-98f4-9ca6b2e0cb46")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExternDocumentData) data).mType = value;
        }

        @objid ("e8819f2a-65b4-4fb7-8e19-8d794a8bf3e1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExternDocumentTypeSmClass)this.getTarget()).getTypedDocDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1d9f7650-e47f-4567-a727-27e80d78e430")
    public static class SubjectSmDependency extends SmSingleDependency {
        @objid ("3a61929c-4b9b-40d0-b2bd-b4d35c217a52")
        private SmDependency symetricDep;

        @objid ("53e9f67a-7042-4c4d-a732-5394bd6742bf")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExternDocumentData) data).mSubject;
        }

        @objid ("7e794c59-2213-4b94-9b6b-da91de2b6069")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExternDocumentData) data).mSubject = value;
        }

        @objid ("03fc68f4-54ca-4427-85de-93eb05e505a2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getDocumentDep();
            }
            return this.symetricDep;
        }

    }

}
