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
import org.modelio.metamodel.impl.uml.statik.InterfaceSmClass;
import org.modelio.metamodel.impl.uml.statik.LinkEndSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryLinkEndSmClass;
import org.modelio.metamodel.impl.uml.statik.PortSmClass;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
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

@objid ("f116ca1f-783f-4238-a733-e36b905a594b")
public class ProvidedInterfaceSmClass extends ModelElementSmClass {
    @objid ("e184efe7-c07c-43c5-8a8a-667f229efd5a")
    private SmDependency providedElementDep;

    @objid ("ffe13af9-a87d-40a4-94f3-0560d8677548")
    private SmDependency providingDep;

    @objid ("a70f1bd5-803d-4319-af20-52a935278107")
    private SmDependency consumerDep;

    @objid ("d0eaca24-d40b-4d7c-adc7-4e229d3cf84e")
    private SmDependency naryConsumerDep;

    @objid ("d9021725-921e-43ed-b2e1-e2f7ffaaef3c")
    public ProvidedInterfaceSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("d9831050-19a8-40f6-a332-e06a1ac88d5b")
    @Override
    public String getName() {
        return "ProvidedInterface";
    }

    @objid ("4435a477-bab5-4d76-a1f5-300eadf79b5d")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("ef5373a3-e037-4bc9-953b-e14b96219dac")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ProvidedInterface.class;
    }

    @objid ("4dce10d5-74de-4f7f-9c7f-2b5ae40edb29")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("ff8c8fd4-a1c9-4c53-ab24-ce7bcbc8ab65")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("70fcd265-6205-448c-bd72-44858cca1346")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ProvidedInterfaceObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.providedElementDep = new ProvidedElementSmDependency();
        this.providedElementDep.init("ProvidedElement", this, metamodel.getMClass("Interface"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.providedElementDep);
        
        this.providingDep = new ProvidingSmDependency();
        this.providingDep.init("Providing", this, metamodel.getMClass("Port"), 1, 1 );
        registerDependency(this.providingDep);
        
        this.consumerDep = new ConsumerSmDependency();
        this.consumerDep.init("Consumer", this, metamodel.getMClass("LinkEnd"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.consumerDep);
        
        this.naryConsumerDep = new NaryConsumerSmDependency();
        this.naryConsumerDep.init("NaryConsumer", this, metamodel.getMClass("NaryLinkEnd"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.naryConsumerDep);
    }

    @objid ("3655e16b-6cce-4eef-938f-da5c0fdcec7f")
    public SmDependency getProvidedElementDep() {
        if (this.providedElementDep == null) {
        	this.providedElementDep = this.getDependencyDef("ProvidedElement");
        }
        return this.providedElementDep;
    }

    @objid ("72dc9f35-7303-484c-92fd-c6f332ae7ad5")
    public SmDependency getProvidingDep() {
        if (this.providingDep == null) {
        	this.providingDep = this.getDependencyDef("Providing");
        }
        return this.providingDep;
    }

    @objid ("1b31e6ad-d1da-4b44-b066-3729dc76f7b7")
    public SmDependency getConsumerDep() {
        if (this.consumerDep == null) {
        	this.consumerDep = this.getDependencyDef("Consumer");
        }
        return this.consumerDep;
    }

    @objid ("7b8b4029-7ab5-47b3-b31f-c0f2abf79e10")
    public SmDependency getNaryConsumerDep() {
        if (this.naryConsumerDep == null) {
        	this.naryConsumerDep = this.getDependencyDef("NaryConsumer");
        }
        return this.naryConsumerDep;
    }

    @objid ("e2407583-e2d7-479f-b727-06f29f89ac41")
    private static class ProvidedInterfaceObjectFactory implements ISmObjectFactory {
        @objid ("a30c6026-c2bb-4cae-9dfd-514f9cd2ce12")
        private ProvidedInterfaceSmClass smClass;

        @objid ("88cdf3ea-0665-4212-9486-88f7374b6589")
        public ProvidedInterfaceObjectFactory(ProvidedInterfaceSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("17310a82-884f-4ba7-bdf2-bfae0d56b682")
        @Override
        public ISmObjectData createData() {
            return new ProvidedInterfaceData(this.smClass);
        }

        @objid ("55d66c60-0351-4a8d-8081-681c33216a6f")
        @Override
        public SmObjectImpl createImpl() {
            return new ProvidedInterfaceImpl();
        }

    }

    @objid ("a58d4223-0b9a-4f7d-bd47-8e68117bd475")
    public static class ProvidedElementSmDependency extends SmMultipleDependency {
        @objid ("51c4902e-f166-4aba-a212-22c43c37695c")
        private SmDependency symetricDep;

        @objid ("b0bf165c-1b90-45d9-a6d7-a6e39488171d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ProvidedInterfaceData)data).mProvidedElement != null)? ((ProvidedInterfaceData)data).mProvidedElement:SmMultipleDependency.EMPTY;
        }

        @objid ("6d1cf30e-650b-411b-9a87-0a0e6ccd7947")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ProvidedInterfaceData) data).mProvidedElement = values;
        }

        @objid ("1aacf136-b5a2-4567-9294-35436c5412a1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InterfaceSmClass)this.getTarget()).getProvidingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("13e39570-3f13-4abe-96d9-6426b473576c")
    public static class ProvidingSmDependency extends SmSingleDependency {
        @objid ("76909bb8-78ee-460a-877a-4ff4a18b777c")
        private SmDependency symetricDep;

        @objid ("d86d52ca-6f08-4520-a8ba-063fa1af9d60")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ProvidedInterfaceData) data).mProviding;
        }

        @objid ("2f3bee9b-a856-446e-904a-1ad54f964fe5")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ProvidedInterfaceData) data).mProviding = value;
        }

        @objid ("a018edd6-ce87-4d7b-ae0d-95dbd80da668")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PortSmClass)this.getTarget()).getProvidedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("bbd96f3d-763b-43d8-8382-a4fbc40f40eb")
    public static class ConsumerSmDependency extends SmMultipleDependency {
        @objid ("5caca77b-1270-4096-8329-7908aead443a")
        private SmDependency symetricDep;

        @objid ("383235c9-b1d6-46c8-9a54-73b2a2de4c97")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ProvidedInterfaceData)data).mConsumer != null)? ((ProvidedInterfaceData)data).mConsumer:SmMultipleDependency.EMPTY;
        }

        @objid ("bae79c44-a201-406c-9599-3872f7c5d4cf")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ProvidedInterfaceData) data).mConsumer = values;
        }

        @objid ("38e646f2-743a-4fd2-a6c8-4dfc74d6375d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LinkEndSmClass)this.getTarget()).getProviderDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5fc44f3a-aa69-45f3-ac04-0fb80ed45918")
    public static class NaryConsumerSmDependency extends SmMultipleDependency {
        @objid ("8dedebb2-cad1-4950-8ea3-fd7e0fc84778")
        private SmDependency symetricDep;

        @objid ("33e25bfe-7c05-48fa-a683-0d84553b5019")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ProvidedInterfaceData)data).mNaryConsumer != null)? ((ProvidedInterfaceData)data).mNaryConsumer:SmMultipleDependency.EMPTY;
        }

        @objid ("22b72db8-43bd-4e22-a9ce-4a519e1944d3")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ProvidedInterfaceData) data).mNaryConsumer = values;
        }

        @objid ("be3ee6db-699e-45ba-8ff4-277b532db4b3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryLinkEndSmClass)this.getTarget()).getProviderDep();
            }
            return this.symetricDep;
        }

    }

}
