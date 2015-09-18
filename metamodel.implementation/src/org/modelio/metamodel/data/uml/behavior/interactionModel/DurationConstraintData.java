/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ConstraintData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.DurationConstraintImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.DurationConstraint;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("00441e70-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DurationConstraint.class, factory=DurationConstraintData.Metadata.ObjectFactory.class)
public class DurationConstraintData extends ConstraintData {
    @objid ("47beb632-2e8f-475b-8693-5ec66b8a05c0")
    @SmaMetaAttribute(metaName="DurationMin", type=String.class, smAttributeClass=Metadata.DurationMinSmAttribute.class)
     Object mDurationMin = "";

    @objid ("89041ea0-3a85-427b-8a77-f6e1e0f06640")
    @SmaMetaAttribute(metaName="DurationMax", type=String.class, smAttributeClass=Metadata.DurationMaxSmAttribute.class)
     Object mDurationMax = "";

    @objid ("8f16cf08-ff08-4060-97de-f9e91a3d706d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0042d6fa-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a2e48626-91eb-4c19-9fdd-7d764e2c541c")
        private static SmClass smClass = null;

        @objid ("d33ef0de-ee26-491c-af21-5e191d3c1a26")
        private static SmAttribute DurationMinAtt = null;

        @objid ("462a3eef-2d3e-4e2f-b344-832300d1aac7")
        private static SmAttribute DurationMaxAtt = null;

        @objid ("9f79ac2e-25bf-447b-a13b-3627f779a60c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DurationConstraintData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5ff968cd-2ef3-4663-b181-0fc2c3e23ba9")
        public static SmAttribute DurationMinAtt() {
            if (DurationMinAtt == null) {
            	DurationMinAtt = classof().getAttributeDef("DurationMin");
            }
            return DurationMinAtt;
        }

        @objid ("b28b392f-c491-45e0-a807-566f189be0b8")
        public static SmAttribute DurationMaxAtt() {
            if (DurationMaxAtt == null) {
            	DurationMaxAtt = classof().getAttributeDef("DurationMax");
            }
            return DurationMaxAtt;
        }

        @objid ("4fbd49a7-4911-4869-956c-5931cf2c4c92")
        public static SmAttribute getDurationMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DurationMinAtt;
        }

        @objid ("9b8d2493-a2a7-490c-be73-4bddb909d19a")
        public static SmAttribute getDurationMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DurationMaxAtt;
        }

        @objid ("e0f2ea47-86ac-4159-911d-7feab557a9b4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00432452-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9d7897fb-0d9a-4a42-9385-84ccab161ac8")
            public ISmObjectData createData() {
                return new DurationConstraintData();
            }

            @objid ("185f3228-c3e6-431c-bd60-e8683c63a39d")
            public SmObjectImpl createImpl() {
                return new DurationConstraintImpl();
            }

        }

        @objid ("004387e4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DurationMinSmAttribute extends SmAttribute {
            @objid ("077880e9-7ce8-4a29-958d-e2101d789891")
            public Object getValue(ISmObjectData data) {
                return ((DurationConstraintData) data).mDurationMin;
            }

            @objid ("88acbc53-e7cf-4fe4-ac9f-2f82a9eba276")
            public void setValue(ISmObjectData data, Object value) {
                ((DurationConstraintData) data).mDurationMin = value;
            }

        }

        @objid ("0043e996-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DurationMaxSmAttribute extends SmAttribute {
            @objid ("7ed492fa-a83d-40df-b310-5ed0171bd6af")
            public Object getValue(ISmObjectData data) {
                return ((DurationConstraintData) data).mDurationMax;
            }

            @objid ("5f3319ed-72da-49c1-a43a-0ca165c4ee9d")
            public void setValue(ISmObjectData data, Object value) {
                ((DurationConstraintData) data).mDurationMax = value;
            }

        }

    }

}
