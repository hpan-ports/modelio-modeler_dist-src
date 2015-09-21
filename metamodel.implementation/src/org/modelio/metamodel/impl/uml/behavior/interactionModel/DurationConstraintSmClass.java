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
import org.modelio.metamodel.impl.uml.infrastructure.ConstraintSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.DurationConstraint;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("95b81311-bc2f-4843-a5b2-3126a3d8120e")
public class DurationConstraintSmClass extends ConstraintSmClass {
    @objid ("e9a51c85-1f5d-4f53-84aa-1cc687275bf1")
    private SmAttribute durationMinAtt;

    @objid ("330180dc-3aab-41b2-9400-80bcffd0bf96")
    private SmAttribute durationMaxAtt;

    @objid ("34d8b3df-cfc8-496d-99a8-104ac4b26997")
    public DurationConstraintSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("c1570b73-6cb4-4ae4-a1a6-93093105ec09")
    @Override
    public String getName() {
        return "DurationConstraint";
    }

    @objid ("c346ae14-b330-4cc4-952d-009a54bb3307")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("ca853b1d-2b2c-4c82-b956-cc51be1fb37b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return DurationConstraint.class;
    }

    @objid ("eb27bf82-c188-4570-9958-53c017608c31")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("8a6597cd-0e76-40b7-a651-8a85b9743d13")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("d001912c-7c13-4c9f-9b9e-bd89a64524ec")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Constraint");
        this.registerFactory(new DurationConstraintObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.durationMinAtt = new DurationMinSmAttribute();
        this.durationMinAtt.init("DurationMin", this, String.class );
        registerAttribute(this.durationMinAtt);
        
        this.durationMaxAtt = new DurationMaxSmAttribute();
        this.durationMaxAtt.init("DurationMax", this, String.class );
        registerAttribute(this.durationMaxAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("af06762c-27cd-4379-bb48-3cb9f54e1dc9")
    public SmAttribute getDurationMinAtt() {
        if (this.durationMinAtt == null) {
        	this.durationMinAtt = this.getAttributeDef("DurationMin");
        }
        return this.durationMinAtt;
    }

    @objid ("c9171f54-0c88-4c71-bad9-1b1f9d2d8a7e")
    public SmAttribute getDurationMaxAtt() {
        if (this.durationMaxAtt == null) {
        	this.durationMaxAtt = this.getAttributeDef("DurationMax");
        }
        return this.durationMaxAtt;
    }

    @objid ("00499f59-4b0c-4c56-9a32-27696769869d")
    private static class DurationConstraintObjectFactory implements ISmObjectFactory {
        @objid ("b8d9184a-1cad-494b-a92c-816402fbca72")
        private DurationConstraintSmClass smClass;

        @objid ("18596e68-c9f4-4ebe-815b-6306d39cad4b")
        public DurationConstraintObjectFactory(DurationConstraintSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("eef04e66-11a9-42ff-b6a2-a14b6702ae0e")
        @Override
        public ISmObjectData createData() {
            return new DurationConstraintData(this.smClass);
        }

        @objid ("2e298968-9ff6-48c7-846d-c6c01d2f4b7f")
        @Override
        public SmObjectImpl createImpl() {
            return new DurationConstraintImpl();
        }

    }

    @objid ("6ac068a3-29aa-4fc3-9a92-71c6ea1b31fc")
    public static class DurationMinSmAttribute extends SmAttribute {
        @objid ("142f7b31-55b7-4de6-957f-6eb196d1210c")
        public Object getValue(ISmObjectData data) {
            return ((DurationConstraintData) data).mDurationMin;
        }

        @objid ("6cdb52cb-7bad-4faa-ae12-e9f28647f7f7")
        public void setValue(ISmObjectData data, Object value) {
            ((DurationConstraintData) data).mDurationMin = value;
        }

    }

    @objid ("d86f2059-cb85-4ade-b0c4-250cb7c127ce")
    public static class DurationMaxSmAttribute extends SmAttribute {
        @objid ("dd7a23ab-6163-4acd-9309-79ef93190937")
        public Object getValue(ISmObjectData data) {
            return ((DurationConstraintData) data).mDurationMax;
        }

        @objid ("cc73cf81-c7c8-43a1-959e-8490e0fe305a")
        public void setValue(ISmObjectData data, Object value) {
            ((DurationConstraintData) data).mDurationMax = value;
        }

    }

}
