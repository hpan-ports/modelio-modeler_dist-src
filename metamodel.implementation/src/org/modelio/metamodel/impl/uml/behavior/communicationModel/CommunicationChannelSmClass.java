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
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationMessageSmClass;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationNodeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.LinkSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryLinkSmClass;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
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

@objid ("74a6b528-ebe4-421d-bf3f-31899335ac89")
public class CommunicationChannelSmClass extends ModelElementSmClass {
    @objid ("3370ed9f-20ee-4fd8-80c4-f6bb2bc98086")
    private SmDependency startToEndMessageDep;

    @objid ("b0ef5e41-e57b-4a18-a505-7223319a8d88")
    private SmDependency channelDep;

    @objid ("0c3e56c1-6b56-4f6b-b4c0-e59ccb5fbe0b")
    private SmDependency startDep;

    @objid ("8348ab5f-c01d-4a64-9db3-31cb5e92cea9")
    private SmDependency naryChannelDep;

    @objid ("06bbd5ed-3f97-4ff4-8ecc-75b7944997e8")
    private SmDependency endToStartMessageDep;

    @objid ("67c7f381-e269-4d88-8478-f8a2bc086435")
    private SmDependency endDep;

    @objid ("440d8db6-60a7-47a9-9a85-30fae41bb51c")
    public CommunicationChannelSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("9f87ba49-e053-4bab-8a13-c4ed99fc76ce")
    @Override
    public String getName() {
        return "CommunicationChannel";
    }

