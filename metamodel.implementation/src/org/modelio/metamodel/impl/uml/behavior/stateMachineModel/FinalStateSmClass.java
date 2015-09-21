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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateSmClass;
import org.modelio.metamodel.uml.behavior.stateMachineModel.FinalState;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("33cd240c-7179-433e-8497-c01cf1563bf1")
public class FinalStateSmClass extends StateSmClass {
    @objid ("bbac8607-4056-4196-a400-ac1679115298")
    public FinalStateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("99b95cfb-9e06-46ed-a186-1c15d20412c8")
    @Override
    public String getName() {
        return "FinalState";
    }

    @objid ("60d395b6-9db8-4cc1-ba70-f8970833ac81")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("8de53c45-f8a6-4152-9725-9d3d1f7e0194")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return FinalState.class;
    }

    @objid ("4e408d39-58d5-48a6-81bb-823366675f16")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("ba0c4788-a8fe-4166-922f-f392ff2a5ead")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("0436331a-fa83-4e79-9d93-d58e1aba4b14")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("State");
        this.registerFactory(new FinalStateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("07252f0e-0505-4dcb-b6c1-858e3cabf924")
    private static class FinalStateObjectFactory implements ISmObjectFactory {
        @objid ("75d3d8cb-3ac0-4b1b-b3e0-0f43eaa7e5dc")
        private FinalStateSmClass smClass;

        @objid ("1ebfd22b-ed8f-4371-988a-74e43745514b")
        public FinalStateObjectFactory(FinalStateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("3e2f7362-e9bd-43f2-bfa5-f2864ab5e083")
        @Override
        public ISmObjectData createData() {
            return new FinalStateData(this.smClass);
        }

        @objid ("4639790d-2111-4bf5-9d2f-623a8452c6da")
        @Override
        public SmObjectImpl createImpl() {
            return new FinalStateImpl();
        }

    }

}
