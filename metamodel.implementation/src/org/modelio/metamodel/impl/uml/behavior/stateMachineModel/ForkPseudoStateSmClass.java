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
import org.modelio.metamodel.uml.behavior.stateMachineModel.ForkPseudoState;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("51ce5a8b-d368-44e6-9660-4fa2d173b067")
public class ForkPseudoStateSmClass extends AbstractPseudoStateSmClass {
    @objid ("79bcaa72-4c02-4578-a709-123e272840cb")
    public ForkPseudoStateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("e4521c0f-bac3-45cc-b72c-c9bbe75c9da4")
    @Override
    public String getName() {
        return "ForkPseudoState";
    }

    @objid ("e4c77083-eebd-4f5a-a6b5-8e87002fc093")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("05b41a39-1a67-4182-ad91-dc679a25c6ae")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ForkPseudoState.class;
    }

    @objid ("33888534-42fa-42d9-b2e7-f5a689d4622b")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("c57296c6-63cb-4aa4-a2d0-f81b83f690cd")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("7f2a9401-b6a5-40e9-87f5-f5b005fc3eb2")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AbstractPseudoState");
        this.registerFactory(new ForkPseudoStateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("2c670922-10d5-4e94-a61e-9953ab8074d1")
    private static class ForkPseudoStateObjectFactory implements ISmObjectFactory {
        @objid ("abedc188-bfb0-4ecd-984b-23afd49a7668")
        private ForkPseudoStateSmClass smClass;

        @objid ("782bb4f1-fdc3-43ab-b99d-a8bdffdac7fa")
        public ForkPseudoStateObjectFactory(ForkPseudoStateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("0040cdae-1e3f-42f0-80fb-56d583e08e2b")
        @Override
        public ISmObjectData createData() {
            return new ForkPseudoStateData(this.smClass);
        }

        @objid ("75bbd04a-7395-46d0-9f3f-0e2a86166116")
        @Override
        public SmObjectImpl createImpl() {
            return new ForkPseudoStateImpl();
        }

    }

}
