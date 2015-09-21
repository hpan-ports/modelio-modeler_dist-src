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
package org.modelio.metamodel.impl.diagrams;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.StateMachineDiagram;
import org.modelio.metamodel.impl.diagrams.BehaviorDiagramSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("05f971dc-3b59-4a75-b579-a10e410a0d7e")
public class StateMachineDiagramSmClass extends BehaviorDiagramSmClass {
    @objid ("77f2e967-8117-4e62-b385-8026a4b5b453")
    public StateMachineDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("2d9e36af-5b7e-4fef-b495-c74aa038d160")
    @Override
    public String getName() {
        return "StateMachineDiagram";
    }

    @objid ("ad52f73b-765b-4b12-8fa3-6e46ffca9214")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("2a7d8ac5-5d03-448e-aa53-271e5b59f197")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return StateMachineDiagram.class;
    }

    @objid ("db12da36-6c9a-4aae-a654-221ce78e5678")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("e4c22481-f9b4-4433-a4b7-590a119ef3b7")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("e9b0ac2a-861f-4fc2-8094-03ccbf85dedf")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BehaviorDiagram");
        this.registerFactory(new StateMachineDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("339f4a9d-2903-401b-9195-5926e3c8afb1")
    private static class StateMachineDiagramObjectFactory implements ISmObjectFactory {
        @objid ("26283e7c-d1ac-4a59-b4b2-f31ad047bd3d")
        private StateMachineDiagramSmClass smClass;

        @objid ("d190bb8b-3b87-409a-a657-4de50324e9dd")
        public StateMachineDiagramObjectFactory(StateMachineDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("b1adbafe-fa45-439b-8c6e-8542f63d4503")
        @Override
        public ISmObjectData createData() {
            return new StateMachineDiagramData(this.smClass);
        }

        @objid ("023b3eb4-f90a-48f9-acb6-c119d7e8d9d9")
        @Override
        public SmObjectImpl createImpl() {
            return new StateMachineDiagramImpl();
        }

    }

}
