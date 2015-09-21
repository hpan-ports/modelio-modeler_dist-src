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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ControlNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.InitialNode;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("094a69f0-ca69-4bf2-a30b-3e7a335c2488")
public class InitialNodeSmClass extends ControlNodeSmClass {
    @objid ("5bb69d51-9c59-44da-9eef-a5c7c6077c77")
    public InitialNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("093ea848-0f34-4aa4-8137-f47723dd403e")
    @Override
    public String getName() {
        return "InitialNode";
    }

    @objid ("8664fda3-5482-4299-8b26-2dd36158f2f4")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("8b800b22-2678-4312-935f-4cbe28e73e3d")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return InitialNode.class;
    }

    @objid ("40f93c23-5e42-4e73-aeb2-c75328cbe0cd")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("1cf98936-2977-4d88-ab49-3573c34f311e")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("609d8883-c86a-4adf-823b-e9d8fad05227")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ControlNode");
        this.registerFactory(new InitialNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("abe691a2-757f-454d-a48c-a487d0f69716")
    private static class InitialNodeObjectFactory implements ISmObjectFactory {
        @objid ("67e772c5-061f-466e-ad6e-07350f4ec74e")
        private InitialNodeSmClass smClass;

        @objid ("44248d6c-1c33-43a3-926e-9345cf2facc7")
        public InitialNodeObjectFactory(InitialNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("bfc68100-8d7a-41ea-adc7-b2102c5c194c")
        @Override
        public ISmObjectData createData() {
            return new InitialNodeData(this.smClass);
        }

        @objid ("1d0c8a5f-10d7-4d10-88f1-5a3741da620d")
        @Override
        public SmObjectImpl createImpl() {
            return new InitialNodeImpl();
        }

    }

}
