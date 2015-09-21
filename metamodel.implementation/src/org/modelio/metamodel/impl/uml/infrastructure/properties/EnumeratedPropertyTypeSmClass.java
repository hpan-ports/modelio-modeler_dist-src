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
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyEnumerationLitteralSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTypeSmClass;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("505b6382-7d7f-4d20-85a0-d4366a65deb6")
public class EnumeratedPropertyTypeSmClass extends PropertyTypeSmClass {
    @objid ("698280e4-2fe6-499b-ab46-50b3354b59f1")
    private SmDependency litteralDep;

    @objid ("8afceb38-d90a-43e6-b229-b8478148bd5e")
    public EnumeratedPropertyTypeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("df208ab8-4146-4fc1-af44-05008f98114d")
    @Override
    public String getName() {
        return "EnumeratedPropertyType";
    }

    @objid ("2b99fa15-3d2a-4d57-aeb3-338531ff116d")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("4f70af6f-5606-434e-946a-0403b66c99ab")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return EnumeratedPropertyType.class;
    }

    @objid ("0d9c0041-dda7-4b45-9079-622d20d71fb2")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("cac233f3-3040-490d-809e-27abb21ce9eb")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("d8794974-0ccd-4c40-a872-49a7a6d31065")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("PropertyType");
        this.registerFactory(new EnumeratedPropertyTypeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.litteralDep = new LitteralSmDependency();
        this.litteralDep.init("Litteral", this, metamodel.getMClass("PropertyEnumerationLitteral"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.litteralDep);
    }

    @objid ("40af89d9-ee35-4181-bda4-61dd7309178b")
    public SmDependency getLitteralDep() {
        if (this.litteralDep == null) {
        	this.litteralDep = this.getDependencyDef("Litteral");
        }
        return this.litteralDep;
    }

    @objid ("0b75ecef-7993-490f-80c1-f92d1a19bbc5")
    private static class EnumeratedPropertyTypeObjectFactory implements ISmObjectFactory {
        @objid ("cd774ac6-0920-4967-910d-fb9d6aac20eb")
        private EnumeratedPropertyTypeSmClass smClass;

        @objid ("d8ab8e9f-fa4f-4f14-9c1d-77df59635036")
        public EnumeratedPropertyTypeObjectFactory(EnumeratedPropertyTypeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("9e9e010d-5d69-49e3-a7b2-effa4ce9f42d")
        @Override
        public ISmObjectData createData() {
            return new EnumeratedPropertyTypeData(this.smClass);
        }

        @objid ("2286924f-2648-4a94-a227-cfffc64df0b5")
        @Override
        public SmObjectImpl createImpl() {
            return new EnumeratedPropertyTypeImpl();
        }

    }

    @objid ("079dbb8d-496b-4910-8b62-86e7994b12ae")
    public static class LitteralSmDependency extends SmMultipleDependency {
        @objid ("51aa3e8e-66df-4abe-ac43-bff661134aab")
        private SmDependency symetricDep;

        @objid ("2d17406e-e8a7-413d-b76e-35738136a54e")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((EnumeratedPropertyTypeData)data).mLitteral != null)? ((EnumeratedPropertyTypeData)data).mLitteral:SmMultipleDependency.EMPTY;
        }

        @objid ("234737fd-a35f-4da3-a04a-8ceda4c23dc0")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((EnumeratedPropertyTypeData) data).mLitteral = values;
        }

        @objid ("01b40d5b-f68b-41f6-80f7-b104881059ed")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyEnumerationLitteralSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

}
