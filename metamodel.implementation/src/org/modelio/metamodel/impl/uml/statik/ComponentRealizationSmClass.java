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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.impl.uml.statik.ComponentSmClass;
import org.modelio.metamodel.uml.statik.ComponentRealization;
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

@objid ("e45e84a7-0dba-4cfb-b997-5a197cb308e9")
public class ComponentRealizationSmClass extends ModelElementSmClass {
    @objid ("e7a577b2-d859-4123-83a7-5f55721b5a5a")
    private SmDependency realizingClassifierDep;

    @objid ("327980aa-dc73-47d0-abd2-8424c099d9ad")
    private SmDependency abstractionDep;

    @objid ("d4ae1499-5c03-4c79-acce-35555b3e18b9")
    public ComponentRealizationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f2dc7688-5eca-473a-8c33-cf7050f33ac7")
    @Override
    public String getName() {
        return "ComponentRealization";
    }

    @objid ("3d495b35-1b8e-4745-99d3-63dd009d22a4")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("ed6aad7b-1ba6-41c3-88a5-72f1a081df53")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ComponentRealization.class;
    }

    @objid ("5437823a-5942-4733-a596-8071ef4c4e94")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("75f97e71-f827-4632-a233-5240781b4a74")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("69ff6782-cfec-4a9d-b3df-3a71bd0b31f2")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ComponentRealizationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.realizingClassifierDep = new RealizingClassifierSmDependency();
        this.realizingClassifierDep.init("RealizingClassifier", this, metamodel.getMClass("Classifier"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.realizingClassifierDep);
        
        this.abstractionDep = new AbstractionSmDependency();
        this.abstractionDep.init("Abstraction", this, metamodel.getMClass("Component"), 1, 1 );
        registerDependency(this.abstractionDep);
    }

    @objid ("08e870a4-41db-4be6-a083-af0431cdff69")
    public SmDependency getRealizingClassifierDep() {
        if (this.realizingClassifierDep == null) {
        	this.realizingClassifierDep = this.getDependencyDef("RealizingClassifier");
        }
        return this.realizingClassifierDep;
    }

    @objid ("e9eaa7ed-458f-4920-ad45-3dcea9950a78")
    public SmDependency getAbstractionDep() {
        if (this.abstractionDep == null) {
        	this.abstractionDep = this.getDependencyDef("Abstraction");
        }
        return this.abstractionDep;
    }

    @objid ("9d1a9760-c174-49ad-9ade-bf3367a51326")
    private static class ComponentRealizationObjectFactory implements ISmObjectFactory {
        @objid ("90d24b50-d488-4b84-9c27-362c758e82d3")
        private ComponentRealizationSmClass smClass;

        @objid ("5fbb7449-82fe-4d24-904a-a7285fde455a")
        public ComponentRealizationObjectFactory(ComponentRealizationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("5709f4af-f6eb-4d55-a7ce-5a4dcf6bf846")
        @Override
        public ISmObjectData createData() {
            return new ComponentRealizationData(this.smClass);
        }

        @objid ("b89415b4-24e1-4028-aaea-7b8530d41e6a")
        @Override
        public SmObjectImpl createImpl() {
            return new ComponentRealizationImpl();
        }

    }

    @objid ("4ca8f2df-b5e8-4ed1-9c70-eff632c670a1")
    public static class RealizingClassifierSmDependency extends SmSingleDependency {
        @objid ("2181ffe6-7da7-4da3-a5ae-89108851ae7b")
        private SmDependency symetricDep;

        @objid ("f6710211-5272-405c-8c2c-e4bd738362e3")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ComponentRealizationData) data).mRealizingClassifier;
        }

        @objid ("9f5f20eb-6a7e-424a-aeaf-aeed92103aa0")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ComponentRealizationData) data).mRealizingClassifier = value;
        }

        @objid ("2445fcfa-25f6-4810-a1db-217764101fa9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassifierSmClass)this.getTarget()).getRealizedComponentDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("71e1d244-2058-4d4d-9893-a3e48629b2e2")
    public static class AbstractionSmDependency extends SmSingleDependency {
        @objid ("8919302d-43d7-4640-ba40-c4375783a5c5")
        private SmDependency symetricDep;

        @objid ("2f2bffbf-5df9-486a-b53b-963651d2306b")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ComponentRealizationData) data).mAbstraction;
        }

        @objid ("9db9c601-b12f-43ac-a8ee-8a29e3ecfefe")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ComponentRealizationData) data).mAbstraction = value;
        }

        @objid ("c63055c6-7ce1-4a86-b080-cb00a4102a2b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ComponentSmClass)this.getTarget()).getRealizationDep();
            }
            return this.symetricDep;
        }

    }

}
