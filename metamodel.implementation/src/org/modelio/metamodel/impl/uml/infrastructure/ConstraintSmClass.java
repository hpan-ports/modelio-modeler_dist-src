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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("aacebf16-44ba-45c9-b3f5-a9fd972dba6f")
public class ConstraintSmClass extends ModelElementSmClass {
    @objid ("fab48ce1-9e94-4422-b078-17070023b61b")
    private SmAttribute baseClassAtt;

    @objid ("327c4840-840c-4606-8008-b0e4ddd0bfca")
    private SmAttribute bodyAtt;

    @objid ("f53e0c82-ea3d-4ea1-810f-4336467b3dd5")
    private SmAttribute languageAtt;

    @objid ("1e2b9239-c3b0-439a-8159-b739cfed39c9")
    private SmDependency constrainedElementDep;

    @objid ("779229b2-5d97-4097-8bc3-538af9266f14")
    public ConstraintSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("c9f0a215-c238-48cd-834e-b6729d06a371")
    @Override
    public String getName() {
        return "Constraint";
    }

    @objid ("5b428d12-8e04-46c5-b1f6-ed67e818c8de")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("7e526dae-2e6e-48fb-9687-e9f8e459fae4")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Constraint.class;
    }

    @objid ("4b1d41be-4eac-4a07-9ec6-b69449149a14")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("f193ec0a-e0ff-4d90-89c5-2738870f617c")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("7f533c71-f452-47eb-9a5d-fd91d91a9ed8")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ConstraintObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.baseClassAtt = new BaseClassSmAttribute();
        this.baseClassAtt.init("BaseClass", this, String.class );
        registerAttribute(this.baseClassAtt);
        
        this.bodyAtt = new BodySmAttribute();
        this.bodyAtt.init("Body", this, String.class );
        registerAttribute(this.bodyAtt);
        
        this.languageAtt = new LanguageSmAttribute();
        this.languageAtt.init("Language", this, String.class );
        registerAttribute(this.languageAtt);
        
        
        // Initialize and register the SmDependency
        this.constrainedElementDep = new ConstrainedElementSmDependency();
        this.constrainedElementDep.init("ConstrainedElement", this, metamodel.getMClass("ModelElement"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.constrainedElementDep);
    }

    @objid ("07e1d834-2591-409e-acce-3a74b5791f72")
    public SmAttribute getBaseClassAtt() {
        if (this.baseClassAtt == null) {
        	this.baseClassAtt = this.getAttributeDef("BaseClass");
        }
        return this.baseClassAtt;
    }

    @objid ("c87af008-0806-4ce5-8da7-86a878ab13e2")
    public SmAttribute getBodyAtt() {
        if (this.bodyAtt == null) {
        	this.bodyAtt = this.getAttributeDef("Body");
        }
        return this.bodyAtt;
    }

    @objid ("8a1e2073-4b82-40a4-beee-7bdb60282342")
    public SmAttribute getLanguageAtt() {
        if (this.languageAtt == null) {
        	this.languageAtt = this.getAttributeDef("Language");
        }
        return this.languageAtt;
    }

    @objid ("6c252880-c35f-4be5-8de7-02654b42674c")
    public SmDependency getConstrainedElementDep() {
        if (this.constrainedElementDep == null) {
        	this.constrainedElementDep = this.getDependencyDef("ConstrainedElement");
        }
        return this.constrainedElementDep;
    }

    @objid ("b67f17f7-2fcf-48c9-a8ab-20f4d6399064")
    private static class ConstraintObjectFactory implements ISmObjectFactory {
        @objid ("ed06d875-7dd5-4a6d-a6db-bb546b714f12")
        private ConstraintSmClass smClass;

        @objid ("9064168c-8a88-4e5a-9c87-fd720997859b")
        public ConstraintObjectFactory(ConstraintSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("b86e6495-0bec-4af2-87bd-544c50068c3d")
        @Override
        public ISmObjectData createData() {
            return new ConstraintData(this.smClass);
        }

        @objid ("a3b49f60-c073-4c6d-a3dd-59d892608615")
        @Override
        public SmObjectImpl createImpl() {
            return new ConstraintImpl();
        }

    }

    @objid ("ffe34b0e-89af-439f-9dd3-b2f4fd534a54")
    public static class BaseClassSmAttribute extends SmAttribute {
        @objid ("4dbec1e4-e856-46c1-bdd4-86b41cbd094c")
        public Object getValue(ISmObjectData data) {
            return ((ConstraintData) data).mBaseClass;
        }

        @objid ("62b764ff-dd81-474f-8e1c-c279d1816ed3")
        public void setValue(ISmObjectData data, Object value) {
            ((ConstraintData) data).mBaseClass = value;
        }

    }

    @objid ("cf543703-872e-47dd-b386-22580b464539")
    public static class BodySmAttribute extends SmAttribute {
        @objid ("f5697d65-d429-4f00-a385-ba9fa4a16518")
        public Object getValue(ISmObjectData data) {
            return ((ConstraintData) data).mBody;
        }

        @objid ("a0eed187-57ac-4bf2-9a3a-03e718ee89e0")
        public void setValue(ISmObjectData data, Object value) {
            ((ConstraintData) data).mBody = value;
        }

    }

    @objid ("9ca96c97-303a-4156-9dff-7b5adc23e921")
    public static class LanguageSmAttribute extends SmAttribute {
        @objid ("3fa9afb0-5249-45eb-88e2-a64670d5d58d")
        public Object getValue(ISmObjectData data) {
            return ((ConstraintData) data).mLanguage;
        }

        @objid ("d8182683-2260-4030-b84a-990934c8ab6c")
        public void setValue(ISmObjectData data, Object value) {
            ((ConstraintData) data).mLanguage = value;
        }

    }

    @objid ("3b634504-2fd9-441f-9b09-4afde2493040")
    public static class ConstrainedElementSmDependency extends SmMultipleDependency {
        @objid ("83a08a90-060e-411f-bcac-c74c8a5d6554")
        private SmDependency symetricDep;

        @objid ("85affe2d-e6ef-45ee-bbf3-d41c10446a62")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ConstraintData)data).mConstrainedElement != null)? ((ConstraintData)data).mConstrainedElement:SmMultipleDependency.EMPTY;
        }

        @objid ("f4d069d7-7026-4ef5-bd9d-deac22d9b38f")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ConstraintData) data).mConstrainedElement = values;
        }

        @objid ("2e7d071c-df82-4c89-bf06-d6ddd5e437cf")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getConstraintDefinitionDep();
            }
            return this.symetricDep;
        }

    }

}
