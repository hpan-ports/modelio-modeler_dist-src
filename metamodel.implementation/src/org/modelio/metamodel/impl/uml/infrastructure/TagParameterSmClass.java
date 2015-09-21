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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.TaggedValueSmClass;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("11c38d03-d043-40fd-b747-ca7c1ca5879b")
public class TagParameterSmClass extends ElementSmClass {
    @objid ("2cdf61bf-1dba-4d6c-88fc-1fec5c9412ee")
    private SmAttribute valueAtt;

    @objid ("723ab52f-7844-44d0-b77c-3ef687bebdb1")
    private SmDependency annotedDep;

    @objid ("2ac5b836-4011-49e7-a62b-df3580d6ee98")
    private SmDependency qualifiedDep;

    @objid ("909344a9-609f-43e0-ab24-673a06a30f09")
    public TagParameterSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("c928f2e5-3e61-4df7-9962-b75e63a2abd2")
    @Override
    public String getName() {
        return "TagParameter";
    }

    @objid ("dd0d9072-1ac9-4ec9-be32-617c7a35868a")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("85645581-8623-4866-ac6e-99d442e194b6")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return TagParameter.class;
    }

    @objid ("f25e55ab-874b-437d-a6fe-4973aef177f4")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("46af6b7e-2885-4c2a-a27e-d8163f819841")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("81530716-3862-4dc0-a63a-1e05146fafc1")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Element");
        this.registerFactory(new TagParameterObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.valueAtt = new ValueSmAttribute();
        this.valueAtt.init("Value", this, String.class );
        registerAttribute(this.valueAtt);
        
        
        // Initialize and register the SmDependency
        this.annotedDep = new AnnotedSmDependency();
        this.annotedDep.init("Annoted", this, metamodel.getMClass("TaggedValue"), 0, 1 );
        registerDependency(this.annotedDep);
        
        this.qualifiedDep = new QualifiedSmDependency();
        this.qualifiedDep.init("Qualified", this, metamodel.getMClass("TaggedValue"), 0, 1 );
        registerDependency(this.qualifiedDep);
    }

    @objid ("18459e83-4eba-43e3-ae64-68c0288d85c1")
    public SmAttribute getValueAtt() {
        if (this.valueAtt == null) {
        	this.valueAtt = this.getAttributeDef("Value");
        }
        return this.valueAtt;
    }

    @objid ("a82732e8-4ceb-4dca-b63f-48d46bde4c3f")
    public SmDependency getAnnotedDep() {
        if (this.annotedDep == null) {
        	this.annotedDep = this.getDependencyDef("Annoted");
        }
        return this.annotedDep;
    }

    @objid ("bb548d46-6258-48dd-b2fe-5bee26e4d37f")
    public SmDependency getQualifiedDep() {
        if (this.qualifiedDep == null) {
        	this.qualifiedDep = this.getDependencyDef("Qualified");
        }
        return this.qualifiedDep;
    }

    @objid ("fd014947-8379-48e1-9b81-7a6095b9a8a2")
    private static class TagParameterObjectFactory implements ISmObjectFactory {
        @objid ("17f23def-7e0d-4eb3-995a-12d81512d7e1")
        private TagParameterSmClass smClass;

        @objid ("4d6902b2-59d5-45d5-bd47-f8cc954bfe9f")
        public TagParameterObjectFactory(TagParameterSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("1808bd09-2ff0-435c-90b0-a16592a99b27")
        @Override
        public ISmObjectData createData() {
            return new TagParameterData(this.smClass);
        }

        @objid ("71342d4b-8710-4f01-a707-a85b4ff01b08")
        @Override
        public SmObjectImpl createImpl() {
            return new TagParameterImpl();
        }

    }

    @objid ("62844bda-462b-4e38-b19e-867081dc413b")
    public static class ValueSmAttribute extends SmAttribute {
        @objid ("2721998e-b180-4aa0-95fc-7363c04467a8")
        public Object getValue(ISmObjectData data) {
            return ((TagParameterData) data).mValue;
        }

        @objid ("80e378bb-33ce-4cab-a195-7a33b41d716b")
        public void setValue(ISmObjectData data, Object value) {
            ((TagParameterData) data).mValue = value;
        }

    }

    @objid ("9a1830ae-3fe9-4ade-957d-f95b614e52c6")
    public static class AnnotedSmDependency extends SmSingleDependency {
        @objid ("b0954bba-ce31-4dea-a8b9-583bcf5f9a2d")
        private SmDependency symetricDep;

        @objid ("57c5baff-0795-4e08-b41d-e6a50b220932")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TagParameterData) data).mAnnoted;
        }

        @objid ("c90f0d7c-3d75-4b79-b8d6-27a69980b9a8")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TagParameterData) data).mAnnoted = value;
        }

        @objid ("96326a6f-d4b3-47fc-bfbe-9fd4284021c3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TaggedValueSmClass)this.getTarget()).getActualDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e906f498-2d77-4f90-af4a-c8fc623d173c")
    public static class QualifiedSmDependency extends SmSingleDependency {
        @objid ("b8cfb766-431b-4648-8d05-97d732b2f308")
        private SmDependency symetricDep;

        @objid ("45b1d900-03c6-4faa-94f8-551abd21b67d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TagParameterData) data).mQualified;
        }

        @objid ("a65ca124-c1df-4122-8a71-0a79891741ca")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TagParameterData) data).mQualified = value;
        }

        @objid ("36319f69-483d-41f6-bd00-04499fe066a5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TaggedValueSmClass)this.getTarget()).getQualifierDep();
            }
            return this.symetricDep;
        }

    }

}
