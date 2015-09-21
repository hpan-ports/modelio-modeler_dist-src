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
package org.modelio.metamodel.impl.uml.informationFlow;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
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

@objid ("1314c071-1b9e-4f70-9275-ed8a40148625")
public class InformationItemSmClass extends ClassifierSmClass {
    @objid ("f4113de4-96f8-41e2-a289-f0a241944cd3")
    private SmDependency representedDep;

    @objid ("b71a2e29-d214-4b1c-90a1-9bf6d8e41ae8")
    public InformationItemSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("6725defd-0cd2-4466-b316-0887981abbc9")
    @Override
    public String getName() {
        return "InformationItem";
    }

    @objid ("1475652e-b708-48c8-ba86-6b9ba4087249")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("2e86eef7-c707-41c2-823e-58340bc94e58")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return InformationItem.class;
    }

    @objid ("bca6198d-d945-4182-895c-6696061be3e6")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("ff7ff1ca-7650-41c9-bd0e-7e2da0b63c81")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("8a8270e6-f1fb-40f9-a095-a9724f57e7b3")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Classifier");
        this.registerFactory(new InformationItemObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.representedDep = new RepresentedSmDependency();
        this.representedDep.init("Represented", this, metamodel.getMClass("Classifier"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedDep);
    }

    @objid ("8ee81e9f-0fc9-4ef2-b207-98c2513a8a39")
    public SmDependency getRepresentedDep() {
        if (this.representedDep == null) {
        	this.representedDep = this.getDependencyDef("Represented");
        }
        return this.representedDep;
    }

    @objid ("dc350d19-94bb-4506-9cce-093b8e89d96d")
    private static class InformationItemObjectFactory implements ISmObjectFactory {
        @objid ("9bdc9add-49ea-45c5-9b73-8d3019a795f3")
        private InformationItemSmClass smClass;

        @objid ("9675df94-147e-4ccc-81a3-5786c7802b64")
        public InformationItemObjectFactory(InformationItemSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("f23c6a79-f0e4-4f7f-8e1a-d47523af4f22")
        @Override
        public ISmObjectData createData() {
            return new InformationItemData(this.smClass);
        }

        @objid ("446dc44e-b844-4fca-9296-c0e6242dfa99")
        @Override
        public SmObjectImpl createImpl() {
            return new InformationItemImpl();
        }

    }

    @objid ("2f937ee0-be74-4764-8bb3-fbe731df9a0a")
    public static class RepresentedSmDependency extends SmMultipleDependency {
        @objid ("de7b2748-c1fd-4a61-ae1f-19cec1f73d18")
        private SmDependency symetricDep;

        @objid ("e071442f-730e-4638-b5e6-f37baa125963")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InformationItemData)data).mRepresented != null)? ((InformationItemData)data).mRepresented:SmMultipleDependency.EMPTY;
        }

        @objid ("e5950ea4-b341-43af-9c64-e24045ff6cf5")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InformationItemData) data).mRepresented = values;
        }

        @objid ("b6ea90b1-851b-4d10-bc63-4cece9774e3d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassifierSmClass)this.getTarget()).getRepresentationDep();
            }
            return this.symetricDep;
        }

    }

}
