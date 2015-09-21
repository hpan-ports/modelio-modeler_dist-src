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
import org.modelio.metamodel.impl.uml.behavior.interactionModel.GateSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionUseSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.MessageEndSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
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

@objid ("13e4b29b-d374-4a42-88de-bb3e167df301")
public class GateSmClass extends MessageEndSmClass {
    @objid ("5007380a-b970-492f-949c-232d6706dabc")
    private SmDependency ownerUseDep;

    @objid ("d83d377f-c48c-4824-a53f-1fcd6f887617")
    private SmDependency actualDep;

    @objid ("fc20de46-9a25-4933-a572-d9962f7413f9")
    private SmDependency ownerInteractionDep;

    @objid ("2453cf39-54f8-4fce-a697-b6635cfd08a3")
    private SmDependency ownerFragmentDep;

    @objid ("034bf11d-1cd6-4073-ac64-0a2bb647d8ec")
    private SmDependency formalDep;

    @objid ("1a672977-f030-44db-9e3c-fca17262af44")
    public GateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("82edb2ba-1c0c-4204-bbf8-35d3f693b8d4")
    @Override
    public String getName() {
        return "Gate";
    }

    @objid ("f568a1bf-1e14-4c18-a3e0-32465320167b")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("eaa37072-b279-447d-ba23-92edd39f03d2")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Gate.class;
    }

    @objid ("34cd3142-38e2-44a1-970d-b1cf23e13ec4")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("366e2570-5968-4dc9-893b-98d285f86b83")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("e07f125f-abd5-4d40-8c33-2e93582a43ac")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("MessageEnd");
        this.registerFactory(new GateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownerUseDep = new OwnerUseSmDependency();
        this.ownerUseDep.init("OwnerUse", this, metamodel.getMClass("InteractionUse"), 0, 1 );
        registerDependency(this.ownerUseDep);
        
        this.actualDep = new ActualSmDependency();
        this.actualDep.init("Actual", this, metamodel.getMClass("Gate"), 0, -1 );
        registerDependency(this.actualDep);
        
        this.ownerInteractionDep = new OwnerInteractionSmDependency();
        this.ownerInteractionDep.init("OwnerInteraction", this, metamodel.getMClass("Interaction"), 0, 1 );
        registerDependency(this.ownerInteractionDep);
        
        this.ownerFragmentDep = new OwnerFragmentSmDependency();
        this.ownerFragmentDep.init("OwnerFragment", this, metamodel.getMClass("CombinedFragment"), 0, 1 );
        registerDependency(this.ownerFragmentDep);
        
        this.formalDep = new FormalSmDependency();
        this.formalDep.init("Formal", this, metamodel.getMClass("Gate"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.formalDep);
    }

    @objid ("8e244e72-bb38-44ef-97c0-0d24163fc72e")
    public SmDependency getOwnerUseDep() {
        if (this.ownerUseDep == null) {
        	this.ownerUseDep = this.getDependencyDef("OwnerUse");
        }
        return this.ownerUseDep;
    }

    @objid ("3183c245-2fe0-49d9-96cd-e4f105a3df7b")
    public SmDependency getActualDep() {
        if (this.actualDep == null) {
        	this.actualDep = this.getDependencyDef("Actual");
        }
        return this.actualDep;
    }

    @objid ("10035566-cdef-4d27-b36e-dd44f0405735")
    public SmDependency getOwnerInteractionDep() {
        if (this.ownerInteractionDep == null) {
        	this.ownerInteractionDep = this.getDependencyDef("OwnerInteraction");
        }
        return this.ownerInteractionDep;
    }

    @objid ("48775720-1f8b-4f1c-a026-5419cb380e74")
    public SmDependency getOwnerFragmentDep() {
        if (this.ownerFragmentDep == null) {
        	this.ownerFragmentDep = this.getDependencyDef("OwnerFragment");
        }
        return this.ownerFragmentDep;
    }

    @objid ("b0345fdd-b673-4c67-b850-5f703c48bfed")
    public SmDependency getFormalDep() {
        if (this.formalDep == null) {
        	this.formalDep = this.getDependencyDef("Formal");
        }
        return this.formalDep;
    }

    @objid ("5d917343-0990-40c7-b8ba-e88938cf8277")
    private static class GateObjectFactory implements ISmObjectFactory {
        @objid ("6bd6218e-c2ce-4adc-89c6-a6863b49db4f")
        private GateSmClass smClass;

        @objid ("f97bee77-6b42-466c-a333-3509eb1469b2")
        public GateObjectFactory(GateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("f2de910d-eb0b-4eca-93a8-ffcdf43027b2")
        @Override
        public ISmObjectData createData() {
            return new GateData(this.smClass);
        }

        @objid ("d8ded384-f6b4-42cc-a150-447bb163aaab")
        @Override
        public SmObjectImpl createImpl() {
            return new GateImpl();
        }

    }

    @objid ("780e57ed-b1e0-4fa5-814e-f33b8ad13423")
    public static class OwnerUseSmDependency extends SmSingleDependency {
        @objid ("a3b813fb-944d-417e-a5ff-46270b043f5a")
        private SmDependency symetricDep;

        @objid ("c3021139-4686-4394-b518-8e384e8225b0")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GateData) data).mOwnerUse;
        }

        @objid ("199a25be-533d-4ad8-8513-1f805db6d70b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GateData) data).mOwnerUse = value;
        }

        @objid ("aec6c5fd-17f1-4e64-a3ad-2840e8952ecf")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InteractionUseSmClass)this.getTarget()).getActualGateDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4e6707cb-0aa9-499b-a1a7-def6d3ecf435")
    public static class ActualSmDependency extends SmMultipleDependency {
        @objid ("383bf5b2-300c-4579-b2cd-b70181893b9f")
        private SmDependency symetricDep;

        @objid ("65abfc51-c136-4657-8396-089f763f912f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GateData)data).mActual != null)? ((GateData)data).mActual:SmMultipleDependency.EMPTY;
        }

        @objid ("ca4830ce-8247-47a7-97d6-ab02a0fa4d59")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GateData) data).mActual = values;
        }

        @objid ("1a8ebff5-37a7-4ee0-8901-6f41ea3017c2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GateSmClass)this.getTarget()).getFormalDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("19994fc8-e7fd-45dd-b667-15e6c75cf496")
    public static class OwnerInteractionSmDependency extends SmSingleDependency {
        @objid ("a19a358f-3a9b-4ed3-8b76-978176fa3a93")
        private SmDependency symetricDep;

        @objid ("22a556d5-ff96-4252-9f11-13047132f69d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GateData) data).mOwnerInteraction;
        }

        @objid ("adb5c98d-e718-4145-9f8a-1c71e605a165")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GateData) data).mOwnerInteraction = value;
        }

        @objid ("968840ad-7ed5-4fec-a0da-b48594a0cc60")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InteractionSmClass)this.getTarget()).getFormalGateDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("74f34b5a-d1b7-4fd3-9121-7dae10b4a727")
    public static class OwnerFragmentSmDependency extends SmSingleDependency {
        @objid ("e0967f4b-4e6e-4655-b402-c736b04ec946")
        private SmDependency symetricDep;

        @objid ("44f1e067-3339-4e48-bff1-42b8cdd88052")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GateData) data).mOwnerFragment;
        }

        @objid ("0b88f8ee-b8d8-4087-bb34-89a68cd38f6e")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GateData) data).mOwnerFragment = value;
        }

        @objid ("f22c9b32-0bbc-4894-9ddf-7af15168145f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CombinedFragmentSmClass)this.getTarget()).getFragmentGateDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ea6e4ef0-a2f6-4684-98c9-1cc37eff82da")
    public static class FormalSmDependency extends SmSingleDependency {
        @objid ("c6e8090f-a3de-4fd5-a41c-a5765e8ddfe0")
        private SmDependency symetricDep;

        @objid ("bce82379-e4d6-46b8-b482-33746345a778")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GateData) data).mFormal;
        }

        @objid ("d1ed4188-7a48-4305-ad1d-20cfcd238d28")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GateData) data).mFormal = value;
        }

        @objid ("ef3c8d49-4174-4e97-b933-b16c93cc7bcb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GateSmClass)this.getTarget()).getActualDep();
            }
            return this.symetricDep;
        }

    }

}
