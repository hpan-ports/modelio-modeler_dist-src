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
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.GateSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionFragmentSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionUseSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.LifelineSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("1b1f068e-525b-4f7a-9473-ef168b604540")
public class InteractionSmClass extends BehaviorSmClass {
    @objid ("aa803fc9-cdd7-47e5-b3e3-eafd5d664656")
    private SmDependency formalGateDep;

    @objid ("f6de5e74-f902-4ae1-9cbe-8011d039a9c1")
    private SmDependency fragmentDep;

    @objid ("cc370983-5998-43bc-af5d-9c1a992ab677")
    private SmDependency ownedLineDep;

    @objid ("ca3901ea-7991-48a3-9906-8d874e41a469")
    private SmDependency referedUseDep;

    @objid ("1332fd4c-fc08-4282-9cd4-63f0f4e8007e")
    public InteractionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("64b85164-72be-4d3d-adce-d744febf0c74")
    @Override
    public String getName() {
        return "Interaction";
    }

    @objid ("9d425fe0-2da8-4a4f-8882-20faa7ba5d5a")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("548d8b3c-d070-4ee7-ba05-0e1a8121c43b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Interaction.class;
    }

    @objid ("493772c6-f4a5-4516-8bed-7ca9e96be207")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("f5fc7fa2-30d4-41be-9300-4e7b36687606")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("f42aa02d-5f95-413c-bec1-6bd5945c93c6")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Behavior");
        this.registerFactory(new InteractionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.formalGateDep = new FormalGateSmDependency();
        this.formalGateDep.init("FormalGate", this, metamodel.getMClass("Gate"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.formalGateDep);
        
        this.fragmentDep = new FragmentSmDependency();
        this.fragmentDep.init("Fragment", this, metamodel.getMClass("InteractionFragment"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.fragmentDep);
        
        this.ownedLineDep = new OwnedLineSmDependency();
        this.ownedLineDep.init("OwnedLine", this, metamodel.getMClass("Lifeline"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedLineDep);
        
        this.referedUseDep = new ReferedUseSmDependency();
        this.referedUseDep.init("ReferedUse", this, metamodel.getMClass("InteractionUse"), 0, -1 );
        registerDependency(this.referedUseDep);
    }

    @objid ("ef3e17c8-6c77-47f6-a88a-e102a82fdac6")
    public SmDependency getFormalGateDep() {
        if (this.formalGateDep == null) {
        	this.formalGateDep = this.getDependencyDef("FormalGate");
        }
        return this.formalGateDep;
    }

    @objid ("c51c4646-c069-4fdd-8547-75db32657297")
    public SmDependency getFragmentDep() {
        if (this.fragmentDep == null) {
        	this.fragmentDep = this.getDependencyDef("Fragment");
        }
        return this.fragmentDep;
    }

    @objid ("9a1d72f7-ff83-41b7-89e2-ac1ec663e860")
    public SmDependency getOwnedLineDep() {
        if (this.ownedLineDep == null) {
        	this.ownedLineDep = this.getDependencyDef("OwnedLine");
        }
        return this.ownedLineDep;
    }

    @objid ("20c1d202-d4b3-44f4-823c-64f6e5fe20c3")
    public SmDependency getReferedUseDep() {
        if (this.referedUseDep == null) {
        	this.referedUseDep = this.getDependencyDef("ReferedUse");
        }
        return this.referedUseDep;
    }

    @objid ("89438d4d-d9dd-46ce-bc16-31b25d500d56")
    private static class InteractionObjectFactory implements ISmObjectFactory {
        @objid ("9dc1df46-5373-496d-9ebe-d5fa247fcd7d")
        private InteractionSmClass smClass;

        @objid ("f76c2b8b-f9c9-49f3-8149-57227e6dc89c")
        public InteractionObjectFactory(InteractionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("341c289c-2a5e-427e-b74c-fcd4f78a067a")
        @Override
        public ISmObjectData createData() {
            return new InteractionData(this.smClass);
        }

        @objid ("d5146d81-d297-4904-8d51-81aa0ba91985")
        @Override
        public SmObjectImpl createImpl() {
            return new InteractionImpl();
        }

    }

    @objid ("ef48a03d-30d5-4764-9605-62019824b9b1")
    public static class FormalGateSmDependency extends SmMultipleDependency {
        @objid ("9c8bca18-1837-4a6b-8a6c-4742c1128617")
        private SmDependency symetricDep;

        @objid ("d0227c4b-b83a-42c8-b059-47e60ea67969")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InteractionData)data).mFormalGate != null)? ((InteractionData)data).mFormalGate:SmMultipleDependency.EMPTY;
        }

        @objid ("a80aada9-875b-402b-aaf9-3703bc884703")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InteractionData) data).mFormalGate = values;
        }

        @objid ("35306a9b-da38-47ac-9912-7de534b65ce9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GateSmClass)this.getTarget()).getOwnerInteractionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b913538e-c9cb-4637-8766-7602bbd4880a")
    public static class FragmentSmDependency extends SmMultipleDependency {
        @objid ("286e93f4-7860-4926-bd7d-22802dd0a68d")
        private SmDependency symetricDep;

        @objid ("989ab37f-3f5a-4678-ba80-fd50f711bc76")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InteractionData)data).mFragment != null)? ((InteractionData)data).mFragment:SmMultipleDependency.EMPTY;
        }

        @objid ("9b19371c-b0c6-4bf2-8031-e28f19fd8e8e")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InteractionData) data).mFragment = values;
        }

        @objid ("d56f17a5-5630-4fdc-ba08-aede578bc5ed")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InteractionFragmentSmClass)this.getTarget()).getEnclosingInteractionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2e75fd85-3a6f-46d6-8e92-eb2edc273dc2")
    public static class OwnedLineSmDependency extends SmMultipleDependency {
        @objid ("aab28c75-aaa8-411d-a47a-6e2158b58ffd")
        private SmDependency symetricDep;

        @objid ("0f51e61d-0eea-47eb-805f-ffcb3e718549")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InteractionData)data).mOwnedLine != null)? ((InteractionData)data).mOwnedLine:SmMultipleDependency.EMPTY;
        }

        @objid ("f2918b84-1bf1-4ef2-b569-919c68e2a7cd")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InteractionData) data).mOwnedLine = values;
        }

        @objid ("951cc9ea-dcb6-4277-9dbe-3b74d1c3b98a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LifelineSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c869d8a9-a30c-4256-9b26-b5e6bab49515")
    public static class ReferedUseSmDependency extends SmMultipleDependency {
        @objid ("64525e50-be75-480d-8b67-3a2b4fee7c32")
        private SmDependency symetricDep;

        @objid ("50e30a8d-aec7-429c-8715-5c33562e7714")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InteractionData)data).mReferedUse != null)? ((InteractionData)data).mReferedUse:SmMultipleDependency.EMPTY;
        }

        @objid ("293e698d-1849-448e-8371-bd4d61f44cbe")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InteractionData) data).mReferedUse = values;
        }

        @objid ("68102ef3-ec16-4f71-92c4-d9227f2515e6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InteractionUseSmClass)this.getTarget()).getRefersToDep();
            }
            return this.symetricDep;
        }

    }

}
