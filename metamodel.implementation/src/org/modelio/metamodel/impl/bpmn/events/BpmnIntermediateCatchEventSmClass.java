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
import org.modelio.metamodel.bpmn.events.BpmnIntermediateCatchEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnCatchEventSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("98fae2f8-e4cc-4296-8be0-a8346788e6bd")
public class BpmnIntermediateCatchEventSmClass extends BpmnCatchEventSmClass {
    @objid ("e6152e1f-2233-4fb7-a277-f3d17135c7ab")
    public BpmnIntermediateCatchEventSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("6dd84427-7001-4a50-8023-621a2f3e75aa")
    @Override
    public String getName() {
        return "BpmnIntermediateCatchEvent";
    }

    @objid ("b27ed3bd-02dc-4fa4-8d81-a01b01f31704")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("7ad8d558-55bc-43d2-942d-aaff4c06a138")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnIntermediateCatchEvent.class;
    }

    @objid ("99db04a3-3048-4d51-91df-129535e8d3a5")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("f34f33d7-faad-4708-af5f-b0c741375dbf")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("2f081c75-b3f1-422e-a356-a5fa644c1445")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnCatchEvent");
        this.registerFactory(new BpmnIntermediateCatchEventObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("6ca6ce5d-df3b-4027-8174-a6ab5498fa29")
    private static class BpmnIntermediateCatchEventObjectFactory implements ISmObjectFactory {
        @objid ("f26e1832-0044-439e-a4fb-5687b31956e0")
        private BpmnIntermediateCatchEventSmClass smClass;

        @objid ("7ade4ee0-a368-427c-a3a1-d34e8db3d64d")
        public BpmnIntermediateCatchEventObjectFactory(BpmnIntermediateCatchEventSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("74d5c4d6-8ce1-4c96-b43f-516bf8d0cd0d")
        @Override
        public ISmObjectData createData() {
            return new BpmnIntermediateCatchEventData(this.smClass);
        }

        @objid ("c9280d23-abbf-458a-8dd3-95a3fe19c84d")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnIntermediateCatchEventImpl();
        }

    }

}
