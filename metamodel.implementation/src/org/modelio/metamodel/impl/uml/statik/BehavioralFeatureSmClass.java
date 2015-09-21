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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.statik.FeatureSmClass;
import org.modelio.metamodel.uml.statik.BehavioralFeature;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("91104596-96f5-4349-af9b-a9f073e341b1")
public class BehavioralFeatureSmClass extends FeatureSmClass {
    @objid ("4b5614f4-a6ae-40ca-88be-f287b58713eb")
    public BehavioralFeatureSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("0fd27361-b40e-46f0-ab08-b2972c569d7b")
    @Override
    public String getName() {
        return "BehavioralFeature";
    }

    @objid ("c4782144-7ff5-4009-82c1-fce962e5bfde")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("06a07e1e-076d-46dd-8070-b1625fa86b62")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BehavioralFeature.class;
    }

    @objid ("2c951fbb-e4d7-4f4f-a6a3-c8f7d71c1a52")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("6800ddb0-b681-40c7-b09b-75648f62e350")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("1f37467b-9d2a-4dae-ba66-be4f6955c859")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Feature");
        this.registerFactory(new BehavioralFeatureObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("a9769921-d568-47f1-bdb4-66474f729eda")
    private static class BehavioralFeatureObjectFactory implements ISmObjectFactory {
        @objid ("af11b5a1-d073-4dda-8dfc-f4a11e07b2cf")
        private BehavioralFeatureSmClass smClass;

        @objid ("f4e54d06-82dd-4455-a60d-cd13c3c6bb6d")
        public BehavioralFeatureObjectFactory(BehavioralFeatureSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("363cc356-49aa-402f-9826-a1ccd1f6ea1e")
        @Override
        public ISmObjectData createData() {
            return new BehavioralFeatureData(this.smClass);
        }

        @objid ("0d150c94-d932-4c33-bf44-9c6d952aec0c")
        @Override
        public SmObjectImpl createImpl() {
            return new BehavioralFeatureImpl();
        }

    }

}
