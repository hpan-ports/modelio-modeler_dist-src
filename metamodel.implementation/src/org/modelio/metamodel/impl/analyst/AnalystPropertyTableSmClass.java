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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.impl.analyst.AnalystItemSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.TypedPropertyTableSmClass;
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

@objid ("c0e6209f-a8b0-400a-ac65-8614ff66afce")
public class AnalystPropertyTableSmClass extends TypedPropertyTableSmClass {
    @objid ("a9ff30c5-dc24-40e4-9b88-fb25348d66ca")
    private SmDependency analystOwnerDep;

    @objid ("822d6d13-9b6f-4a36-a35b-eec7e657777a")
    public AnalystPropertyTableSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("e0f5d88d-5232-44ac-939c-e3151e13bb90")
    @Override
    public String getName() {
        return "AnalystPropertyTable";
    }

    @objid ("caf4cadb-9074-4570-adbd-7afc386934fb")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d570e5a3-34ce-4db4-9b72-275ce4103897")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return AnalystPropertyTable.class;
    }

    @objid ("12f253a6-1feb-4823-9373-7610fe506a91")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("5b16dea1-f634-42dc-8d62-b72e56f0e72f")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("ebed9224-bd0d-4bb0-9ff5-6d536866115d")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("TypedPropertyTable");
        this.registerFactory(new AnalystPropertyTableObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.analystOwnerDep = new AnalystOwnerSmDependency();
        this.analystOwnerDep.init("AnalystOwner", this, metamodel.getMClass("AnalystItem"), 0, 1 );
        registerDependency(this.analystOwnerDep);
    }

    @objid ("4655e848-5459-4776-9e71-91361f8ede1b")
    public SmDependency getAnalystOwnerDep() {
        if (this.analystOwnerDep == null) {
        	this.analystOwnerDep = this.getDependencyDef("AnalystOwner");
        }
        return this.analystOwnerDep;
    }

    @objid ("0f58eea6-fb36-4e1d-a339-a5d273652f90")
    private static class AnalystPropertyTableObjectFactory implements ISmObjectFactory {
        @objid ("42931e62-cb90-40d2-a64f-4fd9bb81eb10")
        private AnalystPropertyTableSmClass smClass;

        @objid ("50592e14-6801-4c00-ab2f-d853186a2f79")
        public AnalystPropertyTableObjectFactory(AnalystPropertyTableSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("1ef8bf24-4673-4464-a877-6a3b348da838")
        @Override
        public ISmObjectData createData() {
            return new AnalystPropertyTableData(this.smClass);
        }

        @objid ("96f568d4-7b31-4d24-afae-1707c266a359")
        @Override
        public SmObjectImpl createImpl() {
            return new AnalystPropertyTableImpl();
        }

    }

    @objid ("9bca7c62-87ff-4384-b0a4-0930e7e4f78b")
    public static class AnalystOwnerSmDependency extends SmSingleDependency {
        @objid ("67677fd2-b1b4-4808-bbcc-2cd696a41415")
        private SmDependency symetricDep;

        @objid ("40fffc59-203f-4536-89f2-49f70511b785")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AnalystPropertyTableData) data).mAnalystOwner;
        }

        @objid ("eb1bc27a-e3ca-4a6a-972e-7e5c5477654d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AnalystPropertyTableData) data).mAnalystOwner = value;
        }

        @objid ("c08e3dca-29ba-4a33-abf5-74986de81ac9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AnalystItemSmClass)this.getTarget()).getAnalystPropertiesDep();
            }
            return this.symetricDep;
        }

    }

}
