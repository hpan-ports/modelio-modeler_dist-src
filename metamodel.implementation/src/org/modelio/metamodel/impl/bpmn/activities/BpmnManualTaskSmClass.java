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
import org.modelio.metamodel.bpmn.activities.BpmnManualTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnTaskSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("46a6f085-4ff9-4de6-a623-b74277c418be")
public class BpmnManualTaskSmClass extends BpmnTaskSmClass {
    @objid ("cc42785f-ec11-44ba-b7c2-3e2fb32334cf")
    public BpmnManualTaskSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("c192a521-0a83-4b7f-af29-ef2e7dad105e")
    @Override
    public String getName() {
        return "BpmnManualTask";
    }

    @objid ("2d666c7e-f6fc-4633-a296-65aab54d7efd")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("63cdcb68-0d56-4972-ac62-cf261ae60222")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnManualTask.class;
    }

    @objid ("22544fa6-d9a7-43ea-b075-864693c9fef3")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("cc20a573-2831-47a8-8b6a-b2b82bc1f40d")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("20bc0765-61a9-420a-8ecf-c27fcd2964ff")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnTask");
        this.registerFactory(new BpmnManualTaskObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("5170ad50-46d2-441e-9416-72f269aa72e0")
    private static class BpmnManualTaskObjectFactory implements ISmObjectFactory {
        @objid ("19bef278-231a-4b77-90a7-d12d0f8a2cb5")
        private BpmnManualTaskSmClass smClass;

        @objid ("81200e85-c980-46b9-a803-4f6e77ffd85c")
        public BpmnManualTaskObjectFactory(BpmnManualTaskSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("229e8787-a763-407c-915c-82e10731b8dc")
        @Override
        public ISmObjectData createData() {
            return new BpmnManualTaskData(this.smClass);
        }

        @objid ("2c01b680-41cb-45a7-8fab-d1a61f44c488")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnManualTaskImpl();
        }

    }

}
