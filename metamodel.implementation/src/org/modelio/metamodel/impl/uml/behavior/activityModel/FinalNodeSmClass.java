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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ControlNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.FinalNode;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("6972dd04-ccd1-4e3b-ae02-750fa545ddbb")
public class FinalNodeSmClass extends ControlNodeSmClass {
    @objid ("66adc2a5-06b0-4394-9439-500e37157ecd")
    public FinalNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("277e50b2-ed2c-4cb6-aba6-68f7191417ae")
    @Override
    public String getName() {
        return "FinalNode";
    }

    @objid ("3404401c-0369-4934-b200-b1174c736858")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("feab7d02-ced9-4091-b548-478a530fbdc5")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return FinalNode.class;
    }

    @objid ("04ec589f-28ce-49e8-821d-b6f84dfc4b73")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("ca5d3d85-5fb2-48b1-b8c4-1e996fd1f04b")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("d0cf727d-363d-483f-9e15-00c9ccdda4fb")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ControlNode");
        this.registerFactory(new FinalNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("85ad3c65-7903-44c5-8405-65ee329efda6")
    private static class FinalNodeObjectFactory implements ISmObjectFactory {
        @objid ("7875dc1c-2638-4729-a961-677b554ecc6e")
        private FinalNodeSmClass smClass;

        @objid ("649d30db-0f19-4bd3-9f6e-0e8ad6c556a7")
        public FinalNodeObjectFactory(FinalNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("71a50175-2f28-4f12-8f0f-c4d6ba773bb5")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("87d86830-269d-489d-8141-20ee8d88919b")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

}
