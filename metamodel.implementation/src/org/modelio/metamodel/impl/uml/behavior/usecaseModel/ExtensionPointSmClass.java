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
package org.modelio.metamodel.impl.uml.behavior.usecaseModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.UseCaseDependencySmClass;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.UseCaseSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.statik.VisibilityMode;
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

@objid ("d143432c-5f40-490c-83b4-207d0eaa677e")
public class ExtensionPointSmClass extends ModelElementSmClass {
    @objid ("03f92b6e-2111-48e3-94bb-83597278d6be")
    private SmAttribute visibilityAtt;

    @objid ("4e7b380b-1894-4a0d-8379-fa0db2add194")
    private SmDependency extendedDep;

    @objid ("6be69904-82f6-4f08-a618-5852324b587d")
    private SmDependency ownerDep;

    @objid ("21966c3f-25cf-4d15-aad7-f21c3faaeecb")
    public ExtensionPointSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("43777921-6f68-4a18-bdc4-873fc3b5e886")
    @Override
    public String getName() {
        return "ExtensionPoint";
    }

    @objid ("c55be7af-c17c-411f-8f6f-16dd176f9e99")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("4697981b-b119-45f1-95fd-4ca63f6f9d44")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ExtensionPoint.class;
    }

    @objid ("f64d22db-3e47-461c-b633-1ad2b634e2df")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("a112eae4-dc78-4ed1-8978-160f8bfdcc9e")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("d55f8b00-8e07-4869-8560-ca33658f7589")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ExtensionPointObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.visibilityAtt = new VisibilitySmAttribute();
        this.visibilityAtt.init("Visibility", this, VisibilityMode.class );
        registerAttribute(this.visibilityAtt);
        
        
        // Initialize and register the SmDependency
        this.extendedDep = new ExtendedSmDependency();
        this.extendedDep.init("Extended", this, metamodel.getMClass("UseCaseDependency"), 0, -1 , SmDirective.SMCDDYNAMIC, SmDirective.SMCDTODELETE);
        registerDependency(this.extendedDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("UseCase"), 0, 1 );
        registerDependency(this.ownerDep);
    }

    @objid ("c6975dbe-3998-4a9e-bb91-2898c2fca8db")
    public SmAttribute getVisibilityAtt() {
        if (this.visibilityAtt == null) {
        	this.visibilityAtt = this.getAttributeDef("Visibility");
        }
        return this.visibilityAtt;
    }

    @objid ("2fa1f460-d2f0-4971-8520-04e4a734c53d")
    public SmDependency getExtendedDep() {
        if (this.extendedDep == null) {
        	this.extendedDep = this.getDependencyDef("Extended");
        }
        return this.extendedDep;
    }

    @objid ("22b65f04-789d-4321-96f2-c43227a8ff3d")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("571d2011-b8dc-4a07-a1b6-f5a55e5e2b59")
    private static class ExtensionPointObjectFactory implements ISmObjectFactory {
        @objid ("9da94e5b-a913-435e-bc7a-3503f3b3133b")
        private ExtensionPointSmClass smClass;

        @objid ("f472ed6d-8394-445f-a9e1-9f2c71ede173")
        public ExtensionPointObjectFactory(ExtensionPointSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("2804d845-2cab-45ed-b788-a381b618f4ea")
        @Override
        public ISmObjectData createData() {
            return new ExtensionPointData(this.smClass);
        }

        @objid ("529b4da5-bae8-47c0-bc84-ed1a4716176d")
        @Override
        public SmObjectImpl createImpl() {
            return new ExtensionPointImpl();
        }

    }

    @objid ("c6d881f8-8b65-44b4-94be-9d637210eb46")
    public static class VisibilitySmAttribute extends SmAttribute {
        @objid ("b720be68-d0a7-4149-8846-052629f4d43a")
        public Object getValue(ISmObjectData data) {
            return ((ExtensionPointData) data).mVisibility;
        }

        @objid ("477096a3-9a49-45ff-9cc2-deb70c7734ba")
        public void setValue(ISmObjectData data, Object value) {
            ((ExtensionPointData) data).mVisibility = value;
        }

    }

    @objid ("d45722ba-da4f-4056-9e8b-9ae5949a38da")
    public static class ExtendedSmDependency extends SmMultipleDependency {
        @objid ("c0436715-6afb-4db1-9044-0f8a33782d1c")
        private SmDependency symetricDep;

        @objid ("605ac21f-02f4-4a87-b280-fbee1fbd8b6b")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ExtensionPointData)data).mExtended != null)? ((ExtensionPointData)data).mExtended:SmMultipleDependency.EMPTY;
        }

        @objid ("a84e0095-94ee-46da-b45b-a2181e03dc0d")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ExtensionPointData) data).mExtended = values;
        }

        @objid ("ba452289-7d88-431b-9ee8-78daa2e3276c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((UseCaseDependencySmClass)this.getTarget()).getExtensionLocationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0504ee3f-f381-40e8-984d-d540a3aebd19")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("0fde022b-d2de-4726-b886-258899679edb")
        private SmDependency symetricDep;

        @objid ("6f1d74ae-adcd-48a0-9ba8-b11eee08e569")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExtensionPointData) data).mOwner;
        }

        @objid ("2dca3ce5-44d5-43c0-b62a-89228599dae8")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExtensionPointData) data).mOwner = value;
        }

        @objid ("0f16cbdd-81c2-4ecd-9f60-0bd26fffc7c3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((UseCaseSmClass)this.getTarget()).getOwnedExtensionDep();
            }
            return this.symetricDep;
        }

    }

}
