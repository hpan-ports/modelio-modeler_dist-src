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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityActionSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.InputPinSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
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

@objid ("e0fb04a1-c5b8-467d-8e26-5fa7d5ce5735")
public class ExceptionHandlerSmClass extends ModelElementSmClass {
    @objid ("67a08a32-a1ab-41e4-9d9e-a8b0e90fb982")
    private SmAttribute guardAtt;

    @objid ("61b710b1-ea68-4b6a-b366-a33590cc34a9")
    private SmAttribute weightAtt;

    @objid ("b0a7f1b6-8903-4872-ba73-08117bdc4019")
    private SmDependency protectedNodeDep;

    @objid ("fa53bf83-07b4-4bec-a173-14f25e5e7f90")
    private SmDependency exceptionInputDep;

    @objid ("a450d607-8fd1-4fbf-b61d-1b1fe50251c1")
    private SmDependency exceptionTypeDep;

    @objid ("8e50b7df-4c87-44b5-a637-18cb92e56001")
    public ExceptionHandlerSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("06f21871-4567-4b68-b311-556071cebc68")
    @Override
    public String getName() {
        return "ExceptionHandler";
    }

    @objid ("90b2b120-81f3-4918-a715-688b62ab41b9")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("39891b7e-13c5-45e5-b332-b8876c650421")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ExceptionHandler.class;
    }

    @objid ("ccac15b4-9555-406c-96f9-61d148ea8a4d")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("b700f45a-075e-460f-87b0-bb86f871f9f3")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("295530a4-e391-4e46-8322-545b89ca9e8b")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ExceptionHandlerObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.guardAtt = new GuardSmAttribute();
        this.guardAtt.init("Guard", this, String.class );
        registerAttribute(this.guardAtt);
        
        this.weightAtt = new WeightSmAttribute();
        this.weightAtt.init("Weight", this, String.class );
        registerAttribute(this.weightAtt);
        
        
        // Initialize and register the SmDependency
        this.protectedNodeDep = new ProtectedNodeSmDependency();
        this.protectedNodeDep.init("ProtectedNode", this, metamodel.getMClass("ActivityAction"), 1, 1 );
        registerDependency(this.protectedNodeDep);
        
        this.exceptionInputDep = new ExceptionInputSmDependency();
        this.exceptionInputDep.init("ExceptionInput", this, metamodel.getMClass("InputPin"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.exceptionInputDep);
        
        this.exceptionTypeDep = new ExceptionTypeSmDependency();
        this.exceptionTypeDep.init("ExceptionType", this, metamodel.getMClass("GeneralClass"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.exceptionTypeDep);
    }

    @objid ("72b27836-5ffe-4e26-a243-fd4575f39c05")
    public SmAttribute getGuardAtt() {
        if (this.guardAtt == null) {
        	this.guardAtt = this.getAttributeDef("Guard");
        }
        return this.guardAtt;
    }

    @objid ("5cdc4cb4-7dab-4c19-bdd8-2595c7623155")
    public SmAttribute getWeightAtt() {
        if (this.weightAtt == null) {
        	this.weightAtt = this.getAttributeDef("Weight");
        }
        return this.weightAtt;
    }

    @objid ("c9c5cfd6-19d1-49b8-a88c-55f8ed92b7f7")
    public SmDependency getProtectedNodeDep() {
        if (this.protectedNodeDep == null) {
        	this.protectedNodeDep = this.getDependencyDef("ProtectedNode");
        }
        return this.protectedNodeDep;
    }

    @objid ("eb69187a-c5ed-405a-a024-029229c125d7")
    public SmDependency getExceptionInputDep() {
        if (this.exceptionInputDep == null) {
        	this.exceptionInputDep = this.getDependencyDef("ExceptionInput");
        }
        return this.exceptionInputDep;
    }

    @objid ("196dcb62-c43b-4ed0-a0d0-f688ad2971e8")
    public SmDependency getExceptionTypeDep() {
        if (this.exceptionTypeDep == null) {
        	this.exceptionTypeDep = this.getDependencyDef("ExceptionType");
        }
        return this.exceptionTypeDep;
    }

    @objid ("8c763600-b303-4ddc-84c6-f9747e475f43")
    private static class ExceptionHandlerObjectFactory implements ISmObjectFactory {
        @objid ("ad76a5b7-5475-47de-b541-8508020d03ec")
        private ExceptionHandlerSmClass smClass;

        @objid ("241e2093-2f4d-4c57-ab4c-0ca70435aee7")
        public ExceptionHandlerObjectFactory(ExceptionHandlerSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("50f4c964-98c7-4fe4-a5da-b8cc49e78d2c")
        @Override
        public ISmObjectData createData() {
            return new ExceptionHandlerData(this.smClass);
        }

        @objid ("9323c93c-049f-40c5-a0bd-58716ba2a379")
        @Override
        public SmObjectImpl createImpl() {
            return new ExceptionHandlerImpl();
        }

    }

    @objid ("6248b61b-6b60-479c-b4a5-feadd8f41885")
    public static class GuardSmAttribute extends SmAttribute {
        @objid ("2f93b63b-309e-484d-af90-612618f45b70")
        public Object getValue(ISmObjectData data) {
            return ((ExceptionHandlerData) data).mGuard;
        }

        @objid ("0e3336b0-e3b6-4d90-8306-f5c726cf142c")
        public void setValue(ISmObjectData data, Object value) {
            ((ExceptionHandlerData) data).mGuard = value;
        }

    }

    @objid ("81607117-cdc1-454a-8116-81cdb3a636d9")
    public static class WeightSmAttribute extends SmAttribute {
        @objid ("eda1880d-062a-4938-8c2c-2fc691bd2068")
        public Object getValue(ISmObjectData data) {
            return ((ExceptionHandlerData) data).mWeight;
        }

        @objid ("b3e0c21f-209c-47c1-b475-3b06be32318a")
        public void setValue(ISmObjectData data, Object value) {
            ((ExceptionHandlerData) data).mWeight = value;
        }

    }

    @objid ("a263c6fe-1130-4bd1-966a-5e59f4629959")
    public static class ProtectedNodeSmDependency extends SmSingleDependency {
        @objid ("8f2ed94c-e24f-45b2-9b7f-29f0694d89b1")
        private SmDependency symetricDep;

        @objid ("624337fc-b8b3-41da-aec8-c830c8131bc6")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExceptionHandlerData) data).mProtectedNode;
        }

        @objid ("67046940-acc4-4079-b792-268784582870")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExceptionHandlerData) data).mProtectedNode = value;
        }

        @objid ("2b2ee958-f26a-43eb-9f79-8a423dc88b44")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityActionSmClass)this.getTarget()).getHandlerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1ed1435d-2d11-40ad-8ec2-6e69968d2d7b")
    public static class ExceptionInputSmDependency extends SmSingleDependency {
        @objid ("4a720413-0cd4-4a64-91d0-27dc55c641b1")
        private SmDependency symetricDep;

        @objid ("bac525c9-9d26-4989-b4c8-1fa3aec7203a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExceptionHandlerData) data).mExceptionInput;
        }

        @objid ("7b34a93a-3c3c-4254-8aa2-b5f907d61eb7")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExceptionHandlerData) data).mExceptionInput = value;
        }

        @objid ("fa4da355-672b-4f52-8a0b-c7bc1e187011")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InputPinSmClass)this.getTarget()).getHandlerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("771d3c59-94bd-40e7-b0e3-2d3d08d0f20b")
    public static class ExceptionTypeSmDependency extends SmMultipleDependency {
        @objid ("7796cde8-bacf-424a-8581-d34a8f65dadf")
        private SmDependency symetricDep;

        @objid ("7104db3f-51c3-4e62-95f3-61bfb6cc77d5")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ExceptionHandlerData)data).mExceptionType != null)? ((ExceptionHandlerData)data).mExceptionType:SmMultipleDependency.EMPTY;
        }

        @objid ("ebd1bc03-6bc5-4e96-b46c-467f2b700966")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ExceptionHandlerData) data).mExceptionType = values;
        }

        @objid ("0fdf63bc-8f1a-4f2b-b69c-02099645a202")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GeneralClassSmClass)this.getTarget()).getExceptionInputDep();
            }
            return this.symetricDep;
        }

    }

}
