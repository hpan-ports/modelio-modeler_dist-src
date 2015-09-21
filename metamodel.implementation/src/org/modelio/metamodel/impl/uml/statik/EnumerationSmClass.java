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
import org.modelio.metamodel.impl.mda.ModuleParameterSmClass;
import org.modelio.metamodel.impl.uml.statik.EnumerationLiteralSmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
import org.modelio.metamodel.uml.statik.Enumeration;
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

@objid ("49bcd7f8-1b5e-4962-82fc-c54ac6966058")
public class EnumerationSmClass extends GeneralClassSmClass {
    @objid ("f1e4c857-429a-4841-bed0-72ecdb43b66c")
    private SmDependency valueDep;

    @objid ("99f49e10-d512-4ccd-aff4-f18ec5a2ca00")
    private SmDependency occurenceConfigParamDep;

    @objid ("33a63262-a613-4eeb-bcc1-c19fe253494b")
    public EnumerationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("14ba0478-62b7-4d91-af98-6c128a0e542e")
    @Override
    public String getName() {
        return "Enumeration";
    }

    @objid ("2dcb6483-4863-4f6e-b4b0-24d7f6d9d70a")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d52baf53-1485-4c22-a54f-7259ef3434c6")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Enumeration.class;
    }

    @objid ("28c4ef2a-7363-4f72-9bb5-f4c3dfaf6a47")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("ad52ecbb-6f57-4b21-bcad-cbfebe02f0f2")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("6ff4677e-cb2f-4bd3-839f-fa9af8388b89")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("GeneralClass");
        this.registerFactory(new EnumerationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.valueDep = new ValueSmDependency();
        this.valueDep.init("Value", this, metamodel.getMClass("EnumerationLiteral"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.valueDep);
        
        this.occurenceConfigParamDep = new OccurenceConfigParamSmDependency();
        this.occurenceConfigParamDep.init("OccurenceConfigParam", this, metamodel.getMClass("ModuleParameter"), 0, -1 , SmDirective.SMCDDYNAMIC);
        registerDependency(this.occurenceConfigParamDep);
    }

    @objid ("f178f7ee-d773-40cb-befd-7aae97754d46")
    public SmDependency getValueDep() {
        if (this.valueDep == null) {
        	this.valueDep = this.getDependencyDef("Value");
        }
        return this.valueDep;
    }

    @objid ("3f728258-1c31-4edd-ac83-8f544c6857ca")
    public SmDependency getOccurenceConfigParamDep() {
        if (this.occurenceConfigParamDep == null) {
        	this.occurenceConfigParamDep = this.getDependencyDef("OccurenceConfigParam");
        }
        return this.occurenceConfigParamDep;
    }

    @objid ("a213aa22-0a9d-4122-823d-c6b4ea30d5ac")
    private static class EnumerationObjectFactory implements ISmObjectFactory {
        @objid ("4f1abcaa-d1ea-4230-86bf-df3c2988eddc")
        private EnumerationSmClass smClass;

        @objid ("8c6469ff-bfea-498c-9678-60a45e886d29")
        public EnumerationObjectFactory(EnumerationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("205c41df-464c-472e-9f0f-7dfc5e787622")
        @Override
        public ISmObjectData createData() {
            return new EnumerationData(this.smClass);
        }

        @objid ("023147f0-2e8f-4a0a-b214-9b48ab2c8271")
        @Override
        public SmObjectImpl createImpl() {
            return new EnumerationImpl();
        }

    }

    @objid ("1156c1fa-e8ac-4cca-bd4d-cfd0765c7da9")
    public static class ValueSmDependency extends SmMultipleDependency {
        @objid ("8a69c12b-7958-4420-9d3b-142690d48c6d")
        private SmDependency symetricDep;

        @objid ("4cb5bdc3-07e1-420e-8fdd-1842760b98a7")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((EnumerationData)data).mValue != null)? ((EnumerationData)data).mValue:SmMultipleDependency.EMPTY;
        }

        @objid ("c686c83f-a94b-4176-9377-ac7ca39938a8")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((EnumerationData) data).mValue = values;
        }

        @objid ("68518061-8110-4ca1-9bbb-d98bf44f1fec")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((EnumerationLiteralSmClass)this.getTarget()).getValuatedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("aa0d5bcb-17fb-4628-b8a2-340cf97f303e")
    public static class OccurenceConfigParamSmDependency extends SmMultipleDependency {
        @objid ("ad67a7f6-4a0b-4b37-9805-288ebb4cbbdb")
        private SmDependency symetricDep;

        @objid ("475e3832-71b2-4ec5-9e26-d41408eddb5b")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((EnumerationData)data).mOccurenceConfigParam != null)? ((EnumerationData)data).mOccurenceConfigParam:SmMultipleDependency.EMPTY;
        }

        @objid ("b473cc3e-8fde-4e15-90ed-c2149b6b42d7")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((EnumerationData) data).mOccurenceConfigParam = values;
        }

        @objid ("a4d37414-a604-4087-bc38-a1603619d453")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModuleParameterSmClass)this.getTarget()).getEnumTypeDep();
            }
            return this.symetricDep;
        }

    }

}
