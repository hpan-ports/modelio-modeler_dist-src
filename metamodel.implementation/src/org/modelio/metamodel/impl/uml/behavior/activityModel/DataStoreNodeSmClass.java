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
import org.modelio.metamodel.impl.uml.behavior.activityModel.CentralBufferNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.DataStoreNode;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("be9410e9-9e10-4db8-b745-4ffd5e050416")
public class DataStoreNodeSmClass extends CentralBufferNodeSmClass {
    @objid ("8057facc-d62e-4197-8402-b32497a517fe")
    public DataStoreNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("872a6e83-be3b-4631-bf09-656bf8a09a4f")
    @Override
    public String getName() {
        return "DataStoreNode";
    }

    @objid ("d3b0773f-e350-48a6-96b9-e9b757944df6")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("eabb2e46-edf6-4577-bf35-75bad9585218")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return DataStoreNode.class;
    }

    @objid ("07d75258-b3f7-4783-9444-4a05da3121f2")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("0fa946c5-812b-4e0a-b63b-3c9a470ced76")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("335b9912-8e09-44d6-90de-309bdea88cf3")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("CentralBufferNode");
        this.registerFactory(new DataStoreNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("0e207baa-0c16-4d88-86f5-7ee2027f84e3")
    private static class DataStoreNodeObjectFactory implements ISmObjectFactory {
        @objid ("835aac4e-b0e1-493e-848a-c54ce78ce872")
        private DataStoreNodeSmClass smClass;

        @objid ("2e650427-5e3a-4c3f-bfe4-c8f7e278c364")
        public DataStoreNodeObjectFactory(DataStoreNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("e91529f0-d64d-4931-ad48-c001d2b50633")
        @Override
        public ISmObjectData createData() {
            return new DataStoreNodeData(this.smClass);
        }

        @objid ("112247e4-6bdb-407d-a2b6-d34251456d45")
        @Override
        public SmObjectImpl createImpl() {
            return new DataStoreNodeImpl();
        }

    }

}
