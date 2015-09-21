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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.CentralBufferNode;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("c1b2286d-e337-4b9b-b057-6319bed82980")
public class CentralBufferNodeSmClass extends ObjectNodeSmClass {
    @objid ("ebf056c7-9fa5-4e0b-8bf1-b55971b12085")
    public CentralBufferNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("493cc1df-283c-4260-bb22-a44454e5bc15")
    @Override
    public String getName() {
        return "CentralBufferNode";
    }

    @objid ("b10d31d9-baa0-4051-865a-71d10e956a87")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("dbf61dec-abc4-498a-861c-8c0ac030de04")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return CentralBufferNode.class;
    }

    @objid ("535690c9-9075-455d-9ca8-67ba3607a694")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("364c7005-ea7f-4826-9048-78ec33945314")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("34c528a5-fa2b-47ce-89c8-068655550fc1")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ObjectNode");
        this.registerFactory(new CentralBufferNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("c5f48300-5c91-453a-858d-6cb6341f5d9a")
    private static class CentralBufferNodeObjectFactory implements ISmObjectFactory {
        @objid ("64f494fe-9910-4ac1-8057-23bf533f806f")
        private CentralBufferNodeSmClass smClass;

        @objid ("6daab117-032c-4da8-8989-977f05bd9aec")
        public CentralBufferNodeObjectFactory(CentralBufferNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("7dc6e7fe-536a-49f9-8c67-ba0af3c5d427")
        @Override
        public ISmObjectData createData() {
            return new CentralBufferNodeData(this.smClass);
        }

        @objid ("1a77bf41-da56-4881-9176-7a1cdbab274b")
        @Override
        public SmObjectImpl createImpl() {
            return new CentralBufferNodeImpl();
        }

    }

}
