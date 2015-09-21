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
import org.modelio.metamodel.impl.uml.behavior.activityModel.FinalNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.FlowFinalNode;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("245b4da0-6037-452b-8cc7-3a353155b4f3")
public class FlowFinalNodeSmClass extends FinalNodeSmClass {
    @objid ("117d0e8b-abdf-47e1-80a1-90da810b6a81")
    public FlowFinalNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("7c9fa66a-a787-41d1-b167-fcb00111eb51")
    @Override
    public String getName() {
        return "FlowFinalNode";
    }

    @objid ("d324bc9d-d179-4750-a127-ead2a8eb3695")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("18304260-878b-4a8f-be59-2d4255fdf76b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return FlowFinalNode.class;
    }

    @objid ("44606171-f20a-4846-9007-3ac3d61588dd")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("309afc90-10e2-4cd0-9d11-698a56684f74")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("a7bd1e6c-844d-4ac8-bcbd-0b934969f728")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("FinalNode");
        this.registerFactory(new FlowFinalNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("c82d7291-2799-4a76-a736-a3fbdef29196")
    private static class FlowFinalNodeObjectFactory implements ISmObjectFactory {
        @objid ("c467ce45-f766-4761-8549-bf09c3347f41")
        private FlowFinalNodeSmClass smClass;

        @objid ("0cabebe7-9247-4346-a91d-13062d5da6e0")
        public FlowFinalNodeObjectFactory(FlowFinalNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("db5abb95-6dda-4ff4-9546-ee125bffc835")
        @Override
        public ISmObjectData createData() {
            return new FlowFinalNodeData(this.smClass);
        }

        @objid ("d588eabf-2ca9-45a5-b004-78ed191538d2")
        @Override
        public SmObjectImpl createImpl() {
            return new FlowFinalNodeImpl();
        }

    }

}
