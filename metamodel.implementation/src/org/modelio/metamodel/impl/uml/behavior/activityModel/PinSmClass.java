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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectNodeSmClass;
import org.modelio.metamodel.impl.uml.statik.ParameterSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
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

@objid ("1ced2aab-2b41-4c35-8f1e-6ea38c33170d")
public class PinSmClass extends ObjectNodeSmClass {
    @objid ("8d94a52b-3b93-4819-bf0e-d9c028d407da")
    private SmAttribute isControlAtt;

    @objid ("6ba1ddcf-ff57-4a81-91a8-e9b134fa4018")
    private SmAttribute isExpansionAtt;

    @objid ("1c6f1701-a689-4131-8dcc-0862e87e45af")
    private SmDependency matchedDep;

    @objid ("609c9e84-b1c0-4054-9a87-a042ffdf5ce2")
    public PinSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("d15d7896-3017-4ae0-a8da-934c758a0b36")
    @Override
    public String getName() {
        return "Pin";
    }

    @objid ("7305946f-13f2-4ec6-85f1-69e1249a2424")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("8ea077ca-8cde-4186-81fa-2565bb625321")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Pin.class;
    }

    @objid ("82a68d96-da24-4a9e-8e6f-b5499bf021cf")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("9a042e21-f81b-4f4f-acd9-bafcfb5680d5")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("c5fc3c4a-9228-45cb-9db0-eca2476fa855")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ObjectNode");
        this.registerFactory(new PinObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isControlAtt = new IsControlSmAttribute();
        this.isControlAtt.init("IsControl", this, Boolean.class );
        registerAttribute(this.isControlAtt);
        
        this.isExpansionAtt = new IsExpansionSmAttribute();
        this.isExpansionAtt.init("IsExpansion", this, Boolean.class );
        registerAttribute(this.isExpansionAtt);
        
        
        // Initialize and register the SmDependency
        this.matchedDep = new MatchedSmDependency();
        this.matchedDep.init("Matched", this, metamodel.getMClass("Parameter"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.matchedDep);
    }

    @objid ("e84fa40e-151c-46aa-a843-7b8f2bd52f73")
    public SmAttribute getIsControlAtt() {
        if (this.isControlAtt == null) {
        	this.isControlAtt = this.getAttributeDef("IsControl");
        }
        return this.isControlAtt;
    }

    @objid ("08013fdf-7b39-4548-bbda-cfd7f87331b5")
    public SmAttribute getIsExpansionAtt() {
        if (this.isExpansionAtt == null) {
        	this.isExpansionAtt = this.getAttributeDef("IsExpansion");
        }
        return this.isExpansionAtt;
    }

    @objid ("05102816-cd75-4841-a1ac-6964cf848d5a")
    public SmDependency getMatchedDep() {
        if (this.matchedDep == null) {
        	this.matchedDep = this.getDependencyDef("Matched");
        }
        return this.matchedDep;
    }

    @objid ("77e14506-4e53-4104-a3d5-18397453bb5d")
    private static class PinObjectFactory implements ISmObjectFactory {
        @objid ("9eceaca6-ff25-4f26-9dec-16e9fdd01390")
        private PinSmClass smClass;

        @objid ("bdb4a1a0-4e5b-41dd-8e97-ffd1dfdcf87e")
        public PinObjectFactory(PinSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("73f78183-2545-4c5b-99c8-83075d7ea515")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("c93d27ff-53ec-430c-b238-df1a3aaaf1e0")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("92e7f663-03e1-4b50-acab-a941e68724c7")
    public static class IsControlSmAttribute extends SmAttribute {
        @objid ("213cf472-cf61-41a3-84a3-2b7f8b84d080")
        public Object getValue(ISmObjectData data) {
            return ((PinData) data).mIsControl;
        }

        @objid ("da2ae220-4bd0-4b48-8d5b-6849ce3c4547")
        public void setValue(ISmObjectData data, Object value) {
            ((PinData) data).mIsControl = value;
        }

    }

    @objid ("26da3400-1034-4b0a-bea5-0c5f8f966d0a")
    public static class IsExpansionSmAttribute extends SmAttribute {
        @objid ("88f7129e-c503-4c72-8796-79de8aa7a2a8")
        public Object getValue(ISmObjectData data) {
            return ((PinData) data).mIsExpansion;
        }

        @objid ("c485ba08-f27c-4b7a-8f98-bba6a895508f")
        public void setValue(ISmObjectData data, Object value) {
            ((PinData) data).mIsExpansion = value;
        }

    }

    @objid ("3614b790-988b-4afe-a47c-c0ce39709b3f")
    public static class MatchedSmDependency extends SmSingleDependency {
        @objid ("bec84d4d-ceec-411a-b810-c70508ee48d0")
        private SmDependency symetricDep;

        @objid ("e7a07472-4224-4945-9812-dfef0d2f7978")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PinData) data).mMatched;
        }

        @objid ("58d09717-29be-404e-bd23-f52fba19c181")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PinData) data).mMatched = value;
        }

        @objid ("c694caac-62c4-4dbc-9d3b-ec8620bb739f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ParameterSmClass)this.getTarget()).getMatchingDep();
            }
            return this.symetricDep;
        }

    }

}
