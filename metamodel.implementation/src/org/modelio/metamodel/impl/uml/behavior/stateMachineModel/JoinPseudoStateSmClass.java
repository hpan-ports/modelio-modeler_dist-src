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
import org.modelio.metamodel.uml.behavior.stateMachineModel.JoinPseudoState;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("ad158599-e4d5-48f9-8d7a-9611ad5776cb")
public class JoinPseudoStateSmClass extends AbstractPseudoStateSmClass {
    @objid ("83160534-8f17-48b6-8da2-8d62e53cad33")
    public JoinPseudoStateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("b077bb66-3714-4e35-9134-2e30cba2ed4b")
    @Override
    public String getName() {
        return "JoinPseudoState";
    }

    @objid ("ae60d86f-5621-4bb8-8198-e41b7bd30ce6")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("9bd2e19f-9d0c-4008-b016-84276b9eb875")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return JoinPseudoState.class;
    }

    @objid ("98e7537c-f3ff-4f41-b6d5-24d41f40e7e5")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("82a259ea-cd81-434c-abcb-69cf777cb68c")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("f3274bf4-2086-48a4-8dc8-83ffcd479694")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AbstractPseudoState");
        this.registerFactory(new JoinPseudoStateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("87b7d7d1-5192-4887-b230-b1acbb65ac3c")
    private static class JoinPseudoStateObjectFactory implements ISmObjectFactory {
        @objid ("6690fc0f-3236-4bc5-ad45-4e01e74b85c6")
        private JoinPseudoStateSmClass smClass;

        @objid ("6c0180be-559a-4b3e-b5bc-9442850bd20d")
        public JoinPseudoStateObjectFactory(JoinPseudoStateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("74a75ea6-b972-4694-a71e-35d0f5325871")
        @Override
        public ISmObjectData createData() {
            return new JoinPseudoStateData(this.smClass);
        }

        @objid ("f351c94d-84af-410e-a14f-5b0dd343d598")
        @Override
        public SmObjectImpl createImpl() {
            return new JoinPseudoStateImpl();
        }

    }

}
