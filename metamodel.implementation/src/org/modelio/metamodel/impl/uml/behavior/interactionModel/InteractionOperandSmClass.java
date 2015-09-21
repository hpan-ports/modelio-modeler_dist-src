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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.CombinedFragmentSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionFragmentSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
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
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("c9d77df3-ebef-478b-a2d2-108d7bdf7579")
public class InteractionOperandSmClass extends InteractionFragmentSmClass {
    @objid ("cc54459e-f310-4857-9dad-8517ca244c24")
    private SmAttribute guardAtt;

    @objid ("061bfbd4-2c85-49e9-9f06-536e702dd77a")
    private SmAttribute endLineNumberAtt;

    @objid ("20b0b60e-944a-45f1-9f82-5a52a6227df8")
    private SmDependency fragmentDep;

    @objid ("af008383-951a-45bd-abc6-737886b84964")
    private SmDependency ownerFragmentDep;

    @objid ("06428825-c859-4b8d-8f11-54394af2a9e4")
    public InteractionOperandSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("c11484c5-599c-424e-b656-faaf069e5e8d")
    @Override
    public String getName() {
        return "InteractionOperand";
    }

    @objid ("1eb097fe-161c-48ac-b20e-51e2db745c9a")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("4362b6ff-4c4f-4e94-98b4-c7ad5f4d2bd1")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return InteractionOperand.class;
    }

    @objid ("9b98f0e9-a04e-4ca9-8347-73f98ce654ff")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("66f10ae3-3463-4f2f-ae0b-24b4297546f3")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("0784db77-90c2-400c-94d8-716254392d6e")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("InteractionFragment");
        this.registerFactory(new InteractionOperandObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.guardAtt = new GuardSmAttribute();
        this.guardAtt.init("Guard", this, String.class );
        registerAttribute(this.guardAtt);
        
        this.endLineNumberAtt = new EndLineNumberSmAttribute();
        this.endLineNumberAtt.init("EndLineNumber", this, Integer.class );
        registerAttribute(this.endLineNumberAtt);
        
        
        // Initialize and register the SmDependency
        this.fragmentDep = new FragmentSmDependency();
        this.fragmentDep.init("Fragment", this, metamodel.getMClass("InteractionFragment"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.fragmentDep);
        
        this.ownerFragmentDep = new OwnerFragmentSmDependency();
        this.ownerFragmentDep.init("OwnerFragment", this, metamodel.getMClass("CombinedFragment"), 0, 1 );
        registerDependency(this.ownerFragmentDep);
    }

    @objid ("1875cc10-c866-4ca5-bf8d-ca1272df4644")
    public SmAttribute getGuardAtt() {
        if (this.guardAtt == null) {
        	this.guardAtt = this.getAttributeDef("Guard");
        }
        return this.guardAtt;
    }

    @objid ("208744bf-cd5d-4433-8b01-b70489064836")
    public SmAttribute getEndLineNumberAtt() {
        if (this.endLineNumberAtt == null) {
        	this.endLineNumberAtt = this.getAttributeDef("EndLineNumber");
        }
        return this.endLineNumberAtt;
    }

    @objid ("8c53f8e4-ab43-4348-ad95-251afde45d4b")
    public SmDependency getFragmentDep() {
        if (this.fragmentDep == null) {
        	this.fragmentDep = this.getDependencyDef("Fragment");
        }
        return this.fragmentDep;
    }

    @objid ("289ed0e9-dbb2-4e67-8d6d-63ab62075c0f")
    public SmDependency getOwnerFragmentDep() {
        if (this.ownerFragmentDep == null) {
        	this.ownerFragmentDep = this.getDependencyDef("OwnerFragment");
        }
        return this.ownerFragmentDep;
    }

    @objid ("a5c4d63f-adaf-412f-bf05-5b7f510c2c70")
    private static class InteractionOperandObjectFactory implements ISmObjectFactory {
        @objid ("6983daa9-fb5a-4a72-aa41-fd2751669e1c")
        private InteractionOperandSmClass smClass;

        @objid ("35578e79-ccdc-4b9a-8c99-056ebfeccb1c")
        public InteractionOperandObjectFactory(InteractionOperandSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("88454ab1-a94b-4a86-bbda-b0b2942a5163")
        @Override
        public ISmObjectData createData() {
            return new InteractionOperandData(this.smClass);
        }

        @objid ("7aa23963-e341-4e44-a4a8-4560262d02f9")
        @Override
        public SmObjectImpl createImpl() {
            return new InteractionOperandImpl();
        }

    }

    @objid ("ee187fbc-96d0-4f73-998d-9de3c7c0cd0a")
    public static class GuardSmAttribute extends SmAttribute {
        @objid ("5d8fc7a9-0542-43c7-843e-3bbf23480f97")
        public Object getValue(ISmObjectData data) {
            return ((InteractionOperandData) data).mGuard;
        }

        @objid ("6f34aa6b-47e9-4f87-a6a8-eada0fe5dfb2")
        public void setValue(ISmObjectData data, Object value) {
            ((InteractionOperandData) data).mGuard = value;
        }

    }

    @objid ("1707f909-7bcb-4a2c-b2bb-e5118b18e976")
    public static class EndLineNumberSmAttribute extends SmAttribute {
        @objid ("f9989254-2e2e-4d76-b2a4-c79db7d2b164")
        public Object getValue(ISmObjectData data) {
            return ((InteractionOperandData) data).mEndLineNumber;
        }

        @objid ("403616f0-8432-40f4-82a4-8aca7b926c46")
        public void setValue(ISmObjectData data, Object value) {
            ((InteractionOperandData) data).mEndLineNumber = value;
        }

    }

    @objid ("16a2609d-a31b-4172-aa6f-afb8bdda1463")
    public static class FragmentSmDependency extends SmMultipleDependency {
        @objid ("9e0bca00-d6b7-4f30-86a8-b3fda261a896")
        private SmDependency symetricDep;

        @objid ("7e4c7afa-fa97-4a97-856c-74c84bd62851")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InteractionOperandData)data).mFragment != null)? ((InteractionOperandData)data).mFragment:SmMultipleDependency.EMPTY;
        }

        @objid ("0b5f8df6-d831-4dc4-bb28-93040c69c0f6")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InteractionOperandData) data).mFragment = values;
        }

        @objid ("da236dc9-9d5c-474c-9b61-88f3043a5d3f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InteractionFragmentSmClass)this.getTarget()).getEnclosingOperandDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a0432176-648d-4aef-a265-3fb6cced56bd")
    public static class OwnerFragmentSmDependency extends SmSingleDependency {
        @objid ("0d7c2b7a-1993-4694-b3dc-c679c7363fae")
        private SmDependency symetricDep;

        @objid ("d12b7dbc-77ff-4dc0-acc6-ffe0c40e39d2")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((InteractionOperandData) data).mOwnerFragment;
        }

        @objid ("b0959c24-824e-45c3-a5f0-2d6942996d2d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((InteractionOperandData) data).mOwnerFragment = value;
        }

        @objid ("424f5a52-5d18-4c66-bdef-6b0f071923e3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CombinedFragmentSmClass)this.getTarget()).getOperandDep();
            }
            return this.symetricDep;
        }

    }

}
