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
package org.modelio.metamodel.impl.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationNodeSmClass;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
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

@objid ("b5a7bf17-d917-40f6-beec-b07d085a45c0")
public class CommunicationInteractionSmClass extends BehaviorSmClass {
    @objid ("276ae4c9-ae30-497a-852f-88b8a2614c2c")
    private SmDependency ownedDep;

    @objid ("00cd0b20-4b06-43b8-811f-23889d3ea1fd")
    public CommunicationInteractionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("15f191ba-4f90-4a8c-ac6d-521ee805d50a")
    @Override
    public String getName() {
        return "CommunicationInteraction";
    }

    @objid ("9de87978-363e-4342-92ea-71cbe92a2d1b")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("74f4aae5-77a3-4091-a764-18c813c82d6b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return CommunicationInteraction.class;
    }

    @objid ("354f4277-9014-4ce7-9eda-dc8fb1686046")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("b84fd5eb-a8ae-43ba-982f-a071a56fbe4e")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("023bae01-643c-494e-9e72-356661dfb0e8")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Behavior");
        this.registerFactory(new CommunicationInteractionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownedDep = new OwnedSmDependency();
        this.ownedDep.init("Owned", this, metamodel.getMClass("CommunicationNode"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedDep);
    }

    @objid ("48cfe31e-6938-4678-96d5-ba0096b6be1b")
    public SmDependency getOwnedDep() {
        if (this.ownedDep == null) {
        	this.ownedDep = this.getDependencyDef("Owned");
        }
        return this.ownedDep;
    }

    @objid ("3d99f99d-55e9-4250-8730-eaf01c4a7b0b")
    private static class CommunicationInteractionObjectFactory implements ISmObjectFactory {
        @objid ("fdf8af67-29aa-4b5a-909b-16c5a229c7ec")
        private CommunicationInteractionSmClass smClass;

        @objid ("9b05d404-7586-4389-8772-a75399be92de")
        public CommunicationInteractionObjectFactory(CommunicationInteractionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("8f89e1b3-17a3-4f1e-9ea6-7bc48cbfcf27")
        @Override
        public ISmObjectData createData() {
            return new CommunicationInteractionData(this.smClass);
        }

        @objid ("6cddf2be-f514-4c1c-a169-9ea42cd7e8a9")
        @Override
        public SmObjectImpl createImpl() {
            return new CommunicationInteractionImpl();
        }

    }

    @objid ("4fe91c4e-75ee-4d51-b553-6da56afe4c75")
    public static class OwnedSmDependency extends SmMultipleDependency {
        @objid ("8d4c2f67-4429-4267-8410-221ef1f21a31")
        private SmDependency symetricDep;

        @objid ("794cf34f-d31a-4939-a377-acc85b64b8ad")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((CommunicationInteractionData)data).mOwned != null)? ((CommunicationInteractionData)data).mOwned:SmMultipleDependency.EMPTY;
        }

        @objid ("cd436d97-1685-451d-8f77-767ed142efb7")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((CommunicationInteractionData) data).mOwned = values;
        }

        @objid ("1b35b119-5142-4ad5-846b-17df6f9deba1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationNodeSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

}
