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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.DependencySmClass;
import org.modelio.metamodel.uml.infrastructure.Usage;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("902edc6d-6529-4c52-936a-32642a134d20")
public class UsageSmClass extends DependencySmClass {
    @objid ("b13b6c78-31a0-4766-8c46-2e4a9869f565")
    public UsageSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("495753a4-07bb-4f8f-84bb-3a86305773f1")
    @Override
    public String getName() {
        return "Usage";
    }

    @objid ("1b796b74-f0dc-43ed-b880-00f18f5ecb57")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("bd234983-8c02-4856-b6ff-5ebacbfa831d")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Usage.class;
    }

    @objid ("ead873e2-1f32-4a89-a721-6422e2b0047c")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("552139f6-3429-4747-83ca-a8e02bb2bb5f")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("9bb85c5a-5598-46b4-ae65-e71ad93cefcb")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Dependency");
        this.registerFactory(new UsageObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("a2802a9d-6cd5-40b2-9b0d-f18cdb36a299")
    private static class UsageObjectFactory implements ISmObjectFactory {
        @objid ("78edcfb2-6c9b-4f58-95d9-7600bbf3d40f")
        private UsageSmClass smClass;

        @objid ("8bc373e0-0a60-4e87-87cf-1b80d6e149c7")
        public UsageObjectFactory(UsageSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("3dc96049-7aa6-4f5b-a71d-d07ece0f7d88")
        @Override
        public ISmObjectData createData() {
            return new UsageData(this.smClass);
        }

        @objid ("7d697d99-c908-4508-9af1-4e278d82e440")
        @Override
        public SmObjectImpl createImpl() {
            return new UsageImpl();
        }

    }

}
