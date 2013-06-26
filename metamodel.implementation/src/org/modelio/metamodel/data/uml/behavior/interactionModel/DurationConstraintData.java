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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("f92a73d7-2e1f-43d3-8983-6db6bf5aba81")
    @SmaMetaAttribute(metaName="DurationMin", type=String.class, smAttributeClass=Metadata.DurationMinSmAttribute.class)
     Object mDurationMin = "";

    @objid ("19ba016f-5f22-482e-90af-cc271597c095")
    @SmaMetaAttribute(metaName="DurationMax", type=String.class, smAttributeClass=Metadata.DurationMaxSmAttribute.class)
     Object mDurationMax = "";

    @objid ("34692543-ef0a-4d0c-87e0-5d1ac9d9a377")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0042d6fa-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("43cced1b-f5d7-4bc5-ad4e-260336361d4d")
        private static SmClass smClass = null;

        @objid ("1304fa5f-0c60-4f29-be7e-947c834988cd")
        private static SmAttribute DurationMinAtt = null;

        @objid ("d853fb01-f04e-4690-bd0d-195d3da272a7")
        private static SmAttribute DurationMaxAtt = null;

        @objid ("3cf91493-9af3-4521-a17b-6334711c5f4f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DurationConstraintData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dbd6f40c-951f-40bb-a9de-9d65acc96d5d")
        public static SmAttribute DurationMinAtt() {
            if (DurationMinAtt == null) {
            	DurationMinAtt = classof().getAttributeDef("DurationMin");
            }
            return DurationMinAtt;
        }

        @objid ("b0dc0cff-5410-4ce7-992b-d6276202c5c6")
        public static SmAttribute DurationMaxAtt() {
            if (DurationMaxAtt == null) {
            	DurationMaxAtt = classof().getAttributeDef("DurationMax");
            }
            return DurationMaxAtt;
        }

        @objid ("f4750393-c38e-4c80-83d3-58064d42dde9")
        public static SmAttribute getDurationMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DurationMaxAtt;
        }

        @objid ("68563ce2-4110-4ec2-8f4c-c3c81c15bd66")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6233e78d-e46d-44f2-8ee2-37c06c38e02f")
        public static SmAttribute getDurationMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DurationMinAtt;
        }

        @objid ("00432452-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2a2b3cf8-8738-419a-b14a-341107d04ab5")
            public ISmObjectData createData() {
                return new DurationConstraintData();
            }

            @objid ("f4dfc845-b6b4-4ea0-ac16-a213947c8562")
            public SmObjectImpl createImpl() {
                return new DurationConstraintImpl();
            }

        }

        @objid ("004387e4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DurationMinSmAttribute extends SmAttribute {
            @objid ("813ddd13-de4f-4955-a446-60a4ff376fb7")
            public Object getValue(ISmObjectData data) {
                return ((DurationConstraintData) data).mDurationMin;
            }

            @objid ("a97f864f-e218-4ac7-bc44-0b0bb9b74d18")
            public void setValue(ISmObjectData data, Object value) {
                ((DurationConstraintData) data).mDurationMin = value;
            }

        }

        @objid ("0043e996-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DurationMaxSmAttribute extends SmAttribute {
            @objid ("4b3e4e02-d42d-4236-bf4f-1c1bb350fc44")
            public Object getValue(ISmObjectData data) {
                return ((DurationConstraintData) data).mDurationMax;
            }

            @objid ("47cf28ef-5766-4f59-a774-09a422f0f376")
            public void setValue(ISmObjectData data, Object value) {
                ((DurationConstraintData) data).mDurationMax = value;
            }

        }

    }

}
