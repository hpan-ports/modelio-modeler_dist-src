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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnBusinessRuleTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnTaskSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("987f97c3-033b-4989-bec3-cb6d8b249f62")
public class BpmnBusinessRuleTaskSmClass extends BpmnTaskSmClass {
    @objid ("b9f652cd-76a5-4d11-820d-9b4ebe691da2")
    public BpmnBusinessRuleTaskSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("62cddded-8f52-4040-a2ce-60704312ea1e")
    @Override
    public String getName() {
        return "BpmnBusinessRuleTask";
    }

    @objid ("79c73842-2e63-429f-8d2e-a0445818f516")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d2c05e05-28b9-462b-ba76-a6711a71a8a9")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnBusinessRuleTask.class;
    }

    @objid ("bef69bd8-5931-4a18-b6f2-49b38f092242")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("177b3e90-4f39-46b7-b112-7fc6bba575bc")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("33bb4d2b-c058-4415-8089-d94d86ada6c3")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnTask");
        this.registerFactory(new BpmnBusinessRuleTaskObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("a702bc27-a1de-4dbe-806a-0a2f0712b98c")
    private static class BpmnBusinessRuleTaskObjectFactory implements ISmObjectFactory {
        @objid ("df180771-7426-464c-8503-289e05a23a09")
        private BpmnBusinessRuleTaskSmClass smClass;

        @objid ("aaf0c9ce-c31f-44b9-bbb6-8a4d3376effb")
        public BpmnBusinessRuleTaskObjectFactory(BpmnBusinessRuleTaskSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("dc939ae1-4651-4e48-872c-2552f7456a64")
        @Override
        public ISmObjectData createData() {
            return new BpmnBusinessRuleTaskData(this.smClass);
        }

        @objid ("552fed4e-00dd-4766-a2db-533c95d197e7")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnBusinessRuleTaskImpl();
        }

    }

}
