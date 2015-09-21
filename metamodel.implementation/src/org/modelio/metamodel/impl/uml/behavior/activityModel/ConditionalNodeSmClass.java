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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ClauseSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.StructuredActivityNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
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
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("d1292d23-82a1-4c79-bd74-1817c49e9708")
public class ConditionalNodeSmClass extends StructuredActivityNodeSmClass {
    @objid ("a2c8ee0b-ae45-479d-b499-54a248b490cb")
    private SmAttribute isDeterminateAtt;

    @objid ("d6ba5f94-d9cc-4c01-9aad-0cf5f763dd5e")
    private SmAttribute isAssuredAtt;

    @objid ("f52081ab-61f2-4acd-b8d6-d8505754f6b2")
    private SmDependency ownedClauseDep;

    @objid ("e03fe147-916b-4941-ad0d-3500305268e3")
    public ConditionalNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("04f7f538-0125-4d91-b5cb-81d98daf4089")
    @Override
    public String getName() {
        return "ConditionalNode";
    }

    @objid ("8af685cf-971e-4f30-8195-b6de4487830b")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("7eb978d4-cf09-4d7a-a850-5ad3dd42c233")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ConditionalNode.class;
    }

    @objid ("1fa25f12-be38-4c4b-91b1-daf9edd3b356")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("424b6428-87d1-4fd9-bed0-c89ea95d534c")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("eb190620-3407-424b-848c-a3bee4ab0d92")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StructuredActivityNode");
        this.registerFactory(new ConditionalNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isDeterminateAtt = new IsDeterminateSmAttribute();
        this.isDeterminateAtt.init("IsDeterminate", this, Boolean.class );
        registerAttribute(this.isDeterminateAtt);
        
        this.isAssuredAtt = new IsAssuredSmAttribute();
        this.isAssuredAtt.init("IsAssured", this, Boolean.class );
        registerAttribute(this.isAssuredAtt);
        
        
        // Initialize and register the SmDependency
        this.ownedClauseDep = new OwnedClauseSmDependency();
        this.ownedClauseDep.init("OwnedClause", this, metamodel.getMClass("Clause"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedClauseDep);
    }

    @objid ("9e6701d3-5443-4bc0-a198-bd90ad52b45d")
    public SmAttribute getIsDeterminateAtt() {
        if (this.isDeterminateAtt == null) {
        	this.isDeterminateAtt = this.getAttributeDef("IsDeterminate");
        }
        return this.isDeterminateAtt;
    }

    @objid ("bb593e3e-61e2-4488-b778-96538147e486")
    public SmAttribute getIsAssuredAtt() {
        if (this.isAssuredAtt == null) {
        	this.isAssuredAtt = this.getAttributeDef("IsAssured");
        }
        return this.isAssuredAtt;
    }

    @objid ("57d73cb2-b0bd-4da0-a0bd-8d598e281874")
    public SmDependency getOwnedClauseDep() {
        if (this.ownedClauseDep == null) {
        	this.ownedClauseDep = this.getDependencyDef("OwnedClause");
        }
        return this.ownedClauseDep;
    }

    @objid ("c57a66ee-8e79-4463-95ce-9e4ea61bdd3b")
    private static class ConditionalNodeObjectFactory implements ISmObjectFactory {
        @objid ("89a882fa-4eae-4414-8991-2d351400442b")
        private ConditionalNodeSmClass smClass;

        @objid ("6144427b-7ced-4426-94a0-e993660913d7")
        public ConditionalNodeObjectFactory(ConditionalNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("7af4c9d1-326c-4a89-8b10-e4e1de2240b0")
        @Override
        public ISmObjectData createData() {
            return new ConditionalNodeData(this.smClass);
        }

        @objid ("5b9444bc-33f3-4dbb-80e4-7e83b556fd43")
        @Override
        public SmObjectImpl createImpl() {
            return new ConditionalNodeImpl();
        }

    }

    @objid ("e041aa53-3e31-4f21-b4df-2efddbd169d5")
    public static class IsDeterminateSmAttribute extends SmAttribute {
        @objid ("12e679bb-8240-464a-b8f4-17809efb16e9")
        public Object getValue(ISmObjectData data) {
            return ((ConditionalNodeData) data).mIsDeterminate;
        }

        @objid ("67b6465e-8167-4083-be5e-7f0beace085e")
        public void setValue(ISmObjectData data, Object value) {
            ((ConditionalNodeData) data).mIsDeterminate = value;
        }

    }

    @objid ("1555fd38-4a04-41e7-aa01-81ccd989ded0")
    public static class IsAssuredSmAttribute extends SmAttribute {
        @objid ("f441a94c-62ac-4ceb-a6ff-76c61030ee90")
        public Object getValue(ISmObjectData data) {
            return ((ConditionalNodeData) data).mIsAssured;
        }

        @objid ("d4f06478-f252-4cf1-8e32-2d7db6a629f5")
        public void setValue(ISmObjectData data, Object value) {
            ((ConditionalNodeData) data).mIsAssured = value;
        }

    }

    @objid ("5d6a296a-35f1-4ee3-bbc7-51b8c6d25c19")
    public static class OwnedClauseSmDependency extends SmMultipleDependency {
        @objid ("965213d9-c9ae-4581-8628-8e034a42e7a0")
        private SmDependency symetricDep;

        @objid ("d8a00854-512e-4535-8496-572df57e0e26")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ConditionalNodeData)data).mOwnedClause != null)? ((ConditionalNodeData)data).mOwnedClause:SmMultipleDependency.EMPTY;
        }

        @objid ("a6c56e41-91ce-4676-9753-2fd6794c9b4a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ConditionalNodeData) data).mOwnedClause = values;
        }

        @objid ("e8c2f8d9-07ee-4616-a158-5d15d25799f3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClauseSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

}
