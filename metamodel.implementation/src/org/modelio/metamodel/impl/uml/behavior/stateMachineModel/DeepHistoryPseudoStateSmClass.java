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
import org.modelio.metamodel.uml.behavior.stateMachineModel.DeepHistoryPseudoState;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("e9c56d81-716f-45be-aff4-213f05dba235")
public class DeepHistoryPseudoStateSmClass extends AbstractPseudoStateSmClass {
    @objid ("ea6987fe-9e08-48e9-bd77-c1229e2ed391")
    public DeepHistoryPseudoStateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("b27a2f4c-c477-4991-8183-1123d5f0d170")
    @Override
    public String getName() {
        return "DeepHistoryPseudoState";
    }

    @objid ("4ee2c860-a033-4161-83ba-fd12e06413e2")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("7cb8e041-71b9-4cd7-b113-2f47c2a14604")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return DeepHistoryPseudoState.class;
    }

    @objid ("f743fd55-b89c-455d-ada8-51c8f874cf84")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("c1c4ef72-4f1c-4018-8159-a4058fab871b")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("e48d9f92-a1c7-4246-a1cb-03198e90dc40")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AbstractPseudoState");
        this.registerFactory(new DeepHistoryPseudoStateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("0193ef6e-5776-4f27-969d-a6840da919f0")
    private static class DeepHistoryPseudoStateObjectFactory implements ISmObjectFactory {
        @objid ("c45cb985-f14a-4af6-9783-98ab570dcd3c")
        private DeepHistoryPseudoStateSmClass smClass;

        @objid ("9dfa5f41-3cf0-450f-9425-960616f25d42")
        public DeepHistoryPseudoStateObjectFactory(DeepHistoryPseudoStateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("268954c1-82eb-475b-84a3-06377e36486c")
        @Override
        public ISmObjectData createData() {
            return new DeepHistoryPseudoStateData(this.smClass);
        }

        @objid ("183618d7-7aad-447f-893c-d0f2e0283968")
        @Override
        public SmObjectImpl createImpl() {
            return new DeepHistoryPseudoStateImpl();
        }

    }

}
