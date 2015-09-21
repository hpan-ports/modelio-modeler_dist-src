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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelTreeSmClass;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("7b1d2689-2014-4c55-a1b7-be6b622341f9")
public class ModelTreeSmClass extends ModelElementSmClass {
    @objid ("250e20a9-5236-4a2e-aa35-f08e3768522e")
    private SmDependency ownerDep;

    @objid ("e848ceca-a471-4e00-a265-bb8263a3c8c6")
    private SmDependency ownedElementDep;

    @objid ("5c2e88aa-99c1-4080-82d3-a4a1674d5b0e")
    public ModelTreeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("0f01cb1e-5304-4469-9293-232145ddb6a7")
    @Override
    public String getName() {
        return "ModelTree";
    }

    @objid ("1add194d-8d2f-4b3b-b635-2f70fb4b44d6")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("0d7850ff-35c0-48d1-9a98-258392070876")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ModelTree.class;
    }

    @objid ("23c005dc-8f23-4046-8306-0748e3557019")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("d7198ce7-ee08-4f68-b86e-67d69e875b74")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("b72e1963-8812-40c8-a22d-4c626889ee1f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ModelTreeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("ModelTree"), 0, 1 );
        registerDependency(this.ownerDep);
        
        this.ownedElementDep = new OwnedElementSmDependency();
        this.ownedElementDep.init("OwnedElement", this, metamodel.getMClass("ModelTree"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedElementDep);
    }

    @objid ("9285493b-a35e-4424-824c-71976ef4884d")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("ec7e1538-b80f-4f65-b9a3-3f809d78637e")
    public SmDependency getOwnedElementDep() {
        if (this.ownedElementDep == null) {
        	this.ownedElementDep = this.getDependencyDef("OwnedElement");
        }
        return this.ownedElementDep;
    }

    @objid ("aa867b05-9333-46ef-9fbe-17e2004a431a")
    private static class ModelTreeObjectFactory implements ISmObjectFactory {
        @objid ("9f81849a-a91f-44b8-b56d-0b6cd0355800")
        private ModelTreeSmClass smClass;

        @objid ("846e0a6e-2934-4a66-85a7-ad083e795420")
        public ModelTreeObjectFactory(ModelTreeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("33c1acc1-fbde-43a7-8980-0a52e3c062bc")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("4bf1c90d-093a-409a-8f4f-17b526d26a5c")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("7f360f0a-c772-4245-a905-69af3b194c54")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("dd594672-75c7-443d-916f-6021ff8f07dc")
        private SmDependency symetricDep;

        @objid ("7d6ff87e-beab-4eb7-80c0-e6864e387a98")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ModelTreeData) data).mOwner;
        }

        @objid ("a903ba98-ff97-4557-bf96-5a8e26830015")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ModelTreeData) data).mOwner = value;
        }

        @objid ("8d746bd7-9809-404f-934a-6cba90034a59")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelTreeSmClass)this.getTarget()).getOwnedElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b6cf42cc-697a-4ee9-99bb-001cdf5d9cc9")
    public static class OwnedElementSmDependency extends SmMultipleDependency {
        @objid ("bd192766-57ac-44d8-ae0f-d255eeb5699c")
        private SmDependency symetricDep;

        @objid ("9cbb0a56-07d3-4fcf-a313-859265e8431c")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelTreeData)data).mOwnedElement != null)? ((ModelTreeData)data).mOwnedElement:SmMultipleDependency.EMPTY;
        }

        @objid ("ccc71218-68c1-4694-95f9-61438a7710be")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelTreeData) data).mOwnedElement = values;
        }

        @objid ("0b807957-9580-402e-9144-47f3209a9c1b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelTreeSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

}
