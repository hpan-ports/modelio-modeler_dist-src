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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.AbstractPseudoStateSmClass;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ChoicePseudoState;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("f0a2a591-fb0e-43e8-b25c-f742e385444c")
public class ChoicePseudoStateSmClass extends AbstractPseudoStateSmClass {
    @objid ("67374524-8351-4ff5-bf64-6def4257bcb5")
    public ChoicePseudoStateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("c34db257-0f5f-42bf-9480-149d94e19c2f")
    @Override
    public String getName() {
        return "ChoicePseudoState";
    }

    @objid ("fb000643-046a-4b71-b833-22cb93b1d70e")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("fdf00009-8f3c-4566-8eef-3b1da6d04fc3")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ChoicePseudoState.class;
    }

    @objid ("0b5b1787-0b90-49dd-ae9b-901ffa4f1064")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("c8ab1d52-a99f-4a85-914b-8798501f3b39")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("c5d82c10-eca0-444b-9bc4-0542e190fbd3")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AbstractPseudoState");
        this.registerFactory(new ChoicePseudoStateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("6555d7a5-b7c5-4b5c-a6de-26a153d7d32e")
    private static class ChoicePseudoStateObjectFactory implements ISmObjectFactory {
        @objid ("6d86d555-85a9-43e1-91e5-4ab647e44421")
        private ChoicePseudoStateSmClass smClass;

        @objid ("03e47fd9-497e-44f2-879e-27c9dbb1a4a4")
        public ChoicePseudoStateObjectFactory(ChoicePseudoStateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("cb222154-3086-4eba-a6e4-b1c025a3a151")
        @Override
        public ISmObjectData createData() {
            return new ChoicePseudoStateData(this.smClass);
        }

        @objid ("0c4cb493-67d7-447d-a799-d16b7167bf66")
        @Override
        public SmObjectImpl createImpl() {
            return new ChoicePseudoStateImpl();
        }

    }

}
