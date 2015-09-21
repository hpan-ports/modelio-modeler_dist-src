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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.BindingSmClass;
import org.modelio.metamodel.impl.uml.statik.CollaborationSmClass;
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.uml.statik.CollaborationUse;
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

@objid ("4b183c29-53e2-461f-8c9e-7d497ca87002")
public class CollaborationUseSmClass extends ModelElementSmClass {
    @objid ("5aa61469-e0d8-4971-9fb2-5e1b8672738b")
    private SmDependency typeDep;

    @objid ("e496b6a1-7aa9-45c1-8e45-d3a5fffc046e")
    private SmDependency nRepresentedDep;

    @objid ("ca7f079f-d7b3-4e49-8728-c4234d67cd42")
    private SmDependency oRepresentedDep;

    @objid ("ff2d2fd6-496f-4ce6-9189-c84e82512637")
    private SmDependency roleBindingDep;

    @objid ("3ad036b2-e738-47ca-98c4-fdcc2b353b1c")
    public CollaborationUseSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("811a056e-0ef2-4472-bb60-a13e66d9c179")
    @Override
    public String getName() {
        return "CollaborationUse";
    }

    @objid ("d2ba886a-5ed0-47cf-8178-48b5f1fd78fa")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("a14ddce6-f559-48fe-b2b7-0fb97862ad48")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return CollaborationUse.class;
    }

    @objid ("54ad4d98-5242-4eb1-88e0-475b67693f24")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("1d10a23a-8522-44f7-bd01-d485d06a9bdf")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("26366a1f-bcfa-48e5-8d50-8a19b2c3c046")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new CollaborationUseObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.typeDep = new TypeSmDependency();
        this.typeDep.init("Type", this, metamodel.getMClass("Collaboration"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.typeDep);
        
        this.nRepresentedDep = new NRepresentedSmDependency();
        this.nRepresentedDep.init("NRepresented", this, metamodel.getMClass("NameSpace"), 0, 1 );
        registerDependency(this.nRepresentedDep);
        
        this.oRepresentedDep = new ORepresentedSmDependency();
        this.oRepresentedDep.init("ORepresented", this, metamodel.getMClass("Operation"), 0, 1 );
        registerDependency(this.oRepresentedDep);
        
        this.roleBindingDep = new RoleBindingSmDependency();
        this.roleBindingDep.init("RoleBinding", this, metamodel.getMClass("Binding"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.roleBindingDep);
    }

    @objid ("0903b43a-cd07-4285-a920-11a8e5e0c8c4")
    public SmDependency getTypeDep() {
        if (this.typeDep == null) {
        	this.typeDep = this.getDependencyDef("Type");
        }
        return this.typeDep;
    }

    @objid ("07dc19e3-700d-499a-8aaa-a2771b196c21")
    public SmDependency getNRepresentedDep() {
        if (this.nRepresentedDep == null) {
        	this.nRepresentedDep = this.getDependencyDef("NRepresented");
        }
        return this.nRepresentedDep;
    }

    @objid ("30eacf3e-b23e-40e0-b07c-53af94fc86e4")
    public SmDependency getORepresentedDep() {
        if (this.oRepresentedDep == null) {
        	this.oRepresentedDep = this.getDependencyDef("ORepresented");
        }
        return this.oRepresentedDep;
    }

    @objid ("e7125755-6f0b-4258-9701-787fd08eaff3")
    public SmDependency getRoleBindingDep() {
        if (this.roleBindingDep == null) {
        	this.roleBindingDep = this.getDependencyDef("RoleBinding");
        }
        return this.roleBindingDep;
    }

    @objid ("70bf644c-34a9-40dc-89a4-70b9877e91d8")
    private static class CollaborationUseObjectFactory implements ISmObjectFactory {
        @objid ("6a99684b-7835-4539-9cb4-0be6432cda3b")
        private CollaborationUseSmClass smClass;

        @objid ("a5b021a8-5797-41bf-bf1a-f748d8509529")
        public CollaborationUseObjectFactory(CollaborationUseSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("fbe2013f-b3d6-488e-b70b-118055a57ed9")
        @Override
        public ISmObjectData createData() {
            return new CollaborationUseData(this.smClass);
        }

        @objid ("eea8a219-d3e6-4906-9e50-78e7df601494")
        @Override
        public SmObjectImpl createImpl() {
            return new CollaborationUseImpl();
        }

    }

    @objid ("75ac0e54-5863-4d94-866e-c00f6387f6d2")
    public static class TypeSmDependency extends SmSingleDependency {
        @objid ("b31c3725-3b49-4cd5-9d11-d86944346106")
        private SmDependency symetricDep;

        @objid ("09886a7c-2675-4e21-82ed-fff845a9efa3")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CollaborationUseData) data).mType;
        }

        @objid ("9929fd0d-bfb3-444d-a9e5-989a3c809d02")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CollaborationUseData) data).mType = value;
        }

        @objid ("6673972c-e69f-4e02-97a7-3e5272ff983c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CollaborationSmClass)this.getTarget()).getOccurrenceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("167cc772-0142-434e-9268-3c41ad536fe2")
    public static class NRepresentedSmDependency extends SmSingleDependency {
        @objid ("2a6f36a2-43b1-48a7-8fea-20aaf1191304")
        private SmDependency symetricDep;

        @objid ("92dffdd8-0403-41c1-ae5f-9d9b8350f4fe")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CollaborationUseData) data).mNRepresented;
        }

        @objid ("1662c050-707f-4a0f-8d4b-57ef85d30ac5")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CollaborationUseData) data).mNRepresented = value;
        }

        @objid ("c22fea5f-0505-4672-8cff-259a58d292c5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getOwnedCollaborationUseDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("984d6574-8f1d-440e-b89a-128642860dad")
    public static class ORepresentedSmDependency extends SmSingleDependency {
        @objid ("9ebfa793-89cd-4fdf-a684-c5244f09f80f")
        private SmDependency symetricDep;

        @objid ("660fd740-4ce0-4980-8c24-47bdc49fe549")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CollaborationUseData) data).mORepresented;
        }

        @objid ("c8e3e498-fa76-4f18-9ae4-386aeaa64ef9")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CollaborationUseData) data).mORepresented = value;
        }

        @objid ("d253eca6-542b-43d9-ae35-162d0b8e5c54")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getOwnedCollaborationUseDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6505adbe-eaf1-4790-9250-ce7c9a90e2c3")
    public static class RoleBindingSmDependency extends SmMultipleDependency {
        @objid ("2a6c6f36-c09e-43a7-b25f-6ed2866e3538")
        private SmDependency symetricDep;

        @objid ("cf34502b-a161-4176-9a03-54c6780a71a0")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((CollaborationUseData)data).mRoleBinding != null)? ((CollaborationUseData)data).mRoleBinding:SmMultipleDependency.EMPTY;
        }

        @objid ("98a77e26-5a6b-408e-b338-b13e9439e41e")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((CollaborationUseData) data).mRoleBinding = values;
        }

        @objid ("a5d6af0a-abfe-47f1-b9a8-f243d605ff15")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BindingSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

}
