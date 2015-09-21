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
import org.modelio.metamodel.bpmn.events.BpmnCancelEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventDefinitionSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("91036f21-67af-4bbc-b98d-6a3bcdf755fc")
public class BpmnCancelEventDefinitionSmClass extends BpmnEventDefinitionSmClass {
    @objid ("752e3f87-9817-449f-b592-cf8284723854")
    public BpmnCancelEventDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("81b6445f-8ec9-43ab-b4a9-c713942f3498")
    @Override
    public String getName() {
        return "BpmnCancelEventDefinition";
    }

    @objid ("55f63e61-06e2-41f7-b70a-d77e4f8e57ac")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("ebc3d61d-cc38-4bce-97a8-e506d3b64609")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnCancelEventDefinition.class;
    }

    @objid ("566ea5f0-7744-48ea-982e-30291ad713ea")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("f24b5963-15dd-4e2c-b4ee-e3e9982c69c2")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("26faaa02-74fb-42f5-a6b3-1f7b1ea19d47")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnEventDefinition");
        this.registerFactory(new BpmnCancelEventDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("b3e6efd8-aa50-4c7b-8e1e-b61f27056a55")
    private static class BpmnCancelEventDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("a41ee579-889c-433c-b03b-915a9cabebbb")
        private BpmnCancelEventDefinitionSmClass smClass;

        @objid ("cf647f8e-fd5d-4a40-b07b-074cece6e922")
        public BpmnCancelEventDefinitionObjectFactory(BpmnCancelEventDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("b841f0c0-2776-4825-831b-18c2829dccfa")
        @Override
        public ISmObjectData createData() {
            return new BpmnCancelEventDefinitionData(this.smClass);
        }

        @objid ("789110be-b292-4f3c-a174-5b5ce00bc090")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnCancelEventDefinitionImpl();
        }

    }

}
