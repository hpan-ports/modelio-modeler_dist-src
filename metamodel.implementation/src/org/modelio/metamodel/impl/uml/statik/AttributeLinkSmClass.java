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
import org.modelio.metamodel.impl.uml.statik.AttributeSmClass;
import org.modelio.metamodel.impl.uml.statik.InstanceSmClass;
import org.modelio.metamodel.uml.statik.AttributeLink;
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

@objid ("97a1dde2-c320-448c-8141-4c39d53500a2")
public class AttributeLinkSmClass extends ModelElementSmClass {
    @objid ("8276129d-0984-48c7-acb1-9f9db23bb614")
    private SmAttribute valueAtt;

    @objid ("fcbca647-7931-4d25-bbcb-52460c130738")
    private SmDependency attributedDep;

    @objid ("b10438d0-c798-4f16-8c65-621d148c3f39")
    private SmDependency baseDep;

    @objid ("30fd0fe8-9773-4bed-88aa-2c3193abd120")
    public AttributeLinkSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("260f3fc2-fc32-431d-b301-ebc6d558d20f")
    @Override
    public String getName() {
        return "AttributeLink";
    }

    @objid ("c7c0dc26-7532-438e-b6d6-47e5da55aa95")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("edb4e762-24f7-4c4e-964d-e41614336c3c")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return AttributeLink.class;
    }

    @objid ("cc70c913-dfbe-4525-aaa2-32d3ae915d8c")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("78ab0eea-e2f7-48e4-a224-a338ad0d3042")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("00b05dae-9a56-40c7-a70c-6a840f87530d")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new AttributeLinkObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.valueAtt = new ValueSmAttribute();
        this.valueAtt.init("Value", this, String.class );
        registerAttribute(this.valueAtt);
        
        
        // Initialize and register the SmDependency
        this.attributedDep = new AttributedSmDependency();
        this.attributedDep.init("Attributed", this, metamodel.getMClass("Instance"), 1, 1 );
        registerDependency(this.attributedDep);
        
        this.baseDep = new BaseSmDependency();
        this.baseDep.init("Base", this, metamodel.getMClass("Attribute"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.baseDep);
    }

    @objid ("f40ec646-50de-471f-a203-5e4544192fb3")
    public SmAttribute getValueAtt() {
        if (this.valueAtt == null) {
        	this.valueAtt = this.getAttributeDef("Value");
        }
        return this.valueAtt;
    }

    @objid ("de9696d5-1dc0-442e-b168-54b64c6543b1")
    public SmDependency getAttributedDep() {
        if (this.attributedDep == null) {
        	this.attributedDep = this.getDependencyDef("Attributed");
        }
        return this.attributedDep;
    }

    @objid ("fc288d4f-519c-45cc-a69a-c22b51be10e8")
    public SmDependency getBaseDep() {
        if (this.baseDep == null) {
        	this.baseDep = this.getDependencyDef("Base");
        }
        return this.baseDep;
    }

    @objid ("f8770240-86ec-496e-ac2c-a46094b09e3d")
    private static class AttributeLinkObjectFactory implements ISmObjectFactory {
        @objid ("12975c3f-7125-456e-b6a8-35585b5d3932")
        private AttributeLinkSmClass smClass;

        @objid ("4f3dc6dc-250a-463a-96b4-0096e9d9d171")
        public AttributeLinkObjectFactory(AttributeLinkSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("0df36928-283e-4a93-957d-c164de159669")
        @Override
        public ISmObjectData createData() {
            return new AttributeLinkData(this.smClass);
        }

        @objid ("2b90d66e-13c1-44ce-8a91-2e7a5cf0c33c")
        @Override
        public SmObjectImpl createImpl() {
            return new AttributeLinkImpl();
        }

    }

    @objid ("b739409f-c08b-49b1-b3c0-e34b827eeceb")
    public static class ValueSmAttribute extends SmAttribute {
        @objid ("6c6151a2-4f8d-4001-ad63-b5a4cb8d3f83")
        public Object getValue(ISmObjectData data) {
            return ((AttributeLinkData) data).mValue;
        }

        @objid ("e2e9ddff-7cb0-47fe-9ab9-6b575f9e184e")
        public void setValue(ISmObjectData data, Object value) {
            ((AttributeLinkData) data).mValue = value;
        }

    }

    @objid ("e6441409-8387-43a6-a700-8d8caea162bf")
    public static class AttributedSmDependency extends SmSingleDependency {
        @objid ("f5313925-3a84-4490-a74c-8e578c61f4f8")
        private SmDependency symetricDep;

        @objid ("aaaf5bff-f022-4fbc-af87-afaf592ad0b6")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AttributeLinkData) data).mAttributed;
        }

        @objid ("35459e17-02ff-462f-8d4a-b7b2266fb98c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AttributeLinkData) data).mAttributed = value;
        }

        @objid ("7c715c74-569e-4a8c-a5c8-a4813c28db68")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InstanceSmClass)this.getTarget()).getSlotDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e37a1302-9c38-4892-ab04-7688deab640e")
    public static class BaseSmDependency extends SmSingleDependency {
        @objid ("142b727f-ab75-4f5f-9f5e-6832822f90cb")
        private SmDependency symetricDep;

        @objid ("3e0f778c-774c-4c56-b3b7-d05200adf40a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AttributeLinkData) data).mBase;
        }

        @objid ("3897ccf9-3783-4c2a-852e-a333f5d25ba5")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AttributeLinkData) data).mBase = value;
        }

        @objid ("fcbdc862-089e-43b7-8952-d91ee2f0b013")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AttributeSmClass)this.getTarget()).getOccurenceDep();
            }
            return this.symetricDep;
        }

    }

}
