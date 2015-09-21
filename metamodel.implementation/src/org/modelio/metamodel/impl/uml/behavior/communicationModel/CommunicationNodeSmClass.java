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
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationChannelSmClass;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationInteractionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.InstanceSmClass;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
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

@objid ("56558095-d704-48b2-8db0-7279fe43bfa4")
public class CommunicationNodeSmClass extends ModelElementSmClass {
    @objid ("db41da4a-3a91-4fef-9a60-669500baed6e")
    private SmAttribute selectorAtt;

    @objid ("4bd99b41-c901-46c7-bc23-94ab4e6dfc1b")
    private SmDependency ownerDep;

    @objid ("4abb6cdc-c74e-41b9-bd66-ebe1c37d0ce7")
    private SmDependency representedDep;

    @objid ("4353b497-931a-4bca-8a67-8c6d83dc5805")
    private SmDependency startedDep;

    @objid ("242824fc-4786-4c09-8e03-8d443676cbc4")
    private SmDependency endedDep;

    @objid ("5f9e00df-76ea-4595-a16a-b4353f0243cf")
    public CommunicationNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("46cc8132-40e9-40d0-991a-1e74d7ec5e15")
    @Override
    public String getName() {
        return "CommunicationNode";
    }

    @objid ("985f0574-cab2-4e0d-ade4-338b9515130c")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("c3ab6ee6-2396-4356-bd8e-804fbadb15b8")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return CommunicationNode.class;
    }

    @objid ("c07f8865-c2ff-4398-9ff5-55330dc18fb8")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("a5d49f1d-6ef4-4f12-80c0-a20d508f9c2a")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("abeb8acc-8c81-4e27-9fd6-6df5e22aabd1")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new CommunicationNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.selectorAtt = new SelectorSmAttribute();
        this.selectorAtt.init("Selector", this, String.class );
        registerAttribute(this.selectorAtt);
        
        
        // Initialize and register the SmDependency
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("CommunicationInteraction"), 0, 1 );
        registerDependency(this.ownerDep);
        
        this.representedDep = new RepresentedSmDependency();
        this.representedDep.init("Represented", this, metamodel.getMClass("Instance"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedDep);
        
        this.startedDep = new StartedSmDependency();
        this.startedDep.init("Started", this, metamodel.getMClass("CommunicationChannel"), 0, -1 , SmDirective.SMCDCOMPONENT, SmDirective.SMCDTODELETE);
        registerDependency(this.startedDep);
        
        this.endedDep = new EndedSmDependency();
        this.endedDep.init("Ended", this, metamodel.getMClass("CommunicationChannel"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.endedDep);
    }

    @objid ("6be76866-a7bd-401a-9c16-5da698505b26")
    public SmAttribute getSelectorAtt() {
        if (this.selectorAtt == null) {
        	this.selectorAtt = this.getAttributeDef("Selector");
        }
        return this.selectorAtt;
    }

    @objid ("b389e6a7-8d9a-4f22-988d-a0ab916fd86b")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("60d1df50-6d47-4d3e-a503-5a27bdb9cfc0")
    public SmDependency getRepresentedDep() {
        if (this.representedDep == null) {
        	this.representedDep = this.getDependencyDef("Represented");
        }
        return this.representedDep;
    }

    @objid ("5c343026-057e-4639-8352-df000b1021f0")
    public SmDependency getStartedDep() {
        if (this.startedDep == null) {
        	this.startedDep = this.getDependencyDef("Started");
        }
        return this.startedDep;
    }

    @objid ("d073ad3c-45db-4b5b-9339-39d80272ac42")
    public SmDependency getEndedDep() {
        if (this.endedDep == null) {
        	this.endedDep = this.getDependencyDef("Ended");
        }
        return this.endedDep;
    }

    @objid ("cbea55c0-af5c-410f-8849-af42c851b5b8")
    private static class CommunicationNodeObjectFactory implements ISmObjectFactory {
        @objid ("f5a4f2c3-051f-4a7c-9c89-e4f7c57e7bc0")
        private CommunicationNodeSmClass smClass;

        @objid ("9dd48806-bd55-4d12-8b85-f765eac9c00b")
        public CommunicationNodeObjectFactory(CommunicationNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("ee9d7679-38c3-4dfe-9499-d55829e7d590")
        @Override
        public ISmObjectData createData() {
            return new CommunicationNodeData(this.smClass);
        }

        @objid ("b3db6b3a-7841-452c-b91d-83c55f769634")
        @Override
        public SmObjectImpl createImpl() {
            return new CommunicationNodeImpl();
        }

    }

    @objid ("33d29b6e-737e-4c94-a4d7-4531e236cfbb")
    public static class SelectorSmAttribute extends SmAttribute {
        @objid ("657a7e72-7059-43d4-a98f-e301d2dbfe49")
        public Object getValue(ISmObjectData data) {
            return ((CommunicationNodeData) data).mSelector;
        }

        @objid ("da5a1937-f08d-4345-bbde-37b410af9286")
        public void setValue(ISmObjectData data, Object value) {
            ((CommunicationNodeData) data).mSelector = value;
        }

    }

    @objid ("fe799e88-4a81-4c4a-ab17-d0c523b0abf2")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("52d31caa-ed92-4b25-afdd-968c85620bc1")
        private SmDependency symetricDep;

        @objid ("90596798-210e-4515-b85a-c37ba62d0889")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CommunicationNodeData) data).mOwner;
        }

        @objid ("d05897b8-b2d2-4b33-a20a-34505c83d907")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CommunicationNodeData) data).mOwner = value;
        }

        @objid ("20bacf4d-ab1c-481e-bf21-d11a69f945e8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationInteractionSmClass)this.getTarget()).getOwnedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("23ddffad-b92e-405d-bffd-23cdebed3ebc")
    public static class RepresentedSmDependency extends SmSingleDependency {
        @objid ("b1560120-f7a9-4647-9e21-10af4796c8f7")
        private SmDependency symetricDep;

        @objid ("d26a447b-d68b-4ebb-b0aa-4f97a79166c1")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CommunicationNodeData) data).mRepresented;
        }

        @objid ("c7a51a15-22c0-4396-b326-3ab01ff17463")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CommunicationNodeData) data).mRepresented = value;
        }

        @objid ("a7ee13dd-b107-491b-aee5-bfb6ccc4f804")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InstanceSmClass)this.getTarget()).getRepresentedCommunicationNodeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("41fffcbf-2ec9-406b-bd10-9aa83bec2c58")
    public static class StartedSmDependency extends SmMultipleDependency {
        @objid ("925b4c47-31a8-43be-aafb-c653e1494b54")
        private SmDependency symetricDep;

        @objid ("ae80e262-abfc-4d49-99bd-bbb21620612b")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((CommunicationNodeData)data).mStarted != null)? ((CommunicationNodeData)data).mStarted:SmMultipleDependency.EMPTY;
        }

        @objid ("4259c7ce-91bd-4550-a684-dcaa7d317b5e")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((CommunicationNodeData) data).mStarted = values;
        }

        @objid ("a5a74f9b-df0c-4d56-8c5b-7e4d4c53e202")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationChannelSmClass)this.getTarget()).getStartDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("857897ec-5724-4727-9505-58fbb05b52b2")
    public static class EndedSmDependency extends SmMultipleDependency {
        @objid ("f5ec2732-d4ee-4396-b767-53c1cc56be99")
        private SmDependency symetricDep;

        @objid ("dbcee7f7-d194-4f9f-95ca-840f39d1111f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((CommunicationNodeData)data).mEnded != null)? ((CommunicationNodeData)data).mEnded:SmMultipleDependency.EMPTY;
        }

        @objid ("53b5b077-bca2-427a-aead-b3ef892d8173")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((CommunicationNodeData) data).mEnded = values;
        }

        @objid ("3fc31d91-b5c9-46e2-a9d2-6aa103044721")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationChannelSmClass)this.getTarget()).getEndDep();
            }
            return this.symetricDep;
        }

    }

}
