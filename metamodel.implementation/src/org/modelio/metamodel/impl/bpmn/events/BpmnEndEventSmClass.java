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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnEndEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnThrowEventSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("26197e71-813e-4e29-85ae-553ffa4bcfed")
public class BpmnEndEventSmClass extends BpmnThrowEventSmClass {
    @objid ("33da6d28-360c-4cf9-8465-c68b31b6ae01")
    public BpmnEndEventSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("1f9ecbc7-de4d-4860-abc8-8d8786bd3b47")
    @Override
    public String getName() {
        return "BpmnEndEvent";
    }

    @objid ("790f7aa0-98d1-4a9f-abd0-3a9ba49ee77c")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("80ce51d1-6444-424a-be59-3aa539e91705")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnEndEvent.class;
    }

    @objid ("f1bc42c7-0e22-4093-89f1-4a5a888663be")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("9cf5a537-59db-4aa6-8670-d14b55d38a6d")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("990d602e-6c04-4797-87b4-38bd0795216a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnThrowEvent");
        this.registerFactory(new BpmnEndEventObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("6a382f9e-5062-4c01-9fc5-f26f26be6d2e")
    private static class BpmnEndEventObjectFactory implements ISmObjectFactory {
        @objid ("bfcfcc4a-4939-4487-bb05-8c45966aa4af")
        private BpmnEndEventSmClass smClass;

        @objid ("a0f8cbd6-28c1-4edf-8f65-d82c12ba8521")
        public BpmnEndEventObjectFactory(BpmnEndEventSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("c88a1ba8-6b96-4dd9-bf93-0e5b4b2d7240")
        @Override
        public ISmObjectData createData() {
            return new BpmnEndEventData(this.smClass);
        }

        @objid ("0b42013d-768f-4d9c-919d-5e4a0a4cd679")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnEndEventImpl();
        }

    }

}
