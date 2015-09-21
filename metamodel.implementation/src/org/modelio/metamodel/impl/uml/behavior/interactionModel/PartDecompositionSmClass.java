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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionUseSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.LifelineSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
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

@objid ("82b10d49-a5cd-435e-b05c-423ff2ffd4c4")
public class PartDecompositionSmClass extends InteractionUseSmClass {
    @objid ("0e459edc-6720-41c0-b619-ac3c7fa091a4")
    private SmDependency decomposedDep;

    @objid ("fafe8c8a-8314-40e4-93c5-5942bc0bd92a")
    public PartDecompositionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("302c176f-4d5b-486b-a7c8-f3d865a08793")
    @Override
    public String getName() {
        return "PartDecomposition";
    }

    @objid ("aa50c93a-85c4-4bee-bfa2-d4063a273450")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("da498cc1-5846-48a6-aa65-a6e71645184d")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return PartDecomposition.class;
    }

    @objid ("c952dc1d-e4ac-4527-a792-737364cf4eea")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("27c53876-7c9b-4f53-9087-f8b8ecb27fcd")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("67257543-8ed2-4f49-a037-d67dc0d601b0")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("InteractionUse");
        this.registerFactory(new PartDecompositionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.decomposedDep = new DecomposedSmDependency();
        this.decomposedDep.init("Decomposed", this, metamodel.getMClass("Lifeline"), 1, 1 );
        registerDependency(this.decomposedDep);
    }

    @objid ("7c800be0-37c9-4500-8977-459767a124ac")
    public SmDependency getDecomposedDep() {
        if (this.decomposedDep == null) {
        	this.decomposedDep = this.getDependencyDef("Decomposed");
        }
        return this.decomposedDep;
    }

    @objid ("32cccc7f-e1dc-46a2-9a4d-0b5893ce3d2d")
    private static class PartDecompositionObjectFactory implements ISmObjectFactory {
        @objid ("6416d51f-331d-4978-98ce-9626be1c6b66")
        private PartDecompositionSmClass smClass;

        @objid ("5c882847-6139-4963-9d39-a5cddf40558b")
        public PartDecompositionObjectFactory(PartDecompositionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("259891d8-f65d-45ae-9bf3-22bb1f3df5f2")
        @Override
        public ISmObjectData createData() {
            return new PartDecompositionData(this.smClass);
        }

        @objid ("9bbad505-7d13-48e9-9f03-a10cbf4c408f")
        @Override
        public SmObjectImpl createImpl() {
            return new PartDecompositionImpl();
        }

    }

    @objid ("79cf2729-ff96-4f12-b806-2383dd91b8d9")
    public static class DecomposedSmDependency extends SmSingleDependency {
        @objid ("e5803e19-b5b2-430a-bcf1-47aebad330ca")
        private SmDependency symetricDep;

        @objid ("f55953ce-75c8-4391-ad2c-bc3c5730285d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PartDecompositionData) data).mDecomposed;
        }

        @objid ("47b7afbf-0235-4eed-bd6a-feb93f2b261c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PartDecompositionData) data).mDecomposed = value;
        }

        @objid ("d0914a39-d439-490e-9d66-3577ecadac8f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LifelineSmClass)this.getTarget()).getDecomposedAsDep();
            }
            return this.symetricDep;
        }

    }

}
