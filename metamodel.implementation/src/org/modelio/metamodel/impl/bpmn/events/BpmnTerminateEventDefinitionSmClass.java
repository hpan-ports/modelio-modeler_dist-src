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
import org.modelio.metamodel.bpmn.events.BpmnTerminateEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventDefinitionSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("ead508d0-cc97-4e68-9a32-c338b88fa836")
public class BpmnTerminateEventDefinitionSmClass extends BpmnEventDefinitionSmClass {
    @objid ("e9a91c62-8e36-450f-8ed2-96242a5b4098")
    public BpmnTerminateEventDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("9fb28e3c-fd54-438b-9502-7f21d448b19b")
    @Override
    public String getName() {
        return "BpmnTerminateEventDefinition";
    }

    @objid ("5aeee7cb-6f98-41d8-b5d3-dcdc40a5c011")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("566da84d-8994-4179-a644-3ac3122a4cb9")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnTerminateEventDefinition.class;
    }

    @objid ("1d8f5309-9615-40d6-b5cf-4072e2a621da")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("9cc40fe0-2615-4119-b6e2-e74bf827f11d")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("c75bb15d-6363-4cfc-868b-211cca414018")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnEventDefinition");
        this.registerFactory(new BpmnTerminateEventDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("10d1d53e-cd9c-4701-baad-b40314ad9f14")
    private static class BpmnTerminateEventDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("f2c2bced-0d64-4cd2-92d3-3ab56f85845e")
        private BpmnTerminateEventDefinitionSmClass smClass;

        @objid ("f3ec1b5b-168b-4531-8bfe-987bfd95279a")
        public BpmnTerminateEventDefinitionObjectFactory(BpmnTerminateEventDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("ede10392-5dd0-47e1-9f47-578b19241248")
        @Override
        public ISmObjectData createData() {
            return new BpmnTerminateEventDefinitionData(this.smClass);
        }

        @objid ("93cbd128-5b37-4744-a66d-645db392b2ac")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnTerminateEventDefinitionImpl();
        }

    }

}
