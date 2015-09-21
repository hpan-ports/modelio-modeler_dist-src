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
import org.modelio.metamodel.bpmn.events.BpmnIntermediateThrowEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnThrowEventSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("1cc3ec74-19cc-4a07-b45c-7f1e553dc4da")
public class BpmnIntermediateThrowEventSmClass extends BpmnThrowEventSmClass {
    @objid ("46c41cc3-dff7-4ecc-bf05-5b11a2dfd92a")
    public BpmnIntermediateThrowEventSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("af5ee287-19ac-4ca7-a2d7-20ef188dfd59")
    @Override
    public String getName() {
        return "BpmnIntermediateThrowEvent";
    }

    @objid ("6736255b-85f1-462d-89a8-58f414195ce0")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("fefac1ee-1c33-4a30-a4fb-c7e9f9f3582f")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnIntermediateThrowEvent.class;
    }

    @objid ("13de1153-02a0-4b3b-86aa-c7025499ec33")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("195e09a7-5d67-4193-948d-0c7434dec1c8")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("8111d4de-48fe-4a05-81bb-3ebd7a17fee3")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnThrowEvent");
        this.registerFactory(new BpmnIntermediateThrowEventObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("c63c1927-7114-4a21-a0b6-b5b56acfed8b")
    private static class BpmnIntermediateThrowEventObjectFactory implements ISmObjectFactory {
        @objid ("eb50911e-9238-4df4-9239-d0a6f845a25f")
        private BpmnIntermediateThrowEventSmClass smClass;

        @objid ("8a60f4f4-c7e3-4f09-a888-641f5be8b0ae")
        public BpmnIntermediateThrowEventObjectFactory(BpmnIntermediateThrowEventSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("1ad5df27-efd0-419f-8d27-9cbafe9a7a02")
        @Override
        public ISmObjectData createData() {
            return new BpmnIntermediateThrowEventData(this.smClass);
        }

        @objid ("1cba2064-bc92-464e-aae5-fbb66dacbe44")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnIntermediateThrowEventImpl();
        }

    }

}
