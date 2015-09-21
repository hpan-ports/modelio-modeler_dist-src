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
import org.modelio.metamodel.bpmn.events.BpmnSignalEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventDefinitionSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("b0b2b22d-8502-406a-abb3-042ce2c07a78")
public class BpmnSignalEventDefinitionSmClass extends BpmnEventDefinitionSmClass {
    @objid ("451a93d1-3ad9-4186-a389-f7901e51476a")
    public BpmnSignalEventDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("3ccf8c4b-b9c7-4441-8af6-2c7592840335")
    @Override
    public String getName() {
        return "BpmnSignalEventDefinition";
    }

    @objid ("a22227f0-192d-4d7a-96a3-4f161c4fca58")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("380e115e-961e-4a57-88a5-792e62fccdf5")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnSignalEventDefinition.class;
    }

    @objid ("f023d679-53cc-4d78-b201-4c36c7c88344")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("3c19c361-ae05-45d3-9e8e-e01f1140e311")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("248d7ea7-c8eb-4fbc-ab1e-4b6809ad40af")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnEventDefinition");
        this.registerFactory(new BpmnSignalEventDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("42feae2e-ada0-4cf3-b965-fa48086742a0")
    private static class BpmnSignalEventDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("f03248ab-fcd7-471b-a2e8-fbd983d4ef50")
        private BpmnSignalEventDefinitionSmClass smClass;

        @objid ("a397e227-f946-4616-85ca-69f5c8571b27")
        public BpmnSignalEventDefinitionObjectFactory(BpmnSignalEventDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("888406d9-3d22-4e2d-b016-c0d799bbe839")
        @Override
        public ISmObjectData createData() {
            return new BpmnSignalEventDefinitionData(this.smClass);
        }

        @objid ("7442fcdc-5212-4963-8a94-bb984d0962e4")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnSignalEventDefinitionImpl();
        }

    }

}
