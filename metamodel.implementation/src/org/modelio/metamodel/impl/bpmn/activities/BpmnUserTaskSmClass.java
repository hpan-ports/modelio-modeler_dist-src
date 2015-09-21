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
import org.modelio.metamodel.bpmn.activities.BpmnUserTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnTaskSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("cafae0b5-d001-4ebb-8240-c405612f41d7")
public class BpmnUserTaskSmClass extends BpmnTaskSmClass {
    @objid ("46481e49-f27d-462c-8066-37be0c664e45")
    private SmAttribute implementationAtt;

    @objid ("2358b93f-5f8a-4c58-b607-80280146d08f")
    public BpmnUserTaskSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("55848b87-baf4-4fda-af17-74a006741781")
    @Override
    public String getName() {
        return "BpmnUserTask";
    }

    @objid ("ba776e94-76fa-438a-aef5-9bd1889fe672")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("31fc41f5-cb20-4da0-9ad1-d8c73381a9d7")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnUserTask.class;
    }

    @objid ("20edae1b-7fff-4f6b-8ada-2298c3056a2d")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("540750d0-1f61-4679-93fe-ddecd9075082")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("7021456c-7e44-43ad-b218-6dc83fa34a49")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnTask");
        this.registerFactory(new BpmnUserTaskObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.implementationAtt = new ImplementationSmAttribute();
        this.implementationAtt.init("Implementation", this, String.class );
        registerAttribute(this.implementationAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("b6eb5776-9615-43b2-9e4f-b1e0a946fe68")
    public SmAttribute getImplementationAtt() {
        if (this.implementationAtt == null) {
        	this.implementationAtt = this.getAttributeDef("Implementation");
        }
        return this.implementationAtt;
    }

    @objid ("c36bbd01-dad7-43b8-b477-e09b2c75b38e")
    private static class BpmnUserTaskObjectFactory implements ISmObjectFactory {
        @objid ("bf175e36-c21d-417e-958e-96ba3a6f45d7")
        private BpmnUserTaskSmClass smClass;

        @objid ("d650e77f-0ba3-408f-8e62-8e59dbc51601")
        public BpmnUserTaskObjectFactory(BpmnUserTaskSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("8979aa24-397b-4159-9630-7306562f2b77")
        @Override
        public ISmObjectData createData() {
            return new BpmnUserTaskData(this.smClass);
        }

        @objid ("55534516-ee28-466f-86c4-325c1ee857a0")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnUserTaskImpl();
        }

    }

    @objid ("71f82da5-c7c0-48a6-b0bd-2b1f622cecdd")
    public static class ImplementationSmAttribute extends SmAttribute {
        @objid ("5699b6fb-1082-4870-92e8-aa2bdeb74011")
        public Object getValue(ISmObjectData data) {
            return ((BpmnUserTaskData) data).mImplementation;
        }

        @objid ("7ea78936-c531-4d21-bc35-7051d22e8915")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnUserTaskData) data).mImplementation = value;
        }

    }

}
