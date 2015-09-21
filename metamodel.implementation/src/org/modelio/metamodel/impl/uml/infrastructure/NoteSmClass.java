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
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.NoteTypeSmClass;
import org.modelio.metamodel.uml.infrastructure.Note;
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

@objid ("760b5a4c-82aa-493b-ab51-00c95b2afa6e")
public class NoteSmClass extends ModelElementSmClass {
    @objid ("916b342e-d677-46f5-9153-61061976882b")
    private SmAttribute contentAtt;

    @objid ("42f4b840-ed8c-4938-9a37-a2d26700cd7d")
    private SmAttribute mimeTypeAtt;

    @objid ("50a816b6-97b0-4b50-a40d-15ac3d9dbfe2")
    private SmDependency modelDep;

    @objid ("e1a26a6d-1805-43e3-bf13-a56ae1a0a98e")
    private SmDependency subjectDep;

    @objid ("590e9f72-c318-4ee2-a882-42d4a43a2d04")
    public NoteSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("52324d99-ba86-4a85-ae13-ae78c98705a3")
    @Override
    public String getName() {
        return "Note";
    }

    @objid ("dfb1918a-6234-4d84-824a-cf8d2645275c")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("79658e20-332a-4e2b-a8dc-ebb8f9722ffd")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Note.class;
    }

    @objid ("3494d1f8-dae4-4bfd-8645-96009255b3a0")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("65f9eb77-47ea-4b53-a22a-0d3f709b0ee5")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("40ef5741-b5f4-4482-84d6-bdb73f2e4a5f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new NoteObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.contentAtt = new ContentSmAttribute();
        this.contentAtt.init("Content", this, String.class );
        registerAttribute(this.contentAtt);
        
        this.mimeTypeAtt = new MimeTypeSmAttribute();
        this.mimeTypeAtt.init("MimeType", this, String.class );
        registerAttribute(this.mimeTypeAtt);
        
        
        // Initialize and register the SmDependency
        this.modelDep = new ModelSmDependency();
        this.modelDep.init("Model", this, metamodel.getMClass("NoteType"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.modelDep);
        
        this.subjectDep = new SubjectSmDependency();
        this.subjectDep.init("Subject", this, metamodel.getMClass("ModelElement"), 0, 1 );
        registerDependency(this.subjectDep);
    }

    @objid ("261bad2b-afa2-46f4-ba63-adcfe8e89ec2")
    public SmAttribute getContentAtt() {
        if (this.contentAtt == null) {
        	this.contentAtt = this.getAttributeDef("Content");
        }
        return this.contentAtt;
    }

    @objid ("4aeffd47-b261-495f-863e-52a7b62c57ac")
    public SmAttribute getMimeTypeAtt() {
        if (this.mimeTypeAtt == null) {
        	this.mimeTypeAtt = this.getAttributeDef("MimeType");
        }
        return this.mimeTypeAtt;
    }

    @objid ("36f41528-baef-4b00-851c-8f5571138ce9")
    public SmDependency getModelDep() {
        if (this.modelDep == null) {
        	this.modelDep = this.getDependencyDef("Model");
        }
        return this.modelDep;
    }

    @objid ("80ae549e-a61d-4222-815a-87d52ed7c8f2")
    public SmDependency getSubjectDep() {
        if (this.subjectDep == null) {
        	this.subjectDep = this.getDependencyDef("Subject");
        }
        return this.subjectDep;
    }

    @objid ("6fed53b2-b88d-4261-9c2a-cf2dc0fddb13")
    private static class NoteObjectFactory implements ISmObjectFactory {
        @objid ("a19b0509-c523-49e9-9486-1e6ef29daba0")
        private NoteSmClass smClass;

        @objid ("1319fc57-99da-4a10-9b30-711a31c98113")
        public NoteObjectFactory(NoteSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("d4927bf7-bdd1-46eb-b7a3-e40cb91bd2b7")
        @Override
        public ISmObjectData createData() {
            return new NoteData(this.smClass);
        }

        @objid ("e1629da0-670f-4268-bf79-16da184c95b5")
        @Override
        public SmObjectImpl createImpl() {
            return new NoteImpl();
        }

    }

    @objid ("70f47fdc-f0e5-4ae4-ba68-bbd960ff14a1")
    public static class ContentSmAttribute extends SmAttribute {
        @objid ("f8d891cb-80e4-46e4-8d8b-e37d063494e6")
        public Object getValue(ISmObjectData data) {
            return ((NoteData) data).mContent;
        }

        @objid ("5e4094cb-dd9a-43e5-a480-cee38d16a514")
        public void setValue(ISmObjectData data, Object value) {
            ((NoteData) data).mContent = value;
        }

    }

    @objid ("4ec72178-8df1-4e05-9ca1-48b34991ff05")
    public static class MimeTypeSmAttribute extends SmAttribute {
        @objid ("828efe09-db76-447f-afe6-0cc0c8229e9c")
        public Object getValue(ISmObjectData data) {
            return ((NoteData) data).mMimeType;
        }

        @objid ("b421b89b-77cf-4280-af17-485b31bb55a0")
        public void setValue(ISmObjectData data, Object value) {
            ((NoteData) data).mMimeType = value;
        }

    }

    @objid ("84217a93-1303-4763-8b1c-be35e21bdbe5")
    public static class ModelSmDependency extends SmSingleDependency {
        @objid ("8b7155f0-acb9-4577-bcdf-487ab16af5c2")
        private SmDependency symetricDep;

        @objid ("92a09800-533c-492d-9619-5f27ab77db2f")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NoteData) data).mModel;
        }

        @objid ("3318b908-09f7-4344-b166-dbde7b49de2d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NoteData) data).mModel = value;
        }

        @objid ("1a5bac41-efad-4ab8-8c19-926de3670522")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NoteTypeSmClass)this.getTarget()).getElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("68bade7c-bfdf-45c9-98fb-d8cbe4d5dd67")
    public static class SubjectSmDependency extends SmSingleDependency {
        @objid ("b1b81c1f-7bc7-4560-be6a-510207efcc3e")
        private SmDependency symetricDep;

        @objid ("2873bb50-d290-47c1-9e43-5f78c8cf4ca5")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NoteData) data).mSubject;
        }

        @objid ("7a41eb49-dca1-49a0-80e4-5e742d2ceb8c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NoteData) data).mSubject = value;
        }

        @objid ("568cce4e-9458-40bf-948f-d820702d383f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getDescriptorDep();
            }
            return this.symetricDep;
        }

    }

}
