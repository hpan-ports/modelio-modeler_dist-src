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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.TransitionSmClass;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("e2239663-1b21-4104-82a3-0efc9a374bb3")
public class InternalTransitionSmClass extends TransitionSmClass {
    @objid ("410e282a-079b-47a1-adad-d7113e78d0d9")
    private SmDependency sComposedDep;

    @objid ("6f4bc52f-0f23-44c3-bc09-98d701f1f95e")
    public InternalTransitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("20052d56-9eaf-48fe-bd3b-c48f6e4c4844")
    @Override
    public String getName() {
        return "InternalTransition";
    }

    @objid ("b88a5122-b8d0-477c-89d0-38d6a91d51cd")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("0ca78194-e721-4afe-acb1-5b3f067f0903")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return InternalTransition.class;
    }

    @objid ("9d9d1692-f2c3-4182-9d0f-60c1ff858620")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("5221d11e-1a6a-4be5-bd99-ff5f4283c797")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("3c6690cd-4abc-4220-a6f9-b563af0efd63")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Transition");
        this.registerFactory(new InternalTransitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.sComposedDep = new SComposedSmDependency();
        this.sComposedDep.init("SComposed", this, metamodel.getMClass("State"), 0, 1 );
        registerDependency(this.sComposedDep);
    }

    @objid ("36da2845-9085-46fc-8cb2-ac2c4082042c")
    public SmDependency getSComposedDep() {
        if (this.sComposedDep == null) {
        	this.sComposedDep = this.getDependencyDef("SComposed");
        }
        return this.sComposedDep;
    }

    @objid ("9a520da9-6b94-4f8e-9057-af196e0cb6cc")
    private static class InternalTransitionObjectFactory implements ISmObjectFactory {
        @objid ("df0d01f1-f2eb-492a-b235-eafe7f0f792f")
        private InternalTransitionSmClass smClass;

        @objid ("f35f7dcc-fdc8-4104-a6c5-8d47b2d3178e")
        public InternalTransitionObjectFactory(InternalTransitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("ec467c47-0282-4daf-9266-cbe594ab128d")
        @Override
        public ISmObjectData createData() {
            return new InternalTransitionData(this.smClass);
        }

        @objid ("60c3cbd7-6b9d-4627-af54-4cfd838795bf")
        @Override
        public SmObjectImpl createImpl() {
            return new InternalTransitionImpl();
        }

    }

    @objid ("35159162-be17-4f35-977f-984167153b90")
    public static class SComposedSmDependency extends SmSingleDependency {
        @objid ("dba6bc72-7d6b-495d-940c-f5ce2658679f")
        private SmDependency symetricDep;

        @objid ("afdd0526-074f-4b4b-b6bb-d52d69777c86")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((InternalTransitionData) data).mSComposed;
        }

        @objid ("f44e84f3-7d0e-4405-a265-c9996dc9a898")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((InternalTransitionData) data).mSComposed = value;
        }

        @objid ("3e0ba798-e908-4345-830a-08841a5b1a09")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateSmClass)this.getTarget()).getInternalDep();
            }
            return this.symetricDep;
        }

    }

}
