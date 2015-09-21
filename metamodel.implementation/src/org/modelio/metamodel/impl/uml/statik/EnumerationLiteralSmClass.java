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
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.EnumerationSmClass;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("d14877d6-45e4-49f7-92c5-6db955704cf5")
public class EnumerationLiteralSmClass extends ModelElementSmClass {
    @objid ("a2416232-9e12-4cfd-bf73-6a675f1b5727")
    private SmDependency valuatedDep;

    @objid ("896aa3fb-fac1-45af-ac78-adda5f35644d")
    public EnumerationLiteralSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("db793622-9cc8-43ee-9eaf-87c8147ef645")
    @Override
    public String getName() {
        return "EnumerationLiteral";
    }

    @objid ("b7fcb70d-83c0-4ab9-ae39-7bffc850a657")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("908f0a6b-ac32-4c12-810e-2f73a73d2ccc")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return EnumerationLiteral.class;
    }

    @objid ("b4fbecf8-2e37-41b4-91a7-73b6c544786f")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("2bef403f-54a3-486a-b619-b03a50b88a1c")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("a3a11b3b-00c7-413e-879e-76124f0151f2")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new EnumerationLiteralObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.valuatedDep = new ValuatedSmDependency();
        this.valuatedDep.init("Valuated", this, metamodel.getMClass("Enumeration"), 1, 1 );
        registerDependency(this.valuatedDep);
    }

    @objid ("e7b5b991-a6d9-410a-ac5b-a9f52ec2a7c4")
    public SmDependency getValuatedDep() {
        if (this.valuatedDep == null) {
        	this.valuatedDep = this.getDependencyDef("Valuated");
        }
        return this.valuatedDep;
    }

    @objid ("6b1cfc60-a41d-453f-842e-a5a6d526d1d3")
    private static class EnumerationLiteralObjectFactory implements ISmObjectFactory {
        @objid ("222650c6-a73a-4709-baef-f4fb257e6811")
        private EnumerationLiteralSmClass smClass;

        @objid ("8a455a70-0a30-41ca-847c-6396ae36c1d6")
        public EnumerationLiteralObjectFactory(EnumerationLiteralSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("48e05474-fd8e-4a4e-91b1-3c839bb804ed")
        @Override
        public ISmObjectData createData() {
            return new EnumerationLiteralData(this.smClass);
        }

        @objid ("df04ed15-5c2d-4bf9-9149-77a0e796ff8a")
        @Override
        public SmObjectImpl createImpl() {
            return new EnumerationLiteralImpl();
        }

    }

    @objid ("92ac91fe-f0ba-408f-b37a-55ea90358cdd")
    public static class ValuatedSmDependency extends SmSingleDependency {
        @objid ("7f9ecf65-32a1-4392-9a93-9a7f49dfcd0b")
        private SmDependency symetricDep;

        @objid ("badccb8c-101e-4959-b14f-50f88e4f60ab")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((EnumerationLiteralData) data).mValuated;
        }

        @objid ("639ef60e-0e59-40ab-ab16-480c7f0ed79c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((EnumerationLiteralData) data).mValuated = value;
        }

        @objid ("dac42b0a-d263-42de-afe2-5e3d2586d790")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((EnumerationSmClass)this.getTarget()).getValueDep();
            }
            return this.symetricDep;
        }

    }

}
