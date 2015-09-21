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
import org.modelio.metamodel.impl.uml.behavior.interactionModel.GateSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionFragmentSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
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

@objid ("cc151a74-505a-48b1-a76f-acbe1981f23b")
public class InteractionUseSmClass extends InteractionFragmentSmClass {
    @objid ("92dc88bd-f2d5-4f97-ab74-33f1fb612939")
    private SmAttribute endLineNumberAtt;

    @objid ("2724edd8-b821-484c-bd7f-9eefac8994ef")
    private SmDependency actualGateDep;

    @objid ("54c9e4e8-304d-4c41-8bc0-2f832e6533fc")
    private SmDependency refersToDep;

    @objid ("9e482df9-58d5-4fb0-887e-e4ca5fb676b7")
    public InteractionUseSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("7a597984-2762-45a0-8906-43dd27c1d5d1")
    @Override
    public String getName() {
        return "InteractionUse";
    }

    @objid ("2663388c-082b-4d43-95d1-aa1bcfbd3067")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("706c6a03-d36b-4c68-b59b-2629ac3b8d97")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return InteractionUse.class;
    }

    @objid ("49a8ba8a-d1e6-4304-ae27-e59cdc34f3d1")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("66156042-9b16-4f68-901c-6b208ffa9812")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("2de75ab7-8d37-45b6-8828-a360da03ed11")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("InteractionFragment");
        this.registerFactory(new InteractionUseObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.endLineNumberAtt = new EndLineNumberSmAttribute();
        this.endLineNumberAtt.init("EndLineNumber", this, Integer.class );
        registerAttribute(this.endLineNumberAtt);
        
        
        // Initialize and register the SmDependency
        this.actualGateDep = new ActualGateSmDependency();
        this.actualGateDep.init("ActualGate", this, metamodel.getMClass("Gate"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.actualGateDep);
        
        this.refersToDep = new RefersToSmDependency();
        this.refersToDep.init("RefersTo", this, metamodel.getMClass("Interaction"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.refersToDep);
    }

    @objid ("b8944b5b-ff55-4e5b-992b-3f3607f96d4c")
    public SmAttribute getEndLineNumberAtt() {
        if (this.endLineNumberAtt == null) {
        	this.endLineNumberAtt = this.getAttributeDef("EndLineNumber");
        }
        return this.endLineNumberAtt;
    }

    @objid ("d73641d4-4806-433b-8abc-8b3700664a25")
    public SmDependency getActualGateDep() {
        if (this.actualGateDep == null) {
        	this.actualGateDep = this.getDependencyDef("ActualGate");
        }
        return this.actualGateDep;
    }

    @objid ("e2bb50e2-efee-4634-9cc0-1d9feb91fb71")
    public SmDependency getRefersToDep() {
        if (this.refersToDep == null) {
        	this.refersToDep = this.getDependencyDef("RefersTo");
        }
        return this.refersToDep;
    }

    @objid ("cca59bf5-cc54-49c5-bccc-a488fc3f9ee5")
    private static class InteractionUseObjectFactory implements ISmObjectFactory {
        @objid ("395b1912-5d2f-4d9f-8227-d6d1087c37ec")
        private InteractionUseSmClass smClass;

        @objid ("4f52894e-ee19-4588-96aa-7f39aa3f4c2b")
        public InteractionUseObjectFactory(InteractionUseSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4c863353-fb51-45ed-8eb8-632960fc2d31")
        @Override
        public ISmObjectData createData() {
            return new InteractionUseData(this.smClass);
        }

        @objid ("5f30e041-0e05-4de7-b5d8-a98e0b429487")
        @Override
        public SmObjectImpl createImpl() {
            return new InteractionUseImpl();
        }

    }

    @objid ("f1e9c7eb-1020-4601-9410-647858419121")
    public static class EndLineNumberSmAttribute extends SmAttribute {
        @objid ("3dbcf662-c96d-4278-b643-6ce23988f0a9")
        public Object getValue(ISmObjectData data) {
            return ((InteractionUseData) data).mEndLineNumber;
        }

        @objid ("7d636aa0-add5-44ba-8f4a-ef25f3a73b9a")
        public void setValue(ISmObjectData data, Object value) {
            ((InteractionUseData) data).mEndLineNumber = value;
        }

    }

    @objid ("c32c5b82-f317-4051-a2f9-556750dc0868")
    public static class ActualGateSmDependency extends SmMultipleDependency {
        @objid ("7e48356c-50cb-4c27-992e-6eb969516959")
        private SmDependency symetricDep;

        @objid ("23a88ba2-de7d-4bc8-a5e0-22fc6eab0fe7")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InteractionUseData)data).mActualGate != null)? ((InteractionUseData)data).mActualGate:SmMultipleDependency.EMPTY;
        }

        @objid ("d2552d6a-318f-4091-bbf4-718b28b9f813")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InteractionUseData) data).mActualGate = values;
        }

        @objid ("0fbb06cb-3188-45a3-bca0-beefe178cc39")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GateSmClass)this.getTarget()).getOwnerUseDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c7915c2d-a6e7-4fd0-aab9-39eca55742f4")
    public static class RefersToSmDependency extends SmSingleDependency {
        @objid ("a443289f-6ce2-4d2d-a95f-73c1a9c35dc4")
        private SmDependency symetricDep;

        @objid ("6a322f32-63cf-4af7-8d2a-64930ccb99ef")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((InteractionUseData) data).mRefersTo;
        }

        @objid ("3d3d9db2-e820-46bd-8bf9-416a12a36cfb")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((InteractionUseData) data).mRefersTo = value;
        }

        @objid ("8fb0e807-c5f0-478c-bdc0-f6b025184115")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InteractionSmClass)this.getTarget()).getReferedUseDep();
            }
            return this.symetricDep;
        }

    }

}
