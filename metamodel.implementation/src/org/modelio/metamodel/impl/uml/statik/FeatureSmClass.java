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
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("13761dd9-9bc8-4c3f-a387-24f38b54c85e")
public class FeatureSmClass extends ModelElementSmClass {
    @objid ("f046d269-ee18-436d-9c5c-1414e7eaaf3a")
    private SmAttribute visibilityAtt;

    @objid ("98eb68e5-043d-461e-ae18-69abdfa1fd6b")
    private SmAttribute isClassAtt;

    @objid ("511a1f82-beaa-4970-a9ea-aaf6822d87a4")
    private SmAttribute isAbstractAtt;

    @objid ("82c56a91-725e-42b3-8c7b-8b2d1268ebf1")
    public FeatureSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("4969b9c8-2ac1-41a5-b74a-4875ae735b26")
    @Override
    public String getName() {
        return "Feature";
    }

    @objid ("0bc76995-f6a2-43e1-92e2-9d6d39350ac2")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("656acc9e-cd64-4929-b0aa-0d1d13e7a8e0")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Feature.class;
    }

    @objid ("f62d233f-11bf-48d1-8e79-ac735b555670")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("d500d98c-42d3-4336-b8d9-843c883086f5")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("11ba3a50-1820-4df2-aa1e-8295e70ceec4")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new FeatureObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.visibilityAtt = new VisibilitySmAttribute();
        this.visibilityAtt.init("Visibility", this, VisibilityMode.class );
        registerAttribute(this.visibilityAtt);
        
        this.isClassAtt = new IsClassSmAttribute();
        this.isClassAtt.init("IsClass", this, Boolean.class );
        registerAttribute(this.isClassAtt);
        
        this.isAbstractAtt = new IsAbstractSmAttribute();
        this.isAbstractAtt.init("IsAbstract", this, Boolean.class );
        registerAttribute(this.isAbstractAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("becec0c3-5822-4d4e-8023-9803602c6808")
    public SmAttribute getVisibilityAtt() {
        if (this.visibilityAtt == null) {
        	this.visibilityAtt = this.getAttributeDef("Visibility");
        }
        return this.visibilityAtt;
    }

    @objid ("2d09e19c-e333-447b-acb4-15d6e5fca2a0")
    public SmAttribute getIsClassAtt() {
        if (this.isClassAtt == null) {
        	this.isClassAtt = this.getAttributeDef("IsClass");
        }
        return this.isClassAtt;
    }

    @objid ("aba22870-768e-4a76-94a6-ad61ad12368d")
    public SmAttribute getIsAbstractAtt() {
        if (this.isAbstractAtt == null) {
        	this.isAbstractAtt = this.getAttributeDef("IsAbstract");
        }
        return this.isAbstractAtt;
    }

    @objid ("8a8c6b6e-9112-4c24-ae99-cfe8e01f5985")
    private static class FeatureObjectFactory implements ISmObjectFactory {
        @objid ("97a44930-485e-4525-b106-d586bbcb8974")
        private FeatureSmClass smClass;

        @objid ("d63d3b0e-1a78-46d4-88bb-a4003b6342b4")
        public FeatureObjectFactory(FeatureSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("a0ba58e2-92fc-4e55-8d00-73af20088390")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("db5cb847-cd28-46bb-8fbd-4326d00b7f58")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("65876cec-4678-4401-92fc-d91031abc8b5")
    public static class VisibilitySmAttribute extends SmAttribute {
        @objid ("53d6903b-4eea-40a7-9273-c2807cb3ce3d")
        public Object getValue(ISmObjectData data) {
            return ((FeatureData) data).mVisibility;
        }

        @objid ("7045cd6f-5d8a-4896-8027-25fdb1c19046")
        public void setValue(ISmObjectData data, Object value) {
            ((FeatureData) data).mVisibility = value;
        }

    }

    @objid ("18d66ca4-95fe-4c9f-ba7e-c7666461569b")
    public static class IsClassSmAttribute extends SmAttribute {
        @objid ("f508eb33-a63d-406e-be2f-59e0edcbd2f3")
        public Object getValue(ISmObjectData data) {
            return ((FeatureData) data).mIsClass;
        }

        @objid ("bdf12d0b-3525-448c-af4d-8348dbb7c140")
        public void setValue(ISmObjectData data, Object value) {
            ((FeatureData) data).mIsClass = value;
        }

    }

    @objid ("65ace72a-8812-4541-8ed1-33bb8258e399")
    public static class IsAbstractSmAttribute extends SmAttribute {
        @objid ("bba46f1a-b018-40b6-969a-3cef8d69aeee")
        public Object getValue(ISmObjectData data) {
            return ((FeatureData) data).mIsAbstract;
        }

        @objid ("b034ab5e-e900-4694-a566-77c0088d3124")
        public void setValue(ISmObjectData data, Object value) {
            ((FeatureData) data).mIsAbstract = value;
        }

    }

}
