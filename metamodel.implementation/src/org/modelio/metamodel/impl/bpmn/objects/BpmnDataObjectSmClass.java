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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataObject;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("94f227aa-d368-490d-bc78-674fbc48e2a9")
public class BpmnDataObjectSmClass extends BpmnItemAwareElementSmClass {
    @objid ("87b8cef2-f543-40d3-88f4-e6d290a815b9")
    public BpmnDataObjectSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f6a0d8c4-0524-4816-860e-d5c7b5db1b5c")
    @Override
    public String getName() {
        return "BpmnDataObject";
    }

    @objid ("190d4bb0-b44c-461a-97e0-8c0f0c116b96")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("66ae4b34-9ddd-4053-abf6-e525c47ba8f3")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnDataObject.class;
    }

    @objid ("2096f0a0-d240-4c62-bd63-fc9d47fcb93f")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("49232997-c69b-4d90-bbaf-103491cdad14")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("f5d352da-bf7c-4bb2-bedc-fc016ff3d88e")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnItemAwareElement");
        this.registerFactory(new BpmnDataObjectObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("360bdef1-c095-454b-881f-80190856cd24")
    private static class BpmnDataObjectObjectFactory implements ISmObjectFactory {
        @objid ("30298af5-f2e1-4f85-b041-ecf75a22bfa9")
        private BpmnDataObjectSmClass smClass;

        @objid ("c6a2548d-3a1d-4c17-8751-d71f594695a9")
        public BpmnDataObjectObjectFactory(BpmnDataObjectSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("c2e29364-d909-4c36-a809-3dbbeb9dc9ca")
        @Override
        public ISmObjectData createData() {
            return new BpmnDataObjectData(this.smClass);
        }

        @objid ("0f562cc5-982e-4d45-8f89-f32b89365e93")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnDataObjectImpl();
        }

    }

}