    @objid ("a5f49b5e-3db4-4bb7-9c1d-8acf470937d8")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d6e3be0c-eae8-43b4-9438-ea1790cf56fc")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return CommunicationChannel.class;
    }

    @objid ("04dae3d8-023a-4ba7-9316-8a89072d9aeb")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("3df4d24a-b2bd-4e48-babd-aa84aa76ebab")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("919dc5ce-83b6-41d0-b1f3-cf07ba287e22")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new CommunicationChannelObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.startToEndMessageDep = new StartToEndMessageSmDependency();
        this.startToEndMessageDep.init("StartToEndMessage", this, metamodel.getMClass("CommunicationMessage"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.startToEndMessageDep);
        
        this.channelDep = new ChannelSmDependency();
        this.channelDep.init("Channel", this, metamodel.getMClass("Link"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.channelDep);
        
        this.startDep = new StartSmDependency();
        this.startDep.init("Start", this, metamodel.getMClass("CommunicationNode"), 0, 1 );
        registerDependency(this.startDep);
        
        this.naryChannelDep = new NaryChannelSmDependency();
        this.naryChannelDep.init("NaryChannel", this, metamodel.getMClass("NaryLink"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.naryChannelDep);
        
        this.endToStartMessageDep = new EndToStartMessageSmDependency();
        this.endToStartMessageDep.init("EndToStartMessage", this, metamodel.getMClass("CommunicationMessage"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.endToStartMessageDep);
        
        this.endDep = new EndSmDependency();
        this.endDep.init("End", this, metamodel.getMClass("CommunicationNode"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.endDep);
    }

    @objid ("d658cfb5-f1ae-4e2a-b885-a3f3d0883375")
    public SmDependency getStartToEndMessageDep() {
        if (this.startToEndMessageDep == null) {
        	this.startToEndMessageDep = this.getDependencyDef("StartToEndMessage");
        }
        return this.startToEndMessageDep;
    }

    @objid ("0119969b-9e0d-4abd-aca7-ca2839f280c9")
    public SmDependency getChannelDep() {
        if (this.channelDep == null) {
        	this.channelDep = this.getDependencyDef("Channel");
        }
        return this.channelDep;
    }

    @objid ("6ba01814-fea7-4f9f-93d5-6eae64ce4a07")
    public SmDependency getStartDep() {
        if (this.startDep == null) {
        	this.startDep = this.getDependencyDef("Start");
        }
        return this.startDep;
    }

    @objid ("4b90d262-68c9-40d0-b9e2-47d950d2fbaa")
    public SmDependency getNaryChannelDep() {
        if (this.naryChannelDep == null) {
        	this.naryChannelDep = this.getDependencyDef("NaryChannel");
        }
        return this.naryChannelDep;
    }

    @objid ("169cd3ca-b71c-4cb5-8375-3f61132228e8")
    public SmDependency getEndToStartMessageDep() {
        if (this.endToStartMessageDep == null) {
        	this.endToStartMessageDep = this.getDependencyDef("EndToStartMessage");
        }
        return this.endToStartMessageDep;
    }

    @objid ("0932dacb-d0f8-4682-9b88-4d9fdc942b91")
    public SmDependency getEndDep() {
        if (this.endDep == null) {
        	this.endDep = this.getDependencyDef("End");
        }
        return this.endDep;
    }

    @objid ("b72b0bae-f538-4162-8ce9-012d7b891a9e")
    private static class CommunicationChannelObjectFactory implements ISmObjectFactory {
        @objid ("d321260d-4179-4f17-9e4f-a565921fcc99")
        private CommunicationChannelSmClass smClass;

        @objid ("e5b5eb0b-d2b7-4bd1-88ee-cadf66898c8d")
        public CommunicationChannelObjectFactory(CommunicationChannelSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("dde8c2ce-0f48-4d42-b395-4d2693f0bb05")
        @Override
        public ISmObjectData createData() {
            return new CommunicationChannelData(this.smClass);
        }

        @objid ("f1ba5002-5a80-435b-8afe-9f7861589470")
        @Override
        public SmObjectImpl createImpl() {
            return new CommunicationChannelImpl();
        }

    }

    @objid ("9b2e4f9f-db5f-46e9-9c79-a6f8d32b1e74")
    public static class StartToEndMessageSmDependency extends SmMultipleDependency {
        @objid ("d1efaa0b-f9d3-484d-9c7f-6f3d7422b3ba")
        private SmDependency symetricDep;

        @objid ("a09a4d1f-6898-4bd2-a173-131e64a727a3")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((CommunicationChannelData)data).mStartToEndMessage != null)? ((CommunicationChannelData)data).mStartToEndMessage:SmMultipleDependency.EMPTY;
        }

        @objid ("62c481f8-2e05-4dda-aadf-a3f4339d19f9")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((CommunicationChannelData) data).mStartToEndMessage = values;
        }

        @objid ("409f7074-b7e0-4f4d-968d-0ff14dd7a571")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationMessageSmClass)this.getTarget()).getChannelDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("62c9e5df-6dbe-4375-bd38-58dd7a79cab4")
    public static class ChannelSmDependency extends SmSingleDependency {
        @objid ("a4e1d79d-d4ba-44d9-aa81-d55e6d6ec41f")
        private SmDependency symetricDep;

        @objid ("df496194-c27f-495a-b85c-531d001a5733")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CommunicationChannelData) data).mChannel;
        }

        @objid ("7372da16-f0e9-4ce5-bcf9-d14f94915a15")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CommunicationChannelData) data).mChannel = value;
        }

        @objid ("ec15e87d-1aca-4979-9511-df7a5a7f28af")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LinkSmClass)this.getTarget()).getSentDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a59e2db4-9042-444a-a8e0-60ec7f16f2fd")
    public static class StartSmDependency extends SmSingleDependency {
        @objid ("073891e2-68cf-4b1d-9131-5393b04b4d50")
        private SmDependency symetricDep;

        @objid ("629e4a01-72ac-4249-84fd-91c0be7d2671")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CommunicationChannelData) data).mStart;
        }

        @objid ("53bc5f43-4430-4310-8b72-e3c24b065585")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CommunicationChannelData) data).mStart = value;
        }

        @objid ("0250f9ed-502b-4e6c-b457-2a58d9f9ef47")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationNodeSmClass)this.getTarget()).getStartedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("378e3453-1151-4aa9-a212-724150df4593")
    public static class NaryChannelSmDependency extends SmSingleDependency {
        @objid ("da78b6c5-ea2b-42a0-88cb-2a859a9a11c6")
        private SmDependency symetricDep;

        @objid ("5e991809-fd6e-429c-beb2-0d33703d80fb")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CommunicationChannelData) data).mNaryChannel;
        }

        @objid ("d2ae6346-8adc-4c8e-91e6-fa47abde96c4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CommunicationChannelData) data).mNaryChannel = value;
        }

        @objid ("bb770293-6982-4427-a12a-232f039560d5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryLinkSmClass)this.getTarget()).getSentDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e636d287-d6b6-4215-8923-3b2246860e32")
    public static class EndToStartMessageSmDependency extends SmMultipleDependency {
        @objid ("8a04ea8a-c2b6-4ddd-b3d8-3b01536dd2e5")
        private SmDependency symetricDep;

        @objid ("7fdc8ea6-b8df-4862-a504-b848da317f12")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((CommunicationChannelData)data).mEndToStartMessage != null)? ((CommunicationChannelData)data).mEndToStartMessage:SmMultipleDependency.EMPTY;
        }

        @objid ("9fde8209-aaa2-41cc-bd49-3916e3ce4e51")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((CommunicationChannelData) data).mEndToStartMessage = values;
        }

        @objid ("564c2494-a8b5-4d10-bab1-aef2f9a23efa")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationMessageSmClass)this.getTarget()).getInvertedChannelDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("43585f6d-0d05-4ef7-83d7-f08417300781")
    public static class EndSmDependency extends SmSingleDependency {
        @objid ("f67dd074-368e-4cf2-b34c-88e5593c0be4")
        private SmDependency symetricDep;

        @objid ("9c693202-fa78-4d9b-a141-f97ee5d9e295")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CommunicationChannelData) data).mEnd;
        }

        @objid ("a14c8c39-0387-47ab-a621-b08783c2dac8")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CommunicationChannelData) data).mEnd = value;
        }

        @objid ("7ca7c5a8-afad-4de9-bd8b-9829173b23ae")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationNodeSmClass)this.getTarget()).getEndedDep();
            }
            return this.symetricDep;
        }

    }

}
