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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.ExecutionOccurenceSpecificationSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.TerminateSpecification;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("1015805d-ba8d-4d95-aaeb-7b62d62c50e9")
public class TerminateSpecificationSmClass extends ExecutionOccurenceSpecificationSmClass {
    @objid ("b4473826-f944-4f2c-a524-4d834ae53b84")
    public TerminateSpecificationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("00659674-231a-4993-856c-92ca8d6b852d")
    @Override
    public String getName() {
        return "TerminateSpecification";
    }

    @objid ("6cbd5774-4a59-418e-bd7c-2d1142a60f59")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("3d736913-d0ca-47d8-9fcc-0edc5f5d8d0b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return TerminateSpecification.class;
    }

    @objid ("a1e2adf6-5ba8-4e12-8491-60932e64b147")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("9160ce18-775b-4274-9f43-cf152c59245b")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("480c262f-94b9-4fbe-a7ba-abfff93d055d")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ExecutionOccurenceSpecification");
        this.registerFactory(new TerminateSpecificationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("0a2a04df-f595-4583-9229-241ac5d0ba38")
    private static class TerminateSpecificationObjectFactory implements ISmObjectFactory {
        @objid ("e15583d0-ef25-4d7a-981a-42dc3faefca8")
        private TerminateSpecificationSmClass smClass;

        @objid ("d661f284-4ab5-44b5-958b-007fcd255f3e")
        public TerminateSpecificationObjectFactory(TerminateSpecificationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("7e8abd16-4d16-4f89-87c5-c47de9393046")
        @Override
        public ISmObjectData createData() {
            return new TerminateSpecificationData(this.smClass);
        }

        @objid ("c2e87d31-669c-4071-8f3d-b6c2978dd98b")
        @Override
        public SmObjectImpl createImpl() {
            return new TerminateSpecificationImpl();
        }

    }

}
